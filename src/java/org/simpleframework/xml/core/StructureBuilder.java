package org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.util.Iterator;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementArray;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.ElementListUnion;
import org.simpleframework.xml.ElementMap;
import org.simpleframework.xml.ElementMapUnion;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Order;
import org.simpleframework.xml.Text;
import org.simpleframework.xml.Version;

/* loaded from: classes2.dex */
public class StructureBuilder {
    public ModelAssembler assembler;
    public LabelMap attributes;
    public ExpressionBuilder builder;
    public LabelMap elements;
    public Instantiator factory;
    public boolean primitive;
    public InstantiatorBuilder resolver;
    public Model root;
    public Scanner scanner;
    public Support support;
    public Label text;
    public LabelMap texts;
    public Label version;

    public StructureBuilder(Scanner scanner, Detail detail, Support support) {
        ExpressionBuilder expressionBuilder = new ExpressionBuilder(detail, support);
        this.builder = expressionBuilder;
        this.assembler = new ModelAssembler(expressionBuilder, detail, support);
        this.resolver = new InstantiatorBuilder(scanner, detail);
        this.root = new TreeModel(scanner, detail);
        this.attributes = new LabelMap(scanner);
        this.elements = new LabelMap(scanner);
        this.texts = new LabelMap(scanner);
        this.scanner = scanner;
        this.support = support;
    }

    public void assemble(Class cls) {
        Order order = this.scanner.getOrder();
        if (order != null) {
            this.assembler.assemble(this.root, order);
        }
    }

    public void process(Contact contact, Annotation annotation) {
        if (annotation instanceof Attribute) {
            process(contact, annotation, this.attributes);
        }
        if (annotation instanceof ElementUnion) {
            union(contact, annotation, this.elements);
        }
        if (annotation instanceof ElementListUnion) {
            union(contact, annotation, this.elements);
        }
        if (annotation instanceof ElementMapUnion) {
            union(contact, annotation, this.elements);
        }
        if (annotation instanceof ElementList) {
            process(contact, annotation, this.elements);
        }
        if (annotation instanceof ElementArray) {
            process(contact, annotation, this.elements);
        }
        if (annotation instanceof ElementMap) {
            process(contact, annotation, this.elements);
        }
        if (annotation instanceof Element) {
            process(contact, annotation, this.elements);
        }
        if (annotation instanceof Version) {
            version(contact, annotation);
        }
        if (annotation instanceof Text) {
            text(contact, annotation);
        }
    }

    private void union(Contact contact, Annotation annotation, LabelMap labelMap) {
        for (Label label : this.support.getLabels(contact, annotation)) {
            String path = label.getPath();
            String name = label.getName();
            if (labelMap.get(path) != 0) {
                throw new PersistenceException("Duplicate annotation of name '%s' on %s", name, label);
            }
            process(contact, label, labelMap);
        }
    }

    private void process(Contact contact, Annotation annotation, LabelMap labelMap) {
        Label label = this.support.getLabel(contact, annotation);
        String path = label.getPath();
        String name = label.getName();
        if (labelMap.get(path) != 0) {
            throw new PersistenceException("Duplicate annotation of name '%s' on %s", name, contact);
        }
        process(contact, label, labelMap);
    }

    private void process(Contact contact, Label label, LabelMap labelMap) {
        Expression expression = label.getExpression();
        String path = label.getPath();
        Model model = this.root;
        if (!expression.isEmpty()) {
            model = register(expression);
        }
        this.resolver.register(label);
        model.register(label);
        labelMap.put(path, label);
    }

    private void text(Contact contact, Annotation annotation) {
        Label label = this.support.getLabel(contact, annotation);
        Expression expression = label.getExpression();
        String path = label.getPath();
        Model model = this.root;
        if (!expression.isEmpty()) {
            model = register(expression);
        }
        if (this.texts.get(path) != 0) {
            throw new TextException("Multiple text annotations in %s", annotation);
        }
        this.resolver.register(label);
        model.register(label);
        this.texts.put(path, label);
    }

    private void version(Contact contact, Annotation annotation) {
        Label label = this.support.getLabel(contact, annotation);
        if (this.version != null) {
            throw new AttributeException("Multiple version annotations in %s", annotation);
        }
        this.version = label;
    }

    public Structure build(Class cls) {
        return new Structure(this.factory, this.root, this.version, this.text, this.primitive);
    }

    private boolean isElement(String str) {
        Expression build = this.builder.build(str);
        Model lookup = lookup(build);
        if (lookup != null) {
            String last = build.getLast();
            int index = build.getIndex();
            if (lookup.isElement(last)) {
                return true;
            }
            return lookup.isModel(last) && !lookup.lookup(last, index).isEmpty();
        }
        return false;
    }

    private boolean isAttribute(String str) {
        Expression build = this.builder.build(str);
        Model lookup = lookup(build);
        if (lookup == null) {
            return false;
        }
        String last = build.getLast();
        if (!build.isPath()) {
            return lookup.isAttribute(str);
        }
        return lookup.isAttribute(last);
    }

    private Model lookup(Expression expression) {
        Expression path = expression.getPath(0, 1);
        if (expression.isPath()) {
            return this.root.lookup(path);
        }
        return this.root;
    }

    private Model register(Expression expression) {
        Model lookup = this.root.lookup(expression);
        return lookup != null ? lookup : create(expression);
    }

    private Model create(Expression expression) {
        Model model = this.root;
        while (model != null) {
            String prefix = expression.getPrefix();
            String first = expression.getFirst();
            int index = expression.getIndex();
            if (first != null) {
                model = model.register(first, prefix, index);
            }
            if (!expression.isPath()) {
                return model;
            }
            expression = expression.getPath(1);
        }
        return model;
    }

    public void commit(Class cls) {
        if (this.factory == null) {
            this.factory = this.resolver.build();
        }
    }

    public void validate(Class cls) {
        Order order = this.scanner.getOrder();
        validateUnions(cls);
        validateElements(cls, order);
        validateAttributes(cls, order);
        validateModel(cls);
        validateText(cls);
        validateTextList(cls);
    }

    private void validateModel(Class cls) {
        if (this.root.isEmpty()) {
            return;
        }
        this.root.validate(cls);
    }

    private void validateText(Class cls) {
        Label text = this.root.getText();
        if (text != null) {
            if (text.isTextList()) {
                return;
            }
            if (!this.elements.isEmpty()) {
                throw new TextException("Elements used with %s in %s", text, cls);
            }
            if (this.root.isComposite()) {
                throw new TextException("Paths used with %s in %s", text, cls);
            }
            return;
        }
        if (this.scanner.isEmpty()) {
            this.primitive = isEmpty();
        }
    }

    private void validateTextList(Class cls) {
        Label text = this.root.getText();
        if (text == null || !text.isTextList()) {
            return;
        }
        Object key = text.getKey();
        Iterator it = this.elements.iterator();
        while (it.hasNext()) {
            Label label = (Label) it.next();
            if (!label.getKey().equals(key)) {
                throw new TextException("Elements used with %s in %s", text, cls);
            }
            Class type = label.getDependent().getType();
            if (type == String.class) {
                throw new TextException("Illegal entry of %s with text annotations on %s in %s", type, text, cls);
            }
        }
        if (this.root.isComposite()) {
            throw new TextException("Paths used with %s in %s", text, cls);
        }
    }

    private void validateUnions(Class cls) {
        Iterator it = this.elements.iterator();
        while (it.hasNext()) {
            Label label = (Label) it.next();
            String[] paths = label.getPaths();
            Contact contact = label.getContact();
            for (String str : paths) {
                Annotation annotation = contact.getAnnotation();
                Label label2 = (Label) this.elements.get(str);
                if (label.isInline() != label2.isInline()) {
                    throw new UnionException("Inline must be consistent in %s for %s", annotation, contact);
                }
                if (label.isRequired() != label2.isRequired()) {
                    throw new UnionException("Required must be consistent in %s for %s", annotation, contact);
                }
            }
        }
    }

    private void validateElements(Class cls, Order order) {
        if (order != null) {
            for (String str : order.elements()) {
                if (!isElement(str)) {
                    throw new ElementException("Ordered element '%s' missing for %s", str, cls);
                }
            }
        }
    }

    private void validateAttributes(Class cls, Order order) {
        if (order != null) {
            for (String str : order.attributes()) {
                if (!isAttribute(str)) {
                    throw new AttributeException("Ordered attribute '%s' missing in %s", str, cls);
                }
            }
        }
    }

    private boolean isEmpty() {
        if (this.text != null) {
            return false;
        }
        return this.root.isEmpty();
    }
}

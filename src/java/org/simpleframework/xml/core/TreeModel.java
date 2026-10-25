package org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TreeModel implements Model {
    public LabelMap attributes;
    public Detail detail;
    public LabelMap elements;
    public Expression expression;
    public int index;
    public Label list;
    public ModelMap models;
    public String name;
    public OrderList order;
    public Policy policy;
    public String prefix;
    public Label text;

    public class OrderList extends ArrayList {
    }

    public TreeModel(Policy policy, Detail detail) {
        this(policy, detail, null, null, 1);
    }

    public TreeModel(Policy policy, Detail detail, String str, String str2, int i) {
        this.attributes = new LabelMap(policy);
        this.elements = new LabelMap(policy);
        this.models = new ModelMap(detail);
        this.order = new OrderList();
        this.detail = detail;
        this.policy = policy;
        this.prefix = str2;
        this.index = i;
        this.name = str;
    }

    @Override // org.simpleframework.xml.core.Model
    public Model lookup(Expression expression) {
        Model lookup = lookup(expression.getFirst(), expression.getIndex());
        if (expression.isPath()) {
            Expression path = expression.getPath(1, 0);
            if (lookup != null) {
                return lookup.lookup(path);
            }
        }
        return lookup;
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerElement(String str) {
        if (!this.order.contains(str)) {
            this.order.add(str);
        }
        this.elements.put(str, null);
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerAttribute(String str) {
        this.attributes.put(str, null);
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerText(Label label) {
        if (this.text != null) {
            throw new TextException("Duplicate text annotation on %s", label);
        }
        this.text = label;
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerAttribute(Label label) {
        String name = label.getName();
        if (this.attributes.get(name) != 0) {
            throw new AttributeException("Duplicate annotation of name '%s' on %s", name, label);
        }
        this.attributes.put(name, label);
    }

    @Override // org.simpleframework.xml.core.Model
    public void registerElement(Label label) {
        String name = label.getName();
        if (this.elements.get(name) != 0) {
            throw new ElementException("Duplicate annotation of name '%s' on %s", name, label);
        }
        if (!this.order.contains(name)) {
            this.order.add(name);
        }
        if (label.isTextList()) {
            this.list = label;
        }
        this.elements.put(name, label);
    }

    @Override // org.simpleframework.xml.core.Model
    public ModelMap getModels() {
        return this.models.getModels();
    }

    @Override // org.simpleframework.xml.core.Model
    public LabelMap getAttributes() {
        return this.attributes.getLabels();
    }

    @Override // org.simpleframework.xml.core.Model
    public LabelMap getElements() {
        return this.elements.getLabels();
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isModel(String str) {
        return this.models.containsKey(str);
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isElement(String str) {
        return this.elements.containsKey(str);
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isAttribute(String str) {
        return this.attributes.containsKey(str);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = this.order.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return arrayList.iterator();
    }

    @Override // org.simpleframework.xml.core.Model
    public void validate(Class cls) {
        validateExpressions(cls);
        validateAttributes(cls);
        validateElements(cls);
        validateModels(cls);
        validateText(cls);
    }

    private void validateText(Class cls) {
        if (this.text != null) {
            if (!this.elements.isEmpty()) {
                throw new TextException("Text annotation %s used with elements in %s", this.text, cls);
            }
            if (isComposite()) {
                throw new TextException("Text annotation %s can not be used with paths in %s", this.text, cls);
            }
        }
    }

    private void validateExpressions(Class cls) {
        Iterator it = this.elements.iterator();
        while (it.hasNext()) {
            Label label = (Label) it.next();
            if (label != null) {
                validateExpression(label);
            }
        }
        Iterator it2 = this.attributes.iterator();
        while (it2.hasNext()) {
            Label label2 = (Label) it2.next();
            if (label2 != null) {
                validateExpression(label2);
            }
        }
        Label label3 = this.text;
        if (label3 != null) {
            validateExpression(label3);
        }
    }

    private void validateExpression(Label label) {
        Expression expression = label.getExpression();
        Expression expression2 = this.expression;
        if (expression2 != null) {
            String path = expression2.getPath();
            String path2 = expression.getPath();
            if (!path.equals(path2)) {
                throw new PathException("Path '%s' does not match '%s' in %s", path, path2, this.detail);
            }
            return;
        }
        this.expression = expression;
    }

    private void validateModels(Class cls) {
        Iterator it = this.models.iterator();
        while (it.hasNext()) {
            Iterator<E> it2 = ((ModelList) it.next()).iterator();
            int i = 1;
            while (it2.hasNext()) {
                Model model = (Model) it2.next();
                if (model != null) {
                    String name = model.getName();
                    int index = model.getIndex();
                    int i2 = i + 1;
                    if (index != i) {
                        throw new ElementException("Path section '%s[%s]' is out of sequence in %s", name, Integer.valueOf(index), cls);
                    }
                    model.validate(cls);
                    i = i2;
                }
            }
        }
    }

    private void validateAttributes(Class cls) {
        for (K k : this.attributes.keySet()) {
            if (((Label) this.attributes.get(k)) == null) {
                throw new AttributeException("Ordered attribute '%s' does not exist in %s", k, cls);
            }
            Expression expression = this.expression;
            if (expression != null) {
                expression.getAttribute(k);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void validateElements(Class cls) {
        for (K k : this.elements.keySet()) {
            ModelList modelList = (ModelList) this.models.get(k);
            Label label = (Label) this.elements.get(k);
            if (modelList == null && label == null) {
                throw new ElementException("Ordered element '%s' does not exist in %s", k, cls);
            }
            if (modelList != null && label != null && !modelList.isEmpty()) {
                throw new ElementException("Element '%s' is also a path name in %s", k, cls);
            }
            Expression expression = this.expression;
            if (expression != null) {
                expression.getElement(k);
            }
        }
    }

    @Override // org.simpleframework.xml.core.Model
    public void register(Label label) {
        if (label.isAttribute()) {
            registerAttribute(label);
        } else if (label.isText()) {
            registerText(label);
        } else {
            registerElement(label);
        }
    }

    @Override // org.simpleframework.xml.core.Model
    public Model lookup(String str, int i) {
        return this.models.lookup(str, i);
    }

    @Override // org.simpleframework.xml.core.Model
    public Model register(String str, String str2, int i) {
        Model lookup = this.models.lookup(str, i);
        return lookup == null ? create(str, str2, i) : lookup;
    }

    private Model create(String str, String str2, int i) {
        TreeModel treeModel = new TreeModel(this.policy, this.detail, str, str2, i);
        if (str != null) {
            this.models.register(str, treeModel);
            this.order.add(str);
        }
        return treeModel;
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isComposite() {
        Iterator it = this.models.iterator();
        while (it.hasNext()) {
            Iterator<E> it2 = ((ModelList) it.next()).iterator();
            while (it2.hasNext()) {
                Model model = (Model) it2.next();
                if (model != null && !model.isEmpty()) {
                    return true;
                }
            }
        }
        return !this.models.isEmpty();
    }

    @Override // org.simpleframework.xml.core.Model
    public boolean isEmpty() {
        if (this.text == null && this.elements.isEmpty() && this.attributes.isEmpty()) {
            return !isComposite();
        }
        return false;
    }

    @Override // org.simpleframework.xml.core.Model
    public Label getText() {
        Label label = this.list;
        return label != null ? label : this.text;
    }

    @Override // org.simpleframework.xml.core.Model
    public Expression getExpression() {
        return this.expression;
    }

    @Override // org.simpleframework.xml.core.Model
    public String getPrefix() {
        return this.prefix;
    }

    @Override // org.simpleframework.xml.core.Model
    public String getName() {
        return this.name;
    }

    @Override // org.simpleframework.xml.core.Model
    public int getIndex() {
        return this.index;
    }

    public String toString() {
        return "model '" + this.name + "[" + this.index + "]'";
    }
}

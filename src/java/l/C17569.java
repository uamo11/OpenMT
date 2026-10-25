package l;

import com.thegrizzlylabs.sardineandroid.model.EntityWithAnyElement;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import javax.xml.namespace.QName;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.w3c.dom.Element;

/* compiled from: 0ACF */
/* renamed from: l.ܿ᩶ۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17569 implements Converter {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Class f53686;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Persister f53687;

    @Override // org.simpleframework.xml.convert.Converter
    public final void write(OutputNode outputNode, Object obj) {
        EntityWithAnyElement entityWithAnyElement = (EntityWithAnyElement) obj;
        for (Element element : entityWithAnyElement.getAny()) {
            OutputNode child = outputNode.getChild(element.getNodeName());
            child.getNamespaces().setReference(element.getNamespaceURI(), element.getPrefix());
            child.setValue(element.getTextContent());
            child.commit();
        }
        HashMap m41056 = m41056();
        for (String str : m41056.keySet()) {
            String name = ((Field) m41056.get(str)).getName();
            Object invoke = this.f53686.getMethod("get" + (name.substring(0, 1).toUpperCase() + name.substring(1)), null).invoke(entityWithAnyElement, null);
            if (invoke != null) {
                if (invoke instanceof String) {
                    OutputNode child2 = outputNode.getChild(str);
                    child2.setReference("DAV:");
                    child2.setValue((String) invoke);
                } else {
                    this.f53687.write(invoke, outputNode);
                }
            }
        }
    }

    public C17569(Persister persister, Class cls) {
        this.f53687 = persister;
        this.f53686 = cls;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private HashMap m41056() {
        HashMap hashMap = new HashMap();
        for (Field field : this.f53686.getDeclaredFields()) {
            org.simpleframework.xml.Element element = (org.simpleframework.xml.Element) field.getAnnotation(org.simpleframework.xml.Element.class);
            if (element != null) {
                hashMap.put(element.name().equals("") ? field.getName() : element.name(), field);
            }
        }
        return hashMap;
    }

    @Override // org.simpleframework.xml.convert.Converter
    public final Object read(InputNode inputNode) {
        HashMap m41056 = m41056();
        Class cls = this.f53686;
        EntityWithAnyElement entityWithAnyElement = (EntityWithAnyElement) cls.newInstance();
        List any = entityWithAnyElement.getAny();
        while (true) {
            InputNode next = inputNode.getNext();
            if (next == null) {
                return entityWithAnyElement;
            }
            if (m41056.containsKey(next.getName())) {
                Field field = (Field) m41056.get(next.getName());
                String name = field.getName();
                cls.getMethod(C20094.m46315("set", name.substring(0, 1).toUpperCase() + name.substring(1)), field.getType()).invoke(entityWithAnyElement, this.f53687.read((Class) field.getType(), next));
            } else if (next.getPrefix() == null || next.getPrefix().isEmpty()) {
                while (next.getNext() != null) {
                }
            } else {
                Element m35050 = C14746.m35050(new QName(next.getReference(), next.getName(), next.getPrefix()));
                m35050.setTextContent(next.getValue());
                any.add(m35050);
            }
        }
    }
}

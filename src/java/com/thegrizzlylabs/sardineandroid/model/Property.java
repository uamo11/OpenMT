package com.thegrizzlylabs.sardineandroid.model;

import javax.xml.namespace.QName;
import l.C14746;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.convert.Converter;
import org.simpleframework.xml.stream.InputNode;
import org.simpleframework.xml.stream.OutputNode;
import org.w3c.dom.Element;

@Namespace(prefix = "D", reference = "DAV:")
@Root(strict = false)
/* loaded from: classes.dex */
public class Property {
    public Element property;

    public Element getProperty() {
        return this.property;
    }

    public void setProperty(Element element) {
        this.property = element;
    }

    public class PropertyConverter implements Converter {
        @Override // org.simpleframework.xml.convert.Converter
        public Property read(InputNode inputNode) {
            Property property = new Property();
            InputNode next = inputNode.getNext();
            if (next != null) {
                Element m35050 = C14746.m35050(new QName(next.getReference(), next.getName(), next.getPrefix()));
                m35050.setTextContent(next.getValue());
                property.setProperty(m35050);
            }
            return property;
        }

        @Override // org.simpleframework.xml.convert.Converter
        public void write(OutputNode outputNode, Property property) {
            Element element = property.property;
            OutputNode child = outputNode.getChild(element.getNodeName());
            child.getNamespaces().setReference(element.getNamespaceURI(), element.getPrefix());
            child.setValue(element.getTextContent());
            child.commit();
        }
    }
}

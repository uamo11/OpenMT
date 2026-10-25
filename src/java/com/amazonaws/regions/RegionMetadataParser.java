package com.amazonaws.regions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@Deprecated
/* loaded from: classes.dex */
public class RegionMetadataParser {
    @Deprecated
    public RegionMetadataParser() {
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m422(FileInputStream fileInputStream) {
        try {
            try {
                NodeList elementsByTagName = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(fileInputStream).getElementsByTagName("Region");
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < elementsByTagName.getLength(); i++) {
                    Node item = elementsByTagName.item(i);
                    if (item.getNodeType() == 1) {
                        Element element = (Element) item;
                        String m421 = m421("Name", element);
                        m421("Domain", element);
                        Region region = new Region(m421);
                        NodeList elementsByTagName2 = element.getElementsByTagName("Endpoint");
                        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
                            Element element2 = (Element) elementsByTagName2.item(i2);
                            String m4212 = m421("ServiceName", element2);
                            String m4213 = m421("Hostname", element2);
                            String m4214 = m421("Http", element2);
                            String m4215 = m421("Https", element2);
                            region.m417().put(m4212, m4213);
                            region.m414().put(m4212, Boolean.valueOf("true".equals(m4214)));
                            region.m415().put(m4212, Boolean.valueOf("true".equals(m4215)));
                        }
                        arrayList.add(region);
                    }
                }
                return arrayList;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException("Unable to parse region metadata file: " + e2.getMessage(), e2);
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m421(String str, Element element) {
        Node item = element.getElementsByTagName(str).item(0);
        if (item == null) {
            return null;
        }
        return item.getChildNodes().item(0).getNodeValue();
    }
}

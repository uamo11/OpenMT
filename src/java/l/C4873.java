package l;

import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.CDATASection;
import org.w3c.dom.Node;
import org.w3c.dom.Text;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: UBKB */
/* renamed from: l.ۙ᩶ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4873 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final DocumentBuilderFactory f15408;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f15409 = Pattern.compile("encoding=['\"](\\S*)['\"]");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final SAXParserFactory f15410;

    static {
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        f15408 = newInstance;
        newInstance.setNamespaceAware(true);
        newInstance.setValidating(false);
        SAXParserFactory newInstance2 = SAXParserFactory.newInstance();
        f15410 = newInstance2;
        try {
            newInstance2.setNamespaceAware(false);
            newInstance2.setFeature("http://xml.org/sax/features/namespace-prefixes", false);
            newInstance2.setValidating(false);
        } catch (ParserConfigurationException | SAXException unused) {
        }
        SAXParserFactory newInstance3 = SAXParserFactory.newInstance();
        try {
            newInstance3.setNamespaceAware(true);
            newInstance3.setFeature("http://xml.org/sax/features/namespace-prefixes", true);
            newInstance3.setValidating(false);
        } catch (ParserConfigurationException | SAXException unused2) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14232(String str, DefaultHandler defaultHandler) {
        SAXParser newSAXParser = f15410.newSAXParser();
        XMLReader xMLReader = newSAXParser.getXMLReader();
        xMLReader.setFeature("http://xml.org/sax/features/external-general-entities", false);
        xMLReader.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
        newSAXParser.getXMLReader().setProperty("http://xml.org/sax/properties/lexical-handler", defaultHandler);
        newSAXParser.parse(new InputSource(new StringReader(str)), defaultHandler);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:0|1|(16:3|(3:123|(2:(1:(1:(1:149))(1:145))(1:136)|137)(1:127)|128)(1:9)|10|11|(2:12|(1:122)(3:14|(2:16|(2:18|19)(2:21|22))(2:23|(2:27|(2:29|30)(2:31|(5:33|34|(1:(2:117|118)(2:36|(1:59)(1:41)))|(5:61|(3:63|(2:65|66)(1:68)|67)|69|70|(2:72|(1:74)))|75)(1:119)))(2:121|120))|20))|(2:(1:(1:79)(1:80))|81)|82|83|(1:85)|86|(1:90)|91|(4:92|93|94|96)|107|97|98)|150|11|(3:12|(0)(0)|20)|(0)|82|83|(0)|86|(2:88|90)|91|(4:92|93|94|96)|107|97|98|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x011a, code lost:
    
        if (r6.equals(r1) == false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x011c, code lost:
    
        r2 = new java.lang.String(r17, r9, r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0122, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0105 A[EDGE_INSN: B:122:0x0105->B:76:0x0105 BREAK  A[LOOP:0: B:12:0x0065->B:20:0x0100], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0130  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.w3c.dom.Document m14231(java.util.ArrayList r16, byte[] r17) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4873.m14231(java.util.ArrayList, byte[]):org.w3c.dom.Document");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3462 m14230(Node node) {
        String format;
        C20396 c20396 = null;
        if (node instanceof Attr) {
            Attr attr = (Attr) node;
            C20396 c203962 = (C20396) attr.getOwnerElement().getUserData("offsets");
            if (c203962 != null) {
                int m46719 = c203962.m46719();
                int m467192 = c203962.m46716().m46719();
                String str = (String) node.getOwnerDocument().getUserData("contents");
                if (str != null) {
                    String name = attr.getName();
                    if (attr.getPrefix() != null) {
                        format = String.format("(%1$s\\s*=\\s*((\".*?\")|('.*?')))", name);
                    } else {
                        format = String.format("[^:](%1$s\\s*=\\s*((\".*?\")|('.*?')))", name);
                    }
                    Matcher matcher = Pattern.compile(format).matcher(str);
                    if (!matcher.find(m46719) || matcher.start(1) > m467192) {
                        c20396 = c203962;
                    } else {
                        int start = matcher.start(1);
                        int m46717 = c203962.m46717();
                        int m46714 = c203962.m46714();
                        for (int m467193 = c203962.m46719(); m467193 < start; m467193++) {
                            if (str.charAt(m467193) == '\n') {
                                m46717++;
                                m46714 = 0;
                            } else {
                                m46714++;
                            }
                        }
                        C20396 c203963 = new C20396(m46717, m46714, start);
                        c203963.m46715(new C20396(m46717, (matcher.end(1) + m46714) - start, matcher.end(1)));
                        c20396 = c203963;
                    }
                }
            }
            c20396 = (C20396) node.getUserData("offsets");
        } else {
            if (node instanceof Text) {
                C20396 c203964 = node.getPreviousSibling() != null ? (C20396) node.getPreviousSibling().getUserData("offsets") : null;
                if (c203964 == null) {
                    c203964 = (C20396) node.getParentNode().getUserData("offsets");
                }
                if (c203964 != null) {
                    int m467194 = c203964.m46719();
                    int m467195 = c203964.m46716().m46719();
                    int m467172 = c203964.m46717();
                    int m467142 = c203964.m46714();
                    String str2 = (String) node.getOwnerDocument().getUserData("contents");
                    if (str2 != null && str2.length() >= m467195) {
                        boolean z = false;
                        while (true) {
                            if (m467194 > m467195) {
                                c20396 = c203964;
                                break;
                            }
                            char charAt = str2.charAt(m467194);
                            if (charAt != '>' || z) {
                                if (charAt == '\"') {
                                    z = !z;
                                } else if (charAt == '\n') {
                                    m467172++;
                                    m467142 = -1;
                                }
                                m467142++;
                                m467194++;
                            } else {
                                int i = m467194 + 1;
                                int i2 = m467142 + 1;
                                if ((node instanceof CDATASection) && str2.regionMatches(i, "<![CDATA[", 0, 9)) {
                                    i = m467194 + 10;
                                    i2 = m467142 + 10;
                                }
                                String nodeValue = node.getNodeValue();
                                int length = nodeValue.length();
                                int i3 = 0;
                                int i4 = i2;
                                int i5 = m467172;
                                while (i3 < length) {
                                    char charAt2 = nodeValue.charAt(i3);
                                    if (charAt2 == '\n') {
                                        i5++;
                                        i4 = 0;
                                    } else {
                                        if (!Character.isWhitespace(charAt2)) {
                                            break;
                                        }
                                        i4++;
                                    }
                                    i3++;
                                }
                                if (i3 == nodeValue.length()) {
                                    i3 = 0;
                                } else {
                                    m467172 = i5;
                                    i2 = i4;
                                }
                                int i6 = i + i3;
                                C20396 c203965 = new C20396(m467172, i2, i6);
                                int i7 = length - 1;
                                while (true) {
                                    if (i7 < 0) {
                                        break;
                                    }
                                    if (!Character.isWhitespace(nodeValue.charAt(i7))) {
                                        length = i7 + 1;
                                        break;
                                    }
                                    i7--;
                                }
                                while (i3 < length) {
                                    if (nodeValue.charAt(i3) == '\n') {
                                        m467172++;
                                        i2 = 0;
                                    } else {
                                        i2++;
                                    }
                                    i6++;
                                    i3++;
                                }
                                c203965.m46715(new C20396(m467172, i2, i6));
                                c20396 = c203965;
                            }
                        }
                    }
                }
            }
            c20396 = (C20396) node.getUserData("offsets");
        }
        return c20396 == null ? C3462.f10964 : c20396.m46718();
    }
}

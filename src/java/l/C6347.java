package l;

import android.util.Pair;
import com.alipay.sdk.m.y.l;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import net.engio.mbassy.listener.MessageHandler;
import org.bouncycastle.i18n.TextBundle;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* compiled from: ZBIL */
/* renamed from: l.ۛ᩹ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6347 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f19659;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC9608 f19660;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Logger f19661 = Logger.getLogger("Svg2Vector");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f19662;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC9608 f19663;

    static {
        C6785 m24537 = AbstractC9608.m24537();
        m24537.mo18428("clip", "android:clip");
        m24537.mo18428("clip-rule", "");
        m24537.mo18428("fill", "android:fillColor");
        m24537.mo18428("fill-rule", "android:fillType");
        m24537.mo18428("fill-opacity", "android:fillAlpha");
        m24537.mo18428("opacity", "");
        m24537.mo18428("stroke", "android:strokeColor");
        m24537.mo18428("stroke-opacity", "android:strokeAlpha");
        m24537.mo18428("stroke-linejoin", "android:strokeLineJoin");
        m24537.mo18428("stroke-linecap", "android:strokeLineCap");
        m24537.mo18428("stroke-width", "android:strokeWidth");
        f19663 = m24537.mo18429();
        C6785 m245372 = AbstractC9608.m24537();
        m245372.mo18428("x1", "android:startX");
        m245372.mo18428("y1", "android:startY");
        m245372.mo18428("x2", "android:endX");
        m245372.mo18428("y2", "android:endY");
        m245372.mo18428("cx", "android:centerX");
        m245372.mo18428("cy", "android:centerY");
        m245372.mo18428("r", "android:gradientRadius");
        m245372.mo18428("spreadMethod", "android:tileMode");
        m245372.mo18428("gradientUnits", "");
        m245372.mo18428("gradientTransform", "");
        m245372.mo18428("gradientType", "android:type");
        f19660 = m245372.mo18429();
        f19662 = AbstractC6079.m16988("animate", "animateColor", "animateMotion", "animateTransform", "mpath", "set", am.av, "glyph", "marker", "missing-glyph", "pattern", "switch", "symbol", "feBlend", "feColorMatrix", "feComponentTransfer", "feComposite", "feConvolveMatrix", "feDiffuseLighting", "feDisplacementMap", "feFlood", "feFuncA", "feFuncB", "feFuncG", "feFuncR", "feGaussianBlur", "feImage", "feMerge", "feMergeNode", "feMorphology", "feOffset", "feSpecularLighting", "feTile", "feTurbulence", "font", "font-face", "font-face-format", "font-face-name", "font-face-src", "font-face-uri", "hkern", "vkern", "stop", "ellipse", "image", TextBundle.TEXT_ENTRY, "feDistantLight", "fePointLight", "feSpotLight", "symbol", "altGlyph", "altGlyphDef", "altGlyphItem", "glyph", "glyphRef", "textPath", TextBundle.TEXT_ENTRY, "tref", "tspan", "altGlyph", "textPath", "tref", "tspan", "color-profile", "cursor", MessageHandler.Properties.Filter, "foreignObject", "script", "view");
        f19659 = Pattern.compile("[\\s,]+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17620(C9813 c9813, C2051 c2051) {
        NodeList nodeList;
        int i;
        NodeList nodeList2;
        NamedNodeMap namedNodeMap;
        int i2;
        String str;
        String str2;
        String str3;
        Element element = c2051.f45035;
        NamedNodeMap attributes = element.getAttributes();
        int length = attributes.getLength();
        for (int i3 = 0; i3 < length; i3++) {
            Node item = attributes.item(i3);
            String nodeName = item.getNodeName();
            String nodeValue = item.getNodeValue();
            if (f19660.containsKey(nodeName)) {
                c2051.mo27792(nodeName, nodeValue);
            }
        }
        NodeList childNodes = element.getChildNodes();
        int i4 = 0;
        double d = 0.0d;
        while (i4 < childNodes.getLength()) {
            Node item2 = childNodes.item(i4);
            if (item2.getNodeName().equals("stop")) {
                NamedNodeMap attributes2 = item2.getAttributes();
                String str4 = "rgb(0,0,0)";
                String str5 = "1";
                int i5 = 0;
                while (i5 < attributes2.getLength()) {
                    Node item3 = attributes2.item(i5);
                    String nodeName2 = item3.getNodeName();
                    String nodeValue2 = item3.getNodeValue();
                    try {
                        switch (nodeName2.hashCode()) {
                            case -1388068544:
                                nodeList2 = childNodes;
                                namedNodeMap = attributes2;
                                i2 = i4;
                                if (nodeName2.equals("stop-opacity")) {
                                    str5 = nodeValue2;
                                    break;
                                } else {
                                    break;
                                }
                            case -1019779949:
                                nodeList2 = childNodes;
                                namedNodeMap = attributes2;
                                try {
                                    if (nodeName2.equals("offset")) {
                                        i2 = i4;
                                        try {
                                            d = Math.max(Math.min(1.0d, Math.max(nodeValue2.endsWith("%") ? Double.parseDouble(nodeValue2.substring(0, nodeValue2.length() - 1)) / 100.0d : Double.parseDouble(nodeValue2), 0.0d)), d);
                                        } catch (IllegalArgumentException unused) {
                                            c9813.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), item2);
                                            i5++;
                                            i4 = i2;
                                            childNodes = nodeList2;
                                            attributes2 = namedNodeMap;
                                        }
                                    }
                                    i2 = i4;
                                } catch (IllegalArgumentException unused2) {
                                    i2 = i4;
                                    c9813.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), item2);
                                    i5++;
                                    i4 = i2;
                                    childNodes = nodeList2;
                                    attributes2 = namedNodeMap;
                                }
                            case 109780401:
                                if (nodeName2.equals("style")) {
                                    String[] split = nodeValue2.split(l.b);
                                    nodeList2 = childNodes;
                                    try {
                                        int length2 = split.length;
                                        namedNodeMap = attributes2;
                                        int i6 = 0;
                                        while (i6 < length2) {
                                            int i7 = length2;
                                            try {
                                                str3 = split[i6];
                                                str = str4;
                                            } catch (IllegalArgumentException unused3) {
                                                str = str4;
                                            }
                                            try {
                                                String[] split2 = str3.split(":");
                                                str2 = str5;
                                                try {
                                                    String[] strArr = split;
                                                    if (split2.length == 2) {
                                                        if (str3.startsWith("stop-color")) {
                                                            str4 = split2[1];
                                                            str5 = str2;
                                                            i6++;
                                                            length2 = i7;
                                                            split = strArr;
                                                        } else if (str3.startsWith("stop-opacity")) {
                                                            str5 = split2[1];
                                                            str4 = str;
                                                            i6++;
                                                            length2 = i7;
                                                            split = strArr;
                                                        }
                                                    }
                                                    str4 = str;
                                                    str5 = str2;
                                                    i6++;
                                                    length2 = i7;
                                                    split = strArr;
                                                } catch (IllegalArgumentException unused4) {
                                                    i2 = i4;
                                                    str4 = str;
                                                    str5 = str2;
                                                    c9813.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), item2);
                                                    i5++;
                                                    i4 = i2;
                                                    childNodes = nodeList2;
                                                    attributes2 = namedNodeMap;
                                                }
                                            } catch (IllegalArgumentException unused5) {
                                                str2 = str5;
                                                i2 = i4;
                                                str4 = str;
                                                str5 = str2;
                                                c9813.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), item2);
                                                i5++;
                                                i4 = i2;
                                                childNodes = nodeList2;
                                                attributes2 = namedNodeMap;
                                            }
                                        }
                                        i2 = i4;
                                    } catch (IllegalArgumentException unused6) {
                                        namedNodeMap = attributes2;
                                        i2 = i4;
                                        c9813.m24854(C20087.m46306("Invalid attribute value: ", nodeName2, "=\"", nodeValue2, "\""), item2);
                                        i5++;
                                        i4 = i2;
                                        childNodes = nodeList2;
                                        attributes2 = namedNodeMap;
                                    }
                                }
                                nodeList2 = childNodes;
                                namedNodeMap = attributes2;
                                i2 = i4;
                            case 1842201048:
                                if (nodeName2.equals("stop-color")) {
                                    nodeList2 = childNodes;
                                    namedNodeMap = attributes2;
                                    str4 = nodeValue2;
                                    i2 = i4;
                                    break;
                                }
                                nodeList2 = childNodes;
                                namedNodeMap = attributes2;
                                i2 = i4;
                            default:
                                nodeList2 = childNodes;
                                namedNodeMap = attributes2;
                                i2 = i4;
                                break;
                        }
                    } catch (IllegalArgumentException unused7) {
                        nodeList2 = childNodes;
                    }
                    i5++;
                    i4 = i2;
                    childNodes = nodeList2;
                    attributes2 = namedNodeMap;
                }
                nodeList = childNodes;
                i = i4;
                String m24847 = c9813.m24847(d);
                String m35052 = c2051.m35052(str4, "#000000");
                if (m35052 != null) {
                    str4 = m35052;
                }
                c2051.m6732(str4, m24847, str5);
            } else {
                nodeList = childNodes;
                i = i4;
            }
            i4 = i + 1;
            childNodes = nodeList;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17622(C9813 c9813, AbstractC14750 abstractC14750) {
        String attribute = abstractC14750.f45035.getAttribute("id");
        if (attribute.isEmpty()) {
            return;
        }
        c9813.m24867(abstractC14750, attribute);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17621(l.C9813 r64, l.C11224 r65, org.w3c.dom.Element r66) {
        /*
            Method dump skipped, instructions count: 3272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6347.m17621(l.ۢ᩶ۡ, l.ۧ᩶ۡ, org.w3c.dom.Element):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17624(Node node) {
        Level level = Level.FINE;
        String str = " nodeName=\"" + node.getNodeName() + "\"";
        Logger logger = f19661;
        logger.log(level, str);
        String namespaceURI = node.getNamespaceURI();
        if (namespaceURI != null) {
            logger.log(level, " uri=\"" + namespaceURI + "\"");
        }
        String prefix = node.getPrefix();
        if (prefix != null) {
            logger.log(level, " pre=\"" + prefix + "\"");
        }
        String localName = node.getLocalName();
        if (localName != null) {
            logger.log(level, " local=\"" + localName + "\"");
        }
        String nodeValue = node.getNodeValue();
        if (nodeValue != null) {
            logger.log(level, " nodeValue=");
            if (nodeValue.trim().isEmpty()) {
                logger.log(level, "[WS]");
                return;
            }
            logger.log(level, "\"" + node.getNodeValue() + "\"");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17623(AbstractC14750 abstractC14750, String str) {
        String str2;
        f19661.log(Level.FINE, "Style found is " + str);
        if (str == null) {
            return;
        }
        String[] split = str.split(l.b);
        int length = split.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            String[] split2 = split[length].split(":");
            if (split2.length == 2 && (str2 = split2[0]) != null && split2[1] != null) {
                String trim = str2.trim();
                String trim2 = split2[1].trim();
                if (f19663.containsKey(trim)) {
                    abstractC14750.mo27792(trim, trim2);
                } else if (trim.equals("opacity")) {
                    abstractC14750.mo27792("fill-opacity", split2[1]);
                }
                if (trim.equals("clip-path") || trim.equals("mask")) {
                    C11224 m24848 = abstractC14750.f45039.m24848(abstractC14750);
                    if (m24848 != null) {
                        abstractC14750.f45039.m24858(abstractC14750, m24848, trim2);
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17619(AbstractC15440 abstractC15440, ByteArrayOutputStream byteArrayOutputStream) {
        AbstractC14750 m24872;
        String name = abstractC15440.getName();
        byte[] m36506 = abstractC15440.m36506();
        final C9813 c9813 = new C9813();
        ArrayList arrayList = new ArrayList();
        Document m24849 = c9813.m24849(name, arrayList, m36506);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c9813.m24854((String) it.next(), (Node) null);
        }
        NodeList elementsByTagName = m24849.getElementsByTagName("svg");
        if (elementsByTagName.getLength() != 1) {
            throw new IllegalStateException("Not a proper SVG file");
        }
        Element element = (Element) elementsByTagName.item(0);
        c9813.m24859(element);
        if (c9813.m24877() == null) {
            c9813.m24854("Missing \"viewBox\" in <svg> element", element);
        } else {
            C11224 c11224 = new C11224(c9813, element, "root");
            c9813.m24866(c11224);
            m17621(c9813, c11224, element);
            HashSet m24878 = c9813.m24878();
            while (true) {
                if (m24878.isEmpty()) {
                    break;
                }
                if (!C5378.removeIf(m24878, new Predicate() { // from class: l.ۤ᩹ۡ
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C19285.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public /* synthetic */ Predicate mo4928negate() {
                        return C19285.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C19285.$default$or(this, predicate);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
                    
                        r8 = "";
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
                    
                        if (r10.isEmpty() != false) goto L16;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
                    
                        if (r10.isEmpty() != false) goto L16;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
                    
                        r8 = r10.substring(1);
                     */
                    @Override // java.util.function.Predicate
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean test(java.lang.Object r15) {
                        /*
                            r14 = this;
                            l.ۧ᩶ۡ r15 = (l.C11224) r15
                            org.w3c.dom.Element r0 = r15.f45035
                            org.w3c.dom.NamedNodeMap r1 = r0.getAttributes()
                            int r2 = r1.getLength()
                            r3 = 0
                            r4 = 0
                            r5 = 0
                            r6 = 0
                            r7 = 0
                            r8 = r4
                        L12:
                            r9 = 1
                            if (r7 >= r2) goto L71
                            org.w3c.dom.Node r10 = r1.item(r7)
                            java.lang.String r11 = r10.getNodeName()
                            java.lang.String r10 = r10.getNodeValue()
                            java.lang.String r12 = "href"
                            boolean r12 = r11.equals(r12)
                            java.lang.String r13 = ""
                            if (r12 == 0) goto L37
                            boolean r8 = r10.isEmpty()
                            if (r8 == 0) goto L32
                            goto L47
                        L32:
                            java.lang.String r8 = r10.substring(r9)
                            goto L6e
                        L37:
                            java.lang.String r12 = "xlink:href"
                            boolean r12 = r11.equals(r12)
                            if (r12 == 0) goto L49
                            if (r8 != 0) goto L49
                            boolean r8 = r10.isEmpty()
                            if (r8 == 0) goto L32
                        L47:
                            r8 = r13
                            goto L6e
                        L49:
                            java.lang.String r9 = "x"
                            boolean r9 = r11.equals(r9)
                            if (r9 == 0) goto L56
                            float r3 = java.lang.Float.parseFloat(r10)
                            goto L6e
                        L56:
                            java.lang.String r9 = "y"
                            boolean r9 = r11.equals(r9)
                            if (r9 == 0) goto L63
                            float r6 = java.lang.Float.parseFloat(r10)
                            goto L6e
                        L63:
                            l.ۢ۬ܺ r9 = l.C6347.f19663
                            boolean r9 = r9.containsKey(r11)
                            if (r9 == 0) goto L6e
                            r15.mo27792(r11, r10)
                        L6e:
                            int r7 = r7 + 1
                            goto L12
                        L71:
                            l.֡᩶ۡ r1 = new l.֡᩶ۡ
                            r1.<init>(r3, r6)
                            l.ۢ᩶ۡ r2 = l.C9813.this
                            if (r8 != 0) goto L7b
                            goto L7f
                        L7b:
                            l.ܳ᩶ۡ r4 = r2.m24872(r8)
                        L7f:
                            if (r4 != 0) goto L91
                            if (r8 == 0) goto L8b
                            boolean r15 = r2.m24876(r8)
                            if (r15 != 0) goto L8a
                            goto L8b
                        L8a:
                            return r9
                        L8b:
                            java.lang.String r15 = "Referenced id not found"
                            r2.m24854(r15, r0)
                            return r9
                        L91:
                            java.util.HashSet r0 = r2.m24878()
                            boolean r0 = r0.contains(r4)
                            if (r0 == 0) goto L9c
                            return r5
                        L9c:
                            l.ܳ᩶ۡ r0 = r4.mo6729()
                            r15.mo27790(r0)
                            java.util.HashMap r2 = r15.f45037
                            java.util.Set r3 = r2.entrySet()
                            java.util.Iterator r3 = r3.iterator()
                        Lad:
                            boolean r4 = r3.hasNext()
                            if (r4 == 0) goto Lc9
                            java.lang.Object r4 = r3.next()
                            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                            java.lang.Object r5 = r4.getKey()
                            java.lang.String r5 = (java.lang.String) r5
                            java.lang.Object r4 = r4.getValue()
                            java.lang.String r4 = (java.lang.String) r4
                            r0.mo27792(r5, r4)
                            goto Lad
                        Lc9:
                            r15.m35053(r2)
                            r15.mo6736(r1)
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: l.C10581.test(java.lang.Object):boolean");
                    }
                })) {
                    HashMap hashMap = new HashMap();
                    HashMap hashMap2 = new HashMap();
                    Iterator it2 = m24878.iterator();
                    while (it2.hasNext()) {
                        Element element2 = ((C11224) it2.next()).f45035;
                        String attribute = element2.getAttribute("id");
                        if (!attribute.isEmpty()) {
                            String attribute2 = element2.getAttribute("href");
                            if (attribute2.isEmpty()) {
                                attribute2 = element2.getAttribute("xlink:href");
                            }
                            if (!attribute2.isEmpty()) {
                                hashMap.put(attribute, attribute2.isEmpty() ? "" : attribute2.substring(1));
                                hashMap2.put(attribute, element2);
                            }
                        }
                    }
                    while (!hashMap.isEmpty()) {
                        HashSet hashSet = new HashSet();
                        Map.Entry entry = (Map.Entry) hashMap.entrySet().iterator().next();
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        while (str2 != null && hashSet.add(str)) {
                            str = str2;
                            str2 = (String) hashMap.get(str2);
                        }
                        if (str2 != null) {
                            Node node = (Node) hashMap2.get(str);
                            StringBuilder sb = new StringBuilder(str);
                            String str3 = str;
                            while (true) {
                                str3 = (String) hashMap.get(str3);
                                sb.append(" -> ");
                                sb.append(str3);
                                if (str3.equals(str)) {
                                    break;
                                }
                                sb.append(" (line ");
                                sb.append(C4873.m14230((Node) hashMap2.get(str3)).m10600() + 1);
                                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                            }
                            c9813.m24854(C20094.m46315("Circular dependency of <use> nodes: ", sb.toString()), node);
                        }
                        hashMap.keySet().removeAll(hashSet);
                    }
                }
            }
            for (Map.Entry entry2 : c9813.m24861()) {
                Iterator it3 = ((Set) entry2.getValue()).iterator();
                while (it3.hasNext()) {
                    m17623((AbstractC14750) it3.next(), c9813.m24864((String) entry2.getKey()));
                }
            }
            for (Map.Entry entry3 : c9813.m24871()) {
                AbstractC14750 abstractC14750 = (AbstractC14750) entry3.getKey();
                C11224 c112242 = (C11224) ((Pair) entry3.getValue()).first;
                String str4 = (String) ((Pair) entry3.getValue()).second;
                if (c112242 != null && str4 != null) {
                    int indexOf = str4.indexOf(35) + 1;
                    int indexOf2 = str4.indexOf(41, indexOf);
                    if (indexOf2 < 0) {
                        indexOf2 = str4.length();
                    }
                    String trim = str4.substring(indexOf, indexOf2).trim();
                    if (trim != null && (m24872 = c9813.m24872(trim)) != null) {
                        C11992 mo6729 = ((C11992) m24872).mo6729();
                        ArrayList arrayList2 = c112242.f33663;
                        int indexOf3 = arrayList2.indexOf(abstractC14750);
                        if (indexOf3 < 0) {
                            throw new IllegalArgumentException("The child being replaced doesn't belong to this group");
                        }
                        arrayList2.set(indexOf3, mo6729);
                        mo6729.m29300(abstractC14750);
                        mo6729.m29301();
                    }
                }
            }
            c9813.m24865();
            c9813.m24860();
            c9813.m24850();
        }
        if (c9813.m24874()) {
            c9813.m24851(byteArrayOutputStream);
        }
        return c9813.m24875();
    }
}

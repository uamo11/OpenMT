package l;

import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.am;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: E8QY */
/* renamed from: l.ᩴ᩵ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18966 implements InterfaceC9773 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final XmlPullParserFactory f59828;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f59823 = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f59822 = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f59824 = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f59826 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f59827 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f59820 = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f59821 = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C2738 f59825 = new C2738(1, 30.0f, 1);

    @Override // l.InterfaceC9773
    public final /* synthetic */ void reset() {
    }

    public C18966() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f59828 = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // l.InterfaceC9773
    /* renamed from: ֫ */
    public final void mo6618(byte[] bArr, int i, int i2, C21062 c21062, InterfaceC23483 interfaceC23483) {
        C5811.m16314(mo6617(i, i2, bArr), c21062, interfaceC23483);
    }

    @Override // l.InterfaceC9773
    /* renamed from: ֫ */
    public final InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        C2738 c2738;
        try {
            XmlPullParser newPullParser = this.f59828.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new C19672("", -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE));
            C4149 c4149 = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i, i2), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C2738 c27382 = f59825;
            int i3 = 15;
            C1326 c1326 = null;
            int i4 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                C16142 c16142 = (C16142) arrayDeque.peek();
                if (i4 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            c27382 = m43795(newPullParser);
                            i3 = m43787(newPullParser);
                            c4149 = m43796(newPullParser);
                        }
                        C4149 c41492 = c4149;
                        C2738 c27383 = c27382;
                        int i5 = i3;
                        if (m43794(name)) {
                            if ("head".equals(name)) {
                                c2738 = c27383;
                                m43793(newPullParser, hashMap, i5, c41492, hashMap2, hashMap3);
                            } else {
                                c2738 = c27383;
                                try {
                                    C16142 m43791 = m43791(newPullParser, c16142, hashMap2, c2738);
                                    arrayDeque.push(m43791);
                                    if (c16142 != null) {
                                        c16142.m38064(m43791);
                                    }
                                } catch (C2011 e) {
                                    C19956.m46036("Suppressing parser error", e);
                                }
                            }
                            c27382 = c2738;
                            c4149 = c41492;
                            i3 = i5;
                        } else {
                            C19956.m46035("Ignoring unsupported tag: " + newPullParser.getName());
                            c2738 = c27383;
                        }
                        i4++;
                        c27382 = c2738;
                        c4149 = c41492;
                        i3 = i5;
                    } else if (eventType == 4) {
                        c16142.getClass();
                        c16142.m38064(C16142.m38055(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            C16142 c161422 = (C16142) arrayDeque.peek();
                            c161422.getClass();
                            c1326 = new C1326(c161422, hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i4++;
                } else if (eventType == 3) {
                    i4--;
                }
                newPullParser.next();
            }
            c1326.getClass();
            return c1326;
        } catch (IOException e2) {
            throw new IllegalStateException("Unexpected error when reading input.", e2);
        } catch (XmlPullParserException e3) {
            throw new IllegalStateException("Unable to decode source", e3);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2738 m43795(XmlPullParser xmlPullParser) {
        float f;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String str = C3603.f11424;
            C22632.m50630("frameRateMultiplier doesn't have 2 parts", attributeValue2.split(" ", -1).length == 2);
            f = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        C2738 c2738 = f59825;
        int i = c2738.f8530;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i = Integer.parseInt(attributeValue3);
        }
        int i2 = c2738.f8531;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i2 = Integer.parseInt(attributeValue4);
        }
        return new C2738(i, parseInt * f, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m43787(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return 15;
        }
        Matcher matcher = f59821.matcher(attributeValue);
        if (!matcher.matches()) {
            C19956.m46037("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
        boolean z = true;
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt == 0 || parseInt2 == 0) {
                z = false;
            }
            C22632.m50630("Invalid cell resolution " + parseInt + " " + parseInt2, z);
            return parseInt2;
        } catch (NumberFormatException unused) {
            C19956.m46037("Ignoring malformed cell resolution: ".concat(attributeValue));
            return 15;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C4149 m43796(XmlPullParser xmlPullParser) {
        String m42841 = C18420.m42841(xmlPullParser, "extent");
        if (m42841 == null) {
            return null;
        }
        Matcher matcher = f59820.matcher(m42841);
        if (!matcher.matches()) {
            C19956.m46037("Ignoring non-pixel tts extent: ".concat(m42841));
            return null;
        }
        try {
            String group = matcher.group(1);
            group.getClass();
            int parseInt = Integer.parseInt(group);
            String group2 = matcher.group(2);
            group2.getClass();
            return new C4149(parseInt, Integer.parseInt(group2));
        } catch (NumberFormatException unused) {
            C19956.m46037("Ignoring malformed tts extent: ".concat(m42841));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0222  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m43793(org.xmlpull.v1.XmlPullParser r19, java.util.HashMap r20, int r21, l.C4149 r22, java.util.HashMap r23, java.util.HashMap r24) {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18966.m43793(org.xmlpull.v1.XmlPullParser, java.util.HashMap, int, l.ۘ᩵ۧ, java.util.HashMap, java.util.HashMap):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0124, code lost:
    
        if (r5.equals("start") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0361, code lost:
    
        if (r5.equals("start") == false) goto L230;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C5560 m43790(org.xmlpull.v1.XmlPullParser r17, l.C5560 r18) {
        /*
            Method dump skipped, instructions count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18966.m43790(org.xmlpull.v1.XmlPullParser, l.ۚ᩵ۧ):l.ۚ᩵ۧ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5560 m43789(C5560 c5560) {
        return c5560 == null ? new C5560() : c5560;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16142 m43791(XmlPullParser xmlPullParser, C16142 c16142, HashMap hashMap, C2738 c2738) {
        long j;
        long j2;
        char c;
        String[] split;
        int attributeCount = xmlPullParser.getAttributeCount();
        C5560 m43790 = m43790(xmlPullParser, (C5560) null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.getClass();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (!hashMap.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j5 = m43788(attributeValue, c2738);
                    continue;
                case 2:
                    j4 = m43788(attributeValue, c2738);
                    continue;
                case 3:
                    j3 = m43788(attributeValue, c2738);
                    continue;
                case 4:
                    String trim = attributeValue.trim();
                    if (trim.isEmpty()) {
                        split = new String[0];
                    } else {
                        String str3 = C3603.f11424;
                        split = trim.split("\\s+", -1);
                    }
                    if (split.length > 0) {
                        strArr = split;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (c16142 != null) {
            long j6 = c16142.f49735;
            j = -9223372036854775807L;
            if (j6 != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += j6;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += j6;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j7 = j3;
        if (j4 == j) {
            if (j5 != j) {
                j2 = j7 + j5;
            } else if (c16142 != null) {
                long j8 = c16142.f49729;
                if (j8 != j) {
                    j2 = j8;
                }
            }
            return C16142.m38056(xmlPullParser.getName(), j7, j2, m43790, strArr, str2, str, c16142);
        }
        j2 = j4;
        return C16142.m38056(xmlPullParser.getName(), j7, j2, m43790, strArr, str2, str, c16142);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43794(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals(am.ax) || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals(e.m) || str.equals("information");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43792(String str, C5560 c5560) {
        Matcher matcher;
        String group;
        String str2 = C3603.f11424;
        String[] split = str.split("\\s+", -1);
        int length = split.length;
        Pattern pattern = f59824;
        if (length == 1) {
            matcher = pattern.matcher(str);
        } else {
            if (split.length != 2) {
                throw new C2011(C3200.m9831(split.length, ".", new StringBuilder("Invalid number of entries for fontSize: ")));
            }
            matcher = pattern.matcher(split[1]);
            C19956.m46037("Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new C2011(C4860.m14172("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.getClass();
        switch (group) {
            case "%":
                c5560.m15747(3);
                break;
            case "em":
                c5560.m15747(2);
                break;
            case "px":
                c5560.m15747(1);
                break;
            default:
                throw new C2011(C4860.m14172("Invalid unit for fontSize: '", group, "'."));
        }
        String group2 = matcher.group(1);
        group2.getClass();
        c5560.m15724(Float.parseFloat(group2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        if (r13.equals("ms") == false) goto L42;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x00db. Please report as an issue. */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m43788(java.lang.String r13, l.C2738 r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18966.m43788(java.lang.String, l.ۖ᩵ۧ):long");
    }
}

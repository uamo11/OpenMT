package l;

import com.umeng.analytics.pro.d;

/* compiled from: M7AC */
/* renamed from: l.ۗۨ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3224 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20158 m9893(C18090 c18090) {
        String str;
        C3545 entry = c18090.getEntry("AndroidManifest.xml");
        if (entry == null) {
            C20158 c20158 = new C20158();
            c20158.f65275 = false;
            c20158.f65277 = "AndroidManifest.xml not found";
            return c20158;
        }
        try {
            C15206 m35978 = C15206.m35978(c18090.m42193(entry, (C19277) null));
            C20158 c201582 = new C20158();
            C12534 c12534 = c18090.getEntry("resources.arsc") == null ? new C12534() : new C12534(c18090);
            m35978.m35986(c12534);
            XmlResourceParserC10269 m35994 = m35978.m35994();
            while (true) {
                C4635 c4635 = null;
                while (true) {
                    try {
                        int next = m35994.next();
                        if (next == 1) {
                            m35994.close();
                            c201582.f65275 = true;
                            return c201582;
                        }
                        if (next == 2) {
                            String name = m35994.getName();
                            if ("manifest".equals(name)) {
                                c201582.f65279 = m9892(m35994, "package", c12534);
                                c201582.f65272 = m9892(m35994, "versionName", c12534);
                                c201582.f65278 = m9892(m35994, "versionCode", c12534);
                            } else if ("uses-sdk".equals(name)) {
                                c201582.f65274 = m9892(m35994, "minSdkVersion", c12534);
                                c201582.f65271 = m9892(m35994, "targetSdkVersion", c12534);
                            } else if (!"uses-permission".equals(name)) {
                                if ("application".equals(name)) {
                                    m9894(c201582, m35994, c12534);
                                } else {
                                    if (!"activity".equals(name) && !"activity-alias".equals(name)) {
                                        if (c4635 != null && "intent-filter".equals(name)) {
                                            c4635.f14720 = true;
                                            c4635.f14719 = false;
                                            c4635.f14718 = false;
                                        } else if (!"service".equals(name) && !"receiver".equals(name) && !d.M.equals(name)) {
                                            if (c4635 != null && "action".equals(name)) {
                                                String m9892 = m9892(m35994, "name", c12534);
                                                if (c4635.f14720) {
                                                    c4635.f14719 = "android.intent.action.MAIN".equals(m9892) | c4635.f14719;
                                                }
                                            } else if (c4635 != null && "category".equals(name)) {
                                                String m98922 = m9892(m35994, "name", c12534);
                                                if (c4635.f14720) {
                                                    c4635.f14718 = "android.intent.category.LAUNCHER".equals(m98922) | c4635.f14718;
                                                }
                                            }
                                        }
                                    }
                                    String str2 = c201582.f65279;
                                    String m98923 = m9892(m35994, "name", c12534);
                                    String m98924 = m9892(m35994, "targetActivity", c12534);
                                    if ("activity-alias".equals(name) && m98924 != null && !m98924.isEmpty()) {
                                        m98923 = m98924;
                                    }
                                    if (m98923 != null && !m98923.isEmpty() && str2 != null && !str2.isEmpty()) {
                                        if (m98923.charAt(0) == '.') {
                                            m98923 = str2.concat(m98923);
                                        } else if (m98923.indexOf(46) < 0) {
                                            m98923 = C22870.m50967(str2, ".", m98923);
                                        }
                                    }
                                    c4635 = new C4635(m98923);
                                }
                            }
                        } else if (next == 3) {
                            String name2 = m35994.getName();
                            if (c4635 != null && "intent-filter".equals(name2)) {
                                if (c4635.f14720 && c4635.f14719 && c4635.f14718) {
                                    c4635.f14722 = true;
                                }
                                c4635.f14720 = false;
                                c4635.f14719 = false;
                                c4635.f14718 = false;
                            } else if (c4635 != null && ("activity".equals(name2) || "activity-alias".equals(name2))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } finally {
                    }
                }
                if (c4635.f14722 && (str = c4635.f14721) != null) {
                    c201582.f65276.add(str);
                }
            }
        } catch (Exception e) {
            String message = e.getMessage() == null ? "Failed to parse manifest" : e.getMessage();
            C20158 c201583 = new C20158();
            c201583.f65275 = false;
            c201583.f65277 = message;
            return c201583;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008d, code lost:
    
        r10.f65270 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r11.trim().isEmpty() != false) goto L32;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m9894(l.C20158 r10, l.XmlResourceParserC10269 r11, l.C12534 r12) {
        /*
            r0 = 0
        L1:
            int r1 = r11.getAttributeCount()
            if (r0 >= r1) goto L8f
            java.lang.String r1 = "label"
            java.lang.String r2 = r11.getAttributeName(r0)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
            int r0 = r0 + 1
            goto L1
        L16:
            int r1 = l.C12396.f37328
            l.ۨۖܽ r1 = new l.ۨۖܽ
            r1.<init>()
            int r3 = r11.m26023(r0)
            int r4 = r11.m26020(r0)
            java.lang.String r5 = r11.getAttributeNamespace(r0)
            java.lang.String r6 = r11.getAttributeName(r0)
            int r7 = r11.getAttributeNameResource(r0)
            java.lang.String r8 = r11.getAttributeValue(r0)
            r2 = r1
            r9 = r12
            l.C12396.m30555(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r1 = r1.toString()
            r10.f65273 = r1
            int r1 = r11.m26023(r0)
            int r2 = r11.m26020(r0)
            java.lang.String r11 = r11.getAttributeValue(r0)
            r0 = 0
            r3 = 3
            if (r1 != r3) goto L5f
            if (r11 != 0) goto L53
            goto L5d
        L53:
            java.lang.String r12 = r11.trim()
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L88
        L5d:
            r11 = r0
            goto L88
        L5f:
            r11 = 1
            if (r1 != r11) goto L8b
            if (r2 != 0) goto L65
            goto L8b
        L65:
            android.util.TypedValue r1 = new android.util.TypedValue     // Catch: java.lang.Exception -> L8a
            r1.<init>()     // Catch: java.lang.Exception -> L8a
            r12.m30770(r2, r1, r11)     // Catch: java.lang.Exception -> L8a
            int r11 = r1.type     // Catch: java.lang.Exception -> L8a
            if (r11 != r3) goto L8b
            java.lang.CharSequence r11 = r1.string     // Catch: java.lang.Exception -> L8a
            if (r11 != 0) goto L76
            goto L8b
        L76:
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L8a
            if (r11 != 0) goto L7d
            goto L8b
        L7d:
            java.lang.String r12 = r11.trim()     // Catch: java.lang.Exception -> L8a
            boolean r12 = r12.isEmpty()     // Catch: java.lang.Exception -> L8a
            if (r12 == 0) goto L88
            goto L8b
        L88:
            r0 = r11
            goto L8b
        L8a:
        L8b:
            if (r0 == 0) goto L8f
            r10.f65270 = r0
        L8f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3224.m9894(l.᩶ۨ᩻, l.ۤۨۡ, l.۫ܽܽ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9892(XmlResourceParserC10269 xmlResourceParserC10269, String str, C12534 c12534) {
        for (int i = 0; i < xmlResourceParserC10269.getAttributeCount(); i++) {
            if (str.equals(xmlResourceParserC10269.getAttributeName(i))) {
                int i2 = C12396.f37328;
                C11418 c11418 = new C11418();
                C12396.m30555(c11418, xmlResourceParserC10269.m26023(i), xmlResourceParserC10269.m26020(i), xmlResourceParserC10269.getAttributeNamespace(i), xmlResourceParserC10269.getAttributeName(i), xmlResourceParserC10269.getAttributeNameResource(i), xmlResourceParserC10269.getAttributeValue(i), c12534);
                return c11418.toString();
            }
        }
        return null;
    }
}

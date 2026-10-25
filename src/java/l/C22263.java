package l;

import com.umeng.commonsdk.framework.UMModuleRegister;
import java.io.IOException;

/* compiled from: 5AOM */
/* renamed from: l.᩹ۨۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22263 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49978(AbstractC15440 abstractC15440) {
        try {
            C18090 c18090 = new C18090(abstractC15440);
            try {
                String m49979 = m49979(c18090);
                c18090.close();
                return m49979;
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49979(C18090 c18090) {
        C3545 entry = c18090.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            return null;
        }
        try {
            return m49980(C15206.m35970(c18090.m42189(entry)));
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m49981(C18090 c18090) {
        C3545 entry = c18090.getEntry("AndroidManifest.xml");
        if (entry == null || entry.getSize() > 5242880) {
            return false;
        }
        try {
            return m49984(C15206.m35970(c18090.m42189(entry)));
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[LOOP:1: B:9:0x0014->B:18:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m49980(l.C15206 r5) {
        /*
            l.ۤۨۡ r5 = r5.m35994()     // Catch: java.lang.Throwable -> L4f
        L4:
            int r0 = r5.next()     // Catch: java.lang.Throwable -> L4f
            r1 = 1
            if (r0 == r1) goto L4f
            r1 = 2
            if (r0 == r1) goto Lf
            goto L4
        Lf:
            int r0 = r5.getAttributeCount()     // Catch: java.lang.Throwable -> L4f
            r1 = 0
        L14:
            if (r1 == r0) goto L4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r2.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r5.getAttributePrefix(r1)     // Catch: java.lang.Throwable -> L4f
            if (r3 == 0) goto L2f
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L4f
            if (r4 != 0) goto L28
            goto L2f
        L28:
            java.lang.String r4 = ":"
            java.lang.String r3 = r3.concat(r4)     // Catch: java.lang.Throwable -> L4f
            goto L31
        L2f:
            java.lang.String r3 = ""
        L31:
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = r5.getAttributeName(r1)     // Catch: java.lang.Throwable -> L4f
            r2.append(r3)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "package"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L4c
            java.lang.String r5 = r5.getAttributeValue(r1)     // Catch: java.lang.Throwable -> L4f
            return r5
        L4c:
            int r1 = r1 + 1
            goto L14
        L4f:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22263.m49980(l.ܶۨۡ):java.lang.String");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String[] m49983(C15206 c15206) {
        try {
            XmlResourceParserC10269 m35994 = c15206.m35994();
            String str = null;
            while (true) {
                int next = m35994.next();
                if (next == 1) {
                    break;
                }
                if (next == 2) {
                    int i = 0;
                    if (m35994.getName().equals("manifest")) {
                        int attributeCount = m35994.getAttributeCount();
                        while (i < attributeCount) {
                            if (m35994.getAttributeName(i).equals("package")) {
                                str = m35994.getAttributeValue(i);
                            }
                            i++;
                        }
                    } else if (m35994.getName().equals("application")) {
                        if (str != null) {
                            int attributeCount2 = m35994.getAttributeCount();
                            while (i < attributeCount2) {
                                if (m35994.getAttributeNameResource(i) == 16842755) {
                                    String attributeValue = m35994.getAttributeValue(i);
                                    if (attributeValue.startsWith(".")) {
                                        attributeValue = str + attributeValue;
                                    }
                                    return new String[]{str, attributeValue};
                                }
                                i++;
                            }
                        }
                    }
                }
            }
            return new String[]{str, null};
        } catch (Throwable unused) {
            return new String[2];
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m49982(C15206 c15206) {
        XmlResourceParserC10269 m35994 = c15206.m35994();
        while (true) {
            int next = m35994.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && m35994.getName().equals("application")) {
                int attributeCount = m35994.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (m35994.getAttributeNameResource(i) == 16844010) {
                        return !m35994.getAttributeBooleanValue(i, true);
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m49984(C15206 c15206) {
        XmlResourceParserC10269 m35994 = c15206.m35994();
        while (true) {
            int next = m35994.next();
            if (next == 1) {
                return false;
            }
            if (next == 2 && (m35994.getName().equals("application") || m35994.getName().equals(UMModuleRegister.PROCESS))) {
                int attributeCount = m35994.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (m35994.getAttributeNameResource(i) == 16844190 && m35994.getAttributeBooleanValue(i, false)) {
                        return true;
                    }
                }
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m49985(C15206 c15206) {
        XmlResourceParserC10269 m35994 = c15206.m35994();
        while (true) {
            int next = m35994.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && m35994.getName().equals("uses-sdk")) {
                int attributeCount = m35994.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (m35994.getAttributeNameResource(i) == 16843376) {
                        return m35994.getAttributeIntValue(i, -1);
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m49977(C15206 c15206) {
        XmlResourceParserC10269 m35994 = c15206.m35994();
        while (true) {
            int next = m35994.next();
            if (next == 1) {
                break;
            }
            if (next == 2 && m35994.getName().equals("uses-sdk")) {
                int attributeCount = m35994.getAttributeCount();
                for (int i = 0; i < attributeCount; i++) {
                    if (m35994.getAttributeNameResource(i) == 16843276) {
                        return m35994.getAttributeIntValue(i, -1);
                    }
                }
            }
        }
        return -1;
    }
}

package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: G7AI */
/* renamed from: l.᩹ܽۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22405 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16096 f72569;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f72570;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18878 f72571;

    public C22405(C18878 c18878) {
        HashMap hashMap = new HashMap();
        this.f72570 = hashMap;
        this.f72571 = c18878;
        C14587 c14587 = c18878.f59510;
        this.f72569 = C13979.m33438(c14587);
        Iterator it = c14587.m34846().mo21936().iterator();
        while (it.hasNext()) {
            int mo12858 = ((InterfaceC4277) it.next()).mo12858();
            if (mo12858 == 1) {
                hashMap.put("android", Integer.valueOf(mo12858));
            } else if (mo12858 != 127) {
                hashMap.put(String.format(Locale.ROOT, "app%02x", Integer.valueOf(mo12858)), Integer.valueOf(mo12858));
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16096 m50281() {
        return this.f72569;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 m50278() {
        return this.f72571.f59510.m34846();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17515 m50279() {
        return this.f72571.f59510.m34848();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20289 m50280(int i, String str) {
        InterfaceC7099 m23321;
        InterfaceC21211 mo2346;
        InterfaceC7099 m233212;
        InterfaceC21211 m23323;
        m23321 = C9042.m23321(m50278(), i, str);
        if (m23321 == null) {
            return null;
        }
        int i2 = 65535 & i;
        if (!m23321.mo2347(i2) || (mo2346 = m23321.mo2346(i2)) == null) {
            return null;
        }
        C18878 c18878 = this.f72571;
        m233212 = C9042.m23321(c18878.f59509, i, str);
        InterfaceC21211 mo23462 = m233212 != null ? m233212.mo2346(i2) : null;
        m23323 = C9042.m23323(c18878, m23321, mo2346);
        return new C20289(i, str, m23321, mo23462, m23323);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50277(int i) {
        return m50274(i, m50278());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50276(String str) {
        int intValue = ((Integer) C13843.getOrDefault(this.f72570, str, -1)).intValue();
        if (intValue == -1 && "android".equals(str)) {
            return 1;
        }
        return intValue;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50275(int i, String str) {
        String str2;
        String[] split = str.split(":", 2);
        if (split.length == 2) {
            String str3 = split[0];
            String str4 = split[1];
            str2 = str3;
            str = str4;
        } else {
            str2 = null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            String substring2 = str.substring(indexOf + 1);
            if (str2 == null || str2.isEmpty() || (i = m50276(str2)) != -1) {
                int m50273 = m50273(m50278(), i, substring, substring2);
                return (m50273 == -1 && i == 1) ? m50273(C11166.m27700(), i, substring, substring2) : m50273;
            }
        }
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50274(int i, InterfaceC9922 interfaceC9922) {
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i2) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.mo2870() == i3) {
                        return C2692.m8425(interfaceC0748.getTypeName());
                    }
                }
            }
        }
        if (i2 != 1 || C12534.m30761(interfaceC9922)) {
            return null;
        }
        return m50274(i, C11166.m27700());
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0008, code lost:
    
        continue;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m50273(l.InterfaceC9922 r5, int r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.Iterable r5 = r5.mo21936()
            java.util.Iterator r5 = r5.iterator()
        L8:
            boolean r0 = r5.hasNext()
            r1 = -1
            if (r0 == 0) goto L56
            java.lang.Object r0 = r5.next()
            l.ۘ᩻ܽ r0 = (l.InterfaceC4277) r0
            if (r6 == r1) goto L1d
            int r2 = r0.mo12858()
            if (r2 != r6) goto L8
        L1d:
            java.lang.Iterable r2 = r0.mo12850()
            java.util.Iterator r2 = r2.iterator()
        L25:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8
            java.lang.Object r3 = r2.next()
            l.֡᩻ܽ r3 = (l.InterfaceC0748) r3
            java.lang.String r4 = r3.getTypeName()
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L25
            l.ۛۤᩳ r2 = new l.ۛۤᩳ
            r4 = 4
            r2.<init>(r4, r8)
            int r2 = r3.mo2867(r2)
            if (r2 == r1) goto L8
            int r5 = r0.mo12858()
            int r5 = r5 << 24
            int r6 = r3.mo2870()
            int r6 = r6 << 16
            r5 = r5 | r6
            r5 = r5 | r2
            return r5
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22405.m50273(l.ۢ᩻ܽ, int, java.lang.String, java.lang.String):int");
    }
}

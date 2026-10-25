package l;

import java.io.InputStream;

/* compiled from: 21YS */
/* renamed from: l.᩸ܶܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21665 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f69521 = {".jpg", ".jpeg", ".png", ".gif", ".wav", ".mp2", ".mp3", ".ogg", ".aac", ".mpg", ".mpeg", ".mid", ".midi", ".smf", ".jet", ".rtttl", ".imy", ".xmf", ".mp4", ".m4a", ".m4v", ".3gp", ".3gpp", ".3g2", ".3gpp2", ".amr", ".awb", ".wma", ".wmv", ".apk", ".zip", ".jar", ".xz"};

    /* JADX WARN: Removed duplicated region for block: B:7:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0056 A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int m48934(java.lang.String r3, l.C15313 r4) {
        /*
            java.lang.String r3 = r3.toLowerCase()
            boolean r0 = r4.f46967
            r1 = 0
            if (r0 == 0) goto L16
            java.lang.String r0 = r3.toLowerCase()
            java.lang.String r2 = "lib/"
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L16
            goto L4c
        L16:
            boolean r0 = r4.f46966
            if (r0 == 0) goto L27
            java.lang.String r0 = r3.toLowerCase()
            java.lang.String r2 = ".dex"
            boolean r0 = r0.endsWith(r2)
            if (r0 == 0) goto L27
            goto L4c
        L27:
            java.lang.String r0 = "assets/dexopt/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L30
            goto L4c
        L30:
            java.lang.String r0 = "resources.arsc"
            boolean r0 = r3.equals(r0)
            r2 = 1
            if (r0 == 0) goto L3d
            boolean r3 = r4.f46965
            r2 = r2 ^ r3
            goto L51
        L3d:
            r4 = 0
        L3e:
            r0 = 33
            if (r4 >= r0) goto L51
            java.lang.String[] r0 = l.C21665.f69521
            r0 = r0[r4]
            boolean r0 = r3.endsWith(r0)
            if (r0 == 0) goto L4e
        L4c:
            r2 = 0
            goto L51
        L4e:
            int r4 = r4 + 1
            goto L3e
        L51:
            if (r2 == 0) goto L56
            r3 = 8
            return r3
        L56:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21665.m48934(java.lang.String, l.ܶܶܽ):int");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m48937(C3545 c3545, C15313 c15313) {
        String name = c3545.getName();
        return ((c15313.f46967 && name.toLowerCase().startsWith("lib/")) || (c15313.f46966 && name.toLowerCase().endsWith(".dex"))) && c3545.m10767() != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48936(C18090 c18090, C8918 c8918, C3545 c3545, C15313 c15313, InterfaceC1393 interfaceC1393) {
        if (!m48937(c3545, c15313)) {
            if (interfaceC1393 == null) {
                c8918.m23014(c3545, c18090);
                return;
            } else {
                c8918.m23015(c3545, c18090, interfaceC1393);
                return;
            }
        }
        int m23022 = c8918.m23022();
        try {
            c8918.m23018(0);
            c8918.m23013(c3545);
            InputStream m42189 = c18090.m42189(c3545);
            try {
                byte[] bArr = new byte[8192];
                long j = 0;
                while (true) {
                    int read = m42189.read(bArr);
                    if (read != -1) {
                        c8918.write(bArr, 0, read);
                        long j2 = read;
                        long j3 = j + j2;
                        if (interfaceC1393 != null) {
                            interfaceC1393.mo1647(j2, j3, c3545.getSize());
                            if (interfaceC1393.mo1526()) {
                                m42189.close();
                                return;
                            }
                        }
                        j = j3;
                    } else {
                        m42189.close();
                        c8918.m23023();
                        return;
                    }
                }
            } finally {
            }
        } finally {
            c8918.m23018(m23022);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m48935(C3545 c3545, C15313 c15313) {
        return m48937(c3545, c15313) ? c3545.getSize() : c3545.m10793();
    }
}

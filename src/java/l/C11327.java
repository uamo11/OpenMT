package l;

import java.util.HashMap;

/* compiled from: E43E */
/* renamed from: l.ۧ᩻۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11327 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC2029 f33897;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C8526 f33899;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18837 f33898 = new C18837();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f33900 = new HashMap();

    public C11327(C8526 c8526, InterfaceC2029 interfaceC2029) {
        this.f33899 = c8526;
        this.f33897 = interfaceC2029;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27979(Object obj, int i, int i2, int i3) {
        C13875 c13875 = new C13875();
        c13875.f41360 = obj;
        c13875.f41358 = i;
        c13875.f41359 = i2;
        c13875.f41357 = i3;
        this.f33898.m43511(c13875);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27978(C14896 c14896, InterfaceC13896 interfaceC13896, C22364 c22364) {
        int m27975;
        int m279752;
        new C7526(this).m20168(this.f33899);
        int i = 0;
        for (C2609 m43517 = this.f33898.m43517(); m43517.m8249(); m43517 = m43517.f8241) {
            C13875 c13875 = (C13875) m43517.f8240;
            int i2 = c13875.f41359;
            int i3 = c13875.f41357;
            if (i2 != i3) {
                C2154 c2154 = (C2154) this.f33900.get(c13875.f41360);
                if (c2154 != null) {
                    int i4 = c2154.f7136;
                    if (i4 != -1 && c2154.f7135 != -1 && (m27975 = m27975(i4, interfaceC13896, c22364)) != -1 && (m279752 = m27975(c2154.f7135, interfaceC13896, c22364)) != -1) {
                        c14896.m35351(c13875.f41359);
                        c14896.m35351(i3 - 1);
                        c14896.m35352(m27975);
                        c14896.m35352(m279752);
                        c14896.m35351(c13875.f41358);
                        i++;
                    }
                } else {
                    C12171.m29640("CRT: tree source positions are undefined");
                    throw null;
                }
            }
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27975(int i, InterfaceC13896 interfaceC13896, C22364 c22364) {
        int mo20264 = interfaceC13896.mo20264(i);
        int mo6871 = interfaceC13896.mo6871(i);
        if (mo20264 < 1) {
            throw new IllegalArgumentException("line must be greater than 0");
        }
        if (mo6871 < 1) {
            throw new IllegalArgumentException("column must be greater than 0");
        }
        int i2 = (mo20264 > 4194303 || mo6871 > 1023) ? -1 : (mo20264 << 10) + mo6871;
        if (i2 == -1) {
            C11076 c11076 = C14001.f42334;
            c22364.m7268(i, new C11076("compiler", "position.overflow", Integer.valueOf(mo20264)));
        }
        return i2;
    }
}

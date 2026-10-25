package l;

import java.io.InputStream;

/* compiled from: Q7KW */
/* renamed from: l.ۖۢ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2446 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7799;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C14896 f7800 = new C14896(65520);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C20085 f7801;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m7892(InputStream inputStream) {
        this.f7799 = 0;
        C14896 c14896 = this.f7800;
        c14896.f45449 = 0;
        c14896.m35350(inputStream);
        int m35353 = c14896.m35353(this.f7799);
        this.f7799 += 4;
        if (m35353 != -889275714) {
            throw new C15850("illegal.start.of.class.file");
        }
        m7891();
        char m7891 = m7891();
        if (m7891 < '5') {
            throw new C15850(C19370.m44628(m7891, "bad major version number for module: "));
        }
        C20085 c20085 = new C20085(null, c14896, null, null);
        this.f7801 = c20085;
        this.f7799 = c20085.m46278(c14896, this.f7799);
        char m78912 = m7891();
        if (m78912 != 32768) {
            throw new C15850(C13540.m32584(new StringBuilder("invalid access flags for module: 0x"), m78912));
        }
        m7891();
        m7890(m7891(), "super_class");
        m7890(m7891(), "interface_count");
        m7890(m7891(), "fields_count");
        m7890(m7891(), "methods_count");
        char m78913 = m7891();
        for (int i = 0; i < m78913; i++) {
            char m78914 = m7891();
            int m353532 = c14896.m35353(this.f7799);
            this.f7799 += 4;
            if (((String) this.f7801.m46284(m78914, new C9005())).equals("Module") && m353532 > 2) {
                return (String) this.f7801.m46282(m7891(), new C20177());
            }
            this.f7799 += m353532;
        }
        throw new C15850("no Module attribute");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7890(int i, String str) {
        if (i == 0) {
            return;
        }
        throw new C15850("invalid " + str + " for module: " + i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m7891() {
        char m35354 = this.f7800.m35354(this.f7799);
        this.f7799 += 2;
        return m35354;
    }
}

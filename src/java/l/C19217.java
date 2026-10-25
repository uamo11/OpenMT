package l;

import java.io.EOFException;

/* compiled from: 48MG */
/* renamed from: l.᩵ۘۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19217 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f60511;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f60512;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f60514;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f60515;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f60517;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f60516 = new int[255];

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17714 f60513 = new C17714(255);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44336(InterfaceC8424 interfaceC8424, boolean z) {
        boolean z2;
        boolean z3;
        this.f60517 = 0;
        this.f60512 = 0L;
        this.f60515 = 0;
        this.f60514 = 0;
        this.f60511 = 0;
        C17714 c17714 = this.f60513;
        c17714.m41481(27);
        try {
            z2 = interfaceC8424.mo22068(z, 0, 27, c17714.m41482());
        } catch (EOFException e) {
            if (!z) {
                throw e;
            }
            z2 = false;
        }
        if (z2 && c17714.m41479() == 1332176723) {
            if (c17714.m41456() == 0) {
                this.f60517 = c17714.m41456();
                this.f60512 = c17714.m41471();
                c17714.m41480();
                c17714.m41480();
                c17714.m41480();
                int m41456 = c17714.m41456();
                this.f60515 = m41456;
                this.f60514 = m41456 + 27;
                c17714.m41481(m41456);
                try {
                    z3 = interfaceC8424.mo22068(z, 0, this.f60515, c17714.m41482());
                } catch (EOFException e2) {
                    if (!z) {
                        throw e2;
                    }
                    z3 = false;
                }
                if (z3) {
                    for (int i = 0; i < this.f60515; i++) {
                        int m414562 = c17714.m41456();
                        this.f60516[i] = m414562;
                        this.f60511 += m414562;
                    }
                    return true;
                }
            } else if (!z) {
                throw C9080.m23441("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m44335(InterfaceC8424 interfaceC8424, long j) {
        boolean z;
        C22632.m50631(interfaceC8424.getPosition() == interfaceC8424.mo22069());
        C17714 c17714 = this.f60513;
        c17714.m41481(4);
        while (true) {
            if (j != -1 && interfaceC8424.getPosition() + 4 >= j) {
                break;
            }
            try {
                z = interfaceC8424.mo22068(true, 0, 4, c17714.m41482());
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            c17714.m41484(0);
            if (c17714.m41479() == 1332176723) {
                interfaceC8424.mo22066();
                return true;
            }
            interfaceC8424.mo22070(1);
        }
        do {
            if (j != -1 && interfaceC8424.getPosition() >= j) {
                break;
            }
        } while (interfaceC8424.mo22064(1) != -1);
        return false;
    }
}

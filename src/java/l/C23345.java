package l;

import java.util.List;

/* compiled from: K8IZ */
/* renamed from: l.᩻֡ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23345 implements InterfaceC1368 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f75002;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17714 f75003;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C16302 f75004;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C17714 f75005;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f75006;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f75007;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f75008;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f75009;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f75010;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f75011;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C6412 f75012;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f75013;

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    public C23345(int i) {
        this.f75010 = (i & 2) != 0 ? i | 1 : i;
        this.f75012 = new C6412(null, 0, "audio/mp4a-latm", true);
        this.f75003 = new C17714(2048);
        this.f75002 = -1;
        this.f75009 = -1L;
        C17714 c17714 = new C17714(10);
        this.f75005 = c17714;
        byte[] m41482 = c17714.m41482();
        this.f75004 = new C16302(m41482, m41482.length);
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        int m51760 = m51760(interfaceC8424);
        int i = 0;
        int i2 = 0;
        int i3 = m51760;
        do {
            C17714 c17714 = this.f75005;
            C16184 c16184 = (C16184) interfaceC8424;
            c16184.mo22068(false, 0, 2, c17714.m41482());
            c17714.m41484(0);
            if ((c17714.m41464() & 65526) == 65520) {
                i++;
                if (i >= 4 && i2 > 188) {
                    return true;
                }
                c16184.mo22068(false, 0, 4, c17714.m41482());
                C16302 c16302 = this.f75004;
                c16302.m38354(14);
                int m38343 = c16302.m38343(13);
                if (m38343 > 6) {
                    c16184.mo22067(m38343 - 6, false);
                    i2 += m38343;
                } else {
                    i3++;
                    c16184.mo22066();
                }
            } else {
                i3++;
                c16184.mo22066();
            }
            c16184.mo22067(i3, false);
            i = 0;
            i2 = 0;
        } while (i3 - m51760 < 8192);
        return false;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f75006 = interfaceC21830;
        this.f75012.mo1003(interfaceC21830, new C19259(0, 1));
        interfaceC21830.mo3431();
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f75008 = false;
        this.f75012.mo1000();
        this.f75011 = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x012c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012d  */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo4837(l.InterfaceC8424 r19, l.C23615 r20) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23345.mo4837(l.۠᩷ۧ, l.᩻ۢۧ):int");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m51760(InterfaceC8424 interfaceC8424) {
        int i = 0;
        while (true) {
            C17714 c17714 = this.f75005;
            interfaceC8424.mo22061(0, 10, c17714.m41482());
            c17714.m41484(0);
            if (c17714.m41491() != 4801587) {
                break;
            }
            c17714.m41478(3);
            int m41467 = c17714.m41467();
            i += m41467 + 10;
            interfaceC8424.mo22060(m41467);
        }
        interfaceC8424.mo22066();
        interfaceC8424.mo22060(i);
        if (this.f75009 == -1) {
            this.f75009 = i;
        }
        return i;
    }
}

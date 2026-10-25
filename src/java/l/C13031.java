package l;

import java.util.List;

/* compiled from: U8NM */
/* renamed from: l.۬ۢۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13031 implements InterfaceC1368 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12326 f39004;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C17714 f39005;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f39006;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f39007;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f39008;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f39009;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3154 f39010;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f39011;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f39012;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C5976[] f39013;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f39014;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5976 f39015;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f39016;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C10045 f39017;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f39018;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f39019;

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

    public C13031(int i, C10045 c10045) {
        this.f39017 = c10045;
        this.f39008 = (i & 1) == 0;
        this.f39005 = new C17714(12);
        this.f39010 = new C3154();
        this.f39011 = new C22412();
        this.f39013 = new C5976[0];
        this.f39009 = -1L;
        this.f39018 = -1L;
        this.f39019 = -1;
        this.f39014 = -9223372036854775807L;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f39016 = 0;
        if (this.f39008) {
            interfaceC21830 = new C9067(interfaceC21830, this.f39017);
        }
        this.f39011 = interfaceC21830;
        this.f39012 = -1L;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        C17714 c17714 = this.f39005;
        interfaceC8424.mo22061(0, 12, c17714.m41482());
        c17714.m41484(0);
        if (c17714.m41490() == 1179011410) {
            c17714.m41478(4);
            if (c17714.m41490() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f39012 = -1L;
        this.f39015 = null;
        for (C5976 c5976 : this.f39013) {
            c5976.m16767(j);
        }
        if (j == 0) {
            if (this.f39013.length == 0) {
                this.f39016 = 0;
                return;
            } else {
                this.f39016 = 3;
                return;
            }
        }
        this.f39016 = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0313  */
    @Override // l.InterfaceC1368
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo4837(l.InterfaceC8424 r19, l.C23615 r20) {
        /*
            Method dump skipped, instructions count: 982
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13031.mo4837(l.۠᩷ۧ, l.᩻ۢۧ):int");
    }
}

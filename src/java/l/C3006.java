package l;

import android.net.Uri;

/* compiled from: N74D */
/* renamed from: l.ۗۙۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3006 implements InterfaceC17379 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C19063 f9471;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12883 f9472;

    public C3006(C12883 c12883, C19063 c19063) {
        this.f9472 = c12883;
        this.f9471 = c19063;
    }

    @Override // l.InterfaceC17379
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9176(Uri uri, C8134 c8134, InterfaceC18085 interfaceC18085) {
        this.f9471.mo9176(uri, c8134, new C13834(this, interfaceC18085));
    }

    @Override // l.InterfaceC17379
    public final void stop() {
        C19130 c19130;
        C12883 c12883 = this.f9472;
        try {
            this.f9471.stop();
        } finally {
            c19130 = c12883.f38679;
            c19130.m44181();
        }
    }

    @Override // l.InterfaceC17379
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo9181(InterfaceC1857 interfaceC1857) {
        this.f9471.mo9181(interfaceC1857);
    }

    @Override // l.InterfaceC17379
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9177(InterfaceC1857 interfaceC1857) {
        this.f9471.mo9177(interfaceC1857);
    }

    @Override // l.InterfaceC17379
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12712 mo9179() {
        return this.f9471.mo9179();
    }

    @Override // l.InterfaceC17379
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4951 mo9174(Uri uri, boolean z) {
        C14895 c14895;
        C19130 c19130;
        C4951 mo9174 = this.f9471.mo9174(uri, z);
        C12883 c12883 = this.f9472;
        c14895 = c12883.f38680;
        if (c14895 != null) {
            c14895.m35342(mo9174);
        }
        c19130 = c12883.f38679;
        c19130.m44182(uri, mo9174);
        return mo9174;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9172(C3006 c3006, InterfaceC18085 interfaceC18085, C4951 c4951) {
        C14895 c14895;
        C14895 c148952;
        C19130 c19130;
        C12883 c12883 = c3006.f9472;
        c14895 = c12883.f38680;
        if (c14895 != null) {
            c14895.m35342(c4951);
        }
        C19063 c19063 = c3006.f9471;
        C12712 mo9179 = c19063.mo9179();
        if (mo9179 != null) {
            for (C13417 c13417 : mo9179.f38258) {
                C4951 mo9174 = c19063.mo9174(c13417.f40105, false);
                c148952 = c12883.f38680;
                if (c148952 != null) {
                    c148952.m35342(mo9174);
                }
                c19130 = c12883.f38679;
                c19130.m44182(c13417.f40105, mo9174);
            }
        }
        interfaceC18085.mo16872(c4951);
    }

    @Override // l.InterfaceC17379
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long mo9173() {
        return this.f9471.mo9173();
    }

    @Override // l.InterfaceC17379
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean mo9185(Uri uri) {
        return this.f9471.mo9185(uri);
    }

    @Override // l.InterfaceC17379
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo9184() {
        this.f9471.mo9184();
    }

    @Override // l.InterfaceC17379
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo9180(Uri uri) {
        this.f9471.mo9180(uri);
    }

    @Override // l.InterfaceC17379
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo9178(Uri uri, long j) {
        return this.f9471.mo9178(uri, j);
    }

    @Override // l.InterfaceC17379
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo9182(Uri uri) {
        this.f9471.mo9182(uri);
    }

    @Override // l.InterfaceC17379
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo9183() {
        return this.f9471.mo9183();
    }

    @Override // l.InterfaceC17379
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo9175(Uri uri) {
        this.f9471.mo9175(uri);
    }
}

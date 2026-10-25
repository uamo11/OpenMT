package l;

import java.io.IOException;

/* compiled from: 51FV */
/* renamed from: l.ᩴۨ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18746 implements InterfaceC1438 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19452 f59246;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0732 f59247;

    public C18746(C19452 c19452, C0732 c0732) {
        this.f59246 = c19452;
        C11003.requireNonNull(c0732);
        this.f59247 = c0732;
    }

    @Override // l.InterfaceC1438
    public final String getPath() {
        return this.f59247.f2758;
    }

    @Override // l.InterfaceC1438
    /* renamed from: ֫ */
    public final String mo4946() {
        try {
            return C19452.m44793(this.f59247);
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19220 m43396() {
        byte[] m28420;
        C11005 m44808;
        C19220 m44810;
        C0732 c0732 = this.f59247;
        C11005 c11005 = c0732.f2760;
        if (c11005 == null) {
            C11005 c110052 = c0732.f2765;
            C11003.requireNonNull(c110052);
            C11541 c11541 = new C11541(c110052.m27340());
            try {
                c11541.seek(c0732.f2764);
                if (c0732.f2759) {
                    byte[] m284202 = c11541.m28420();
                    m28420 = C3878.m11708(m284202, m284202.length);
                } else {
                    m28420 = c11541.m28420();
                }
                c11541.close();
                return C19220.m44341(new C12951(m28420));
            } catch (Throwable th) {
                try {
                    c11541.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m44808 = this.f59246.m44808(c11005);
        m44810 = C19452.m44810(c11005, m44808);
        return m44810 != null ? m44810 : C19452.m44798(m44808);
    }

    @Override // l.InterfaceC1438
    /* renamed from: ֫ */
    public final void mo4947(String str) {
        C5242 c5242;
        C19452 c19452 = this.f59246;
        try {
            c19452.m44823(this.f59247, str);
        } catch (Exception e) {
            c5242 = c19452.f62916;
            c5242.mo1664(e);
        }
    }
}

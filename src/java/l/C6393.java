package l;

import com.umeng.analytics.pro.d;

/* compiled from: 54WU */
/* renamed from: l.ۛ᩻ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6393 extends AbstractC6932 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f19783;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object f19784;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f19785;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C10630 f19786;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f19787;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5419 f19788;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f19789;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3074 f19790;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6393(C23535 c23535, C5896 c5896, C1993 c1993) {
        super(c23535);
        int i = c1993.f6675;
        this.f19786 = new C10630();
        this.f19788 = new C5419();
        this.f19784 = new Object();
        this.f19790 = c5896.f18106;
        int m16531 = c5896.m16531();
        c5896.m16536(2);
        int i2 = 0;
        boolean z = (m16531 & 1) != 0;
        this.f19787 = z;
        boolean z2 = (m16531 & 2) != 0;
        this.f19785 = z2;
        int m16535 = c5896.m16535();
        this.f19783 = c5896.m16535() + i;
        this.f21394 = C21707.m49000(c5896, ((C23535) super.getType()).mo2874().mo12848());
        c5896.m16533(i + c1993.f6674);
        int i3 = -1;
        if (z) {
            while (i2 < m16535) {
                int m16537 = c5896.m16537();
                this.f19786.mo23658(m16537, c5896.m16537() * 4);
                if (m16537 > i3) {
                    i3 = m16537;
                }
                i2++;
            }
            this.f19789 = i3;
            return;
        }
        if (z2) {
            while (i2 < m16535) {
                int m165372 = c5896.m16537();
                if (m165372 != 65535) {
                    this.f19786.mo23658(i2, m165372 * 4);
                }
                i2++;
            }
            this.f19789 = m16535 - 1;
            return;
        }
        while (i2 < m16535) {
            int m165352 = c5896.m16535();
            if (m165352 != -1) {
                this.f19786.mo23658(i2, m165352);
            }
            i2++;
        }
        this.f19789 = m16535 - 1;
    }

    @Override // l.InterfaceC7099
    /* renamed from: ֨ */
    public final int mo2344() {
        return this.f19789;
    }

    @Override // l.InterfaceC7099
    /* renamed from: ۧ */
    public final InterfaceC21211 mo2346(int i) {
        int i2;
        int m26664 = this.f19786.m26664(i);
        if (m26664 == -1 || (i2 = m26664 + this.f19783) < 0) {
            return null;
        }
        C3074 c3074 = this.f19790;
        if (c3074.m9393(i2) < 8) {
            return null;
        }
        C5896 m9403 = c3074.m9403(i2);
        C12038 c12038 = new C12038(this, i, m9403);
        c3074.m9395(m9403);
        return c12038;
    }

    @Override // l.InterfaceC7099
    /* renamed from: ܺ */
    public final boolean mo2347(int i) {
        int i2;
        boolean z;
        int m26664 = this.f19786.m26664(i);
        if (m26664 == -1 || (i2 = this.f19783 + m26664) < 0 || this.f19790.m9393(i2) < 8) {
            return false;
        }
        synchronized (this.f19784) {
            byte m15512 = this.f19788.m15512(i);
            if (m15512 == 0) {
                C5896 m9403 = this.f19790.m9403(i2);
                m15512 = C12038.m29403(m9403, (C17891) super.mo8396()) ? (byte) 1 : (byte) 2;
                this.f19790.m9395(m9403);
                this.f19788.mo15508(m15512, i);
            }
            z = m15512 == 1;
        }
        return z;
    }

    @Override // l.InterfaceC7099
    /* renamed from: ܽ */
    public final String mo2348(int i) {
        int m9400;
        int m26664 = this.f19786.m26664(i);
        if (m26664 == -1) {
            return null;
        }
        int i2 = this.f19783 + m26664;
        C3074 c3074 = this.f19790;
        if ((c3074.m9402(i2 + 2) & 8) != 0) {
            m9400 = c3074.m9399(i2);
        } else {
            m9400 = c3074.m9400(i2 + 4);
        }
        try {
            return ((C16479) ((C17891) super.mo8396()).m41858()).f50667.m47858(m9400);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.InterfaceC7099
    /* renamed from: ۚ֫ */
    public final boolean mo2345() {
        return this.f19787;
    }

    @Override // l.InterfaceC7099
    /* renamed from: ᩷ۧ */
    public final boolean mo2349() {
        return this.f19785;
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    /* renamed from: ֫ */
    public final InterfaceC9922 mo8391() {
        return (C23326) super.mo8391();
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    /* renamed from: ۧ */
    public final InterfaceC4277 mo8396() {
        return (C17891) super.mo8396();
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    public final InterfaceC0748 getType() {
        return (C23535) super.getType();
    }
}

package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;

/* compiled from: O69P */
/* renamed from: l.ۤ᩻ܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10626 extends AbstractC3073 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C20504 f31913;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C22390 f31914;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f31915;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 f31916;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C14152 f31917;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C20316 f31918;

    public C10626(C22390 c22390, C20316 c20316, boolean z, InterfaceC10711 interfaceC10711) {
        super(4, -1);
        if (c20316 == null) {
            throw new NullPointerException("code == null");
        }
        if (interfaceC10711 == null) {
            throw new NullPointerException("throwsList == null");
        }
        this.f31914 = c22390;
        this.f31918 = c20316;
        this.f31915 = z;
        this.f31916 = interfaceC10711;
        this.f31913 = null;
        this.f31917 = null;
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_CODE_ITEM;
    }

    @Override // l.AbstractC2368
    /* renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        C4484 m5614 = c1662.m5614();
        C16892 m5632 = c1662.m5632();
        C20316 c20316 = this.f31918;
        if (c20316.m46605() || c20316.m46599()) {
            C14152 c14152 = new C14152(c20316, this.f31915, this.f31914);
            this.f31917 = c14152;
            m5614.m13220((AbstractC3073) c14152);
        }
        if (c20316.m46606()) {
            Iterator it = c20316.m46597().iterator();
            while (it.hasNext()) {
                m5632.m39751((C7573) it.next());
            }
            this.f31913 = new C20504(c20316);
        }
        Iterator it2 = c20316.m46602().iterator();
        while (it2.hasNext()) {
            c1662.m5625((AbstractC13717) it2.next());
        }
    }

    public final String toString() {
        return "CodeItem{" + this.f31914.mo2463() + l.d;
    }

    @Override // l.AbstractC3073
    /* renamed from: ۢ */
    public final String mo2864() {
        return this.f31914.mo2463();
    }

    @Override // l.AbstractC3073
    /* renamed from: ۧ */
    public final void mo2866(C4484 c4484, int i) {
        int i2;
        C1662 m16521 = c4484.m16521();
        C12742 c12742 = new C12742(m16521);
        C20316 c20316 = this.f31918;
        c20316.m46598(c12742);
        C20504 c20504 = this.f31913;
        if (c20504 != null) {
            c20504.m46977(m16521);
            i2 = this.f31913.m46979();
        } else {
            i2 = 0;
        }
        int m10315 = c20316.m46604().m10315();
        if ((m10315 & 1) != 0) {
            m10315++;
        }
        m9389((m10315 * 2) + 16 + i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0143  */
    @Override // l.AbstractC3073
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2865(l.C1662 r19, l.C18241 r20) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C10626.mo2865(l.֫ۜܺ, l.ᩳᩴܺ):void");
    }
}

package l;

import com.umeng.analytics.pro.d;

/* compiled from: 54WU */
/* renamed from: l.ۡۜܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C8719 extends AbstractC6932 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f26533;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26534;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f26535;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C10630 f26536;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f26537;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5419 f26538;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f26539;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C3074 f26540;

    static {
        ApplicationC12518.m30701(81);
    }

    public native C8719(C19303 c19303, C5896 c5896, C1993 c1993, C9327 c9327);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public native void m22522(C20616 c20616);

    @Override // l.InterfaceC7099
    /* renamed from: ֨ */
    public final int mo2344() {
        return this.f26533;
    }

    @Override // l.InterfaceC7099
    /* renamed from: ۧ */
    public final InterfaceC21211 mo2346(int i) {
        int i2;
        int m26664 = this.f26536.m26664(i);
        if (m26664 == -1 || (i2 = m26664 + this.f26534) < 0) {
            return null;
        }
        C3074 c3074 = this.f26540;
        if (c3074.m9393(i2) < 8) {
            return null;
        }
        C5896 m9403 = c3074.m9403(i2);
        C15773 c15773 = new C15773(this, i, m9403);
        c3074.m9395(m9403);
        return c15773;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r5 < ((l.C3780) r6.m43134()).f11945.size()) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007e, code lost:
    
        if (r5 == (-1)) goto L57;
     */
    @Override // l.InterfaceC7099
    /* renamed from: ܺ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo2347(int r14) {
        /*
            r13 = this;
            l.ۤ᩻ᩴ r0 = r13.f26536
            int r0 = r0.m26664(r14)
            r1 = 0
            r2 = -1
            if (r0 == r2) goto Ld8
            int r3 = r13.f26534
            int r0 = r0 + r3
            if (r0 < 0) goto Ld8
            l.ۗۜܽ r3 = r13.f26540
            int r4 = r3.m9393(r0)
            r5 = 8
            if (r4 >= r5) goto L1b
            goto Ld8
        L1b:
            l.ۚܳᩴ r4 = r13.f26538
            byte r6 = r4.m15512(r14)
            r7 = 1
            if (r6 != 0) goto Ld5
            l.ۛۜܽ r0 = r3.m9403(r0)
            l.ۘ᩻ܽ r6 = super.mo8396()
            l.ᩴۜܽ r6 = (l.C18597) r6
            int r8 = r0.m16525()
            r9 = 2
            if (r8 >= r5) goto L37
            goto Lcd
        L37:
            int r5 = r0.m16537()
            short r8 = r0.m16534()
            int r10 = r0.m16535()
            r11 = r8 & 8
            if (r11 == 0) goto L49
            r11 = 1
            goto L4a
        L49:
            r11 = 0
        L4a:
            r8 = r8 & r7
            if (r8 == 0) goto L4f
            r8 = 1
            goto L50
        L4f:
            r8 = 0
        L50:
            if (r11 == 0) goto L64
            if (r5 < 0) goto Lcd
            java.util.List r2 = r6.m43134()
            l.ۘۜܽ r2 = (l.C3780) r2
            l.֨ۜܽ r2 = r2.f11945
            int r2 = r2.size()
            if (r5 >= r2) goto Lcd
            goto Lca
        L64:
            if (r10 < 0) goto Lcd
            java.util.List r5 = r6.m43134()
            l.ۘۜܽ r5 = (l.C3780) r5
            l.֨ۜܽ r5 = r5.f11945
            int r5 = r5.size()
            if (r10 < r5) goto L75
            goto Lcd
        L75:
            if (r8 == 0) goto L81
            r0.m16528()
            int r5 = r0.m16535()
            if (r5 != r2) goto L82
            goto Lcd
        L81:
            r5 = 1
        L82:
            if (r8 == 0) goto L8d
            int r2 = r0.m16525()
            int r10 = r5 * 12
            if (r2 >= r10) goto L96
            goto Lcd
        L8d:
            int r2 = r0.m16525()
            int r10 = r5 * 8
            if (r2 >= r10) goto L96
            goto Lcd
        L96:
            l.ۚۜܽ r2 = r6.mo12847()
            l.ۢۜܽ r2 = r2.mo14959()
            int r2 = r2.size()
            r6 = 0
        La3:
            if (r6 >= r5) goto Lca
            if (r8 == 0) goto Laa
            r0.m16528()
        Laa:
            r0.m16536(r9)
            r0.m16532()
            byte r10 = r0.m16532()
            int r11 = r0.m16535()
            boolean r12 = l.C5688.m16005(r10)
            if (r12 != 0) goto Lbf
            goto Lcd
        Lbf:
            r12 = 3
            if (r10 != r12) goto Lc7
            if (r11 < 0) goto Lcd
            if (r11 < r2) goto Lc7
            goto Lcd
        Lc7:
            int r6 = r6 + 1
            goto La3
        Lca:
            r2 = 1
            r6 = 1
            goto Lcf
        Lcd:
            r2 = 2
            r6 = 2
        Lcf:
            r3.m9395(r0)
            r4.mo15508(r6, r14)
        Ld5:
            if (r6 != r7) goto Ld8
            return r7
        Ld8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8719.mo2347(int):boolean");
    }

    @Override // l.InterfaceC7099
    /* renamed from: ܽ */
    public final String mo2348(int i) {
        int m9400;
        int m26664 = this.f26536.m26664(i);
        if (m26664 == -1) {
            return null;
        }
        int i2 = this.f26534 + m26664;
        C3074 c3074 = this.f26540;
        if ((c3074.m9402(i2 + 2) & 8) != 0) {
            m9400 = c3074.m9399(i2);
        } else {
            m9400 = c3074.m9400(i2 + 4);
        }
        try {
            return ((C3780) ((C18597) super.mo8396()).m43134()).f11945.m47858(m9400);
        } catch (IndexOutOfBoundsException unused) {
            return d.O;
        }
    }

    @Override // l.InterfaceC7099
    /* renamed from: ۚ֫ */
    public final boolean mo2345() {
        return this.f26537;
    }

    @Override // l.InterfaceC7099
    /* renamed from: ᩷ۧ */
    public final boolean mo2349() {
        return this.f26535;
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    /* renamed from: ֫ */
    public final InterfaceC9922 mo8391() {
        return (C5191) super.mo8391();
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    /* renamed from: ۧ */
    public final InterfaceC4277 mo8396() {
        return (C18597) super.mo8396();
    }

    @Override // l.AbstractC6932, l.InterfaceC7099
    public final InterfaceC0748 getType() {
        return (C19303) super.getType();
    }
}

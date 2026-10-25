package l;

import android.view.MotionEvent;

/* compiled from: X68P */
/* renamed from: l.ۘۨᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3926 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f12514;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f12515;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC3179 f12516;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f12517;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f12518;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f12519;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC3179 f12520;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f12521;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public volatile C4631 f12522;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7785 f12523;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f12524;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C18743 f12525;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f12526;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f12527;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile boolean f12528;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f12529;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C14986 f12530;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f12531;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f12532;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C7744 f12533;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12534;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3096 f12535;

    public C3926(C12392 c12392, InterfaceC7785 interfaceC7785, AbstractC3179 abstractC3179) {
        this.f12514 = c12392;
        this.f12523 = interfaceC7785;
        this.f12516 = abstractC3179;
        this.f12520 = abstractC3179;
        this.f12530 = C14986.m35494(abstractC3179.m9782(), new C7931[0]);
        this.f12529 = abstractC3179.m9781();
        this.f12517 = c12392.m30413();
        this.f12525 = abstractC3179.f10018;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11967(int i, int i2, int i3, int i4) {
        if (i2 == 0 && i3 == 0) {
            return;
        }
        int mo26548 = this.f12523.mo26548();
        if (this.f12530 != null && this.f12529 == i4 && mo26548 == i4 + 1 && r1.m35509() == (this.f12523.length() - i3) + i2) {
            this.f12530 = this.f12530.m35499(new C7931(i, i2 + i, i3));
        } else {
            this.f12530 = null;
        }
        this.f12529 = mo26548;
        this.f12522 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11970() {
        boolean z;
        if (this.f12528 || this.f12514.f37302 != this || this.f12514.f37322 != this.f12523) {
            return false;
        }
        z = this.f12514.f37194;
        return !z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m11971(AbstractC3179 abstractC3179) {
        C4631 c4631 = this.f12522;
        return m11970() && this.f12523.mo26548() == this.f12526 && c4631 != null && c4631.f14706 == abstractC3179 && c4631.f14705 == abstractC3179.mo8164() && c4631.f14708.m13500() == this.f12514.m30394() && abstractC3179.mo8167(c4631.f14708);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0157  */
    /* JADX WARN: Type inference failed for: r9v0, types: [l.ۡۨᩳ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [l.ۢۨᩳ] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11972() {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3926.m11972():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m11964(AbstractC3179 abstractC3179, int i) {
        if (m11970()) {
            C12392 c12392 = this.f12514;
            C22686 c22686 = c12392.f37245;
            C6870 c6870 = c12392.f37235;
            if (c22686.f73267 && c6870.m18575()) {
                long mo9778 = abstractC3179.mo9778(i, Math.max(1, c12392.m30542()));
                c6870.m18566(this.f12523, (int) (mo9778 >>> 32), (int) mo9778);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11965(C3926 c3926, C4631 c4631) {
        if (c3926.f12522 == c4631 && c3926.m11971(c4631.f14706)) {
            C12392 c12392 = c3926.f12514;
            if (c12392.f37258 != c3926.f12520) {
                return;
            }
            c12392.m30126(c4631.f14706, false);
            c3926.f12520 = c4631.f14706;
            c3926.f12514.m30123(c4631.f14708.m13501(), c4631.f14708.m13502(), false);
            c3926.f12527 = c4631.f14708.m13499();
            c4631.f14707 = true;
            c3926.f12514.f37235.m18597(c3926.f12523);
            c3926.f12514.invalidate();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11968(MotionEvent motionEvent) {
        boolean z;
        boolean m30174;
        int actionMasked = motionEvent.getActionMasked();
        C12392 c12392 = this.f12514;
        if (actionMasked == 0) {
            this.f12521 = c12392.m30379();
            this.f12519 = motionEvent.getX();
            this.f12515 = motionEvent.getY();
            return;
        }
        if (actionMasked != 2 || !this.f12521) {
            if (actionMasked != 2) {
                this.f12521 = false;
                return;
            }
            return;
        }
        int x = (int) (this.f12519 - motionEvent.getX());
        int y = (int) (this.f12515 - motionEvent.getY());
        if (m11970()) {
            m11966(x, y);
        } else if (c12392.f37302 == null) {
            InterfaceC7785 interfaceC7785 = c12392.f37322;
            InterfaceC7785 interfaceC77852 = this.f12523;
            if (interfaceC7785 == interfaceC77852) {
                z = c12392.f37194;
                if (!z && interfaceC77852.mo26548() == this.f12526 && c12392.f37258 == this.f12520) {
                    m30174 = c12392.m30174();
                    if (m30174) {
                        c12392.scrollTo(c12392.m30390(c12392.getScrollX() + x), c12392.m30521(c12392.m30408() + y));
                        c12392.invalidate();
                    }
                }
            }
        }
        this.f12519 = motionEvent.getX();
        this.f12515 = motionEvent.getY();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11966(int i, int i2) {
        C12392 c12392 = this.f12514;
        if (c12392.m30379()) {
            this.f12527 = Math.min(this.f12527, c12392.m30542());
            int m30390 = c12392.m30390(c12392.getScrollX() + i);
            int mo8152 = c12392.f37258.mo8152(c12392.m30408() + i2, this.f12527);
            if (c12392.f37258.mo8167(new C4590(m30390, mo8152, c12392.m30394(), this.f12527))) {
                if (m30390 == c12392.getScrollX() && mo8152 == c12392.m30408()) {
                    return;
                }
                this.f12524 = true;
                c12392.scrollTo(m30390, mo8152);
                c12392.invalidate();
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016c A[Catch: all -> 0x0209, TRY_LEAVE, TryCatch #2 {all -> 0x0209, blocks: (B:68:0x0168, B:70:0x016c), top: B:67:0x0168 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0175 A[DONT_GENERATE] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m11969(l.AbstractC3179 r7, java.lang.Throwable r8) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3926.m11969(l.ۗۤᩳ, java.lang.Throwable):void");
    }
}

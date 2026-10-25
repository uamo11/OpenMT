package l;

import android.view.View;

/* compiled from: 51KR */
/* renamed from: l.۟᩻ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C7800 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16475 f24098;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9170 f24099;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C12392 f24100;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C15893 f24101;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f24102;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f24103;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15545 f24104;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C6928 f24105;

    static {
        ApplicationC12518.m30701(76);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public native void mo1009();

    public C7800(C16475 c16475) {
        C15893 c15893;
        C12392 c12392;
        C15545 c15545;
        this.f24098 = c16475;
        this.f24099 = C9170.m23579(c16475.getViewLifecycleOwner());
        c15893 = c16475.f50651;
        this.f24101 = c15893;
        c12392 = c16475.f50649;
        this.f24100 = c12392;
        c15545 = c16475.f50646;
        this.f24104 = c15545;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        int i;
        C12392 c12392;
        View view;
        C15545 c15545;
        this.f24100.m30485();
        this.f24103 = true;
        C16475 c16475 = this.f24098;
        i = c16475.f50640;
        c16475.f50640 = i + 1;
        c16475.f50654 = this;
        c16475.f50647 = true;
        c16475.f50638 = false;
        c12392 = c16475.f50649;
        view = c16475.f50656;
        c12392.m30314(view, true, false);
        c16475.f50648 = false;
        c15545 = c16475.f50646;
        c15545.m36677(".java");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        AbstractC7548 abstractC7548;
        boolean z;
        C12366 c12366;
        C12392 c12392;
        C12392 c123922;
        C12392 c123923;
        C16475 c16475 = this.f24098;
        abstractC7548 = c16475.f50654;
        if (abstractC7548 == this && this.f24099.m23581()) {
            z = c16475.f50644;
            if (z) {
                C6928 c6928 = this.f24105;
                C15893 c15893 = this.f24101;
                if (c6928 != null) {
                    c15893.m37666(c6928);
                } else if (!(c15893.m37667() instanceof C21040)) {
                    c15893.m37666(new C21040());
                }
                c12366 = c16475.f50650;
                c12392 = c16475.f50649;
                c15893.mo7983(c12366, c12392.m30436());
                if (this.f24102) {
                    c123923 = c16475.f50649;
                    c123923.m30410();
                } else {
                    c123922 = c16475.f50649;
                    c123922.m30360();
                }
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        AbstractC7548 abstractC7548;
        C16475 c16475 = this.f24098;
        abstractC7548 = c16475.f50654;
        if (abstractC7548 == this && this.f24099.m23581()) {
            C16475.m38787(c16475, exc);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        AbstractC7548 abstractC7548;
        int i;
        AbstractC7548 abstractC75482;
        boolean z;
        AbstractC7548 abstractC75483;
        int i2;
        C12392 c12392;
        View view;
        boolean z2;
        C16475 c16475 = this.f24098;
        try {
            if (this.f24103) {
                this.f24100.m30439();
            }
            abstractC75482 = c16475.f50654;
            if (abstractC75482 == this && this.f24099.m23581()) {
                z = c16475.f50644;
                if (z) {
                    c12392 = c16475.f50649;
                    view = c16475.f50656;
                    z2 = c16475.f50648;
                    c12392.m30314(view, false, !z2);
                }
                if (this.f24103) {
                    i2 = c16475.f50640;
                    c16475.f50640 = i2 - 1;
                }
                abstractC75483 = c16475.f50654;
                if (abstractC75483 != this) {
                    return;
                }
            }
            C6928 c6928 = this.f24105;
            if (c6928 != null) {
                c6928.close();
            }
        } finally {
            if (this.f24103) {
                i = c16475.f50640;
                c16475.f50640 = i - 1;
            }
            abstractC7548 = c16475.f50654;
            if (abstractC7548 == this) {
                c16475.f50654 = null;
                c16475.f50647 = false;
                c16475.f50638 = true;
            }
        }
    }
}

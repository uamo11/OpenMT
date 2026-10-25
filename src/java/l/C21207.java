package l;

import android.view.View;
import bin.mt.plus.R;

/* compiled from: K14B */
/* renamed from: l.᩷᩻ۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21207 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C16376 f68336;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16266 f68337;

    public C21207(C16266 c16266) {
        this.f68337 = c16266;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        View view;
        C16266 c16266 = this.f68337;
        view = c16266.f50029;
        view.setVisibility(0);
        c16266.f50032 = true;
        c16266.f50025 = false;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C12230 c12230;
        boolean z;
        C16266 c16266 = this.f68337;
        c12230 = c16266.f50034;
        c12230.m29734();
        z = c16266.f50024;
        if (z) {
            this.f68336 = C16266.m38269(c16266);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        boolean z;
        C6499 c6499;
        C16266 c16266 = this.f68337;
        z = c16266.f50024;
        if (z) {
            c6499 = c16266.f50035;
            c6499.m17981(this.f68336);
            if (this.f68336 == null) {
                C21374.m48457(R.string.MT_Protector_res_0x7f12061a);
            }
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        boolean z;
        C3764 c3764;
        C16266 c16266 = this.f68337;
        z = c16266.f50024;
        if (z) {
            c16266.f50025 = true;
            c3764 = c16266.f50030;
            c3764.m11384((Throwable) exc);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        boolean z;
        View view;
        C16266 c16266 = this.f68337;
        z = c16266.f50024;
        if (z) {
            view = c16266.f50029;
            view.setVisibility(8);
        }
        c16266.f50032 = false;
    }
}

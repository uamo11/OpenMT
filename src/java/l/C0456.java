package l;

import bin.mt.plus.R;

/* compiled from: C5GL */
/* renamed from: l.֡ܰܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0456 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC5396 f2015;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18177 f2016;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C8218 f2017;

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
    }

    public C0456(ViewOnClickListenerC5396 viewOnClickListenerC5396, C18177 c18177, C8218 c8218) {
        this.f2015 = viewOnClickListenerC5396;
        this.f2016 = c18177;
        this.f2017 = c8218;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        this.f2017.m21770();
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C0456 c0456;
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f2015;
        c0456 = viewOnClickListenerC5396.f16788;
        if (c0456 == this) {
            viewOnClickListenerC5396.f16788 = null;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C0456 c0456;
        boolean z;
        boolean z2;
        C6807 c6807;
        C8218 c8218;
        C18802 c18802;
        ViewOnClickListenerC5396 viewOnClickListenerC5396 = this.f2015;
        c0456 = viewOnClickListenerC5396.f16788;
        if (c0456 == this) {
            z = viewOnClickListenerC5396.f16785;
            if (z) {
                return;
            }
            z2 = viewOnClickListenerC5396.f16791;
            if (z2 || viewOnClickListenerC5396.isFinishing() || viewOnClickListenerC5396.isDestroyed() || (c6807 = viewOnClickListenerC5396.f16793) == null) {
                return;
            }
            C18177 m27414 = c6807.f21109.m27414();
            C18177 c18177 = this.f2016;
            if (m27414 == c18177) {
                c8218 = viewOnClickListenerC5396.f16775;
                if (c8218 == this.f2017) {
                    c18802 = viewOnClickListenerC5396.f16790;
                    if (c18802.m43452(c18177)) {
                        return;
                    }
                    if (exc instanceof C5519) {
                        viewOnClickListenerC5396.m15399();
                    } else {
                        viewOnClickListenerC5396.m10235(R.string.MT_Protector_res_0x7f1207da);
                    }
                }
            }
        }
    }
}

package l;

import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;

/* compiled from: C9QS */
/* renamed from: l.᩶ۚ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19973 implements InterfaceC8559 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f64687 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4450 f64688;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f64689;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f64690;

    public C19973(C4450 c4450, C13621 c13621) {
        this.f64688 = c4450;
        this.f64689 = c13621.m32741();
    }

    @Override // l.InterfaceC8559
    /* renamed from: ֫ */
    public final void mo17795(int i) {
        boolean z;
        C15249 c15249;
        C15249 c152492;
        this.f64687 += i;
        C4450 c4450 = this.f64688;
        z = c4450.f14205;
        long j = this.f64689;
        if (z) {
            c4450.m11541(this.f64687, j);
            return;
        }
        c4450.m50130(this.f64687, j);
        c15249 = c4450.f14207;
        long m47713 = c15249.m47713() + this.f64687;
        c152492 = c4450.f14207;
        c4450.m11541(m47713, c152492.m47709());
    }

    @Override // l.InterfaceC8559
    /* renamed from: ۧ */
    public final void mo17796(int i) {
        boolean z;
        C15249 c15249;
        C15249 c152492;
        C15249 c152493;
        boolean z2 = this.f64690;
        C4450 c4450 = this.f64688;
        if (!z2) {
            this.f64690 = true;
            c15249 = c4450.f14207;
            if (c15249.m47716() > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f120b49));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                c152492 = c4450.f14207;
                sb.append(c152492.m47714());
                sb.append("/");
                c152493 = c4450.f14207;
                sb.append(c152493.m47716());
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                c4450.mo11546(sb.toString());
            } else {
                c4450.m11536(R.string.MT_Protector_res_0x7f120b49);
            }
        }
        z = c4450.f14205;
        if (z) {
            c4450.mo11538(i);
        } else {
            c4450.m50129(i);
        }
    }

    @Override // l.InterfaceC8559
    /* renamed from: ᩻ */
    public final boolean mo17797() {
        return this.f64688.mo1526();
    }
}

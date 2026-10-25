package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: 451O */
/* renamed from: l.ۤ᩹ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10576 extends AbstractC0634 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f31750;

    public C10576(EnumC1340 enumC1340, AbstractC8396 abstractC8396, AbstractC8396 abstractC83962, String str) {
        super(enumC1340, abstractC8396, abstractC83962);
        this.f31750 = str;
    }

    @Override // l.AbstractC0634, l.AbstractC8396
    public final AbstractC8396 clone() {
        AbstractC8396 abstractC8396 = this.f2428;
        abstractC8396.getClass();
        AbstractC8396 clone = abstractC8396.clone();
        AbstractC8396 abstractC83962 = this.f2429;
        abstractC83962.getClass();
        return new C10576(this.f25745, clone, abstractC83962.clone(), this.f31750);
    }

    @Override // l.AbstractC8396
    /* renamed from: ֫ */
    public final AbstractC8396 mo6718(C1403 c1403) {
        return new C10576(this.f25745, this.f2428.mo6718(c1403), this.f2429.mo6718(c1403), this.f31750);
    }

    @Override // l.AbstractC8396
    /* renamed from: ܳ */
    public final String mo6719() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f2428 + " " + this.f25745 + " " + this.f2429 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}

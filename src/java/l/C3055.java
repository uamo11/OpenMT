package l;

import bin.mt.plus.R;

/* compiled from: X68P */
/* renamed from: l.ۗۛᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3055 extends C21645 {

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f9602;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3055(C12392 c12392, C10817 c10817) {
        super(R.string.MT_Protector_res_0x7f1201a3, R.drawable.MT_Protector_res_0x7f0801e1, c10817);
        this.f9602 = c12392;
    }

    @Override // l.C21645, l.C22350, l.AbstractC2867
    /* renamed from: ֫ */
    public final boolean mo8780(C12392 c12392, boolean z, boolean z2, int i, int i2) {
        AbstractActivityC3346 abstractActivityC3346;
        C14630 c14630;
        C14630 c146302;
        C12392 c123922 = this.f9602;
        abstractActivityC3346 = c123922.f37205;
        if (abstractActivityC3346 == null || !z) {
            return false;
        }
        C6870 c6870 = c123922.f37235;
        c123922.f37255 = (c123922.f37245.f73267 && c6870.m18575()) ? c6870.m18588(i, i2) : null;
        c14630 = c123922.f37255;
        if (c14630 == null) {
            return false;
        }
        c146302 = c123922.f37255;
        return c146302.m34927().m49200() != null;
    }
}

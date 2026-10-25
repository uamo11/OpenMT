package l;

import com.google.android.material.textfield.IndicatorViewController;

/* compiled from: 0AST */
/* renamed from: l.ۙܳ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4697 extends AbstractC2821 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C4697 f14926 = new C4697(6);

    @Override // l.AbstractC2821
    /* renamed from: ֫ */
    public final int mo8711(Object obj) {
        C22336 c22336 = (C22336) obj;
        return c22336.f72394.hashCode() + ((((c22336.f72393.f74153 + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION) * 31) + c22336.f72390) * 31);
    }

    @Override // l.AbstractC2821
    /* renamed from: ֫ */
    public final boolean mo8715(Object obj, Object obj2) {
        C22336 c22336 = (C22336) obj;
        C22336 c223362 = (C22336) obj2;
        if (c22336 == c223362) {
            return true;
        }
        return c223362 != null && c22336.f72393.f74153 == c223362.f72393.f74153 && c22336.f72390 == c223362.f72390 && c22336.f72394.equals(c223362.f72394);
    }
}

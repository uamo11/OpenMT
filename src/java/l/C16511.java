package l;

import android.view.View;
import android.widget.ImageView;

/* compiled from: 27KL */
/* renamed from: l.ܽ۠ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16511 extends AbstractC15344 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17923 f50740;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16511(C17923 c17923) {
        super("DotsWidth");
        this.f50740 = c17923;
    }

    @Override // l.AbstractC15344
    public final float getValue(Object obj) {
        ImageView imageView;
        C11233.m27805((View) obj, "object");
        imageView = this.f50740.f54747;
        C11233.m27799((Object) imageView);
        return imageView.getLayoutParams().width;
    }

    @Override // l.AbstractC15344
    public final void setValue(Object obj, float f) {
        ImageView imageView;
        ImageView imageView2;
        C11233.m27805((View) obj, "object");
        C17923 c17923 = this.f50740;
        imageView = c17923.f54747;
        C11233.m27799((Object) imageView);
        imageView.getLayoutParams().width = (int) f;
        imageView2 = c17923.f54747;
        C11233.m27799((Object) imageView2);
        imageView2.requestLayout();
    }
}

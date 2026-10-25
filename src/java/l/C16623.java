package l;

import android.content.Context;
import android.widget.TextView;
import java.util.List;

/* compiled from: H5BW */
/* renamed from: l.ܽۨܽ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16623 extends C20065 {

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51065;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16623(int i, Context context, List list) {
        super(context, list);
        this.f51065 = i;
    }

    @Override // l.C20065
    /* renamed from: ֫ */
    public final void mo7683(TextView textView, boolean z) {
        if (z) {
            return;
        }
        textView.getLayoutParams().height = this.f51065;
    }
}

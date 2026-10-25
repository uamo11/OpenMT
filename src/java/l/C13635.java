package l;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: H5BW */
/* renamed from: l.ܰۛܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13635 extends C20065 {

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f40651;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13635(Context context, ArrayList arrayList, int i) {
        super(context, arrayList);
        this.f40651 = i;
    }

    @Override // l.C20065
    /* renamed from: ֫ */
    public final void mo7683(TextView textView, boolean z) {
        if (z) {
            return;
        }
        textView.getLayoutParams().height = this.f40651;
    }
}

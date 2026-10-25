package l;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: K51P */
/* renamed from: l.᩷ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20967 extends C6855 {
    @Override // l.C9678
    /* renamed from: ֫ */
    public boolean mo24604(TextView textView) {
        return textView.isHorizontallyScrollable();
    }

    @Override // l.C6855, l.C9678
    /* renamed from: ֫ */
    public void mo18541(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }
}

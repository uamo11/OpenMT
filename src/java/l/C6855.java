package l;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* compiled from: K51P */
/* renamed from: l.ۜܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6855 extends C9678 {
    @Override // l.C9678
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo18541(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C8972.m23162("getTextDirectionHeuristic", textView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}

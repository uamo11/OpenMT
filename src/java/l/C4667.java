package l;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: N7AP */
/* renamed from: l.ۙ۬ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4667 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13724(View view, C22306 c22306, C22306 c223062) {
        View findViewById = view.findViewById(R.id.MT_Protector_res_0x7f0a01e6);
        TextView textView = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a01e5);
        TextView textView2 = (TextView) view.findViewById(R.id.MT_Protector_res_0x7f0a01e4);
        boolean m50052 = c22306.m50052();
        boolean m500522 = c223062.m50052();
        if (!m50052 && !m500522) {
            findViewById.setVisibility(8);
            textView.setText((CharSequence) null);
            textView.setVisibility(8);
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            return;
        }
        findViewById.setVisibility(0);
        m13725(textView, R.string.MT_Protector_res_0x7f12039e, c22306);
        m13725(textView2, R.string.MT_Protector_res_0x7f12039d, c223062);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13725(TextView textView, int i, C22306 c22306) {
        boolean z;
        if (c22306.m50052()) {
            SpannableStringBuilder append = new SpannableStringBuilder(textView.getContext().getString(i)).append((CharSequence) ": ");
            if (c22306.m50053()) {
                append.append((CharSequence) C17283.m40572(c22306.m50051()));
                z = true;
            } else {
                z = false;
            }
            if (c22306.m50054()) {
                if (z) {
                    int length = append.length();
                    append.append((CharSequence) "·");
                    append.setSpan(new C20190(), length, append.length(), 33);
                }
                append.append((CharSequence) C22927.m51028(c22306.m50050()));
            }
            textView.setText(append);
            textView.setVisibility(0);
            return;
        }
        textView.setText((CharSequence) null);
        textView.setVisibility(8);
    }
}

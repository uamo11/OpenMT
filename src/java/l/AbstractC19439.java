package l;

import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: F90M */
/* renamed from: l.᩵ۨۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC19439 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m44780(TextView textView) {
        Integer num = (Integer) textView.getTag(R.id.MT_Protector_res_0x7f0a02fa);
        int hashCode = textView.getText().hashCode();
        if (num == null || num.intValue() != hashCode) {
            textView.setTag(R.id.MT_Protector_res_0x7f0a02fa, Integer.valueOf(hashCode));
            C0387[] m44779 = m44779(textView);
            if (m44779 == null || m44779.length <= 0) {
                return;
            }
            if (textView.getTag(R.id.MT_Protector_res_0x7f0a02f9) == null) {
                ViewOnAttachStateChangeListenerC15909 viewOnAttachStateChangeListenerC15909 = new ViewOnAttachStateChangeListenerC15909(textView);
                textView.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC15909);
                textView.setTag(R.id.MT_Protector_res_0x7f0a02f9, viewOnAttachStateChangeListenerC15909);
            }
            RunnableC18733 runnableC18733 = new RunnableC18733(textView);
            for (C0387 c0387 : m44779) {
                C17321 m1882 = c0387.m1882();
                m1882.m40641(new C3916(textView, runnableC18733, m1882.getBounds()));
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m44781(TextView textView) {
        if (textView.getTag(R.id.MT_Protector_res_0x7f0a02fa) == null) {
            return;
        }
        textView.setTag(R.id.MT_Protector_res_0x7f0a02fa, null);
        C0387[] m44779 = m44779(textView);
        if (m44779 == null || m44779.length <= 0) {
            return;
        }
        for (C0387 c0387 : m44779) {
            c0387.m1882().m40641((Drawable.Callback) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0387[] m44779(TextView textView) {
        CharSequence text = textView.getText();
        int length = text != null ? text.length() : 0;
        if (length == 0 || !(text instanceof Spanned)) {
            return null;
        }
        return (C0387[]) ((Spanned) text).getSpans(0, length, C0387.class);
    }
}

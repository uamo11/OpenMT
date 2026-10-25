package l;

import android.text.TextUtils;

/* compiled from: E1N7 */
/* renamed from: l.ܶܳۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15283 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1173 m36291(CharSequence charSequence) {
        C15859 c15859 = new C15859();
        int i = 0;
        while (true) {
            int indexOf = TextUtils.indexOf(charSequence, '\n', i);
            if (indexOf != -1) {
                c15859.add(indexOf);
                i = indexOf + 1;
            } else {
                c15859.add(charSequence.length());
                int[] mo3586 = c15859.mo3586();
                charSequence.length();
                return new C8229(mo3586);
            }
        }
    }
}

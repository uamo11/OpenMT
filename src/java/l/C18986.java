package l;

import android.content.ClipboardManager;
import android.os.Vibrator;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;

/* compiled from: 81UC */
/* renamed from: l.ᩴ᩶ۢ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18986 extends C18280 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8817 f59857 = C8817.m22786(250);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public WeakReference f59858;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43822(C0640 c0640) {
        if (m43819() != c0640) {
            this.f59858 = new WeakReference(c0640);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C0640 m43819() {
        WeakReference weakReference = this.f59858;
        if (weakReference == null) {
            return null;
        }
        return (C0640) weakReference.get();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m43824() {
        C0640 m43819 = m43819();
        if (m43819 != null) {
            m43819.m2653();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43821(String str) {
        ClipboardManager clipboardManager;
        C0640 m43819 = m43819();
        if (m43819 == null || (clipboardManager = (ClipboardManager) m43819.getContext().getSystemService("clipboard")) == null) {
            return;
        }
        try {
            clipboardManager.setText(str);
            C21374.m48457(R.string.MT_Protector_res_0x7f120a61);
        } catch (Throwable unused) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1201ff);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43820() {
        C0640 m43819 = m43819();
        if (m43819 == null || !this.f59857.m22791()) {
            return;
        }
        Vibrator vibrator = (Vibrator) m43819.getContext().getSystemService("vibrator");
        try {
            if (vibrator.hasVibrator()) {
                vibrator.vibrate(new long[]{0, 10}, -1);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43823() {
        C0640 m43819 = m43819();
        if (m43819 != null) {
            m43819.m2653();
        }
    }
}

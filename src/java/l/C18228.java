package l;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.google.android.material.slider.BasicLabelFormatter;

/* compiled from: V659 */
/* renamed from: l.ᩳᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18228 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42467(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(BasicLabelFormatter.MILLION, (OnBackInvokedCallback) obj2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m42468(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedDispatcher m42466(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static OnBackInvokedCallback m42465(final Runnable runnable) {
        C11003.requireNonNull(runnable);
        return new OnBackInvokedCallback() { // from class: l.ܽᩴ
            @Override // android.window.OnBackInvokedCallback
            public final void onBackInvoked() {
                runnable.run();
            }
        };
    }
}

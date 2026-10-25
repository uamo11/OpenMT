package l;

import android.view.View;
import android.view.WindowInsetsController;

/* compiled from: 95QI */
/* renamed from: l.۟ۨ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7438 {
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12437 m19974(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return C12437.m30598(windowInsetsController);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19972(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static CharSequence m19973(View view) {
        return view.getStateDescription();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19971(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m19975(View view) {
        return view.isImportantForContentCapture();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m19970(View view) {
        return view.getImportantForContentCapture();
    }
}

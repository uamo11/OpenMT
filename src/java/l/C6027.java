package l;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* compiled from: 95QI */
/* renamed from: l.ۛۨ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6027 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16856(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16853(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m16862(View view) {
        return view.getNextClusterForwardId();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16859(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m16865(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16860(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m16863(View view) {
        return view.isFocusedByDefault();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16855(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static View m16850(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16854(View view, Collection collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static boolean m16857(View view) {
        return view.restoreDefaultFocus();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m16864(View view) {
        return view.hasExplicitFocusable();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m16858(View view) {
        return view.getImportantForAutofill();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m16852(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m16861(View view) {
        return view.isImportantForAutofill();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AutofillId m16851(View view) {
        return view.getAutofillId();
    }
}

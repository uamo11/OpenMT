package l;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: 95QI */
/* renamed from: l.ۗۨ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnApplyWindowInsetsListenerC3205 implements View.OnApplyWindowInsetsListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21610 f10090 = null;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16610 f10091;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f10092;

    public ViewOnApplyWindowInsetsListenerC3205(View view, InterfaceC16610 interfaceC16610) {
        this.f10092 = view;
        this.f10091 = interfaceC16610;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C21610 m48814 = C21610.m48814(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC16610 interfaceC16610 = this.f10091;
        if (i < 30) {
            C13082.m31701(windowInsets, this.f10092);
            if (m48814.equals(this.f10090)) {
                return interfaceC16610.onApplyWindowInsets(view, m48814).m48823();
            }
        }
        this.f10090 = m48814;
        C21610 onApplyWindowInsets = interfaceC16610.onApplyWindowInsets(view, m48814);
        if (i >= 30) {
            return onApplyWindowInsets.m48823();
        }
        int i2 = C17648.f53953;
        C4616.m13544(view);
        return onApplyWindowInsets.m48823();
    }
}

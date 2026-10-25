package l;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/* compiled from: 98EM */
/* renamed from: l.ۨ֨ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C11374 implements InterfaceC0329, InterfaceC1702, InterfaceC16518 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34034;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f34035;

    public /* synthetic */ C11374(Object obj, Object obj2) {
        this.f34034 = obj;
        this.f34035 = obj2;
    }

    @Override // l.InterfaceC0329
    /* renamed from: ֫ */
    public void mo1749(PointF pointF, int i, int i2, float f, float f2) {
        ServiceC3219 serviceC3219 = (ServiceC3219) this.f34034;
        int[] iArr = (int[]) this.f34035;
        serviceC3219.m9863((serviceC3219.f10125.getWidth() / 2) + ((int) (iArr[0] + f)), (serviceC3219.f10125.getHeight() / 2) + ((int) (iArr[1] + f2)));
    }

    @Override // l.InterfaceC16518
    /* renamed from: ֫ */
    public void mo12661(TextView textView, TextView textView2, Button button) {
        String str = (String) this.f34034;
        String str2 = (String) this.f34035;
        ViewOnClickListenerC14813.m35216(textView, str);
        ViewOnClickListenerC14813.m35216(textView2, str2);
        button.setVisibility(4);
    }

    @Override // l.InterfaceC1702
    /* renamed from: ֫ */
    public void mo5714(TextView textView) {
        String str = (String) this.f34034;
        View.OnLongClickListener onLongClickListener = (View.OnLongClickListener) this.f34035;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(10);
        ViewOnClickListenerC14813.m35216(textView, str);
        if (onLongClickListener != null) {
            textView.setOnLongClickListener(onLongClickListener);
        }
    }
}

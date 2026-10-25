package l;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: K234 */
/* renamed from: l.ۙܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4759 implements OnBackAnimationCallback {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2123 f15114;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2123 f15115;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16233 f15116;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC16233 f15117;

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        C11233.m27805(backEvent, "backEvent");
        this.f15116.invoke(new C20118(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        C11233.m27805(backEvent, "backEvent");
        this.f15117.invoke(new C20118(backEvent));
    }

    public C4759(InterfaceC16233 interfaceC16233, InterfaceC16233 interfaceC162332, InterfaceC2123 interfaceC2123, InterfaceC2123 interfaceC21232) {
        this.f15117 = interfaceC16233;
        this.f15116 = interfaceC162332;
        this.f15115 = interfaceC2123;
        this.f15114 = interfaceC21232;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f15115.mo4049();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f15114.mo4049();
    }
}

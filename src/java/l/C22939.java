package l;

import android.view.View;
import android.view.Window;

/* compiled from: V22O */
/* renamed from: l.᩺ۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22939 implements InterfaceC17236 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23809 f73919;

    public C22939(ActivityC23809 activityC23809) {
        this.f73919 = activityC23809;
    }

    @Override // l.InterfaceC17236
    /* renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        if (enumC22901 == EnumC22901.ON_STOP) {
            Window window = this.f73919.getWindow();
            View peekDecorView = window != null ? window.peekDecorView() : null;
            if (peekDecorView != null) {
                peekDecorView.cancelPendingInputEvents();
            }
        }
    }
}

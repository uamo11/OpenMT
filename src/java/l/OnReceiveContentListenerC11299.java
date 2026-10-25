package l;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* compiled from: 95QI */
/* renamed from: l.ۧ᩺, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class OnReceiveContentListenerC11299 implements OnReceiveContentListener {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18022 f33838;

    @Override // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C3746 c3746 = new C3746(new C8685(contentInfo));
        C3746 mo8914 = this.f33838.mo8914(view, c3746);
        if (mo8914 == null) {
            return null;
        }
        return mo8914 == c3746 ? contentInfo : mo8914.m11375();
    }

    public OnReceiveContentListenerC11299(InterfaceC18022 interfaceC18022) {
        this.f33838 = interfaceC18022;
    }
}

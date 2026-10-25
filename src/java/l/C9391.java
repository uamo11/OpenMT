package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: JB1Y */
/* renamed from: l.ۢۛ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9391 implements InterfaceC20680 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ClipData f28515;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Bundle f28516;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f28517;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f28518;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Uri f28519;

    @Override // l.InterfaceC20680
    /* renamed from: ֫ */
    public final void mo18084(int i) {
        this.f28517 = i;
    }

    @Override // l.InterfaceC20680
    /* renamed from: ֫ */
    public final void mo18085(Uri uri) {
        this.f28519 = uri;
    }

    @Override // l.InterfaceC20680
    /* renamed from: ֫ */
    public final void mo18086(Bundle bundle) {
        this.f28516 = bundle;
    }

    @Override // l.InterfaceC20680
    public final C3746 build() {
        return new C3746(new C2335(this));
    }
}

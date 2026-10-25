package l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* compiled from: JB1Y */
/* renamed from: l.ܳۛ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14328 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20680 f43215;

    public C14328(ClipData clipData, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f43215 = new C6568(clipData, i);
            return;
        }
        C9391 c9391 = new C9391();
        c9391.f28515 = clipData;
        c9391.f28518 = i;
        this.f43215 = c9391;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34198(int i) {
        this.f43215.mo18084(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34199(Uri uri) {
        this.f43215.mo18085(uri);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34200(Bundle bundle) {
        this.f43215.mo18086(bundle);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3746 m34197() {
        return this.f43215.build();
    }
}

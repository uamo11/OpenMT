package l;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: H5BW */
/* renamed from: l.ܳۨܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14506 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f44475 = new AtomicBoolean();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final View f44476;

    public C14506(View view) {
        this.f44476 = view;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m34619(DialogInterfaceC0206 dialogInterfaceC0206) {
        if (!this.f44475.compareAndSet(false, true)) {
            return false;
        }
        C8863.m22893(dialogInterfaceC0206, this.f44476, true);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34618(DialogInterfaceC0206 dialogInterfaceC0206) {
        if (!this.f44475.compareAndSet(true, false)) {
            return false;
        }
        if (dialogInterfaceC0206.m1442()) {
            C8863.m22893(dialogInterfaceC0206, this.f44476, false);
        }
        return true;
    }
}

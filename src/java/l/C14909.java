package l;

import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import java.util.HashSet;
import java.util.Set;

/* compiled from: N5R1 */
/* renamed from: l.ܶ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14909 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0798 f45479;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Set f45480;

    public C14909(Context context, C14472 c14472) {
        if (c14472 == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f45480 = C20195.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f45479 = new C7854(context, c14472);
        } else {
            this.f45479 = new C0798(context, c14472);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35367(KeyEvent keyEvent) {
        if (keyEvent == null) {
            throw new IllegalArgumentException("KeyEvent may not be null");
        }
        this.f45479.f2921.dispatchMediaButtonEvent(keyEvent);
    }
}

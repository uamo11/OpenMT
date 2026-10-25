package l;

import android.view.Window;

/* compiled from: XAMH */
/* renamed from: l.᩶ܰ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C20199 extends C22315 {
    @Override // l.C13142
    /* renamed from: ۧ */
    public final void mo10012(boolean z) {
        if (z) {
            Window window = this.f72333;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            m50056(8192);
            return;
        }
        m50055(8192);
    }

    @Override // l.C13142
    /* renamed from: ֫ */
    public final boolean mo10010() {
        return (this.f72333.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }
}

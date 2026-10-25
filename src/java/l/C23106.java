package l;

import android.os.Build;
import android.view.inputmethod.EditorInfo;
import java.util.Set;

/* compiled from: DB30 */
/* renamed from: l.᩺ܽ֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23106 extends C13933 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile C23148 f74340;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public volatile C21738 f74341;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51294(C23148 c23148) {
        C1982 c1982;
        InterfaceC11155 interfaceC11155;
        Set m2338;
        this.f74340 = c23148;
        C23148 c231482 = this.f74340;
        c1982 = this.f41609.f21372;
        interfaceC11155 = this.f41609.f21365;
        if (Build.VERSION.SDK_INT >= 34) {
            m2338 = C19622.m45081();
        } else {
            m2338 = C0570.m2338();
        }
        this.f74341 = new C21738(c231482, c1982, interfaceC11155, m2338);
        this.f41609.m18725();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m51292(CharSequence charSequence, int i, int i2, boolean z) {
        return this.f74341.m49065(charSequence, i, i2, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51293(EditorInfo editorInfo) {
        editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f74340.m51326());
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}

package l;

import java.io.IOException;

/* compiled from: V717 */
/* renamed from: l.ܽ۟ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16500 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C14133 f50710;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9711 f50711;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38864() {
        C9711 c9711 = this.f50711;
        if (c9711 != null) {
            try {
                c9711.close();
            } catch (IOException unused) {
            }
        }
        C14133 c14133 = this.f50710;
        if (c14133 != null) {
            try {
                c14133.close();
            } catch (IOException unused2) {
            }
        }
    }
}

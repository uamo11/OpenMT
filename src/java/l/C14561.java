package l;

import java.io.IOException;

/* compiled from: 5AQ2 */
/* renamed from: l.ܳܰۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14561 extends ThreadLocal {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18090 f44590;

    public C14561(C18090 c18090) {
        this.f44590 = c18090;
    }

    @Override // java.lang.ThreadLocal
    @Deprecated
    public final Object get() {
        throw new RuntimeException("Use getZipFile() instead.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18090 m34753() {
        try {
            C18090 c18090 = (C18090) super.get();
            C11003.requireNonNull(c18090);
            return c18090;
        } catch (C17384 e) {
            throw ((IOException) e.getCause());
        }
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        try {
            return this.f44590.m42203();
        } catch (IOException e) {
            throw new C17384(e);
        }
    }
}

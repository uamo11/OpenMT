package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.UUID;

/* compiled from: I6U1 */
/* renamed from: l.ܿ۬ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17371 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C21605 f53184;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9323 f53185;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20194 f53186;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C7247 f53187;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C8617 f53188;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        C9323 c9323 = this.f53185;
        if (c9323 == null) {
            return;
        }
        this.f53185 = null;
        try {
            c9323.close();
            try {
                C21605 c21605 = this.f53184;
                if (c21605 != null) {
                    c21605.close();
                }
                try {
                    C7247 c7247 = this.f53187;
                    if (c7247 != null) {
                        this.f53187 = null;
                        try {
                            c7247.close();
                        } catch (IOException e) {
                            throw new UncheckedIOException(e);
                        }
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    C7247 c72472 = this.f53187;
                    if (c72472 != null) {
                        this.f53187 = null;
                        try {
                            c72472.close();
                        } catch (IOException e2) {
                            throw new UncheckedIOException(e2);
                        }
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.f53184 != null) {
                    this.f53184.close();
                }
                try {
                    C7247 c72473 = this.f53187;
                    if (c72473 != null) {
                        this.f53187 = null;
                        try {
                            c72473.close();
                        } catch (IOException e3) {
                            throw new UncheckedIOException(e3);
                        }
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    C7247 c72474 = this.f53187;
                    if (c72474 != null) {
                        this.f53187 = null;
                        try {
                            c72474.close();
                        } catch (IOException e4) {
                            throw new UncheckedIOException(e4);
                        }
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized byte[] m40710() {
        return (byte[]) m40709().f28279.clone();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized UUID m40711() {
        m40709();
        return this.f53184.f69374;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized C23721 m40712() {
        C23721 c23721;
        C9323 m40709 = m40709();
        C2827 c2827 = new C2827(m40709.f28282, m40709.f28286);
        C2267 m24000 = m40709.m24000();
        try {
            this.f53188.m22372(m40709);
            C21605 c21605 = this.f53184;
            C2309 c2309 = m40709.f28283;
            if (c2309 == null) {
                c2309 = new C2309();
            }
            c23721 = new C23721(c21605, c2827, m24000, c2309, this.f53188, this.f53186, C12891.f38696, 0);
            c23721.f76814 = m40709.f28276;
            c23721.f76808 = this.f53187;
            this.f53187 = null;
            this.f53185 = null;
            m40709.close();
        } catch (Throwable th) {
            try {
                c2827.close();
                throw th;
            } finally {
                m24000.close();
            }
        }
        return c23721;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized long m40713() {
        return m40709().f28277;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized C12704 m40714() {
        C9323 m40709;
        m40709 = m40709();
        return new C12704(m40709.f28282, m40709.f28286);
    }

    public C17371(C21605 c21605, C8617 c8617, C9323 c9323, C20194 c20194) {
        this.f53184 = c21605;
        this.f53188 = c8617;
        this.f53185 = c9323;
        this.f53186 = c20194;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C9323 m40709() {
        C9323 c9323 = this.f53185;
        if (c9323 != null) {
            return c9323;
        }
        throw new IllegalStateException("Recovery handle is closed");
    }
}

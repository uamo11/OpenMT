package l;

import java.io.IOException;
import java.util.UUID;

/* compiled from: 46SG */
/* renamed from: l.ۖ᩶ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2764 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f8587;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f8588;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final UUID f8589;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2267 f8590;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C7247 f8591;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f8592;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1143 f8593;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f8594;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f8592) {
            return;
        }
        if (this.f8594 || this.f8587) {
            throw new IllegalStateException("Cannot release migration ownership during use");
        }
        try {
            this.f8591.close();
        } finally {
            this.f8592 = true;
            C2267 c2267 = this.f8590;
            if (c2267 != null) {
                c2267.close();
                this.f8590 = null;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Object m8525(C23909 c23909) {
        if (this.f8592) {
            throw new IllegalStateException("Migration result is closed");
        }
        if (this.f8587 || this.f8594) {
            throw new IllegalStateException("Migration result is already in use");
        }
        this.f8587 = true;
        try {
        } finally {
            this.f8587 = false;
        }
        return m8524(c23909);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m8527(C22044 c22044) {
        if (this.f8592) {
            throw new IllegalStateException("Migration result is closed");
        }
        if (this.f8594 || this.f8587) {
            throw new IllegalStateException("Migration result is already in use");
        }
        this.f8594 = true;
        try {
            m8524(null);
            c22044.m49606();
        } finally {
            this.f8594 = false;
        }
    }

    public C2764(InterfaceC20758 interfaceC20758, C7247 c7247, UUID uuid, C1143 c1143) {
        this.f8588 = interfaceC20758;
        this.f8591 = c7247;
        this.f8589 = uuid;
        this.f8593 = c1143;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 m8526() {
        return this.f8588;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final UUID m8528() {
        return this.f8589;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8523(C2764 c2764) {
        c2764.m8524(null);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Object m8524(C23909 c23909) {
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        InterfaceC20758 interfaceC20758 = this.f8588;
        C7247 c7247 = this.f8591;
        C13596 m19394 = c7247.m19394();
        UUID uuid = m19394.f40549;
        UUID uuid2 = this.f8589;
        if (!uuid.equals(uuid2)) {
            throw new IOException("Migration recovery identity does not match");
        }
        InterfaceC20758 m19382 = c7247.m19382(m19394);
        C1143 c1143 = this.f8593;
        C21605 m48785 = C21605.m48785(m19382, c1143);
        try {
            C9323 m22371 = new C8617(m48785).m22371(C20612.f66331);
            try {
                C7247.m19368(m19394, m48785, m22371.f28277);
                if (m22371.f28285 != 0 || m22371.f28278 != null || m22371.f28280 != null) {
                    throw new IOException("Migration recovery requires explicit repair before cleanup");
                }
                C12641 m30913 = C12641.m30913(m22371.m24001());
                if (!m30913.f38084.equals(uuid2)) {
                    throw new IOException("Migration metadata identity does not match");
                }
                m30913.m30918(interfaceC20758, c1143);
                m48785.f69371.mo14386();
                interfaceC23015.mo28630(interfaceC20758);
                C2267 c2267 = this.f8590;
                this.f8590 = m22371.m24000();
                if (c2267 != null) {
                    c2267.close();
                }
                if (c23909 != null) {
                    C12704 c12704 = new C12704(m22371.m24002(), m22371.f28286);
                    try {
                        Object m52662 = c23909.m52662(c12704, m30913);
                        c12704.close();
                        m22371.close();
                        m48785.close();
                        return m52662;
                    } finally {
                    }
                }
                m22371.close();
                m48785.close();
                return null;
            } finally {
            }
        } catch (Throwable th) {
            try {
                m48785.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

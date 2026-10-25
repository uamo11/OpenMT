package l;

import java.io.IOException;

/* compiled from: I6TG */
/* renamed from: l.ᩴۘᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18516 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f57383;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f57384;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19222 f57385;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C6102 f57386;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23077 f57387;

    public C18516(C3699 c3699) {
        C19222 c19222;
        C10336 c10336;
        C5816 c5816;
        byte[] bArr;
        byte[] bArr2;
        c19222 = c3699.f11676;
        this.f57385 = c19222;
        c10336 = c3699.f11679;
        this.f57386 = c10336.finish();
        c5816 = c3699.f11674;
        this.f57387 = c5816.m16317();
        bArr = c3699.f11678;
        this.f57384 = bArr;
        bArr2 = c3699.f11677;
        this.f57383 = bArr2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18516 m43037(C17371 c17371, InterfaceC20758 interfaceC20758, C1143 c1143, int i) {
        C18516 m43036;
        synchronized (c17371) {
            C12641 m30913 = C12641.m30913(c17371.m40710());
            if (!m30913.m30920().equals(c17371.m40711())) {
                throw new IOException("Migration app identity does not match");
            }
            C12704 m40714 = c17371.m40714();
            try {
                m43036 = m43036(m40714, m30913, interfaceC20758, c1143, i);
                m40714.close();
            } finally {
            }
        }
        return m43036;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18516 m43036(C12704 c12704, C12641 c12641, InterfaceC20758 interfaceC20758, C1143 c1143, int i) {
        if (!c12641.m30919() || i < 0 || c12641.m30922() > i) {
            throw new IOException("Migration app state is missing or exceeds limit");
        }
        C3699 c3699 = new C3699(c12704, i);
        try {
            C17580.m41105(c12641.m30915(interfaceC20758, c1143), c12641.m30922(), c1143, c3699);
            c3699.m11283();
            C18516 c18516 = new C18516(c3699);
            c3699.close();
            return c18516;
        } catch (Throwable th) {
            try {
                c3699.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}

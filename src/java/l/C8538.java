package l;

import java.io.IOException;

/* compiled from: 47G4 */
/* renamed from: l.ۡ֡᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8538 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f26097;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6421 f26099;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Throwable f26101;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f26102;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f26103;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f26104;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f26105;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile EnumC15592 f26098 = EnumC15592.UNKNOWN;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object f26100 = new Object();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC15592 m22225() {
        return this.f26098;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22226() {
        synchronized (this.f26100) {
            this.f26098 = EnumC15592.UNKNOWN;
            this.f26099 = null;
            this.f26101 = null;
            this.f26102++;
            this.f26105 = false;
            this.f26104 = 0L;
            this.f26100.notifyAll();
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:2:0x0009 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C9244 m22224(l.C0776 r13, l.C7832 r14) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8538.m22224(l.֨֡᩻, l.۠֡᩻):l.ۢ֡᩻");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22223(Throwable th) {
        if (th instanceof IOException) {
            throw ((IOException) th);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
        throw new IOException("SMB protocol probing failed", th);
    }
}

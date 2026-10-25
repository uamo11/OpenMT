package l;

import java.io.InterruptedIOException;
import java.util.HashMap;

/* compiled from: 574A */
/* renamed from: l.ۨۚۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11493 implements AutoCloseable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f34343;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final HashMap f34344 = new HashMap();

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        this.f34343 = true;
        notifyAll();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C10082 m28321(String str) {
        C12198 c12198;
        int i;
        if (this.f34343) {
            throw new InterruptedIOException("HLS playlist cache coordinator was closed");
        }
        c12198 = (C12198) C13843.computeIfAbsent(this.f34344, str, new C12903());
        i = c12198.f36410;
        c12198.f36410 = i + 1;
        return new C10082(this, c12198);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28319(C11493 c11493, C12198 c12198) {
        C10082 c10082;
        int i;
        int i2;
        String str;
        c11493.getClass();
        c10082 = c12198.f36408;
        if (c10082 == null) {
            i = c12198.f36409;
            if (i == 0) {
                i2 = c12198.f36410;
                if (i2 == 0) {
                    HashMap hashMap = c11493.f34344;
                    str = c12198.f36407;
                    C13843.remove(hashMap, str, c12198);
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterruptedIOException m28318(String str, InterruptedException interruptedException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(str);
        if (interruptedException != null) {
            interruptedIOException.initCause(interruptedException);
        }
        return interruptedIOException;
    }
}

package l;

import java.io.IOException;

/* compiled from: S737 */
/* renamed from: l.ۨۚ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11506 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f34363;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f34364;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f34365;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f34366;

    public C11506(long j, String str, String str2, String str3) {
        this.f34365 = j;
        this.f34363 = str;
        this.f34364 = str2;
        this.f34366 = str3;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m28335() {
        return this.f34365;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28331() {
        return this.f34363;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m28333() {
        return this.f34364;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m28336() {
        return this.f34366;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11506 m28334(String str) {
        return new C11506(this.f34365, this.f34363, this.f34364, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28332(String str) {
        String str2 = this.f34366;
        if (str2 != null && !str2.equals(str)) {
            throw new IOException("Remote payload metadata changed since it was opened");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m28330(C11506 c11506, C11506 c115062) {
        boolean m50879;
        String str = c11506.f34364;
        String str2 = c11506.f34363;
        long j = c11506.f34365;
        long j2 = c115062.f34365;
        String str3 = c115062.f34363;
        if (j != j2) {
            throw new IOException("Remote resource length changed since it was opened");
        }
        m50879 = C22794.m50879(str2);
        if (m50879) {
            if (!str2.equals(str3)) {
                throw new IOException("Remote resource ETag changed since it was opened");
            }
        } else {
            if (str != null && !str.equals(c115062.f34364)) {
                throw new IOException("Remote resource Last-Modified changed since it was opened");
            }
            if (str == null && str2 != null && !str2.equals(str3)) {
                throw new IOException("Remote resource ETag changed since it was opened");
            }
        }
    }
}

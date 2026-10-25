package l;

import java.util.Locale;

/* compiled from: G4EY */
/* renamed from: l.۟֫֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7150 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f21947;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11816 f21948;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11816 f21949;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C11816 f21944 = C11816.m28900(":");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C11816 f21943 = C11816.m28900(":status");

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C11816 f21946 = C11816.m28900(":method");

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C11816 f21941 = C11816.m28900(":path");

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C11816 f21945 = C11816.m28900(":scheme");

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C11816 f21942 = C11816.m28900(":authority");

    public C7150(String str, String str2) {
        this(C11816.m28900(str), C11816.m28900(str2));
    }

    public C7150(C11816 c11816, String str) {
        this(c11816, C11816.m28900(str));
    }

    public C7150(C11816 c11816, C11816 c118162) {
        this.f21948 = c11816;
        this.f21949 = c118162;
        this.f21947 = c118162.mo2336() + c11816.mo2336() + 32;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7150) {
            C7150 c7150 = (C7150) obj;
            if (this.f21948.equals(c7150.f21948) && this.f21949.equals(c7150.f21949)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21949.hashCode() + ((this.f21948.hashCode() + 527) * 31);
    }

    public final String toString() {
        String mo2335 = this.f21948.mo2335();
        String mo23352 = this.f21949.mo2335();
        byte[] bArr = C20032.f64884;
        Locale locale = Locale.US;
        return C22870.m50967(mo2335, ": ", mo23352);
    }
}

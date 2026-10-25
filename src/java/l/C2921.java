package l;

import java.util.Arrays;

/* compiled from: S9CL */
/* renamed from: l.ۗ֫ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2921 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f9286;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char[] f9287;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f9288;

    public C2921(String str, char[] cArr, String str2) {
        this.f9288 = str;
        this.f9287 = Arrays.copyOf(cArr, cArr.length);
        this.f9286 = str2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m8917() {
        return this.f9288;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char[] m8916() {
        return this.f9287;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m8915() {
        return this.f9286;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m8919() {
        return this.f9288.isEmpty() && this.f9287.length == 0;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m8918() {
        return this.f9288.equals("Guest") && this.f9287.length == 0;
    }

    public final String toString() {
        return "AuthenticationContext[" + this.f9288 + '@' + this.f9286 + ']';
    }
}

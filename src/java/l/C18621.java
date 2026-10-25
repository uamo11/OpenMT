package l;

import java.io.Closeable;

/* compiled from: O5QJ */
/* renamed from: l.ᩴ۟᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18621 implements Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C13159 f57735;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f57736;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C18621 f57737;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f57738;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18621 f57739;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC14386 f57740;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f57741;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C10338 f57742;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C8743 f57743;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18621 f57744;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC0275 f57745;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile C11044 f57746;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final long f57747;

    public C18621(C3804 c3804) {
        this.f57743 = c3804.f11993;
        this.f57740 = c3804.f12001;
        this.f57736 = c3804.f11998;
        this.f57741 = c3804.f11996;
        this.f57735 = c3804.f12000;
        C12454 c12454 = c3804.f11999;
        c12454.getClass();
        this.f57742 = new C10338(c12454);
        this.f57745 = c3804.f11991;
        this.f57739 = c3804.f12002;
        this.f57744 = c3804.f11995;
        this.f57737 = c3804.f11992;
        this.f57738 = c3804.f11997;
        this.f57747 = c3804.f11994;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C8743 m43168() {
        return this.f57743;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m43177() {
        return this.f57736;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m43173() {
        int i = this.f57736;
        return i >= 200 && i < 300;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m43171() {
        return this.f57741;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13159 m43174() {
        return this.f57735;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m43169(String str) {
        String m26137 = this.f57742.m26137(str);
        if (m26137 != null) {
            return m26137;
        }
        return null;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C10338 m43180() {
        return this.f57742;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC0275 m43170() {
        return this.f57745;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C3804 m43172() {
        C3804 c3804 = new C3804();
        c3804.f11993 = this.f57743;
        c3804.f12001 = this.f57740;
        c3804.f11998 = this.f57736;
        c3804.f11996 = this.f57741;
        c3804.f12000 = this.f57735;
        c3804.f11999 = this.f57742.m26138();
        c3804.f11991 = this.f57745;
        c3804.f12002 = this.f57739;
        c3804.f11995 = this.f57744;
        c3804.f11992 = this.f57737;
        c3804.f11997 = this.f57738;
        c3804.f11994 = this.f57747;
        return c3804;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C18621 m43178() {
        return this.f57737;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11044 m43176() {
        C11044 c11044 = this.f57746;
        if (c11044 != null) {
            return c11044;
        }
        C11044 m27422 = C11044.m27422(this.f57742);
        this.f57746 = m27422;
        return m27422;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long m43175() {
        return this.f57738;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long m43179() {
        return this.f57747;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AbstractC0275 abstractC0275 = this.f57745;
        if (abstractC0275 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        abstractC0275.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.f57740 + ", code=" + this.f57736 + ", message=" + this.f57741 + ", url=" + this.f57743.f26640 + '}';
    }
}

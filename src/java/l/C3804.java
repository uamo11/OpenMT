package l;

/* compiled from: O5QJ */
/* renamed from: l.ۘ۟᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3804 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC0275 f11991;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18621 f11992;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8743 f11993;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f11994;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18621 f11995;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f11996;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f11997;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f11998 = -1;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12454 f11999 = new C12454();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C13159 f12000;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC14386 f12001;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C18621 f12002;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11479(C8743 c8743) {
        this.f11993 = c8743;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11482(EnumC14386 enumC14386) {
        this.f12001 = enumC14386;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11475(int i) {
        this.f11998 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11486(String str) {
        this.f11996 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11481(C13159 c13159) {
        this.f12000 = c13159;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11484() {
        C12454 c12454 = this.f11999;
        c12454.getClass();
        C10338.m26135("Proxy-Authenticate");
        C10338.m26133("OkHttp-Preemptive", "Proxy-Authenticate");
        c12454.m30617("Proxy-Authenticate");
        c12454.m30616("Proxy-Authenticate", "OkHttp-Preemptive");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11477(String str) {
        this.f11999.m30614("Warning", str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11480(C10338 c10338) {
        this.f11999 = c10338.m26138();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11478(AbstractC0275 abstractC0275) {
        this.f11991 = abstractC0275;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11487(C18621 c18621) {
        if (c18621 != null) {
            m11473("networkResponse", c18621);
        }
        this.f12002 = c18621;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11483(C18621 c18621) {
        if (c18621 != null) {
            m11473("cacheResponse", c18621);
        }
        this.f11995 = c18621;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11473(String str, C18621 c18621) {
        if (c18621.f57745 != null) {
            throw new IllegalArgumentException(str.concat(".body != null"));
        }
        if (c18621.f57739 != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null"));
        }
        if (c18621.f57744 != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
        }
        if (c18621.f57737 != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null"));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m11488(C18621 c18621) {
        if (c18621.f57745 == null) {
            this.f11992 = c18621;
            return;
        }
        throw new IllegalArgumentException("priorResponse.body != null");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11485(long j) {
        this.f11997 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11476(long j) {
        this.f11994 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18621 m11474() {
        if (this.f11993 == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.f12001 == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.f11998 < 0) {
            throw new IllegalStateException("code < 0: " + this.f11998);
        }
        if (this.f11996 == null) {
            throw new IllegalStateException("message == null");
        }
        return new C18621(this);
    }
}

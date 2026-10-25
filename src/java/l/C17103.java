package l;

/* compiled from: 470W */
/* renamed from: l.ܿۘܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17103 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11419 f52417;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object f52418;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f52419;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17809 f52420;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f52421;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C14986 f52422;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10545 f52423;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f52424;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f52425;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16397 f52426;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f52427;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52428;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23097 f52429;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C20632 f52430;

    public C17103(C20632 c20632, long j, C23097 c23097, Object obj, long j2, int i, int i2, int i3, C16397 c16397, C11419 c11419, C10545 c10545, C14986 c14986, C17809 c17809) {
        this.f52430 = c20632;
        this.f52424 = j;
        this.f52429 = c23097;
        this.f52418 = obj;
        this.f52419 = j2;
        this.f52425 = i;
        this.f52421 = i2;
        this.f52427 = i3;
        this.f52426 = c16397;
        this.f52417 = c11419;
        this.f52423 = c10545;
        this.f52422 = c14986;
        this.f52420 = c17809;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40127(C17103 c17103, C20632 c20632) {
        synchronized (c17103) {
            if (c17103.f52430 != c20632) {
                throw new IllegalArgumentException("Syntax window request belongs to another session");
            }
            if (c17103.f52428) {
                throw new IllegalStateException("Syntax window request was already constructed");
            }
            c17103.f52428 = true;
        }
    }
}

package l;

/* compiled from: JAQI */
/* renamed from: l.֡֨ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0086 extends Exception {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f1020;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f1021;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f1022;

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }

    public C0086(int i, String str) {
        super(C4925.m14327(i));
        this.f1022 = str;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m1049() {
        this.f1021 = true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m1048() {
        this.f1020 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m1045() {
        return this.f1022;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m1046() {
        return this.f1021;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m1047() {
        return this.f1020;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getMessage() + "\n" + this.f1022;
    }
}

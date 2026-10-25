package l;

/* compiled from: KBJF */
/* renamed from: l.֫֨ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1489 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C1489 f5328 = new C1489(false, false);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C1489 f5329 = new C1489(true, true);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f5330;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f5331;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m5157() {
        return this.f5331;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m5155() {
        return this.f5330;
    }

    public C1489(boolean z, boolean z2) {
        this.f5331 = z;
        this.f5330 = z2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m5156(String str) {
        String trim = str.trim();
        return !this.f5331 ? C23340.m51750(trim) : trim;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m5153(String str) {
        String trim = str.trim();
        return !this.f5330 ? C23340.m51750(trim) : trim;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5154(C15578 c15578) {
        if (c15578 == null || this.f5330) {
            return;
        }
        c15578.normalize();
    }
}

package l;

/* compiled from: H7AC */
/* renamed from: l.᩵ܳۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19521 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f63088 = 49152;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0469 m44926(String str) {
        int codePointCount = str.codePointCount(0, str.length());
        int i = this.f63088;
        if (codePointCount <= i) {
            this.f63088 = i - codePointCount;
            return new C0469(str, false);
        }
        int max = Math.max(0, i);
        this.f63088 = 0;
        return new C0469(max <= 0 ? "" : str.substring(0, str.offsetByCodePoints(0, max)), codePointCount > max);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m44927(String str) {
        int codePointCount = str.codePointCount(0, str.length());
        int i = this.f63088;
        if (codePointCount > i) {
            return false;
        }
        this.f63088 = i - codePointCount;
        return true;
    }
}

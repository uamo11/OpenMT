package l;

/* compiled from: 38SD */
/* renamed from: l.᩵ۚۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19259 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f60626;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f60627;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f60628;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f60629;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f60630;

    public C19259(int i, int i2) {
        this(Integer.MIN_VALUE, i, i2);
    }

    public C19259(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = "";
        }
        this.f60628 = str;
        this.f60626 = i2;
        this.f60629 = i3;
        this.f60630 = Integer.MIN_VALUE;
        this.f60627 = "";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44443() {
        int i = this.f60630;
        this.f60630 = i == Integer.MIN_VALUE ? this.f60626 : i + this.f60629;
        this.f60627 = this.f60628 + this.f60630;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m44444() {
        if (this.f60630 != Integer.MIN_VALUE) {
            return this.f60627;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m44445() {
        int i = this.f60630;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
    }
}

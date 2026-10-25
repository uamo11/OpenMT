package l;

/* compiled from: 26NV */
/* renamed from: l.ᩳۘܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17809 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14986 f54444;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11419 f54445;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16397 f54446;

    public C17809(C16397 c16397, C11419 c11419, C14986 c14986) {
        if (c16397.m38649() != c11419.m28194() || c16397.m38650() != c11419.m28195() || c14986.m35507() != c16397.m38650()) {
            throw new IllegalArgumentException("Window reuse metadata identity differs");
        }
        this.f54446 = c16397;
        this.f54445 = c11419;
        this.f54444 = c14986;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17809 m41742(C14986 c14986) {
        int m35507 = c14986.m35507();
        C14986 c149862 = this.f54444;
        if (m35507 != c149862.m35509()) {
            throw new IllegalArgumentException("Window reuse edit chain differs");
        }
        int m35504 = c14986.m35504();
        while (true) {
            m35504--;
            if (m35504 >= 0) {
                c149862 = c149862.m35499(new C7931(c14986.m35508(m35504), c14986.m35510(m35504), c14986.m35502(m35504) - c14986.m35505(m35504)));
            } else {
                return new C17809(this.f54446, this.f54445, c149862);
            }
        }
    }
}

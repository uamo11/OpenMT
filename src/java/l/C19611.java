package l;

/* compiled from: IBF1 */
/* renamed from: l.᩵ܿܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19611 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15375[] f63328;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15375[] f63329;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15375[] f63330;

    public C19611(C13012 c13012) {
        int m38023 = c13012.m31591().m38023();
        this.f63330 = new C15375[m38023];
        this.f63329 = new C15375[m38023];
        this.f63328 = new C15375[m38023];
        C17246 m31591 = c13012.m31591();
        int size = m31591.size();
        for (int i = 0; i < size; i++) {
            C16540 m41002get = m31591.m41002get(i);
            int mo2269 = m41002get.mo2269();
            this.f63330[mo2269] = new C15375(m41002get.m38916().m41001get(0).m37480(), false);
            C10191 m37480 = m41002get.m38915().m37480();
            this.f63329[mo2269] = new C15375(m37480, false);
            this.f63328[mo2269] = new C15375(m37480, false);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15375 m45054(C16540 c16540) {
        return this.f63330[c16540.mo2269()];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15375 m45051(int i) {
        return this.f63330[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15375 m45053(C16540 c16540) {
        return this.f63329[c16540.mo2269()];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15375 m45052(C16540 c16540) {
        return this.f63328[c16540.mo2269()];
    }
}

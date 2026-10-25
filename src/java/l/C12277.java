package l;

/* compiled from: X23D */
/* renamed from: l.۫۠ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12277 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC0282 f36576;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f36577 = -1;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C22155 f36578;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15098 f36579;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public EnumC5222 f36580;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22155 m29809() {
        return this.f36578;
    }

    public final String toString() {
        StringBuilder m32307 = C13325.m32307(200, "<<\n mode: ");
        m32307.append(this.f36580);
        m32307.append("\n ecLevel: ");
        m32307.append(this.f36576);
        m32307.append("\n version: ");
        m32307.append(this.f36579);
        m32307.append("\n maskPattern: ");
        m32307.append(this.f36577);
        if (this.f36578 == null) {
            m32307.append("\n matrix: null\n");
        } else {
            m32307.append("\n matrix:\n");
            m32307.append(this.f36578);
        }
        m32307.append(">>\n");
        return m32307.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29812(EnumC5222 enumC5222) {
        this.f36580 = enumC5222;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29811(EnumC0282 enumC0282) {
        this.f36576 = enumC0282;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29813(C15098 c15098) {
        this.f36579 = c15098;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29810(int i) {
        this.f36577 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29814(C22155 c22155) {
        this.f36578 = c22155;
    }
}

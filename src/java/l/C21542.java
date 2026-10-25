package l;

/* compiled from: WBAF */
/* renamed from: l.᩸ۧܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21542 extends AbstractC23822 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19590 f69228;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f69229;

    public C21542(C19590 c19590) {
        super("BootstrapMethods");
        this.f69228 = c19590;
        int size = (c19590.size() * 4) + 8;
        for (int i = 0; i < c19590.size(); i++) {
            size += c19590.m41003get(i).m43597().size() * 2;
        }
        this.f69229 = size;
    }

    @Override // l.InterfaceC12575
    /* renamed from: ֫ */
    public final int mo9828() {
        return this.f69229;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19590 m48701() {
        return this.f69228;
    }
}

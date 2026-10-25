package l;

import java.util.List;

/* compiled from: R4MA */
/* renamed from: l.ۤ۟֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10138 extends AbstractC8185 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f30507;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f30508;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f30509;

    public C10138(C12918 c12918, C18729 c18729) {
        this.f30508 = c12918;
        int m43368 = c18729.m43368();
        this.f30509 = m43368;
        this.f30507 = c18729.m43364();
        for (int i = 0; i < m43368; i++) {
            AbstractC10494.m26391(c18729);
        }
    }

    @Override // l.InterfaceC20288
    public final List getValue() {
        return new C12254(this, this.f30508, this.f30507, this.f30509);
    }
}

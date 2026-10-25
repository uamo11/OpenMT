package l;

import java.util.EnumSet;
import java.util.Set;

/* compiled from: C7LA */
/* renamed from: l.᩻ᩴ֨, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23874 extends AbstractC2708 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Set f77197;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2609 f77198;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7814 f77199;

    public C23874(C7814 c7814, C2609 c2609, EnumSet enumSet) {
        this.f77199 = c7814;
        this.f77198 = c2609;
        this.f77197 = enumSet;
    }

    public final String toString() {
        C7814 c7814 = this.f77199;
        C2609 c2609 = this.f77198;
        if (c2609 == null) {
            return "Opens[" + c7814 + "]";
        }
        return "Opens[" + c7814 + ":" + c2609 + "]";
    }

    @Override // l.InterfaceC11286
    /* renamed from: ֫ */
    public final void mo24769(InterfaceC18341 interfaceC18341) {
        interfaceC18341.mo14071(this);
    }
}

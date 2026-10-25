package l;

import java.util.Collection;
import java.util.HashSet;

/* compiled from: W7SR */
/* renamed from: l.᩻۫֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C23688 extends AbstractC0286 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashSet f76719;

    @Override // l.AbstractC9460
    /* renamed from: ۧ */
    public final InterfaceC8754[] mo5713() {
        return new InterfaceC8754[]{EnumC9393.STUCK};
    }

    @Override // l.AbstractC9460
    /* renamed from: ֫ */
    public final Collection mo5710(InterfaceC8754 interfaceC8754) {
        if (interfaceC8754 == EnumC9393.STUCK) {
            return this.f76719;
        }
        throw new IllegalStateException();
    }

    @Override // l.AbstractC0286
    /* renamed from: ܿ */
    public final Iterable mo1628() {
        return this.f76719;
    }
}

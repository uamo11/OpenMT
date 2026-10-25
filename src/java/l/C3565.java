package l;

import java.util.EnumSet;

/* compiled from: Z5U8 */
/* renamed from: l.ۗ᩻۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3565 extends AbstractC20708 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f11312;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3565(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, EnumSet enumSet) {
        super(c20002, abstractC10370, enumC16970, enumSet);
        this.f11312 = c20002;
    }

    @Override // l.AbstractC20708
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo10868(EnumC6596 enumC6596) {
        return super.mo10868(enumC6596) && this.f11312.f64747;
    }

    @Override // l.AbstractC20708
    /* renamed from: ֫ */
    public final void mo2858(int i, AbstractC5698 abstractC5698) {
        if (abstractC5698.f17559 == EnumC1296.f4582) {
            AbstractC5698 abstractC56982 = abstractC5698.f17561;
            if (abstractC56982.f17559 == EnumC1296.f4568) {
                EnumSet enumSet = ((C0052) abstractC56982).f915;
                char m46124 = this.f11312.m46124();
                EnumSet noneOf = EnumSet.noneOf(EnumC19104.class);
                for (EnumC19104 enumC19104 : EnumC19104.values()) {
                    if ((enumC19104.f60184 & m46124) != 0) {
                        noneOf.add(enumC19104);
                    }
                }
                enumSet.addAll(noneOf);
            }
        }
    }
}

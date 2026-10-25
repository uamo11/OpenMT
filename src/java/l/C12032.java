package l;

import java.util.EnumSet;

/* compiled from: Z5U8 */
/* renamed from: l.ۨ᩻۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12032 extends AbstractC20708 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f35997;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12032(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, EnumSet enumSet) {
        super(c20002, abstractC10370, enumC16970, enumSet);
        this.f35997 = c20002;
    }

    @Override // l.AbstractC20708
    /* renamed from: ֫ */
    public final void mo2858(int i, AbstractC5698 abstractC5698) {
        C20002 c20002 = this.f35997;
        Object m46281 = c20002.f64767.m46281(c20002.m46124());
        if ((abstractC5698.mo16084() & 16) == 0) {
            return;
        }
        C12048 c12048 = (C12048) abstractC5698;
        switch (C10621.f31902[c12048.f17560.mo3258().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                m29395(c12048, Integer.class, m46281);
                break;
            case 6:
                m29395(c12048, Long.class, m46281);
                break;
            case 7:
                m29395(c12048, Float.class, m46281);
                break;
            case 8:
                m29395(c12048, Double.class, m46281);
                break;
            case 9:
                AbstractC4308 abstractC4308 = c12048.f17560;
                if (abstractC4308.f13890 == c20002.f64770.f66533.f13890) {
                    m29395(c12048, String.class, m46281);
                    break;
                } else {
                    throw c20002.m46116("bad.constant.value.type", abstractC4308);
                }
            default:
                return;
        }
        if ((m46281 instanceof Integer) && !c12048.f17560.mo3258().m24296(((Integer) m46281).intValue())) {
            throw c20002.m46116("bad.constant.range", m46281, c12048, c12048.f17560);
        }
        c12048.m29421(m46281);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29395(AbstractC5698 abstractC5698, Class cls, Object obj) {
        if (!cls.isInstance(obj)) {
            throw this.f35997.m46116("bad.constant.value", obj, abstractC5698, cls.getSimpleName());
        }
    }
}

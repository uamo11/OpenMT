package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.function.Predicate;

/* compiled from: 542M */
/* renamed from: l.ᩴ۬֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18770 implements Predicate {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f59280;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15240 f59281;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19285.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo4928negate() {
        return C19285.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19285.$default$or(this, predicate);
    }

    public C18770(C15240 c15240, AbstractC4308 abstractC4308) {
        this.f59281 = c15240;
        this.f59280 = abstractC4308;
    }

    @Override // java.util.function.Predicate
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final boolean test(AbstractC5698 abstractC5698) {
        C6319 c6319;
        if (abstractC5698.f17559 != EnumC1296.f4571 || (abstractC5698.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) != 0) {
            return false;
        }
        long mo16084 = abstractC5698.mo16084() & 4398046511104L;
        AbstractC4308 abstractC4308 = this.f59280;
        if (mo16084 != 0 && abstractC5698.f17561 == abstractC4308.f13890) {
            return false;
        }
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        c6319 = this.f59281.f46788;
        return abstractC5698.mo10961((AbstractC5698) abstractC19810, c6319) && !abstractC5698.m16075();
    }
}

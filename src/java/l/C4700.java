package l;

/* compiled from: 0B0D */
/* renamed from: l.ۙܳۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C4700 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            c23525.m51981();
            return;
        }
        if (!(number instanceof Float)) {
            number = Float.valueOf(number.floatValue());
        }
        c23525.m51975(number);
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        return Float.valueOf((float) c17175.m40407());
    }
}

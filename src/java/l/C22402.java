package l;

/* compiled from: 688Y */
/* renamed from: l.᩹ܽۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22402 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            c23525.m51981();
            return;
        }
        double doubleValue = number.doubleValue();
        C12524.m30725(doubleValue);
        c23525.m51973(doubleValue);
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        if (c17175.m40398() == EnumC14352.NULL) {
            c17175.m40394();
            return null;
        }
        return Double.valueOf(c17175.m40407());
    }
}

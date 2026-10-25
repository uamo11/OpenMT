package l;

/* compiled from: SLZ */
/* renamed from: l.֨ܳᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C1185 {
    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Float m4005(AbstractC2681 abstractC2681, Integer num, Float f) {
        int intValue = num.intValue();
        boolean mo21825 = abstractC2681.mo21825(intValue);
        float mo8401 = abstractC2681.mo8401(f.floatValue(), intValue);
        if (mo21825) {
            return Float.valueOf(mo8401);
        }
        return null;
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Float m4006(AbstractC2681 abstractC2681, Object obj) {
        if (obj == null) {
            return null;
        }
        int intValue = ((Integer) obj).intValue();
        float f = abstractC2681.get(intValue);
        if (f != abstractC2681.mo8402() || abstractC2681.mo21825(intValue)) {
            return Float.valueOf(f);
        }
        return null;
    }

    @Deprecated
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Float m4007(AbstractC2681 abstractC2681, Object obj) {
        if (obj == null) {
            return null;
        }
        int intValue = ((Integer) obj).intValue();
        if (abstractC2681.mo21825(intValue)) {
            return Float.valueOf(abstractC2681.remove(intValue));
        }
        return null;
    }
}

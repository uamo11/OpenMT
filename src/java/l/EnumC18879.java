package l;

/* compiled from: A451 */
/* renamed from: l.ᩴܽ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum EnumC18879 {
    STATIC,
    NON_STATIC,
    BOTH,
    UNDEFINED;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC18879 m43594(AbstractC5698 abstractC5698) {
        return abstractC5698.mo15572() ? STATIC : NON_STATIC;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC18879 m43595(EnumC18879 enumC18879, EnumC18879 enumC188792) {
        EnumC18879 enumC188793 = UNDEFINED;
        return enumC18879 == enumC188793 ? enumC188792 : (enumC188792 == enumC188793 || enumC18879 == enumC188792) ? enumC18879 : BOTH;
    }
}

package l;

/* compiled from: W5BJ */
/* renamed from: l.᩺᩹ۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23275 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11987 m51589(int i) {
        return new C11987(Integer.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10576 m51587(C18274 c18274, AbstractC18980 abstractC18980, String str) {
        return new C10576(EnumC1340.ADD, c18274, abstractC18980, str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C10576 m51590(C18274 c18274, AbstractC18980 abstractC18980, String str) {
        switch (str) {
            case "D":
                return new C10576(EnumC1340.DDIV, c18274, abstractC18980, str);
            case "F":
                return new C10576(EnumC1340.FDIV, c18274, abstractC18980, str);
            case "I":
                return new C10576(EnumC1340.IDIV, c18274, abstractC18980, str);
            case "J":
                return new C10576(EnumC1340.LDIV, c18274, abstractC18980, str);
            default:
                throw new RuntimeException("type must set to one of I/J/F/D");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11219 m51588(AbstractC8396[] abstractC8396Arr, String[] strArr, String str) {
        return new C11219(EnumC1340.INVOKE_NEW, abstractC8396Arr, str, "<init>", strArr, str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C10576 m51591(C18274 c18274, AbstractC18980 abstractC18980, String str) {
        return new C10576(EnumC1340.MUL, c18274, abstractC18980, str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C10576 m51593(C18274 c18274, AbstractC18980 abstractC18980, String str) {
        return new C10576(EnumC1340.REM, c18274, abstractC18980, str);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C10576 m51592(C18274 c18274, AbstractC18980 abstractC18980, String str) {
        return new C10576(EnumC1340.SUB, abstractC18980, c18274, str);
    }
}

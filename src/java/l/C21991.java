package l;

import java.util.logging.Logger;

/* compiled from: 99PI */
/* renamed from: l.᩹ۖۖ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21991 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70406 = 0;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Logger f70408 = Logger.getLogger(C21991.class.getName());

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int[] f70412 = new int[0];

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C17757[] f70409 = new C17757[0];

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C0117[] f70413 = new C0117[0];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C9291[] f70411 = new C9291[0];

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C21286[] f70415 = new C21286[0];

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C14934[] f70410 = new C14934[0];

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f70407 = new ConcurrentMapC10942();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile C10888 f70414 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5969 m49474(EnumC3478 enumC3478) {
        int i = C10888.f32724;
        int i2 = C10702.f32217;
        C16114 c16114 = C23897.f77257;
        if (f70414 == null) {
            synchronized (C21991.class) {
                if (f70414 == null) {
                    try {
                        C1570 m5384 = C1570.m5384();
                        m5384.m5386(C23897.f77257);
                        f70414 = C10888.m27184("\n\u001d\u0018æ\u0007\"\u0003Ê>\u0000*\u0013\b\u0001\u0010\u0002\u0018\u0002 \u0003(\u00010\u0002Ê>\u0004\b\u0001\u0010\u0001\n\u001d\u0018ç\u0007\"\u0003Ê>\u0000*\u0013\b\u0002\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001Ê>\u0004\b\u0000\u0010\u0001\n\u001d\u0018è\u0007\"\u0013\b\u0001\u0010\u0001\u0018\u0001 \u0002(\u00010\u0001Ê>\u0004\b\u0000\u0010\u0001*\u0003Ê>\u0000 æ\u0007(è\u0007".getBytes(C13997.f41723), m5384);
                    } catch (Exception e) {
                        throw new AssertionError(e);
                    }
                }
            }
        }
        C10888 c10888 = f70414;
        if (enumC3478.getNumber() < c10888.m27191().getNumber()) {
            throw new IllegalArgumentException("Edition " + enumC3478 + " is lower than the minimum supported edition " + c10888.m27191() + "!");
        }
        if (enumC3478.getNumber() > c10888.m27193().getNumber()) {
            throw new IllegalArgumentException("Edition " + enumC3478 + " is greater than the maximum supported edition " + c10888.m27193() + "!");
        }
        C1715 c1715 = null;
        for (C1715 c17152 : c10888.m27189()) {
            if (c17152.m5752().getNumber() > enumC3478.getNumber()) {
                break;
            }
            c1715 = c17152;
        }
        if (c1715 == null) {
            throw new IllegalArgumentException("Edition " + enumC3478 + " does not have a valid default FeatureSet!");
        }
        C0324 builder = c1715.m5756().toBuilder();
        builder.m1732(c1715.m5754());
        return builder.build();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5969 m49475(C5969 c5969) {
        C5969 c59692 = (C5969) f70407.putIfAbsent(Integer.valueOf(c5969.hashCode()), c5969);
        return c59692 == null ? c5969 : c59692;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m49472(C5057 c5057, C17757 c17757, String str) {
        if (c17757 != null) {
            return c17757.mo1141() + '.' + str;
        }
        String m14580 = c5057.m14580();
        if (m14580.isEmpty()) {
            return str;
        }
        return m14580 + '.' + str;
    }
}

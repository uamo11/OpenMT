package l;

/* compiled from: U8CE */
/* renamed from: l.֨֨ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0782 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double f2887;

    static {
        Math.log(10.0d);
        f2887 = 440.0d;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m2988(double d) {
        return ((Math.log(d / f2887) * 12.0d) / Math.log(2.0d)) + 69.0d;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static double m2989(double d) {
        return Math.pow(2.0d, (d - 69.0d) * 0.08333333333333333d) * f2887;
    }
}

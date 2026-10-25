package bin.mt.plus;

/* loaded from: classes.dex */
public class Features2 {
    public static native int init(String str, String str2, String str3, String str4);

    public static native int installSeccomp(int i);

    static {
        System.loadLibrary("mt2");
    }
}

package l;

import org.bouncycastle.crypto.engines.ThreefishEngine;

/* compiled from: B6NC */
/* renamed from: l.֨ۛۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC0932 extends AbstractC9637 {
    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m3348() {
        int mo6203 = this.f29208.mo6203(1);
        if (mo6203 == 26 || mo6203 == 30 || mo6203 == 38 || mo6203 == 45 || mo6203 == 47) {
            return false;
        }
        switch (mo6203) {
            case 57:
            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
            case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m3347(C20689 c20689) {
        int size = c20689.m23037(C3755.class).size();
        if (size == 0) {
            if (c20689.f27156.getType() != 56) {
                return false;
            }
        } else {
            int type = ((C3755) c20689.m23039(C3755.class, size - 1)).f27156.getType();
            if (type != 47 && type != 26) {
                return false;
            }
        }
        return true;
    }
}

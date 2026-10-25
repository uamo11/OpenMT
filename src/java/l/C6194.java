package l;

import com.google.android.material.motion.MotionUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: 057Y */
/* renamed from: l.ۛܿ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6194 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f19000;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f19001;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f19002;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f19003;

    public C6194(int i, int i2, byte[] bArr) {
        this(-1L, bArr, i, i2);
    }

    public C6194(long j, byte[] bArr, int i, int i2) {
        this.f19002 = i;
        this.f19003 = i2;
        this.f19001 = j;
        this.f19000 = bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6194 m17114(int i, ByteOrder byteOrder) {
        int[] iArr;
        iArr = C7605.f23510;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[iArr[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) new int[]{i}[0]);
        return new C6194(3, 1, wrap.array());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6194 m17115(long j, ByteOrder byteOrder) {
        int[] iArr;
        long[] jArr = {j};
        iArr = C7605.f23510;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[iArr[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new C6194(4, 1, wrap.array());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6194 m17116(String str) {
        Charset charset;
        String concat = str.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        charset = C7605.f23501;
        byte[] bytes = concat.getBytes(charset);
        return new C6194(2, bytes.length, bytes);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6194 m17117(C23127 c23127, ByteOrder byteOrder) {
        int[] iArr;
        C23127[] c23127Arr = {c23127};
        iArr = C7605.f23510;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[iArr[5]]);
        wrap.order(byteOrder);
        C23127 c231272 = c23127Arr[0];
        wrap.putInt((int) c231272.f74374);
        wrap.putInt((int) c231272.f74373);
        return new C6194(5, 1, wrap.array());
    }

    public final String toString() {
        String[] strArr;
        StringBuilder sb = new StringBuilder(MotionUtils.EASING_TYPE_FORMAT_START);
        strArr = C7605.f23504;
        sb.append(strArr[this.f19002]);
        sb.append(", data length:");
        return C3200.m9831(this.f19000.length, MotionUtils.EASING_TYPE_FORMAT_END, sb);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:81|(2:83|(2:84|(2:86|(2:89|90)(1:88))(2:91|92)))|93|(2:95|(6:104|105|106|107|108|109)(3:97|(2:99|100)(2:102|103)|101))|112|106|107|108|109) */
    /* JADX WARN: Type inference failed for: r12v18, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v19, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.io.Serializable, l.᩺ܿ֫[]] */
    /* JADX WARN: Type inference failed for: r12v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v22, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v23, types: [java.io.Serializable, l.᩺ܿ֫[]] */
    /* JADX WARN: Type inference failed for: r12v24, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r12v25, types: [double[], java.io.Serializable] */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m17121(java.nio.ByteOrder r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6194.m17121(java.nio.ByteOrder):java.io.Serializable");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m17118(ByteOrder byteOrder) {
        Object m17121 = m17121(byteOrder);
        if (m17121 == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (m17121 instanceof String) {
            return Double.parseDouble((String) m17121);
        }
        if (m17121 instanceof long[]) {
            if (((long[]) m17121).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (m17121 instanceof int[]) {
            if (((int[]) m17121).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (m17121 instanceof double[]) {
            double[] dArr = (double[]) m17121;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (m17121 instanceof C23127[]) {
            C23127[] c23127Arr = (C23127[]) m17121;
            if (c23127Arr.length == 1) {
                C23127 c23127 = c23127Arr[0];
                return c23127.f74374 / c23127.f74373;
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a double value");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m17119(ByteOrder byteOrder) {
        Object m17121 = m17121(byteOrder);
        if (m17121 == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (m17121 instanceof String) {
            return Integer.parseInt((String) m17121);
        }
        if (m17121 instanceof long[]) {
            long[] jArr = (long[]) m17121;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (m17121 instanceof int[]) {
            int[] iArr = (int[]) m17121;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        throw new NumberFormatException("Couldn't find a integer value");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m17120(ByteOrder byteOrder) {
        Object m17121 = m17121(byteOrder);
        if (m17121 == null) {
            return null;
        }
        if (m17121 instanceof String) {
            return (String) m17121;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (m17121 instanceof long[]) {
            long[] jArr = (long[]) m17121;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (m17121 instanceof int[]) {
            int[] iArr = (int[]) m17121;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (m17121 instanceof double[]) {
            double[] dArr = (double[]) m17121;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(m17121 instanceof C23127[])) {
            return null;
        }
        C23127[] c23127Arr = (C23127[]) m17121;
        while (i < c23127Arr.length) {
            sb.append(c23127Arr[i].f74374);
            sb.append('/');
            sb.append(c23127Arr[i].f74373);
            i++;
            if (i != c23127Arr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
}

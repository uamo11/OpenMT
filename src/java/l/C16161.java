package l;

import android.graphics.Path;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BaseSlider;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.logging.Level;
import java.util.logging.Logger;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.pqc.math.ntru.HRSS1373Polynomial;

/* compiled from: RBJM */
/* renamed from: l.ܺ᩶ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16161 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Logger f49782 = Logger.getLogger("VdNodeRender");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38094(C2757[] c2757Arr, Path path) {
        int i;
        int i2;
        float[] fArr;
        int i3;
        int i4;
        float[] fArr2;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        C2757[] c2757Arr2 = c2757Arr;
        Path path2 = path;
        float[] fArr3 = new float[6];
        int length = c2757Arr2.length;
        char c = ' ';
        int i5 = 0;
        while (i5 < length) {
            C2757 c2757 = c2757Arr2[i5];
            char m8520 = c2757.m8520();
            float[] m8519 = c2757.m8519();
            float f7 = fArr3[0];
            float f8 = fArr3[1];
            float f9 = fArr3[2];
            float f10 = fArr3[3];
            float f11 = fArr3[4];
            float f12 = fArr3[5];
            switch (m8520) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case q.f /* 99 */:
                    i = 6;
                    break;
                case 'H':
                case HRSS1373Polynomial.K /* 86 */:
                case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    f7 = f11;
                    f8 = f12;
                default:
                    i = 2;
                    break;
            }
            float f13 = f7;
            float f14 = f8;
            float f15 = f11;
            float f16 = f12;
            int i6 = 0;
            while (i6 < m8519.length) {
                switch (m8520) {
                    case 'A':
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        int i7 = i2 + 5;
                        int i8 = i2 + 6;
                        m38093(path, f13, f14, fArr[i7], fArr[i8], Math.abs(fArr[i2]), Math.abs(fArr[i2 + 1]), fArr[i2 + 2], fArr[i2 + 3] != 0.0f, fArr[i2 + 4] != 0.0f);
                        f9 = fArr[i7];
                        f13 = f9;
                        f10 = fArr[i8];
                        f14 = f10;
                        break;
                    case 'C':
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        int i9 = i2 + 2;
                        int i10 = i2 + 3;
                        int i11 = i2 + 4;
                        int i12 = i2 + 5;
                        path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i9], fArr[i10], fArr[i11], fArr[i12]);
                        float f17 = fArr[i11];
                        float f18 = fArr[i12];
                        float f19 = fArr[i9];
                        f10 = fArr[i10];
                        f13 = f17;
                        f14 = f18;
                        f9 = f19;
                        break;
                    case 'H':
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        f = f14;
                        path2.lineTo(fArr[i2], f);
                        f13 = fArr[i2];
                        f14 = f;
                        break;
                    case WXMediaMessage.IMediaObject.TYPE_MUSIC_VIDEO /* 76 */:
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        f2 = fArr[i2];
                        f3 = fArr[i2 + 1];
                        path2.lineTo(f2, f3);
                        f13 = f2;
                        f14 = f3;
                        break;
                    case 'M':
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        f2 = fArr[i2];
                        f3 = fArr[i2 + 1];
                        if (i2 > 0) {
                            path2.lineTo(f2, f3);
                            f13 = f2;
                            f14 = f3;
                            break;
                        } else {
                            path2.moveTo(f2, f3);
                            f13 = f2;
                            f15 = f13;
                            f14 = f3;
                            f16 = f14;
                            break;
                        }
                    case 'Q':
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        int i13 = i2 + 1;
                        int i14 = i2 + 2;
                        int i15 = i2 + 3;
                        path2.quadTo(fArr[i2], fArr[i13], fArr[i14], fArr[i15]);
                        f13 = fArr[i14];
                        f14 = fArr[i15];
                        f9 = fArr[i2];
                        f10 = fArr[i13];
                        break;
                    case BaseSlider.DEFAULT_LABEL_ANIMATION_ENTER_DURATION /* 83 */:
                        float f20 = f14;
                        i2 = i6;
                        fArr = m8519;
                        float f21 = f13;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        boolean z = c == 'c' || c == 's' || c == 'C' || c == 'S';
                        float f22 = z ? (f21 * 2.0f) - f9 : f21;
                        int i16 = i2 + 1;
                        int i17 = i2 + 2;
                        int i18 = i2 + 3;
                        path.cubicTo(f22, z ? (f20 * 2.0f) - f10 : f20, fArr[i2], fArr[i16], fArr[i17], fArr[i18]);
                        float f23 = fArr[i2];
                        float f24 = fArr[i16];
                        float f25 = fArr[i17];
                        f = fArr[i18];
                        f13 = f25;
                        f9 = f23;
                        f10 = f24;
                        f14 = f;
                        break;
                    case 'T':
                        float f26 = f14;
                        i2 = i6;
                        fArr = m8519;
                        float f27 = f13;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        boolean z2 = c == 'q' || c == 't' || c == 'Q' || c == 'T';
                        float f28 = z2 ? (f27 * 2.0f) - f9 : f27;
                        float f29 = z2 ? (f26 * 2.0f) - f10 : f26;
                        int i19 = i2 + 1;
                        path2.quadTo(f28, f29, fArr[i2], fArr[i19]);
                        f2 = fArr[i2];
                        f3 = fArr[i19];
                        f10 = f29;
                        f9 = f28;
                        f13 = f2;
                        f14 = f3;
                        break;
                    case HRSS1373Polynomial.K /* 86 */:
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        path.lineTo(f13, fArr[i2]);
                        f3 = fArr[i2];
                        f14 = f3;
                        break;
                    case 'Z':
                    case 'z':
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        path.close();
                        f13 = f15;
                        f14 = f16;
                        break;
                    case 'a':
                        int i20 = i6 + 5;
                        int i21 = i6 + 6;
                        float f30 = f13;
                        i3 = length;
                        i4 = i5;
                        i2 = i6;
                        fArr = m8519;
                        fArr2 = fArr3;
                        m38093(path, f13, f14, m8519[i20] + f13, m8519[i21] + f14, Math.abs(m8519[i6]), Math.abs(m8519[i6 + 1]), m8519[i6 + 2], m8519[i6 + 3] != 0.0f, m8519[i6 + 4] != 0.0f);
                        f13 = f30 + fArr[i20];
                        f14 += fArr[i21];
                        f10 = f14;
                        f9 = f13;
                        break;
                    case q.f /* 99 */:
                        int i22 = i6 + 2;
                        int i23 = i6 + 3;
                        int i24 = i6 + 4;
                        int i25 = i6 + 5;
                        path.cubicTo(m8519[i6] + f13, m8519[i6 + 1] + f14, m8519[i22] + f13, m8519[i23] + f14, m8519[i24] + f13, m8519[i25] + f14);
                        f4 = m8519[i22] + f13;
                        f5 = m8519[i23] + f14;
                        f13 += m8519[i24];
                        f6 = m8519[i25];
                        f14 += f6;
                        f9 = f4;
                        f10 = f5;
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        break;
                    case IShizukuService.Stub.TRANSACTION_isHidden /* 104 */:
                        f13 += m8519[i6];
                        path2.lineTo(f13, f14);
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        break;
                    case 'l':
                        f13 += m8519[i6];
                        f14 += m8519[i6 + 1];
                        path2.lineTo(f13, f14);
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        break;
                    case 'm':
                        f13 += m8519[i6];
                        f14 += m8519[i6 + 1];
                        if (i6 > 0) {
                            path2.lineTo(f13, f14);
                            i2 = i6;
                            fArr = m8519;
                            i3 = length;
                            i4 = i5;
                            fArr2 = fArr3;
                            break;
                        } else {
                            path2.moveTo(f13, f14);
                            f16 = f14;
                            i2 = i6;
                            fArr = m8519;
                            f15 = f13;
                            i3 = length;
                            i4 = i5;
                            fArr2 = fArr3;
                        }
                    case UMErrorCode.E_UM_BE_RAW_OVERSIZE /* 113 */:
                        int i26 = i6 + 1;
                        int i27 = i6 + 2;
                        int i28 = i6 + 3;
                        path2.quadTo(m8519[i6] + f13, m8519[i26] + f14, m8519[i27] + f13, m8519[i28] + f14);
                        f4 = m8519[i6] + f13;
                        f5 = m8519[i26] + f14;
                        f13 += m8519[i27];
                        f6 = m8519[i28];
                        f14 += f6;
                        f9 = f4;
                        f10 = f5;
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        break;
                    case 's':
                        boolean z3 = c == 'c' || c == 's' || c == 'C' || c == 'S';
                        int i29 = i6 + 1;
                        int i30 = i6 + 2;
                        int i31 = i6 + 3;
                        path.cubicTo(z3 ? (f13 * 2.0f) - f9 : f13, z3 ? (2.0f * f14) - f10 : f14, f13 + m8519[i6], f14 + m8519[i29], f13 + m8519[i30], f14 + m8519[i31]);
                        f4 = m8519[i6] + f13;
                        f5 = m8519[i29] + f14;
                        f13 += m8519[i30];
                        f6 = m8519[i31];
                        f14 += f6;
                        f9 = f4;
                        f10 = f5;
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        break;
                    case 't':
                        boolean z4 = c == 'q' || c == 't' || c == 'Q' || c == 'T';
                        float f31 = z4 ? (f13 * 2.0f) - f9 : f13;
                        float f32 = z4 ? (2.0f * f14) - f10 : f14;
                        int i32 = i6 + 1;
                        path2.quadTo(f31, f32, m8519[i6] + f13, m8519[i32] + f14);
                        f13 += m8519[i6];
                        f14 += m8519[i32];
                        f10 = f32;
                        f9 = f31;
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        break;
                    case 'v':
                        f14 += m8519[i6];
                        path2.lineTo(f13, f14);
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        break;
                    default:
                        i2 = i6;
                        fArr = m8519;
                        i3 = length;
                        i4 = i5;
                        fArr2 = fArr3;
                        break;
                }
                i6 = i2 + i;
                path2 = path;
                c = m8520;
                length = i3;
                m8519 = fArr;
                i5 = i4;
                fArr3 = fArr2;
            }
            float[] fArr4 = fArr3;
            fArr4[0] = f13;
            fArr4[1] = f14;
            fArr4[2] = f9;
            fArr4[3] = f10;
            fArr4[4] = f15;
            fArr4[5] = f16;
            c = c2757.m8520();
            i5++;
            c2757Arr2 = c2757Arr;
            path2 = path;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38093(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        Level level = Level.FINE;
        String str = MotionUtils.EASING_TYPE_FORMAT_START + d + "," + d2 + ")-(" + d3 + "," + d4 + ") {" + d5 + " " + d6 + l.d;
        Logger logger = f49782;
        logger.log(level, str);
        double d10 = (d7 * 3.141592653589793d) / 180.0d;
        double cos = Math.cos(d10);
        double sin = Math.sin(d10);
        double m12787 = C4248.m12787(d2, sin, d * cos, d5);
        double m127872 = C4248.m12787(d2, cos, (-d) * sin, d6);
        double m127873 = C4248.m12787(d4, sin, d3 * cos, d5);
        double m127874 = C4248.m12787(d4, cos, (-d3) * sin, d6);
        logger.log(level, "unit space (" + m12787 + "," + m127872 + ")-(" + m127873 + "," + m127874 + MotionUtils.EASING_TYPE_FORMAT_END);
        double d11 = m12787 - m127873;
        double d12 = m127872 - m127874;
        double d13 = (m12787 + m127873) / 2.0d;
        double d14 = (m127872 + m127874) / 2.0d;
        double d15 = (d12 * d12) + (d11 * d11);
        if (d15 == 0.0d) {
            logger.log(level, " Points are coincident");
            return;
        }
        double d16 = (1.0d / d15) - 0.25d;
        if (d16 < 0.0d) {
            logger.log(level, "Points are too far apart " + d15);
            double sqrt = Math.sqrt(d15) / 1.99999d;
            m38093(path, d, d2, d3, d4, d5 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double d17 = d5;
        double sqrt2 = Math.sqrt(d16);
        double d18 = d11 * sqrt2;
        double d19 = sqrt2 * d12;
        if (z == z2) {
            d8 = d13 - d19;
            d9 = d14 + d18;
        } else {
            d8 = d13 + d19;
            d9 = d14 - d18;
        }
        double d20 = m127872 - d9;
        double d21 = m12787 - d8;
        double atan2 = Math.atan2(d20, d21);
        logger.log(level, "eta0 = Math.atan2(" + d20 + ", " + d21 + ") = " + Math.toDegrees(atan2));
        double d22 = m127874 - d9;
        double d23 = m127873 - d8;
        double atan22 = Math.atan2(d22, d23);
        logger.log(level, "eta1 = Math.atan2(" + d22 + ", " + d23 + ") = " + Math.toDegrees(atan22));
        double d24 = atan22 - atan2;
        if (z2 != (d24 >= 0.0d)) {
            d24 = d24 > 0.0d ? d24 - 6.283185307179586d : d24 + 6.283185307179586d;
        }
        double d25 = d8 * d17;
        double d26 = d9 * d6;
        double d27 = (d25 * cos) - (d26 * sin);
        double d28 = (d26 * cos) + (d25 * sin);
        logger.log(level, "cx = " + d27 + ", cy = " + d28 + ", a = " + d17 + ", b = " + d6 + ", x0 = " + d + ", y0 = " + d2 + ", thetaD = " + Math.toDegrees(d10) + ", eta0 = " + Math.toDegrees(atan2) + ", sweep = " + Math.toDegrees(d24));
        int ceil = (int) Math.ceil(Math.abs((d24 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(d10);
        double sin2 = Math.sin(d10);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d29 = -d17;
        double d30 = d29 * cos2;
        double d31 = d6 * sin2;
        double d32 = (d30 * sin3) - (d31 * cos3);
        double d33 = d29 * sin2;
        double d34 = d6 * cos2;
        double d35 = (cos3 * d34) + (sin3 * d33);
        double d36 = d24 / ((double) ceil);
        int i = 0;
        double d37 = atan2;
        double d38 = d32;
        double d39 = d35;
        double d40 = d2;
        while (i < ceil) {
            double d41 = d37 + d36;
            double sin4 = Math.sin(d41);
            double cos4 = Math.cos(d41);
            double d42 = d27;
            double d43 = (((d17 * cos2) * cos4) + d27) - (d31 * sin4);
            double d44 = (d34 * sin4) + (d17 * sin2 * cos4) + d28;
            double d45 = (d30 * sin4) - (d31 * cos4);
            double d46 = (cos4 * d34) + (sin4 * d33);
            double d47 = d41 - d37;
            double tan = Math.tan(d47 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d47)) / 3.0d;
            path.cubicTo((float) ((d38 * sqrt3) + d), (float) ((d39 * sqrt3) + d40), (float) (d43 - (sqrt3 * d45)), (float) (d44 - (sqrt3 * d46)), (float) d43, (float) d44);
            i++;
            ceil = ceil;
            d34 = d34;
            d17 = d5;
            d33 = d33;
            d = d43;
            cos2 = cos2;
            d37 = d41;
            d39 = d46;
            d38 = d45;
            d27 = d42;
            d40 = d44;
            d28 = d28;
        }
    }
}

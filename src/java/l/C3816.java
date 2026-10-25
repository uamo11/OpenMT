package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: IAZ0 */
/* renamed from: l.ۘ۠ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C3816 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String f12023;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static Object f12024;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Method f12025;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static Class f12026;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Field f12027;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean f12028;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f12029;

    /* renamed from: ᩵ۢ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f12030 = {3660, 8284, 8280, 8260, 8280, 8223, 8274, 8286, 8287, 8261, 8276, 8287, 8261, 8223, 8259, 8276, 8258, 8223, 8312, 8274, 8286, 8287, 8306, 8260, 8258, 8261, 8286, 8284, 8280, 8267, 8276, 8259, 8272, 8287, 8277, 8259, 8286, 8280, 8277, 8223, 8272, 8257, 8257, 8223, 8304, 8257, 8257, 8285, 8280, 8274, 8272, 8261, 8280, 8286, 8287, 8289, 8272, 8274, 8282, 8272, 8278, 8276, 8316, 8272, 8287, 8272, 8278, 8276, 8259, 8274, 8285, 8276, 8272, 8259, 8306, 8272, 8274, 8281, 8276, 8291, 8276, 8258, 8286, 8260, 8259, 8274, 8276, 8319, 8272, 8284, 8276, 8291, 8276, 8258, 8286, 8260, 8259, 8274, 8276, 8319, 8272, 8284, 8276, 8209, 8274, 8285, 8272, 8258, 8258, 8209, 8287, 8286, 8261, 8209, 8279, 8286, 8260, 8287, 8277, 8258, 8290, 8264, 8287, 8274, 8258, 8312, 8274, 8286, 8287, 8306, 8272, 8274, 8281, 8276};

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] f12031;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Constructor f12032;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo11503(int i, String str) {
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo11504(int i, C11572 c11572) {
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo11506(C11572 c11572) {
        throw null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo11507(int i, C11572 c11572) {
        throw null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo11508(C11572 c11572) {
        throw null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo11509(int i, C11572 c11572) {
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m11501() {
        short s = f12030[0];
        int i = s + 18294;
        int i2 = (s * s) + 334670436;
        int i3 = (i2 + i2) - (i * i) < 0 ? 58233 : 8241;
        synchronized (C3816.class) {
            if (f12028) {
                return true;
            }
            if (f12029) {
                return false;
            }
            try {
                Method declaredMethod = Class.forName(C1773.m5917(f12030, 1, 31, i3)).getDeclaredMethod(RunnableC0588.m2436(f12030, 69, 10, i3), String.class);
                declaredMethod.setAccessible(true);
                f12025 = declaredMethod;
            } catch (Exception unused) {
            }
            try {
                Class<?> cls = Class.forName(C1420.m4902(f12030, 32, 37, i3));
                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                int length = declaredClasses.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    Class<?> cls2 = declaredClasses[i4];
                    if (C1294.m4369(cls2.getSimpleName(), C0630.m2575(f12030, 79, 12, i3))) {
                        f12026 = cls2;
                        break;
                    }
                    i4++;
                }
                Class cls3 = f12026;
                if (cls3 == null) {
                    throw new NoSuchFieldException(C2167.m7159(f12030, 91, 28, i3));
                }
                Constructor declaredConstructor = cls3.getDeclaredConstructor(String.class, Integer.TYPE);
                f12032 = declaredConstructor;
                declaredConstructor.setAccessible(true);
                Field declaredField = cls.getDeclaredField(C3911.m11919(f12030, 119, 5, i3));
                declaredField.setAccessible(true);
                f12024 = declaredField.get(null);
                Field declaredField2 = cls.getDeclaredField(C0714.m2816(f12030, 124, 10, i3));
                f12027 = declaredField2;
                declaredField2.setAccessible(true);
                f12028 = true;
                return true;
            } catch (Exception unused2) {
                f12029 = true;
                return false;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo11505(int i, C11572 c11572, String str, String str2, String str3) {
        int i2 = -1935911811;
        int i3 = C7811.f24123;
        int i4 = C2167.f7158;
        int m2566 = C0630.m2566("۟᩺") ^ i4;
        int i5 = ((m2566 ^ i3) * 23041) ^ 463062378;
        int i6 = -813675576;
        while (true) {
            i2 = ((((i2 ^ i3) * (-28663)) >> 31) & i5) ^ (m2566 ^ i6);
            switch (i2) {
                case -2070431199:
                case -377986301:
                    if (C0422.m1963()) {
                        m2566 = C0630.m2566("۬ۤ") ^ i4;
                        i5 = ((m2566 ^ i3) * 28635) ^ (-2082337454);
                        i6 = 1918209937;
                    } else {
                        m2566 = (C2105.m6981("᩺ۡ") + i3) * (-45);
                        i5 = ((m2566 ^ i4) * 19219) ^ (-2011294455);
                        i6 = 36331927;
                    }
                case -1912985319:
                case 621440114:
                    C2126.m7040();
                    if (ServiceConnectionC3453.f10921 >= 0) {
                        m2566 = (C2105.m6981("᩸᩺") ^ i3) * 101;
                        i5 = ((m2566 ^ i4) * 21505) ^ (-1873545209);
                        i6 = -1473985120;
                    } else {
                        m2566 = (C2105.m6981("᩺ۡ") + i3) * (-45);
                        i5 = ((m2566 ^ i4) * 19219) ^ (-2011294455);
                        i6 = 36331927;
                    }
                case -1810345161:
                case 1676813311:
                    C0237.m1481();
                    return;
                case -1771143772:
                case -633708896:
                    if (C3683.f11629 >= 0) {
                        m2566 = (C2105.m6981("᩸᩺") ^ i3) * 101;
                        i5 = ((m2566 ^ i4) * 21505) ^ (-1873545209);
                        i6 = -1473985120;
                    } else {
                        m2566 = C0630.m2566("۟᩻") ^ i4;
                        i5 = ((m2566 ^ i3) * (-9745)) ^ (-570045756);
                        i6 = -404277045;
                    }
                case -1657714535:
                case -440164991:
                    C3537.m10746();
                    RunnableC1108.m3790();
                    m2566 = C0630.m2566("᩵ۖ") ^ i4;
                    i5 = ((m2566 ^ i3) * 21291) ^ (-1070258456);
                    i6 = -1163422504;
                case -1425809713:
                case -396993538:
                    if (RunnableC3474.f10992 <= 0) {
                        m2566 = (C2105.m6981("᩺ۡ") + i3) * (-45);
                        i5 = ((m2566 ^ i4) * 19219) ^ (-2011294455);
                        i6 = 36331927;
                    } else {
                        m2566 = C2105.m6981("ۛ۠") ^ i3;
                        i5 = ((m2566 ^ i4) * (-32271)) ^ 974819544;
                        i6 = -1540860986;
                    }
                case -1330178415:
                case 775403182:
                    if (C2126.m7040()) {
                        m2566 = C0630.m2566("᩵ۖ") ^ i4;
                        i5 = ((m2566 ^ i3) * 21291) ^ (-1070258456);
                        i6 = -1163422504;
                    } else {
                        m2566 = C0630.m2566("۫۫") ^ i3;
                        i5 = ((m2566 ^ i4) * (-2113)) ^ 372728960;
                        i6 = 2087015152;
                    }
                case -1326302394:
                case 1051810705:
                    if (C0382.f1805) {
                        m2566 = (C0630.m2566("ۢۡ") + i3) * UMErrorCode.E_UM_BE_RAW_OVERSIZE;
                        i5 = ((m2566 ^ i4) * 13963) ^ (-1980999212);
                        i6 = -968260988;
                    } else {
                        m2566 = (C2105.m6981("᩺ۡ") + i3) * (-45);
                        i5 = ((m2566 ^ i4) * 19219) ^ (-2011294455);
                        i6 = 36331927;
                    }
                case -1171146819:
                case -802123696:
                    if (C4117.f13076 > 0) {
                        m2566 = C0630.m2566("᩵ۖ") ^ i4;
                        i5 = ((m2566 ^ i3) * 21291) ^ (-1070258456);
                        i6 = -1163422504;
                    } else {
                        m2566 = C2105.m6981("ܰۤ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-27661)) ^ (-2121556089);
                        i6 = -712066928;
                    }
                case -1152619314:
                case -930386085:
                    if (C0964.m3413()) {
                        m2566 = C2105.m6981("ܽ᩻") ^ i4;
                        i5 = ((m2566 ^ i3) * (-29359)) ^ 1475332941;
                        i6 = 808326651;
                    } else {
                        m2566 = C2105.m6981("ܰۤ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-27661)) ^ (-2121556089);
                        i6 = -712066928;
                    }
                case -845853993:
                case -491368984:
                    if (C22628.f73083 <= 0) {
                        m2566 = C0630.m2566("᩺ᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-25719)) ^ 1279256691;
                        i6 = -1795561972;
                    } else {
                        m2566 = C0630.m2566("ۗᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * 5329) ^ 961057193;
                        i6 = 664688287;
                    }
                case -845306632:
                case 366497252:
                    if (C2272.f7362) {
                        m2566 = C2105.m6981("ܰۤ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-27661)) ^ (-2121556089);
                        i6 = -712066928;
                    } else {
                        m2566 = C0630.m2566("ۨܿ") ^ i4;
                        i5 = ((m2566 ^ i3) * 12343) ^ 689133477;
                        i6 = 1776371680;
                    }
                case -741600342:
                case 215535874:
                    if (ServiceConnectionC3453.f10921 < 0) {
                        m2566 = C0630.m2566("᩵ۖ") ^ i4;
                        i5 = ((m2566 ^ i3) * 21291) ^ (-1070258456);
                        i6 = -1163422504;
                    } else {
                        m2566 = (C2105.m6981("᩸᩺") ^ i3) * 101;
                        i5 = ((m2566 ^ i4) * 21505) ^ (-1873545209);
                        i6 = -1473985120;
                    }
                case -230414363:
                case 383133845:
                    if (C0630.f2410 <= 0) {
                        m2566 = C2105.m6981("ܰۤ") ^ i4;
                        i5 = ((m2566 ^ i3) * (-27661)) ^ (-2121556089);
                        i6 = -712066928;
                    } else {
                        m2566 = (C0630.m2566("֨᩷") + i3) * 45;
                        i5 = ((m2566 ^ i4) * 29597) ^ (-720289395);
                        i6 = -63288816;
                    }
                case 148887414:
                case 1306644130:
                    if (C2272.f7362) {
                        m2566 = C0630.m2566("᩺ᩳ") ^ i3;
                        i5 = ((m2566 ^ i4) * (-25719)) ^ 1279256691;
                        i6 = -1795561972;
                    } else {
                        m2566 = (C2105.m6981("֫ۧ") ^ i4) * (-119);
                        i5 = ((m2566 ^ i3) * 22531) ^ (-1874888065);
                        i6 = 152629102;
                    }
                default:
                    throw null;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m11502(int i, String str) {
        if (str == null || C1916.m6313(str) || !m11501()) {
            return;
        }
        Method method = f12025;
        if (method != null) {
            try {
                method.invoke(null, str);
            } catch (Exception unused) {
            }
        }
        try {
            Object newInstance = f12032.newInstance(str, C1420.m4916(i));
            synchronized (f12024) {
                Map map = (Map) f12027.get(null);
                if (map != null) {
                    map.remove(newInstance);
                }
            }
        } catch (Exception unused2) {
        }
    }
}

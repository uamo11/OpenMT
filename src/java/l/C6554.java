package l;

import java.util.Random;

/* compiled from: V6KB */
/* renamed from: l.ۜۚۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6554 implements InterfaceC3860, InterfaceC2452, InterfaceC21929, InterfaceC7520 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m18061(int i, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i - 1) + "…";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m18062(InterfaceC17889 interfaceC17889) {
        return interfaceC17889 != null && interfaceC17889.mo36969() && interfaceC17889.mo36971().startsWith("video/") && !C10062.m25249(interfaceC17889.getName());
    }

    @Override // l.InterfaceC2452
    /* renamed from: ֫ */
    public void mo1728(C16040 c16040) {
        int m29168 = ((C11955) c16040.m37919()).m29168();
        Random random = new Random();
        StringBuilder sb = new StringBuilder(m29168);
        sb.append(((random.nextInt() & 255) % 9) + 1);
        for (int i = 1; i < m29168; i++) {
            sb.append((random.nextInt() & 255) % 10);
        }
        C11955 c11955 = new C11955();
        c11955.m29155(sb.toString());
        c16040.m37918(c11955);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m18063(int i, String str) {
        if (str == null) {
            return null;
        }
        if (str.length() <= i) {
            return str;
        }
        return "…" + str.substring((str.length() - i) + 1);
    }

    @Override // l.InterfaceC21929
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object mo18064(float f, Float f2, Float f3) {
        float floatValue = f2.floatValue();
        return Float.valueOf(((f3.floatValue() - floatValue) * f) + floatValue);
    }

    @Override // l.InterfaceC7520
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC2148 mo18065(String str) {
        return C7087.f21789;
    }
}

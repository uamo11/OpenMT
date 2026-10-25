package l;

/* compiled from: D1JP */
/* renamed from: l.۫۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12273 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean[] f36562 = new boolean[3];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final boolean m29806(int i, int i2) {
        return (i & i2) == i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29805(C21446 c21446, C17212 c17212, C15094 c15094) {
        c15094.f46168 = -1;
        C5218 c5218 = c15094.f46126;
        C5218 c52182 = c15094.f46133;
        C5218 c52183 = c15094.f46161;
        C5218 c52184 = c15094.f46159;
        C5218 c52185 = c15094.f46141;
        c15094.f46130 = -1;
        EnumC8040 enumC8040 = c21446.f46124[0];
        EnumC8040 enumC80402 = EnumC8040.WRAP_CONTENT;
        if (enumC8040 != enumC80402 && c15094.f46124[0] == EnumC8040.MATCH_PARENT) {
            int i = c52185.f16343;
            int m35753 = c21446.m35753() - c52184.f16343;
            c52185.f16346 = c17212.m40495(c52185);
            c52184.f16346 = c17212.m40495(c52184);
            c17212.m40498(c52185.f16346, i);
            c17212.m40498(c52184.f16346, m35753);
            c15094.f46168 = 2;
            c15094.f46163 = i;
            int i2 = m35753 - i;
            c15094.f46169 = i2;
            int i3 = c15094.f46165;
            if (i2 < i3) {
                c15094.f46169 = i3;
            }
        }
        if (c21446.f46124[1] == enumC80402 || c15094.f46124[1] != EnumC8040.MATCH_PARENT) {
            return;
        }
        int i4 = c52183.f16343;
        int m35732 = c21446.m35732() - c52182.f16343;
        c52183.f16346 = c17212.m40495(c52183);
        c52182.f16346 = c17212.m40495(c52182);
        c17212.m40498(c52183.f16346, i4);
        c17212.m40498(c52182.f16346, m35732);
        if (c15094.f46164 > 0 || c15094.m35735() == 8) {
            C15800 m40495 = c17212.m40495(c5218);
            c5218.f16346 = m40495;
            c17212.m40498(m40495, c15094.f46164 + i4);
        }
        c15094.f46130 = 2;
        c15094.f46121 = i4;
        int i5 = m35732 - i4;
        c15094.f46110 = i5;
        int i6 = c15094.f46127;
        if (i5 < i6) {
            c15094.f46110 = i6;
        }
    }
}

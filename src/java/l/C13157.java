package l;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/* compiled from: E6SN */
/* renamed from: l.۬ܰᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13157 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float f39326;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f39327;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f39328;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f39329;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f39330;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f39331;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f39332;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f39333;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float f39334;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f39335;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f39336;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f39337;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f39338;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f39339;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f39340;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f39341;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Integer f39342;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f39343;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Integer f39344;

    public C13157(String str, String str2, int i, int i2, int i3, float f, float f2, float f3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Integer num, Integer num2) {
        this.f39332 = str;
        this.f39330 = str2;
        this.f39340 = i;
        this.f39341 = i2;
        this.f39327 = i3;
        this.f39326 = f;
        this.f39343 = z;
        this.f39334 = f2;
        this.f39329 = f3;
        this.f39338 = z2;
        this.f39339 = z3;
        this.f39333 = z4;
        this.f39337 = z5;
        this.f39336 = z6;
        this.f39335 = z7;
        this.f39331 = z8;
        this.f39328 = z9;
        this.f39342 = num;
        this.f39344 = num2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13157 m31884(ByteArrayInputStream byteArrayInputStream, long j, int i) {
        Integer num;
        Integer num2;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        C23930 m52696 = C23930.m52696(j, byteArrayInputStream);
        try {
            if (i < 0 || j > i) {
                throw new IOException("Legacy text config exceeds app state limit");
            }
            String m52708 = m52696.m52708(i);
            boolean m52703 = m52696.m52703();
            byte readByte = (byte) m52696.readByte();
            float intBitsToFloat = Float.intBitsToFloat(m52696.readInt());
            int m52704 = m52696.m52704();
            boolean m527032 = m52696.m52703();
            boolean m527033 = m52696.m52703();
            boolean m527034 = m52696.m52703();
            boolean m527035 = m52696.m52703();
            boolean m527036 = m52696.m52703();
            Integer num3 = null;
            String m527082 = m527036 ? m52696.m52708(i) : null;
            int readInt = m52696.m52707() == 0 ? 0 : m52696.readInt();
            if (readInt < 591749667) {
                m52696.m52706();
                num = null;
                num2 = null;
                f = 1.0f;
                f2 = 0.0f;
                z = false;
                z2 = false;
                z3 = false;
            } else {
                if (readInt > 591749672) {
                    throw new IOException("Unsupported legacy text config version");
                }
                boolean m527037 = m52696.m52703();
                boolean m527038 = readInt >= 591749669 ? m52696.m52703() : false;
                boolean m527039 = readInt >= 591749668 ? m52696.m52703() : false;
                Integer valueOf = (readInt < 591749670 || !m52696.m52703()) ? null : Integer.valueOf(m52696.readInt());
                if (readInt >= 591749671 && m52696.m52703()) {
                    num3 = Integer.valueOf(m52696.readInt());
                }
                if (readInt >= 591749672) {
                    float intBitsToFloat2 = Float.intBitsToFloat(m52696.readInt());
                    float intBitsToFloat3 = Float.intBitsToFloat(m52696.readInt());
                    if (intBitsToFloat2 < 0.8f || intBitsToFloat2 > 2.0f || intBitsToFloat3 < 0.0f || intBitsToFloat3 >= Float.POSITIVE_INFINITY) {
                        throw new IOException("Invalid line metrics");
                    }
                    num2 = num3;
                    z3 = m527039;
                    z = m527037;
                    z2 = m527038;
                    num = valueOf;
                    f2 = intBitsToFloat3;
                    f = intBitsToFloat2;
                } else {
                    num2 = num3;
                    z3 = m527039;
                    z = m527037;
                    z2 = m527038;
                    num = valueOf;
                    f = 1.0f;
                    f2 = 0.0f;
                }
            }
            m52696.m52709();
            C13157 c13157 = new C13157(m52708, m527082, readByte, m52704, readInt, intBitsToFloat, f, f2, m52703, m527032, m527033, m527034, m527035, m527036, z, z2, z3, num, num2);
            m52696.close();
            return c13157;
        } catch (Throwable th) {
            try {
                m52696.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m31885(C22686 c22686) {
        c22686.f73293 = this.f39332;
        c22686.f73263 = this.f39343;
        c22686.m50684(this.f39326, this.f39340);
        c22686.m24478(this.f39341);
        c22686.mo24477(this.f39334);
        c22686.m24479(this.f39338);
        c22686.m24490(this.f39339);
        c22686.f73227 = this.f39333;
        c22686.f73272 = this.f39337;
        boolean z = this.f39336;
        c22686.f73267 = z;
        if (z) {
            c22686.f73297 = this.f39330;
        }
        int i = this.f39327;
        if (i < 591749667) {
            return;
        }
        c22686.m24494(this.f39335);
        if (i >= 591749669) {
            c22686.m24497(this.f39331);
        }
        if (i >= 591749668) {
            c22686.f73261 = this.f39328;
        }
        c22686.m50688(this.f39342);
        c22686.m50685(this.f39344);
    }
}

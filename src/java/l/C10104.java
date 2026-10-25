package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: 86JZ */
/* renamed from: l.ۤۛۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10104 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f30413;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f30414;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f30415;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f30416;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f30417;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f30418;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f30419;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f30420;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f30421;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f30422;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f30423;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f30424;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f30425;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f30426;

    public C10104(byte[] bArr) {
        if (!C13630.m32770(bArr)) {
            throw new IOException("Invalid TGA header");
        }
        this.f30422 = bArr;
        this.f30423 = bArr[0] & 255;
        this.f30417 = bArr[2] & 255;
        this.f30416 = C22803.m50892(3, bArr);
        this.f30426 = bArr[1] != 0 ? C22803.m50892(5, bArr) : 0;
        this.f30420 = bArr[7] & 255;
        short m50892 = (short) C22803.m50892(8, bArr);
        this.f30414 = m50892;
        short m508922 = (short) C22803.m50892(10, bArr);
        this.f30415 = m508922;
        int m508923 = C22803.m50892(12, bArr);
        this.f30418 = m508923;
        int m508924 = C22803.m50892(14, bArr);
        this.f30425 = m508924;
        int i = m50892 + m508923;
        this.f30421 = i;
        int i2 = m508922 + m508924;
        this.f30424 = i2;
        this.f30413 = bArr[16] & 255;
        this.f30419 = bArr[17] & 255;
        if (i <= 0 || i2 <= 0) {
            throw new IOException("Invalid TGA canvas dimensions");
        }
        if (i * i2 > 268435456 || m508923 * m508924 > 268435456) {
            throw new C5870("TGA dimensions exceed decode limits");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m25387(boolean z) {
        return (this.f30426 * 4) + X931RNG.BLOCK64_RESEED_MAX + ((!z || this.f30417 < 9) ? 0L : this.f30425 * 16) + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25388(C10104 c10104) {
        if (!Arrays.equals(this.f30422, c10104.f30422)) {
            throw new IOException("TGA header changed during decoding");
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m25379(C10104 c10104) {
        return c10104.f30417 >= 9;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m25372(C10104 c10104) {
        int i = c10104.f30417;
        return i == 2 || i == 10;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static int m25374(C10104 c10104) {
        return (c10104.f30413 + 7) / 8;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static boolean m25375(C10104 c10104) {
        return (c10104.f30419 & 15) != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m25371(C10104 c10104, int i) {
        return (c10104.f30419 & 16) == 0 ? i - c10104.f30414 : (c10104.f30418 - 1) - i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m25377(C10104 c10104, int i) {
        return (c10104.f30419 & 32) != 0 ? i - c10104.f30415 : (c10104.f30425 - 1) - i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m25381(C10104 c10104, int i) {
        return (c10104.f30419 & 16) == 0 ? i + c10104.f30414 : (c10104.f30418 - 1) - i;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m25384(C10104 c10104, int i) {
        return (c10104.f30419 & 32) != 0 ? i + c10104.f30415 : (c10104.f30425 - 1) - i;
    }
}

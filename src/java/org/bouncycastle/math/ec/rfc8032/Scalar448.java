package org.bouncycastle.math.ec.rfc8032;

import com.umeng.commonsdk.statistics.UMErrorCode;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.math.ec.rfc7748.X448Field;
import org.bouncycastle.math.raw.Mod;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat448;

/* loaded from: classes2.dex */
public abstract class Scalar448 {
    public static final int L4_0 = 43969588;
    public static final int L4_1 = 30366549;
    public static final int L4_2 = 163752818;
    public static final int L4_3 = 258169998;
    public static final int L4_4 = 96434764;
    public static final int L4_5 = 227822194;
    public static final int L4_6 = 149865618;
    public static final int L4_7 = 550336261;
    public static final int L_0 = 78101261;
    public static final int L_1 = 141809365;
    public static final int L_2 = 175155932;
    public static final int L_3 = 64542499;
    public static final int L_4 = 158326419;
    public static final int L_5 = 191173276;
    public static final int L_6 = 104575268;
    public static final int L_7 = 137584065;
    public static final long M26L = 67108863;
    public static final long M28L = 268435455;
    public static final long M32L = 4294967295L;
    public static final int SCALAR_BYTES = 57;
    public static final int SIZE = 14;
    public static final int TARGET_LENGTH = 447;
    public static final int[] L = {-1420278541, 595116690, -1916432555, 560775794, -1361693040, -1001465015, 2093622249, -1, -1, -1, -1, -1, -1, Mod.M30};
    public static final int[] LSq = {463601321, -1045562440, 1239460018, -1189350089, -412821483, 1160071467, -1564970643, 1256291574, -1170454588, -240530412, 2118977290, -1845154869, -1618855054, -1019204973, 1437344377, -1849925303, 1189267370, 280387897, -680846520, -500732508, -1100672524, -1, -1, -1, -1, -1, -1, X448Field.M28};

    public static boolean checkVar(byte[] bArr, int[] iArr) {
        if (bArr[56] != 0) {
            return false;
        }
        decode(bArr, iArr);
        return !Nat.gte(14, iArr, L);
    }

    public static void decode(byte[] bArr, int[] iArr) {
        Codec.decode32(bArr, 0, iArr, 0, 14);
    }

    public static void getOrderWnafVar(int i, byte[] bArr) {
        Wnaf.getSignedVar(L, i, bArr);
    }

    public static void multiply225Var(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[22];
        Nat.mul(iArr2, 0, 8, iArr, 0, 14, iArr4, 0);
        if (iArr2[7] < 0) {
            Nat.addTo(14, L, 0, iArr4, 8);
            Nat.subFrom(14, iArr, 0, iArr4, 8);
        }
        byte[] bArr = new byte[88];
        Codec.encode32(iArr4, 0, 22, bArr, 0);
        decode(reduce704(bArr), iArr3);
    }

    public static byte[] reduce704(byte[] bArr) {
        long decode24 = Codec.decode24(bArr, 60) << 4;
        long j = decode24 & 4294967295L;
        long decode32 = Codec.decode32(bArr, 70);
        long j2 = decode32 & 4294967295L;
        long decode322 = Codec.decode32(bArr, 84);
        long j3 = (4294967295L & decode322) >>> 28;
        long decode242 = (j3 * 43969588) + ((Codec.decode24(bArr, 32) << 4) & 4294967295L);
        long decode323 = (j3 * 30366549) + (Codec.decode32(bArr, 35) & 4294967295L);
        long decode243 = (j3 * 163752818) + ((Codec.decode24(bArr, 39) << 4) & 4294967295L);
        long decode324 = (j3 * 258169998) + (Codec.decode32(bArr, 42) & 4294967295L);
        long decode244 = (j3 * 96434764) + ((Codec.decode24(bArr, 46) << 4) & 4294967295L);
        long decode325 = (j3 * 227822194) + (Codec.decode32(bArr, 49) & 4294967295L);
        long decode245 = (j3 * 149865618) + ((Codec.decode24(bArr, 53) << 4) & 4294967295L);
        long decode326 = (j3 * 550336261) + (Codec.decode32(bArr, 56) & 4294967295L);
        long decode246 = ((Codec.decode24(bArr, 74) << 4) & 4294967295L) + (j2 >>> 28);
        long j4 = decode32 & 268435455;
        long decode327 = (Codec.decode32(bArr, 77) & 4294967295L) + (decode246 >>> 28);
        long decode247 = ((Codec.decode24(bArr, 81) << 4) & 4294967295L) + (decode327 >>> 28);
        long j5 = decode327 & 268435455;
        long j6 = (decode322 & 268435455) + (decode247 >>> 28);
        long j7 = decode247 & 268435455;
        long j8 = (j6 * 30366549) + decode242;
        long j9 = (j6 * 163752818) + decode323;
        long j10 = (j6 * 258169998) + decode243;
        long j11 = (j6 * 227822194) + decode244;
        long decode248 = (j7 * 43969588) + ((Codec.decode24(bArr, 25) << 4) & 4294967295L);
        long decode328 = (j7 * 30366549) + (j6 * 43969588) + (Codec.decode32(bArr, 28) & 4294967295L);
        long j12 = (j7 * 163752818) + j8;
        long j13 = (j7 * 258169998) + j9;
        long j14 = (j7 * 96434764) + j10;
        long j15 = (j7 * 227822194) + (j6 * 96434764) + decode324;
        long j16 = (j7 * 149865618) + j11;
        long j17 = (j7 * 550336261) + (j6 * 149865618) + decode325;
        long decode329 = (j5 * 43969588) + (Codec.decode32(bArr, 21) & 4294967295L);
        long j18 = (j5 * 30366549) + decode248;
        long j19 = (j5 * 163752818) + decode328;
        long j20 = (j5 * 258169998) + j12;
        long j21 = (j5 * 96434764) + j13;
        long j22 = (j5 * 227822194) + j14;
        long j23 = (j5 * 149865618) + j15;
        long j24 = (j5 * 550336261) + j16;
        long decode3210 = (Codec.decode32(bArr, 63) & 4294967295L) + (j >>> 28);
        long j25 = decode24 & 268435455;
        long decode249 = ((Codec.decode24(bArr, 67) << 4) & 4294967295L) + (decode3210 >>> 28);
        long j26 = j4 + (decode249 >>> 28);
        long j27 = decode249 & 268435455;
        long j28 = (decode246 & 268435455) + (j26 >>> 28);
        long j29 = j26 & 268435455;
        long decode2410 = (j28 * 43969588) + ((Codec.decode24(bArr, 18) << 4) & 4294967295L);
        long j30 = (j28 * 30366549) + decode329;
        long j31 = (j28 * 163752818) + j18;
        long j32 = (j28 * 258169998) + j19;
        long j33 = (j28 * 96434764) + j20;
        long j34 = (j28 * 227822194) + j21;
        long j35 = (j28 * 149865618) + j22;
        long j36 = (j28 * 550336261) + j23;
        long decode3211 = (j29 * 43969588) + (Codec.decode32(bArr, 14) & 4294967295L);
        long j37 = (j29 * 30366549) + decode2410;
        long j38 = (j29 * 163752818) + j30;
        long j39 = (j29 * 258169998) + j31;
        long j40 = (j29 * 96434764) + j32;
        long j41 = (j29 * 227822194) + j33;
        long j42 = (j29 * 149865618) + j34;
        long j43 = (j29 * 550336261) + j35;
        long j44 = (j27 * 30366549) + decode3211;
        long j45 = (j27 * 163752818) + j37;
        long j46 = (j27 * 258169998) + j38;
        long j47 = (j27 * 96434764) + j39;
        long j48 = (j6 * 550336261) + decode245 + (j17 >>> 28);
        long j49 = decode326 + (j48 >>> 28);
        long j50 = j25 + (j49 >>> 28);
        long j51 = (decode3210 & 268435455) + (j50 >>> 28);
        long j52 = j50 & 268435455;
        long j53 = (j51 * 163752818) + j44;
        long j54 = (j51 * 258169998) + j45;
        long j55 = (j51 * 96434764) + j46;
        long j56 = (96434764 * j52) + j54;
        long j57 = (149865618 * j52) + (j51 * 227822194) + j47;
        long j58 = ((j49 & 268435455) * 4) + ((j48 & 268435455) >>> 26) + 1;
        long decode3212 = (78101261 * j58) + (Codec.decode32(bArr, 0) & 4294967295L);
        long j59 = (191173276 * j58) + j56;
        long decode2411 = (141809365 * j58) + (43969588 * j52) + ((Codec.decode24(bArr, 4) << 4) & 4294967295L) + (decode3212 >>> 28);
        long decode3213 = (175155932 * j58) + (30366549 * j52) + (j51 * 43969588) + (Codec.decode32(bArr, 7) & 4294967295L) + (decode2411 >>> 28);
        long decode2412 = (64542499 * j58) + (163752818 * j52) + (j51 * 30366549) + (j27 * 43969588) + ((Codec.decode24(bArr, 11) << 4) & 4294967295L) + (decode3213 >>> 28);
        long j60 = (158326419 * j58) + (258169998 * j52) + j53 + (decode2412 >>> 28);
        long j61 = j59 + (j60 >>> 28);
        long j62 = (104575268 * j58) + (227822194 * j52) + j55 + (j61 >>> 28);
        long j63 = (j58 * 137584065) + j57 + (j62 >>> 28);
        long j64 = (j52 * 550336261) + (j51 * 149865618) + (j27 * 227822194) + j40 + (j63 >>> 28);
        long j65 = (j51 * 550336261) + (j27 * 149865618) + j41 + (j64 >>> 28);
        long j66 = (j27 * 550336261) + j42 + (j65 >>> 28);
        long j67 = j43 + (j66 >>> 28);
        long j68 = j36 + (j67 >>> 28);
        long j69 = j24 + (j68 >>> 28);
        long j70 = j68 & 268435455;
        long j71 = (j17 & 268435455) + (j69 >>> 28);
        long j72 = (j48 & M26L) + (j71 >>> 28);
        long j73 = (j72 >>> 26) - 1;
        long j74 = (decode3212 & 268435455) - (j73 & 78101261);
        long j75 = ((decode2411 & 268435455) - (j73 & 141809365)) + (j74 >> 28);
        long j76 = ((decode3213 & 268435455) - (j73 & 175155932)) + (j75 >> 28);
        long j77 = ((decode2412 & 268435455) - (j73 & 64542499)) + (j76 >> 28);
        long j78 = j76 & 268435455;
        long j79 = ((j60 & 268435455) - (j73 & 158326419)) + (j77 >> 28);
        long j80 = ((j61 & 268435455) - (j73 & 191173276)) + (j79 >> 28);
        long j81 = ((j62 & 268435455) - (j73 & 104575268)) + (j80 >> 28);
        long j82 = ((j63 & 268435455) - (j73 & 137584065)) + (j81 >> 28);
        long j83 = (j64 & 268435455) + (j82 >> 28);
        long j84 = (j65 & 268435455) + (j83 >> 28);
        long j85 = (j66 & 268435455) + (j84 >> 28);
        long j86 = (j67 & 268435455) + (j85 >> 28);
        long j87 = j70 + (j86 >> 28);
        long j88 = (j69 & 268435455) + (j87 >> 28);
        long j89 = (j71 & 268435455) + (j88 >> 28);
        long j90 = (j72 & M26L) + (j89 >> 28);
        byte[] bArr2 = new byte[57];
        Codec.encode56((j74 & 268435455) | ((j75 & 268435455) << 28), bArr2, 0);
        Codec.encode56(((j77 & 268435455) << 28) | j78, bArr2, 7);
        Codec.encode56(((j80 & 268435455) << 28) | (j79 & 268435455), bArr2, 14);
        Codec.encode56((j81 & 268435455) | ((j82 & 268435455) << 28), bArr2, 21);
        Codec.encode56((j83 & 268435455) | ((j84 & 268435455) << 28), bArr2, 28);
        Codec.encode56((j85 & 268435455) | ((j86 & 268435455) << 28), bArr2, 35);
        Codec.encode56((j87 & 268435455) | ((j88 & 268435455) << 28), bArr2, 42);
        Codec.encode56((j90 << 28) | (j89 & 268435455), bArr2, 49);
        return bArr2;
    }

    public static byte[] reduce912(byte[] bArr) {
        long decode32 = Codec.decode32(bArr, 84);
        long j = decode32 & 4294967295L;
        long decode322 = Codec.decode32(bArr, 91);
        long j2 = decode322 & 4294967295L;
        long decode323 = Codec.decode32(bArr, 98);
        long j3 = decode323 & 4294967295L;
        long decode324 = Codec.decode32(bArr, IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult);
        long j4 = decode324 & 4294967295L;
        long decode16 = 4294967295L & Codec.decode16(bArr, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        long decode24 = ((Codec.decode24(bArr, 109) << 4) & 4294967295L) + (j4 >>> 28);
        long j5 = decode324 & 268435455;
        long decode325 = (j5 * 163752818) + (decode24 * 30366549) + (decode16 * 43969588) + (Codec.decode32(bArr, 56) & 4294967295L);
        long decode242 = (j5 * 258169998) + (decode24 * 163752818) + (decode16 * 30366549) + ((Codec.decode24(bArr, 60) << 4) & 4294967295L);
        long decode326 = (j5 * 96434764) + (decode24 * 258169998) + (decode16 * 163752818) + (Codec.decode32(bArr, 63) & 4294967295L);
        long decode243 = (j5 * 227822194) + (decode24 * 96434764) + (decode16 * 258169998) + ((Codec.decode24(bArr, 67) << 4) & 4294967295L);
        long decode327 = (j5 * 149865618) + (decode24 * 227822194) + (decode16 * 96434764) + (Codec.decode32(bArr, 70) & 4294967295L);
        long decode244 = ((Codec.decode24(bArr, IShizukuService.Stub.TRANSACTION_attachUserService) << 4) & 4294967295L) + (j3 >>> 28);
        long j6 = decode323 & 268435455;
        long decode245 = (decode244 * 43969588) + ((Codec.decode24(bArr, 46) << 4) & 4294967295L);
        long decode328 = (decode244 * 30366549) + (j5 * 43969588) + (Codec.decode32(bArr, 49) & 4294967295L);
        long decode246 = (decode244 * 163752818) + (j5 * 30366549) + (decode24 * 43969588) + ((Codec.decode24(bArr, 53) << 4) & 4294967295L);
        long j7 = (decode244 * 258169998) + decode325;
        long j8 = (decode244 * 96434764) + decode242;
        long j9 = (decode244 * 227822194) + decode326;
        long j10 = (decode244 * 149865618) + decode243;
        long j11 = (decode244 * 550336261) + decode327;
        long decode329 = (j6 * 43969588) + (Codec.decode32(bArr, 42) & 4294967295L);
        long j12 = (j6 * 30366549) + decode245;
        long j13 = (j6 * 163752818) + decode328;
        long j14 = (j6 * 258169998) + decode246;
        long j15 = (j6 * 96434764) + j7;
        long j16 = (j6 * 227822194) + j8;
        long j17 = (j6 * 149865618) + j9;
        long j18 = (j6 * 550336261) + j10;
        long decode247 = ((Codec.decode24(bArr, 95) << 4) & 4294967295L) + (j2 >>> 28);
        long j19 = decode322 & 268435455;
        long j20 = (decode247 * 163752818) + j12;
        long j21 = (decode247 * 258169998) + j13;
        long j22 = (decode247 * 149865618) + j16;
        long decode3210 = (j19 * 43969588) + (Codec.decode32(bArr, 35) & 4294967295L);
        long decode248 = (j19 * 30366549) + (decode247 * 43969588) + ((Codec.decode24(bArr, 39) << 4) & 4294967295L);
        long j23 = (j19 * 163752818) + (decode247 * 30366549) + decode329;
        long j24 = (j19 * 258169998) + j20;
        long j25 = (j19 * 96434764) + j21;
        long j26 = (j19 * 227822194) + (decode247 * 96434764) + j14;
        long j27 = (j19 * 149865618) + (decode247 * 227822194) + j15;
        long j28 = (j19 * 550336261) + j22;
        long decode249 = ((Codec.decode24(bArr, 88) << 4) & 4294967295L) + (j >>> 28);
        long j29 = (decode249 * 30366549) + decode3210;
        long j30 = (decode249 * 163752818) + decode248;
        long j31 = (decode249 * 258169998) + j23;
        long j32 = (decode249 * 149865618) + j26;
        long decode2410 = (j5 * 550336261) + (decode24 * 149865618) + (decode16 * 227822194) + ((Codec.decode24(bArr, 74) << 4) & 4294967295L) + (j11 >>> 28);
        long j33 = j11 & 268435455;
        long decode3211 = (decode24 * 550336261) + (decode16 * 149865618) + (Codec.decode32(bArr, 77) & 4294967295L) + (decode2410 >>> 28);
        long decode2411 = (decode16 * 550336261) + ((Codec.decode24(bArr, 81) << 4) & 4294967295L) + (decode3211 >>> 28);
        long j34 = decode3211 & 268435455;
        long j35 = (decode32 & 268435455) + (decode2411 >>> 28);
        long j36 = decode2411 & 268435455;
        long decode3212 = (j35 * 43969588) + (Codec.decode32(bArr, 28) & 4294967295L);
        long decode2412 = (j35 * 30366549) + (decode249 * 43969588) + ((Codec.decode24(bArr, 32) << 4) & 4294967295L);
        long j37 = (j35 * 163752818) + j29;
        long j38 = (j35 * 258169998) + j30;
        long j39 = (j35 * 96434764) + j31;
        long j40 = (j35 * 227822194) + (decode249 * 96434764) + j24;
        long j41 = (j35 * 149865618) + (decode249 * 227822194) + j25;
        long j42 = (j35 * 550336261) + j32;
        long decode2413 = (j36 * 43969588) + ((Codec.decode24(bArr, 25) << 4) & 4294967295L);
        long j43 = (j36 * 30366549) + decode3212;
        long j44 = (j36 * 163752818) + decode2412;
        long j45 = (j36 * 258169998) + j37;
        long j46 = (j36 * 96434764) + j38;
        long j47 = (j36 * 227822194) + j39;
        long j48 = (j36 * 149865618) + j40;
        long j49 = (j36 * 550336261) + j41;
        long decode3213 = (j34 * 43969588) + (Codec.decode32(bArr, 21) & 4294967295L);
        long j50 = (j34 * 30366549) + decode2413;
        long j51 = (j34 * 163752818) + j43;
        long j52 = (j34 * 258169998) + j44;
        long j53 = (j34 * 96434764) + j45;
        long j54 = (j34 * 227822194) + j46;
        long j55 = (j34 * 149865618) + j47;
        long j56 = (j34 * 550336261) + j48;
        long j57 = (decode247 * 550336261) + j17 + (j28 >>> 28);
        long j58 = j28 & 268435455;
        long j59 = j18 + (j57 >>> 28);
        long j60 = j57 & 268435455;
        long j61 = j33 + (j59 >>> 28);
        long j62 = j59 & 268435455;
        long j63 = (decode2410 & 268435455) + (j61 >>> 28);
        long j64 = j61 & 268435455;
        long decode2414 = (j63 * 43969588) + ((Codec.decode24(bArr, 18) << 4) & 4294967295L);
        long j65 = (j63 * 30366549) + decode3213;
        long j66 = (j63 * 163752818) + j50;
        long j67 = (j63 * 258169998) + j51;
        long j68 = (j63 * 96434764) + j52;
        long j69 = (j63 * 227822194) + j53;
        long j70 = (j63 * 149865618) + j54;
        long j71 = (j63 * 550336261) + j55;
        long j72 = (j64 * 163752818) + j65;
        long j73 = (j64 * 258169998) + j66;
        long j74 = (j64 * 96434764) + j67;
        long j75 = (j64 * 227822194) + j68;
        long j76 = (j64 * 149865618) + j69;
        long decode2415 = (j62 * 43969588) + ((Codec.decode24(bArr, 11) << 4) & 4294967295L);
        long decode3214 = (j62 * 30366549) + (j64 * 43969588) + (Codec.decode32(bArr, 14) & 4294967295L);
        long j77 = (j62 * 163752818) + (j64 * 30366549) + decode2414;
        long j78 = (j62 * 258169998) + j72;
        long j79 = (j62 * 96434764) + j73;
        long j80 = (j62 * 227822194) + j74;
        long j81 = (j62 * 149865618) + j75;
        long j82 = (j62 * 550336261) + j76;
        long j83 = j42 + (j49 >>> 28);
        long j84 = (decode249 * 550336261) + j27 + (j83 >>> 28);
        long j85 = j58 + (j84 >>> 28);
        long j86 = j60 + (j85 >>> 28);
        long j87 = j85 & 268435455;
        long j88 = (j86 * 30366549) + decode2415;
        long j89 = (j86 * 163752818) + decode3214;
        long j90 = (j86 * 258169998) + j77;
        long j91 = (j86 * 96434764) + j78;
        long j92 = (149865618 * j87) + (j86 * 227822194) + j79;
        long j93 = ((j84 & 268435455) * 4) + ((j83 & 268435455) >>> 26) + 1;
        long decode3215 = (78101261 * j93) + (Codec.decode32(bArr, 0) & 4294967295L);
        long decode2416 = (141809365 * j93) + (43969588 * j87) + ((Codec.decode24(bArr, 4) << 4) & 4294967295L) + (decode3215 >>> 28);
        long j94 = decode3215 & 268435455;
        long decode3216 = (175155932 * j93) + (30366549 * j87) + (j86 * 43969588) + (Codec.decode32(bArr, 7) & 4294967295L) + (decode2416 >>> 28);
        long j95 = (64542499 * j93) + (163752818 * j87) + j88 + (decode3216 >>> 28);
        long j96 = (158326419 * j93) + (258169998 * j87) + j89 + (j95 >>> 28);
        long j97 = (191173276 * j93) + (96434764 * j87) + j90 + (j96 >>> 28);
        long j98 = (104575268 * j93) + (227822194 * j87) + j91 + (j97 >>> 28);
        long j99 = (j93 * 137584065) + j92 + (j98 >>> 28);
        long j100 = (j87 * 550336261) + (j86 * 149865618) + j80 + (j99 >>> 28);
        long j101 = j99 & 268435455;
        long j102 = (j86 * 550336261) + j81 + (j100 >>> 28);
        long j103 = j82 + (j102 >>> 28);
        long j104 = (j64 * 550336261) + j70 + (j103 >>> 28);
        long j105 = j71 + (j104 >>> 28);
        long j106 = j56 + (j105 >>> 28);
        long j107 = (j49 & 268435455) + (j106 >>> 28);
        long j108 = (j83 & M26L) + (j107 >>> 28);
        long j109 = (j108 >>> 26) - 1;
        long j110 = j94 - (j109 & 78101261);
        long j111 = ((decode2416 & 268435455) - (j109 & 141809365)) + (j110 >> 28);
        long j112 = ((decode3216 & 268435455) - (j109 & 175155932)) + (j111 >> 28);
        long j113 = ((j95 & 268435455) - (j109 & 64542499)) + (j112 >> 28);
        long j114 = ((j96 & 268435455) - (j109 & 158326419)) + (j113 >> 28);
        long j115 = ((j97 & 268435455) - (j109 & 191173276)) + (j114 >> 28);
        long j116 = ((j98 & 268435455) - (j109 & 104575268)) + (j115 >> 28);
        long j117 = (j101 - (j109 & 137584065)) + (j116 >> 28);
        long j118 = (j100 & 268435455) + (j117 >> 28);
        long j119 = j117 & 268435455;
        long j120 = (j102 & 268435455) + (j118 >> 28);
        long j121 = (j103 & 268435455) + (j120 >> 28);
        long j122 = (j104 & 268435455) + (j121 >> 28);
        long j123 = (j105 & 268435455) + (j122 >> 28);
        long j124 = (j106 & 268435455) + (j123 >> 28);
        long j125 = (j107 & 268435455) + (j124 >> 28);
        long j126 = (j108 & M26L) + (j125 >> 28);
        byte[] bArr2 = new byte[57];
        Codec.encode56((j110 & 268435455) | ((j111 & 268435455) << 28), bArr2, 0);
        Codec.encode56(((j113 & 268435455) << 28) | (j112 & 268435455), bArr2, 7);
        Codec.encode56(((j115 & 268435455) << 28) | (j114 & 268435455), bArr2, 14);
        Codec.encode56((j119 << 28) | (j116 & 268435455), bArr2, 21);
        Codec.encode56(((j120 & 268435455) << 28) | (j118 & 268435455), bArr2, 28);
        Codec.encode56((j121 & 268435455) | ((j122 & 268435455) << 28), bArr2, 35);
        Codec.encode56((j123 & 268435455) | ((j124 & 268435455) << 28), bArr2, 42);
        Codec.encode56((j126 << 28) | (j125 & 268435455), bArr2, 49);
        return bArr2;
    }

    public static boolean reduceBasisVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int i;
        int i2;
        int[] iArr4 = new int[28];
        System.arraycopy(LSq, 0, iArr4, 0, 28);
        int[] iArr5 = new int[28];
        Nat448.square(iArr, iArr5);
        iArr5[0] = iArr5[0] + 1;
        int[] iArr6 = new int[28];
        int[] iArr7 = L;
        Nat448.mul(iArr7, iArr, iArr6);
        int[] iArr8 = new int[28];
        int[] iArr9 = new int[8];
        System.arraycopy(iArr7, 0, iArr9, 0, 8);
        int[] iArr10 = new int[8];
        System.arraycopy(iArr, 0, iArr10, 0, 8);
        int[] iArr11 = new int[8];
        iArr11[0] = 1;
        int i3 = 1788;
        int[] iArr12 = new int[8];
        int[] iArr13 = iArr9;
        int[] iArr14 = iArr10;
        int bitLengthPositive = ScalarUtil.getBitLengthPositive(27, iArr5);
        int i4 = 27;
        while (bitLengthPositive > 447) {
            int i5 = i3 - 1;
            if (i5 < 0) {
                return false;
            }
            int bitLength = ScalarUtil.getBitLength(i4, iArr6) - bitLengthPositive;
            int i6 = bitLength & (~(bitLength >> 31));
            if (iArr6[i4] < 0) {
                i = i4;
                i2 = bitLengthPositive;
                ScalarUtil.addShifted_NP(i4, i6, iArr4, iArr5, iArr6, iArr8);
                ScalarUtil.addShifted_UV(7, i6, iArr13, iArr12, iArr14, iArr11);
            } else {
                i = i4;
                i2 = bitLengthPositive;
                ScalarUtil.subShifted_NP(i, i6, iArr4, iArr5, iArr6, iArr8);
                ScalarUtil.subShifted_UV(7, i6, iArr13, iArr12, iArr14, iArr11);
            }
            int i7 = i;
            if (ScalarUtil.lessThan(i7, iArr4, iArr5)) {
                i4 = i2 >>> 5;
                bitLengthPositive = ScalarUtil.getBitLengthPositive(i4, iArr4);
                i3 = i5;
                int[] iArr15 = iArr12;
                iArr12 = iArr11;
                iArr11 = iArr15;
                int[] iArr16 = iArr5;
                iArr5 = iArr4;
                iArr4 = iArr16;
                int[] iArr17 = iArr13;
                iArr13 = iArr14;
                iArr14 = iArr17;
            } else {
                i4 = i7;
                i3 = i5;
                bitLengthPositive = i2;
            }
        }
        System.arraycopy(iArr14, 0, iArr2, 0, 8);
        System.arraycopy(iArr11, 0, iArr3, 0, 8);
        return true;
    }

    public static void toSignedDigits(int i, int[] iArr, int[] iArr2) {
        iArr2[14] = Nat.cadd(14, 1 & (~iArr[0]), iArr, L, iArr2) + (1 << (i - 448));
        Nat.shiftDownBit(15, iArr2, 0);
    }
}

package l;

import com.google.android.material.slider.BaseSlider;
import com.umeng.analytics.pro.cb;
import java.lang.Character;
import java.math.BigInteger;
import java.util.logging.Logger;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: P9QN */
/* renamed from: l.ۨۚۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11490 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f34303 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Logger f34304 = Logger.getLogger(C11490.class.getName());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m28308(byte b) {
        return (48 > b || b > 57) ? (97 > b || b > 122) ? b - 55 : b - 87 : b - UTF8.S_P3A;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m28313(byte b) {
        if (48 <= b && b <= 57) {
            return true;
        }
        if (97 > b || b > 102) {
            return 65 <= b && b <= 70;
        }
        return true;
    }

    static {
        EnumC12900 enumC12900 = EnumC12900.ALLOW_SINGULAR_OVERWRITES;
        int i = C16303.f50147;
        int i2 = C10660.f32068;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static AbstractC5886 m28315(String str) {
        int i;
        int i2;
        int length;
        byte b;
        byte b2;
        AbstractC5886 m16491 = AbstractC5886.m16491(str.toString());
        byte[] bArr = ((C12236) m16491).f36484;
        int length2 = bArr.length;
        byte[] bArr2 = new byte[length2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            byte b3 = bArr[i3];
            if (b3 == 92) {
                int i5 = i3 + 1;
                if (i5 >= bArr.length) {
                    throw new C3023("Invalid escape sequence: '\\' at end of string.");
                }
                byte b4 = bArr[i5];
                if (48 <= b4 && b4 <= 55) {
                    int m28308 = m28308(b4);
                    int i6 = i3 + 2;
                    if (i6 < bArr.length && 48 <= (b2 = bArr[i6]) && b2 <= 55) {
                        m28308 = (m28308 * 8) + m28308(b2);
                        i5 = i6;
                    }
                    int i7 = i5 + 1;
                    if (i7 < bArr.length && 48 <= (b = bArr[i7]) && b <= 55) {
                        m28308 = (m28308 * 8) + m28308(b);
                        i5 = i7;
                    }
                    i = i4 + 1;
                    bArr2[i4] = (byte) m28308;
                } else if (b4 == 34) {
                    i = i4 + 1;
                    bArr2[i4] = 34;
                } else if (b4 == 39) {
                    i = i4 + 1;
                    bArr2[i4] = 39;
                } else if (b4 != 63) {
                    if (b4 == 85) {
                        int i8 = i3 + 2;
                        i2 = i3 + 9;
                        if (i2 >= bArr.length) {
                            throw new C3023("Invalid escape sequence: '\\U' with too few hex chars");
                        }
                        int i9 = 0;
                        int i10 = i8;
                        while (true) {
                            int i11 = i3 + 10;
                            if (i10 < i11) {
                                byte b5 = bArr[i10];
                                if (!m28313(b5)) {
                                    throw new C3023("Invalid escape sequence: '\\U' with too few hex chars");
                                }
                                i9 = (i9 << 4) | m28308(b5);
                                i10++;
                            } else {
                                if (!Character.isValidCodePoint(i9)) {
                                    throw new C3023("Invalid escape sequence: '\\U" + m16491.mo16499(i8, i11).m16501() + "' is not a valid code point value");
                                }
                                Character.UnicodeBlock of = Character.UnicodeBlock.of(i9);
                                if (of != null && (of.equals(Character.UnicodeBlock.LOW_SURROGATES) || of.equals(Character.UnicodeBlock.HIGH_SURROGATES) || of.equals(Character.UnicodeBlock.HIGH_PRIVATE_USE_SURROGATES))) {
                                    throw new C3023("Invalid escape sequence: '\\U" + m16491.mo16499(i8, i11).m16501() + "' refers to a surrogate code unit");
                                }
                                byte[] bytes = new String(new int[]{i9}, 0, 1).getBytes(C13997.f41724);
                                System.arraycopy(bytes, 0, bArr2, i4, bytes.length);
                                length = bytes.length;
                            }
                        }
                    } else if (b4 == 92) {
                        i = i4 + 1;
                        bArr2[i4] = 92;
                    } else if (b4 == 102) {
                        i = i4 + 1;
                        bArr2[i4] = 12;
                    } else if (b4 == 110) {
                        i = i4 + 1;
                        bArr2[i4] = 10;
                    } else if (b4 == 114) {
                        i = i4 + 1;
                        bArr2[i4] = cb.k;
                    } else if (b4 == 120) {
                        i5 = i3 + 2;
                        if (i5 >= bArr.length || !m28313(bArr[i5])) {
                            throw new C3023("Invalid escape sequence: '\\x' with no digits");
                        }
                        int m283082 = m28308(bArr[i5]);
                        int i12 = i3 + 3;
                        if (i12 < bArr.length && m28313(bArr[i12])) {
                            m283082 = (m283082 * 16) + m28308(bArr[i12]);
                            i5 = i12;
                        }
                        i = i4 + 1;
                        bArr2[i4] = (byte) m283082;
                    } else if (b4 == 97) {
                        i = i4 + 1;
                        bArr2[i4] = 7;
                    } else if (b4 != 98) {
                        switch (b4) {
                            case 116:
                                i = i4 + 1;
                                bArr2[i4] = 9;
                                break;
                            case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                int i13 = i3 + 2;
                                i2 = i3 + 5;
                                if (i2 < bArr.length && m28313(bArr[i13])) {
                                    int i14 = i3 + 3;
                                    if (m28313(bArr[i14])) {
                                        int i15 = i3 + 4;
                                        if (m28313(bArr[i15]) && m28313(bArr[i2])) {
                                            char m283083 = (char) ((m28308(bArr[i15]) << 4) | (m28308(bArr[i13]) << 12) | (m28308(bArr[i14]) << 8) | m28308(bArr[i2]));
                                            if (m283083 >= 55296 && m283083 <= 57343) {
                                                throw new C3023("Invalid escape sequence: '\\u' refers to a surrogate");
                                            }
                                            byte[] bytes2 = Character.toString(m283083).getBytes(C13997.f41724);
                                            System.arraycopy(bytes2, 0, bArr2, i4, bytes2.length);
                                            length = bytes2.length;
                                            break;
                                        }
                                    }
                                }
                                throw new C3023("Invalid escape sequence: '\\u' with too few hex chars");
                            case 118:
                                i = i4 + 1;
                                bArr2[i4] = 11;
                                break;
                            default:
                                throw new C3023("Invalid escape sequence: '\\" + ((char) b4) + '\'');
                        }
                    } else {
                        i = i4 + 1;
                        bArr2[i4] = 8;
                    }
                    i4 += length;
                    i3 = i2;
                } else {
                    i = i4 + 1;
                    bArr2[i4] = 63;
                }
                i4 = i;
                i3 = i5;
            } else {
                bArr2[i4] = b3;
                i4++;
            }
            i3++;
        }
        return length2 == i4 ? new C12236(bArr2) : AbstractC5886.m16490(0, i4, bArr2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m28309(String str) {
        return (int) m28310(str, true, false);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m28314(String str) {
        return (int) m28310(str, false, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m28312(String str) {
        return m28310(str, true, true);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static long m28316(String str) {
        return m28310(str, false, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m28310(String str, boolean z, boolean z2) {
        boolean z3;
        int i;
        int i2 = 0;
        if (!str.startsWith("-", 0)) {
            z3 = false;
        } else {
            if (!z) {
                throw new NumberFormatException("Number must be positive: ".concat(str));
            }
            i2 = 1;
            z3 = true;
        }
        if (str.startsWith("0x", i2)) {
            i2 += 2;
            i = 16;
        } else {
            i = str.startsWith("0", i2) ? 8 : 10;
        }
        String substring = str.substring(i2);
        if (substring.length() < 16) {
            long parseLong = Long.parseLong(substring, i);
            if (z3) {
                parseLong = -parseLong;
            }
            if (!z2) {
                if (z) {
                    if (parseLong > 2147483647L || parseLong < -2147483648L) {
                        throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
                    }
                } else if (parseLong >= Blake2xsDigest.MAX_NUMBER_BLOCKS || parseLong < 0) {
                    throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
                }
            }
            return parseLong;
        }
        BigInteger bigInteger = new BigInteger(substring, i);
        if (z3) {
            bigInteger = bigInteger.negate();
        }
        if (z2) {
            if (z) {
                if (bigInteger.bitLength() > 63) {
                    throw new NumberFormatException("Number out of range for 64-bit signed integer: ".concat(str));
                }
            } else if (bigInteger.bitLength() > 64) {
                throw new NumberFormatException("Number out of range for 64-bit unsigned integer: ".concat(str));
            }
        } else if (z) {
            if (bigInteger.bitLength() > 31) {
                throw new NumberFormatException("Number out of range for 32-bit signed integer: ".concat(str));
            }
        } else if (bigInteger.bitLength() > 32) {
            throw new NumberFormatException("Number out of range for 32-bit unsigned integer: ".concat(str));
        }
        return bigInteger.longValue();
    }
}

package l;

import com.google.android.material.slider.BaseSlider;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* compiled from: 2AUQ */
/* renamed from: l.۟۟ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7322 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final boolean[] f22477;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean[] f22478;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final ThreadLocal f22479;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final char[] f22480;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int[] f22481;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final int[] f22482;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean f22483;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f22484;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public TimeZone f22485;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f22486;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f22487;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f22488;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f22489;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f22490;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f22491;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Locale f22492;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f22493;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Calendar f22494;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f22495;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f22496;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public char f22497;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f22498;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f22499;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public char[] f22500;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f22501;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f22502;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f22503;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m19608(char c, char c2, char c3, char c4, char c5, char c6, int i, int i2) {
        if (c >= '1' && c <= '3' && c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
            if (c5 == '0') {
                if (c6 < '1' || c6 > '9') {
                    return false;
                }
            } else if (c5 != '1' || (c6 != '0' && c6 != '1' && c6 != '2')) {
                return false;
            }
            if (i == 48) {
                return i2 >= 49 && i2 <= 57;
            }
            if (i != 49 && i != 50) {
                return i == 51 && (i2 == 48 || i2 == 49);
            }
            if (i2 >= 48 && i2 <= 57) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x001d, code lost:
    
        if (r5 <= '4') goto L18;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m19611(char r4, char r5, char r6, char r7, char r8, char r9) {
        /*
            r0 = 57
            r1 = 0
            r2 = 48
            if (r4 != r2) goto Lc
            if (r5 < r2) goto Lb
            if (r5 <= r0) goto L20
        Lb:
            return r1
        Lc:
            r3 = 49
            if (r4 != r3) goto L15
            if (r5 < r2) goto L14
            if (r5 <= r0) goto L20
        L14:
            return r1
        L15:
            r3 = 50
            if (r4 != r3) goto L42
            if (r5 < r2) goto L42
            r4 = 52
            if (r5 <= r4) goto L20
            goto L42
        L20:
            r4 = 54
            r5 = 53
            if (r6 < r2) goto L2d
            if (r6 > r5) goto L2d
            if (r7 < r2) goto L2c
            if (r7 <= r0) goto L32
        L2c:
            return r1
        L2d:
            if (r6 != r4) goto L42
            if (r7 == r2) goto L32
            return r1
        L32:
            if (r8 < r2) goto L3b
            if (r8 > r5) goto L3b
            if (r9 < r2) goto L3a
            if (r9 <= r0) goto L40
        L3a:
            return r1
        L3b:
            if (r8 != r4) goto L42
            if (r9 == r2) goto L40
            return r1
        L40:
            r4 = 1
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19611(char, char, char, char, char, char):boolean");
    }

    static {
        int i;
        try {
            i = Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
        } catch (Exception unused) {
            i = -1;
        }
        char c = 0;
        f22483 = i >= 23;
        f22479 = new ThreadLocal();
        f22481 = new int[IShizukuService.Stub.TRANSACTION_dispatchPackageChanged];
        for (int i2 = 48; i2 <= 57; i2++) {
            f22481[i2] = i2 - 48;
        }
        for (int i3 = 97; i3 <= 102; i3++) {
            f22481[i3] = i3 - 87;
        }
        for (int i4 = 65; i4 <= 70; i4++) {
            f22481[i4] = i4 - 55;
        }
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f22480 = charArray;
        int[] iArr = new int[256];
        f22482 = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i5 = 0; i5 < length; i5++) {
            f22482[f22480[i5]] = i5;
        }
        f22482[61] = 0;
        f22478 = new boolean[256];
        char c2 = 0;
        while (true) {
            boolean[] zArr = f22478;
            if (c2 >= zArr.length) {
                break;
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                zArr[c2] = true;
            } else if (c2 >= 'a' && c2 <= 'z') {
                zArr[c2] = true;
            } else if (c2 == '_') {
                zArr[c2] = true;
            }
            c2 = (char) (c2 + 1);
        }
        f22477 = new boolean[256];
        while (true) {
            boolean[] zArr2 = f22477;
            if (c >= zArr2.length) {
                return;
            }
            if (c >= 'A' && c <= 'Z') {
                zArr2[c] = true;
            } else if (c >= 'a' && c <= 'z') {
                zArr2[c] = true;
            } else if (c == '_') {
                zArr2[c] = true;
            } else if (c >= '0' && c <= '9') {
                zArr2[c] = true;
            }
            c = (char) (c + 1);
        }
    }

    public C7322(String str) {
        this(str, AbstractC5206.f16312);
    }

    public C7322(String str, int i) {
        this.f22495 = AbstractC5206.f16312;
        this.f22498 = false;
        this.f22502 = false;
        this.f22485 = AbstractC5206.f16308;
        this.f22492 = AbstractC5206.f16309;
        this.f22494 = null;
        this.f22496 = 0;
        char[] cArr = (char[]) f22479.get();
        this.f22500 = cArr;
        if (cArr == null) {
            this.f22500 = new char[512];
        }
        this.f22495 = i;
        this.f22489 = str;
        int length = str.length();
        this.f22493 = length;
        int i2 = (-1) + 1;
        this.f22486 = i2;
        char charAt = i2 >= length ? (char) 26 : str.charAt(i2);
        this.f22497 = charAt;
        if (charAt == 65279) {
            m19657();
        }
        this.f22484 = (EnumC13671.InitStringFieldAsEmpty.f40811 & i) != 0 ? "" : null;
        this.f22499 = (EnumC13671.DisableCircularReferenceDetect.f40811 & i) != 0;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m19646() {
        return this.f22491;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19640() {
        char[] cArr = this.f22500;
        if (cArr.length <= 8196) {
            f22479.set(cArr);
        }
        this.f22500 = null;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final char m19657() {
        int i = this.f22486 + 1;
        this.f22486 = i;
        char charAt = i >= this.f22493 ? (char) 26 : this.f22489.charAt(i);
        this.f22497 = charAt;
        return charAt;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19624(EnumC13671 enumC13671) {
        return (enumC13671.f40811 & this.f22495) != 0;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m19635() {
        this.f22501 = 0;
        while (true) {
            char c = this.f22497;
            if (c == ':') {
                int i = this.f22486 + 1;
                this.f22486 = i;
                this.f22497 = i >= this.f22493 ? (char) 26 : this.f22489.charAt(i);
                m19638();
                return;
            }
            if (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b') {
                m19657();
            } else {
                throw new C15082("not match : - " + this.f22497);
            }
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m19648() {
        char charAt = this.f22489.charAt((this.f22487 + this.f22501) - 1);
        int i = this.f22501;
        if (charAt == 'L' || charAt == 'S' || charAt == 'B' || charAt == 'F' || charAt == 'D') {
            i--;
        }
        return m19610(this.f22487, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char m19616(int i) {
        if (i >= this.f22493) {
            return (char) 26;
        }
        return this.f22489.charAt(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        m19630();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00fe, code lost:
    
        m19613();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0101, code lost:
    
        return;
     */
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19638() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19638():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19641(int i) {
        char c;
        this.f22501 = 0;
        while (true) {
            if (i != 2) {
                String str = this.f22489;
                int i2 = this.f22493;
                if (i == 4) {
                    char c2 = this.f22497;
                    if (c2 == '\"') {
                        this.f22488 = this.f22486;
                        m19656();
                        return;
                    } else if (c2 >= '0' && c2 <= '9') {
                        this.f22488 = this.f22486;
                        m19630();
                        return;
                    } else if (c2 == '{') {
                        this.f22491 = 12;
                        int i3 = this.f22486 + 1;
                        this.f22486 = i3;
                        this.f22497 = i3 < i2 ? str.charAt(i3) : (char) 26;
                        return;
                    }
                } else if (i == 12) {
                    char c3 = this.f22497;
                    if (c3 == '{') {
                        this.f22491 = 12;
                        int i4 = this.f22486 + 1;
                        this.f22486 = i4;
                        this.f22497 = i4 < i2 ? str.charAt(i4) : (char) 26;
                        return;
                    }
                    if (c3 == '[') {
                        this.f22491 = 14;
                        int i5 = this.f22486 + 1;
                        this.f22486 = i5;
                        this.f22497 = i5 < i2 ? str.charAt(i5) : (char) 26;
                        return;
                    }
                } else if (i != 18) {
                    if (i != 20) {
                        switch (i) {
                            case 14:
                                char c4 = this.f22497;
                                if (c4 != '[') {
                                    if (c4 == '{') {
                                        this.f22491 = 12;
                                        m19657();
                                        break;
                                    }
                                } else {
                                    this.f22491 = 14;
                                    m19657();
                                    break;
                                }
                                break;
                            case 15:
                                if (this.f22497 == ']') {
                                    this.f22491 = 15;
                                    m19657();
                                    break;
                                }
                                break;
                            case 16:
                                char c5 = this.f22497;
                                if (c5 != ',') {
                                    if (c5 != '}') {
                                        if (c5 != ']') {
                                            if (c5 == 26) {
                                                this.f22491 = 20;
                                                break;
                                            }
                                        } else {
                                            this.f22491 = 15;
                                            int i6 = this.f22486 + 1;
                                            this.f22486 = i6;
                                            this.f22497 = i6 < i2 ? str.charAt(i6) : (char) 26;
                                            break;
                                        }
                                    } else {
                                        this.f22491 = 13;
                                        int i7 = this.f22486 + 1;
                                        this.f22486 = i7;
                                        this.f22497 = i7 < i2 ? str.charAt(i7) : (char) 26;
                                        break;
                                    }
                                } else {
                                    this.f22491 = 16;
                                    int i8 = this.f22486 + 1;
                                    this.f22486 = i8;
                                    this.f22497 = i8 < i2 ? str.charAt(i8) : (char) 26;
                                    break;
                                }
                                break;
                        }
                        return;
                    }
                    if (this.f22497 == 26) {
                        this.f22491 = 20;
                        return;
                    }
                } else {
                    while (true) {
                        c = this.f22497;
                        if (c <= ' ' && (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b')) {
                            m19657();
                        }
                    }
                    if (c == '_' || Character.isLetter(c)) {
                        m19613();
                        return;
                    } else {
                        m19638();
                        return;
                    }
                }
            } else {
                char c6 = this.f22497;
                if (c6 >= '0' && c6 <= '9') {
                    this.f22488 = this.f22486;
                    m19630();
                    return;
                }
                if (c6 == '\"') {
                    this.f22488 = this.f22486;
                    m19656();
                    return;
                } else if (c6 == '[') {
                    this.f22491 = 14;
                    m19657();
                    return;
                } else if (c6 == '{') {
                    this.f22491 = 12;
                    m19657();
                    return;
                }
            }
            char c7 = this.f22497;
            if (c7 == ' ' || c7 == '\n' || c7 == '\r' || c7 == '\t' || c7 == '\f' || c7 == '\b') {
                m19657();
            } else {
                m19638();
                return;
            }
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Number m19644() {
        char c;
        boolean z;
        long j;
        int i;
        long j2;
        int i2 = this.f22487;
        int i3 = this.f22501 + i2;
        int i4 = i3 - 1;
        String str = this.f22489;
        int i5 = this.f22493;
        char charAt = i4 >= i5 ? (char) 26 : str.charAt(i4);
        if (charAt == 'B') {
            i3--;
            c = 'B';
        } else if (charAt == 'L') {
            i3--;
            c = 'L';
        } else if (charAt != 'S') {
            c = ' ';
        } else {
            i3--;
            c = 'S';
        }
        int i6 = this.f22487;
        if ((i6 >= i5 ? (char) 26 : str.charAt(i6)) == '-') {
            i2++;
            j = Long.MIN_VALUE;
            z = true;
        } else {
            z = false;
            j = -9223372036854775807L;
        }
        if (i2 < i3) {
            i = 1;
            j2 = -((i2 >= i5 ? (char) 26 : str.charAt(i2)) - '0');
            i2++;
        } else {
            i = 1;
            j2 = 0;
        }
        while (i2 < i3) {
            int i7 = i2 + 1;
            int charAt2 = (i2 >= i5 ? (char) 26 : str.charAt(i2)) - '0';
            if (j2 < -922337203685477580L) {
                return new BigInteger(m19648());
            }
            long j3 = j2 * 10;
            long j4 = charAt2;
            if (j3 < j + j4) {
                return new BigInteger(m19648());
            }
            j2 = j3 - j4;
            i2 = i7;
        }
        if (!z) {
            long j5 = -j2;
            if (j5 > 2147483647L || c == 'L') {
                return Long.valueOf(j5);
            }
            if (c == 'S') {
                return Short.valueOf((short) j5);
            }
            if (c == 'B') {
                return Byte.valueOf((byte) j5);
            }
            return Integer.valueOf((int) j5);
        }
        if (i2 <= this.f22487 + i) {
            throw new NumberFormatException(m19648());
        }
        if (j2 < -2147483648L || c == 'L') {
            return Long.valueOf(j2);
        }
        if (c == 'S') {
            return Short.valueOf((short) j2);
        }
        if (c == 'B') {
            return Byte.valueOf((byte) j2);
        }
        return Integer.valueOf((int) j2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m19618(C9279 c9279) {
        char c;
        while (true) {
            c = this.f22497;
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t' && c != '\f' && c != '\b') {
                break;
            }
            m19657();
        }
        if (c == '\"') {
            return m19619(c9279, '\"');
        }
        if (c == '\'') {
            return m19619(c9279, '\'');
        }
        if (c == '}') {
            m19657();
            this.f22491 = 13;
            return null;
        }
        if (c == ',') {
            m19657();
            this.f22491 = 16;
            return null;
        }
        if (c == 26) {
            this.f22491 = 20;
            return null;
        }
        return m19639(c9279);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m19619(C9279 c9279, char c) {
        String m19606;
        int i = this.f22486 + 1;
        String str = this.f22489;
        int indexOf = str.indexOf(c, i);
        if (indexOf == -1) {
            throw new C15082("unclosed str, " + m19654());
        }
        int i2 = indexOf - i;
        char[] m19626 = m19626(this.f22486 + 1, i2);
        boolean z = false;
        while (i2 > 0 && m19626[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && m19626[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int indexOf2 = str.indexOf(c, indexOf + 1);
            int i5 = (indexOf2 - indexOf) + i2;
            if (i5 >= m19626.length) {
                int length = (m19626.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(m19626, 0, cArr, 0, m19626.length);
                m19626 = cArr;
            }
            str.getChars(indexOf, indexOf2, m19626, i2);
            indexOf = indexOf2;
            i2 = i5;
            z = true;
        }
        if (z) {
            m19606 = m19606(m19626, i2);
        } else {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                char c2 = m19626[i7];
                i6 = (i6 * 31) + c2;
                if (c2 == '\\') {
                    z = true;
                }
            }
            if (z) {
                m19606 = m19606(m19626, i2);
            } else {
                m19606 = i2 < 20 ? c9279.m23806(m19626, i2, i6) : new String(m19626, 0, i2);
            }
        }
        int i8 = indexOf + 1;
        this.f22486 = i8;
        this.f22497 = i8 >= this.f22493 ? (char) 26 : str.charAt(i8);
        return m19606;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m19606(char[] cArr, int i) {
        int i2;
        int i3;
        char[] cArr2 = new char[i];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i) {
            char c = cArr[i4];
            if (c != '\\') {
                cArr2[i5] = c;
                i5++;
            } else {
                int i6 = i4 + 1;
                char c2 = cArr[i6];
                if (c2 == '\"') {
                    i2 = i5 + 1;
                    cArr2[i5] = '\"';
                } else if (c2 != '\'') {
                    if (c2 != 'F') {
                        if (c2 == '\\') {
                            i2 = i5 + 1;
                            cArr2[i5] = '\\';
                        } else if (c2 == 'b') {
                            i2 = i5 + 1;
                            cArr2[i5] = '\b';
                        } else if (c2 != 'f') {
                            if (c2 == 'n') {
                                i2 = i5 + 1;
                                cArr2[i5] = '\n';
                            } else if (c2 != 'r') {
                                if (c2 != 'x') {
                                    switch (c2) {
                                        case '/':
                                            i2 = i5 + 1;
                                            cArr2[i5] = '/';
                                            break;
                                        case '0':
                                            i2 = i5 + 1;
                                            cArr2[i5] = 0;
                                            break;
                                        case '1':
                                            i2 = i5 + 1;
                                            cArr2[i5] = 1;
                                            break;
                                        case '2':
                                            i2 = i5 + 1;
                                            cArr2[i5] = 2;
                                            break;
                                        case '3':
                                            i2 = i5 + 1;
                                            cArr2[i5] = 3;
                                            break;
                                        case '4':
                                            i2 = i5 + 1;
                                            cArr2[i5] = 4;
                                            break;
                                        case '5':
                                            i2 = i5 + 1;
                                            cArr2[i5] = 5;
                                            break;
                                        case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                            i2 = i5 + 1;
                                            cArr2[i5] = 6;
                                            break;
                                        case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                            i2 = i5 + 1;
                                            cArr2[i5] = 7;
                                            break;
                                        default:
                                            switch (c2) {
                                                case 't':
                                                    i2 = i5 + 1;
                                                    cArr2[i5] = '\t';
                                                    break;
                                                case BaseSlider.DEFAULT_LABEL_ANIMATION_EXIT_DURATION /* 117 */:
                                                    i3 = i5 + 1;
                                                    char c3 = cArr[i4 + 2];
                                                    char c4 = cArr[i4 + 3];
                                                    char c5 = cArr[i4 + 4];
                                                    i4 += 5;
                                                    cArr2[i5] = (char) Integer.parseInt(new String(new char[]{c3, c4, c5, cArr[i4]}), 16);
                                                    break;
                                                case 'v':
                                                    i2 = i5 + 1;
                                                    cArr2[i5] = 11;
                                                    break;
                                                default:
                                                    throw new C15082("unclosed.str.lit");
                                            }
                                    }
                                } else {
                                    i3 = i5 + 1;
                                    char c6 = cArr[i4 + 2];
                                    int[] iArr = f22481;
                                    i4 += 3;
                                    cArr2[i5] = (char) ((iArr[c6] * 16) + iArr[cArr[i4]]);
                                }
                                i5 = i3;
                            } else {
                                i2 = i5 + 1;
                                cArr2[i5] = '\r';
                            }
                        }
                    }
                    i2 = i5 + 1;
                    cArr2[i5] = '\f';
                } else {
                    i2 = i5 + 1;
                    cArr2[i5] = '\'';
                }
                i5 = i2;
                i4 = i6;
            }
            i4++;
        }
        return new String(cArr2, 0, i5);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m19654() {
        StringBuilder sb = new StringBuilder("pos ");
        sb.append(this.f22486);
        sb.append(", json : ");
        String str = this.f22489;
        if (this.f22493 >= 65536) {
            str = str.substring(0, 65536);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m19631() {
        m19657();
        char c = this.f22497;
        if (c == '/') {
            do {
                m19657();
            } while (this.f22497 != '\n');
            m19657();
        } else if (c == '*') {
            m19657();
            while (true) {
                char c2 = this.f22497;
                if (c2 == 26) {
                    return;
                }
                if (c2 == '*') {
                    m19657();
                    if (this.f22497 == '/') {
                        m19657();
                        return;
                    }
                } else {
                    m19657();
                }
            }
        } else {
            throw new C15082("invalid comment");
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m19639(C9279 c9279) {
        int i = this.f22497;
        boolean[] zArr = f22478;
        if (i < zArr.length && !zArr[i]) {
            throw new C15082("illegal identifier : " + this.f22497 + ", " + m19654());
        }
        this.f22487 = this.f22486;
        this.f22501 = 1;
        while (true) {
            char m19657 = m19657();
            boolean[] zArr2 = f22477;
            if (m19657 < zArr2.length && !zArr2[m19657]) {
                break;
            }
            i = (i * 31) + m19657;
            this.f22501++;
        }
        this.f22497 = m19616(this.f22486);
        this.f22491 = 18;
        int i2 = this.f22501;
        String str = this.f22489;
        if (i2 == 4 && str.startsWith("null", this.f22487)) {
            return null;
        }
        return c9279.m23805(this.f22487, this.f22501, i, str);
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m19656() {
        char c = this.f22497;
        int i = this.f22486 + 1;
        String str = this.f22489;
        int indexOf = str.indexOf(c, i);
        if (indexOf == -1) {
            throw new C15082("unclosed str, " + m19654());
        }
        int i2 = indexOf - i;
        char[] m19626 = m19626(this.f22486 + 1, i2);
        boolean z = false;
        while (i2 > 0 && m19626[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && m19626[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int indexOf2 = str.indexOf(c, indexOf + 1);
            int i5 = (indexOf2 - indexOf) + i2;
            if (i5 >= m19626.length) {
                int length = (m19626.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(m19626, 0, cArr, 0, m19626.length);
                m19626 = cArr;
            }
            str.getChars(indexOf, indexOf2, m19626, i2);
            indexOf = indexOf2;
            i2 = i5;
            z = true;
        }
        if (!z) {
            for (int i6 = 0; i6 < i2; i6++) {
                if (m19626[i6] == '\\') {
                    z = true;
                }
            }
        }
        this.f22500 = m19626;
        this.f22501 = i2;
        this.f22487 = this.f22486;
        this.f22490 = z;
        int i7 = indexOf + 1;
        this.f22486 = i7;
        this.f22497 = i7 >= this.f22493 ? (char) 26 : str.charAt(i7);
        this.f22491 = 4;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m19614() {
        String str;
        int i = this.f22486 + 1;
        String str2 = this.f22489;
        int indexOf = str2.indexOf(34, i);
        if (indexOf == -1) {
            throw new C15082("unclosed str, " + m19654());
        }
        if (f22483) {
            str = str2.substring(i, indexOf);
        } else {
            int i2 = indexOf - i;
            str = new String(m19626(this.f22486 + 1, i2), 0, i2);
        }
        if (str.indexOf(92) != -1) {
            while (true) {
                int i3 = 0;
                for (int i4 = indexOf - 1; i4 >= 0 && str2.charAt(i4) == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    break;
                }
                indexOf = str2.indexOf(34, indexOf + 1);
            }
            int i5 = indexOf - i;
            str = m19606(m19626(this.f22486 + 1, i5), i5);
        }
        int i6 = indexOf + 1;
        this.f22486 = i6;
        this.f22497 = i6 >= this.f22493 ? (char) 26 : str2.charAt(i6);
        return str;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m19651() {
        int i;
        boolean z;
        int i2 = this.f22487;
        int i3 = this.f22501 + i2;
        String str = this.f22489;
        int i4 = this.f22493;
        int i5 = 0;
        if ((i2 >= i4 ? (char) 26 : str.charAt(i2)) == '-') {
            i2++;
            i = Integer.MIN_VALUE;
            z = true;
        } else {
            i = SecP160R1Field.PInv;
            z = false;
        }
        if (i2 < i3) {
            i5 = -((i2 >= i4 ? (char) 26 : str.charAt(i2)) - '0');
            i2++;
        }
        while (i2 < i3) {
            int i6 = i2 + 1;
            char charAt = i2 >= i4 ? (char) 26 : str.charAt(i2);
            if (charAt == 'L' || charAt == 'S' || charAt == 'B') {
                i2 = i6;
                break;
            }
            int i7 = charAt - '0';
            if (i5 < -214748364) {
                throw new NumberFormatException(m19648());
            }
            int i8 = i5 * 10;
            if (i8 < i + i7) {
                throw new NumberFormatException(m19648());
            }
            i5 = i8 - i7;
            i2 = i6;
        }
        if (!z) {
            return -i5;
        }
        if (i2 > this.f22487 + 1) {
            return i5;
        }
        throw new NumberFormatException(m19648());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m19625() {
        return m19609(this.f22487 + 1, this.f22501, this.f22489);
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m19613() {
        this.f22487 = this.f22486 - 1;
        this.f22490 = false;
        do {
            this.f22501++;
            m19657();
        } while (Character.isLetterOrDigit(this.f22497));
        String m19634 = m19634();
        if (m19634.equals("null")) {
            this.f22491 = 8;
            return;
        }
        if (m19634.equals("true")) {
            this.f22491 = 6;
            return;
        }
        if (m19634.equals("false")) {
            this.f22491 = 7;
            return;
        }
        if (m19634.equals("new")) {
            this.f22491 = 9;
            return;
        }
        if (m19634.equals("undefined")) {
            this.f22491 = 23;
            return;
        }
        if (m19634.equals("Set")) {
            this.f22491 = 21;
        } else if (m19634.equals("TreeSet")) {
            this.f22491 = 22;
        } else {
            this.f22491 = 18;
        }
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m19634() {
        if (this.f22490) {
            return m19606(this.f22500, this.f22501);
        }
        return m19610(this.f22487 + 1, this.f22501);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final String m19610(int i, int i2) {
        char[] cArr = this.f22500;
        int length = cArr.length;
        String str = this.f22489;
        if (i2 < length) {
            str.getChars(i, i + i2, cArr, 0);
            return new String(this.f22500, 0, i2);
        }
        char[] cArr2 = new char[i2];
        str.getChars(i, i2 + i, cArr2, 0);
        return new String(cArr2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final char[] m19626(int i, int i2) {
        char[] cArr = this.f22500;
        int length = cArr.length;
        String str = this.f22489;
        if (i2 < length) {
            str.getChars(i, i2 + i, cArr, 0);
            return this.f22500;
        }
        char[] cArr2 = new char[i2];
        this.f22500 = cArr2;
        str.getChars(i, i2 + i, cArr2, 0);
        return cArr2;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m19660() {
        int i = 0;
        while (true) {
            char m19616 = m19616(i);
            if (m19616 == 26) {
                return true;
            }
            if (m19616 > ' ' || !(m19616 == ' ' || m19616 == '\n' || m19616 == '\r' || m19616 == '\t' || m19616 == '\f' || m19616 == '\b')) {
                break;
            }
            i++;
        }
        return false;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m19615() {
        while (true) {
            char c = this.f22497;
            if (c > '/') {
                return;
            }
            if (c == ' ' || c == '\r' || c == '\n' || c == '\t' || c == '\f' || c == '\b') {
                m19657();
            } else if (c != '/') {
                return;
            } else {
                m19631();
            }
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m19630() {
        char c;
        char c2;
        int i = this.f22486;
        this.f22487 = i;
        this.f22498 = false;
        char c3 = this.f22497;
        String str = this.f22489;
        int i2 = this.f22493;
        if (c3 == '-') {
            this.f22501++;
            int i3 = i + 1;
            this.f22486 = i3;
            this.f22497 = i3 >= i2 ? (char) 26 : str.charAt(i3);
        }
        while (true) {
            c = this.f22497;
            if (c < '0' || c > '9') {
                break;
            }
            this.f22501++;
            int i4 = this.f22486 + 1;
            this.f22486 = i4;
            this.f22497 = i4 >= i2 ? (char) 26 : str.charAt(i4);
        }
        this.f22502 = false;
        if (c == '.') {
            this.f22501++;
            int i5 = this.f22486 + 1;
            this.f22486 = i5;
            this.f22497 = i5 >= i2 ? (char) 26 : str.charAt(i5);
            this.f22502 = true;
            while (true) {
                char c4 = this.f22497;
                if (c4 < '0' || c4 > '9') {
                    break;
                }
                this.f22501++;
                int i6 = this.f22486 + 1;
                this.f22486 = i6;
                this.f22497 = i6 >= i2 ? (char) 26 : str.charAt(i6);
            }
        }
        char c5 = this.f22497;
        if (c5 == 'L') {
            this.f22501++;
            m19657();
        } else if (c5 == 'S') {
            this.f22501++;
            m19657();
        } else if (c5 == 'B') {
            this.f22501++;
            m19657();
        } else if (c5 == 'F') {
            this.f22501++;
            m19657();
            this.f22502 = true;
        } else if (c5 == 'D') {
            this.f22501++;
            m19657();
            this.f22502 = true;
        } else if (c5 == 'e' || c5 == 'E') {
            this.f22501++;
            int i7 = this.f22486 + 1;
            this.f22486 = i7;
            char charAt = i7 >= i2 ? (char) 26 : str.charAt(i7);
            this.f22497 = charAt;
            if (charAt == '+' || charAt == '-') {
                this.f22501++;
                int i8 = this.f22486 + 1;
                this.f22486 = i8;
                this.f22497 = i8 >= i2 ? (char) 26 : str.charAt(i8);
            }
            while (true) {
                c2 = this.f22497;
                if (c2 < '0' || c2 > '9') {
                    break;
                }
                this.f22501++;
                int i9 = this.f22486 + 1;
                this.f22486 = i9;
                this.f22497 = i9 >= i2 ? (char) 26 : str.charAt(i9);
            }
            if (c2 == 'D' || c2 == 'F') {
                this.f22501++;
                m19657();
            }
            this.f22498 = true;
            this.f22502 = true;
        }
        if (this.f22502) {
            this.f22491 = 3;
        } else {
            this.f22491 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0273 A[Catch: NumberFormatException -> 0x02b9, TryCatch #0 {NumberFormatException -> 0x02b9, blocks: (B:104:0x0260, B:109:0x026f, B:111:0x0273, B:115:0x0284, B:116:0x027b, B:118:0x0282, B:124:0x028b, B:127:0x0291, B:129:0x0296, B:132:0x029c, B:134:0x026b, B:135:0x02a1, B:137:0x02ab, B:139:0x02b0), top: B:101:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028b A[Catch: NumberFormatException -> 0x02b9, TryCatch #0 {NumberFormatException -> 0x02b9, blocks: (B:104:0x0260, B:109:0x026f, B:111:0x0273, B:115:0x0284, B:116:0x027b, B:118:0x0282, B:124:0x028b, B:127:0x0291, B:129:0x0296, B:132:0x029c, B:134:0x026b, B:135:0x02a1, B:137:0x02ab, B:139:0x02b0), top: B:101:0x025c }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0296 A[Catch: NumberFormatException -> 0x02b9, TryCatch #0 {NumberFormatException -> 0x02b9, blocks: (B:104:0x0260, B:109:0x026f, B:111:0x0273, B:115:0x0284, B:116:0x027b, B:118:0x0282, B:124:0x028b, B:127:0x0291, B:129:0x0296, B:132:0x029c, B:134:0x026b, B:135:0x02a1, B:137:0x02ab, B:139:0x02b0), top: B:101:0x025c }] */
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Number m19655() {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19655():java.lang.Number");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r0 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        return -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ab, code lost:
    
        return r6;
     */
    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m19627() {
        /*
            r15 = this;
            r0 = 0
            r15.f22487 = r0
            char r1 = r15.f22497
            r2 = 45
            java.lang.String r3 = r15.f22489
            int r4 = r15.f22493
            r5 = 1
            if (r1 != r2) goto L3b
            r15.f22487 = r5
            int r0 = r15.f22486
            int r0 = r0 + r5
            r15.f22486 = r0
            if (r0 >= r4) goto L23
            char r0 = r3.charAt(r0)
            r15.f22497 = r0
            r0 = -9223372036854775808
            r2 = 1
            r1 = r0
            r0 = 1
            goto L40
        L23:
            l.ܶ۟ۡ r0 = new l.ܶ۟ۡ
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "syntax error, "
            r1.<init>(r2)
            java.lang.String r2 = r15.m19654()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3b:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L40:
            r6 = 0
        L42:
            char r8 = r15.f22497
            r9 = 48
            if (r8 < r9) goto La7
            r9 = 57
            if (r8 > r9) goto La7
            int r8 = r8 + (-48)
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            java.lang.String r11 = ", "
            java.lang.String r12 = "error long value, "
            int r13 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r13 < 0) goto L92
            r9 = 10
            long r6 = r6 * r9
            long r8 = (long) r8
            long r13 = r1 + r8
            int r10 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r10 < 0) goto L7d
            long r6 = r6 - r8
            int r8 = r15.f22487
            int r8 = r8 + r5
            r15.f22487 = r8
            int r8 = r15.f22486
            int r8 = r8 + r5
            r15.f22486 = r8
            if (r8 < r4) goto L76
            r8 = 26
            goto L7a
        L76:
            char r8 = r3.charAt(r8)
        L7a:
            r15.f22497 = r8
            goto L42
        L7d:
            l.ܶ۟ۡ r0 = new l.ܶ۟ۡ
            java.lang.StringBuilder r1 = l.C12803.m31106(r12, r11, r6)
            java.lang.String r2 = r15.m19654()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L92:
            l.ܶ۟ۡ r0 = new l.ܶ۟ۡ
            java.lang.StringBuilder r1 = l.C12803.m31106(r12, r11, r6)
            java.lang.String r2 = r15.m19654()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La7:
            if (r0 != 0) goto Lab
            long r0 = -r6
            return r0
        Lab:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19627():long");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m19632() {
        boolean z;
        long j;
        long j2;
        int i = this.f22487;
        int i2 = this.f22501 + i;
        if (m19616(i) == '-') {
            i++;
            j = Long.MIN_VALUE;
            z = true;
        } else {
            z = false;
            j = -9223372036854775807L;
        }
        if (i < i2) {
            long j3 = -(m19616(i) - '0');
            i++;
            j2 = j3;
        } else {
            j2 = 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            char charAt = i >= this.f22493 ? (char) 26 : this.f22489.charAt(i);
            if (charAt == 'L' || charAt == 'S' || charAt == 'B') {
                i = i3;
                break;
            }
            int i4 = charAt - '0';
            if (j2 < -922337203685477580L) {
                throw new NumberFormatException(m19648());
            }
            long j4 = j2 * 10;
            long j5 = i4;
            if (j4 < j + j5) {
                throw new NumberFormatException(m19648());
            }
            j2 = j4 - j5;
            i = i3;
        }
        if (!z) {
            return -j2;
        }
        if (i > this.f22487 + 1) {
            return j2;
        }
        throw new NumberFormatException(m19648());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Number m19617(boolean z) {
        char[] cArr;
        boolean z2;
        int i = (this.f22487 + this.f22501) - 1;
        int i2 = this.f22493;
        String str = this.f22489;
        char charAt = i >= i2 ? (char) 26 : str.charAt(i);
        try {
            if (charAt == 'F') {
                return Float.valueOf(Float.parseFloat(m19648()));
            }
            if (charAt == 'D') {
                return Double.valueOf(Double.parseDouble(m19648()));
            }
            if (z) {
                return m19649();
            }
            char charAt2 = str.charAt((this.f22487 + this.f22501) - 1);
            int i3 = this.f22501;
            if (charAt2 == 'L' || charAt2 == 'S' || charAt2 == 'B' || charAt2 == 'F' || charAt2 == 'D') {
                i3--;
            }
            int i4 = this.f22487;
            char[] cArr2 = this.f22500;
            int i5 = 0;
            if (i3 < cArr2.length) {
                str.getChars(i4, i4 + i3, cArr2, 0);
                cArr = this.f22500;
            } else {
                char[] cArr3 = new char[i3];
                str.getChars(i4, i4 + i3, cArr3, 0);
                cArr = cArr3;
            }
            if (i3 <= 9 && !this.f22498) {
                char c = cArr[0];
                int i6 = 2;
                if (c == '-') {
                    c = cArr[1];
                    z2 = true;
                } else if (c == '+') {
                    c = cArr[1];
                    z2 = false;
                } else {
                    z2 = false;
                    i6 = 1;
                }
                int i7 = c - '0';
                while (i6 < i3) {
                    char c2 = cArr[i6];
                    if (c2 == '.') {
                        i5 = 1;
                    } else {
                        i7 = (i7 * 10) + (c2 - '0');
                        if (i5 != 0) {
                            i5 *= 10;
                        }
                    }
                    i6++;
                }
                double d = i7 / i5;
                if (z2) {
                    d = -d;
                }
                return Double.valueOf(d);
            }
            return Double.valueOf(Double.parseDouble(new String(cArr, 0, i3)));
        } catch (NumberFormatException e) {
            throw new C15082(e.getMessage() + ", " + m19654());
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final BigDecimal m19649() {
        int i = (this.f22487 + this.f22501) - 1;
        String str = this.f22489;
        char charAt = str.charAt(i);
        int i2 = this.f22501;
        if (charAt == 'L' || charAt == 'S' || charAt == 'B' || charAt == 'F' || charAt == 'D') {
            i2--;
        }
        int i3 = this.f22487;
        char[] cArr = this.f22500;
        if (i2 < cArr.length) {
            str.getChars(i3, i3 + i2, cArr, 0);
            return new BigDecimal(this.f22500, 0, i2);
        }
        char[] cArr2 = new char[i2];
        str.getChars(i3, i2 + i3, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f4, code lost:
    
        r16.f22503 = 0;
        r16.f22496 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00fa, code lost:
    
        return false;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m19623(long r17) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19623(long):boolean");
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private int m19612(long j) {
        String str;
        int i;
        char c = this.f22497;
        int i2 = 1;
        while (true) {
            str = this.f22489;
            i = this.f22493;
            if (c != '\"' && c != '\'') {
                if (c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b') {
                    int i3 = i2 + 1;
                    int i4 = this.f22486 + i2;
                    c = i4 >= i ? (char) 26 : str.charAt(i4);
                    i2 = i3;
                } else {
                    this.f22503 = 0L;
                    this.f22496 = -2;
                    return 0;
                }
            }
        }
        int i5 = this.f22486 + i2;
        long j2 = -3750763034362895579L;
        while (true) {
            if (i5 >= i) {
                break;
            }
            char charAt = str.charAt(i5);
            if (charAt == c) {
                i2 += (i5 - this.f22486) - i2;
                break;
            }
            j2 = (j2 ^ charAt) * 1099511628211L;
            i5++;
        }
        if (j2 != j) {
            this.f22503 = j2;
            this.f22496 = -2;
            return 0;
        }
        int i6 = i2 + 1;
        int i7 = this.f22486 + i6;
        char charAt2 = i7 >= i ? (char) 26 : str.charAt(i7);
        while (charAt2 != ':') {
            if (charAt2 <= ' ' && (charAt2 == ' ' || charAt2 == '\n' || charAt2 == '\r' || charAt2 == '\t' || charAt2 == '\f' || charAt2 == '\b')) {
                int i8 = i6 + 1;
                int i9 = this.f22486 + i6;
                charAt2 = i9 >= i ? (char) 26 : str.charAt(i9);
                i6 = i8;
            } else {
                throw new C15082("match feild error expect ':'");
            }
        }
        return i6 + 1;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int m19637(long j) {
        int i;
        char charAt;
        this.f22496 = 0;
        int m19612 = m19612(j);
        if (m19612 == 0) {
            return 0;
        }
        int i2 = m19612 + 1;
        int i3 = this.f22486 + m19612;
        String str = this.f22489;
        int i4 = this.f22493;
        char charAt2 = i3 >= i4 ? (char) 26 : str.charAt(i3);
        boolean z = charAt2 == '\"';
        if (z) {
            int i5 = m19612 + 2;
            int i6 = this.f22486 + i2;
            charAt2 = i6 >= i4 ? (char) 26 : str.charAt(i6);
            z = true;
            i2 = i5;
        }
        boolean z2 = charAt2 == '-';
        if (z2) {
            int i7 = i2 + 1;
            int i8 = this.f22486 + i2;
            charAt2 = i8 >= i4 ? (char) 26 : str.charAt(i8);
            i2 = i7;
        }
        if (charAt2 < '0' || charAt2 > '9') {
            this.f22496 = -1;
            return 0;
        }
        int i9 = charAt2 - '0';
        while (true) {
            i = i2 + 1;
            int i10 = this.f22486 + i2;
            charAt = i10 >= i4 ? (char) 26 : str.charAt(i10);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i9 = (i9 * 10) + (charAt - '0');
            i2 = i;
        }
        if (charAt == '.') {
            this.f22496 = -1;
            return 0;
        }
        if (charAt == '\"') {
            if (!z) {
                this.f22496 = -1;
                return 0;
            }
            int i11 = i2 + 2;
            int i12 = this.f22486 + i;
            charAt = i12 >= i4 ? (char) 26 : str.charAt(i12);
            i = i11;
        }
        if (i9 < 0) {
            this.f22496 = -1;
            return 0;
        }
        while (charAt != ',') {
            if (charAt > ' ' || !(charAt == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t' || charAt == '\f' || charAt == '\b')) {
                if (charAt == '}') {
                    char m19616 = m19616(this.f22486 + i);
                    if (m19616 == ',') {
                        this.f22491 = 16;
                        int i13 = this.f22486 + i + 1;
                        this.f22486 = i13;
                        this.f22497 = i13 < i4 ? str.charAt(i13) : (char) 26;
                    } else if (m19616 == ']') {
                        this.f22491 = 15;
                        int i14 = this.f22486 + i + 1;
                        this.f22486 = i14;
                        this.f22497 = i14 < i4 ? str.charAt(i14) : (char) 26;
                    } else if (m19616 == '}') {
                        this.f22491 = 13;
                        int i15 = this.f22486 + i + 1;
                        this.f22486 = i15;
                        this.f22497 = i15 < i4 ? str.charAt(i15) : (char) 26;
                    } else if (m19616 == 26) {
                        this.f22491 = 20;
                        this.f22486 += i;
                        this.f22497 = (char) 26;
                    } else {
                        this.f22496 = -1;
                        return 0;
                    }
                    this.f22496 = 4;
                    if (z2) {
                        return -i9;
                    }
                    return i9;
                }
                this.f22496 = -1;
                return 0;
            }
            int i16 = i + 1;
            int i17 = this.f22486 + i;
            charAt = i17 >= i4 ? (char) 26 : str.charAt(i17);
            i = i16;
        }
        int i18 = (i - 1) + this.f22486 + 1;
        this.f22486 = i18;
        this.f22497 = i18 < i4 ? str.charAt(i18) : (char) 26;
        this.f22496 = 3;
        this.f22491 = 16;
        if (z2) {
            return -i9;
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0142, code lost:
    
        r2 = r3;
        r17.f22496 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0146, code lost:
    
        return r2;
     */
    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] m19636(long r18) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19636(long):int[]");
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long m19647(long j) {
        int i;
        char charAt;
        this.f22496 = 0;
        int m19612 = m19612(j);
        if (m19612 == 0) {
            return 0L;
        }
        int i2 = m19612 + 1;
        int i3 = this.f22486 + m19612;
        String str = this.f22489;
        int i4 = this.f22493;
        char charAt2 = i3 >= i4 ? (char) 26 : str.charAt(i3);
        boolean z = charAt2 == '\"';
        if (z) {
            int i5 = m19612 + 2;
            int i6 = this.f22486 + i2;
            charAt2 = i6 >= i4 ? (char) 26 : str.charAt(i6);
            i2 = i5;
        }
        boolean z2 = charAt2 == '-';
        if (z2) {
            int i7 = i2 + 1;
            int i8 = this.f22486 + i2;
            i2 = i7;
            charAt2 = i8 >= i4 ? (char) 26 : str.charAt(i8);
        }
        if (charAt2 < '0' || charAt2 > '9') {
            this.f22496 = -1;
            return 0L;
        }
        long j2 = charAt2 - '0';
        while (true) {
            i = i2 + 1;
            int i9 = this.f22486 + i2;
            charAt = i9 >= i4 ? (char) 26 : str.charAt(i9);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            j2 = (j2 * 10) + (charAt - '0');
            i2 = i;
        }
        if (charAt == '.') {
            this.f22496 = -1;
            return 0L;
        }
        if (charAt == '\"') {
            if (!z) {
                this.f22496 = -1;
                return 0L;
            }
            int i10 = i2 + 2;
            int i11 = this.f22486 + i;
            charAt = i11 >= i4 ? (char) 26 : str.charAt(i11);
            i = i10;
        }
        if (j2 < 0) {
            this.f22496 = -1;
            return 0L;
        }
        if (charAt == ',') {
            int i12 = (i - 1) + this.f22486 + 1;
            this.f22486 = i12;
            this.f22497 = i12 < i4 ? str.charAt(i12) : (char) 26;
            this.f22496 = 3;
            this.f22491 = 16;
            if (z2) {
                return -j2;
            }
        } else if (charAt == '}') {
            char m19616 = m19616(this.f22486 + i);
            if (m19616 == ',') {
                this.f22491 = 16;
                int i13 = this.f22486 + i + 1;
                this.f22486 = i13;
                this.f22497 = i13 < i4 ? str.charAt(i13) : (char) 26;
            } else if (m19616 == ']') {
                this.f22491 = 15;
                int i14 = this.f22486 + i + 1;
                this.f22486 = i14;
                this.f22497 = i14 < i4 ? str.charAt(i14) : (char) 26;
            } else if (m19616 == '}') {
                this.f22491 = 13;
                int i15 = this.f22486 + i + 1;
                this.f22486 = i15;
                this.f22497 = i15 < i4 ? str.charAt(i15) : (char) 26;
            } else if (m19616 == 26) {
                this.f22491 = 20;
                this.f22486 += i;
                this.f22497 = (char) 26;
            } else {
                this.f22496 = -1;
                return 0L;
            }
            this.f22496 = 4;
            if (z2) {
                return -j2;
            }
        } else {
            this.f22496 = -1;
            return 0L;
        }
        return j2;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m19628(long j) {
        String str;
        this.f22496 = 0;
        int m19612 = m19612(j);
        if (m19612 == 0) {
            return null;
        }
        int i = m19612 + 1;
        int i2 = this.f22486 + m19612;
        int i3 = this.f22493;
        if (i2 >= i3) {
            throw new C15082("unclosed str, " + m19654());
        }
        String str2 = this.f22489;
        char charAt = str2.charAt(i2);
        String str3 = this.f22484;
        if (charAt != '\"') {
            this.f22496 = -1;
            return str3;
        }
        int i4 = this.f22486 + i;
        int indexOf = str2.indexOf(34, i4);
        if (indexOf == -1) {
            throw new C15082("unclosed str, " + m19654());
        }
        if (f22483) {
            str = str2.substring(i4, indexOf);
        } else {
            int i5 = indexOf - i4;
            str = new String(m19626(this.f22486 + i, i5), 0, i5);
        }
        if (str.indexOf(92) != -1) {
            boolean z = false;
            while (true) {
                int i6 = indexOf - 1;
                int i7 = 0;
                while (i6 >= 0 && str2.charAt(i6) == '\\') {
                    i7++;
                    i6--;
                    z = true;
                }
                if (i7 % 2 == 0) {
                    break;
                }
                indexOf = str2.indexOf(34, indexOf + 1);
            }
            int i8 = indexOf - i4;
            char[] m19626 = m19626(this.f22486 + i, i8);
            if (z) {
                str = m19606(m19626, i8);
            } else {
                str = new String(m19626, 0, i8);
                if (str.indexOf(92) != -1) {
                    str = m19606(m19626, i8);
                }
            }
        }
        int i9 = indexOf + 1;
        char charAt2 = i9 >= i3 ? (char) 26 : str2.charAt(i9);
        if (charAt2 == ',') {
            int i10 = indexOf + 2;
            this.f22486 = i10;
            this.f22497 = i10 < i3 ? str2.charAt(i10) : (char) 26;
            this.f22496 = 3;
            this.f22491 = 16;
            return str;
        }
        if (charAt2 == '}') {
            int i11 = indexOf + 2;
            char charAt3 = i11 >= i3 ? (char) 26 : str2.charAt(i11);
            if (charAt3 == ',') {
                this.f22491 = 16;
                this.f22486 = i11;
                m19657();
            } else if (charAt3 == ']') {
                this.f22491 = 15;
                this.f22486 = i11;
                m19657();
            } else if (charAt3 == '}') {
                this.f22491 = 13;
                this.f22486 = i11;
                m19657();
            } else if (charAt3 == 26) {
                this.f22491 = 20;
                this.f22486 = i11;
                this.f22497 = (char) 26;
            } else {
                this.f22496 = -1;
                return str3;
            }
            this.f22496 = 4;
            return str;
        }
        this.f22496 = -1;
        return str3;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Date m19650(long j) {
        int i;
        char charAt;
        char c;
        int i2;
        Date date;
        this.f22496 = 0;
        int m19612 = m19612(j);
        if (m19612 == 0) {
            return null;
        }
        int i3 = this.f22486;
        char c2 = this.f22497;
        int i4 = m19612 + 1;
        int i5 = i3 + m19612;
        int i6 = this.f22493;
        String str = this.f22489;
        char charAt2 = i5 >= i6 ? (char) 26 : str.charAt(i5);
        if (charAt2 == '\"') {
            int i7 = this.f22486;
            int i8 = i7 + i4;
            int i9 = m19612 + 2;
            int i10 = i7 + i4;
            if (i10 < i6) {
                str.charAt(i10);
            }
            int indexOf = str.indexOf(34, this.f22486 + i9);
            if (indexOf == -1) {
                throw new C15082("unclosed str");
            }
            int i11 = indexOf - i8;
            this.f22486 = i8;
            if (m19622(i11, false)) {
                date = this.f22494.getTime();
                int i12 = i9 + i11;
                i2 = i12 + 1;
                c = m19616(i12 + i3);
                this.f22486 = i3;
            } else {
                this.f22486 = i3;
                this.f22496 = -1;
                return null;
            }
        } else {
            if (charAt2 < '0' || charAt2 > '9') {
                this.f22496 = -1;
                return null;
            }
            long j2 = charAt2 - '0';
            while (true) {
                i = i4 + 1;
                int i13 = this.f22486 + i4;
                charAt = i13 >= i6 ? (char) 26 : str.charAt(i13);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                j2 = (j2 * 10) + (charAt - '0');
                i4 = i;
            }
            if (charAt == '.') {
                this.f22496 = -1;
                return null;
            }
            if (charAt == '\"') {
                i2 = i4 + 2;
                int i14 = this.f22486 + i;
                c = i14 >= i6 ? (char) 26 : str.charAt(i14);
            } else {
                c = charAt;
                i2 = i;
            }
            if (j2 < 0) {
                this.f22496 = -1;
                return null;
            }
            date = new Date(j2);
        }
        if (c == ',') {
            int i15 = (i2 - 1) + this.f22486 + 1;
            this.f22486 = i15;
            this.f22497 = i15 < i6 ? str.charAt(i15) : (char) 26;
            this.f22496 = 3;
            this.f22491 = 16;
            return date;
        }
        if (c == '}') {
            char m19616 = m19616(this.f22486 + i2);
            if (m19616 == ',') {
                this.f22491 = 16;
                int i16 = this.f22486 + i2 + 1;
                this.f22486 = i16;
                this.f22497 = i16 < i6 ? str.charAt(i16) : (char) 26;
            } else if (m19616 == ']') {
                this.f22491 = 15;
                int i17 = this.f22486 + i2 + 1;
                this.f22486 = i17;
                this.f22497 = i17 < i6 ? str.charAt(i17) : (char) 26;
            } else if (m19616 == '}') {
                this.f22491 = 13;
                int i18 = this.f22486 + i2 + 1;
                this.f22486 = i18;
                this.f22497 = i18 < i6 ? str.charAt(i18) : (char) 26;
            } else if (m19616 == 26) {
                this.f22491 = 20;
                this.f22486 += i2;
                this.f22497 = (char) 26;
            } else {
                this.f22486 = i3;
                this.f22497 = c2;
                this.f22496 = -1;
                return null;
            }
            this.f22496 = 4;
            return date;
        }
        this.f22486 = i3;
        this.f22497 = c2;
        this.f22496 = -1;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008b  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m19642(long r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19642(long):boolean");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float m19659(long j) {
        int i;
        char m19616;
        int i2;
        float f;
        float parseFloat;
        this.f22496 = 0;
        int m19612 = m19612(j);
        if (m19612 == 0) {
            return 0.0f;
        }
        int i3 = m19612 + 1;
        char m196162 = m19616(this.f22486 + m19612);
        int i4 = this.f22486;
        int i5 = (i4 + i3) - 1;
        boolean z = m196162 == '-';
        if (z) {
            m196162 = m19616(i4 + i3);
            i3 = m19612 + 2;
        }
        if (m196162 >= '0' && m196162 <= '9') {
            int i6 = m196162 - '0';
            while (true) {
                i = i3 + 1;
                m19616 = m19616(this.f22486 + i3);
                if (m19616 < '0' || m19616 > '9') {
                    break;
                }
                i6 = (i6 * 10) + (m19616 - '0');
                i3 = i;
            }
            if (m19616 == '.') {
                int i7 = i3 + 2;
                char m196163 = m19616(this.f22486 + i);
                if (m196163 >= '0' && m196163 <= '9') {
                    i2 = 10;
                    i6 = (m196163 - '0') + (i6 * 10);
                    while (true) {
                        i = i7 + 1;
                        m19616 = m19616(this.f22486 + i7);
                        if (m19616 < '0' || m19616 > '9') {
                            break;
                        }
                        i6 = (i6 * 10) + (m19616 - '0');
                        i2 *= 10;
                        i7 = i;
                    }
                } else {
                    this.f22496 = -1;
                    return 0.0f;
                }
            } else {
                i2 = 1;
            }
            boolean z2 = m19616 == 'e' || m19616 == 'E';
            if (z2) {
                int i8 = i + 1;
                char m196164 = m19616(this.f22486 + i);
                f = 0.0f;
                if (m196164 == '+' || m196164 == '-') {
                    i += 2;
                    m196164 = m19616(this.f22486 + i8);
                } else {
                    i = i8;
                }
                m19616 = m196164;
                while (m19616 >= '0' && m19616 <= '9') {
                    m19616 = m19616(this.f22486 + i);
                    i++;
                }
            } else {
                f = 0.0f;
            }
            int i9 = ((this.f22486 + i) - i5) - 1;
            if (z2 || i9 >= 10) {
                parseFloat = Float.parseFloat(m19610(i5, i9));
            } else {
                parseFloat = i6 / i2;
                if (z) {
                    parseFloat = -parseFloat;
                }
            }
            if (m19616 == ',') {
                this.f22486 = (i - 1) + this.f22486;
                m19657();
                this.f22496 = 3;
                this.f22491 = 16;
                return parseFloat;
            }
            if (m19616 == '}') {
                char m196165 = m19616(this.f22486 + i);
                if (m196165 == ',') {
                    this.f22491 = 16;
                    this.f22486 += i;
                    m19657();
                } else if (m196165 == ']') {
                    this.f22491 = 15;
                    this.f22486 += i;
                    m19657();
                } else if (m196165 == '}') {
                    this.f22491 = 13;
                    this.f22486 += i;
                    m19657();
                } else if (m196165 == 26) {
                    this.f22486 += i;
                    this.f22491 = 20;
                    this.f22497 = (char) 26;
                } else {
                    this.f22496 = -1;
                    return f;
                }
                this.f22496 = 4;
                return parseFloat;
            }
            this.f22496 = -1;
            return f;
        }
        this.f22496 = -1;
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0211, code lost:
    
        r20.f22496 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0214, code lost:
    
        return null;
     */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[] m19633(long r21) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19633(long):float[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x00d6, code lost:
    
        r18.f22496 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x025b, code lost:
    
        r18.f22496 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x025e, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0126  */
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[][] m19658(long r19) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19658(long):float[][]");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final double m19653(long j) {
        int i;
        char m19616;
        int i2;
        double parseDouble;
        int i3;
        char m196162;
        this.f22496 = 0;
        int m19612 = m19612(j);
        if (m19612 == 0) {
            return 0.0d;
        }
        int i4 = m19612 + 1;
        char m196163 = m19616(this.f22486 + m19612);
        int i5 = this.f22486;
        int i6 = (i5 + i4) - 1;
        boolean z = m196163 == '-';
        if (z) {
            m196163 = m19616(i5 + i4);
            i4 = m19612 + 2;
        }
        if (m196163 >= '0' && m196163 <= '9') {
            int i7 = m196163 - '0';
            while (true) {
                i = i4 + 1;
                m19616 = m19616(this.f22486 + i4);
                if (m19616 < '0' || m19616 > '9') {
                    break;
                }
                i7 = (i7 * 10) + (m19616 - '0');
                i4 = i;
            }
            if (m19616 == '.') {
                int i8 = i4 + 2;
                char m196164 = m19616(this.f22486 + i);
                if (m196164 < '0' || m196164 > '9') {
                    this.f22496 = -1;
                    return 0.0d;
                }
                int i9 = (m196164 - '0') + (i7 * 10);
                int i10 = 10;
                while (true) {
                    i3 = i8 + 1;
                    m196162 = m19616(this.f22486 + i8);
                    if (m196162 < '0' || m196162 > '9') {
                        break;
                    }
                    i9 = (i9 * 10) + (m196162 - '0');
                    i10 *= 10;
                    i8 = i3;
                }
                i = i3;
                i2 = i10;
                i7 = i9;
                m19616 = m196162;
            } else {
                i2 = 1;
            }
            boolean z2 = m19616 == 'e' || m19616 == 'E';
            if (z2) {
                int i11 = i + 1;
                m19616 = m19616(this.f22486 + i);
                if (m19616 == '+' || m19616 == '-') {
                    i += 2;
                    m19616 = m19616(this.f22486 + i11);
                } else {
                    i = i11;
                }
                while (m19616 >= '0' && m19616 <= '9') {
                    m19616 = m19616(this.f22486 + i);
                    i++;
                }
            }
            int i12 = ((this.f22486 + i) - i6) - 1;
            if (z2 || i12 >= 10) {
                parseDouble = Double.parseDouble(m19610(i6, i12));
            } else {
                parseDouble = i7 / i2;
                if (z) {
                    parseDouble = -parseDouble;
                }
            }
            if (m19616 == ',') {
                this.f22486 = (i - 1) + this.f22486;
                m19657();
                this.f22496 = 3;
                this.f22491 = 16;
                return parseDouble;
            }
            if (m19616 == '}') {
                char m196165 = m19616(this.f22486 + i);
                if (m196165 == ',') {
                    this.f22491 = 16;
                    this.f22486 += i;
                    m19657();
                } else if (m196165 == ']') {
                    this.f22491 = 15;
                    this.f22486 += i;
                    m19657();
                } else if (m196165 == '}') {
                    this.f22491 = 13;
                    this.f22486 += i;
                    m19657();
                } else if (m196165 == 26) {
                    this.f22486 += i;
                    this.f22491 = 20;
                    this.f22497 = (char) 26;
                } else {
                    this.f22496 = -1;
                    return 0.0d;
                }
                this.f22496 = 4;
                return parseDouble;
            }
            this.f22496 = -1;
            return 0.0d;
        }
        this.f22496 = -1;
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0218, code lost:
    
        r20.f22496 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x021b, code lost:
    
        return r3;
     */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double[] m19652(long r21) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19652(long):double[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x00d6, code lost:
    
        r18.f22496 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x00d9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x025d, code lost:
    
        r18.f22496 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0260, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0126  */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double[][] m19645(long r19) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19645(long):double[][]");
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long m19629(long j) {
        this.f22496 = 0;
        int m19612 = m19612(j);
        if (m19612 == 0) {
            return 0L;
        }
        int i = m19612 + 1;
        int i2 = this.f22486 + m19612;
        String str = this.f22489;
        int i3 = this.f22493;
        if ((i2 >= i3 ? (char) 26 : str.charAt(i2)) != '\"') {
            this.f22496 = -1;
            return 0L;
        }
        long j2 = -3750763034362895579L;
        while (true) {
            int i4 = i + 1;
            int i5 = this.f22486 + i;
            char charAt = i5 >= i3 ? (char) 26 : str.charAt(i5);
            if (charAt == '\"') {
                int i6 = i + 2;
                int i7 = this.f22486 + i4;
                char charAt2 = i7 >= i3 ? (char) 26 : str.charAt(i7);
                if (charAt2 == ',') {
                    int m44633 = C19373.m44633(i, 1, this.f22486, 1);
                    this.f22486 = m44633;
                    this.f22497 = m44633 < i3 ? str.charAt(m44633) : (char) 26;
                    this.f22496 = 3;
                    return j2;
                }
                if (charAt2 == '}') {
                    int i8 = this.f22486 + i6;
                    char charAt3 = i8 >= i3 ? (char) 26 : str.charAt(i8);
                    if (charAt3 == ',') {
                        this.f22491 = 16;
                        this.f22486 = i + 2 + this.f22486;
                        m19657();
                    } else if (charAt3 == ']') {
                        this.f22491 = 15;
                        this.f22486 = i + 2 + this.f22486;
                        m19657();
                    } else if (charAt3 == '}') {
                        this.f22491 = 13;
                        this.f22486 = i + 2 + this.f22486;
                        m19657();
                    } else if (charAt3 == 26) {
                        this.f22491 = 20;
                        this.f22486 = i + 2 + this.f22486;
                        this.f22497 = (char) 26;
                    } else {
                        this.f22496 = -1;
                        return 0L;
                    }
                    this.f22496 = 4;
                    return j2;
                }
                this.f22496 = -1;
                return 0L;
            }
            j2 = (j2 ^ charAt) * 1099511628211L;
            if (charAt == '\\') {
                this.f22496 = -1;
                return 0L;
            }
            i = i4;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m19643(boolean z) {
        return m19622(this.f22493 - this.f22486, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fa  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m19622(int r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 1603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7322.m19622(int, boolean):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19621(char c, char c2, char c3, char c4, char c5, char c6) {
        this.f22494.set(11, (c2 - '0') + ((c - '0') * 10));
        this.f22494.set(12, (c4 - '0') + ((c3 - '0') * 10));
        this.f22494.set(13, (c6 - '0') + ((c5 - '0') * 10));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19620(char c, char c2, char c3) {
        int i = ((c3 - '0') + ((c2 - '0') * 10)) * 3600000;
        if (c == '-') {
            i = -i;
        }
        if (this.f22494.getTimeZone().getRawOffset() != i) {
            String[] availableIDs = TimeZone.getAvailableIDs(i);
            if (availableIDs.length > 0) {
                this.f22494.setTimeZone(C3261.getTimeZone(availableIDs[0]));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19607(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8) {
        Calendar calendar = Calendar.getInstance(this.f22485, this.f22492);
        this.f22494 = calendar;
        int i = c4 - '0';
        calendar.set(1, i + ((c3 - '0') * 10) + ((c2 - '0') * 100) + ((c - '0') * 1000));
        this.f22494.set(2, ((c6 - '0') + ((c5 - '0') * 10)) - 1);
        this.f22494.set(5, (c8 - '0') + ((c7 - '0') * 10));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] m19609(int i, int i2, String str) {
        int[] iArr;
        int i3;
        if (i2 == 0) {
            return new byte[0];
        }
        int i4 = (i + i2) - 1;
        while (true) {
            iArr = f22482;
            if (i >= i4 || iArr[str.charAt(i)] >= 0) {
                break;
            }
            i++;
        }
        while (i4 > 0 && iArr[str.charAt(i4)] < 0) {
            i4--;
        }
        int i5 = str.charAt(i4) == '=' ? str.charAt(i4 + (-1)) == '=' ? 2 : 1 : 0;
        int i6 = (i4 - i) + 1;
        if (i2 > 76) {
            i3 = (str.charAt(76) == '\r' ? i6 / 78 : 0) << 1;
        } else {
            i3 = 0;
        }
        int i7 = (((i6 - i3) * 6) >> 3) - i5;
        byte[] bArr = new byte[i7];
        int i8 = (i7 / 3) * 3;
        int i9 = 0;
        loop2: while (true) {
            int i10 = 0;
            while (i9 < i8) {
                int i11 = i + 4;
                int i12 = (iArr[str.charAt(i + 1)] << 12) | (iArr[str.charAt(i)] << 18) | (iArr[str.charAt(i + 2)] << 6) | iArr[str.charAt(i + 3)];
                bArr[i9] = (byte) (i12 >> 16);
                int i13 = i9 + 2;
                bArr[i9 + 1] = (byte) (i12 >> 8);
                i9 += 3;
                bArr[i13] = (byte) i12;
                if (i3 <= 0 || (i10 = i10 + 1) != 19) {
                    i = i11;
                }
            }
            i += 6;
        }
        if (i9 < i7) {
            int i14 = 0;
            int i15 = 0;
            while (i <= i4 - i5) {
                i14 |= iArr[str.charAt(i)] << (18 - (i15 * 6));
                i15++;
                i++;
            }
            int i16 = 16;
            while (i9 < i7) {
                bArr[i9] = (byte) (i14 >> i16);
                i16 -= 8;
                i9++;
            }
        }
        return bArr;
    }
}

package l;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import com.umeng.analytics.pro.bo;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.bouncycastle.crypto.hpke.HPKE;

/* compiled from: O5DR */
/* renamed from: l.᩸ܽܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21707 implements Cloneable {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public byte f69630;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f69635;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f69646;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f69652;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f69656;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static final C0225 f69627 = new C0225(2);

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f69625 = Pattern.compile("(\\d+)x(\\d+)");

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f69626 = Pattern.compile("(\\d+)dpi");

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final int[][] f69621 = {new int[]{19, 1}, new int[]{12, 4}, new int[]{16, 3}, new int[]{20, 4}, new int[]{24, 4}, new int[]{28, 1}, new int[]{48, 1}, new int[]{49, 1}, new int[]{29, 1}, new int[]{30, 2}, new int[]{32, 4}};

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f69620 = {'e', 'n'};

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f69622 = {'U', 'S'};

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final char[] f69624 = {173, 5};

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final char[] f69623 = {'t', 'l'};

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public EnumC10418 f69660 = EnumC10418.AOSP;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final byte[] f69632 = new byte[3];

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public short f69651 = 0;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public short f69653 = 0;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public char[] f69644 = new char[2];

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public char[] f69659 = new char[2];

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public byte f69661 = 0;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public byte f69629 = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f69634 = 0;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public byte f69636 = 0;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public byte f69648 = 0;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte f69642 = 0;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public byte f69645 = 0;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f69633 = 0;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f69641 = 0;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public short f69655 = 0;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public byte f69650 = 0;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public byte f69639 = 0;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public int f69628 = 0;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f69654 = 0;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f69640 = 0;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public char[] f69638 = new char[4];

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public char[] f69643 = new char[8];

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public byte f69631 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public byte f69658 = 0;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public short f69657 = 0;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public char[] f69647 = new char[8];

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public byte[] f69649 = null;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public String f69637 = null;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48994(int i, int i2) {
        if ((i & i2) == 0) {
            return 0;
        }
        return i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char[] m49006(byte b, byte b2, char c) {
        if (((b >> 7) & 1) != 1) {
            return new char[]{(char) b, (char) b2};
        }
        return new char[]{(char) ((b2 & bo.j) + c), (char) (((b2 & bo.k) >> 5) + ((b & 3) << 3) + c), (char) (((b & 124) >> 2) + c)};
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21707 m49000(C5896 c5896, EnumC10418 enumC10418) {
        C21707 c21707 = new C21707();
        C11003.requireNonNull(enumC10418);
        c21707.f69660 = enumC10418;
        c21707.m49003(c5896);
        return c21707;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21707 m48999(String str, EnumC10418 enumC10418) {
        C21707 c21707 = new C21707();
        C11003.requireNonNull(enumC10418);
        c21707.f69660 = enumC10418;
        c21707.m49001(str);
        return c21707;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC10418 m49021() {
        return this.f69660;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private byte[] m49018() {
        int i;
        byte[] bArr = this.f69656;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = this.f69649;
        byte[] bArr3 = this.f69632;
        if (bArr2 != null) {
            i = this.f69660.f31318 + bArr2.length;
        } else {
            if (this.f69635 == 0 && this.f69646 == 0 && this.f69652 == 0 && this.f69630 == 0 && m49017(this.f69647)) {
                for (byte b : bArr3) {
                    if (b == 0) {
                    }
                }
                if (this.f69631 != 0 || this.f69658 != 0 || this.f69657 != 0) {
                    i = 52;
                } else if (!m49017(this.f69638) || !m49017(this.f69643)) {
                    i = 48;
                } else if (this.f69654 == 0 && this.f69640 == 0) {
                    i = (this.f69650 == 0 && this.f69639 == 0 && this.f69628 == 0) ? 28 : 32;
                } else {
                    i = 36;
                }
            }
            i = this.f69660.f31318;
            break;
        }
        int i2 = i - 4;
        C10130 c10130 = new C10130(i2);
        c10130.mo13229(this.f69651);
        c10130.mo13229(this.f69653);
        byte[] bArr4 = new byte[2];
        m49004(bArr4, this.f69644, 'a');
        c10130.write(bArr4, 0, 2);
        m49004(bArr4, this.f69659, '0');
        c10130.write(bArr4, 0, 2);
        c10130.writeByte(this.f69661);
        c10130.writeByte(this.f69629);
        c10130.mo13231(this.f69634);
        c10130.writeByte(this.f69636);
        c10130.writeByte(this.f69648);
        c10130.writeByte(this.f69642);
        c10130.writeByte(this.f69645);
        c10130.mo13231(this.f69633);
        c10130.mo13231(this.f69641);
        c10130.mo13229(this.f69655);
        c10130.mo13229((short) 0);
        if (i >= 32) {
            c10130.writeByte(this.f69650);
            c10130.writeByte(this.f69639);
            c10130.mo13231(this.f69628);
        }
        if (i >= 36) {
            c10130.mo13231(this.f69654);
            c10130.mo13231(this.f69640);
        }
        if (i >= 48) {
            byte[] bArr5 = new byte[12];
            for (int i3 = 0; i3 < 4; i3++) {
                bArr5[i3] = (byte) this.f69638[i3];
            }
            for (int i4 = 0; i4 < 8; i4++) {
                bArr5[i4 + 4] = (byte) this.f69643[i4];
            }
            c10130.write(bArr5, 0, 12);
        }
        if (i >= 52) {
            c10130.writeByte(this.f69631);
            c10130.writeByte(this.f69658);
            c10130.mo13229(this.f69657);
        }
        EnumC10418 enumC10418 = this.f69660;
        if (enumC10418 == EnumC10418.MOTOROLA_76 && i >= enumC10418.f31318) {
            c10130.writeInt(this.f69635);
            c10130.writeInt(this.f69646);
            c10130.writeInt(this.f69652);
        }
        if (i >= this.f69660.f31318) {
            c10130.writeByte(this.f69630);
            for (char c : this.f69647) {
                c10130.writeByte((byte) c);
            }
            c10130.write(bArr3);
        }
        if (i > this.f69660.f31318) {
            c10130.write(this.f69649);
        }
        byte[] m25444 = c10130.m25444();
        this.f69656 = m25444;
        if (m25444.length == i2) {
            return m25444;
        }
        throw new RuntimeException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m49020(C21707 c21707) {
        int i;
        byte[] m49018 = m49018();
        byte[] m490182 = c21707.m49018();
        int m48995 = m48995(4, 4, m49018, m490182);
        if (m48995 != 0) {
            return m48995;
        }
        int m489952 = m48995(8, 4, m49018, m490182);
        if (m489952 != 0) {
            return m489952;
        }
        int i2 = 36;
        while (true) {
            if (i2 >= 40) {
                int i3 = 0;
                while (true) {
                    if (i3 >= 8) {
                        i = 0;
                        break;
                    }
                    int i4 = 40 + i3;
                    i = Integer.compare(m48996(i4, m49018), m48996(i4, m490182));
                    if (i != 0) {
                        break;
                    }
                    i3++;
                }
                if (i != 0) {
                    return i;
                }
                int i5 = 0;
                for (int i6 = 0; i6 < 8 && i5 == 0; i6++) {
                    i5 = Integer.compare(this.f69647[i6], c21707.f69647[i6]);
                }
                if (i5 != 0) {
                    return i5;
                }
                for (int[] iArr : f69621) {
                    int m489953 = m48995(iArr[0], iArr[1], m49018, m490182);
                    if (m489953 != 0) {
                        return m489953;
                    }
                }
                int compare = Integer.compare(this.f69660.ordinal(), c21707.f69660.ordinal());
                if (compare != 0) {
                    return compare;
                }
                if (this.f69660 == EnumC10418.MOTOROLA_76) {
                    for (int i7 = 52; i7 < 64; i7 += 4) {
                        int m489954 = m48995(i7, 4, m49018, m490182);
                        if (m489954 != 0) {
                            return m489954;
                        }
                    }
                }
                return 0;
            }
            int compare2 = Integer.compare(this.f69630 != 0 ? 0 : m48996(i2, m49018), c21707.f69630 == 0 ? m48996(i2, m490182) : 0);
            if (compare2 != 0) {
                return compare2;
            }
            i2++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48996(int i, byte[] bArr) {
        int i2 = i - 4;
        if (i2 < bArr.length) {
            return bArr[i2] & 255;
        }
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48995(int i, int i2, byte[] bArr, byte[] bArr2) {
        int compare;
        do {
            i2--;
            if (i2 < 0) {
                return 0;
            }
            int i3 = i + i2;
            compare = Integer.compare(m48996(i3, bArr), m48996(i3, bArr2));
        } while (compare == 0);
        return compare;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m49027() {
        return m49018().length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49022(InterfaceC4485 interfaceC4485) {
        byte[] m49018 = m49018();
        interfaceC4485.writeInt(m49018.length + 4);
        interfaceC4485.write(m49018);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49003(C5896 c5896) {
        int i;
        int m16535 = c5896.m16535();
        if (m16535 < 8) {
            throw new IOException(C18307.m42645(m16535, "Config size = ", " is too small"));
        }
        if (m16535 > 255) {
            m16535 = Math.min(this.f69660.f31318, c5896.m16525());
        }
        byte[] bArr = new byte[m16535 - 4];
        try {
            c5896.m16526(bArr);
            C12951 c12951 = new C12951(bArr);
            this.f69651 = c12951.readShort();
            this.f69653 = c12951.readShort();
            if (m16535 >= 12) {
                this.f69644 = m49006(c12951.readByte(), c12951.readByte(), 'a');
                this.f69659 = m49006(c12951.readByte(), c12951.readByte(), '0');
            } else {
                this.f69644 = new char[2];
                this.f69659 = new char[2];
            }
            if (m16535 >= 14) {
                this.f69661 = c12951.readByte();
                this.f69629 = c12951.readByte();
            }
            if (m16535 >= 16) {
                this.f69634 = c12951.m31494();
            }
            if (m16535 >= 28) {
                this.f69636 = c12951.readByte();
                this.f69648 = c12951.readByte();
                this.f69642 = c12951.readByte();
                this.f69645 = c12951.readByte();
                this.f69633 = c12951.m31494();
                this.f69641 = c12951.m31494();
                this.f69655 = c12951.readShort();
                c12951.skipBytes(2);
            }
            if (m16535 >= 32) {
                this.f69650 = c12951.readByte();
                this.f69639 = c12951.readByte();
                this.f69628 = c12951.m31494();
            }
            if (m16535 >= 36) {
                this.f69654 = c12951.m31494();
                this.f69640 = c12951.m31494();
            }
            if (m16535 >= 48) {
                char[] cArr = new char[4];
                for (int i2 = 0; i2 < 4; i2++) {
                    cArr[i2] = (char) c12951.readByte();
                }
                this.f69638 = cArr;
                char[] cArr2 = new char[8];
                for (int i3 = 0; i3 < 8; i3++) {
                    cArr2[i3] = (char) c12951.readByte();
                }
                this.f69643 = cArr2;
            }
            if (m16535 >= 52) {
                this.f69631 = c12951.readByte();
                this.f69658 = c12951.readByte();
                this.f69657 = c12951.readShort();
            }
            if (this.f69660 == EnumC10418.MOTOROLA_76 && m16535 > 52) {
                if (m16535 < 76) {
                    throw new IOException("Truncated Motorola config");
                }
                this.f69635 = c12951.readInt();
                this.f69646 = c12951.readInt();
                this.f69652 = c12951.readInt();
            }
            int i4 = this.f69660.f31318 - 12;
            if (m16535 > i4) {
                this.f69630 = c12951.readByte();
                int i5 = 0;
                while (true) {
                    i = m16535 - i4;
                    if (i5 >= Math.min(8, i - 1)) {
                        break;
                    }
                    this.f69647[i5] = (char) (c12951.readByte() & 255);
                    i5++;
                }
                for (int i6 = 0; i6 < Math.min(3, i - 9); i6++) {
                    this.f69632[i6] = c12951.readByte();
                }
            }
            int i7 = m16535 - this.f69660.f31318;
            if (i7 > 0) {
                byte[] bArr2 = new byte[i7];
                c12951.m31489(i7, bArr2);
                for (int i8 = 0; i8 < i7; i8++) {
                    if (bArr2[i8] != 0) {
                        this.f69649 = bArr2;
                        return;
                    }
                }
            }
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x05c6, code lost:
    
        if (r9.length == 3) goto L348;
     */
    /* JADX WARN: Removed duplicated region for block: B:449:0x08cb A[LOOP:2: B:440:0x0858->B:449:0x08cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x08ce A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m49001(java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 2692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21707.m49001(java.lang.String):void");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m49016(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Empty unsigned config field");
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                throw new IllegalArgumentException("Invalid unsigned config field: ".concat(str));
            }
        }
        long parseLong = Long.parseLong(str);
        if (parseLong <= 4294967295L) {
            return (int) parseLong;
        }
        throw new IllegalArgumentException("Config field overflow: ".concat(str));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m49017(char[] cArr) {
        for (char c : cArr) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m49012(char[] cArr) {
        char c;
        int i = 0;
        while (i < cArr.length && (c = cArr[i]) != 0) {
            if ((c < 'a' || c > 'z') && ((c < 'A' || c > 'Z') && (c < '0' || c > '9'))) {
                return false;
            }
            i++;
        }
        if (i < 3 || i > 8) {
            return false;
        }
        while (i < cArr.length) {
            if (cArr[i] != 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m49011(String str) {
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0 || parseInt > 65535) {
            throw new NumberFormatException(C4860.m14172("Value out of range. Value:\"", str, "\""));
        }
        return parseInt;
    }

    /* JADX WARN: Removed duplicated region for block: B:161:0x03dd  */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m49025() {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21707.m49025():java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49004(byte[] bArr, char[] cArr, char c) {
        if (cArr.length == 2) {
            bArr[0] = (byte) cArr[0];
            bArr[1] = (byte) cArr[1];
        } else {
            if (cArr.length == 3) {
                int i = (((cArr[2] - c) & 31) << 10) | 32768 | (((cArr[1] - c) & 31) << 5) | ((cArr[0] - c) & 31);
                bArr[0] = (byte) ((i >> 8) & 255);
                bArr[1] = (byte) (i & 255);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
    
        if (java.util.Arrays.equals(r4.f69647, r5.f69647) != false) goto L32;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m49024(l.C21707 r5) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21707.m49024(l.᩸ܽܽ):int");
    }

    public final String toString() {
        if (m49025().isEmpty()) {
            return "[DEFAULT]";
        }
        String m49025 = m49025();
        return m49025.charAt(0) == '-' ? m49025.substring(1) : m49025;
    }

    public final boolean equals(Object obj) {
        if (obj == null || C21707.class != obj.getClass()) {
            return false;
        }
        C21707 c21707 = (C21707) obj;
        return this.f69660 == c21707.f69660 && this.f69630 == c21707.f69630 && m49025().equals(c21707.m49025());
    }

    public final int hashCode() {
        return m49025().hashCode() + (((this.f69660.hashCode() * 31) + this.f69630) * 31);
    }

    public final Object clone() {
        try {
            return (C21707) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0311, code lost:
    
        if ((r10.m49008() != 0) != false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x038b, code lost:
    
        if ((r10.m49010() != 0) != false) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03cb, code lost:
    
        if ((r10.m49007() != 0) != false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0334, code lost:
    
        if (r6 == r5) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x034d, code lost:
    
        if (r3 == 0) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
    
        if (m49005(r0, r3) == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x01ac, code lost:
    
        if (r11 == 0) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f9, code lost:
    
        if ((r10.f69650 != 0) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x007d, code lost:
    
        if (m49005(r0, r3) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x00a1, code lost:
    
        if (r9.f69644[0] != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x00b8, code lost:
    
        if (r0 > 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x00e0, code lost:
    
        if (m49005(r10.f69644, r11.f69644) == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x012b, code lost:
    
        if ((r10.f69628 != 0) != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0149, code lost:
    
        if ((r10.m49009() != 0) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0187, code lost:
    
        if ((r10.f69650 != 0) != false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01e0, code lost:
    
        if ((r10.f69631 != 0) != false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x020a, code lost:
    
        if ((r10.f69658 != 0) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x025c, code lost:
    
        if ((r10.f69639 != 0) != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x029f, code lost:
    
        if ((r10.m49015() != 0) != false) goto L276;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x03de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03df A[RETURN] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m49023(l.C21707 r10, l.C21707 r11) {
        /*
            Method dump skipped, instructions count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21707.m49023(l.᩸ܽܽ, l.᩸ܽܽ):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0156, code lost:
    
        if (r0 != r10.f69648) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r0[0] == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (m49005(r0, r10.f69659) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
    
        if (java.util.Arrays.equals(r4, r10.f69638) == false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b5, code lost:
    
        if (r0 != r3) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00bd, code lost:
    
        if (r5 > r10.f69628) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
    
        if (r0 != r3) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0144, code lost:
    
        if (r0 != r3) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x014d, code lost:
    
        if (r0 != r10.f69636) goto L142;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m49026(l.C21707 r10) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21707.m49026(l.᩸ܽܽ):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21707 m48998(Resources resources) {
        char c;
        C21707 c21707 = new C21707();
        Configuration configuration = resources.getConfiguration();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 26 ? configuration.colorMode : 0;
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        if (i3 >= i4) {
            i3 = i4;
            i4 = i3;
        }
        int i5 = configuration.keyboardHidden;
        if (i5 == 1 && configuration.hardKeyboardHidden == 2) {
            i5 = 3;
        }
        int i6 = configuration.mcc;
        int i7 = configuration.mnc;
        Locale locale = configuration.locale;
        int i8 = configuration.orientation;
        int i9 = configuration.touchscreen;
        int i10 = configuration.densityDpi;
        int i11 = configuration.keyboard;
        int i12 = configuration.navigation;
        int i13 = configuration.smallestScreenWidthDp;
        int i14 = configuration.screenWidthDp;
        int i15 = configuration.screenHeightDp;
        int i16 = i2;
        int i17 = configuration.screenLayout;
        int i18 = configuration.uiMode;
        c21707.f69651 = (short) i6;
        c21707.f69653 = (short) i7;
        c21707.f69661 = (byte) i8;
        c21707.f69629 = (byte) i9;
        c21707.f69634 = (short) i10;
        c21707.f69636 = (byte) i11;
        c21707.f69642 = (byte) i5;
        c21707.f69648 = (byte) i12;
        c21707.f69633 = (short) i4;
        c21707.f69641 = (short) i3;
        c21707.f69628 = (short) i13;
        c21707.f69654 = (short) i14;
        c21707.f69640 = (short) i15;
        c21707.f69650 = (byte) i17;
        c21707.f69639 = (byte) i18;
        c21707.f69658 = (byte) i16;
        c21707.f69655 = (short) i;
        if (locale != null) {
            String language = locale.getLanguage();
            language.getClass();
            switch (language.hashCode()) {
                case 3325:
                    if (language.equals("he")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (language.equals("id")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3856:
                    if (language.equals("yi")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    language = "iw";
                    break;
                case 1:
                    language = "in";
                    break;
                case 2:
                    language = "ji";
                    break;
            }
            m49002(language, c21707.f69644);
            m49002(locale.getCountry(), c21707.f69659);
            m49002(locale.getScript(), c21707.f69638);
            m49002(locale.getVariant(), c21707.f69643);
        }
        c21707.f69631 = (byte) ((i17 & 768) >> 8);
        return c21707;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48997(char[] cArr) {
        int i = 0;
        while (i < cArr.length) {
            if (cArr[i] == 0) {
                return i == 0 ? "" : new String(cArr, 0, i);
            }
            i++;
        }
        return new String(cArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49002(String str, char[] cArr) {
        int min = Math.min(str.length(), cArr.length);
        Arrays.fill(cArr, (char) 0);
        for (int i = 0; i < min; i++) {
            cArr[i] = str.charAt(i);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m49014() {
        return ((this.f69651 & HPKE.aead_EXPORT_ONLY) << 16) | (65535 & this.f69653);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private int m49019() {
        char[] cArr = this.f69644;
        int i = ((cArr[1] & 255) << 16) | ((cArr[0] & 255) << 24);
        char[] cArr2 = this.f69659;
        return i | ((cArr2[0] & 255) << 8) | (cArr2[1] & 255);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private int m49009() {
        return ((this.f69654 & 65535) << 16) | (65535 & this.f69640);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private int m49015() {
        return ((this.f69661 & 255) << 24) | ((this.f69629 & 255) << 16) | (this.f69634 & 65535);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private int m49008() {
        return ((this.f69636 & 255) << 24) | ((this.f69648 & 255) << 16) | ((this.f69642 & 255) << 8);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m49007() {
        return (this.f69655 & HPKE.aead_EXPORT_ONLY) << 16;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private int m49010() {
        return ((this.f69633 & 65535) << 16) | (65535 & this.f69641);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m49013(char[] cArr, char[] cArr2) {
        if (m49005(cArr, cArr2)) {
            return true;
        }
        char[] cArr3 = f69623;
        boolean m49005 = m49005(cArr, cArr3);
        char[] cArr4 = f69624;
        if (m49005 && m49005(cArr2, cArr4)) {
            return true;
        }
        return m49005(cArr, cArr4) && m49005(cArr2, cArr3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m49005(char[] cArr, char[] cArr2) {
        return cArr[0] == cArr2[0] && cArr[1] == cArr2[1];
    }
}

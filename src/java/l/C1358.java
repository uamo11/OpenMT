package l;

import com.google.android.material.timepicker.ChipTextInputComboView;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: 3AHN */
/* renamed from: l.֨᩷֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1358 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f4924 = Pattern.compile("-?\\d{1,19}(?:\\.\\d{1,19})?");

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f4925;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f4926;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4529 f4927;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f4928;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f4929;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C4529 f4930;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f4931;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f4932;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final HashMap f4933;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public long f4934;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f4935;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public String f4936;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C4529 f4937;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f4938;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f4939;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public byte f4940;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C4529 f4941;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f4942;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f4943;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public String f4944;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f4945;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f4946;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f4947;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public List f4948;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f4949;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f4950;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m4723(long j, byte[] bArr, int i, int i2, boolean z) {
        if (!z && (j < 0 || j >= (1 << ((i2 - 1) * 3)))) {
            int i3 = i2 - 1;
            C6297.m17336(0L, bArr, i, i3);
            bArr[i3 + i] = UTF8.S_CS3;
        } else {
            int i4 = C6297.f19463;
            long j2 = i2 == 8 ? 2097151L : 8589934591L;
            boolean z2 = j < 0;
            if (!z2 && j <= j2) {
                int i5 = i2 - 1;
                C6297.m17336(j, bArr, i, i5);
                bArr[i + i5] = UTF8.S_CS3;
            } else {
                if (i2 >= 9) {
                    byte[] byteArray = BigInteger.valueOf(j).toByteArray();
                    int length = byteArray.length;
                    if (length > i2 - 1) {
                        throw new IllegalArgumentException("Value " + j + " is too large for " + i2 + " byte field.");
                    }
                    int i6 = (i + i2) - length;
                    System.arraycopy(byteArray, 0, bArr, i6, length);
                    byte b = (byte) (z2 ? 255 : 0);
                    for (int i7 = i + 1; i7 < i6; i7++) {
                        bArr[i7] = b;
                    }
                } else {
                    int i8 = (i2 - 1) * 8;
                    long j3 = 1 << i8;
                    long abs = Math.abs(j);
                    if (abs < 0 || abs >= j3) {
                        throw new IllegalArgumentException("Value " + j + " is too large for " + i2 + " byte field.");
                    }
                    if (z2) {
                        abs = ((abs ^ (j3 - 1)) + 1) | (255 << i8);
                    }
                    long j4 = abs;
                    for (int i9 = (i + i2) - 1; i9 >= i; i9--) {
                        bArr[i9] = (byte) j4;
                        j4 >>= 8;
                    }
                }
                bArr[i] = (byte) (z2 ? 255 : 128);
            }
        }
        return i + i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C4529 m4727(long j) {
        if (j <= 0) {
            return null;
        }
        int i = C17961.f55991;
        return C4529.from(j, TimeUnit.SECONDS);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m4760(String str) {
        String replace = str.replace(File.separatorChar, '/');
        while (replace.startsWith("/")) {
            replace = replace.substring(1);
        }
        this.f4925 = replace;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C4239 m4728(String str) {
        if (!f4924.matcher(str).matches()) {
            throw new IOException(C4860.m14172("Corrupted PAX header. Time field value is invalid '", str, "'"));
        }
        BigDecimal bigDecimal = new BigDecimal(str);
        try {
            return C4239.ofEpochSecond(bigDecimal.longValue(), bigDecimal.remainder(BigDecimal.ONE).movePointRight(9).longValue());
        } catch (ArithmeticException | C16232 e) {
            throw new IOException(C4860.m14172("Corrupted PAX header. Time field value is invalid '", str, "'"), e);
        }
    }

    public C1358() {
        this.f4925 = "";
        this.f4928 = "";
        this.f4944 = "ustar\u0000";
        this.f4929 = ChipTextInputComboView.TextFormatter.DEFAULT_TEXT;
        this.f4936 = "";
        this.f4933 = new HashMap();
        this.f4942 = -1L;
        String property = System.getProperty("user.name", "");
        this.f4931 = property.length() > 31 ? property.substring(0, 31) : property;
    }

    public C1358(HashMap hashMap, byte[] bArr, InterfaceC23230 interfaceC23230) {
        this();
        try {
            m4725(hashMap, bArr, interfaceC23230);
        } catch (IllegalArgumentException e) {
            throw new IOException("Corrupted TAR archive.", e);
        }
    }

    public C1358(String str) {
        this();
        String replace = str.replace(File.separatorChar, '/');
        while (replace.startsWith("/")) {
            replace = replace.substring(1);
        }
        boolean endsWith = replace.endsWith("/");
        this.f4925 = replace;
        this.f4945 = endsWith ? 16877 : 33188;
        this.f4940 = endsWith ? (byte) 53 : UTF8.S_P3A;
        this.f4930 = C4529.from(C4239.now());
        this.f4931 = "";
    }

    public C1358(byte b, String str) {
        this(str);
        this.f4940 = b;
        if (b == 76) {
            this.f4944 = "ustar ";
            this.f4929 = " \u0000";
        }
    }

    public final boolean equals(Object obj) {
        return obj != null && C1358.class == obj.getClass() && this.f4925.equals(((C1358) obj).f4925);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m4724(byte[] bArr, int i, byte b, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = b;
        }
        return i + i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4529 m4731() {
        return this.f4937;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m4750() {
        return this.f4942;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m4759() {
        return this.f4938;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m4762() {
        return this.f4950;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map m4761() {
        return C20195.unmodifiableMap(this.f4933);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m4756() {
        return this.f4936;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C4529 m4771() {
        return this.f4927;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C4529 m4745() {
        return this.f4930;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m4767() {
        return this.f4928;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long m4748() {
        return this.f4947;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long m4747() {
        return this.f4946;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m4739() {
        return this.f4945;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Date m4758() {
        C4529 c4529 = this.f4930;
        int i = C17961.f55991;
        if (c4529 != null) {
            return new Date(c4529.toMillis());
        }
        return null;
    }

    public final int hashCode() {
        return this.f4925.hashCode();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m4741() {
        return this.f4925;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m4764() {
        List list = this.f4948;
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list2 = (List) C5378.stream(this.f4948).filter(new C4464(1)).sorted(C8200.comparingLong(new C5592())).collect(C22976.toList());
        int size = list2.size();
        int i = 0;
        while (i < size) {
            C4886 c4886 = (C4886) list2.get(i);
            i++;
            if (i < size) {
                if (c4886.m14236() + c4886.m14237() > ((C4886) list2.get(i)).m14237()) {
                    throw new IOException(C9045.m23341(new StringBuilder("Corrupted TAR archive. Sparse blocks for "), this.f4925, " overlap each other."));
                }
            }
            if (c4886.m14236() + c4886.m14237() < 0) {
                throw new IOException(C9045.m23341(new StringBuilder("Unreadable TAR archive. Offset and numbytes for sparse block in "), this.f4925, " too large."));
            }
        }
        if (!list2.isEmpty()) {
            C4886 c48862 = (C4886) list2.get(size - 1);
            if (c48862.m14236() + c48862.m14237() > m4765()) {
                throw new IOException("Corrupted TAR archive. Sparse block extends beyond real size of the entry");
            }
        }
        return list2;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final long m4765() {
        if (m4753()) {
            return this.f4934;
        }
        return this.f4939;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long m4729() {
        return this.f4939;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final List m4743() {
        return this.f4948;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C4529 m4730() {
        return this.f4941;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String m4746() {
        return this.f4931;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m4757() {
        return this.f4943;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m4768() {
        if (this.f4940 == 53) {
            return true;
        }
        return (m4744() || m4755() || !this.f4925.endsWith("/")) ? false : true;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m4769() {
        return this.f4935;
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean m4766() {
        byte b = this.f4940;
        if (b == 0 || b == 48) {
            return true;
        }
        return (b == 53 || this.f4925.endsWith("/")) ? false : true;
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m4755() {
        return this.f4940 == 103;
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m4742() {
        return this.f4940 == 75;
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean m4740() {
        return this.f4940 == 76;
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m4753() {
        return m4754() || this.f4926 || this.f4949;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m4726(int i, byte[] bArr) {
        if ((bArr[i] & GCMSIVBlockCipher.MASK) == 0) {
            for (int i2 = 0; i2 < 11; i2++) {
                byte b = bArr[i + i2];
                if (b < 48 || b > 55) {
                    return true;
                }
            }
            byte b2 = bArr[i + 11];
            if (b2 != 32 && b2 != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m4754() {
        return this.f4940 == 83;
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m4749() {
        return this.f4932;
    }

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean m4744() {
        byte b = this.f4940;
        return b == 120 || b == 88;
    }

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m4770() {
        return this.f4940 == 50;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4725(Map map, byte[] bArr, InterfaceC23230 interfaceC23230) {
        String str;
        byte b;
        this.f4925 = C6297.m17332(bArr, 0, 100, interfaceC23230);
        this.f4945 = (int) C6297.m17338(100, 8, bArr);
        this.f4946 = (int) C6297.m17338(108, 8, bArr);
        this.f4947 = (int) C6297.m17338(116, 8, bArr);
        long m17338 = C6297.m17338(124, 12, bArr);
        this.f4939 = m17338;
        long j = 0;
        if (m17338 < 0) {
            throw new IOException("broken archive, entry with negative size");
        }
        long m173382 = C6297.m17338(136, 12, bArr);
        int i = C17961.f55991;
        this.f4930 = C4529.from(m173382, TimeUnit.SECONDS);
        int i2 = 148;
        long m17331 = C6297.m17331(148, 8, bArr);
        int i3 = 0;
        long j2 = 0;
        while (true) {
            int length = bArr.length;
            byte b2 = UTF8.S_CS3;
            if (i3 >= length) {
                break;
            }
            byte b3 = bArr[i3];
            if (i2 > i3 || i3 >= 156) {
                b2 = b3;
            }
            j += b2 & 255;
            j2 += b2;
            i3++;
            i2 = 148;
        }
        this.f4943 = m17331 == j || m17331 == j2;
        this.f4940 = bArr[156];
        this.f4928 = C6297.m17332(bArr, 157, 100, interfaceC23230);
        InterfaceC23230 interfaceC232302 = C6297.f19464;
        this.f4944 = C6297.m17332(bArr, 257, 6, interfaceC232302);
        this.f4929 = C6297.m17332(bArr, 263, 2, interfaceC232302);
        this.f4931 = C6297.m17332(bArr, 265, 32, interfaceC23230);
        this.f4936 = C6297.m17332(bArr, 297, 32, interfaceC23230);
        byte b4 = this.f4940;
        if (b4 == 51 || b4 == 52) {
            this.f4938 = (int) C6297.m17338(329, 8, bArr);
            this.f4950 = (int) C6297.m17338(337, 8, bArr);
        }
        if (C7708.m20625(257, 6, "ustar ", bArr)) {
            this.f4927 = m4727(C6297.m17338(345, 12, bArr));
            this.f4941 = m4727(C6297.m17338(357, 12, bArr));
            this.f4948 = new ArrayList(C6297.m17339(386, 4, bArr));
            this.f4935 = bArr[482] == 1;
            this.f4934 = C6297.m17331(483, 12, bArr);
            return;
        }
        if (C7708.m20625(257, 6, "ustar\u0000", bArr) && (C7708.m20625(508, 4, "tar\u0000", bArr) || ((str = (String) map.get("SCHILY.archtype")) == null ? !(((b = bArr[475]) != 0 && (bArr[156] != 77 || ((bArr[464] & GCMSIVBlockCipher.MASK) == 0 && b != 32))) || m4726(476, bArr) || m4726(488, bArr)) : "xustar".equals(str) || "exustar".equals(str)))) {
            String m17332 = C6297.m17332(bArr, 345, 131, interfaceC23230);
            if (!m17332.isEmpty()) {
                StringBuilder m19190 = C7166.m19190(m17332, "/");
                m19190.append(this.f4925);
                this.f4925 = m19190.toString();
            }
            this.f4927 = m4727(C6297.m17338(476, 12, bArr));
            this.f4941 = m4727(C6297.m17338(488, 12, bArr));
            return;
        }
        String m173322 = C6297.m17332(bArr, 345, 155, interfaceC23230);
        if (m4768() && !this.f4925.endsWith("/")) {
            this.f4925 = C9045.m23341(new StringBuilder(), this.f4925, "/");
        }
        if (m173322.isEmpty()) {
            return;
        }
        StringBuilder m191902 = C7166.m19190(m173322, "/");
        m191902.append(this.f4925);
        this.f4925 = m191902.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4733(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("The offset can not be smaller than 0");
        }
        this.f4942 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4734(String str) {
        this.f4936 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4737(C4529 c4529) {
        C11003.requireNonNull(c4529, "time");
        this.f4930 = c4529;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4752(String str) {
        this.f4928 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4732(int i) {
        this.f4945 = i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4751(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(C16014.m37865(j, "Size is out of range: "));
        }
        this.f4939 = j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4735(List list) {
        this.f4948 = list;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m4763(String str) {
        this.f4931 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4736(Map map) {
        String str;
        String str2;
        for (Map.Entry entry : map.entrySet()) {
            str = (String) entry.getKey();
            str2 = (String) entry.getValue();
            str.getClass();
            switch (str) {
                case "SCHILY.devmajor":
                    int m52085 = C23605.m52085(str2);
                    if (m52085 < 0) {
                        throw new IOException("Corrupted TAR archive. Dev-Major is negative");
                    }
                    if (m52085 < 0) {
                        throw new IllegalArgumentException(C19370.m44628(m52085, "Major device number is out of range: "));
                    }
                    this.f4938 = m52085;
                    break;
                case "SCHILY.devminor":
                    int m520852 = C23605.m52085(str2);
                    if (m520852 < 0) {
                        throw new IOException("Corrupted TAR archive. Dev-Minor is negative");
                    }
                    if (m520852 < 0) {
                        throw new IllegalArgumentException(C19370.m44628(m520852, "Minor device number is out of range: "));
                    }
                    this.f4950 = m520852;
                    break;
                case "GNU.sparse.realsize":
                    this.f4926 = true;
                    this.f4932 = true;
                    if (map.containsKey("GNU.sparse.name")) {
                        this.f4925 = (String) map.get("GNU.sparse.name");
                    }
                    if (map.containsKey("GNU.sparse.realsize")) {
                        this.f4934 = C23605.m52085((String) map.get("GNU.sparse.realsize"));
                        break;
                    } else {
                        break;
                    }
                case "GNU.sparse.size":
                    this.f4926 = true;
                    this.f4934 = C23605.m52085((String) map.get("GNU.sparse.size"));
                    if (map.containsKey("GNU.sparse.name")) {
                        this.f4925 = (String) map.get("GNU.sparse.name");
                        break;
                    } else {
                        break;
                    }
                case "gid":
                    this.f4947 = C23605.m52086(str2);
                    break;
                case "uid":
                    this.f4946 = C23605.m52086(str2);
                    break;
                case "path":
                    m4760(str2);
                    break;
                case "size":
                    long m52086 = C23605.m52086(str2);
                    if (m52086 < 0) {
                        throw new IOException("Corrupted TAR archive. Entry size is negative");
                    }
                    m4751(m52086);
                    break;
                case "atime":
                    this.f4927 = C4529.from(m4728(str2));
                    break;
                case "ctime":
                    this.f4941 = C4529.from(m4728(str2));
                    break;
                case "gname":
                    this.f4936 = str2;
                    break;
                case "mtime":
                    m4737(C4529.from(m4728(str2)));
                    break;
                case "uname":
                    this.f4931 = str2;
                    break;
                case "LIBARCHIVE.creationtime":
                    this.f4937 = C4529.from(m4728(str2));
                    break;
                case "SCHILY.filetype":
                    if ("sparse".equals(str2)) {
                        this.f4949 = true;
                        if (map.containsKey("SCHILY.realsize")) {
                            this.f4934 = C23605.m52086((String) map.get("SCHILY.realsize"));
                            break;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                case "linkpath":
                    this.f4928 = str2;
                    break;
                default:
                    this.f4933.put(str, str2);
                    break;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4738(byte[] bArr, InterfaceC23230 interfaceC23230, boolean z) {
        int m4723 = m4723(this.f4939, bArr, m4723(this.f4947, bArr, m4723(this.f4946, bArr, m4723(this.f4945, bArr, C6297.m17330(this.f4925, bArr, 0, 100, interfaceC23230), 8, z), 8, z), 8, z), 12, z);
        C4529 c4529 = this.f4930;
        int i = C6672.f20732;
        int i2 = C17961.f55991;
        long j = 0;
        int m47232 = m4723(c4529 != null ? c4529.to(TimeUnit.SECONDS) : 0L, bArr, m4723, 12, z);
        int m4724 = m4724(bArr, m47232, UTF8.S_CS3, 8);
        bArr[m4724] = this.f4940;
        int m17330 = C6297.m17330(this.f4928, bArr, m4724 + 1, 100, interfaceC23230);
        String str = this.f4944;
        InterfaceC23230 interfaceC232302 = C6297.f19464;
        int m47233 = m4723(this.f4950, bArr, m4723(this.f4938, bArr, C6297.m17330(this.f4936, bArr, C6297.m17330(this.f4931, bArr, C6297.m17330(this.f4929, bArr, C6297.m17330(str, bArr, m17330, 6, interfaceC232302), 2, interfaceC232302), 32, interfaceC23230), 32, interfaceC23230), 8, z), 8, z);
        if (z) {
            byte b = (byte) 0;
            int m47242 = m4724(bArr, m47233, b, 131);
            C4529 c45292 = this.f4927;
            int m47234 = c45292 != null ? m4723(c45292.to(TimeUnit.SECONDS), bArr, m47242, 12, true) : m4724(bArr, m47242, b, 12);
            C4529 c45293 = this.f4941;
            m47233 = m4724(bArr, m4724(bArr, c45293 != null ? m4723(c45293.to(TimeUnit.SECONDS), bArr, m47234, 12, true) : m4724(bArr, m47234, b, 12), b, 8), b, 4);
        }
        m4724(bArr, m47233, (byte) 0, bArr.length - m47233);
        for (byte b2 : bArr) {
            j += b2 & 255;
        }
        C6297.m17336(j, bArr, m47232, 6);
        bArr[m47232 + 6] = 0;
        bArr[m47232 + 7] = UTF8.S_CS3;
    }
}

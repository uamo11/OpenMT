package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: U7Z7 */
/* renamed from: l.ۜۢۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6676 extends AbstractC17965 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static String[] f20734;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static byte[][] f20735 = {new byte[]{6, 8, 42, -122, 72, -50, Base32Encoder.DEFAULT_PADDING, 3, 1, 7}, new byte[]{6, 5, 43, -127, 4, 0, 34}, new byte[]{6, 5, 43, -127, 4, 0, 35}};

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String[] f20736;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public byte[] f20737;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public byte[] f20738;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public byte[] f20739;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public byte[] f20740;

    static {
        String[] strArr = {"nistp256", "nistp384", "nistp521"};
        f20736 = strArr;
        f20734 = (String[]) C22311.stream(strArr).map(new C14436(0)).toArray(new C23609());
        C19356.m44599("-----BEGIN EC PRIVATE KEY-----");
        C19356.m44599("-----END EC PRIVATE KEY-----");
    }

    public C6676(C22529 c22529) {
        this(c22529, null, null, null, null);
    }

    public C6676(C22529 c22529, byte[] bArr) {
        this(c22529, null, null, null, null);
        if (bArr != null) {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, 11, bArr2, 0, 8);
            Charset charset = StandardCharsets.UTF_8;
            if (C19356.m44591(bArr2, C19356.m44592("nistp384", charset))) {
                this.f20737 = bArr2;
            }
            if (C19356.m44591(bArr2, C19356.m44592("nistp521", charset))) {
                this.f20737 = bArr2;
            }
        }
    }

    public C6676(C22529 c22529, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(c22529);
        this.f20737 = C19356.m44592(f20736[0], StandardCharsets.UTF_8);
        if (bArr != null) {
            this.f20737 = bArr;
        }
        this.f20739 = bArr2;
        this.f20740 = bArr3;
        this.f20738 = bArr4;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m18211() {
        byte[] bArr = {1};
        byte[] bArr2 = this.f20739;
        byte[] bArr3 = f20735[bArr2.length >= 64 ? (char) 2 : bArr2.length >= 48 ? (char) 1 : (char) 0];
        byte[] bArr4 = this.f20740;
        int length = bArr2.length + 1 + bArr4.length;
        byte[] bArr5 = new byte[length];
        bArr5[0] = 4;
        System.arraycopy(bArr2, 0, bArr5, 1, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length + 1, bArr4.length);
        int i = length + 1;
        int i2 = (i & 128) == 0 ? 3 : 4;
        int i3 = length + i2;
        byte[] bArr6 = new byte[i3];
        System.arraycopy(bArr5, 0, bArr6, i2, length);
        bArr6[0] = 3;
        if (i2 == 3) {
            bArr6[1] = (byte) i;
        } else {
            bArr6[1] = -127;
            bArr6[2] = (byte) i;
        }
        int m41966 = AbstractC17965.m41966(1) + 3 + AbstractC17965.m41966(this.f20738.length) + this.f20738.length + 1 + AbstractC17965.m41966(bArr3.length) + bArr3.length + 1 + AbstractC17965.m41966(i3) + i3;
        byte[] bArr7 = new byte[AbstractC17965.m41966(m41966) + 1 + m41966];
        bArr7[0] = UTF8.S_P3A;
        int m41967 = AbstractC17965.m41967(AbstractC17965.m41975(1, m41966, bArr7), bArr7, bArr);
        byte[] bArr8 = this.f20738;
        bArr7[m41967] = 4;
        int m41975 = AbstractC17965.m41975(m41967 + 1, bArr8.length, bArr7);
        System.arraycopy(bArr8, 0, bArr7, m41975, bArr8.length);
        int length2 = m41975 + bArr8.length;
        bArr7[length2] = -96;
        int m419752 = AbstractC17965.m41975(length2 + 1, bArr3.length, bArr7);
        System.arraycopy(bArr3, 0, bArr7, m419752, bArr3.length);
        int length3 = m419752 + bArr3.length;
        bArr7[length3] = -95;
        System.arraycopy(bArr6, 0, bArr7, AbstractC17965.m41975(length3 + 1, i3, bArr7), i3);
        return bArr7;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086 A[Catch: Exception -> 0x01e8, TryCatch #0 {Exception -> 0x01e8, blocks: (B:3:0x0009, B:14:0x001e, B:16:0x002d, B:18:0x0045, B:20:0x0059, B:22:0x005f, B:29:0x007e, B:31:0x0086, B:33:0x00a5, B:34:0x00ac, B:36:0x007b, B:39:0x00ad, B:40:0x00c6, B:41:0x00c7, B:42:0x00d0, B:43:0x00d1, B:44:0x00da, B:45:0x00db, B:46:0x00e2, B:47:0x00e3, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:57:0x00ff, B:60:0x0104, B:62:0x010f, B:63:0x0112, B:65:0x0116, B:67:0x0123, B:69:0x012f, B:70:0x0132, B:72:0x0136, B:74:0x0143, B:76:0x0156, B:77:0x0159, B:79:0x015d, B:81:0x016a, B:82:0x0171, B:84:0x0176, B:88:0x017e, B:86:0x0189, B:89:0x018c, B:91:0x0197, B:92:0x019a, B:94:0x019e, B:96:0x01ab, B:98:0x01c0, B:101:0x01c4, B:105:0x01c6, B:107:0x01cf, B:111:0x01dd, B:113:0x01df), top: B:2:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5 A[Catch: Exception -> 0x01e8, TryCatch #0 {Exception -> 0x01e8, blocks: (B:3:0x0009, B:14:0x001e, B:16:0x002d, B:18:0x0045, B:20:0x0059, B:22:0x005f, B:29:0x007e, B:31:0x0086, B:33:0x00a5, B:34:0x00ac, B:36:0x007b, B:39:0x00ad, B:40:0x00c6, B:41:0x00c7, B:42:0x00d0, B:43:0x00d1, B:44:0x00da, B:45:0x00db, B:46:0x00e2, B:47:0x00e3, B:50:0x00ea, B:52:0x00f0, B:53:0x00f3, B:55:0x00f7, B:57:0x00ff, B:60:0x0104, B:62:0x010f, B:63:0x0112, B:65:0x0116, B:67:0x0123, B:69:0x012f, B:70:0x0132, B:72:0x0136, B:74:0x0143, B:76:0x0156, B:77:0x0159, B:79:0x015d, B:81:0x016a, B:82:0x0171, B:84:0x0176, B:88:0x017e, B:86:0x0189, B:89:0x018c, B:91:0x0197, B:92:0x019a, B:94:0x019e, B:96:0x01ab, B:98:0x01c0, B:101:0x01c4, B:105:0x01c6, B:107:0x01cf, B:111:0x01dd, B:113:0x01df), top: B:2:0x0009, inners: #1 }] */
    @Override // l.AbstractC17965
    /* renamed from: ܽ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean mo7885(byte[] r13) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6676.mo7885(byte[]):boolean");
    }

    @Override // l.AbstractC17965
    /* renamed from: ܿ */
    public final byte[] mo7886() {
        byte[] mo7886 = super.mo7886();
        if (mo7886 != null) {
            return mo7886;
        }
        if (this.f20739 == null) {
            return null;
        }
        byte[] m44592 = C19356.m44592("ecdsa-sha2-".concat(C19356.m44588(this.f20737)), StandardCharsets.UTF_8);
        byte[] bArr = this.f20737;
        byte[] bArr2 = this.f20739;
        byte[][] bArr3 = {m44592, bArr, new byte[bArr2.length + 1 + this.f20740.length]};
        byte[] bArr4 = bArr3[2];
        bArr4[0] = 4;
        System.arraycopy(bArr2, 0, bArr4, 1, bArr2.length);
        byte[] bArr5 = this.f20740;
        System.arraycopy(bArr5, 0, bArr3[2], this.f20739.length + 1, bArr5.length);
        return C16261.m38232(bArr3).f50016;
    }

    @Override // l.AbstractC17965
    /* renamed from: ᩳ */
    public final byte[] mo7887() {
        return C19356.m44592("ecdsa-sha2-".concat(C19356.m44588(this.f20737)), StandardCharsets.UTF_8);
    }

    @Override // l.AbstractC17965
    /* renamed from: ۧ */
    public final byte[] mo7884(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3 = null;
        try {
            InterfaceC14415 interfaceC14415 = (InterfaceC14415) Class.forName(C20413.m46768("ecdsa-sha2-".concat(C19356.m44588(this.f20737)))).asSubclass(InterfaceC14415.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC14415.init();
            byte[] bArr4 = this.f20738;
            bArr2 = Arrays.copyOf(bArr4, bArr4.length);
            try {
                try {
                    interfaceC14415.mo25162(bArr2);
                    interfaceC14415.update(bArr);
                    byte[] bArr5 = C16261.m38232(new byte[][]{C19356.m44592("ecdsa-sha2-".concat(C19356.m44588(this.f20737)), StandardCharsets.UTF_8), interfaceC14415.sign()}).f50016;
                    C19356.m44596(bArr2);
                    return bArr5;
                } catch (Exception unused) {
                    this.f56031.getClass();
                    C20413.f65866.getClass();
                    C19356.m44596(bArr2);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                bArr3 = bArr2;
                C19356.m44596(bArr3);
                throw th;
            }
        } catch (Exception unused2) {
            bArr2 = null;
        } catch (Throwable th2) {
            th = th2;
            C19356.m44596(bArr3);
            throw th;
        }
    }

    @Override // l.AbstractC17965
    /* renamed from: ֫ */
    public final byte[] mo7882(String str, byte[] bArr) {
        return mo7884(bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC17965 m18209(C22529 c22529, C16261 c16261) {
        byte[][] m38239 = c16261.m38239(5, "invalid key format");
        byte[] bArr = m38239[1];
        byte[][] m18210 = m18210(m38239[2]);
        C6676 c6676 = new C6676(c22529, bArr, m18210[0], m18210[1], m38239[3]);
        c6676.f56025 = C19356.m44588(m38239[4]);
        c6676.f56026 = 0;
        return c6676;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static byte[][] m18210(byte[] bArr) {
        int i = 0;
        while (bArr[i] != 4) {
            i++;
        }
        int i2 = i + 1;
        int length = (bArr.length - i2) / 2;
        byte[] bArr2 = new byte[length];
        int length2 = (bArr.length - i2) / 2;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, i2, bArr2, 0, length);
        System.arraycopy(bArr, i2 + length, bArr3, 0, length2);
        return new byte[][]{bArr2, bArr3};
    }

    @Override // l.AbstractC17965
    /* renamed from: ֫ */
    public final void mo11611() {
        C19356.m44596(this.f20738);
    }

    @Override // l.AbstractC17965
    /* renamed from: ۧ */
    public final byte[] mo7883() {
        if (this.f56030) {
            throw new C12651("key is encrypted.");
        }
        C16261 c16261 = new C16261();
        String concat = "ecdsa-sha2-".concat(C19356.m44588(this.f20737));
        Charset charset = StandardCharsets.UTF_8;
        c16261.m38256(C19356.m44592(concat, charset));
        c16261.m38256(this.f20737);
        byte[] bArr = this.f20739;
        byte[] bArr2 = this.f20740;
        int length = bArr.length + 1 + bArr2.length;
        byte[] bArr3 = new byte[length];
        bArr3[0] = 4;
        System.arraycopy(bArr, 0, bArr3, 1, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length + 1, bArr2.length);
        c16261.m38252(0, length, bArr3);
        c16261.m38256(this.f20738);
        c16261.m38256(C19356.m44592(this.f56025, charset));
        int m38255 = c16261.m38255();
        byte[] bArr4 = new byte[m38255];
        c16261.m38236(0, m38255, bArr4);
        return bArr4;
    }
}

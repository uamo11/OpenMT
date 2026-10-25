package l;

import org.bouncycastle.asn1.BERTags;

/* compiled from: OBBH */
/* renamed from: l.۬ܺܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13217 extends AbstractC6162 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C11186 f39566;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f39567;

    @Override // l.AbstractC13717
    /* renamed from: ۧ */
    public final boolean mo2229() {
        return false;
    }

    @Override // l.AbstractC13717
    /* renamed from: ᩻ */
    public final String mo8292() {
        return "utf8";
    }

    static {
        new C13217("");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m32050(int i, int i2) {
        throw new IllegalArgumentException("bad utf-8 byte " + C14712.m35005(i) + " at offset " + C14712.m35008(i2));
    }

    public C13217(String str) {
        if (str == null) {
            throw new NullPointerException("string == null");
        }
        this.f39567 = str.intern();
        int length = str.length();
        byte[] bArr = new byte[length * 3];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != 0 && charAt < 128) {
                bArr[i] = (byte) charAt;
                i++;
            } else if (charAt < 2048) {
                bArr[i] = (byte) (((charAt >> 6) & 31) | 192);
                bArr[i + 1] = (byte) ((charAt & '?') | 128);
                i += 2;
            } else {
                bArr[i] = (byte) (((charAt >> '\f') & 15) | BERTags.FLAGS);
                bArr[i + 1] = (byte) (((charAt >> 6) & 63) | 128);
                bArr[i + 2] = (byte) ((charAt & '?') | 128);
                i += 3;
            }
        }
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        this.f39566 = new C11186(bArr2);
    }

    public C13217(C11186 c11186) {
        char c;
        this.f39566 = c11186;
        int m27748 = c11186.m27748();
        char[] cArr = new char[m27748];
        int i = 0;
        int i2 = 0;
        while (m27748 > 0) {
            int m27755 = c11186.m27755(i2);
            switch (m27755 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    m27748--;
                    if (m27755 == 0) {
                        m32050(m27755, i2);
                        throw null;
                    }
                    c = (char) m27755;
                    i2++;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    m32050(m27755, i2);
                    throw null;
                case 12:
                case 13:
                    m27748 -= 2;
                    if (m27748 < 0) {
                        m32050(m27755, i2);
                        throw null;
                    }
                    int i3 = i2 + 1;
                    int m277552 = c11186.m27755(i3);
                    if ((m277552 & 192) != 128) {
                        m32050(m277552, i3);
                        throw null;
                    }
                    int i4 = ((m27755 & 31) << 6) | (m277552 & 63);
                    if (i4 != 0 && i4 < 128) {
                        m32050(m277552, i3);
                        throw null;
                    }
                    c = (char) i4;
                    i2 += 2;
                    break;
                case 14:
                    m27748 -= 3;
                    if (m27748 < 0) {
                        m32050(m27755, i2);
                        throw null;
                    }
                    int i5 = i2 + 1;
                    int m277553 = c11186.m27755(i5);
                    int i6 = m277553 & 192;
                    if (i6 != 128) {
                        m32050(m277553, i5);
                        throw null;
                    }
                    int i7 = i2 + 2;
                    int m277554 = c11186.m27755(i7);
                    if (i6 != 128) {
                        m32050(m277554, i7);
                        throw null;
                    }
                    int i8 = ((m27755 & 15) << 12) | ((m277553 & 63) << 6) | (m277554 & 63);
                    if (i8 < 2048) {
                        m32050(m277554, i7);
                        throw null;
                    }
                    c = (char) i8;
                    i2 += 3;
                    break;
            }
            cArr[i] = c;
            i++;
        }
        this.f39567 = new String(cArr, 0, i).intern();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13217)) {
            return false;
        }
        return this.f39567.equals(((C13217) obj).f39567);
    }

    public final int hashCode() {
        return this.f39567.hashCode();
    }

    @Override // l.AbstractC13717
    /* renamed from: ۧ */
    public final int mo2228(AbstractC13717 abstractC13717) {
        return this.f39567.compareTo(((C13217) abstractC13717).f39567);
    }

    public final String toString() {
        return "string{\"" + mo2463() + "\"}";
    }

    @Override // l.InterfaceC0601
    /* renamed from: ֫ */
    public final String mo2463() {
        String str = this.f39567;
        int length = str.length();
        StringBuilder sb = new StringBuilder((length * 3) / 2);
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt >= ' ' && charAt < 127) {
                if (charAt == '\'' || charAt == '\"' || charAt == '\\') {
                    sb.append('\\');
                }
                sb.append(charAt);
            } else if (charAt > 127) {
                sb.append("\\u");
                sb.append(Character.forDigit(charAt >> '\f', 16));
                sb.append(Character.forDigit((charAt >> '\b') & 15, 16));
                sb.append(Character.forDigit((charAt >> 4) & 15, 16));
                sb.append(Character.forDigit(charAt & 15, 16));
            } else if (charAt == '\t') {
                sb.append("\\t");
            } else if (charAt == '\n') {
                sb.append("\\n");
            } else if (charAt == '\r') {
                sb.append("\\r");
            } else {
                char charAt2 = i < length + (-1) ? str.charAt(i + 1) : (char) 0;
                boolean z = charAt2 >= '0' && charAt2 <= '7';
                sb.append('\\');
                for (int i2 = 6; i2 >= 0; i2 -= 3) {
                    char c = (char) (((charAt >> i2) & 7) + 48);
                    if (c != '0' || z) {
                        sb.append(c);
                        z = true;
                    }
                }
                if (!z) {
                    sb.append('0');
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m32052() {
        return "\"" + mo2463() + '\"';
    }

    public final String getString() {
        return this.f39567;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C11186 m32053() {
        return this.f39566;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int m32051() {
        return this.f39566.m27748();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m32054() {
        return this.f39567.length();
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return C7573.f23407;
    }
}

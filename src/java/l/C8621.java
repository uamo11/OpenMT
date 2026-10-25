package l;

import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: P53K */
/* renamed from: l.ۡۗ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8621 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f26329 = {GCMSIVBlockCipher.MASK, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f26331;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f26332;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26333;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f26334;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f26335;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f26330 = new byte[64];

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int[] f26336 = new int[16];

    public C8621() {
        m22384();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m22375(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int m44633 = C19373.m44633((i3 & i2) | (i4 & (~i2)), i5, i7, i);
        return ((m44633 >>> (32 - i6)) | (m44633 << i6)) + i2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m22378(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int m44633 = C19373.m44633((i3 & (~i4)) | (i2 & i4), i5, i7, i);
        return ((m44633 >>> (32 - i6)) | (m44633 << i6)) + i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m22379(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int m44633 = C19373.m44633((i3 ^ i2) ^ i4, i5, i7, i);
        return ((m44633 >>> (32 - i6)) | (m44633 << i6)) + i2;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m22380(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int m44633 = C19373.m44633(i3 ^ ((~i4) | i2), i5, i7, i);
        return ((m44633 >>> (32 - i6)) | (m44633 << i6)) + i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22376(int i, int i2, byte[] bArr) {
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m22377(int i, byte[] bArr) {
        int i2 = this.f26333;
        int i3 = this.f26335;
        int i4 = this.f26334;
        int i5 = this.f26332;
        int i6 = i;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f26336;
            if (i7 < 16) {
                iArr[i7] = (bArr[i6] & 255) | ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6 + 2] & 255) << 16) | ((bArr[i6 + 3] & 255) << 24);
                i7++;
                i6 += 4;
            } else {
                int m22375 = m22375(i2, i3, i4, i5, iArr[0], 7, -680876936);
                int m223752 = m22375(i5, m22375, i3, i4, iArr[1], 12, -389564586);
                int m223753 = m22375(i4, m223752, m22375, i3, iArr[2], 17, 606105819);
                int m223754 = m22375(i3, m223753, m223752, m22375, iArr[3], 22, -1044525330);
                int m223755 = m22375(m22375, m223754, m223753, m223752, iArr[4], 7, -176418897);
                int m223756 = m22375(m223752, m223755, m223754, m223753, iArr[5], 12, 1200080426);
                int m223757 = m22375(m223753, m223756, m223755, m223754, iArr[6], 17, -1473231341);
                int m223758 = m22375(m223754, m223757, m223756, m223755, iArr[7], 22, -45705983);
                int m223759 = m22375(m223755, m223758, m223757, m223756, iArr[8], 7, 1770035416);
                int m2237510 = m22375(m223756, m223759, m223758, m223757, iArr[9], 12, -1958414417);
                int m2237511 = m22375(m223757, m2237510, m223759, m223758, iArr[10], 17, -42063);
                int m2237512 = m22375(m223758, m2237511, m2237510, m223759, iArr[11], 22, -1990404162);
                int m2237513 = m22375(m223759, m2237512, m2237511, m2237510, iArr[12], 7, 1804603682);
                int m2237514 = m22375(m2237510, m2237513, m2237512, m2237511, iArr[13], 12, -40341101);
                int m2237515 = m22375(m2237511, m2237514, m2237513, m2237512, iArr[14], 17, -1502002290);
                int m2237516 = m22375(m2237512, m2237515, m2237514, m2237513, iArr[15], 22, 1236535329);
                int m22378 = m22378(m2237513, m2237516, m2237515, m2237514, iArr[1], 5, -165796510);
                int m223782 = m22378(m2237514, m22378, m2237516, m2237515, iArr[6], 9, -1069501632);
                int m223783 = m22378(m2237515, m223782, m22378, m2237516, iArr[11], 14, 643717713);
                int m223784 = m22378(m2237516, m223783, m223782, m22378, iArr[0], 20, -373897302);
                int m223785 = m22378(m22378, m223784, m223783, m223782, iArr[5], 5, -701558691);
                int m223786 = m22378(m223782, m223785, m223784, m223783, iArr[10], 9, 38016083);
                int m223787 = m22378(m223783, m223786, m223785, m223784, iArr[15], 14, -660478335);
                int m223788 = m22378(m223784, m223787, m223786, m223785, iArr[4], 20, -405537848);
                int m223789 = m22378(m223785, m223788, m223787, m223786, iArr[9], 5, 568446438);
                int m2237810 = m22378(m223786, m223789, m223788, m223787, iArr[14], 9, -1019803690);
                int m2237811 = m22378(m223787, m2237810, m223789, m223788, iArr[3], 14, -187363961);
                int m2237812 = m22378(m223788, m2237811, m2237810, m223789, iArr[8], 20, 1163531501);
                int m2237813 = m22378(m223789, m2237812, m2237811, m2237810, iArr[13], 5, -1444681467);
                int m2237814 = m22378(m2237810, m2237813, m2237812, m2237811, iArr[2], 9, -51403784);
                int m2237815 = m22378(m2237811, m2237814, m2237813, m2237812, iArr[7], 14, 1735328473);
                int m2237816 = m22378(m2237812, m2237815, m2237814, m2237813, iArr[12], 20, -1926607734);
                int m22379 = m22379(m2237813, m2237816, m2237815, m2237814, iArr[5], 4, -378558);
                int m223792 = m22379(m2237814, m22379, m2237816, m2237815, iArr[8], 11, -2022574463);
                int m223793 = m22379(m2237815, m223792, m22379, m2237816, iArr[11], 16, 1839030562);
                int m223794 = m22379(m2237816, m223793, m223792, m22379, iArr[14], 23, -35309556);
                int m223795 = m22379(m22379, m223794, m223793, m223792, iArr[1], 4, -1530992060);
                int m223796 = m22379(m223792, m223795, m223794, m223793, iArr[4], 11, 1272893353);
                int m223797 = m22379(m223793, m223796, m223795, m223794, iArr[7], 16, -155497632);
                int m223798 = m22379(m223794, m223797, m223796, m223795, iArr[10], 23, -1094730640);
                int m223799 = m22379(m223795, m223798, m223797, m223796, iArr[13], 4, 681279174);
                int m2237910 = m22379(m223796, m223799, m223798, m223797, iArr[0], 11, -358537222);
                int m2237911 = m22379(m223797, m2237910, m223799, m223798, iArr[3], 16, -722521979);
                int m2237912 = m22379(m223798, m2237911, m2237910, m223799, iArr[6], 23, 76029189);
                int m2237913 = m22379(m223799, m2237912, m2237911, m2237910, iArr[9], 4, -640364487);
                int m2237914 = m22379(m2237910, m2237913, m2237912, m2237911, iArr[12], 11, -421815835);
                int m2237915 = m22379(m2237911, m2237914, m2237913, m2237912, iArr[15], 16, 530742520);
                int m2237916 = m22379(m2237912, m2237915, m2237914, m2237913, iArr[2], 23, -995338651);
                int m22380 = m22380(m2237913, m2237916, m2237915, m2237914, iArr[0], 6, -198630844);
                int m223802 = m22380(m2237914, m22380, m2237916, m2237915, iArr[7], 10, 1126891415);
                int m223803 = m22380(m2237915, m223802, m22380, m2237916, iArr[14], 15, -1416354905);
                int m223804 = m22380(m2237916, m223803, m223802, m22380, iArr[5], 21, -57434055);
                int m223805 = m22380(m22380, m223804, m223803, m223802, iArr[12], 6, 1700485571);
                int m223806 = m22380(m223802, m223805, m223804, m223803, iArr[3], 10, -1894986606);
                int m223807 = m22380(m223803, m223806, m223805, m223804, iArr[10], 15, -1051523);
                int m223808 = m22380(m223804, m223807, m223806, m223805, iArr[1], 21, -2054922799);
                int m223809 = m22380(m223805, m223808, m223807, m223806, iArr[8], 6, 1873313359);
                int m2238010 = m22380(m223806, m223809, m223808, m223807, iArr[15], 10, -30611744);
                int m2238011 = m22380(m223807, m2238010, m223809, m223808, iArr[6], 15, -1560198380);
                int m2238012 = m22380(m223808, m2238011, m2238010, m223809, iArr[13], 21, 1309151649);
                int m2238013 = m22380(m223809, m2238012, m2238011, m2238010, iArr[4], 6, -145523070);
                int m2238014 = m22380(m2238010, m2238013, m2238012, m2238011, iArr[11], 10, -1120210379);
                int m2238015 = m22380(m2238011, m2238014, m2238013, m2238012, iArr[2], 15, 718787259);
                int m2238016 = m22380(m2238012, m2238015, m2238014, m2238013, iArr[9], 21, -343485551);
                this.f26333 += m2238013;
                this.f26335 += m2238016;
                this.f26334 += m2238015;
                this.f26332 += m2238014;
                return;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22384() {
        this.f26331 = 0L;
        this.f26333 = 1732584193;
        this.f26335 = -271733879;
        this.f26334 = -1732584194;
        this.f26332 = 271733878;
        for (int i = 0; i < 16; i++) {
            this.f26336[i] = 0;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22381(byte[] bArr, int i, int i2) {
        long j = this.f26331;
        int i3 = 64 - ((int) (63 & j));
        this.f26331 = j + i2;
        while (i2 > 0) {
            byte[] bArr2 = this.f26330;
            if (i2 < i3) {
                System.arraycopy(bArr, i, bArr2, 64 - i3, i2);
                return;
            }
            if (i3 == 64) {
                m22377(i, bArr);
            } else {
                System.arraycopy(bArr, i, bArr2, 64 - i3, i3);
                m22377(0, bArr2);
            }
            i += i3;
            i2 -= i3;
            i3 = 64;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22385(byte[] bArr) {
        m22381(bArr, 0, bArr.length);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m22382() {
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[8];
        m22376(0, (int) (this.f26331 << 3), bArr2);
        m22376(4, (int) (this.f26331 >> 29), bArr2);
        int i = ((int) this.f26331) & 63;
        m22381(f26329, 0, i < 56 ? 56 - i : 120 - i);
        m22381(bArr2, 0, 8);
        m22376(0, this.f26333, bArr);
        m22376(4, this.f26335, bArr);
        m22376(8, this.f26334, bArr);
        m22376(12, this.f26332, bArr);
        m22384();
        return bArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m22383(byte[] bArr) {
        m22385(bArr);
        byte[] m22382 = m22382();
        byte b = m22382[0];
        if (b == 0) {
            m22382[0] = 1;
            return m22382;
        }
        if (b < 0) {
            byte b2 = (byte) (-b);
            m22382[0] = b2 > 0 ? b2 : (byte) 1;
        }
        return m22382;
    }
}

package l;

import java.io.IOException;
import java.math.RoundingMode;

/* compiled from: L3BC */
/* renamed from: l.ۧ᩺ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC11311 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC11311 f33859;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11311 f33860;

    /* renamed from: ֫ */
    public abstract int mo7060(byte[] bArr, CharSequence charSequence);

    /* renamed from: ֫ */
    public abstract CharSequence mo7061(CharSequence charSequence);

    /* renamed from: ֫ */
    public abstract AbstractC11311 mo7062();

    /* renamed from: ֫ */
    public abstract void mo7064(StringBuilder sb, byte[] bArr, int i);

    /* renamed from: ۧ */
    public abstract AbstractC11311 mo7066();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m27953(byte[] bArr) {
        int length = bArr.length;
        C4025.m12104(0, length, bArr.length);
        C11684 c11684 = ((C2138) this).f7102;
        int i = c11684.f34824;
        int i2 = c11684.f34820;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(C5666.m15978(length, i2) * i);
        try {
            mo7064(sb, bArr, length);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m27954(String str) {
        try {
            int length = (int) (((((C2138) this).f7102.f34818 * r6.length()) + 7) / 8);
            byte[] bArr = new byte[length];
            int mo7060 = mo7060(bArr, mo7061((CharSequence) str));
            if (mo7060 == length) {
                return bArr;
            }
            byte[] bArr2 = new byte[mo7060];
            System.arraycopy(bArr, 0, bArr2, 0, mo7060);
            return bArr2;
        } catch (C7450 e) {
            throw new IllegalArgumentException(e);
        }
    }

    static {
        new C13799("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new C13799("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        f33860 = new C2138("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new C2138("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f33859 = new C22972();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static AbstractC11311 m27952() {
        return f33860;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC11311 m27951() {
        return f33859;
    }
}

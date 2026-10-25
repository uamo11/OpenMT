package l;

import java.util.Arrays;

/* compiled from: 39IB */
/* renamed from: l.ۗ۫ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3229 extends AbstractC6051 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10163;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean[] f10164;

    public C3229() {
        throw null;
    }

    public C3229(AbstractC11716 abstractC11716, byte[] bArr, int i) {
        super(abstractC11716, bArr);
        this.f10163 = i;
        int length = (bArr.length * 8) - i;
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = true;
            if ((bArr[i2 / 8] & (1 << (7 - (i2 % 8)))) == 0) {
                z = false;
            }
            zArr[i2] = z;
        }
        this.f10164 = zArr;
    }

    @Override // l.AbstractC5366
    public final Object getValue() {
        boolean[] zArr = this.f10164;
        return Arrays.copyOf(zArr, zArr.length);
    }

    @Override // l.AbstractC5366
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String mo9905() {
        return Arrays.toString(this.f10164);
    }
}

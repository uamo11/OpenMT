package l;

/* compiled from: 01SB */
/* renamed from: l.ۚ᩷֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC5593 extends AbstractC7070 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17307 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f17306 = 0;

    /* renamed from: ֫ */
    public abstract void mo4772();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15878(short[] sArr, int i) {
        mo4772();
        short s = sArr[i];
        int i2 = (this.f17307 >>> 11) * s;
        if (Integer.compare(this.f17306 ^ Integer.MIN_VALUE, Integer.MIN_VALUE ^ i2) < 0) {
            this.f17307 = i2;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.f17307 -= i2;
        this.f17306 -= i2;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m15879(short[] sArr) {
        int i = 1;
        do {
            i = m15878(sArr, i) | (i << 1);
        } while (i < sArr.length);
        return i - sArr.length;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15877(int i) {
        int i2 = 0;
        do {
            mo4772();
            int i3 = this.f17307 >>> 1;
            this.f17307 = i3;
            int i4 = this.f17306;
            int i5 = (i4 - i3) >>> 31;
            this.f17306 = i4 - (i3 & (i5 - 1));
            i2 = (i2 << 1) | (1 - i5);
            i--;
        } while (i != 0);
        return i2;
    }
}

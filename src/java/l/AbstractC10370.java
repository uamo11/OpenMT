package l;

/* compiled from: V42A */
/* renamed from: l.ۤܶ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC10370 implements InterfaceC14812, InterfaceC21496 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC12486 f31203;

    @Override // l.InterfaceC21496
    /* renamed from: ֫ */
    public final Object mo3574(C6319 c6319) {
        return this;
    }

    /* renamed from: ֫ */
    public abstract byte[] mo2757();

    @Override // l.InterfaceC21496
    /* renamed from: ۘ */
    public final int mo953() {
        return 1;
    }

    /* renamed from: ۧ */
    public abstract byte mo2758(int i);

    /* renamed from: ۧ */
    public abstract int mo2759();

    /* renamed from: ܿ */
    public abstract int mo2760();

    /* renamed from: ᩳ */
    public abstract int mo2761();

    public AbstractC10370(AbstractC12486 abstractC12486) {
        this.f31203 = abstractC12486;
    }

    @Override // l.InterfaceC14812
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo26175(String str) {
        return toString().equals(str.toString());
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return toString().length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return toString().charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m26173(AbstractC10370 abstractC10370) {
        int mo2759 = mo2759();
        int mo27592 = abstractC10370.mo2759() + mo2759;
        byte[] bArr = new byte[mo27592];
        m26174(0, bArr);
        abstractC10370.m26174(mo2759, bArr);
        return this.f31203.mo15926(0, mo27592, bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m26171(char c, AbstractC10370 abstractC10370) {
        int mo2759 = mo2759();
        int i = mo2759 + 1;
        int mo27592 = abstractC10370.mo2759() + i;
        byte[] bArr = new byte[mo27592];
        m26174(0, bArr);
        bArr[mo2759] = (byte) c;
        abstractC10370.m26174(i, bArr);
        return this.f31203.mo15926(0, mo27592, bArr);
    }

    public final boolean isEmpty() {
        return mo2759() == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26170(byte b) {
        byte[] mo2757 = mo2757();
        int mo2761 = mo2761();
        int mo2759 = mo2759();
        do {
            mo2759--;
            if (mo2759 < 0) {
                break;
            }
        } while (mo2757[mo2761 + mo2759] != b);
        return mo2759;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m26176(AbstractC10370 abstractC10370) {
        byte[] mo2757 = mo2757();
        int mo2761 = mo2761();
        int mo2759 = mo2759();
        byte[] mo27572 = abstractC10370.mo2757();
        int mo27612 = abstractC10370.mo2761();
        int mo27592 = abstractC10370.mo2759();
        if (mo2759 >= mo27592) {
            int i = 0;
            while (i < mo27592 && mo2757[mo2761 + i] == mo27572[mo27612 + i]) {
                i++;
            }
            if (i == mo27592) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 m26172(int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        byte[] mo2757 = mo2757();
        return this.f31203.mo15926(mo2761() + i, i2 - i, mo2757);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return C12780.m31089(mo2761(), mo2759(), mo2757());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26174(int i, byte[] bArr) {
        System.arraycopy(mo2757(), mo2761(), bArr, i, mo2759());
    }
}

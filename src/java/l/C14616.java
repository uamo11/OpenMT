package l;

/* compiled from: O7II */
/* renamed from: l.ܳܺ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14616 extends AbstractC5945 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f44711 = 0;

    @Override // l.AbstractC5945
    /* renamed from: ֫ */
    public final byte[] mo16671() {
        return m16673();
    }

    @Override // l.AbstractC5945, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException(String.format("offset=%,d, length=%,d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        if (i2 == 0) {
            return;
        }
        m16674(i, i2, bArr);
    }
}

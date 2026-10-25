package l;

/* compiled from: 86A1 */
/* renamed from: l.֫ۢܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1746 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        int m29168 = ((C11955) c16040.m37919()).m29168();
        int[] iArr = (int[]) ((C11955) c16040.m37919()).m29175();
        byte[] bArr = (byte[]) ((C11955) c16040.m37919()).m29175();
        int i = m29168 * 4;
        while (m29168 < iArr.length) {
            int i2 = iArr[m29168];
            int i3 = ~i2;
            bArr[i] = (byte) (i3 & 255);
            bArr[i + 1] = (byte) ((i2 >>> 8) & 255);
            int i4 = i + 3;
            bArr[i + 2] = (byte) ((i3 >>> 16) & 255);
            i += 4;
            bArr[i4] = (byte) ((i2 >>> 24) & 255);
            m29168++;
        }
    }
}

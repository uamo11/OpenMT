package l;

/* compiled from: 643C */
/* renamed from: l.ᩳ᩻۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C18382 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m42811(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i + i3];
            if (b == 47) {
                bArr2[i3] = 46;
            } else {
                bArr2[i3] = b;
            }
        }
        return bArr2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m42812(AbstractC10370 abstractC10370) {
        byte[] mo2757 = abstractC10370.mo2757();
        int mo2761 = abstractC10370.mo2761();
        int mo2759 = abstractC10370.mo2759();
        byte[] bArr = new byte[mo2759];
        for (int i = 0; i < mo2759; i++) {
            byte b = mo2757[mo2761 + i];
            if (b == 46) {
                bArr[i] = 47;
            } else {
                bArr[i] = b;
            }
        }
        return bArr;
    }
}

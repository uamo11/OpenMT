package l;

/* compiled from: P4QI */
/* renamed from: l.᩺᩶ۚ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23214 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f74600;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f74601;

    public C23214(byte[] bArr, int i) {
        this.f74600 = bArr;
        this.f74601 = i;
    }

    public final String toString() {
        byte[] bArr = this.f74600;
        int i = this.f74601;
        byte b = bArr[i];
        StringBuilder sb = new StringBuilder(b * 2);
        for (int i2 = 0; i2 < b; i2++) {
            int i3 = i2 * 2;
            byte b2 = bArr[i3 + i + 1];
            if (b2 == 0) {
                sb.append('[');
            } else if (b2 == 1) {
                sb.append('.');
            } else if (b2 == 2) {
                sb.append('*');
            } else if (b2 == 3) {
                sb.append((int) bArr[i3 + i + 2]);
                sb.append(';');
            } else {
                throw new AssertionError();
            }
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51506(C23214 c23214, C18276 c18276) {
        if (c23214 == null) {
            c18276.m42609(0);
            return;
        }
        byte[] bArr = c23214.f74600;
        int i = c23214.f74601;
        c18276.m42613(i, (bArr[i] * 2) + 1, bArr);
    }
}

package l;

import java.io.OutputStream;

/* compiled from: O6WV */
/* renamed from: l.ۗۜᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3076 extends OutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12953 f9648;

    public C3076(C12953 c12953) {
        this.f9648 = c12953;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        boolean z;
        C0521 c0521;
        C0521 c05212;
        C12953 c12953 = this.f9648;
        z = c12953.f38859;
        if (z) {
            return;
        }
        c0521 = c12953.f38856;
        if (c0521.f2177 >= 8388608) {
            C12953.m31512(c12953);
        } else {
            c05212 = c12953.f38856;
            c05212.write(i);
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        boolean z;
        C0521 c0521;
        C0521 c05212;
        C12953 c12953 = this.f9648;
        z = c12953.f38859;
        if (z) {
            return;
        }
        c0521 = c12953.f38856;
        if (i2 > 8388608 - c0521.f2177) {
            C12953.m31512(c12953);
        } else {
            c05212 = c12953.f38856;
            c05212.write(bArr, i, i2);
        }
    }
}

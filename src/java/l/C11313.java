package l;

import android.util.Base64OutputStream;
import java.io.OutputStream;

/* compiled from: 964V */
/* renamed from: l.ۧ᩺ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11313 extends OutputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC17066 f33870;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Base64OutputStream f33871;

    public C11313(Base64OutputStream base64OutputStream, InterfaceC17066 interfaceC17066) {
        this.f33871 = base64OutputStream;
        this.f33870 = interfaceC17066;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        if (!this.f33870.mo1526()) {
            this.f33871.write(i);
            return;
        }
        throw new C16956();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (!this.f33870.mo1526()) {
            this.f33871.write(bArr, i, i2);
            return;
        }
        throw new C16956();
    }
}

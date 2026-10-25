package l;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: BBSE */
/* renamed from: l.ۚܺᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC5461 extends InputStream implements InterfaceC1227, InterfaceC14905 {
    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public void readFully(byte[] bArr) {
        read(bArr);
    }

    public void readFully(byte[] bArr, int i, int i2) {
        read(bArr, i, i2);
    }
}

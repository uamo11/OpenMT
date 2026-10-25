package l;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: OJQ */
/* renamed from: l.᩷ۢ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20784 extends InputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7889 f67309;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C20784(InterfaceC7889 interfaceC7889) {
        this.f67309 = interfaceC7889;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.f67309.read();
    }
}

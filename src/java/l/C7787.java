package l;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: V4E2 */
/* renamed from: l.۟᩺᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7787 implements Closeable, Flushable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C10678 f24060;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC17733 f24061 = new C12726(this);

    public C7787(File file) {
        this.f24060 = C10678.m26789(file, 201105, 2, 10485760L);
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f24060.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f24060.close();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m20810(InterfaceC6171 interfaceC6171) {
        try {
            long mo12314 = interfaceC6171.mo12314();
            String mo12300 = interfaceC6171.mo12300();
            if (mo12314 >= 0 && mo12314 <= 2147483647L && mo12300.isEmpty()) {
                return (int) mo12314;
            }
            throw new IOException("expected an int but was \"" + mo12314 + mo12300 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }
}

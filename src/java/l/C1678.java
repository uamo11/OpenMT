package l;

import java.util.zip.DeflaterOutputStream;

/* compiled from: J4GT */
/* renamed from: l.֫۟ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1678 extends DeflaterOutputStream {
    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        ((DeflaterOutputStream) this).def.end();
    }
}

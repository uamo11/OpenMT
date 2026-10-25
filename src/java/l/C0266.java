package l;

import com.github.luben.zstd.ZstdInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: A6V5 */
/* renamed from: l.֡۟ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C0266 extends ZstdInputStream {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3545 f1588;

    public C0266(C3545 c3545, InputStream inputStream) {
        super(inputStream);
        this.f1588 = c3545;
    }

    @Override // com.github.luben.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        try {
            return super.read();
        } catch (IOException e) {
            C2568.m8117(e, this.f1588);
            throw null;
        }
    }

    @Override // com.github.luben.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            C2568.m8117(e, this.f1588);
            throw null;
        }
    }

    @Override // com.github.luben.zstd.ZstdInputStream, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        try {
            return super.skip(j);
        } catch (IOException e) {
            C2568.m8117(e, this.f1588);
            throw null;
        }
    }
}

package l;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: R8BB */
/* renamed from: l.ۖ۟ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C2384 extends C19451 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C3545 f7596;

    public C2384(C3545 c3545, InputStream inputStream) {
        super(inputStream);
        this.f7596 = c3545;
    }

    @Override // l.C19451, java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        try {
            return super.read();
        } catch (IOException e) {
            C2568.m8117(e, this.f7596);
            throw null;
        }
    }

    @Override // l.C19451, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return super.read(bArr, i, i2);
        } catch (IOException e) {
            C2568.m8117(e, this.f7596);
            throw null;
        }
    }

    @Override // l.C19451, java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        try {
            return super.skip(j);
        } catch (IOException e) {
            C2568.m8117(e, this.f7596);
            throw null;
        }
    }
}

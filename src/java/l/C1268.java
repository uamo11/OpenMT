package l;

import java.io.EOFException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* compiled from: G1W6 */
/* renamed from: l.֨ܿᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1268 implements InterfaceC0562 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f4486;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC7889 f4487;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f4488;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f4489;

    @Override // l.InterfaceC0562
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2313(long j, C23411 c23411) {
        C4091.m12293(this, c23411, j);
    }

    @Override // l.InterfaceC0562
    /* renamed from: ֫ */
    public final /* synthetic */ void mo2315(MessageDigest messageDigest, long j) {
        C4091.m12292(this, messageDigest, j);
    }

    @Override // l.InterfaceC0562
    /* renamed from: ܽ */
    public final /* synthetic */ InterfaceC0562 mo2317() {
        return C4091.m12290((InterfaceC0562) this);
    }

    public C1268(InterfaceC7889 interfaceC7889, long j, long j2) {
        this.f4487 = interfaceC7889;
        this.f4489 = j;
        this.f4488 = j2;
    }

    @Override // l.InterfaceC0562
    /* renamed from: ۧ */
    public final long mo2316() {
        return size() - mo2312();
    }

    @Override // l.InterfaceC0562
    public final long size() {
        return this.f4488;
    }

    @Override // l.InterfaceC0562
    /* renamed from: ֫ */
    public final long mo2312() {
        return this.f4486;
    }

    @Override // l.InterfaceC0562
    public final void reset() {
        this.f4486 = 0L;
    }

    @Override // l.InterfaceC0562
    /* renamed from: ֫ */
    public final void mo2314(OutputStream outputStream, long j) {
        int read;
        if (j > mo2316()) {
            throw new EOFException();
        }
        byte[] bArr = new byte[4096];
        long j2 = this.f4489 + this.f4486;
        InterfaceC7889 interfaceC7889 = this.f4487;
        interfaceC7889.seek(j2);
        while (j > 0 && (read = interfaceC7889.read(bArr, 0, (int) Math.min(j, 4096))) != -1) {
            outputStream.write(bArr, 0, read);
            long j3 = read;
            j -= j3;
            this.f4486 += j3;
        }
        if (j != 0) {
            throw new IllegalStateException(C16014.m37865(j, "Remaining length: "));
        }
    }
}

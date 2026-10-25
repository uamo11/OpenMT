package l;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Q8FL */
/* renamed from: l.ۗ֡ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C2881 extends AbstractC2399 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16431 f9185;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InputStream f9186;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f9187;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Uri f9188;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f9189;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2881(l.C16431 r1) {
        /*
            r0 = this;
            r0.f9185 = r1
            l.ܰܺܳ r1 = l.C16431.m38729(r1)
            boolean r1 = r1 instanceof l.AbstractC3163
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2881.<init>(l.ܽۚۜ):void");
    }

    @Override // l.InterfaceC21449
    /* renamed from: ֫ */
    public final long mo1620(C3104 c3104) {
        AbstractC13921 abstractC13921;
        AbstractC13921 abstractC139212;
        boolean z;
        boolean z2;
        boolean z3;
        Uri uri = c3104.f9711;
        long j = c3104.f9718;
        this.f9188 = uri;
        m7774(c3104);
        Uri uri2 = this.f9188;
        C16431 c16431 = this.f9185;
        InterfaceC17889 m38737 = c16431.m38737(uri2);
        long size = m38737.getSize();
        if (size >= 0 && j > size) {
            throw new C22154(null, null, 2008);
        }
        long j2 = c3104.f9713;
        this.f9187 = j2;
        if (j2 == -1 && size >= 0) {
            this.f9187 = size - j;
        }
        try {
            if (size >= 0 && j == size) {
                this.f9186 = new ByteArrayInputStream(new byte[0]);
                this.f9189 = true;
                m7776(c3104);
                return this.f9187;
            }
            abstractC13921 = c16431.f50535;
            if (abstractC13921 instanceof AbstractC3163) {
                AbstractC3163 abstractC3163 = (AbstractC3163) abstractC13921;
                C16431.m38713(c16431, m38737);
                z3 = c16431.f50528;
                if (z3) {
                    throw new C3586(m38737.getName());
                }
                long j3 = c3104.f9713;
                this.f9186 = j3 == -1 ? abstractC3163.mo9681(j, m38737.getPath()) : abstractC3163.mo9682(m38737.getPath(), c3104.f9718, j3);
            } else {
                abstractC139212 = c16431.f50535;
                if (!(abstractC139212 instanceof C2499)) {
                    throw new IOException("HLS direct reading requires a local or network visitor");
                }
                z = c16431.f50528;
                if (z) {
                    throw new C3586(m38737.getName());
                }
                InputStream mo27926 = m38737.mo24433().mo27926();
                this.f9186 = mo27926;
                while (j > 0) {
                    long skip = mo27926.skip(j);
                    if (skip <= 0) {
                        if (mo27926.read() == -1) {
                            throw new C22154(null, null, 2008);
                        }
                        skip = 1;
                    }
                    j -= skip;
                }
            }
            z2 = c16431.f50528;
            if (!z2) {
                this.f9189 = true;
                m7776(c3104);
                return this.f9187;
            }
            InputStream inputStream = this.f9186;
            this.f9186 = null;
            if (inputStream != null) {
                inputStream.close();
            }
            throw new C3586(m38737.getName());
        } catch (IOException e) {
            throw C16431.m38701(c16431, e);
        }
    }

    @Override // l.InterfaceC9765
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9187;
        if (j == 0) {
            return -1;
        }
        InputStream inputStream = this.f9186;
        if (inputStream == null) {
            throw new IOException("Data source is not open");
        }
        if (j != -1) {
            i2 = (int) Math.min(j, i2);
        }
        try {
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                this.f9187 = 0L;
                return -1;
            }
            long j2 = this.f9187;
            if (j2 != -1) {
                this.f9187 = j2 - read;
            }
            m7777(read);
            return read;
        } catch (IOException e) {
            throw C16431.m38701(this.f9185, e);
        }
    }

    @Override // l.InterfaceC21449
    /* renamed from: ܿ */
    public final Uri mo1621() {
        return this.f9188;
    }

    @Override // l.InterfaceC21449
    public final void close() {
        this.f9188 = null;
        try {
            InputStream inputStream = this.f9186;
            if (inputStream != null) {
                inputStream.close();
            }
        } finally {
            this.f9186 = null;
            this.f9187 = 0L;
            if (this.f9189) {
                this.f9189 = false;
                m7775();
            }
        }
    }
}

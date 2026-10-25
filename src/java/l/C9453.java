package l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: 0AK2 */
/* renamed from: l.ۢ۠֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C9453 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f28662;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InputStream f28664;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C1691 f28665;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f28663 = false;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f28661 = 0;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C17919 f28666 = null;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public int read() {
        int m41909;
        C17919 c17919 = this.f28666;
        if (c17919 == null) {
            m24292();
            m41909 = -1;
        } else {
            m41909 = c17919.m41909();
        }
        return (m41909 == -1 && m24291()) ? this.f28666.m41909() : m41909;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0014, code lost:
    
        if (r3 == 0) goto L10;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int read(byte[] r7, int r8, int r9) {
        /*
            r6 = this;
            l.ᩳ۠֡ r0 = r6.f28666
            r1 = 0
            r2 = -1
            if (r0 != 0) goto La
            r6.m24292()
            goto L16
        La:
            r3 = 0
            r4 = r8
        Lc:
            if (r3 >= r9) goto L20
            int r5 = r0.m41909()
            if (r5 != r2) goto L18
            if (r3 != 0) goto L20
        L16:
            r3 = -1
            goto L20
        L18:
            byte r5 = (byte) r5
            r7[r4] = r5
            int r3 = r3 + 1
            int r4 = r4 + 1
            goto Lc
        L20:
            if (r3 != r2) goto L42
            boolean r0 = r6.m24291()
            if (r0 == 0) goto L42
            l.ᩳ۠֡ r0 = r6.f28666
        L2a:
            if (r1 >= r9) goto L3e
            int r3 = r0.m41909()
            if (r3 != r2) goto L36
            if (r1 != 0) goto L35
            return r2
        L35:
            return r1
        L36:
            byte r3 = (byte) r3
            r7[r8] = r3
            int r1 = r1 + 1
            int r8 = r8 + 1
            goto L2a
        L3e:
            r0.getClass()
            return r1
        L42:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9453.read(byte[], int, int):int");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f28665 != null) {
            this.f28663 = true;
            this.f28666 = null;
            this.f28665 = null;
            try {
                this.f28664.close();
            } finally {
                this.f28664 = null;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m24292() {
        C1691 c1691 = this.f28665;
        if (c1691 == null) {
            throw new C23563("Stream closed");
        }
        if (this.f28663) {
            return;
        }
        try {
            int m5702 = c1691.m5702(16);
            int m57022 = this.f28665.m5702(8);
            int m57023 = this.f28665.m5702(8) - 48;
            if (m5702 != 16986 || m57022 != 104 || m57023 < 1 || m57023 > 9) {
                throw new C23563("Invalid BZip2 header");
            }
            this.f28662 = m57023 * 100000;
        } catch (IOException e) {
            this.f28663 = true;
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m24291() {
        if (this.f28663) {
            return false;
        }
        C17919 c17919 = this.f28666;
        if (c17919 != null) {
            int m41908 = c17919.m41908();
            int i = this.f28661;
            this.f28661 = m41908 ^ ((i >>> 31) | (i << 1));
        }
        int m5702 = this.f28665.m5702(24);
        int m57022 = this.f28665.m5702(24);
        if (m5702 == 3227993 && m57022 == 2511705) {
            try {
                this.f28666 = new C17919(this.f28665, this.f28662);
                return true;
            } catch (IOException e) {
                this.f28663 = true;
                throw e;
            }
        }
        if (m5702 == 1536581 && m57022 == 3690640) {
            this.f28663 = true;
            C1691 c1691 = this.f28665;
            if ((c1691.m5702(16) | (c1691.m5702(16) << 16)) == this.f28661) {
                return false;
            }
            throw new C23563("BZip2 stream CRC error");
        }
        this.f28663 = true;
        throw new C23563("BZip2 stream format error");
    }

    public C9453(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalArgumentException("Null input stream");
        }
        this.f28664 = inputStream;
        this.f28665 = new C1691(inputStream);
    }
}

package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;

/* compiled from: O7WV */
/* renamed from: l.ܳۜۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14353 extends AbstractC19791 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static Hashtable f43279 = new Hashtable();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static Hashtable f43280 = new Hashtable();

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f43282 = true;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Socket f43283 = null;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public byte[] f43281 = new byte[0];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34248(C7381 c7381) {
        Hashtable hashtable = f43280;
        synchronized (hashtable) {
            hashtable.remove(c7381);
            f43279.remove(c7381);
        }
    }

    public C14353() {
        this.f63924 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63913 = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f63925 = 16384;
        byte[] bArr = C19356.f62660;
        this.f63912 = C19356.m44592("x11", StandardCharsets.UTF_8);
        this.f63919 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        m45495();
     */
    @Override // l.AbstractC19791
    /* renamed from: ۡ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2847() {
        /*
            r8 = this;
            r0 = 1
            java.lang.String r1 = "127.0.0.1"
            r2 = 6000(0x1770, float:8.408E-42)
            r3 = 10000(0x2710, float:1.4013E-41)
            java.net.Socket r1 = l.C19356.m44589(r2, r3, r1)     // Catch: java.lang.Exception -> L83
            r8.f43283 = r1     // Catch: java.lang.Exception -> L83
            r1.setTcpNoDelay(r0)     // Catch: java.lang.Exception -> L83
            l.᩵᩷ۘ r1 = new l.᩵᩷ۘ     // Catch: java.lang.Exception -> L83
            r1.<init>()     // Catch: java.lang.Exception -> L83
            r8.f63917 = r1     // Catch: java.lang.Exception -> L83
            java.net.Socket r2 = r8.f43283     // Catch: java.lang.Exception -> L83
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L83
            r1.f63666 = r2     // Catch: java.lang.Exception -> L83
            l.᩵᩷ۘ r1 = r8.f63917     // Catch: java.lang.Exception -> L83
            java.net.Socket r2 = r8.f43283     // Catch: java.lang.Exception -> L83
            java.io.OutputStream r2 = r2.getOutputStream()     // Catch: java.lang.Exception -> L83
            r1.f63667 = r2     // Catch: java.lang.Exception -> L83
            r8.m45487()     // Catch: java.lang.Exception -> L83
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r8.f63908 = r0
            l.ܺ᩻ۘ r0 = new l.ܺ᩻ۘ
            int r1 = r8.f63911
            r0.<init>(r1)
            l.۠ۢۘ r1 = new l.۠ۢۘ
            r1.<init>(r0)
            l.۟ۢۘ r2 = r8.m45497()     // Catch: java.lang.Exception -> L7f
        L42:
            java.lang.Thread r3 = r8.f63908     // Catch: java.lang.Exception -> L7f
            if (r3 == 0) goto L7f
            l.᩵᩷ۘ r3 = r8.f63917     // Catch: java.lang.Exception -> L7f
            if (r3 == 0) goto L7f
            java.io.InputStream r3 = r3.f63666     // Catch: java.lang.Exception -> L7f
            if (r3 == 0) goto L7f
            byte[] r4 = r0.f50016     // Catch: java.lang.Exception -> L7f
            int r5 = r4.length     // Catch: java.lang.Exception -> L7f
            r6 = 14
            int r5 = r5 - r6
            int r7 = r2.m19874()     // Catch: java.lang.Exception -> L7f
            int r5 = r5 - r7
            int r3 = r3.read(r4, r6, r5)     // Catch: java.lang.Exception -> L7f
            if (r3 > 0) goto L63
            r8.m45495()     // Catch: java.lang.Exception -> L7f
            goto L7f
        L63:
            boolean r4 = r8.f63909     // Catch: java.lang.Exception -> L7f
            if (r4 == 0) goto L68
            goto L7f
        L68:
            r1.m21457()     // Catch: java.lang.Exception -> L7f
            r4 = 94
            r0.m38234(r4)     // Catch: java.lang.Exception -> L7f
            int r4 = r8.f63918     // Catch: java.lang.Exception -> L7f
            r0.m38245(r4)     // Catch: java.lang.Exception -> L7f
            r0.m38245(r3)     // Catch: java.lang.Exception -> L7f
            r0.m38251(r3)     // Catch: java.lang.Exception -> L7f
            r2.m19862(r1, r8, r3)     // Catch: java.lang.Exception -> L7f
            goto L42
        L7f:
            r8.m45490()
            return
        L83:
            r8.m45488()
            r8.f63909 = r0
            r8.m45490()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14353.mo2847():void");
    }

    @Override // l.AbstractC19791
    /* renamed from: ֫ */
    public final void mo2846(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        if (this.f43282) {
            try {
                C7381 m45497 = m45497();
                byte[] bArr3 = this.f43281;
                int length = bArr3.length + i2;
                byte[] bArr4 = new byte[length];
                System.arraycopy(bArr, i, bArr4, bArr3.length, i2);
                byte[] bArr5 = this.f43281;
                if (bArr5.length > 0) {
                    System.arraycopy(bArr5, 0, bArr4, 0, bArr5.length);
                }
                this.f43281 = bArr4;
                if (length < 9) {
                    return;
                }
                int i3 = ((bArr4[6] & 255) * 256) + (bArr4[7] & 255);
                int i4 = ((bArr4[8] & 255) * 256) + (bArr4[9] & 255);
                int i5 = bArr4[0] & 255;
                if (i5 != 66 && i5 == 108) {
                    i3 = ((i3 << 8) & 65280) | ((i3 >>> 8) & 255);
                    i4 = ((i4 << 8) & 65280) | ((i4 >>> 8) & 255);
                }
                int i6 = i4;
                int i7 = i3 + 12 + ((-i3) & 3);
                if (length < i7 + i6) {
                    return;
                }
                byte[] bArr6 = new byte[i6];
                System.arraycopy(bArr4, i7, bArr6, 0, i6);
                Hashtable hashtable = f43279;
                synchronized (hashtable) {
                    bArr2 = (byte[]) hashtable.get(m45497);
                }
                if (i6 == bArr2.length) {
                    for (int i8 = 0; i8 < i6; i8++) {
                        if (bArr6[i8] == bArr2[i8]) {
                        }
                    }
                    this.f43282 = false;
                    C19708 c19708 = this.f63917;
                    c19708.f63667.write(bArr4, 0, length);
                    c19708.f63667.flush();
                    this.f43281 = null;
                    return;
                }
                this.f63908 = null;
                m45495();
                this.f63917.m45399();
                m45490();
                this.f43282 = false;
                C19708 c197082 = this.f63917;
                c197082.f63667.write(bArr4, 0, length);
                c197082.f63667.flush();
                this.f43281 = null;
                return;
            } catch (C12651 e) {
                throw new IOException(e.toString(), e);
            }
        }
        C19708 c197083 = this.f63917;
        c197083.f63667.write(bArr, i, i2);
        c197083.f63667.flush();
    }
}

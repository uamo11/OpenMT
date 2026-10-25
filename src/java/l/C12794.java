package l;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: A4E9 */
/* renamed from: l.۬֫֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12794 extends AbstractC4328 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f38414;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11749 f38415;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11384 f38416;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f38417;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12794(C11384 c11384, C11749 c11749) {
        super(c11384);
        this.f38416 = c11384;
        this.f38414 = -1L;
        this.f38417 = true;
        this.f38415 = c11749;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        if (r10.f38417 == false) goto L32;
     */
    @Override // l.AbstractC4328, l.InterfaceC1274
    /* renamed from: ۧ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo4334(l.C12521 r11, long r12) {
        /*
            r10 = this;
            boolean r12 = r10.f13928
            if (r12 != 0) goto Lc2
            boolean r12 = r10.f38417
            r0 = -1
            if (r12 != 0) goto Lb
            goto L79
        Lb:
            long r12 = r10.f38414
            r2 = 0
            r3 = 0
            int r5 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r5 == 0) goto L18
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L7a
        L18:
            l.ۨ֫֡ r5 = r10.f38416
            l.ۛܽ֡ r6 = r5.f34055
            java.lang.String r7 = "expected chunk size and optional extensions but was \""
            int r8 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r8 == 0) goto L25
            r6.mo12300()
        L25:
            long r12 = r6.mo12309()     // Catch: java.lang.NumberFormatException -> Lb7
            r10.f38414 = r12     // Catch: java.lang.NumberFormatException -> Lb7
            java.lang.String r12 = r6.mo12300()     // Catch: java.lang.NumberFormatException -> Lb7
            java.lang.String r12 = r12.trim()     // Catch: java.lang.NumberFormatException -> Lb7
            long r8 = r10.f38414     // Catch: java.lang.NumberFormatException -> Lb7
            int r13 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r13 < 0) goto L9b
            boolean r13 = r12.isEmpty()     // Catch: java.lang.NumberFormatException -> Lb7
            if (r13 != 0) goto L47
            java.lang.String r13 = ";"
            boolean r13 = r12.startsWith(r13)     // Catch: java.lang.NumberFormatException -> Lb7
            if (r13 == 0) goto L9b
        L47:
            long r12 = r10.f38414
            int r6 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r6 != 0) goto L75
            r10.f38417 = r2
            l.ܿ۟᩵ r12 = r5.f34050
            l.᩵ܰ᩵ r12 = r12.m40473()
            l.ۤܰ᩵ r13 = r5.m28147()
            int r3 = l.C0799.f2925
            l.᩵ܰ᩵ r3 = l.InterfaceC19511.f63052
            if (r12 != r3) goto L60
            goto L70
        L60:
            l.ۨܰ᩵ r3 = r10.f38415
            java.util.List r13 = l.C3988.m12034(r3, r13)
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L6d
            goto L70
        L6d:
            r12.getClass()
        L70:
            r12 = 1
            r13 = 0
            r10.m12985(r12, r13)
        L75:
            boolean r12 = r10.f38417
            if (r12 != 0) goto L7a
        L79:
            return r0
        L7a:
            long r12 = r10.f38414
            r3 = 8192(0x2000, double:4.0474E-320)
            long r12 = java.lang.Math.min(r3, r12)
            long r11 = super.mo4334(r11, r12)
            int r13 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r13 == 0) goto L90
            long r0 = r10.f38414
            long r0 = r0 - r11
            r10.f38414 = r0
            return r11
        L90:
            java.net.ProtocolException r11 = new java.net.ProtocolException
            java.lang.String r12 = "unexpected end of stream"
            r11.<init>(r12)
            r10.m12985(r2, r11)
            throw r11
        L9b:
            java.net.ProtocolException r11 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> Lb7
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lb7
            r13.<init>(r7)     // Catch: java.lang.NumberFormatException -> Lb7
            long r0 = r10.f38414     // Catch: java.lang.NumberFormatException -> Lb7
            r13.append(r0)     // Catch: java.lang.NumberFormatException -> Lb7
            r13.append(r12)     // Catch: java.lang.NumberFormatException -> Lb7
            java.lang.String r12 = "\""
            r13.append(r12)     // Catch: java.lang.NumberFormatException -> Lb7
            java.lang.String r12 = r13.toString()     // Catch: java.lang.NumberFormatException -> Lb7
            r11.<init>(r12)     // Catch: java.lang.NumberFormatException -> Lb7
            throw r11     // Catch: java.lang.NumberFormatException -> Lb7
        Lb7:
            r11 = move-exception
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r11)
            throw r12
        Lc2:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "closed"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12794.mo4334(l.۫ܽ֡, long):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.f13928) {
            return;
        }
        if (this.f38417) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            try {
                z = C20032.m46184(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                m12985(false, null);
            }
        }
        this.f13928 = true;
    }
}

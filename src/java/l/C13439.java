package l;

import com.umeng.analytics.pro.d;
import java.nio.charset.StandardCharsets;

/* compiled from: W7UY */
/* renamed from: l.۬᩻ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C13439 extends AbstractC19791 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static byte[] f40154;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f40156 = false;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f40158 = "vt100";

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f40157 = 80;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40160 = 24;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40155 = 640;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f40159 = 480;

    static {
        byte[] bArr = C19356.f62660;
        f40154 = C19356.m44592(d.aw, StandardCharsets.UTF_8);
    }

    public C13439() {
        this.f63912 = f40154;
        this.f63917 = new C19708();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m32473() {
        C7381 m45497 = m45497();
        if (this.f40156) {
            C3148 c3148 = new C3148();
            c3148.m9571(this.f40158);
            c3148.m9570(this.f40157, this.f40160, this.f40155, this.f40159);
            c3148.mo9572(m45497, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0037, code lost:
    
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
            l.ܺ᩻ۘ r0 = new l.ܺ᩻ۘ
            int r1 = r8.f63911
            r0.<init>(r1)
            l.۠ۢۘ r1 = new l.۠ۢۘ
            r1.<init>(r0)
            l.۟ۢۘ r2 = r8.m45497()     // Catch: java.lang.Exception -> L57
        L10:
            boolean r3 = r8.m45489()     // Catch: java.lang.Exception -> L57
            if (r3 == 0) goto L58
            java.lang.Thread r3 = r8.f63908     // Catch: java.lang.Exception -> L57
            if (r3 == 0) goto L58
            l.᩵᩷ۘ r3 = r8.f63917     // Catch: java.lang.Exception -> L57
            if (r3 == 0) goto L58
            java.io.InputStream r3 = r3.f63666     // Catch: java.lang.Exception -> L57
            if (r3 == 0) goto L58
            byte[] r4 = r0.f50016     // Catch: java.lang.Exception -> L57
            int r5 = r4.length     // Catch: java.lang.Exception -> L57
            r6 = 14
            int r5 = r5 - r6
            int r7 = r2.m19874()     // Catch: java.lang.Exception -> L57
            int r5 = r5 - r7
            int r3 = r3.read(r4, r6, r5)     // Catch: java.lang.Exception -> L57
            if (r3 != 0) goto L34
            goto L10
        L34:
            r4 = -1
            if (r3 != r4) goto L3b
            r8.m45495()     // Catch: java.lang.Exception -> L57
            goto L58
        L3b:
            boolean r4 = r8.f63909     // Catch: java.lang.Exception -> L57
            if (r4 == 0) goto L40
            goto L58
        L40:
            r1.m21457()     // Catch: java.lang.Exception -> L57
            r4 = 94
            r0.m38234(r4)     // Catch: java.lang.Exception -> L57
            int r4 = r8.f63918     // Catch: java.lang.Exception -> L57
            r0.m38245(r4)     // Catch: java.lang.Exception -> L57
            r0.m38245(r3)     // Catch: java.lang.Exception -> L57
            r0.m38251(r3)     // Catch: java.lang.Exception -> L57
            r2.m19862(r1, r8, r3)     // Catch: java.lang.Exception -> L57
            goto L10
        L57:
        L58:
            java.lang.Thread r1 = r8.f63908
            if (r1 == 0) goto L66
            r0 = r1
            monitor-enter(r0)
            r1.notifyAll()     // Catch: java.lang.Throwable -> L63
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            goto L66
        L63:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            throw r1
        L66:
            r0 = 0
            r8.f63908 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C13439.mo2847():void");
    }
}

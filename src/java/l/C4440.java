package l;

import java.io.IOException;
import java.util.ArrayList;

/* compiled from: B99D */
/* renamed from: l.ۙۚۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4440 extends Thread {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12906 f14188;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f14190 = new ArrayList();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final StringBuilder f14189 = new StringBuilder();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f14187 = true;

    public C4440(C12906 c12906) {
        this.f14188 = c12906;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12201 m13191(long j) {
        start();
        if (j > 0) {
            try {
                join(j);
                this.f14187 = false;
            } catch (InterruptedException unused) {
            }
        }
        join();
        return new C12201(this.f14189.toString(), (String[]) this.f14190.toArray(new String[0]));
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            m13189();
        } catch (IOException e) {
            m13190(e.toString());
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:23:0x0030 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m13189() {
        /*
            r4 = this;
        L0:
            boolean r0 = r4.f14187
            l.۬ۚۢ r1 = r4.f14188
            if (r0 == 0) goto L82
            boolean r0 = l.C12906.m31348(r1)
            if (r0 != 0) goto L82
            java.io.BufferedReader r0 = l.C12906.m31354(r1)
            boolean r0 = r0.ready()
            java.lang.String r2 = "unused DT entry"
            if (r0 == 0) goto L54
        L18:
            java.io.BufferedReader r0 = l.C12906.m31354(r1)
            java.lang.String r0 = r0.readLine()
            java.lang.String r3 = "MT - End of command"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L44
        L28:
            java.io.BufferedReader r0 = l.C12906.m31350(r1)
            boolean r0 = r0.ready()
            if (r0 == 0) goto L82
            java.io.BufferedReader r0 = l.C12906.m31350(r1)
            java.lang.String r0 = r0.readLine()
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L28
            r4.m13190(r0)
            goto L28
        L44:
            java.util.ArrayList r3 = r4.f14190
            r3.add(r0)
            java.io.BufferedReader r0 = l.C12906.m31354(r1)
            boolean r0 = r0.ready()
            if (r0 != 0) goto L18
            goto L79
        L54:
            java.io.BufferedReader r0 = l.C12906.m31350(r1)
            boolean r0 = r0.ready()
            if (r0 == 0) goto L79
        L5e:
            java.io.BufferedReader r0 = l.C12906.m31350(r1)
            java.lang.String r0 = r0.readLine()
            boolean r3 = r0.contains(r2)
            if (r3 != 0) goto L6f
            r4.m13190(r0)
        L6f:
            java.io.BufferedReader r0 = l.C12906.m31350(r1)
            boolean r0 = r0.ready()
            if (r0 != 0) goto L5e
        L79:
            r0 = 1
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L7f
            goto L0
        L7f:
            goto L0
        L82:
            boolean r0 = r4.f14187
            if (r0 != 0) goto L8b
            java.lang.String r0 = "Read shell timeout."
            r4.m13190(r0)
        L8b:
            boolean r0 = l.C12906.m31348(r1)
            if (r0 == 0) goto L96
            java.lang.String r0 = "Shell closed."
            r4.m13190(r0)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4440.m13189():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13190(String str) {
        String trim = str.trim();
        if (trim.length() > 0) {
            StringBuilder sb = this.f14189;
            if (sb.length() > 0) {
                sb.append('\n');
            }
            sb.append(trim);
        }
    }
}

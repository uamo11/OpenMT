package l;

import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* compiled from: 2BMB */
/* renamed from: l.ۖ᩻ۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2857 extends PipedInputStream implements InterfaceC14905 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f9115;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f9116;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m8744() {
        if (available() != 0) {
            return;
        }
        ((PipedInputStream) this).out = 0;
        byte[] bArr = ((PipedInputStream) this).buffer;
        ((PipedInputStream) this).in = 1;
        bArr[0] = 0;
        read();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0072 A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x0016, B:9:0x001b, B:10:0x0020, B:12:0x0024, B:14:0x0027, B:22:0x0032, B:24:0x003a, B:25:0x006f, B:31:0x0046, B:33:0x0064, B:34:0x0072, B:36:0x0077, B:38:0x007b, B:41:0x0081, B:45:0x0012), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b A[Catch: all -> 0x0087, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x000a, B:7:0x0016, B:9:0x001b, B:10:0x0020, B:12:0x0024, B:14:0x0027, B:22:0x0032, B:24:0x003a, B:25:0x006f, B:31:0x0046, B:33:0x0064, B:34:0x0072, B:36:0x0077, B:38:0x007b, B:41:0x0081, B:45:0x0012), top: B:3:0x0002 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m8745(int r7) {
        /*
            r6 = this;
            r0 = r6
            monitor-enter(r0)
            int r1 = r6.out     // Catch: java.lang.Throwable -> L87
            int r2 = r6.in     // Catch: java.lang.Throwable -> L87
            r3 = -1
            r4 = 0
            if (r1 >= r2) goto Le
            byte[] r1 = r6.buffer     // Catch: java.lang.Throwable -> L87
            int r1 = r1.length     // Catch: java.lang.Throwable -> L87
            goto L16
        Le:
            if (r2 >= r1) goto L18
            if (r2 != r3) goto L16
            byte[] r1 = r6.buffer     // Catch: java.lang.Throwable -> L87
            int r1 = r1.length     // Catch: java.lang.Throwable -> L87
            goto L19
        L16:
            int r1 = r1 - r2
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 >= r7) goto L72
            byte[] r2 = r6.buffer     // Catch: java.lang.Throwable -> L87
            int r5 = r2.length     // Catch: java.lang.Throwable -> L87
            int r5 = r5 - r1
            int r1 = r2.length     // Catch: java.lang.Throwable -> L87
        L20:
            int r2 = r1 - r5
            if (r2 >= r7) goto L27
            int r1 = r1 * 2
            goto L20
        L27:
            int r2 = r6.f9116     // Catch: java.lang.Throwable -> L87
            if (r1 <= r2) goto L2c
            r1 = r2
        L2c:
            int r2 = r1 - r5
            if (r2 >= r7) goto L32
            monitor-exit(r0)
            return
        L32:
            byte[] r7 = new byte[r1]     // Catch: java.lang.Throwable -> L87
            int r2 = r6.out     // Catch: java.lang.Throwable -> L87
            int r5 = r6.in     // Catch: java.lang.Throwable -> L87
            if (r2 >= r5) goto L41
            byte[] r1 = r6.buffer     // Catch: java.lang.Throwable -> L87
            int r2 = r1.length     // Catch: java.lang.Throwable -> L87
            java.lang.System.arraycopy(r1, r4, r7, r4, r2)     // Catch: java.lang.Throwable -> L87
            goto L6f
        L41:
            if (r5 >= r2) goto L62
            if (r5 != r3) goto L46
            goto L6f
        L46:
            byte[] r2 = r6.buffer     // Catch: java.lang.Throwable -> L87
            java.lang.System.arraycopy(r2, r4, r7, r4, r5)     // Catch: java.lang.Throwable -> L87
            byte[] r2 = r6.buffer     // Catch: java.lang.Throwable -> L87
            int r3 = r6.out     // Catch: java.lang.Throwable -> L87
            int r4 = r2.length     // Catch: java.lang.Throwable -> L87
            int r4 = r4 - r3
            int r4 = r1 - r4
            int r5 = r2.length     // Catch: java.lang.Throwable -> L87
            int r5 = r5 - r3
            java.lang.System.arraycopy(r2, r3, r7, r4, r5)     // Catch: java.lang.Throwable -> L87
            byte[] r2 = r6.buffer     // Catch: java.lang.Throwable -> L87
            int r2 = r2.length     // Catch: java.lang.Throwable -> L87
            int r3 = r6.out     // Catch: java.lang.Throwable -> L87
            int r2 = r2 - r3
            int r1 = r1 - r2
            r6.out = r1     // Catch: java.lang.Throwable -> L87
            goto L6f
        L62:
            if (r5 != r2) goto L6f
            byte[] r1 = r6.buffer     // Catch: java.lang.Throwable -> L87
            int r2 = r1.length     // Catch: java.lang.Throwable -> L87
            java.lang.System.arraycopy(r1, r4, r7, r4, r2)     // Catch: java.lang.Throwable -> L87
            byte[] r1 = r6.buffer     // Catch: java.lang.Throwable -> L87
            int r1 = r1.length     // Catch: java.lang.Throwable -> L87
            r6.in = r1     // Catch: java.lang.Throwable -> L87
        L6f:
            r6.buffer = r7     // Catch: java.lang.Throwable -> L87
            goto L85
        L72:
            byte[] r7 = r6.buffer     // Catch: java.lang.Throwable -> L87
            int r7 = r7.length     // Catch: java.lang.Throwable -> L87
            if (r7 != r1) goto L85
            int r7 = r6.f9115     // Catch: java.lang.Throwable -> L87
            if (r1 <= r7) goto L85
            int r1 = r1 / 2
            if (r1 >= r7) goto L80
            goto L81
        L80:
            r7 = r1
        L81:
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L87
            r6.buffer = r7     // Catch: java.lang.Throwable -> L87
        L85:
            monitor-exit(r0)
            return
        L87:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2857.m8745(int):void");
    }

    public C2857(int i) {
        ((PipedInputStream) this).buffer = new byte[32768];
        this.f9115 = 32768;
        this.f9116 = i;
    }

    public C2857(PipedOutputStream pipedOutputStream, int i) {
        super(pipedOutputStream);
        this.f9115 = 1024;
        this.f9116 = 1024;
        ((PipedInputStream) this).buffer = new byte[i];
        this.f9115 = i;
    }
}

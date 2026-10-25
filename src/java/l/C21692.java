package l;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* compiled from: 5AG2 */
/* renamed from: l.᩸ܺ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21692 extends BufferedOutputStream {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ OutputStream f69574;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f69575;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13224 f69576;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21692(C4758 c4758, OutputStream outputStream, InterfaceC13224 interfaceC13224, OutputStream outputStream2) {
        super(outputStream);
        this.f69576 = interfaceC13224;
        this.f69574 = outputStream2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r5 = this;
            java.io.OutputStream r0 = r5.f69574
            l.۬ܺ᩻ r1 = r5.f69576
            boolean r2 = r5.f69575
            if (r2 == 0) goto L9
            goto L59
        L9:
            r2 = 1
            super.close()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L40
            boolean r3 = r1.m32089()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L40
            r4 = 0
            if (r3 == 0) goto L2a
            boolean r3 = r0 instanceof l.C11109
            if (r3 == 0) goto L21
            l.ۧܺ᩻ r0 = (l.C11109) r0
            r0.m27544()     // Catch: java.io.IOException -> L1e
            goto L21
        L1e:
            r4 = move-exception
            r0 = 0
            goto L22
        L21:
            r0 = 1
        L22:
            if (r0 == 0) goto L50
            int r0 = l.C4758.f15106
            l.C13019.m31601(r1)
            goto L55
        L2a:
            r1.mo26245()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L40
            throw r4     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L40
        L2e:
            r3 = move-exception
            boolean r4 = r0 instanceof l.C11109
            if (r4 == 0) goto L38
            l.ۧܺ᩻ r0 = (l.C11109) r0
            r0.m27544()     // Catch: java.io.IOException -> L38
        L38:
            int r0 = l.C4758.f15106
            l.C13019.m31599(r1)
            r5.f69575 = r2
            throw r3
        L40:
            r3 = move-exception
            boolean r4 = r0 instanceof l.C11109
            if (r4 == 0) goto L4f
            l.ۧܺ᩻ r0 = (l.C11109) r0
            r0.m27544()     // Catch: java.io.IOException -> L4b
            goto L4f
        L4b:
            r0 = move-exception
            r3.addSuppressed(r0)
        L4f:
            r4 = r3
        L50:
            int r0 = l.C4758.f15106
            l.C13019.m31599(r1)
        L55:
            r5.f69575 = r2
            if (r4 != 0) goto L5a
        L59:
            return
        L5a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21692.close():void");
    }

    public final void finalize() {
        super.finalize();
        close();
    }
}

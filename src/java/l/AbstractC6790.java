package l;

import java.util.concurrent.CancellationException;

/* compiled from: 2AXS */
/* renamed from: l.ۜ۬᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC6790 extends AbstractRunnableC14510 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f21073;

    /* renamed from: ֫ */
    public abstract InterfaceC11791 mo17992();

    /* renamed from: ֫ */
    public void mo17993(Object obj, CancellationException cancellationException) {
    }

    /* renamed from: ܽ */
    public abstract Object mo18003();

    /* renamed from: ܽ */
    public Object mo18004(Object obj) {
        return obj;
    }

    public AbstractC6790(int i) {
        this.f21073 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18435(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C10881.m27179(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C11233.m27799(th);
        C5797.m16273(new C1851("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), mo17992().getContext());
    }

    /* renamed from: ۧ */
    public Throwable mo18000(Object obj) {
        C18497 c18497 = obj instanceof C18497 ? (C18497) obj : null;
        if (c18497 != null) {
            return c18497.f57332;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        r9 = l.InterfaceC10318.f31060;
        r6 = (l.InterfaceC10318) r6.mo9082(l.C12434.f37427);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            l.᩻ۨ᩵ r0 = r12.f44494
            l.ۨܶ᩵ r1 = r12.mo17992()     // Catch: java.lang.Throwable -> L90
            l.ۧۛ᩵ r1 = (l.C10819) r1     // Catch: java.lang.Throwable -> L90
            l.ᩴ᩸᩵ r2 = r1.f32539     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r1.f32542     // Catch: java.lang.Throwable -> L90
            l.ܳ᩸᩵ r3 = r2.getContext()     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = l.C12934.m31441(r3, r1)     // Catch: java.lang.Throwable -> L90
            l.ܶۛ᩵ r4 = l.C12934.f38800     // Catch: java.lang.Throwable -> L90
            r5 = 0
            if (r1 == r4) goto L1e
            l.ᩴ۫᩵ r4 = l.C22025.m49559(r2, r3)     // Catch: java.lang.Throwable -> L90
            goto L1f
        L1e:
            r4 = r5
        L1f:
            l.ܳ᩸᩵ r6 = r2.getContext()     // Catch: java.lang.Throwable -> L88
            java.lang.Object r7 = r12.mo18003()     // Catch: java.lang.Throwable -> L88
            java.lang.Throwable r8 = r12.mo18000(r7)     // Catch: java.lang.Throwable -> L88
            if (r8 != 0) goto L44
            int r9 = r12.f21073     // Catch: java.lang.Throwable -> L88
            r10 = 1
            if (r9 == r10) goto L37
            r11 = 2
            if (r9 != r11) goto L36
            goto L37
        L36:
            r10 = 0
        L37:
            if (r10 == 0) goto L44
            l.۫۬᩵ r9 = l.InterfaceC10318.f31060     // Catch: java.lang.Throwable -> L88
            l.۫۬᩵ r9 = l.C12434.f37427     // Catch: java.lang.Throwable -> L88
            l.ᩳ᩸᩵ r6 = r6.mo9082(r9)     // Catch: java.lang.Throwable -> L88
            l.ۤ۬᩵ r6 = (l.InterfaceC10318) r6     // Catch: java.lang.Throwable -> L88
            goto L45
        L44:
            r6 = r5
        L45:
            if (r6 == 0) goto L5c
            boolean r9 = r6.mo26070()     // Catch: java.lang.Throwable -> L88
            if (r9 != 0) goto L5c
            java.util.concurrent.CancellationException r6 = r6.mo26071()     // Catch: java.lang.Throwable -> L88
            r12.mo17993(r7, r6)     // Catch: java.lang.Throwable -> L88
            l.ۖ۠᩵ r6 = l.C18642.m43235(r6)     // Catch: java.lang.Throwable -> L88
            r2.mo8683(r6)     // Catch: java.lang.Throwable -> L88
            goto L6d
        L5c:
            if (r8 == 0) goto L66
            l.ۖ۠᩵ r6 = l.C18642.m43235(r8)     // Catch: java.lang.Throwable -> L88
            r2.mo8683(r6)     // Catch: java.lang.Throwable -> L88
            goto L6d
        L66:
            java.lang.Object r6 = r12.mo18004(r7)     // Catch: java.lang.Throwable -> L88
            r2.mo8683(r6)     // Catch: java.lang.Throwable -> L88
        L6d:
            l.۠۠᩵ r2 = l.C8058.f24861     // Catch: java.lang.Throwable -> L88
            if (r4 != 0) goto L87
            l.C12934.m31440(r3, r1)     // Catch: java.lang.Throwable -> L90
            r0.getClass()     // Catch: java.lang.Throwable -> L7a
            l.۠۠᩵ r0 = l.C8058.f24861     // Catch: java.lang.Throwable -> L7a
            goto L7f
        L7a:
            r0 = move-exception
            l.ۖ۠᩵ r0 = l.C18642.m43235(r0)
        L7f:
            java.lang.Throwable r0 = l.C3825.m11584(r0)
            r12.m18435(r5, r0)
            goto La3
        L87:
            throw r5     // Catch: java.lang.Throwable -> L90
        L88:
            r2 = move-exception
            if (r4 == 0) goto L8c
            throw r5     // Catch: java.lang.Throwable -> L90
        L8c:
            l.C12934.m31440(r3, r1)     // Catch: java.lang.Throwable -> L90
            throw r2     // Catch: java.lang.Throwable -> L90
        L90:
            r1 = move-exception
            r0.getClass()     // Catch: java.lang.Throwable -> L97
            l.۠۠᩵ r0 = l.C8058.f24861     // Catch: java.lang.Throwable -> L97
            goto L9c
        L97:
            r0 = move-exception
            l.ۖ۠᩵ r0 = l.C18642.m43235(r0)
        L9c:
            java.lang.Throwable r0 = l.C3825.m11584(r0)
            r12.m18435(r1, r0)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC6790.run():void");
    }
}

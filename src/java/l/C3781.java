package l;

import android.graphics.Point;

/* compiled from: B929 */
/* renamed from: l.ۘۜܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3781 extends RuntimeException {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f11946;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f11947;

    @Override // java.lang.Throwable
    public final /* bridge */ /* synthetic */ Throwable initCause(Throwable th) {
        initCause(th);
        return this;
    }

    public C3781(Point point, String str) {
        this(null, point.x, point.y, str);
    }

    @Override // java.lang.Throwable
    public final synchronized void initCause(Throwable th) {
        super.initCause(th);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11437(C12392 c12392) {
        C19287.m44466(this.f11947, this.f11946).m44474(c12392);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3781(java.lang.String r4, int r5, int r6, java.lang.String r7) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 58
            if (r4 == 0) goto L24
            java.lang.String r2 = "["
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = "] line "
            r0.append(r4)
            r0.append(r5)
            if (r6 <= 0) goto L47
            r0.append(r1)
            int r4 = r6 + 1
            r0.append(r4)
            goto L47
        L24:
            r4 = 93
            if (r6 <= 0) goto L3c
            r2 = 91
            r0.append(r2)
            r0.append(r5)
            r0.append(r1)
            int r1 = r6 + 1
            r0.append(r1)
            r0.append(r4)
            goto L47
        L3c:
            java.lang.String r1 = "[line "
            r0.append(r1)
            r0.append(r5)
            r0.append(r4)
        L47:
            if (r7 == 0) goto L57
            boolean r4 = r7.isEmpty()
            if (r4 != 0) goto L57
            r4 = 32
            r0.append(r4)
            r0.append(r7)
        L57:
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            r3.f11947 = r5
            r3.f11946 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3781.<init>(java.lang.String, int, int, java.lang.String):void");
    }
}

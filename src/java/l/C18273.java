package l;

import android.os.Bundle;
import java.io.IOException;

/* compiled from: 78M9 */
/* renamed from: l.ᩳ᩶֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18273 extends C16134 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C8353 f56810;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15894 f56811;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f56812;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f56813;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f56814;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f56815;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f56816;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18273 m42603(IOException iOException, int i) {
        return new C18273(0, iOException, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18273 m42605(Throwable th, String str, int i, C8353 c8353, int i2, C15894 c15894, boolean z, int i3) {
        return new C18273(1, th, i3, str, i, c8353, c8353 == null ? 4 : i2, c15894, z);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18273 m42604(RuntimeException runtimeException, int i) {
        return new C18273(2, runtimeException, i);
    }

    public C18273(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18273(String str, Throwable th, int i, int i2, String str2, int i3, C8353 c8353, int i4, C15894 c15894, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        C22632.m50631(!z || i2 == 1);
        C22632.m50631(th != null || i2 == 3);
        this.f56812 = i2;
        this.f56813 = str2;
        this.f56814 = i3;
        this.f56810 = c8353;
        this.f56815 = i4;
        this.f56811 = c15894;
        this.f56816 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18273 m42606(C15894 c15894) {
        String message = getMessage();
        String str = C3603.f11424;
        return new C18273(message, getCause(), this.f49707, this.f56812, this.f56813, this.f56814, this.f56810, this.f56815, c15894, this.f49708, this.f56816);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C18273(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, l.C8353 r19, int r20, l.C15894 r21, boolean r22) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L64
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L17
            if (r4 == r0) goto Le
            java.lang.String r0 = "Unexpected runtime error"
            goto L10
        Le:
            java.lang.String r0 = "Remote error"
        L10:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6c
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            java.lang.String r3 = l.C3603.f11424
            if (r8 == 0) goto L5a
            if (r8 == r1) goto L57
            r1 = 2
            if (r8 == r1) goto L54
            if (r8 == r0) goto L51
            r0 = 4
            if (r8 != r0) goto L4b
            java.lang.String r0 = "YES"
            goto L5c
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L51:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5c
        L54:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5c
        L57:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5c
        L5a:
            java.lang.String r0 = "NO"
        L5c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6c
        L64:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = ": null"
            java.lang.String r0 = l.C16014.m37867(r0, r1)
        L79:
            r1 = r0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r12 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18273.<init>(int, java.lang.Throwable, int, java.lang.String, int, l.۠ᩴ֫, int, l.ܺۧۧ, boolean):void");
    }
}

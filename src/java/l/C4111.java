package l;

/* compiled from: 068W */
/* renamed from: l.ۘᩳܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4111 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f13062 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f13063;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final char[] f13064;

    public C4111(char[] cArr, int i) {
        this.f13064 = cArr;
        this.f13063 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[LOOP:0: B:6:0x0012->B:21:0x003d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0039 -> B:4:0x003b). Please report as a decompilation issue!!! */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String m12342() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.f13062
            char[] r2 = r6.f13064
            int r3 = r2.length
            r4 = -1
            if (r1 < r3) goto Lf
            r3 = r6
            goto L3b
        Lf:
            char r1 = r2[r1]
            r3 = r6
        L12:
            if (r1 == r4) goto L40
            r5 = 60
            if (r1 == r5) goto L40
            r5 = 62
            if (r1 == r5) goto L40
            r5 = 61
            if (r1 == r5) goto L40
            r5 = 34
            if (r1 == r5) goto L40
            r5 = 39
            if (r1 == r5) goto L40
            boolean r5 = java.lang.Character.isWhitespace(r1)
            if (r5 != 0) goto L40
            char r1 = (char) r1
            r0.append(r1)
            int r1 = r3.f13062
            int r1 = r1 + 1
            r3.f13062 = r1
            int r5 = r2.length
            if (r1 < r5) goto L3d
        L3b:
            r1 = -1
            goto L12
        L3d:
            char r1 = r2[r1]
            goto L12
        L40:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4111.m12342():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0019 -> B:4:0x001b). Please report as a decompilation issue!!! */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m12343() {
        /*
            r4 = this;
            int r0 = r4.f13062
            char[] r1 = r4.f13064
            int r2 = r1.length
            if (r0 < r2) goto L9
            r2 = r4
            goto L1b
        L9:
            char r0 = r1[r0]
            r2 = r4
        Lc:
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L20
            int r0 = r2.f13062
            int r0 = r0 + 1
            r2.f13062 = r0
            int r3 = r1.length
            if (r0 < r3) goto L1d
        L1b:
            r0 = -1
            goto Lc
        L1d:
            char r0 = r1[r0]
            goto Lc
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4111.m12343():void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m12341() {
        int i = this.f13062;
        char[] cArr = this.f13064;
        if (i >= cArr.length) {
            return -1;
        }
        this.f13062 = i + 1;
        return cArr[i];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12340() {
        return this.f13062 + this.f13063;
    }
}

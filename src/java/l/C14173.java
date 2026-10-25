package l;

/* compiled from: N12S */
/* renamed from: l.ܳ֡ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14173 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f42798;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f42799;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f42800;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f42801;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f42802;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f42803;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C14173(long r14, long r16, java.lang.String r18, java.lang.String r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r18
            r2 = r19
            r13.<init>()
            java.lang.String r3 = "folder"
            boolean r4 = r1.equals(r3)
            java.lang.String r5 = "application/vnd.android.package-archive"
            java.lang.String r6 = "application/zip"
            java.lang.String r7 = "application/x-jar"
            java.lang.String r8 = "application/vnd.android.package-archives"
            java.lang.String r9 = "zip"
            java.lang.String r10 = "apk"
            java.lang.String r11 = "."
            if (r4 == 0) goto L1f
            goto L5f
        L1f:
            java.lang.String r4 = r11.concat(r1)
            java.lang.String r4 = l.C2204.m7304(r4)
            r4.getClass()
            int r12 = r4.hashCode()
            switch(r12) {
                case -1779562856: goto L4d;
                case -1348230713: goto L44;
                case -1248325150: goto L3b;
                case 81142075: goto L32;
                default: goto L31;
            }
        L31:
            goto L56
        L32:
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L39
            goto L56
        L39:
            r4 = 3
            goto L57
        L3b:
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L42
            goto L56
        L42:
            r4 = 2
            goto L57
        L44:
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L4b
            goto L56
        L4b:
            r4 = 1
            goto L57
        L4d:
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L54
            goto L56
        L54:
            r4 = 0
            goto L57
        L56:
            r4 = -1
        L57:
            switch(r4) {
                case 0: goto L5d;
                case 1: goto L5d;
                case 2: goto L5d;
                case 3: goto L5b;
                default: goto L5a;
            }
        L5a:
            goto L5f
        L5b:
            r4 = r10
            goto L60
        L5d:
            r4 = r9
            goto L60
        L5f:
            r4 = r1
        L60:
            r0.f42802 = r4
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L69
            goto La7
        L69:
            java.lang.String r3 = r11.concat(r2)
            java.lang.String r3 = l.C2204.m7304(r3)
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1779562856: goto L97;
                case -1348230713: goto L8e;
                case -1248325150: goto L85;
                case 81142075: goto L7c;
                default: goto L7b;
            }
        L7b:
            goto La0
        L7c:
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L83
            goto La0
        L83:
            r3 = 3
            goto La1
        L85:
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L8c
            goto La0
        L8c:
            r3 = 2
            goto La1
        L8e:
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L95
            goto La0
        L95:
            r3 = 1
            goto La1
        L97:
            boolean r3 = r3.equals(r8)
            if (r3 != 0) goto L9e
            goto La0
        L9e:
            r3 = 0
            goto La1
        La0:
            r3 = -1
        La1:
            switch(r3) {
                case 0: goto La8;
                case 1: goto La8;
                case 2: goto La8;
                case 3: goto La5;
                default: goto La4;
            }
        La4:
            goto La7
        La5:
            r9 = r10
            goto La8
        La7:
            r9 = r2
        La8:
            r0.f42800 = r9
            r0.f42798 = r1
            r0.f42799 = r2
            r1 = r14
            r0.f42801 = r1
            r1 = r16
            r0.f42803 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14173.<init>(long, long, java.lang.String, java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33824(String str) {
        return str.equals(this.f42802) && str.equals(this.f42800);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33823() {
        String str = this.f42802;
        boolean equals = "zip".equals(str);
        String str2 = this.f42800;
        if (equals && "apk".equals(str2)) {
            return true;
        }
        return "apk".equals(str) && "zip".equals(str2);
    }
}

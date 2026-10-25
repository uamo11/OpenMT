package l;

import java.util.HashMap;

/* compiled from: R7TL */
/* renamed from: l.ۚᩴ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5548 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7381 f17155;

    public C5548(C1654 c1654) {
        this.f17155 = c1654.m45497();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C0608 m15690() {
        /*
            r10 = this;
            l.۟ۢۘ r0 = r10.f17155
            java.lang.String r1 = "exec"
            l.᩵᩻ۘ r0 = r0.m19869(r1)
            l.᩸᩻ۘ r0 = (l.C21907) r0
            r0.m49307()
            r1 = 0
            r0.mo22199(r1)
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> Lb3
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> Lb3
            java.io.InputStream r4 = r0.m45493()     // Catch: java.lang.Throwable -> Lb3
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lb3
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lb3
            l.֡ᩴ᩻ r3 = new l.֡ᩴ᩻     // Catch: java.lang.Throwable -> Lb3
            r3.<init>()     // Catch: java.lang.Throwable -> Lb3
            r3.f2362 = r1     // Catch: java.lang.Throwable -> Lb3
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb3
            r1.<init>()     // Catch: java.lang.Throwable -> Lb3
            r3.f2363 = r1     // Catch: java.lang.Throwable -> Lb3
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> Lb3
            r1.<init>()     // Catch: java.lang.Throwable -> Lb3
            r3.f2361 = r1     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r1 = ""
        L36:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> Lb3
            if (r4 == 0) goto Laf
            int r5 = r4.hashCode()     // Catch: java.lang.Throwable -> Lb3
            r6 = -1095948318(0xffffffffbead27e2, float:-0.3381949)
            java.lang.String r7 = "GROUP_LIST"
            java.lang.String r8 = "SYSTEM_TYPE"
            java.lang.String r9 = "USER_LIST"
            if (r5 == r6) goto L6a
            r6 = -696260880(0xffffffffd67fe6f0, float:-7.0341834E13)
            if (r5 == r6) goto L60
            r6 = -60387352(0xfffffffffc668fe8, float:-4.7885882E36)
            if (r5 == r6) goto L56
            goto L74
        L56:
            java.lang.String r5 = "===USER_LIST==="
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> Lb3
            if (r5 == 0) goto L74
            r1 = r9
            goto L36
        L60:
            java.lang.String r5 = "===SYSTEM_TYPE==="
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> Lb3
            if (r5 == 0) goto L74
            r1 = r8
            goto L36
        L6a:
            java.lang.String r5 = "===GROUP_LIST==="
            boolean r5 = r4.equals(r5)     // Catch: java.lang.Throwable -> Lb3
            if (r5 == 0) goto L74
            r1 = r7
            goto L36
        L74:
            int r5 = r1.hashCode()     // Catch: java.lang.Throwable -> Lb3
            r6 = -1139530606(0xffffffffbc142492, float:-0.009041922)
            if (r5 == r6) goto La5
            r6 = 647389002(0x26965f4a, float:1.0434169E-15)
            if (r5 == r6) goto L92
            r6 = 1796900478(0x6b1a867e, float:1.868097E26)
            if (r5 == r6) goto L88
            goto L36
        L88:
            boolean r5 = r1.equals(r7)     // Catch: java.lang.Throwable -> Lb3
            if (r5 == 0) goto L36
            m15688(r4, r3)     // Catch: java.lang.Throwable -> Lb3
            goto L36
        L92:
            boolean r5 = r1.equals(r8)     // Catch: java.lang.Throwable -> Lb3
            if (r5 == 0) goto L36
            java.lang.String r5 = "Darwin"
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> Lb3
            boolean r4 = r5.equals(r4)     // Catch: java.lang.Throwable -> Lb3
            r3.f2362 = r4     // Catch: java.lang.Throwable -> Lb3
            goto L36
        La5:
            boolean r5 = r1.equals(r9)     // Catch: java.lang.Throwable -> Lb3
            if (r5 == 0) goto L36
            m15689(r4, r3)     // Catch: java.lang.Throwable -> Lb3
            goto L36
        Laf:
            r0.m45490()
            return r3
        Lb3:
            r1 = move-exception
            r0.m45490()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5548.m15690():l.֡ᩴ᩻");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m15689(String str, C0608 c0608) {
        String trim = str.trim();
        if (trim.isEmpty() || trim.startsWith("#")) {
            return;
        }
        try {
            boolean z = c0608.f2362;
            HashMap hashMap = c0608.f2363;
            if (z) {
                String[] split = str.trim().split("\\s+");
                if (split.length >= 2) {
                    hashMap.put(split[0], Integer.valueOf(Integer.parseInt(split[1])));
                    return;
                }
                return;
            }
            String[] split2 = str.split(":");
            if (split2.length >= 3) {
                hashMap.put(split2[0], Integer.valueOf(Integer.parseInt(split2[2])));
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15688(String str, C0608 c0608) {
        if (str.trim().isEmpty()) {
            return;
        }
        try {
            boolean z = c0608.f2362;
            HashMap hashMap = c0608.f2361;
            if (z) {
                String[] split = str.trim().split("\\s+");
                if (split.length >= 2) {
                    hashMap.put(split[0], Integer.valueOf(Integer.parseInt(split[1])));
                    return;
                }
                return;
            }
            String[] split2 = str.split(":");
            if (split2.length >= 3) {
                hashMap.put(split2[0], Integer.valueOf(Integer.parseInt(split2[2])));
            }
        } catch (NumberFormatException unused) {
        }
    }
}

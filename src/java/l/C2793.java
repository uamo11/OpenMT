package l;

import java.io.File;
import java.util.regex.Pattern;

/* compiled from: 675F */
/* renamed from: l.ۖ᩸֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2793 extends C23064 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f8711 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f8710 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f8709 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static File m8629(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, C15942.m37718(sb, j2, ".v3.exo"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0073, code lost:
    
        if (r16.renameTo(r1) == false) goto L15;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C2793 m8630(java.io.File r16, long r17, long r19, l.C17609 r21) {
        /*
            r0 = r21
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L80
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = l.C2793.f8710
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L2e
            java.lang.String r1 = r2.group(r5)
            r1.getClass()
            java.lang.String r1 = l.C3603.m11046(r1)
            goto L43
        L2e:
            java.util.regex.Pattern r2 = l.C2793.f8711
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 == 0) goto L42
            java.lang.String r1 = r2.group(r5)
            r1.getClass()
            goto L43
        L42:
            r1 = r6
        L43:
            if (r1 != 0) goto L46
            goto L75
        L46:
            java.io.File r7 = r16.getParentFile()
            l.C22632.m50632(r7)
            l.֫᩸֫ r1 = r0.m41164(r1)
            int r8 = r1.f6960
            java.lang.String r1 = r2.group(r4)
            r1.getClass()
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            r1.getClass()
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = m8629(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L76
        L75:
            r1 = r6
        L76:
            if (r1 != 0) goto L79
            goto Lb6
        L79:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L83
        L80:
            r2 = r16
            r15 = r2
        L83:
            java.util.regex.Pattern r2 = l.C2793.f8709
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L90
            goto Lb6
        L90:
            java.lang.String r2 = r1.group(r5)
            r2.getClass()
            int r2 = java.lang.Integer.parseInt(r2)
            java.lang.String r8 = r0.m41159(r2)
            if (r8 != 0) goto La2
            goto Lb6
        La2:
            r9 = -1
            int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r0 != 0) goto Lae
            long r9 = r15.length()
            r11 = r9
            goto Lb0
        Lae:
            r11 = r17
        Lb0:
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 != 0) goto Lb7
        Lb6:
            return r6
        Lb7:
            java.lang.String r0 = r1.group(r4)
            r0.getClass()
            long r9 = java.lang.Long.parseLong(r0)
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r19 > r4 ? 1 : (r19 == r4 ? 0 : -1))
            if (r0 != 0) goto Ld8
            java.lang.String r0 = r1.group(r3)
            r0.getClass()
            long r0 = java.lang.Long.parseLong(r0)
            r13 = r0
            goto Lda
        Ld8:
            r13 = r19
        Lda:
            l.ۖ᩸֫ r0 = new l.ۖ᩸֫
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2793.m8630(java.io.File, long, long, l.ܿ᩸֫):l.ۖ᩸֫");
    }
}

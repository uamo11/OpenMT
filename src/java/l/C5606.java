package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: R6ZZ */
/* renamed from: l.ۚ᩷ܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5606 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17349;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f17350;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17351;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List f17352;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11459 f17353;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5606 m15902(C11459 c11459) {
        return new C5606(Collections.singletonList(c11459.pattern()), Collections.EMPTY_LIST, c11459.flags(), c11459);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5606 m15901(ArrayList arrayList, ArrayList arrayList2, int i) {
        C11459 m28259;
        if (arrayList.size() != arrayList2.size() + 1) {
            throw new IllegalArgumentException("Regex template fragments and variables differ");
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C11003.requireNonNull(next);
            arrayList3.add(next);
        }
        List unmodifiableList = C20195.unmodifiableList(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            C11003.requireNonNull(next2);
            arrayList4.add(next2);
        }
        List unmodifiableList2 = C20195.unmodifiableList(arrayList4);
        if (!unmodifiableList2.isEmpty()) {
            long size = unmodifiableList2.size() * 8;
            Iterator it3 = unmodifiableList.iterator();
            while (it3.hasNext()) {
                size += ((String) it3.next()).length();
                if (size > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                    break;
                }
            }
            if (size > ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) {
                throw new IllegalArgumentException("Dynamic regex template exceeds the size limit");
            }
        }
        if (unmodifiableList2.isEmpty()) {
            m28259 = C7017.m18954(i, (String) unmodifiableList.get(0));
        } else {
            m28259 = C11459.m28259(i, m15900(unmodifiableList, false));
            if (C11459.m28259(i, m15900(unmodifiableList, true)).matcher((CharSequence) "").groupCount() != unmodifiableList2.size() + m28259.matcher((CharSequence) "").groupCount()) {
                throw new IllegalArgumentException("var() must appear in a regex atom position");
            }
        }
        return new C5606(unmodifiableList, unmodifiableList2, i, m28259);
    }

    public C5606(List list, List list2, int i, C11459 c11459) {
        this.f17350 = list;
        this.f17352 = list2;
        this.f17349 = i;
        this.f17353 = c11459;
        this.f17351 = c11459.matcher("").groupCount();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15908(C10130 c10130) {
        c10130.mo13231(this.f17349);
        List list = this.f17352;
        c10130.mo13231(list.size());
        List list2 = this.f17350;
        int i = 0;
        c10130.m25423((CharSequence) list2.get(0));
        while (i < list.size()) {
            c10130.m25423((CharSequence) list.get(i));
            i++;
            c10130.m25423((CharSequence) list2.get(i));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11459 m15913() {
        return this.f17353;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7225 m15915() {
        return m15912() ? C7225.f22115 : this.f17353.m28264();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m15910() {
        return this.f17351;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m15912() {
        return !this.f17352.isEmpty();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m15914() {
        return this.f17352;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15905() {
        return this.f17349;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15907(StringBuilder sb) {
        int i = 0;
        boolean z = false;
        while (true) {
            List list = this.f17350;
            if (i >= list.size()) {
                break;
            }
            String str = (String) list.get(i);
            if (!str.isEmpty()) {
                if (z) {
                    sb.append(" + ");
                }
                sb.append('/');
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (charAt == '\n') {
                        sb.append("\\n");
                    } else if (charAt == '\r') {
                        sb.append("\\r");
                    } else if (charAt == '/') {
                        sb.append("\\/");
                    } else {
                        sb.append(charAt);
                    }
                }
                sb.append('/');
                z = true;
            }
            List list2 = this.f17352;
            if (i < list2.size()) {
                if (z) {
                    sb.append(" + ");
                }
                sb.append("var(\"");
                sb.append(C14020.m33622((String) list2.get(i)));
                sb.append("\")");
                z = true;
            }
            i++;
        }
        if (z) {
            return;
        }
        sb.append("/(?=)/");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m15900(List list, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append((String) list.get(0));
        for (int i = 1; i < list.size(); i++) {
            sb.append(z ? "(\\Qx\\E)" : "(?:\\Qx\\E)");
            sb.append((String) list.get(i));
        }
        return sb.toString();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m15911(CharSequence charSequence, int[] iArr, int[] iArr2) {
        return m15904(charSequence, iArr, iArr2) >= 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m15906(CharSequence charSequence, int[] iArr, int[] iArr2) {
        int i;
        int m15904 = m15904(charSequence, iArr, iArr2);
        if (m15904 < 0) {
            throw new IllegalArgumentException("Expanded regex exceeds the size limit");
        }
        StringBuilder sb = new StringBuilder(m15904);
        List list = this.f17350;
        int i2 = 0;
        sb.append((String) list.get(0));
        while (i2 < iArr2.length) {
            int i3 = iArr2[i2] << 1;
            int i4 = iArr[i3];
            int i5 = iArr[i3 + 1];
            sb.append("(?:\\Q");
            while (i4 < i5) {
                char charAt = charSequence.charAt(i4);
                if (charAt == '\\' && (i = i4 + 1) < i5 && charSequence.charAt(i) == 'E') {
                    sb.append("\\E\\\\E\\Q");
                    i4 = i;
                } else {
                    sb.append(charAt);
                }
                i4++;
            }
            sb.append("\\E)");
            i2++;
            sb.append((String) list.get(i2));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        r2 = m15899(r2, r12, "\\E)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
    
        if (r2 >= 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        r3 = r3 + 1;
        r2 = m15899(r2, r12, (java.lang.String) r0.get(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        if (r2 >= 0) goto L47;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m15909(java.lang.String r12, java.lang.CharSequence r13, int[] r14, int[] r15) {
        /*
            r11 = this;
            r11.m15903(r13, r14, r15)
            java.util.List r0 = r11.f17350
            r1 = 0
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = m15899(r1, r12, r2)
            if (r2 >= 0) goto L14
            goto L7c
        L14:
            r3 = 0
        L15:
            int r4 = r15.length
            r5 = 1
            if (r3 >= r4) goto L75
            java.lang.String r4 = "(?:\\Q"
            int r2 = m15899(r2, r12, r4)
            if (r2 >= 0) goto L22
            goto L7c
        L22:
            r4 = r15[r3]
            int r4 = r4 << r5
            r6 = r14[r4]
            int r4 = r4 + r5
            r4 = r14[r4]
        L2a:
            if (r6 >= r4) goto L5d
            char r7 = r13.charAt(r6)
            r8 = 92
            if (r7 != r8) goto L4b
            int r8 = r6 + 1
            if (r8 >= r4) goto L4b
            char r9 = r13.charAt(r8)
            r10 = 69
            if (r9 != r10) goto L4b
            java.lang.String r6 = "\\E\\\\E\\Q"
            int r2 = m15899(r2, r12, r6)
            if (r2 >= 0) goto L49
            goto L7c
        L49:
            r6 = r8
            goto L5b
        L4b:
            int r8 = r12.length()
            if (r2 >= r8) goto L7c
            int r8 = r2 + 1
            char r2 = r12.charAt(r2)
            if (r2 == r7) goto L5a
            goto L7c
        L5a:
            r2 = r8
        L5b:
            int r6 = r6 + r5
            goto L2a
        L5d:
            java.lang.String r4 = "\\E)"
            int r2 = m15899(r2, r12, r4)
            if (r2 >= 0) goto L66
            goto L7c
        L66:
            int r3 = r3 + 1
            java.lang.Object r4 = r0.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            int r2 = m15899(r2, r12, r4)
            if (r2 >= 0) goto L15
            goto L7c
        L75:
            int r12 = r12.length()
            if (r2 != r12) goto L7c
            return r5
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5606.m15909(java.lang.String, java.lang.CharSequence, int[], int[]):boolean");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m15903(CharSequence charSequence, int[] iArr, int[] iArr2) {
        if (iArr2.length != this.f17352.size() || (iArr.length & 1) != 0) {
            throw new IllegalArgumentException("Invalid regex template bindings");
        }
        for (int i : iArr2) {
            if (i < 0 || i >= iArr.length / 2) {
                throw new IllegalArgumentException("Invalid regex template binding slot");
            }
            int i2 = i << 1;
            int i3 = iArr[i2];
            int i4 = iArr[i2 + 1];
            if (i3 < 0 || i4 < i3 || i4 > charSequence.length()) {
                throw new IllegalArgumentException("Invalid regex template binding range");
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        r3 = r3 + 1;
     */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m15904(java.lang.CharSequence r12, int[] r13, int[] r14) {
        /*
            r11 = this;
            r11.m15903(r12, r13, r14)
            int r0 = r14.length
            long r0 = (long) r0
            r2 = 8
            long r2 = (long) r2
            long r0 = r0 * r2
            java.util.List r2 = r11.f17350
            java.util.Iterator r2 = r2.iterator()
        L10:
            boolean r3 = r2.hasNext()
            r4 = 4096(0x1000, double:2.0237E-320)
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.length()
            long r6 = (long) r3
            long r0 = r0 + r6
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 <= 0) goto L10
            goto L5b
        L29:
            int r2 = r14.length
            r3 = 0
        L2b:
            if (r3 >= r2) goto L64
            r6 = r14[r3]
            int r6 = r6 << 1
            r7 = r13[r6]
            int r6 = r6 + 1
            r6 = r13[r6]
            int r8 = r6 - r7
            long r8 = (long) r8
            long r0 = r0 + r8
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 <= 0) goto L40
            goto L5b
        L40:
            int r8 = r7 + 1
            if (r8 >= r6) goto L61
            char r9 = r12.charAt(r7)
            r10 = 92
            if (r9 != r10) goto L5e
            char r9 = r12.charAt(r8)
            r10 = 69
            if (r9 != r10) goto L5e
            r7 = 5
            long r9 = (long) r7
            long r0 = r0 + r9
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L5d
        L5b:
            r12 = -1
            return r12
        L5d:
            r7 = r8
        L5e:
            int r7 = r7 + 1
            goto L40
        L61:
            int r3 = r3 + 1
            goto L2b
        L64:
            int r12 = (int) r0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5606.m15904(java.lang.CharSequence, int[], int[]):int");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m15899(int i, String str, String str2) {
        int length = str2.length() + i;
        if (i < 0 || length < i || length > str.length() || !str.regionMatches(i, str2, 0, str2.length())) {
            return -1;
        }
        return length;
    }
}

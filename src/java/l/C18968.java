package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: UB7S */
/* renamed from: l.ᩴ᩵ܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18968 extends C19842 {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m43799(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public C18968(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m43802() {
        int i;
        int i2;
        boolean m45644 = m45644();
        String str = this.f64100;
        if (m45644) {
            i2 = this.f64103;
        } else {
            int i3 = this.f64103;
            int charAt = str.charAt(i3);
            if (charAt == 45) {
                charAt = m45637();
            }
            if ((charAt < 65 || charAt > 90) && ((charAt < 97 || charAt > 122) && charAt != 95)) {
                i = i3;
            } else {
                int m45637 = m45637();
                while (true) {
                    if ((m45637 < 65 || m45637 > 90) && ((m45637 < 97 || m45637 > 122) && !((m45637 >= 48 && m45637 <= 57) || m45637 == 45 || m45637 == 95))) {
                        break;
                    }
                    m45637 = m45637();
                }
                i = this.f64103;
            }
            this.f64103 = i3;
            i2 = i;
        }
        int i4 = this.f64103;
        if (i2 == i4) {
            return null;
        }
        String substring = str.substring(i4, i2);
        this.f64103 = i2;
        return substring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0435, code lost:
    
        r2 = r4.f31498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0437, code lost:
    
        if (r2 == null) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x043d, code lost:
    
        if (r2.isEmpty() == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0440, code lost:
    
        r1.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0443, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03f2  */
    /* JADX WARN: Type inference failed for: r2v10, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v12, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v16, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v17, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v18, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v19, types: [l.ۛ᩵ܺ] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v36, types: [l.֨᩵ܺ] */
    /* JADX WARN: Type inference failed for: r3v37, types: [l.֨᩵ܺ] */
    /* JADX WARN: Type inference failed for: r3v38, types: [l.֨᩵ܺ] */
    /* JADX WARN: Type inference failed for: r3v39, types: [l.֨᩵ܺ] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40, types: [l.᩶᩵ܺ] */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46, types: [l.᩹᩵ܺ] */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53, types: [l.᩹᩵ܺ] */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v65 */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v23, types: [l.᩶᩵ܺ] */
    /* JADX WARN: Type inference failed for: r5v26, types: [l.᩸᩵ܺ] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [l.֨᩵ܺ] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [l.᩵᩵ܺ] */
    /* JADX WARN: Type inference failed for: r7v7, types: [l.᩵᩵ܺ] */
    /* JADX WARN: Type inference failed for: r7v8, types: [l.᩵᩵ܺ] */
    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList m43798() {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18968.m43798():java.util.ArrayList");
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m43801() {
        int m43799;
        if (m45644()) {
            return null;
        }
        char charAt = this.f64100.charAt(this.f64103);
        if (charAt != '\'' && charAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.f64103++;
        int intValue = m45646().intValue();
        while (intValue != -1 && intValue != charAt) {
            if (intValue == 92) {
                intValue = m45646().intValue();
                if (intValue != -1) {
                    if (intValue == 10 || intValue == 13 || intValue == 12) {
                        intValue = m45646().intValue();
                    } else {
                        int m437992 = m43799(intValue);
                        if (m437992 != -1) {
                            for (int i = 1; i <= 5 && (m43799 = m43799((intValue = m45646().intValue()))) != -1; i++) {
                                m437992 = (m437992 * 16) + m43799;
                            }
                            sb.append((char) m437992);
                        }
                    }
                }
            }
            sb.append((char) intValue);
            intValue = m45646().intValue();
        }
        return sb.toString();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m43800() {
        int m43799;
        if (!m45644()) {
            int i = this.f64103;
            if (m45641("url(")) {
                m45643();
                String m43801 = m43801();
                if (m43801 == null) {
                    StringBuilder sb = new StringBuilder();
                    while (!m45644()) {
                        int i2 = this.f64103;
                        String str = this.f64100;
                        char charAt = str.charAt(i2);
                        if (charAt == '\'' || charAt == '\"' || charAt == '(' || charAt == ')' || C19842.m45635((int) charAt) || Character.isISOControl((int) charAt)) {
                            break;
                        }
                        this.f64103++;
                        if (charAt == '\\') {
                            if (!m45644()) {
                                int i3 = this.f64103;
                                this.f64103 = i3 + 1;
                                charAt = str.charAt(i3);
                                if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                    int m437992 = m43799(charAt);
                                    if (m437992 != -1) {
                                        for (int i4 = 1; i4 <= 5 && !m45644() && (m43799 = m43799(str.charAt(this.f64103))) != -1; i4++) {
                                            this.f64103++;
                                            m437992 = (m437992 * 16) + m43799;
                                        }
                                        sb.append((char) m437992);
                                    }
                                }
                            }
                        }
                        sb.append(charAt);
                    }
                    m43801 = sb.length() == 0 ? null : sb.toString();
                }
                if (m43801 == null) {
                    this.f64103 = i;
                    return null;
                }
                m45643();
                if (m45644() || m45641(MotionUtils.EASING_TYPE_FORMAT_END)) {
                    return m43801;
                }
                this.f64103 = i;
                return null;
            }
        }
        return null;
    }
}

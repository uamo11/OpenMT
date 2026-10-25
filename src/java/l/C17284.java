package l;

import com.alipay.sdk.m.n.c;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: F6QC */
/* renamed from: l.ܿۤۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17284 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Set f52964;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Set f52965;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f52966;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f52967;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f52968;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f52969 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f52970;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3463 f52971;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f52972;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final CharSequence f52973;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C23634 f52974;

    static {
        String[] strArr = {"html", "head", "body", "address", "article", "aside", "blockquote", "div", "dl", "dt", "dd", "fieldset", "figcaption", "figure", "footer", c.c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "menu", "nav", "ol", am.ax, "pre", "section", "table", "thead", "tbody", "tfoot", "tr", "td", "th", "ul", "script", "style", "title", "meta", "link", "base", "template"};
        HashSet hashSet = new HashSet(48);
        for (int i = 0; i < 48; i++) {
            String str = strArr[i];
            C11003.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f52965 = C20195.unmodifiableSet(hashSet);
        Object[] objArr = {"script", "style", "title", "meta", "link", "base", "template"};
        HashSet hashSet2 = new HashSet(7);
        for (int i2 = 0; i2 < 7; i2++) {
            Object obj = objArr[i2];
            C11003.requireNonNull(obj);
            if (!hashSet2.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f52964 = C20195.unmodifiableSet(hashSet2);
    }

    public C17284(CharSequence charSequence, C3463 c3463, C21579 c21579, boolean z) {
        String str;
        this.f52973 = charSequence;
        this.f52974 = new C23634(charSequence);
        this.f52971 = c3463;
        this.f52968 = z;
        this.f52967 = !z && c21579.m48746() == EnumC15227.READABLE;
        this.f52966 = c21579.m48746() == EnumC15227.READABLE;
        this.f52972 = C20813.m47629(charSequence);
        if (c3463.m10602()) {
            str = "\t";
        } else {
            int max = Math.max(0, c3463.m10601());
            if (max < 0) {
                throw new IllegalArgumentException(C19370.m44628(max, "count is negative: "));
            }
            if (max == 0) {
                str = "";
            } else if (max == 1) {
                str = " ";
            } else {
                if (1 > Integer.MAX_VALUE / max) {
                    throw new OutOfMemoryError(C18307.m42645(max, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(max);
                for (int i = 0; i < max; i++) {
                    sb.append(" ");
                }
                str = sb.toString();
            }
        }
        this.f52970 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40579(CharSequence charSequence, C3463 c3463, C21579 c21579, boolean z, C19012 c19012) {
        try {
            C20813.m47630();
            C17284 c17284 = new C17284(charSequence, c3463, c21579, z);
            if (c17284.m40587()) {
                c17284.m40578();
                c17284.m40585();
                c17284.m40580(c19012);
            } else {
                c19012.append(charSequence);
            }
            C20813.m47630();
        } catch (StackOverflowError e) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit", e);
        } catch (C6701 unused) {
            throw new InterruptedException("Code transformation cancelled");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b2, code lost:
    
        if (l.C20195.unmodifiableSet(r4).contains(r7) == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x028a, code lost:
    
        if (r9 == '\"') goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [l.ۡܳ֡, l.ۤ۫ۢ] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v29, types: [l.ۡܳ֡, l.ܰ۫ۢ] */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m40587() {
        /*
            Method dump skipped, instructions count: 725
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17284.m40587():boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40578() {
        C4645 c4645;
        C17990 c17990;
        C17990 c179902;
        C3234 c3234 = new C3234();
        Iterator it = this.f52969.iterator();
        while (it.hasNext()) {
            C17990 c179903 = (C17990) it.next();
            C20813.m47630();
            String str = c179903.f56116;
            int i = c179903.f56128;
            if (str == null || !c179903.f56123) {
                c4645 = null;
            } else {
                c4645 = c179903.f56121 ? c3234.m9910(str) : c3234.m9911(str, c179903.f56126, c179903.f56112, c179903);
                if (c179903.f56121 && c4645 != null) {
                    C17990 c179904 = (C17990) c4645.f14731;
                    c179904.f56130 = c179903;
                    c179903.f56115 = c179904;
                }
            }
            C4645 m9909 = (c4645 == null || c179903.f56121) ? c3234.m9909() : c4645.f14733;
            c179903.f56122 = (c4645 == null || c179903.f56121) ? c3234.m9912() : c4645.f14730;
            C17990 c179905 = m9909 != null ? (C17990) m9909.f14731 : null;
            c179903.f56109 = c179905;
            boolean z = false;
            c179903.f56113 = c4645 == null ? !(m9909 == null || m9909.f14735 == 0) : c4645.f14735 != 0;
            boolean z2 = (c4645 != null && c4645.f14737) || (m9909 != null && m9909.f14737);
            c179903.f56106 = z2;
            c179903.f56106 = z2 | (c179903.f56124 || (c179905 != null && c179905.f56106) || ((c179902 = c179903.f56115) != null && c179902.f56106));
            if (i == 8 && m40582(new C13130(c179903.f56107, c179903.f56114, this.f52973))) {
                z = true;
            }
            c179903.f56111 = z;
            if (c179903.f56116 == null && (c17990 = c179903.f56109) != null && i != 2 && i != 1 && !z) {
                c17990.f56119 = true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x01c7, code lost:
    
        if (r10.f56116.equals("style") != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0216, code lost:
    
        r22 = "Repeating ";
        r4 = "css";
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0214, code lost:
    
        if (r4.equals("text/css") != false) goto L113;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x040e A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:78:0x0371, B:81:0x0379, B:82:0x03df, B:87:0x03ef, B:89:0x03f5, B:91:0x03f9, B:92:0x03fc, B:96:0x0409, B:101:0x040e, B:105:0x0457, B:107:0x047e, B:108:0x0482, B:109:0x0417, B:112:0x0424, B:115:0x0448, B:116:0x042e, B:118:0x0438, B:119:0x043d, B:120:0x043b, B:124:0x0393, B:125:0x03aa, B:127:0x03b5, B:130:0x03be, B:131:0x03d0, B:132:0x03b9), top: B:77:0x0371 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03aa A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:78:0x0371, B:81:0x0379, B:82:0x03df, B:87:0x03ef, B:89:0x03f5, B:91:0x03f9, B:92:0x03fc, B:96:0x0409, B:101:0x040e, B:105:0x0457, B:107:0x047e, B:108:0x0482, B:109:0x0417, B:112:0x0424, B:115:0x0448, B:116:0x042e, B:118:0x0438, B:119:0x043d, B:120:0x043b, B:124:0x0393, B:125:0x03aa, B:127:0x03b5, B:130:0x03be, B:131:0x03d0, B:132:0x03b9), top: B:77:0x0371 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03f9 A[Catch: all -> 0x0489, TryCatch #0 {all -> 0x0489, blocks: (B:78:0x0371, B:81:0x0379, B:82:0x03df, B:87:0x03ef, B:89:0x03f5, B:91:0x03f9, B:92:0x03fc, B:96:0x0409, B:101:0x040e, B:105:0x0457, B:107:0x047e, B:108:0x0482, B:109:0x0417, B:112:0x0424, B:115:0x0448, B:116:0x042e, B:118:0x0438, B:119:0x043d, B:120:0x043b, B:124:0x0393, B:125:0x03aa, B:127:0x03b5, B:130:0x03be, B:131:0x03d0, B:132:0x03b9), top: B:77:0x0371 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0408  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m40580(l.C19012 r31) {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17284.m40580(l.ᩴ᩷ܿ):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x01b5, code lost:
    
        if (l.C20195.unmodifiableSet(r7).contains(r6) != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01c3, code lost:
    
        if (r6.equals("li") != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01d3, code lost:
    
        if (r4.equals("dd") != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01e9, code lost:
    
        if (r4.equals("option") == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01ef, code lost:
    
        if (r6.equals("option") == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01f5, code lost:
    
        if (r6.equals("optgroup") == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x01fb, code lost:
    
        if (r4.equals("optgroup") == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0201, code lost:
    
        if (r6.equals("optgroup") == false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0209, code lost:
    
        if (r4.equals("tr") == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x020f, code lost:
    
        if (r6.equals("tr") == false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0219, code lost:
    
        if (r4.equals("td") == false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x021f, code lost:
    
        if (r4.equals("th") == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0237, code lost:
    
        if (r4.equals("thead") == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x023d, code lost:
    
        if (r4.equals("tbody") == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0243, code lost:
    
        if (r4.equals("tfoot") == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0249, code lost:
    
        if (r6.equals("tbody") == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x024f, code lost:
    
        if (r6.equals("tfoot") == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0225, code lost:
    
        if (r6.equals("td") == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x022b, code lost:
    
        if (r6.equals("th") == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01df, code lost:
    
        if (r6.equals("dd") != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00de, code lost:
    
        if (m40583(r2) != false) goto L215;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m40585() {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17284.m40585():void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m40586(C17990 c17990) {
        int i;
        C17990 c179902 = c17990.f56121 ? c17990.f56115 : c17990;
        String str = c17990.f56116;
        return (str != null && c17990.f56129 && f52965.contains(str) && (!f52964.contains(c17990.f56116) || (c179902 != null && c179902.f56117 == 1))) || ((i = c17990.f56128) == 2 && c17990.f56117 == 1) || (i == 4 && m40583(c17990));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40583(C17990 c17990) {
        int i;
        int i2 = c17990.f56107;
        if (c17990.f56128 != 4) {
            return false;
        }
        CharSequence charSequence = this.f52973;
        return C2732.m8477(charSequence, true, i2, "<!doctype", 9) && (i = c17990.f56114) > i2 + 9 && charSequence.charAt(i - 1) == '>';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40581(int i) {
        ArrayList arrayList = this.f52969;
        int i2 = ((C17990) arrayList.get(i)).f56117;
        return i2 == 1 || (i2 == 2 && i > 0 && ((C17990) arrayList.get(i - 1)).f56111);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40584(C19012 c19012, boolean z) {
        int length = z ? 0 : c19012.length() - 1;
        while (length >= 0 && length < c19012.length()) {
            char charAt = c19012.charAt(length);
            if (charAt == '\r' || charAt == '\n') {
                return true;
            }
            if (!AbstractC12406.m30574(charAt)) {
                break;
            }
            length += z ? 1 : -1;
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40582(C13130 c13130) {
        for (int i = 0; i < c13130.length(); i++) {
            if ((i & 1023) == 0) {
                C20813.m47630();
            }
            if (!AbstractC12406.m30574(c13130.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}

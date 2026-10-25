package l;

import com.alipay.sdk.m.u0.b;
import com.alipay.sdk.m.y.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: 99OR */
/* renamed from: l.ۖ֡ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2172 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f7167;

    static {
        char[] cArr = new char[80];
        f7167 = cArr;
        Arrays.fill(cArr, ' ');
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m7185(AbstractC21760 abstractC21760, String str) {
        StringBuilder m19190 = C7166.m19190("# ", str);
        m7188(abstractC21760, m19190, 0);
        return m19190.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x018e, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ea, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a0, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01b6, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L99;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m7188(l.AbstractC21760 r19, java.lang.StringBuilder r20, int r21) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2172.m7188(l.᩸ᩴۖ, java.lang.StringBuilder, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7187(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                m7187(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m7187(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        m7186(sb, i);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(C1487.m5147(AbstractC5886.m16491((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC5886) {
            sb.append(": \"");
            sb.append(C1487.m5147((AbstractC5886) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC21760) {
            sb.append(" {");
            m7188((AbstractC21760) obj, sb, i + 2);
            sb.append("\n");
            m7186(sb, i);
            sb.append(l.d);
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            m7187(sb, i3, "key", entry.getKey());
            m7187(sb, i3, b.d, entry.getValue());
            sb.append("\n");
            m7186(sb, i);
            sb.append(l.d);
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7186(StringBuilder sb, int i) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(f7167, 0, i2);
            i -= i2;
        }
    }
}

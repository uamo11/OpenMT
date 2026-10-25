package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import java.util.ArrayList;

/* compiled from: CAOF */
/* renamed from: l.֡ܽܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C0539 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f2205 = new ArrayList();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f2206 = new ArrayList();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f2207;

    public C0539(String str) {
        this.f2207 = str;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo2276(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(a.h);
        char c = str2.indexOf(34) != -1 ? '\'' : '\"';
        sb.append(c);
        m2274(c, str2, sb);
        sb.append(c);
        this.f2205.add(sb.toString());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo2278(C0539 c0539) {
        this.f2206.add(c0539);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2274(int i, String str, StringBuilder sb) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\t' || charAt == '\n') {
                if (i == -1) {
                    sb.append(charAt);
                } else {
                    sb.append("&#");
                    sb.append((int) charAt);
                    sb.append(';');
                }
            } else if (charAt != '\r') {
                if (charAt != '\"') {
                    if (charAt == '<') {
                        sb.append("&lt;");
                    } else if (charAt == '>') {
                        sb.append("&gt;");
                    } else if (charAt == '&') {
                        sb.append("&amp;");
                    } else if (charAt != '\'') {
                        if (charAt >= ' ' && charAt < 127) {
                            sb.append(charAt);
                        } else if (C10753.m26952(charAt)) {
                            sb.append(charAt);
                        } else {
                            sb.append("&#");
                            sb.append((int) charAt);
                            sb.append(l.b);
                        }
                    }
                }
                if (charAt == i) {
                    sb.append(charAt == '\"' ? "&quot;" : "&apos;");
                } else {
                    sb.append(charAt);
                }
            } else {
                sb.append("&#");
                sb.append((int) charAt);
                sb.append(';');
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        mo2277(sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo2277(java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0539.mo2277(java.lang.StringBuilder, int):void");
    }
}

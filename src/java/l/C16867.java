package l;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: TBJQ */
/* renamed from: l.ܽ᩶ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16867 extends AbstractC14750 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Logger f51755 = Logger.getLogger("SvgLeafNode");

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2051 f51756;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C2051 f51757;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f51758;

    @Override // l.AbstractC14750
    /* renamed from: ۧ */
    public final boolean mo6737() {
        return false;
    }

    @Override // l.AbstractC14750
    /* renamed from: ֫ */
    public final AbstractC14750 mo6729() {
        C16867 c16867 = new C16867(this.f45039, this.f45035, this.f45038);
        c16867.m35053(this.f45037);
        c16867.f45036 = (C0639) this.f45036.clone();
        c16867.f51758 = this.f51758;
        return c16867;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private double m39641(String str) {
        double parseDouble;
        String str2 = (String) this.f45037.get(str);
        if (str2 != null) {
            try {
                if (str2.endsWith("%")) {
                    parseDouble = Double.parseDouble(str2.substring(0, str2.length() - 1)) / 100.0d;
                } else {
                    parseDouble = Double.parseDouble(str2);
                }
            } catch (NumberFormatException unused) {
            }
            return Math.min(Math.max(parseDouble, 0.0d), 1.0d);
        }
        parseDouble = 1.0d;
        return Math.min(Math.max(parseDouble, 0.0d), 1.0d);
    }

    @Override // l.AbstractC14750
    /* renamed from: ֫ */
    public final void mo6731(String str) {
        Level level = Level.FINE;
        StringBuilder m15339 = C5368.m15339(str);
        String str2 = this.f51758;
        if (str2 == null) {
            str2 = " null pathData ";
        }
        m15339.append(str2);
        String str3 = this.f45038;
        if (str3 == null) {
            str3 = " null name ";
        }
        m15339.append(str3);
        f51755.log(level, m15339.toString());
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m39642(String str) {
        this.f51758 = str;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m39643() {
        return this.f51758;
    }

    @Override // l.AbstractC14750
    /* renamed from: ۧ */
    public final void mo6736(C0639 c0639) {
        String str = this.f51758;
        if (str == null || str.isEmpty()) {
            return;
        }
        C2757[] m30961 = C12697.m30961(this.f51758, EnumC13402.SVG);
        C0639 c06392 = this.f45040;
        c06392.m2611(c0639);
        boolean m8518 = C2757.m8518(m30961);
        if (!c06392.m2617() || m8518) {
            C2757.m8516(c06392, m30961);
        }
        this.f51758 = C2757.m8514(m30961, this.f45039);
    }

    @Override // l.AbstractC14750
    /* renamed from: ֫ */
    public final void mo6733(C0639 c0639) {
        String str;
        C0639 c06392 = this.f45040;
        c06392.m2616(c0639);
        c06392.m2606(this.f45036);
        HashMap hashMap = this.f45037;
        if ("non-scaling-stroke".equals(hashMap.get("vector-effect")) || (c06392.m2614() & 6) == 0 || (str = (String) hashMap.get("stroke-width")) == null) {
            return;
        }
        try {
            double parseDouble = Double.parseDouble(str);
            double m2601 = c06392.m2601();
            if (m2601 != 0.0d) {
                hashMap.put("stroke-width", this.f45039.m24847(parseDouble * Math.sqrt(Math.abs(m2601))));
            }
            if ((c06392.m2614() & 4) != 0) {
                m35055("Scaling of the stroke width is approximate");
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018e A[SYNTHETIC] */
    @Override // l.AbstractC14750
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6730(java.io.OutputStreamWriter r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16867.mo6730(java.io.OutputStreamWriter, java.lang.String):void");
    }
}

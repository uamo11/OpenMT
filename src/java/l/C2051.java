package l;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.Element;

/* compiled from: BBKQ */
/* renamed from: l.֫᩶ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2051 extends AbstractC14750 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final AbstractC9608 f6850;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Logger f6851 = Logger.getLogger("SvgGroupNode");

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public RectF f6852;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6853;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C16867 f6854;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC7758 f6855;

    @Override // l.AbstractC14750
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6736(C0639 c0639) {
    }

    @Override // l.AbstractC14750
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo6737() {
        return false;
    }

    static {
        C6785 m24537 = AbstractC9608.m24537();
        m24537.mo18428("x1", 0);
        m24537.mo18428("y1", 1);
        m24537.mo18428("x2", 2);
        m24537.mo18428("y2", 3);
        f6850 = m24537.mo18429();
    }

    public C2051(C9813 c9813, Element element, String str) {
        super(c9813, element, str);
        this.f6853 = new ArrayList();
        this.f6852 = new RectF();
    }

    @Override // l.AbstractC14750
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2051 mo6729() {
        C2051 c2051 = new C2051(this.f45039, this.f45035, this.f45038);
        c2051.m35053(this.f45037);
        c2051.f45036 = (C0639) this.f45036.clone();
        Iterator it = this.f6853.iterator();
        while (it.hasNext()) {
            C2820 c2820 = (C2820) it.next();
            c2051.m6732(c2820.m8703(), c2820.m8705(), c2820.m8706());
        }
        return c2051;
    }

    @Override // l.AbstractC14750
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6731(String str) {
        Level level = Level.FINE;
        StringBuilder m19190 = C7166.m19190(str, "current gradient is :");
        m19190.append(this.f45038);
        f6851.log(level, m19190.toString());
    }

    @Override // l.AbstractC14750
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6733(C0639 c0639) {
        C0639 c06392 = this.f45040;
        c06392.m2616(c0639);
        c06392.m2606(this.f45036);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C14107 m6728(String str, double d) {
        HashMap hashMap = this.f45037;
        boolean z = false;
        if (!hashMap.containsKey(str)) {
            return new C14107(d, false);
        }
        String trim = ((String) hashMap.get(str)).trim();
        if (str.equals("r") && trim.startsWith("-")) {
            return new C14107(d, false);
        }
        try {
            if (trim.endsWith("%")) {
                d = Double.parseDouble(trim.substring(0, trim.length() - 1)) / 100.0d;
                z = true;
            } else {
                d = Double.parseDouble(trim);
            }
        } catch (NumberFormatException unused) {
            m35054("Unsupported coordinate value");
        }
        return new C14107(d, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0302  */
    @Override // l.AbstractC14750
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6730(java.io.OutputStreamWriter r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2051.mo6730(java.io.OutputStreamWriter, java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6732(String str, String str2, String str3) {
        C2820 c2820 = new C2820(str, str2);
        c2820.m8704(str3);
        this.f6853.add(c2820);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6734(EnumC7758 enumC7758) {
        this.f6855 = enumC7758;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6735(C16867 c16867) {
        this.f6854 = c16867;
    }
}

package l;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: T8TO */
/* renamed from: l.᩷᩵ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21083 implements InterfaceC9773 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f67997 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f67998 = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f68001 = new StringBuilder();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f68000 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f67999 = new C17714();

    @Override // l.InterfaceC9773
    public final /* synthetic */ void reset() {
    }

    @Override // l.InterfaceC9773
    /* renamed from: ֫ */
    public final /* synthetic */ InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        return C14710.m35002(this, bArr, i2);
    }

    @Override // l.InterfaceC9773
    /* renamed from: ֫ */
    public final void mo6618(byte[] bArr, int i, int i2, C21062 c21062, InterfaceC23483 interfaceC23483) {
        InterfaceC23483 interfaceC234832;
        String str;
        C21083 c21083 = this;
        InterfaceC23483 interfaceC234833 = interfaceC23483;
        long j = c21062.f67934;
        C17714 c17714 = c21083.f67999;
        c17714.m41462(i + i2, bArr);
        c17714.m41484(i);
        Charset m41475 = c17714.m41475();
        if (m41475 == null) {
            m41475 = StandardCharsets.UTF_8;
        }
        ArrayList arrayList = (j == -9223372036854775807L || !c21062.f67933) ? null : new ArrayList();
        while (true) {
            String m41474 = c17714.m41474(m41475);
            if (m41474 == null) {
                break;
            }
            if (m41474.isEmpty()) {
                interfaceC234832 = interfaceC234833;
            } else {
                try {
                    Integer.parseInt(m41474);
                    String m414742 = c17714.m41474(m41475);
                    if (m414742 == null) {
                        C19956.m46037("Unexpected end");
                        break;
                    }
                    Matcher matcher = f67997.matcher(m414742);
                    if (matcher.matches()) {
                        long m47982 = m47982(matcher, 1);
                        long m479822 = m47982(matcher, 6);
                        StringBuilder sb = c21083.f68001;
                        sb.setLength(0);
                        ArrayList arrayList2 = c21083.f68000;
                        arrayList2.clear();
                        for (String m414743 = c17714.m41474(m41475); !TextUtils.isEmpty(m414743); m414743 = c17714.m41474(m41475)) {
                            if (sb.length() > 0) {
                                sb.append("<br>");
                            }
                            String trim = m414743.trim();
                            StringBuilder sb2 = new StringBuilder(trim);
                            Matcher matcher2 = f67998.matcher(trim);
                            int i3 = 0;
                            while (matcher2.find()) {
                                String group = matcher2.group();
                                arrayList2.add(group);
                                Matcher matcher3 = matcher2;
                                int start = matcher2.start() - i3;
                                int length = group.length();
                                sb2.replace(start, start + length, "");
                                i3 += length;
                                matcher2 = matcher3;
                                m47982 = m47982;
                            }
                            sb.append(sb2.toString());
                        }
                        long j2 = m47982;
                        Spanned fromHtml = Html.fromHtml(sb.toString());
                        int i4 = 0;
                        while (true) {
                            if (i4 >= arrayList2.size()) {
                                str = null;
                                break;
                            }
                            str = (String) arrayList2.get(i4);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (j == -9223372036854775807L || m479822 >= j) {
                            C12866 c12866 = new C12866(j2, m479822 - j2, AbstractC14545.of((Object) m47983(fromHtml, str)));
                            interfaceC234832 = interfaceC23483;
                            interfaceC234832.accept(c12866);
                        } else {
                            if (arrayList != null) {
                                arrayList.add(new C12866(j2, m479822 - j2, AbstractC14545.of((Object) m47983(fromHtml, str))));
                            }
                            interfaceC234832 = interfaceC23483;
                        }
                    } else {
                        interfaceC234832 = interfaceC234833;
                        C19956.m46037("Skipping invalid timing: ".concat(m414742));
                    }
                } catch (NumberFormatException unused) {
                    interfaceC234832 = interfaceC234833;
                    C19956.m46037("Skipping invalid index: ".concat(m41474));
                }
            }
            interfaceC234833 = interfaceC234832;
            c21083 = this;
        }
        InterfaceC23483 interfaceC234834 = interfaceC234833;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                interfaceC234834.accept((C12866) it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
    
        r0.m49393(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        if (r14.equals("{\\an9}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0087, code lost:
    
        r0.m49386(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
    
        if (r14.equals("{\\an8}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r14.equals("{\\an7}") != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009b, code lost:
    
        if (r14.equals("{\\an3}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ab, code lost:
    
        r0.m49386(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        if (r14.equals("{\\an2}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a9, code lost:
    
        if (r14.equals("{\\an1}") != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x003b, code lost:
    
        if (r14.equals("{\\an7}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0064, code lost:
    
        r0.m49393(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0042, code lost:
    
        if (r14.equals("{\\an6}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x004d, code lost:
    
        if (r14.equals("{\\an4}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0054, code lost:
    
        if (r14.equals("{\\an3}") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0062, code lost:
    
        if (r14.equals("{\\an1}") != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (r14.equals("{\\an9}") != false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C19811 m47983(android.text.Spanned r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C21083.m47983(android.text.Spanned, java.lang.String):l.᩶֡֫");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m47982(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }
}

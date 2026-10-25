package l;

import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: 6ASH */
/* renamed from: l.ۨۜ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11528 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5883 f34415;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8225 f34416;

    public C11528(C5883 c5883, InterfaceC8225 interfaceC8225) {
        this.f34415 = c5883;
        this.f34416 = interfaceC8225;
    }

    public final String toString() {
        if (this.f34415.f18066 != null) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList(this.f34415.f18065.keySet());
            Collections.sort(arrayList, new C10117());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C13643 c13643 = (C13643) it.next();
                C13643[] c13643Arr = c13643.f40685;
                int length = c13643Arr != null ? c13643Arr.length : 0;
                for (int i = 0; i < length; i++) {
                    C13643 c136432 = c13643.f40685[i];
                    if (c136432 != null && c136432.f40684 != Integer.MAX_VALUE) {
                        sb.append(m28367(c13643));
                        String m36283 = ((C15279) this.f34416).m36283(i - 1);
                        sb.append("-");
                        sb.append(m36283);
                        sb.append("->");
                        sb.append(m28367(c136432));
                        sb.append('\n');
                    }
                }
            }
            String sb2 = sb.toString();
            if (sb2.length() != 0) {
                return sb2;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m28367(C13643 c13643) {
        int i = c13643.f40684;
        StringBuilder sb = new StringBuilder();
        sb.append(c13643.f40687 ? ":" : "");
        sb.append(am.aB);
        sb.append(i);
        sb.append(c13643.f40690 ? "^" : "");
        String sb2 = sb.toString();
        if (!c13643.f40687) {
            return sb2;
        }
        if (c13643.f40688 != null) {
            StringBuilder m19190 = C7166.m19190(sb2, "=>");
            m19190.append(Arrays.toString(c13643.f40688));
            return m19190.toString();
        }
        StringBuilder m191902 = C7166.m19190(sb2, "=>");
        m191902.append(c13643.f40686);
        return m191902.toString();
    }
}

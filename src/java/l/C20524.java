package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: J8S4 */
/* renamed from: l.᩷֡ۧ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20524 implements InterfaceC18553 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f66132;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f66133;

    public C20524(int i) {
        this(i, AbstractC14545.of());
    }

    public C20524(int i, List list) {
        this.f66133 = i;
        this.f66132 = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.InterfaceC0207 m47012(int r6, l.C3736 r7) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20524.m47012(int, l.ۘۚۧ):l.֡ۚۧ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private List m47010(C3736 c3736) {
        String str;
        int i;
        List list;
        boolean m47011 = m47011(32);
        List list2 = this.f66132;
        if (m47011) {
            return list2;
        }
        C17714 c17714 = new C17714(c3736.f11805);
        while (c17714.m41457() > 0) {
            int m41456 = c17714.m41456();
            int m41485 = c17714.m41485() + c17714.m41456();
            if (m41456 == 134) {
                ArrayList arrayList = new ArrayList();
                int m414562 = c17714.m41456() & 31;
                for (int i2 = 0; i2 < m414562; i2++) {
                    String m41459 = c17714.m41459(3, StandardCharsets.UTF_8);
                    int m414563 = c17714.m41456();
                    boolean z = (m414563 & 128) != 0;
                    if (z) {
                        i = m414563 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte m414564 = (byte) c17714.m41456();
                    c17714.m41478(1);
                    if (z) {
                        boolean z2 = (m414564 & 64) != 0;
                        int i3 = C17839.f54488;
                        list = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    C1297 c1297 = new C1297();
                    c1297.m4465(str);
                    c1297.m4471(m41459);
                    c1297.m4442(i);
                    c1297.m4446(list);
                    arrayList.add(c1297.m4440());
                }
                list2 = arrayList;
            }
            c17714.m41484(m41485);
        }
        return list2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m47011(int i) {
        return (i & this.f66133) != 0;
    }
}

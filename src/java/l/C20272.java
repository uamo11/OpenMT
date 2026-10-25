package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: U8JQ */
/* renamed from: l.᩶ܺۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20272 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f65515;

    public C20272(ArrayList arrayList) {
        this.f65515 = C20195.unmodifiableList(arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20272 m46529(C17714 c17714) {
        c17714.m41479();
        boolean z = (c17714.m41456() & 128) != 0;
        ArrayList arrayList = new ArrayList();
        if (!z) {
            int m41456 = c17714.m41456();
            boolean z2 = (m41456 & 64) != 0;
            boolean z3 = (m41456 & 32) != 0;
            if (z2) {
                c17714.m41479();
            }
            if (!z2) {
                int m414562 = c17714.m41456();
                arrayList = new ArrayList(m414562);
                for (int i = 0; i < m414562; i++) {
                    c17714.m41456();
                    c17714.m41479();
                    arrayList.add(new C22388());
                }
            }
            if (z3) {
                c17714.m41456();
                c17714.m41479();
            }
            c17714.m41464();
            c17714.m41456();
            c17714.m41456();
        }
        return new C20272(arrayList);
    }
}

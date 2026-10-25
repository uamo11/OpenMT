package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: U8JQ */
/* renamed from: l.ۙܺۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4749 extends AbstractC5455 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f15061;

    public C4749(ArrayList arrayList) {
        this.f15061 = C20195.unmodifiableList(arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4749 m13897(C17714 c17714) {
        int m41456 = c17714.m41456();
        ArrayList arrayList = new ArrayList(m41456);
        for (int i = 0; i < m41456; i++) {
            arrayList.add(C20272.m46529(c17714));
        }
        return new C4749(arrayList);
    }
}

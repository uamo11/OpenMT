package l;

import java.util.Comparator;

/* compiled from: G7AI */
/* renamed from: l.ۖܽۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2650 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String m8426 = C2692.m8426((InterfaceC7099) obj);
        String m84262 = C2692.m8426((InterfaceC7099) obj2);
        if (m8426.equals(m84262)) {
            return 0;
        }
        if ("default".equals(m8426)) {
            return -1;
        }
        if ("default".equals(m84262)) {
            return 1;
        }
        return m8426.compareTo(m84262);
    }
}

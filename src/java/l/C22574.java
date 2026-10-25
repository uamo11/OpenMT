package l;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: S403 */
@InterfaceC4914(EnumC3503.RELEASE_6)
/* renamed from: l.᩹᩹۠, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22574 extends AbstractC8463 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m50558(List list, Object obj) {
        Iterator it = list.iterator();
        Set set = null;
        while (it.hasNext()) {
            set = ((C9770) this).m24774((InterfaceC11970) it.next(), (Set) obj);
        }
        return set;
    }

    @Override // l.AbstractC8463
    /* renamed from: ֫ */
    public final Object mo10388(C4287 c4287, Object obj) {
        return m50558(c4287.mo958(), obj);
    }
}

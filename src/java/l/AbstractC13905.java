package l;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: N673 */
/* renamed from: l.ܰܶᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC13905 {
    public static final C17022 a;

    static {
        EnumC12995 enumC12995 = EnumC12995.OWNER_READ;
        EnumC12995 enumC129952 = EnumC12995.OWNER_WRITE;
        HashSet hashSet = new HashSet(EnumSet.of(enumC12995, enumC129952));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((EnumC12995) it.next()).getClass();
        }
        a = new C17022(4, hashSet);
        HashSet hashSet2 = new HashSet(EnumSet.of(enumC12995, enumC129952, EnumC12995.OWNER_EXECUTE));
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            ((EnumC12995) it2.next()).getClass();
        }
        new C17022(4, hashSet2);
    }
}

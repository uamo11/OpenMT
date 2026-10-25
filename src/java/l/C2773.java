package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: M9PM */
/* renamed from: l.ۖ᩷ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2773 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f8643 = new ConcurrentMapC10942();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f8641 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Stack f8644 = new Stack();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f8642 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m8570(C17757 c17757) {
        Boolean bool = (Boolean) this.f8643.get(c17757);
        if (bool != null) {
            return bool.booleanValue();
        }
        synchronized (this) {
            Boolean bool2 = (Boolean) this.f8643.get(c17757);
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            return m8569(c17757).f27637.f49830;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C9123 m8569(C17757 c17757) {
        C9123 c9123;
        ArrayList arrayList;
        boolean z;
        C16177 c16177;
        int i = this.f8641;
        this.f8641 = i + 1;
        C9123 c91232 = new C9123(c17757, i);
        Stack stack = this.f8644;
        stack.push(c91232);
        HashMap hashMap = this.f8642;
        hashMap.put(c17757, c91232);
        for (C0117 c0117 : c17757.getFields()) {
            if (c0117.m1138() == EnumC18463.MESSAGE) {
                C9123 c91233 = (C9123) hashMap.get(c0117.m1147());
                if (c91233 == null) {
                    c91232.f27640 = Math.min(c91232.f27640, m8569(c0117.m1147()).f27640);
                } else if (c91233.f27637 == null) {
                    c91232.f27640 = Math.min(c91232.f27640, c91233.f27640);
                }
            }
        }
        if (c91232.f27639 == c91232.f27640) {
            C16177 c161772 = new C16177();
            do {
                c9123 = (C9123) stack.pop();
                c9123.f27637 = c161772;
                C17757 c177572 = c9123.f27638;
                arrayList = c161772.f49829;
                arrayList.add(c177572);
            } while (c9123 != c91232);
            Iterator it = arrayList.iterator();
            loop2: while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                C17757 c177573 = (C17757) it.next();
                z = true;
                if (c177573.m41598()) {
                    break;
                }
                for (C0117 c01172 : c177573.getFields()) {
                    if (c01172.m1128() || (c01172.m1138() == EnumC18463.MESSAGE && (c16177 = ((C9123) hashMap.get(c01172.m1147())).f27637) != c161772 && c16177.f49830)) {
                        break loop2;
                    }
                }
            }
            c161772.f49830 = z;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.f8643.put((C17757) it2.next(), Boolean.valueOf(c161772.f49830));
            }
        }
        return c91232;
    }
}

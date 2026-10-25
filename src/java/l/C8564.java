package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: 27RL */
/* renamed from: l.ۡ֫ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8564 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList, java.util.List] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9270 m22277(InterfaceC13206 interfaceC13206, EnumC20559 enumC20559) {
        ArrayDeque arrayDeque = new ArrayDeque();
        InterfaceC13206 m22278 = m22278(arrayDeque, interfaceC13206);
        if (enumC20559 == EnumC20559.YES) {
            Iterator it = arrayDeque.iterator();
            int i = -1;
            int i2 = -1;
            int i3 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List list = (List) it.next();
                if (!list.isEmpty()) {
                    AbstractC5144 abstractC5144 = (AbstractC5144) list.get(0);
                    abstractC5144.getClass();
                    int m19455 = C7260.m19455(abstractC5144);
                    if (m19455 < i) {
                        ?? arrayList = new ArrayList(arrayDeque);
                        Collections.rotate(arrayList, -(i2 + 1));
                        arrayDeque = arrayList;
                        break;
                    }
                    i2 = i3;
                    i = m19455;
                }
                i3++;
            }
        }
        return new C9270(m22278, AbstractC14545.m34730(arrayDeque));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC13206 m22278(ArrayDeque arrayDeque, InterfaceC13206 interfaceC13206) {
        int i = C6447.f19933[interfaceC13206.mo987().ordinal()];
        if (i == 1) {
            return m22278(arrayDeque, ((InterfaceC7378) interfaceC13206).getType());
        }
        if (i == 2) {
            InterfaceC11612 interfaceC11612 = (InterfaceC11612) interfaceC13206;
            if (interfaceC11612.mo28509().mo987() == EnumC3329.ARRAY_TYPE) {
                InterfaceC13206 m22278 = m22278(arrayDeque, interfaceC11612.mo28509());
                arrayDeque.addFirst(AbstractC14545.copyOf((Collection) interfaceC11612.getAnnotations()));
                return m22278;
            }
        }
        return interfaceC13206;
    }
}

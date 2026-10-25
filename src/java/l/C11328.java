package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: Q1JW */
/* renamed from: l.ۧ᩻ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11328 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f33901;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27984() {
        return m27980(this.f33901);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m27987() {
        return C20195.unmodifiableList(this.f33901);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27980(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C7527 c7527 = (C7527) it.next();
            if (c7527.m20189()) {
                if (c7527.m20175()) {
                    i++;
                }
            } else {
                i += m27980(c7527.f23154);
            }
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27985(HashSet hashSet) {
        m27981(hashSet, this.f33901);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27981(HashSet hashSet, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7527 c7527 = (C7527) it.next();
            if (c7527.m20189()) {
                if (c7527.m20175()) {
                    hashSet.add(c7527.f23157);
                }
            } else {
                m27981(hashSet, c7527.f23154);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27988() {
        m27983(this.f33901);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27983(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7527 c7527 = (C7527) it.next();
            boolean m20189 = c7527.m20189();
            ArrayList arrayList = c7527.f23154;
            if (m20189) {
                if (c7527.m20175()) {
                    it.remove();
                }
            } else {
                m27983(arrayList);
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27986(InterfaceC2155 interfaceC2155) {
        m27982(interfaceC2155, this.f33901);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27982(InterfaceC2155 interfaceC2155, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C7527 c7527 = (C7527) it.next();
            boolean mo7114 = interfaceC2155.mo7114();
            if (mo7114) {
                interfaceC2155.mo7113(c7527);
            }
            if (!c7527.m20189()) {
                m27982(interfaceC2155, c7527.f23154);
            }
            if (!mo7114) {
                interfaceC2155.mo7113(c7527);
            }
        }
    }
}

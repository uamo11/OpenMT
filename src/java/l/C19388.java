package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: C1Y4 */
/* renamed from: l.᩵ۢᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19388 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17249 f62748;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashSet f62751 = new HashSet();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ArrayList f62750 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashSet f62747 = new HashSet();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f62749 = 0;

    public C19388(C17249 c17249) {
        this.f62748 = c17249;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44656(C1032 c1032) {
        m44653(c1032, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44653(InterfaceC5471 interfaceC5471, int i) {
        C1032 c1032;
        String obj = interfaceC5471.toString();
        HashSet hashSet = this.f62751;
        if (hashSet.contains(obj)) {
            return;
        }
        hashSet.add(obj);
        this.f62750.add(interfaceC5471);
        if (interfaceC5471.getName().equals("<clinit>")) {
            this.f62747.add(interfaceC5471.mo3566());
        }
        C0657 c0657 = (C0657) this.f62748.f52880.get(interfaceC5471.mo3566());
        if (c0657 == null) {
            return;
        }
        if (i > this.f62749) {
            this.f62749 = i;
        }
        if (!interfaceC5471.getName().equals("<clinit>")) {
            m44651(c0657, i);
        }
        Iterator it = c0657.getMethods().iterator();
        while (true) {
            if (!it.hasNext()) {
                c1032 = null;
                break;
            }
            c1032 = (C1032) it.next();
            if (c1032.equals(interfaceC5471)) {
                InterfaceC19150 mo3570 = c1032.mo3570();
                if (mo3570 != null) {
                    for (InterfaceC22677 interfaceC22677 : mo3570.mo3817()) {
                        int i2 = interfaceC22677.mo3975().f3318;
                        if (i2 == 1) {
                            m44650(i + 1, ((InterfaceC21699) ((InterfaceC10952) interfaceC22677).getReference()).getType());
                        } else if (i2 == 2) {
                            m44650(i + 1, ((InterfaceC18877) ((InterfaceC10952) interfaceC22677).getReference()).mo8192());
                        } else if (i2 == 3) {
                            m44653((InterfaceC5471) ((InterfaceC10952) interfaceC22677).getReference(), i + 1);
                        }
                    }
                }
            }
        }
        if (c1032 == null || !(EnumC15657.STATIC.m36866(c1032.mo3567()) || EnumC15657.PRIVATE.m36866(c1032.mo3567()))) {
            String m34249 = C14354.m34249(interfaceC5471, true);
            m44652(c0657, m34249, i);
            m44654(c0657, m34249, i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44652(C0657 c0657, String str, int i) {
        String type = c0657.getType();
        for (C0657 c06572 : this.f62748.f52880.values()) {
            if (type.equals(c06572.mo2695())) {
                Iterator it = c06572.getMethods().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C1032 c1032 = (C1032) it.next();
                    if (str.equals(C14354.m34249((InterfaceC5471) c1032, true))) {
                        m44653(c1032, i);
                        break;
                    }
                }
                m44652(c06572, str, i);
                return;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m44654(C0657 c0657, String str, int i) {
        C0657 c06572 = (C0657) this.f62748.f52880.get(c0657.mo2695());
        if (c06572 != null) {
            Iterator it = c06572.getMethods().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1032 c1032 = (C1032) it.next();
                if (str.equals(C14354.m34249((InterfaceC5471) c1032, true))) {
                    m44653(c1032, i);
                    break;
                }
            }
            m44654(c06572, str, i);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44651(C0657 c0657, int i) {
        if (this.f62747.contains(c0657.getType())) {
            return;
        }
        Iterator<E> it = c0657.mo2696().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1032 c1032 = (C1032) it.next();
            if (c1032.getName().equals("<clinit>")) {
                m44653(c1032, i);
                break;
            }
        }
        String mo2695 = c0657.mo2695();
        if (mo2695 != null) {
            m44650(i, mo2695);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44650(int i, String str) {
        HashSet hashSet = this.f62747;
        if (hashSet.contains(str)) {
            return;
        }
        C0657 c0657 = (C0657) this.f62748.f52880.get(str);
        if (c0657 != null) {
            m44651(c0657, i);
        } else {
            hashSet.add(str);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m44655() {
        return this.f62750;
    }
}

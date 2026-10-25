package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: C8YQ */
/* renamed from: l.᩺᩶ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23213 implements InterfaceC0635 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List f74597;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f74598 = new HashSet(3);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74599;

    public C23213(ArrayList arrayList) {
        this.f74597 = arrayList;
        this.f74599 = new ArrayList(arrayList.size());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList m51505() {
        Iterator it = this.f74597.iterator();
        while (it.hasNext()) {
            m51504((InterfaceC5575) it.next());
        }
        return this.f74599;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51504(InterfaceC5575 interfaceC5575) {
        ArrayList arrayList = this.f74599;
        if (arrayList.contains(interfaceC5575)) {
            return;
        }
        HashSet hashSet = this.f74598;
        if (hashSet.contains(interfaceC5575)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
        }
        hashSet.add(interfaceC5575);
        interfaceC5575.mo15840(this);
        hashSet.remove(interfaceC5575);
        if (arrayList.contains(interfaceC5575)) {
            return;
        }
        if (C21349.class.isAssignableFrom(interfaceC5575.getClass())) {
            arrayList.add(0, interfaceC5575);
        } else {
            arrayList.add(interfaceC5575);
        }
    }

    @Override // l.InterfaceC0635
    /* renamed from: ֫ */
    public final InterfaceC5575 mo2584() {
        InterfaceC5575 interfaceC5575;
        InterfaceC5575 interfaceC55752;
        Iterator it = this.f74599.iterator();
        while (true) {
            interfaceC5575 = null;
            if (!it.hasNext()) {
                interfaceC55752 = null;
                break;
            }
            interfaceC55752 = (InterfaceC5575) it.next();
            if (C21349.class.isAssignableFrom(interfaceC55752.getClass())) {
                break;
            }
        }
        if (interfaceC55752 != null) {
            return interfaceC55752;
        }
        List list = this.f74597;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            InterfaceC5575 interfaceC55753 = (InterfaceC5575) it2.next();
            if (C21349.class.isAssignableFrom(interfaceC55753.getClass())) {
                interfaceC5575 = interfaceC55753;
                break;
            }
        }
        if (interfaceC5575 == null) {
            throw new IllegalStateException("Requested plugin is not added: " + C21349.class.getName() + ", plugins: " + list);
        }
        m51504(interfaceC5575);
        return interfaceC5575;
    }
}

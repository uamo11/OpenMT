package l;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: K7QT */
/* renamed from: l.ۘܳ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3999 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f12673 = new LinkedHashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f12674 = new LinkedHashMap();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22343 f12675;

    public C3999(C22343 c22343) {
        this.f12675 = c22343;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12048(C16698 c16698) {
        String str;
        LinkedHashMap linkedHashMap = this.f12673;
        str = c16698.f51266;
        linkedHashMap.put(str, c16698);
        Iterator it = c16698.f51263.iterator();
        while (it.hasNext()) {
            this.f12674.put(C22343.m50077((InterfaceC20758) it.next()), c16698);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12052(C16698 c16698) {
        LinkedHashMap linkedHashMap = this.f12674;
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (((Map.Entry) it.next()).getValue() == c16698) {
                it.remove();
            }
        }
        Iterator it2 = c16698.f51263.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(C22343.m50077((InterfaceC20758) it2.next()), c16698);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16698 m12046(String str) {
        return (C16698) this.f12673.get(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16698 m12051(InterfaceC20758 interfaceC20758) {
        while (interfaceC20758 != null) {
            C16698 c16698 = (C16698) this.f12674.get(interfaceC20758);
            if (c16698 != null) {
                return c16698;
            }
            interfaceC20758 = interfaceC20758.getParent();
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12047() {
        this.f12673.clear();
        this.f12674.clear();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m12053() {
        return this.f12673.isEmpty();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m12049(InterfaceC20758 interfaceC20758) {
        return C22343.m50079(this.f12675, this.f12674.keySet(), interfaceC20758);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Set m12054() {
        return C20195.unmodifiableSet((Set) C5378.stream(this.f12673.values()).collect(C22976.toSet()));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Set m12050() {
        return C20195.unmodifiableSet((Set) C5378.stream(this.f12673.entrySet()).filter(new C15992()).map(new C2588()).collect(C22976.toSet()));
    }
}

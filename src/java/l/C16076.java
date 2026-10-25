package l;

import java.util.List;

/* compiled from: N43O */
/* renamed from: l.ܺܿ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16076 extends C2672 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f49553 = new ConcurrentMapC10942();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f49552 = new ConcurrentMapC10942();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f49554 = new ConcurrentMapC10942();

    @Override // l.C2672
    /* renamed from: ۧ */
    public final InterfaceC20758 mo8367(InterfaceC20758 interfaceC20758) {
        return (InterfaceC20758) C17997.computeIfAbsent(this.f49553, interfaceC20758, new C20297(1, this));
    }

    @Override // l.C2672
    /* renamed from: ܽ */
    public final List mo8368(InterfaceC20758 interfaceC20758) {
        List list;
        synchronized (this.f49554) {
            list = (List) this.f49554.get(interfaceC20758);
            if (list == null) {
                list = super.mo8368(interfaceC20758);
                this.f49554.put(interfaceC20758, list);
            }
        }
        return list;
    }

    @Override // l.C2672
    /* renamed from: ֫ */
    public final boolean mo8366(InterfaceC20758 interfaceC20758) {
        return ((C16646) C17997.computeIfAbsent(this.f49552, interfaceC20758, new C9022(0, this))).isPresent();
    }

    @Override // l.C2672
    /* renamed from: ᩳ */
    public final boolean mo8369(InterfaceC20758 interfaceC20758) {
        return ((Boolean) ((C16646) C17997.computeIfAbsent(this.f49552, interfaceC20758, new C9022(0, this))).map(new C18554(9)).orElse(Boolean.FALSE)).booleanValue();
    }
}

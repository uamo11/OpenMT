package l;

import java.util.HashMap;

/* compiled from: 26KG */
/* renamed from: l.ۛۧۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6013 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f18456;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f18457;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4277 f18458;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final HashMap f18459 = new HashMap();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f18460 = new HashMap();

    public C6013(InterfaceC4277 interfaceC4277) {
        C3059 m19957;
        this.f18458 = interfaceC4277;
        this.f18456 = interfaceC4277.mo12858();
        this.f18457 = interfaceC4277.mo12853().size() + 1;
        for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
            if (this.f18460.put(Integer.valueOf(interfaceC0748.mo2870()), interfaceC0748) != null) {
                m19957 = C7424.m19957("RESOURCE_TARGET_AMBIGUOUS", "Duplicate type IDs prevent adding resources safely.");
                throw m19957;
            }
            this.f18457 = Math.max(this.f18457, interfaceC0748.mo2870() + 1);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13773 m16825(int i) {
        InterfaceC0748 interfaceC0748;
        C3059 m19957;
        C3059 m199572;
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.f18459;
        C13773 c13773 = (C13773) hashMap.get(valueOf);
        if (c13773 == null && (interfaceC0748 = (InterfaceC0748) this.f18460.get(Integer.valueOf(i))) != null) {
            c13773 = new C13773(interfaceC0748.mo2870(), interfaceC0748.getTypeName());
            c13773.f41076 = interfaceC0748;
            c13773.f41080 = interfaceC0748.mo2878();
            for (InterfaceC7099 interfaceC7099 : interfaceC0748.mo2872()) {
                c13773.f41080 = Math.max(c13773.f41080, interfaceC7099.mo2344() + 1);
                String m8426 = C2692.m8426(interfaceC7099);
                for (InterfaceC21211 interfaceC21211 : interfaceC7099.mo18746()) {
                    int mo47883 = interfaceC21211.mo47883();
                    String mo29406 = interfaceC21211.mo29406();
                    String str = (String) c13773.f41075.put(Integer.valueOf(mo47883), mo29406);
                    if (str != null && !str.equals(mo29406)) {
                        m199572 = C7424.m19957("RESOURCE_TARGET_AMBIGUOUS", "Resource variants disagree about the entry name.");
                        throw m199572;
                    }
                    c13773.f41081.put(mo29406, Integer.valueOf(mo47883));
                    if (!c13773.f41082.add(mo47883 + "\n" + m8426)) {
                        m19957 = C7424.m19957("RESOURCE_TARGET_AMBIGUOUS", "Duplicate resource variants prevent adding resources safely.");
                        throw m19957;
                    }
                }
            }
            hashMap.put(Integer.valueOf(i), c13773);
        }
        return c13773;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13773 m16826(String str) {
        C3059 m19957;
        C3059 m199572;
        int i = -1;
        for (InterfaceC0748 interfaceC0748 : this.f18460.values()) {
            if (C2692.m8425(interfaceC0748.getTypeName()).equals(str)) {
                if (i != -1) {
                    m199572 = C7424.m19957("RESOURCE_TARGET_AMBIGUOUS", "Multiple types have the requested resource type name.");
                    throw m199572;
                }
                i = interfaceC0748.mo2870();
            }
        }
        if (i != -1) {
            return m16825(i);
        }
        HashMap hashMap = this.f18459;
        for (C13773 c13773 : hashMap.values()) {
            if (C2692.m8425(c13773.f41079).equals(str)) {
                return c13773;
            }
        }
        int i2 = this.f18457;
        if (i2 > 255) {
            m19957 = C7424.m19957("RESOURCE_ID_EXHAUSTED", "No unused type ID remains in this package.");
            throw m19957;
        }
        this.f18457 = i2 + 1;
        C13773 c137732 = new C13773(i2, str);
        hashMap.put(Integer.valueOf(c137732.f41077), c137732);
        return c137732;
    }
}

package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: D7LF */
/* renamed from: l.᩵ۨ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19436 extends AbstractC12669 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0384 f62869;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f62871 = new LinkedHashSet();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f62872 = new LinkedHashSet();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f62870 = new LinkedHashMap();

    @Override // l.InterfaceC21242
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return null;
    }

    @Override // l.AbstractC4203, l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo12688(C0779 c0779, Object obj) {
        m44777(c0779);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        return (Void) c5138.f16077.mo2962(this, (Object) null);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        AbstractC4308 m1868 = this.f62869.m1868(c8541);
        if (m1868.m12913(EnumC9454.UNDETVAR)) {
            m44777((C0779) m1868);
        }
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        return (Void) c19831.f64066.mo2962(this, (Object) null);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        c19955.mo4958().mo2962(this, (Object) null);
        Iterator it = c19955.mo12938().iterator();
        while (it.hasNext()) {
            ((AbstractC4308) it.next()).mo2962(this, (Object) null);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.AbstractCollection, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.AbstractCollection, java.util.Collection] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44777(C0779 c0779) {
        EnumC19125[] enumC19125Arr;
        int i;
        Iterator it;
        C0779 c07792 = c0779;
        AbstractC4308 abstractC4308 = c07792.f14167;
        if (this.f62872.add(abstractC4308)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(Collections.singleton(abstractC4308));
            LinkedHashMap linkedHashMap = this.f62870;
            Set set = (Set) C13843.getOrDefault(linkedHashMap, abstractC4308, linkedHashSet);
            EnumC19125[] values = EnumC19125.values();
            int length = values.length;
            char c = 0;
            int i2 = 0;
            while (i2 < length) {
                EnumC19125 enumC19125 = values[i2];
                EnumC19125[] enumC19125Arr2 = new EnumC19125[1];
                enumC19125Arr2[c] = enumC19125;
                Iterator it2 = c07792.m2963(enumC19125Arr2).iterator();
                while (it2.hasNext()) {
                    AbstractC4308 abstractC43082 = (AbstractC4308) it2.next();
                    C0384 c0384 = this.f62869;
                    AbstractC4308 m1868 = c0384.m1868(abstractC43082);
                    if (m1868.m12913(EnumC9454.UNDETVAR)) {
                        C0779 c07793 = (C0779) c0384.m1868(abstractC43082);
                        EnumC19125[] values2 = EnumC19125.values();
                        int length2 = values2.length;
                        int i3 = 0;
                        while (i3 < length2) {
                            enumC19125Arr = values;
                            EnumC19125 enumC191252 = values2[i3];
                            i = length;
                            int i4 = 1;
                            it = it2;
                            C2609 m2963 = c07792.m2963(enumC191252);
                            ?? r7 = m2963;
                            if (enumC191252 == enumC19125) {
                                i4 = 1;
                                r7 = m2963.m8244(C2609.of((Object) abstractC43082));
                            }
                            EnumC19125[] enumC19125Arr3 = new EnumC19125[i4];
                            enumC19125Arr3[0] = enumC191252;
                            C2609 m29632 = c07793.m2963(enumC19125Arr3);
                            ?? r6 = m29632;
                            if (enumC191252 == enumC19125.mo7226()) {
                                r6 = m29632.m8244(C2609.of((Object) abstractC4308));
                            }
                            if (!r7.containsAll(r6) || !r6.containsAll(r7)) {
                                m1868.mo2962(this, (Object) null);
                                break;
                            }
                            i3++;
                            c07792 = c0779;
                            values = enumC19125Arr;
                            length = i;
                            it2 = it;
                        }
                        enumC19125Arr = values;
                        i = length;
                        it = it2;
                        set.add(abstractC43082);
                        this.f62871.add(abstractC43082);
                    } else {
                        m1868.mo2962(this, (Object) null);
                        enumC19125Arr = values;
                        i = length;
                        it = it2;
                    }
                    c07792 = c0779;
                    values = enumC19125Arr;
                    length = i;
                    it2 = it;
                }
                i2++;
                c = 0;
                c07792 = c0779;
            }
            linkedHashMap.put(abstractC4308, set);
        }
    }

    public C19436(C0384 c0384) {
        this.f62869 = c0384;
    }
}

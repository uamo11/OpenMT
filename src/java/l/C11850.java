package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Y6J0 */
/* renamed from: l.ۨܿܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11850 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f35370;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8322 f35371;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f35372;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f35373;

    public C11850(C8322 c8322) {
        ArrayList arrayList = new ArrayList();
        this.f35370 = arrayList;
        this.f35372 = new HashMap();
        this.f35373 = new HashMap();
        this.f35371 = c8322;
        arrayList.add(new C6205());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = c8322.mo12850().iterator();
        while (it.hasNext()) {
            arrayList2.add((C20317) it.next());
        }
        Collections.sort(arrayList2, new C10439(0));
        HashMap hashMap = new HashMap();
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C20317 c20317 = (C20317) it2.next();
            String typeName = c20317.getTypeName();
            Integer num = (Integer) hashMap.get(typeName);
            int intValue = num != null ? num.intValue() : 0;
            hashMap.put(typeName, Integer.valueOf(intValue + 1));
            if (intValue == this.f35370.size()) {
                this.f35370.add(new C6205());
            }
            C6205 c6205 = (C6205) this.f35370.get(intValue);
            c6205.f19033.add(c20317);
            this.f35372.put(Integer.valueOf(c20317.mo2870()), c6205);
            this.f35373.put(Integer.valueOf(c20317.mo2870()), c20317);
        }
        ArrayList arrayList3 = this.f35370;
        for (C0560 c0560 : this.f35371.mo12845()) {
            HashMap hashMap2 = new HashMap();
            if (c0560.mo2311() == 0) {
                ((C6205) arrayList3.get(0)).f19032.add(c0560);
            } else {
                for (C5500 c5500 : c0560.mo12337()) {
                    HashMap hashMap3 = new HashMap();
                    if (((C15859) c5500.mo8775()).isEmpty()) {
                        hashMap3.put((C6205) arrayList3.get(0), new C15859());
                    }
                    for (int i = 0; i < ((C15859) c5500.mo8775()).size(); i++) {
                        int i2 = ((C15859) c5500.mo8775()).getInt(i);
                        C6205 m28962 = m28962(i2);
                        C15859 c15859 = (C15859) hashMap3.get(m28962);
                        if (c15859 == null) {
                            c15859 = new C15859();
                            hashMap3.put(m28962, c15859);
                        }
                        c15859.add(i2);
                    }
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        C6205 c62052 = (C6205) it3.next();
                        C15859 c158592 = (C15859) hashMap3.get(c62052);
                        if (c158592 != null) {
                            C0560 c05602 = (C0560) hashMap2.get(c62052);
                            if (c05602 == null) {
                                c05602 = new C0560(c0560.getName(), c0560.mo12339());
                                hashMap2.put(c62052, c05602);
                                c62052.f19032.add(c05602);
                            }
                            c05602.m2308(c5500.mo8776(), c158592);
                        }
                    }
                }
            }
        }
        for (C15376 c15376 : this.f35371.mo12857()) {
            if (c15376.mo36414() == 0) {
                ((C6205) this.f35370.get(0)).f19031.add(c15376);
            } else {
                HashMap hashMap4 = new HashMap();
                for (C21728 c21728 : c15376.mo43981()) {
                    C6205 m289622 = m28962(c21728.mo45542());
                    C15376 c153762 = (C15376) hashMap4.get(m289622);
                    if (c153762 == null) {
                        c153762 = new C15376();
                        hashMap4.put(m289622, c153762);
                        m289622.f19031.add(c153762);
                    }
                    c153762.m36411(c21728.mo45543(), c21728.mo45542());
                }
            }
        }
        ArrayList arrayList4 = this.f35370;
        Collections.reverse(arrayList4.subList(1, arrayList4.size()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C6205 m28962(int i) {
        int i2 = (i >>> 16) & 255;
        C20317 c20317 = (C20317) this.f35373.get(Integer.valueOf(i2));
        int i3 = 65535 & i;
        if ((i >>> 24) == this.f35371.mo12858() && c20317 != null && i3 < c20317.f65617.size() && c20317.m46622(i3) != null) {
            return (C6205) this.f35372.get(Integer.valueOf(i2));
        }
        return (C6205) this.f35370.get(0);
    }
}

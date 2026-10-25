package l;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: 98TD */
/* renamed from: l.ۗۗ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2961 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C13830 f9398;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC0486 f9399;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19251 f9403;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f9404;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19477 f9405;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC4372 f9406;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public InterfaceC1242 f9402 = new C5476();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f9401 = new IdentityHashMap();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final HashMap f9407 = new HashMap();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f9397 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f9396 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f9400 = new HashSet();

    public C2961(InterfaceC4372 interfaceC4372, InterfaceC19477 interfaceC19477, InterfaceC19251 interfaceC19251, C13830 c13830) {
        this.f9398 = c13830;
        this.f9406 = interfaceC4372;
        this.f9405 = interfaceC19477;
        this.f9403 = interfaceC19251;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 m9054(List list, InterfaceC1242 interfaceC1242) {
        ArrayList arrayList = this.f9397;
        m9043(0, arrayList.size());
        return m9053(arrayList.size(), list, interfaceC1242);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 m9053(int i, List list, InterfaceC1242 interfaceC1242) {
        if (!list.isEmpty()) {
            this.f9402 = interfaceC1242;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                C19895 c19895 = (C19895) list.get(i2 - i);
                ArrayList arrayList = this.f9397;
                if (i2 > 0) {
                    C19895 c198952 = (C19895) arrayList.get(i2 - 1);
                    c19895.f64293 = c198952.f64296.m52186().mo14107() + c198952.f64293;
                } else {
                    c19895.f64293 = 0;
                }
                c19895.f64294 = false;
                c19895.f64292.clear();
                int mo14107 = c19895.f64296.m52186().mo14107();
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    ((C19895) arrayList.get(i3)).f64293 += mo14107;
                }
                arrayList.add(i2, c19895);
                this.f9407.put(c19895.f64295, c19895);
                if (this.f9404) {
                    m9047(c19895);
                    if (this.f9401.isEmpty()) {
                        this.f9400.add(c19895);
                    } else {
                        C22011 c22011 = (C22011) this.f9396.get(c19895);
                        if (c22011 != null) {
                            c22011.f70565.mo11884(c22011.f70563);
                        }
                    }
                }
            }
        }
        return m9050();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 m9051(int i, int i2, List list) {
        ArrayList arrayList = this.f9397;
        C22632.m50631(i >= 0 && i <= i2 && i2 <= arrayList.size());
        C22632.m50631(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((C19895) arrayList.get(i3)).f64296.mo9822((C11197) list.get(i3 - i));
        }
        return m9050();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m9063() {
        return this.f9404;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 m9052(int i, int i2, InterfaceC1242 interfaceC1242) {
        C22632.m50631(i >= 0 && i <= i2 && i2 <= this.f9397.size());
        this.f9402 = interfaceC1242;
        m9043(i, i2);
        return m9050();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 m9055(InterfaceC1242 interfaceC1242) {
        int size = this.f9397.size();
        if (interfaceC1242.getLength() != size) {
            interfaceC1242 = interfaceC1242.mo4080().mo4083(size);
        }
        this.f9402 = interfaceC1242;
        return m9050();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m9061() {
        return this.f9397.size();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 m9062() {
        C22632.m50631(this.f9397.size() >= 0);
        this.f9402 = null;
        return m9050();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9057(InterfaceC0486 interfaceC0486) {
        C22632.m50634(!this.f9404);
        this.f9399 = interfaceC0486;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9397;
            if (i < arrayList.size()) {
                C19895 c19895 = (C19895) arrayList.get(i);
                m9047(c19895);
                this.f9400.add(c19895);
                i++;
            } else {
                this.f9404 = true;
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18012 m9056(C15894 c15894, InterfaceC21725 interfaceC21725, long j) {
        Object obj = c15894.f49112;
        int i = AbstractC19042.f59976;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        C15894 m37668 = c15894.m37668(pair.second);
        C19895 c19895 = (C19895) this.f9407.get(obj2);
        c19895.getClass();
        this.f9400.add(c19895);
        C22011 c22011 = (C22011) this.f9396.get(c19895);
        if (c22011 != null) {
            c22011.f70565.mo11879(c22011.f70563);
        }
        c19895.f64292.add(m37668);
        C18012 mo9816 = c19895.f64296.mo9816(m37668, interfaceC21725, j);
        this.f9401.put(mo9816, c19895);
        m9049();
        return mo9816;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9058(InterfaceC9546 interfaceC9546) {
        IdentityHashMap identityHashMap = this.f9401;
        C19895 c19895 = (C19895) identityHashMap.remove(interfaceC9546);
        c19895.getClass();
        c19895.f64296.mo9821(interfaceC9546);
        c19895.f64292.remove(((C18012) interfaceC9546).f56178);
        if (!identityHashMap.isEmpty()) {
            m9049();
        }
        m9045(c19895);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m9060() {
        HashMap hashMap = this.f9396;
        for (C22011 c22011 : hashMap.values()) {
            try {
                c22011.f70565.mo11883(c22011.f70563);
            } catch (RuntimeException e) {
                C19956.m46034("Failed to release child source.", e);
            }
            InterfaceC3901 interfaceC3901 = c22011.f70565;
            C21306 c21306 = c22011.f70564;
            interfaceC3901.mo11881((InterfaceC15188) c21306);
            c22011.f70565.mo11882((InterfaceC21388) c21306);
        }
        hashMap.clear();
        this.f9400.clear();
        this.f9404 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4846 m9050() {
        ArrayList arrayList = this.f9397;
        if (arrayList.isEmpty()) {
            return AbstractC4846.f15313;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C19895 c19895 = (C19895) arrayList.get(i2);
            c19895.f64293 = i;
            i += c19895.f64296.m52186().mo14107();
        }
        return new C13543(arrayList, this.f9402);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1242 m9059() {
        return this.f9402;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m9049() {
        Iterator it = this.f9400.iterator();
        while (it.hasNext()) {
            C19895 c19895 = (C19895) it.next();
            if (c19895.f64292.isEmpty()) {
                C22011 c22011 = (C22011) this.f9396.get(c19895);
                if (c22011 != null) {
                    c22011.f70565.mo11884(c22011.f70563);
                }
                it.remove();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9043(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.f9397;
            C19895 c19895 = (C19895) arrayList.remove(i3);
            this.f9407.remove(c19895.f64295);
            int i4 = -c19895.f64296.m52186().mo14107();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((C19895) arrayList.get(i5)).f64293 += i4;
            }
            c19895.f64294 = true;
            if (this.f9404) {
                m9045(c19895);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ۖۧۧ, l.ۢۗ֫] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m9047(C19895 c19895) {
        C23656 c23656 = c19895.f64296;
        ?? r1 = new InterfaceC2490() { // from class: l.ۢۗ֫
            @Override // l.InterfaceC2490
            /* renamed from: ֫ */
            public final void mo3045(AbstractC9277 abstractC9277, AbstractC4846 abstractC4846) {
                ((C19936) C2961.this.f9406).m46016();
            }
        };
        C21306 c21306 = new C21306(this, c19895);
        this.f9396.put(c19895, new C22011(c23656, r1, c21306));
        String str = C3603.f11424;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        c23656.mo11877(new Handler(myLooper, null), (InterfaceC15188) c21306);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        c23656.mo11878(new Handler(myLooper2, null), (InterfaceC21388) c21306);
        c23656.mo11880((InterfaceC2490) r1, this.f9399, this.f9398);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m9045(C19895 c19895) {
        if (c19895.f64294 && c19895.f64292.isEmpty()) {
            C22011 c22011 = (C22011) this.f9396.remove(c19895);
            c22011.getClass();
            C21306 c21306 = c22011.f70564;
            InterfaceC3901 interfaceC3901 = c22011.f70565;
            interfaceC3901.mo11883(c22011.f70563);
            interfaceC3901.mo11881((InterfaceC15188) c21306);
            interfaceC3901.mo11882((InterfaceC21388) c21306);
            this.f9400.remove(c19895);
        }
    }
}

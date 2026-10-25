package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: M4YN */
/* renamed from: l.֫᩸֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2085 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6956;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C0176 f6957;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f6958 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f6955 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m6854(C11258 c11258) {
        C22755 c22755;
        if (c11258.f16030 == -1) {
            C22755 c227552 = c11258.f33744;
            HashMap hashMap = this.f6958;
            C11258 c112582 = (C11258) hashMap.get(c227552);
            if (c112582 != null) {
                m6854(c112582);
            }
            C13582 c13582 = c11258.f33740;
            if (c13582 != null) {
                Iterator it = new C14246(c13582.f40520).iterator();
                while (it.hasNext()) {
                    C11258 c112583 = (C11258) hashMap.get((C22755) it.next());
                    if (c112583 != null) {
                        m6854(c112583);
                    }
                }
            }
            int i = this.f6956;
            int i2 = this.f6955;
            this.f6955 = i2 + 1;
            this.f6956 = c11258.m14658(i, i2);
            c22755 = c11258.f33742;
            hashMap.remove(c22755);
        }
    }

    public C2085(C0176 c0176) {
        C22755 c22755;
        this.f6957 = c0176;
        Iterator it = c0176.f30234.iterator();
        while (it.hasNext()) {
            C11258 c11258 = (C11258) it.next();
            c22755 = c11258.f33742;
            this.f6958.put(c22755, c11258);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m6855(int i) {
        this.f6956 = i;
        C0176 c0176 = this.f6957;
        C3454 c3454 = c0176.f30232;
        ArrayList arrayList = c0176.f30234;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C11258) it.next()).f16030 = -1;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m6854((C11258) it2.next());
        }
        for (C11258 c11258 : this.f6958.values()) {
            arrayList.set(c11258.f16032, c11258);
        }
        return this.f6956;
    }
}

package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: 18DH */
/* renamed from: l.ۜᩴۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C6944 implements InterfaceC18233 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C16115 f21415;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public double[] f21416 = new double[8];

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f21414 = new ArrayList();

    public C6944(C16115 c16115, double d) {
        this.f21415 = c16115;
        mo18762(d);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public double[] mo18767() {
        return this.f21416;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public double mo18768() {
        return this.f21416[0];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo18762(double d) {
        int i = 0;
        while (true) {
            double[] dArr = this.f21416;
            if (i >= dArr.length) {
                return;
            }
            dArr[i] = d;
            i++;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18758(C6944 c6944, C6944 c69442) {
        ArrayList arrayList = c6944.f21414;
        if (!arrayList.contains(c69442)) {
            arrayList.add(c69442);
        }
        ArrayList arrayList2 = c69442.f21414;
        if (arrayList2.contains(c6944)) {
            return;
        }
        arrayList2.add(c6944);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m18759(C6944 c6944) {
        ArrayList arrayList = c6944.f21414;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C6944) it.next()).f21414.remove(c6944);
        }
        arrayList.clear();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6944 m18760(int i) {
        return (C6944) this.f21414.get(i);
    }

    @Override // l.InterfaceC18233
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo18763(long j) {
        for (int i = 0; i < this.f21414.size(); i++) {
            m18760(i).f21415.m49089().m52646(j);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m18766() {
        return this.f21414.size();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18765() {
        double[] dArr = this.f21416;
        double d = dArr[dArr.length - 1];
        for (int i = 0; i < dArr.length - 1; i++) {
            dArr[i] = d;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18764(C6944 c6944) {
        C16115 c16115 = this.f21415;
        C7216 m49088 = c16115.m49088();
        C7216 m490882 = c6944.f21415.m49088();
        if (m49088 != m490882 && m49088 != null && m490882 != null) {
            throw new RuntimeException("Connection between units on different synths.");
        }
        c16115.m49085(new C14704(this, c6944));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18761() {
        this.f21415.m49085(new C23877(this));
    }
}

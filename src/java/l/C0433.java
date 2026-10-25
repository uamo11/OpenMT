package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* compiled from: D4TJ */
/* renamed from: l.֡۬ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0433 extends AbstractC1139 {

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f1916;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f1917;

    @Override // l.AbstractC1139
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0433 mo1983() {
        return this;
    }

    public C0433() {
        super(true);
        this.f1916 = new ArrayList();
        this.f1917 = false;
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList m1988() {
        return this.f1916;
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m1985() {
        C18779 c18779;
        c18779 = C15249.f46797;
        ArrayList arrayList = this.f1916;
        Collections.sort(arrayList, c18779);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1139 abstractC1139 = (AbstractC1139) it.next();
            if (abstractC1139.m3888()) {
                abstractC1139.mo1983().m1985();
            }
        }
    }

    @Override // l.AbstractC1139
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C5373 mo1987() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1986() {
        if (this.f1917) {
            return true;
        }
        Iterator it = this.f1916.iterator();
        while (it.hasNext()) {
            AbstractC1139 abstractC1139 = (AbstractC1139) it.next();
            if (abstractC1139.m3888() && abstractC1139.mo1983().m1986()) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC1139
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1984(CountDownLatch countDownLatch) {
        this.f4126 = countDownLatch;
        Iterator it = this.f1916.iterator();
        while (it.hasNext()) {
            ((AbstractC1139) it.next()).mo1984(countDownLatch);
        }
    }
}

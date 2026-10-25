package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: 07T7 */
/* renamed from: l.֨᩺ۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC1428 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC9187 f5122 = new C2840();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9241 f5123;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9241 f5124;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract long mo4932(Object obj);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo4935(long j, Object obj);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract String mo4936(Object obj);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract void mo4938(long j, Object obj);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract long mo4939(Object obj);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract Object mo4940(String str);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public abstract void mo4941(long j, Object obj);

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public abstract long mo4942(Object obj);

    public AbstractC1428(Collection collection) {
        boolean z;
        long mo12803;
        boolean z2;
        C0722 c0722;
        AbstractC1428 abstractC1428 = this;
        abstractC1428.f5123 = new C9241(f5122);
        abstractC1428.f5124 = new C9241(f5122);
        C21393 c21393 = C21393.f68892;
        C0722 c07222 = new C0722(c21393, c21393);
        Iterator it = collection.iterator();
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C21393 m48474 = C21393.m48474(abstractC1428.mo4936(next));
            if (!m48474.isEmpty()) {
                int indexOf = m48474.indexOf(0);
                int i = 0;
                C0722 c07223 = c07222;
                while (true) {
                    if (indexOf == -1) {
                        break;
                    }
                    int i2 = indexOf + 1;
                    C21393 m48477 = m48474.m48477(i, i2);
                    C0722 c07224 = (C0722) c07223.f2717.get(m48477);
                    if (c07224 == null) {
                        C0722 c07225 = new C0722(m48474.m48477(0, i2), m48477);
                        c07223.f2717.put(m48477, c07225);
                        if (c07223.f2717.size() == 20) {
                            c07223.f2717 = new HashMap(c07223.f2717);
                        }
                        c07224 = c07225;
                    }
                    if (indexOf == m48474.length() - 1) {
                        c07224.f2718 = new C19774(abstractC1428, next);
                        c07224.f2721 = abstractC1428.mo4942(next);
                        break;
                    } else {
                        indexOf = m48474.indexOf(i2);
                        i = i2;
                        c07223 = c07224;
                    }
                }
                if (indexOf == -1) {
                    C21393 m48476 = m48474.m48476(i);
                    C0722 c07226 = new C0722(m48474, m48476);
                    c07226.f2718 = new C19774(abstractC1428, next);
                    c07226.f2721 = abstractC1428.mo4942(next);
                    c07223.m2830(m48476, c07226);
                }
            }
        }
        C19119 c19119 = new C19119();
        for (C0722 c07227 : c07222.f2717.values()) {
            if (c07227.m2831()) {
                c19119.add(new C19068(c07227));
            }
        }
        while (!c19119.isEmpty()) {
            C19068 c19068 = (C19068) c19119.get(c19119.size() - 1);
            C0722 c07228 = c19068.f60051;
            if (c19068.f60052) {
                c19119.pop();
                AbstractC4251 abstractC4251 = c07228.f2718;
                long j = 0;
                if (abstractC4251 == null) {
                    C21393 c213932 = c07228.f2719;
                    abstractC4251 = new C5662(abstractC1428, c213932);
                    abstractC1428.f5124.put(c213932, abstractC4251);
                    c07228.f2718 = abstractC4251;
                    z2 = true;
                    mo12803 = 0;
                } else {
                    mo12803 = abstractC4251.mo12803();
                    z2 = false;
                }
                long j2 = mo12803;
                long j3 = 0;
                for (C0722 c07229 : c07228.f2717.values()) {
                    AbstractC4251 abstractC42512 = c07229.f2718;
                    C0722 c072210 = c07222;
                    long j4 = c07229.f2721;
                    long mo12801 = abstractC42512.mo12801();
                    j = mo12801 != -1 ? j + mo12801 : j;
                    long mo12797 = abstractC42512.mo12797();
                    j3 = mo12797 != -1 ? j3 + mo12797 : j3;
                    if (j4 > j2) {
                        j2 = j4;
                    }
                    c07222 = c072210;
                }
                c0722 = c07222;
                abstractC4251.mo12800(j);
                abstractC4251.mo12798(j3);
                if (z2) {
                    abstractC4251.mo12802(j2);
                }
                c07228.f2721 = j2;
            } else {
                c19068.f60052 = z;
                for (C0722 c072211 : c07228.f2717.values()) {
                    if (c072211.m2831()) {
                        c19119.add(new C19068(c072211));
                    }
                }
                c0722 = c07222;
            }
            z = true;
            abstractC1428 = this;
            c07222 = c0722;
        }
        C19119 c191192 = new C19119();
        c191192.add(c07222);
        while (!c191192.isEmpty()) {
            C0722 c072212 = (C0722) c191192.pop();
            Collection<C0722> values = c072212.f2717.values();
            ArrayList arrayList = new ArrayList(values.size());
            for (C0722 c072213 : values) {
                AbstractC4251 abstractC42513 = c072213.f2718;
                C11003.requireNonNull(abstractC42513);
                arrayList.add(abstractC42513);
                if (c072213.m2831()) {
                    c191192.add(c072213);
                }
            }
            this.f5123.put(c072212.f2719, arrayList);
        }
        this.f5123.m23688();
        this.f5124.m23688();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m4933(String str) {
        AbstractC4251 abstractC4251 = (AbstractC4251) this.f5124.get(str);
        if (abstractC4251 == null) {
            return null;
        }
        return abstractC4251.mo12799();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private InterfaceC17664 m4931(String str) {
        if (str == null) {
            str = "";
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        List list = (List) this.f5123.get(str);
        if (list == null) {
            return C16958.empty();
        }
        return C5378.stream(list).map(new C16244());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List m4937(String str) {
        return (List) m4931(str).collect(C22976.toUnmodifiableList());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m4934(String str, Comparator comparator) {
        return (List) m4931(str).sorted(comparator).collect(C22976.toUnmodifiableList());
    }
}

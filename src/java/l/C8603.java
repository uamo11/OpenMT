package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Y5SH */
/* renamed from: l.ۡۗ֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8603 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C9309 f26280;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9309 f26281;

    public C8603() {
        C9309 c9309 = new C9309(this, 0, 0);
        this.f26280 = c9309;
        C9309 c93092 = new C9309(this, 0, 0);
        this.f26281 = c93092;
        c9309.f28206 = c93092;
        c93092.f28205 = c9309;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17069 m22354() {
        C9309 c9309 = this.f26280;
        C9309 c93092 = c9309.f28206;
        C9309 c93093 = this.f26281;
        if (c93092 == c93093) {
            return new C17069(null, null);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap = new HashMap();
        for (C9309 c93094 = c9309.f28206; c93094 != c93093; c93094 = c93094.f28206) {
            C16153[] c16153Arr = new C16153[c93094.f28204.size()];
            Iterator it = c93094.f28204.iterator();
            int i = 0;
            while (it.hasNext()) {
                C20598 c20598 = (C20598) it.next();
                c16153Arr[i] = new C16153(c20598.f66302, c20598.f66301);
                i++;
            }
            C9099 c9099 = new C9099(c16153Arr, c93094.f28201);
            C9099 c90992 = (C9099) hashMap.get(c9099);
            if (c90992 == null) {
                hashMap.put(c9099, c9099);
                arrayList2.add(c9099);
            } else {
                c9099 = c90992;
            }
            int i2 = c93094.f28203;
            arrayList.add(new C2749(i2, c93094.f28202 - i2, c9099));
        }
        return new C17069(arrayList, arrayList2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22356(int i, int i2, int i3) {
        C17069 m22355 = m22355(i, i2);
        C9309 c9309 = (C9309) m22355.f52322;
        C9309 c93092 = (C9309) m22355.f52323;
        do {
            int i4 = c9309.f28203;
            if (i4 > i) {
                C9309 c93093 = new C9309(this, i, i4);
                c9309.m23895(c93093);
                c9309 = c93093;
            }
            if (c9309.f28201 == -1) {
                c9309.f28201 = i3;
            }
            i = c9309.f28202;
            c9309 = c9309.f28206;
        } while (c9309.f28205 != c93092);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17069 m22355(int i, int i2) {
        C9309 c9309;
        C9309 c93092;
        C9309 c93093 = this.f26280.f28206;
        while (true) {
            c9309 = this.f26281;
            c93092 = null;
            if (c93093 == c9309) {
                c93093 = null;
                break;
            }
            int i3 = c93093.f28203;
            if (i == i3) {
                break;
            }
            if (i > i3 && i < c93093.f28202) {
                c93093 = c93093.m23894(i);
                break;
            }
            if (i >= i3) {
                c93093 = c93093.f28206;
            } else {
                if (i2 <= i3) {
                    C9309 c93094 = new C9309(this, i, i2);
                    c93093.m23895(c93094);
                    return new C17069(c93094, c93094);
                }
                C9309 c93095 = new C9309(this, i, i3);
                c93093.m23895(c93095);
                c93093 = c93095;
            }
        }
        if (c93093 == null) {
            C9309 c93096 = new C9309(this, i, i2);
            c9309.m23895(c93096);
            return new C17069(c93096, c93096);
        }
        C9309 c93097 = c93093;
        while (true) {
            if (c93097 != c9309) {
                int i4 = c93097.f28202;
                if (i4 == i2) {
                    break;
                }
                int i5 = c93097.f28203;
                if (i5 < i2 && i4 > i2) {
                    c93097.m23894(i2);
                    break;
                }
                if (i5 >= i2) {
                    c93092 = new C9309(this, c93097.f28205.f28202, i2);
                    c93097.m23895(c93092);
                    break;
                }
                c93097 = c93097.f28206;
            } else {
                break;
            }
        }
        c93092 = c93097;
        if (c93092 == null) {
            c93092 = new C9309(this, c9309.f28205.f28202, i2);
            c9309.m23895(c93092);
        }
        return new C17069(c93093, c93092);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22357(C22755 c22755, int i, int i2, int i3) {
        C17069 m22355 = m22355(i, i2);
        C9309 c9309 = (C9309) m22355.f52322;
        C9309 c93092 = (C9309) m22355.f52323;
        C20598 c20598 = new C20598(c22755, i3);
        do {
            int i4 = c9309.f28203;
            if (i4 > i) {
                C9309 c93093 = new C9309(this, i, i4);
                c9309.m23895(c93093);
                c9309 = c93093;
            }
            c9309.f28204.addLast(c20598);
            i = c9309.f28202;
            c9309 = c9309.f28206;
        } while (c9309.f28205 != c93092);
    }
}

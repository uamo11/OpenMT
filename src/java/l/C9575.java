package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: K7A5 */
/* renamed from: l.ۢۨ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9575 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Consumer f29036;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8420 f29037;

    public C9575() {
        this(new C8420(), new C17335(0));
    }

    public C9575(C8420 c8420, Consumer consumer) {
        this.f29037 = c8420;
        this.f29036 = consumer;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m24454() {
        return m24453();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0194, code lost:
    
        r11 = r15;
     */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.ArrayList m24453() {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9575.m24453():java.util.ArrayList");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24456(C20864 c20864) {
        this.f29036.n(c20864);
        AbstractC15440 abstractC15440 = c20864.f67520;
        this.f29037.getClass();
        C8420.m22048(abstractC15440);
        C15972.m37753();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m24455(String str, int i, long j) {
        Set singleton = Collections.singleton(str);
        ArrayList arrayList = new ArrayList();
        ArrayList m24453 = m24453();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = m24453.iterator();
        while (it.hasNext()) {
            C20864 c20864 = (C20864) it.next();
            if (c20864.f67525) {
                arrayList3.add(c20864);
            } else {
                arrayList2.add(c20864);
            }
        }
        m24451(arrayList2, i, singleton, arrayList);
        C6083.sort(arrayList3, C8200.comparingLong(new C6752()));
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            C20864 c208642 = (C20864) it2.next();
            if (singleton.contains(c208642.f67521) || j - c208642.f67526 <= 600000 || !m24452(c208642, arrayList)) {
                arrayList4.add(c208642);
            }
        }
        m24451(arrayList4, 2, singleton, arrayList);
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24451(ArrayList arrayList, int i, Set set, ArrayList arrayList2) {
        int size = arrayList.size();
        C6083.sort(arrayList, C8200.comparingLong(new C23685()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C20864 c20864 = (C20864) it.next();
            if (size <= i) {
                return;
            }
            if (!set.contains(c20864.f67521) && m24452(c20864, arrayList2)) {
                size--;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m24452(C20864 c20864, ArrayList arrayList) {
        String str = c20864.f67521;
        try {
            this.f29036.n(c20864);
            C8420 c8420 = this.f29037;
            AbstractC15440 abstractC15440 = c20864.f67520;
            c8420.getClass();
            C8420.m22048(abstractC15440);
            arrayList.add(str);
            return true;
        } catch (IOException e) {
            C19926.m45879("MT MCP session delete failed, sessionId=" + str, e);
            return false;
        }
    }
}

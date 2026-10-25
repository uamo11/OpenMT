package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Y6X9 */
/* renamed from: l.ۛۖۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5766 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f17733;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Condition f17734;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f17735;

    public C5766() {
        ReentrantLock reentrantLock = new ReentrantLock(true);
        this.f17735 = reentrantLock;
        this.f17734 = reentrantLock.newCondition();
        this.f17733 = new ArrayList();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10000 m16220(String str) {
        return m16216((Collection) Collections.singletonList(str), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10000 m16222(List list) {
        return m16216((Collection) list, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C10000 m16223(String str) {
        return m16216((Collection) Collections.singletonList(str), true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10000 m16221(Collection collection) {
        return m16216(collection, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10000 m16216(Collection collection, boolean z) {
        ArrayList arrayList = new ArrayList(new LinkedHashSet(collection));
        Collections.sort(arrayList);
        if (arrayList.isEmpty()) {
            throw C3059.m9368("FILE_INVALID_PATH", "At least one path claim is required.");
        }
        ReentrantLock reentrantLock = this.f17735;
        reentrantLock.lock();
        while (m16217(arrayList, z)) {
            try {
                try {
                    this.f17734.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw C3059.m9363("FILE_OPERATION_INTERRUPTED", "File operation was interrupted while waiting for a path claim.");
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        C12116 c12116 = new C12116(arrayList, z);
        this.f17733.add(c12116);
        return new C10000(this, c12116);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m16217(ArrayList arrayList, boolean z) {
        Iterator it = this.f17733.iterator();
        while (it.hasNext()) {
            C12116 c12116 = (C12116) it.next();
            if (z || c12116.f36193) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    Iterator it3 = c12116.f36192.iterator();
                    while (it3.hasNext()) {
                        String str2 = (String) it3.next();
                        if (C12301.m29846(str, str2) || C12301.m29846(str2, str)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

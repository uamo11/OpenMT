package l;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: NAO7 */
/* renamed from: l.ۛۧܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6020 implements InterfaceC11665 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static volatile C6020 f18480;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ReentrantLock f18481 = new ReentrantLock();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7163 f18482;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList f18483 = new CopyOnWriteArrayList();

    @Override // l.InterfaceC11665
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16845(InterfaceC13041 interfaceC13041) {
        C11233.m27805(interfaceC13041, "callback");
        synchronized (f18481) {
            if (this.f18482 == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f18483.iterator();
            while (it.hasNext()) {
                C10254 c10254 = (C10254) it.next();
                if (c10254.m25985() == interfaceC13041) {
                    arrayList.add(c10254);
                }
            }
            this.f18483.removeAll(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Activity m25983 = ((C10254) it2.next()).m25983();
                CopyOnWriteArrayList copyOnWriteArrayList = this.f18483;
                if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                    Iterator it3 = copyOnWriteArrayList.iterator();
                    while (it3.hasNext()) {
                        if (C11233.m27802(((C10254) it3.next()).m25983(), m25983)) {
                            break;
                        }
                    }
                }
                InterfaceC7163 interfaceC7163 = this.f18482;
                if (interfaceC7163 != null) {
                    interfaceC7163.mo19186(m25983);
                }
            }
            C8058 c8058 = C8058.f24861;
        }
    }

    public C6020(C13075 c13075) {
        this.f18482 = c13075;
        if (c13075 == null) {
            return;
        }
        c13075.m31690(new C12370(this));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CopyOnWriteArrayList m16843() {
        return this.f18483;
    }

    @Override // l.InterfaceC11665
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo16844(Activity activity, ExecutorC23282 executorC23282, C11124 c11124) {
        C17473 c17473;
        Object obj;
        ReentrantLock reentrantLock = f18481;
        reentrantLock.lock();
        try {
            InterfaceC7163 interfaceC7163 = this.f18482;
            if (interfaceC7163 == null) {
                c11124.accept(new C17473(C8969.f27244));
                return;
            }
            boolean z = true;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f18483;
            if (!(copyOnWriteArrayList != null) || !copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    if (C11233.m27802(((C10254) it.next()).m25983(), activity)) {
                        break;
                    }
                }
            }
            z = false;
            C10254 c10254 = new C10254(activity, executorC23282, c11124);
            copyOnWriteArrayList.add(c10254);
            if (!z) {
                interfaceC7163.mo19185(activity);
            } else {
                Iterator it2 = copyOnWriteArrayList.iterator();
                while (true) {
                    c17473 = null;
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it2.next();
                        if (activity.equals(((C10254) obj).m25983())) {
                            break;
                        }
                    }
                }
                C10254 c102542 = (C10254) obj;
                if (c102542 != null) {
                    c17473 = c102542.m25986();
                }
                if (c17473 != null) {
                    c10254.m25984(c17473);
                }
            }
            C8058 c8058 = C8058.f24861;
        } finally {
            reentrantLock.unlock();
        }
    }
}

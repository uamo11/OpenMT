package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: 4AYL */
/* renamed from: l.ۢۛ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C9408 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28551 = AtomicReferenceFieldUpdater.newUpdater(C9408.class, Object.class, "_cur");
    public volatile /* synthetic */ Object _cur = new C15756(8, false);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m24248() {
        return ((C15756) this._cur).m37153();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24246() {
        while (true) {
            C15756 c15756 = (C15756) this._cur;
            if (c15756.m37152()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28551;
            C15756 m37156 = c15756.m37156();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c15756, m37156) && atomicReferenceFieldUpdater.get(this) == c15756) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m24247(Runnable runnable) {
        while (true) {
            C15756 c15756 = (C15756) this._cur;
            int m37151 = c15756.m37151(runnable);
            if (m37151 == 0) {
                return true;
            }
            if (m37151 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28551;
                C15756 m37156 = c15756.m37156();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c15756, m37156) && atomicReferenceFieldUpdater.get(this) == c15756) {
                }
            } else if (m37151 == 2) {
                return false;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m24249() {
        while (true) {
            C15756 c15756 = (C15756) this._cur;
            Object m37155 = c15756.m37155();
            if (m37155 != C15756.f48585) {
                return m37155;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28551;
            C15756 m37156 = c15756.m37156();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c15756, m37156) && atomicReferenceFieldUpdater.get(this) == c15756) {
            }
        }
    }
}

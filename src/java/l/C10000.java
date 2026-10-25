package l;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Y6X9 */
/* renamed from: l.ۤۖۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10000 implements AutoCloseable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C12116 f30126;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5766 f30127;

    public C10000(C5766 c5766, C12116 c12116) {
        this.f30127 = c5766;
        this.f30126 = c12116;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        ArrayList arrayList;
        Condition condition;
        C5766 c5766 = this.f30127;
        reentrantLock = c5766.f17735;
        reentrantLock.lock();
        try {
            if (this.f30126 != null) {
                arrayList = c5766.f17733;
                arrayList.remove(this.f30126);
                this.f30126 = null;
                condition = c5766.f17734;
                condition.signalAll();
            }
        } finally {
            reentrantLock2 = c5766.f17735;
            reentrantLock2.unlock();
        }
    }
}

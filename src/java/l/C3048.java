package l;

import java.util.HashSet;

/* compiled from: N7I4 */
/* renamed from: l.ۗۛۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3048 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f9591 = new HashSet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m9339(String str) {
        synchronized (this.f9591) {
            while (this.f9591.contains(str)) {
                try {
                    this.f9591.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException("线程被中断", e);
                }
            }
            this.f9591.add(str);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m9340(String str) {
        synchronized (this.f9591) {
            this.f9591.remove(str);
            this.f9591.notifyAll();
        }
    }
}

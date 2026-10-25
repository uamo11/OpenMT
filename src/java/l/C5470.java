package l;

import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: E9CL */
/* renamed from: l.ۚܽۘ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5470 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ReentrantLock f16997 = new ReentrantLock();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f16998 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0530 m15568(String str) {
        ReentrantLock reentrantLock = this.f16997;
        reentrantLock.lock();
        try {
            return (C0530) this.f16998.get(str);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15569(C0530 c0530) {
        ReentrantLock reentrantLock = this.f16997;
        reentrantLock.lock();
        try {
            this.f16998.put(c0530.m2254(), c0530);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15570(String str) {
        ReentrantLock reentrantLock = this.f16997;
        reentrantLock.lock();
        try {
            this.f16998.remove(str);
        } finally {
            reentrantLock.unlock();
        }
    }
}

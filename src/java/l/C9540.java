package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: 69H1 */
/* renamed from: l.ۢۧۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9540 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ReentrantReadWriteLock f28940 = new ReentrantReadWriteLock();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public HashMap f28941 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f28939 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18712 m24411(Long l2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f28940;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (C18712) this.f28941.get(l2);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18712 m24414(Long l2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f28940;
        reentrantReadWriteLock.writeLock().lock();
        try {
            C18712 c18712 = (C18712) this.f28941.remove(l2);
            if (c18712 == null) {
                throw new C10951("Unable to find outstanding request for messageId " + l2);
            }
            this.f28939.remove(c18712.m43336());
            return c18712;
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24413(C18712 c18712) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f28940;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f28941.put(Long.valueOf(c18712.m43338()), c18712);
            this.f28939.put(c18712.m43336(), c18712);
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24412(C2380 c2380) {
        HashMap hashMap = this.f28941;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f28940;
        reentrantReadWriteLock.writeLock().lock();
        try {
            Iterator it = new HashSet(hashMap.keySet()).iterator();
            while (it.hasNext()) {
                C18712 c18712 = (C18712) hashMap.remove((Long) it.next());
                this.f28939.remove(c18712.m43336());
                c18712.m43339().m40457(c2380);
            }
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }
}

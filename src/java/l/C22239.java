package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: 99J1 */
/* renamed from: l.᩹ۧۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22239 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ReentrantLock f72172 = new ReentrantLock();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public HashMap f72173 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49949(Long l2, C15346 c15346) {
        ReentrantLock reentrantLock = this.f72172;
        reentrantLock.lock();
        try {
            this.f72173.put(l2, c15346);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15346 m49948(Long l2) {
        ReentrantLock reentrantLock = this.f72172;
        reentrantLock.lock();
        try {
            return (C15346) this.f72173.get(l2);
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49950(Long l2) {
        ReentrantLock reentrantLock = this.f72172;
        reentrantLock.lock();
        try {
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m49947() {
        ReentrantLock reentrantLock = this.f72172;
        reentrantLock.lock();
        try {
            return new ArrayList(this.f72173.values());
        } finally {
            reentrantLock.unlock();
        }
    }
}

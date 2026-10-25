package l;

import java.security.PrivilegedAction;

/* compiled from: 86PR */
/* renamed from: l.ܺۜ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15777 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        while (true) {
            ThreadGroup parent = threadGroup.getParent();
            if (parent == null) {
                return new ThreadGroup(threadGroup, "InnocuousFJWorkerThreadGroup");
            }
            threadGroup = parent;
        }
    }
}

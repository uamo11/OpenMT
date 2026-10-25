package l;

import java.util.HashSet;
import java.util.Set;

/* compiled from: U7TB */
/* renamed from: l.ۖ֡֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2169 implements InterfaceC14183 {
    @Override // l.InterfaceC14183
    /* renamed from: ֫ */
    public final Set mo2897() {
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{'\\'}[0];
        C11003.requireNonNull(obj);
        if (hashSet.add(obj)) {
            return C20195.unmodifiableSet(hashSet);
        }
        throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
    }

    @Override // l.InterfaceC14183
    public final InterfaceC17006 create() {
        return new C3580();
    }
}

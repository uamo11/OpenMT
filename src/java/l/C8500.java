package l;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 0B0D */
/* renamed from: l.۠᩻ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C8500 extends AbstractC8333 {
    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final void mo2845(C23525 c23525, Object obj) {
        c23525.m51983(((AtomicInteger) obj).get());
    }

    @Override // l.AbstractC8333
    /* renamed from: ֫ */
    public final Object mo2844(C17175 c17175) {
        try {
            return new AtomicInteger(c17175.m40408());
        } catch (NumberFormatException e) {
            throw new C14682(e);
        }
    }
}

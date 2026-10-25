package l;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: 07HC */
/* renamed from: l.ܿ᩻᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17688 extends C7659 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21217 f54147;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17688(C21217 c21217, C2036 c2036) {
        super(c2036);
        this.f54147 = c21217;
    }

    @Override // l.C7659, l.C2036, l.InterfaceC17066
    /* renamed from: ᩻ */
    public final boolean mo1526() {
        AtomicBoolean atomicBoolean;
        AtomicReference atomicReference;
        if (super.mo1526()) {
            return true;
        }
        C21217 c21217 = this.f54147;
        atomicBoolean = c21217.f68366;
        if (atomicBoolean.get()) {
            return true;
        }
        atomicReference = c21217.f68376;
        return atomicReference.get() != null;
    }
}

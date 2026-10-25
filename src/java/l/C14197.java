package l;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: LAQJ */
/* renamed from: l.ܳ֨ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14197 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f42854;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19277 f42855;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14561 f42856;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicReference f42853 = new AtomicReference();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayBlockingQueue f42857 = new ArrayBlockingQueue(20);

    public C14197(C14561 c14561, C19277 c19277) {
        this.f42856 = c14561;
        this.f42855 = c19277;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33866() {
        AtomicReference atomicReference = this.f42853;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }
}

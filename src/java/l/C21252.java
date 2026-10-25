package l;

import android.content.Intent;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: E4GI */
/* renamed from: l.᩸֨ܳ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21252 extends AbstractViewOnClickListenerC11726 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12079 f68478;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AtomicBoolean f68479;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21252(C12079 c12079, AbstractActivityC3346 abstractActivityC3346, AtomicBoolean atomicBoolean) {
        super(abstractActivityC3346, R.string.MT_Protector_res_0x7f1201a8);
        this.f68478 = c12079;
        this.f68479 = atomicBoolean;
    }

    @Override // l.AbstractViewOnClickListenerC11726
    /* renamed from: ܿ */
    public final void mo16437() {
        InterfaceC12784 interfaceC12784;
        String m28623 = m28623();
        if (m28623.isEmpty()) {
            C21374.m48462(R.string.MT_Protector_res_0x7f120305, 0).m48468();
            return;
        }
        synchronized (this.f68478) {
            if (!this.f68479.compareAndSet(false, true)) {
                m28620();
                return;
            }
            interfaceC12784 = this.f68478.f36117;
            interfaceC12784.mo15503(m28623);
            m28620();
            this.f68478.notify();
        }
    }

    @Override // l.AbstractViewOnClickListenerC11726
    /* renamed from: ܽ */
    public final void mo16436() {
        this.f68478.f36118 = true;
        synchronized (this.f68478) {
            if (this.f68479.compareAndSet(false, true)) {
                this.f68478.notify();
            }
        }
    }

    @Override // l.AbstractViewOnClickListenerC11726
    /* renamed from: ᩳ */
    public final void mo28626() {
        AbstractActivityC3346 abstractActivityC3346;
        AbstractActivityC3346 abstractActivityC33462;
        C12079 c12079 = this.f68478;
        abstractActivityC3346 = c12079.f36116;
        Intent intent = new Intent(abstractActivityC3346, (Class<?>) ActivityC3339.class);
        abstractActivityC33462 = c12079.f36116;
        abstractActivityC33462.startActivity(intent);
    }
}

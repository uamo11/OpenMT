package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: 8AI4 */
/* renamed from: l.֫᩷᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2083 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3163 f6946;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22933 f6947;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f6948;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f6949;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC21134 f6951;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11256 f6952;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f6950 = false;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AtomicReference f6953 = new AtomicReference();

    public C2083(C11256 c11256, AbstractC3163 abstractC3163, boolean z, boolean z2, RunnableC21134 runnableC21134) {
        this.f6952 = c11256;
        this.f6946 = abstractC3163;
        this.f6949 = z;
        this.f6948 = z2;
        this.f6951 = runnableC21134;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C16560 c16560;
        c16560 = this.f6952.f33735;
        C22933 c22933 = new C22933(c16560.m39056());
        c22933.m51049(R.string.MT_Protector_res_0x7f120948);
        c22933.m51040("...");
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f6947 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C3612 c3612;
        List list;
        C11256 c11256 = this.f6952;
        c3612 = c11256.f33733;
        final int m11081 = c3612.m11081();
        InterfaceC17066 interfaceC17066 = new InterfaceC17066() { // from class: l.ܰۜ᩻
            @Override // l.InterfaceC17066
            /* renamed from: ᩻ */
            public final boolean mo1526() {
                C2083 c2083 = C2083.this;
                return c2083.f6947.m51053() || c2083.f6953.get() != null;
            }
        };
        final AbstractC3163 abstractC3163 = this.f6946;
        C20720 c20720 = new C20720(abstractC3163, interfaceC17066);
        c20720.m47324(this.f6949);
        c20720.m47326(this.f6948);
        list = c11256.f33734;
        c20720.m47323(list, new InterfaceC23541() { // from class: l.۟ۜ᩻
            @Override // l.InterfaceC23541
            /* renamed from: ֫ */
            public final void mo14971(C6608 c6608, int i, int i2) {
                List<InterfaceC17889> list2;
                AbstractC3163 abstractC31632 = abstractC3163;
                int i3 = m11081;
                C2083 c2083 = C2083.this;
                C22933 c22933 = c2083.f6947;
                String str = c6608.f20344;
                String str2 = c6608.f20343;
                c22933.m51040(str);
                c2083.f6947.m51039(i, i2);
                try {
                    abstractC31632.mo9694(i3, str2);
                    c2083.f6950 = true;
                    if (str.indexOf(47) == -1) {
                        list2 = c2083.f6952.f33734;
                        for (InterfaceC17889 interfaceC17889 : list2) {
                            if (interfaceC17889.getPath().equals(str2)) {
                                AbstractC17191 abstractC17191 = (AbstractC17191) interfaceC17889;
                                C16477 mo24428 = abstractC17191.mo24428();
                                if (mo24428 != null) {
                                    abstractC17191.mo29864(mo24428.m38834(i3));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c2083.f6953;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f6947.m51053()) {
            return;
        }
        AtomicReference atomicReference = this.f6953;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f6947.m51053() || !this.f6950) {
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f120632);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16560 c16560;
        c16560 = this.f6952.f33735;
        c16560.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        if (this.f6950) {
            this.f6951.run();
        }
        this.f6947.m51051();
    }
}

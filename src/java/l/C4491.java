package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: B7T7 */
/* renamed from: l.ۙۜ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4491 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3163 f14290;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22933 f14291;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f14292;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f14293;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC21134 f14295;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3080 f14296;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f14294 = false;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AtomicReference f14297 = new AtomicReference();

    public C4491(C3080 c3080, AbstractC3163 abstractC3163, boolean z, boolean z2, RunnableC21134 runnableC21134) {
        this.f14296 = c3080;
        this.f14290 = abstractC3163;
        this.f14293 = z;
        this.f14292 = z2;
        this.f14295 = runnableC21134;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C16560 c16560;
        c16560 = this.f14296.f9654;
        C22933 c22933 = new C22933(c16560.m39056());
        c22933.m51049(R.string.MT_Protector_res_0x7f120948);
        c22933.m51040("...");
        c22933.mo49542((Runnable) null);
        c22933.mo49547();
        this.f14291 = c22933;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C5902 c5902;
        C5902 c59022;
        C5902 c59023;
        C5902 c59024;
        List list;
        C3080 c3080 = this.f14296;
        c5902 = c3080.f9652;
        final int m16557 = c5902.m16557();
        c59022 = c3080.f9652;
        final int m16553 = c59022.m16553();
        c59023 = c3080.f9652;
        final String m16559 = c59023.m16559();
        c59024 = c3080.f9652;
        final String m16555 = c59024.m16555();
        C20720 c20720 = new C20720(this.f14290, new InterfaceC17066() { // from class: l.᩹ۜ᩻
            @Override // l.InterfaceC17066
            /* renamed from: ᩻ */
            public final boolean mo1526() {
                C4491 c4491 = C4491.this;
                return c4491.f14291.m51053() || c4491.f14297.get() != null;
            }
        });
        c20720.m47324(this.f14293);
        c20720.m47326(this.f14292);
        list = c3080.f9653;
        final AbstractC3163 abstractC3163 = this.f14290;
        c20720.m47323(list, new InterfaceC23541() { // from class: l.᩶ۜ᩻
            @Override // l.InterfaceC23541
            /* renamed from: ֫ */
            public final void mo14971(C6608 c6608, int i, int i2) {
                List<InterfaceC17889> list2;
                AbstractC3163 abstractC31632 = abstractC3163;
                int i3 = m16557;
                int i4 = m16553;
                String str = m16559;
                String str2 = m16555;
                C4491 c4491 = C4491.this;
                C22933 c22933 = c4491.f14291;
                String str3 = c6608.f20344;
                String str4 = c6608.f20343;
                c22933.m51040(str3);
                c4491.f14291.m51039(i, i2);
                try {
                    abstractC31632.mo9683(i3, i4, str4);
                    c4491.f14294 = true;
                    if (str3.indexOf(47) == -1) {
                        list2 = c4491.f14296.f9653;
                        for (InterfaceC17889 interfaceC17889 : list2) {
                            if (interfaceC17889.getPath().equals(str4)) {
                                AbstractC17191 abstractC17191 = (AbstractC17191) interfaceC17889;
                                C16477 mo24428 = abstractC17191.mo24428();
                                if (mo24428 != null) {
                                    abstractC17191.mo29864(mo24428.m38836(str, str2));
                                    return;
                                }
                                return;
                            }
                        }
                    }
                } catch (Exception e) {
                    AtomicReference atomicReference = c4491.f14297;
                    Exception exc = new Exception(e.getMessage() + MotionUtils.EASING_TYPE_FORMAT_START + str3 + MotionUtils.EASING_TYPE_FORMAT_END, e);
                    while (!atomicReference.compareAndSet(null, exc) && atomicReference.get() == null) {
                    }
                }
            }
        });
        if (this.f14291.m51053()) {
            return;
        }
        AtomicReference atomicReference = this.f14297;
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f14291.m51053() || !this.f14294) {
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f120632);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16560 c16560;
        c16560 = this.f14296.f9654;
        c16560.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        if (this.f14294) {
            this.f14295.run();
        }
        this.f14291.m51051();
    }
}

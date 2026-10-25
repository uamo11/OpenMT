package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: SAKA */
/* renamed from: l.ܿ֫᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17046 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23396 f52237;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1000 f52238;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f52239;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f52241;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f52242;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f52240 = false;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C8817 f52243 = C8817.m22790();

    public C17046(C23396 c23396, long j, boolean z, boolean z2, RunnableC1000 runnableC1000) {
        this.f52237 = c23396;
        this.f52241 = j;
        this.f52242 = z;
        this.f52239 = z2;
        this.f52238 = runnableC1000;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C16560 c16560;
        c16560 = this.f52237.f75155;
        m20267(c16560.m39056(), R.string.MT_Protector_res_0x7f120797);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        List<InterfaceC17889> list;
        List<InterfaceC17889> list2;
        ArrayList arrayList = new ArrayList();
        C23396 c23396 = this.f52237;
        list = c23396.f75153;
        for (InterfaceC17889 interfaceC17889 : list) {
            AbstractC15440 mo24433 = interfaceC17889.mo24433();
            String name = interfaceC17889.getName();
            if ((this.f52242 || this.f52239) && interfaceC17889.isDirectory() && !interfaceC17889.mo36978()) {
                for (AbstractC15440 abstractC15440 : mo24433.mo23549(true)) {
                    StringBuilder m19190 = C7166.m19190(name, "/");
                    m19190.append(abstractC15440.getName());
                    m40013(arrayList, abstractC15440, m19190.toString());
                }
            }
            arrayList.add(new C14223(mo24433, name));
        }
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C14223 c14223 = (C14223) it.next();
                if (this.f52243.m22791()) {
                    this.f23322.m31861(c14223.f42897);
                }
                AbstractC15440 abstractC154402 = c14223.f42896;
                if (abstractC154402.mo27912() && abstractC154402.mo18537(this.f52241)) {
                    this.f52240 = true;
                }
            }
        } finally {
            if (this.f52240) {
                list2 = c23396.f75153;
                for (InterfaceC17889 interfaceC178892 : list2) {
                    interfaceC178892.setTime(interfaceC178892.mo24433().mo23117());
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m40013(ArrayList arrayList, AbstractC15440 abstractC15440, String str) {
        if (abstractC15440.m36533()) {
            return;
        }
        if (!abstractC15440.mo23113()) {
            if (this.f52242) {
                arrayList.add(new C14223(abstractC15440, str));
                return;
            }
            return;
        }
        for (AbstractC15440 abstractC154402 : abstractC15440.mo23549(true)) {
            StringBuilder m19190 = C7166.m19190(str, "/");
            m19190.append(abstractC154402.getName());
            m40013(arrayList, abstractC154402, m19190.toString());
        }
        if (this.f52239) {
            arrayList.add(new C14223(abstractC15440, str));
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f52240) {
            this.f52238.run();
            C21374.m48457(R.string.MT_Protector_res_0x7f120632);
        } else {
            C21374.m48457(R.string.MT_Protector_res_0x7f120631);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16560 c16560;
        if (this.f52240) {
            this.f52238.run();
        }
        c16560 = this.f52237.f75155;
        c16560.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}

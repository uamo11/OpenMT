package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: F180 */
/* renamed from: l.֨֫᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0818 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f2985;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1000 f2986;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f2987 = false;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f2988;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14929 f2989;

    public C0818(C14929 c14929, boolean z, boolean z2, RunnableC1000 runnableC1000) {
        this.f2989 = c14929;
        this.f2988 = z;
        this.f2985 = z2;
        this.f2986 = runnableC1000;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C16560 c16560;
        c16560 = this.f2989.f45514;
        m20267(c16560.m39056(), R.string.MT_Protector_res_0x7f120797);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        List list;
        C3612 c3612;
        C11293 m31569;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C14929 c14929 = this.f2989;
        list = c14929.f45513;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9555 c9555 = (C9555) ((InterfaceC17889) it.next());
            if (c9555.m24436()) {
                arrayList.add(c9555);
            } else {
                arrayList2.add(c9555);
            }
        }
        c3612 = c14929.f45512;
        int m11081 = c3612.m11081();
        boolean isEmpty = arrayList2.isEmpty();
        boolean z = this.f2985;
        boolean z2 = this.f2988;
        if (!isEmpty) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C9555 c95552 = (C9555) it2.next();
                this.f23322.m31861(c95552.getName());
                String path = c95552.getPath();
                AbstractC15440 m39866 = C16999.m39866(path, new String[0]);
                if ((m39866 instanceof C12993) && (m31569 = ((C12993) m39866).m31569()) != null) {
                    path = m31569.mo23554();
                }
                C20402.m46726(path, m11081, z2, z);
                c95552.m24429(c95552.mo24428().m38834(m11081));
                this.f2987 = true;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C9555 c95553 = (C9555) it3.next();
            AbstractC15440 mo24433 = c95553.mo24433();
            String name = c95553.getName();
            mo24433.getClass();
            if (mo24433 instanceof C13198) {
                arrayList3.add(new C7874(mo24433.mo32036(), name, c95553));
            }
            if (z || z2) {
                if (c95553.isDirectory() && !c95553.mo36978()) {
                    for (AbstractC15440 abstractC15440 : mo24433.mo23549(true)) {
                        StringBuilder m19190 = C7166.m19190(name, "/");
                        m19190.append(abstractC15440.getName());
                        m3066(arrayList3, abstractC15440, m19190.toString());
                    }
                }
            }
        }
        C8817 m22790 = C8817.m22790();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C7874 c7874 = (C7874) it4.next();
            if (m22790.m22791()) {
                this.f23322.m31861(c7874.f24417);
            }
            if (c7874.f24415.m32030(m11081)) {
                C9555 c95554 = c7874.f24416;
                if (c95554 != null) {
                    c95554.m24429(c95554.mo24428().m38834(m11081));
                }
                this.f2987 = true;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3066(ArrayList arrayList, AbstractC15440 abstractC15440, String str) {
        if (abstractC15440.m36533()) {
            return;
        }
        if (!abstractC15440.mo23113()) {
            if (this.f2985 && (abstractC15440 instanceof C13198)) {
                arrayList.add(new C7874((C13198) abstractC15440, str, null));
                return;
            }
            return;
        }
        if (this.f2988 && (abstractC15440 instanceof C13198)) {
            arrayList.add(new C7874((C13198) abstractC15440, str, null));
        }
        for (AbstractC15440 abstractC154402 : abstractC15440.mo23549(true)) {
            StringBuilder m19190 = C7166.m19190(str, "/");
            m19190.append(abstractC154402.getName());
            m3066(arrayList, abstractC154402, m19190.toString());
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        this.f2986.run();
        C21374.m48457(R.string.MT_Protector_res_0x7f120632);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16560 c16560;
        if (this.f2987) {
            this.f2986.run();
        }
        c16560 = this.f2989.f45514;
        c16560.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}

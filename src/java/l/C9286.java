package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* compiled from: M4QY */
/* renamed from: l.ۢ֫᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9286 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f28127;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1000 f28128;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f28129 = false;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f28130;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8580 f28131;

    public C9286(C8580 c8580, boolean z, boolean z2, RunnableC1000 runnableC1000) {
        this.f28131 = c8580;
        this.f28130 = z;
        this.f28127 = z2;
        this.f28128 = runnableC1000;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C16560 c16560;
        c16560 = this.f28131.f26212;
        m20267(c16560.m39056(), R.string.MT_Protector_res_0x7f120797);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C0112 c0112;
        C0112 c01122;
        List list;
        C11293 m31569;
        C8580 c8580 = this.f28131;
        c0112 = c8580.f26210;
        int m1106 = c0112.m1106();
        c01122 = c8580.f26210;
        int m1104 = c01122.m1104();
        list = c8580.f26211;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C9555 c9555 = (C9555) ((InterfaceC17889) it.next());
            this.f23322.m31861(c9555.getName());
            if (c9555.m24436()) {
                throw new IOException("Unable to chown '" + c9555.getPath() + "': Unsupported operation");
            }
            String path = c9555.getPath();
            AbstractC15440 m39866 = C16999.m39866(path, new String[0]);
            if ((m39866 instanceof C12993) && (m31569 = ((C12993) m39866).m31569()) != null) {
                path = m31569.mo23554();
            }
            C20402.m46725(path, m1106, m1104, this.f28130, this.f28127);
            c9555.m24429(c9555.mo24428().m38835(m1106, m1104));
            this.f28129 = true;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        this.f28128.run();
        C21374.m48457(R.string.MT_Protector_res_0x7f120632);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16560 c16560;
        if (this.f28129) {
            this.f28128.run();
        }
        c16560 = this.f28131.f26212;
        c16560.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}

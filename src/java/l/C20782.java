package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: TAIM */
/* renamed from: l.᩷ۡ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20782 extends AbstractC7548 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f67300;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7379 f67302;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f67303;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1848 f67304;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3163 f67305;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5259 f67306;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public ArrayList f67307 = new ArrayList();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C4300 f67301 = new C4300(0);

    public C20782(C5259 c5259, C16560 c16560, C20765 c20765, ArrayList arrayList, AbstractC3163 abstractC3163) {
        this.f67306 = c5259;
        this.f67300 = c16560;
        this.f67302 = c20765;
        this.f67303 = arrayList;
        this.f67305 = abstractC3163;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C1848 c1848 = new C1848(this.f67300.m39056());
        c1848.m6158(C4925.m14333(R.string.MT_Protector_res_0x7f120ac2));
        c1848.m6147((RunnableC1126) null);
        c1848.m6153();
        this.f67304 = c1848;
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f67303.iterator();
        long j = 0;
        while (it.hasNext()) {
            C5977 c5977 = (C5977) it.next();
            if (c5977.m16773()) {
                arrayList.add(c5977);
                j += c5977.m16768().mo23127();
            }
        }
        C20876 c20876 = new C20876(arrayList.size(), j);
        this.f67304.m6150(true);
        C8102 c8102 = new C8102(this.f67305);
        C6670 c6670 = new C6670(this, c20876);
        C4300 c4300 = this.f67301;
        c4300.m12878();
        try {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C5977 c59772 = (C5977) it2.next();
                this.f67304.m6156(c59772.m16774());
                c8102.m21535(C2499.f7958, c59772.m16768().mo23554(), c59772.m16770(), C19890.f64276, c6670);
                if (this.f67304.m6160() || this.f67302.mo19832() == EnumC13728.DESTROYED) {
                    return;
                }
                c59772.m16771();
                c20876.m47715();
                this.f67307.add(c59772.m16774());
            }
        } finally {
            c4300.m12879();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C5259 c5259 = this.f67306;
        c5259.f16463 = false;
        if (this.f67304.m6160()) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12003d);
            c5259.m15155(this.f67300, this.f67303, C4925.m14327(R.string.MT_Protector_res_0x7f120ac1), true);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f67306.f16463 = false;
        final C16560 c16560 = this.f67300;
        Main m39056 = c16560.m39056();
        final ArrayList arrayList = this.f67303;
        m39056.m10223(exc, new DialogInterface.OnDismissListener() { // from class: l.᩻ۡ᩻
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C20782.this.f67306.m15155(c16560, arrayList, C4925.m14327(R.string.MT_Protector_res_0x7f120ac1), true);
            }
        });
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        this.f67304.m6151();
        ArrayList arrayList = this.f67307;
        C16560 c16560 = this.f67300;
        c16560.m39000((Collection) arrayList);
        c16560.m39015();
        C15528.m36595(this.f67305.mo9688());
    }
}

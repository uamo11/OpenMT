package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: 31K1 */
/* renamed from: l.ۘۤ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3888 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18705 f12437;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ LinkedHashMap f12438;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f12439;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f12440;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f12441 = new IdentityHashMap();

    public C3888(C18705 c18705, LinkedHashMap linkedHashMap, AbstractC15440 abstractC15440) {
        this.f12437 = c18705;
        this.f12438 = linkedHashMap;
        this.f12440 = abstractC15440;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f12437.f59141, R.string.MT_Protector_res_0x7f1208d2);
        for (C12392 c12392 : this.f12438.values()) {
            this.f12441.put(c12392, Boolean.valueOf(c12392.m30441()));
            c12392.m30407(true);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C12230 c12230;
        C12366 c12366;
        C12366 c123662;
        C12366 c123663;
        C12366 c123664;
        C12366 c123665;
        C11005 c11005;
        C11005 c110052;
        C11005 c110053;
        C12366 c123666;
        C12366 c123667;
        C12366 c123668;
        AbstractC15440 abstractC15440 = this.f12440;
        LinkedHashMap linkedHashMap = this.f12438;
        ActivityC17169 activityC17169 = this.f12437.f59141;
        c12230 = activityC17169.f52608;
        c12230.m29734();
        c12366 = activityC17169.f52606;
        if (c12366 != null) {
            c123668 = activityC17169.f52606;
            c123668.m30051();
        }
        Exception exc = null;
        try {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                ((C12392) it.next()).m30447().m10930();
            }
            c11005 = activityC17169.f52620;
            C22477.m50426(C6646.of(c11005.m27339(), new String[0])).m10930();
            c110052 = activityC17169.f52620;
        } catch (Exception e) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC14346) entry.getKey()).mo17427() == entry.getValue()) {
                        ((C12392) entry.getValue()).m30336(((AbstractC14346) entry.getKey()).m34236(activityC17169.m40356()).m27340());
                    }
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
            }
            c123664 = activityC17169.f52606;
            if (c123664 != null) {
                c123665 = activityC17169.f52606;
                c123665.m30061();
            }
            exc = e;
        } catch (Throwable th) {
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                try {
                    if (((AbstractC14346) entry2.getKey()).mo17427() == entry2.getValue()) {
                        ((C12392) entry2.getValue()).m30336(((AbstractC14346) entry2.getKey()).m34236(activityC17169.m40356()).m27340());
                    }
                } catch (Exception e3) {
                    if (exc == null) {
                        exc = e3;
                    } else {
                        exc.addSuppressed(e3);
                    }
                }
            }
            c123662 = activityC17169.f52606;
            if (c123662 != null) {
                c123663 = activityC17169.f52606;
                c123663.m30061();
            }
            throw th;
        }
        if (!c110052.m27340().mo23551(abstractC15440)) {
            throw new C19401("Move project directory failed.");
        }
        c110053 = activityC17169.f52620;
        c110053.m27331(abstractC15440);
        this.f12439 = true;
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            try {
                if (((AbstractC14346) entry3.getKey()).mo17427() == entry3.getValue()) {
                    ((C12392) entry3.getValue()).m30336(((AbstractC14346) entry3.getKey()).m34236(activityC17169.m40356()).m27340());
                }
            } catch (Exception e4) {
                if (exc == null) {
                    exc = e4;
                } else {
                    exc.addSuppressed(e4);
                }
            }
        }
        c123666 = activityC17169.f52606;
        if (c123666 != null) {
            c123667 = activityC17169.f52606;
            c123667.m30061();
        }
        if (exc != null) {
            throw exc;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        C18705 c18705 = this.f12437;
        c18705.m31262();
        ActivityC17169 activityC17169 = c18705.f59141;
        DialogInterfaceOnClickListenerC10816.m27035(activityC17169, "save_as_project1", activityC17169.getString(R.string.MT_Protector_res_0x7f1208c9), true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f12437.f59141.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C3764 c3764;
        C11005 c11005;
        C3764 c37642;
        ActivityC17169 activityC17169 = this.f12437.f59141;
        if (this.f12439) {
            activityC17169.f52619 = null;
            c3764 = activityC17169.f52607;
            C5242 m11403 = c3764.m11403();
            c11005 = activityC17169.f52620;
            m11403.mo1664((Object) c11005.getName());
            c37642 = activityC17169.f52607;
            c37642.m11418().mo1669(Boolean.FALSE);
        }
        for (Map.Entry entry : this.f12438.entrySet()) {
            if (((AbstractC14346) entry.getKey()).getView() != null) {
                ((C12392) entry.getValue()).m30407(((Boolean) this.f12441.get(entry.getValue())).booleanValue());
            }
        }
        m20273();
    }
}

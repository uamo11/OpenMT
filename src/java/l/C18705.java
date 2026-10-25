package l;

import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: 31K1 */
/* renamed from: l.ᩴۤ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18705 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f59140;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17169 f59141;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18705(ActivityC17169 activityC17169, ActivityC17169 activityC171692, AbstractC15440 abstractC15440) {
        super(activityC171692, -1);
        this.f59141 = activityC17169;
        this.f59140 = abstractC15440;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        ArrayList arrayList;
        String m31260 = m31260();
        if (m31260.contains("/") || m31260.contains("\\")) {
            m31263(R.string.MT_Protector_res_0x7f1207ac);
            return;
        }
        AbstractC15440 m36526 = this.f59140.m36526(m31260);
        if (m36526.mo23120()) {
            m31263(R.string.MT_Protector_res_0x7f1207ab);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            arrayList = this.f59141.f52616;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC14346 abstractC14346 = (AbstractC14346) it.next();
                C12392 mo17427 = abstractC14346.mo17427();
                if (mo17427 != null) {
                    linkedHashMap.put(abstractC14346, mo17427);
                }
            }
            new C3888(this, linkedHashMap, m36526).m20274();
        } catch (IllegalStateException unused) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1201f1);
        }
    }
}

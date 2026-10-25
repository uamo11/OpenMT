package l;

import bin.mt.plus.R;
import java.util.Iterator;

/* compiled from: K5R1 */
/* renamed from: l.۫᩻ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12745 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC6604 f38318;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12745(ActivityC6604 activityC6604, ActivityC6604 activityC66042) {
        super(activityC66042, -1);
        this.f38318 = activityC6604;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        String str;
        String str2;
        ActivityC6604.f20334 = m31260();
        str = ActivityC6604.f20334;
        String trim = str.toLowerCase().trim();
        if (trim.length() > 0) {
            if (trim.startsWith("@") || trim.startsWith("?")) {
                trim = trim.substring(1);
            } else if (trim.startsWith("0x")) {
                trim = trim.substring(2);
            }
            if (!C9896.m24990(trim)) {
                m31263(R.string.MT_Protector_res_0x7f120b48);
                return;
            }
            int m24993 = C9896.m24993(trim);
            int i = (m24993 >>> 24) & 255;
            int i2 = (m24993 >>> 16) & 255;
            int i3 = m24993 & 65535;
            ActivityC6604 activityC6604 = this.f38318;
            for (InterfaceC4277 interfaceC4277 : activityC6604.f20336.f75578.mo21936()) {
                if (interfaceC4277.mo12858() == i) {
                    for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                        if (interfaceC0748.mo2870() == i2) {
                            Iterator it = interfaceC0748.mo2872().iterator();
                            while (it.hasNext()) {
                                for (InterfaceC21211 interfaceC21211 : ((InterfaceC7099) it.next()).mo18746()) {
                                    if (interfaceC21211.mo47883() == i3) {
                                        activityC6604.f20336.f75572.add((C18906) interfaceC21211);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            str2 = ActivityC6604.f20334;
            activityC6604.setTitle(str2);
            activityC6604.m18107(EnumC4487.SEARCH_BY_ID);
            m31262();
        }
    }
}

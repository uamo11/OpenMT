package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.d;

/* compiled from: I1KV */
/* renamed from: l.ۚܰ᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5400 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16810;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f16811;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16812;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f16813;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5400(ViewOnClickListenerC21628 viewOnClickListenerC21628, AbstractActivityC3346 abstractActivityC3346, String str, String str2, String str3) {
        super(abstractActivityC3346, -1);
        this.f16811 = viewOnClickListenerC21628;
        this.f16813 = str;
        this.f16812 = str2;
        this.f16810 = str3;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C3764 c3764;
        C19452 c19452;
        C19452 c194522;
        C3764 c37642;
        C19452 c194523;
        String str = this.f16812;
        ViewOnClickListenerC21628 viewOnClickListenerC21628 = this.f16811;
        String m31260 = m31260();
        String str2 = this.f16813;
        if (!m31260.startsWith(str2)) {
            m31251(d.O);
            return;
        }
        try {
            String substring = m31260.substring(str2.length());
            c19452 = viewOnClickListenerC21628.f69432;
            String str3 = str + "/" + str2 + C21707.m48999(substring, c19452.m44847(str)).m49025();
            c194522 = viewOnClickListenerC21628.f69432;
            if (c194522.m44838(str3)) {
                m31263(R.string.MT_Protector_res_0x7f1206b1);
                return;
            }
            try {
                c194523 = viewOnClickListenerC21628.f69432;
                c194523.m44819(str3, this.f16810);
                viewOnClickListenerC21628.m48890();
                viewOnClickListenerC21628.m48891(str3);
                m31262();
            } catch (Exception e) {
                c37642 = viewOnClickListenerC21628.f69427;
                c37642.m11384((Throwable) e);
            }
        } catch (Exception e2) {
            c3764 = viewOnClickListenerC21628.f69427;
            c3764.m11384((Throwable) e2);
        }
    }
}

package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.util.Collections;

/* compiled from: I1KV */
/* renamed from: l.֨ܰ᩷, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1166 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4208;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC21628 f4209;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4210;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4211;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f4212;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1166(ViewOnClickListenerC21628 viewOnClickListenerC21628, AbstractActivityC3346 abstractActivityC3346, String str, String str2, String str3, String str4) {
        super(abstractActivityC3346, -1);
        this.f4209 = viewOnClickListenerC21628;
        this.f4208 = str;
        this.f4212 = str2;
        this.f4211 = str3;
        this.f4210 = str4;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        C3764 c3764;
        C19452 c19452;
        C19452 c194522;
        C3764 c37642;
        C19452 c194523;
        String m31260 = m31260();
        if (this.f4208.equals(m31260)) {
            m31262();
            return;
        }
        if (!m31260.startsWith(this.f4212)) {
            m31251(d.O);
            return;
        }
        try {
            String substring = m31260.substring(this.f4212.length());
            c19452 = this.f4209.f69432;
            String m49025 = C21707.m48999(substring, c19452.m44847(this.f4211)).m49025();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4210);
            String m23341 = C9045.m23341(sb, this.f4212, m49025);
            c194522 = this.f4209.f69432;
            if (c194522.m44838(m23341)) {
                m31263(R.string.MT_Protector_res_0x7f1206b1);
                return;
            }
            try {
                c194523 = this.f4209.f69432;
                String str = this.f4211;
                synchronized (c194523) {
                    String m44856 = c194523.m44856(str);
                    c194523.m44820(Collections.singleton(str));
                    c194523.m44819(m23341, m44856);
                }
                this.f4209.m48890();
                this.f4209.m48891(m23341);
                m31262();
            } catch (Exception e) {
                c37642 = this.f4209.f69427;
                c37642.m11384((Throwable) e);
            }
        } catch (Exception e2) {
            c3764 = this.f4209.f69427;
            c3764.m11384((Throwable) e2);
        }
    }
}

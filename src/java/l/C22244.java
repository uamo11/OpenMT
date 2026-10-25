package l;

import bin.mt.plus.R;
import java.util.HashSet;

/* compiled from: P67V */
/* renamed from: l.᩹ۧۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C22244 implements InterfaceC2343, InterfaceC18862, InterfaceC7550, InterfaceC23049 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f72176;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f72177;

    public /* synthetic */ C22244(int i, Object obj) {
        this.f72176 = i;
        this.f72177 = obj;
    }

    @Override // l.InterfaceC2343
    /* renamed from: ֫ */
    public void mo6264(int i) {
        switch (this.f72176) {
            case 0:
                ((InterfaceC10956) this.f72177).mo22800(i);
                break;
            default:
                ((C12143) this.f72177).mo11538(i);
                break;
        }
    }

    @Override // l.InterfaceC23049
    /* renamed from: ֫ */
    public int mo2075(String str, boolean z) {
        return ((HashSet) this.f72177).contains(str) ? 1 : 2;
    }

    @Override // l.InterfaceC7550
    /* renamed from: ֫ */
    public CharSequence mo7073(C2095 c2095) {
        C6791 c6791 = (C6791) this.f72177;
        return c6791.m6886().getString(R.string.MT_Protector_res_0x7f12052a, Integer.valueOf(c6791.m11313().getInt(c6791.m6911(), 10)));
    }

    @Override // l.InterfaceC18862
    /* renamed from: ۧ */
    public void mo6267(AbstractC15440 abstractC15440) {
        C16458.m38764((C16560) this.f72177, abstractC15440);
    }
}

package l;

import android.graphics.Bitmap;
import bin.mt.plus.R;

/* compiled from: 91U1 */
/* renamed from: l.ۜۛۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6576 implements InterfaceC12784, InterfaceC4644, InterfaceC7550, InterfaceC3969, InterfaceC2343 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f20279;

    public /* synthetic */ C6576(Object obj) {
        this.f20279 = obj;
    }

    @Override // l.InterfaceC12784
    /* renamed from: ֫ */
    public void mo15503(String str) {
        ((C18090) this.f20279).m42192(str);
    }

    @Override // l.InterfaceC3969
    /* renamed from: ۧ */
    public String mo12011() {
        String m21120;
        m21120 = r0.m21120(r0.f24368, ((C7864) this.f20279).f24372);
        return m21120;
    }

    @Override // l.InterfaceC4644
    /* renamed from: ֫ */
    public Bitmap mo5660() {
        return C17447.m40782((InterfaceC11098) this.f20279);
    }

    @Override // l.InterfaceC7550
    /* renamed from: ֫ */
    public CharSequence mo7073(C2095 c2095) {
        C21362 c21362 = (C21362) this.f20279;
        return c21362.m6886().getString(R.string.MT_Protector_res_0x7f120470, c21362.m11313().getString(c21362.m6911(), "10MB"));
    }

    @Override // l.InterfaceC2343
    /* renamed from: ֫ */
    public void mo6264(final int i) {
        final InterfaceC2343 interfaceC2343 = (InterfaceC2343) this.f20279;
        C4925.m14315(new Runnable() { // from class: l.᩷ۛۡ
            @Override // java.lang.Runnable
            public final void run() {
                interfaceC2343.mo6264(i);
            }
        });
    }
}

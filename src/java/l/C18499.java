package l;

import android.view.MenuItem;
import bin.mt.plus.R;

/* compiled from: R77X */
/* renamed from: l.ᩴۗ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C18499 implements InterfaceC14930, InterfaceC7305, InterfaceC16348, InterfaceC23206 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57334;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f57335;

    public /* synthetic */ C18499(Object obj, Object obj2) {
        this.f57334 = obj;
        this.f57335 = obj2;
    }

    @Override // l.InterfaceC23206
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC16348
    /* renamed from: ֫ */
    public C3059 mo22666(String str, String str2, String str3) {
        return C0859.m3152((C0859) this.f57334, (AbstractC15440) this.f57335, str, str2, str3);
    }

    @Override // l.InterfaceC23206
    /* renamed from: ֫ */
    public void mo8486(String str) {
        C5839.m16352((C5839) this.f57334, (AbstractActivityC3346) this.f57335, str);
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        InterfaceC5711 interfaceC5711 = (InterfaceC5711) this.f57334;
        C5732 c5732 = (C5732) this.f57335;
        int itemId = menuItem.getItemId();
        if (itemId == R.string.MT_Protector_res_0x7f120945) {
            ApplicationC20075.f65008.edit().putString("dsai", interfaceC5711.mo8896().flattenToString()).apply();
            C21374.m48457(R.string.MT_Protector_res_0x7f120717);
            return true;
        }
        if (itemId != R.string.MT_Protector_res_0x7f120712) {
            return true;
        }
        c5732.m16165(interfaceC5711);
        return true;
    }

    @Override // l.InterfaceC7305
    /* renamed from: ֫ */
    public void mo10987(final C10211 c10211) {
        final C16560 c16560 = (C16560) this.f57334;
        final C2450 c2450 = (C2450) this.f57335;
        c10211.m25619();
        c16560.m39044().m39738(c16560, c16560.m39025(), new InterfaceC7305() { // from class: l.ۡ֡ܳ
            @Override // l.InterfaceC7305
            /* renamed from: ֫ */
            public final void mo10987(C10211 c102112) {
                String name;
                String name2;
                c102112.m25619();
                C10211 c102113 = C10211.this;
                AbstractC15440 m25622 = c102113.m25622();
                AbstractC15440 m256222 = c102112.m25622();
                C2450 c24502 = c2450;
                boolean m39064 = c24502.m7921().m39064();
                if (m25622.getName().equals(m256222.getName())) {
                    int i = R.string.MT_Protector_res_0x7f1201c0;
                    name = C4925.m14306(m39064 ? R.string.MT_Protector_res_0x7f1201bf : R.string.MT_Protector_res_0x7f1201c0, m25622.getName());
                    if (!m39064) {
                        i = R.string.MT_Protector_res_0x7f1201bf;
                    }
                    name2 = C4925.m14306(i, m256222.getName());
                } else {
                    name = m25622.getName();
                    name2 = m256222.getName();
                }
                C7309 c7309 = new C7309(c102113.m25622(), c102112.m25622(), name, name2, c24502.m7922(), c16560.m39044());
                if (!m39064) {
                    c7309.m19594();
                }
                C12492.m30659(c24502.m7921(), c7309);
            }
        });
    }
}

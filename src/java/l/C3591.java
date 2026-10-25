package l;

import bin.mt.plus.R;

/* compiled from: D1Q7 */
/* renamed from: l.ۘ֡ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3591 implements InterfaceC7305, InterfaceC23425 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11404;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f11405;

    public /* synthetic */ C3591(Object obj, Object obj2) {
        this.f11404 = obj;
        this.f11405 = obj2;
    }

    @Override // l.InterfaceC23425
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String mo10986(C3104 c3104) {
        String m38731;
        m38731 = ((ActivityC10227) this.f11404).f30744.m38731(c3104, (C23713) this.f11405);
        return m38731;
    }

    @Override // l.InterfaceC7305
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo10987(final C10211 c10211) {
        final C16560 c16560 = (C16560) this.f11404;
        final C2450 c2450 = (C2450) this.f11405;
        c10211.m25619();
        c16560.m39044().m39738(c16560, c16560.m39025(), new InterfaceC7305() { // from class: l.ᩴ֡ܳ
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
                C19738.m45446(c24502.m7921(), c7309);
            }
        });
    }
}

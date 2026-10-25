package l;

import bin.mt.plus.R;

/* compiled from: G97V */
/* renamed from: l.᩵᩸᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19744 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        C21234 m30959;
        C16560 m7919 = c2450.m7919();
        if (m7919.m39038()) {
            return false;
        }
        for (InterfaceC17889 interfaceC17889 : c2450.m7909()) {
            if ((interfaceC17889 instanceof C12687) && (m30959 = ((C12687) interfaceC17889).m30959()) != null) {
                String lowerCase = m30959.m48203().toLowerCase();
                if (lowerCase.startsWith("android/data/") || lowerCase.startsWith("android/obb/")) {
                    return false;
                }
            }
        }
        return c2450.m7916("trash") && m7919.m39035("local");
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        c2450.m7907("trash");
        m7919.m38998("local");
        m5602(c2450, R.string.MT_Protector_res_0x7f1205ec, AbstractC1661.m5600(c2450, R.string.MT_Protector_res_0x7f1205ec));
    }

    @Override // l.AbstractC1661
    /* renamed from: ܿ */
    public final void mo2321(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        m7919.m38998("local");
        int i = C15104.f46193;
        C0994 c0994 = new C0994(C19038.class);
        c0994.m3485(c2450.m7909());
        c0994.m3484(c2450);
        c0994.m3474("ARG_MSG_FROM", c2450.m7910());
        c0994.m3474("ARG_MSG_TO", m7919.m38990());
        c0994.m3474("sourcePath", c2450.m7925());
        c0994.m3474("targetPath", m7919.m39020());
        c0994.m3469();
    }
}

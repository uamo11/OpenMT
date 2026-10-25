package l;

import bin.mt.plus.Main;
import com.alipay.sdk.m.m.b;

/* compiled from: B942 */
/* renamed from: l.ۛܽ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6190 extends AbstractC1661 {
    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return (c2450.m7916("local") || c2450.m7916(b.k)) && c2450.m7918() == 1;
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        Main m7917 = c2450.m7917();
        InterfaceC17889 m7913 = c2450.m7913();
        if (m7913 instanceof AbstractC17191) {
            C3535 c3535 = new C3535(m7917);
            C15688 c15688 = (C15688) m7913;
            c3535.m10732(c15688.mo36985());
            C3695.f11656.getClass();
            c3535.m10733(new C12002(C3256.m9975(m7913)));
            c3535.m10737("open-ns");
            c3535.m10738(c15688.getPath());
            c3535.m10730();
            c3535.m10731(((C5259) c2450.m7922()).m15168());
            c3535.m10734(c15688.isDirectory());
            c3535.m10736();
            return;
        }
        String[] strArr = m7913.isDirectory() ? new String[]{"goto", "locate"} : new String[]{"locate", "locate-click", "edit-text", "exec-script", "preview-html"};
        C3535 c35352 = new C3535(m7917);
        c35352.m10732(m7913.mo36985());
        c35352.m10733(new C12002(C20844.f67485.mo11258(m7913)));
        c35352.m10735(strArr);
        c35352.m10738(m7913.getPath());
        c35352.m10730();
        c35352.m10736();
    }
}

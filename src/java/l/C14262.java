package l;

/* renamed from: l.ܳۗ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C14262 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10318 m33911(C1646 c1646, InterfaceC19763 interfaceC19763) {
        InterfaceC14801 mo13851;
        AbstractC10736 c8887;
        EnumC7208 enumC7208 = EnumC7208.DEFAULT;
        InterfaceC14801 m5528 = c1646.m5528();
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) m5528.mo13850(bool, C21320.f68708)).booleanValue();
        boolean booleanValue2 = bool.booleanValue();
        C23974 c23974 = C23974.f77731;
        if (booleanValue || booleanValue2) {
            C23932 c23932 = new C23932();
            c23932.f77612 = c23974;
            InterfaceC14801 interfaceC14801 = (InterfaceC14801) m5528.mo13850(c23974, new C14968(c23932));
            if (booleanValue2) {
                c23932.f77612 = ((InterfaceC14801) c23932.f77612).mo13850(c23974, C7913.f24500);
            }
            mo13851 = interfaceC14801.mo13851((InterfaceC14801) c23932.f77612);
        } else {
            mo13851 = m5528.mo13851(c23974);
        }
        if (mo13851 != C9613.m24545() && mo13851.mo9082(InterfaceC7557.f23344) == null) {
            mo13851 = mo13851.mo13851(C9613.m24545());
        }
        if (enumC7208.m19294()) {
            c8887 = new C14530(mo13851, interfaceC19763);
        } else {
            c8887 = new C8887(mo13851, true);
        }
        enumC7208.m19293(interfaceC19763, c8887, c8887);
        return c8887;
    }
}

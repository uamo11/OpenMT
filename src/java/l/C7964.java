package l;

/* compiled from: UBJ4 */
/* renamed from: l.۠ۚۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C7964 extends EnumC22780 {
    public /* synthetic */ C7964() {
        this("AfterAfterFrameset", 22);
    }

    public C7964(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        boolean m50859;
        if (abstractC2195.m7254()) {
            c17136.m40178((C14188) abstractC2195);
            return true;
        }
        if (!abstractC2195.m7256()) {
            m50859 = EnumC22780.m50859(abstractC2195);
            if (!m50859 && (!abstractC2195.m7255() || !((C9251) abstractC2195).f26122.equals("html"))) {
                if (abstractC2195.m7258()) {
                    return true;
                }
                if (abstractC2195.m7255() && ((C9251) abstractC2195).f26122.equals("noframes")) {
                    EnumC22780 enumC22780 = EnumC22780.f73545;
                    c17136.f2106 = abstractC2195;
                    return enumC22780.mo1361(abstractC2195, c17136);
                }
                c17136.m40182(this);
                return false;
            }
        }
        EnumC22780 enumC227802 = EnumC22780.f73546;
        c17136.f2106 = abstractC2195;
        return enumC227802.mo1361(abstractC2195, c17136);
    }
}

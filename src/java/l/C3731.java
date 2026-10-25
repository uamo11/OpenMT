package l;

/* compiled from: UBJ4 */
/* renamed from: l.ۘۚۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C3731 extends EnumC22780 {
    public /* synthetic */ C3731() {
        this("InTemplate", 17);
    }

    public C3731(String str, int i) {
        super(str, i, 0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // l.EnumC22780
    /* renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        switch (C21370.f68842[abstractC2195.f7214.ordinal()]) {
            case 1:
            case 2:
            case 5:
                c17136.m40175(abstractC2195, EnumC22780.f73546);
                return true;
            case 3:
                String str = ((C9251) abstractC2195).f26122;
                if (C20519.m47005(str, C11492.f34331)) {
                    c17136.m40175(abstractC2195, EnumC22780.f73545);
                    return true;
                }
                if (C20519.m47005(str, C11492.f34334)) {
                    c17136.m40172();
                    EnumC22780 enumC22780 = EnumC22780.f73560;
                    c17136.m40203(enumC22780);
                    c17136.m40212(enumC22780);
                    return c17136.mo2158(abstractC2195);
                }
                if (str.equals("col")) {
                    c17136.m40172();
                    EnumC22780 enumC227802 = EnumC22780.f73541;
                    c17136.m40203(enumC227802);
                    c17136.m40212(enumC227802);
                    return c17136.mo2158(abstractC2195);
                }
                if (str.equals("tr")) {
                    c17136.m40172();
                    EnumC22780 enumC227803 = EnumC22780.f73540;
                    c17136.m40203(enumC227803);
                    c17136.m40212(enumC227803);
                    return c17136.mo2158(abstractC2195);
                }
                if (str.equals("td") || str.equals("th")) {
                    c17136.m40172();
                    EnumC22780 enumC227804 = EnumC22780.f73554;
                    c17136.m40203(enumC227804);
                    c17136.m40212(enumC227804);
                    return c17136.mo2158(abstractC2195);
                }
                c17136.m40172();
                EnumC22780 enumC227805 = EnumC22780.f73546;
                c17136.m40203(enumC227805);
                c17136.m40212(enumC227805);
                return c17136.mo2158(abstractC2195);
            case 4:
                if (((C20540) abstractC2195).f26122.equals("template")) {
                    c17136.m40175(abstractC2195, EnumC22780.f73545);
                    return true;
                }
                c17136.m40182(this);
                return false;
            case 6:
                if (c17136.m40186("template")) {
                    c17136.m40182(this);
                    c17136.m40187("template");
                    c17136.m40217();
                    c17136.m40172();
                    c17136.m40225();
                    if (c17136.m40221() != EnumC22780.f73543 && c17136.m40189() < 12) {
                        return c17136.mo2158(abstractC2195);
                    }
                }
                return true;
            default:
                return true;
        }
    }
}

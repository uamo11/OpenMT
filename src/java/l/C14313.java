package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: UBJ4 */
/* renamed from: l.ܳۚۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum C14313 extends EnumC22780 {
    public /* synthetic */ C14313() {
        this("InTableText", 9);
    }

    public C14313(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC22780
    /* renamed from: ֫ */
    public boolean mo1361(AbstractC2195 abstractC2195, C17136 c17136) {
        boolean m50858;
        String str;
        if (abstractC2195.f7214 == EnumC15599.Character) {
            C17011 c17011 = (C17011) abstractC2195;
            String m39895 = c17011.m39895();
            str = EnumC22780.f73536;
            if (m39895.equals(str)) {
                c17136.m40182(this);
                return false;
            }
            ((ArrayList) c17136.m40209()).add(c17011.m39895());
            return true;
        }
        if (((ArrayList) c17136.m40209()).size() > 0) {
            Iterator it = ((ArrayList) c17136.m40209()).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                m50858 = EnumC22780.m50858(str2);
                if (!m50858) {
                    c17136.m40182(this);
                    if (C20519.m47005(c17136.m2153().m45588(), C11492.f34316)) {
                        c17136.m40213(true);
                        C17011 c170112 = new C17011();
                        c170112.m39894(str2);
                        c17136.m40175(c170112, EnumC22780.f73546);
                        c17136.m40213(false);
                    } else {
                        C17011 c170113 = new C17011();
                        c170113.m39894(str2);
                        c17136.m40175(c170113, EnumC22780.f73546);
                    }
                } else {
                    C17011 c170114 = new C17011();
                    c170114.m39894(str2);
                    c17136.m40179(c170114);
                }
            }
            c17136.m40220();
        }
        c17136.m40212(c17136.m40171());
        return c17136.mo2158(abstractC2195);
    }
}

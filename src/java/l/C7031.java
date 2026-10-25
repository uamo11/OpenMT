package l;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: C420 */
/* renamed from: l.ۜ᩸۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7031 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f21676 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18998(AbstractC5698 abstractC5698) {
        AbstractC10370 mo960 = abstractC5698.mo960();
        HashMap hashMap = this.f21676;
        C2609 c2609 = (C2609) hashMap.get(mo960);
        if (c2609 == null) {
            c2609 = C2609.m8239();
        }
        if (c2609.contains(abstractC5698)) {
            return;
        }
        hashMap.put(mo960, c2609.m8242(abstractC5698));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m18999(AbstractC5698 abstractC5698) {
        C2609 c2609;
        String abstractC10370 = abstractC5698.mo16076().toString();
        if (abstractC5698.f17560.mo5146() || abstractC5698.f17560.mo12941() || !((c2609 = (C2609) this.f21676.get(abstractC5698.mo960())) == null || (c2609.m8245() == 1 && c2609.contains(abstractC5698)))) {
            return abstractC10370;
        }
        C2609 m8239 = C2609.m8239();
        while (true) {
            AbstractC4308 abstractC4308 = abstractC5698.f17560;
            EnumC9454 enumC9454 = EnumC9454.CLASS;
            if (!abstractC4308.m12913(enumC9454) || !abstractC5698.f17560.mo4958().m12913(enumC9454) || abstractC5698.f17561.f17559 != EnumC1296.f4582) {
                break;
            }
            AbstractC10370 mo960 = abstractC5698.mo960();
            m8239.getClass();
            C2609 c26092 = new C2609(mo960, m8239);
            abstractC5698 = abstractC5698.f17561;
            m8239 = c26092;
        }
        AbstractC10370 mo9602 = abstractC5698.mo960();
        m8239.getClass();
        C2609 c26093 = new C2609(mo9602, m8239);
        StringBuilder sb = new StringBuilder();
        Iterator it = c26093.iterator();
        String str = "";
        while (it.hasNext()) {
            AbstractC10370 abstractC103702 = (AbstractC10370) it.next();
            sb.append(str);
            sb.append((CharSequence) abstractC103702);
            str = ".";
        }
        return sb.toString();
    }
}

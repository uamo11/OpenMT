package l;

import java.util.ArrayList;

/* compiled from: PBEP */
/* renamed from: l.ۗۘܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC2991 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C22041 f9434;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20630 f9435;

    public AbstractC2991(C20630 c20630, C22041 c22041) {
        this.f9435 = c20630;
        this.f9434 = c22041;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21480 m9125(AbstractC14278 abstractC14278, C21480 c21480) {
        C22041 c22041;
        C16395 m34044 = abstractC14278.m34044();
        ArrayList m38615 = m34044.m38615();
        int indexOf = m38615.indexOf(abstractC14278);
        if (indexOf < 0) {
            throw new IllegalArgumentException("specified insn is not in this block");
        }
        if (indexOf != m38615.size() - 1) {
            throw new IllegalArgumentException("Adding move here not supported:" + abstractC14278.mo2463());
        }
        C20630 c20630 = this.f9435;
        C21480 m48631 = C21480.m48631(c20630.m47193(), c21480.m48637());
        m38615.add(indexOf, AbstractC14278.m34037(new C1018(C12307.m29860(m48631.getType()), C10191.f30620, m48631, C20069.m46252(c21480)), m34044));
        int m48652 = m48631.m48652();
        InterfaceC6952 it = m34044.m38619().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            c22041 = this.f9434;
            if (!hasNext) {
                break;
            }
            c22041.m49588(m48652, it.next());
        }
        C20069 mo29535 = abstractC14278.mo29535();
        int size = mo29535.size();
        for (int i = 0; i < size; i++) {
            c22041.m49588(m48652, mo29535.m41004get(i).m48652());
        }
        c20630.m47184();
        return m48631;
    }
}

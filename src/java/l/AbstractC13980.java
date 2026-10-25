package l;

import java.util.Iterator;

/* compiled from: B7KX */
/* renamed from: l.ܰᩳ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC13980 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11139 f41692;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C18837 f41693 = new C18837();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC13980 f41694;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC12075 f41695;

    /* renamed from: ֫ */
    public abstract void mo6476(C1755 c1755);

    public AbstractC13980(C11139 c11139, EnumC12075 enumC12075, AbstractC13980 abstractC13980) {
        this.f41692 = c11139;
        this.f41695 = enumC12075;
        this.f41694 = abstractC13980;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m33462(C2609 c2609) {
        AbstractC13980 abstractC13980;
        C18837 c18837 = this.f41693;
        boolean isEmpty = c18837.isEmpty();
        C11139 c11139 = this.f41692;
        abstractC13980 = c11139.f33437;
        try {
            c11139.f33437 = this;
            mo4345(c2609);
            c11139.f33437 = abstractC13980;
            if (isEmpty) {
                C2609 m43517 = c18837.m43517();
                c18837.clear();
                AbstractC13980 abstractC139802 = this.f41694;
                return abstractC139802 != null ? abstractC139802.m33462(m43517) : m43517;
            }
            return C2609.m8239();
        } catch (Throwable th) {
            c11139.f33437 = abstractC13980;
            if (isEmpty) {
                c18837.clear();
            }
            throw th;
        }
    }

    /* renamed from: ۧ */
    public void mo4345(C2609 c2609) {
        AbstractC17926 abstractC17926;
        AbstractC17926 abstractC179262;
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C1755 c1755 = (C1755) it.next();
            C5557 c5557 = (C5557) c1755.f6074;
            this.f41693.m43511(c1755);
            C11139 c11139 = this.f41692;
            InterfaceC18278 m7284 = c11139.f33430.m7284(c1755.f6075.f4745);
            C18230 c18230 = c11139.f33431;
            c5557.getClass();
            InterfaceC3109 m42471 = c18230.m42471((InterfaceC3109) c5557);
            try {
                try {
                    abstractC179262 = c11139.f33428;
                    abstractC179262.mo25113(c1755.f6079.f17186, this.f41695);
                    mo6476(c1755);
                } catch (C20515 e) {
                    c11139.f33426.m36110(c5557, e);
                }
            } finally {
                abstractC17926 = c11139.f33428;
                abstractC17926.mo25112();
                c11139.f33431.m42471(m42471);
                c11139.f33430.m7284(m7284);
            }
        }
    }
}

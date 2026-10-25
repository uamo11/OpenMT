package l;

import java.util.HashMap;

/* compiled from: 21V7 */
/* renamed from: l.ܺۙۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15706 extends AbstractC2821 implements InterfaceC8898, InterfaceC2548 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f48458;

    public C15706() {
        super(2);
        this.f48458 = new HashMap();
    }

    @Override // l.AbstractC2821
    /* renamed from: ۧ */
    public final void mo8718(C2966 c2966) {
        c2966.m45788(true, true, true, false, new C23714(new C15952(0, 10, this)));
        this.f48458.clear();
    }

    @Override // l.AbstractC2821
    /* renamed from: ֫ */
    public final void mo8714(AbstractC12138 abstractC12138) {
        String m13109 = abstractC12138.m13109();
        AbstractC16412 m13108 = abstractC12138.m13108();
        if (C22927.m51032(m13109)) {
            return;
        }
        C5124 c5124 = new C5124(m13109, m13108, true);
        HashMap hashMap = this.f48458;
        AbstractC4377 abstractC4377 = (AbstractC4377) hashMap.get(c5124);
        if (abstractC4377 == null) {
            hashMap.put(c5124, m37038((AbstractC4377) abstractC12138));
            return;
        }
        Object m37038 = m37038((AbstractC4377) abstractC12138);
        AbstractC4377 m370382 = m37038(abstractC4377);
        if (m37038.equals(m370382)) {
            return;
        }
        m370382.mo13103(m37038);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC4377 m37038(AbstractC4377 abstractC4377) {
        while (abstractC4377.mo13101() != null && (abstractC4377.mo13101() instanceof AbstractC4377)) {
            abstractC4377 = (AbstractC4377) abstractC4377.mo13101();
        }
        return abstractC4377;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [l.ᩴ۬ۡ] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC18776 m37039(AbstractC12138 abstractC12138) {
        AbstractC12138 abstractC121382 = abstractC12138;
        while (abstractC121382.mo13101() != null && (abstractC121382.mo13101() instanceof InterfaceC18776)) {
            abstractC121382 = (InterfaceC18776) abstractC121382.mo13101();
        }
        return abstractC121382;
    }
}

package l;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: X43L */
/* renamed from: l.ܺܶ֨, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16007 extends AbstractC4203 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18837 f49381;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f49382;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18837 f49385;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f49384 = new HashSet();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public HashMap f49383 = new HashMap();

    @Override // l.InterfaceC21242
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (!abstractC4308.m12913(EnumC9454.ARRAY)) {
            return null;
        }
        C6319 c6319 = this.f49382;
        m37818(c6319.m17515(c5138), c6319.m17515(abstractC4308));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r4.m17546(r4.m17511(r0), r4.m17511(r8), true) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        if (r4.m17546(r4.m17513(r0), r4.m17513(r8), true) != false) goto L24;
     */
    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2142(l.C8541 r7, java.lang.Object r8) {
        /*
            r6 = this;
            l.ۙ֨֨ r8 = (l.AbstractC4308) r8
            l.᩶֡֨ r0 = r7.f13890
            java.util.HashMap r1 = r6.f49383
            java.lang.Object r0 = r1.get(r0)
            l.ۙ֨֨ r0 = (l.AbstractC4308) r0
            if (r0 == 0) goto L55
            boolean r2 = r0.mo12924()
            r3 = 1
            l.ۛ᩸֨ r4 = r6.f49382
            if (r2 == 0) goto L2c
            boolean r2 = r8.mo12924()
            if (r2 == 0) goto L2c
            l.ۙ֨֨ r2 = r4.m17513(r0)
            l.ۙ֨֨ r5 = r4.m17513(r8)
            boolean r2 = r4.m17546(r2, r5, r3)
            if (r2 == 0) goto L4d
            goto L5f
        L2c:
            boolean r2 = r0.mo12922()
            if (r2 == 0) goto L47
            boolean r2 = r8.mo12922()
            if (r2 == 0) goto L47
            l.ۙ֨֨ r2 = r4.m17511(r0)
            l.ۙ֨֨ r5 = r4.m17511(r8)
            boolean r2 = r4.m17546(r2, r5, r3)
            if (r2 == 0) goto L5f
            goto L4d
        L47:
            boolean r8 = r4.m17550(r0, r8)
            if (r8 == 0) goto L4f
        L4d:
            r8 = r0
            goto L5f
        L4f:
            l.ۡܶ֨ r7 = new l.ۡܶ֨
            r7.<init>()
            throw r7
        L55:
            l.ᩴܶ۠ r0 = r6.f49385
            r0.m43511(r7)
            l.ᩴܶ۠ r0 = r6.f49381
            r0.m43511(r8)
        L5f:
            l.᩶֡֨ r7 = r7.f13890
            r1.put(r7, r8)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16007.mo2142(l.ۡ֨֨, java.lang.Object):java.lang.Object");
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        boolean mo12922 = c19831.mo12922();
        C6319 c6319 = this.f49382;
        if (mo12922) {
            m37818(c6319.m17511(c19831), c6319.m17511(abstractC4308));
            return null;
        }
        if (!c19831.mo12924()) {
            return null;
        }
        m37818(c6319.m17513(c19831), c6319.m17513(abstractC4308));
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (!abstractC4308.m12913(EnumC9454.CLASS)) {
            return null;
        }
        C2609 mo12934 = c19955.mo12934();
        C2609 mo129342 = abstractC4308.mo12934();
        if (mo12934.m8245() != mo129342.m8245()) {
            return null;
        }
        while (mo12934.m8249()) {
            m37818((AbstractC4308) mo12934.f8240, (AbstractC4308) mo129342.f8240);
            mo12934 = mo12934.f8241;
            mo129342 = mo129342.f8241;
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37818(AbstractC4308 abstractC4308, AbstractC4308 abstractC43082) {
        C8436 c8436 = new C8436(abstractC4308, abstractC43082, this.f49382);
        HashSet hashSet = this.f49384;
        if (hashSet.add(c8436)) {
            try {
                abstractC4308.mo2962(this, abstractC43082);
            } finally {
                hashSet.remove(c8436);
            }
        }
    }

    public C16007(C6319 c6319, C18837 c18837, C18837 c188372) {
        this.f49382 = c6319;
        this.f49385 = c18837;
        this.f49381 = c188372;
    }
}

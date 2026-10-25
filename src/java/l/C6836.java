package l;

import java.util.Iterator;

/* compiled from: X43L */
/* renamed from: l.ۜܶ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6836 extends AbstractC13374 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f21166;

    @Override // l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        AbstractC4308 abstractC43082 = (AbstractC4308) obj;
        if (abstractC43082.m12913(EnumC9454.ERROR) || abstractC4308.m12913(EnumC9454.NONE)) {
            return Boolean.TRUE;
        }
        switch (C11070.f33247[abstractC4308.mo3258().ordinal()]) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return Boolean.valueOf(abstractC43082.mo12914());
            case 10:
                return Boolean.valueOf(abstractC43082.m12913(EnumC9454.BOOLEAN));
            case 11:
                return Boolean.FALSE;
            case 12:
            default:
                throw new AssertionError();
            case 13:
                return Boolean.valueOf(this.f21166.m17546(abstractC4308, abstractC43082, true));
        }
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        int i = C11070.f33247[abstractC4308.mo3258().ordinal()];
        C6319 c6319 = this.f21166;
        if (i == 1) {
            if (c6319.m17515(c5138).mo12941() || c6319.m17515(abstractC4308).mo12941()) {
                return Boolean.valueOf(c6319.m17515(c5138).m12913(c6319.m17515(abstractC4308).mo3258()));
            }
            return (Boolean) c6319.m17515(c5138).mo2962(this, c6319.m17515(abstractC4308));
        }
        if (i == 2) {
            return Boolean.valueOf(c6319.m17546((AbstractC4308) c5138, abstractC4308, true));
        }
        if (i != 12) {
            if (i == 13 || i == 16) {
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        if (c6319.m17545(abstractC4308, c5138, c6319.f19598)) {
            ((C1386) c6319.f19579.f8240).mo4874(EnumC20347.UNCHECKED);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        int i = C11070.f33247[abstractC4308.mo3258().ordinal()];
        C6319 c6319 = this.f21166;
        if (i != 12) {
            if (i == 13 || i == 16) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(c6319.m17545(c8541.mo12939(), abstractC4308, (C1386) c6319.f19579.f8240));
        }
        if (c6319.m17546((AbstractC4308) c8541, abstractC4308, true)) {
            return Boolean.TRUE;
        }
        if (c6319.m17545(c8541.mo12939(), abstractC4308, c6319.f19598)) {
            ((C1386) c6319.f19579.f8240).mo4874(EnumC20347.UNCHECKED);
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo9465(C12193 c12193, Object obj) {
        return Boolean.TRUE;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        C6319 c6319 = this.f21166;
        return Boolean.valueOf(c6319.m17545(c6319.m17511(c19831), (AbstractC4308) obj, (C1386) c6319.f19579.f8240));
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c0, code lost:
    
        if (r13 != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c9, code lost:
    
        ((l.C1386) r0.f19579.f8240).mo4874(l.EnumC20347.UNCHECKED);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01c7, code lost:
    
        if (r13 != false) goto L103;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ۛ᩸֨] */
    /* JADX WARN: Type inference failed for: r13v0, types: [l.ۙ֨֨, l.᩶ۚ֨] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v6, types: [l.ۙ֨֨] */
    @Override // l.AbstractC8247, l.InterfaceC21242
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2145(l.C19955 r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6836.mo2145(l.᩶ۚ֨, java.lang.Object):java.lang.Object");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m18520(C19955 c19955, AbstractC4308 abstractC4308, boolean z) {
        C6319 c6319 = this.f21166;
        C1386 c1386 = c6319.f19598;
        Iterator it = c6319.m17565(c19955).iterator();
        while (it.hasNext()) {
            AbstractC4308 abstractC43082 = (AbstractC4308) it.next();
            c1386.m4869();
            if (z) {
                if (!c6319.m17545(abstractC4308, abstractC43082, c1386)) {
                    return false;
                }
            } else if (!c6319.m17545(abstractC43082, abstractC4308, c1386)) {
                return false;
            }
        }
        EnumC20347 enumC20347 = EnumC20347.UNCHECKED;
        if (!c1386.m4870(enumC20347)) {
            return true;
        }
        ((C1386) c6319.f19579.f8240).mo4874(enumC20347);
        return true;
    }

    public C6836(C6319 c6319) {
        this.f21166 = c6319;
    }
}

package l;

import java.util.ArrayList;
import org.bouncycastle.crypto.params.DHParameters;

/* compiled from: MBG3 */
/* renamed from: l.ۘᩳܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4109 implements InterfaceC20295 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12533 f13056;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C0580 f13057;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f13058;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18926 f13059;

    public C4109(C18926 c18926) {
        C0580 c0580;
        this.f13059 = c18926;
        c0580 = c18926.f59641;
        this.f13057 = c0580;
        this.f13056 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12335(C12533 c12533) {
        this.f13056 = c12533;
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫ */
    public final void mo8327(int i, int i2) {
        throw new C2698("invalid opcode ".concat(C14712.m35005(i)), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00b1  */
    @Override // l.InterfaceC20295
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo8331(int r11, int r12, l.C7573 r13) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4109.mo8331(int, int, l.۟ܺܺ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12333(C7573 c7573) {
        C7573 m51261 = this.f13057.m2409().m51261();
        if (C22927.m51026(m51261, c7573)) {
            return;
        }
        C18926.m43676(this.f13059, "return type mismatch: prototype indicates " + m51261.mo2463() + ", but encountered type " + c7573.mo2463());
        throw null;
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫ */
    public final void mo8329(int i, int i2, int i3, int i4, C7573 c7573, int i5) {
        C23116 c23116;
        C7573 c75732;
        C18658 m28913;
        int i6 = i == 54 ? i3 + i2 : i2;
        c23116 = this.f13059.f59639;
        C11828 m51308 = c23116.m51308(i6, i4);
        if (m51308 != null) {
            c75732 = m51308.m28916();
            if (c75732.mo5256() != c7573.mo5256()) {
                c75732 = c7573;
                m51308 = null;
            }
        } else {
            c75732 = c7573;
        }
        C0580 c0580 = this.f13057;
        if (i != 21) {
            if (i == 54) {
                m28913 = m51308 != null ? m51308.m28913() : null;
                c0580.m2403(this.f13056, c7573);
                c0580.m2400(c7573);
                c0580.m2397(i4, c75732, m28913);
            } else if (i == 132) {
                m28913 = m51308 != null ? m51308.m28913() : null;
                c0580.m2401(this.f13056, i4);
                c0580.m2397(i4, c75732, m28913);
                c0580.m2400(c7573);
                c0580.m2412(i5);
                c0580.m2407((AbstractC13717) C2635.m8291(i5));
            } else if (i != 169) {
                mo8327(i, i2);
                throw null;
            }
            ((C16102) c0580).mo2402(this.f13056, i2, i);
        }
        c0580.m2401(this.f13056, i4);
        c0580.m2414(m51308 != null);
        c0580.m2400(c7573);
        ((C16102) c0580).mo2402(this.f13056, i2, i);
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫ */
    public final void mo8330(int i, int i2, int i3, AbstractC13717 abstractC13717, int i4) {
        AbstractC13717 abstractC137172;
        C18926 c18926 = this.f13059;
        C0580 c0580 = this.f13057;
        if (i == 18 || i == 19) {
            if ((abstractC13717 instanceof C21685) || (abstractC13717 instanceof C4751)) {
                C18926.m43677(c18926, abstractC13717);
            }
            c0580.m2411();
            abstractC137172 = abstractC13717;
        } else if (i != 189) {
            if (i != 197) {
                if (i != 192 && i != 193) {
                    switch (i) {
                        case 179:
                            c0580.m2403(this.f13056, ((C8985) abstractC13717).getType());
                            abstractC137172 = abstractC13717;
                            break;
                        case 180:
                            break;
                        case 181:
                            c0580.m2404(this.f13056, C7573.f23412, ((C8985) abstractC13717).getType());
                            abstractC137172 = abstractC13717;
                            break;
                        case 182:
                        case 183:
                        case 184:
                        case 185:
                            boolean z = abstractC13717 instanceof C4046;
                            AbstractC13717 abstractC137173 = abstractC13717;
                            if (z) {
                                C22390 m12144 = ((C4046) abstractC13717).m12144();
                                C18926.m43675(c18926, i, m12144);
                                abstractC137173 = m12144;
                            }
                            if ((abstractC137173 instanceof C22390) && ((C22390) abstractC137173).m39384()) {
                                C18926.m43680(c18926, i);
                            }
                            c0580.m2406(this.f13056, ((C22390) abstractC137173).m39385(i == 184));
                            abstractC137172 = abstractC137173;
                            break;
                        case 186:
                            C18926.m43674(c18926, i);
                            C18863 c18863 = (C18863) abstractC13717;
                            c0580.m2406(this.f13056, c18863.m43564());
                            abstractC137172 = c18863.m43569();
                            break;
                        default:
                            c0580.m2411();
                            abstractC137172 = abstractC13717;
                            break;
                    }
                }
                c0580.m2403(this.f13056, C7573.f23412);
                abstractC137172 = abstractC13717;
            } else {
                C7573 c7573 = C7573.f23406;
                int i5 = C23095.f74300;
                StringBuilder sb = new StringBuilder(100);
                sb.append('(');
                for (int i6 = 0; i6 < i4; i6++) {
                    sb.append('I');
                }
                sb.append(')');
                sb.append(c7573.m20300());
                c0580.m2406(this.f13056, C23095.m51255(sb.toString()));
                abstractC137172 = abstractC13717;
            }
        } else {
            c0580.m2403(this.f13056, C7573.f23413);
            abstractC137172 = abstractC13717;
        }
        c0580.m2412(i4);
        c0580.m2407(abstractC137172);
        ((C16102) c0580).mo2402(this.f13056, i2, i);
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫ */
    public final void mo8328(int i, int i2, int i3, int i4) {
        C0580 c0580 = this.f13057;
        switch (i) {
            case 153:
            case EnumC17734.f54268 /* 154 */:
            case 155:
            case 156:
            case 157:
            case 158:
                c0580.m2403(this.f13056, C7573.f23413);
                c0580.m2417(i4);
                ((C16102) c0580).mo2402(this.f13056, i2, i);
                return;
            case 159:
            case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
            case 161:
            case 162:
            case 163:
            case 164:
                C12533 c12533 = this.f13056;
                C7573 c7573 = C7573.f23413;
                c0580.m2404(c12533, c7573, c7573);
                c0580.m2417(i4);
                ((C16102) c0580).mo2402(this.f13056, i2, i);
                return;
            case 165:
            case 166:
                C12533 c125332 = this.f13056;
                C7573 c75732 = C7573.f23412;
                c0580.m2404(c125332, c75732, c75732);
                c0580.m2417(i4);
                ((C16102) c0580).mo2402(this.f13056, i2, i);
                return;
            default:
                switch (i) {
                    case 198:
                    case 199:
                        c0580.m2403(this.f13056, C7573.f23412);
                        break;
                    case 200:
                    case 201:
                        break;
                    default:
                        mo8327(i, i2);
                        throw null;
                }
                c0580.m2417(i4);
                ((C16102) c0580).mo2402(this.f13056, i2, i);
                return;
            case 167:
            case 168:
                c0580.m2411();
                c0580.m2417(i4);
                ((C16102) c0580).mo2402(this.f13056, i2, i);
                return;
        }
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫ */
    public final void mo8333(int i, int i2, C19632 c19632, int i3) {
        C12533 c12533 = this.f13056;
        C7573 c7573 = C7573.f23413;
        C0580 c0580 = this.f13057;
        c0580.m2403(c12533, c7573);
        c0580.m2412(i3);
        c0580.m2408(c19632);
        ((C16102) c0580).mo2402(this.f13056, i, 171);
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫ */
    public final void mo8332(int i, int i2, C12512 c12512, ArrayList arrayList) {
        C12533 c12533 = this.f13056;
        C7573 c7573 = C7573.f23413;
        C0580 c0580 = this.f13057;
        c0580.m2403(c12533, c7573);
        c0580.m2398(arrayList);
        c0580.m2407((AbstractC13717) c12512);
        ((C16102) c0580).mo2402(this.f13056, i, 188);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12334(int i) {
        this.f13058 = i;
    }

    @Override // l.InterfaceC20295
    /* renamed from: ֫ */
    public final int mo8326() {
        return this.f13058;
    }
}

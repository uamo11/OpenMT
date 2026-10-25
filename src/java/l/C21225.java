package l;

/* compiled from: P44J */
/* renamed from: l.᩸֡ۚ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21225 implements InterfaceC9167 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ StringBuilder f68415;

    public C21225(StringBuilder sb) {
        this.f68415 = sb;
    }

    @Override // l.InterfaceC9167
    /* renamed from: ۧ */
    public final void mo16112(AbstractC11347 abstractC11347, int i) {
        C16305 c16305;
        boolean z = abstractC11347 instanceof C10787;
        StringBuilder sb = this.f68415;
        if (z) {
            C10787 c10787 = (C10787) abstractC11347;
            String m25053 = c10787.m25053();
            if (C19814.m45561(c10787.f33969) || (c10787 instanceof C2174)) {
                sb.append(m25053);
                return;
            } else {
                C20519.m47002(m25053, sb, C10787.m26987(sb));
                return;
            }
        }
        if (abstractC11347 instanceof C19814) {
            C19814 c19814 = (C19814) abstractC11347;
            if (sb.length() > 0) {
                if (!c19814.m45565()) {
                    c16305 = c19814.f64009;
                    if (!c16305.m38362().equals("br")) {
                        return;
                    }
                }
                if (C10787.m26987(sb)) {
                    return;
                }
                sb.append(' ');
            }
        }
    }

    @Override // l.InterfaceC9167
    /* renamed from: ֫ */
    public final void mo16111(AbstractC11347 abstractC11347, int i) {
        if ((abstractC11347 instanceof C19814) && ((C19814) abstractC11347).m45565() && (abstractC11347.m28093() instanceof C10787)) {
            StringBuilder sb = this.f68415;
            if (C10787.m26987(sb)) {
                return;
            }
            sb.append(' ');
        }
    }
}

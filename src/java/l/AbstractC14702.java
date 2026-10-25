package l;

/* compiled from: B8IO */
/* renamed from: l.ܳᩴ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC14702 implements InterfaceC1318 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20369 f44904 = new C20369();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo34995(long j, int i, boolean z);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34996(C11197 c11197) {
        mo4566(AbstractC14545.of((Object) c11197));
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۧ */
    public final boolean mo4589(int i) {
        return mo4609().m43763(i);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ܿ */
    public final void mo4601() {
        mo4570(true);
    }

    @Override // l.InterfaceC1318
    public final void pause() {
        mo4570(false);
    }

    @Override // l.InterfaceC1318
    public final boolean isPlaying() {
        return mo4603() == 3 && mo4607() && mo4560() == 0;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۡ */
    public final void mo4581() {
        mo34995(-9223372036854775807L, mo4579(), false);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ᩳ֫ */
    public final void mo4604() {
        long currentPosition = getCurrentPosition() + (-mo4596());
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo34995(Math.max(currentPosition, 0L), mo4579(), false);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ܽ֫ */
    public final void mo4600() {
        long currentPosition = getCurrentPosition() + mo4610();
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        mo34995(Math.max(currentPosition, 0L), mo4579(), false);
    }

    @Override // l.InterfaceC1318
    /* renamed from: ܺ */
    public final void mo4598() {
        int mo14108;
        int mo141082;
        if (mo4576().m14110() || mo4608()) {
            m34994(7);
            return;
        }
        boolean m34997 = m34997();
        if (m34999() && !m34998()) {
            if (!m34997) {
                m34994(7);
                return;
            }
            AbstractC4846 mo4576 = mo4576();
            if (mo4576.m14110()) {
                mo141082 = -1;
            } else {
                int mo4579 = mo4579();
                int mo4578 = mo4578();
                if (mo4578 == 1) {
                    mo4578 = 0;
                }
                mo141082 = mo4576.mo14108(mo4579, mo4578, mo4571());
            }
            if (mo141082 == -1) {
                m34994(7);
                return;
            } else if (mo141082 == mo4579()) {
                mo34995(-9223372036854775807L, mo4579(), true);
                return;
            } else {
                mo34995(-9223372036854775807L, mo141082, false);
                return;
            }
        }
        if (!m34997 || getCurrentPosition() > mo4575()) {
            mo34995(0L, mo4579(), false);
            return;
        }
        AbstractC4846 mo45762 = mo4576();
        if (mo45762.m14110()) {
            mo14108 = -1;
        } else {
            int mo45792 = mo4579();
            int mo45782 = mo4578();
            if (mo45782 == 1) {
                mo45782 = 0;
            }
            mo14108 = mo45762.mo14108(mo45792, mo45782, mo4571());
        }
        if (mo14108 == -1) {
            m34994(7);
        } else if (mo14108 == mo4579()) {
            mo34995(-9223372036854775807L, mo4579(), true);
        } else {
            mo34995(-9223372036854775807L, mo14108, false);
        }
    }

    @Override // l.InterfaceC1318
    /* renamed from: ܶ */
    public final void mo4597() {
        int mo14096;
        if (mo4576().m14110() || mo4608()) {
            m34994(9);
            return;
        }
        if (!m35001()) {
            if (!m34999() || !m35000()) {
                m34994(9);
                return;
            } else {
                mo34995(-9223372036854775807L, mo4579(), false);
                return;
            }
        }
        AbstractC4846 mo4576 = mo4576();
        if (mo4576.m14110()) {
            mo14096 = -1;
        } else {
            int mo4579 = mo4579();
            int mo4578 = mo4578();
            if (mo4578 == 1) {
                mo4578 = 0;
            }
            mo14096 = mo4576.mo14096(mo4579, mo4578, mo4571());
        }
        if (mo14096 == -1) {
            m34994(9);
        } else if (mo14096 != mo4579()) {
            mo34995(-9223372036854775807L, mo14096, false);
        } else {
            mo34995(-9223372036854775807L, mo4579(), true);
        }
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean m35001() {
        int mo14096;
        AbstractC4846 mo4576 = mo4576();
        if (mo4576.m14110()) {
            mo14096 = -1;
        } else {
            int mo4579 = mo4579();
            int mo4578 = mo4578();
            if (mo4578 == 1) {
                mo4578 = 0;
            }
            mo14096 = mo4576.mo14096(mo4579, mo4578, mo4571());
        }
        return mo14096 != -1;
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34997() {
        int mo14108;
        AbstractC4846 mo4576 = mo4576();
        if (mo4576.m14110()) {
            mo14108 = -1;
        } else {
            int mo4579 = mo4579();
            int mo4578 = mo4578();
            if (mo4578 == 1) {
                mo4578 = 0;
            }
            mo14108 = mo4576.mo14108(mo4579, mo4578, mo4571());
        }
        return mo14108 != -1;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ܳ */
    public final C11197 mo4595() {
        AbstractC4846 mo4576 = mo4576();
        if (mo4576.m14110()) {
            return null;
        }
        return mo4576.mo14103(mo4579(), this.f44904, 0L).f65753;
    }

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final boolean m35000() {
        AbstractC4846 mo4576 = mo4576();
        return !mo4576.m14110() && mo4576.mo14103(mo4579(), this.f44904, 0L).f65759;
    }

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34999() {
        AbstractC4846 mo4576 = mo4576();
        return !mo4576.m14110() && mo4576.mo14103(mo4579(), this.f44904, 0L).m46687();
    }

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34998() {
        AbstractC4846 mo4576 = mo4576();
        return !mo4576.m14110() && mo4576.mo14103(mo4579(), this.f44904, 0L).f65764;
    }

    @Override // l.InterfaceC1318
    /* renamed from: ۬ */
    public final long mo4593() {
        AbstractC4846 mo4576 = mo4576();
        if (mo4576.m14110()) {
            return -9223372036854775807L;
        }
        return C3603.m11037(mo4576.mo14103(mo4579(), this.f44904, 0L).f65755);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m34994(int i) {
        mo34995(-9223372036854775807L, -1, false);
    }

    @Override // l.InterfaceC1318
    public final void seekTo(long j) {
        mo34995(j, mo4579(), false);
    }
}

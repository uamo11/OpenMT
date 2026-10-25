package l;

import java.io.IOException;

/* compiled from: 51KR */
/* renamed from: l.ۧۜۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10832 implements InterfaceC18581 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C10130 f32576 = new C10130();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16475 f32577;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12392 f32578;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11005 f32579;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15545 f32580;

    public C10832(C16475 c16475, C12392 c12392, C15545 c15545, C11005 c11005) {
        this.f32577 = c16475;
        this.f32578 = c12392;
        this.f32580 = c15545;
        this.f32579 = c11005;
    }

    @Override // l.InterfaceC18581
    /* renamed from: ۧ */
    public final void mo9498() {
        int i;
        boolean z;
        C15893 c15893;
        C10130 c10130 = this.f32576;
        c10130.writeInt(1382253410);
        C16475 c16475 = this.f32577;
        i = c16475.f50641;
        c10130.writeByte(i);
        z = c16475.f50648;
        c10130.m25425(z);
        c10130.writeInt(1382253410);
        this.f32578.m30331(c10130, true);
        c10130.writeInt(1382253410);
        C15545 c15545 = this.f32580;
        c15545.m36688(c10130);
        c10130.writeInt(1382253410);
        c15545.m36681(c10130);
        c15893 = c16475.f50651;
        AbstractC2489 m37667 = c15893.m37667();
        if (m37667 instanceof C6928) {
            c10130.writeInt(1382256833);
            c10130.m25423((CharSequence) ((C6928) m37667).m18734().mo14987());
        }
    }

    @Override // l.InterfaceC18581
    /* renamed from: ֫ */
    public final void mo9497() {
        C3764 c3764;
        try {
            this.f32579.m27338();
            byte[] m11705 = C3878.m11705(this.f32576.size(), this.f32576.m25438());
            synchronized (this.f32577) {
                this.f32579.m27332(m11705);
            }
        } catch (IOException e) {
            c3764 = this.f32577.f50653;
            c3764.m11384((Throwable) e);
        }
    }
}

package l;

import bin.mt.plus.R;

/* compiled from: J6WT */
/* renamed from: l.֨۬᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1147 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18673 f4160;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3264 f4161;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC0206 f4162;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147(C3264 c3264, AbstractActivityC3346 abstractActivityC3346, C18673 c18673, DialogInterfaceC0206 dialogInterfaceC0206) {
        super(abstractActivityC3346, -1);
        this.f4161 = c3264;
        this.f4160 = c18673;
        this.f4162 = dialogInterfaceC0206;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.֡۬᩻] */
    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۚ۬᩻] */
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        boolean z;
        final String trim = m31260().trim();
        try {
            C5267.m15183(trim);
            C3264 c3264 = this.f4161;
            z = c3264.f10240;
            if (z) {
                return;
            }
            final C18673 c18673 = this.f4160;
            ?? r2 = new InterfaceC15257() { // from class: l.֡۬᩻
                @Override // l.InterfaceC15257
                public final C3856 run() {
                    C5267 c5267;
                    C5267 c52672;
                    C3264 c32642 = C1147.this.f4161;
                    C18673 c186732 = c18673;
                    String str = trim;
                    if (c186732 == null) {
                        c52672 = c32642.f10244;
                        return c52672.m15184(str);
                    }
                    c5267 = c32642.f10244;
                    c5267.m15187(c186732.f59011, str);
                    return null;
                }
            };
            final DialogInterfaceC0206 dialogInterfaceC0206 = this.f4162;
            c3264.m9991((InterfaceC15257) r2, (Runnable) new Runnable() { // from class: l.ۚ۬᩻
                @Override // java.lang.Runnable
                public final void run() {
                    DialogInterfaceC0206 dialogInterfaceC02062 = DialogInterfaceC0206.this;
                    if (dialogInterfaceC02062 == null || !dialogInterfaceC02062.m1442()) {
                        return;
                    }
                    dialogInterfaceC02062.m1444(trim);
                }
            });
            m31262();
        } catch (IllegalArgumentException unused) {
            m31263(R.string.MT_Protector_res_0x7f120583);
        }
    }
}

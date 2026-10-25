package l;

/* compiled from: H8BL */
/* renamed from: l.ܺ֡ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15579 implements InterfaceC5577 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f47998;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C0637 f47999;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f48000;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC5577 f48001;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21658 f48002;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0637 f48003;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16431 f48004;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7819 f48005;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19689 f48006;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f48007;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f48008 = true;

    public C15579(AbstractC13921 abstractC13921, C17843 c17843, InterfaceC19689 interfaceC19689) {
        this.f48006 = interfaceC19689;
        C16431 c16431 = new C16431(null, abstractC13921, c17843, EnumC10788.NORMAL, null);
        c16431.m38735(new C18403(interfaceC19689));
        this.f48004 = c16431;
        C9231 c9231 = new C9231(this, interfaceC19689);
        this.f47999 = c9231;
        C8525 c8525 = new C8525(this);
        this.f48003 = c8525;
        C7819 c7819 = new C7819(abstractC13921, c16431, c9231);
        this.f48005 = c7819;
        this.f48002 = new C21658(c16431, c8525);
        this.f48001 = c7819;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36741(C15579 c15579, C11197 c11197, InterfaceC5577 interfaceC5577, C0637 c0637, C0637 c06372) {
        c15579.f48001.reset();
        c15579.f48001 = interfaceC5577;
        c0637.m2595(InterfaceC5577.f17276);
        c06372.m2595(c15579.f48006);
        c15579.f47998 = false;
        c15579.f48007 = true;
        c15579.f48001.mo15848(c11197);
    }

    @Override // l.InterfaceC5577
    public final void reset() {
        this.f48001.reset();
    }

    @Override // l.InterfaceC5577
    /* renamed from: ֫ */
    public final void mo15847(int i, RunnableC16865 runnableC16865) {
        this.f48001.mo15847(i, runnableC16865);
    }

    @Override // l.InterfaceC5577
    public final int getCurrentPosition() {
        return this.f48001.getCurrentPosition();
    }

    @Override // l.InterfaceC5577
    /* renamed from: ۧ */
    public final void mo15849() {
        this.f48001.mo15849();
    }

    @Override // l.InterfaceC5577
    /* renamed from: ᩳ */
    public final void mo15852() {
        this.f48001.mo15852();
    }

    @Override // l.InterfaceC5577
    /* renamed from: ֫ */
    public final void mo15845() {
        this.f48005.mo15845();
        this.f48002.mo15845();
        C16431 c16431 = this.f48004;
        c16431.m38742();
        c16431.m38740();
        this.f48000 = true;
    }

    @Override // l.InterfaceC5577
    public final void pause() {
        if (this.f48007) {
            return;
        }
        if (this.f47998) {
            this.f48001.pause();
            return;
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // l.InterfaceC5577
    public final void start() {
        if (this.f48007) {
            return;
        }
        if (this.f47998) {
            this.f48001.start();
            return;
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    @Override // l.InterfaceC5577
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo15848(l.C11197 r8) {
        /*
            r7 = this;
            boolean r0 = r7.f48007
            if (r0 != 0) goto L5c
            boolean r0 = r7.f48000
            if (r0 != 0) goto L5c
            l.ۨᩴ֫ r0 = r8.f33612
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L28
            java.lang.Object r0 = r0.f35422
            boolean r3 = r0 instanceof l.InterfaceC17889
            if (r3 == 0) goto L28
            l.ᩳۜܳ r0 = (l.InterfaceC17889) r0
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r3 = ".wav"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L28
            r0 = 0
            goto L29
        L28:
            r0 = 1
        L29:
            r7.f48008 = r0
            if (r0 == 0) goto L30
            l.۠֡ۜ r3 = r7.f48005
            goto L32
        L30:
            l.᩸ܶۜ r3 = r7.f48002
        L32:
            l.ۚ᩶ۜ r4 = r7.f48001
            if (r4 == r3) goto L52
            r4.reset()
            r7.f48001 = r3
            l.᩵᩶ۜ r3 = r7.f48006
            l.֡᩶ۜ r4 = r7.f47999
            l.᩵᩶ۜ r5 = l.InterfaceC5577.f17276
            l.֡᩶ۜ r6 = r7.f48003
            if (r0 == 0) goto L4c
            r6.m2595(r5)
            r4.m2595(r3)
            goto L52
        L4c:
            r4.m2595(r5)
            r6.m2595(r3)
        L52:
            r7.f47998 = r1
            r7.f48007 = r2
            l.ۚ᩶ۜ r0 = r7.f48001
            r0.mo15848(r8)
            return
        L5c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15579.mo15848(l.ۧ᩵֫):void");
    }

    @Override // l.InterfaceC5577
    /* renamed from: ܿ */
    public final boolean mo15851() {
        return this.f48007;
    }

    @Override // l.InterfaceC5577
    /* renamed from: ֫ */
    public final void mo15846(float f) {
        if (this.f47998) {
            this.f48001.mo15846(f);
        }
    }

    @Override // l.InterfaceC5577
    /* renamed from: ܽ */
    public final boolean mo15850() {
        return this.f47998;
    }

    @Override // l.InterfaceC5577
    public final boolean isPlaying() {
        return this.f48001.isPlaying();
    }

    @Override // l.InterfaceC5577
    /* renamed from: ᩻ */
    public final boolean mo15853() {
        return this.f48000;
    }
}

package l;

import android.graphics.Bitmap;

/* compiled from: 31PG */
/* renamed from: l.ۛۢۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5975 implements InterfaceC4644, InterfaceC23206, InterfaceC21013 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18342;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18343;

    public /* synthetic */ C5975(int i, Object obj) {
        this.f18342 = i;
        this.f18343 = obj;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private final /* synthetic */ void m16758() {
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private final /* synthetic */ void m16759() {
    }

    @Override // l.InterfaceC23206
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC23206
    /* renamed from: ֫ */
    public void mo8486(String str) {
        switch (this.f18342) {
            case 0:
                ActivityC7365.m19796((ActivityC7365) this.f18343, str);
                break;
            default:
                r0.m48868(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0009: INVOKE 
                      (r0v4 l.￡ﾩﾸￜﾰ￡ﾩﾷ)
                      (wrap:java.lang.Runnable:0x0002: CONSTRUCTOR 
                      (wrap:l.￡ﾩﾸￜﾰ￡ﾩﾷ:0x0007: CHECK_CAST (l.￡ﾩﾸￜﾰ￡ﾩﾷ) (wrap:java.lang.Object:0x0005: IGET (r1v0 'this' l.ￛﾛￛﾢￛﾢ A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] l.ￛﾛￛﾢￛﾢ.￡ﾩﾹ java.lang.Object))
                      (r2v0 'str' java.lang.String)
                     A[MD:(l.￡ﾩﾸￜﾰ￡ﾩﾷ, java.lang.String):void (m), WRAPPED] (LINE:198) call: l.ￛﾜￜﾰ￡ﾩﾷ.<init>(l.￡ﾩﾸￜﾰ￡ﾩﾷ, java.lang.String):void type: CONSTRUCTOR)
                     DIRECT call: l.￡ﾩﾸￜﾰ￡ﾩﾷ.ￖﾫ(java.lang.Runnable):void A[MD:(java.lang.Runnable):void (m)] (LINE:198) in method: l.ￛﾛￛﾢￛﾢ.ￖﾫ(java.lang.String):void, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: l.ￛﾜￜﾰ￡ﾩﾷ, state: NOT_LOADED
                    	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                    	... 21 more
                    */
                /*
                    this = this;
                    int r0 = r1.f18342
                    switch(r0) {
                        case 0: goto Ld;
                        default: goto L5;
                    }
                L5:
                    java.lang.Object r0 = r1.f18343
                    l.᩸ܰ᩷ r0 = (l.ViewOnClickListenerC21628) r0
                    l.ViewOnClickListenerC21628.m48881(r0, r2)
                    return
                Ld:
                    java.lang.Object r0 = r1.f18343
                    l.۟ۡۢ r0 = (l.ActivityC7365) r0
                    l.ActivityC7365.m19796(r0, r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: l.C5975.mo8486(java.lang.String):void");
            }

            @Override // l.InterfaceC4644
            /* renamed from: ֫ */
            public Bitmap mo5660() {
                return C17447.m40789((InterfaceC11098) this.f18343);
            }

            @Override // l.InterfaceC21013
            /* renamed from: ۧ */
            public Object mo12796() {
                throw new C13934((String) this.f18343);
            }
        }

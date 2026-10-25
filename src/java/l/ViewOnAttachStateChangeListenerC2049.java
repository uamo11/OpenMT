package l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.view.View;
import bin.mt.plus.Main;

/* compiled from: K5ZN */
/* renamed from: l.֫᩶ۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class ViewOnAttachStateChangeListenerC2049 implements View.OnAttachStateChangeListener {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2234 f6844;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8085 f6845;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13041 f6846;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BroadcastReceiver f6847;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21100 f6848;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f6849;

    public ViewOnAttachStateChangeListenerC2049(C21100 c21100, AbstractActivityC3346 abstractActivityC3346, C14811 c14811, C2234 c2234, BroadcastReceiver broadcastReceiver, InterfaceC8085 interfaceC8085) {
        this.f6848 = c21100;
        this.f6849 = abstractActivityC3346;
        this.f6846 = c14811;
        this.f6844 = c2234;
        this.f6847 = broadcastReceiver;
        this.f6845 = interfaceC8085;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractActivityC3346 abstractActivityC3346 = this.f6849;
        if (abstractActivityC3346 instanceof Main) {
            C21100.f68058 = true;
        }
        InterfaceC13041 interfaceC13041 = this.f6846;
        if (interfaceC13041 != null) {
            abstractActivityC3346.mo9144(interfaceC13041);
            abstractActivityC3346.mo9143(interfaceC13041);
        }
        this.f6844.m7414(this.f6847, new IntentFilter("bin.mt.media.ACTION_MUSIC_PLAYER_STATE_RELEASED"));
        abstractActivityC3346.getLifecycle().mo19833(this.f6845);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (r1.m24844() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0065, code lost:
    
        if (l.C21100.f68044.m1662() == java.lang.Boolean.FALSE) goto L26;
     */
    @Override // android.view.View.OnAttachStateChangeListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewDetachedFromWindow(android.view.View r6) {
        /*
            r5 = this;
            l.᩷᩶ۜ r6 = r5.f6848
            android.widget.PopupWindow r0 = l.C21100.m48030(r6)
            if (r0 == 0) goto L12
            android.widget.PopupWindow r0 = l.C21100.m48030(r6)
            r0.dismiss()
            l.C21100.m48042(r6)
        L12:
            l.ۗܺ᩷ r0 = r5.f6849
            boolean r1 = r0 instanceof bin.mt.plus.Main
            r2 = 0
            if (r1 == 0) goto L1c
            l.C21100.m48028(r2)
        L1c:
            l.۬ۤ r1 = r5.f6846
            if (r1 == 0) goto L23
            r0.mo9144(r1)
        L23:
            l.ۖۖ֫ r1 = r5.f6844
            android.content.BroadcastReceiver r3 = r5.f6847
            r1.m7413(r3)
            l.۟ۢ֫ r1 = r0.getLifecycle()
            l.۠ۢ֫ r3 = r5.f6845
            r1.mo19834(r3)
            boolean r1 = l.C21100.m48044(r6)
            if (r1 == 0) goto L3b
            goto Lb6
        L3b:
            boolean r1 = r0 instanceof l.ActivityC9811
            r3 = 1
            if (r1 == 0) goto L5d
            r1 = r0
            l.ۢ᩶ۜ r1 = (l.ActivityC9811) r1
            boolean r4 = r0.isFinishing()
            if (r4 != 0) goto L4c
            r0.finish()
        L4c:
            l.ۚۡ֫ r0 = l.C21100.f68044
            java.lang.Object r0 = r0.m1662()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            if (r0 != r4) goto L69
            boolean r0 = r1.m24844()
            if (r0 != 0) goto L69
            goto L67
        L5d:
            l.ۚۡ֫ r0 = l.C21100.f68044
            java.lang.Object r0 = r0.m1662()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            if (r0 != r1) goto L69
        L67:
            r0 = 1
            goto L6a
        L69:
            r0 = 0
        L6a:
            if (r0 != 0) goto L77
            l.۫ۤۡ r1 = l.ApplicationC20075.f65008
            java.lang.String r4 = "mbp"
            boolean r1 = r1.getBoolean(r4, r2)
            if (r1 != 0) goto L77
            r0 = 1
        L77:
            if (r0 == 0) goto Lb6
            l.C21805.m49152()
            l.ۜ᩶ۜ r0 = l.C21100.m48038()
            if (r0 == 0) goto Lb6
            l.ۜ᩶ۜ r0 = l.C21100.m48038()
            boolean r0 = r0.f21579
            l.ۜ᩶ۜ r1 = l.C21100.m48038()
            long r1 = r1.f21569
            l.ۜ᩶ۜ r4 = l.C21100.m48038()
            r4.m18912(r3)
            l.C21100.m48043()
            if (r0 == 0) goto Lb6
            l.ۗܺ᩷ r6 = l.C21100.m48013(r6)
            int r0 = l.ServiceC4166.f13587
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<l.ۘ᩶ۜ> r3 = l.ServiceC4166.class
            r0.<init>(r6, r3)
            java.lang.String r3 = "bin.mt.media.MusicPlayerService.ACTION_EXIT"
            android.content.Intent r0 = r0.setAction(r3)
            java.lang.String r3 = "playbackSessionId"
            android.content.Intent r0 = r0.putExtra(r3, r1)
            r6.startService(r0)
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ViewOnAttachStateChangeListenerC2049.onViewDetachedFromWindow(android.view.View):void");
    }
}

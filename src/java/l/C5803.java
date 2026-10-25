package l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/* compiled from: X59Z */
/* renamed from: l.ۛۘ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5803 extends C2167 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver.PendingResult f17842;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Context f17843;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C12045 f17844;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Intent f17845;

    public C5803(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
        this.f17843 = context;
        this.f17845 = intent;
        this.f17842 = pendingResult;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16280(C12045 c12045) {
        this.f17844 = c12045;
    }

    @Override // l.C2167
    /* renamed from: ֫ */
    public final void mo7163() {
        new C14909(this.f17843, this.f17844.m29417()).m35367((KeyEvent) this.f17845.getParcelableExtra("android.intent.extra.KEY_EVENT"));
        this.f17844.m29416();
        this.f17842.finish();
    }

    @Override // l.C2167
    /* renamed from: ۧ */
    public final void mo7164() {
        this.f17844.m29416();
        this.f17842.finish();
    }

    @Override // l.C2167
    /* renamed from: ܽ */
    public final void mo7165() {
        this.f17844.m29416();
        this.f17842.finish();
    }
}

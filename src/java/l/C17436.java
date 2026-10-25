package l;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: 09LR */
/* renamed from: l.ܿܶ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17436 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public Intent f53290;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC16024 f53291;

    public C17436(ActivityC16024 activityC16024) {
        this.f53291 = activityC16024;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20272(this.f53291, 100);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        AbstractC15440 abstractC15440;
        C13670 c13670;
        String str;
        ActivityC16024 activityC16024 = this.f53291;
        abstractC15440 = activityC16024.f49439;
        C9285 c9285 = new C9285(abstractC15440.m36506());
        c13670 = activityC16024.f49434;
        c13670.m32875(c9285);
        AbstractC15440 m36527 = C16293.f50113.m36527();
        m36527.m36502(c9285.m23823());
        Intent intent = new Intent(activityC16024, (Class<?>) ActivityC4031.class);
        this.f53290 = intent;
        str = activityC16024.f49431;
        intent.putExtra("title", str);
        this.f53290.setData(m36527.m36522());
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        this.f53291.startActivity(this.f53290);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f53291.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}

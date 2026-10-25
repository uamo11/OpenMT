package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* compiled from: Y7SB */
/* renamed from: l.ۗۨ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3207 extends C23363 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9184 f10095;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f10096;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8526 f10097;

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        this.f75051 = c5557;
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        this.f75051 = c14169;
    }

    @Override // l.C23363, l.AbstractC0204
    /* renamed from: ֫ */
    public final void mo1216(C9938 c9938) {
        C17013 c17013;
        C17013 c170132;
        C17013 c170133;
        boolean z = c9938.f30017 == null;
        if (this.f10096 && !z) {
            C9184 c9184 = this.f10095;
            AbstractC12486 abstractC12486 = c9184.f27819.f18880;
            abstractC12486.getClass();
            char[] charArray = "$loc".toCharArray();
            C12048 c12048 = new C12048(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF, abstractC12486.mo15927(charArray, charArray.length), c9938.f30017.f16086, this.f10097.f26045);
            c17013 = c9184.f27818;
            C9378 m39923 = c17013.m39923(c12048, c9938.f30017);
            c170132 = c9184.f27818;
            c170133 = c9184.f27818;
            this.f75051 = c170132.m39902(0L, C2609.of((Object) m39923, (Object) c170133.m39964((AbstractC12612) null)));
            return;
        }
        this.f75051 = c9938;
    }

    public C3207(C9184 c9184, boolean z, C8526 c8526) {
        this.f10095 = c9184;
        this.f10096 = z;
        this.f10097 = c8526;
    }
}

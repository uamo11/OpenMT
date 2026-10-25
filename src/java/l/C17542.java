package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: 1AFL */
/* renamed from: l.ܿᩴ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17542 extends AbstractC7548 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f53589;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14719 f53590;

    public C17542(AbstractActivityC3346 abstractActivityC3346, C14719 c14719) {
        this.f53589 = abstractActivityC3346;
        this.f53590 = c14719;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f53589, this.f53590.f44954 != -1 ? R.string.MT_Protector_res_0x7f1201ea : R.string.MT_Protector_res_0x7f1201e9);
        C13136 c13136 = this.f23322;
        C11003.requireNonNull(c13136);
        c13136.m31860(new RunnableC22934(3, c13136));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0207 A[Catch: all -> 0x0272, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0272, blocks: (B:82:0x01b6, B:84:0x01ba, B:87:0x01c8, B:88:0x01d1, B:92:0x01dd, B:95:0x01e6, B:96:0x01ea, B:98:0x01f8, B:99:0x01fb, B:103:0x0207, B:108:0x0226, B:110:0x022c, B:111:0x024e, B:112:0x024f, B:113:0x0271, B:115:0x01d9, B:116:0x01c6, B:117:0x01cc), top: B:81:0x01b6, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x019b  */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1009() {
        /*
            Method dump skipped, instructions count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17542.mo1009():void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41018(C17542 c17542, AtomicBoolean atomicBoolean) {
        c17542.f23322.m31858(R.string.MT_Protector_res_0x7f120af8);
        atomicBoolean.set(true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41017(C17542 c17542, AtomicBoolean atomicBoolean) {
        c17542.f23322.m31858(R.string.MT_Protector_res_0x7f120535);
        atomicBoolean.set(true);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m41019(C17542 c17542, AtomicBoolean atomicBoolean) {
        c17542.f23322.m31858(R.string.MT_Protector_res_0x7f120536);
        atomicBoolean.set(true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        if (this.f23322.m31868()) {
            return;
        }
        C21374.m48457(R.string.MT_Protector_res_0x7f1206d4);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f23322.m31868()) {
            return;
        }
        this.f53589.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        if (this.f23322.m31868()) {
            return;
        }
        m20273();
    }
}

package l;

import android.content.DialogInterface;
import android.graphics.RectF;
import bin.mt.plus.R;

/* compiled from: Q7Z8 */
/* renamed from: l.ۢۛܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9405 extends AbstractC7548 {

    /* renamed from: ᩸᩷֡, reason: not valid java name and contains not printable characters */
    private static final short[] f28546 = {8650, -12020, -11950, -11956, -11963};

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f28547;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f28548;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16560 f28549;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16312 f28550;

    public C9405(C16560 c16560, AbstractC15440 abstractC15440) {
        this.f28549 = c16560;
        this.f28547 = abstractC15440;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20267(this.f28549.m39056(), R.string.MT_Protector_res_0x7f120528);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        RectF m38408 = this.f28550.m38408();
        int m38410 = (int) this.f28550.m38410();
        int m38405 = (int) this.f28550.m38405();
        if (m38410 == -1 && m38405 == -1) {
            m38410 = (int) (m38408.right - m38408.left);
            m38405 = (int) (m38408.bottom - m38408.top);
        } else if (m38408 == null) {
            this.f28550.m38400(m38410, m38405);
        }
        int i = m38410;
        int i2 = m38405;
        new C20694(this, this.f28549.m39056(), i, i2, i, i2);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f28549.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        if (l.C3911.f12484 < 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
    
        if (l.C3911.m11924() > 0) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x007a, code lost:
    
        if (l.RunnableC1937.m6387() != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0088, code lost:
    
        r0 = l.C0630.m2566("᩶ۖ") ^ r20;
        r13 = ((r0 ^ r21) * (-26539)) ^ (-542598330);
        r22 = 1027110914;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0084, code lost:
    
        if (l.C1711.m5736() <= 0) goto L74;
     */
    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo1009() {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9405.mo1009():void");
    }
}

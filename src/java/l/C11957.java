package l;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: 61L9 */
/* renamed from: l.ۨ᩷ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C11957 extends AbstractC7548 {

    /* renamed from: ۢᩳ᩶, reason: not valid java name and contains not printable characters */
    private static final short[] f35797;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f35798;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35799;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35800;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Bundle f35801;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11273 f35802;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC1748 f35803;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f35804 = true;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C19697 f35805;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ArrayList f35806;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35807;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ byte[] f35808;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9170 f35809;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11273 f35810;

    static {
        ApplicationC12518.m30701(95);
        f35797 = new short[]{3964, 18965, 19038, 19035, 19022, 19035, 18964, 18955, 18964, 18952};
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public native void mo1007(Exception exc);

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public native void mo1009();

    public C11957(ActivityC1748 activityC1748, boolean z, boolean z2, byte[] bArr, String str, int i, ArrayList arrayList, Bundle bundle) {
        this.f35803 = activityC1748;
        this.f35800 = z;
        this.f35807 = z2;
        this.f35808 = bArr;
        this.f35798 = str;
        this.f35799 = i;
        this.f35806 = arrayList;
        this.f35801 = bundle;
        this.f35809 = C9170.m23579(activityC1748);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ۙ᩷ᩳ] */
    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C7473 c7473;
        C3885 c3885;
        C13658 c13658;
        C13658 c136582;
        ActivityC1748 activityC1748 = this.f35803;
        activityC1748.f6046 = true;
        c7473 = activityC1748.f6064;
        c7473.m20081();
        m20271(activityC1748, this.f35809, (RunnableC4901) new Runnable() { // from class: l.ۙ᩷ᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C11957.m29234(C11957.this);
            }
        });
        if (this.f35800) {
            return;
        }
        c3885 = activityC1748.f6055;
        c13658 = activityC1748.f6067;
        String str = c13658.f40729;
        c136582 = activityC1748.f6052;
        c3885.m11731(str, c136582.f40729);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m29234(C11957 c11957) {
        C7473 c7473;
        C13136 c13136 = c11957.f23322;
        c7473 = c11957.f35803.f6064;
        C11003.requireNonNull(c7473);
        c13136.m31860(new RunnableC6312(0, c7473));
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r3.m30775() != false) goto L35;
     */
    /* JADX WARN: Incorrect condition in loop: B:41:0x00ce */
    /* JADX WARN: Incorrect condition in loop: B:47:0x0117 */
    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1006() {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11957.mo1006():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean m29233() {
        C7473 c7473;
        C7473 c74732;
        C13136 c13136 = this.f23322;
        ActivityC1748 activityC1748 = this.f35803;
        c7473 = activityC1748.f6064;
        if (c7473.m20096().m30493()) {
            return true;
        }
        c74732 = activityC1748.f6064;
        if (c74732.m20077().m30493()) {
            return true;
        }
        return c13136 != null && c13136.m31868();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r2.m51241() == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r2.m51241() != false) goto L16;
     */
    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1010() {
        /*
            r5 = this;
            l.֫ۢᩳ r0 = r5.f35803
            l.۟۫ᩳ r1 = l.ActivityC1748.m5865(r0)
            r1.m20091()
            r5.m20273()
            l.᩵᩶ܿ r1 = r5.f35805
            if (r1 == 0) goto L13
            r1.m45389()
        L13:
            l.ۡ᩹ۡ r1 = r5.f35809
            boolean r1 = r1.m23581()
            if (r1 != 0) goto L1c
            return
        L1c:
            l.ܺۢᩳ r1 = l.ActivityC1748.m5864(r0)
            l.᩺ܶᩳ r2 = l.ActivityC1748.m5858(r0)
            r3 = 0
            if (r2 == 0) goto L31
            l.᩺ܶᩳ r2 = l.ActivityC1748.m5858(r0)
            boolean r2 = r2.m51241()
            if (r2 != 0) goto L41
        L31:
            l.᩺ܶᩳ r2 = l.ActivityC1748.m5843(r0)
            if (r2 == 0) goto L43
            l.᩺ܶᩳ r2 = l.ActivityC1748.m5843(r0)
            boolean r2 = r2.m51241()
            if (r2 == 0) goto L43
        L41:
            r2 = 1
            goto L44
        L43:
            r2 = 0
        L44:
            r1.m37588(r2)
            l.۟۫ᩳ r1 = l.ActivityC1748.m5865(r0)
            l.۫ۨᩳ r1 = r1.m20095()
            l.ܺۢᩳ r2 = l.ActivityC1748.m5864(r0)
            boolean r4 = r1.m30296()
            r2.m37592(r4)
            l.ܺۢᩳ r2 = l.ActivityC1748.m5864(r0)
            boolean r1 = r1.m30383()
            r2.m37571(r1)
            boolean r1 = l.ActivityC1748.m5857(r0)
            if (r1 != 0) goto L7a
            l.ܺۢᩳ r1 = l.ActivityC1748.m5864(r0)
            l.۟۫ᩳ r2 = l.ActivityC1748.m5865(r0)
            boolean r2 = r2.m20076()
            r1.m37578(r2)
        L7a:
            l.ܺۢᩳ r1 = l.ActivityC1748.m5864(r0)
            l.۟۫ᩳ r2 = l.ActivityC1748.m5865(r0)
            l.۫ۨᩳ r2 = r2.m20096()
            boolean r2 = r2.m30297()
            r1.m37570(r2)
            l.ܺۢᩳ r1 = l.ActivityC1748.m5864(r0)
            l.۟۫ᩳ r2 = l.ActivityC1748.m5865(r0)
            l.۫ۨᩳ r2 = r2.m20077()
            boolean r2 = r2.m30297()
            r1.m37590(r2)
            l.ۘۤᩳ r1 = l.ActivityC1748.m5850(r0)
            r1.m11739()
            int r1 = r5.f35799
            l.ActivityC1748.m5832(r0, r1)
            l.ActivityC1748.m5860(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11957.mo1010():void");
    }
}

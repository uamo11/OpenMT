package l;

import android.content.DialogInterface;
import com.alipay.sdk.app.PayTask;
import com.alipay.sdk.m.y.o;

/* compiled from: 08W8 */
/* renamed from: l.ܳ᩻ۡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14854 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f45317;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f45318;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f45319;

    public C14854(AbstractActivityC3346 abstractActivityC3346, int i) {
        this.f45318 = abstractActivityC3346;
        this.f45319 = i;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20266(this.f45318);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C5242 c5242 = C7094.f21798;
        String[] m19098 = C7094.m19098(this.f45319, 0);
        C22470.f72773 = new RunnableC19384(2, m19098);
        this.f45317 = (String) new PayTask(this.f45318).payV2(m19098[0], true).get(o.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0.equals("8000") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        l.C21374.m48459((java.lang.CharSequence) "支付结果未知");
        r0 = l.C22470.f72773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r0 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        r0.run();
        r0 = l.C8058.f24861;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r0.equals("6004") == false) goto L43;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1006() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f45317
            if (r0 == 0) goto L81
            int r1 = r0.hashCode()
            switch(r1) {
                case 1596796: goto L72;
                case 1626587: goto L63;
                case 1656379: goto L54;
                case 1656380: goto L45;
                case 1656382: goto L2d;
                case 1715960: goto L24;
                case 1745751: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L81
        Ld:
            java.lang.String r1 = "9000"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L81
            java.lang.String r0 = "支付成功"
            l.C21374.m48459(r0)
            java.lang.Runnable r0 = l.C22470.f72773
            if (r0 == 0) goto L44
            r0.run()
            l.۠۠᩵ r0 = l.C8058.f24861
            return
        L24:
            java.lang.String r1 = "8000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L81
        L2d:
            java.lang.String r1 = "6004"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L81
        L36:
            java.lang.String r0 = "支付结果未知"
            l.C21374.m48459(r0)
            java.lang.Runnable r0 = l.C22470.f72773
            if (r0 == 0) goto L44
            r0.run()
            l.۠۠᩵ r0 = l.C8058.f24861
        L44:
            return
        L45:
            java.lang.String r1 = "6002"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4e
            goto L81
        L4e:
            java.lang.String r0 = "网络连接出错"
            l.C21374.m48459(r0)
            return
        L54:
            java.lang.String r1 = "6001"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5d
            goto L81
        L5d:
            java.lang.String r0 = "支付被取消"
            l.C21374.m48459(r0)
            return
        L63:
            java.lang.String r1 = "5000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L6c
            goto L81
        L6c:
            java.lang.String r0 = "重复请求"
            l.C21374.m48459(r0)
            return
        L72:
            java.lang.String r1 = "4000"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7b
            goto L81
        L7b:
            java.lang.String r0 = "支付失败"
            l.C21374.m48459(r0)
            return
        L81:
            java.lang.String r0 = "未知错误"
            l.C21374.m48459(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14854.mo1006():void");
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        this.f45318.m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}

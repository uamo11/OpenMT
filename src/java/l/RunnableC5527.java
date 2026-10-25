package l;

import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;

/* compiled from: 195F */
/* renamed from: l.ۚᩳ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5527 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f17101;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10235 f17102;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f17103;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Spinner f17104;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Main f17105;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f17106;

    public /* synthetic */ RunnableC5527(Main main, long j, Spinner spinner, C10235 c10235, Spinner spinner2, TextView textView) {
        this.f17105 = main;
        this.f17106 = j;
        this.f17104 = spinner;
        this.f17102 = c10235;
        this.f17101 = spinner2;
        this.f17103 = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (r1 == 0) goto L17;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r14 = this;
            android.widget.Spinner r0 = r14.f17101
            android.widget.Spinner r1 = r14.f17104
            int r1 = r1.getSelectedItemPosition()
            r2 = 2
            android.widget.TextView r3 = r14.f17103
            if (r1 == r2) goto Lb2
            r2 = 3
            if (r1 != r2) goto L12
            goto Lb2
        L12:
            r2 = 0
            r3.setVisibility(r2)
            bin.mt.plus.Main r4 = r14.f17105
            long r5 = r14.f17106
            l.ۤۤᩳ r7 = r14.f17102
            r8 = 1
            java.lang.String r9 = "..."
            r10 = 1
            if (r1 != 0) goto L6c
            l.۟᩺ᩳ r1 = r7.m30436()     // Catch: java.lang.Exception -> L6a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L6a
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L6a
            long r12 = (long) r1     // Catch: java.lang.Exception -> L6a
            int r0 = r0.getSelectedItemPosition()     // Catch: java.lang.Exception -> L6a
            int r0 = r0 * 10
            long r0 = r10 << r0
            long r12 = r12 * r0
            r0 = 0
            int r10 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r10 != 0) goto L44
            r3.setText(r9)     // Catch: java.lang.Exception -> L6a
            return
        L44:
            long r0 = r5 / r12
            int r1 = (int) r0     // Catch: java.lang.Exception -> L6a
            long r10 = (long) r1     // Catch: java.lang.Exception -> L6a
            long r10 = r10 * r12
            int r0 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r0 == 0) goto L4f
            goto L51
        L4f:
            if (r1 != 0) goto L53
        L51:
            int r1 = r1 + 1
        L53:
            android.content.res.Resources r0 = r4.getResources()     // Catch: java.lang.Exception -> L6a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Exception -> L6a
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L6a
            r5[r2] = r4     // Catch: java.lang.Exception -> L6a
            r2 = 2131820561(0x7f110011, float:1.927384E38)
            java.lang.String r0 = r0.getQuantityString(r2, r1, r5)     // Catch: java.lang.Exception -> L6a
            r3.setText(r0)     // Catch: java.lang.Exception -> L6a
            return
        L6a:
            r0 = move-exception
            goto La0
        L6c:
            if (r1 != r8) goto Lb1
            l.۟᩺ᩳ r0 = r7.m30436()     // Catch: java.lang.Exception -> L6a
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L6a
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L6a
            if (r0 != 0) goto L80
            r3.setText(r9)     // Catch: java.lang.Exception -> L6a
            return
        L80:
            long r0 = (long) r0     // Catch: java.lang.Exception -> L6a
            long r0 = r5 / r0
            int r12 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r12 >= 0) goto L8c
            int r12 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r12 >= 0) goto L8c
            goto L8d
        L8c:
            r10 = r0
        L8d:
            java.lang.String r0 = l.C22927.m51028(r10)     // Catch: java.lang.Exception -> L6a
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch: java.lang.Exception -> L6a
            r1[r2] = r0     // Catch: java.lang.Exception -> L6a
            r0 = 2131888576(0x7f1209c0, float:1.9411791E38)
            java.lang.String r0 = r4.getString(r0, r1)     // Catch: java.lang.Exception -> L6a
            r3.setText(r0)     // Catch: java.lang.Exception -> L6a
            return
        La0:
            int r1 = r7.m30526()
            if (r1 != 0) goto Laa
            r3.setText(r9)
            goto Lb1
        Laa:
            java.lang.String r0 = r0.toString()
            r3.setText(r0)
        Lb1:
            return
        Lb2:
            r0 = 0
            r3.setText(r0)
            r0 = 8
            r3.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC5527.run():void");
    }
}

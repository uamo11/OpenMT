package l;

import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: JAK2 */
/* renamed from: l.ۛ᩶᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6295 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f19457;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1607 f19458;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f19459;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC14306 f19460;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f19461;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6295(C1607 c1607, Main main, boolean z, CheckBox checkBox, ViewGroup viewGroup, String str, RunnableC14306 runnableC14306) {
        super(main, R.string.MT_Protector_res_0x7f12020f);
        boolean z2;
        boolean z3;
        C16560 c16560;
        this.f19458 = c1607;
        this.f19457 = z;
        this.f19459 = checkBox;
        this.f19461 = str;
        this.f19460 = runnableC14306;
        if (z) {
            z3 = c1607.f5663;
            if (!z3) {
                checkBox.setVisibility(8);
            }
            c16560 = c1607.f5665;
            Main m39056 = c16560.m39056();
            CheckBox checkBox2 = (CheckBox) m39056.m10216(R.layout.MT_Protector_res_0x7f0d01d0);
            viewGroup.addView(checkBox2);
            C10025.m25194(m39056, checkBox2, str);
        }
        z2 = c1607.f5663;
        if (z2 || z) {
            FrameLayout m31286 = m31286();
            m31286.setVisibility(0);
            m31286.addView(viewGroup);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r6 != ((l.C12645) r1.get(0)).getTime()) goto L22;
     */
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2170() {
        /*
            r11 = this;
            l.֫ۙ᩻ r0 = r11.f19458
            java.lang.String r1 = r11.m31260()
            java.lang.String r1 = r1.trim()
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L14
            r11.m31262()
            return
        L14:
            long r6 = l.C17283.m40575(r1)
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 >= 0) goto L25
            r0 = 2131886634(0x7f12022a, float:1.9407852E38)
            r11.m31263(r0)
            return
        L25:
            l.ܶ᩵ܿ r1 = l.C1607.m5469(r0)     // Catch: l.C1637 -> L85
            l.ܽ֨ۢ r2 = l.EnumC16309.MODIFY_FILE     // Catch: l.C1637 -> L85
            l.C17721.m41504(r1, r2)     // Catch: l.C1637 -> L85
            boolean r1 = l.C1607.m5468(r0)
            r2 = 0
            if (r1 == 0) goto L40
            android.widget.CheckBox r1 = r11.f19459
            boolean r1 = r1.isChecked()
            if (r1 == 0) goto L40
            r1 = 1
            r8 = 1
            goto L42
        L40:
            r1 = 0
            r8 = 0
        L42:
            boolean r1 = l.C1607.m5472(r0)
            if (r1 != 0) goto L5c
            if (r8 != 0) goto L5c
            java.util.List r1 = l.C1607.m5470(r0)
            java.lang.Object r1 = r1.get(r2)
            l.۫᩶᩻ r1 = (l.C12645) r1
            long r1 = r1.getTime()
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 == 0) goto L81
        L5c:
            boolean r1 = r11.f19457
            l.ܳۙ᩻ r5 = r11.f19460
            if (r1 == 0) goto L77
            l.ܽۢܳ r0 = l.C1607.m5471(r0)
            bin.mt.plus.Main r0 = r0.m39056()
            l.ۤ᩶᩻ r1 = new l.ۤ᩶᩻
            r3 = r1
            r4 = r11
            r3.<init>()
            java.lang.String r2 = r11.f19461
            l.C10025.m25197(r1, r0, r2)
            goto L81
        L77:
            r9 = 0
            r10 = 0
            r1 = r5
            r2 = r6
            r4 = r8
            r5 = r9
            r6 = r10
            l.C1607.m5467(r0, r1, r2, r4, r5, r6)
        L81:
            r11.m31262()
            return
        L85:
            r1 = move-exception
            l.ܽۢܳ r0 = l.C1607.m5471(r0)
            bin.mt.plus.Main r0 = r0.m39056()
            r2 = 0
            r0.m10223(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6295.mo2170():void");
    }
}

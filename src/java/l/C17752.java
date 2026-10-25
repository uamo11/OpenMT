package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: SAKA */
/* renamed from: l.ᩳ֫᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17752 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f54305;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23396 f54306;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f54307;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC1000 f54308;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f54309;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17752(C23396 c23396, Main main, View view, CheckBox checkBox, CheckBox checkBox2, RunnableC1000 runnableC1000) {
        super(main, R.string.MT_Protector_res_0x7f12020f);
        boolean z;
        this.f54306 = c23396;
        this.f54309 = view;
        this.f54305 = checkBox;
        this.f54307 = checkBox2;
        this.f54308 = runnableC1000;
        z = c23396.f75152;
        if (z) {
            FrameLayout m31286 = m31286();
            m31286.setVisibility(0);
            m31286.addView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r2 != ((l.InterfaceC17889) r6.get(0)).getTime()) goto L28;
     */
    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo2170() {
        /*
            r8 = this;
            l.᩻֫᩻ r1 = r8.f54306
            java.lang.String r0 = r8.m31260()
            java.lang.String r0 = r0.trim()
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L14
            r8.m31262()
            return
        L14:
            long r2 = l.C17283.m40575(r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L25
            r0 = 2131886634(0x7f12022a, float:1.9407852E38)
            r8.m31263(r0)
            return
        L25:
            l.ܽۢܳ r0 = l.C23396.m51843(r1)     // Catch: l.C1637 -> L81
            java.lang.String r0 = r0.m38991()     // Catch: l.C1637 -> L81
            l.ܽ֨ۢ r4 = l.EnumC16309.MODIFY_DIRECTORY_LINKED     // Catch: l.C1637 -> L81
            l.C17721.m41503(r0, r4)     // Catch: l.C1637 -> L81
            boolean r0 = l.C23396.m51840(r1)
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L43
            android.widget.CheckBox r0 = r8.f54305
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L43
            goto L45
        L43:
            r0 = 0
            r4 = 0
        L45:
            boolean r0 = l.C23396.m51840(r1)
            if (r0 == 0) goto L55
            android.widget.CheckBox r0 = r8.f54307
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L55
            r0 = 1
            r5 = 1
        L55:
            r0 = 0
            boolean r6 = l.C23396.m51842(r1)
            if (r6 != 0) goto L72
            if (r4 != 0) goto L72
            if (r5 != 0) goto L72
            java.util.List r6 = l.C23396.m51841(r1)
            java.lang.Object r0 = r6.get(r0)
            l.ᩳۜܳ r0 = (l.InterfaceC17889) r0
            long r6 = r0.getTime()
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L7d
        L72:
            l.ܿ֫᩻ r7 = new l.ܿ֫᩻
            l.֨۠ᩳ r6 = r8.f54308
            r0 = r7
            r0.<init>(r1, r2, r4, r5, r6)
            r7.m20274()
        L7d:
            r8.m31262()
            return
        L81:
            r0 = move-exception
            l.ܽۢܳ r1 = l.C23396.m51843(r1)
            bin.mt.plus.Main r1 = r1.m39056()
            r2 = 0
            r1.m10223(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C17752.mo2170():void");
    }
}

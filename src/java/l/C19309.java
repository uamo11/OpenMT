package l;

import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: TAHS */
/* renamed from: l.᩵ۜ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19309 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f60724;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8019 f60725;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CheckBox f60726;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ RunnableC21134 f60727;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f60728;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19309(C8019 c8019, Main main, View view, CheckBox checkBox, CheckBox checkBox2, RunnableC21134 runnableC21134) {
        super(main, R.string.MT_Protector_res_0x7f12020f);
        boolean z;
        this.f60725 = c8019;
        this.f60728 = view;
        this.f60724 = checkBox;
        this.f60726 = checkBox2;
        this.f60727 = runnableC21134;
        z = c8019.f24756;
        if (z) {
            FrameLayout m31286 = m31286();
            m31286.setVisibility(0);
            m31286.addView(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (r4 != ((l.InterfaceC17889) r0.get(0)).getTime()) goto L28;
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
            java.lang.String r0 = r8.m31260()
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L12
            r8.m31262()
            return
        L12:
            long r4 = l.C17283.m40575(r0)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L23
            r0 = 2131886634(0x7f12022a, float:1.9407852E38)
            r8.m31263(r0)
            return
        L23:
            l.۠ۜ᩻ r2 = r8.f60725
            boolean r0 = l.C8019.m21336(r2)
            r1 = 0
            if (r0 == 0) goto L37
            android.widget.CheckBox r0 = r8.f60724
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L37
            r0 = 1
            r6 = 1
            goto L39
        L37:
            r0 = 0
            r6 = 0
        L39:
            boolean r0 = l.C8019.m21336(r2)
            if (r0 == 0) goto L4a
            android.widget.CheckBox r0 = r8.f60726
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L4a
            r0 = 1
            r7 = 1
            goto L4c
        L4a:
            r0 = 0
            r7 = 0
        L4c:
            boolean r0 = l.C8019.m21338(r2)
            if (r0 != 0) goto L68
            if (r6 != 0) goto L68
            if (r7 != 0) goto L68
            java.util.List r0 = l.C8019.m21337(r2)
            java.lang.Object r0 = r0.get(r1)
            l.ᩳۜܳ r0 = (l.InterfaceC17889) r0
            long r0 = r0.getTime()
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 == 0) goto L6d
        L68:
            l.᩷᩷᩻ r3 = r8.f60727
            l.C8019.m21335(r2, r3, r4, r6, r7)
        L6d:
            r8.m31262()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19309.mo2170():void");
    }
}

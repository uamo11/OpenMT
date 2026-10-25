package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.m.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: TAIM */
/* renamed from: l.ۚۡ᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C5259 extends AbstractC16891 implements InterfaceC19944 {

    /* renamed from: ֨ۙܿ, reason: not valid java name and contains not printable characters */
    private static final short[] f16451;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f16452 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C17897 f16453;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f16454;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f16455;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C16415 f16456;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f16457;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f16458;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f16459;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6993 f16460;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC10128 f16461;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23926 f16462;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f16463;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static native Object m15151(C19697 c19697, Object obj);

    @Override // l.InterfaceC19944
    /* renamed from: ֫ */
    public final /* synthetic */ void mo13541(C16560 c16560, View view, C16415 c16415, InterfaceC17827 interfaceC17827) {
        C22060.m49619(this, c16560, c16415, interfaceC17827);
    }

    @Override // l.AbstractC16891
    /* renamed from: ۗ */
    public final String mo6007() {
        return b.k;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۟ */
    public final boolean mo6011() {
        return false;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ */
    public final boolean mo6014(String str) {
        return false;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ֫ */
    public final boolean mo6015() {
        return true;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int mo15166() {
        return R.string.MT_Protector_res_0x7f120a80;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۫ */
    public final boolean mo6016() {
        return true;
    }

    static {
        ApplicationC12518.m30701(65);
        f16451 = new short[]{2443, 24793, 24722, 24727, 24706, 24727};
        C13654.m32812(b.k);
        C9214.m23656("local", b.k, new C13745());
        C9214.m23656("zip", b.k, new C7396());
        C9214.m23656("tar", b.k, new C1731());
        C9214.m23656("archive", b.k, new C10904());
        C9214.m23656("compress", b.k, new C16547());
        C9214.m23656("payload", b.k, new C17959());
        C9214.m23656(b.k, "local", new C17253());
        C9214.m23656(b.k, b.k, new C22068(1));
        C9214.m23656(b.k, "zip", new C13040());
    }

    public C5259(int i, AbstractC3577 abstractC3577) {
        super(i, "/");
        this.f16456 = new C16415(b.k, null);
        this.f16462 = new C23926(this);
        this.f16460 = new C6993(this);
        this.f16461 = new C9493(this);
        this.f16454 = new C8787(this);
        this.f16455 = new C15841(R.string.MT_Protector_res_0x7f120607, R.drawable.MT_Protector_res_0x7f080252);
        this.f16459 = abstractC3577.f11356;
        AbstractC3163 mo6366 = abstractC3577.mo6366(m39746());
        this.f16457 = mo6366;
        mo6366.f9953 = false;
        this.f16453 = new C17897(mo6366);
        mo35230(mo6366.mo9699());
    }

    public C5259(C12951 c12951) {
        super(c12951);
        this.f16456 = new C16415(b.k, null);
        this.f16462 = new C23926(this);
        this.f16460 = new C6993(this);
        this.f16461 = new C9493(this);
        this.f16454 = new C8787(this);
        this.f16455 = new C15841(R.string.MT_Protector_res_0x7f120607, R.drawable.MT_Protector_res_0x7f080252);
        this.f16459 = c12951.readInt();
        AbstractC3163 m9676 = AbstractC3163.m9676(c12951);
        this.f16457 = m9676;
        m9676.f9953 = false;
        this.f16453 = new C17897(m9676);
    }

    public C5259(int i, String str, int i2, AbstractC3163 abstractC3163) {
        super(i, str);
        this.f16456 = new C16415(b.k, null);
        this.f16462 = new C23926(this);
        this.f16460 = new C6993(this);
        this.f16461 = new C9493(this);
        this.f16454 = new C8787(this);
        this.f16455 = new C15841(R.string.MT_Protector_res_0x7f120607, R.drawable.MT_Protector_res_0x7f080252);
        this.f16459 = i2;
        this.f16457 = abstractC3163;
        abstractC3163.f9953 = false;
        this.f16453 = new C17897(abstractC3163);
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    public final void mo6004(C10130 c10130) {
        super.mo6004(c10130);
        c10130.writeInt(this.f16459);
        this.f16457.mo7643(c10130);
    }

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final int m15168() {
        return this.f16459;
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15160(String str, boolean z) {
        AbstractC3577 m31047 = C12749.m31047(this.f16459);
        if (m31047 != null) {
            C9068.m23402(str, new C17534(m31047, z));
        }
    }

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3577 m15171() {
        return C12749.m31047(this.f16459);
    }

    @Override // l.AbstractC16891
    /* renamed from: ۙ */
    public final String mo6009() {
        return this.f16457.f9955.mo6371() + super.mo6009();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5259 m15152(C5259 c5259, C16560 c16560, int i) {
        C5259 c52592 = new C5259(i, c5259.m39741(), c5259.f16459, (AbstractC3163) C11806.m28856(c5259.f16457.m33350(), false));
        c16560.m39003(c52592);
        return c52592;
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final boolean mo15163() {
        this.f16457.getClass();
        return true;
    }

    @Override // l.AbstractC16891
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo15170(String str) {
        return str == null || str.equals(this.f16457.mo9688());
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩶ */
    public final AbstractC3163 mo6020() {
        return this.f16457;
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩶ */
    public final AbstractC13921 mo6020() {
        return this.f16457;
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩺ */
    public final void mo6021() {
        this.f16457.mo9707();
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f16458;
        if (dialogInterfaceC0206 == null || !dialogInterfaceC0206.m1442()) {
            return;
        }
        this.f16458.dismiss();
        this.f16458 = null;
    }

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final void m15173() {
        this.f16457.getClass();
    }

    @Override // l.AbstractC16891
    /* renamed from: ۤ */
    public final List mo6012() {
        String m39741 = m39741();
        boolean z = m39741.length() > 1;
        ArrayList mo7637 = this.f16457.mo7637(m39741, ApplicationC20075.f65010.getBoolean("show_hidden_file", true));
        if (z) {
            mo7637.add(0, C15688.f48358);
        }
        return mo7637;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo15165(C2450 c2450) {
        C16560 m7919 = c2450.m7919();
        C23144 c23144 = new C23144(android.R.string.cut, R.drawable.MT_Protector_res_0x7f0801e5);
        if (m7919.m39035("local")) {
            C11856 c11856 = new C11856(R.string.MT_Protector_res_0x7f1205ec, R.drawable.MT_Protector_res_0x7f0801e5);
            c11856.m5604();
            c11856.mo5603(c23144);
            return c11856;
        }
        if (m7919.m39035(b.k)) {
            C1894 c1894 = new C1894(b.k);
            c1894.mo5603(c23144);
            return c1894;
        }
        C4442 c4442 = new C4442();
        c4442.mo5603(c23144);
        return c4442;
    }

    @Override // l.AbstractC16891
    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo15159() {
        return new C8031();
    }

    @Override // l.AbstractC16891
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo15169() {
        return new C0566(R.string.MT_Protector_res_0x7f1205ca, R.drawable.MT_Protector_res_0x7f0801e6);
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo15172() {
        return new C1188();
    }

    @Override // l.AbstractC16891
    /* renamed from: ۘ */
    public final AbstractC1661 mo6008() {
        return new DialogInterfaceOnDismissListenerC23766();
    }

    @Override // l.AbstractC16891
    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC1661 mo15164() {
        return new C9034(R.string.MT_Protector_res_0x7f1205ae, R.drawable.MT_Protector_res_0x7f0801cf);
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15162(InterfaceC17889 interfaceC17889) {
        mo15160(interfaceC17889.getPath(), interfaceC17889.isDirectory());
    }

    @Override // l.AbstractC16891
    /* renamed from: ᩻ */
    public final InterfaceC10834 mo14827() {
        return this.f16453;
    }

    @Override // l.AbstractC16891
    /* renamed from: ܳ */
    public final C12244 mo6017() {
        String m39741 = m39741();
        AbstractC3163 abstractC3163 = this.f16457;
        String name = abstractC3163.f9955.getName();
        if (!abstractC3163.f9955.f11358) {
            m39741 = abstractC3163.f9955.mo6370() + m39741;
        }
        return new C12244(name, m39741, abstractC3163.f9955.getIcon());
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo15161(C16560 c16560, String str, boolean z) {
        if (str.contains("/")) {
            C21374.m48457(R.string.MT_Protector_res_0x7f1203ae);
        } else {
            new C14430(this, c16560, C9523.m24393(m39741(), str), z, str).m20274();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r1.m24060(r8, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo6006(l.C16560 r7, l.C16560 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "net"
            r7.m38998(r0)
            int r0 = r6.f16459
            l.ۗ᩻᩻ r0 = l.C12749.m31047(r0)
            if (r0 != 0) goto L14
            r7 = 2131887815(0x7f1206c7, float:1.9410248E38)
            l.C21374.m48463(r7)
            return
        L14:
            l.ܽ᩷ܳ r1 = r8.m39044()
            boolean r1 = l.C5561.m15775(r1, r0)
            if (r1 != 0) goto L5e
            l.ۢۘܳ r1 = r7.m39016()
            r1.m24074()     // Catch: java.lang.Throwable -> L59
            l.ۨ᩸ۡ r2 = r1.m24094()     // Catch: java.lang.Throwable -> L59
            r3 = 0
            r4 = 0
        L2b:
            int r5 = r2.size()     // Catch: java.lang.Throwable -> L59
            if (r4 >= r5) goto L45
            java.lang.Object r5 = r2.get(r4)     // Catch: java.lang.Throwable -> L59
            l.ܽ᩷ܳ r5 = (l.AbstractC16891) r5     // Catch: java.lang.Throwable -> L59
            boolean r5 = l.C5561.m15775(r5, r0)     // Catch: java.lang.Throwable -> L59
            if (r5 == 0) goto L42
            r1.m24060(r8, r4, r3)     // Catch: java.lang.Throwable -> L59
            r3 = 1
            goto L45
        L42:
            int r4 = r4 + 1
            goto L2b
        L45:
            r1.m24083()
            if (r3 != 0) goto L5e
            l.ۛܳᩳ r0 = new l.ۛܳᩳ
            r0.<init>(r6, r8)
            l.ᩴ᩷ܳ r1 = new l.ᩴ᩷ܳ
            r2 = 0
            r1.<init>(r2, r7)
            r8.m39010(r0, r1)
            return
        L59:
            r7 = move-exception
            r1.m24083()
            throw r7
        L5e:
            r7.m39018()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5259.mo6006(l.ܽۢܳ, l.ܽۢܳ):void");
    }

    @Override // l.AbstractC16891
    /* renamed from: ܽ */
    public final void mo6018(C16560 c16560) {
        if (this.f16463) {
            return;
        }
        List<C5977> m39739 = m39739();
        if (m39739.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C5977 c5977 : m39739) {
            if (c5977.m16773()) {
                arrayList.add(c5977);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        c16560.m39056().m127();
        m15155(c16560, arrayList, arrayList.size() == 1 ? C4925.m14306(R.string.MT_Protector_res_0x7f1206d5, ((C5977) arrayList.get(0)).m16774()) : C4925.m14327(R.string.MT_Protector_res_0x7f12040c) + "\n" + C9679.m24609(arrayList, "\n"), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m15155(final C16560 c16560, final ArrayList arrayList, String str, boolean z) {
        this.f16463 = true;
        View m10216 = c16560.m39056().m10216(R.layout.MT_Protector_res_0x7f0d0105);
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2)).setText(str);
        final RadioButton radioButton = (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0479);
        RadioButton radioButton2 = (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047a);
        final RadioButton radioButton3 = (RadioButton) m10216.findViewById(R.id.radioButton3);
        final RadioButton radioButton4 = (RadioButton) m10216.findViewById(R.id.radioButton4);
        if (z) {
            radioButton4.setVisibility(0);
        }
        radioButton.setChecked(true);
        ViewOnClickListenerC15861 viewOnClickListenerC15861 = new ViewOnClickListenerC15861(radioButton, radioButton2, radioButton3, radioButton4, 1);
        radioButton.setOnClickListener(viewOnClickListenerC15861);
        radioButton2.setOnClickListener(viewOnClickListenerC15861);
        radioButton3.setOnClickListener(viewOnClickListenerC15861);
        radioButton4.setOnClickListener(viewOnClickListenerC15861);
        C19258 buildDialog = c16560.m39056().buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44428(false);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.᩺ۢ᩻
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C5259.m15153(C5259.this, c16560, radioButton, arrayList, radioButton3, radioButton4);
            }
        });
        this.f16458 = buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15153(C5259 c5259, C16560 c16560, RadioButton radioButton, ArrayList arrayList, RadioButton radioButton2, RadioButton radioButton3) {
        AbstractC15440 abstractC15440 = null;
        c5259.f16458 = null;
        if (c16560.m39044() != c5259) {
            return;
        }
        if (radioButton.isChecked()) {
            new C20782(c5259, c16560, (C20765) c16560.m39056().getLifecycle(), arrayList, c5259.f16457).m20274();
            return;
        }
        if (radioButton2.isChecked()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C5977) it.next()).m16771();
            }
        } else if (radioButton3.isChecked()) {
            Iterator it2 = arrayList.iterator();
            long j = 0;
            while (it2.hasNext()) {
                C5977 c5977 = (C5977) it2.next();
                c5977.m16771();
                if (abstractC15440 == null || c5977.m16772() > j) {
                    abstractC15440 = c5977.m16768();
                    j = c5977.m16772();
                }
            }
            if (abstractC15440 != null) {
                C16560 m39026 = c16560.m39026();
                m39026.m39042();
                m39026.m39053(abstractC15440.getName());
                m39026.m39033(abstractC15440.m36511(), true);
            }
        }
        c5259.f16463 = false;
    }

    @Override // l.AbstractC16891
    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo15167() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f16458;
        if (dialogInterfaceC0206 == null || !dialogInterfaceC0206.m1442()) {
            return;
        }
        this.f16458.dismiss();
        this.f16458 = null;
    }

    @Override // l.InterfaceC19944
    /* renamed from: ֫ */
    public final void mo13540(C16415 c16415) {
        this.f16456 = c16415;
    }

    @Override // l.InterfaceC19944
    /* renamed from: ֫ */
    public final C16415 mo13539() {
        return this.f16456;
    }

    @Override // l.AbstractC16891
    /* renamed from: ۛ */
    public final List mo6010() {
        return Arrays.asList(AbstractC16891.f51864, this.f16462, this.f16460, AbstractC16891.f51865, AbstractC16891.f51860, AbstractC16891.f51857, this.f16455, this.f16461, this.f16454, m39743(), AbstractC16891.m39729(), AbstractC16891.m39725(R.string.MT_Protector_res_0x7f1205cf, false));
    }

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static boolean m15156() {
        return ApplicationC20075.f65010.getBoolean("show_hidden_file", true);
    }

    @Override // l.AbstractC16891
    /* renamed from: ۧ */
    public final AbstractC15440 mo6013(InterfaceC17889 interfaceC17889) {
        AbstractC15440 m36526 = this.f51870.m36526(C4303.m12893(m39741())).m36526(interfaceC17889.getName());
        m36526.mo23545();
        return m36526;
    }

    @Override // l.AbstractC16891
    /* renamed from: ֫ */
    public final void mo6005(C16560 c16560, List list, Runnable runnable) {
        new C19371(this, c16560, (C20765) c16560.m39056().getLifecycle(), list, runnable).m20274();
    }
}

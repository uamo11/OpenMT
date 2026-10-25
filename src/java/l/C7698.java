package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.List;

/* compiled from: X5LN */
/* renamed from: l.۟᩶ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7698 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C16415 f23779;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17079 f23780;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14298 f23781;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public TextView f23782;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC0206 f23783;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public TextView f23784;

    public C7698(C14298 c14298, C17079 c17079) {
        this.f23781 = c14298;
        this.f23780 = c17079;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C16560 c16560;
        AbstractC16891 abstractC16891;
        C16560 c165602;
        C16560 c165603;
        C16560 c165604;
        C14298 c14298 = this.f23781;
        c16560 = c14298.f43107;
        View m10216 = c16560.m39056().m10216(R.layout.MT_Protector_res_0x7f0d00b2);
        this.f23782 = (TextView) m10216.findViewById(R.id.textView1);
        this.f23784 = (TextView) m10216.findViewById(R.id.textView2);
        int i = 1;
        this.f23782.setText(C4925.m14306(R.string.MT_Protector_res_0x7f120202, 0));
        abstractC16891 = c14298.f43098;
        String mo6007 = abstractC16891.mo6007();
        c165602 = c14298.f43107;
        C16415 c16415 = new C16415(mo6007, c165602.m39020());
        this.f23779 = c16415;
        if (c16415.f50494.equals("/")) {
            this.f23784.setText("/");
        } else {
            this.f23784.setText("./");
        }
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a00a2).setOnClickListener(new ViewOnClickListenerC12303(i, this.f23780));
        c165603 = c14298.f43107;
        C19258 buildDialog = c165603.m39056().buildDialog();
        buildDialog.m44428(false);
        buildDialog.m44421(m10216);
        this.f23783 = buildDialog.m44438();
        c165604 = c14298.f43107;
        c165604.m39056().m118(true);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        List list;
        AbstractC16891 abstractC16891;
        List list2;
        AbstractC16891 abstractC168912;
        List list3;
        C14298 c14298 = this.f23781;
        C14047 c14047 = new C14047(this);
        try {
            list = c14298.f43109;
            C17079 c17079 = this.f23780;
            if (list != null) {
                abstractC168912 = c14298.f43098;
                AbstractC13921 mo6020 = abstractC168912.mo6020();
                list3 = c14298.f43109;
                c17079.m40092(mo6020, list3, c14047);
            } else {
                abstractC16891 = c14298.f43098;
                AbstractC13921 mo60202 = abstractC16891.mo6020();
                String str = this.f23779.f50494;
                list2 = c14298.f43095;
                c17079.m40091(mo60202, str, c14047, list2);
            }
        } finally {
            this.f23779.m38677();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        InterfaceC19944 interfaceC19944;
        List list;
        C16560 c16560;
        InterfaceC19944 interfaceC199442;
        boolean isEmpty = this.f23779.f50492.isEmpty();
        C14298 c14298 = this.f23781;
        if (!isEmpty) {
            c16560 = c14298.f43107;
            interfaceC199442 = c14298.f43110;
            C14298.m34099(c16560, interfaceC199442, this.f23779);
        } else {
            C21374.m48457(R.string.MT_Protector_res_0x7f1206fe);
        }
        if (this.f23779.f50492.isEmpty()) {
            list = c14298.f43109;
            if (list != null) {
                return;
            }
        }
        interfaceC19944 = c14298.f43110;
        interfaceC19944.mo13540(this.f23779);
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C16560 c16560;
        c16560 = this.f23781.f43107;
        c16560.m39056().m10223(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C16560 c16560;
        this.f23783.dismiss();
        c16560 = this.f23781.f43107;
        c16560.m39056().m118(false);
    }
}

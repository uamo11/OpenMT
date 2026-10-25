package l;

import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;

/* compiled from: O1K3 */
/* renamed from: l.֡᩷ۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0661 implements InterfaceC19449 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6306 f2559;

    public C0661(C6306 c6306) {
        this.f2559 = c6306;
    }

    @Override // l.InterfaceC19449
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2703(boolean z) {
        Bundle bundle;
        boolean z2;
        AbstractC2489 abstractC2489;
        C12366 c12366;
        C12392 c12392;
        InterfaceMenuItemC13827 interfaceMenuItemC13827;
        String mo14421;
        TextView textView;
        TextView textView2;
        TextView textView3;
        InterfaceMenuItemC13827 interfaceMenuItemC138272;
        Bundle bundle2;
        C6306 c6306 = this.f2559;
        bundle = c6306.f43260;
        if (bundle.getBoolean("changed", false) != z) {
            bundle2 = c6306.f43260;
            bundle2.putBoolean("changed", z);
            try {
                c6306.m34239(((ActivityC17169) c6306.requireActivity()).m40356());
            } catch (IOException unused) {
            }
            c6306.m34227(new C14213());
        }
        z2 = c6306.f19523;
        if (z2) {
            abstractC2489 = c6306.f19501;
            c12366 = c6306.f19514;
            c12392 = c6306.f19506;
            abstractC2489.mo7983(c12366, c12392.m30436());
            interfaceMenuItemC13827 = c6306.f19509;
            if (interfaceMenuItemC13827 != null) {
                interfaceMenuItemC138272 = c6306.f19509;
                interfaceMenuItemC138272.setEnabled(z);
            }
            if (z) {
                mo14421 = "*" + c6306.mo14421();
            } else {
                mo14421 = c6306.mo14421();
            }
            int i = z ? C21943.f70260 : C21943.f70287;
            textView = c6306.f19512;
            if (textView.getText().toString().equals(mo14421)) {
                return;
            }
            textView2 = c6306.f19512;
            textView2.setText(mo14421);
            textView3 = c6306.f19512;
            textView3.setTextColor(i);
        }
    }

    @Override // l.InterfaceC19449
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2704(boolean z, boolean z2) {
        boolean z3;
        InterfaceMenuItemC13827 interfaceMenuItemC13827;
        InterfaceMenuItemC13827 interfaceMenuItemC138272;
        InterfaceMenuItemC13827 interfaceMenuItemC138273;
        InterfaceMenuItemC13827 interfaceMenuItemC138274;
        C6306 c6306 = this.f2559;
        z3 = c6306.f19523;
        if (z3) {
            interfaceMenuItemC13827 = c6306.f19522;
            if (interfaceMenuItemC13827 != null) {
                interfaceMenuItemC138274 = c6306.f19522;
                interfaceMenuItemC138274.setEnabled(z);
            }
            interfaceMenuItemC138272 = c6306.f19524;
            if (interfaceMenuItemC138272 != null) {
                interfaceMenuItemC138273 = c6306.f19524;
                interfaceMenuItemC138273.setEnabled(z2);
            }
        }
    }
}

package l;

import android.os.Bundle;
import android.widget.TextView;
import java.io.IOException;

/* compiled from: Z1GQ */
/* renamed from: l.᩻֫ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23386 implements InterfaceC19449 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7864 f75134;

    public C23386(C7864 c7864) {
        this.f75134 = c7864;
    }

    @Override // l.InterfaceC19449
    /* renamed from: ֫ */
    public final void mo2703(boolean z) {
        Bundle bundle;
        boolean z2;
        InterfaceMenuItemC13827 interfaceMenuItemC13827;
        String m21119;
        TextView textView;
        TextView textView2;
        TextView textView3;
        InterfaceMenuItemC13827 interfaceMenuItemC138272;
        Bundle bundle2;
        C7864 c7864 = this.f75134;
        bundle = c7864.f43260;
        if (bundle.getBoolean("changed", false) != z) {
            bundle2 = c7864.f43260;
            bundle2.putBoolean("changed", z);
            try {
                c7864.m34239(((ActivityC17169) c7864.requireActivity()).m40356());
            } catch (IOException unused) {
            }
            c7864.m34227(new C14213());
        }
        z2 = c7864.f24385;
        if (z2) {
            interfaceMenuItemC13827 = c7864.f24387;
            if (interfaceMenuItemC13827 != null) {
                interfaceMenuItemC138272 = c7864.f24387;
                interfaceMenuItemC138272.setEnabled(z);
            }
            if (z) {
                m21119 = "*" + c7864.m21119();
            } else {
                m21119 = c7864.m21119();
            }
            int i = z ? C21943.f70260 : C21943.f70287;
            textView = c7864.f24371;
            if (textView.getText().toString().equals(m21119)) {
                return;
            }
            textView2 = c7864.f24371;
            textView2.setText(m21119);
            textView3 = c7864.f24371;
            textView3.setTextColor(i);
        }
    }

    @Override // l.InterfaceC19449
    /* renamed from: ֫ */
    public final void mo2704(boolean z, boolean z2) {
        boolean z3;
        InterfaceMenuItemC13827 interfaceMenuItemC13827;
        InterfaceMenuItemC13827 interfaceMenuItemC138272;
        InterfaceMenuItemC13827 interfaceMenuItemC138273;
        InterfaceMenuItemC13827 interfaceMenuItemC138274;
        C7864 c7864 = this.f75134;
        z3 = c7864.f24385;
        if (z3) {
            interfaceMenuItemC13827 = c7864.f24367;
            if (interfaceMenuItemC13827 != null) {
                interfaceMenuItemC138274 = c7864.f24367;
                interfaceMenuItemC138274.setEnabled(z);
            }
            interfaceMenuItemC138272 = c7864.f24389;
            if (interfaceMenuItemC138272 != null) {
                interfaceMenuItemC138273 = c7864.f24389;
                interfaceMenuItemC138273.setEnabled(z2);
            }
        }
    }
}

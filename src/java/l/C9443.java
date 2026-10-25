package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: B29A */
/* renamed from: l.ۢ۟ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9443 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28629;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17889 f28630;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f28631;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9443(Main main, C2450 c2450, String str, InterfaceC17889 interfaceC17889) {
        super(main, -1);
        this.f28631 = c2450;
        this.f28629 = str;
        this.f28630 = interfaceC17889;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        final C2450 c2450 = this.f28631;
        try {
            C17721.m41503(c2450.m7914(), EnumC16309.MODIFY_DIRECTORY_LINKED);
            String m31260 = m31260();
            if (m31260.equals(this.f28629) || m31260.isEmpty()) {
                m31262();
                return;
            }
            InterfaceC17889 interfaceC17889 = this.f28630;
            final AbstractC15440 mo24433 = interfaceC17889.mo24433();
            final AbstractC15440 m39866 = C16999.m39866(interfaceC17889.getParent(), m31260);
            String mo23554 = mo24433.mo23554();
            EnumC16580 m39083 = EnumC16580.m39083(mo24433.mo23113());
            String m39861 = C16999.m39861(mo24433, m39866);
            if (m39861 != null) {
                m31251(m39861);
                if (m39861.equals(C4925.m14327(R.string.MT_Protector_res_0x7f1208c1)) && mo24433.mo23119() && m39866.mo23119()) {
                    Main m7917 = c2450.m7917();
                    View m10216 = m7917.m10216(R.layout.MT_Protector_res_0x7f0d00ec);
                    TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
                    final RadioButton[] radioButtonArr = {(RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0478), (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0479), (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047a), (RadioButton) m10216.findViewById(R.id.radioButton3)};
                    boolean z = C21939.m49417() && m39866.mo29016();
                    textView.setText(m7917.getString(R.string.MT_Protector_res_0x7f120887, mo24433.getName(), m39866.getName()));
                    if (!z) {
                        radioButtonArr[2].setVisibility(8);
                    }
                    byte mo18251 = ApplicationC20075.f65008.mo18251((byte) 0, "rco");
                    final byte b = (mo18251 < 0 || mo18251 > 3) ? (byte) 0 : (z || mo18251 != 2) ? mo18251 : (byte) 1;
                    radioButtonArr[b].setChecked(true);
                    ViewOnClickListenerC16637 viewOnClickListenerC16637 = new ViewOnClickListenerC16637(1, radioButtonArr);
                    for (int i = 0; i < 4; i++) {
                        radioButtonArr[i].setOnClickListener(viewOnClickListenerC16637);
                    }
                    C19258 buildDialog = m7917.buildDialog();
                    buildDialog.m44421(m10216);
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.᩷۟ܳ
                        /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
                        /* JADX WARN: Removed duplicated region for block: B:31:0x0108  */
                        /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
                        @Override // android.content.DialogInterface.OnClickListener
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void onClick(android.content.DialogInterface r7, int r8) {
                            /*
                                Method dump skipped, instructions count: 292
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: l.DialogInterfaceOnClickListenerC20732.onClick(android.content.DialogInterface, int):void");
                        }
                    });
                    buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                    buildDialog.m44428(false);
                    buildDialog.m44438();
                    return;
                }
                return;
            }
            m39083.m39085(mo23554);
            int i2 = C14463.f44330;
            C14463.m34554(m39866.mo23554(), true);
            c2450.m7920(m31260);
            C15528.m36596();
            C9068.m23429();
            m31262();
        } catch (C1637 e) {
            c2450.m7917().m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }
}

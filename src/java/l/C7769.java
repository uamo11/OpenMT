package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: J1YX */
/* renamed from: l.۟᩹᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7769 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f24013;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15440 f24014;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23934 f24015;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f24016;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24017;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17889 f24018;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24019;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f24020;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2450 f24021;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7769(C23934 c23934, Main main, String str, InterfaceC17889 interfaceC17889, List list, C2450 c2450, boolean z, String str2, AbstractC15440 abstractC15440, boolean z2) {
        super(main, -1);
        this.f24015 = c23934;
        this.f24019 = str;
        this.f24018 = interfaceC17889;
        this.f24016 = list;
        this.f24021 = c2450;
        this.f24013 = z;
        this.f24017 = str2;
        this.f24014 = abstractC15440;
        this.f24020 = z2;
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* renamed from: ᩴ */
    public final void mo2170() {
        final String m31260 = m31260();
        while (m31260.endsWith("/")) {
            m31260 = C15472.m36561(1, 0, m31260);
        }
        final String str = this.f24019;
        if (m31260.equals(str)) {
            m31262();
            return;
        }
        boolean mo36969 = this.f24018.mo36969();
        final AbstractC15440 abstractC15440 = this.f24014;
        List list = this.f24016;
        final C2450 c2450 = this.f24021;
        if (mo36969) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (m31260.equals(((C3545) it.next()).getName())) {
                    m31263(R.string.MT_Protector_res_0x7f1208c1);
                    final Main m7917 = c2450.m7917();
                    View m10216 = m7917.m10216(R.layout.MT_Protector_res_0x7f0d00ec);
                    TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
                    final RadioButton[] radioButtonArr = {(RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0478), (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0479), (RadioButton) m10216.findViewById(R.id.radioButton3)};
                    m10216.findViewById(R.id.MT_Protector_res_0x7f0a047a).setVisibility(8);
                    textView.setText(m7917.getString(R.string.MT_Protector_res_0x7f120887, C9523.m24404(str), C9523.m24404(m31260)));
                    byte mo18251 = ApplicationC20075.f65008.mo18251((byte) 0, "rcoz");
                    byte b = (mo18251 < 0 || mo18251 > 2) ? (byte) 0 : mo18251;
                    radioButtonArr[b].setChecked(true);
                    ViewOnClickListenerC0911 viewOnClickListenerC0911 = new ViewOnClickListenerC0911(2, radioButtonArr);
                    for (int i = 0; i < 3; i++) {
                        radioButtonArr[i].setOnClickListener(viewOnClickListenerC0911);
                    }
                    C19258 buildDialog = m7917.buildDialog();
                    buildDialog.m44421(m10216);
                    final C23934 c23934 = this.f24015;
                    final List list2 = this.f24016;
                    final boolean z = this.f24013;
                    final String str2 = this.f24017;
                    final byte b2 = b;
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.ۨ᩹᩻
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i2) {
                            C23934.m52715(C23934.this, radioButtonArr, b2, m31260, str, list2, z, m7917, str2, this, c2450, abstractC15440);
                        }
                    });
                    buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
                    buildDialog.m44428(false);
                    buildDialog.m44438();
                    return;
                }
            }
        } else {
            String concat = m31260.concat("/");
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (((C3545) it2.next()).getName().startsWith(concat)) {
                    m31263(R.string.MT_Protector_res_0x7f1208c2);
                    return;
                }
            }
        }
        final C18290 c18290 = new C18290(str, m31260, this.f24020, true);
        if (this.f24013) {
            C10025.m25197(new InterfaceC12846() { // from class: l.ܰ᩹᩻
                @Override // l.InterfaceC12846
                public final /* synthetic */ void onCanceled() {
                }

                @Override // l.InterfaceC12846
                /* renamed from: ֫ */
                public final /* synthetic */ boolean mo3777(Exception exc) {
                    return false;
                }

                @Override // l.InterfaceC12846
                /* renamed from: ֫ */
                public final void mo3776(C11667 c11667, boolean z2) {
                    C7769.this.m31262();
                    List singletonList = Collections.singletonList(c18290);
                    List list3 = Collections.EMPTY_LIST;
                    C23934.m52712(c2450, abstractC15440, "", singletonList, Collections.EMPTY_LIST, c11667, z2);
                }
            }, c2450.m7917(), this.f24017);
            return;
        }
        m31262();
        List singletonList = Collections.singletonList(c18290);
        List list3 = Collections.EMPTY_LIST;
        C23934.m52712(c2450, abstractC15440, "", singletonList, Collections.EMPTY_LIST, null, false);
    }
}

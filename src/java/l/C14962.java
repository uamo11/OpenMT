package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: X4HD */
/* renamed from: l.ܶۗܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14962 implements InterfaceC12846 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC12846 f45615;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f45616;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f45617;

    public C14962(InterfaceC12846 interfaceC12846, AbstractActivityC3346 abstractActivityC3346, String str) {
        this.f45615 = interfaceC12846;
        this.f45616 = abstractActivityC3346;
        this.f45617 = str;
    }

    @Override // l.InterfaceC12846
    /* renamed from: ֫ */
    public final void mo3776(C11667 c11667, boolean z) {
        this.f45615.mo3776(c11667, z);
    }

    @Override // l.InterfaceC12846
    public final void onCanceled() {
        this.f45615.onCanceled();
    }

    @Override // l.InterfaceC12846
    /* renamed from: ֫ */
    public final boolean mo3777(Exception exc) {
        final AbstractActivityC3346 abstractActivityC3346;
        boolean z = exc instanceof C21730;
        final InterfaceC12846 interfaceC12846 = this.f45615;
        if (z && (abstractActivityC3346 = this.f45616) != null) {
            final String str = this.f45617;
            C4925.m14315(new Runnable() { // from class: l.۠ۗܳ
                @Override // java.lang.Runnable
                public final void run() {
                    final AbstractActivityC3346 abstractActivityC33462 = abstractActivityC3346;
                    boolean isFinishing = abstractActivityC33462.isFinishing();
                    final InterfaceC12846 interfaceC128462 = interfaceC12846;
                    if (isFinishing || abstractActivityC33462.getLifecycle().mo19832() == EnumC13728.DESTROYED) {
                        interfaceC128462.onCanceled();
                        return;
                    }
                    View m10216 = abstractActivityC33462.m10216(R.layout.MT_Protector_res_0x7f0d007e);
                    ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f120102);
                    final InterfaceC6746 m22886 = C8863.m22886(abstractActivityC33462, m10216, str);
                    C19258 buildDialog = abstractActivityC33462.buildDialog();
                    buildDialog.m44421(m10216);
                    buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
                    buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterfaceOnClickListenerC0145(0, interfaceC128462));
                    buildDialog.m44440(R.string.MT_Protector_res_0x7f12094f, (DialogInterface.OnClickListener) null);
                    buildDialog.m44419(new DialogInterface.OnCancelListener() { // from class: l.ۚۗܳ
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            InterfaceC12846.this.onCanceled();
                        }
                    });
                    final DialogInterfaceC0206 m44438 = buildDialog.m44438();
                    if (!m44438.m1442()) {
                        interfaceC128462.onCanceled();
                        return;
                    }
                    final TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0524);
                    m22886.mo28354(new Runnable() { // from class: l.֨ۗܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8863.m22892(textView, m22886.mo28356());
                            m44438.m1447().setEnabled(!r0.mo28357());
                        }
                    });
                    final C14506 c14506 = new C14506(m10216);
                    m44438.m1448().setOnClickListener(new ViewOnClickListenerC8613(abstractActivityC33462, 0));
                    m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܺۗܳ
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            DialogInterfaceC0206 dialogInterfaceC0206 = DialogInterfaceC0206.this;
                            if (dialogInterfaceC0206.m1442()) {
                                InterfaceC6746 interfaceC6746 = m22886;
                                if (interfaceC6746.mo28355()) {
                                    return;
                                }
                                C16955 mo28353 = interfaceC6746.mo28353();
                                C11667 m22888 = C8863.m22888(mo28353);
                                boolean mo32195 = m22888.m28557().mo32195();
                                InterfaceC12846 interfaceC128463 = interfaceC128462;
                                if (mo32195) {
                                    boolean z2 = m22888.m28557() instanceof C22435;
                                    C14506 c145062 = c14506;
                                    if (!z2 || c145062.m34619(dialogInterfaceC0206)) {
                                        C8863.m22894(new C22019(z2, c145062, dialogInterfaceC0206, interfaceC128463, interfaceC6746, mo28353, m22888, textView), m22888.m28557(), abstractActivityC33462);
                                        return;
                                    }
                                    return;
                                }
                                interfaceC6746.mo18361(mo28353);
                                dialogInterfaceC0206.dismiss();
                                interfaceC128463.mo3776(m22888, false);
                            }
                        }
                    });
                }
            });
            return true;
        }
        return interfaceC12846.mo3777(exc);
    }
}

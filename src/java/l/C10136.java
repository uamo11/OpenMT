package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import bin.mt.plus.R;

/* compiled from: 37SW */
/* renamed from: l.ۤۜ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10136 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30497;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC3163 f30498;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f30499;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5902 f30500;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f30501;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f30502;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC3346 f30503;

    public C10136(C5902 c5902, AbstractActivityC3346 abstractActivityC3346, AbstractC3163 abstractC3163, View view, Runnable runnable, String str, String str2) {
        this.f30500 = c5902;
        this.f30503 = abstractActivityC3346;
        this.f30498 = abstractC3163;
        this.f30501 = view;
        this.f30502 = runnable;
        this.f30499 = str;
        this.f30497 = str2;
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        m20269(this.f30503, R.string.MT_Protector_res_0x7f120528, 100, new Runnable() { // from class: l.۫ۜ᩻
            @Override // java.lang.Runnable
            public final void run() {
                C10136.m25467(C10136.this);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25467(C10136 c10136) {
        c10136.f23322.m31860((Runnable) null);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        this.f30500.f18119 = this.f30498.mo9705();
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        Spinner spinner;
        C20097 c20097;
        Spinner spinner2;
        C20097 c200972;
        Spinner spinner3;
        Spinner spinner4;
        DialogInterfaceC0206 dialogInterfaceC0206;
        Spinner spinner5;
        Spinner spinner6;
        C13136 c13136 = this.f23322;
        if (c13136 == null || !c13136.m31868()) {
            AbstractActivityC3346 abstractActivityC3346 = this.f30503;
            C19258 buildDialog = abstractActivityC3346.buildDialog();
            buildDialog.m44421(this.f30501);
            String m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f12070a);
            final Runnable runnable = this.f30502;
            buildDialog.m44441(m14327, new DialogInterface.OnClickListener() { // from class: l.۬ۜ᩻
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    runnable.run();
                }
            });
            buildDialog.m44425(C4925.m14327(R.string.MT_Protector_res_0x7f12015e), (DialogInterface.OnClickListener) null);
            DialogInterfaceC0206 m44438 = buildDialog.m44438();
            C5902 c5902 = this.f30500;
            c5902.f18120 = m44438;
            spinner = c5902.f18114;
            c20097 = c5902.f18119;
            spinner.setAdapter((SpinnerAdapter) new C20065(abstractActivityC3346, c20097.m46344()));
            spinner2 = c5902.f18121;
            c200972 = c5902.f18119;
            spinner2.setAdapter((SpinnerAdapter) new C20065(abstractActivityC3346, c200972.m46343()));
            String str = this.f30499;
            if (str == null) {
                spinner6 = c5902.f18114;
                c5902.f18117 = 0;
                spinner6.setSelection(0);
            } else {
                spinner3 = c5902.f18114;
                int m16548 = C5902.m16548(c5902, str);
                c5902.f18117 = m16548;
                spinner3.setSelection(m16548);
            }
            String str2 = this.f30497;
            if (str2 == null) {
                spinner5 = c5902.f18121;
                c5902.f18122 = 0;
                spinner5.setSelection(0);
            } else {
                spinner4 = c5902.f18121;
                int m16543 = C5902.m16543(c5902, str2);
                c5902.f18122 = m16543;
                spinner4.setSelection(m16543);
            }
            dialogInterfaceC0206 = c5902.f18120;
            C8960.m23097(dialogInterfaceC0206);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        C13136 c13136 = this.f23322;
        if (c13136 == null || !c13136.m31868()) {
            this.f30503.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        m20273();
    }
}

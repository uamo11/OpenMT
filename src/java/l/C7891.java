package l;

import android.content.DialogInterface;
import android.text.TextUtils;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: Q649 */
/* renamed from: l.۠ۖᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7891 extends AbstractC7548 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C9170 f24450;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f24451;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7744 f24452;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14946 f24453;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f24454;

    public C7891(ActivityC14946 activityC14946, String str) {
        this.f24453 = activityC14946;
        this.f24451 = str;
        this.f24450 = C9170.m23579(activityC14946);
    }

    @Override // l.AbstractC7548
    /* renamed from: ۧ */
    public final void mo1008() {
        C12392 c12392;
        C12392 c123922;
        ActivityC14946 activityC14946 = this.f24453;
        c12392 = activityC14946.f45556;
        this.f24452 = c12392.m30436().mo26562();
        c123922 = activityC14946.f45556;
        this.f24454 = c123922.m30531();
        m20267(activityC14946, R.string.MT_Protector_res_0x7f1208d2);
    }

    @Override // l.AbstractC7548
    /* renamed from: ܿ */
    public final void mo1009() {
        C7744 c7744 = this.f24452;
        try {
            C1394.m4884(C16999.m39866(this.f24451, new String[0]), c7744, this.f24454, C14776.f45134);
            if (c7744 != null) {
                c7744.close();
            }
        } catch (Throwable th) {
            if (c7744 != null) {
                try {
                    c7744.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1006() {
        String str;
        String str2;
        boolean z;
        ActivityC14946 activityC14946 = this.f24453;
        str = activityC14946.f45558;
        boolean isEmpty = TextUtils.isEmpty(str);
        final String str3 = this.f24451;
        if (!isEmpty) {
            activityC14946.f45558 = str3;
        } else {
            activityC14946.f45561 = C9523.m24406(str3);
            InterfaceC13049 edit = ApplicationC20075.f65008.edit();
            str2 = activityC14946.f45561;
            edit.putString("text_viewer_save_as_path", str2);
        }
        if (this.f24450.m23581()) {
            String string = activityC14946.getString(R.string.MT_Protector_res_0x7f1203a4, str3);
            int i = DialogInterfaceC0206.f1451;
            C19258 c19258 = new C19258(activityC14946);
            c19258.m44433(R.string.MT_Protector_res_0x7f120491);
            c19258.m44424(string);
            c19258.m44442(R.string.MT_Protector_res_0x7f120189, null);
            z = activityC14946.f45555;
            if (z) {
                c19258.m44440(R.string.MT_Protector_res_0x7f120530, new DialogInterface.OnClickListener() { // from class: l.֨ۖᩳ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        Main.m63(C7891.this.f24453, str3);
                    }
                });
            }
            c19258.m44438();
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ֫ */
    public final void mo1007(Exception exc) {
        if (this.f24450.m23581()) {
            this.f24453.m10223(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC7548
    /* renamed from: ᩳ */
    public final void mo1010() {
        C7744 c7744 = this.f24452;
        if (c7744 != null) {
            c7744.close();
        }
        m20273();
    }
}

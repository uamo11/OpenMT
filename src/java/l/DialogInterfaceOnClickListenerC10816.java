package l;

import android.content.DialogInterface;
import bin.mt.plus.R;

/* compiled from: Q4I7 */
/* renamed from: l.ۧۛܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class DialogInterfaceOnClickListenerC10816 implements DialogInterface.OnClickListener {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f32536;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27034(int i, AbstractActivityC3346 abstractActivityC3346, String str) {
        m27035(abstractActivityC3346, str, abstractActivityC3346.getString(i), false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27036(int i, AbstractActivityC3346 abstractActivityC3346, String str) {
        m27035(abstractActivityC3346, str, abstractActivityC3346.getString(i), true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27035(AbstractActivityC3346 abstractActivityC3346, String str, String str2, boolean z) {
        String concat = "forbid_tip_".concat(str);
        if (ApplicationC20075.f65008.getBoolean(concat, false)) {
            return;
        }
        new DialogInterfaceOnClickListenerC10816(abstractActivityC3346, concat, str2, z);
    }

    public DialogInterfaceOnClickListenerC10816(AbstractActivityC3346 abstractActivityC3346, String str, String str2, boolean z) {
        this.f32536 = str;
        boolean z2 = true;
        if (!z) {
            byte mo18251 = ApplicationC20075.f65008.mo18251((byte) 0, str + "_count");
            if (mo18251 <= 1) {
                ApplicationC20075.f65008.edit().mo25852((byte) (mo18251 + 1), C16014.m37867(str, "_count")).apply();
                z2 = false;
            }
        }
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44433(R.string.MT_Protector_res_0x7f120a76);
        c19258.m44424(str2);
        c19258.m44442(R.string.MT_Protector_res_0x7f120189, null);
        if (z2) {
            c19258.m44440(R.string.MT_Protector_res_0x7f120a78, this);
        }
        c19258.m44438();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ApplicationC20075.f65008.edit().putBoolean(this.f32536, true).apply();
    }
}

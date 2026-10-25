package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: X4HD */
/* renamed from: l.ۤۗܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10025 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25197(InterfaceC12846 interfaceC12846, AbstractActivityC3346 abstractActivityC3346, String str) {
        if (!ApplicationC20075.f65008.getBoolean("enable_auto_signature", false)) {
            interfaceC12846.mo3776(null, ApplicationC20075.f65008.getBoolean("kasb", true));
            return;
        }
        C14962 c14962 = new C14962(interfaceC12846, abstractActivityC3346, str);
        C16955 m42798 = C18367.m42798(str);
        if (m42798 != null && C8863.m22889(m42798.m39780()) == null) {
            m42798 = null;
        }
        if (m42798 == null) {
            ArrayList arrayList = C8863.f26982;
            m42798 = new C16955(ApplicationC20075.f65008.getString("auto_signature_key", ""), C8863.m22887(), ApplicationC20075.f65008.getString("v1_signature_filename", null), ApplicationC20075.f65008.getBoolean("kv1sd", false));
        }
        m25196(abstractActivityC3346, m42798, false, (InterfaceC12846) c14962);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25196(AbstractActivityC3346 abstractActivityC3346, C16955 c16955, boolean z, InterfaceC12846 interfaceC12846) {
        try {
            C11667 m25191 = m25191(c16955, z);
            if (!m25191.m28557().mo32195()) {
                interfaceC12846.mo3776(m25191, false);
            } else if (abstractActivityC3346 == null) {
                interfaceC12846.mo3777(new C1637("Signing key requires interactive verification."));
            } else {
                C8863.m22894(new C21314(interfaceC12846, m25191), m25191.m28557(), abstractActivityC3346);
            }
        } catch (Exception e) {
            if (interfaceC12846.mo3777(e) || abstractActivityC3346 == null) {
                return;
            }
            abstractActivityC3346.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11667 m25191(C16955 c16955, boolean z) {
        AbstractC13262 m36415;
        String m39780 = c16955.m39780();
        if (m39780 == null || m39780.isEmpty()) {
            m36415 = C15378.m36415();
        } else {
            m36415 = C8863.m22889(m39780);
            if (m36415 == null) {
                if (z) {
                    throw new C12141(m39780);
                }
                m36415 = C15378.m36415();
            }
        }
        return new C11667(m36415, c16955.m39781(), c16955.m39779(), c16955.m39778());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25195(AbstractActivityC3346 abstractActivityC3346, AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, C11667 c11667, C22933 c22933) {
        C6022.m16847(abstractC15440, abstractC154402, c11667, c22933.m51037());
        if (c11667.m28557() == C15378.m36415()) {
            C4925.m14316(new RunnableC21400(4, abstractActivityC3346), 500L);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25198(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, C11667 c11667, AbstractC3817 abstractC3817) {
        C6022.m16847(abstractC15440, abstractC154402, c11667, abstractC3817.mo11540());
        if (c11667.m28557() == C15378.m36415()) {
            abstractC3817.m11521(new C19903());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25193(Main main, C21818 c21818, C11667 c11667, C22022 c22022) {
        AbstractC15440 m49174 = c21818.m49174();
        try {
            C22523.m50504(c21818);
            AbstractC15440 m491742 = c21818.m49174();
            c22022.m49558(R.string.MT_Protector_res_0x7f1209a7);
            c22022.m49553(0);
            c22022.m49550(0);
            C6022.m16847(m49174, m491742, c11667, new C4380(c22022));
            if (c11667.m28557() == C15378.m36415()) {
                C4925.m14316(new RunnableC6312(3, main), 500L);
            }
        } finally {
            m49174.mo23552();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25200(C21818 c21818, C11667 c11667, AbstractC3817 abstractC3817) {
        AbstractC15440 m49174 = c21818.m49174();
        try {
            C22523.m50504(c21818);
            C6022.m16847(m49174, c21818.m49174(), c11667, abstractC3817.mo11540());
            if (c11667.m28557() == C15378.m36415()) {
                abstractC3817.m11521(new C2969());
            }
        } finally {
            m49174.mo23552();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25199(C16560 c16560, DialogInterfaceC0206 dialogInterfaceC0206, String str) {
        Main m39056 = c16560.m39056();
        Button m1448 = dialogInterfaceC0206.m1448();
        ViewGroup viewGroup = (ViewGroup) m1448.getParent();
        int indexOfChild = viewGroup.indexOfChild(m1448);
        CheckBox checkBox = (CheckBox) m39056.m10216(R.layout.MT_Protector_res_0x7f0d01cf);
        viewGroup.removeViewAt(indexOfChild);
        viewGroup.addView(checkBox, indexOfChild);
        m25194(m39056, checkBox, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m25194(final AbstractActivityC3346 abstractActivityC3346, CompoundButton compoundButton, final String str) {
        compoundButton.setChecked(ApplicationC20075.f65008.getBoolean("enable_auto_signature", false));
        compoundButton.setOnCheckedChangeListener(new C9319());
        compoundButton.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ۖۗܳ
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                if (ApplicationC20075.f65008.getBoolean("show_auto_settings_tip", true)) {
                    ApplicationC20075.f65008.edit().putBoolean("show_auto_settings_tip", false).apply();
                    C21374.m48465();
                }
                AbstractActivityC3346 abstractActivityC33462 = AbstractActivityC3346.this;
                View m10216 = abstractActivityC33462.m10216(R.layout.MT_Protector_res_0x7f0d007e);
                ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f120102);
                final InterfaceC6746 m22886 = C8863.m22886(abstractActivityC33462, m10216, str);
                C19258 buildDialog = abstractActivityC33462.buildDialog();
                buildDialog.m44421(m10216);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
                final DialogInterfaceC0206 m16343 = C5834.m16343(buildDialog, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f120634, (DialogInterface.OnClickListener) null);
                m16343.m1447().setOnClickListener(new ViewOnClickListenerC3674(0, m22886, m16343));
                final TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0524);
                m22886.mo28354(new Runnable() { // from class: l.ᩴۗܳ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8863.m22892(textView, m22886.mo28356());
                        m16343.m1447().setEnabled(!r0.mo28357());
                    }
                });
                m16343.m1448().setOnClickListener(new ViewOnClickListenerC19197(0, abstractActivityC33462));
                return true;
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21282 m25192(AbstractActivityC3346 abstractActivityC3346, View view) {
        C21282 c21282 = new C21282(abstractActivityC3346, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f12098a, 0, R.string.MT_Protector_res_0x7f12098a);
        MenuItem add = c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1204cc, 0, R.string.MT_Protector_res_0x7f1204cc);
        add.setCheckable(true);
        add.setChecked(ApplicationC20075.f65008.getBoolean("kasb", true));
        c21282.m48302((InterfaceC14930) new C16146(4, abstractActivityC3346));
        C19871.m45704(c21282);
        return c21282;
    }
}

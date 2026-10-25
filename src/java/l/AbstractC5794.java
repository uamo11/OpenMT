package l;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import bin.mt.plus.R;

/* compiled from: X81I */
/* renamed from: l.ۛۗܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC5794 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10235 f17823;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ImageView f17824;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10235 f17825;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f17826 = true;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f17827;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f17828;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo16272(int i, int i2);

    public AbstractC5794(AbstractActivityC3346 abstractActivityC3346, int i, int i2) {
        View m10216 = abstractActivityC3346.m10216(R.layout.MT_Protector_res_0x7f0d00bd);
        C10235 c10235 = (C10235) m10216.findViewById(R.id.MT_Protector_res_0x7f0a017d);
        this.f17825 = c10235;
        C10235 c102352 = (C10235) m10216.findViewById(R.id.editText2);
        this.f17823 = c102352;
        ImageView imageView = (ImageView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0287);
        this.f17824 = imageView;
        ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f120b87);
        c10235.mo25910((CharSequence) String.valueOf(i));
        c102352.mo25910((CharSequence) String.valueOf(i2));
        this.f17827 = Math.max(1, i);
        this.f17828 = Math.max(1, i2);
        c10235.m25897(new InputFilter[]{new InputFilter.LengthFilter(6)});
        c102352.m25897(new InputFilter[]{new InputFilter.LengthFilter(6)});
        c10235.m30313(new C12144(this));
        c102352.m30313(new C10028(this));
        imageView.setOnClickListener(new ViewOnClickListenerC14274(2, this));
        C19258 buildDialog = abstractActivityC3346.buildDialog();
        buildDialog.m44421(m10216);
        DialogInterfaceC0206 m19253 = C7187.m19253(buildDialog, R.string.MT_Protector_res_0x7f12070a, (DialogInterface.OnClickListener) null, R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        m19253.m1447().setOnClickListener(new ViewOnClickListenerC14316(this, m19253));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16265(AbstractC5794 abstractC5794) {
        ImageView imageView = abstractC5794.f17824;
        boolean z = abstractC5794.f17826;
        abstractC5794.f17826 = !z;
        if (!z) {
            imageView.setImageResource(R.drawable.MT_Protector_res_0x7f08021b);
            try {
                int parseInt = Integer.parseInt(abstractC5794.f17825.m30436().toString());
                int parseInt2 = Integer.parseInt(abstractC5794.f17823.m30436().toString());
                if (parseInt <= 0 || parseInt2 <= 0) {
                    return;
                }
                abstractC5794.f17827 = parseInt;
                abstractC5794.f17828 = parseInt2;
                return;
            } catch (Exception unused) {
                return;
            }
        }
        imageView.setImageResource(R.drawable.MT_Protector_res_0x7f08024f);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m16266(AbstractC5794 abstractC5794, DialogInterfaceC0206 dialogInterfaceC0206) {
        C10235 c10235 = abstractC5794.f17823;
        C10235 c102352 = abstractC5794.f17825;
        try {
            int parseInt = Integer.parseInt(c102352.m30436().toString());
            try {
                int parseInt2 = Integer.parseInt(c10235.m30436().toString());
                dialogInterfaceC0206.dismiss();
                abstractC5794.mo16272(parseInt, parseInt2);
            } catch (Exception unused) {
                c10235.requestFocus();
                C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
            }
        } catch (Exception unused2) {
            c102352.requestFocus();
            C21374.m48457(R.string.MT_Protector_res_0x7f120b48);
        }
    }
}

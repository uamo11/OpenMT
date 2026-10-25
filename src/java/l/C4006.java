package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.analytics.pro.o;

/* compiled from: 4AWI */
/* renamed from: l.ۘܳܿ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4006 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2978 f12707;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final TextView f12708;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View f12709;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TextView f12710;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0477 f12711;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2978 f12712;

    public C4006(ActivityC0477 activityC0477) {
        this.f12711 = activityC0477;
        View m10216 = activityC0477.m10216(R.layout.MT_Protector_res_0x7f0d01e9);
        this.f12709 = m10216;
        this.f12708 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0402);
        m12067();
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0401).setOnClickListener(new View.OnClickListener() { // from class: l.ۜܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4006 c4006 = C4006.this;
                C2595 c2595 = new C2595(c4006, c4006.f12711);
                c2595.m36257(R.string.MT_Protector_res_0x7f120a5c, R.string.MT_Protector_res_0x7f120a5b);
                c2595.m36260(R.string.MT_Protector_res_0x7f120a5a);
                c2595.m36262();
                C4925.m14316(new RunnableC7412(4, c2595), 200L);
                EditText m36254 = c2595.m36254(0);
                EditText m362542 = c2595.m36254(1);
                m36254.setInputType(o.a.b);
                m362542.setInputType(o.a.b);
                int i = C8239.f25366;
                m36254.setText(String.valueOf(ApplicationC20075.f65008.getInt("text_function_min_line", 1)));
                m362542.setText(String.valueOf(ApplicationC20075.f65008.getInt("text_function_max_line", 4)));
            }
        });
        this.f12710 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0405);
        m12070();
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0404).setOnClickListener(new View.OnClickListener() { // from class: l.᩷ܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final C4006 c4006 = C4006.this;
                C19258 buildDialog = c4006.f12711.buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f120428);
                int i = C8239.f25366;
                buildDialog.m44417(R.array.MT_Protector_res_0x7f030017, ApplicationC20075.f65008.getInt("tfgi", 0), new DialogInterface.OnClickListener() { // from class: l.ܺܳܿ
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        C4006.m12069(C4006.this, dialogInterface, i2);
                    }
                });
                buildDialog.m44438();
            }
        });
        C2978 c2978 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0599);
        this.f12712 = c2978;
        int i = C8239.f25366;
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("tfugh", true));
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0407).setOnClickListener(new View.OnClickListener() { // from class: l.ۢܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2978 c29782 = C4006.this.f12712;
                c29782.toggle();
                boolean isChecked = c29782.isChecked();
                int i2 = C8239.f25366;
                ApplicationC20075.f65008.edit().putBoolean("tfugh", isChecked).apply();
                C8239.m21823();
            }
        });
        C2978 c29782 = (C2978) m10216.findViewById(R.id.MT_Protector_res_0x7f0a059a);
        this.f12707 = c29782;
        c29782.setChecked(C4301.m12886());
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a03ff).setOnClickListener(new View.OnClickListener() { // from class: l.ۡܳܿ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2978 c29783 = C4006.this.f12707;
                c29783.toggle();
                C4301.m12885(c29783.isChecked());
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m12069(C4006 c4006, DialogInterface dialogInterface, int i) {
        int i2 = C8239.f25366;
        ApplicationC20075.f65008.edit().mo25853(i, "tfgi").apply();
        C8239.m21823();
        c4006.m12070();
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m12067() {
        StringBuilder sb = new StringBuilder();
        int i = C8239.f25366;
        sb.append(ApplicationC20075.f65008.getInt("text_function_min_line", 1));
        sb.append(" - ");
        sb.append(ApplicationC20075.f65008.getInt("text_function_max_line", 4));
        this.f12708.setText(sb.toString());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m12070() {
        String m14327;
        int i = C8239.f25366;
        int i2 = ApplicationC20075.f65008.getInt("tfgi", 0);
        if (i2 == 0) {
            m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f12042b);
        } else if (i2 == 1) {
            m14327 = C4925.m14327(R.string.MT_Protector_res_0x7f12042a);
        } else {
            m14327 = i2 != 2 ? null : C4925.m14327(R.string.MT_Protector_res_0x7f120429);
        }
        this.f12710.setText(m14327);
    }
}

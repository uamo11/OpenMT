package l;

import android.content.DialogInterface;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* compiled from: D1K5 */
/* renamed from: l.۬ܰܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13153 extends AbstractC1661 {
    public C13153() {
        super(R.string.MT_Protector_res_0x7f1205ce, R.drawable.MT_Protector_res_0x7f0801e8);
    }

    @Override // l.AbstractC1661
    /* renamed from: ᩳ */
    public final boolean mo1456(C2450 c2450) {
        return (c2450.m7916("local") || c2450.m7916("zip")) && C13858.m33214(c2450);
    }

    @Override // l.AbstractC1661
    /* renamed from: ܽ */
    public final void mo1455(C2450 c2450) {
        if (c2450.m7916("zip")) {
            C21374.m48457(R.string.MT_Protector_res_0x7f12036c);
            return;
        }
        Main m7917 = c2450.m7917();
        View m10216 = m7917.m10216(R.layout.MT_Protector_res_0x7f0d00ed);
        final Spinner m22974 = C8901.m22974(m7917, m10216);
        C2978 c2978 = (C2978) m10216.findViewById(R.id.switch1);
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("dfb", true));
        c2978.setOnCheckedChangeListener(new C15269());
        final TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b2);
        final TextView textView2 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a03b4);
        C2978 c29782 = (C2978) m10216.findViewById(R.id.switch2);
        final C2978 c29783 = (C2978) m10216.findViewById(R.id.switch3);
        c29782.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.᩸ܰܳ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                textView.setText(!z ? R.string.MT_Protector_res_0x7f12029a : R.string.MT_Protector_res_0x7f12029d);
                textView2.setVisibility(!z ? 0 : 8);
                c29783.setVisibility(z ? 8 : 0);
                m22974.setEnabled(!z);
                C22870.m50970(ApplicationC20075.f65008, "dfoh", z);
            }
        });
        c29782.setChecked(ApplicationC20075.f65008.getBoolean("dfoh", false));
        c29783.setChecked(ApplicationC20075.f65008.getBoolean("dfrwn", true));
        c29783.setOnCheckedChangeListener(new C22552(2));
        C19258 buildDialog = c2450.m7917().buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC22326(m22974, c2450, c29782, c29783));
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog.m44438();
    }
}

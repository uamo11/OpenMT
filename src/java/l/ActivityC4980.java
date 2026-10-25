package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.ArrayList;

/* compiled from: K7HV */
/* renamed from: l.ۙ᩻ܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ActivityC4980 extends AbstractActivityC3346 {

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15687 = 0;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f15688;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC5686 f15689;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C0746 f15690;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "CustomSortingMethodActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector_res_0x7f0d004d);
        m10241(R.string.MT_Protector_res_0x7f120219);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ܺ᩻ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC4980.f15687;
                ActivityC4980.this.finish();
            }
        });
        C13132 c13132 = (C13132) m10241(R.id.MT_Protector_res_0x7f0a0486);
        TextView textView = (TextView) m10241(R.id.MT_Protector_res_0x7f0a0191);
        textView.setText(R.string.MT_Protector_res_0x7f1206eb);
        int intExtra = getIntent().getIntExtra("NetworkConfigId", -1);
        if (intExtra == -1) {
            this.f15689 = new C8508();
        } else {
            AbstractC3577 m31047 = C12749.m31047(intExtra);
            if (m31047 == null) {
                C21374.m48459((CharSequence) ("Network config not found: id-" + intExtra));
                finish();
                return;
            }
            this.f15689 = new C15562(m31047);
        }
        ArrayList mo16000 = this.f15689.mo16000();
        this.f15688 = mo16000;
        C6083.sort(mo16000, C8200.comparing(new C2864()));
        C0746 c0746 = new C0746(this);
        this.f15690 = c0746;
        c0746.registerAdapterDataObserver(new C19798(this, textView));
        textView.setVisibility(this.f15688.isEmpty() ? 0 : 8);
        c13132.setAdapter(this.f15690);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, R.id.MT_Protector_res_0x7f0a0327, 0, R.string.MT_Protector_res_0x7f1205ad);
        add.setShowAsAction(2);
        add.setIcon(R.drawable.MT_Protector_res_0x7f0801a4);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.MT_Protector_res_0x7f0a0327) {
            return false;
        }
        m14457(-1);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m14457(final int i) {
        String str;
        View m10216 = m10216(R.layout.MT_Protector_res_0x7f0d0070);
        if (i == -1) {
            ((TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0631)).setText(R.string.MT_Protector_res_0x7f1205ad);
        }
        final C10235 c10235 = (C10235) m10216.findViewById(R.id.MT_Protector_res_0x7f0a042d);
        final RadioButton[] radioButtonArr = {(RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047e), (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047d), (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a047f), (RadioButton) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0480)};
        final CheckBox checkBox = (CheckBox) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0540);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۘ᩻ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = ActivityC4980.f15687;
                RadioButton[] radioButtonArr2 = radioButtonArr;
                int length = radioButtonArr2.length;
                for (int i3 = 0; i3 < length; i3++) {
                    RadioButton radioButton = radioButtonArr2[i3];
                    radioButton.setChecked(radioButton == view);
                }
            }
        };
        for (int i2 = 0; i2 < 4; i2++) {
            radioButtonArr[i2].setOnClickListener(onClickListener);
        }
        if (i == -1) {
            radioButtonArr[0].setChecked(true);
        } else {
            C1452 c1452 = (C1452) this.f15688.get(i);
            int m20112 = C7489.m20112(c1452.m4994());
            boolean m20122 = C7489.m20122(c1452.m4994());
            str = c1452.f5187;
            c10235.mo25910((CharSequence) str);
            if (m20112 >= 0 && m20112 < 4) {
                radioButtonArr[m20112].setChecked(true);
            } else {
                radioButtonArr[0].setChecked(true);
            }
            checkBox.setChecked(m20122);
        }
        C19258 buildDialog = buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        final DialogInterfaceC0206 m44438 = buildDialog.m44438();
        m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ᩴ᩻ܳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ActivityC4980.m14454(ActivityC4980.this, c10235, radioButtonArr, checkBox, i, m44438);
            }
        });
        if (i == -1) {
            C4925.m14329(c10235);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14454(ActivityC4980 activityC4980, C10235 c10235, RadioButton[] radioButtonArr, CheckBox checkBox, int i, DialogInterfaceC0206 dialogInterfaceC0206) {
        if (c10235.m30526() == 0) {
            c10235.requestFocus();
            C21374.m48457(R.string.MT_Protector_res_0x7f12073e);
            return;
        }
        int i2 = 0;
        while (i2 < 4 && !radioButtonArr[i2].isChecked()) {
            i2++;
        }
        C1452 c1452 = new C1452(AbstractC16891.m39731(c10235.m30436().toString()), C7489.m20113(i2, checkBox.isChecked()));
        if (i == -1) {
            activityC4980.f15688.add(c1452);
            activityC4980.f15690.notifyItemInserted(activityC4980.f15688.size() - 1);
        } else {
            activityC4980.f15688.set(i, c1452);
            activityC4980.f15690.notifyItemChanged(i);
        }
        activityC4980.f15689.mo16001(c1452);
        dialogInterfaceC0206.dismiss();
    }
}

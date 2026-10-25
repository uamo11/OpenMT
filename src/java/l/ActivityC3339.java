package l;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;

/* compiled from: 47JB */
/* renamed from: l.ۗܺܳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ActivityC3339 extends AbstractActivityC3346 {

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public static volatile C21684 f10553;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10554 = 0;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public final List f10555 = C10395.m26220();

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C1556 f10556;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C15332 f10557;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "PasswordManager";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10197(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            f10553 = null;
        } else {
            f10553 = new C21684(str, str2);
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector_res_0x7f0d004d);
        m10241(R.string.MT_Protector_res_0x7f1201a7);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC13382(2, this));
        C13132 c13132 = (C13132) m10241(R.id.MT_Protector_res_0x7f0a0486);
        TextView textView = (TextView) m10241(R.id.MT_Protector_res_0x7f0a0191);
        textView.setText(R.string.MT_Protector_res_0x7f1206eb);
        C15332 c15332 = new C15332(this);
        this.f10557 = c15332;
        c15332.registerAdapterDataObserver(new C0516(this, textView));
        textView.setVisibility(this.f10555.isEmpty() ? 0 : 8);
        c13132.setAdapter(this.f10557);
        C1556 c1556 = new C1556(new C5456(this));
        this.f10556 = c1556;
        c1556.m5322(c13132);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, R.id.MT_Protector_res_0x7f0a0327, 0, R.string.MT_Protector_res_0x7f1205ad);
        add.setShowAsAction(2);
        add.setIcon(R.drawable.MT_Protector_res_0x7f0801a4);
        MenuItem add2 = menu.add(0, R.id.MT_Protector_res_0x7f0a0363, 0, R.string.MT_Protector_res_0x7f1202dd);
        add2.setShowAsAction(2);
        add2.setIcon(R.drawable.MT_Protector_res_0x7f0801ad);
        MenuItem add3 = menu.add(0, R.id.MT_Protector_res_0x7f0a0355, 0, R.string.MT_Protector_res_0x7f120385);
        add3.setShowAsAction(2);
        add3.setIcon(R.drawable.MT_Protector_res_0x7f0801b8);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.MT_Protector_res_0x7f0a0327) {
            m10201(-1);
            return true;
        }
        if (menuItem.getItemId() == R.id.MT_Protector_res_0x7f0a0363) {
            startActivity(new Intent(this, (Class<?>) ActivityC21209.class));
            return true;
        }
        if (menuItem.getItemId() != R.id.MT_Protector_res_0x7f0a0355) {
            return false;
        }
        View m10216 = m10216(R.layout.MT_Protector_res_0x7f0d008d);
        C21684 c21684 = f10553;
        if (c21684 != null) {
            TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0264);
            textView.setTextIsSelectable(true);
            textView.setLineSpacing(0.0f, 1.05f);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) c21684.f69558);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(C21943.f70284), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "\n").append((CharSequence) c21684.f69557);
            textView.setText(spannableStringBuilder);
        }
        C19258 buildDialog = buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44438();
        return true;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f10557.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public void m10201(int i) {
        C12511 c12511 = i == -1 ? new C12511("", "") : (C12511) this.f10555.get(i);
        C1222 c1222 = new C1222(this, this, i, c12511);
        c1222.m36260(i == -1 ? R.string.MT_Protector_res_0x7f1205ad : R.string.MT_Protector_res_0x7f1202dd);
        c1222.m36256(R.string.MT_Protector_res_0x7f1206c2, c12511.f37581);
        c1222.m36256(R.string.MT_Protector_res_0x7f1206c4, c12511.f37580);
        c1222.m36262();
        C4925.m14316(new RunnableC7412(4, c1222), 200L);
        TextInputLayout m36259 = c1222.m36259(0);
        TextInputLayout m362592 = c1222.m36259(1);
        EditText editText = m36259.getEditText();
        C11003.requireNonNull(editText);
        editText.addTextChangedListener(new C8278(m36259, m362592));
        m362592.setExpandedHintEnabled(false);
        m362592.getEditText().setHint(R.string.MT_Protector_res_0x7f120728);
    }
}

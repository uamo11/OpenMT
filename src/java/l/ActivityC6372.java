package l;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import bin.mt.plus.R;
import com.alipay.sdk.m.y.l;
import java.io.IOException;
import java.util.regex.PatternSyntaxException;

/* compiled from: Y184 */
/* renamed from: l.ۛ᩺ܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ActivityC6372 extends AbstractActivityC3346 implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19707 = 0;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public C9195 f19708;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public int f19709;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public C24011 f19710;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C3550 f19711;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C19779 f19712;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "SchemeEditorActivity";
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector_res_0x7f0d0034);
        this.f10584 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        ListView listView = (ListView) m10241(android.R.id.list);
        m10227(this.f10584);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC5021(1, this));
        String stringExtra = getIntent().getStringExtra("schemeName");
        C11003.requireNonNull(stringExtra);
        setTitle(stringExtra);
        try {
            this.f19708 = C16249.m38221(stringExtra);
        } catch (Exception unused) {
            this.f19708 = new C9195(stringExtra);
        }
        C3550 c3550 = new C3550(this);
        this.f19711 = c3550;
        listView.setAdapter((ListAdapter) c3550);
        listView.setOnItemClickListener(this);
        listView.setOnItemLongClickListener(this);
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
        m17665(-1, (C21190) null);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        m17665(i, (C21190) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17669(ActivityC6372 activityC6372, C10606 c10606, CompoundButton compoundButton, CompoundButton compoundButton2, CompoundButton compoundButton3, CompoundButton compoundButton4, CompoundButton compoundButton5, CompoundButton compoundButton6, CompoundButton compoundButton7, C21190 c21190, int i, DialogInterfaceC0206 dialogInterfaceC0206) {
        Spinner spinner = c10606.f31832;
        if (spinner.getSelectedItemPosition() != 2) {
            if (!compoundButton.isChecked() && !compoundButton2.isChecked() && !compoundButton3.isChecked()) {
                C21374.m48457(R.string.MT_Protector_res_0x7f1208dd);
                return;
            }
            C19779 c19779 = activityC6372.f19712;
            if (c19779.f63854.m42217() && c19779.f63858.m42217() && c19779.f63860.m42217()) {
                if (spinner.getSelectedItemPosition() == 1 && activityC6372.f19709 == 0) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f1208df);
                    return;
                }
            } else {
                C21374.m48457(R.string.MT_Protector_res_0x7f1208de);
                return;
            }
        } else {
            if (!compoundButton4.isChecked() && !compoundButton5.isChecked() && !compoundButton6.isChecked() && !compoundButton7.isChecked()) {
                C21374.m48457(R.string.MT_Protector_res_0x7f1208dd);
                return;
            }
            C24011 c24011 = activityC6372.f19710;
            if (!c24011.f77813.m42217() || !c24011.f77815.m42217() || !c24011.f77819.m42217()) {
                C21374.m48457(R.string.MT_Protector_res_0x7f1208e0);
                return;
            }
        }
        c21190.f68291 = spinner.getSelectedItemPosition();
        activityC6372.f19712.f63859 = compoundButton.isChecked();
        activityC6372.f19712.f63857 = compoundButton3.isChecked();
        activityC6372.f19712.f63855 = compoundButton2.isChecked();
        activityC6372.f19710.f77814 = compoundButton4.isChecked();
        activityC6372.f19710.f77818 = compoundButton5.isChecked();
        activityC6372.f19710.f77816 = compoundButton6.isChecked();
        activityC6372.f19710.f77817 = compoundButton7.isChecked();
        c21190.f68292 = activityC6372.f19712;
        c21190.f68290 = activityC6372.f19710;
        c21190.f68293 = activityC6372.f19709;
        if (i == -1) {
            activityC6372.f19708.f27871.add(c21190);
        }
        try {
            C16249.m38217(activityC6372.f19708);
        } catch (IOException e) {
            activityC6372.m10223(e, (DialogInterface.OnDismissListener) null);
        }
        activityC6372.f19711.notifyDataSetChanged();
        dialogInterfaceC0206.dismiss();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17670(final ActivityC6372 activityC6372, C10606 c10606, final TextView textView) {
        if (c10606.f31832.getSelectedItemPosition() != 2) {
            View m10216 = activityC6372.m10216(R.layout.MT_Protector_res_0x7f0d00c4);
            final C13427 c13427 = new C13427(m10216, R.id.header1, R.id.MT_Protector_res_0x7f0a05d0, R.id.MT_Protector_res_0x7f0a017d, R.id.MT_Protector_res_0x7f0a00e6, R.id.MT_Protector_res_0x7f0a00f1);
            final C13427 c134272 = new C13427(m10216, R.id.header2, R.id.MT_Protector_res_0x7f0a05d2, R.id.editText2, R.id.MT_Protector_res_0x7f0a00e7, R.id.MT_Protector_res_0x7f0a00f2);
            final C13427 c134273 = new C13427(m10216, R.id.header3, R.id.MT_Protector_res_0x7f0a05d3, R.id.editText3, R.id.MT_Protector_res_0x7f0a00e8, R.id.MT_Protector_res_0x7f0a00f3);
            final C13427 c134274 = new C13427(m10216, R.id.header4, R.id.textInputLayout4, R.id.editText4, R.id.MT_Protector_res_0x7f0a00e9, R.id.MT_Protector_res_0x7f0a00f4);
            final C19779 c19779 = activityC6372.f19712;
            c13427.m32453(c19779.f63854);
            c134272.m32453(c19779.f63858);
            c134273.m32453(c19779.f63856);
            c134274.m32453(c19779.f63860);
            C19258 buildDialog = activityC6372.buildDialog();
            buildDialog.m44421(m10216);
            buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, null);
            buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
            buildDialog.m44440(R.string.MT_Protector_res_0x7f1205e1, (DialogInterface.OnClickListener) null);
            buildDialog.m44428(false);
            final DialogInterfaceC0206 m44438 = buildDialog.m44438();
            C5088.m14637(m44438);
            m44438.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.ܶ᩺ܽ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ActivityC6372.f19707;
                    ActivityC6372 activityC63722 = ActivityC6372.this;
                    activityC63722.getClass();
                    C13427 c134275 = c13427;
                    boolean isChecked = c134275.f40123.isChecked();
                    C13427 c134276 = c134272;
                    C13427 c134277 = c134273;
                    C13427 c134278 = c134274;
                    if (isChecked && c134276.f40123.isChecked() && c134277.f40123.isChecked() && c134278.f40123.isChecked()) {
                        C21374.m48457(R.string.MT_Protector_res_0x7f1208da);
                        return;
                    }
                    if (!c134275.f40123.isChecked() && c134275.m32454()) {
                        c134275.m32452(R.string.MT_Protector_res_0x7f1208db);
                        return;
                    }
                    if (!c134276.f40123.isChecked() && c134276.m32454()) {
                        c134276.m32452(R.string.MT_Protector_res_0x7f1208db);
                        return;
                    }
                    if (!c134278.f40123.isChecked() && c134278.m32454()) {
                        c134278.m32452(R.string.MT_Protector_res_0x7f1208db);
                        return;
                    }
                    try {
                        c134275.m32451();
                        c134276.m32451();
                        c134277.m32451();
                        c134278.m32451();
                        c134275.m32455();
                        c134276.m32455();
                        c134277.m32455();
                        c134278.m32455();
                        TextView textView2 = textView;
                        if (textView2.getVisibility() == 8) {
                            textView2.setVisibility(0);
                        }
                        textView2.setText(c19779.m45464());
                        m44438.dismiss();
                    } catch (PatternSyntaxException e) {
                        activityC63722.m10223(e, (DialogInterface.OnDismissListener) null);
                    }
                }
            });
            m44438.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.᩸᩺ܽ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = ActivityC6372.f19707;
                    C20484 c20484 = new C20484(ActivityC6372.this, c13427, c134272, c134273, c134274);
                    c20484.m31258(R.string.MT_Protector_res_0x7f1205e1);
                    c20484.m31277("Smali");
                    c20484.m31265("Lxxx;->method()V");
                    c20484.m31270();
                    String m14330 = C4925.m14330();
                    if (m14330 != null) {
                        String[] split = m14330.split("->");
                        if (split.length == 2) {
                            String str = split[0];
                            if (str.length() > 2 && str.startsWith("L") && str.endsWith(l.b)) {
                                String[] split2 = split[1].split("\\(");
                                if (split2.length == 2 && !split2[0].isEmpty()) {
                                    String[] split3 = split2[1].split("\\)");
                                    if (split3.length == 2) {
                                        String str2 = split3[0];
                                        String str3 = split3[1];
                                        if (str2.matches("(\\[*([CZBISJDF]|L[^;:()\\r\\n]+;))*") && str3.matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)")) {
                                            c20484.m31250((CharSequence) m14330);
                                            c20484.m31281();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    c20484.m31266(true);
                }
            });
            return;
        }
        View m102162 = activityC6372.m10216(R.layout.MT_Protector_res_0x7f0d00c3);
        final C13427 c134275 = new C13427(m102162, R.id.header1, R.id.MT_Protector_res_0x7f0a05d0, R.id.MT_Protector_res_0x7f0a017d, R.id.MT_Protector_res_0x7f0a00e6, R.id.MT_Protector_res_0x7f0a00f1);
        final C13427 c134276 = new C13427(m102162, R.id.header2, R.id.MT_Protector_res_0x7f0a05d2, R.id.editText2, R.id.MT_Protector_res_0x7f0a00e7, R.id.MT_Protector_res_0x7f0a00f2);
        final C13427 c134277 = new C13427(m102162, R.id.header3, R.id.MT_Protector_res_0x7f0a05d3, R.id.editText3, R.id.MT_Protector_res_0x7f0a00e8, R.id.MT_Protector_res_0x7f0a00f3);
        final C24011 c24011 = activityC6372.f19710;
        c134275.m32453(c24011.f77813);
        c134276.m32453(c24011.f77815);
        c134277.m32453(c24011.f77819);
        C19258 buildDialog2 = activityC6372.buildDialog();
        buildDialog2.m44421(m102162);
        buildDialog2.m44442(R.string.MT_Protector_res_0x7f12070a, null);
        buildDialog2.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        buildDialog2.m44440(R.string.MT_Protector_res_0x7f1205e1, (DialogInterface.OnClickListener) null);
        buildDialog2.m44428(false);
        final DialogInterfaceC0206 m444382 = buildDialog2.m44438();
        C5088.m14637(m444382);
        m444382.m1447().setOnClickListener(new View.OnClickListener() { // from class: l.֨᩺ܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC6372.f19707;
                ActivityC6372 activityC63722 = ActivityC6372.this;
                activityC63722.getClass();
                C13427 c134278 = c134275;
                boolean isChecked = c134278.f40123.isChecked();
                C13427 c134279 = c134276;
                C13427 c1342710 = c134277;
                if (isChecked && c134279.f40123.isChecked() && c1342710.f40123.isChecked()) {
                    C21374.m48457(R.string.MT_Protector_res_0x7f1208da);
                    return;
                }
                if (!c134278.f40123.isChecked() && c134278.m32454()) {
                    c134278.m32452(R.string.MT_Protector_res_0x7f1208db);
                    return;
                }
                if (!c134279.f40123.isChecked() && c134279.m32454()) {
                    c134279.m32452(R.string.MT_Protector_res_0x7f1208db);
                    return;
                }
                if (!c1342710.f40123.isChecked() && c1342710.m32454()) {
                    c1342710.m32452(R.string.MT_Protector_res_0x7f1208db);
                    return;
                }
                try {
                    c134278.m32451();
                    c134279.m32451();
                    c1342710.m32451();
                    c134278.m32455();
                    c134279.m32455();
                    c1342710.m32455();
                    TextView textView2 = textView;
                    if (textView2.getVisibility() == 8) {
                        textView2.setVisibility(0);
                    }
                    textView2.setText(c24011.m52852());
                    m444382.dismiss();
                } catch (PatternSyntaxException e) {
                    activityC63722.m10223(e, (DialogInterface.OnDismissListener) null);
                }
            }
        });
        m444382.m1448().setOnClickListener(new View.OnClickListener() { // from class: l.۠᩺ܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC6372.f19707;
                C4961 c4961 = new C4961(ActivityC6372.this, c134275, c134276, c134277);
                c4961.m31258(R.string.MT_Protector_res_0x7f1205e1);
                c4961.m31277("Smali");
                c4961.m31265("Lxxx;->field:I");
                c4961.m31270();
                String m14330 = C4925.m14330();
                if (m14330 != null) {
                    String[] split = m14330.split("->");
                    if (split.length == 2) {
                        String str = split[0];
                        if (str.length() > 2 && str.startsWith("L") && str.endsWith(l.b)) {
                            String[] split2 = split[1].split(":");
                            if (split2.length == 2 && !split2[0].isEmpty() && split2[1].matches("\\[*([VCZBISJDF]|L[^;:()\\r\\n]+;)")) {
                                c4961.m31250((CharSequence) m14330);
                                c4961.m31281();
                            }
                        }
                    }
                }
                c4961.m31266(true);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01f9  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m17665(final int r21, l.C21190 r22) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ActivityC6372.m17665(int, l.᩷᩺ܽ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m17668(ActivityC6372 activityC6372, CompoundButton compoundButton, boolean z) {
        int intValue = ((Integer) compoundButton.getTag()).intValue();
        if (z) {
            activityC6372.f19709 = intValue | activityC6372.f19709;
        } else {
            activityC6372.f19709 = (~intValue) & activityC6372.f19709;
        }
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        C21282 c21282 = new C21282(this, view, 0);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205c2, 0, R.string.MT_Protector_res_0x7f1205c2);
        c21282.m48304().add(0, R.string.MT_Protector_res_0x7f1205ca, 0, R.string.MT_Protector_res_0x7f1205ca);
        c21282.m48302(new C17014(i, this));
        C18342.m42767(view, c21282);
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17667(final ActivityC6372 activityC6372, final int i, MenuItem menuItem) {
        if (menuItem.getItemId() == R.string.MT_Protector_res_0x7f1205c2) {
            activityC6372.m17665(-1, (C21190) activityC6372.f19708.f27871.get(i));
            return;
        }
        int i2 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(activityC6372);
        c19258.m44433(R.string.MT_Protector_res_0x7f1205ca);
        c19258.m44424(activityC6372.getString(R.string.MT_Protector_res_0x7f120870, ((C21190) activityC6372.f19708.f27871.get(i)).m48140()));
        c19258.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterface.OnClickListener() { // from class: l.᩹᩺ܽ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                ActivityC6372.m17666(ActivityC6372.this, i);
            }
        });
        c19258.m44434(R.string.MT_Protector_res_0x7f12015e, (DialogInterface.OnClickListener) null);
        c19258.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17666(ActivityC6372 activityC6372, int i) {
        activityC6372.f19708.f27871.remove(i);
        try {
            C16249.m38217(activityC6372.f19708);
        } catch (IOException e) {
            activityC6372.m10223(e, (DialogInterface.OnDismissListener) null);
        }
        activityC6372.f19711.notifyDataSetChanged();
    }
}

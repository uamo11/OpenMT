package l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;

/* compiled from: 28VT */
/* renamed from: l.᩹ۙܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class ActivityC22062 extends AbstractActivityC3346 {

    /* renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70692 = 0;

    /* renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public C6273 f70693;

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C12346 f70694;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public String f70695;

    /* renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public Drawable f70696;

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public AbstractC13262 f70697;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public boolean f70698;

    /* renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public List f70699;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public List f70700;

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C23473 f70701;

    /* renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public List f70702;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public Drawable f70703;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public String f70704;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "SignatureKeyActivity";
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static void m49637(ActivityC22062 activityC22062) {
        activityC22062.getClass();
        new C17123(activityC22062).m20274();
    }

    public ActivityC22062() {
        List list = Collections.EMPTY_LIST;
        this.f70702 = list;
        this.f70699 = list;
        this.f70700 = list;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f70698 = getIntent().getBooleanExtra("fromDialog", false);
        m10241(R.layout.MT_Protector_res_0x7f0d004f);
        m10241(R.string.MT_Protector_res_0x7f12098b);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector_res_0x7f0a063a);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new ViewOnClickListenerC17806(1, this));
        this.f70694 = (C12346) m10241(R.id.MT_Protector_res_0x7f0a04a1);
        this.f70696 = C19883.f64211.f64250.m28879();
        this.f70703 = C19883.f64195.f64250.m28879();
        new C17123(this).m20274();
        C13132 c13132 = (C13132) m10241(R.id.MT_Protector_res_0x7f0a0486);
        C23473 c23473 = new C23473(this);
        this.f70701 = c23473;
        c13132.setAdapter(c23473);
        this.f70693 = ViewOnClickListenerC19121.m44072(this, new C7037(this));
        this.f70694.m29957(new C21149(this));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49624(ActivityC22062 activityC22062, String str) {
        AbstractC13262 abstractC13262 = activityC22062.f70697;
        if (abstractC13262 == null) {
            return;
        }
        try {
            C8918 c8918 = new C8918(str);
            try {
                String mo14006 = abstractC13262.mo14006();
                c8918.m23012(mo14006 + ".x509.pem");
                StringBuilder sb = new StringBuilder();
                sb.append("-----BEGIN CERTIFICATE-----\n");
                String encodeToString = Base64.encodeToString(abstractC13262.m32197().getEncoded(), 2);
                StringBuilder sb2 = new StringBuilder();
                int i = 0;
                while (i < encodeToString.length()) {
                    int i2 = i + 64;
                    sb2.append((CharSequence) encodeToString, i, Math.min(i2, encodeToString.length()));
                    sb2.append("\n");
                    i = i2;
                }
                sb.append(sb2.toString());
                sb.append("\n-----END CERTIFICATE-----");
                c8918.write(sb.toString().getBytes());
                c8918.m23012(mo14006 + ".pk8");
                c8918.write(abstractC13262.m32193().getEncoded());
                C21374.m48457(R.string.MT_Protector_res_0x7f1208d1);
                c8918.close();
            } finally {
            }
        } catch (Exception e) {
            activityC22062.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add(0, R.id.MT_Protector_res_0x7f0a0348, 0, R.string.MT_Protector_res_0x7f12042f);
        add.setShowAsAction(2);
        add.setIcon(R.drawable.MT_Protector_res_0x7f0801b8);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.MT_Protector_res_0x7f0a0348) {
            return false;
        }
        C19258 buildDialog = buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f12042f);
        buildDialog.m44416(R.string.MT_Protector_res_0x7f120989);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        TextView textView = (TextView) m44438.m1433(android.R.id.message);
        C20500.m46962(m44438.m1432(), true).mo38090(textView, textView.getText().toString());
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49628(ActivityC22062 activityC22062, AbstractC13262 abstractC13262, Runnable runnable) {
        if (abstractC13262.mo32195()) {
            C22435.f72683 = true;
            C8863.m22894(new C14300(runnable), abstractC13262, activityC22062);
        } else {
            runnable.run();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49627(ActivityC22062 activityC22062, AbstractC13262 abstractC13262) {
        try {
            activityC22062.m49623(abstractC13262);
        } catch (Exception e) {
            activityC22062.m10223(e, (DialogInterface.OnDismissListener) null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49623(AbstractC13262 abstractC13262) {
        X509Certificate m32197 = abstractC13262.m32197();
        byte[] encoded = m32197.getEncoded();
        abstractC13262.mo14000();
        final C1121 c1121 = new C1121();
        View m10216 = m10216(R.layout.MT_Protector_res_0x7f0d0080);
        ((TextView) m10216.findViewById(R.id.textView1)).setText(R.string.MT_Protector_res_0x7f120990);
        TextView textView = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0602);
        TextView textView2 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a060d);
        TextView textView3 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05fb);
        TextView textView4 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05fd);
        TextView textView5 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05fe);
        TextView textView6 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05ff);
        TextView textView7 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a05fc);
        TextView textView8 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a0601);
        TextView textView9 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a060b);
        TextView textView10 = (TextView) m10216.findViewById(R.id.MT_Protector_res_0x7f0a060c);
        C2978 c2978 = (C2978) m10216.findViewById(R.id.addColon);
        C2978 c29782 = (C2978) m10216.findViewById(R.id.upperCase);
        m10216.findViewById(R.id.MT_Protector_res_0x7f0a0232).setVisibility(8);
        if (abstractC13262 instanceof C22435) {
            textView2.setText(R.string.MT_Protector_res_0x7f12047e);
        } else if (abstractC13262 instanceof C20319) {
            textView2.setText(R.string.MT_Protector_res_0x7f120480);
        } else if ((abstractC13262 instanceof C4796) || (abstractC13262 instanceof C12557)) {
            textView2.setText(R.string.MT_Protector_res_0x7f120482);
        }
        textView2.setText(textView2.getText().toString().replaceAll("\\(.*\\)|（.*）", "").trim());
        if (Build.VERSION.SDK_INT >= 23) {
            textView6.setHyphenationFrequency(2);
            textView7.setHyphenationFrequency(2);
            textView8.setHyphenationFrequency(2);
            textView9.setHyphenationFrequency(2);
            textView10.setHyphenationFrequency(2);
        }
        textView.setOnClickListener(ViewOnClickListenerC14813.m35214());
        textView2.setOnClickListener(ViewOnClickListenerC14813.m35214());
        textView3.setOnClickListener(ViewOnClickListenerC14813.m35214());
        textView4.setOnClickListener(ViewOnClickListenerC14813.m35214());
        textView5.setOnClickListener(ViewOnClickListenerC14813.m35214());
        textView6.setOnClickListener(ViewOnClickListenerC14813.m35214());
        textView7.setOnClickListener(ViewOnClickListenerC14813.m35214());
        textView8.setOnClickListener(ViewOnClickListenerC14813.m35214());
        textView9.setOnClickListener(ViewOnClickListenerC14813.m35214());
        textView10.setOnClickListener(ViewOnClickListenerC14813.m35214());
        textView.setText(abstractC13262.mo14002());
        final RunnableC14049 runnableC14049 = new RunnableC14049(c1121, textView6, textView7, textView8, textView9, textView10);
        C19258 buildDialog = buildDialog();
        buildDialog.m44421(m10216);
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44434(R.string.MT_Protector_res_0x7f1201bd, (DialogInterface.OnClickListener) null);
        DialogInterfaceC0206 m44438 = buildDialog.m44438();
        c29782.setChecked(ApplicationC20075.f65008.getBoolean("apk_signature_info_upper_case", true));
        c2978.setChecked(ApplicationC20075.f65008.getBoolean("apk_signature_info_add_colon", true));
        c29782.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.۟᩶ܽ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                int i = ActivityC22062.f70692;
                ApplicationC20075.f65008.edit().putBoolean("apk_signature_info_upper_case", z).apply();
                RunnableC14049.this.run();
            }
        });
        c2978.setOnCheckedChangeListener(new C1601(0, runnableC14049));
        m44438.m1446().setOnClickListener(new View.OnClickListener() { // from class: l.ۧۙܽ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = ActivityC22062.f70692;
                ActivityC22062 activityC22062 = ActivityC22062.this;
                activityC22062.getClass();
                C8177.m21655(activityC22062, c1121);
            }
        });
        String sigAlgName = m32197.getSigAlgName();
        String sigAlgOID = m32197.getSigAlgOID();
        if (sigAlgName.equals(sigAlgOID) && (sigAlgName = C18118.m42244(sigAlgOID)) == null) {
            sigAlgName = sigAlgOID;
        }
        textView3.setText(sigAlgName);
        textView4.setText(C17283.m40572(m32197.getNotBefore().getTime()));
        textView5.setText(C17283.m40572(m32197.getNotAfter().getTime()));
        C8177.m21654(this, m10216, m32197);
        c1121.m3837(encoded);
        runnableC14049.run();
    }
}

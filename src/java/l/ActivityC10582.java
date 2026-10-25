package l;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Q1R8 */
/* renamed from: l.ۤ᩹ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ActivityC10582 extends AbstractActivityC3346 implements InterfaceC9171 {

    /* renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f31759 = 0;

    /* renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC16225 f31760;

    /* renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public C13136 f31761;

    /* renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC0525 f31762 = new C13403(this);

    /* renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C5652 f31763;

    /* renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public C12698 f31764;

    /* renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public C0640 f31765;

    @Override // l.AbstractActivityC3346
    /* renamed from: ۚ */
    public final String mo121() {
        return "ScriptExecutor";
    }

    @Override // l.ActivityC2124
    /* renamed from: ۘ */
    public final int mo7027() {
        SharedPreferences sharedPreferences = ApplicationC20075.f65010;
        return (sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2;
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        AbstractC15440 m39866;
        this.f10581 = false;
        setTheme(C18080.m42142());
        super.onCreate(bundle);
        m10241(R.layout.MT_Protector_res_0x7f0d0052);
        m10241(R.string.MT_Protector_res_0x7f1208ed);
        this.f31764 = (C12698) new C4741(this).m13885(C12698.class);
        boolean m48208 = C21238.m48208(this);
        C11288.f33814 = m48208;
        ViewOnLayoutChangeListenerC7738.m20721(this, m48208);
        C17574 c17574 = this.f31764.f38219;
        if (c17574 != null && c17574.m41100() != null) {
            this.f31764.f38219.m41100().f53920.m39774();
        }
        this.f31760 = new ViewOnClickListenerC16225(this, this);
        TextView textView = (TextView) m10241(R.id.MT_Protector_res_0x7f0a00c2);
        textView.setTypeface(Typeface.DEFAULT);
        textView.setText("Im");
        try {
            m39866 = C16999.m39862(getIntent());
        } catch (NullPointerException unused) {
            String stringExtra = getIntent().getStringExtra(MotionUtils.EASING_TYPE_PATH);
            if (stringExtra != null) {
                m39866 = C16999.m39866(stringExtra, new String[0]);
            } else {
                finish();
                return;
            }
        }
        this.f31763 = C8474.m22148(this, new C19755(this, m39866));
        this.f31765 = (C0640) m10241(R.id.MT_Protector_res_0x7f0a05bd);
        m26599();
        this.f31765.m2649(new C20460(this));
        m26596(m39866);
        getOnBackPressedDispatcher().m28894(this, this.f31762);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m26595(ActivityC10582 activityC10582, AbstractC15440 abstractC15440) {
        activityC10582.m26599();
        AbstractC13246 m4113 = activityC10582.m4113();
        SharedPreferences sharedPreferences = ApplicationC20075.f65010;
        m4113.mo15466((sharedPreferences == null || !sharedPreferences.getBoolean("term_keep_dark", true)) ? -100 : 2);
        if (activityC10582.f31764.f38217) {
            activityC10582.m26596(abstractC15440);
        }
    }

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m26599() {
        int i;
        C0640 c0640 = this.f31765;
        try {
            i = Integer.parseInt(ApplicationC20075.f65010.getString("term_font_size", "12"));
        } catch (Exception unused) {
            i = 12;
        }
        c0640.m2646(i);
        this.f31765.m2647(C14814.m35218());
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        C12698 c12698 = this.f31764;
        if (c12698 != null) {
            c12698.f38221 = false;
            c12698.f38220++;
        }
        C13136 c13136 = this.f31761;
        if (c13136 != null) {
            c13136.m31857();
            this.f31761 = null;
        }
        super.onDestroy();
        C4925.m14309(500L, new RunnableC1409());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26596(final AbstractC15440 abstractC15440) {
        final Intent intent = getIntent();
        if (this.f31764.f38219 == null && "bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction())) {
            C12698 c12698 = this.f31764;
            if (c12698.f38221) {
                return;
            }
            c12698.f38221 = true;
            final int i = c12698.f38220 + 1;
            c12698.f38220 = i;
            C13136 c13136 = this.f31761;
            if (c13136 != null) {
                c13136.m31857();
            }
            C13136 c131362 = new C13136(this, R.string.MT_Protector_res_0x7f120528);
            c131362.m31866(500);
            this.f31761 = c131362;
            final Context applicationContext = getApplicationContext();
            C1802.f6208.execute(new Runnable() { // from class: l.ܶ᩹ۢ
                @Override // java.lang.Runnable
                public final void run() {
                    final boolean z;
                    Context context = applicationContext;
                    final Intent intent2 = intent;
                    int i2 = ActivityC10582.f31759;
                    try {
                        z = ActivityC13898.m33309(context, intent2);
                    } catch (Exception unused) {
                        z = false;
                    }
                    final ActivityC10582 activityC10582 = ActivityC10582.this;
                    final int i3 = i;
                    final AbstractC15440 abstractC154402 = abstractC15440;
                    C4925.m14315(new Runnable() { // from class: l.᩸᩹ۢ
                        @Override // java.lang.Runnable
                        public final void run() {
                            ActivityC10582.m26593(ActivityC10582.this, i3, z, abstractC154402, intent2);
                        }
                    });
                }
            });
            return;
        }
        m26597(abstractC15440, intent);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26593(ActivityC10582 activityC10582, int i, boolean z, AbstractC15440 abstractC15440, Intent intent) {
        C12698 c12698 = activityC10582.f31764;
        if (i != c12698.f38220) {
            return;
        }
        c12698.f38221 = false;
        C13136 c13136 = activityC10582.f31761;
        if (c13136 != null) {
            c13136.m31857();
            activityC10582.f31761 = null;
        }
        if (activityC10582.isFinishing() || activityC10582.isDestroyed()) {
            return;
        }
        if (!z) {
            C21374.m48463(R.string.MT_Protector_res_0x7f12094e);
            activityC10582.finish();
        } else {
            activityC10582.m26597(abstractC15440, intent);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26597(AbstractC15440 abstractC15440, Intent intent) {
        boolean z;
        boolean z2;
        C17574 c17574 = this.f31764.f38219;
        if (c17574 == null) {
            boolean z3 = false;
            if ("bin.mt.plus.ACTION_SHORTCUT".equals(intent.getAction())) {
                z = intent.getBooleanExtra("ewrp", false);
                z2 = !intent.getBooleanExtra("ewse", true);
                this.f31764.f38218 = intent.getBooleanExtra("eae", false);
            } else {
                z = ApplicationC20075.f65008.getBoolean("ewrp", false);
                z2 = !ApplicationC20075.f65008.getBoolean("ewse", true);
                this.f31764.f38218 = false;
            }
            if (z2 && C2094.m6880() == null) {
                C19258 buildDialog = buildDialog();
                buildDialog.m44433(R.string.MT_Protector_res_0x7f120307);
                buildDialog.m44416(R.string.MT_Protector_res_0x7f120959);
                buildDialog.m44442(R.string.MT_Protector_res_0x7f12070a, new DialogInterfaceOnClickListenerC6792(2, this));
                buildDialog.m44434(R.string.MT_Protector_res_0x7f12015e, new DialogInterfaceOnClickListenerC22813(3, this));
                buildDialog.m44428(false);
                buildDialog.m44438();
                return;
            }
            String m36511 = abstractC15440.m36511();
            String mo23554 = abstractC15440.mo23554();
            try {
                InputStream mo27926 = abstractC15440.mo27926();
                try {
                    int read = mo27926.read();
                    int read2 = mo27926.read();
                    int read3 = mo27926.read();
                    int read4 = mo27926.read();
                    if ((read | read2 | read3 | read4) < 0) {
                        mo27926.close();
                    } else {
                        boolean z4 = (read & 255) == 127 && (read2 & 255) == 69 && (read3 & 255) == 76 && (read4 & 255) == 70;
                        mo27926.close();
                        z3 = z4;
                    }
                } finally {
                }
            } catch (IOException unused) {
            }
            StringBuilder sb = new StringBuilder("cd ");
            sb.append(C9255.m23755(m36511));
            sb.append(" || exit $?; trap '' INT; (trap - INT; exec ");
            if (z3) {
                sb.append(C9255.m23755(mo23554));
            } else {
                sb.append("sh ");
                sb.append(C9255.m23755(mo23554));
            }
            sb.append("); _mt_status=$?; exit $_mt_status\r");
            String sb2 = sb.toString();
            this.f31764.f38219 = C0682.m2766(null, z, !z2);
            this.f31765.m2650(this.f31764.f38219);
            C4925.m14315(new RunnableC4937(this, sb2));
        } else {
            this.f31765.m2650(c17574);
        }
        C12698 c12698 = this.f31764;
        if (c12698.f38218) {
            c12698.f38219.m41093().m1668(this, new InterfaceC1008() { // from class: l.۠᩹ۢ
                @Override // l.InterfaceC1008
                /* renamed from: ֫ */
                public final void mo1617(Object obj) {
                    int i = ActivityC10582.f31759;
                    if (((Boolean) obj).booleanValue()) {
                        return;
                    }
                    ActivityC10582.this.finish();
                }
            });
        }
        C5242 m41093 = this.f31764.f38219.m41093();
        AbstractC0525 abstractC0525 = this.f31762;
        C11003.requireNonNull(abstractC0525);
        m41093.m1668(this, new C16045(2, abstractC0525));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26592(ActivityC10582 activityC10582) {
        activityC10582.f31764.f38217 = true;
        Intent intent = new Intent(activityC10582, (Class<?>) ActivityC4232.class);
        intent.putExtra("scriptSettings", true);
        activityC10582.f31763.m15940(intent);
    }

    @Override // l.InterfaceC9171
    /* renamed from: ֫ */
    public final void mo20746(View view) {
        boolean z = false;
        C21282 c21282 = new C21282(this, view, 0);
        C3060 m48304 = c21282.m48304();
        m48304.add(0, R.string.MT_Protector_res_0x7f120316, 0, R.string.MT_Protector_res_0x7f120316).setIcon(R.drawable.MT_Protector_res_0x7f0801f5);
        m48304.add(0, R.string.MT_Protector_res_0x7f120949, 0, R.string.MT_Protector_res_0x7f120949).setIcon(R.drawable.MT_Protector_res_0x7f08023d);
        MenuItem icon = m48304.add(0, android.R.string.paste, 0, android.R.string.paste).setIcon(R.drawable.MT_Protector_res_0x7f080225);
        C17574 c17574 = this.f31764.f38219;
        if (c17574 != null && c17574.m41098() && this.f31765.m2651()) {
            z = true;
        }
        icon.setEnabled(z);
        c21282.m48302(new C4236(10, this));
        m48304.setOptionalIconsVisible(true);
        c21282.m48305();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m26594(ActivityC10582 activityC10582, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 17039371) {
            activityC10582.f31765.m2654();
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f120949) {
            activityC10582.f31764.f38217 = false;
            Intent intent = new Intent(activityC10582, (Class<?>) ActivityC4232.class);
            intent.putExtra("scriptSettings", true);
            activityC10582.f31763.m15940(intent);
            return;
        }
        if (itemId == R.string.MT_Protector_res_0x7f120316) {
            activityC10582.f31764.f38219.m41097();
            activityC10582.finish();
        }
    }

    @Override // l.InterfaceC9171
    /* renamed from: ܳ */
    public final void mo20747() {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }
}

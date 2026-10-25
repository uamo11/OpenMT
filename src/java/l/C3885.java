package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.PatternSyntaxException;
import org.bouncycastle.i18n.TextBundle;

/* compiled from: V8VP */
/* renamed from: l.ۘۤᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3885 implements InterfaceC22602 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C1082 f12410;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final View f12411;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ActivityC1748 f12412;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C13008 f12413;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final View f12414;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C1082 f12415;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C5062 f12416;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public HandlerC0912 f12417 = new HandlerC0912(this, new C3435(4));

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C13008 f12418;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C13008 f12419;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2474 f12420;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC21897 f12421;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final TextView f12422;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f12423;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C7473 f12424;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12392 f12425;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12392 f12426;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final View f12427;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final View f12428;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public MenuItem f12429;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5062 f12430;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final TextView f12431;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C13008 f12432;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC21897 f12433;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11714(C3885 c3885) {
        c3885.getClass();
        ActivityC1748 activityC1748 = c3885.f12412;
        activityC1748.startActivity(new Intent(activityC1748, (Class<?>) ActivityC23269.class));
    }

    public C3885(ActivityC1748 activityC1748, C7473 c7473, InterfaceC2474 interfaceC2474) {
        this.f12412 = activityC1748;
        this.f12424 = c7473;
        C12392 m20096 = c7473.m20096();
        this.f12426 = m20096;
        C12392 m20077 = c7473.m20077();
        this.f12425 = m20077;
        this.f12423 = TextBundle.TEXT_ENTRY;
        SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC21897 = new SharedPreferencesOnSharedPreferenceChangeListenerC21897(activityC1748, m20096);
        this.f12421 = sharedPreferencesOnSharedPreferenceChangeListenerC21897;
        SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC218972 = new SharedPreferencesOnSharedPreferenceChangeListenerC21897(activityC1748, m20077);
        this.f12433 = sharedPreferencesOnSharedPreferenceChangeListenerC218972;
        this.f12420 = interfaceC2474;
        sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49295();
        sharedPreferencesOnSharedPreferenceChangeListenerC218972.m49295();
        View mo4858 = interfaceC2474.mo4858();
        this.f12411 = mo4858;
        this.f12428 = mo4858.findViewById(R.id.MT_Protector_res_0x7f0a04b5);
        this.f12427 = mo4858.findViewById(R.id.MT_Protector_res_0x7f0a04ae);
        this.f12414 = mo4858.findViewById(R.id.MT_Protector_res_0x7f0a04ad);
        C5062 c5062 = (C5062) mo4858.findViewById(R.id.MT_Protector_res_0x7f0a018a);
        this.f12430 = c5062;
        C5062 c50622 = (C5062) mo4858.findViewById(R.id.edtReplaceWord);
        this.f12416 = c50622;
        this.f12413 = (C13008) mo4858.findViewById(R.id.MT_Protector_res_0x7f0a0598);
        this.f12419 = (C13008) mo4858.findViewById(R.id.MT_Protector_res_0x7f0a058a);
        this.f12432 = (C13008) mo4858.findViewById(R.id.MT_Protector_res_0x7f0a059b);
        this.f12418 = (C13008) mo4858.findViewById(R.id.MT_Protector_res_0x7f0a0595);
        this.f12431 = (TextView) mo4858.findViewById(R.id.MT_Protector_res_0x7f0a04e1);
        this.f12422 = (TextView) mo4858.findViewById(R.id.MT_Protector_res_0x7f0a04e0);
        ((ViewGroup) mo4858).removeView(mo4858.findViewById(R.id.MT_Protector_res_0x7f0a01db));
        c5062.m14602("text_s", (String) null);
        c50622.m14602("text_r", (String) null);
        this.f12410 = new C1082(activityC1748, m20096);
        this.f12415 = new C1082(activityC1748, m20077);
        final C22249 c22249 = new C22249((TextView) mo4858.findViewById(R.id.MT_Protector_res_0x7f0a0638));
        int i = 0;
        while (i < 2) {
            (i == 0 ? this.f12410 : this.f12415).m3715(new C9530(this, c22249));
            i++;
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ܽۤᩳ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C3885.m11715(C3885.this, view);
            }
        };
        InterfaceC3131 interfaceC3131 = new InterfaceC3131() { // from class: l.ᩳۤᩳ
            @Override // l.InterfaceC3131
            /* renamed from: ֫ */
            public final void mo9554(C13008 c13008, boolean z, boolean z2) {
                C3885.m11717(C3885.this, c22249, c13008, z, z2);
            }
        };
        this.f12413.m31589(interfaceC3131);
        this.f12419.m31589(interfaceC3131);
        this.f12432.m31589(interfaceC3131);
        this.f12418.m31589(interfaceC3131);
        int[] iArr = {R.id.MT_Protector_res_0x7f0a01f5, R.id.MT_Protector_res_0x7f0a01f4, R.id.MT_Protector_res_0x7f0a04ad, R.id.MT_Protector_res_0x7f0a04ae, R.id.MT_Protector_res_0x7f0a0102};
        for (int i2 = 0; i2 < 5; i2++) {
            View findViewById = mo4858.findViewById(iArr[i2]);
            C19890.m45741(findViewById);
            findViewById.setOnClickListener(onClickListener);
        }
        this.f12430.m14600(new C8824(this));
        m20096.m30315(new RunnableC17290(0, this));
        m20077.m30315(new RunnableC17290(0, this));
        m20096.m30330(new InterfaceC8035() { // from class: l.ܳۤᩳ
            @Override // l.InterfaceC8035
            /* renamed from: ֫ */
            public final void mo1646(int i3, int i4) {
                C3885.this.m11738();
            }
        });
        m20077.m30330(new InterfaceC8035() { // from class: l.᩻ۤᩳ
            @Override // l.InterfaceC8035
            /* renamed from: ֫ */
            public final void mo1646(int i3, int i4) {
                C3885.this.m11738();
            }
        });
        this.f12426.m30344(this);
        this.f12425.m30344(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11734(InterfaceC23586 interfaceC23586, C4301 c4301, Class cls) {
        c4301.m12889(interfaceC23586, new C20819(this), this.f12430.m14607(), this.f12416.m14607());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11731(String str, String str2) {
        this.f12421.m49288(str);
        this.f12433.m49288(str2);
        C15545.m36664(this.f12429, this.f12426);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m11746() {
        return this.f12421.m49299();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m11744() {
        return this.f12433.m49299();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11729(MenuItem menuItem) {
        this.f12429 = menuItem;
        C15545.m36664(menuItem, this.f12426);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11748() {
        this.f12429.setChecked(!r0.isChecked());
        boolean isChecked = this.f12429.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC21897 = this.f12421;
        sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49292(isChecked);
        boolean isChecked2 = this.f12429.isChecked();
        SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC218972 = this.f12433;
        sharedPreferencesOnSharedPreferenceChangeListenerC218972.m49292(isChecked2);
        C20030 m49298 = sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49298();
        C20030 m492982 = sharedPreferencesOnSharedPreferenceChangeListenerC218972.m49298();
        RunnableC9865 runnableC9865 = new RunnableC9865(this, new AtomicInteger(2), 1);
        this.f12426.m30340(m49298, runnableC9865);
        this.f12425.m30340(m492982, runnableC9865);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11724(C3885 c3885) {
        C12392 c12392 = c3885.f12426;
        c12392.scrollTo(0, c12392.m30408());
        C12392 c123922 = c3885.f12425;
        c123922.scrollTo(0, c123922.m30408());
        c12392.invalidate();
        c123922.invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11716(C3885 c3885, PatternSyntaxException patternSyntaxException) {
        C19258 buildDialog = c3885.f12412.buildDialog();
        buildDialog.m44433(R.string.MT_Protector_res_0x7f120307);
        buildDialog.m44424(C11459.m28258(patternSyntaxException));
        buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
        buildDialog.m44438();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11715(C3885 c3885, View view) {
        C5062 c5062 = c3885.f12416;
        C5062 c50622 = c3885.f12430;
        C1082 c1082 = c3885.f12424.m20093() ? c3885.f12410 : c3885.f12415;
        int id = view.getId();
        if (id == R.id.MT_Protector_res_0x7f0a01f5) {
            c1082.m3719(c50622.m14611().toString());
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a01f4) {
            c1082.m3712(c50622.m14611().toString());
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a04ad) {
            if (c3885.mo11736(false)) {
                return;
            }
            c1082.m3713(c50622.m14611().toString(), c5062.m14611().toString());
        } else if (id == R.id.MT_Protector_res_0x7f0a04ae) {
            c1082.m3720(c50622.m14611().toString(), c5062.m14611().toString());
        } else if (id == R.id.MT_Protector_res_0x7f0a0102) {
            c3885.m11745();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11717(C3885 c3885, C22249 c22249, C13008 c13008, boolean z, boolean z2) {
        String str = c3885.f12423;
        C1082 c1082 = c3885.f12415;
        C1082 c10822 = c3885.f12410;
        int id = c13008.getId();
        if (id == R.id.MT_Protector_res_0x7f0a0598) {
            c10822.m3728(z);
            c1082.m3728(z);
            if (z2) {
                c22249.m49963(z ? R.string.MT_Protector_res_0x7f120802 : R.string.MT_Protector_res_0x7f120801);
            }
            ApplicationC20075.f65008.edit().mo25852(c10822.m3710(), C16014.m37867(str, "_bit")).apply();
            c3885.m11739();
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a059b) {
            c10822.m3726(z);
            c1082.m3726(z);
            if (z2) {
                c22249.m49963(z ? R.string.MT_Protector_res_0x7f120b84 : R.string.MT_Protector_res_0x7f120b83);
            }
            ApplicationC20075.f65008.edit().mo25852(c10822.m3710(), C16014.m37867(str, "_bit")).apply();
            c3885.m11739();
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a058a) {
            c10822.m3716(z);
            c1082.m3716(z);
            if (z2) {
                c22249.m49963(z ? R.string.MT_Protector_res_0x7f120550 : R.string.MT_Protector_res_0x7f12054f);
            }
            ApplicationC20075.f65008.edit().mo25852(c10822.m3710(), C16014.m37867(str, "_bit")).apply();
            c3885.m11739();
            return;
        }
        if (id == R.id.MT_Protector_res_0x7f0a0595) {
            c10822.m3721(z);
            c1082.m3721(z);
            if (z2) {
                c22249.m49963(z ? R.string.MT_Protector_res_0x7f1206f0 : R.string.MT_Protector_res_0x7f1200ff);
            }
            ApplicationC20075.f65008.edit().mo25852(c10822.m3710(), C16014.m37867(str, "_bit")).apply();
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m11720() {
        C1082 c1082 = this.f12410;
        this.f12413.m31590(c1082.m3722(), false);
        this.f12419.m31590(c1082.m3725(), false);
        this.f12432.m31590(c1082.m3730(), false);
        this.f12418.m31590(c1082.m3729(), false);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m11738() {
        if (m11749()) {
            int m14614 = this.f12430.m14614();
            TextView textView = this.f12431;
            TextView textView2 = this.f12422;
            if (m14614 != 0) {
                C12392 m20095 = this.f12424.m20095();
                C6458 c6458 = m20095.f37173;
                int[] m30369 = m20095.m30369();
                C16335 m17850 = c6458.m17850(m20095.getContext(), m30369[0], m30369[1]);
                if (m17850.m38477()) {
                    textView.setTextColor(C21943.f70273);
                    textView2.setTextColor(C21943.f70273);
                } else if (m17850.m38479()) {
                    textView.setTextColor(C21943.f70263);
                    textView2.setTextColor(C21943.f70263);
                } else {
                    textView.setTextColor(C21943.f70275);
                    textView2.setTextColor(C21943.f70275);
                }
                String m38478 = m17850.m38478();
                if (TextUtils.equals(m38478, textView2.getText())) {
                    return;
                }
                textView2.setText(m38478);
                return;
            }
            if (!TextUtils.equals("0", textView2.getText())) {
                textView2.setText("0");
            }
            textView.setTextColor(C21943.f70273);
            textView2.setTextColor(C21943.f70273);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11741(C10130 c10130) {
        boolean z = false;
        boolean z2 = this.f12411.getVisibility() == 0;
        if (z2 && this.f12428.getVisibility() == 0) {
            z = true;
        }
        C5062 c5062 = this.f12430;
        if (z2) {
            c5062.m14610();
        }
        C5062 c50622 = this.f12416;
        if (z) {
            c50622.m14610();
        }
        c10130.m25425(z2);
        c10130.m25425(z);
        c10130.m25423((CharSequence) (z2 ? c5062.m14611().toString() : ""));
        c10130.m25423((CharSequence) (z ? c50622.m14611().toString() : ""));
        c10130.writeByte(this.f12410.m3710());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11742(C12951 c12951) {
        final boolean m31498 = c12951.m31498();
        final boolean m314982 = c12951.m31498();
        final String m31504 = c12951.m31504();
        final String m315042 = c12951.m31504();
        byte readByte = c12951.readByte();
        if (m31498) {
            this.f12410.m3711(readByte);
            this.f12415.m3711(readByte);
        }
        C4925.m14315(new Runnable() { // from class: l.ۜۤᩳ
            @Override // java.lang.Runnable
            public final void run() {
                C3885.m11718(C3885.this, m31498, m314982, m31504, m315042);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11718(C3885 c3885, boolean z, boolean z2, String str, String str2) {
        C12392 c12392 = c3885.f12426;
        View view = c3885.f12427;
        C5062 c5062 = c3885.f12430;
        c3885.m11720();
        int i = 8;
        c3885.f12411.setVisibility(z ? 0 : 8);
        View view2 = c3885.f12428;
        if (z && z2) {
            i = 0;
        }
        view2.setVisibility(i);
        c3885.m11719();
        c3885.f12420.mo4859();
        if (z) {
            c5062.m14601(str);
        }
        if (z2) {
            c3885.f12416.m14601(str2);
            c3885.f12418.setVisibility(0);
        }
        if (z) {
            view.setAlpha(0.26f);
            view.setEnabled(false);
            View view3 = c3885.f12414;
            if (c12392.m30441()) {
                view3.setAlpha(0.26f);
                view3.setEnabled(false);
            } else {
                view3.setAlpha(1.0f);
                view3.setEnabled(true);
            }
            if (c5062.m14614() != 0) {
                c3885.m11739();
            }
            if (!z2 || c12392.m30441()) {
                return;
            }
            view.setAlpha(1.0f);
            view.setEnabled(true);
        }
    }

    @Override // l.InterfaceC22602
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo11736(boolean z) {
        View view = this.f12428;
        if (view.getVisibility() == 0) {
            return false;
        }
        view.setVisibility(0);
        this.f12418.setVisibility(0);
        View view2 = this.f12427;
        view2.setAlpha(1.0f);
        view2.setEnabled(true);
        C5062 c5062 = this.f12416;
        c5062.requestFocus();
        c5062.m14605();
        c5062.m14615();
        if (z) {
            C4925.m14329(c5062.m14607());
        }
        return true;
    }

    @Override // l.InterfaceC22602
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11728() {
        mo11735(true, false);
    }

    @Override // l.InterfaceC22602
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo11740() {
        mo11735(false, false);
    }

    @Override // l.InterfaceC22602
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11735(boolean z, boolean z2) {
        boolean m11749 = m11749();
        C12392 m20095 = this.f12424.m20095();
        C1082 c1082 = this.f12410;
        if (!m11749) {
            if (this.f12426.f37258.mo9770() || this.f12425.f37258.mo9770()) {
                return;
            }
            byte mo18251 = ApplicationC20075.f65008.mo18251((byte) 0, this.f12423 + "_bit");
            c1082.m3711(mo18251);
            this.f12415.m3711(mo18251);
            m11720();
            this.f12411.setVisibility(0);
            this.f12428.setVisibility(8);
            m11719();
            this.f12418.setVisibility(8);
            this.f12420.mo4859();
            View view = this.f12427;
            view.setAlpha(0.26f);
            view.setEnabled(false);
            boolean m30441 = m20095.m30441();
            View view2 = this.f12414;
            if (m30441) {
                view2.setAlpha(0.26f);
                view2.setEnabled(false);
            } else {
                view2.setAlpha(1.0f);
                view2.setEnabled(true);
            }
        }
        C5062 c5062 = this.f12430;
        if (z) {
            c5062.requestFocus();
            C4925.m14329(c5062.m14607());
        }
        int[] m30369 = m20095.m30369();
        int i = m30369[0];
        int i2 = m30369[1];
        if (i != i2 && !z2) {
            try {
                String charSequence = m20095.m30436().subSequence(i, i2).toString();
                if (c1082.m3722()) {
                    charSequence = C3939.m11985(charSequence).replace("\r", "\\r").replace("\t", "\\t");
                }
                c5062.m14601(charSequence);
                if (z) {
                    c5062.m14615();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        } else if (!m11749) {
            c5062.m14605();
            if (z) {
                c5062.m14615();
            }
        } else if (!z2) {
            return;
        }
        if (c5062.m14614() != 0) {
            m11739();
        } else {
            m11738();
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m11749() {
        return this.f12411.getVisibility() == 0;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m11745() {
        this.f12410.m3717();
        this.f12415.m3717();
        View view = this.f12411;
        if (view.getVisibility() == 0) {
            view.setVisibility(8);
            m11719();
            this.f12430.m14610();
            this.f12420.mo4859();
        }
        View view2 = this.f12428;
        if (view2.getVisibility() == 0) {
            view2.setVisibility(8);
            this.f12416.m14610();
        }
        this.f12418.setVisibility(8);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m11739() {
        this.f12417.removeMessages(0);
        m11723();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m11723() {
        if (m11749()) {
            C5062 c5062 = this.f12430;
            this.f12410.m3723(c5062.m14611().toString());
            this.f12415.m3723(c5062.m14611().toString());
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m11719() {
        View view = this.f12411;
        boolean isAttachedToWindow = view.isAttachedToWindow();
        ActivityC1748 activityC1748 = this.f12412;
        if (isAttachedToWindow && view.getVisibility() == 0) {
            activityC1748.getWindow().setNavigationBarColor(C21943.f70259);
        } else {
            activityC1748.getWindow().setNavigationBarColor(this.f12424.m20096().f37245.f73275);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11732(C10130 c10130) {
        this.f12421.m49290(c10130);
        this.f12433.m49290(c10130);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11733(C12951 c12951) {
        this.f12421.m49291(c12951);
        this.f12433.m49291(c12951);
        C15545.m36664(this.f12429, this.f12426);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m11730(Class cls) {
        this.f12421.m49301();
        this.f12433.m49287(cls);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m11747() {
        this.f12417.removeCallbacksAndMessages(null);
        this.f12410.m3717();
        this.f12415.m3717();
        SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC21897 = this.f12421;
        sharedPreferencesOnSharedPreferenceChangeListenerC21897.getClass();
        try {
            C4925.f15523.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC21897);
        } catch (Exception unused) {
        }
        SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC218972 = this.f12433;
        sharedPreferencesOnSharedPreferenceChangeListenerC218972.getClass();
        try {
            C4925.f15523.unregisterOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC218972);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m11737() {
        return this.f12421.m49293() | this.f12433.m49293();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11743(MenuItem menuItem) {
        final SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC21897;
        final SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC218972;
        final C12392 c12392;
        final C12392 c123922;
        C7473 c7473 = this.f12424;
        C12392 m20095 = c7473.m20095();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector_res_0x7f0a0489) {
            m20095.m30298();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a065c) {
            m20095.m30484();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a032e) {
            m20095.m30495();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0345) {
            m20095.m30481();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a037c) {
            mo11728();
            return true;
        }
        ActivityC1748 activityC1748 = this.f12412;
        if (itemId == R.id.MT_Protector_res_0x7f0a035a) {
            C12392 m200952 = c7473.m20095();
            C15878 c15878 = new C15878(activityC1748, m200952);
            c15878.m31258(R.string.MT_Protector_res_0x7f1205e5);
            c15878.m31276(2);
            c15878.m31265("1…" + m200952.m30301());
            c15878.m31244();
            c15878.m31279(2);
            c15878.m31266(true);
            return true;
        }
        C12392 c123923 = this.f12425;
        C12392 c123924 = this.f12426;
        if (itemId == R.id.MT_Protector_res_0x7f0a038c) {
            boolean m20093 = c7473.m20093();
            SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC218973 = this.f12433;
            SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC218974 = this.f12421;
            if (m20093) {
                sharedPreferencesOnSharedPreferenceChangeListenerC218972 = sharedPreferencesOnSharedPreferenceChangeListenerC218973;
                sharedPreferencesOnSharedPreferenceChangeListenerC21897 = sharedPreferencesOnSharedPreferenceChangeListenerC218974;
                c123922 = c123923;
                c12392 = c123924;
            } else {
                sharedPreferencesOnSharedPreferenceChangeListenerC21897 = sharedPreferencesOnSharedPreferenceChangeListenerC218973;
                sharedPreferencesOnSharedPreferenceChangeListenerC218972 = sharedPreferencesOnSharedPreferenceChangeListenerC218974;
                c12392 = c123923;
                c123922 = c123924;
            }
            final boolean equals = sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49299().equals(sharedPreferencesOnSharedPreferenceChangeListenerC218972.m49299());
            final String[] strArr = (String[]) C7017.m18979().toArray(new String[0]);
            final int indexOf = C7017.m18979().indexOf(sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49299());
            C19258 buildDialog = activityC1748.buildDialog();
            buildDialog.m44433(R.string.MT_Protector_res_0x7f120611);
            buildDialog.m44429(strArr, indexOf, new DialogInterface.OnClickListener() { // from class: l.֫ۤᩳ
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (indexOf != i) {
                        String str = strArr[i];
                        sharedPreferencesOnSharedPreferenceChangeListenerC21897.m49296(str);
                        boolean m49280 = SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49280();
                        C12392 c123925 = c12392;
                        if (m49280) {
                            c123925.m30317(str, true);
                        }
                        c123925.m30428(str);
                        if (equals) {
                            sharedPreferencesOnSharedPreferenceChangeListenerC218972.m49296(str);
                            boolean m492802 = SharedPreferencesOnSharedPreferenceChangeListenerC21897.m49280();
                            C12392 c123926 = c123922;
                            if (m492802) {
                                c123926.m30317(str, true);
                            }
                            c123926.m30428(str);
                        }
                    }
                    dialogInterface.dismiss();
                }
            });
            buildDialog.m44442(R.string.MT_Protector_res_0x7f120189, null);
            buildDialog.m44440(R.string.MT_Protector_res_0x7f120a15, (DialogInterface.OnClickListener) null);
            buildDialog.m44438().m1448().setOnClickListener(new View.OnClickListener() { // from class: l.ۧۤᩳ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C3885.m11714(C3885.this);
                }
            });
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0380) {
            m11730(ActivityC2454.class);
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a038a) {
            m11748();
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a0536) {
            boolean m30437 = c123924.m30437();
            boolean z = !m30437;
            c123924.m30382(z);
            c123923.m30382(z);
            menuItem.setChecked(z);
            if (!m30437) {
                DialogInterfaceOnClickListenerC10816.m27034(R.string.MT_Protector_res_0x7f1209b3, activityC1748, "smooth_mode");
            }
            return true;
        }
        if (itemId == R.id.MT_Protector_res_0x7f0a033b) {
            C15545.m36645(menuItem, m20095);
            return true;
        }
        CharSequence title = menuItem.getTitle();
        if (!(title instanceof C16271)) {
            return false;
        }
        ((C16271) title).m38282().mo8779(m20095);
        return true;
    }
}

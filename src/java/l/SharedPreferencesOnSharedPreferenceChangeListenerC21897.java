package l;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import bin.mt.plus.R;

/* compiled from: 8AHY */
/* renamed from: l.᩸᩺ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC21897 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static C10220 f70098;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f70099 = C16293.f50117.m36526("edit_text_font2_custom.dat");

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static boolean f70100;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f70101 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractActivityC3346 f70102;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f70105;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12392 f70108;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C20030 f70109;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f70107 = "edit_word_wrap_normal";

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f70104 = true;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public String f70103 = "Text";

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f70106 = false;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static synchronized C10220 m49281() {
        synchronized (SharedPreferencesOnSharedPreferenceChangeListenerC21897.class) {
            String string = C4925.f15523.getString("edit_text_font2_custom_md5", "");
            C10220 c10220 = f70098;
            if (c10220 != null && ((String) c10220.f30697).equals(string)) {
                return c10220;
            }
            AbstractC15440 m36526 = C16293.f50117.m36526("edit_text_font2_custom.dat");
            Typeface typeface = Typeface.DEFAULT;
            if (!string.isEmpty() && m36526.mo23120()) {
                try {
                    typeface = Typeface.createFromFile(m36526.mo23554());
                } catch (Exception unused) {
                }
                if (typeface == null) {
                    typeface = Typeface.DEFAULT;
                }
            }
            if (typeface == Typeface.DEFAULT) {
                string = "";
            }
            C10220 c102202 = new C10220(string, typeface);
            f70098 = c102202;
            return c102202;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49278(SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC21897, C13136 c13136) {
        sharedPreferencesOnSharedPreferenceChangeListenerC21897.getClass();
        c13136.m31857();
        C12392 c12392 = sharedPreferencesOnSharedPreferenceChangeListenerC21897.f70108;
        c12392.scrollTo(0, c12392.m30408());
        c12392.invalidate();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC21897(AbstractActivityC3346 abstractActivityC3346, C12392 c12392) {
        this.f70102 = abstractActivityC3346;
        this.f70108 = c12392;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49289(String str, boolean z) {
        this.f70107 = str;
        this.f70104 = z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49295() {
        this.f70106 = true;
        this.f70107 = "edit_word_wrap_diff";
        this.f70104 = false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m49300() {
        if (C4925.f15523.getBoolean(this.f70107, this.f70104)) {
            return C4925.f15523.getBoolean("edit_word_wrap_keep", true) ? 1 : 2;
        }
        return 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49292(boolean z) {
        C4925.f15523.edit().putBoolean(this.f70107, z).apply();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m49294() {
        this.f70105 = true;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m49302() {
        return this.f70105;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49288(String str) {
        String m35657;
        if (str.startsWith("syntax:")) {
            m35657 = str.substring(7);
        } else {
            C15068 m18986 = C7017.m18986(str);
            m35657 = m18986 == null ? "Text" : m18986.m35657();
        }
        this.f70103 = m35657;
        boolean z = this.f70105;
        C12392 c12392 = this.f70108;
        if (z || m49280()) {
            c12392.m30317(this.f70103, true);
        }
        if (!this.f70106) {
            c12392.m30507(C4925.f15523.getBoolean("edit_show_line_numbers", true));
            c12392.m30541(C4925.f15523.getBoolean("edit_fixed_line_numbers", false));
        }
        boolean z2 = C4925.f15523.getBoolean("edit_show_indent_guides", true);
        C22686 c22686 = c12392.f37245;
        C22686 c226862 = c12392.f37245;
        if (c22686.f73265 != z2) {
            c22686.f73265 = z2;
            c12392.postInvalidate();
        }
        c226862.f73227 = C4925.f15523.getBoolean("edit_pinch_to_zoom", true);
        c12392.m30487(C4925.f15523.getBoolean("edit_auto_indent", true));
        c226862.f73228 = m49283();
        c12392.m30373(C4925.f15523.getBoolean("edit_show_blank_symbol", false));
        c12392.m30393(C4925.f15523.getBoolean("hide_single_space", true));
        c12392.m30365(C4925.f15523.getBoolean("edit_show_ascii_control", false));
        c12392.m30295(C4925.f15523.getBoolean("edit_show_unicode_special", true));
        c12392.m30294(C4925.f15523.getInt("edit_tab_size", 4));
        c12392.m30523(C4925.f15523.getBoolean("edit_indent_with_tabs", false));
        c12392.m30310(m49297(), m49279());
        c12392.m30309(m49282());
        c12392.m30512(m49300());
        c12392.m30513(C4925.f15523.getBoolean("show_soft_wrap_arrows", true));
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m49299() {
        return this.f70103;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49296(String str) {
        this.f70103 = str;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m49301() {
        this.f70109 = m49298();
        C4925.f15523.registerOnSharedPreferenceChangeListener(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49287(Class cls) {
        m49301();
        AbstractActivityC3346 abstractActivityC3346 = this.f70102;
        abstractActivityC3346.startActivity(new Intent(abstractActivityC3346, (Class<?>) cls));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20030 m49298() {
        int m49279 = m49279();
        return new C20030(m49297(), m49282(), m49279, m49300(), C4925.f15523.getInt("edit_tab_size", 4), this.f70103, m49279 == 1 ? C4925.f15523.getString("edit_text_font2_custom_md5", "") : "", C4925.f15523.getBoolean("show_soft_wrap_arrows", true), this.f70106 || C4925.f15523.getBoolean("edit_show_line_numbers", true), C4925.f15523.getBoolean("edit_show_ascii_control", false), C4925.f15523.getBoolean("edit_show_unicode_special", true), m49280());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49290(C10130 c10130) {
        C20030 m49298 = m49298();
        c10130.writeInt(388441883);
        c10130.m25423((CharSequence) m49298.f64860);
        c10130.writeByte(m49298.f64872);
        c10130.m25419(m49298.f64881);
        c10130.writeInt(m49298.f64878);
        c10130.m25425(m49298.f64869);
        c10130.m25425(m49298.f64866);
        c10130.m25425(m49298.f64870);
        c10130.writeInt(0);
        c10130.writeInt(m49298.f64861);
        c10130.m25439(m49298.f64876);
        c10130.m25425(m49298.f64873);
        c10130.m25425(m49298.f64864);
        c10130.m25419(m49298.f64871);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49291(C12951 c12951) {
        boolean m31490 = c12951.m31490(388441883);
        boolean z = m31490 || c12951.m31490(388441882);
        boolean z2 = z || c12951.m31490(388441881);
        boolean z3 = z2 || c12951.m31490(388441880);
        boolean z4 = z3 || c12951.m31490(388441879);
        boolean z5 = z4 || c12951.m31490(388441878);
        String m31504 = c12951.m31504();
        int readByte = c12951.readByte() & 255;
        float m31495 = c12951.m31495();
        int readInt = c12951.readInt();
        boolean m31498 = c12951.m31498();
        boolean z6 = z4 && c12951.m31498();
        boolean m314982 = c12951.m31498();
        if (z5) {
            c12951.readInt();
        }
        C20030 c20030 = new C20030(m31495, m31490 ? c12951.m31495() : 1.0f, readByte, readInt, c12951.readInt(), m31504, z3 ? c12951.m31506() : "", !z2 || c12951.m31498(), m31498, z6, !z || c12951.m31498(), m314982);
        this.f70103 = m31504;
        C20030 m49298 = m49298();
        c20030.f64867 = m49298.f64872;
        c20030.f64880 = m49298.f64881;
        c20030.f64875 = m49298.f64871;
        c20030.f64877 = m49298.f64878;
        c20030.f64868 = m49298.f64873;
        c20030.f64879 = m49298.f64869;
        c20030.f64882 = m49298.f64866;
        c20030.f64863 = m49298.f64864;
        c20030.f64862 = m49298.f64870;
        c20030.f64865 = m49298.f64861;
        c20030.f64874 = m49298.f64876;
        if (!c20030.m46165()) {
            c20030 = null;
        }
        if (c20030 != null) {
            this.f70108.m30339(c20030);
            C4925.m14315(new RunnableC0417(1, this));
        }
        m49286();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m49277(SharedPreferencesOnSharedPreferenceChangeListenerC21897 sharedPreferencesOnSharedPreferenceChangeListenerC21897) {
        C12392 c12392 = sharedPreferencesOnSharedPreferenceChangeListenerC21897.f70108;
        c12392.scrollTo(0, c12392.m30408());
        c12392.invalidate();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20030 m49285(C4691 c4691) {
        String str = c4691.f14912;
        int i = c4691.f14911;
        C20030 c20030 = new C20030(c4691.f14904, c4691.f14909, i, c4691.f14906, c4691.f14902, str, c4691.f14908, c4691.f14907, c4691.f14910, c4691.f14901, c4691.f14903, c4691.f14905);
        this.f70103 = str;
        C20030 m49298 = m49298();
        c20030.f64867 = m49298.f64872;
        c20030.f64880 = m49298.f64881;
        c20030.f64875 = m49298.f64871;
        c20030.f64877 = m49298.f64878;
        c20030.f64868 = m49298.f64873;
        c20030.f64879 = m49298.f64869;
        c20030.f64882 = m49298.f64866;
        c20030.f64863 = m49298.f64864;
        c20030.f64862 = m49298.f64870;
        c20030.f64865 = m49298.f64861;
        c20030.f64874 = m49298.f64876;
        if (c20030.m46165()) {
            return c20030;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (str == null) {
            return;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2113232115:
                if (str.equals("edit_line_spacing")) {
                    c = 0;
                    break;
                }
                break;
            case -2099828180:
                if (str.equals("hide_single_space")) {
                    c = 1;
                    break;
                }
                break;
            case -2032664963:
                if (str.equals("edit_show_indent_guides")) {
                    c = 2;
                    break;
                }
                break;
            case -1797291235:
                if (str.equals("edit_pinch_to_zoom")) {
                    c = 3;
                    break;
                }
                break;
            case -1384104704:
                if (str.equals("edit_tab_size")) {
                    c = 4;
                    break;
                }
                break;
            case -391883495:
                if (str.equals("edit_indent_with_tabs")) {
                    c = 5;
                    break;
                }
                break;
            case -343113470:
                if (str.equals("edit_show_ascii_control")) {
                    c = 6;
                    break;
                }
                break;
            case 372354057:
                if (str.equals("edit_magnifier")) {
                    c = 7;
                    break;
                }
                break;
            case 590121177:
                if (str.equals("diff_text_font_size")) {
                    c = '\b';
                    break;
                }
                break;
            case 760775466:
                if (str.equals("edit_show_unicode_special")) {
                    c = '\t';
                    break;
                }
                break;
            case 1050071438:
                if (str.equals("edit_high_light")) {
                    c = '\n';
                    break;
                }
                break;
            case 1329343111:
                if (str.equals("edit_auto_indent")) {
                    c = 11;
                    break;
                }
                break;
            case 1447455756:
                if (str.equals("edit_show_line_numbers")) {
                    c = '\f';
                    break;
                }
                break;
            case 1493579248:
                if (str.equals("edit_show_blank_symbol")) {
                    c = '\r';
                    break;
                }
                break;
            case 1643461684:
                if (str.equals("edit_text_font_size")) {
                    c = 14;
                    break;
                }
                break;
            case 1975085119:
                if (str.equals("edit_fixed_line_numbers")) {
                    c = 15;
                    break;
                }
                break;
        }
        C12392 c12392 = this.f70108;
        switch (c) {
            case 0:
                this.f70109.f64875 = m49282();
                break;
            case 1:
                c12392.m30393(C4925.f15523.getBoolean("hide_single_space", true));
                break;
            case 2:
                boolean z = C4925.f15523.getBoolean("edit_show_indent_guides", true);
                C22686 c22686 = c12392.f37245;
                if (c22686.f73265 != z) {
                    c22686.f73265 = z;
                    c12392.postInvalidate();
                    break;
                }
                break;
            case 3:
                c12392.f37245.f73227 = C4925.f15523.getBoolean("edit_pinch_to_zoom", true);
                break;
            case 4:
                this.f70109.f64865 = C4925.f15523.getInt("edit_tab_size", 4);
                break;
            case 5:
                c12392.m30523(C4925.f15523.getBoolean("edit_indent_with_tabs", false));
                break;
            case 6:
                this.f70109.f64882 = C4925.f15523.getBoolean("edit_show_ascii_control", false);
                break;
            case 7:
                c12392.f37245.f73228 = m49283();
                break;
            case '\b':
            case 14:
                this.f70109.f64880 = m49297();
                break;
            case '\t':
                this.f70109.f64863 = C4925.f15523.getBoolean("edit_show_unicode_special", true);
                break;
            case '\n':
                this.f70109.f64862 = m49280();
                break;
            case 11:
                c12392.m30487(C4925.f15523.getBoolean("edit_auto_indent", true));
                break;
            case '\f':
                if (!this.f70106) {
                    this.f70109.f64879 = C4925.f15523.getBoolean("edit_show_line_numbers", true);
                    break;
                }
                break;
            case '\r':
                c12392.m30373(C4925.f15523.getBoolean("edit_show_blank_symbol", false));
                break;
            case 15:
                if (!this.f70106) {
                    c12392.m30541(C4925.f15523.getBoolean("edit_fixed_line_numbers", false));
                    break;
                }
                break;
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m49293() {
        if (this.f70109 == null) {
            return false;
        }
        C4925.f15523.unregisterOnSharedPreferenceChangeListener(this);
        C20030 c20030 = this.f70109;
        this.f70109 = null;
        AbstractActivityC3346 abstractActivityC3346 = this.f70102;
        boolean m33028 = abstractActivityC3346.getLifecycle().mo19832().m33028(EnumC13728.CREATED);
        c20030.f64877 = m49300();
        c20030.f64868 = C4925.f15523.getBoolean("show_soft_wrap_arrows", true);
        int m49279 = m49279();
        c20030.f64867 = m49279;
        if (m49279 == 1) {
            c20030.f64874 = C4925.f15523.getString("edit_text_font2_custom_md5", "");
        }
        if (m33028 && c20030.m46165()) {
            C13136 c13136 = new C13136(abstractActivityC3346, R.string.MT_Protector_res_0x7f120808);
            c13136.m31864();
            this.f70108.m30340(c20030, new RunnableC12086(1, this, c13136));
        }
        return true;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m49279() {
        int i;
        try {
            try {
                i = C4925.f15523.getInt("edit_text_font2", 0);
            } catch (ClassCastException unused) {
                i = Integer.parseInt(C4925.f15523.getString("edit_text_font2", null));
                C4925.f15523.edit().putInt("edit_text_font2", i).apply();
            }
        } catch (Exception unused2) {
            C4925.f15523.edit().remove("edit_text_font2").apply();
            i = 0;
        }
        if (i == 2 && !f70099.mo23120()) {
            C4925.f15523.edit().remove("edit_text_font2").apply();
            i = 0;
        }
        if (i != 1) {
            return i != 2 ? 255 : 1;
        }
        return 0;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static float m49282() {
        try {
            int i = C4925.f15523.getInt("edit_line_spacing", 100);
            if (i < 80 || i > 200) {
                return 1.0f;
            }
            return i / 100.0f;
        } catch (ClassCastException unused) {
            return 1.0f;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m49297() {
        try {
            if (this.f70106) {
                return Integer.parseInt(C4925.f15523.getString("diff_text_font_size", "12"));
            }
            return Integer.parseInt(C4925.f15523.getString("edit_text_font_size", "15"));
        } catch (NumberFormatException unused) {
            return 15;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49286() {
        boolean z = C4925.f15523.getBoolean("edit_show_indent_guides", true);
        C12392 c12392 = this.f70108;
        C22686 c22686 = c12392.f37245;
        C22686 c226862 = c12392.f37245;
        if (c22686.f73265 != z) {
            c22686.f73265 = z;
            c12392.postInvalidate();
        }
        c226862.f73227 = C4925.f15523.getBoolean("edit_pinch_to_zoom", true);
        c12392.m30487(C4925.f15523.getBoolean("edit_auto_indent", true));
        c226862.f73228 = m49283();
        c12392.m30373(C4925.f15523.getBoolean("edit_show_blank_symbol", false));
        c12392.m30393(C4925.f15523.getBoolean("hide_single_space", true));
        c12392.m30523(C4925.f15523.getBoolean("edit_indent_with_tabs", false));
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m49280() {
        return C4925.f15523.getBoolean("edit_high_light", true);
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m49283() {
        boolean z = C4925.f15523.getBoolean("edit_magnifier", true);
        f70100 = z;
        return z;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static boolean m49284() {
        return f70100;
    }
}

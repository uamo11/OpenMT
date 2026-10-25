package l;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import java.util.Map;

/* compiled from: 469I */
/* renamed from: l.ᩴܽܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C18886 extends AbstractC21708 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16104 f59528;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C15356 f59529;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f59530;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2700 f59531;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C2658 f59532;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f59533;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ForegroundColorSpan f59534;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public Map f59535;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f59536;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f59537;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C4069 f59538;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C12534 f59539;

    static {
        ApplicationC12518.m30701(140);
    }

    public native C18886(Context context, C12534 c12534, Map map);

    @Override // l.AbstractC21708
    /* renamed from: ֫ */
    public final void mo10281(C12392 c12392, CharSequence charSequence) {
        Runnable runnable;
        String spannableString = ((SpannableString) charSequence).toString();
        int i = this.f59537;
        if (i == 1) {
            c12392.m30436().replace(this.f59536, this.f59530, spannableString);
            c12392.mo25919(spannableString.length() + this.f59536);
            int i2 = this.f59538.f12931;
            if (i2 != 1 && i2 != 2) {
                return;
            }
            m49035();
            runnable = new Runnable() { // from class: l.֨ܽܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C18886.this.m49038();
                }
            };
        } else {
            if (i != 2) {
                return;
            }
            if (spannableString.endsWith(":")) {
                c12392.m30436().replace(this.f59536, this.f59530, spannableString);
                c12392.mo25919(spannableString.length() + this.f59536);
            } else {
                c12392.m30436().replace(this.f59536, this.f59530, spannableString.concat("=\"\""));
                c12392.mo25919(spannableString.length() + this.f59536 + 2);
            }
            m49035();
            runnable = new Runnable() { // from class: l.֨ܽܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C18886.this.m49038();
                }
            };
        }
        C4925.m14315(runnable);
    }

    @Override // l.AbstractC21708
    /* renamed from: ֫ */
    public final C15356 mo10278(int i, CharSequence charSequence) {
        C18928.m43684(charSequence, i, this.f59531);
        C15356 c15356 = this.f59529;
        if (c15356.isEmpty()) {
            return null;
        }
        c15356.m36393(this.f59536);
        return c15356;
    }
}

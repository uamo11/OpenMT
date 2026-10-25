package l;

import android.text.SpannableStringBuilder;

/* compiled from: S2ZO */
/* renamed from: l.ۘۤ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3870 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final String f12377;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C3870 f12378;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C3870 f12379;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f12380 = 0;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f12381;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final InterfaceC15157 f12382;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC15157 f12383;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f12384;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f12385;

    static {
        InterfaceC15157 interfaceC15157 = C3164.f9956;
        f12382 = interfaceC15157;
        f12377 = Character.toString((char) 8206);
        f12381 = Character.toString((char) 8207);
        f12379 = new C3870(false, 2, interfaceC15157);
        f12378 = new C3870(true, 2, interfaceC15157);
    }

    public C3870(boolean z, int i, InterfaceC15157 interfaceC15157) {
        this.f12385 = z;
        this.f12384 = i;
        this.f12383 = interfaceC15157;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m11693(String str) {
        if (str == null) {
            return null;
        }
        return m11692(str, this.f12383).toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m11692(CharSequence charSequence, InterfaceC15157 interfaceC15157) {
        if (charSequence == null) {
            return null;
        }
        boolean mo35861 = ((AbstractC20098) interfaceC15157).mo35861(charSequence.length(), charSequence);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = this.f12384 & 2;
        String str = "";
        String str2 = f12381;
        String str3 = f12377;
        boolean z = this.f12385;
        if (i != 0) {
            boolean mo358612 = ((AbstractC20098) (mo35861 ? C3164.f9959 : C3164.f9958)).mo35861(charSequence.length(), charSequence);
            spannableStringBuilder.append((CharSequence) ((z || !(mo358612 || new C2459(charSequence).m7928() == 1)) ? (!z || (mo358612 && new C2459(charSequence).m7928() != -1)) ? "" : str2 : str3));
        }
        if (mo35861 != z) {
            spannableStringBuilder.append(mo35861 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean mo358613 = ((AbstractC20098) (mo35861 ? C3164.f9959 : C3164.f9958)).mo35861(charSequence.length(), charSequence);
        if (!z && (mo358613 || new C2459(charSequence).m7929() == 1)) {
            str = str3;
        } else if (z && (!mo358613 || new C2459(charSequence).m7929() == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SpannableStringBuilder m11691(CharSequence charSequence) {
        return m11692(charSequence, this.f12383);
    }
}

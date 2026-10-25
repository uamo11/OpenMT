package l;

import android.text.TextUtils;

/* compiled from: P1MC */
/* renamed from: l.᩺ᩳۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23150 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f74412;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f74413;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC5491 f74414;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CharSequence f74415;

    public C23150(CharSequence charSequence, EnumC5491 enumC5491) {
        int hashCode;
        int i;
        this.f74415 = charSequence;
        this.f74414 = enumC5491;
        int i2 = C11862.f35385[enumC5491.ordinal()];
        if (i2 == 1) {
            if ((charSequence instanceof String) || (charSequence instanceof C17673)) {
                hashCode = charSequence.hashCode();
            } else {
                hashCode = C11250.m27827(0, charSequence.length(), charSequence);
            }
            i = hashCode;
        } else if (i2 == 2) {
            int m10309 = C3374.m10309(0, charSequence.length(), charSequence);
            i = C11250.m27827(m10309, C3374.m10305(m10309, charSequence.length(), charSequence), charSequence);
        } else if (i2 == 3) {
            int length = charSequence.length();
            i = 0;
            for (int i3 = 0; i3 < length; i3++) {
                char charAt = charSequence.charAt(i3);
                if (!C11250.m27828(charAt)) {
                    i = (i * 31) + charAt;
                }
            }
        } else {
            throw new IllegalArgumentException(enumC5491.name());
        }
        this.f74412 = i;
        int length2 = charSequence.length();
        int i4 = 0;
        for (int i5 = 0; i5 < length2; i5++) {
            if (!C11250.m27828(charSequence.charAt(i5))) {
                i4++;
            }
        }
        this.f74413 = i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence m51330() {
        return this.f74415;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m51331() {
        return this.f74413;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C23150.class != obj.getClass()) {
            return false;
        }
        C23150 c23150 = (C23150) obj;
        if (this.f74412 != c23150.f74412) {
            return false;
        }
        CharSequence charSequence = c23150.f74415;
        int[] iArr = C11862.f35385;
        EnumC5491 enumC5491 = this.f74414;
        int i = iArr[enumC5491.ordinal()];
        CharSequence charSequence2 = this.f74415;
        if (i == 1) {
            return TextUtils.equals(charSequence2, charSequence);
        }
        if (i == 2) {
            return C11250.m27835(charSequence2, charSequence);
        }
        if (i == 3) {
            return C11250.m27831(charSequence2, charSequence);
        }
        throw new IllegalArgumentException(enumC5491.toString());
    }

    public final int hashCode() {
        return this.f74412;
    }
}

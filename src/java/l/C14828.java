package l;

import android.text.TextUtils;

/* compiled from: 27NH */
/* renamed from: l.ܳ᩺֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14828 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f45228;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f45229;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f45230;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f45231;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f45232;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f45233;

    public C14828(int i, int i2, String str, String str2, String str3, String str4) {
        this.f45229 = i;
        this.f45233 = i2;
        this.f45230 = str;
        this.f45228 = str2;
        this.f45232 = str3;
        this.f45231 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14828.class == obj.getClass()) {
            C14828 c14828 = (C14828) obj;
            if (this.f45229 == c14828.f45229 && this.f45233 == c14828.f45233 && TextUtils.equals(this.f45230, c14828.f45230) && TextUtils.equals(this.f45228, c14828.f45228) && TextUtils.equals(this.f45232, c14828.f45232) && TextUtils.equals(this.f45231, c14828.f45231)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.f45229 * 31) + this.f45233) * 31;
        String str = this.f45230;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f45228;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f45232;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f45231;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}

package l;

/* compiled from: 1799 */
/* renamed from: l.۫᩷ۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12653 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f38109;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f38110;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f38111;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f38112;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f38113;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f38114;

    public C12653(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f38109 = i;
        this.f38110 = i2;
        this.f38112 = i3;
        this.f38113 = i4;
        this.f38114 = i5;
        this.f38111 = i6;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12653 m30932(C9418 c9418) {
        int i;
        int i2;
        int i3;
        int length;
        int i4;
        int i5;
        int i6;
        int i7;
        String str = c9418.f28572;
        String str2 = c9418.f28571;
        if (str2 == null) {
            str2 = "";
        }
        if (!"dex_field".equals(str)) {
            if ("dex_method".equals(str)) {
                int indexOf = str2.indexOf(40);
                int indexOf2 = indexOf >= 0 ? str2.indexOf(41, indexOf + 1) : -1;
                int length2 = indexOf >= 0 ? indexOf : str2.length();
                int length3 = indexOf >= 0 ? indexOf + 1 : str2.length();
                int length4 = indexOf2 >= 0 ? indexOf2 : str2.length();
                i3 = length3;
                length = indexOf2 >= 0 ? indexOf2 + 1 : str2.length();
                i4 = length2;
                i5 = length4;
                i6 = 0;
                i7 = 0;
                return new C12653(i6, i7, i4, i3, i5, length);
            }
            i = 0;
            i2 = 0;
        } else {
            int indexOf3 = str2.indexOf(58);
            i = indexOf3 >= 0 ? indexOf3 : str2.length();
            i2 = indexOf3 >= 0 ? indexOf3 + 1 : str2.length();
        }
        i7 = i2;
        i6 = i;
        i4 = 0;
        i3 = 0;
        i5 = 0;
        length = 0;
        return new C12653(i6, i7, i4, i3, i5, length);
    }
}

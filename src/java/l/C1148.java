package l;

import android.view.View;

/* compiled from: M4Z7 */
/* renamed from: l.֨ܰ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1148 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C21610 f4163 = new C23726().m52373().m48816().m48828().m48831();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21610 f4164;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo3934(View view) {
    }

    /* renamed from: ֫ */
    public void mo1998(C11007 c11007) {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo3935(C21610 c21610) {
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo3936(C11007[] c11007Arr) {
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean mo3938() {
        return false;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean mo3939() {
        return false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean mo3944(int i) {
        return true;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5157 mo3945() {
        return null;
    }

    public C1148(C21610 c21610) {
        this.f4164 = c21610;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C21610 mo3943() {
        return this.f4164;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21610 mo3941() {
        return this.f4164;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21610 mo3933() {
        return this.f4164;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C11007 mo3937() {
        return C11007.f33107;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C11007 mo3942() {
        return C11007.f33107;
    }

    /* renamed from: ᩻ */
    public C11007 mo2001() {
        return mo3937();
    }

    /* renamed from: ܿ */
    public C11007 mo1999() {
        return mo3937();
    }

    /* renamed from: ᩷ */
    public C11007 mo2000() {
        return mo3937();
    }

    /* renamed from: ֫ */
    public C21610 mo1997(int i, int i2, int i3, int i4) {
        return f4163;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C11007 mo3932(int i) {
        return C11007.f33107;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11007 mo3940(int i) {
        if ((i & 8) != 0) {
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }
        return C11007.f33107;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1148)) {
            return false;
        }
        C1148 c1148 = (C1148) obj;
        return mo3938() == c1148.mo3938() && mo3939() == c1148.mo3939() && C11003.equals(mo3937(), c1148.mo3937()) && C11003.equals(mo3942(), c1148.mo3942()) && C11003.equals(mo3945(), c1148.mo3945());
    }

    public int hashCode() {
        return C11003.hash(Boolean.valueOf(mo3938()), Boolean.valueOf(mo3939()), mo3937(), mo3942(), mo3945());
    }
}

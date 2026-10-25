package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;

/* compiled from: 1BH4 */
/* renamed from: l.ᩴܺܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18863 extends AbstractC13717 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C23095 f59470;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20274 f59471;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ArrayList f59472 = new ArrayList();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C12512 f59473;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f59474;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C14628 f59475;

    @Override // l.AbstractC13717
    /* renamed from: ۧ */
    public final boolean mo2229() {
        return false;
    }

    @Override // l.AbstractC13717
    /* renamed from: ᩻ */
    public final String mo8292() {
        return "InvokeDynamic";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18863 m43562(int i, C20274 c20274) {
        return new C18863(i, c20274);
    }

    public C18863(int i, C20274 c20274) {
        this.f59474 = i;
        this.f59471 = c20274;
        this.f59470 = C23095.m51254(c20274.m46532().mo2463());
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C23801 m43569() {
        ArrayList arrayList = this.f59472;
        C23801 c23801 = new C23801(this, arrayList.size());
        arrayList.add(c23801);
        return c23801;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayList m43568() {
        return this.f59472;
    }

    public final String toString() {
        return mo2463();
    }

    @Override // l.InterfaceC0601
    /* renamed from: ֫ */
    public final String mo2463() {
        C12512 c12512 = this.f59473;
        StringBuilder m9834 = C3200.m9834("InvokeDynamic(", c12512 != null ? c12512.mo2463() : "Unknown", ":");
        m9834.append(this.f59474);
        m9834.append(", ");
        m9834.append(this.f59471.mo2463());
        m9834.append(MotionUtils.EASING_TYPE_FORMAT_END);
        return m9834.toString();
    }

    @Override // l.AbstractC13717
    /* renamed from: ۧ */
    public final int mo2228(AbstractC13717 abstractC13717) {
        C18863 c18863 = (C18863) abstractC13717;
        int compare = Integer.compare(this.f59474, c18863.f59474);
        if (compare != 0) {
            return compare;
        }
        int compareTo = this.f59471.compareTo(c18863.f59471);
        if (compareTo != 0) {
            return compareTo;
        }
        int compareTo2 = this.f59473.compareTo((AbstractC13717) c18863.f59473);
        return compareTo2 != 0 ? compareTo2 : this.f59475.compareTo(c18863.f59475);
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m43571() {
        return this.f59474;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C20274 m43567() {
        return this.f59471;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23095 m43564() {
        return this.f59470;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C7573 m43570() {
        return this.f59470.m51261();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43565(C12512 c12512) {
        if (this.f59473 != null) {
            throw new IllegalArgumentException("already added declaring class");
        }
        if (c12512 == null) {
            throw new NullPointerException("declaringClass == null");
        }
        this.f59473 = c12512;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43566(C14628 c14628) {
        if (this.f59475 != null) {
            throw new IllegalArgumentException("already added call site");
        }
        this.f59475 = c14628;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C14628 m43563() {
        return this.f59475;
    }
}

package l;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: X4TD */
/* renamed from: l.᩷ܺ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20968 implements Serializable {
    public static final long serialVersionUID = 1;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient String f67741;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Integer f67742;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Integer f67743;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Comparator f67744;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient int f67745;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20968 m47784(Integer num, Integer num2) {
        return new C20968(num, num2);
    }

    public C20968(Integer num, Integer num2) {
        EnumC6856 enumC6856 = EnumC6856.INSTANCE;
        this.f67744 = enumC6856;
        if (enumC6856.compare(num, num2) < 1) {
            this.f67742 = num;
            this.f67743 = num2;
        } else {
            this.f67742 = num2;
            this.f67743 = num;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47785(Integer num) {
        Integer num2 = this.f67742;
        Comparator comparator = this.f67744;
        return comparator.compare(num, num2) > -1 && comparator.compare(num, this.f67743) < 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != C20968.class) {
            return false;
        }
        C20968 c20968 = (C20968) obj;
        return this.f67742.equals(c20968.f67742) && this.f67743.equals(c20968.f67743);
    }

    public final int hashCode() {
        int i = this.f67745;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f67743.hashCode() + ((this.f67742.hashCode() + ((C20968.class.hashCode() + 629) * 37)) * 37);
        this.f67745 = hashCode;
        return hashCode;
    }

    public final String toString() {
        if (this.f67741 == null) {
            this.f67741 = "[" + this.f67742 + ".." + this.f67743 + "]";
        }
        return this.f67741;
    }
}

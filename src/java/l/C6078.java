package l;

import java.math.BigInteger;
import java.text.Collator;

/* compiled from: M2AR */
/* renamed from: l.ۛ۬ܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6078 implements Comparable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public String f18644;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public BigInteger f18645;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f18646;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f18647;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Collator f18648;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f18649;

    public C6078(Collator collator, String str, boolean z) {
        this.f18648 = collator;
        if (str.isEmpty() || str.charAt(0) < 128) {
            this.f18647 = 0;
        } else {
            this.f18647 = 1;
        }
        this.f18649 = z;
        if (z) {
            try {
                this.f18645 = new BigInteger(str);
            } catch (NumberFormatException unused) {
                this.f18645 = BigInteger.ZERO;
            }
        }
        this.f18644 = str;
        this.f18646 = str.toLowerCase();
    }

    @Override // java.lang.Comparable
    /* renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C6078 c6078) {
        int compare;
        int compareTo;
        int i = c6078.f18647;
        int i2 = this.f18647;
        if (i2 != i) {
            return i2 - i;
        }
        if (this.f18649 && c6078.f18649 && (compareTo = this.f18645.compareTo(c6078.f18645)) != 0) {
            return compareTo;
        }
        String str = c6078.f18646;
        int i3 = C7489.f23073;
        String str2 = this.f18646;
        int length = str2.length();
        int length2 = str.length();
        int min = Math.min(str2.length(), length2);
        int i4 = 0;
        while (true) {
            if (i4 < min) {
                char charAt = str2.charAt(i4);
                char charAt2 = str.charAt(i4);
                if (charAt != charAt2) {
                    compare = 1;
                    boolean z = charAt <= 127;
                    boolean z2 = charAt2 <= 127;
                    if (z && z2) {
                        compare = charAt - charAt2;
                        break;
                    }
                    if (z) {
                        compare = -1;
                        break;
                    }
                    if (z2) {
                        break;
                    }
                    compare = this.f18648.compare(String.valueOf(charAt), String.valueOf(charAt2));
                    if (compare != 0) {
                        break;
                    }
                }
                i4++;
            } else {
                compare = Integer.compare(length, length2);
                break;
            }
        }
        return compare != 0 ? compare : this.f18644.compareTo(c6078.f18644);
    }

    public final String toString() {
        return this.f18646;
    }
}

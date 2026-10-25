package l;

/* compiled from: R1T1 */
/* renamed from: l.ᩳ᩷֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC18293 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f56884;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f56885;

    public AbstractC18293(int i, int i2) {
        this.f56884 = i;
        this.f56885 = (1 << i2) - 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m42641(int i, int i2) {
        int i3 = this.f56884;
        return (i >> (8 - i3)) + ((i2 & this.f56885) << i3);
    }
}

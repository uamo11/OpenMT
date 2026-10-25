package l;

/* compiled from: VBK3 */
/* renamed from: l.᩸᩶ۡ, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC21807 implements Cloneable {
    public abstract double getX();

    public abstract double getY();

    /* renamed from: ֫ */
    public abstract void mo22010(double d, double d2);

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(getX()) ^ (Double.doubleToLongBits(getY()) * 31);
        return ((int) doubleToLongBits) ^ ((int) (doubleToLongBits >> 32));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC21807) {
            AbstractC21807 abstractC21807 = (AbstractC21807) obj;
            return getX() == abstractC21807.getX() && getY() == abstractC21807.getY();
        }
        return super.equals(obj);
    }
}

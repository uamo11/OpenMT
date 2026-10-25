package l;

/* compiled from: 49FQ */
/* renamed from: l.ۚ۬ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC5366 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC11716 f16709;

    public abstract Object getValue();

    public AbstractC5366(AbstractC11716 abstractC11716) {
        this.f16709 = abstractC11716;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC5366 abstractC5366 = (AbstractC5366) obj;
        if (this.f16709 != abstractC5366.f16709) {
            return false;
        }
        return getValue() != null ? getValue().equals(abstractC5366.getValue()) : abstractC5366.getValue() == null;
    }

    public final int hashCode() {
        return this.f16709.m28612();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        return C9045.m23341(sb, mo9905(), "]");
    }

    /* renamed from: ܽ */
    public String mo9905() {
        if (getValue() != null) {
            return getValue().toString();
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC11716 m15330() {
        return this.f16709;
    }
}

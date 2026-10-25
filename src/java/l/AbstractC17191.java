package l;

/* compiled from: BAIH */
/* renamed from: l.ܿۜ᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC17191 extends C15688 {
    /* renamed from: ֫ */
    public void mo29864(C16477 c16477) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C15688
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && super.equals(obj)) {
            return C11003.equals(mo24428(), ((AbstractC17191) obj).mo24428());
        }
        return false;
    }

    @Override // l.C15688
    public final int hashCode() {
        int hashCode = super.hashCode();
        C16477 mo24428 = mo24428();
        return (hashCode * 31) + (mo24428 != null ? mo24428.hashCode() : 0);
    }
}

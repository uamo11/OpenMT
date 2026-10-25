package l;

/* compiled from: N67N */
/* renamed from: l.ۜ᩶֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum EnumC6982 {
    string,
    type,
    field,
    method,
    none;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m18874(AbstractC5116 abstractC5116) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return abstractC5116 instanceof C11467;
        }
        if (ordinal == 1) {
            return abstractC5116 instanceof C22755;
        }
        if (ordinal == 2) {
            return abstractC5116 instanceof C18522;
        }
        if (ordinal != 3) {
            return ordinal == 4 && abstractC5116 == null;
        }
        return abstractC5116 instanceof C22050;
    }
}

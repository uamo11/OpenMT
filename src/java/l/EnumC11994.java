package l;

/* compiled from: I81O */
/* renamed from: l.ۨ᩹ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum EnumC11994 {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f35914;

    EnumC11994(long j) {
        this.f35914 = j;
    }

    public long getValue() {
        return this.f35914;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC11994 m29326(long j) {
        EnumC11994[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].getValue() == j) {
                return values[i];
            }
        }
        throw new IllegalArgumentException(C16014.m37865(j, "Unsupported FileSection Type "));
    }
}

package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: N673 */
/* renamed from: l.᩹۟ᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC22147 {
    public static final EnumC22147 OP;
    public static final EnumC22147 SPLITERATOR;
    public static final EnumC22147 STREAM;
    public static final EnumC22147 TERMINAL_OP;
    public static final EnumC22147 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ EnumC22147[] a;

    public static EnumC22147 valueOf(String str) {
        return (EnumC22147) Enum.valueOf(EnumC22147.class, str);
    }

    public static EnumC22147[] values() {
        return (EnumC22147[]) a.clone();
    }

    static {
        EnumC22147 enumC22147 = new EnumC22147("SPLITERATOR", 0);
        SPLITERATOR = enumC22147;
        EnumC22147 enumC221472 = new EnumC22147("STREAM", 1);
        STREAM = enumC221472;
        EnumC22147 enumC221473 = new EnumC22147("OP", 2);
        OP = enumC221473;
        EnumC22147 enumC221474 = new EnumC22147("TERMINAL_OP", 3);
        TERMINAL_OP = enumC221474;
        EnumC22147 enumC221475 = new EnumC22147("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = enumC221475;
        a = new EnumC22147[]{enumC22147, enumC221472, enumC221473, enumC221474, enumC221475};
    }
}

package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: N673 */
/* renamed from: l.۠ۙᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class EnumC7954 implements InterfaceC14303 {
    public static final EnumC7954 INSENSITIVE;
    public static final EnumC7954 LENIENT;
    public static final EnumC7954 SENSITIVE;
    public static final EnumC7954 STRICT;
    public static final /* synthetic */ EnumC7954[] a;

    @Override // l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        return true;
    }

    public static EnumC7954 valueOf(String str) {
        return (EnumC7954) Enum.valueOf(EnumC7954.class, str);
    }

    public static EnumC7954[] values() {
        return (EnumC7954[]) a.clone();
    }

    static {
        EnumC7954 enumC7954 = new EnumC7954("SENSITIVE", 0);
        SENSITIVE = enumC7954;
        EnumC7954 enumC79542 = new EnumC7954("INSENSITIVE", 1);
        INSENSITIVE = enumC79542;
        EnumC7954 enumC79543 = new EnumC7954("STRICT", 2);
        STRICT = enumC79543;
        EnumC7954 enumC79544 = new EnumC7954("LENIENT", 3);
        LENIENT = enumC79544;
        a = new EnumC7954[]{enumC7954, enumC79542, enumC79543, enumC79544};
    }

    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            c3015.b = true;
            return i;
        }
        if (ordinal == 1) {
            c3015.b = false;
            return i;
        }
        if (ordinal == 2) {
            c3015.c = true;
            return i;
        }
        if (ordinal != 3) {
            return i;
        }
        c3015.c = false;
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}

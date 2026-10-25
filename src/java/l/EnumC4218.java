package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: N673 */
/* renamed from: l.ۘ᩸ᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class EnumC4218 {
    public static final EnumC4218 END_DIRECTORY;
    public static final EnumC4218 ENTRY;
    public static final EnumC4218 START_DIRECTORY;
    public static final /* synthetic */ EnumC4218[] a;

    public static EnumC4218 valueOf(String str) {
        return (EnumC4218) Enum.valueOf(EnumC4218.class, str);
    }

    public static EnumC4218[] values() {
        return (EnumC4218[]) a.clone();
    }

    static {
        EnumC4218 enumC4218 = new EnumC4218("START_DIRECTORY", 0);
        START_DIRECTORY = enumC4218;
        EnumC4218 enumC42182 = new EnumC4218("END_DIRECTORY", 1);
        END_DIRECTORY = enumC42182;
        EnumC4218 enumC42183 = new EnumC4218("ENTRY", 2);
        ENTRY = enumC42183;
        a = new EnumC4218[]{enumC4218, enumC42182, enumC42183};
    }
}

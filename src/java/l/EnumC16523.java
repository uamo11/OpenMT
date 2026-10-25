package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: N673 */
/* renamed from: l.ܽ۠ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class EnumC16523 {
    public static final EnumC16523 CONTINUE;
    public static final EnumC16523 SKIP_SIBLINGS;
    public static final EnumC16523 SKIP_SUBTREE;
    public static final EnumC16523 TERMINATE;
    public static final /* synthetic */ EnumC16523[] a;

    public static EnumC16523 valueOf(String str) {
        return (EnumC16523) Enum.valueOf(EnumC16523.class, str);
    }

    public static EnumC16523[] values() {
        return (EnumC16523[]) a.clone();
    }

    static {
        EnumC16523 enumC16523 = new EnumC16523("CONTINUE", 0);
        CONTINUE = enumC16523;
        EnumC16523 enumC165232 = new EnumC16523("TERMINATE", 1);
        TERMINATE = enumC165232;
        EnumC16523 enumC165233 = new EnumC16523("SKIP_SUBTREE", 2);
        SKIP_SUBTREE = enumC165233;
        EnumC16523 enumC165234 = new EnumC16523("SKIP_SIBLINGS", 3);
        SKIP_SIBLINGS = enumC165234;
        a = new EnumC16523[]{enumC16523, enumC165232, enumC165233, enumC165234};
    }
}

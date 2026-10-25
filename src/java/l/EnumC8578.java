package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: N673 */
/* renamed from: l.ۡ֫᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class EnumC8578 {
    public static final EnumC8578 DOUBLE_VALUE;
    public static final EnumC8578 INT_VALUE;
    public static final EnumC8578 LONG_VALUE;
    public static final EnumC8578 REFERENCE;
    public static final /* synthetic */ EnumC8578[] a;

    public static EnumC8578 valueOf(String str) {
        return (EnumC8578) Enum.valueOf(EnumC8578.class, str);
    }

    public static EnumC8578[] values() {
        return (EnumC8578[]) a.clone();
    }

    static {
        EnumC8578 enumC8578 = new EnumC8578("REFERENCE", 0);
        REFERENCE = enumC8578;
        EnumC8578 enumC85782 = new EnumC8578("INT_VALUE", 1);
        INT_VALUE = enumC85782;
        EnumC8578 enumC85783 = new EnumC8578("LONG_VALUE", 2);
        LONG_VALUE = enumC85783;
        EnumC8578 enumC85784 = new EnumC8578("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = enumC85784;
        a = new EnumC8578[]{enumC8578, enumC85782, enumC85783, enumC85784};
    }
}

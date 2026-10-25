package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: N673 */
/* renamed from: l.۬۠ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class EnumC12995 {
    public static final EnumC12995 GROUP_EXECUTE;
    public static final EnumC12995 GROUP_READ;
    public static final EnumC12995 GROUP_WRITE;
    public static final EnumC12995 OTHERS_EXECUTE;
    public static final EnumC12995 OTHERS_READ;
    public static final EnumC12995 OTHERS_WRITE;
    public static final EnumC12995 OWNER_EXECUTE;
    public static final EnumC12995 OWNER_READ;
    public static final EnumC12995 OWNER_WRITE;
    public static final /* synthetic */ EnumC12995[] a;

    public static EnumC12995 valueOf(String str) {
        return (EnumC12995) Enum.valueOf(EnumC12995.class, str);
    }

    public static EnumC12995[] values() {
        return (EnumC12995[]) a.clone();
    }

    static {
        EnumC12995 enumC12995 = new EnumC12995("OWNER_READ", 0);
        OWNER_READ = enumC12995;
        EnumC12995 enumC129952 = new EnumC12995("OWNER_WRITE", 1);
        OWNER_WRITE = enumC129952;
        EnumC12995 enumC129953 = new EnumC12995("OWNER_EXECUTE", 2);
        OWNER_EXECUTE = enumC129953;
        EnumC12995 enumC129954 = new EnumC12995("GROUP_READ", 3);
        GROUP_READ = enumC129954;
        EnumC12995 enumC129955 = new EnumC12995("GROUP_WRITE", 4);
        GROUP_WRITE = enumC129955;
        EnumC12995 enumC129956 = new EnumC12995("GROUP_EXECUTE", 5);
        GROUP_EXECUTE = enumC129956;
        EnumC12995 enumC129957 = new EnumC12995("OTHERS_READ", 6);
        OTHERS_READ = enumC129957;
        EnumC12995 enumC129958 = new EnumC12995("OTHERS_WRITE", 7);
        OTHERS_WRITE = enumC129958;
        EnumC12995 enumC129959 = new EnumC12995("OTHERS_EXECUTE", 8);
        OTHERS_EXECUTE = enumC129959;
        a = new EnumC12995[]{enumC12995, enumC129952, enumC129953, enumC129954, enumC129955, enumC129956, enumC129957, enumC129958, enumC129959};
    }
}

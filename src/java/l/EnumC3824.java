package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: N673 */
/* renamed from: l.ۘ۠ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class EnumC3824 implements InterfaceC23579 {
    public static final EnumC3824 APPEND;
    public static final EnumC3824 CREATE;
    public static final EnumC3824 CREATE_NEW;
    public static final EnumC3824 DELETE_ON_CLOSE;
    public static final EnumC3824 DSYNC;
    public static final EnumC3824 READ;
    public static final EnumC3824 SPARSE;
    public static final EnumC3824 SYNC;
    public static final EnumC3824 TRUNCATE_EXISTING;
    public static final EnumC3824 WRITE;
    public static final /* synthetic */ EnumC3824[] a;

    public static EnumC3824 valueOf(String str) {
        return (EnumC3824) Enum.valueOf(EnumC3824.class, str);
    }

    public static EnumC3824[] values() {
        return (EnumC3824[]) a.clone();
    }

    static {
        EnumC3824 enumC3824 = new EnumC3824("READ", 0);
        READ = enumC3824;
        EnumC3824 enumC38242 = new EnumC3824("WRITE", 1);
        WRITE = enumC38242;
        EnumC3824 enumC38243 = new EnumC3824("APPEND", 2);
        APPEND = enumC38243;
        EnumC3824 enumC38244 = new EnumC3824("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = enumC38244;
        EnumC3824 enumC38245 = new EnumC3824("CREATE", 4);
        CREATE = enumC38245;
        EnumC3824 enumC38246 = new EnumC3824("CREATE_NEW", 5);
        CREATE_NEW = enumC38246;
        EnumC3824 enumC38247 = new EnumC3824("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = enumC38247;
        EnumC3824 enumC38248 = new EnumC3824("SPARSE", 7);
        SPARSE = enumC38248;
        EnumC3824 enumC38249 = new EnumC3824("SYNC", 8);
        SYNC = enumC38249;
        EnumC3824 enumC382410 = new EnumC3824("DSYNC", 9);
        DSYNC = enumC382410;
        a = new EnumC3824[]{enumC3824, enumC38242, enumC38243, enumC38244, enumC38245, enumC38246, enumC38247, enumC38248, enumC38249, enumC382410};
    }
}

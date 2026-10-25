package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: N673 */
/* renamed from: l.ۖ۠ᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class EnumC2413 implements InterfaceC22667 {
    public static final EnumC2413 ATOMIC_MOVE;
    public static final EnumC2413 COPY_ATTRIBUTES;
    public static final EnumC2413 REPLACE_EXISTING;
    public static final /* synthetic */ EnumC2413[] a;

    public static EnumC2413 valueOf(String str) {
        return (EnumC2413) Enum.valueOf(EnumC2413.class, str);
    }

    public static EnumC2413[] values() {
        return (EnumC2413[]) a.clone();
    }

    static {
        EnumC2413 enumC2413 = new EnumC2413("REPLACE_EXISTING", 0);
        REPLACE_EXISTING = enumC2413;
        EnumC2413 enumC24132 = new EnumC2413("COPY_ATTRIBUTES", 1);
        COPY_ATTRIBUTES = enumC24132;
        EnumC2413 enumC24133 = new EnumC2413("ATOMIC_MOVE", 2);
        ATOMIC_MOVE = enumC24133;
        a = new EnumC2413[]{enumC2413, enumC24132, enumC24133};
    }
}

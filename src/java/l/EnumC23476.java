package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: N673 */
/* renamed from: l.᩻ۙᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class EnumC23476 {
    public static final EnumC23476 ALWAYS;
    public static final EnumC23476 EXCEEDS_PAD;
    public static final EnumC23476 NEVER;
    public static final EnumC23476 NORMAL;
    public static final EnumC23476 NOT_NEGATIVE;
    public static final /* synthetic */ EnumC23476[] a;

    public static EnumC23476 valueOf(String str) {
        return (EnumC23476) Enum.valueOf(EnumC23476.class, str);
    }

    public static EnumC23476[] values() {
        return (EnumC23476[]) a.clone();
    }

    static {
        EnumC23476 enumC23476 = new EnumC23476("NORMAL", 0);
        NORMAL = enumC23476;
        EnumC23476 enumC234762 = new EnumC23476("ALWAYS", 1);
        ALWAYS = enumC234762;
        EnumC23476 enumC234763 = new EnumC23476("NEVER", 2);
        NEVER = enumC234763;
        EnumC23476 enumC234764 = new EnumC23476("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = enumC234764;
        EnumC23476 enumC234765 = new EnumC23476("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = enumC234765;
        a = new EnumC23476[]{enumC23476, enumC234762, enumC234763, enumC234764, enumC234765};
    }
}

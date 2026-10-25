package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: N673 */
/* renamed from: l.ܺ֫᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class EnumC15632 {
    public static final EnumC15632 MAYBE_MORE;
    public static final EnumC15632 NO_MORE;
    public static final EnumC15632 UNLIMITED;
    public static final /* synthetic */ EnumC15632[] a;

    static {
        EnumC15632 enumC15632 = new EnumC15632("NO_MORE", 0);
        NO_MORE = enumC15632;
        EnumC15632 enumC156322 = new EnumC15632("MAYBE_MORE", 1);
        MAYBE_MORE = enumC156322;
        EnumC15632 enumC156323 = new EnumC15632("UNLIMITED", 2);
        UNLIMITED = enumC156323;
        a = new EnumC15632[]{enumC15632, enumC156322, enumC156323};
    }

    public static EnumC15632 valueOf(String str) {
        return (EnumC15632) Enum.valueOf(EnumC15632.class, str);
    }

    public static EnumC15632[] values() {
        return (EnumC15632[]) a.clone();
    }
}

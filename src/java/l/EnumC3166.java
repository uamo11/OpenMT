package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: 6428 */
/* renamed from: l.ۗۤ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class EnumC3166 {

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC3166 f9968 = new C22216();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC3166 f9966 = new C20100();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3166 f9965 = new C4577();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC3166[] f9967 = m9713();

    public /* synthetic */ EnumC3166(String str, int i, int i2) {
        this(str, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract EnumC3166 mo9715(EnumC3166 enumC3166);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract EnumC3166 mo9717(EnumC3166 enumC3166);

    public EnumC3166(String str, int i) {
    }

    public static EnumC3166 valueOf(String str) {
        return (EnumC3166) Enum.valueOf(EnumC3166.class, str);
    }

    public static EnumC3166[] values() {
        return (EnumC3166[]) f9967.clone();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC3166[] m9713() {
        return new EnumC3166[]{f9968, f9966, f9965};
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC3166 m9718(boolean z) {
        return mo9717(m9714(z));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC3166 m9716(boolean z) {
        return mo9715(m9714(z));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static EnumC3166 m9714(boolean z) {
        return z ? f9968 : f9966;
    }
}

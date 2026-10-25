package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: 34PY */
/* renamed from: l.᩵֨֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class EnumC19125 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC19125 f60273 = new C2191();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final EnumC19125 f60275 = new C3602();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC19125 f60272 = new C18419();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC19125[] f60274 = m44154();

    public /* synthetic */ EnumC19125(String str, int i, int i2) {
        this(str, i);
    }

    /* renamed from: ֫ */
    public abstract EnumC19125 mo7226();

    public EnumC19125(String str, int i) {
    }

    public static EnumC19125 valueOf(String str) {
        return (EnumC19125) Enum.valueOf(EnumC19125.class, str);
    }

    public static EnumC19125[] values() {
        return (EnumC19125[]) f60274.clone();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC19125[] m44154() {
        return new EnumC19125[]{f60273, f60275, f60272};
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m44155(EnumC19125 enumC19125) {
        int ordinal;
        if (enumC19125 != this && (ordinal = enumC19125.ordinal()) != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    return true;
                }
                C12171.m29640("Cannot get here!");
                throw null;
            }
            if (this != f60272) {
                return true;
            }
        }
        return false;
    }
}

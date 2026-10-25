package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: M43N */
/* renamed from: l.ۧۨ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class EnumC10969 {

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final EnumC10969 f33009;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC10969 f33010;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC10969 f33011;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC10969 f33012;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC10969[] f33013;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC19125 f33014;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC10969 f33008 = new C12214(EnumC19125.f60275);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC10969 f33007 = new C10098(EnumC19125.f60273);

    public /* synthetic */ EnumC10969(String str, int i, EnumC19125 enumC19125, int i2) {
        this(str, i, enumC19125);
    }

    /* renamed from: ܽ */
    public abstract AbstractC4308 mo5983(C0779 c0779, C0384 c0384);

    public static EnumC10969 valueOf(String str) {
        return (EnumC10969) Enum.valueOf(EnumC10969.class, str);
    }

    public static EnumC10969[] values() {
        return (EnumC10969[]) f33013.clone();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC10969[] m27281() {
        return new EnumC10969[]{f33008, f33007, f33011, f33010, f33009, f33012};
    }

    static {
        EnumC19125 enumC19125 = EnumC19125.f60272;
        f33011 = new C22797(enumC19125);
        f33010 = new C13624(enumC19125);
        f33009 = new C7275(enumC19125);
        f33012 = new C1796(enumC19125);
        f33013 = m27281();
    }

    public EnumC10969(String str, int i, EnumC19125 enumC19125) {
        this.f33014 = enumC19125;
    }

    /* renamed from: ֫ */
    public boolean mo5982(C0779 c0779, C0384 c0384) {
        return m27282(c0779, c0384).m8249() && !c0779.m2969();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2609 m27282(C0779 c0779, C0384 c0384) {
        return AbstractC4308.m12902(c0779.m2963(this.f33014), new C17859(c0384));
    }
}

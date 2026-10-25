package l;

/* compiled from: Z7QW */
/* renamed from: l.᩸۬֨, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum EnumC21592 {
    INIT(0),
    PARSE(1),
    ENTER(2),
    PROCESS(3),
    ATTR(4),
    FLOW(5),
    TRANSTYPES(6),
    TRANSPATTERNS(7),
    UNLAMBDA(8),
    LOWER(9),
    GENERATE(10);


    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f69340;

    EnumC21592(int i) {
        this.f69340 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m48773(EnumC21592 enumC21592) {
        return this.f69340 > enumC21592.f69340;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC21592 m48771(EnumC21592 enumC21592, EnumC21592 enumC215922) {
        return enumC21592.f69340 > enumC215922.f69340 ? enumC21592 : enumC215922;
    }
}

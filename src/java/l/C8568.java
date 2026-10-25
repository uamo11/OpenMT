package l;

/* compiled from: A451 */
/* renamed from: l.ۡ֫۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8568 extends AbstractC9707 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22406 f26166;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8568(C22406 c22406) {
        super(c22406);
        this.f26166 = c22406;
    }

    @Override // l.AbstractC9707
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19585 mo22279(C19585 c19585) {
        if (!c19585.m45024() || !c19585.m45023(EnumC18879.STATIC)) {
            return c19585;
        }
        return C19585.m45021(new C1781(this.f26166, c19585.f63278, false));
    }

    @Override // l.AbstractC9707
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19585 mo22280(C19585 c19585, C19585 c195852) {
        if (!c19585.m45024() || c19585.m45023(EnumC18879.NON_STATIC)) {
            if (!c195852.m45024() || c195852.m45023(EnumC18879.STATIC)) {
                if (c19585.m45024() || c195852.m45024()) {
                    return C19585.m45021(new C1781(this.f26166, c19585.m45024() ? c19585.f63278 : c195852.f63278, true));
                }
                if (!c19585.m45022() || c195852.m45022()) {
                }
            }
            return c195852;
        }
        return c19585;
    }
}

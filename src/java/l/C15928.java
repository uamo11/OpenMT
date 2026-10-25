package l;

import java.math.BigInteger;

/* compiled from: D9KC */
/* renamed from: l.ܺ۫ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15928 extends AbstractC18772 {
    @Override // l.AbstractC18772
    /* renamed from: ֫ */
    public final int mo13606(AbstractC5366 abstractC5366) {
        BigInteger bigInteger;
        C2524 c2524 = (C2524) abstractC5366;
        if (c2524.f72265 == null) {
            bigInteger = c2524.f8011;
            c2524.f72265 = bigInteger.toByteArray();
        }
        return c2524.f72265.length;
    }

    @Override // l.AbstractC18772
    /* renamed from: ֫ */
    public final void mo13607(AbstractC5366 abstractC5366, C15948 c15948) {
        BigInteger bigInteger;
        C2524 c2524 = (C2524) abstractC5366;
        if (c2524.f72265 == null) {
            bigInteger = c2524.f8011;
            c2524.f72265 = bigInteger.toByteArray();
        }
        c15948.write(c2524.f72265);
    }
}

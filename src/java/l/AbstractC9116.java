package l;

import java.util.Random;

/* compiled from: PAX3 */
/* renamed from: l.ۡ᩶᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC9116 extends AbstractC19700 {
    /* renamed from: ᩳ */
    public abstract Random mo2661();

    @Override // l.AbstractC19700
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo23493() {
        return mo2661().nextInt();
    }

    @Override // l.AbstractC19700
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo23494() {
        return mo2661().nextInt(2147418112);
    }
}

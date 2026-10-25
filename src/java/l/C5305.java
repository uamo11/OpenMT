package l;

import java.util.HashMap;

/* compiled from: W7Q5 */
/* renamed from: l.ۚۧۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5305 extends C4356 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f16551;

    public C5305(C3691 c3691, char[] cArr, int i) {
        super(c3691, cArr, i);
        this.f16551 = new HashMap();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap m15223() {
        return this.f16551;
    }

    @Override // l.C4356
    /* renamed from: ֫ */
    public final InterfaceC5102 mo13064(int i, int i2, EnumC0162 enumC0162) {
        char[] m29585 = m29585(i, i2);
        InterfaceC5102 mo13064 = super.mo13064(i, i2, enumC0162);
        this.f16551.put(mo13064, new C1071(i, i2, new String(m29585)));
        return mo13064;
    }
}

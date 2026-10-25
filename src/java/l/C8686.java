package l;

import java.util.Iterator;

/* compiled from: M605 */
/* renamed from: l.ۡۛ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C8686 extends AbstractC22132 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f26466;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26467;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13848 f26468;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13848 f26469;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15740 f26470;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f26471;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8686(C15740 c15740, C12918 c12918, int i, InterfaceC13848 interfaceC13848, InterfaceC13848 interfaceC138482) {
        super(c12918, i);
        this.f26470 = c15740;
        this.f26469 = interfaceC13848;
        this.f26468 = interfaceC138482;
        this.f26471 = -1;
    }

    @Override // l.AbstractC22132
    /* renamed from: ֫ */
    public final Object mo7600(C18729 c18729) {
        int i;
        C16611 c16611;
        int i2;
        do {
            int i3 = this.f26467 + 1;
            this.f26467 = i3;
            C15740 c15740 = this.f26470;
            C7980 c7980 = c15740.f48567;
            i = c7980.f24641;
            if (i3 > i) {
                c7980.f24647 = c18729.m43364();
                m4715();
                return null;
            }
            Iterator it = c15740.f48566;
            c16611 = new C16611(c7980.f24648, c18729, c7980, this.f26466, this.f26469, this.f26468, it != null ? ((Integer) it.next()).intValue() : 7);
            i2 = c16611.f51037;
            this.f26466 = i2;
            if (!c15740.f48564) {
                break;
            }
        } while (this.f26471 == i2);
        this.f26471 = i2;
        return c16611;
    }
}

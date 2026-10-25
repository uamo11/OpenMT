package l;

import java.util.Iterator;

/* compiled from: M605 */
/* renamed from: l.᩻ۛ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C23502 extends AbstractC22132 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f75448;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f75449;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC15781 f75450;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13848 f75451;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6569 f75452;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f75453;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23502(C6569 c6569, C12918 c12918, int i, AbstractC15781 abstractC15781, InterfaceC13848 interfaceC13848) {
        super(c12918, i);
        this.f75452 = c6569;
        this.f75450 = abstractC15781;
        this.f75451 = interfaceC13848;
        this.f75448 = -1;
    }

    @Override // l.AbstractC22132
    /* renamed from: ֫ */
    public final Object mo7600(C18729 c18729) {
        int i;
        C10097 c10097;
        int i2;
        do {
            int i3 = this.f75449 + 1;
            this.f75449 = i3;
            C6569 c6569 = this.f75452;
            C7980 c7980 = c6569.f20269;
            i = c7980.f24642;
            if (i3 > i) {
                c7980.f24643 = c18729.m43364();
                m4715();
                return null;
            }
            Iterator it = c6569.f20268;
            c10097 = new C10097(c7980.f24648, c18729, c7980, this.f75453, this.f75450, this.f75451, it != null ? ((Integer) it.next()).intValue() : 7);
            i2 = c10097.f30402;
            this.f75453 = i2;
            if (!c6569.f20267) {
                break;
            }
        } while (this.f75448 == i2);
        this.f75448 = i2;
        return c10097;
    }
}

package l;

import java.util.Iterator;

/* compiled from: M605 */
/* renamed from: l.᩷ۛ֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20681 extends AbstractC22132 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f66636;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f66637;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13848 f66638;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9392 f66639;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f66640;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20681(C9392 c9392, C12918 c12918, int i, InterfaceC13848 interfaceC13848) {
        super(c12918, i);
        this.f66639 = c9392;
        this.f66638 = interfaceC13848;
        this.f66636 = -1;
    }

    @Override // l.AbstractC22132
    /* renamed from: ֫ */
    public final Object mo7600(C18729 c18729) {
        int i;
        C10097 c10097;
        int i2;
        do {
            int i3 = this.f66637 + 1;
            this.f66637 = i3;
            C9392 c9392 = this.f66639;
            C7980 c7980 = c9392.f28523;
            i = c7980.f24645;
            if (i3 > i) {
                c7980.f24640 = c18729.m43364();
                m4715();
                return null;
            }
            Iterator it = c9392.f28521;
            c10097 = new C10097(c7980.f24648, c18729, c7980, this.f66640, this.f66638, it != null ? ((Integer) it.next()).intValue() : 7);
            i2 = c10097.f30402;
            this.f66640 = i2;
            if (!c9392.f28520) {
                break;
            }
        } while (this.f66636 == i2);
        this.f66636 = i2;
        return c10097;
    }
}

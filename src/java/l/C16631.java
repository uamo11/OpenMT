package l;

import java.util.List;

/* compiled from: S515 */
/* renamed from: l.ܽ۫֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C16631 extends AbstractC9597 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17337 f51072;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC13828 f51073;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17337 f51074;

    public C16631(C17337 c17337, C17337 c173372, AbstractC13828 abstractC13828) {
        this.f51074 = c17337;
        this.f51072 = c173372;
        this.f51073 = abstractC13828;
    }

    public C16631(C17337 c17337, C17337 c173372, C17337 c173373) {
        this.f51074 = c17337;
        this.f51072 = c173372;
        this.f51073 = new C23001(c173373);
    }

    public C16631(C17337 c17337, C17337 c173372, InterfaceC21699 interfaceC21699, C17337 c173373) {
        AbstractC13828 c11713;
        this.f51074 = c17337;
        this.f51072 = c173372;
        if (interfaceC21699 != null) {
            c11713 = new C11713(c173373, interfaceC21699);
        } else {
            c11713 = new C23001(c173373);
        }
        this.f51073 = c11713;
    }

    @Override // l.InterfaceC5038
    /* renamed from: ֫ */
    public final int mo14555() {
        return this.f51074.m40667().f49185;
    }

    @Override // l.InterfaceC5038
    /* renamed from: ܽ */
    public final int mo14557() {
        return this.f51072.m40667().f49185 - this.f51074.m40667().f49185;
    }

    @Override // l.InterfaceC5038
    /* renamed from: ۧ */
    public final List mo14556() {
        return AbstractC14545.of((Object) this.f51073);
    }
}

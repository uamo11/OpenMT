package l;

/* compiled from: H4Y9 */
/* renamed from: l.ۜۡ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6653 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC17236 f20630;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC13728 f20631;

    public C6653(InterfaceC14413 interfaceC14413, EnumC13728 enumC13728) {
        C11233.m27805(enumC13728, "initialState");
        C11233.m27799(interfaceC14413);
        this.f20630 = C15824.m37455(interfaceC14413);
        this.f20631 = enumC13728;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC13728 m18172() {
        return this.f20631;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18173(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        EnumC13728 m50989 = enumC22901.m50989();
        EnumC13728 enumC13728 = this.f20631;
        C11233.m27805(enumC13728, "state1");
        if (m50989 != null && m50989.compareTo(enumC13728) < 0) {
            enumC13728 = m50989;
        }
        this.f20631 = enumC13728;
        this.f20630.mo2195(interfaceC23586, enumC22901);
        this.f20631 = m50989;
    }
}

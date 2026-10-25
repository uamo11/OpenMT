package l;

import bin.mt.json.JSON;
import bin.mt.json.JSONArray;

/* compiled from: D6X3 */
/* renamed from: l.᩻ۖۜ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23404 implements InterfaceC2944 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12821 f75163;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7383 f75164;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f75165;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19172 f75166;

    public C23404(C12821 c12821, InterfaceC19172 interfaceC19172, String str, C7383 c7383) {
        this.f75163 = c12821;
        this.f75166 = interfaceC19172;
        this.f75165 = str;
        this.f75164 = c7383;
    }

    @Override // l.InterfaceC2944
    /* renamed from: ֫ */
    public final C5060 mo8967(AbstractC15440 abstractC15440) {
        C12619 m31154;
        this.f75166.mo10516(abstractC15440);
        m31154 = this.f75163.m31154(abstractC15440.mo23558());
        String str = this.f75164.f22729;
        JSONArray array = JSON.array();
        String str2 = this.f75165;
        C12821.m31182(str2, m31154, str, array);
        if (m31154.m30884() < 0 || m31154.m30884() > 9007199254740991L) {
            throw C12821.m31145(JSON.array(), "The prepared file size exceeds the supported JSON integer range.", str2, str, "produce_temp");
        }
        return new C5060(m31154.m30884(), null);
    }

    @Override // l.InterfaceC2944
    /* renamed from: ֫ */
    public final void mo8968(C7383 c7383) {
        this.f75166.mo10515(c7383);
    }
}

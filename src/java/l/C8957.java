package l;

/* compiled from: XBIX */
/* renamed from: l.ۡܶۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C8957 extends EnumC19541 {
    public /* synthetic */ C8957() {
        this("CdataSection", 66);
    }

    public C8957(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC19541
    /* renamed from: ֫ */
    public void mo1032(C19129 c19129, C17842 c17842) {
        c19129.f60299.append(c17842.m41789());
        if (c17842.m41796("]]>") || c17842.m41785()) {
            String sb = c19129.f60299.toString();
            C17717 c17717 = new C17717();
            c17717.m39894(sb);
            c19129.m44166(c17717);
            c19129.m44177(EnumC19541.f63120);
        }
    }
}

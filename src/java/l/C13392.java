package l;

/* compiled from: C92A */
/* renamed from: l.۬᩸᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13392 extends C20844 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C13392 f40017 = new C13392();

    @Override // l.C20844
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 mo32387(InterfaceC17889 interfaceC17889) {
        int indexOf;
        AbstractC15440 mo24433 = interfaceC17889.mo24433();
        String mo23554 = mo24433.mo23554();
        return (!mo23554.startsWith("/data/media/") || (indexOf = mo23554.indexOf(47, 12) + 1) == 0) ? mo24433 : C16293.f50120.m36526(mo23554.substring(indexOf));
    }
}

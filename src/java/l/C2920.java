package l;

/* compiled from: 17QI */
/* renamed from: l.ۗ֫ۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2920 implements InterfaceC18842 {
    @Override // l.InterfaceC18842
    public final boolean apply(Object obj) {
        InterfaceC20058 interfaceC20058 = (InterfaceC20058) obj;
        if (!(interfaceC20058 instanceof InterfaceC17440)) {
            return false;
        }
        InterfaceC14812 m9808 = C3188.m9808((InterfaceC17440) interfaceC20058);
        InterfaceC17664 of = C16958.of((Object[]) new String[]{"stream", "parallelStream", "toBuilder"});
        C11003.requireNonNull(m9808);
        return of.anyMatch(new C18984(1, m9808));
    }
}

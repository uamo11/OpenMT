package l;

import java.util.Collection;
import java.util.List;

/* compiled from: 95UO */
/* renamed from: l.ۗ᩷ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3480 extends C16885 implements InterfaceC22821 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f11028;

    @Override // l.InterfaceC22821
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo10659(Object obj) {
        return ((C12652) obj).f38108;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final List m10660(Object obj) {
        return ((C12652) obj).f38107;
    }

    public C3480(C19357 c19357) {
        super(c19357);
        this.f11028 = new ConcurrentMapC10942();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12652 m10658(AbstractC8185 abstractC8185) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f11028;
        C12652 c12652 = (C12652) concurrentMapC10942.get(abstractC8185);
        if (c12652 != null) {
            return c12652;
        }
        C12652 c126522 = (C12652) this.f51819.m44610(abstractC8185);
        C12652 c126523 = (C12652) concurrentMapC10942.putIfAbsent(c126522, c126522);
        return c126523 == null ? c126522 : c126523;
    }

    @Override // l.InterfaceC22821
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection mo10657() {
        return new C4891(this.f11028.values());
    }
}

package l;

import java.util.Collection;

/* compiled from: V5J6 */
/* renamed from: l.ܳۡۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14416 extends C16885 implements InterfaceC11242 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f44187;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m34446(InterfaceC21699 interfaceC21699) {
        return ((C23589) interfaceC21699).f76474;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C7382 m34447(CharSequence charSequence) {
        return ((C23589) charSequence).f76475;
    }

    @Override // l.InterfaceC4477
    /* renamed from: ܳ */
    public final int mo8575(Object obj) {
        return ((C23589) obj).f76474;
    }

    @Override // l.InterfaceC5888
    /* renamed from: ܽ */
    public final int mo16505(Object obj) {
        C23589 c23589 = (C23589) obj;
        if (c23589 == null) {
            return -1;
        }
        return c23589.f76474;
    }

    public C14416(C19357 c19357) {
        super(c19357);
        this.f44187 = new ConcurrentMapC10942();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23589 m34448(String str) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f44187;
        C23589 c23589 = (C23589) concurrentMapC10942.get(str);
        if (c23589 != null) {
            return c23589;
        }
        C23589 c235892 = new C23589(((C13731) this.f51819.f68948).m33032(str));
        C23589 c235893 = (C23589) concurrentMapC10942.putIfAbsent(str, c235892);
        return c235893 == null ? c235892 : c235893;
    }

    @Override // l.InterfaceC4477
    /* renamed from: ֫ */
    public final Collection mo8571() {
        return new C17239(this.f44187.values());
    }

    @Override // l.InterfaceC4477
    public final int getItemCount() {
        return this.f44187.size();
    }
}

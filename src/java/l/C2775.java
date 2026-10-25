package l;

import java.util.Collection;

/* compiled from: C5E9 */
/* renamed from: l.ۖ᩷ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C2775 extends C16885 implements InterfaceC20706 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f8645;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f8646;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12652 m8572(InterfaceC4060 interfaceC4060) {
        return ((C4186) interfaceC4060).f13638;
    }

    @Override // l.InterfaceC4477
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int mo8575(Object obj) {
        return ((C4186) obj).f13639;
    }

    public C2775(C19357 c19357) {
        super(c19357);
        this.f8646 = new ConcurrentMapC10942();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4186 m8574(InterfaceC4060 interfaceC4060) {
        ConcurrentMapC10942 concurrentMapC10942 = this.f8646;
        C4186 c4186 = (C4186) concurrentMapC10942.get(interfaceC4060);
        if (c4186 != null) {
            return c4186;
        }
        C4186 c41862 = new C4186(interfaceC4060.getName(), this.f51819.f68950.m10658((AbstractC8185) C12300.m29842(interfaceC4060)));
        C4186 c41863 = (C4186) concurrentMapC10942.putIfAbsent(c41862, c41862);
        return c41863 == null ? c41862 : c41863;
    }

    @Override // l.InterfaceC4477
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection mo8571() {
        return new C16179(this.f8646.values());
    }

    @Override // l.InterfaceC4477
    public final int getItemCount() {
        return this.f8646.size();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m8576() {
        return this.f8645 + this.f8646.size();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m8573(int i) {
        this.f8645 = i;
    }
}

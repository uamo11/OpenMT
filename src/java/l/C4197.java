package l;

import java.util.function.Consumer;

/* compiled from: WKX */
/* renamed from: l.ۘ᩷ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4197 extends AbstractC16190 implements InterfaceC12063, InterfaceC12433 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19720 f13661;

    @Override // l.AbstractC16190
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12660(int i, Object obj) {
        ((Consumer) obj).accept(this.f13661.f63739[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4197(C19720 c19720) {
        super(c19720);
        this.f13661 = c19720;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f13661.f63739[m38125()];
    }
}

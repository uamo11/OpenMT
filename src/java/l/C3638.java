package l;

import java.util.function.Consumer;

/* compiled from: 97L */
/* renamed from: l.ۘ֫ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3638 extends AbstractC15631 implements InterfaceC12063, InterfaceC12433 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19161 f11491;

    @Override // l.AbstractC15631
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo11128(int i, Object obj) {
        ((Consumer) obj).accept(this.f11491.f60386[i]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3638(C19161 c19161) {
        super(c19161);
        this.f11491 = c19161;
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f11491.f60386[m36829()];
    }
}

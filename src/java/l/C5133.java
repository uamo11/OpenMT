package l;

import java.util.Iterator;

/* compiled from: NAWS */
/* renamed from: l.ۚۙ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5133 implements InterfaceC14304 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC14304 f16072;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC16876 f16073;

    /* JADX WARN: Multi-variable type inference failed */
    public C5133(InterfaceC14304 interfaceC14304, InterfaceC16233 interfaceC16233) {
        this.f16072 = interfaceC14304;
        this.f16073 = (AbstractC16876) interfaceC16233;
    }

    @Override // l.InterfaceC14304
    public final Iterator iterator() {
        return new C0193(this);
    }
}

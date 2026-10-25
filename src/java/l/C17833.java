package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: NAWS */
/* renamed from: l.ᩳۙ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17833 implements Iterator {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17127 f54480;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f54481;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f54482 = -2;

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public C17833(C17127 c17127) {
        this.f54480 = c17127;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m41766() {
        InterfaceC16233 interfaceC16233;
        Object invoke;
        InterfaceC2123 interfaceC2123;
        int i = this.f54482;
        C17127 c17127 = this.f54480;
        if (i == -2) {
            interfaceC2123 = c17127.f52475;
            invoke = ((C15715) interfaceC2123).f48466;
        } else {
            interfaceC16233 = c17127.f52476;
            Object obj = this.f54481;
            C11233.m27799(obj);
            invoke = interfaceC16233.invoke(obj);
        }
        this.f54481 = invoke;
        this.f54482 = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f54482 < 0) {
            m41766();
        }
        if (this.f54482 == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f54481;
        C11233.m27800(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f54482 = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f54482 < 0) {
            m41766();
        }
        return this.f54482 == 1;
    }
}

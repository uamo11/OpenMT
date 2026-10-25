package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: SATH */
/* renamed from: l.ܳۧᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14489 {
    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34588(InterfaceC23662 interfaceC23662, int i) {
        interfaceC23662.mo18328(C2837.m8732(i));
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34589(InterfaceC23662 interfaceC23662, Character ch) {
        interfaceC23662.mo18328(ch.charValue());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC23662 m34587(InterfaceC23662 interfaceC23662, final IntConsumer intConsumer) {
        InterfaceC23662 interfaceC236622;
        if (intConsumer instanceof InterfaceC23662) {
            interfaceC236622 = (InterfaceC23662) intConsumer;
        } else {
            C11003.requireNonNull(intConsumer);
            interfaceC236622 = new InterfaceC23662() { // from class: l.ᩳۧᩴ
                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    C14489.m34588(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    mo18326((Character) obj);
                }

                @Override // l.InterfaceC23662
                /* renamed from: ۧ */
                public final /* synthetic */ void mo18326(Character ch) {
                    C14489.m34589((InterfaceC23662) this, ch);
                }

                @Override // l.InterfaceC23662
                /* renamed from: ܽ */
                public final void mo18328(char c) {
                    IntConsumer.this.accept(c);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return C14489.m34587((InterfaceC23662) this, intConsumer2);
                }

                @Override // l.InterfaceC23662
                /* renamed from: ܽ */
                public final C17312 mo18327(InterfaceC23662 interfaceC236623) {
                    return new C17312(this, interfaceC236623);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC23662.mo18327(interfaceC236622);
    }
}

package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: QATC */
/* renamed from: l.᩹᩺ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C22592 {
    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50566(InterfaceC20476 interfaceC20476, int i) {
        interfaceC20476.mo14392(C2837.m8729(i));
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50567(InterfaceC20476 interfaceC20476, Byte b) {
        interfaceC20476.mo14392(b.byteValue());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC20476 m50565(InterfaceC20476 interfaceC20476, final IntConsumer intConsumer) {
        InterfaceC20476 interfaceC204762;
        if (intConsumer instanceof InterfaceC20476) {
            interfaceC204762 = (InterfaceC20476) intConsumer;
        } else {
            C11003.requireNonNull(intConsumer);
            interfaceC204762 = new InterfaceC20476() { // from class: l.ܶ᩺ۘ
                @Override // java.util.function.IntConsumer
                public final /* synthetic */ void accept(int i) {
                    C22592.m50566(this, i);
                }

                @Override // java.util.function.Consumer
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    mo14393((Byte) obj);
                }

                @Override // l.InterfaceC20476
                /* renamed from: ֫ */
                public final void mo14392(byte b) {
                    IntConsumer.this.accept(b);
                }

                @Override // l.InterfaceC20476
                /* renamed from: ֫ */
                public final /* synthetic */ void mo14393(Byte b) {
                    C22592.m50567((InterfaceC20476) this, b);
                }

                public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer2) {
                    return C22592.m50565((InterfaceC20476) this, intConsumer2);
                }

                @Override // l.InterfaceC20476
                /* renamed from: ֫ */
                public final C21887 mo14391(InterfaceC20476 interfaceC204763) {
                    return new C21887(this, interfaceC204763);
                }

                public final Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            };
        }
        return interfaceC20476.mo14391(interfaceC204762);
    }
}

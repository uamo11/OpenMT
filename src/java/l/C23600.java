package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: Q1QN */
/* renamed from: l.᩻ۡᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final /* synthetic */ class C23600 {
    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Integer m52076(InterfaceC6667 interfaceC6667) {
        return Integer.valueOf(interfaceC6667.nextInt());
    }

    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m52077(InterfaceC6667 interfaceC6667, Consumer consumer) {
        IntConsumer c3294;
        if (consumer instanceof IntConsumer) {
            c3294 = (IntConsumer) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c3294 = new C3294(1, consumer);
        }
        interfaceC6667.forEachRemaining(c3294);
    }
}

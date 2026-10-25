package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: GBZW */
/* renamed from: l.ܳۘᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C14282 {
    @Deprecated
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34066(InterfaceC23455 interfaceC23455, Consumer consumer) {
        LongConsumer c17811;
        if (consumer instanceof LongConsumer) {
            c17811 = (LongConsumer) consumer;
        } else {
            C11003.requireNonNull(consumer);
            c17811 = new C17811(consumer);
        }
        interfaceC23455.forEachRemaining(c17811);
    }
}

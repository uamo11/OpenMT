package l;

import java.util.function.IntConsumer;

/* compiled from: N673 */
/* renamed from: l.ۢۛᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C9407 {
    public static IntConsumer $default$andThen(final IntConsumer intConsumer, final IntConsumer intConsumer2) {
        C11003.requireNonNull(intConsumer2);
        return new IntConsumer() { // from class: l.᩹ۛᩴ
            public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer3) {
                return C9407.$default$andThen(this, intConsumer3);
            }

            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                IntConsumer.this.accept(i);
                intConsumer2.accept(i);
            }
        };
    }
}

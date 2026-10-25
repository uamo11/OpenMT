package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: VCBM */
/* renamed from: l.ᩳۘᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final /* synthetic */ class C17811 implements LongConsumer {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Consumer f54450;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f54450.accept(Long.valueOf(j));
    }

    public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C2351.$default$andThen(this, longConsumer);
    }
}

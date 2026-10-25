package l;

import java.util.function.Consumer;

/* compiled from: F1FR */
/* renamed from: l.۠᩺᩷, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final /* synthetic */ class C8494 implements Consumer {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4966 f25956;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f25957;

    public /* synthetic */ C8494(C4966 c4966, boolean z) {
        this.f25956 = c4966;
        this.f25957 = z;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void n(Object obj) {
        C4966.m14416(this.f25956, this.f25957, (ActivityC17169) obj);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}

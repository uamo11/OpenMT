package l;

import java.util.function.Consumer;

/* compiled from: 3B3L */
/* renamed from: l.ܺ֨ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class C15609 implements Consumer {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9344 f48073;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36791(boolean z) {
        this.f48073.m24133(z);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        m36791(((Boolean) obj).booleanValue());
    }

    public final Consumer andThen(Consumer consumer) {
        return C23517.$default$andThen(this, consumer);
    }
}

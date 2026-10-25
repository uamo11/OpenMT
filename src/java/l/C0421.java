package l;

import java.util.function.IntConsumer;

/* compiled from: Y6Y9 */
/* renamed from: l.֡۫᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0421 implements IntConsumer {
    public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C9407.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int m48482 = C21404.m48482(i);
        InterfaceC13049 edit = ApplicationC20075.f65008.edit();
        if (m48482 == 0) {
            edit.remove("amfbc");
        } else {
            edit.mo25853(m48482, "amfbc");
        }
        edit.apply();
        ServiceC19288.m44482();
    }
}

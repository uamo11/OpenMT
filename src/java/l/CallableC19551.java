package l;

import java.util.concurrent.Callable;

/* compiled from: 3B3L */
/* renamed from: l.᩵ܶᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class CallableC19551 implements Callable {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C15315 f63213;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C18845 c18845;
        C19656 c19656;
        C19677 c19677;
        FutureC3575 m10905;
        C19677 c196772;
        C18845 c188452;
        C19656 c196562;
        C22372 c22372 = this.f63213.f46970;
        if (c22372.f72503 && c22372.f72517 != null) {
            return new C21667(true, null);
        }
        InterfaceC20758 m25230 = C10050.m25230(c22372.m5412(), C6646.of(C17852.m41819().mo23554(), new String[0]));
        if (!C20529.m47015(m25230)) {
            return new C21667(false, null);
        }
        c18845 = c22372.f72501;
        if (c18845 != null) {
            throw new IllegalStateException("Inactive session save is already running");
        }
        c19656 = c22372.f72511;
        if (c19656 != null) {
            c196562 = c22372.f72511;
            m10905 = c196562.m45186();
        } else {
            c19677 = c22372.f72497;
            if (c19677 != null) {
                c196772 = c22372.f72497;
                m10905 = c196772.m45254().m10911((InterfaceC15071) new C17021());
            } else {
                m10905 = FutureC3575.m10905(null);
            }
        }
        c22372.f72501 = new C18845(m25230, m10905);
        c188452 = c22372.f72501;
        return new C21667(false, c188452);
    }
}

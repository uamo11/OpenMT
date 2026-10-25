package l;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: B8P4 */
/* renamed from: l.ۘ᩷ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4191 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2780 f13645;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f13646 = new AtomicBoolean(false);

    public C4191(InterfaceC2780 interfaceC2780) {
        this.f13645 = interfaceC2780;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1368 m12640(Object... objArr) {
        Constructor mo8584;
        synchronized (this.f13646) {
            if (!this.f13646.get()) {
                try {
                    mo8584 = this.f13645.mo8584();
                } catch (ClassNotFoundException unused) {
                    this.f13646.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            mo8584 = null;
        }
        if (mo8584 == null) {
            return null;
        }
        try {
            return (InterfaceC1368) mo8584.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}

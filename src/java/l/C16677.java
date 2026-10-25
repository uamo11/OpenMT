package l;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: K6MS */
/* renamed from: l.ܽܰۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16677 implements AutoCloseable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f51187;

    public C16677(AbstractC13921 abstractC13921) {
        AbstractC13921 m28856 = C11806.m28856(abstractC13921.m33350(), false);
        this.f51187 = m28856;
        try {
            m28856.mo7646(false);
        } catch (IOException | Error | RuntimeException e) {
            close();
            throw e;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Object obj = this.f51187;
        if (obj instanceof Closeable) {
            ((Closeable) obj).close();
        }
    }
}

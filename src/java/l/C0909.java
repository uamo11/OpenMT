package l;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: B75R */
/* renamed from: l.֨ۚۜ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0909 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13547 f3485;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f3486 = new ArrayList(2);

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Throwable f3487;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3265(Throwable th) {
        Throwable th2 = this.f3487;
        if (th2 == null) {
            this.f3487 = th;
        } else if (th2 != th) {
            th2.addSuppressed(th);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Throwable m3264(boolean z) {
        Throwable m13165;
        ArrayList arrayList = this.f3486;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            m13165 = C4437.m13165(th, Error.class);
            Error error = (Error) m13165;
            if (error != null) {
                m3263(error);
                return error;
            }
            if (C4437.m13180(th)) {
                m3263(th);
                return th;
            }
        }
        Throwable th2 = this.f3487;
        if (th2 != null) {
            m3263(th2);
            return th2;
        }
        if (z || arrayList.isEmpty()) {
            return null;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        m3263(th3);
        return th3;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m3263(Throwable th) {
        Throwable th2 = this.f3487;
        if (th2 != null && th2 != th) {
            th.addSuppressed(th2);
        }
        Iterator it = this.f3486.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            if (th3 != th) {
                th.addSuppressed(th3);
            }
        }
    }
}

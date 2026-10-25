package l;

import java.io.Serializable;

/* compiled from: LAXL */
/* renamed from: l.ۖ۠᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2414 implements Serializable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Throwable f7690;

    public C2414(Throwable th) {
        C11233.m27805(th, "exception");
        this.f7690 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2414) {
            return C11233.m27802(this.f7690, ((C2414) obj).f7690);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7690.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f7690 + ')';
    }
}

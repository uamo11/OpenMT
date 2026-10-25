package l;

import java.io.Serializable;

/* compiled from: V656 */
/* renamed from: l.ۡ۬ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8902 implements Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC9608 f27073;

    public C8902(AbstractC9608 abstractC9608) {
        this.f27073 = abstractC9608;
    }

    public Object readResolve() {
        return this.f27073.entrySet();
    }
}

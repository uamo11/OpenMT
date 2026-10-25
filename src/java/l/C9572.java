package l;

import java.util.Set;

/* compiled from: N673 */
/* renamed from: l.ۢۨᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9572 extends C22811 implements Set, InterfaceC8886 {
    public static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            equals = this.a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int hashCode;
        synchronized (this.b) {
            hashCode = this.a.hashCode();
        }
        return hashCode;
    }
}

package l;

import java.io.Serializable;

/* compiled from: 367O */
/* renamed from: l.᩷᩷֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21115 implements Serializable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object f68104;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Object f68105;

    public C21115(Object obj, Object obj2) {
        this.f68104 = obj;
        this.f68105 = obj2;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        boolean equals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21115)) {
            return false;
        }
        C21115 c21115 = (C21115) obj;
        Object obj2 = c21115.f68104;
        Object obj3 = this.f68104;
        if (obj3 == null) {
            equals = obj2 == null;
        } else {
            equals = obj3.equals(obj2);
        }
        if (equals) {
            Object obj4 = c21115.f68105;
            Object obj5 = this.f68105;
            if (obj5 == null) {
                equals2 = obj4 == null;
            } else {
                equals2 = obj5.equals(obj4);
            }
            if (equals2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2093.m6873(C2093.m6874(C2093.m6874(0, this.f68104), this.f68105), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.f68104, this.f68105);
    }
}

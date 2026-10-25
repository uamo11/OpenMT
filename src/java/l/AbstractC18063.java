package l;

import java.util.Comparator;

/* compiled from: 857M */
/* renamed from: l.ᩳ۬֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC18063 implements InterfaceC20561 {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Comparator f56276 = new C16651();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        InterfaceC20561 interfaceC20561 = (InterfaceC20561) obj;
        int compare = Integer.compare(getVisibility(), interfaceC20561.getVisibility());
        if (compare != 0) {
            return compare;
        }
        int compareTo = getType().compareTo(interfaceC20561.getType());
        return compareTo != 0 ? compareTo : C8377.m21972(getElements(), interfaceC20561.getElements());
    }

    public final int hashCode() {
        return getElements().hashCode() + ((getType().hashCode() + (getVisibility() * 31)) * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC20561)) {
            return false;
        }
        InterfaceC20561 interfaceC20561 = (InterfaceC20561) obj;
        return getVisibility() == interfaceC20561.getVisibility() && getType().equals(interfaceC20561.getType()) && getElements().equals(interfaceC20561.getElements());
    }
}

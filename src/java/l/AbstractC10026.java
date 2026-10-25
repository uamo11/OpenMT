package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;

/* compiled from: M5U2 */
/* renamed from: l.ۤۗܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC10026 extends AbstractC9608 implements InterfaceC2306, InterfaceC1830 {
    public static final long serialVersionUID = 912559;

    @Override // l.InterfaceC2306
    /* renamed from: ᩳ */
    public abstract AbstractC10026 mo7567();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C12847 m25201() {
        return new C12847(4);
    }

    @Override // l.AbstractC9608, java.util.Map
    public final Collection values() {
        return mo7567().keySet();
    }

    @Override // l.AbstractC9608, java.util.Map
    public final AbstractC22725 values() {
        return mo7567().keySet();
    }

    @Override // l.AbstractC9608
    /* renamed from: ܽ */
    public final AbstractC22725 mo18095() {
        throw new AssertionError("should never be called");
    }

    @Override // l.AbstractC9608
    public Object writeReplace() {
        return new C12142(this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
}

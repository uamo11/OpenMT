package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: 84M0 */
/* renamed from: l.ۤۤܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC10232 implements Comparator {
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC10232 m25861() {
        return C13053.f39070;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC10232 m25862(Comparator comparator) {
        if (comparator instanceof AbstractC10232) {
            return (AbstractC10232) comparator;
        }
        return new C17080(comparator);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC10232 m25863() {
        return C3217.f10117;
    }

    /* renamed from: ֫ */
    public AbstractC10232 mo22482() {
        return new C15751(this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10232 m25866(InterfaceC16724 interfaceC16724) {
        return new C18534(interfaceC16724, this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10232 m25865(Comparator comparator) {
        return new C20609(this, comparator);
    }

    /* renamed from: ֫ */
    public Object mo22481(Object obj, Object obj2) {
        return compare(obj, obj2) <= 0 ? obj : obj2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m25864(ArrayList arrayList) {
        Object[] m22958 = C8882.m22958(arrayList);
        Arrays.sort(m22958, this);
        return new ArrayList(Arrays.asList(m22958));
    }
}

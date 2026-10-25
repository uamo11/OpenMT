package l;

import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: I5ZF */
/* renamed from: l.ܶ۠۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15102 implements Iterator {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f46188;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f46189;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterator f46190;

    public C15102(Iterator it, Predicate predicate) {
        Object obj;
        this.f46190 = it;
        this.f46188 = predicate;
        while (true) {
            C21454 c21454 = (C21454) it;
            if (!c21454.hasNext()) {
                obj = null;
                break;
            } else {
                obj = c21454.next();
                if (this.f46188.test(obj)) {
                    break;
                }
            }
        }
        this.f46189 = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f46189 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        Object obj2 = this.f46189;
        while (true) {
            C21454 c21454 = (C21454) this.f46190;
            if (!c21454.hasNext()) {
                obj = null;
                break;
            }
            obj = c21454.next();
            if (this.f46188.test(obj)) {
                break;
            }
        }
        this.f46189 = obj;
        return obj2;
    }
}

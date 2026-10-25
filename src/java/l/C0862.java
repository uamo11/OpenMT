package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: P7M1 */
/* renamed from: l.֨ۘ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0862 implements Iterator {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7814 f3348;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Iterable f3349;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Set f3350;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f3351;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Iterator f3352;

    public C0862(Iterable iterable, C7814 c7814, Set set) {
        this.f3349 = iterable;
        this.f3348 = c7814;
        this.f3350 = set;
        this.f3352 = iterable.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f3351 == null) {
            while (true) {
                Iterator it = this.f3352;
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC18278 interfaceC18278 = (InterfaceC18278) it.next();
                if (interfaceC18278.mo21321() != EnumC16866.CLASS && interfaceC18278.mo21321() != EnumC16866.SOURCE) {
                    this.f3348.f17563 |= 4503599627370496L;
                }
                if (this.f3350.contains(interfaceC18278.mo21321())) {
                    this.f3351 = interfaceC18278;
                    break;
                }
            }
        }
        return this.f3351 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        InterfaceC18278 interfaceC18278 = this.f3351;
        this.f3351 = null;
        return interfaceC18278;
    }
}

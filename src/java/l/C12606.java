package l;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

/* compiled from: R450 */
/* renamed from: l.۫᩵֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12606 implements Iterator {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Predicate f38007;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ EnumC1317 f38008;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10490 f38009;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C14722 f38010;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f38011;

    public C12606(C10490 c10490, AbstractC10370 abstractC10370, Predicate predicate, EnumC1317 enumC1317) {
        this.f38009 = c10490;
        this.f38007 = predicate;
        this.f38008 = enumC1317;
        C14722 m26378 = c10490.m26378(abstractC10370, predicate);
        this.f38010 = m26378;
        C10490 c104902 = m26378.f44962;
        this.f38011 = c104902 != null ? c104902.f31473 : -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C14722 c14722 = this.f38010;
        C10490 c10490 = c14722.f44962;
        if (c10490 != null && this.f38011 != c10490.f31473 && !c10490.mo20482(c14722.f44963)) {
            this.f38010 = this.f38010.m35029(this.f38007);
        }
        C10490 c104902 = this.f38010.f44962;
        if (c104902 != null) {
            return this.f38008 == EnumC1317.RECURSIVE || c104902 == this.f38009;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C14722 c14722 = this.f38010;
        this.f38010 = c14722.m35029(this.f38007);
        return c14722.f44963;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

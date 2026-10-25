package l;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: R9DK */
/* renamed from: l.ᩳ۫ۖ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18046 extends AbstractC5366 implements Iterable {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashSet f56242;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f56243;

    public C18046() {
        throw null;
    }

    public C18046(HashSet hashSet, byte[] bArr) {
        super(AbstractC11716.f34967);
        this.f56242 = hashSet;
        this.f56243 = bArr;
    }

    @Override // l.AbstractC5366
    public final Object getValue() {
        return new HashSet(this.f56242);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new HashSet(this.f56242).iterator();
    }
}

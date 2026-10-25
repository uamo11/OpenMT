package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: I5ZF */
/* renamed from: l.֨۫ܺ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public enum EnumC1120 implements Iterator {
    INSTANCE;

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        C4025.m12115("no calls to next() since the last call to remove()", false);
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }
}

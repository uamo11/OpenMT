package l;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* compiled from: K60O */
/* renamed from: l.᩸۟֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC21427 implements ListIterator {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f68993;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f68994;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f68995;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C12918 f68996;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f68997;

    /* renamed from: ֫ */
    public abstract Object mo1467(C18729 c18729, int i);

    public AbstractC21427(C12918 c12918, int i, int i2) {
        this.f68996 = c12918;
        this.f68993 = i;
        this.f68995 = i;
        this.f68994 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m48544() {
        return this.f68995;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f68997 < this.f68994;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public Object next() {
        if (this.f68997 >= this.f68994) {
            throw new NoSuchElementException();
        }
        C18729 m11939 = this.f68996.m31418().m11939(this.f68995);
        int i = this.f68997;
        this.f68997 = i + 1;
        Object mo1467 = mo1467(m11939, i);
        this.f68995 = m11939.m43364();
        m11939.m43359();
        return mo1467;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f68997 > 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f68997 - 1;
        C18729 m11939 = this.f68996.m31418().m11939(this.f68993);
        this.f68997 = 0;
        while (true) {
            int i2 = this.f68997;
            if (i2 < i) {
                this.f68997 = i2 + 1;
                mo1467(m11939, i2);
            } else {
                this.f68997 = i2 + 1;
                Object mo1467 = mo1467(m11939, i2);
                this.f68995 = m11939.m43364();
                m11939.m43359();
                return mo1467;
            }
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f68997;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f68997 - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }
}

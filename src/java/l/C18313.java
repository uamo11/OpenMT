package l;

import java.util.Iterator;

/* compiled from: F67X */
/* renamed from: l.ᩳ᩸֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18313 implements Iterator {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17607 f56940;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f56941;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f56939 = 0;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f56938 = 0;

    @Override // java.util.Iterator
    public final void remove() {
    }

    public C18313(C14784 c14784) {
        byte[] bArr;
        this.f56941 = c14784.m35170();
        bArr = c14784.f45157;
        this.f56940 = new C17607(bArr, c14784.m35171());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f56939 < this.f56941;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f56938;
        C17607 c17607 = this.f56940;
        c17607.f53796 = i;
        this.f56938 = i + c17607.f53797;
        this.f56939++;
        return c17607;
    }
}

package l;

import java.util.Iterator;

/* compiled from: 04TC */
/* renamed from: l.ۨ᩹֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11984 implements Iterator {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14099 f35873;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f35874;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f35875 = 0;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23272 f35876 = new C23272();

    @Override // java.util.Iterator
    public final void remove() {
    }

    public C11984(C14099 c14099) {
        this.f35873 = c14099;
        this.f35874 = c14099.m33711();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f35875 < this.f35874;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int[] iArr;
        int[] iArr2;
        C14099 c14099 = this.f35873;
        iArr = c14099.f42568;
        int i = iArr[this.f35875];
        C23272 c23272 = this.f35876;
        c23272.f74748 = i;
        iArr2 = c14099.f42569;
        int i2 = this.f35875;
        c23272.f74749 = iArr2[i2];
        this.f35875 = i2 + 1;
        return c23272;
    }
}

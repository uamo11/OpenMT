package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: G58P */
/* renamed from: l.۠᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8371 implements Iterator {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC4843 f25683;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f25684;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f25685;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f25686 = false;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f25687;

    public C8371(AbstractC4843 abstractC4843, int i) {
        this.f25683 = abstractC4843;
        this.f25685 = i;
        this.f25684 = abstractC4843.mo12419();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f25687 < this.f25684;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object mo12412 = this.f25683.mo12412(this.f25687, this.f25685);
        this.f25687++;
        this.f25686 = true;
        return mo12412;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f25686) {
            throw new IllegalStateException();
        }
        int i = this.f25687 - 1;
        this.f25687 = i;
        this.f25684--;
        this.f25686 = false;
        this.f25683.mo12415(i);
    }
}

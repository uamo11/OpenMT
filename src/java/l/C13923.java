package l;

import java.util.Iterator;

/* compiled from: S5VI */
/* renamed from: l.ܰܺܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13923 extends C10397 implements Iterable {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11808 m33359(int i) {
        C4752 c4752 = this.f31272;
        return new C11808(c4752, (C6163) c4752.f15069[this.f31277], (int) ((i * this.f31276) + this.f31273));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C23096(this);
    }
}

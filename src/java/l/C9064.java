package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: 640U */
/* renamed from: l.ۡᩴ۠, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9064 implements Iterator {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16118 f27481;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C16118 f27482;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f27483;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f27484 = false;

    public C9064(C16118 c16118, C16118 c161182) {
        this.f27481 = c16118;
        this.f27482 = c161182;
        this.f27483 = c161182.f49661.iterator();
    }

    @Override // java.util.Iterator
    public final C19648 next() {
        C2002 c2002;
        boolean z;
        if (!this.f27484) {
            Iterator it = this.f27483;
            if (it.hasNext()) {
                return (C19648) it.next();
            }
            this.f27484 = true;
        }
        C16118 c16118 = this.f27482;
        if (c16118.f49662.hasNext()) {
            InterfaceC21848 interfaceC21848 = (InterfaceC21848) c16118.f49662.next();
            C16118 c161182 = this.f27481;
            C1302 c1302 = c161182.f49660;
            C1302 c13022 = c161182.f49660;
            C22364 c22364 = c1302.f4637;
            EnumC16280 enumC16280 = c1302.f4638;
            c2002 = c1302.f4639;
            boolean m26686 = EnumC10637.f32009.m26686(c13022.f4638);
            z = c13022.f4645;
            C19648 c19648 = new C19648(interfaceC21848, c22364, enumC16280, c2002, m26686, c13022, z);
            c16118.f49661.add(c19648);
            return c19648;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z = this.f27484;
        C16118 c16118 = this.f27482;
        if (z) {
            return c16118.f49662.hasNext();
        }
        return this.f27483.hasNext() || c16118.f49662.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

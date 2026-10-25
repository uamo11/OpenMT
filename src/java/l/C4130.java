package l;

/* compiled from: FBI6 */
/* renamed from: l.ۘᩴܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4130 implements InterfaceC9775 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21064 f13092;

    public C4130() {
        C21064 c21064 = new C21064();
        this.f13092 = c21064;
        c21064.m47914();
    }

    @Override // l.InterfaceC9775
    public final void add(int i) {
        C21064 c21064 = this.f13092;
        int m47912 = c21064.m47912(i);
        if (m47912 < 0) {
            c21064.m47916(-(m47912 + 1), i);
        }
    }

    @Override // l.InterfaceC9775
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo12406(int i) {
        int m47912 = this.f13092.m47912(i);
        if (m47912 < 0) {
            m47912 = -1;
        }
        return m47912 >= 0;
    }

    @Override // l.InterfaceC9775
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12405(InterfaceC9775 interfaceC9775) {
        boolean z = interfaceC9775 instanceof C4130;
        int i = 0;
        C21064 c21064 = this.f13092;
        if (z) {
            C21064 c210642 = ((C4130) interfaceC9775).f13092;
            int size = c21064.size();
            int size2 = c210642.size();
            int i2 = 0;
            while (i < size2 && i2 < size) {
                while (i < size2 && c210642.get(i) < c21064.get(i2)) {
                    add(c210642.get(i));
                    i++;
                }
                if (i == size2) {
                    break;
                }
                while (i2 < size && c210642.get(i) >= c21064.get(i2)) {
                    i2++;
                }
            }
            while (i < size2) {
                add(c210642.get(i));
                i++;
            }
            c21064.m47914();
            return;
        }
        if (interfaceC9775 instanceof C22746) {
            C22746 c22746 = (C22746) interfaceC9775;
            while (i >= 0) {
                c21064.add(i);
                i = C13573.m32623(i + 1, c22746.f73462);
            }
            c21064.m47914();
            return;
        }
        InterfaceC6952 it = interfaceC9775.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // l.InterfaceC9775
    public final int elements() {
        return this.f13092.size();
    }

    @Override // l.InterfaceC9775
    public final InterfaceC6952 iterator() {
        return new C2719(this);
    }

    public final String toString() {
        return this.f13092.toString();
    }
}

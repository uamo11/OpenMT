package l;

import android.util.Pair;

/* compiled from: C8OL */
/* renamed from: l.ᩴ᩹֫, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC19042 extends AbstractC4846 {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59976 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f59977;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1242 f59978;

    /* renamed from: ۧ */
    public abstract int mo32586(int i);

    /* renamed from: ۧ */
    public abstract int mo32587(Object obj);

    /* renamed from: ܳ */
    public abstract int mo32588(int i);

    /* renamed from: ܽ */
    public abstract int mo32589(int i);

    /* renamed from: ܿ */
    public abstract int mo32590(int i);

    /* renamed from: ᩳ */
    public abstract Object mo32591(int i);

    /* renamed from: ᩻ */
    public abstract AbstractC4846 mo32593(int i);

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final C22485 mo14105(Object obj, C22485 c22485) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int mo32587 = mo32587(obj2);
        int mo32588 = mo32588(mo32587);
        mo32593(mo32587).mo14105(obj3, c22485);
        c22485.f72806 += mo32588;
        c22485.f72802 = obj;
        return c22485;
    }

    public AbstractC19042(InterfaceC1242 interfaceC1242) {
        this.f59978 = interfaceC1242;
        this.f59977 = interfaceC1242.getLength();
    }

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final int mo14096(int i, int i2, boolean z) {
        int mo32589 = mo32589(i);
        int mo32588 = mo32588(mo32589);
        int mo14096 = mo32593(mo32589).mo14096(i - mo32588, i2 == 2 ? 0 : i2, z);
        if (mo14096 != -1) {
            return mo32588 + mo14096;
        }
        int m43892 = m43892(mo32589, z);
        while (m43892 != -1 && mo32593(m43892).m14110()) {
            m43892 = m43892(m43892, z);
        }
        if (m43892 != -1) {
            return mo32593(m43892).mo14099(z) + mo32588(m43892);
        }
        if (i2 == 2) {
            return mo14099(z);
        }
        return -1;
    }

    @Override // l.AbstractC4846
    /* renamed from: ۧ */
    public final int mo14108(int i, int i2, boolean z) {
        AbstractC19042 abstractC19042;
        int i3;
        int mo32589 = mo32589(i);
        int mo32588 = mo32588(mo32589);
        int mo14108 = mo32593(mo32589).mo14108(i - mo32588, i2 == 2 ? 0 : i2, z);
        if (mo14108 != -1) {
            return mo32588 + mo14108;
        }
        InterfaceC1242 interfaceC1242 = this.f59978;
        if (z) {
            i3 = interfaceC1242.mo4079(mo32589);
            abstractC19042 = this;
        } else if (mo32589 > 0) {
            abstractC19042 = this;
            i3 = mo32589 - 1;
        } else {
            abstractC19042 = this;
            i3 = -1;
        }
        while (i3 != -1 && abstractC19042.mo32593(i3).m14110()) {
            if (z) {
                i3 = interfaceC1242.mo4079(i3);
            } else if (i3 > 0) {
                i3--;
            } else {
                abstractC19042 = abstractC19042;
                i3 = -1;
            }
        }
        if (i3 != -1) {
            return abstractC19042.mo32593(i3).mo14109(z) + abstractC19042.mo32588(i3);
        }
        if (i2 == 2) {
            return abstractC19042.mo14109(z);
        }
        return -1;
    }

    @Override // l.AbstractC4846
    /* renamed from: ۧ */
    public final int mo14109(boolean z) {
        int i = this.f59977;
        if (i != 0) {
            InterfaceC1242 interfaceC1242 = this.f59978;
            int mo4077 = z ? interfaceC1242.mo4077() : i - 1;
            while (mo32593(mo4077).m14110()) {
                if (z) {
                    mo4077 = interfaceC1242.mo4079(mo4077);
                } else {
                    mo4077 = mo4077 > 0 ? mo4077 - 1 : -1;
                }
                if (mo4077 == -1) {
                }
            }
            return mo32593(mo4077).mo14109(z) + mo32588(mo4077);
        }
        return -1;
    }

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final int mo14099(boolean z) {
        if (this.f59977 != 0) {
            int mo4081 = z ? this.f59978.mo4081() : 0;
            while (mo32593(mo4081).m14110()) {
                mo4081 = m43892(mo4081, z);
                if (mo4081 == -1) {
                }
            }
            return mo32593(mo4081).mo14099(z) + mo32588(mo4081);
        }
        return -1;
    }

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final C20369 mo14103(int i, C20369 c20369, long j) {
        int mo32589 = mo32589(i);
        int mo32588 = mo32588(mo32589);
        int mo32590 = mo32590(mo32589);
        mo32593(mo32589).mo14103(i - mo32588, c20369, j);
        Object mo32591 = mo32591(mo32589);
        if (!C20369.f65748.equals(c20369.f65761)) {
            mo32591 = Pair.create(mo32591, c20369.f65761);
        }
        c20369.f65761 = mo32591;
        c20369.f65760 += mo32590;
        c20369.f65752 += mo32590;
        return c20369;
    }

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final C22485 mo14104(int i, C22485 c22485, boolean z) {
        int mo32586 = mo32586(i);
        int mo32588 = mo32588(mo32586);
        mo32593(mo32586).mo14104(i - mo32590(mo32586), c22485, z);
        c22485.f72806 += mo32588;
        if (z) {
            Object mo32591 = mo32591(mo32586);
            Object obj = c22485.f72802;
            obj.getClass();
            c22485.f72802 = Pair.create(mo32591, obj);
        }
        return c22485;
    }

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final int mo14098(Object obj) {
        int mo14098;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int mo32587 = mo32587(obj2);
        if (mo32587 == -1 || (mo14098 = mo32593(mo32587).mo14098(obj3)) == -1) {
            return -1;
        }
        return mo32590(mo32587) + mo14098;
    }

    @Override // l.AbstractC4846
    /* renamed from: ֫ */
    public final Object mo14102(int i) {
        int mo32586 = mo32586(i);
        return Pair.create(mo32591(mo32586), mo32593(mo32586).mo14102(i - mo32590(mo32586)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m43892(int i, boolean z) {
        if (z) {
            return this.f59978.mo4082(i);
        }
        if (i < this.f59977 - 1) {
            return i + 1;
        }
        return -1;
    }
}

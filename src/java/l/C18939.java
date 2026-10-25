package l;

import java.util.LinkedList;

/* compiled from: V8DC */
/* renamed from: l.ᩴᩴۘ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18939 extends C21761 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double f59732;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f59733;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f59734;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedList f59735;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC21056 f59736;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC21056 f59737;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f59738;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public AbstractC21056 f59739;

    public C18939() {
        super("Data");
        this.f59735 = new LinkedList();
        this.f59738 = 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC21056 m43705(AbstractC2821 abstractC2821, int i, int i2) {
        int mo8709 = abstractC2821.mo8709();
        int i3 = this.f59738;
        if (mo8709 != i3) {
            throw new C2005("Tried to queue " + abstractC2821.mo8709() + " channel data to a " + i3 + " channel port.");
        }
        return new C4122(this, abstractC2821, i, i2);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m43710() {
        AbstractC21056 abstractC21056 = this.f59739;
        if (abstractC21056 != null) {
            abstractC21056.getClass();
            this.f59739 = null;
        }
        AbstractC21056 abstractC210562 = this.f59736;
        if (abstractC210562 != null) {
            abstractC210562.getClass();
            this.f59736 = null;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m43712() {
        return this.f59737 != null || this.f59735.size() > 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final double m43704(double d) {
        if (this.f59737 == null) {
            synchronized (this.f59735) {
                AbstractC21056 abstractC21056 = (AbstractC21056) this.f59735.remove();
                this.f59737 = abstractC21056;
                this.f59734 = abstractC21056.f29547;
                abstractC21056.f29549 = abstractC21056.f29548;
            }
        }
        this.f59732 = this.f59737.f67922.mo8708(this.f59734, d);
        double mo8707 = this.f59737.f67922.mo8707(this.f59734);
        int i = this.f59734 + 1;
        this.f59734 = i;
        AbstractC21056 abstractC210562 = this.f59737;
        if (i >= abstractC210562.f29547 + abstractC210562.f29550) {
            int i2 = abstractC210562.f29549;
            if (i2 > 0) {
                abstractC210562.f29549 = i2 - 1;
                abstractC210562.getClass();
            } else {
                if (this.f59735.size() == 0) {
                    AbstractC21056 abstractC210563 = this.f59737;
                    if (abstractC210563.f29549 < 0) {
                        abstractC210563.getClass();
                    }
                }
                this.f59737.getClass();
                this.f59736 = this.f59737;
                this.f59737 = null;
            }
            AbstractC21056 abstractC210564 = this.f59737;
            this.f59734 = abstractC210564.f29547;
            this.f59739 = abstractC210564;
        }
        this.f59733 = true;
        return mo8707;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m43709() {
        return this.f59732;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m43711() {
        synchronized (this.f59735) {
            this.f59735.clear();
            this.f59737 = null;
            this.f59733 = false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43706(AbstractC2821 abstractC2821, int i, int i2, C21245 c21245) {
        AbstractC21056 m43705 = m43705(abstractC2821, i, i2);
        m43705.f29548 = -1;
        m49086(c21245, m43705);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43707(C21245 c21245) {
        m49086(c21245, new C2711(this));
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m43708() {
        return this.f59733;
    }
}

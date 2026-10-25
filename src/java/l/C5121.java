package l;

import java.util.Iterator;

/* compiled from: U4RU */
/* renamed from: l.ۚۙۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5121 implements Iterable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f16038;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AbstractC8649 f16039;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC8649[] f16040;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC8649 f16041;

    public final int size() {
        return this.f16038;
    }

    public final AbstractC8649 getFirst() {
        return this.f16041;
    }

    public final AbstractC8649 getLast() {
        return this.f16039;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14668(AbstractC15452 abstractC15452) {
        for (AbstractC8649 abstractC8649 = this.f16041; abstractC8649 != null; abstractC8649 = abstractC8649.f26401) {
            abstractC8649.mo3237(abstractC15452);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0181(this);
    }

    public final AbstractC8649[] toArray() {
        AbstractC8649 abstractC8649 = this.f16041;
        AbstractC8649[] abstractC8649Arr = new AbstractC8649[this.f16038];
        int i = 0;
        while (abstractC8649 != null) {
            abstractC8649Arr[i] = abstractC8649;
            abstractC8649.f26398 = i;
            abstractC8649 = abstractC8649.f26401;
            i++;
        }
        return abstractC8649Arr;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m14672(AbstractC8649 abstractC8649, AbstractC8649 abstractC86492) {
        AbstractC8649 abstractC86493 = abstractC8649.f26401;
        abstractC86492.f26401 = abstractC86493;
        if (abstractC86493 != null) {
            abstractC86493.f26402 = abstractC86492;
        } else {
            this.f16039 = abstractC86492;
        }
        AbstractC8649 abstractC86494 = abstractC8649.f26402;
        abstractC86492.f26402 = abstractC86494;
        if (abstractC86494 != null) {
            abstractC86494.f26401 = abstractC86492;
        } else {
            this.f16041 = abstractC86492;
        }
        AbstractC8649[] abstractC8649Arr = this.f16040;
        if (abstractC8649Arr != null) {
            int i = abstractC8649.f26398;
            abstractC8649Arr[i] = abstractC86492;
            abstractC86492.f26398 = i;
        } else {
            abstractC86492.f26398 = 0;
        }
        abstractC8649.f26398 = -1;
        abstractC8649.f26402 = null;
        abstractC8649.f26401 = null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14666(AbstractC8649 abstractC8649) {
        this.f16038++;
        AbstractC8649 abstractC86492 = this.f16039;
        if (abstractC86492 == null) {
            this.f16041 = abstractC8649;
            this.f16039 = abstractC8649;
        } else {
            abstractC86492.f26401 = abstractC8649;
            abstractC8649.f26402 = abstractC86492;
        }
        this.f16039 = abstractC8649;
        this.f16040 = null;
        abstractC8649.f26398 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14667(AbstractC8649 abstractC8649, AbstractC8649 abstractC86492) {
        this.f16038++;
        AbstractC8649 abstractC86493 = abstractC8649.f26401;
        if (abstractC86493 == null) {
            this.f16039 = abstractC86492;
        } else {
            abstractC86493.f26402 = abstractC86492;
        }
        abstractC8649.f26401 = abstractC86492;
        abstractC86492.f26401 = abstractC86493;
        abstractC86492.f26402 = abstractC8649;
        this.f16040 = null;
        abstractC86492.f26398 = 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14671(AbstractC8649 abstractC8649, AbstractC8649 abstractC86492) {
        this.f16038++;
        AbstractC8649 abstractC86493 = abstractC8649.f26402;
        if (abstractC86493 == null) {
            this.f16041 = abstractC86492;
        } else {
            abstractC86493.f26401 = abstractC86492;
        }
        abstractC8649.f26402 = abstractC86492;
        abstractC86492.f26401 = abstractC8649;
        abstractC86492.f26402 = abstractC86493;
        this.f16040 = null;
        abstractC86492.f26398 = 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14670(AbstractC8649 abstractC8649) {
        this.f16038--;
        AbstractC8649 abstractC86492 = abstractC8649.f26401;
        AbstractC8649 abstractC86493 = abstractC8649.f26402;
        if (abstractC86492 == null) {
            if (abstractC86493 == null) {
                this.f16041 = null;
                this.f16039 = null;
            } else {
                abstractC86493.f26401 = null;
                this.f16039 = abstractC86493;
            }
        } else if (abstractC86493 == null) {
            this.f16041 = abstractC86492;
            abstractC86492.f26402 = null;
        } else {
            abstractC86493.f26401 = abstractC86492;
            abstractC86492.f26402 = abstractC86493;
        }
        this.f16040 = null;
        abstractC8649.f26398 = -1;
        abstractC8649.f26402 = null;
        abstractC8649.f26401 = null;
    }

    public final void clear() {
        this.f16038 = 0;
        this.f16041 = null;
        this.f16039 = null;
        this.f16040 = null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m14669() {
        for (AbstractC8649 abstractC8649 = this.f16041; abstractC8649 != null; abstractC8649 = abstractC8649.f26401) {
            if (abstractC8649 instanceof C22055) {
                ((C22055) abstractC8649).m49618();
            }
        }
    }
}

package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* compiled from: 0JF */
/* renamed from: l.ۖۜᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C2372 extends AbstractC15379 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1933 f7570;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C14156 f7571;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f7572;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient boolean f7574;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient C14156 f7575;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0919 f7576;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient boolean[] f7578 = new boolean[48];

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient C14156 f7573 = null;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f7577 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC1749
    /* renamed from: ۫ */
    public final void mo5873() {
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14156 m7687(int i) {
        C14156 c14156 = this.f7573;
        while (c14156 != null) {
            int compare = Integer.compare(i, c14156.f17057);
            if (compare == 0) {
                break;
            }
            c14156 = compare < 0 ? c14156.m33773() : c14156.m33768();
        }
        return c14156;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C14156 m7688(int i) {
        C14156 c14156 = this.f7573;
        C14156 c141562 = c14156;
        int i2 = 0;
        while (c14156 != null) {
            i2 = Integer.compare(i, c14156.f17057);
            if (i2 == 0) {
                break;
            }
            c141562 = c14156;
            c14156 = i2 < 0 ? c14156.m33773() : c14156.m33768();
        }
        return i2 == 0 ? c14156 : c141562;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    @Override // l.AbstractC0563, l.InterfaceC12954
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo2318(int r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2372.mo2318(int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0111, code lost:
    
        r5 = r5.f42716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0113, code lost:
    
        if (r5 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0117, code lost:
    
        if (r5.f42715 != r4) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x011a, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0120, code lost:
    
        if (r12.m33769() != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0122, code lost:
    
        r12 = r12.f42715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0125, code lost:
    
        r12 = r12.f42715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00f7, code lost:
    
        r12 = r12.f42715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00f9, code lost:
    
        if (r12 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00fd, code lost:
    
        if (r12.f42716 == r4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0103, code lost:
    
        if (r5.m33772() != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0105, code lost:
    
        r5 = r5.f42716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0108, code lost:
    
        r12 = r5.f42716;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a1 -> B:21:0x00e7). Please report as a decompilation issue!!! */
    @Override // l.AbstractC0563, l.InterfaceC12954
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(int r12) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2372.remove(int):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C15776 c15776 = new C15776(this);
        int i = this.f7577;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C11003.equals(c15776.m22540().f17058, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f7577 = 0;
        this.f7573 = null;
        this.f7576 = null;
        this.f7572 = null;
        this.f7570 = null;
        this.f7575 = null;
        this.f7571 = null;
    }

    @Override // l.AbstractC1269, l.InterfaceC12954
    /* renamed from: ֫ */
    public final boolean mo2422(int i) {
        return m7687(i) != null;
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final int size() {
        return this.f7577;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f7577 == 0;
    }

    @Override // l.InterfaceC12954
    public final Object get(int i) {
        C14156 m7687 = m7687(i);
        if (m7687 == null) {
            return null;
        }
        return m7687.f17058;
    }

    @Override // l.InterfaceC1749
    /* renamed from: ۡ */
    public final int mo5870() {
        if (this.f7573 == null) {
            throw new NoSuchElementException();
        }
        return this.f7571.f17057;
    }

    @Override // l.InterfaceC1749
    /* renamed from: ۛ */
    public final int mo5868() {
        if (this.f7573 == null) {
            throw new NoSuchElementException();
        }
        return this.f7575.f17057;
    }

    @Override // l.AbstractC15379, l.InterfaceC13659
    /* renamed from: ۜ */
    public final InterfaceC0919 mo5869() {
        if (this.f7576 == null) {
            this.f7576 = new C12041(this);
        }
        return this.f7576;
    }

    @Override // l.AbstractC15379, java.util.Map, l.InterfaceC1749, java.util.SortedMap
    public final InterfaceC1933 keySet() {
        if (this.f7570 == null) {
            this.f7570 = new C10839(this);
        }
        return this.f7570;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC19825 values() {
        if (this.f7572 == null) {
            this.f7572 = new C23329(this);
        }
        return this.f7572;
    }

    @Override // l.InterfaceC1749
    /* renamed from: ᩻ */
    public final InterfaceC1749 mo5874(int i) {
        return new C9428(this, 0, true, i, false);
    }

    @Override // l.InterfaceC1749
    /* renamed from: ۡ */
    public final InterfaceC1749 mo5871(int i) {
        return new C9428(this, i, false, 0, true);
    }

    @Override // l.InterfaceC1749
    /* renamed from: ۧ */
    public final InterfaceC1749 mo5872(int i, int i2) {
        return new C9428(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C2372 c2372 = (C2372) super.clone();
            c2372.f7570 = null;
            c2372.f7572 = null;
            c2372.f7576 = null;
            c2372.f7578 = new boolean[48];
            if (this.f7577 != 0) {
                C14156 c14156 = new C14156();
                C14156 c141562 = new C14156();
                C14156 c141563 = this.f7573;
                c14156.f42717 &= -1073741825;
                c14156.f42716 = c141563;
                c141562.m33766((C14156) null);
                C14156 c141564 = c141562;
                loop0: while (true) {
                    if (!c14156.m33772()) {
                        C14156 clone = c14156.f42716.clone();
                        clone.m33766(c141564.f42716);
                        clone.m33771(c141564);
                        c141564.f42717 &= -1073741825;
                        c141564.f42716 = clone;
                        c14156 = c14156.f42716;
                        c141564 = clone;
                    } else {
                        while (c14156.m33769()) {
                            c14156 = c14156.f42715;
                            if (c14156 == null) {
                                break loop0;
                            }
                            c141564 = c141564.f42715;
                        }
                        c14156 = c14156.f42715;
                        c141564 = c141564.f42715;
                    }
                    if (!c14156.m33769()) {
                        C14156 clone2 = c14156.f42715.clone();
                        clone2.m33771(c141564.f42715);
                        clone2.m33766(c141564);
                        c141564.f42717 &= Integer.MAX_VALUE;
                        c141564.f42715 = clone2;
                    }
                }
                c141564.f42715 = null;
                C14156 c141565 = c141562.f42716;
                c2372.f7573 = c141565;
                c2372.f7571 = c141565;
                while (true) {
                    C14156 c141566 = c2372.f7571.f42716;
                    if (c141566 == null) {
                        break;
                    }
                    c2372.f7571 = c141566;
                }
                c2372.f7575 = c2372.f7573;
                while (true) {
                    C14156 c141567 = c2372.f7575.f42715;
                    if (c141567 == null) {
                        break;
                    }
                    c2372.f7575 = c141567;
                }
            }
            return c2372;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = this.f7577;
        C7807 c7807 = new C7807(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C14156 m22540 = c7807.m22540();
            objectOutputStream.writeInt(m22540.f17057);
            objectOutputStream.writeObject(m22540.f17058);
            i = i2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C14156 m7686(ObjectInputStream objectInputStream, int i, C14156 c14156, C14156 c141562) {
        if (i == 1) {
            C14156 c141563 = new C14156(objectInputStream.readInt(), objectInputStream.readObject());
            c141563.m33766(c14156);
            c141563.m33771(c141562);
            return c141563;
        }
        if (i == 2) {
            C14156 c141564 = new C14156(objectInputStream.readInt(), objectInputStream.readObject());
            C14156 c141565 = new C14156(objectInputStream.readInt(), objectInputStream.readObject());
            c141564.f42717 &= Integer.MAX_VALUE;
            c141564.f42715 = c141565;
            c141565.m33766(c141564);
            c141564.m33765(1);
            c141564.m33766(c14156);
            c141564.f42715.m33771(c141562);
            return c141564;
        }
        int i2 = i / 2;
        C14156 c141566 = new C14156();
        C14156 m7686 = m7686(objectInputStream, (i - i2) - 1, c14156, c141566);
        c141566.f42717 &= -1073741825;
        c141566.f42716 = m7686;
        c141566.f17057 = objectInputStream.readInt();
        c141566.f17058 = objectInputStream.readObject();
        C14156 m76862 = m7686(objectInputStream, i2, c141566, c141562);
        c141566.f42717 &= Integer.MAX_VALUE;
        c141566.f42715 = m76862;
        if (i == ((-i) & i)) {
            c141566.m33765(1);
        }
        return c141566;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f7578 = new boolean[48];
        int i = this.f7577;
        if (i != 0) {
            C14156 m7686 = m7686(objectInputStream, i, null, null);
            this.f7573 = m7686;
            while (m7686.m33773() != null) {
                m7686 = m7686.m33773();
            }
            this.f7571 = m7686;
            C14156 c14156 = this.f7573;
            while (c14156.m33768() != null) {
                c14156 = c14156.m33768();
            }
            this.f7575 = c14156;
        }
    }
}

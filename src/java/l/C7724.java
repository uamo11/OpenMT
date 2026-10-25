package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* compiled from: X5U */
/* renamed from: l.۟᩷ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C7724 extends AbstractC15379 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1933 f23895;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C8430 f23896;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f23899;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient boolean f23900;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient C8430 f23901;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0919 f23902;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient boolean[] f23904 = new boolean[64];

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient C8430[] f23898 = new C8430[64];

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient C8430 f23897 = null;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f23903 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC1749
    /* renamed from: ۫ */
    public final void mo5873() {
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8430 m20679(int i) {
        C8430 c8430 = this.f23897;
        while (c8430 != null) {
            int compare = Integer.compare(i, c8430.f17057);
            if (compare == 0) {
                break;
            }
            c8430 = compare < 0 ? c8430.m22108() : c8430.m22101();
        }
        return c8430;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8430 m20680(int i) {
        C8430 c8430 = this.f23897;
        C8430 c84302 = c8430;
        int i2 = 0;
        while (c8430 != null) {
            i2 = Integer.compare(i, c8430.f17057);
            if (i2 == 0) {
                break;
            }
            c84302 = c8430;
            c8430 = i2 < 0 ? c8430.m22108() : c8430.m22101();
        }
        return i2 == 0 ? c8430 : c84302;
    }

    @Override // l.AbstractC0563, l.InterfaceC12954
    /* renamed from: ֫ */
    public final Object mo2318(int i, Object obj) {
        int i2;
        C8430 c8430;
        C8430 c84302;
        C8430 c84303;
        int i3 = 0;
        this.f23900 = false;
        C8430 c84304 = this.f23897;
        if (c84304 == null) {
            this.f23903++;
            c84304 = new C8430(i, null);
            this.f23896 = c84304;
            this.f23901 = c84304;
            this.f23897 = c84304;
        } else {
            int i4 = 0;
            while (true) {
                int compare = Integer.compare(i, c84304.f17057);
                if (compare == 0) {
                    while (true) {
                        int i5 = i4 - 1;
                        if (i4 == 0) {
                            break;
                        }
                        this.f23898[i5] = null;
                        i4 = i5;
                    }
                } else {
                    this.f23898[i4] = c84304;
                    boolean[] zArr = this.f23904;
                    i2 = i4 + 1;
                    boolean z = compare > 0;
                    zArr[i4] = z;
                    if (z) {
                        if (c84304.m22110()) {
                            this.f23903++;
                            c8430 = new C8430(i, null);
                            C8430 c84305 = c84304.f25822;
                            if (c84305 == null) {
                                this.f23901 = c8430;
                            }
                            c8430.f25823 = c84304;
                            c8430.f25822 = c84305;
                            c84304.m22103(c8430);
                        } else {
                            c84304 = c84304.f25822;
                            i4 = i2;
                        }
                    } else if (c84304.m22102()) {
                        this.f23903++;
                        c8430 = new C8430(i, null);
                        C8430 c84306 = c84304.f25823;
                        if (c84306 == null) {
                            this.f23896 = c8430;
                        }
                        c8430.f25822 = c84304;
                        c8430.f25823 = c84306;
                        c84304.f25824 &= -1073741825;
                        c84304.f25823 = c8430;
                    } else {
                        c84304 = c84304.f25823;
                        i4 = i2;
                    }
                }
            }
            c84304 = c8430;
            this.f23900 = true;
            while (i4 > 0 && !this.f23898[i4].m22107()) {
                int i6 = i4 - 1;
                if (!this.f23904[i6]) {
                    C8430 c84307 = this.f23898[i6];
                    C8430 c84308 = c84307.f25822;
                    if (!c84307.m22110() && !c84308.m22107()) {
                        this.f23898[i4].m22099(true);
                        c84308.m22099(true);
                        this.f23898[i6].m22099(false);
                        i4 -= 2;
                    } else {
                        if (this.f23904[i4]) {
                            C8430[] c8430Arr = this.f23898;
                            C8430 c84309 = c8430Arr[i4];
                            C8430 c843010 = c84309.f25822;
                            c84309.f25822 = c843010.f25823;
                            c843010.f25823 = c84309;
                            c8430Arr[i6].f25823 = c843010;
                            if (c843010.m22102()) {
                                c843010.m22106(false);
                                c84309.m22105(c843010);
                            }
                            c84303 = c843010;
                        } else {
                            c84303 = this.f23898[i4];
                        }
                        C8430 c843011 = this.f23898[i6];
                        c843011.m22099(false);
                        c84303.m22099(true);
                        c843011.f25823 = c84303.f25822;
                        c84303.f25822 = c843011;
                        if (i4 < 2) {
                            this.f23897 = c84303;
                        } else {
                            int i7 = i4 - 2;
                            if (this.f23904[i7]) {
                                this.f23898[i7].f25822 = c84303;
                            } else {
                                this.f23898[i7].f25823 = c84303;
                            }
                        }
                        if (c84303.m22110()) {
                            c84303.m22109(false);
                            c843011.m22098(c84303);
                        }
                    }
                } else {
                    C8430 c843012 = this.f23898[i6];
                    C8430 c843013 = c843012.f25823;
                    if (!c843012.m22102() && !c843013.m22107()) {
                        this.f23898[i4].m22099(true);
                        c843013.m22099(true);
                        this.f23898[i6].m22099(false);
                        i4 -= 2;
                    } else {
                        if (this.f23904[i4]) {
                            c84302 = this.f23898[i4];
                        } else {
                            C8430[] c8430Arr2 = this.f23898;
                            C8430 c843014 = c8430Arr2[i4];
                            C8430 c843015 = c843014.f25823;
                            c843014.f25823 = c843015.f25822;
                            c843015.f25822 = c843014;
                            c8430Arr2[i6].f25822 = c843015;
                            if (c843015.m22110()) {
                                c843015.m22109(false);
                                c843014.m22098(c843015);
                            }
                            c84302 = c843015;
                        }
                        C8430 c843016 = this.f23898[i6];
                        c843016.m22099(false);
                        c84302.m22099(true);
                        c843016.f25822 = c84302.f25823;
                        c84302.f25823 = c843016;
                        if (i4 < 2) {
                            this.f23897 = c84302;
                        } else {
                            int i8 = i4 - 2;
                            if (this.f23904[i8]) {
                                this.f23898[i8].f25822 = c84302;
                            } else {
                                this.f23898[i8].f25823 = c84302;
                            }
                        }
                        if (c84302.m22102()) {
                            c84302.m22106(false);
                            c843016.m22105(c84302);
                        }
                    }
                }
            }
            i3 = i2;
        }
        this.f23897.m22099(true);
        while (true) {
            int i9 = i3 - 1;
            if (i3 == 0) {
                break;
            }
            this.f23898[i9] = null;
            i3 = i9;
        }
        Object obj2 = c84304.f17058;
        c84304.f17058 = obj;
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x02eb, code lost:
    
        if (r4.m22102() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02f3, code lost:
    
        if (r4.f25823.m22107() == false) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x031a, code lost:
    
        r8 = r3 - 1;
        r4.m22099(r13.f23898[r8].m22107());
        r13.f23898[r8].m22099(true);
        r4.f25823.m22099(true);
        r6 = r13.f23898;
        r9 = r6[r8];
        r9.f25823 = r4.f25822;
        r4.f25822 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x033d, code lost:
    
        if (r3 >= 2) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x033f, code lost:
    
        r13.f23897 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0356, code lost:
    
        if (r4.m22110() == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0358, code lost:
    
        r4.m22109(false);
        r13.f23898[r8].m22098(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0342, code lost:
    
        r3 = r3 - 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0347, code lost:
    
        if (r13.f23904[r3] == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0349, code lost:
    
        r6[r3].f25822 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x034e, code lost:
    
        r6[r3].f25823 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02f5, code lost:
    
        r6 = r4.f25822;
        r6.m22099(true);
        r4.m22099(false);
        r4.f25822 = r6.f25823;
        r6.f25823 = r4;
        r13.f23898[r3 - 1].f25823 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x030f, code lost:
    
        if (r6.m22102() == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0311, code lost:
    
        r6.m22106(false);
        r6.f25823.m22105(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0319, code lost:
    
        r4 = r6;
     */
    @Override // l.AbstractC0563, l.InterfaceC12954
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(int r14) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7724.remove(int):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C14073 c14073 = new C14073(this);
        int i = this.f23903;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C11003.equals(c14073.m51565().f17058, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f23903 = 0;
        this.f23897 = null;
        this.f23902 = null;
        this.f23899 = null;
        this.f23895 = null;
        this.f23901 = null;
        this.f23896 = null;
    }

    @Override // l.AbstractC1269, l.InterfaceC12954
    /* renamed from: ֫ */
    public final boolean mo2422(int i) {
        return m20679(i) != null;
    }

    @Override // l.AbstractC0563, l.InterfaceC9893
    public final int size() {
        return this.f23903;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f23903 == 0;
    }

    @Override // l.InterfaceC12954
    public final Object get(int i) {
        C8430 m20679 = m20679(i);
        if (m20679 == null) {
            return null;
        }
        return m20679.f17058;
    }

    @Override // l.InterfaceC1749
    /* renamed from: ۡ */
    public final int mo5870() {
        if (this.f23897 == null) {
            throw new NoSuchElementException();
        }
        return this.f23896.f17057;
    }

    @Override // l.InterfaceC1749
    /* renamed from: ۛ */
    public final int mo5868() {
        if (this.f23897 == null) {
            throw new NoSuchElementException();
        }
        return this.f23901.f17057;
    }

    @Override // l.AbstractC15379, l.InterfaceC13659
    /* renamed from: ۜ */
    public final InterfaceC0919 mo5869() {
        if (this.f23902 == null) {
            this.f23902 = new C5608(this);
        }
        return this.f23902;
    }

    @Override // l.AbstractC15379, java.util.Map, l.InterfaceC1749, java.util.SortedMap
    public final InterfaceC1933 keySet() {
        if (this.f23895 == null) {
            this.f23895 = new C22541(this);
        }
        return this.f23895;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final Collection values() {
        if (this.f23899 == null) {
            this.f23899 = new C1374(this);
        }
        return this.f23899;
    }

    @Override // l.InterfaceC1749
    /* renamed from: ᩻ */
    public final InterfaceC1749 mo5874(int i) {
        return new C11958(this, 0, true, i, false);
    }

    @Override // l.InterfaceC1749
    /* renamed from: ۡ */
    public final InterfaceC1749 mo5871(int i) {
        return new C11958(this, i, false, 0, true);
    }

    @Override // l.InterfaceC1749
    /* renamed from: ۧ */
    public final InterfaceC1749 mo5872(int i, int i2) {
        return new C11958(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C7724 c7724 = (C7724) super.clone();
            c7724.f23895 = null;
            c7724.f23899 = null;
            c7724.f23902 = null;
            c7724.f23904 = new boolean[64];
            c7724.f23898 = new C8430[64];
            if (this.f23903 != 0) {
                C8430 c8430 = new C8430();
                C8430 c84302 = new C8430();
                C8430 c84303 = this.f23897;
                c8430.f25824 &= -1073741825;
                c8430.f25823 = c84303;
                c84302.m22098((C8430) null);
                C8430 c84304 = c84302;
                loop0: while (true) {
                    if (!c8430.m22102()) {
                        C8430 clone = c8430.f25823.clone();
                        clone.m22098(c84304.f25823);
                        clone.m22105(c84304);
                        c84304.f25824 &= -1073741825;
                        c84304.f25823 = clone;
                        c8430 = c8430.f25823;
                        c84304 = clone;
                    } else {
                        while (c8430.m22110()) {
                            c8430 = c8430.f25822;
                            if (c8430 == null) {
                                break loop0;
                            }
                            c84304 = c84304.f25822;
                        }
                        c8430 = c8430.f25822;
                        c84304 = c84304.f25822;
                    }
                    if (!c8430.m22110()) {
                        C8430 clone2 = c8430.f25822.clone();
                        clone2.m22105(c84304.f25822);
                        clone2.m22098(c84304);
                        c84304.m22103(clone2);
                    }
                }
                c84304.f25822 = null;
                C8430 c84305 = c84302.f25823;
                c7724.f23897 = c84305;
                c7724.f23896 = c84305;
                while (true) {
                    C8430 c84306 = c7724.f23896.f25823;
                    if (c84306 == null) {
                        break;
                    }
                    c7724.f23896 = c84306;
                }
                c7724.f23901 = c7724.f23897;
                while (true) {
                    C8430 c84307 = c7724.f23901.f25822;
                    if (c84307 == null) {
                        break;
                    }
                    c7724.f23901 = c84307;
                }
            }
            return c7724;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = this.f23903;
        C15484 c15484 = new C15484(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C8430 m51565 = c15484.m51565();
            objectOutputStream.writeInt(m51565.f17057);
            objectOutputStream.writeObject(m51565.f17058);
            i = i2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8430 m20678(ObjectInputStream objectInputStream, int i, C8430 c8430, C8430 c84302) {
        if (i == 1) {
            C8430 c84303 = new C8430(objectInputStream.readInt(), objectInputStream.readObject());
            c84303.m22098(c8430);
            c84303.m22105(c84302);
            c84303.m22099(true);
            return c84303;
        }
        if (i == 2) {
            C8430 c84304 = new C8430(objectInputStream.readInt(), objectInputStream.readObject());
            c84304.m22099(true);
            c84304.m22103(new C8430(objectInputStream.readInt(), objectInputStream.readObject()));
            c84304.f25822.m22098(c84304);
            c84304.m22098(c8430);
            c84304.f25822.m22105(c84302);
            return c84304;
        }
        int i2 = i / 2;
        C8430 c84305 = new C8430();
        C8430 m20678 = m20678(objectInputStream, (i - i2) - 1, c8430, c84305);
        c84305.f25824 &= -1073741825;
        c84305.f25823 = m20678;
        c84305.f17057 = objectInputStream.readInt();
        c84305.f17058 = objectInputStream.readObject();
        c84305.m22099(true);
        c84305.m22103(m20678(objectInputStream, i2, c84305, c84302));
        int i3 = i + 2;
        if (i3 == ((-i3) & i3)) {
            c84305.f25822.m22099(false);
        }
        return c84305;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f23904 = new boolean[64];
        this.f23898 = new C8430[64];
        int i = this.f23903;
        if (i != 0) {
            C8430 m20678 = m20678(objectInputStream, i, null, null);
            this.f23897 = m20678;
            while (m20678.m22108() != null) {
                m20678 = m20678.m22108();
            }
            this.f23896 = m20678;
            C8430 c8430 = this.f23897;
            while (c8430.m22101() != null) {
                c8430 = c8430.m22101();
            }
            this.f23901 = c8430;
        }
    }
}

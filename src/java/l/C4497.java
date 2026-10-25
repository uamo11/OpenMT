package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Comparator;
import java.util.NoSuchElementException;

/* compiled from: 5SO */
/* renamed from: l.ۙ۟ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4497 extends AbstractC6798 implements Cloneable {
    public static final long serialVersionUID = -7046029254386353129L;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1954 f14305;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C8731 f14306;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f14307;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient boolean f14309;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient C8731 f14310;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient InterfaceC0919 f14311;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient boolean[] f14313 = new boolean[48];

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient C8731 f14308 = null;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f14312 = 0;

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC0109, java.util.SortedMap
    public final void comparator() {
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C8731 m13250(char c) {
        C8731 c8731 = this.f14308;
        while (c8731 != null) {
            int compare = Character.compare(c, c8731.f53201);
            if (compare == 0) {
                break;
            }
            c8731 = compare < 0 ? c8731.m22569() : c8731.m22564();
        }
        return c8731;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C8731 m13248(char c) {
        C8731 c8731 = this.f14308;
        C8731 c87312 = c8731;
        int i = 0;
        while (c8731 != null) {
            i = Character.compare(c, c8731.f53201);
            if (i == 0) {
                break;
            }
            c87312 = c8731;
            c8731 = i < 0 ? c8731.m22569() : c8731.m22564();
        }
        return i == 0 ? c8731 : c87312;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019b  */
    @Override // l.AbstractC18087, l.InterfaceC12963
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo13246(char r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4497.mo13246(char, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0111, code lost:
    
        r5 = r5.f26577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0113, code lost:
    
        if (r5 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0117, code lost:
    
        if (r5.f26576 != r4) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x011a, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0120, code lost:
    
        if (r12.m22565() != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0122, code lost:
    
        r12 = r12.f26576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0125, code lost:
    
        r12 = r12.f26576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00f7, code lost:
    
        r12 = r12.f26576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x00f9, code lost:
    
        if (r12 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x00fd, code lost:
    
        if (r12.f26577 == r4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0103, code lost:
    
        if (r5.m22568() != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0105, code lost:
    
        r5 = r5.f26577;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0108, code lost:
    
        r12 = r5.f26577;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a1 -> B:21:0x00e7). Please report as a decompilation issue!!! */
    @Override // l.AbstractC18087, l.InterfaceC12963
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo13251(char r12) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4497.mo13251(char):java.lang.Object");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        C20020 c20020 = new C20020(this);
        int i = this.f14312;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (C11003.equals(c20020.m49736().f53202, obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        this.f14312 = 0;
        this.f14308 = null;
        this.f14311 = null;
        this.f14307 = null;
        this.f14305 = null;
        this.f14310 = null;
        this.f14306 = null;
    }

    @Override // l.AbstractC14558, l.InterfaceC12963
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo13247(char c) {
        return m13250(c) != null;
    }

    @Override // l.AbstractC18087, l.InterfaceC9893
    public final int size() {
        return this.f14312;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f14312 == 0;
    }

    @Override // l.InterfaceC12963
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object mo13249(char c) {
        C8731 m13250 = m13250(c);
        if (m13250 == null) {
            return null;
        }
        return m13250.f53202;
    }

    @Override // l.InterfaceC0109
    /* renamed from: ۬֫ */
    public final char mo1095() {
        if (this.f14308 == null) {
            throw new NoSuchElementException();
        }
        return this.f14306.f53201;
    }

    @Override // l.InterfaceC0109
    /* renamed from: ܳ֫ */
    public final char mo1098() {
        if (this.f14308 == null) {
            throw new NoSuchElementException();
        }
        return this.f14310.f53201;
    }

    @Override // l.AbstractC6798, l.InterfaceC13668
    /* renamed from: ܳ */
    public final InterfaceC0919 mo1097() {
        if (this.f14311 == null) {
            this.f14311 = new C20726(this);
        }
        return this.f14311;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC1954 keySet() {
        if (this.f14305 == null) {
            this.f14305 = new C3792(this);
        }
        return this.f14305;
    }

    @Override // java.util.Map, java.util.SortedMap
    public final InterfaceC19825 values() {
        if (this.f14307 == null) {
            this.f14307 = new C9437(this);
        }
        return this.f14307;
    }

    @Override // l.InterfaceC0109
    /* renamed from: ᩳ */
    public final InterfaceC0109 mo1099(char c) {
        return new C21431(this, (char) 0, true, c, false);
    }

    @Override // l.InterfaceC0109
    /* renamed from: ܳ */
    public final InterfaceC0109 mo1096(char c) {
        return new C21431(this, c, false, (char) 0, true);
    }

    @Override // l.InterfaceC0109
    /* renamed from: ۧ */
    public final InterfaceC0109 mo1094(char c, char c2) {
        return new C21431(this, c, false, c2, false);
    }

    public final Object clone() {
        try {
            C4497 c4497 = (C4497) super.clone();
            c4497.f14305 = null;
            c4497.f14307 = null;
            c4497.f14311 = null;
            c4497.f14313 = new boolean[48];
            if (this.f14312 != 0) {
                C8731 c8731 = new C8731();
                C8731 c87312 = new C8731();
                C8731 c87313 = this.f14308;
                c8731.f26578 &= -1073741825;
                c8731.f26577 = c87313;
                c87312.m22562((C8731) null);
                C8731 c87314 = c87312;
                loop0: while (true) {
                    if (!c8731.m22568()) {
                        C8731 clone = c8731.f26577.clone();
                        clone.m22562(c87314.f26577);
                        clone.m22567(c87314);
                        c87314.f26578 &= -1073741825;
                        c87314.f26577 = clone;
                        c8731 = c8731.f26577;
                        c87314 = clone;
                    } else {
                        while (c8731.m22565()) {
                            c8731 = c8731.f26576;
                            if (c8731 == null) {
                                break loop0;
                            }
                            c87314 = c87314.f26576;
                        }
                        c8731 = c8731.f26576;
                        c87314 = c87314.f26576;
                    }
                    if (!c8731.m22565()) {
                        C8731 clone2 = c8731.f26576.clone();
                        clone2.m22567(c87314.f26576);
                        clone2.m22562(c87314);
                        c87314.f26578 &= Integer.MAX_VALUE;
                        c87314.f26576 = clone2;
                    }
                }
                c87314.f26576 = null;
                C8731 c87315 = c87312.f26577;
                c4497.f14308 = c87315;
                c4497.f14306 = c87315;
                while (true) {
                    C8731 c87316 = c4497.f14306.f26577;
                    if (c87316 == null) {
                        break;
                    }
                    c4497.f14306 = c87316;
                }
                c4497.f14310 = c4497.f14308;
                while (true) {
                    C8731 c87317 = c4497.f14310.f26576;
                    if (c87317 == null) {
                        break;
                    }
                    c4497.f14310 = c87317;
                }
            }
            return c4497;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = this.f14312;
        C15785 c15785 = new C15785(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            C8731 m49736 = c15785.m49736();
            objectOutputStream.writeChar(m49736.f53201);
            objectOutputStream.writeObject(m49736.f53202);
            i = i2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8731 m13245(ObjectInputStream objectInputStream, int i, C8731 c8731, C8731 c87312) {
        if (i == 1) {
            C8731 c87313 = new C8731(objectInputStream.readChar(), objectInputStream.readObject());
            c87313.m22562(c8731);
            c87313.m22567(c87312);
            return c87313;
        }
        if (i == 2) {
            C8731 c87314 = new C8731(objectInputStream.readChar(), objectInputStream.readObject());
            C8731 c87315 = new C8731(objectInputStream.readChar(), objectInputStream.readObject());
            c87314.f26578 &= Integer.MAX_VALUE;
            c87314.f26576 = c87315;
            c87315.m22562(c87314);
            c87314.m22561(1);
            c87314.m22562(c8731);
            c87314.f26576.m22567(c87312);
            return c87314;
        }
        int i2 = i / 2;
        C8731 c87316 = new C8731();
        C8731 m13245 = m13245(objectInputStream, (i - i2) - 1, c8731, c87316);
        c87316.f26578 &= -1073741825;
        c87316.f26577 = m13245;
        c87316.f53201 = objectInputStream.readChar();
        c87316.f53202 = objectInputStream.readObject();
        C8731 m132452 = m13245(objectInputStream, i2, c87316, c87312);
        c87316.f26578 &= Integer.MAX_VALUE;
        c87316.f26576 = m132452;
        if (i == ((-i) & i)) {
            c87316.m22561(1);
        }
        return c87316;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f14313 = new boolean[48];
        int i = this.f14312;
        if (i != 0) {
            C8731 m13245 = m13245(objectInputStream, i, null, null);
            this.f14308 = m13245;
            while (m13245.m22569() != null) {
                m13245 = m13245.m22569();
            }
            this.f14306 = m13245;
            C8731 c8731 = this.f14308;
            while (c8731.m22564() != null) {
                c8731 = c8731.m22564();
            }
            this.f14310 = c8731;
        }
    }
}

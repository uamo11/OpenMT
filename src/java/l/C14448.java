package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: 25I */
/* renamed from: l.ܳۢᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14448 extends AbstractC11853 implements Serializable {
    public static final long serialVersionUID = -7046029254386353130L;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient C10922 f44288;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient C10922 f44289;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient boolean[] f44291 = new boolean[48];

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient C10922 f44287 = null;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f44290 = 0;

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return null;
    }

    @Override // l.InterfaceC1933, java.util.SortedSet
    public final InterfaceC4571 comparator() {
        return null;
    }

    @Override // l.InterfaceC1043
    public final boolean contains(int i) {
        C10922 c10922 = this.f44287;
        while (c10922 != null) {
            int compare = Integer.compare(i, c10922.f32829);
            if (compare == 0) {
                break;
            }
            c10922 = compare < 0 ? c10922.m27229() : c10922.m27235();
        }
        return c10922 != null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10922 m34503(int i) {
        C10922 c10922 = this.f44287;
        C10922 c109222 = c10922;
        int i2 = 0;
        while (c10922 != null) {
            i2 = Integer.compare(i, c10922.f32829);
            if (i2 == 0) {
                break;
            }
            c109222 = c10922;
            c10922 = i2 < 0 ? c10922.m27229() : c10922.m27235();
        }
        return i2 == 0 ? c10922 : c109222;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0190  */
    @Override // l.AbstractC21731, l.InterfaceC1043
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean add(int r11) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14448.add(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x0110, code lost:
    
        r0 = r0.f32827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0112, code lost:
    
        if (r0 == null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0116, code lost:
    
        if (r0.f32826 != r4) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0119, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x011f, code lost:
    
        if (r11.m27233() != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0121, code lost:
    
        r11 = r11.f32826;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0124, code lost:
    
        r11 = r11.f32826;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00f6, code lost:
    
        r11 = r11.f32826;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00f8, code lost:
    
        if (r11 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00fc, code lost:
    
        if (r11.f32827 == r4) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0102, code lost:
    
        if (r0.m27239() != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0104, code lost:
    
        r0 = r0.f32827;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0107, code lost:
    
        r11 = r0.f32827;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a0 -> B:19:0x00e6). Please report as a decompilation issue!!! */
    @Override // l.AbstractC6208
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(int r11) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14448.remove(int):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f44290 = 0;
        this.f44287 = null;
        this.f44288 = null;
        this.f44289 = null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f44290;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f44290 == 0;
    }

    @Override // l.InterfaceC1933
    /* renamed from: ֡ */
    public final int mo6349() {
        if (this.f44287 == null) {
            throw new NoSuchElementException();
        }
        return this.f44289.f32829;
    }

    @Override // l.InterfaceC1933
    /* renamed from: ᩻֫ */
    public final int mo6354() {
        if (this.f44287 == null) {
            throw new NoSuchElementException();
        }
        return this.f44288.f32829;
    }

    @Override // l.AbstractC11853, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C16565(this);
    }

    @Override // l.AbstractC11853, l.AbstractC21731, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final InterfaceC6667 iterator() {
        return new C16565(this);
    }

    @Override // l.InterfaceC1933
    /* renamed from: ۗ */
    public final InterfaceC15132 mo6350() {
        return new C16565(this);
    }

    @Override // l.InterfaceC1933
    /* renamed from: ᩴ */
    public final InterfaceC1933 mo6353(int i) {
        return new C17271(this, 0, true, i, false);
    }

    @Override // l.InterfaceC1933
    /* renamed from: ܳ */
    public final InterfaceC1933 mo6351(int i) {
        return new C17271(this, i, false, 0, true);
    }

    @Override // l.InterfaceC1933
    /* renamed from: ܽ */
    public final InterfaceC1933 mo6352(int i, int i2) {
        return new C17271(this, i, false, i2, false);
    }

    public final Object clone() {
        try {
            C14448 c14448 = (C14448) super.clone();
            c14448.f44291 = new boolean[48];
            if (this.f44290 != 0) {
                C10922 c10922 = new C10922();
                C10922 c109222 = new C10922();
                C10922 c109223 = this.f44287;
                c10922.f32828 &= -1073741825;
                c10922.f32827 = c109223;
                c109222.m27231((C10922) null);
                C10922 c109224 = c109222;
                loop0: while (true) {
                    if (!c10922.m27239()) {
                        C10922 clone = c10922.f32827.clone();
                        clone.m27231(c109224.f32827);
                        clone.m27234(c109224);
                        c109224.f32828 &= -1073741825;
                        c109224.f32827 = clone;
                        c10922 = c10922.f32827;
                        c109224 = clone;
                    } else {
                        while (c10922.m27233()) {
                            c10922 = c10922.f32826;
                            if (c10922 == null) {
                                break loop0;
                            }
                            c109224 = c109224.f32826;
                        }
                        c10922 = c10922.f32826;
                        c109224 = c109224.f32826;
                    }
                    if (!c10922.m27233()) {
                        C10922 clone2 = c10922.f32826.clone();
                        clone2.m27234(c109224.f32826);
                        clone2.m27231(c109224);
                        c109224.f32828 &= Integer.MAX_VALUE;
                        c109224.f32826 = clone2;
                    }
                }
                c109224.f32826 = null;
                C10922 c109225 = c109222.f32827;
                c14448.f44287 = c109225;
                c14448.f44289 = c109225;
                while (true) {
                    C10922 c109226 = c14448.f44289.f32827;
                    if (c109226 == null) {
                        break;
                    }
                    c14448.f44289 = c109226;
                }
                c14448.f44288 = c14448.f44287;
                while (true) {
                    C10922 c109227 = c14448.f44288.f32826;
                    if (c109227 == null) {
                        break;
                    }
                    c14448.f44288 = c109227;
                }
            }
            return c14448;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = this.f44290;
        C16565 c16565 = new C16565(this);
        objectOutputStream.defaultWriteObject();
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            objectOutputStream.writeInt(c16565.nextInt());
            i = i2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10922 m34502(ObjectInputStream objectInputStream, int i, C10922 c10922, C10922 c109222) {
        if (i == 1) {
            C10922 c109223 = new C10922(objectInputStream.readInt());
            c109223.m27231(c10922);
            c109223.m27234(c109222);
            return c109223;
        }
        if (i == 2) {
            C10922 c109224 = new C10922(objectInputStream.readInt());
            C10922 c109225 = new C10922(objectInputStream.readInt());
            c109224.f32828 &= Integer.MAX_VALUE;
            c109224.f32826 = c109225;
            c109225.m27231(c109224);
            c109224.m27230(1);
            c109224.m27231(c10922);
            c109224.f32826.m27234(c109222);
            return c109224;
        }
        int i2 = i / 2;
        C10922 c109226 = new C10922();
        C10922 m34502 = m34502(objectInputStream, (i - i2) - 1, c10922, c109226);
        c109226.f32828 &= -1073741825;
        c109226.f32827 = m34502;
        c109226.f32829 = objectInputStream.readInt();
        C10922 m345022 = m34502(objectInputStream, i2, c109226, c109222);
        c109226.f32828 &= Integer.MAX_VALUE;
        c109226.f32826 = m345022;
        if (i == ((-i) & i)) {
            c109226.m27230(1);
        }
        return c109226;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.f44291 = new boolean[48];
        int i = this.f44290;
        if (i != 0) {
            C10922 m34502 = m34502(objectInputStream, i, null, null);
            this.f44287 = m34502;
            while (m34502.m27229() != null) {
                m34502 = m34502.m27229();
            }
            this.f44289 = m34502;
            C10922 c10922 = this.f44287;
            while (c10922.m27235() != null) {
                c10922 = c10922.m27235();
            }
            this.f44288 = c10922;
        }
    }
}

package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: 97L */
/* renamed from: l.᩵֫ᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19161 extends AbstractC14558 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11668 f60375;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient char[] f60376;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f60377;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final transient int f60378;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f60379;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f60380;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient int f60381;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC19825 f60382;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f60383;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f60384;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC22841 f60385;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public transient Object[] f60386;

    public C19161(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f60383 = 0.75f;
        int m32765 = C13630.m32765(0.75f, i);
        this.f60377 = m32765;
        this.f60378 = m32765;
        this.f60381 = m32765 - 1;
        this.f60380 = C13630.m32772(0.75f, m32765);
        int i2 = this.f60377 + 1;
        this.f60376 = new char[i2];
        this.f60386 = new Object[i2];
    }

    public C19161() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object m44243(int i) {
        char c;
        Object[] objArr = this.f60386;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f60379--;
        char[] cArr = this.f60376;
        loop0: while (true) {
            int i2 = (i + 1) & this.f60381;
            while (true) {
                c = cArr[i2];
                if (c == 0) {
                    break loop0;
                }
                int m32766 = C13630.m32766((int) c);
                int i3 = this.f60381;
                int i4 = m32766 & i3;
                if (i > i2) {
                    if (i >= i4 && i4 > i2) {
                        break;
                    }
                    i2 = (i2 + 1) & i3;
                } else if (i < i4 && i4 <= i2) {
                    i2 = (i2 + 1) & i3;
                }
            }
            cArr[i] = c;
            objArr[i] = objArr[i2];
            i = i2;
        }
        cArr[i] = 0;
        objArr[i] = null;
        int i5 = this.f60377;
        if (i5 > this.f60378 && this.f60379 < this.f60380 / 4 && i5 > 16) {
            m44244(i5 / 2);
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object m44240() {
        this.f60384 = false;
        Object[] objArr = this.f60386;
        int i = this.f60377;
        Object obj = objArr[i];
        objArr[i] = null;
        int i2 = this.f60379 - 1;
        this.f60379 = i2;
        if (i > this.f60378 && i2 < this.f60380 / 4 && i > 16) {
            m44244(i / 2);
        }
        return obj;
    }

    @Override // l.AbstractC14558, java.util.Map
    public final void putAll(Map map) {
        float f = this.f60383;
        if (f <= 0.5d) {
            int m32765 = C13630.m32765(f, map.size());
            if (m32765 > this.f60377) {
                m44244(m32765);
            }
        } else {
            int min = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil((map.size() + this.f60379) / f))));
            if (min > this.f60377) {
                m44244(min);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC18087, l.InterfaceC12963
    /* renamed from: ֫ */
    public final Object mo13246(char c, Object obj) {
        int i;
        char c2;
        if (c == 0) {
            i = this.f60384 ? this.f60377 : -(this.f60377 + 1);
        } else {
            char[] cArr = this.f60376;
            int m32766 = C13630.m32766((int) c) & this.f60381;
            char c3 = cArr[m32766];
            if (c3 != 0) {
                if (c != c3) {
                    do {
                        m32766 = (m32766 + 1) & this.f60381;
                        c2 = cArr[m32766];
                        if (c2 == 0) {
                        }
                    } while (c != c2);
                }
                i = m32766;
            }
            i = -(m32766 + 1);
            break;
        }
        if (i < 0) {
            int i2 = (-i) - 1;
            if (i2 == this.f60377) {
                this.f60384 = true;
            }
            this.f60376[i2] = c;
            this.f60386[i2] = obj;
            int i3 = this.f60379;
            this.f60379 = i3 + 1;
            if (i3 < this.f60380) {
                return null;
            }
            m44244(C13630.m32765(this.f60383, i3 + 2));
            return null;
        }
        Object[] objArr = this.f60386;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // l.AbstractC18087, l.InterfaceC12963
    /* renamed from: ܿ */
    public final Object mo13251(char c) {
        char c2;
        if (c == 0) {
            if (this.f60384) {
                return m44240();
            }
            return null;
        }
        char[] cArr = this.f60376;
        int m32766 = C13630.m32766((int) c) & this.f60381;
        char c3 = cArr[m32766];
        if (c3 == 0) {
            return null;
        }
        if (c == c3) {
            return m44243(m32766);
        }
        do {
            m32766 = (m32766 + 1) & this.f60381;
            c2 = cArr[m32766];
            if (c2 == 0) {
                return null;
            }
        } while (c != c2);
        return m44243(m32766);
    }

    @Override // l.InterfaceC12963
    /* renamed from: ۧ */
    public final Object mo13249(char c) {
        char c2;
        if (c == 0) {
            if (this.f60384) {
                return this.f60386[this.f60377];
            }
            return null;
        }
        char[] cArr = this.f60376;
        int m32766 = C13630.m32766((int) c) & this.f60381;
        char c3 = cArr[m32766];
        if (c3 == 0) {
            return null;
        }
        if (c == c3) {
            return this.f60386[m32766];
        }
        do {
            m32766 = (m32766 + 1) & this.f60381;
            c2 = cArr[m32766];
            if (c2 == 0) {
                return null;
            }
        } while (c != c2);
        return this.f60386[m32766];
    }

    @Override // l.AbstractC14558, l.InterfaceC12963
    /* renamed from: ֫ */
    public final boolean mo13247(char c) {
        char c2;
        if (c == 0) {
            return this.f60384;
        }
        char[] cArr = this.f60376;
        int m32766 = C13630.m32766((int) c) & this.f60381;
        char c3 = cArr[m32766];
        if (c3 == 0) {
            return false;
        }
        if (c != c3) {
            do {
                m32766 = (m32766 + 1) & this.f60381;
                c2 = cArr[m32766];
                if (c2 == 0) {
                    return false;
                }
            } while (c != c2);
        }
        return true;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        char[] cArr = this.f60376;
        Object[] objArr = this.f60386;
        if (this.f60384 && C11003.equals(objArr[this.f60377], obj)) {
            return true;
        }
        int i = this.f60377;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (cArr[i2] != 0 && C11003.equals(objArr[i2], obj)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f60379 == 0) {
            return;
        }
        this.f60379 = 0;
        this.f60384 = false;
        Arrays.fill(this.f60376, (char) 0);
        Arrays.fill(this.f60386, (Object) null);
    }

    @Override // l.AbstractC18087, l.InterfaceC9893
    public final int size() {
        return this.f60379;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f60379 == 0;
    }

    @Override // l.InterfaceC13668
    /* renamed from: ܳ */
    public final InterfaceC18559 mo1097() {
        if (this.f60385 == null) {
            this.f60385 = new C8577(this);
        }
        return this.f60385;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f60375 == null) {
            this.f60375 = new C6460(this);
        }
        return this.f60375;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f60382 == null) {
            this.f60382 = new C16337(this);
        }
        return this.f60382;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44244(int i) {
        char c;
        char[] cArr = this.f60376;
        Object[] objArr = this.f60386;
        int i2 = i - 1;
        int i3 = i + 1;
        char[] cArr2 = new char[i3];
        Object[] objArr2 = new Object[i3];
        int i4 = this.f60377;
        int i5 = this.f60384 ? this.f60379 - 1 : this.f60379;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    c = cArr[i4];
                } while (c == 0);
                int m32766 = C13630.m32766((int) c) & i2;
                if (cArr2[m32766] != 0) {
                    do {
                        m32766 = (m32766 + 1) & i2;
                    } while (cArr2[m32766] != 0);
                }
                cArr2[m32766] = cArr[i4];
                objArr2[m32766] = objArr[i4];
                i5 = i6;
            } else {
                objArr2[i] = objArr[this.f60377];
                this.f60377 = i;
                this.f60381 = i2;
                this.f60380 = C13630.m32772(this.f60383, i);
                this.f60376 = cArr2;
                this.f60386 = objArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C19161 c19161 = (C19161) super.clone();
            c19161.f60375 = null;
            c19161.f60382 = null;
            c19161.f60385 = null;
            c19161.f60384 = this.f60384;
            c19161.f60376 = (char[]) this.f60376.clone();
            c19161.f60386 = (Object[]) this.f60386.clone();
            return c19161;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC14558, java.util.Map
    public final int hashCode() {
        char c;
        char[] cArr = this.f60376;
        Object[] objArr = this.f60386;
        int i = this.f60384 ? this.f60379 - 1 : this.f60379;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            if (i == 0) {
                break;
            }
            while (true) {
                c = cArr[i2];
                if (c != 0) {
                    break;
                }
                i2++;
            }
            Object obj = objArr[i2];
            if (this != obj) {
                c ^= obj == null ? 0 : obj.hashCode();
            }
            i3 += c;
            i2++;
            i = i4;
        }
        if (!this.f60384) {
            return i3;
        }
        Object obj2 = objArr[this.f60377];
        return i3 + (obj2 != null ? obj2.hashCode() : 0);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        char[] cArr = this.f60376;
        Object[] objArr = this.f60386;
        C17749 c17749 = new C17749(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f60379;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int m36829 = c17749.m36829();
            objectOutputStream.writeChar(cArr[m36829]);
            objectOutputStream.writeObject(objArr[m36829]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f60379;
        float f = this.f60383;
        int m32765 = C13630.m32765(f, i2);
        this.f60377 = m32765;
        this.f60380 = C13630.m32772(f, m32765);
        int i3 = this.f60377;
        this.f60381 = i3 - 1;
        char[] cArr = new char[i3 + 1];
        this.f60376 = cArr;
        Object[] objArr = new Object[i3 + 1];
        this.f60386 = objArr;
        int i4 = this.f60379;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            char readChar = objectInputStream.readChar();
            Object readObject = objectInputStream.readObject();
            if (readChar == 0) {
                i = this.f60377;
                this.f60384 = true;
            } else {
                int m32766 = C13630.m32766((int) readChar);
                int i6 = this.f60381;
                while (true) {
                    i = m32766 & i6;
                    if (cArr[i] != 0) {
                        m32766 = i + 1;
                        i6 = this.f60381;
                    }
                }
            }
            cArr[i] = readChar;
            objArr[i] = readObject;
            i4 = i5;
        }
    }
}

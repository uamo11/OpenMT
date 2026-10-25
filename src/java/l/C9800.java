package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: H1MW */
/* renamed from: l.ۢ᩵ᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9800 extends AbstractC12167 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC18559 f29625;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient Object[] f29626;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public transient int f29627;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final transient int f29628;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f29629;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int f29630;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient int f29631;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC1043 f29632;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f29633;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f29634;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC13305 f29635;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public transient int[] f29636;

    public C9800(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        this.f29633 = 0.75f;
        int m32765 = C13630.m32765(0.75f, i);
        this.f29627 = m32765;
        this.f29628 = m32765;
        this.f29631 = m32765 - 1;
        this.f29630 = C13630.m32772(0.75f, m32765);
        int i2 = this.f29627 + 1;
        this.f29626 = new Object[i2];
        this.f29636 = new int[i2];
    }

    public C9800() {
        this(16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int m24836(int i) {
        Object obj;
        int[] iArr = this.f29636;
        int i2 = iArr[i];
        this.f29629--;
        Object[] objArr = this.f29626;
        loop0: while (true) {
            int i3 = (i + 1) & this.f29631;
            while (true) {
                obj = objArr[i3];
                if (obj == null) {
                    break loop0;
                }
                int m32766 = C13630.m32766(obj.hashCode());
                int i4 = this.f29631;
                int i5 = m32766 & i4;
                if (i > i3) {
                    if (i >= i5 && i5 > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i4;
                } else if (i < i5 && i5 <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            objArr[i] = obj;
            iArr[i] = iArr[i3];
            i = i3;
        }
        objArr[i] = null;
        int i6 = this.f29627;
        if (i6 > this.f29628 && this.f29629 < this.f29630 / 4 && i6 > 16) {
            m24839(i6 / 2);
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m24831() {
        this.f29634 = false;
        Object[] objArr = this.f29626;
        int i = this.f29627;
        objArr[i] = null;
        int i2 = this.f29636[i];
        int i3 = this.f29629 - 1;
        this.f29629 = i3;
        if (i > this.f29628 && i3 < this.f29630 / 4 && i > 16) {
            m24839(i / 2);
        }
        return i2;
    }

    @Override // l.AbstractC12167, java.util.Map
    public final void putAll(Map map) {
        float f = this.f29633;
        if (f <= 0.5d) {
            int m32765 = C13630.m32765(f, map.size());
            if (m32765 > this.f29627) {
                m24839(m32765);
            }
        } else {
            int min = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil((map.size() + this.f29629) / f))));
            if (min > this.f29627) {
                m24839(min);
            }
        }
        super.putAll(map);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m24835(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f29634 ? this.f29627 : -(this.f29627 + 1);
        }
        Object[] objArr = this.f29626;
        int m32766 = C13630.m32766(obj.hashCode()) & this.f29631;
        Object obj3 = objArr[m32766];
        if (obj3 == null) {
            return -(m32766 + 1);
        }
        if (obj.equals(obj3)) {
            return m32766;
        }
        do {
            m32766 = (m32766 + 1) & this.f29631;
            obj2 = objArr[m32766];
            if (obj2 == null) {
                return -(m32766 + 1);
            }
        } while (!obj.equals(obj2));
        return m32766;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24832(int i, int i2, Object obj) {
        if (i == this.f29627) {
            this.f29634 = true;
        }
        this.f29626[i] = obj;
        this.f29636[i] = i2;
        int i3 = this.f29629;
        this.f29629 = i3 + 1;
        if (i3 >= this.f29630) {
            m24839(C13630.m32765(this.f29633, i3 + 2));
        }
    }

    @Override // l.AbstractC12872, l.InterfaceC21773
    /* renamed from: ֫ */
    public final int mo21965(int i, Object obj) {
        int m24835 = m24835(obj);
        if (m24835 < 0) {
            m24832((-m24835) - 1, i, obj);
            return 0;
        }
        int[] iArr = this.f29636;
        int i2 = iArr[m24835];
        iArr[m24835] = i;
        return i2;
    }

    @Override // l.AbstractC12872, l.InterfaceC21773
    /* renamed from: ֫ */
    public final int mo21966(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f29634) {
                return m24831();
            }
            return 0;
        }
        Object[] objArr = this.f29626;
        int m32766 = C13630.m32766(obj.hashCode()) & this.f29631;
        Object obj3 = objArr[m32766];
        if (obj3 == null) {
            return 0;
        }
        if (obj.equals(obj3)) {
            return m24836(m32766);
        }
        do {
            m32766 = (m32766 + 1) & this.f29631;
            obj2 = objArr[m32766];
            if (obj2 == null) {
                return 0;
            }
        } while (!obj.equals(obj2));
        return m24836(m32766);
    }

    @Override // l.InterfaceC21773
    /* renamed from: ۧ */
    public final int mo21968(Object obj) {
        Object obj2;
        if (obj == null) {
            if (this.f29634) {
                return this.f29636[this.f29627];
            }
            return 0;
        }
        Object[] objArr = this.f29626;
        int m32766 = C13630.m32766(obj.hashCode()) & this.f29631;
        Object obj3 = objArr[m32766];
        if (obj3 == null) {
            return 0;
        }
        if (obj.equals(obj3)) {
            return this.f29636[m32766];
        }
        do {
            m32766 = (m32766 + 1) & this.f29631;
            obj2 = objArr[m32766];
            if (obj2 == null) {
                return 0;
            }
        } while (!obj.equals(obj2));
        return this.f29636[m32766];
    }

    @Override // l.InterfaceC9893
    public final boolean containsKey(Object obj) {
        Object obj2;
        if (obj == null) {
            return this.f29634;
        }
        Object[] objArr = this.f29626;
        int m32766 = C13630.m32766(obj.hashCode()) & this.f29631;
        Object obj3 = objArr[m32766];
        if (obj3 == null) {
            return false;
        }
        if (!obj.equals(obj3)) {
            do {
                m32766 = (m32766 + 1) & this.f29631;
                obj2 = objArr[m32766];
                if (obj2 == null) {
                    return false;
                }
            } while (!obj.equals(obj2));
        }
        return true;
    }

    @Override // l.InterfaceC12600
    /* renamed from: ᩳ */
    public final boolean mo21969(int i) {
        Object[] objArr = this.f29626;
        int[] iArr = this.f29636;
        if (this.f29634 && iArr[this.f29627] == i) {
            return true;
        }
        int i2 = this.f29627;
        while (true) {
            int i3 = i2 - 1;
            if (i2 == 0) {
                return false;
            }
            if (objArr[i3] != null && iArr[i3] == i) {
                return true;
            }
            i2 = i3;
        }
    }

    @Override // l.AbstractC12167
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo24837(int i, String str) {
        Object obj;
        if (str == null) {
            if (this.f29634) {
                return this.f29636[this.f29627];
            }
        } else {
            Object[] objArr = this.f29626;
            int m32766 = C13630.m32766(str.hashCode()) & this.f29631;
            Object obj2 = objArr[m32766];
            if (obj2 != null) {
                if (str.equals(obj2)) {
                    return this.f29636[m32766];
                }
                do {
                    m32766 = (m32766 + 1) & this.f29631;
                    obj = objArr[m32766];
                    if (obj == null) {
                    }
                } while (!str.equals(obj));
                return this.f29636[m32766];
            }
        }
        return i;
    }

    @Override // l.AbstractC12167, l.InterfaceC12600
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo24838(String str, C14450 c14450) {
        int m24835 = m24835(str);
        if (m24835 >= 0) {
            return this.f29636[m24835];
        }
        int mo21968 = c14450.mo21968(str);
        m24832((-m24835) - 1, mo21968, str);
        return mo21968;
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f29629 == 0) {
            return;
        }
        this.f29629 = 0;
        this.f29634 = false;
        Arrays.fill(this.f29626, (Object) null);
    }

    @Override // l.AbstractC12872, l.InterfaceC9893
    public final int size() {
        return this.f29629;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f29629 == 0;
    }

    @Override // l.InterfaceC12600
    /* renamed from: ֫֫ */
    public final InterfaceC18559 mo21967() {
        if (this.f29635 == null) {
            this.f29635 = new C17560(this);
        }
        return this.f29635;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f29625 == null) {
            this.f29625 = new C11211(this);
        }
        return this.f29625;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f29632 == null) {
            this.f29632 = new C11895(this);
        }
        return this.f29632;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m24839(int i) {
        Object obj;
        Object[] objArr = this.f29626;
        int[] iArr = this.f29636;
        int i2 = i - 1;
        int i3 = i + 1;
        Object[] objArr2 = new Object[i3];
        int[] iArr2 = new int[i3];
        int i4 = this.f29627;
        int i5 = this.f29634 ? this.f29629 - 1 : this.f29629;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    obj = objArr[i4];
                } while (obj == null);
                int m32766 = C13630.m32766(obj.hashCode()) & i2;
                if (objArr2[m32766] != null) {
                    do {
                        m32766 = (m32766 + 1) & i2;
                    } while (objArr2[m32766] != null);
                }
                objArr2[m32766] = objArr[i4];
                iArr2[m32766] = iArr[i4];
                i5 = i6;
            } else {
                iArr2[i] = iArr[this.f29627];
                this.f29627 = i;
                this.f29631 = i2;
                this.f29630 = C13630.m32772(this.f29633, i);
                this.f29626 = objArr2;
                this.f29636 = iArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C9800 c9800 = (C9800) super.clone();
            c9800.f29625 = null;
            c9800.f29632 = null;
            c9800.f29635 = null;
            c9800.f29634 = this.f29634;
            c9800.f29626 = (Object[]) this.f29626.clone();
            c9800.f29636 = (int[]) this.f29636.clone();
            return c9800;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // l.AbstractC12167, java.util.Map
    public final int hashCode() {
        Object obj;
        Object[] objArr = this.f29626;
        int[] iArr = this.f29636;
        int i = this.f29634 ? this.f29629 - 1 : this.f29629;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i - 1;
            if (i == 0) {
                break;
            }
            while (true) {
                obj = objArr[i2];
                if (obj != null) {
                    break;
                }
                i2++;
            }
            if (this != obj) {
                i4 = obj.hashCode();
            }
            i4 ^= iArr[i2];
            i3 += i4;
            i2++;
            i = i5;
        }
        return this.f29634 ? i3 + iArr[this.f29627] : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        Object[] objArr = this.f29626;
        int[] iArr = this.f29636;
        C23183 c23183 = new C23183(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f29629;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int m35041 = c23183.m35041();
            objectOutputStream.writeObject(objArr[m35041]);
            objectOutputStream.writeInt(iArr[m35041]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        objectInputStream.defaultReadObject();
        int i2 = this.f29629;
        float f = this.f29633;
        int m32765 = C13630.m32765(f, i2);
        this.f29627 = m32765;
        this.f29630 = C13630.m32772(f, m32765);
        int i3 = this.f29627;
        this.f29631 = i3 - 1;
        Object[] objArr = new Object[i3 + 1];
        this.f29626 = objArr;
        int[] iArr = new int[i3 + 1];
        this.f29636 = iArr;
        int i4 = this.f29629;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            Object readObject = objectInputStream.readObject();
            int readInt = objectInputStream.readInt();
            if (readObject == null) {
                i = this.f29627;
                this.f29634 = true;
            } else {
                int m32766 = C13630.m32766(readObject.hashCode());
                int i6 = this.f29631;
                while (true) {
                    i = m32766 & i6;
                    if (objArr[i] != null) {
                        m32766 = i + 1;
                        i6 = this.f29631;
                    }
                }
            }
            objArr[i] = readObject;
            iArr[i] = readInt;
            i4 = i5;
        }
    }
}

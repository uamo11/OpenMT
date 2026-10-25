package l;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Map;

/* compiled from: K9H */
/* renamed from: l.᩷᩻ᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C21214 extends AbstractC4092 implements Cloneable {
    public static final long serialVersionUID = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public transient int f68345;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11606 f68346;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f68347;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public transient int f68348;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public transient float[] f68349;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final transient int f68350;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public transient int f68351;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient int[] f68352;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public transient boolean f68353;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public transient InterfaceC4713 f68354;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public transient InterfaceC11169 f68355;

    public C21214() {
        int m32765 = C13630.m32765(0.75f, 16);
        this.f68348 = m32765;
        this.f68350 = m32765;
        this.f68345 = m32765 - 1;
        this.f68351 = C13630.m32772(0.75f, m32765);
        int i = this.f68348 + 1;
        this.f68352 = new int[i];
        this.f68349 = new float[i];
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float m48158(int i) {
        int i2;
        float[] fArr = this.f68349;
        float f = fArr[i];
        this.f68347--;
        int[] iArr = this.f68352;
        loop0: while (true) {
            int i3 = (i + 1) & this.f68345;
            while (true) {
                i2 = iArr[i3];
                if (i2 == 0) {
                    break loop0;
                }
                int m32766 = C13630.m32766(i2);
                int i4 = this.f68345;
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
            iArr[i] = i2;
            fArr[i] = fArr[i3];
            i = i3;
        }
        iArr[i] = 0;
        int i6 = this.f68348;
        if (i6 > this.f68350 && this.f68347 < this.f68351 / 4 && i6 > 16) {
            m48160(i6 / 2);
        }
        return f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float m48155() {
        this.f68353 = false;
        float[] fArr = this.f68349;
        int i = this.f68348;
        float f = fArr[i];
        int i2 = this.f68347 - 1;
        this.f68347 = i2;
        if (i > this.f68350 && i2 < this.f68351 / 4 && i > 16) {
            m48160(i / 2);
        }
        return f;
    }

    @Override // l.AbstractC4092, java.util.Map
    public final void putAll(Map map) {
        if (0.75f <= 0.5d) {
            int m32765 = C13630.m32765(0.75f, map.size());
            if (m32765 > this.f68348) {
                m48160(m32765);
            }
        } else {
            int min = (int) Math.min(1073741824L, Math.max(2L, C13630.m32768((long) Math.ceil((map.size() + this.f68347) / 0.75f))));
            if (min > this.f68348) {
                m48160(min);
            }
        }
        super.putAll(map);
    }

    @Override // l.AbstractC2681, l.InterfaceC8241
    /* renamed from: ֫ */
    public final float mo8401(float f, int i) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = this.f68353 ? this.f68348 : -(this.f68348 + 1);
        } else {
            int[] iArr = this.f68352;
            int m32766 = C13630.m32766(i) & this.f68345;
            int i4 = iArr[m32766];
            if (i4 != 0) {
                if (i != i4) {
                    do {
                        m32766 = (m32766 + 1) & this.f68345;
                        i3 = iArr[m32766];
                        if (i3 == 0) {
                        }
                    } while (i != i3);
                }
                i2 = m32766;
            }
            i2 = -(m32766 + 1);
            break;
        }
        if (i2 < 0) {
            int i5 = (-i2) - 1;
            if (i5 == this.f68348) {
                this.f68353 = true;
            }
            this.f68352[i5] = i;
            this.f68349[i5] = f;
            int i6 = this.f68347;
            this.f68347 = i6 + 1;
            if (i6 < this.f68351) {
                return 0.0f;
            }
            m48160(C13630.m32765(0.75f, i6 + 2));
            return 0.0f;
        }
        float[] fArr = this.f68349;
        float f2 = fArr[i2];
        fArr[i2] = f;
        return f2;
    }

    @Override // l.AbstractC2681, l.InterfaceC8241
    public final float remove(int i) {
        int i2;
        if (i == 0) {
            if (this.f68353) {
                return m48155();
            }
            return 0.0f;
        }
        int[] iArr = this.f68352;
        int m32766 = C13630.m32766(i) & this.f68345;
        int i3 = iArr[m32766];
        if (i3 == 0) {
            return 0.0f;
        }
        if (i == i3) {
            return m48158(m32766);
        }
        do {
            m32766 = (m32766 + 1) & this.f68345;
            i2 = iArr[m32766];
            if (i2 == 0) {
                return 0.0f;
            }
        } while (i != i2);
        return m48158(m32766);
    }

    @Override // l.InterfaceC8241
    public final float get(int i) {
        int i2;
        if (i == 0) {
            if (this.f68353) {
                return this.f68349[this.f68348];
            }
            return 0.0f;
        }
        int[] iArr = this.f68352;
        int m32766 = C13630.m32766(i) & this.f68345;
        int i3 = iArr[m32766];
        if (i3 == 0) {
            return 0.0f;
        }
        if (i == i3) {
            return this.f68349[m32766];
        }
        do {
            m32766 = (m32766 + 1) & this.f68345;
            i2 = iArr[m32766];
            if (i2 == 0) {
                return 0.0f;
            }
        } while (i != i2);
        return this.f68349[m32766];
    }

    @Override // l.InterfaceC8241
    /* renamed from: ֫ */
    public final boolean mo21825(int i) {
        int i2;
        if (i == 0) {
            return this.f68353;
        }
        int[] iArr = this.f68352;
        int m32766 = C13630.m32766(i) & this.f68345;
        int i3 = iArr[m32766];
        if (i3 == 0) {
            return false;
        }
        if (i != i3) {
            do {
                m32766 = (m32766 + 1) & this.f68345;
                i2 = iArr[m32766];
                if (i2 == 0) {
                    return false;
                }
            } while (i != i2);
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48159(float f) {
        int[] iArr = this.f68352;
        float[] fArr = this.f68349;
        if (this.f68353 && Float.floatToRawIntBits(fArr[this.f68348]) == Float.floatToRawIntBits(f)) {
            return true;
        }
        int i = this.f68348;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (iArr[i2] != 0 && Float.floatToRawIntBits(fArr[i2]) == Float.floatToRawIntBits(f)) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map
    public final void clear() {
        if (this.f68347 == 0) {
            return;
        }
        this.f68347 = 0;
        this.f68353 = false;
        Arrays.fill(this.f68352, 0);
    }

    @Override // l.InterfaceC9893
    public final int size() {
        return this.f68347;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f68347 == 0;
    }

    @Override // l.InterfaceC3302
    /* renamed from: ۨ */
    public final InterfaceC18559 mo10099() {
        if (this.f68354 == null) {
            this.f68354 = new C18391(this);
        }
        return this.f68354;
    }

    @Override // java.util.Map
    public final InterfaceC11606 keySet() {
        if (this.f68346 == null) {
            this.f68346 = new C2163(this);
        }
        return this.f68346;
    }

    @Override // java.util.Map
    public final InterfaceC11169 values() {
        if (this.f68355 == null) {
            this.f68355 = new C6124(this);
        }
        return this.f68355;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m48160(int i) {
        int i2;
        int[] iArr = this.f68352;
        float[] fArr = this.f68349;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        float[] fArr2 = new float[i4];
        int i5 = this.f68348;
        int i6 = this.f68353 ? this.f68347 - 1 : this.f68347;
        while (true) {
            int i7 = i6 - 1;
            if (i6 != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int m32766 = C13630.m32766(i2) & i3;
                if (iArr2[m32766] != 0) {
                    do {
                        m32766 = (m32766 + 1) & i3;
                    } while (iArr2[m32766] != 0);
                }
                iArr2[m32766] = iArr[i5];
                fArr2[m32766] = fArr[i5];
                i6 = i7;
            } else {
                fArr2[i] = fArr[this.f68348];
                this.f68348 = i;
                this.f68345 = i3;
                this.f68351 = C13630.m32772(0.75f, i);
                this.f68352 = iArr2;
                this.f68349 = fArr2;
                return;
            }
        }
    }

    public final Object clone() {
        try {
            C21214 c21214 = (C21214) super.clone();
            c21214.f68346 = null;
            c21214.f68355 = null;
            c21214.f68354 = null;
            c21214.f68353 = this.f68353;
            c21214.f68352 = (int[]) this.f68352.clone();
            c21214.f68349 = (float[]) this.f68349.clone();
            return c21214;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i;
        int[] iArr = this.f68352;
        float[] fArr = this.f68349;
        int i2 = this.f68353 ? this.f68347 - 1 : this.f68347;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i2 - 1;
            if (i2 == 0) {
                break;
            }
            while (true) {
                i = iArr[i4];
                if (i == 0) {
                    i4++;
                }
            }
            i3 += i ^ Float.floatToRawIntBits(fArr[i4]);
            i4++;
            i2 = i5;
        }
        return this.f68353 ? Float.floatToRawIntBits(fArr[this.f68348]) + i3 : i3;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int[] iArr = this.f68352;
        float[] fArr = this.f68349;
        C11769 c11769 = new C11769(this);
        objectOutputStream.defaultWriteObject();
        int i = this.f68347;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            int m41419 = c11769.m41419();
            objectOutputStream.writeInt(iArr[m41419]);
            objectOutputStream.writeFloat(fArr[m41419]);
            i = i2;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        objectInputStream.defaultReadObject();
        int m32765 = C13630.m32765(0.75f, this.f68347);
        this.f68348 = m32765;
        this.f68351 = C13630.m32772(0.75f, m32765);
        int i2 = this.f68348;
        this.f68345 = i2 - 1;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        this.f68352 = iArr;
        float[] fArr = new float[i3];
        this.f68349 = fArr;
        int i4 = this.f68347;
        while (true) {
            int i5 = i4 - 1;
            if (i4 == 0) {
                return;
            }
            int readInt = objectInputStream.readInt();
            float readFloat = objectInputStream.readFloat();
            if (readInt == 0) {
                i = this.f68348;
                this.f68353 = true;
            } else {
                int m32766 = C13630.m32766(readInt);
                int i6 = this.f68345;
                while (true) {
                    i = m32766 & i6;
                    if (iArr[i] != 0) {
                        m32766 = i + 1;
                        i6 = this.f68345;
                    }
                }
            }
            iArr[i] = readInt;
            fArr[i] = readFloat;
            i4 = i5;
        }
    }
}

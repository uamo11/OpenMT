package l;

import java.util.ArrayList;

/* compiled from: 06PW */
/* renamed from: l.ᩴ᩹ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19055 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f60023;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f60024;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12951 f60025;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f60027 = new ArrayList();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f60026 = new Object();

    public C19055(C12951 c12951) {
        this.f60025 = c12951;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m43914() {
        int i;
        C12951 c12951 = this.f60025;
        int readInt = c12951.readInt();
        int readInt2 = c12951.readInt();
        if (readInt < 8 || readInt > 65536 || (readInt & 1) != 0 || readInt2 < 4 || readInt2 > 256 || (readInt2 & 1) != 0 || ((i = this.f60023) != 0 && (i != readInt || this.f60024 != readInt2))) {
            throw new IllegalArgumentException("Invalid text graph configuration");
        }
        this.f60023 = readInt;
        this.f60024 = readInt2;
        return new C11999(m43913(0), readInt, readInt2, null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC20466 m43913(int i) {
        AbstractC20466 c23993;
        if (i > 32) {
            throw new IllegalArgumentException("Text graph is too deep");
        }
        C12951 c12951 = this.f60025;
        int readInt = c12951.readInt();
        if (readInt == -1) {
            return null;
        }
        if (readInt >= 0) {
            ArrayList arrayList = this.f60027;
            if (readInt <= arrayList.size()) {
                if (readInt < arrayList.size()) {
                    AbstractC20466 abstractC20466 = (AbstractC20466) arrayList.get(readInt);
                    if (abstractC20466 != null) {
                        return abstractC20466;
                    }
                    throw new IllegalArgumentException("Cyclic text graph");
                }
                arrayList.add(null);
                int readByte = c12951.readByte() & 255;
                int readInt2 = c12951.readInt();
                Object obj = this.f60026;
                if (readByte == 1) {
                    int readByte2 = c12951.readByte() & 255;
                    if (readInt2 >= 1 && readInt2 <= this.f60023 && readByte2 <= 1) {
                        if (readInt2 * (readByte2 == 1 ? 1 : 2) <= c12951.available()) {
                            char[] cArr = new char[readInt2];
                            for (int i2 = 0; i2 < readInt2; i2++) {
                                cArr[i2] = readByte2 == 1 ? (char) (c12951.readByte() & 255) : c12951.m31507();
                            }
                            c23993 = new C21877(obj, this.f60023, cArr, 0, readInt2, null);
                        }
                    }
                    throw new IllegalArgumentException("Invalid text page length");
                }
                if (readByte == 2) {
                    if (readInt2 < 2 || readInt2 > this.f60024 || readInt2 > c12951.available() / 4) {
                        throw new IllegalArgumentException("Invalid text branch size");
                    }
                    AbstractC20466[] abstractC20466Arr = new AbstractC20466[readInt2];
                    for (int i3 = 0; i3 < readInt2; i3++) {
                        AbstractC20466 m43913 = m43913(i + 1);
                        abstractC20466Arr[i3] = m43913;
                        if (m43913 == null || (i3 > 0 && m43913.f65975 != abstractC20466Arr[0].f65975)) {
                            throw new IllegalArgumentException("Invalid text branch height");
                        }
                    }
                    c23993 = new C23993(obj, abstractC20466Arr);
                } else {
                    throw new IllegalArgumentException("Invalid text node type");
                }
                arrayList.set(readInt, c23993);
                return c23993;
            }
        }
        throw new IllegalArgumentException("Invalid text node identity");
    }
}

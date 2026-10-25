package l;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: Z6QT */
/* renamed from: l.ܰ֨ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13491 implements InterfaceC10795 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f40280;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f40281;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int[] f40282;

    @Override // l.InterfaceC10795
    /* renamed from: ֫ */
    public final /* synthetic */ InterfaceC10795 mo2464(InterfaceC10795 interfaceC10795) {
        return C1622.m5502(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    /* renamed from: ۧ */
    public final /* synthetic */ InterfaceC10795 mo2466(InterfaceC10795 interfaceC10795) {
        return C1622.m5503(this, interfaceC10795);
    }

    @Override // l.InterfaceC10795
    public final C7679 negate() {
        C5855 c5855 = C14403.f44164;
        return C7679.m20568(this);
    }

    public C13491(int[] iArr, int[] iArr2, int[] iArr3) {
        this.f40282 = iArr;
        this.f40280 = iArr2;
        this.f40281 = iArr3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10795 m32523(ArrayList arrayList, boolean z) {
        int[] iArr;
        int[] iArr2;
        int i = 0;
        if (arrayList.size() == 1) {
            int[] iArr3 = (int[]) arrayList.get(0);
            iArr = new int[]{iArr3[0], iArr3[1]};
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList);
            C6083.sort(arrayList2, new C22664());
            ArrayList arrayList3 = new ArrayList();
            int[] iArr4 = (int[]) ((int[]) arrayList2.get(0)).clone();
            for (int i2 = 1; i2 < arrayList2.size(); i2++) {
                int[] iArr5 = (int[]) arrayList2.get(i2);
                int i3 = iArr5[0];
                int i4 = iArr4[1];
                if (i3 <= i4 + 1) {
                    iArr4[1] = Math.max(i4, iArr5[1]);
                } else {
                    arrayList3.add(iArr4);
                    iArr4 = (int[]) iArr5.clone();
                }
            }
            arrayList3.add(iArr4);
            int[] iArr6 = new int[arrayList3.size() * 2];
            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                int i6 = i5 * 2;
                iArr6[i6] = ((int[]) arrayList3.get(i5))[0];
                iArr6[i6 + 1] = ((int[]) arrayList3.get(i5))[1];
            }
            iArr = iArr6;
        }
        for (int i7 = 1; i7 < iArr.length; i7 += 2) {
            i = Math.max(i, iArr[i7]);
        }
        iArr2 = C14403.f44163;
        int[] m32526 = m32526(iArr2, iArr);
        int[] m325262 = i >= 65536 ? m32526(C2909.f9269, iArr) : null;
        if (i < 65536 && !z && !C4320.f13910) {
            return new C5731(iArr, m32526);
        }
        return new C13491(iArr, m32526, m325262);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m32526(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[64];
        int i = 0;
        for (int i2 : iArr) {
            if (!m32524(i2, iArr2)) {
                int upperCase = Character.toUpperCase(i2);
                if (m32524(upperCase, iArr2) || m32524(Character.toLowerCase(upperCase), iArr2)) {
                    if (i == iArr3.length) {
                        iArr3 = Arrays.copyOf(iArr3, i * 2);
                    }
                    iArr3[i] = i2;
                    i++;
                }
            }
        }
        return Arrays.copyOf(iArr3, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m32524(int i, int[] iArr) {
        int length = (iArr.length / 2) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = i3 * 2;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            if (i < i5) {
                length = i3 - 1;
            } else {
                if (i <= i6) {
                    return true;
                }
                i2 = i3 + 1;
            }
        }
        return false;
    }

    @Override // l.InterfaceC10795
    /* renamed from: ֫ */
    public final boolean mo2465(int i) {
        int[] iArr = this.f40282;
        if (m32524(i, iArr)) {
            return true;
        }
        if (i < 65536) {
            return m32525(this.f40280, i);
        }
        int[] iArr2 = this.f40281;
        if (iArr2 != null) {
            return m32525(iArr2, i);
        }
        int upperCase = Character.toUpperCase(i);
        return m32524(upperCase, iArr) || m32524(Character.toLowerCase(upperCase), iArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m32525(int[] iArr, int i) {
        if (iArr.length > 16) {
            return Arrays.binarySearch(iArr, i) >= 0;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
            if (i2 > i) {
                return false;
            }
        }
        return false;
    }
}

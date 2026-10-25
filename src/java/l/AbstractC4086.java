package l;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: R8K8 */
/* renamed from: l.ۘܿۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC4086 extends AbstractC5497 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Pair mo12283(C2675 c2675, int[][][] iArr, int[] iArr2, C15894 c15894, AbstractC4846 abstractC4846);

    @Override // l.AbstractC5497
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo12285(Object obj) {
    }

    @Override // l.AbstractC5497
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1263 mo12284(InterfaceC18065[] interfaceC18065Arr, C6181 c6181, C15894 c15894, AbstractC4846 abstractC4846) {
        boolean z;
        int[] iArr;
        C6181 c61812 = c6181;
        int[] iArr2 = new int[interfaceC18065Arr.length + 1];
        int length = interfaceC18065Arr.length + 1;
        C13312[][] c13312Arr = new C13312[length][];
        int[][][] iArr3 = new int[interfaceC18065Arr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i2 = c61812.f18978;
            c13312Arr[i] = new C13312[i2];
            iArr3[i] = new int[i2][];
        }
        int length2 = interfaceC18065Arr.length;
        int[] iArr4 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr4[i3] = interfaceC18065Arr[i3].mo14368();
        }
        int i4 = 0;
        while (i4 < c61812.f18978) {
            C13312 m17102 = c61812.m17102(i4);
            int i5 = m17102.f39853;
            int i6 = m17102.f39854;
            boolean z2 = i5 == 5;
            int length3 = interfaceC18065Arr.length;
            int i7 = 0;
            int i8 = 0;
            boolean z3 = true;
            while (i7 < interfaceC18065Arr.length) {
                InterfaceC18065 interfaceC18065 = interfaceC18065Arr[i7];
                int i9 = 0;
                int i10 = 0;
                while (i10 < i6) {
                    i9 = Math.max(i9, interfaceC18065.mo16568(m17102.m32295(i10)) & 7);
                    i10++;
                    iArr4 = iArr4;
                }
                int[] iArr5 = iArr4;
                boolean z4 = iArr2[i7] == 0;
                if (i9 > i8 || (i9 == i8 && z2 && !z3 && z4)) {
                    z3 = z4;
                    length3 = i7;
                    i8 = i9;
                }
                i7++;
                iArr4 = iArr5;
            }
            int[] iArr6 = iArr4;
            if (length3 == interfaceC18065Arr.length) {
                iArr = new int[i6];
            } else {
                InterfaceC18065 interfaceC180652 = interfaceC18065Arr[length3];
                int[] iArr7 = new int[i6];
                for (int i11 = 0; i11 < i6; i11++) {
                    iArr7[i11] = interfaceC180652.mo16568(m17102.m32295(i11));
                }
                iArr = iArr7;
            }
            int i12 = iArr2[length3];
            c13312Arr[length3][i12] = m17102;
            iArr3[length3][i12] = iArr;
            iArr2[length3] = i12 + 1;
            i4++;
            c61812 = c6181;
            iArr4 = iArr6;
        }
        int[] iArr8 = iArr4;
        C6181[] c6181Arr = new C6181[interfaceC18065Arr.length];
        String[] strArr = new String[interfaceC18065Arr.length];
        int[] iArr9 = new int[interfaceC18065Arr.length];
        for (int i13 = 0; i13 < interfaceC18065Arr.length; i13++) {
            int i14 = iArr2[i13];
            c6181Arr[i13] = new C6181((C13312[]) C3603.m11033(i14, c13312Arr[i13]));
            iArr3[i13] = (int[][]) C3603.m11033(i14, iArr3[i13]);
            strArr[i13] = interfaceC18065Arr[i13].getName();
            iArr9[i13] = ((AbstractC4930) interfaceC18065Arr[i13]).mo6092();
        }
        C2675 c2675 = new C2675(iArr9, c6181Arr, iArr8, iArr3, new C6181((C13312[]) C3603.m11033(iArr2[interfaceC18065Arr.length], c13312Arr[interfaceC18065Arr.length])));
        Pair mo12283 = mo12283(c2675, iArr3, iArr8, c15894, abstractC4846);
        InterfaceC18903[] interfaceC18903Arr = (InterfaceC18903[]) mo12283.second;
        List[] listArr = new List[interfaceC18903Arr.length];
        for (int i15 = 0; i15 < interfaceC18903Arr.length; i15++) {
            InterfaceC18903 interfaceC18903 = interfaceC18903Arr[i15];
            listArr[i15] = interfaceC18903 != null ? AbstractC14545.of((Object) interfaceC18903) : AbstractC14545.of();
        }
        C1846 c1846 = new C1846();
        for (int i16 = 0; i16 < c2675.m8370(); i16++) {
            C6181 m8375 = c2675.m8375(i16);
            List list = listArr[i16];
            for (int i17 = 0; i17 < m8375.f18978; i17++) {
                C13312 m171022 = m8375.m17102(i17);
                boolean z5 = c2675.m8372(i16, i17) != 0;
                int i18 = m171022.f39854;
                int[] iArr10 = new int[i18];
                boolean[] zArr = new boolean[i18];
                for (int i19 = 0; i19 < m171022.f39854; i19++) {
                    iArr10[i19] = c2675.m8373(i16, i17, i19);
                    int i20 = 0;
                    while (true) {
                        if (i20 >= list.size()) {
                            z = false;
                            break;
                        }
                        InterfaceC18903 interfaceC189032 = (InterfaceC18903) list.get(i20);
                        if (interfaceC189032.mo2388().equals(m171022) && interfaceC189032.indexOf(i19) != -1) {
                            z = true;
                            break;
                        }
                        i20++;
                    }
                    zArr[i19] = z;
                }
                c1846.m16264(new C23190(m171022, z5, iArr10, zArr));
            }
        }
        C6181 m8374 = c2675.m8374();
        for (int i21 = 0; i21 < m8374.f18978; i21++) {
            C13312 m171023 = m8374.m17102(i21);
            int[] iArr11 = new int[m171023.f39854];
            Arrays.fill(iArr11, 0);
            c1846.m16264(new C23190(m171023, false, iArr11, new boolean[m171023.f39854]));
        }
        return new C1263((C17359[]) mo12283.first, (InterfaceC9731[]) mo12283.second, new C14017(c1846.m6131()), c2675);
    }
}

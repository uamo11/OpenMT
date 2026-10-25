package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;

/* compiled from: 16VB */
/* renamed from: l.ᩳ֡ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17704 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] f54177;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f54178;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f54179;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f54180;

    public C17704(int i, int i2, Object[] objArr) {
        this.f54177 = objArr;
        this.f54179 = i;
        this.f54178 = i2;
        int i3 = 1;
        int i4 = 0;
        for (Object obj : objArr) {
            if (obj instanceof int[]) {
                i3 = Math.max(i3, ((int[]) obj).length);
            }
        }
        long j = i3 * i2;
        if (i2 <= 64 && j <= ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) {
            i4 = (int) ((j / 64) + 1);
        }
        this.f54180 = i4;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17704 m41434(C12910 c12910) {
        int i;
        int i2;
        C5855 c5855;
        C5855 c58552;
        C11355 c11355;
        C5855 c58553;
        C5855[] c5855Arr;
        int i3;
        C5855 c58554;
        C5855 c58555;
        C0916 c0916;
        int[] iArr;
        if (c12910 == null) {
            return null;
        }
        int i4 = c12910.f38735;
        if (c12910.getClass() != C12910.class || c12910.f38740 != -1 || (i = c12910.f38738) < 0 || c12910.f38739 < i || c12910.f17958 == null || i4 < 0 || (i2 = c12910.f38736) < 0 || i4 == i2 || (c5855 = c12910.f38737) == null || c5855.getClass() != C5150.class) {
            return null;
        }
        C5150 c5150 = (C5150) c12910.f38737;
        boolean z = c5150.f16093;
        int i5 = c5150.f16092;
        if (!z || i5 != i4 || (c58552 = c5150.f17958) == null || c58552.getClass() != C11355.class || (c58553 = (c11355 = (C11355) c5150.f17958).f33991) == null || c58553.getClass() != C22643.class || (c5855Arr = c11355.f33989) == null || (i3 = c11355.f33990) < 2 || i3 > c5855Arr.length || (c58555 = (c58554 = c11355.f33991).f17958) == null || c58555.getClass() != C0916.class || c5150.f16094 != (c0916 = (C0916) c58554.f17958) || !c0916.f3504 || c0916.f3502 != 0 || c0916.f3503 != i5 || c0916.f17958 != c12910) {
            return null;
        }
        Object[] objArr = new Object[c11355.f33990];
        for (int i6 = 0; i6 < c11355.f33990; i6++) {
            C5855 c58556 = c11355.f33989[i6];
            if (c58556 == null || c58556.f17958 != c58554) {
                return null;
            }
            if (c58556.getClass() == C19822.class) {
                InterfaceC10795 interfaceC10795 = ((C23494) c58556).f75432;
                if (interfaceC10795 == null) {
                    return null;
                }
                objArr[i6] = interfaceC10795;
            } else {
                if (c58556.getClass() != C9259.class || (iArr = ((C9259) c58556).f7231) == null || iArr.length == 0) {
                    return null;
                }
                for (int i7 : iArr) {
                    if (i7 < 0 || i7 > 65535) {
                        return null;
                    }
                }
                objArr[i6] = iArr.clone();
            }
        }
        return new C17704(c12910.f38738, c12910.f38739, objArr);
    }
}

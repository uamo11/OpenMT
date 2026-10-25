package l;

import java.util.Arrays;

/* compiled from: TASN */
/* renamed from: l.᩵᩻֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19787 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f63904;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19081[] f63905;

    public C19787(InterfaceC19081[] interfaceC19081Arr) {
        this.f63905 = interfaceC19081Arr;
        int i = 0;
        for (InterfaceC19081 interfaceC19081 : interfaceC19081Arr) {
            i = C2093.m6874(i, interfaceC19081);
        }
        this.f63904 = C2093.m6873(i, interfaceC19081Arr.length);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19787 m45482(C19787 c19787, InterfaceC19081 interfaceC19081) {
        if (c19787 == null) {
            return new C19787(new InterfaceC19081[]{interfaceC19081});
        }
        InterfaceC19081[] interfaceC19081Arr = c19787.f63905;
        InterfaceC19081[] interfaceC19081Arr2 = (InterfaceC19081[]) Arrays.copyOf(interfaceC19081Arr, interfaceC19081Arr.length + 1);
        interfaceC19081Arr2[interfaceC19081Arr2.length - 1] = interfaceC19081;
        return new C19787(interfaceC19081Arr2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19787 m45483(int i) {
        InterfaceC19081[] interfaceC19081Arr = null;
        int i2 = 0;
        while (true) {
            InterfaceC19081[] interfaceC19081Arr2 = this.f63905;
            if (i2 >= interfaceC19081Arr2.length) {
                break;
            }
            if (interfaceC19081Arr2[i2].mo4951() && !(interfaceC19081Arr2[i2] instanceof C8497)) {
                if (interfaceC19081Arr == null) {
                    interfaceC19081Arr = (InterfaceC19081[]) interfaceC19081Arr2.clone();
                }
                interfaceC19081Arr[i2] = new C8497(i, interfaceC19081Arr2[i2]);
            }
            i2++;
        }
        return interfaceC19081Arr == null ? this : new C19787(interfaceC19081Arr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45484(AbstractC23747 abstractC23747, InterfaceC23125 interfaceC23125, int i) {
        int index = interfaceC23125.index();
        boolean z = false;
        try {
            boolean z2 = false;
            for (InterfaceC19081 interfaceC19081 : this.f63905) {
                try {
                    if (interfaceC19081 instanceof C8497) {
                        int m22193 = ((C8497) interfaceC19081).m22193() + i;
                        interfaceC23125.mo6201(m22193);
                        interfaceC19081 = ((C8497) interfaceC19081).m22192();
                        if (m22193 != index) {
                            z2 = true;
                        }
                        z2 = false;
                    } else if (interfaceC19081.mo4951()) {
                        interfaceC23125.mo6201(index);
                        z2 = false;
                    }
                    interfaceC19081.mo4950(abstractC23747);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC23125.mo6201(index);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC23125.mo6201(index);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final int hashCode() {
        return this.f63904;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19787)) {
            return false;
        }
        C19787 c19787 = (C19787) obj;
        return this.f63904 == c19787.f63904 && Arrays.equals(this.f63905, c19787.f63905);
    }
}

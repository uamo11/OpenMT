package l;

import java.util.Arrays;
import java.util.IdentityHashMap;

/* compiled from: Q6Q0 */
/* renamed from: l.ܽ۫ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16639 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f51095 = new IdentityHashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f51096 = new int[24];

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f51097;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39171(C8931 c8931) {
        if ((c8931 instanceof C9317) || (c8931 instanceof C4419) || (c8931 instanceof C10728) || (c8931 instanceof C12139)) {
            this.f51095.put(c8931, new C10996(0));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39172(C8931 c8931, InterfaceC0463 interfaceC0463) {
        boolean z = c8931 instanceof C22017;
        if (z || (c8931 instanceof C9317) || (c8931 instanceof C4419)) {
            C10996 c10996 = (C10996) this.f51095.get(z ? c8931.f63075 : c8931);
            if (c10996 == null) {
                return;
            }
            if (interfaceC0463.getType() == 45) {
                c10996.f33061 = (byte) (c10996.f33061 | 1);
            }
            if (interfaceC0463.getType() != 127 || (c8931 instanceof C4419)) {
                return;
            }
            c10996.f33061 = (byte) (c10996.f33061 | 2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39169(int i, int i2, byte b) {
        if (i < 0 || i2 <= i) {
            return;
        }
        int i3 = this.f51097 + 3;
        int[] iArr = this.f51096;
        if (i3 > iArr.length) {
            this.f51096 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f51096;
        int i4 = this.f51097;
        int i5 = i4 + 1;
        this.f51097 = i5;
        iArr2[i4] = i;
        int i6 = i4 + 2;
        this.f51097 = i6;
        iArr2[i5] = i2;
        this.f51097 = i4 + 3;
        iArr2[i6] = b;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18051 m39170(int i) {
        byte[] bArr;
        byte[] bArr2;
        C18051 c18051 = new C18051(i);
        int i2 = this.f51097;
        while (true) {
            i2 -= 3;
            if (i2 < 0) {
                return c18051;
            }
            C18757.m43430();
            int max = Math.max(0, this.f51096[i2]);
            bArr = c18051.f56258;
            int min = Math.min(bArr.length, this.f51096[i2 + 1]);
            if (min > max) {
                bArr2 = c18051.f56258;
                Arrays.fill(bArr2, max, min, (byte) this.f51096[i2 + 2]);
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39173(C8931 c8931) {
        InterfaceC0463 interfaceC0463;
        C8931 c89312 = c8931.f63075;
        IdentityHashMap identityHashMap = this.f51095;
        C10996 c10996 = (C10996) identityHashMap.get(c89312);
        if (c10996 != null && (interfaceC0463 = c8931.f27156) != null && c8931.f27155 != null) {
            int mo2054 = interfaceC0463.mo2054();
            int mo2053 = c8931.f27155.mo2053() + 1;
            if (c8931 instanceof C5789) {
                c10996.f33063 = mo2054;
                c10996.f33059 = mo2053;
            }
            if (c8931 instanceof C13590) {
                c10996.f33062 = mo2054;
                c10996.f33060 = mo2053;
            }
            if (c8931 instanceof C3008) {
                c10996.f33058 = mo2054;
                c10996.f33057 = mo2053;
            }
        }
        C10996 c109962 = (C10996) identityHashMap.remove(c8931);
        if (c109962 == null) {
            return;
        }
        if ((c8931 instanceof C9317) || (c8931 instanceof C4419)) {
            InterfaceC0463 interfaceC04632 = c8931.f27156;
            if (interfaceC04632 == null || c8931.f27155 == null) {
                return;
            }
            m39169(interfaceC04632.mo2054(), c8931.f27155.mo2053() + 1, c109962.f33061);
            return;
        }
        boolean z = c8931 instanceof C10728;
        if (z || c109962.f33063 >= 0) {
            m39169(c109962.f33063, c109962.f33059, c109962.f33061);
            m39169(c109962.f33062, c109962.f33060, c109962.f33061);
            if (z) {
                m39169(c109962.f33058, c109962.f33057, (byte) 0);
            }
        }
    }
}

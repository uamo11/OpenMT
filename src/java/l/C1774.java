package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: 04FP */
/* renamed from: l.֫ۧ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1774 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6171 f6146;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6151 = new ArrayList();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7150[] f6145 = new C7150[8];

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f6152 = 7;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f6149 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6147 = 0;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f6150 = 4096;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f6148 = 4096;

    public C1774(InterfaceC1274 interfaceC1274) {
        this.f6146 = C23852.m52567(interfaceC1274);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m5919(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f6145.length;
            while (true) {
                length--;
                i2 = this.f6152;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f6145[length].f21947;
                i -= i4;
                this.f6147 -= i4;
                this.f6149--;
                i3++;
            }
            C7150[] c7150Arr = this.f6145;
            System.arraycopy(c7150Arr, i2 + 1, c7150Arr, i2 + 1 + i3, this.f6149);
            this.f6152 += i3;
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        throw new java.io.IOException("Invalid dynamic table size update " + r5.f6148);
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5925() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1774.m5925():void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m5923() {
        ArrayList arrayList = this.f6151;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        return arrayList2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C11816 m5921(int i) {
        if (i >= 0) {
            C7150[] c7150Arr = C16590.f50987;
            if (i <= c7150Arr.length - 1) {
                return c7150Arr[i].f21948;
            }
        }
        int length = this.f6152 + 1 + (i - C16590.f50987.length);
        if (length >= 0) {
            C7150[] c7150Arr2 = this.f6145;
            if (length < c7150Arr2.length) {
                return c7150Arr2[length].f21948;
            }
        }
        throw new IOException("Header index too large " + (i + 1));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5920(C7150 c7150) {
        this.f6151.add(c7150);
        int i = c7150.f21947;
        int i2 = this.f6148;
        if (i > i2) {
            Arrays.fill(this.f6145, (Object) null);
            this.f6152 = this.f6145.length - 1;
            this.f6149 = 0;
            this.f6147 = 0;
            return;
        }
        m5919((this.f6147 + i) - i2);
        int i3 = this.f6149 + 1;
        C7150[] c7150Arr = this.f6145;
        if (i3 > c7150Arr.length) {
            C7150[] c7150Arr2 = new C7150[c7150Arr.length * 2];
            System.arraycopy(c7150Arr, 0, c7150Arr2, c7150Arr.length, c7150Arr.length);
            this.f6152 = this.f6145.length - 1;
            this.f6145 = c7150Arr2;
        }
        int i4 = this.f6152;
        this.f6152 = i4 - 1;
        this.f6145[i4] = c7150;
        this.f6149++;
        this.f6147 += i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m5922(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte readByte = this.f6146.readByte();
            int i5 = readByte & 255;
            if ((readByte & GCMSIVBlockCipher.MASK) == 0) {
                return i2 + (i5 << i4);
            }
            i2 += (readByte & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i4;
            i4 += 7;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11816 m5924() {
        InterfaceC6171 interfaceC6171 = this.f6146;
        byte readByte = interfaceC6171.readByte();
        int i = readByte & 255;
        boolean z = (readByte & GCMSIVBlockCipher.MASK) == 128;
        int m5922 = m5922(i, 127);
        if (z) {
            return C11816.m28897(C22940.m51059().m51061(interfaceC6171.mo12312(m5922)));
        }
        return interfaceC6171.mo12305(m5922);
    }
}

package l;

import java.util.Arrays;

/* compiled from: J7MN */
/* renamed from: l.֫ᩳۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC1990 extends AbstractC7592 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public volatile boolean f6666;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f6667;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo6510(int i, byte[] bArr);

    public AbstractC1990(InterfaceC21449 interfaceC21449, C3104 c3104, C8353 c8353, int i, Object obj, byte[] bArr) {
        super(interfaceC21449, c3104, 3, c8353, i, obj, -9223372036854775807L, -9223372036854775807L);
        AbstractC1990 abstractC1990;
        byte[] bArr2;
        if (bArr == null) {
            bArr2 = C3603.f11423;
            abstractC1990 = this;
        } else {
            abstractC1990 = this;
            bArr2 = bArr;
        }
        abstractC1990.f6667 = bArr2;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m6512() {
        return this.f6667;
    }

    @Override // l.InterfaceC23757
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6511() {
        this.f6666 = true;
    }

    @Override // l.InterfaceC23757
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6509() {
        try {
            this.f23465.mo1620(this.f23467);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.f6666) {
                byte[] bArr = this.f6667;
                if (bArr.length < i2 + 16384) {
                    this.f6667 = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.f23465.read(this.f6667, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.f6666) {
                mo6510(i2, this.f6667);
            }
        } finally {
            C8751.m22643(this.f23465);
        }
    }
}

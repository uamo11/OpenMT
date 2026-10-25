package l;

import java.io.DataOutputStream;
import java.util.Arrays;

/* compiled from: 970R */
/* renamed from: l.ܰܽܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13942 extends AbstractC11164 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] f41624;

    public C13942(int[] iArr) {
        this.f41624 = iArr;
    }

    @Override // l.AbstractC11164
    /* renamed from: ܽ */
    public final int mo21898() {
        return this.f41624.length;
    }

    @Override // l.AbstractC11164
    /* renamed from: ܽ */
    public final int mo21899(int i) {
        return this.f41624[i];
    }

    @Override // l.AbstractC11164
    /* renamed from: ۧ */
    public final int mo21896(int i) {
        int i2 = i != Integer.MAX_VALUE ? i + 1 : Integer.MAX_VALUE;
        int[] iArr = this.f41624;
        int m40900 = C17513.m40900(i2, iArr);
        if (m40900 >= iArr.length) {
            throw new IndexOutOfBoundsException("No next start");
        }
        return iArr[m40900];
    }

    @Override // l.AbstractC11164
    /* renamed from: ֫ */
    public final boolean mo21894(int i) {
        int i2 = 1;
        while (true) {
            if (i2 >= this.f41624.length) {
                return true;
            }
            if (r2[i2 - 1] + i > r2[i2]) {
                return false;
            }
            i2++;
        }
    }

    @Override // l.AbstractC11164
    /* renamed from: ֫ */
    public final boolean mo21895(AbstractC11164 abstractC11164) {
        return (abstractC11164 instanceof C13942) && Arrays.equals(this.f41624, ((C13942) abstractC11164).f41624);
    }

    @Override // l.AbstractC11164
    /* renamed from: ֫ */
    public final void mo21893(byte[] bArr, int i, int i2, byte b, int i3) {
        int[] iArr = this.f41624;
        int m40900 = C17513.m40900(i2, iArr);
        for (int m409002 = C17513.m40900(i, iArr); m409002 < m40900; m409002++) {
            bArr[(iArr[m409002] + i3) - i] = b;
        }
    }

    @Override // l.AbstractC11164
    /* renamed from: ֫ */
    public final void mo21891(int i, int i2, InterfaceC21705 interfaceC21705) {
        int[] iArr = this.f41624;
        int m40900 = C17513.m40900(i2, iArr);
        for (int m409002 = C17513.m40900(i, iArr); m409002 < m40900; m409002++) {
            interfaceC21705.mo4084(m409002, iArr[m409002]);
        }
    }

    @Override // l.AbstractC11164
    /* renamed from: ֫ */
    public final int mo21889(int i, int i2) {
        int[] iArr = this.f41624;
        return Math.max(0, C17513.m40900(i2, iArr) - C17513.m40900(i, iArr));
    }

    @Override // l.AbstractC11164
    /* renamed from: ۧ */
    public final long mo21897() {
        return this.f41624.length * 4;
    }

    @Override // l.AbstractC11164
    /* renamed from: ֫ */
    public final long mo21890() {
        return (this.f41624.length * 4) + 48;
    }

    @Override // l.AbstractC11164
    /* renamed from: ֫ */
    public final void mo21892(DataOutputStream dataOutputStream, int i) {
        dataOutputStream.writeByte(1);
        int[] iArr = this.f41624;
        dataOutputStream.writeInt(iArr.length);
        for (int i2 : iArr) {
            long j = i2 - i;
            int i3 = (int) j;
            if (j != i3) {
                throw new ArithmeticException();
            }
            dataOutputStream.writeInt(i3);
        }
    }
}

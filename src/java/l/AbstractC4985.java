package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: M1N0 */
/* renamed from: l.ۙ᩻ᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC4985 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10630 f15703;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f15704;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15859 f15705;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f15706;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f15707;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f15708 = -1;

    /* renamed from: ֫ */
    public abstract void mo2887(int i, Object obj);

    public AbstractC4985(C10630 c10630) {
        this.f15703 = c10630;
        this.f15704 = c10630.f31939;
        this.f15707 = c10630.f31945;
        this.f15706 = c10630.f31944;
    }

    public final boolean hasNext() {
        return this.f15707 != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14472() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f15707--;
        boolean z = this.f15706;
        C10630 c10630 = this.f15703;
        if (z) {
            this.f15706 = false;
            int i2 = c10630.f31939;
            this.f15708 = i2;
            return i2;
        }
        int[] iArr = c10630.f31934;
        do {
            i = this.f15704 - 1;
            this.f15704 = i;
            if (i < 0) {
                this.f15708 = Integer.MIN_VALUE;
                int i3 = this.f15705.getInt((-i) - 1);
                int m32766 = C13630.m32766(i3);
                int i4 = c10630.f31940;
                while (true) {
                    int i5 = m32766 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    m32766 = i5 + 1;
                    i4 = c10630.f31940;
                }
            }
        } while (iArr[i] == 0);
        this.f15708 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f15706;
        C10630 c10630 = this.f15703;
        if (z) {
            this.f15706 = false;
            int i2 = c10630.f31939;
            this.f15708 = i2;
            mo2887(i2, obj);
            this.f15707--;
        }
        int[] iArr = c10630.f31934;
        while (this.f15707 != 0) {
            int i3 = this.f15704 - 1;
            this.f15704 = i3;
            if (i3 < 0) {
                this.f15708 = Integer.MIN_VALUE;
                int i4 = this.f15705.getInt((-i3) - 1);
                int m32766 = C13630.m32766(i4);
                int i5 = c10630.f31940;
                while (true) {
                    i = m32766 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    m32766 = i + 1;
                    i5 = c10630.f31940;
                }
                mo2887(i, obj);
                this.f15707--;
            } else if (iArr[i3] != 0) {
                this.f15708 = i3;
                mo2887(i3, obj);
                this.f15707--;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r3 >= r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r10.f15705 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        r10.f15705 = new l.C15859(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r10.f15705.add(r5[r3]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void remove() {
        /*
            r10 = this;
            int r0 = r10.f15708
            r1 = -1
            if (r0 == r1) goto L6d
            l.ۤ᩻ᩴ r2 = r10.f15703
            int r3 = r2.f31939
            r4 = 0
            if (r0 != r3) goto Lf
            r2.f31944 = r4
            goto L22
        Lf:
            int r3 = r10.f15704
            if (r3 < 0) goto L5e
            int[] r5 = r2.f31934
            int[] r6 = r2.f31942
        L17:
            int r3 = r0 + 1
            int r7 = r2.f31940
            r3 = r3 & r7
        L1c:
            r7 = r5[r3]
            if (r7 != 0) goto L2b
            r5[r0] = r4
        L22:
            int r0 = r2.f31945
            int r0 = r0 + (-1)
            r2.f31945 = r0
            r10.f15708 = r1
            return
        L2b:
            int r8 = l.C13630.m32766(r7)
            int r9 = r2.f31940
            r8 = r8 & r9
            if (r0 > r3) goto L39
            if (r0 >= r8) goto L3d
            if (r8 <= r3) goto L5a
            goto L3d
        L39:
            if (r0 < r8) goto L5a
            if (r8 <= r3) goto L5a
        L3d:
            if (r3 >= r0) goto L52
            l.ܺۢᩴ r8 = r10.f15705
            if (r8 != 0) goto L4b
            l.ܺۢᩴ r8 = new l.ܺۢᩴ
            r9 = 2
            r8.<init>(r9)
            r10.f15705 = r8
        L4b:
            l.ܺۢᩴ r8 = r10.f15705
            r9 = r5[r3]
            r8.add(r9)
        L52:
            r5[r0] = r7
            r7 = r6[r3]
            r6[r0] = r7
            r0 = r3
            goto L17
        L5a:
            int r3 = r3 + 1
            r3 = r3 & r9
            goto L1c
        L5e:
            l.ܺۢᩴ r0 = r10.f15705
            int r3 = -r3
            int r3 = r3 + (-1)
            int r0 = r0.getInt(r3)
            r2.remove(r0)
            r10.f15708 = r1
            return
        L6d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC4985.remove():void");
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}

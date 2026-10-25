package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* compiled from: 1N3 */
/* renamed from: l.ۘܳᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public abstract class AbstractC4008 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5419 f12724;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f12725;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C15859 f12726;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f12727;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f12728;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f12729 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo12087(int i, Object obj);

    public AbstractC4008(C5419 c5419) {
        this.f12724 = c5419;
        this.f12725 = c5419.f16902;
        this.f12728 = c5419.f16901;
        this.f12727 = c5419.f16907;
    }

    public final boolean hasNext() {
        return this.f12728 != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12086() {
        int i;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f12728--;
        boolean z = this.f12727;
        C5419 c5419 = this.f12724;
        if (z) {
            this.f12727 = false;
            int i2 = c5419.f16902;
            this.f12729 = i2;
            return i2;
        }
        int[] iArr = c5419.f16906;
        do {
            i = this.f12725 - 1;
            this.f12725 = i;
            if (i < 0) {
                this.f12729 = Integer.MIN_VALUE;
                int i3 = this.f12726.getInt((-i) - 1);
                int m32766 = C13630.m32766(i3);
                int i4 = c5419.f16899;
                while (true) {
                    int i5 = m32766 & i4;
                    if (i3 == iArr[i5]) {
                        return i5;
                    }
                    m32766 = i5 + 1;
                    i4 = c5419.f16899;
                }
            }
        } while (iArr[i] == 0);
        this.f12729 = i;
        return i;
    }

    public final void forEachRemaining(Object obj) {
        int i;
        boolean z = this.f12727;
        C5419 c5419 = this.f12724;
        if (z) {
            this.f12727 = false;
            int i2 = c5419.f16902;
            this.f12729 = i2;
            mo12087(i2, obj);
            this.f12728--;
        }
        int[] iArr = c5419.f16906;
        while (this.f12728 != 0) {
            int i3 = this.f12725 - 1;
            this.f12725 = i3;
            if (i3 < 0) {
                this.f12729 = Integer.MIN_VALUE;
                int i4 = this.f12726.getInt((-i3) - 1);
                int m32766 = C13630.m32766(i4);
                int i5 = c5419.f16899;
                while (true) {
                    i = m32766 & i5;
                    if (i4 == iArr[i]) {
                        break;
                    }
                    m32766 = i + 1;
                    i5 = c5419.f16899;
                }
                mo12087(i, obj);
                this.f12728--;
            } else if (iArr[i3] != 0) {
                this.f12729 = i3;
                mo12087(i3, obj);
                this.f12728--;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r3 >= r0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r10.f12726 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        r10.f12726 = new l.C15859(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r10.f12726.add(r5[r3]);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void remove() {
        /*
            r10 = this;
            int r0 = r10.f12729
            r1 = -1
            if (r0 == r1) goto L6d
            l.ۚܳᩴ r2 = r10.f12724
            int r3 = r2.f16902
            r4 = 0
            if (r0 != r3) goto Lf
            r2.f16907 = r4
            goto L22
        Lf:
            int r3 = r10.f12725
            if (r3 < 0) goto L5e
            int[] r5 = r2.f16906
            byte[] r6 = r2.f16903
        L17:
            int r3 = r0 + 1
            int r7 = r2.f16899
            r3 = r3 & r7
        L1c:
            r7 = r5[r3]
            if (r7 != 0) goto L2b
            r5[r0] = r4
        L22:
            int r0 = r2.f16901
            int r0 = r0 + (-1)
            r2.f16901 = r0
            r10.f12729 = r1
            return
        L2b:
            int r8 = l.C13630.m32766(r7)
            int r9 = r2.f16899
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
            l.ܺۢᩴ r8 = r10.f12726
            if (r8 != 0) goto L4b
            l.ܺۢᩴ r8 = new l.ܺۢᩴ
            r9 = 2
            r8.<init>(r9)
            r10.f12726 = r8
        L4b:
            l.ܺۢᩴ r8 = r10.f12726
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
            l.ܺۢᩴ r0 = r10.f12726
            int r3 = -r3
            int r3 = r3 + (-1)
            int r0 = r0.getInt(r3)
            r2.remove(r0)
            r10.f12729 = r1
            return
        L6d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC4008.remove():void");
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(Consumer consumer) {
        forEachRemaining((Object) consumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }
}

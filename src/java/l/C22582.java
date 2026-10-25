package l;

import java.util.Arrays;

/* compiled from: M6OZ */
/* renamed from: l.᩹᩹ᩳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22582 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f72994;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C21877 f72995;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C11999 f72996;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f72997;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C23993[] f72998;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f72999 = -1;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int[] f73000;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C15525 f73001;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f73002;

    public C22582(C11999 c11999, int i, int i2) {
        AbstractC20466[] abstractC20466Arr;
        int i3;
        C11999.m29337(i, i2, c11999.m29347());
        this.f72996 = c11999;
        this.f72997 = i;
        this.f73002 = i2;
        AbstractC20466 abstractC20466 = c11999.f35929;
        int i4 = abstractC20466 == null ? 0 : abstractC20466.f65975;
        this.f72998 = new C23993[i4];
        this.f73000 = new int[i4];
        C21605 c21605 = c11999.f35930;
        if (c21605 != null) {
            c21605.m48811();
        }
        if (i == i2 || abstractC20466 == null || abstractC20466.f65977 == 0) {
            return;
        }
        int i5 = 0;
        while (abstractC20466 instanceof C23993) {
            C23993 c23993 = (C23993) abstractC20466;
            int i6 = 0;
            while (true) {
                abstractC20466Arr = c23993.f77779;
                if (i6 < abstractC20466Arr.length - 1 && i >= (i3 = this.f72994 + abstractC20466Arr[i6].f65976)) {
                    i6++;
                    this.f72994 = i3;
                }
            }
            this.f72998[i5] = c23993;
            this.f73000[i5] = i6;
            abstractC20466 = abstractC20466Arr[i6];
            i5++;
        }
        this.f72995 = (C21877) abstractC20466;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r5[r2] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0083, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if ((r7 instanceof l.C23993) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        r7 = (l.C23993) r7;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008c, code lost:
    
        r6 = r7.f77779;
        r8 = r6[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0092, code lost:
    
        if (r8.f65977 != 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0094, code lost:
    
        r4 = r4 + 1;
        r10.f72994 += r8.f65976;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        r0[r2] = r7;
        r5[r2] = r4;
        r7 = r6[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a5, code lost:
    
        r0 = r10.f72994;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a7, code lost:
    
        if (r0 < r3) goto L46;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m50561() {
        /*
            Method dump skipped, instructions count: 199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22582.m50561():int");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C11999 c11999 = this.f72996;
        if (c11999 == null) {
            return;
        }
        C21605 c21605 = c11999.f35930;
        this.f72996 = null;
        this.f72995 = null;
        Arrays.fill(this.f72998, (Object) null);
        try {
            C15525 c15525 = this.f73001;
            if (c15525 != null) {
                c15525.close();
                this.f73001 = null;
            }
        } finally {
            if (c21605 != null) {
                c21605.m48812();
            }
        }
    }
}

package l;

import android.graphics.Path;

/* compiled from: 7553 */
/* renamed from: l.ܳ۬, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14533 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float[] m34678(int i, float[] fArr) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Path m34681(String str) {
        Path path = new Path();
        try {
            m34676(m34679(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(str), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0088, code lost:
    
        if (r10 == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099 A[Catch: NumberFormatException -> 0x00ba, LOOP:3: B:25:0x0069->B:36:0x0099, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:22:0x0056, B:25:0x0069, B:27:0x006f, B:32:0x007d, B:36:0x0099, B:40:0x009e, B:45:0x00ae, B:57:0x00b2), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:22:0x0056, B:25:0x0069, B:27:0x006f, B:32:0x007d, B:36:0x0099, B:40:0x009e, B:45:0x00ae, B:57:0x00b2), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae A[Catch: NumberFormatException -> 0x00ba, TryCatch #0 {NumberFormatException -> 0x00ba, blocks: (B:22:0x0056, B:25:0x0069, B:27:0x006f, B:32:0x007d, B:36:0x0099, B:40:0x009e, B:45:0x00ae, B:57:0x00b2), top: B:21:0x0056 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C17356[] m34679(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14533.m34679(java.lang.String):l.ܿ۬[]");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17356[] m34680(C17356[] c17356Arr) {
        C17356[] c17356Arr2 = new C17356[c17356Arr.length];
        for (int i = 0; i < c17356Arr.length; i++) {
            c17356Arr2[i] = new C17356(c17356Arr[i]);
        }
        return c17356Arr2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m34677(C17356[] c17356Arr, C17356[] c17356Arr2) {
        char c;
        char c2;
        float[] fArr;
        float[] fArr2;
        if (c17356Arr == null || c17356Arr2 == null || c17356Arr.length != c17356Arr2.length) {
            return false;
        }
        for (int i = 0; i < c17356Arr.length; i++) {
            c = c17356Arr[i].f53162;
            c2 = c17356Arr2[i].f53162;
            if (c == c2) {
                fArr = c17356Arr[i].f53161;
                int length = fArr.length;
                fArr2 = c17356Arr2[i].f53161;
                if (length == fArr2.length) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0017 */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m34682(l.C17356[] r4, l.C17356[] r5) {
        /*
            r0 = 0
        L1:
            int r1 = r5.length
            if (r0 >= r1) goto L2f
            r1 = r4[r0]
            r2 = r5[r0]
            char r2 = l.C17356.m40681(r2)
            l.C17356.m40684(r1, r2)
            r1 = 0
        L10:
            r2 = r5[r0]
            float[] r2 = l.C17356.m40685(r2)
            int r2 = r2.length
            if (r1 >= r2) goto L2c
            r2 = r4[r0]
            float[] r2 = l.C17356.m40685(r2)
            r3 = r5[r0]
            float[] r3 = l.C17356.m40685(r3)
            r3 = r3[r1]
            r2[r1] = r3
            int r1 = r1 + 1
            goto L10
        L2c:
            int r0 = r0 + 1
            goto L1
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14533.m34682(l.ܿ۬[], l.ܿ۬[]):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34676(C17356[] c17356Arr, Path path) {
        char c;
        float[] fArr;
        float[] fArr2 = new float[6];
        char c2 = 'm';
        for (C17356 c17356 : c17356Arr) {
            c = c17356.f53162;
            fArr = c17356.f53161;
            C17356.m40683(path, fArr2, c2, c, fArr);
            c2 = c17356.f53162;
        }
    }
}

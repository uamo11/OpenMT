package l;

import android.text.NoCopySpan;
import android.text.Selection;
import android.text.SpanWatcher;
import android.text.Spanned;
import com.google.android.material.motion.MotionUtils;
import java.lang.reflect.Array;
import java.util.IdentityHashMap;

/* compiled from: O6UZ */
/* renamed from: l.ۨ᩸ᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11978 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10567 f35854;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public Object[] f35855;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f35856;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int[] f35857;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int[] f35858;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long[] f35859;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f35860;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f35861;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long[] f35862;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f35863;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f35864;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public IdentityHashMap f35865;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f35866;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long[] f35867;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Object[] f35852 = new Object[0];

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static Object[] f35853 = new Object[73];

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int[][] f35851 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 0);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29257(long j, long j2) {
        return C15942.m37718(C12803.m31106(MotionUtils.EASING_TYPE_FORMAT_START, " ... ", j), j2, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m29267(int i) {
        return i - (((i + 1) & (~i)) >> 1);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int m29274(int i) {
        return i + (((i + 1) & (~i)) >> 1);
    }

    public C11978(C10567 c10567, CharSequence charSequence, int i) {
        this.f35854 = c10567;
        long length = c10567.length();
        long max = Math.max(8L, 2 * length);
        this.f35856 = max;
        this.f35863 = length;
        this.f35860 = max - length;
        this.f35861 = 0;
        this.f35866 = 0;
        this.f35855 = new Object[0];
        this.f35862 = new long[0];
        this.f35867 = new long[0];
        this.f35857 = new int[0];
        this.f35859 = new long[0];
        this.f35858 = new int[0];
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, i, Object.class)) {
                if (!(obj instanceof NoCopySpan)) {
                    int spanStart = spanned.getSpanStart(obj);
                    int spanEnd = spanned.getSpanEnd(obj);
                    int spanFlags = spanned.getSpanFlags(obj);
                    spanStart = spanStart < 0 ? 0 : spanStart;
                    m29262(false, obj, spanStart > i ? i : spanStart, (spanEnd < 0 ? 0 : spanEnd) > i ? i : r3, spanFlags, false);
                }
            }
            m29270();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29277() {
        int i = this.f35861;
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            Object[] objArr = this.f35855;
            Object obj = objArr[i];
            long j = this.f35862[i];
            long j2 = this.f35867[i];
            long j3 = this.f35863;
            if (j > j3) {
                j -= this.f35860;
            }
            if (j2 > j3) {
                j2 -= this.f35860;
            }
            this.f35861 = i;
            objArr[i] = null;
            IdentityHashMap identityHashMap = this.f35865;
            if (identityHashMap != null) {
                identityHashMap.remove(obj);
            }
            m29271(obj, j, j2);
        }
        IdentityHashMap identityHashMap2 = this.f35865;
        if (identityHashMap2 != null) {
            identityHashMap2.clear();
        }
        this.f35866 = 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m29264(int i, int i2, int i3, boolean z) {
        int i4 = i3 & 1;
        if (i4 == 0 || m29269(this.f35859[i3]) < i || !m29264(i, i2, m29267(i3), z)) {
            if (i3 >= this.f35861) {
                return false;
            }
            if ((this.f35857[i3] & 33) == 33) {
                long j = this.f35862[i3];
                long j2 = i;
                if (j >= j2) {
                    long j3 = this.f35863;
                    long j4 = this.f35860 + j3;
                    if (j < j4) {
                        long j5 = this.f35867[i3];
                        if (j5 >= j2 && j5 < j4 && (z || j > j2 || j5 < j3)) {
                            this.f35865.remove(this.f35855[i3]);
                            m29275(i3);
                            return true;
                        }
                    }
                }
            }
            if (m29269(this.f35862[i3]) > i2 || i4 == 0 || !m29264(i, i2, m29274(i3), z)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025e A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29278(int r43, int r44, java.lang.CharSequence r45, int r46, int r47, boolean r48) {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11978.m29278(int, int, java.lang.CharSequence, int, int, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m29256(int i, int i2, int i3, long j, boolean z, boolean z2) {
        long j2 = i;
        if (j >= j2) {
            long j3 = this.f35863;
            long j4 = this.f35860;
            if (j < j3 + j4) {
                if (i3 == 2) {
                    if (z2 || j > j2) {
                        return j3 + j4;
                    }
                } else {
                    if (i3 != 3) {
                        return (z2 || j < j3 - ((long) i2)) ? j2 : j3;
                    }
                    if (z) {
                        return j3 + j4;
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m29275(int i) {
        Object[] objArr = this.f35855;
        Object obj = objArr[i];
        long j = this.f35862[i];
        long j2 = this.f35867[i];
        long j3 = this.f35863;
        if (j > j3) {
            j -= this.f35860;
        }
        if (j2 > j3) {
            j2 -= this.f35860;
        }
        int i2 = i + 1;
        int i3 = this.f35861 - i2;
        System.arraycopy(objArr, i2, objArr, i, i3);
        long[] jArr = this.f35862;
        System.arraycopy(jArr, i2, jArr, i, i3);
        long[] jArr2 = this.f35867;
        System.arraycopy(jArr2, i2, jArr2, i, i3);
        int[] iArr = this.f35857;
        System.arraycopy(iArr, i2, iArr, i, i3);
        int[] iArr2 = this.f35858;
        System.arraycopy(iArr2, i2, iArr2, i, i3);
        this.f35861--;
        this.f35864 = Math.min(i, this.f35864);
        this.f35855[this.f35861] = null;
        m29270();
        m29271(obj, j, j2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29279(Object obj, int i, int i2, int i3) {
        m29262(true, obj, i, i2, i3, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a2  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m29262(boolean r20, java.lang.Object r21, long r22, long r24, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11978.m29262(boolean, java.lang.Object, long, long, int, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29259(Object obj, long j, long j2) {
        Object obj2 = Selection.SELECTION_START;
        C10567 c10567 = this.f35854;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c10567.m26555();
        }
        int i = (int) j;
        long j3 = i;
        if (j != j3) {
            throw new ArithmeticException();
        }
        int i2 = (int) j2;
        long j4 = i2;
        if (j2 != j4) {
            throw new ArithmeticException();
        }
        for (SpanWatcher spanWatcher : (SpanWatcher[]) m29280(i, i2, SpanWatcher.class)) {
            if (j != j3) {
                throw new ArithmeticException();
            }
            if (j2 != j4) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanAdded(c10567, obj, i, i2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29260(Object obj, long j, long j2, long j3, long j4) {
        Object obj2 = Selection.SELECTION_START;
        C10567 c10567 = this.f35854;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c10567.m26555();
        }
        long min = Math.min(j, j3);
        int i = (int) min;
        if (min != i) {
            throw new ArithmeticException();
        }
        long min2 = Math.min(Math.max(j2, j4), c10567.length());
        int i2 = (int) min2;
        if (min2 != i2) {
            throw new ArithmeticException();
        }
        SpanWatcher[] spanWatcherArr = (SpanWatcher[]) m29280(i, i2, SpanWatcher.class);
        int length = spanWatcherArr.length;
        int i3 = 0;
        while (i3 < length) {
            SpanWatcher spanWatcher = spanWatcherArr[i3];
            int i4 = (int) j;
            if (j != i4) {
                throw new ArithmeticException();
            }
            int i5 = (int) j2;
            int i6 = i3;
            int i7 = length;
            if (j2 != i5) {
                throw new ArithmeticException();
            }
            int i8 = (int) j3;
            if (j3 != i8) {
                throw new ArithmeticException();
            }
            int i9 = (int) j4;
            SpanWatcher[] spanWatcherArr2 = spanWatcherArr;
            if (j4 != i9) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanChanged(c10567, obj, i4, i5, i8, i9);
            i3 = i6 + 1;
            length = i7;
            spanWatcherArr = spanWatcherArr2;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m29271(Object obj, long j, long j2) {
        Object obj2 = Selection.SELECTION_START;
        C10567 c10567 = this.f35854;
        if (obj == obj2 || obj == Selection.SELECTION_END) {
            c10567.m26555();
        }
        int i = (int) j;
        long j3 = i;
        if (j != j3) {
            throw new ArithmeticException();
        }
        int i2 = (int) j2;
        long j4 = i2;
        if (j2 != j4) {
            throw new ArithmeticException();
        }
        for (SpanWatcher spanWatcher : (SpanWatcher[]) m29280(i, i2, SpanWatcher.class)) {
            if (j != j3) {
                throw new ArithmeticException();
            }
            if (j2 != j4) {
                throw new ArithmeticException();
            }
            spanWatcher.onSpanRemoved(c10567, obj, i, i2);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m29284(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f35865;
        if (identityHashMap == null || (num = (Integer) identityHashMap.remove(obj)) == null) {
            return;
        }
        m29275(num.intValue());
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m29269(long j) {
        if (j > this.f35863) {
            j -= this.f35860;
        }
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new ArithmeticException();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m29283(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f35865;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return -1;
        }
        return m29269(this.f35862[num.intValue()]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m29276(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f35865;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return -1;
        }
        return m29269(this.f35867[num.intValue()]);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29282(Object obj) {
        Integer num;
        IdentityHashMap identityHashMap = this.f35865;
        if (identityHashMap == null || (num = (Integer) identityHashMap.get(obj)) == null) {
            return 0;
        }
        return this.f35857[num.intValue()];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object[] m29280(int i, int i2, Class cls) {
        if (cls == null) {
            return m29266(Object.class);
        }
        if (this.f35861 == 0) {
            return m29266(cls);
        }
        int m29253 = m29253(i, i2, m29272(), cls);
        if (m29253 == 0) {
            return m29266(cls);
        }
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, m29253);
        int[] m29273 = m29273(m29253);
        int[] m292732 = m29273(m29253);
        m29254(i, i2, cls, m29272(), objArr, m29273, m292732, 0);
        int length = objArr.length;
        int i3 = length / 2;
        while (true) {
            i3--;
            if (i3 < 0) {
                break;
            }
            m29258(i3, objArr, length, m29273, m292732);
        }
        while (true) {
            length--;
            if (length <= 0) {
                m29263(m29273);
                m29263(m292732);
                return objArr;
            }
            Object obj = objArr[0];
            objArr[0] = objArr[length];
            objArr[length] = obj;
            int i4 = m29273[0];
            m29273[0] = m29273[length];
            m29273[length] = i4;
            int i5 = m292732[0];
            m292732[0] = m292732[length];
            m292732[length] = i5;
            m29258(0, objArr, length, m29273, m292732);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object[] m29266(Class cls) {
        if (cls == Object.class) {
            return f35852;
        }
        int identityHashCode = ((System.identityHashCode(cls) / 8) & Integer.MAX_VALUE) % 73;
        Object[] objArr = f35853;
        Object obj = objArr[identityHashCode];
        if (obj == null || obj.getClass().getComponentType() != cls) {
            obj = Array.newInstance((Class<?>) cls, 0);
            objArr[identityHashCode] = obj;
        }
        return (Object[]) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m29253(int r11, int r12, int r13, java.lang.Class r14) {
        /*
            r10 = this;
            r0 = r13 & 1
            if (r0 == 0) goto L1f
            int r1 = m29267(r13)
            long[] r2 = r10.f35859
            r3 = r2[r1]
            long r5 = r10.f35863
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L15
            long r5 = r10.f35860
            long r3 = r3 - r5
        L15:
            long r5 = (long) r11
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L1f
            int r1 = r10.m29253(r11, r12, r1, r14)
            goto L20
        L1f:
            r1 = 0
        L20:
            int r2 = r10.f35861
            if (r13 >= r2) goto L6b
            long[] r2 = r10.f35862
            r3 = r2[r13]
            long r5 = r10.f35863
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto L31
            long r7 = r10.f35860
            long r3 = r3 - r7
        L31:
            long r7 = (long) r12
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 > 0) goto L6b
            long[] r7 = r10.f35867
            r8 = r7[r13]
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 <= 0) goto L41
            long r5 = r10.f35860
            long r8 = r8 - r5
        L41:
            long r5 = (long) r11
            int r7 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r7 < 0) goto L60
            int r5 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r5 == 0) goto L50
            if (r11 == r12) goto L50
            if (r2 == 0) goto L60
            if (r7 == 0) goto L60
        L50:
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r2 == r14) goto L5e
            java.lang.Object[] r2 = r10.f35855
            r2 = r2[r13]
            boolean r2 = r14.isInstance(r2)
            if (r2 == 0) goto L60
        L5e:
            int r1 = r1 + 1
        L60:
            if (r0 == 0) goto L6b
            int r13 = m29274(r13)
            int r11 = r10.m29253(r11, r12, r13, r14)
            int r1 = r1 + r11
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11978.m29253(int, int, int, java.lang.Class):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m29254(int r17, int r18, java.lang.Class r19, int r20, java.lang.Object[] r21, int[] r22, int[] r23, int r24) {
        /*
            r16 = this;
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            r14 = r21
            r15 = r13 & 1
            if (r15 == 0) goto L3b
            int r4 = m29267(r20)
            long[] r0 = r9.f35859
            r1 = r0[r4]
            long r5 = r9.f35863
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L21
            long r5 = r9.f35860
            long r1 = r1 - r5
        L21:
            long r5 = (long) r10
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L3b
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            int r0 = r0.m29254(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L3d
        L3b:
            r0 = r24
        L3d:
            int r1 = r9.f35861
            if (r13 < r1) goto L43
            goto Lb2
        L43:
            long[] r1 = r9.f35862
            r2 = r1[r13]
            long r4 = r9.f35863
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L50
            long r6 = r9.f35860
            long r2 = r2 - r6
        L50:
            long r6 = (long) r11
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 > 0) goto Lb2
            long[] r6 = r9.f35867
            r7 = r6[r13]
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 <= 0) goto L60
            long r4 = r9.f35860
            long r7 = r7 - r4
        L60:
            long r4 = (long) r10
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 < 0) goto L94
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 == 0) goto L6f
            if (r10 == r11) goto L6f
            if (r1 == 0) goto L94
            if (r6 == 0) goto L94
        L6f:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r1 == r12) goto L7d
            java.lang.Object[] r1 = r9.f35855
            r1 = r1[r13]
            boolean r1 = r12.isInstance(r1)
            if (r1 == 0) goto L94
        L7d:
            int[] r1 = r9.f35857
            r1 = r1[r13]
            r2 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            r22[r0] = r1
            int[] r1 = r9.f35858
            r1 = r1[r13]
            r23[r0] = r1
            java.lang.Object[] r1 = r9.f35855
            r1 = r1[r13]
            r14[r0] = r1
            int r0 = r0 + 1
        L94:
            r8 = r0
            int r0 = r14.length
            if (r8 >= r0) goto Lb1
            if (r15 == 0) goto Lb1
            int r4 = m29274(r20)
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            r7 = r23
            int r0 = r0.m29254(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        Lb1:
            return r8
        Lb2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11978.m29254(int, int, java.lang.Class, int, java.lang.Object[], int[], int[], int):int");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int[] m29273(int i) {
        int[] iArr;
        int[][] iArr2 = f35851;
        synchronized (iArr2) {
            int length = iArr2.length - 1;
            int i2 = -1;
            while (true) {
                if (length < 0) {
                    length = i2;
                    break;
                }
                int[] iArr3 = f35851[length];
                if (iArr3 != null) {
                    if (iArr3.length >= i) {
                        break;
                    }
                    if (i2 == -1) {
                        i2 = length;
                    }
                }
                length--;
            }
            iArr = null;
            if (length != -1) {
                int[][] iArr4 = f35851;
                int[] iArr5 = iArr4[length];
                iArr4[length] = null;
                iArr = iArr5;
            }
        }
        return (iArr == null || i > iArr.length) ? new int[C6333.m17611(i)] : iArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29263(int[] iArr) {
        int[][] iArr2;
        synchronized (f35851) {
            int i = 0;
            while (true) {
                iArr2 = f35851;
                if (i < iArr2.length) {
                    int[] iArr3 = iArr2[i];
                    if (iArr3 == null || iArr.length > iArr3.length) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    break;
                }
            }
            iArr2[i] = iArr;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m29258(int i, Object[] objArr, int i2, int[] iArr, int[] iArr2) {
        int compare;
        int compare2;
        int i3 = (i * 2) + 1;
        while (i3 < i2) {
            if (i3 < i2 - 1) {
                int i4 = i3 + 1;
                int i5 = iArr[i3];
                int i6 = iArr[i4];
                if (i5 == i6) {
                    compare2 = Integer.compare(iArr2[i3], iArr2[i4]);
                } else {
                    compare2 = Integer.compare(i6, i5);
                }
                if (compare2 < 0) {
                    i3 = i4;
                }
            }
            int i7 = iArr[i];
            int i8 = iArr[i3];
            if (i7 == i8) {
                compare = Integer.compare(iArr2[i], iArr2[i3]);
            } else {
                compare = Integer.compare(i8, i7);
            }
            if (compare >= 0) {
                return;
            }
            Object obj = objArr[i];
            objArr[i] = objArr[i3];
            objArr[i3] = obj;
            int i9 = iArr[i];
            iArr[i] = iArr[i3];
            iArr[i3] = i9;
            int i10 = iArr2[i];
            iArr2[i] = iArr2[i3];
            iArr2[i3] = i10;
            int i11 = i3;
            i3 = (i3 * 2) + 1;
            i = i11;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m29281(int i, int i2, Class cls) {
        if (this.f35861 == 0) {
            return i2;
        }
        if (cls == null) {
            cls = Object.class;
        }
        return m29268(i, i2, m29272(), cls);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m29268(int i, int i2, int i3, Class cls) {
        int i4 = i3 & 1;
        if (i4 != 0) {
            int m29267 = m29267(i3);
            if (m29269(this.f35859[m29267]) > i) {
                i2 = m29268(i, i2, m29267, cls);
            }
        }
        if (i3 >= this.f35861) {
            return i2;
        }
        int m29269 = m29269(this.f35862[i3]);
        int m292692 = m29269(this.f35867[i3]);
        if (m29269 > i && m29269 < i2 && cls.isInstance(this.f35855[i3])) {
            i2 = m29269;
        }
        if (m292692 <= i || m292692 >= i2 || !cls.isInstance(this.f35855[i3])) {
            m292692 = i2;
        }
        return (m29269 >= m292692 || i4 == 0) ? m292692 : m29268(i, m292692, m29274(i3), cls);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m29272() {
        return Integer.highestOneBit(this.f35861) - 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m29255(int i) {
        int i2 = i & 1;
        long m29255 = i2 != 0 ? m29255(m29267(i)) : 0L;
        if (i < this.f35861) {
            m29255 = Math.max(m29255, this.f35867[i]);
            if (i2 != 0) {
                m29255 = Math.max(m29255, m29255(m29274(i)));
            }
        }
        this.f35859[i] = m29255;
        return m29255;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m29270() {
        Object[] objArr;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        int[] iArr2;
        int i;
        if (this.f35861 == 0) {
            return;
        }
        for (int i2 = 1; i2 < this.f35861; i2++) {
            long[] jArr3 = this.f35862;
            long j = jArr3[i2];
            if (j < jArr3[i2 - 1]) {
                Object obj = this.f35855[i2];
                long j2 = this.f35867[i2];
                int i3 = this.f35857[i2];
                int i4 = this.f35858[i2];
                int i5 = i2;
                while (true) {
                    objArr = this.f35855;
                    int i6 = i5 - 1;
                    objArr[i5] = objArr[i6];
                    jArr = this.f35862;
                    jArr[i5] = jArr[i6];
                    jArr2 = this.f35867;
                    jArr2[i5] = jArr2[i6];
                    iArr = this.f35857;
                    iArr[i5] = iArr[i6];
                    iArr2 = this.f35858;
                    iArr2[i5] = iArr2[i6];
                    i = i5 - 1;
                    if (i <= 0 || j >= jArr[i5 - 2]) {
                        break;
                    } else {
                        i5 = i;
                    }
                }
                objArr[i] = obj;
                jArr[i] = j;
                jArr2[i] = j2;
                iArr[i] = i3;
                iArr2[i] = i4;
                this.f35864 = Math.min(i, this.f35864);
            }
        }
        m29255(m29272());
        if (this.f35865 == null) {
            this.f35865 = new IdentityHashMap();
        }
        for (int i7 = this.f35864; i7 < this.f35861; i7++) {
            Integer num = (Integer) this.f35865.get(this.f35855[i7]);
            if (num == null || num.intValue() != i7) {
                this.f35865.put(this.f35855[i7], Integer.valueOf(i7));
            }
        }
        this.f35864 = Integer.MAX_VALUE;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m29261(String str, long j, long j2) {
        if (j2 < j) {
            throw new IndexOutOfBoundsException(C9045.m23341(C7166.m19190(str, " "), m29257(j, j2), " has end before start"));
        }
        int length = this.f35854.length();
        long j3 = length;
        if (j <= j3 && j2 <= j3) {
            if (j < 0 || j2 < 0) {
                throw new IndexOutOfBoundsException(C9045.m23341(C7166.m19190(str, " "), m29257(j, j2), " starts before 0"));
            }
        } else {
            StringBuilder m19190 = C7166.m19190(str, " ");
            m19190.append(m29257(j, j2));
            m19190.append(" ends beyond length ");
            m19190.append(length);
            throw new IndexOutOfBoundsException(m19190.toString());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m29265(int i, long j) {
        return (i != 3 || j == 0 || j == ((long) this.f35854.length()) || m29252(j - 1) == '\n') ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private char m29252(long j) {
        int i = (int) j;
        if (j == i) {
            return this.f35854.charAt(i);
        }
        throw new ArithmeticException();
    }
}

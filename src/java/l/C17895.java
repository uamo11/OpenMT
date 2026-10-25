package l;

import java.util.concurrent.RejectedExecutionException;
import sun.misc.Unsafe;

/* compiled from: H6Q8 */
/* renamed from: l.ᩳۜ᩵, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17895 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final long f54636;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f54637;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int f54638;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final int f54639;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractFutureC8723[] f54640;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public volatile int f54641;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f54642 = 4096;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public volatile int f54643 = 4096;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile int f54644;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f54645;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3784 f54646;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f54647;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f54648;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17189 f54649;

    public C17895(C17189 c17189, C3784 c3784) {
        this.f54649 = c17189;
        this.f54646 = c3784;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41861(AbstractFutureC8723 abstractFutureC8723) {
        int length;
        int i = this.f54642;
        AbstractFutureC8723[] abstractFutureC8723Arr = this.f54640;
        if (abstractFutureC8723Arr == null || (length = abstractFutureC8723Arr.length) <= 0) {
            return;
        }
        long j = (((length - 1) & i) << f54639) + f54638;
        C17189 c17189 = this.f54649;
        this.f54642 = i + 1;
        f54637.putOrderedObject(abstractFutureC8723Arr, j, abstractFutureC8723);
        int i2 = this.f54643 - i;
        if (i2 == 0) {
            C16483.m38847();
            c17189.m40443();
        } else if (i2 + length == 1) {
            m41859();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41859() {
        int i;
        AbstractFutureC8723[] abstractFutureC8723Arr = this.f54640;
        int length = abstractFutureC8723Arr != null ? abstractFutureC8723Arr.length : 0;
        int i2 = length > 0 ? length << 1 : 8192;
        if (i2 < 8192 || i2 > 67108864) {
            throw new RejectedExecutionException("Queue capacity exceeded");
        }
        AbstractFutureC8723[] abstractFutureC8723Arr2 = new AbstractFutureC8723[i2];
        this.f54640 = abstractFutureC8723Arr2;
        if (abstractFutureC8723Arr == null || length - 1 <= 0) {
            return;
        }
        int i3 = this.f54642;
        int i4 = this.f54643;
        if (i3 - i4 > 0) {
            int i5 = i2 - 1;
            do {
                long j = ((i4 & i) << f54639) + f54638;
                Unsafe unsafe = f54637;
                AbstractFutureC8723 abstractFutureC8723 = (AbstractFutureC8723) unsafe.getObjectVolatile(abstractFutureC8723Arr, j);
                if (abstractFutureC8723 != null && C6397.m17724(unsafe, abstractFutureC8723Arr, j, abstractFutureC8723)) {
                    abstractFutureC8723Arr2[i4 & i5] = abstractFutureC8723;
                }
                i4++;
            } while (i4 != i3);
            C16483.m38848();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractFutureC8723 m41862() {
        int i;
        int length;
        while (true) {
            int i2 = this.f54643;
            int i3 = this.f54642;
            AbstractFutureC8723[] abstractFutureC8723Arr = this.f54640;
            if (abstractFutureC8723Arr == null || (i = i2 - i3) >= 0 || (length = abstractFutureC8723Arr.length) <= 0) {
                return null;
            }
            long j = (((length - 1) & i2) << f54639) + f54638;
            Unsafe unsafe = f54637;
            AbstractFutureC8723 abstractFutureC8723 = (AbstractFutureC8723) unsafe.getObjectVolatile(abstractFutureC8723Arr, j);
            int i4 = i2 + 1;
            if (i2 == this.f54643) {
                if (abstractFutureC8723 != null) {
                    if (C6397.m17724(unsafe, abstractFutureC8723Arr, j, abstractFutureC8723)) {
                        this.f54643 = i4;
                        return abstractFutureC8723;
                    }
                } else if (i == -1) {
                    return null;
                }
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m41867(AbstractFutureC8723 abstractFutureC8723) {
        int length;
        int i = this.f54643;
        int i2 = this.f54642;
        AbstractFutureC8723[] abstractFutureC8723Arr = this.f54640;
        if (abstractFutureC8723Arr == null || i == i2 || (length = abstractFutureC8723Arr.length) <= 0) {
            return false;
        }
        int i3 = i2 - 1;
        if (!C6397.m17724(f54637, abstractFutureC8723Arr, (((length - 1) & i3) << f54639) + f54638, abstractFutureC8723)) {
            return false;
        }
        this.f54642 = i3;
        C16483.m38848();
        return true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41863(int i) {
        int length;
        while (true) {
            int i2 = this.f54643;
            int i3 = this.f54642;
            AbstractFutureC8723[] abstractFutureC8723Arr = this.f54640;
            if (abstractFutureC8723Arr == null || i2 == i3 || (length = abstractFutureC8723Arr.length) <= 0) {
                return;
            }
            int i4 = i3 - 1;
            AbstractFutureC8723 abstractFutureC8723 = (AbstractFutureC8723) C17189.m40426((((length - 1) & i4) << f54639) + f54638, abstractFutureC8723Arr);
            if (abstractFutureC8723 == null) {
                return;
            }
            this.f54642 = i4;
            C16483.m38848();
            abstractFutureC8723.m22555();
            if (i != 0 && i - 1 == 0) {
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41860(int i) {
        int i2;
        int length;
        do {
            int i3 = 0;
            while (true) {
                int i4 = this.f54643;
                int i5 = this.f54642;
                AbstractFutureC8723[] abstractFutureC8723Arr = this.f54640;
                if (abstractFutureC8723Arr != null && (i2 = i4 - i5) < 0 && (length = abstractFutureC8723Arr.length) > 0) {
                    int i6 = i4 + 1;
                    AbstractFutureC8723 abstractFutureC8723 = (AbstractFutureC8723) C17189.m40426(((i4 & (length - 1)) << f54639) + f54638, abstractFutureC8723Arr);
                    if (abstractFutureC8723 == null) {
                        break;
                    }
                    this.f54643 = i6;
                    abstractFutureC8723.m22555();
                    if (i != 0 && (i3 = i3 + 1) == i) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } while (i2 != -1);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41864(AbstractFutureC8723 abstractFutureC8723) {
        AbstractFutureC8723[] abstractFutureC8723Arr;
        int length;
        int i = this.f54643;
        int i2 = this.f54642;
        if (i - i2 >= 0 || (abstractFutureC8723Arr = this.f54640) == null || (length = abstractFutureC8723Arr.length) <= 0) {
            return;
        }
        int i3 = length - 1;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            long j = ((i5 & i3) << f54639) + f54638;
            Unsafe unsafe = f54637;
            AbstractFutureC8723 abstractFutureC87232 = (AbstractFutureC8723) unsafe.getObject(abstractFutureC8723Arr, j);
            if (abstractFutureC87232 == null) {
                return;
            }
            if (abstractFutureC87232 == abstractFutureC8723) {
                if (C6397.m17724(unsafe, abstractFutureC8723Arr, j, abstractFutureC87232)) {
                    this.f54642 = i4;
                    while (i5 != i4) {
                        int i6 = i5 + 1;
                        int i7 = f54639;
                        long j2 = ((i6 & i3) << i7) + f54638;
                        Unsafe unsafe2 = f54637;
                        AbstractFutureC8723 abstractFutureC87233 = (AbstractFutureC8723) unsafe2.getObject(abstractFutureC8723Arr, j2);
                        unsafe2.putObjectVolatile(abstractFutureC8723Arr, j2, (Object) null);
                        unsafe2.putOrderedObject(abstractFutureC8723Arr, ((i5 & i3) << i7) + r6, abstractFutureC87233);
                        i5 = i6;
                    }
                    C16483.m38848();
                    abstractFutureC87232.m22555();
                    return;
                }
                return;
            }
            i5--;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m41865() {
        return f54637.compareAndSwapInt(this, f54636, 0, 1);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m41866(AbstractFutureC8723 abstractFutureC8723) {
        int length;
        int i = this.f54642;
        int i2 = i - 1;
        AbstractFutureC8723[] abstractFutureC8723Arr = this.f54640;
        if (abstractFutureC8723Arr != null && (length = abstractFutureC8723Arr.length) > 0) {
            boolean z = true;
            long j = (((length - 1) & i2) << f54639) + f54638;
            Unsafe unsafe = f54637;
            if (((AbstractFutureC8723) unsafe.getObject(abstractFutureC8723Arr, j)) == abstractFutureC8723) {
                long j2 = f54636;
                if (unsafe.compareAndSwapInt(this, j2, 0, 1)) {
                    if (this.f54642 == i && this.f54640 == abstractFutureC8723Arr && C6397.m17724(unsafe, abstractFutureC8723Arr, j, abstractFutureC8723)) {
                        this.f54642 = i2;
                    } else {
                        z = false;
                    }
                    unsafe.putOrderedInt(this, j2, 0);
                    return z;
                }
            }
        }
        return false;
    }

    static {
        Unsafe unsafe = C0961.f3616;
        f54637 = unsafe;
        try {
            f54636 = unsafe.objectFieldOffset(C17895.class.getDeclaredField("ܳ"));
            f54638 = unsafe.arrayBaseOffset(AbstractFutureC8723[].class);
            int arrayIndexScale = unsafe.arrayIndexScale(AbstractFutureC8723[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
            f54639 = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}

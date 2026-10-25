package l;

import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* compiled from: N673 */
/* renamed from: l.ܳۤᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class C14468 extends Random {
    public static final long serialVersionUID = -5851777807851030925L;
    public long a;
    public int b;
    public final boolean c;
    public static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};
    public static final ThreadLocal d = new ThreadLocal();
    public static final AtomicInteger e = new AtomicInteger();
    public static final C4591 f = new C4591();
    public static final AtomicLong g = new AtomicLong(f(System.currentTimeMillis()) ^ f(System.nanoTime()));

    public /* synthetic */ C14468(int i) {
        this();
    }

    public static int e(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        return (int) (((j2 ^ (j2 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    public static long f(long j) {
        long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
        long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
        return j3 ^ (j3 >>> 33);
    }

    public C14468() {
        this.c = true;
    }

    public static final void d() {
        int addAndGet = e.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long f2 = f(g.getAndAdd(-4942790177534073029L));
        C14468 c14468 = (C14468) f.get();
        c14468.a = f2;
        c14468.b = addAndGet;
    }

    public static C14468 current() {
        C14468 c14468 = (C14468) f.get();
        if (c14468.b == 0) {
            d();
        }
        return c14468;
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    public final long g() {
        long j = this.a - 7046029254386353131L;
        this.a = j;
        return j;
    }

    @Override // java.util.Random
    public final int next(int i) {
        return nextInt() >>> (32 - i);
    }

    public final long c(long j, long j2) {
        long f2 = f(g());
        if (j >= j2) {
            return f2;
        }
        long j3 = j2 - j;
        long j4 = j3 - 1;
        if ((j3 & j4) == 0) {
            return (f2 & j4) + j;
        }
        if (j3 > 0) {
            while (true) {
                long j5 = f2 >>> 1;
                long j6 = j5 + j4;
                long j7 = j5 % j3;
                if (j6 - j7 >= 0) {
                    return j7 + j;
                }
                f2 = f(g());
            }
        } else {
            while (true) {
                if (f2 >= j && f2 < j2) {
                    return f2;
                }
                f2 = f(g());
            }
        }
    }

    public final int b(int i, int i2) {
        int e2 = e(g());
        if (i >= i2) {
            return e2;
        }
        int i3 = i2 - i;
        int i4 = i3 - 1;
        if ((i3 & i4) == 0) {
            return (e2 & i4) + i;
        }
        if (i3 > 0) {
            int i5 = e2 >>> 1;
            while (true) {
                int i6 = i5 + i4;
                int i7 = i5 % i3;
                if (i6 - i7 >= 0) {
                    return i7 + i;
                }
                i5 = e(g()) >>> 1;
            }
        } else {
            while (true) {
                if (e2 >= i && e2 < i2) {
                    return e2;
                }
                e2 = e(g());
            }
        }
    }

    public final double a(double d2, double d3) {
        double nextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d2 >= d3) {
            return nextLong;
        }
        double d4 = ((d3 - d2) * nextLong) + d2;
        return d4 >= d3 ? Double.longBitsToDouble(Double.doubleToLongBits(d3) - 1) : d4;
    }

    @Override // java.util.Random
    public final int nextInt() {
        return e(g());
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int e2 = e(g());
        int i2 = i - 1;
        if ((i & i2) == 0) {
            return e2 & i2;
        }
        while (true) {
            int i3 = e2 >>> 1;
            int i4 = i3 + i2;
            int i5 = i3 % i;
            if (i4 - i5 >= 0) {
                return i5;
            }
            e2 = e(g());
        }
    }

    public final int nextInt(int i, int i2) {
        if (i >= i2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return b(i, i2);
    }

    @Override // java.util.Random
    public final long nextLong() {
        return f(g());
    }

    public final long nextLong(long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long f2 = f(g());
        long j2 = j - 1;
        if ((j & j2) == 0) {
            return f2 & j2;
        }
        while (true) {
            long j3 = f2 >>> 1;
            long j4 = j3 + j2;
            long j5 = j3 % j;
            if (j4 - j5 >= 0) {
                return j5;
            }
            f2 = f(g());
        }
    }

    public final long nextLong(long j, long j2) {
        if (j >= j2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return c(j, j2);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (f(g()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d2) {
        if (d2 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double f2 = (f(g()) >>> 11) * 1.1102230246251565E-16d * d2;
        return f2 < d2 ? f2 : Double.longBitsToDouble(Double.doubleToLongBits(d2) - 1);
    }

    public final double nextDouble(double d2, double d3) {
        if (d2 >= d3) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        return a(d2, d3);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return e(g()) < 0;
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (e(g()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = d;
        Double d2 = (Double) threadLocal.get();
        if (d2 != null) {
            threadLocal.set(null);
            return d2.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d3 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d3 < 1.0d && d3 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d3) * (-2.0d)) / d3);
                d.set(Double.valueOf(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    @Override // java.util.Random
    public final IntStream ints(long j) {
        if (j >= 0) {
            return C2142.convert(C14841.a(new C13057(0L, j, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return C2142.convert(C14841.a(new C13057(0L, C13132.FOREVER_NS, Integer.MAX_VALUE, 0)));
    }

    @Override // java.util.Random
    public final IntStream ints(long j, int i, int i2) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i < i2) {
            return C2142.convert(C14841.a(new C13057(0L, j, i, i2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final IntStream ints(int i, int i2) {
        if (i < i2) {
            return C2142.convert(C14841.a(new C13057(0L, C13132.FOREVER_NS, i, i2)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        C12352 c12352 = new C12352(0L, j, C13132.FOREVER_NS, 0L);
        return C18019.b(new C0274(c12352, EnumC7330.n(c12352), false));
    }

    @Override // java.util.Random
    public final LongStream longs() {
        C12352 c12352 = new C12352(0L, C13132.FOREVER_NS, C13132.FOREVER_NS, 0L);
        return C18019.b(new C0274(c12352, EnumC7330.n(c12352), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2, long j3) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j2 >= j3) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        C12352 c12352 = new C12352(0L, j, j2, j3);
        return C18019.b(new C0274(c12352, EnumC7330.n(c12352), false));
    }

    @Override // java.util.Random
    public final LongStream longs(long j, long j2) {
        if (j >= j2) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        C12352 c12352 = new C12352(0L, C13132.FOREVER_NS, j, j2);
        return C18019.b(new C0274(c12352, EnumC7330.n(c12352), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        C3180 c3180 = new C3180(0L, j, Double.MAX_VALUE, 0.0d);
        return C14569.b(new C20943(c3180, EnumC7330.n(c3180), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        C3180 c3180 = new C3180(0L, C13132.FOREVER_NS, Double.MAX_VALUE, 0.0d);
        return C14569.b(new C20943(c3180, EnumC7330.n(c3180), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j, double d2, double d3) {
        if (j < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d2 >= d3) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        C3180 c3180 = new C3180(0L, j, d2, d3);
        return C14569.b(new C20943(c3180, EnumC7330.n(c3180), false));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d2, double d3) {
        if (d2 >= d3) {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
        C3180 c3180 = new C3180(0L, C13132.FOREVER_NS, d2, d3);
        return C14569.b(new C20943(c3180, EnumC7330.n(c3180), false));
    }

    static {
        if (((Boolean) AccessController.doPrivileged(new C12684(2))).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j = seed[0] & 255;
            for (int i = 1; i < 8; i++) {
                j = (j << 8) | (seed[i] & 255);
            }
            g.set(j);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    private Object readResolve() {
        return current();
    }
}

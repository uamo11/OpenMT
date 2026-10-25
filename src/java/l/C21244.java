package l;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: 59PE */
/* renamed from: l.᩸֨ۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21244 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final long f68463;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f68464;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final long f68465;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final AbstractC14892 f68466;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final boolean f68467;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final boolean f68468;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final boolean f68469;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Class f68470;

    static {
        Unsafe m48242 = m48242();
        f68464 = m48242;
        f68470 = C0241.m1500();
        boolean m48252 = m48252(Long.TYPE);
        boolean m482522 = m48252(Integer.TYPE);
        AbstractC14892 abstractC14892 = null;
        if (m48242 != null) {
            if (!C0241.m1501()) {
                abstractC14892 = new C7837(m48242);
            } else if (m48252) {
                abstractC14892 = new C0781(m48242);
            } else if (m482522) {
                abstractC14892 = new C5015(m48242);
            }
        }
        f68466 = abstractC14892;
        f68469 = abstractC14892 == null ? false : abstractC14892.mo2985();
        f68467 = abstractC14892 == null ? false : abstractC14892.mo20931();
        f68465 = m48236(byte[].class);
        m48236(boolean[].class);
        m48243(boolean[].class);
        m48236(int[].class);
        m48243(int[].class);
        m48236(long[].class);
        m48243(long[].class);
        m48236(float[].class);
        m48243(float[].class);
        m48236(double[].class);
        m48243(double[].class);
        m48236(Object[].class);
        m48243(Object[].class);
        Field m48238 = m48238();
        f68463 = (m48238 == null || abstractC14892 == null) ? -1L : abstractC14892.m35333(m48238);
        f68468 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m48250() {
        return f68467;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m48247() {
        return f68469;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m48220(Class cls) {
        try {
            return f68464.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m48237(Field field) {
        return f68466.m35333(field);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m48236(Class cls) {
        if (f68467) {
            return f68466.m35328(cls);
        }
        return -1;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48243(Class cls) {
        if (f68467) {
            f68466.m35332(cls);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m48217(long j, Object obj) {
        return (byte) ((f68466.m35335((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int m48233(long j, Object obj) {
        return f68466.m35335(j, obj);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte m48235(long j, Object obj) {
        return (byte) ((f68466.m35335((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48244(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m35335 = f68466.m35335(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m48223(((255 & b) << i) | (m35335 & (~(255 << i))), j2, obj);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m48246(long j, Object obj) {
        return ((byte) ((f68466.m35335((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m48249(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m48223(((255 & b) << i) | (f68466.m35335(j2, obj) & (~(255 << i))), j2, obj);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m48251(long j, Object obj) {
        return ((byte) ((f68466.m35335((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48223(int i, long j, Object obj) {
        f68466.m35329(i, j, obj);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m48253(long j, Object obj) {
        return f68466.m35334(j, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48229(Object obj, long j, long j2) {
        f68466.m35331(obj, j, j2);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m48248(long j, Object obj) {
        return f68466.mo2983(j, obj);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48245(Object obj, long j, boolean z) {
        f68466.mo2982(obj, j, z);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static float m48254(long j, Object obj) {
        return f68466.mo2987(j, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48228(Object obj, long j, float f) {
        f68466.mo2981(obj, j, f);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static double m48241(long j, Object obj) {
        return f68466.mo2986(j, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48227(Object obj, long j, double d) {
        f68466.mo2980(obj, j, d);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static Object m48234(long j, Object obj) {
        return f68466.m35336(j, obj);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48224(long j, Object obj, Object obj2) {
        f68466.m35330(j, obj, obj2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m48218(long j, byte[] bArr) {
        return f68466.mo2984(f68465 + j, bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48232(byte[] bArr, long j, byte b) {
        f68466.mo2979((Object) bArr, f68465 + j, b);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48225(long j, byte[] bArr, long j2, long j3) {
        f68466.mo2978(j, bArr, j2, j3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m48216(long j) {
        return f68466.mo2976(j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m48219(ByteBuffer byteBuffer) {
        return f68466.m35334(f68463, byteBuffer);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m48221(Field field) {
        return f68466.mo2977(field);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Unsafe m48242() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C0075());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m48252(Class cls) {
        if (!C0241.m1501()) {
            return false;
        }
        try {
            Class cls2 = f68470;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Field m48238() {
        Field field;
        Field field2;
        if (C0241.m1501()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48230(Object obj, long j, boolean z) {
        m48244(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48240(Object obj, long j, boolean z) {
        m48249(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48231(Throwable th) {
        Logger.getLogger(C21244.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}

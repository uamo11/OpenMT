package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: MB8H */
/* renamed from: l.ܶᩳᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15399 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m36436(ByteBuffer byteBuffer, Class cls) {
        try {
            C17496 m47861 = new C21025(byteBuffer).m47861();
            if (m47861 == null) {
                throw new C22456("Empty input");
            }
            return m36449(m47861, cls);
        } catch (C14673 e) {
            throw new C22456("Failed to decode top-level data value", e);
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static ArrayList m36451(ByteBuffer byteBuffer) {
        try {
            C17496 m47861 = new C21025(byteBuffer).m47861();
            if (m47861 == null) {
                throw new C22456("Empty input");
            }
            return m36444(m47861, C11852.class);
        } catch (C14673 e) {
            throw new C22456("Failed to decode top-level data value", e);
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Object m36448(C17496 c17496, Class cls) {
        ArrayList m36440 = m36440(cls);
        if (m36440.isEmpty()) {
            throw new C22456("No fields annotated with " + InterfaceC11873.class.getName() + " in CHOICE class " + cls.getName());
        }
        int i = 0;
        while (i < m36440.size() - 1) {
            C5523 c5523 = (C5523) m36440.get(i);
            int m15658 = c5523.m15658();
            int m15657 = c5523.m15657();
            i++;
            for (int i2 = i; i2 < m36440.size(); i2++) {
                C5523 c55232 = (C5523) m36440.get(i2);
                int m156582 = c55232.m15658();
                int m156572 = c55232.m15657();
                if (m15658 == m156582 && m15657 == m156572) {
                    throw new C22456("CHOICE fields are indistinguishable because they have the same tag class and number: " + cls.getName() + "." + c5523.m15660().getName() + " and ." + c55232.m15660().getName());
                }
            }
        }
        try {
            Object newInstance = cls.getConstructor(null).newInstance(null);
            Iterator it = m36440.iterator();
            while (it.hasNext()) {
                try {
                    ((C5523) it.next()).m15656(c17496, newInstance);
                    return newInstance;
                } catch (C1289 unused) {
                }
            }
            throw new C22456("No options of CHOICE " + cls.getName() + " matched");
        } catch (Exception e) {
            throw new C22456("Failed to instantiate ".concat(cls.getName()), e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m36442(C17496 c17496, Class cls) {
        return m36438(c17496, cls, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m36438(C17496 c17496, Class cls, boolean z) {
        C17496 m47861;
        ArrayList m36440 = m36440(cls);
        Collections.sort(m36440, new C19635());
        if (m36440.size() > 1) {
            Iterator it = m36440.iterator();
            C5523 c5523 = null;
            while (it.hasNext()) {
                C5523 c55232 = (C5523) it.next();
                if (c5523 != null && c5523.m15655().index() == c55232.m15655().index()) {
                    throw new C22456("Fields have the same index: " + cls.getName() + "." + c5523.m15660().getName() + " and ." + c55232.m15660().getName());
                }
                c5523 = c55232;
            }
        }
        try {
            Object newInstance = cls.getConstructor(null).newInstance(null);
            C21025 m40879 = c17496.m40879();
            int i = 0;
            while (i < m36440.size()) {
                if (z && i == 0) {
                    m47861 = c17496;
                } else {
                    try {
                        m47861 = m40879.m47861();
                    } catch (C14673 e) {
                        throw new C22456("Malformed data value", e);
                    }
                }
                if (m47861 == null) {
                    break;
                }
                for (int i2 = i; i2 < m36440.size(); i2++) {
                    C5523 c55233 = (C5523) m36440.get(i2);
                    try {
                        if (c55233.m15659()) {
                            try {
                                c55233.m15656(m47861, newInstance);
                            } catch (C1289 unused) {
                            }
                        } else {
                            c55233.m15656(m47861, newInstance);
                        }
                        i = i2 + 1;
                        break;
                    } catch (C22456 e2) {
                        throw new C22456("Failed to parse " + cls.getName() + "." + c55233.m15660().getName(), e2);
                    }
                }
            }
            return newInstance;
        } catch (Exception e3) {
            throw new C22456("Failed to instantiate ".concat(cls.getName()), e3);
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m36444(C17496 c17496, Class cls) {
        Object m36449;
        ArrayList arrayList = new ArrayList();
        C21025 m40879 = c17496.m40879();
        while (true) {
            try {
                C17496 m47861 = m40879.m47861();
                if (m47861 == null) {
                    return arrayList;
                }
                if (ByteBuffer.class.equals(cls)) {
                    m36449 = m47861.m40881();
                } else if (C23161.class.equals(cls)) {
                    m36449 = new C23161(m47861.m40880());
                } else {
                    m36449 = m36449(m47861, cls);
                }
                arrayList.add(m36449);
            } catch (C14673 e) {
                throw new C22456("Malformed data value", e);
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Object m36449(C17496 c17496, Class cls) {
        if (cls == null) {
            throw new NullPointerException("containerClass == null");
        }
        InterfaceC21751 interfaceC21751 = (InterfaceC21751) C18202.m42417(cls);
        if (interfaceC21751 == null) {
            throw new C22456(cls.getName() + " is not annotated with " + InterfaceC21751.class.getName());
        }
        int[] iArr = C0583.f2307;
        int i = iArr[interfaceC21751.type().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new C22456("Unsupported ASN.1 container annotation type: " + interfaceC21751.type());
        }
        EnumC1974 type = interfaceC21751.type();
        int i2 = iArr[type.ordinal()];
        if (i2 == 1) {
            return m36448(c17496, cls);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return m36438(c17496, cls, true);
            }
            throw new C22456("Parsing container " + type + " not supported");
        }
        int m18705 = AbstractC6913.m18705(type);
        if (c17496.m40883() == 0 && c17496.m40882() == m18705) {
            return m36438(c17496, cls, false);
        }
        throw new C1289("Unexpected data value read as " + cls.getName() + ". Expected " + AbstractC6913.m18708(0, m18705) + ", but read: " + AbstractC6913.m18708(c17496.m40883(), c17496.m40882()));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m36450(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new C22456("Empty OBJECT IDENTIFIER");
        }
        long m36447 = m36447(byteBuffer);
        int min = (int) Math.min(m36447 / 40, 2L);
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(min));
        sb.append('.');
        sb.append(Long.toString(m36447 - (min * 40)));
        while (byteBuffer.hasRemaining()) {
            long m364472 = m36447(byteBuffer);
            sb.append('.');
            sb.append(Long.toString(m364472));
        }
        return sb.toString();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static long m36447(ByteBuffer byteBuffer) {
        long j = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0L;
        }
        while (byteBuffer.hasRemaining()) {
            if (j > 72057594037927935L) {
                throw new C22456("Base-128 number too large");
            }
            j = (j << 7) | (r0 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if ((byteBuffer.get() & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw new C22456("Truncated base-128 encoded input: missing terminating byte, with highest bit not set");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static BigInteger m36443(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new BigInteger(bArr);
        }
        return BigInteger.ZERO;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m36441(ByteBuffer byteBuffer) {
        BigInteger m36443 = m36443(byteBuffer);
        if (m36443.bitLength() <= 31) {
            return m36443.intValue();
        }
        throw new C22456(String.format("INTEGER cannot be represented as int: %1$d (0x%1$x)", m36443));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m36445(ByteBuffer byteBuffer) {
        BigInteger m36443 = m36443(byteBuffer);
        if (m36443.bitLength() <= 63) {
            return m36443.longValue();
        }
        throw new C22456(String.format("INTEGER cannot be represented as long: %1$d (0x%1$x)", m36443));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m36440(Class cls) {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            InterfaceC11873 interfaceC11873 = (InterfaceC11873) field.getAnnotation(InterfaceC11873.class);
            if (interfaceC11873 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new C22456(InterfaceC11873.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new C5523(field, interfaceC11873));
                } catch (C22456 e) {
                    throw new C22456("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }
}

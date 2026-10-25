package l;

import com.umeng.analytics.pro.bo;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: 8B7K */
/* renamed from: l.ۤᩳᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10462 {
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m26341(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC21751 interfaceC21751 = (InterfaceC21751) C18202.m42417(cls);
        if (interfaceC21751 == null) {
            throw new C6228(cls.getName() + " not annotated with " + InterfaceC21751.class.getName());
        }
        EnumC1974 type = interfaceC21751.type();
        int i = C4817.f15241[type.ordinal()];
        if (i == 1) {
            return m26342(obj);
        }
        if (i == 2) {
            return m26331(obj, false);
        }
        if (i == 3) {
            return m26331(obj, true);
        }
        throw new C6228("Unsupported container type: " + type);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static byte[] m26342(Object obj) {
        Class<?> cls = obj.getClass();
        ArrayList m26343 = m26343(obj);
        if (m26343.isEmpty()) {
            throw new C6228("No fields annotated with " + InterfaceC11873.class.getName() + " in CHOICE class " + cls.getName());
        }
        Iterator it = m26343.iterator();
        C3406 c3406 = null;
        while (it.hasNext()) {
            C3406 c34062 = (C3406) it.next();
            if (m26337(c34062.m10376(), obj) != null) {
                if (c3406 != null) {
                    throw new C6228("Multiple non-null fields in CHOICE class " + cls.getName() + ": " + c3406.m10376().getName() + ", " + c34062.m10376().getName());
                }
                c3406 = c34062;
            }
        }
        if (c3406 == null) {
            throw new C6228("No non-null fields in CHOICE class ".concat(cls.getName()));
        }
        return c3406.m10377();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m26339(Object obj) {
        return m26331(obj, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26331(Object obj, boolean z) {
        Class<?> cls = obj.getClass();
        ArrayList m26343 = m26343(obj);
        Collections.sort(m26343, new C20340());
        if (m26343.size() > 1) {
            Iterator it = m26343.iterator();
            C3406 c3406 = null;
            while (it.hasNext()) {
                C3406 c34062 = (C3406) it.next();
                if (c3406 != null && c3406.m10375().index() == c34062.m10375().index()) {
                    throw new C6228("Fields have the same index: " + cls.getName() + "." + c3406.m10376().getName() + " and ." + c34062.m10376().getName());
                }
                c3406 = c34062;
            }
        }
        ArrayList arrayList = new ArrayList(m26343.size());
        Iterator it2 = m26343.iterator();
        int i = 0;
        while (it2.hasNext()) {
            C3406 c34063 = (C3406) it2.next();
            try {
                byte[] m10377 = c34063.m10377();
                if (m10377 != null) {
                    arrayList.add(m10377);
                    i += m10377.length;
                }
            } catch (C6228 e) {
                throw new C6228("Failed to encode " + cls.getName() + "." + c34063.m10376().getName(), e);
            }
        }
        if (z) {
            byte[] bArr = new byte[i];
            Iterator it3 = arrayList.iterator();
            int i2 = 0;
            while (it3.hasNext()) {
                byte[] bArr2 = (byte[]) it3.next();
                System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
                i2 += bArr2.length;
            }
            return bArr;
        }
        return m26338(0, true, 16, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m26340(Collection collection, EnumC1974 enumC1974) {
        return m26335(collection, enumC1974, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26334(Collection collection, EnumC1974 enumC1974) {
        return m26335(collection, enumC1974, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26335(Collection collection, EnumC1974 enumC1974, boolean z) {
        int i;
        C13283 c13283;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(C12578.m30818(it.next(), enumC1974, null));
        }
        if (z) {
            if (arrayList.size() > 1) {
                c13283 = C13283.f39769;
                Collections.sort(arrayList, c13283);
            }
            i = 17;
        } else {
            i = 16;
        }
        return m26338(0, true, i, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m26343(Object obj) {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            InterfaceC11873 interfaceC11873 = (InterfaceC11873) field.getAnnotation(InterfaceC11873.class);
            if (interfaceC11873 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new C6228(InterfaceC11873.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new C3406(obj, field, interfaceC11873));
                } catch (C6228 e) {
                    throw new C6228("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26327(int i) {
        return m26338(0, false, 2, BigInteger.valueOf(i).toByteArray());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26329(long j) {
        return m26338(0, false, 2, BigInteger.valueOf(j).toByteArray());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26333(BigInteger bigInteger) {
        return m26338(0, false, 2, bigInteger.toByteArray());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26336(boolean z) {
        byte[] bArr = new byte[1];
        if (z) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return m26338(0, false, 1, bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26332(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String[] split = str.split("\\.");
        if (split.length < 2) {
            throw new C6228("OBJECT IDENTIFIER must contain at least two nodes: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            if (parseInt > 6 || parseInt < 0) {
                throw new C6228(C19370.m44628(parseInt, "Invalid value for node #1: "));
            }
            try {
                int parseInt2 = Integer.parseInt(split[1]);
                if (parseInt2 >= 40 || parseInt2 < 0) {
                    throw new C6228(C19370.m44628(parseInt2, "Invalid value for node #2: "));
                }
                int i = (parseInt * 40) + parseInt2;
                if (i > 255) {
                    throw new C6228(C18307.m42646("First two nodes out of range: ", parseInt, parseInt2, "."));
                }
                byteArrayOutputStream.write(i);
                for (int i2 = 2; i2 < split.length; i2++) {
                    String str2 = split[i2];
                    try {
                        int parseInt3 = Integer.parseInt(str2);
                        if (parseInt3 < 0) {
                            throw new C6228("Invalid value for node #" + (i2 + 1) + ": " + parseInt3);
                        }
                        if (parseInt3 <= 127) {
                            byteArrayOutputStream.write(parseInt3);
                        } else if (parseInt3 < 16384) {
                            byteArrayOutputStream.write((parseInt3 >> 7) | 128);
                            byteArrayOutputStream.write(parseInt3 & 127);
                        } else {
                            if (parseInt3 >= 2097152) {
                                throw new C6228("Node #" + (i2 + 1) + " too large: " + parseInt3);
                            }
                            byteArrayOutputStream.write((parseInt3 >> 14) | 128);
                            byteArrayOutputStream.write((127 & (parseInt3 >> 7)) | 128);
                            byteArrayOutputStream.write(parseInt3 & 127);
                        }
                    } catch (NumberFormatException unused) {
                        throw new C6228("Node #" + (i2 + 1) + " not numeric: " + str2);
                    }
                }
                return m26338(0, false, 6, byteArrayOutputStream.toByteArray());
            } catch (NumberFormatException unused2) {
                throw new C6228("Node #2 not numeric: " + split[1]);
            }
        } catch (NumberFormatException unused3) {
            throw new C6228("Node #1 not numeric: " + split[0]);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m26337(Field field, Object obj) {
        try {
            return field.get(obj);
        } catch (Exception e) {
            throw new C6228("Failed to read " + obj.getClass().getName() + "." + field.getName(), e);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m26338(int i, boolean z, int i2, byte[]... bArr) {
        byte[] bArr2;
        if (i2 >= 31) {
            throw new IllegalArgumentException(C19370.m44628(i2, "High tag numbers not supported: "));
        }
        int i3 = 6;
        byte b = (byte) ((i << 6) | (z ? 32 : 0) | i2);
        int i4 = 0;
        for (byte[] bArr3 : bArr) {
            i4 += bArr3.length;
        }
        int i5 = 2;
        if (i4 < 128) {
            bArr2 = new byte[i4 + 2];
            bArr2[0] = b;
            bArr2[1] = (byte) i4;
        } else {
            if (i4 <= 255) {
                bArr2 = new byte[i4 + 3];
                bArr2[1] = -127;
                bArr2[2] = (byte) i4;
                i3 = 3;
            } else if (i4 <= 65535) {
                byte[] bArr4 = new byte[i4 + 4];
                bArr4[1] = bo.h;
                bArr4[2] = (byte) (i4 >> 8);
                bArr4[3] = (byte) (i4 & 255);
                bArr2 = bArr4;
                i3 = 4;
            } else if (i4 <= 16777215) {
                byte[] bArr5 = new byte[i4 + 5];
                bArr5[1] = -125;
                bArr5[2] = (byte) (i4 >> 16);
                bArr5[3] = (byte) ((i4 >> 8) & 255);
                bArr5[4] = (byte) (i4 & 255);
                bArr2 = bArr5;
                i3 = 5;
            } else {
                byte[] bArr6 = new byte[i4 + 6];
                bArr6[1] = -124;
                bArr6[2] = (byte) (i4 >> 24);
                bArr6[3] = (byte) ((i4 >> 16) & 255);
                bArr6[4] = (byte) ((i4 >> 8) & 255);
                bArr6[5] = (byte) (i4 & 255);
                bArr2 = bArr6;
            }
            bArr2[0] = b;
            i5 = i3;
        }
        for (byte[] bArr7 : bArr) {
            System.arraycopy(bArr7, 0, bArr2, i5, bArr7.length);
            i5 += bArr7.length;
        }
        return bArr2;
    }
}

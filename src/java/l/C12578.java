package l;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Collection;

/* compiled from: 8B7K */
/* renamed from: l.۫ᩳᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12578 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m30818(Object obj, EnumC1974 enumC1974, EnumC1974 enumC19742) {
        byte[] m26342;
        byte[] bArr;
        byte[] m26338;
        byte[] m263382;
        Class<?> cls = obj.getClass();
        if (C23161.class.equals(cls)) {
            ByteBuffer m51340 = ((C23161) obj).m51340();
            byte[] bArr2 = new byte[m51340.remaining()];
            m51340.get(bArr2);
            return bArr2;
        }
        if (enumC1974 == null || enumC1974 == EnumC1974.ANY) {
            return C10462.m26341(obj);
        }
        switch (C4817.f15241[enumC1974.ordinal()]) {
            case 1:
                InterfaceC21751 interfaceC21751 = (InterfaceC21751) C18202.m42417(cls);
                if (interfaceC21751 != null && interfaceC21751.type() == EnumC1974.CHOICE) {
                    m26342 = C10462.m26342(obj);
                    return m26342;
                }
                break;
            case 2:
                InterfaceC21751 interfaceC217512 = (InterfaceC21751) C18202.m42417(cls);
                if (interfaceC217512 != null && interfaceC217512.type() == EnumC1974.SEQUENCE) {
                    return C10462.m26339(obj);
                }
                break;
            case 4:
            case 5:
                if (obj instanceof ByteBuffer) {
                    ByteBuffer byteBuffer = (ByteBuffer) obj;
                    bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.slice().get(bArr);
                } else {
                    bArr = obj instanceof byte[] ? (byte[]) obj : null;
                }
                if (bArr != null) {
                    m26338 = C10462.m26338(0, false, AbstractC16790.m39524(enumC1974), bArr);
                    return m26338;
                }
                break;
            case 6:
                if (obj instanceof Integer) {
                    return C10462.m26327(((Integer) obj).intValue());
                }
                if (obj instanceof Long) {
                    return C10462.m26329(((Long) obj).longValue());
                }
                if (obj instanceof BigInteger) {
                    return C10462.m26333((BigInteger) obj);
                }
                break;
            case 7:
                if (obj instanceof Boolean) {
                    return C10462.m26336(((Boolean) obj).booleanValue());
                }
                break;
            case 8:
            case 9:
                if (obj instanceof String) {
                    m263382 = C10462.m26338(0, false, AbstractC16790.m39524(enumC1974), ((String) obj).getBytes());
                    return m263382;
                }
                break;
            case 10:
                if (obj instanceof String) {
                    return C10462.m26332((String) obj);
                }
                break;
            case 11:
                return C10462.m26340((Collection) obj, enumC19742);
            case 12:
                return C10462.m26334((Collection) obj, enumC19742);
        }
        throw new C6228("Unsupported conversion: " + cls.getName() + " to ASN.1 " + enumC1974);
    }
}

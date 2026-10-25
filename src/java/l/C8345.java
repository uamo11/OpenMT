package l;

import java.math.BigInteger;
import java.nio.ByteBuffer;

/* compiled from: MB8H */
/* renamed from: l.۠ᩳᩳ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8345 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m21943(EnumC1974 enumC1974, C17496 c17496, Class cls) {
        Object m36448;
        BigInteger m36443;
        if (ByteBuffer.class.equals(cls)) {
            return c17496.m40881();
        }
        if (byte[].class.equals(cls)) {
            ByteBuffer m40881 = c17496.m40881();
            if (!m40881.hasRemaining()) {
                return C5659.f17466;
            }
            byte[] bArr = new byte[m40881.remaining()];
            m40881.get(bArr);
            return bArr;
        }
        if (C23161.class.equals(cls)) {
            return new C23161(c17496.m40880());
        }
        ByteBuffer m408812 = c17496.m40881();
        int i = C0583.f2307[enumC1974.ordinal()];
        if (i == 1) {
            InterfaceC21751 interfaceC21751 = (InterfaceC21751) C18202.m42417(cls);
            if (interfaceC21751 != null && interfaceC21751.type() == EnumC1974.CHOICE) {
                m36448 = C15399.m36448(c17496, cls);
                return m36448;
            }
        } else if (i != 2) {
            switch (i) {
                case 6:
                    if (Integer.TYPE.equals(cls) || Integer.class.equals(cls)) {
                        return Integer.valueOf(C15399.m36441(m408812));
                    }
                    if (Long.TYPE.equals(cls) || Long.class.equals(cls)) {
                        return Long.valueOf(C15399.m36445(m408812));
                    }
                    if (BigInteger.class.equals(cls)) {
                        m36443 = C15399.m36443(m408812);
                        return m36443;
                    }
                    break;
                case 7:
                    if (String.class.equals(cls)) {
                        return C15399.m36450(m408812);
                    }
                    break;
                case 8:
                case 9:
                    if (String.class.equals(cls)) {
                        byte[] bArr2 = new byte[m408812.remaining()];
                        m408812.get(bArr2);
                        return new String(bArr2);
                    }
                    break;
                case 10:
                    if (Boolean.TYPE.equals(cls)) {
                        if (m408812.remaining() != 1) {
                            throw new C22456("Incorrect encoded size of boolean value: " + m408812.remaining());
                        }
                        return new Boolean(m408812.get() != 0);
                    }
                    break;
            }
        } else {
            InterfaceC21751 interfaceC217512 = (InterfaceC21751) C18202.m42417(cls);
            if (interfaceC217512 != null && interfaceC217512.type() == EnumC1974.SEQUENCE) {
                return C15399.m36442(c17496, cls);
            }
        }
        throw new C22456("Unsupported conversion: ASN.1 " + enumC1974 + " to " + cls.getName());
    }
}

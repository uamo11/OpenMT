package l;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: CAOD */
/* renamed from: l.ۢܽܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9713 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24685(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c < 'a' || c > 'f') {
            return -1;
        }
        return c - 'W';
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24687(String str) {
        C2657 c2657 = new C2657();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c2657.setOutput(byteArrayOutputStream, "utf-8");
        c2657.startDocument("utf-8", Boolean.TRUE);
        int i = C5108.f16016;
        C7184 c7184 = new C7184();
        c7184.m19219(new StringReader(str));
        Iterator<E> it = C5108.m14654(c7184, true).iterator();
        while (it.hasNext()) {
            m24686(c2657, (C19220) it.next());
        }
        c2657.endDocument();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24686(C2657 c2657, AbstractC8636 abstractC8636) {
        String str;
        String str2;
        char c;
        int i;
        int i2;
        if (!abstractC8636.mo3218()) {
            if (abstractC8636.mo3218()) {
                throw new UnsupportedOperationException();
            }
            c2657.text(((C0874) abstractC8636).m3219());
            return;
        }
        C19220 m22400 = abstractC8636.m22400();
        c2657.startTag(null, m22400.m44350());
        Iterator it = m22400.m44351().iterator();
        while (it.hasNext()) {
            C18514 c18514 = (C18514) it.next();
            String m43025 = c18514.m43025();
            int lastIndexOf = m43025.lastIndexOf(45);
            if (lastIndexOf > 0) {
                str = m43025.substring(0, lastIndexOf);
                str2 = m43025.substring(lastIndexOf + 1);
            } else {
                str = m43025;
                str2 = "";
            }
            str2.getClass();
            Iterator it2 = it;
            switch (str2.hashCode()) {
                case -1396204209:
                    if (str2.equals("base64")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1325958191:
                    if (str2.equals(ClassTransform.DOUBLE)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 103195:
                    if (str2.equals("hex")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 104431:
                    if (str2.equals(ClassTransform.INTEGER)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 114225:
                    if (str2.equals("str")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3029738:
                    if (str2.equals("bool")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3327612:
                    if (str2.equals(ClassTransform.LONG)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 3392903:
                    if (str2.equals("null")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 97526364:
                    if (str2.equals(ClassTransform.FLOAT)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 570410801:
                    if (str2.equals("interned")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case '\b':
                case '\t':
                    break;
                default:
                    str = m43025;
                    str2 = "";
                    break;
            }
            C19220 c19220 = m22400;
            switch (str2.hashCode()) {
                case -1396204209:
                    if (str2.equals("base64")) {
                        try {
                            c2657.m8342(str, Base64.decode(c18514.m43026(), 2));
                            it = it2;
                            m22400 = c19220;
                        } catch (Exception e) {
                            C1580 c1580 = new C1580(e.getMessage(), c18514);
                            c1580.initCause((Throwable) e);
                            throw c1580;
                        }
                    }
                    c2657.attribute(null, str, c18514.m43026());
                    it = it2;
                    m22400 = c19220;
                case -1325958191:
                    if (str2.equals(ClassTransform.DOUBLE)) {
                        try {
                            c2657.m8338(str, Double.parseDouble(c18514.m43026()));
                            it = it2;
                            m22400 = c19220;
                        } catch (Exception e2) {
                            C1580 c15802 = new C1580(e2.getMessage(), c18514);
                            c15802.initCause((Throwable) e2);
                            throw c15802;
                        }
                    }
                    c2657.attribute(null, str, c18514.m43026());
                    it = it2;
                    m22400 = c19220;
                case 103195:
                    if (str2.equals("hex")) {
                        String m43026 = c18514.m43026();
                        int length = m43026.length();
                        if (length % 2 != 0) {
                            throw new C1580("Invalid length for hex text", c18514);
                        }
                        byte[] bArr = new byte[length / 2];
                        for (int i3 = 0; i3 < length; i3 += 2) {
                            int m24685 = m24685(m43026.charAt(i3));
                            int m246852 = m24685(m43026.charAt(i3 + 1));
                            if (m24685 == -1 || m246852 == -1) {
                                throw new C1580("Invalid characters for hex text", c18514);
                            }
                            bArr[i3 / 2] = (byte) ((m24685 * 16) + m246852);
                        }
                        c2657.m8345(str, bArr);
                        it = it2;
                        m22400 = c19220;
                    }
                    c2657.attribute(null, str, c18514.m43026());
                    it = it2;
                    m22400 = c19220;
                    break;
                case 104431:
                    if (str2.equals(ClassTransform.INTEGER)) {
                        String lowerCase = c18514.m43026().toLowerCase();
                        if (lowerCase.startsWith("0x") || lowerCase.startsWith("-0x")) {
                            String m430262 = c18514.m43026();
                            try {
                                if (m430262.startsWith("-")) {
                                    m430262 = m430262.substring(1);
                                    i = -1;
                                } else {
                                    i = 1;
                                }
                                c2657.m8343(Integer.parseInt(m430262.substring(2), 16) * i, str);
                            } catch (Exception e3) {
                                C1580 c15803 = new C1580(e3.getMessage(), c18514);
                                c15803.initCause((Throwable) e3);
                                throw c15803;
                            }
                        } else {
                            try {
                                c2657.m8336(Integer.parseInt(c18514.m43026()), str);
                            } catch (Exception e4) {
                                C1580 c15804 = new C1580(e4.getMessage(), c18514);
                                c15804.initCause((Throwable) e4);
                                throw c15804;
                            }
                        }
                        it = it2;
                        m22400 = c19220;
                    }
                    c2657.attribute(null, str, c18514.m43026());
                    it = it2;
                    m22400 = c19220;
                    break;
                case 114225:
                    str2.equals("str");
                    c2657.attribute(null, str, c18514.m43026());
                    it = it2;
                    m22400 = c19220;
                case 3029738:
                    if (str2.equals("bool")) {
                        try {
                            c2657.m8341(str, Boolean.parseBoolean(c18514.m43026()));
                            it = it2;
                            m22400 = c19220;
                        } catch (Exception e5) {
                            C1580 c15805 = new C1580(e5.getMessage(), c18514);
                            c15805.initCause((Throwable) e5);
                            throw c15805;
                        }
                    }
                    c2657.attribute(null, str, c18514.m43026());
                    it = it2;
                    m22400 = c19220;
                case 3327612:
                    if (str2.equals(ClassTransform.LONG)) {
                        String lowerCase2 = c18514.m43026().toLowerCase();
                        if (lowerCase2.startsWith("0x") || lowerCase2.startsWith("-0x")) {
                            String m430263 = c18514.m43026();
                            try {
                                if (m430263.startsWith("-")) {
                                    m430263 = m430263.substring(1);
                                    i2 = -1;
                                } else {
                                    i2 = 1;
                                }
                                c2657.m8344(Long.parseLong(m430263.substring(2), 16) * i2, str);
                            } catch (Exception e6) {
                                C1580 c15806 = new C1580(e6.getMessage(), c18514);
                                c15806.initCause((Throwable) e6);
                                throw c15806;
                            }
                        } else {
                            try {
                                c2657.m8337(Long.parseLong(c18514.m43026()), str);
                            } catch (Exception e7) {
                                C1580 c15807 = new C1580(e7.getMessage(), c18514);
                                c15807.initCause((Throwable) e7);
                                throw c15807;
                            }
                        }
                        it = it2;
                        m22400 = c19220;
                    }
                    c2657.attribute(null, str, c18514.m43026());
                    it = it2;
                    m22400 = c19220;
                    break;
                case 3392903:
                    if (str2.equals("null")) {
                        c2657.attribute(null, str, null);
                        it = it2;
                        m22400 = c19220;
                    }
                    c2657.attribute(null, str, c18514.m43026());
                    it = it2;
                    m22400 = c19220;
                case 97526364:
                    if (str2.equals(ClassTransform.FLOAT)) {
                        try {
                            c2657.m8339(str, Float.parseFloat(c18514.m43026()));
                            it = it2;
                            m22400 = c19220;
                        } catch (Exception e8) {
                            C1580 c15808 = new C1580(e8.getMessage(), c18514);
                            c15808.initCause((Throwable) e8);
                            throw c15808;
                        }
                    }
                    c2657.attribute(null, str, c18514.m43026());
                    it = it2;
                    m22400 = c19220;
                case 570410801:
                    if (str2.equals("interned")) {
                        c2657.m8340(str, c18514.m43026());
                        it = it2;
                        m22400 = c19220;
                    }
                    c2657.attribute(null, str, c18514.m43026());
                    it = it2;
                    m22400 = c19220;
                default:
                    c2657.attribute(null, str, c18514.m43026());
                    it = it2;
                    m22400 = c19220;
            }
        }
        C19220 c192202 = m22400;
        Iterator it3 = c192202.m44345().iterator();
        while (it3.hasNext()) {
            m24686(c2657, (AbstractC8636) it3.next());
        }
        c2657.endTag(null, c192202.m44350());
    }
}

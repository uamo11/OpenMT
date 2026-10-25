package l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* compiled from: W9NV */
/* renamed from: l.ۢ᩶ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9815 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f29669 = {KeyFactorySpi.Ed25519_type, 114, KeyFactorySpi.x448_type, 0};

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f29670 = {KeyFactorySpi.Ed25519_type, 114, 109, 0};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24879(String str, byte[] bArr, String str2) {
        byte[] bArr2 = C18987.f59862;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C18987.f59864;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return C9045.m23341(C5368.m15339(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24881(ByteArrayOutputStream byteArrayOutputStream, C10583 c10583, String str) {
        Charset charset = StandardCharsets.UTF_8;
        C6349.m17625(byteArrayOutputStream, str.getBytes(charset).length);
        C6349.m17625(byteArrayOutputStream, c10583.f31768);
        C6349.m17626(byteArrayOutputStream, c10583.f31769, 4);
        C6349.m17626(byteArrayOutputStream, c10583.f31772, 4);
        C6349.m17626(byteArrayOutputStream, c10583.f31773, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24882(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C10583[] c10583Arr) {
        int length;
        byte[] bArr2 = C18987.f59865;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = C18987.f59861;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] m24883 = m24883(c10583Arr, bArr3);
                C6349.m17626(byteArrayOutputStream, c10583Arr.length, 1);
                C6349.m17626(byteArrayOutputStream, m24883.length, 4);
                byte[] m17629 = C6349.m17629(m24883);
                C6349.m17626(byteArrayOutputStream, m17629.length, 4);
                byteArrayOutputStream.write(m17629);
                return true;
            }
            byte[] bArr4 = C18987.f59864;
            if (Arrays.equals(bArr, bArr4)) {
                C6349.m17626(byteArrayOutputStream, c10583Arr.length, 1);
                for (C10583 c10583 : c10583Arr) {
                    int size = c10583.f31767.size() * 4;
                    String m24879 = m24879(c10583.f31766, bArr4, c10583.f31771);
                    Charset charset = StandardCharsets.UTF_8;
                    C6349.m17625(byteArrayOutputStream, m24879.getBytes(charset).length);
                    C6349.m17625(byteArrayOutputStream, c10583.f31770.length);
                    C6349.m17626(byteArrayOutputStream, size, 4);
                    C6349.m17626(byteArrayOutputStream, c10583.f31772, 4);
                    byteArrayOutputStream.write(m24879.getBytes(charset));
                    Iterator it = c10583.f31767.keySet().iterator();
                    while (it.hasNext()) {
                        C6349.m17625(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        C6349.m17625(byteArrayOutputStream, 0);
                    }
                    for (int i : c10583.f31770) {
                        C6349.m17625(byteArrayOutputStream, i);
                    }
                }
                return true;
            }
            byte[] bArr5 = C18987.f59863;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] m248832 = m24883(c10583Arr, bArr5);
                C6349.m17626(byteArrayOutputStream, c10583Arr.length, 1);
                C6349.m17626(byteArrayOutputStream, m248832.length, 4);
                byte[] m176292 = C6349.m17629(m248832);
                C6349.m17626(byteArrayOutputStream, m176292.length, 4);
                byteArrayOutputStream.write(m176292);
                return true;
            }
            byte[] bArr6 = C18987.f59862;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            C6349.m17625(byteArrayOutputStream, c10583Arr.length);
            for (C10583 c105832 : c10583Arr) {
                String str = c105832.f31766;
                TreeMap treeMap = c105832.f31767;
                String m248792 = m24879(str, bArr6, c105832.f31771);
                Charset charset2 = StandardCharsets.UTF_8;
                C6349.m17625(byteArrayOutputStream, m248792.getBytes(charset2).length);
                C6349.m17625(byteArrayOutputStream, treeMap.size());
                C6349.m17625(byteArrayOutputStream, c105832.f31770.length);
                C6349.m17626(byteArrayOutputStream, c105832.f31772, 4);
                byteArrayOutputStream.write(m248792.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    C6349.m17625(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i2 : c105832.f31770) {
                    C6349.m17625(byteArrayOutputStream, i2);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            C6349.m17625(byteArrayOutputStream2, c10583Arr.length);
            int i3 = 2;
            for (C10583 c105833 : c10583Arr) {
                C6349.m17626(byteArrayOutputStream2, c105833.f31772, 4);
                C6349.m17626(byteArrayOutputStream2, c105833.f31774, 4);
                C6349.m17626(byteArrayOutputStream2, c105833.f31773, 4);
                String m248793 = m24879(c105833.f31766, bArr2, c105833.f31771);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = m248793.getBytes(charset3).length;
                C6349.m17625(byteArrayOutputStream2, length2);
                i3 = i3 + 14 + length2;
                byteArrayOutputStream2.write(m248793.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i3 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            }
            C19693 c19693 = new C19693(EnumC11994.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(c19693);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i4 = 0;
            for (int i5 = 0; i5 < c10583Arr.length; i5++) {
                try {
                    C10583 c105834 = c10583Arr[i5];
                    C6349.m17625(byteArrayOutputStream3, i5);
                    C6349.m17625(byteArrayOutputStream3, c105834.f31768);
                    i4 = i4 + 4 + (c105834.f31768 * 2);
                    int[] iArr = c105834.f31770;
                    int length3 = iArr.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length3) {
                        int i8 = iArr[i6];
                        C6349.m17625(byteArrayOutputStream3, i8 - i7);
                        i6++;
                        i7 = i8;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i4 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray2.length);
            }
            C19693 c196932 = new C19693(EnumC11994.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(c196932);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i9 = 0;
            for (int i10 = 0; i10 < c10583Arr.length; i10++) {
                try {
                    C10583 c105835 = c10583Arr[i10];
                    Iterator it3 = c105835.f31767.entrySet().iterator();
                    int i11 = 0;
                    while (it3.hasNext()) {
                        i11 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m24880(byteArrayOutputStream4, c105835);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m24890(byteArrayOutputStream4, c105835);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            C6349.m17625(byteArrayOutputStream3, i10);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i12 = i9 + 6;
                            C6349.m17626(byteArrayOutputStream3, length4, 4);
                            C6349.m17625(byteArrayOutputStream3, i11);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i9 = i12 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray5.length);
            }
            C19693 c196933 = new C19693(EnumC11994.METHODS, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(c196933);
            long j = 4;
            long size2 = j + j + 4 + (arrayList.size() * 16);
            C6349.m17626(byteArrayOutputStream, arrayList.size(), 4);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                C19693 c196934 = (C19693) arrayList.get(i13);
                EnumC11994 enumC11994 = c196934.f63624;
                byte[] bArr7 = c196934.f63622;
                C6349.m17626(byteArrayOutputStream, enumC11994.getValue(), 4);
                C6349.m17626(byteArrayOutputStream, size2, 4);
                if (c196934.f63623) {
                    long length5 = bArr7.length;
                    byte[] m176293 = C6349.m17629(bArr7);
                    arrayList2.add(m176293);
                    C6349.m17626(byteArrayOutputStream, m176293.length, 4);
                    C6349.m17626(byteArrayOutputStream, length5, 4);
                    length = m176293.length;
                } else {
                    arrayList2.add(bArr7);
                    C6349.m17626(byteArrayOutputStream, bArr7.length, 4);
                    C6349.m17626(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
            }
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i14));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24883(C10583[] c10583Arr, byte[] bArr) {
        int i = 0;
        for (C10583 c10583 : c10583Arr) {
            i += ((((c10583.f31773 * 2) + 7) & (-8)) / 8) + (c10583.f31768 * 2) + m24879(c10583.f31766, bArr, c10583.f31771).getBytes(StandardCharsets.UTF_8).length + 16 + c10583.f31769;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        if (Arrays.equals(bArr, C18987.f59863)) {
            for (C10583 c105832 : c10583Arr) {
                m24881(byteArrayOutputStream, c105832, m24879(c105832.f31766, bArr, c105832.f31771));
                m24890(byteArrayOutputStream, c105832);
                int[] iArr = c105832.f31770;
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = iArr[i2];
                    C6349.m17625(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                m24880(byteArrayOutputStream, c105832);
            }
        } else {
            for (C10583 c105833 : c10583Arr) {
                m24881(byteArrayOutputStream, c105833, m24879(c105833.f31766, bArr, c105833.f31771));
            }
            for (C10583 c105834 : c10583Arr) {
                m24890(byteArrayOutputStream, c105834);
                int[] iArr2 = c105834.f31770;
                int length2 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr2[i5];
                    C6349.m17625(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                m24880(byteArrayOutputStream, c105834);
            }
        }
        if (byteArrayOutputStream.size() != i) {
            throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m24890(ByteArrayOutputStream byteArrayOutputStream, C10583 c10583) {
        int i = 0;
        for (Map.Entry entry : c10583.f31767.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                C6349.m17625(byteArrayOutputStream, intValue - i);
                C6349.m17625(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24880(ByteArrayOutputStream byteArrayOutputStream, C10583 c10583) {
        byte[] bArr = new byte[(((c10583.f31773 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c10583.f31767.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i = intValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i2 = intValue + c10583.f31773;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10583[] m24888(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, C18987.f59861)) {
            int m17630 = (int) C6349.m17630(fileInputStream, 1);
            byte[] m17627 = C6349.m17627(fileInputStream, (int) C6349.m17630(fileInputStream, 4), (int) C6349.m17630(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m17627);
            try {
                C10583[] m24886 = m24886(byteArrayInputStream, str, m17630);
                byteArrayInputStream.close();
                return m24886;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw new IllegalStateException("Unsupported version");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10583[] m24889(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C10583[] c10583Arr) {
        byte[] bArr3 = C18987.f59859;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, C18987.f59860)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m17630 = (int) C6349.m17630(fileInputStream, 2);
            byte[] m17627 = C6349.m17627(fileInputStream, (int) C6349.m17630(fileInputStream, 4), (int) C6349.m17630(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m17627);
            try {
                C10583[] m24887 = m24887(byteArrayInputStream, bArr2, m17630, c10583Arr);
                byteArrayInputStream.close();
                return m24887;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(C18987.f59865, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m176302 = (int) C6349.m17630(fileInputStream, 1);
        byte[] m176272 = C6349.m17627(fileInputStream, (int) C6349.m17630(fileInputStream, 4), (int) C6349.m17630(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(m176272);
        try {
            C10583[] m24885 = m24885(byteArrayInputStream2, m176302, c10583Arr);
            byteArrayInputStream2.close();
            return m24885;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10583[] m24887(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C10583[] c10583Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C10583[0];
        }
        if (i != c10583Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            C6349.m17630(byteArrayInputStream, 2);
            String str = new String(C6349.m17628(byteArrayInputStream, (int) C6349.m17630(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m17630 = C6349.m17630(byteArrayInputStream, 4);
            int m176302 = (int) C6349.m17630(byteArrayInputStream, 2);
            C10583 c10583 = null;
            if (c10583Arr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c10583Arr.length) {
                        break;
                    }
                    if (c10583Arr[i3].f31771.equals(substring)) {
                        c10583 = c10583Arr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c10583 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c10583.f31774 = m17630;
            int[] m24884 = m24884(byteArrayInputStream, m176302);
            if (Arrays.equals(bArr, C18987.f59862)) {
                c10583.f31768 = m176302;
                c10583.f31770 = m24884;
            }
        }
        return c10583Arr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10583[] m24885(ByteArrayInputStream byteArrayInputStream, int i, C10583[] c10583Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C10583[0];
        }
        if (i != c10583Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int m17630 = (int) C6349.m17630(byteArrayInputStream, 2);
            iArr[i2] = (int) C6349.m17630(byteArrayInputStream, 2);
            strArr[i2] = new String(C6349.m17628(byteArrayInputStream, m17630), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C10583 c10583 = c10583Arr[i3];
            if (!c10583.f31771.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c10583.f31768 = i4;
            c10583.f31770 = m24884(byteArrayInputStream, i4);
        }
        return c10583Arr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10583[] m24886(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2;
        if (byteArrayInputStream.available() == 0) {
            return new C10583[0];
        }
        C10583[] c10583Arr = new C10583[i];
        int i3 = 0;
        while (true) {
            i2 = 2;
            if (i3 >= i) {
                break;
            }
            int m17630 = (int) C6349.m17630(byteArrayInputStream, 2);
            int m176302 = (int) C6349.m17630(byteArrayInputStream, 2);
            c10583Arr[i3] = new C10583(str, new String(C6349.m17628(byteArrayInputStream, m17630), StandardCharsets.UTF_8), C6349.m17630(byteArrayInputStream, 4), m176302, (int) C6349.m17630(byteArrayInputStream, 4), (int) C6349.m17630(byteArrayInputStream, 4), new int[m176302], new TreeMap());
            i3++;
        }
        for (int i4 = 0; i4 < i; i4++) {
            C10583 c10583 = c10583Arr[i4];
            int available = byteArrayInputStream.available();
            int i5 = c10583.f31769;
            int i6 = c10583.f31773;
            TreeMap treeMap = c10583.f31767;
            int i7 = available - i5;
            int i8 = 0;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) C6349.m17630(byteArrayInputStream, i2);
                treeMap.put(Integer.valueOf(i8), 1);
                int m176303 = (int) C6349.m17630(byteArrayInputStream, i2);
                while (m176303 > 0) {
                    C6349.m17630(byteArrayInputStream, i2);
                    int m176304 = (int) C6349.m17630(byteArrayInputStream, 1);
                    if (m176304 != 6 && m176304 != 7) {
                        while (m176304 > 0) {
                            C6349.m17630(byteArrayInputStream, 1);
                            C10583 c105832 = c10583;
                            for (int m176305 = (int) C6349.m17630(byteArrayInputStream, 1); m176305 > 0; m176305--) {
                                C6349.m17630(byteArrayInputStream, 2);
                            }
                            i2 = 2;
                            m176304--;
                            c10583 = c105832;
                        }
                    }
                    m176303--;
                    c10583 = c10583;
                }
            }
            C10583 c105833 = c10583;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c105833.f31770 = m24884(byteArrayInputStream, c105833.f31768);
            BitSet valueOf = BitSet.valueOf(C6349.m17628(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i9 = 0; i9 < i6; i9++) {
                int i10 = valueOf.get(i9) ? 2 : 0;
                if (valueOf.get(i9 + i6)) {
                    i10 |= 4;
                }
                if (i10 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i9));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i9), Integer.valueOf(i10 | num.intValue()));
                }
            }
        }
        return c10583Arr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m24884(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) C6349.m17630(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }
}

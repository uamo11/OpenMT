package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.bo;
import java.io.PrintStream;
import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* compiled from: 058F */
/* renamed from: l.ۢ᩹ۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9871 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29855;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f29856;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29857;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29858;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String[] f29859;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29860;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29861;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29862;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29863;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29864;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29865;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29866;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f29867;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29868;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29869;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29870;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f29871;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f29872;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f29873;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29874;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29875;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29876;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f29877;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29879;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29880;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29882;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ByteBuffer f29883;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C0225 f29878 = new C0225(C17615.f53826 * 3);

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0225 f29881 = new C0225();

    public C9871(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        byteBuffer.position(0);
        ByteBuffer order = byteBuffer.asReadOnlyBuffer().order(ByteOrder.BIG_ENDIAN);
        int i5 = order.getInt() & (-256);
        if (i5 != 1684371456) {
            if (i5 == 1684371712) {
                throw new C5927("Odex unsupported.");
            }
            throw new C5927("Magic unsupported.");
        }
        int i6 = order.getInt() >> 8;
        if (i6 < 3158837 || i6 > 3158848) {
            System.err.println("Unknown DEX version. Trying anyway...");
        }
        this.f29873 = i6;
        order.order(ByteOrder.LITTLE_ENDIAN);
        order.position(order.position() + 32);
        if (order.getInt() != 305419896) {
            throw new C5927("Endian_tag unsupported");
        }
        order.position(order.position() + 8);
        int i7 = order.getInt();
        int i8 = order.getInt();
        this.f29861 = i8;
        int i9 = order.getInt();
        this.f29867 = order.getInt();
        int i10 = order.getInt();
        this.f29872 = order.getInt();
        int i11 = order.getInt();
        this.f29877 = order.getInt();
        int i12 = order.getInt();
        this.f29856 = order.getInt();
        int i13 = order.getInt();
        this.f29880 = order.getInt();
        int i14 = order.getInt();
        this.f29859 = new String[i8];
        if (i6 >= 3158840) {
            order.position(i7);
            int i15 = order.getInt();
            int i16 = 0;
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            while (i16 < i15) {
                int i17 = order.getShort() & HPKE.aead_EXPORT_ONLY;
                order.getShort();
                int i18 = order.getInt();
                int i19 = order.getInt();
                int i20 = i15;
                if (i17 == 7) {
                    i4 = i18;
                    i3 = i19;
                } else if (i17 == 8) {
                    i2 = i18;
                    i = i19;
                }
                i16++;
                i15 = i20;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        this.f29871 = i4;
        this.f29879 = m24935(order, i9, this.f29861 * 4);
        this.f29870 = m24935(order, i10, this.f29867 * 4);
        this.f29864 = m24935(order, i11, this.f29872 * 12);
        this.f29860 = m24935(order, i12, this.f29877 * 8);
        this.f29855 = m24935(order, i13, this.f29856 * 8);
        this.f29863 = m24935(order, i14, this.f29880 * 32);
        this.f29875 = m24935(order, i3, i4 * 4);
        this.f29862 = m24935(order, i, i2 * 8);
        order.position(0);
        ByteBuffer duplicate = order.duplicate();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f29876 = duplicate.order(byteOrder);
        this.f29868 = order.duplicate().order(byteOrder);
        this.f29857 = order.duplicate().order(byteOrder);
        this.f29874 = order.duplicate().order(byteOrder);
        this.f29883 = order.duplicate().order(byteOrder);
        this.f29866 = order.duplicate().order(byteOrder);
        this.f29882 = order.duplicate().order(byteOrder);
        this.f29858 = order.duplicate().order(byteOrder);
        this.f29869 = order.duplicate().order(byteOrder);
        this.f29865 = order.duplicate().order(byteOrder);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m24935(ByteBuffer byteBuffer, int i, int i2) {
        byteBuffer.position(i);
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(i2);
        slice.order(ByteOrder.LITTLE_ENDIAN);
        return slice;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24938(int i, Throwable th) {
        int i2;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            i2 = i + 1;
            if (i3 >= i2) {
                break;
            }
            sb.append(".");
            i3++;
        }
        sb.append(' ');
        if (th instanceof C5927) {
            sb.append(th.getMessage());
            System.err.println(sb);
            if (th.getCause() != null) {
                m24938(i2, th.getCause());
                return;
            }
            return;
        }
        if (th != null) {
            PrintStream printStream = System.err;
            sb.append("ROOT cause:");
            printStream.println(sb);
            th.printStackTrace(System.err);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m24947(ByteBuffer byteBuffer, int i) {
        int i2 = ((i >> 5) & 7) + 1;
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= (byteBuffer.get() & 255) << (i3 * 8);
        }
        int i4 = (8 - i2) * 8;
        return (j << i4) >> i4;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m24952(ByteBuffer byteBuffer, int i) {
        long j = 0;
        for (int i2 = 0; i2 < ((i >> 5) & 7) + 1; i2++) {
            j |= (byteBuffer.get() & 255) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m24933(ByteBuffer byteBuffer, int i) {
        long j = 0;
        for (int i2 = 0; i2 < ((i >> 5) & 7) + 1; i2++) {
            j |= (byteBuffer.get() & 255) << (i2 * 8);
        }
        return j << ((int) ((8 - r7) * 8));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m24945(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 1] << 8);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m24950(int i, byte[] bArr) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24930(int i, byte[] bArr) {
        return (bArr[i] & 255) | (bArr[i + 3] << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 1] & 255) << 8);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24940(String str, Object... objArr) {
        System.err.printf(str.concat("%n"), objArr);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24941(TreeMap treeMap, int i) {
        if (treeMap.containsKey(Integer.valueOf(i))) {
            return;
        }
        treeMap.put(Integer.valueOf(i), new C11572(i));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m24951(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int i = 0;
        int i2 = 0;
        while ((b & GCMSIVBlockCipher.MASK) != 0) {
            i |= (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i2;
            i2 += 7;
            b = byteBuffer.get();
        }
        return ((b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i2) | i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m24946(ByteBuffer byteBuffer) {
        int i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            byte b = byteBuffer.get();
            i2 |= (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << i3;
            i = i3 + 7;
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                break;
            }
            i3 = i;
        }
        long j = i2;
        return ((1 << (i3 + 6)) & j) != 0 ? (int) (j - (1 << i)) : i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24937(int i, int i2, boolean z, C7338 c7338, TreeMap treeMap, C3816 c3816) {
        ByteBuffer byteBuffer = this.f29865;
        byteBuffer.position(i);
        int m24951 = m24951(byteBuffer);
        int m249512 = m24951(byteBuffer);
        C7048[] c7048Arr = new C7048[i2];
        int i3 = 0;
        for (String str : c7338.m19704()) {
            i3 = (str.equals("J") || str.equals("D")) ? i3 + 2 : i3 + 1;
        }
        int i4 = i2 - i3;
        if (!z) {
            c7048Arr[i4 - 1] = new C7048();
        }
        String[] m19704 = c7338.m19704();
        for (int i5 = 0; i5 < m249512; i5++) {
            String str2 = m19704[i5];
            String m24949 = m24949(m24951(byteBuffer) - 1);
            c7048Arr[i4] = new C7048();
            if (m24949 != null) {
                c3816.mo11503(i5, m24949);
            }
            i4 = (str2.equals("J") || str2.equals("D")) ? i4 + 2 : i4 + 1;
        }
        int i6 = 0;
        while (true) {
            int i7 = m24951;
            while (true) {
                int i8 = byteBuffer.get() & 255;
                switch (i8) {
                    case 0:
                        return;
                    case 1:
                        i6 = m24951(byteBuffer) + i6;
                        break;
                    case 2:
                        break;
                    case 3:
                        int m249513 = m24951(byteBuffer);
                        int m249514 = m24951(byteBuffer) - 1;
                        int m249515 = m24951(byteBuffer) - 1;
                        String m249492 = m24949(m249514);
                        String m24957 = m24957(m249515);
                        c7048Arr[m249513] = new C7048();
                        m24941(treeMap, i6);
                        c3816.mo11505(m249513, (C11572) treeMap.get(Integer.valueOf(i6)), m249492, m24957, null);
                        break;
                    case 4:
                        int m249516 = m24951(byteBuffer);
                        int m249517 = m24951(byteBuffer) - 1;
                        int m249518 = m24951(byteBuffer) - 1;
                        int m249519 = m24951(byteBuffer) - 1;
                        String m249493 = m24949(m249517);
                        String m249572 = m24957(m249518);
                        String m249494 = m24949(m249519);
                        C7048 c7048 = new C7048();
                        m24941(treeMap, i6);
                        c3816.mo11505(m249516, (C11572) treeMap.get(Integer.valueOf(i6)), m249493, m249572, m249494);
                        c7048Arr[m249516] = c7048;
                        break;
                    case 5:
                        int m2495110 = m24951(byteBuffer);
                        if (c7048Arr[m2495110] == null) {
                            throw new RuntimeException(C19370.m44628(m2495110, "Encountered RESTART_LOCAL on new v"));
                        }
                        m24941(treeMap, i6);
                        c3816.mo11504(m2495110, (C11572) treeMap.get(Integer.valueOf(i6)));
                        break;
                    case 6:
                        int m2495111 = m24951(byteBuffer);
                        if (c7048Arr[m2495111] == null) {
                            throw new RuntimeException(C19370.m44628(m2495111, "Encountered RESTART_LOCAL on new v"));
                        }
                        m24941(treeMap, i6);
                        c3816.mo11509(m2495111, (C11572) treeMap.get(Integer.valueOf(i6)));
                        break;
                    case 7:
                        m24941(treeMap, i6);
                        c3816.mo11508((C11572) treeMap.get(Integer.valueOf(i6)));
                        break;
                    case 8:
                        m24941(treeMap, i6);
                        c3816.mo11506((C11572) treeMap.get(Integer.valueOf(i6)));
                        break;
                    case 9:
                        break;
                    default:
                        if (i8 < 10) {
                            throw new RuntimeException(C19370.m44628(i8, "Invalid extended opcode encountered "));
                        }
                        int i9 = ((i8 - 10) / 15) + i6;
                        int i10 = ((r3 % 15) - 4) + i7;
                        m24941(treeMap, i9);
                        c3816.mo11507(i10, (C11572) treeMap.get(Integer.valueOf(i9)));
                        i7 = i10;
                        i6 = i9;
                        break;
                }
            }
            m24951 = m24946(byteBuffer) + i7;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m24962() {
        return this.f29873;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24960(C19749 c19749, int i) {
        c19749.mo12699(this.f29873);
        int i2 = this.f29880;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBuffer = this.f29863;
            byteBuffer.position(i3 * 32);
            arrayList.add(new C21160(m24957(byteBuffer.getInt()), i3));
        }
        Collections.sort(arrayList);
        for (int i4 = 0; i4 < i2; i4++) {
            m24961(c19749, ((C21160) arrayList.get(i4)).f68217, i);
        }
        c19749.mo45453();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24961(C19749 c19749, int i, int i2) {
        ByteBuffer byteBuffer = this.f29863;
        byteBuffer.position(i * 32);
        int i3 = byteBuffer.getInt();
        int i4 = byteBuffer.getInt();
        int i5 = byteBuffer.getInt();
        int i6 = byteBuffer.getInt();
        int i7 = byteBuffer.getInt();
        int i8 = byteBuffer.getInt();
        int i9 = byteBuffer.getInt();
        int i10 = byteBuffer.getInt();
        String m24957 = m24957(i3);
        try {
            C16904 mo12698 = c19749.mo12698(m24957, m24957(i5), m24944(i6), i4);
            if (mo12698 != null) {
                m24943(mo12698, i7, i8, i9, i10, i2);
            }
        } catch (Exception e) {
            C5927 c5927 = new C5927(e, "Error process class: [%d]%s", Integer.valueOf(i3), m24957);
            if ((i2 & 32) != 0) {
                m24938(0, c5927);
                return;
            }
            throw c5927;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m24934(ByteBuffer byteBuffer) {
        byte b = byteBuffer.get();
        int i = b & 255;
        boolean z = b & bo.j;
        if (z == 0) {
            return Byte.valueOf((byte) m24947(byteBuffer, i));
        }
        if (z == 6) {
            return Long.valueOf(m24947(byteBuffer, i));
        }
        if (z == 2) {
            return Short.valueOf((short) m24947(byteBuffer, i));
        }
        if (z == 3) {
            return Character.valueOf((char) m24952(byteBuffer, i));
        }
        if (z == 4) {
            return Integer.valueOf((int) m24947(byteBuffer, i));
        }
        if (z == 16) {
            return Float.valueOf(Float.intBitsToFloat((int) (m24933(byteBuffer, i) >> 32)));
        }
        if (z == 17) {
            return Double.valueOf(Double.longBitsToDouble(m24933(byteBuffer, i)));
        }
        switch (z ? 1 : 0) {
            case 21:
                return m24954((int) m24952(byteBuffer, i));
            case 22:
                return m24955((int) m24952(byteBuffer, i));
            case 23:
                return m24949((int) m24952(byteBuffer, i));
            case 24:
                return new C22860(m24957((int) m24952(byteBuffer, i)));
            case 25:
                return m24948((int) m24952(byteBuffer, i));
            case 26:
                return m24953((int) m24952(byteBuffer, i));
            case 27:
                return m24948((int) m24952(byteBuffer, i));
            case 28:
                int m24951 = m24951(byteBuffer);
                Object[] objArr = new Object[m24951];
                for (int i2 = 0; i2 < m24951; i2++) {
                    objArr[i2] = m24934(byteBuffer);
                }
                return objArr;
            case 29:
                return m24956(byteBuffer);
            case 30:
                return null;
            case 31:
                return Boolean.valueOf(((i >> 5) & 3) != 0);
            default:
                throw new C5927("Not support yet.");
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C1899 m24955(int i) {
        ByteBuffer byteBuffer = this.f29862;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        byteBuffer.getShort();
        int i3 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        switch (i2) {
            case 0:
            case 1:
            case 2:
            case 3:
                return new C1899(i2, m24948(i3));
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new C1899(i2, m24953(i3));
            default:
                throw new RuntimeException();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24943(C16904 c16904, int i, int i2, int i3, int i4, int i5) {
        Map map;
        Map map2;
        Map map3;
        Object[] objArr;
        if ((i5 & 1) == 0 && i != -1) {
            c16904.f51961 = m24949(i);
        }
        int i6 = i5 & 8;
        C0225 c0225 = this.f29878;
        if (i6 == 0) {
            map = (Map) c0225.m1479();
            map2 = (Map) c0225.m1479();
            map3 = (Map) c0225.m1479();
            if (map == null) {
                map = new HashMap();
            }
            if (map2 == null) {
                map2 = new HashMap();
            }
            if (map3 == null) {
                map3 = new HashMap();
            }
            if (i2 != 0) {
                ByteBuffer byteBuffer = this.f29876;
                byteBuffer.position(i2);
                int i7 = byteBuffer.getInt();
                int i8 = byteBuffer.getInt();
                int i9 = byteBuffer.getInt();
                int i10 = byteBuffer.getInt();
                for (int i11 = 0; i11 < i8; i11++) {
                    map.put(Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()));
                }
                for (int i12 = 0; i12 < i9; i12++) {
                    map2.put(Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()));
                }
                for (int i13 = 0; i13 < i10; i13++) {
                    map3.put(Integer.valueOf(byteBuffer.getInt()), Integer.valueOf(byteBuffer.getInt()));
                }
                if (i7 != 0) {
                    try {
                        m24939(i7, c16904);
                    } catch (Exception e) {
                        throw new C5927("error on reading Annotation of class ", e);
                    }
                }
            }
        } else {
            map = null;
            map2 = null;
            map3 = null;
        }
        Map map4 = map;
        Map map5 = map2;
        Map map6 = map3;
        if (i3 != 0) {
            ByteBuffer byteBuffer2 = this.f29883;
            byteBuffer2.position(i3);
            int m24951 = m24951(byteBuffer2);
            int m249512 = m24951(byteBuffer2);
            int m249513 = m24951(byteBuffer2);
            int m249514 = m24951(byteBuffer2);
            if ((i5 & 16) != 0 || i4 == 0) {
                objArr = null;
            } else {
                ByteBuffer byteBuffer3 = this.f29858;
                byteBuffer3.position(i4);
                int m249515 = m24951(byteBuffer3);
                objArr = new Object[m249515];
                for (int i14 = 0; i14 < m249515; i14++) {
                    objArr[i14] = m24934(byteBuffer3);
                }
            }
            Object[] objArr2 = objArr;
            int i15 = 0;
            int i16 = 0;
            while (i16 < m24951) {
                i15 = m24931(byteBuffer2, i15, c16904, map4, (objArr2 == null || i16 >= objArr2.length) ? null : objArr2[i16], i5);
                i16++;
                m249514 = m249514;
                m249513 = m249513;
                objArr2 = objArr2;
            }
            int i17 = m249514;
            int i18 = m249513;
            int i19 = 0;
            for (int i20 = 0; i20 < m249512; i20++) {
                i19 = m24931(byteBuffer2, i19, c16904, map4, (Object) null, i5);
            }
            int i21 = 0;
            boolean z = true;
            int i22 = 0;
            while (i22 < i18) {
                i21 = m24932(byteBuffer2, i21, c16904, map5, map6, i5, z);
                i22++;
                z = false;
            }
            int i23 = 0;
            boolean z2 = true;
            int i24 = 0;
            while (i24 < i17) {
                i23 = m24932(byteBuffer2, i23, c16904, map5, map6, i5, z2);
                i24++;
                z2 = false;
            }
        }
        if (map4 != null) {
            map4.clear();
            c0225.m1477(map4);
        }
        if (map5 != null) {
            map5.clear();
            c0225.m1477(map5);
        }
        if (map6 != null) {
            map6.clear();
            c0225.m1477(map6);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m24939(int i, InterfaceC19043 interfaceC19043) {
        ByteBuffer byteBuffer = this.f29868;
        byteBuffer.position(i);
        int i2 = byteBuffer.getInt();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = byteBuffer.getInt();
            ByteBuffer byteBuffer2 = this.f29857;
            byteBuffer2.position(i4);
            int i5 = byteBuffer2.get() & 255;
            C11261 m24956 = m24956(byteBuffer2);
            EnumC16715 enumC16715 = EnumC16715.values()[i5];
            m24956.f33753 = enumC16715;
            C11261 mo8631 = interfaceC19043.mo8631(m24956.f33752, enumC16715);
            Iterator it = m24956.f33751.iterator();
            while (it.hasNext()) {
                C2088 c2088 = (C2088) it.next();
                C11261.m27874(mo8631, c2088.f6964, c2088.f6965);
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C11261 m24956(ByteBuffer byteBuffer) {
        int m24951 = m24951(byteBuffer);
        int m249512 = m24951(byteBuffer);
        C11261 c11261 = new C11261(m24957(m24951), EnumC16715.RUNTIME);
        for (int i = 0; i < m249512; i++) {
            c11261.f33751.add(new C2088(m24949(m24951(byteBuffer)), m24934(byteBuffer)));
        }
        return c11261;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C13687 m24948(int i) {
        ByteBuffer byteBuffer = this.f29860;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i3 = 65535 & byteBuffer.getShort();
        return new C13687(m24957(i2), m24949(byteBuffer.getInt()), m24957(i3));
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private String[] m24944(int i) {
        if (i == 0) {
            return new String[0];
        }
        ByteBuffer byteBuffer = this.f29869;
        byteBuffer.position(i);
        int i2 = byteBuffer.getInt();
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = m24957(65535 & byteBuffer.getShort());
        }
        return strArr;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private C11072 m24954(int i) {
        ByteBuffer byteBuffer = this.f29864;
        byteBuffer.position((i * 12) + 4);
        return new C11072(m24957(byteBuffer.getInt()), m24944(byteBuffer.getInt()));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C7338 m24953(int i) {
        ByteBuffer byteBuffer = this.f29855;
        byteBuffer.position(i * 8);
        int i2 = byteBuffer.getShort() & HPKE.aead_EXPORT_ONLY;
        int i3 = 65535 & byteBuffer.getShort();
        return new C7338(m24957(i2), m24949(byteBuffer.getInt()), m24954(i3));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private String m24949(int i) {
        if (i < 0) {
            return null;
        }
        String[] strArr = this.f29859;
        if (i >= strArr.length) {
            return null;
        }
        String str = strArr[i];
        if (str != null) {
            return str;
        }
        C0225 c0225 = this.f29881;
        int i2 = this.f29879.getInt(i * 4);
        ByteBuffer byteBuffer = this.f29882;
        byteBuffer.position(i2);
        int m24951 = m24951(byteBuffer);
        try {
            StringBuilder sb = (StringBuilder) c0225.m1479();
            if (sb == null) {
                sb = new StringBuilder((int) (m24951 * 1.5d));
            }
            String m12728 = C4226.m12728(byteBuffer, sb);
            if (sb.length() < 100) {
                sb.setLength(0);
                c0225.m1477(sb);
            }
            strArr[i] = m12728;
            return m12728;
        } catch (UTFDataFormatException e) {
            throw new C5927(e, "fail to load string %d@%08x", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private String m24957(int i) {
        if (i == -1) {
            return null;
        }
        return m24949(this.f29870.getInt(i * 4));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24931(ByteBuffer byteBuffer, int i, C16904 c16904, Map map, Object obj, int i2) {
        Integer num;
        int m24951 = m24951(byteBuffer);
        int m249512 = m24951(byteBuffer);
        int i3 = i + m24951;
        C13687 m24948 = m24948(i3);
        if (c16904.f51959 == null) {
            c16904.f51959 = new ArrayList();
        }
        C2794 c2794 = new C2794();
        c2794.f8714 = m249512;
        c2794.f8712 = m24948;
        c2794.f8713 = obj;
        c16904.f51959.add(c2794);
        if ((i2 & 8) != 0 || (num = (Integer) map.get(Integer.valueOf(i3))) == null) {
            return i3;
        }
        try {
            m24939(num.intValue(), c2794);
            return i3;
        } catch (Exception e) {
            throw new C5927(e, "while accept annotation in field:%s.", m24948.toString());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m24932(ByteBuffer byteBuffer, int i, C16904 c16904, Map map, Map map2, int i2, boolean z) {
        InterfaceC19043 m45439;
        int position = byteBuffer.position();
        int m24951 = m24951(byteBuffer);
        int m249512 = m24951(byteBuffer);
        int m249513 = m24951(byteBuffer);
        int i3 = i + m24951;
        C7338 m24953 = m24953(i3);
        if (!z && m24951 == 0) {
            m24940("GLITCH: duplicated method %s @%08x", m24953.toString(), Integer.valueOf(position));
            if ((i2 & 64) == 0) {
                m24940("WARN: skip method %s @%08x", m24953.toString(), Integer.valueOf(position));
                return i3;
            }
        }
        if ((65536 & m249512) == 0 && (m24953.m19700().equals("<init>") || m24953.m19700().equals("<clinit>"))) {
            m24940("GLITCH: method %s @%08x not marked as ACC_CONSTRUCTOR", m24953.toString(), Integer.valueOf(position));
        }
        try {
            if (c16904.f51962 == null) {
                c16904.f51962 = new ArrayList();
            }
            C19728 c19728 = new C19728();
            c19728.f63749 = m249512;
            c19728.f63747 = m24953;
            c16904.f51962.add(c19728);
            if ((i2 & 8) == 0) {
                Integer num = (Integer) map.get(Integer.valueOf(i3));
                if (num != null) {
                    try {
                        m24939(num.intValue(), c19728);
                    } catch (Exception e) {
                        throw new C5927(e, "while accept annotation in method:%s.", m24953.toString());
                    }
                }
                Integer num2 = (Integer) map2.get(Integer.valueOf(i3));
                if (num2 != null) {
                    try {
                        int intValue = num2.intValue();
                        ByteBuffer byteBuffer2 = this.f29874;
                        byteBuffer2.position(intValue);
                        int i4 = byteBuffer2.getInt();
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = byteBuffer2.getInt();
                            if (i6 != 0 && (m45439 = c19728.m45439(i5)) != null) {
                                try {
                                    m24939(i6, m45439);
                                } catch (Exception e2) {
                                    throw new C5927(e2, "While accepting parameter annotation in parameter: [%d]", Integer.valueOf(i5));
                                }
                            }
                        }
                    } catch (Exception e3) {
                        throw new C5927(e3, "while accept parameter annotation in method:%s.", m24953.toString());
                    }
                }
            }
            if (m249513 == 0 || ((i2 & 4) != 0 && ((i2 & 128) == 0 || !m24953.m19700().equals("<clinit>")))) {
                return i3;
            }
            C18316 c18316 = new C18316();
            c18316.f56946 = new ArrayList();
            c18316.f56948 = null;
            c18316.f56947 = -1;
            c19728.f63748 = c18316;
            try {
                m24959(m249513, c18316, i2, (m249512 & 8) != 0, m24953);
                return i3;
            } catch (Exception e4) {
                throw new C5927(e4, "while accept code in method:[%s] @%08x", m24953.toString(), Integer.valueOf(m249513));
            }
        } catch (Exception e5) {
            throw new C5927(e5, "while accept method:[%s]", m24953.toString());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m24958() {
        return this.f29880;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01da, code lost:
    
        if (r7 < r16.f29872) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0220, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e5, code lost:
    
        if (r1 < r16.f29871) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01f0, code lost:
    
        if (r1 < r16.f29877) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01f9, code lost:
    
        if (r1 < r5) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0204, code lost:
    
        if (r1 < r16.f29867) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x021e, code lost:
    
        if (r1 < r16.f29861) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023b  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m24942(java.util.TreeMap r17, java.util.LinkedList r18, byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9871.m24942(java.util.TreeMap, java.util.LinkedList, byte[], int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x04e7  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m24959(int r27, l.C18316 r28, int r29, boolean r30, l.C7338 r31) {
        /*
            Method dump skipped, instructions count: 2182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C9871.m24959(int, l.ᩳ᩸ۖ, int, boolean, l.۟۠ۖ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10161 m24936(int i) {
        ByteBuffer byteBuffer = this.f29875;
        byteBuffer.position(i * 4);
        int i2 = byteBuffer.getInt();
        ByteBuffer byteBuffer2 = this.f29858;
        byteBuffer2.position(i2);
        int m24951 = m24951(byteBuffer2);
        Object[] objArr = new Object[m24951];
        for (int i3 = 0; i3 < m24951; i3++) {
            objArr[i3] = m24934(byteBuffer2);
        }
        Object[] copyOfRange = m24951 > 3 ? Arrays.copyOfRange(objArr, 3, m24951) : new Object[0];
        String.format("call_site_%d", Integer.valueOf(i));
        return new C10161((C1899) objArr[0], (String) objArr[1], (C11072) objArr[2], copyOfRange);
    }
}

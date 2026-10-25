package l;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* compiled from: 85A3 */
/* renamed from: l.ۗ᩶֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3454 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C0176 f10926;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f10927;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3000 f10928;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0176 f10929;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f10930;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C0176 f10931;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3000[] f10932;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3000 f10933;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C3000 f10934;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f10935;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C19228 f10936;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C0176 f10937;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C3000 f10938;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final AbstractC10056[] f10939;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0176 f10940;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C3454 f10941;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C21345 f10942;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3000 f10943;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C3000 f10944;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C3000 f10945;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C3000 f10946;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C0176 f10947;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f10948;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3000 f10949;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f10950;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0176[] f10951;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C3000 f10952;

    public C3454(int i) {
        this.f10941 = this;
        this.f10948 = false;
        this.f10936 = new C19228(this);
        this.f10942 = new C21345(this);
        C0176 c0176 = new C0176(this, EnumC14993.TYPE_STRING_ID_ITEM);
        this.f10947 = c0176;
        C0176 c01762 = new C0176(this, EnumC14993.TYPE_TYPE_ID_ITEM);
        this.f10926 = c01762;
        C0176 c01763 = new C0176(this, EnumC14993.TYPE_PROTO_ID_ITEM);
        this.f10931 = c01763;
        C0176 c01764 = new C0176(this, EnumC14993.TYPE_FIELD_ID_ITEM);
        this.f10937 = c01764;
        C0176 c01765 = new C0176(this, EnumC14993.TYPE_METHOD_ID_ITEM);
        this.f10929 = c01765;
        C4865 c4865 = new C4865(this, this, EnumC14993.TYPE_CLASS_DEF_ITEM);
        this.f10940 = c4865;
        C3000 c3000 = new C3000(this, EnumC14993.TYPE_TYPE_LIST);
        this.f10933 = c3000;
        C3000 c30002 = new C3000(this, EnumC14993.TYPE_ANNOTATION_SET_REF_LIST);
        this.f10938 = c30002;
        C3000 c30003 = new C3000(this, EnumC14993.TYPE_ANNOTATION_SET_ITEM);
        this.f10943 = c30003;
        C3000 c30004 = new C3000(this, EnumC14993.TYPE_CLASS_DATA_ITEM);
        this.f10944 = c30004;
        C3000 c30005 = new C3000(this, EnumC14993.TYPE_CODE_ITEM);
        this.f10952 = c30005;
        C3000 c30006 = new C3000(this, EnumC14993.TYPE_STRING_DATA_ITEM);
        this.f10946 = c30006;
        C3000 c30007 = new C3000(this, EnumC14993.TYPE_DEBUG_INFO_ITEM);
        this.f10934 = c30007;
        C3000 c30008 = new C3000(this, EnumC14993.TYPE_ANNOTATION_ITEM);
        this.f10945 = c30008;
        C3000 c30009 = new C3000(this, EnumC14993.TYPE_ENCODED_ARRAY_ITEM);
        this.f10949 = c30009;
        C3000 c300010 = new C3000(this, EnumC14993.TYPE_ANNOTATIONS_DIRECTORY_ITEM);
        this.f10928 = c300010;
        this.f10930 = true;
        this.f10939 = new AbstractC10056[]{c0176, c01762, c01763, c01764, c01765, c4865, c3000, c30002, c30003, c30004, c30005, c300010, c30006, c30007, c30008, c30009, null, null};
        this.f10951 = new C0176[]{c0176, c01762, c01763, c01764, c01765, c4865};
        this.f10932 = new C3000[]{c30002, c30003, c30005, c300010, c3000, c30006, c30008, c30009, c30004, c30007};
    }

    public C3454(InputStream inputStream) {
        this(0);
        boolean z;
        C10720 c10720;
        C12172 c12172;
        C10720 c107202;
        InputStream bufferedInputStream = !inputStream.markSupported() ? new BufferedInputStream(inputStream) : inputStream;
        bufferedInputStream.mark(8);
        byte[] m41633 = C17775.m41633(bufferedInputStream, 8);
        bufferedInputStream.reset();
        try {
            this.f10948 = false;
            boolean equals = Arrays.equals(m41633, C19228.f60535);
            byte[] bArr = C4411.f14116;
            byte[] bArr2 = C4411.f14115;
            if (equals || Arrays.equals(m41633, C19228.f60534)) {
                z = true;
            } else {
                if (Arrays.equals(m41633, bArr2)) {
                    this.f10948 = true;
                } else if (Arrays.equals(m41633, bArr)) {
                    this.f10948 = true;
                }
                z = false;
            }
            if (this.f10948) {
                C10720 c107203 = new C10720(C17775.m41633(bufferedInputStream, 40));
                byte[] m26902 = c107203.m26902(8);
                if (!Arrays.equals(bArr2, m26902) && !Arrays.equals(bArr, m26902)) {
                    throw new RuntimeException("The magic value is not one of the expected values");
                }
                int m26904 = c107203.m26904();
                int m269042 = c107203.m26904();
                int m269043 = c107203.m26904();
                int m269044 = c107203.m26904();
                c107203.m26904();
                c107203.m26904();
                c107203.m26904();
                c107203.m26904();
                int i = (m269043 - m26904) - m269042;
                if (i < 0) {
                    throw new C16363("Unexpected placement of the odex dependency data", null);
                }
                if (m26904 > 40) {
                    C17775.m41633(bufferedInputStream, m26904 - 40);
                }
                c10720 = new C10720(C17775.m41633(bufferedInputStream, m269042));
                if (i > 0) {
                    C17775.m41633(bufferedInputStream, i);
                }
                new C19934(new C10720(C17775.m41633(bufferedInputStream, m269044)));
            } else if (z) {
                byte[] bArr3 = new byte[10240];
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    int read = bufferedInputStream.read(bArr3);
                    if (read == -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr3, 0, read);
                    }
                }
                c10720 = new C10720(byteArrayOutputStream.toByteArray());
            } else {
                StringBuilder sb = new StringBuilder("bad magic value:");
                for (int i2 = 0; i2 < 8; i2++) {
                    sb.append(" ");
                    sb.append(C7746.m20771(m41633[i2]));
                }
                throw new RuntimeException(sb.toString());
            }
            bufferedInputStream.close();
            C12172 c121722 = new C12172();
            this.f10936.m14657(c10720, 0, c121722);
            c10720.m26905(c121722.m29646(EnumC14993.TYPE_MAP_LIST));
            this.f10942.m14657(c10720, 0, c121722);
            C10720 c107204 = c10720;
            C12172 c121723 = c121722;
            AbstractC10056[] abstractC10056Arr = {this.f10946, this.f10947, this.f10926, this.f10933, this.f10931, this.f10937, this.f10929, this.f10945, this.f10943, this.f10938, this.f10928, this.f10934, this.f10952, this.f10944, this.f10949, this.f10940};
            int i3 = 0;
            while (i3 < 16) {
                AbstractC10056 abstractC10056 = abstractC10056Arr[i3];
                if (abstractC10056 == null) {
                    c107202 = c107204;
                    c12172 = c121723;
                } else {
                    EnumC14993 enumC14993 = abstractC10056.f30233;
                    c12172 = c121723;
                    int m29646 = c12172.m29646(enumC14993);
                    if (m29646 > 0) {
                        int m29650 = c12172.m29650(enumC14993);
                        c107202 = c107204;
                        c107202.m26905(m29646);
                        ArrayList arrayList = abstractC10056.f30234;
                        arrayList.ensureCapacity(m29650);
                        for (int size = arrayList.size(); size < m29650; size++) {
                            arrayList.add(null);
                        }
                        c107202.m26899(enumC14993.f45741);
                        abstractC10056.f30236 = c107202.m26898();
                        abstractC10056.mo1313(c107202, c12172);
                    } else {
                        c107202 = c107204;
                    }
                }
                i3++;
                c121723 = c12172;
                c107204 = c107202;
            }
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    public C3454() {
        this(0);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m10580() {
        return this.f10930;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m10579() {
        return this.f10950;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m10577() {
        return this.f10935;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m10575() {
        return this.f10927;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC10056[] m10581() {
        AbstractC10056[] abstractC10056Arr = this.f10939;
        int i = 0;
        for (AbstractC10056 abstractC10056 : abstractC10056Arr) {
            if (abstractC10056 != null && abstractC10056.f30234.size() > 0) {
                i++;
            }
        }
        AbstractC10056[] abstractC10056Arr2 = new AbstractC10056[i];
        int i2 = 0;
        for (AbstractC10056 abstractC100562 : abstractC10056Arr) {
            if (abstractC100562 != null && abstractC100562.f30234.size() > 0) {
                abstractC10056Arr2[i2] = abstractC100562;
                i2++;
            }
        }
        Arrays.sort(abstractC10056Arr2, new C22504());
        return abstractC10056Arr2;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m10578() {
        int m14658 = this.f10936.m14658(0, 0);
        C0176[] c0176Arr = this.f10951;
        int length = c0176Arr.length;
        C3000[] c3000Arr = this.f10932;
        int length2 = length + c3000Arr.length;
        AbstractC10056[] abstractC10056Arr = new AbstractC10056[length2];
        System.arraycopy(c0176Arr, 0, abstractC10056Arr, 0, c0176Arr.length);
        System.arraycopy(c3000Arr, 0, abstractC10056Arr, c0176Arr.length, c3000Arr.length);
        int i = 0;
        while (i < length2 && abstractC10056Arr[i].f30233.m35521()) {
            AbstractC10056 abstractC10056 = abstractC10056Arr[i];
            Collections.sort(abstractC10056.f30234);
            m14658 = abstractC10056.mo14223(m14658);
            i++;
        }
        this.f10927 = m14658;
        while (i < length2) {
            m14658 = abstractC10056Arr[i].mo14223(m14658);
            i++;
        }
        int i2 = EnumC14993.TYPE_MAP_LIST.f45741 - 1;
        int m146582 = this.f10942.m14658((m14658 + i2) & (~i2), 0);
        this.f10950 = m146582;
        this.f10935 = m146582 - this.f10927;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10576(C1547 c1547) {
        this.f10936.m14660(c1547);
        C0176[] c0176Arr = this.f10951;
        int length = c0176Arr.length;
        C3000[] c3000Arr = this.f10932;
        int length2 = length + c3000Arr.length;
        AbstractC10056[] abstractC10056Arr = new AbstractC10056[length2];
        System.arraycopy(c0176Arr, 0, abstractC10056Arr, 0, c0176Arr.length);
        System.arraycopy(c3000Arr, 0, abstractC10056Arr, c0176Arr.length, c3000Arr.length);
        for (int i = 0; i < length2; i++) {
            AbstractC10056 abstractC10056 = abstractC10056Arr[i];
            abstractC10056.getClass();
            EnumC14993 enumC14993 = abstractC10056.f30233;
            String str = enumC14993.f45739;
            Iterator it = abstractC10056.f30234.iterator();
            while (it.hasNext()) {
                AbstractC5116 abstractC5116 = (AbstractC5116) it.next();
                c1547.m5296(enumC14993.f45741);
                abstractC5116.m14660(c1547);
            }
        }
        C21345 c21345 = this.f10942;
        c21345.getClass();
        c1547.m5296(EnumC14993.TYPE_MAP_LIST.f45741);
        c21345.m14660(c1547);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10574(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bArr, 32, bArr.length - 32);
            try {
                int digest = messageDigest.digest(bArr, 12, 20);
                if (digest == 20) {
                    return;
                }
                throw new RuntimeException("unexpected digest write: " + digest + " bytes");
            } catch (DigestException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }
}

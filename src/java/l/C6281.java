package l;

/* compiled from: DAUC */
/* renamed from: l.ۛ᩶ۚ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6281 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f19429;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f19430;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C12631[] f19431;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f19432;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C10515[] f19433;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C10515[] f19434;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18276 f19435;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f19437;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f19438;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6987 f19440;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f19441;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C12631[] f19442 = new C12631[256];

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f19436 = 1;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C18276 f19439 = new C18276();

    public C6281(C6987 c6987) {
        this.f19440 = c6987;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m17323() {
        return this.f19437;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m17316() {
        return this.f19438;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m17315(int i, String str) {
        this.f19437 = i;
        this.f19438 = str;
        return m17296(7, str).f39901;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m17320() {
        return this.f19436;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m17325() {
        return this.f19439.f56819;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m17319(C18276 c18276) {
        c18276.m42618(this.f19436);
        C18276 c182762 = this.f19439;
        c18276.m42613(0, c182762.f56819, c182762.f56818);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17298() {
        if (this.f19435 == null) {
            return 0;
        }
        m17326("BootstrapMethods");
        return this.f19435.f56819 + 8;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m17314(C18276 c18276) {
        if (this.f19435 != null) {
            c18276.m42618(m17326("BootstrapMethods"));
            c18276.m42616(this.f19435.f56819 + 2);
            c18276.m42618(this.f19429);
            C18276 c182762 = this.f19435;
            c18276.m42613(0, c182762.f56819, c182762.f56818);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C12631 m17297(int i) {
        C12631[] c12631Arr = this.f19442;
        return c12631Arr[i % c12631Arr.length];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m17295(C12631 c12631) {
        int i = this.f19432;
        C12631[] c12631Arr = this.f19442;
        if (i > (c12631Arr.length * 3) / 4) {
            int length = c12631Arr.length;
            int i2 = (length * 2) + 1;
            C12631[] c12631Arr2 = new C12631[i2];
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                C12631 c126312 = this.f19442[length];
                while (c126312 != null) {
                    int i3 = c126312.f38055 % i2;
                    C12631 c126313 = c126312.f38056;
                    c126312.f38056 = c12631Arr2[i3];
                    c12631Arr2[i3] = c126312;
                    c126312 = c126313;
                }
            }
            this.f19442 = c12631Arr2;
        }
        this.f19432++;
        int i4 = c12631.f38055;
        C12631[] c12631Arr3 = this.f19442;
        int length2 = i4 % c12631Arr3.length;
        c12631.f38056 = c12631Arr3[length2];
        c12631Arr3[length2] = c12631;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12631 m17308(Object obj) {
        if (obj instanceof Integer) {
            return m17294(3, ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return m17294(3, ((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return m17294(3, ((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return m17294(3, ((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return m17294(3, ((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return m17304(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return m17291(5, ((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return m17303(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return m17296(8, (String) obj);
        }
        if (obj instanceof C11926) {
            C11926 c11926 = (C11926) obj;
            int m29102 = c11926.m29102();
            return m29102 == 10 ? m17296(7, c11926.m29103()) : m29102 == 11 ? m17296(16, c11926.m29099()) : m17296(7, c11926.m29099());
        }
        if (obj instanceof C0636) {
            C0636 c0636 = (C0636) obj;
            return m17306(c0636.m2589(), c0636.m2587(), c0636.m2586(), c0636.m2585(), c0636.m2588());
        }
        if (!(obj instanceof C21099)) {
            throw new IllegalArgumentException("value ".concat(String.valueOf(obj)));
        }
        C21099 c21099 = (C21099) obj;
        return m17292(c21099.m48009(), 17, m17313(c21099.m48006(), c21099.m48008()).f39901, c21099.m48010());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12631 m17309(String str) {
        return m17296(7, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12631 m17310(String str, String str2, String str3) {
        return m17293(str, 9, str2, str3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12631 m17311(String str, String str2, String str3, boolean z) {
        return m17293(str, z ? 11 : 10, str2, str3);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12631 m17305(int i) {
        return m17294(3, i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12631 m17304(float f) {
        return m17294(4, Float.floatToRawIntBits(f));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C12631 m17294(int i, int i2) {
        int i3 = (i + i2) & Integer.MAX_VALUE;
        for (C12631 m17297 = m17297(i3); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == i && m17297.f38055 == i3 && m17297.f39900 == i2) {
                return m17297;
            }
        }
        C18276 c18276 = this.f19439;
        c18276.m42609(i);
        c18276.m42616(i2);
        int i4 = this.f19436;
        this.f19436 = i4 + 1;
        C12631 c12631 = new C12631(i4, i, i3, i2);
        m17295(c12631);
        return c12631;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12631 m17307(long j) {
        return m17291(5, j);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12631 m17303(double d) {
        return m17291(6, Double.doubleToRawLongBits(d));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12631 m17291(int i, long j) {
        int i2 = (((int) j) + i + ((int) (j >>> 32))) & Integer.MAX_VALUE;
        for (C12631 m17297 = m17297(i2); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == i && m17297.f38055 == i2 && m17297.f39900 == j) {
                return m17297;
            }
        }
        int i3 = this.f19436;
        C18276 c18276 = this.f19439;
        c18276.m42609(i);
        c18276.m42614(j);
        this.f19436 += 2;
        C12631 c12631 = new C12631(i3, i, i2, j);
        m17295(c12631);
        return c12631;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12631 m17312(String str, String str2, C0636 c0636, Object... objArr) {
        return m17292(str, 18, m17313(c0636, objArr).f39901, str2);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12631 m17318(String str) {
        return m17296(19, str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12631 m17322(String str) {
        return m17296(20, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12631 m17313(C0636 c0636, Object... objArr) {
        C18276 c18276 = this.f19435;
        if (c18276 == null) {
            c18276 = new C18276();
            this.f19435 = c18276;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = m17308(objArr[i]).f39901;
        }
        int i2 = c18276.f56819;
        c18276.m42618(m17306(c0636.m2589(), c0636.m2587(), c0636.m2586(), c0636.m2585(), c0636.m2588()).f39901);
        c18276.m42618(length);
        for (int i3 = 0; i3 < length; i3++) {
            c18276.m42618(iArr[i3]);
        }
        int i4 = c18276.f56819 - i2;
        int hashCode = c0636.hashCode();
        for (Object obj : objArr) {
            hashCode ^= obj.hashCode();
        }
        int i5 = hashCode & Integer.MAX_VALUE;
        byte[] bArr = this.f19435.f56818;
        for (C12631 m17297 = m17297(i5); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == 64 && m17297.f38055 == i5) {
                int i6 = (int) m17297.f39900;
                for (int i7 = 0; i7 < i4; i7++) {
                    if (bArr[i2 + i7] != bArr[i6 + i7]) {
                        break;
                    }
                }
                this.f19435.f56819 = i2;
                return m17297;
            }
        }
        int i8 = this.f19429;
        this.f19429 = i8 + 1;
        C12631 c12631 = new C12631(i8, 64, i5, i2);
        m17295(c12631);
        return c12631;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12631 m17321(int i) {
        return this.f19431[i];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C1342 m17317(int i) {
        return this.f19433[(int) this.f19431[i].f39900].f31528;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17299(int i, int i2) {
        long j;
        long j2;
        if (i < i2) {
            j = i;
            j2 = i2;
        } else {
            j = i2;
            j2 = i;
        }
        long j3 = j | (j2 << 32);
        int i3 = (i + i2 + 131) & Integer.MAX_VALUE;
        for (C12631 m17297 = m17297(i3); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == 131 && m17297.f38055 == i3 && m17297.f39900 == j3) {
                return m17297.f39903;
            }
        }
        C12631[] c12631Arr = this.f19431;
        String str = c12631Arr[i].f39906;
        String str2 = c12631Arr[i2].f39906;
        ClassLoader classLoader = C6987.class.getClassLoader();
        try {
            Class<?> cls = Class.forName(str.replace('/', '.'), false, classLoader);
            try {
                Class<?> cls2 = Class.forName(str2.replace('/', '.'), false, classLoader);
                if (!cls.isAssignableFrom(cls2)) {
                    if (cls2.isAssignableFrom(cls)) {
                        str = str2;
                    } else if (cls.isInterface() || cls2.isInterface()) {
                        str = "java/lang/Object";
                    } else {
                        do {
                            cls = cls.getSuperclass();
                        } while (!cls.isAssignableFrom(cls2));
                        str = cls.getName().replace('.', '/');
                    }
                }
                int m17324 = m17324(str);
                C12631 c12631 = new C12631(this.f19430, 131, i3, j3);
                m17295(c12631);
                c12631.f39903 = m17324;
                return m17324;
            } catch (ClassNotFoundException e) {
                throw new TypeNotPresentException(str2, e);
            }
        } catch (ClassNotFoundException e2) {
            throw new TypeNotPresentException(str, e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m17290(C12631 c12631) {
        if (this.f19431 == null) {
            this.f19431 = new C12631[16];
        }
        int i = this.f19430;
        C12631[] c12631Arr = this.f19431;
        if (i == c12631Arr.length) {
            C12631[] c12631Arr2 = new C12631[c12631Arr.length * 2];
            System.arraycopy(c12631Arr, 0, c12631Arr2, 0, c12631Arr.length);
            this.f19431 = c12631Arr2;
        }
        C12631[] c12631Arr3 = this.f19431;
        int i2 = this.f19430;
        this.f19430 = i2 + 1;
        c12631Arr3[i2] = c12631;
        m17295(c12631);
        return c12631.f39901;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17302(C1342 c1342) {
        if (this.f19434 == null) {
            this.f19434 = new C10515[16];
            this.f19433 = new C10515[16];
        }
        int identityHashCode = System.identityHashCode(c1342);
        C10515[] c10515Arr = this.f19434;
        C10515 c10515 = c10515Arr[identityHashCode % c10515Arr.length];
        while (c10515 != null && c10515.f31528 != c1342) {
            c10515 = c10515.f31529;
        }
        if (c10515 == null) {
            int i = this.f19441;
            C10515[] c10515Arr2 = this.f19434;
            if (i > (c10515Arr2.length * 3) / 4) {
                int length = c10515Arr2.length;
                int i2 = (length * 2) + 1;
                C10515[] c10515Arr3 = new C10515[i2];
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    C10515 c105152 = this.f19434[length];
                    while (c105152 != null) {
                        int identityHashCode2 = System.identityHashCode(c105152.f31528) % i2;
                        C10515 c105153 = c105152.f31529;
                        c105152.f31529 = c10515Arr3[identityHashCode2];
                        c10515Arr3[identityHashCode2] = c105152;
                        c105152 = c105153;
                    }
                }
                this.f19434 = c10515Arr3;
            }
            int i3 = this.f19441;
            C10515[] c10515Arr4 = this.f19433;
            if (i3 == c10515Arr4.length) {
                C10515[] c10515Arr5 = new C10515[c10515Arr4.length * 2];
                System.arraycopy(c10515Arr4, 0, c10515Arr5, 0, c10515Arr4.length);
                this.f19433 = c10515Arr5;
            }
            int i4 = this.f19441;
            c10515 = new C10515(i4, c1342);
            C10515[] c10515Arr6 = this.f19434;
            int length2 = identityHashCode % c10515Arr6.length;
            c10515.f31529 = c10515Arr6[length2];
            c10515Arr6[length2] = c10515;
            C10515[] c10515Arr7 = this.f19433;
            this.f19441 = i4 + 1;
            c10515Arr7[i4] = c10515;
        }
        int i5 = c10515.f31527;
        int i6 = (i5 + 130) & Integer.MAX_VALUE;
        for (C12631 m17297 = m17297(i6); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == 130 && m17297.f38055 == i6 && m17297.f39900 == i5 && m17297.f39906.equals("")) {
                return m17297.f39901;
            }
        }
        return m17290(new C12631(this.f19430, 130, i6, i5, ""));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C12631 m17296(int i, String str) {
        int hashCode = (str.hashCode() + i) & Integer.MAX_VALUE;
        for (C12631 m17297 = m17297(hashCode); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == i && m17297.f38055 == hashCode && m17297.f39906.equals(str)) {
                return m17297;
            }
        }
        this.f19439.m42619(i, m17326(str));
        int i2 = this.f19436;
        this.f19436 = i2 + 1;
        C12631 c12631 = new C12631(i2, i, hashCode, str);
        m17295(c12631);
        return c12631;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m17324(String str) {
        int hashCode = (str.hashCode() + 128) & Integer.MAX_VALUE;
        for (C12631 m17297 = m17297(hashCode); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == 128 && m17297.f38055 == hashCode && m17297.f39906.equals(str)) {
                return m17297.f39901;
            }
        }
        return m17290(new C12631(this.f19430, 128, hashCode, str));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m17326(String str) {
        int hashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C12631 m17297 = m17297(hashCode); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == 1 && m17297.f38055 == hashCode && m17297.f39906.equals(str)) {
                return m17297.f39901;
            }
        }
        C18276 c18276 = this.f19439;
        c18276.m42609(1);
        c18276.m42615(str);
        int i = this.f19436;
        this.f19436 = i + 1;
        m17295(new C12631(i, 1, hashCode, str));
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17300(int i, String str) {
        int hashCode = (str.hashCode() + 129 + i) & Integer.MAX_VALUE;
        for (C12631 m17297 = m17297(hashCode); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == 129 && m17297.f38055 == hashCode && m17297.f39900 == i && m17297.f39906.equals(str)) {
                return m17297.f39901;
            }
        }
        return m17290(new C12631(this.f19430, 129, hashCode, i, str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17301(String str, String str2) {
        int hashCode = ((str2.hashCode() * str.hashCode()) + 12) & Integer.MAX_VALUE;
        for (C12631 m17297 = m17297(hashCode); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == 12 && m17297.f38055 == hashCode && m17297.f39905.equals(str) && m17297.f39906.equals(str2)) {
                return m17297.f39901;
            }
        }
        this.f19439.m42611(12, m17326(str), m17326(str2));
        int i = this.f19436;
        this.f19436 = i + 1;
        m17295(new C12631(str, i, hashCode, str2));
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12631 m17292(String str, int i, int i2, String str2) {
        int m46314 = C20094.m46314(i2, 1, str2.hashCode() * str.hashCode(), i) & Integer.MAX_VALUE;
        for (C12631 m17297 = m17297(m46314); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == i && m17297.f38055 == m46314 && m17297.f39900 == i2 && m17297.f39905.equals(str) && m17297.f39906.equals(str2)) {
                return m17297;
            }
        }
        this.f19439.m42611(i, i2, m17301(str, str2));
        int i3 = this.f19436;
        this.f19436 = i3 + 1;
        C12631 c12631 = new C12631(i3, i, null, str, str2, i2, m46314);
        m17295(c12631);
        return c12631;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C12631 m17293(String str, int i, String str2, String str3) {
        int hashCode = ((str3.hashCode() * str2.hashCode() * str.hashCode()) + i) & Integer.MAX_VALUE;
        for (C12631 m17297 = m17297(hashCode); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == i && m17297.f38055 == hashCode && m17297.f39904.equals(str) && m17297.f39905.equals(str2) && m17297.f39906.equals(str3)) {
                return m17297;
            }
        }
        this.f19439.m42611(i, m17296(7, str).f39901, m17301(str2, str3));
        int i2 = this.f19436;
        this.f19436 = i2 + 1;
        C12631 c12631 = new C12631(i2, i, str, str2, str3, 0L, hashCode);
        m17295(c12631);
        return c12631;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12631 m17306(int i, String str, String str2, String str3, boolean z) {
        int i2 = (i <= 4 || !z) ? i : i << 8;
        int hashCode = Integer.MAX_VALUE & ((str3.hashCode() * str2.hashCode() * str.hashCode() * i2) + 15);
        for (C12631 m17297 = m17297(hashCode); m17297 != null; m17297 = m17297.f38056) {
            if (m17297.f39902 == 15 && m17297.f38055 == hashCode && m17297.f39900 == i2 && m17297.f39904.equals(str) && m17297.f39905.equals(str2) && m17297.f39906.equals(str3)) {
                return m17297;
            }
        }
        C18276 c18276 = this.f19439;
        if (i <= 4) {
            c18276.m42617(i, m17293(str, 9, str2, str3).f39901);
        } else {
            c18276.m42617(i, m17311(str, str2, str3, z).f39901);
        }
        int i3 = this.f19436;
        this.f19436 = i3 + 1;
        C12631 c12631 = new C12631(i3, 15, str, str2, str3, i2, hashCode);
        m17295(c12631);
        return c12631;
    }
}

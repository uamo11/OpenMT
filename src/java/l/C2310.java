package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: N673 */
/* renamed from: l.ۖۙᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C2310 implements InterfaceC14303 {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final InterfaceC10030 a;
    public final int b;
    public final int c;
    public final EnumC23476 d;
    public final int e;

    public long a(C10071 c10071, long j) {
        return j;
    }

    public C2310(InterfaceC10030 interfaceC10030, int i, int i2, EnumC23476 enumC23476) {
        this.a = interfaceC10030;
        this.b = i;
        this.c = i2;
        this.d = enumC23476;
        this.e = 0;
    }

    public C2310(InterfaceC10030 interfaceC10030, int i, int i2, EnumC23476 enumC23476, int i3) {
        this.a = interfaceC10030;
        this.b = i;
        this.c = i2;
        this.d = enumC23476;
        this.e = i3;
    }

    public C2310 d() {
        if (this.e == -1) {
            return this;
        }
        return new C2310(this.a, this.b, this.c, this.d, -1);
    }

    public C2310 e(int i) {
        return new C2310(this.a, this.b, this.c, this.d, this.e + i);
    }

    @Override // l.InterfaceC14303
    public boolean l(C10071 c10071, StringBuilder sb) {
        InterfaceC10030 interfaceC10030 = this.a;
        Long a = c10071.a(interfaceC10030);
        if (a == null) {
            return false;
        }
        long a2 = a(c10071, a.longValue());
        C1604 c1604 = c10071.b.c;
        String l2 = a2 == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(a2));
        int length = l2.length();
        int i = this.c;
        if (length > i) {
            throw new C16232("Field " + interfaceC10030 + " cannot be printed as the value " + a2 + " exceeds the maximum print width of " + i);
        }
        c1604.getClass();
        int i2 = this.b;
        EnumC23476 enumC23476 = this.d;
        if (a2 >= 0) {
            int i3 = AbstractC7703.a[enumC23476.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && a2 >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC7703.a[enumC23476.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new C16232("Field " + interfaceC10030 + " cannot be printed as the value " + a2 + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - l2.length(); i5++) {
            sb.append('0');
        }
        sb.append(l2);
        return true;
    }

    public boolean b(C3015 c3015) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == EnumC23476.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0113, code lost:
    
        r2 = r17;
        r7 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014d, code lost:
    
        if (r3 <= r10) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0178  */
    @Override // l.InterfaceC14303
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m(l.C3015 r23, java.lang.CharSequence r24, int r25) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C2310.m(l.ۗۙᩴ, java.lang.CharSequence, int):int");
    }

    public int c(C3015 c3015, long j, int i, int i2) {
        return c3015.f(this.a, j, i, i2);
    }

    public String toString() {
        int i = this.c;
        InterfaceC10030 interfaceC10030 = this.a;
        EnumC23476 enumC23476 = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && enumC23476 == EnumC23476.NORMAL) {
            return "Value(" + interfaceC10030 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        if (i2 == i && enumC23476 == EnumC23476.NOT_NEGATIVE) {
            return "Value(" + interfaceC10030 + "," + i2 + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        return "Value(" + interfaceC10030 + "," + i2 + "," + i + "," + enumC23476 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}

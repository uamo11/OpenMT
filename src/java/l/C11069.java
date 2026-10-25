package l;

import com.alipay.sdk.m.y.q;
import java.io.IOException;
import java.io.Writer;
import moe.shizuku.server.IShizukuService;

/* compiled from: B60R */
/* renamed from: l.ۧܶ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class C11069 extends AbstractC8246 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C0225 f33243 = new C0225(1000);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C1190 f33244;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC22677 f33245;

    @Override // l.AbstractC8246
    /* renamed from: ۧ */
    public final double mo1619() {
        return 100.0d;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11069 m27455(C1190 c1190, int i, InterfaceC22677 interfaceC22677) {
        C11069 c11069 = (C11069) f33243.m1479();
        if (c11069 != null) {
            c11069.f25384 = i;
            c11069.f33244 = c1190;
            c11069.f33245 = interfaceC22677;
            return c11069;
        }
        return new C11069(c1190, i, interfaceC22677);
    }

    @Override // l.AbstractC8246
    /* renamed from: ܿ */
    public void mo12088() {
        this.f33245 = null;
        this.f33244 = null;
        f33243.m1477(this);
    }

    public C11069(C1190 c1190, int i, InterfaceC22677 interfaceC22677) {
        super(i);
        this.f33244 = c1190;
        this.f33245 = interfaceC22677;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27457(C3438 c3438, InterfaceC8293 interfaceC8293, int i, String str) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c3438.write(str);
                    return;
                }
                throw new RuntimeException();
            }
            InterfaceC4060 interfaceC4060 = (InterfaceC4060) interfaceC8293;
            c3438.write(interfaceC4060.getName());
            c3438.write(40);
            c3438.write(34);
            C14020.m33624(c3438, interfaceC4060.mo12183());
            c3438.write(34);
            c3438.write(", ", 0, 2);
            C14354.m34252(c3438, interfaceC4060.mo12182());
            for (InterfaceC10410 interfaceC10410 : interfaceC4060.mo12181()) {
                c3438.write(", ", 0, 2);
                AbstractC11569.m28462(c3438, interfaceC10410);
            }
            c3438.write(")@", 0, 2);
            if (interfaceC4060.mo12184().mo2849() != 4) {
                throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
            }
            C14354.m34253((Writer) c3438, (InterfaceC5471) interfaceC4060.mo12184().mo2850(), false);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC15347) {
            InterfaceC15347 interfaceC15347 = (InterfaceC15347) interfaceC8293;
            c3438.write(34);
            if (interfaceC15347 instanceof C13143) {
                C13143 c13143 = (C13143) interfaceC15347;
                c13143.f39302.m31406(c13143.f39303, c3438, true);
            } else {
                C14020.m33624(c3438, interfaceC15347.getString());
            }
            c3438.write(34);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC21699) {
            InterfaceC21699 interfaceC21699 = (InterfaceC21699) interfaceC8293;
            if (interfaceC21699 instanceof C12438) {
                C12438 c12438 = (C12438) interfaceC21699;
                c12438.f37432.m31386(c3438, c12438.f37433);
                return;
            } else {
                c3438.write(interfaceC21699.getType());
                return;
            }
        }
        if (interfaceC8293 instanceof InterfaceC18877) {
            C14354.m34254((Writer) c3438, (InterfaceC18877) interfaceC8293, false);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC5471) {
            C14354.m34253((Writer) c3438, (InterfaceC5471) interfaceC8293, false);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC0531) {
            C14354.m34252(c3438, (InterfaceC0531) interfaceC8293);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC19583) {
            C14354.m34255(c3438, (InterfaceC19583) interfaceC8293);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC4060) {
            InterfaceC4060 interfaceC40602 = (InterfaceC4060) interfaceC8293;
            c3438.write(interfaceC40602.getName());
            c3438.write(40);
            c3438.write(34);
            C14020.m33624(c3438, interfaceC40602.mo12183());
            c3438.write(34);
            c3438.write(", ");
            C14354.m34252(c3438, interfaceC40602.mo12182());
            for (InterfaceC10410 interfaceC104102 : interfaceC40602.mo12181()) {
                c3438.write(", ");
                C6385.m17700(c3438, interfaceC104102);
            }
            c3438.write(")@");
            if (interfaceC40602.mo12184().mo2849() == 4) {
                C14354.m34253((Writer) c3438, (InterfaceC5471) interfaceC40602.mo12184().mo2850(), false);
                return;
            }
            throw new IllegalArgumentException("The linker method handle for a call site must be of type invoke-static");
        }
        throw new IOException("Unknown reference: " + interfaceC8293);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0124, code lost:
    
        if (r17.f33244.m4016(((l.InterfaceC7423) r17.f33245).mo2818() + m21833()) == (-1)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013a, code lost:
    
        if (r17.f33244.m4012(((l.InterfaceC7423) r17.f33245).mo2818() + m21833()) == (-1)) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03a5  */
    @Override // l.AbstractC8246
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo1618(l.C3438 r18) {
        /*
            Method dump skipped, instructions count: 1146
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C11069.mo1618(l.ۗ᩵ۚ):boolean");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m27464(C3438 c3438) {
        c3438.mo10509(this.f33245.mo3975());
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void mo27466(C3438 c3438) {
        throw new RuntimeException();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27461(C3438 c3438, int i) {
        this.f33244.f4291.m36320(c3438, i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27460(C3438 c3438) {
        m27461(c3438, ((InterfaceC1779) this.f33245).mo1790());
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m27462(C3438 c3438) {
        m27461(c3438, ((InterfaceC23651) this.f33245).mo7930());
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m27465(C3438 c3438) {
        InterfaceC9978 interfaceC9978 = (InterfaceC9978) this.f33245;
        int mo3615 = interfaceC9978.mo3615();
        c3438.write(123);
        if (mo3615 == 1) {
            m27461(c3438, interfaceC9978.mo3614());
        } else if (mo3615 == 2) {
            m27461(c3438, interfaceC9978.mo3614());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3612());
        } else if (mo3615 == 3) {
            m27461(c3438, interfaceC9978.mo3614());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3612());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3611());
        } else if (mo3615 == 4) {
            m27461(c3438, interfaceC9978.mo3614());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3612());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3611());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3613());
        } else if (mo3615 == 5) {
            m27461(c3438, interfaceC9978.mo3614());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3612());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3611());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3613());
            c3438.write(", ", 0, 2);
            m27461(c3438, interfaceC9978.mo3610());
        }
        c3438.write(q.h);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m27463(C3438 c3438) {
        InterfaceC16595 interfaceC16595 = (InterfaceC16595) this.f33245;
        int mo3615 = interfaceC16595.mo3615();
        if (mo3615 == 0) {
            c3438.getClass();
            c3438.write("{}", 0, 2);
            return;
        }
        int mo9712 = interfaceC16595.mo9712();
        C15300 c15300 = this.f33244.f4291;
        int i = (mo3615 + mo9712) - 1;
        int i2 = c15300.f46940;
        int i3 = c15300.f46941;
        c15300.f46939.getClass();
        int i4 = i3 - i2;
        if (mo9712 >= i4) {
            c3438.getClass();
            c3438.write("{p", 0, 2);
            c3438.m10510(mo9712 - i4);
            c3438.write(" .. p", 0, 5);
            c3438.m10510(i - i4);
            c3438.write(q.h);
            return;
        }
        c3438.getClass();
        c3438.write("{v", 0, 2);
        c3438.m10510(mo9712);
        c3438.write(" .. v", 0, 5);
        c3438.m10510(i);
        c3438.write(q.h);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27458(C3438 c3438, int i) {
        if (C6260.m17271(i)) {
            c3438.getClass();
            c3438.write("  # ", 0, 4);
            float intBitsToFloat = Float.intBitsToFloat(i);
            if (intBitsToFloat == Float.POSITIVE_INFINITY) {
                c3438.write("Float.POSITIVE_INFINITY", 0, 23);
                return;
            }
            if (intBitsToFloat == Float.NEGATIVE_INFINITY) {
                c3438.write("Float.NEGATIVE_INFINITY", 0, 23);
                return;
            }
            if (Float.isNaN(intBitsToFloat)) {
                c3438.write("Float.NaN", 0, 9);
                return;
            }
            if (intBitsToFloat == Float.MAX_VALUE) {
                c3438.write("Float.MAX_VALUE", 0, 15);
                return;
            }
            if (intBitsToFloat == 3.1415927f) {
                c3438.write("(float)Math.PI", 0, 14);
            } else if (intBitsToFloat == 2.7182817f) {
                c3438.write("(float)Math.E", 0, 13);
            } else {
                c3438.write(Float.toString(intBitsToFloat));
                c3438.write(IShizukuService.Stub.TRANSACTION_attachUserService);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27456(C3438 c3438, long j) {
        if (C6260.m17272(j)) {
            c3438.getClass();
            c3438.write("  # ", 0, 4);
            double longBitsToDouble = Double.longBitsToDouble(j);
            if (longBitsToDouble == Double.POSITIVE_INFINITY) {
                c3438.write("Double.POSITIVE_INFINITY", 0, 24);
                return;
            }
            if (longBitsToDouble == Double.NEGATIVE_INFINITY) {
                c3438.write("Double.NEGATIVE_INFINITY", 0, 24);
                return;
            }
            if (Double.isNaN(longBitsToDouble)) {
                c3438.write("Double.NaN", 0, 10);
                return;
            }
            if (longBitsToDouble == Double.MAX_VALUE) {
                c3438.write("Double.MAX_VALUE", 0, 16);
                return;
            }
            if (longBitsToDouble == 3.141592653589793d) {
                c3438.write("Math.PI", 0, 7);
            } else if (longBitsToDouble == 2.718281828459045d) {
                c3438.write("Math.E", 0, 6);
            } else {
                c3438.write(Double.toString(longBitsToDouble));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27459(C3438 c3438, int i) {
        String str = (String) this.f33244.f4289.f72436.get(i);
        if (str == null) {
            return false;
        }
        c3438.getClass();
        c3438.write("    # ", 0, 6);
        c3438.write(str, 0, str.length());
        return true;
    }
}

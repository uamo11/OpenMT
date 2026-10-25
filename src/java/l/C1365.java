package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* compiled from: 24FJ */
/* renamed from: l.֨᩷۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1365 {

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f4960 = 0;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C3581 f4962;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f4964;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f4965;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC19711 f4966;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12323 f4968;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C5599 f4970;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f4972;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f4973;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20661 f4978;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C16181[] f4981;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f4982;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11327 f4986;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public InterfaceC13896 f4988;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C16181[] f4989;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6319 f4994;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f4995;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f4969 = 0;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f4961 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f4985 = new byte[64];

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f4987 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18837 f4977 = new C18837();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C2609 f4967 = C2609.m8239();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f4963 = true;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f4971 = false;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f4983 = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C9833 f4992 = null;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f4990 = -1;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f4993 = false;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f4984 = 0;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C0659[] f4980 = null;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public AbstractC2071[] f4976 = null;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f4979 = 0;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f4974 = -1;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C0659 f4975 = null;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C0659 f4991 = null;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static int m4787(int i) {
        if (i == 198) {
            return 199;
        }
        if (i == 199) {
            return 198;
        }
        return ((i + 1) ^ 1) - 1;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m4795(int i) {
        if (i == 5 || i == 6 || i == 7) {
            return 0;
        }
        return i;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static int m4796(int i) {
        if (i == 1 || i == 3) {
            return 2;
        }
        return i != 8 ? 1 : 0;
    }

    public C1365(C3581 c3581, boolean z, InterfaceC13896 interfaceC13896, boolean z2, EnumC19711 enumC19711, boolean z3, C11327 c11327, C20661 c20661, C6319 c6319, C12323 c12323) {
        this.f4962 = c3581;
        this.f4995 = z;
        this.f4988 = interfaceC13896;
        this.f4965 = interfaceC13896 != null;
        this.f4964 = z2;
        this.f4986 = c11327;
        this.f4978 = c20661;
        this.f4994 = c6319;
        this.f4968 = c12323;
        this.f4982 = z3;
        this.f4966 = enumC19711;
        int ordinal = enumC19711.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            this.f4973 = true;
        } else {
            this.f4973 = false;
        }
        this.f4970 = new C5599(this);
        this.f4989 = new C16181[20];
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m4782(AbstractC4308 abstractC4308) {
        switch (C21122.f68129[abstractC4308.mo3258().ordinal()]) {
            case 1:
                return 5;
            case 2:
                return 7;
            case 3:
                return 6;
            case 4:
                return 0;
            case 5:
                return 1;
            case 6:
                return 2;
            case 7:
                return 3;
            case 8:
                return 5;
            case 9:
                return 8;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return 4;
            default:
                throw new AssertionError("typecode " + abstractC4308.mo3258());
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m4791(AbstractC4308 abstractC4308) {
        if (abstractC4308 == null) {
            return 1;
        }
        return m4796(m4782(abstractC4308));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m4781(C2609 c2609) {
        int i = 0;
        while (c2609.m8249()) {
            i += m4791((AbstractC4308) c2609.f8240);
            c2609 = c2609.f8241;
        }
        return i;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m4816() {
        if (this.f4992 != null) {
            m4832();
        }
        if (this.f4990 != -1) {
            m4834();
        }
        this.f4971 = true;
        return this.f4987;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private void m4790(int i) {
        if (this.f4963) {
            byte[] m17574 = C6322.m17574(this.f4987, this.f4985);
            this.f4985 = m17574;
            int i2 = this.f4987;
            this.f4987 = i2 + 1;
            m17574[i2] = (byte) i;
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m4788(int i) {
        if (this.f4963) {
            int i2 = this.f4987;
            int i3 = i2 + 2;
            byte[] bArr = this.f4985;
            if (i3 > bArr.length) {
                m4790(i >> 8);
                m4790(i);
                return;
            }
            int i4 = i2 + 1;
            this.f4987 = i4;
            bArr[i2] = (byte) (i >> 8);
            this.f4987 = i3;
            bArr[i4] = (byte) i;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4817(int i) {
        if (this.f4963) {
            int i2 = this.f4987;
            int i3 = i2 + 4;
            byte[] bArr = this.f4985;
            if (i3 > bArr.length) {
                m4790(i >> 24);
                m4790(i >> 16);
                m4790(i >> 8);
                m4790(i);
                return;
            }
            int i4 = i2 + 1;
            this.f4987 = i4;
            bArr[i2] = (byte) (i >> 24);
            int i5 = i2 + 2;
            this.f4987 = i5;
            bArr[i4] = (byte) (i >> 16);
            int i6 = i2 + 3;
            this.f4987 = i6;
            bArr[i5] = (byte) (i >> 8);
            this.f4987 = i3;
            bArr[i6] = (byte) i;
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m4793(int i) {
        String[] strArr;
        C16181 c16181;
        AbstractC2071 c11535;
        AbstractC2071 abstractC2071;
        C16181 c161812;
        int i2;
        if (this.f4992 != null) {
            m4832();
        }
        if (this.f4963) {
            if (this.f4990 != -1) {
                m4834();
            }
            boolean z = this.f4993;
            boolean z2 = this.f4982;
            if (z) {
                int i3 = 0;
                this.f4993 = false;
                int m4816 = m4816();
                if (this.f4973) {
                    int ordinal = this.f4966.ordinal();
                    C6319 c6319 = this.f4994;
                    if (ordinal == 1) {
                        int m4789 = m4789();
                        if (this.f4974 == m4816) {
                            C0659[] c0659Arr = this.f4980;
                            int i4 = this.f4979 - 1;
                            this.f4979 = i4;
                            c0659Arr[i4] = null;
                        }
                        this.f4974 = m4816;
                        C0659[] c0659Arr2 = this.f4980;
                        if (c0659Arr2 == null) {
                            this.f4980 = new C0659[20];
                        } else {
                            this.f4980 = (C0659[]) C6322.m17575(this.f4979, c0659Arr2);
                        }
                        C0659[] c0659Arr3 = this.f4980;
                        int i5 = this.f4979;
                        this.f4979 = i5 + 1;
                        C0659 c0659 = new C0659();
                        c0659Arr3[i5] = c0659;
                        c0659.f2554 = m4816;
                        c0659.f2553 = new AbstractC4308[m4789];
                        for (int i6 = 0; i6 < m4789; i6++) {
                            if (this.f4970.f17317.m20950(i6) && (c16181 = this.f4989[i6]) != null) {
                                AbstractC4308 abstractC4308 = c16181.f49840.f17560;
                                if (!(abstractC4308 instanceof C16535)) {
                                    abstractC4308 = c6319.m17519(abstractC4308);
                                }
                                c0659.f2553[i6] = abstractC4308;
                            }
                        }
                        c0659.f2555 = new AbstractC4308[this.f4970.f17313];
                        while (true) {
                            C5599 c5599 = this.f4970;
                            if (i3 >= c5599.f17313) {
                                break;
                            }
                            c0659.f2555[i3] = c5599.f17314[i3];
                            i3++;
                        }
                    } else if (ordinal == 2) {
                        int m47892 = m4789();
                        C0659 c06592 = this.f4975;
                        if (c06592 != null) {
                            if (c06592.f2554 == m4816) {
                                AbstractC2071[] abstractC2071Arr = this.f4976;
                                int i7 = this.f4979 - 1;
                                this.f4979 = i7;
                                abstractC2071Arr[i7] = null;
                                this.f4975 = this.f4991;
                                this.f4991 = null;
                            }
                        } else {
                            C0659 c06593 = new C0659();
                            C3581 c3581 = this.f4962;
                            C2609 c2609 = ((C10658) c3581.m16096(c6319)).f32059;
                            int m8245 = c2609.m8245();
                            if (!c3581.mo15572()) {
                                AbstractC4308 abstractC43082 = c3581.f17561.f17560;
                                c06593.f2553 = new AbstractC4308[m8245 + 1];
                                if (c3581.m16075() && abstractC43082 != this.f4978.f66526) {
                                    c06593.f2553[0] = C16535.m38910(abstractC43082);
                                } else {
                                    c06593.f2553[0] = c6319.m17519(abstractC43082);
                                }
                                i2 = 1;
                            } else {
                                c06593.f2553 = new AbstractC4308[m8245];
                                i2 = 0;
                            }
                            Iterator it = c2609.iterator();
                            while (it.hasNext()) {
                                c06593.f2553[i2] = c6319.m17519((AbstractC4308) it.next());
                                i2++;
                            }
                            c06593.f2554 = -1;
                            c06593.f2555 = null;
                            this.f4975 = c06593;
                        }
                        C0659 c06594 = new C0659();
                        c06594.f2554 = m4816;
                        AbstractC4308[] abstractC4308Arr = new AbstractC4308[m47892];
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < m47892) {
                            if (this.f4970.f17317.m20950(i8) && (c161812 = this.f4989[i8]) != null) {
                                AbstractC4308 abstractC43083 = c161812.f49840.f17560;
                                if (!(abstractC43083 instanceof C16535)) {
                                    abstractC43083 = c6319.m17519(abstractC43083);
                                }
                                abstractC4308Arr[i8] = abstractC43083;
                                if (m4791(abstractC43083) > 1) {
                                    i8++;
                                }
                            }
                            i8++;
                            i9++;
                        }
                        c06594.f2553 = new AbstractC4308[i9];
                        int i10 = 0;
                        int i11 = 0;
                        while (i10 < m47892) {
                            C12171.m29642(i11 < i9);
                            c06594.f2553[i11] = abstractC4308Arr[i10];
                            if (m4791(abstractC4308Arr[i10]) > 1) {
                                i10++;
                            }
                            i10++;
                            i11++;
                        }
                        int i12 = 0;
                        int i13 = 0;
                        while (true) {
                            C5599 c55992 = this.f4970;
                            if (i12 >= c55992.f17313) {
                                break;
                            }
                            if (c55992.f17314[i12] != null) {
                                i13++;
                            }
                            i12++;
                        }
                        c06594.f2555 = new AbstractC4308[i13];
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            C5599 c55993 = this.f4970;
                            if (i14 >= c55993.f17313) {
                                break;
                            }
                            AbstractC4308 abstractC43084 = c55993.f17314[i14];
                            if (abstractC43084 != null) {
                                c06594.f2555[i15] = c6319.m17519(abstractC43084);
                                i15++;
                            }
                            i14++;
                        }
                        AbstractC2071[] abstractC2071Arr2 = this.f4976;
                        if (abstractC2071Arr2 == null) {
                            this.f4976 = new AbstractC2071[20];
                        } else {
                            this.f4976 = (AbstractC2071[]) C6322.m17575(this.f4979, abstractC2071Arr2);
                        }
                        AbstractC2071[] abstractC2071Arr3 = this.f4976;
                        int i16 = this.f4979;
                        this.f4979 = i16 + 1;
                        C0659 c06595 = this.f4975;
                        int i17 = c06595.f2554;
                        AbstractC4308[] abstractC4308Arr2 = c06595.f2553;
                        AbstractC4308[] abstractC4308Arr3 = c06594.f2553;
                        AbstractC4308[] abstractC4308Arr4 = c06594.f2555;
                        int i18 = (c06594.f2554 - i17) - 1;
                        if (abstractC4308Arr4.length == 1) {
                            if (abstractC4308Arr3.length == abstractC4308Arr2.length && AbstractC2071.m6810(abstractC4308Arr2, abstractC4308Arr3, c6319) == 0) {
                                abstractC2071 = new C7301(i18, abstractC4308Arr4[0]);
                                abstractC2071Arr3[i16] = abstractC2071;
                                this.f4991 = this.f4975;
                                this.f4975 = c06594;
                            }
                            abstractC2071 = new C22823(i18, abstractC4308Arr3, abstractC4308Arr4);
                            abstractC2071Arr3[i16] = abstractC2071;
                            this.f4991 = this.f4975;
                            this.f4975 = c06594;
                        } else {
                            if (abstractC4308Arr4.length == 0) {
                                int m6810 = AbstractC2071.m6810(abstractC4308Arr2, abstractC4308Arr3, c6319);
                                if (m6810 == 0) {
                                    abstractC2071 = new C13650(i18);
                                } else {
                                    if (-4 < m6810 && m6810 < 0) {
                                        AbstractC4308[] abstractC4308Arr5 = new AbstractC4308[-m6810];
                                        int length = abstractC4308Arr2.length;
                                        while (length < abstractC4308Arr3.length) {
                                            abstractC4308Arr5[i3] = abstractC4308Arr3[length];
                                            length++;
                                            i3++;
                                        }
                                        c11535 = new C5890(251 - m6810, i18, abstractC4308Arr5);
                                    } else if (m6810 > 0 && m6810 < 4) {
                                        c11535 = new C11535(251 - m6810, i18);
                                    }
                                    abstractC2071 = c11535;
                                }
                                abstractC2071Arr3[i16] = abstractC2071;
                                this.f4991 = this.f4975;
                                this.f4975 = c06594;
                            }
                            abstractC2071 = new C22823(i18, abstractC4308Arr3, abstractC4308Arr4);
                            abstractC2071Arr3[i16] = abstractC2071;
                            this.f4991 = this.f4975;
                            this.f4975 = c06594;
                        }
                    } else {
                        throw new AssertionError("Should have chosen a stackmap format");
                    }
                    if (z2) {
                        this.f4970.m15883(m4816);
                    }
                }
            }
            if (z2) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder("emit@");
                sb.append(this.f4987);
                sb.append(" stack=");
                sb.append(this.f4970.f17313);
                sb.append(": ");
                strArr = C2777.f8654;
                sb.append(strArr[i]);
                printStream.println(sb.toString());
            }
            m4790(i);
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m4815() {
        C12171.m29642(this.f4963 || m4828());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4809(InterfaceC8090 interfaceC8090) {
        int m29891 = this.f4968.m29891(interfaceC8090);
        if (m29891 <= 255) {
            m4804(18, m29891, interfaceC8090);
        } else {
            m4805(19, m29891, (InterfaceC21496) interfaceC8090);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4803(int i, int i2, AbstractC4308 abstractC4308) {
        m4793(197);
        if (this.f4963) {
            m4788(i2);
            m4790(i);
            this.f4970.m15887(i);
            this.f4970.m15885(abstractC4308);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4819(int i, AbstractC4308 abstractC4308) {
        m4793(188);
        if (this.f4963) {
            m4790(i);
            this.f4970.m15887(1);
            this.f4970.m15885(abstractC4308);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4806(int i, AbstractC4308 abstractC4308) {
        m4793(189);
        if (this.f4963) {
            m4788(i);
            this.f4970.m15887(1);
            this.f4970.m15885(abstractC4308);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0100  */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4824(int r7) {
        /*
            Method dump skipped, instructions count: 1400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1365.m4824(int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4804(int i, int i2, InterfaceC8090 interfaceC8090) {
        String[] strArr;
        m4793(i);
        if (this.f4963) {
            m4790(i2);
            if (i == 16) {
                this.f4970.m15885(this.f4978.f66452);
            } else if (i == 18) {
                this.f4970.m15885(this.f4994.m17491(interfaceC8090));
            } else {
                strArr = C2777.f8654;
                throw new AssertionError(strArr[i]);
            }
            m4815();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4802(int i, int i2) {
        String[] strArr;
        if (i2 > 255) {
            m4793(196);
            m4793(i);
            m4788(i2);
        } else {
            m4793(i);
            m4790(i2);
        }
        if (this.f4963) {
            if (i != 169) {
                C20661 c20661 = this.f4978;
                switch (i) {
                    case 21:
                        this.f4970.m15885(c20661.f66452);
                        break;
                    case 22:
                        this.f4970.m15885(c20661.f66470);
                        break;
                    case 23:
                        this.f4970.m15885(c20661.f66483);
                        break;
                    case 24:
                        this.f4970.m15885(c20661.f66499);
                        break;
                    case 25:
                        this.f4970.m15885(this.f4989[i2].f49840.f17560);
                        break;
                    default:
                        switch (i) {
                            case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                            case 56:
                            case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                this.f4970.m15887(1);
                                break;
                            case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                            case 57:
                                this.f4970.m15887(2);
                                break;
                            default:
                                strArr = C2777.f8654;
                                throw new AssertionError(strArr[i]);
                        }
                }
            } else {
                this.f4963 = false;
            }
            m4815();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4818(int i, int i2) {
        if (i > 255 || i2 < -128 || i2 > 127) {
            m4793(196);
            m4793(132);
            m4788(i);
            m4788(i2);
            return;
        }
        m4793(132);
        m4790(i);
        m4790(i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4805(int i, int i2, InterfaceC21496 interfaceC21496) {
        String[] strArr;
        m4793(i);
        if (this.f4963) {
            m4788(i2);
            C20661 c20661 = this.f4978;
            if (i == 17) {
                this.f4970.m15885(c20661.f66452);
                return;
            }
            C6319 c6319 = this.f4994;
            if (i == 187) {
                this.f4970.m15885(C16535.m38909(this.f4987 - 3, ((AbstractC4308) interfaceC21496).f13890.mo16091(c6319)));
                return;
            }
            if (i == 19) {
                this.f4970.m15885(c6319.m17491((InterfaceC8090) interfaceC21496));
                return;
            }
            if (i == 20) {
                this.f4970.m15885(c6319.m17491((InterfaceC8090) interfaceC21496));
                return;
            }
            if (i == 192) {
                this.f4970.m15887(1);
                this.f4970.m15885(c6319.m17519((AbstractC4308) interfaceC21496));
                return;
            }
            if (i != 193) {
                if (i != 198 && i != 199) {
                    switch (i) {
                        case 153:
                        case EnumC17734.f54268 /* 154 */:
                        case 155:
                        case 156:
                        case 157:
                        case 158:
                            break;
                        case 159:
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                        case 161:
                        case 162:
                        case 163:
                        case 164:
                        case 165:
                        case 166:
                            this.f4970.m15887(2);
                            return;
                        case 167:
                            this.f4963 = false;
                            return;
                        case 168:
                            return;
                        default:
                            switch (i) {
                                case 178:
                                    this.f4970.m15885(((AbstractC5698) interfaceC21496).mo16091(c6319));
                                    return;
                                case 179:
                                    C5599 c5599 = this.f4970;
                                    AbstractC4308 mo16091 = ((AbstractC5698) interfaceC21496).mo16091(c6319);
                                    c5599.getClass();
                                    c5599.m15887(m4791(mo16091));
                                    return;
                                case 180:
                                    this.f4970.m15887(1);
                                    this.f4970.m15885(((AbstractC5698) interfaceC21496).mo16091(c6319));
                                    return;
                                case 181:
                                    C5599 c55992 = this.f4970;
                                    AbstractC4308 mo160912 = ((AbstractC5698) interfaceC21496).mo16091(c6319);
                                    c55992.getClass();
                                    c55992.m15887(m4791(mo160912));
                                    this.f4970.m15887(1);
                                    return;
                                default:
                                    strArr = C2777.f8654;
                                    throw new AssertionError(strArr[i]);
                            }
                    }
                }
                this.f4970.m15887(1);
                return;
            }
            this.f4970.m15887(1);
            this.f4970.m15885(c20661.f66452);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m4829(int i) {
        String[] strArr;
        m4793(i);
        if (this.f4963) {
            m4817(0);
            if (i == 200) {
                this.f4963 = false;
            } else {
                if (i == 201) {
                    return;
                }
                strArr = C2777.f8654;
                throw new AssertionError(strArr[i]);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4801() {
        if (this.f4963) {
            while (this.f4987 % 4 != 0) {
                m4824(0);
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m4794(int i, int i2) {
        this.f4985[i] = (byte) i2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m4825(int i, int i2) {
        m4794(i, i2 >> 24);
        m4794(i + 1, i2 >> 16);
        m4794(i + 2, i2 >> 8);
        m4794(i + 3, i2);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m4786(int i) {
        return this.f4985[i] & 255;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m4821(int i) {
        return m4786(i + 3) | (m4786(i) << 24) | (m4786(i + 1) << 16) | (m4786(i + 2) << 8);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m4831() {
        return this.f4963 || this.f4992 != null;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m4822() {
        this.f4963 = false;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m4823() {
        int m4816 = m4816();
        this.f4963 = true;
        this.f4993 = this.f4973;
        return m4816;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4797(C5599 c5599) {
        int m4816 = m4816();
        this.f4963 = true;
        C5599 m15882 = c5599.m15882();
        m4808(m15882.f17317);
        this.f4970 = m15882;
        C12171.m29642(c5599.f17313 <= this.f4969);
        if (this.f4982) {
            System.err.println("entry point " + c5599);
        }
        this.f4993 = this.f4973;
        return m4816;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4798(C5599 c5599, AbstractC4308 abstractC4308) {
        int m4816 = m4816();
        this.f4963 = true;
        C5599 m15882 = c5599.m15882();
        m4808(m15882.f17317);
        this.f4970 = m15882;
        C12171.m29642(c5599.f17313 <= this.f4969);
        this.f4970.m15885(abstractC4308);
        if (this.f4982) {
            System.err.println("entry point " + c5599);
        }
        this.f4993 = this.f4973;
        return m4816;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m4814(int i) {
        int i2 = this.f4984;
        this.f4984 = i;
        return i2;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m4828() {
        return !this.f4963 || this.f4970.f17313 == this.f4984;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private int m4789() {
        C16181 c16181;
        int i = this.f4961;
        while (true) {
            i--;
            if (i < 0) {
                return 0;
            }
            if (this.f4970.f17317.m20950(i) && (c16181 = this.f4989[i]) != null) {
                return m4791(c16181.f49840.mo16091(this.f4994)) + i;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9833 m4800(int i) {
        C9833 c9833;
        int i2;
        if (i == 167) {
            c9833 = this.f4992;
            this.f4992 = null;
        } else {
            c9833 = null;
        }
        if (i == 168 || !m4831()) {
            return c9833;
        }
        if (!this.f4995) {
            m4805(i, 0, (InterfaceC21496) null);
            i2 = this.f4987 - 3;
        } else {
            if (i != 167 && i != 168) {
                m4805(m4787(i), 8, (InterfaceC21496) null);
                m4829(200);
                this.f4963 = true;
                this.f4993 = this.f4973;
            } else {
                m4829(i + 33);
            }
            i2 = this.f4987 - 5;
        }
        C9833 c98332 = new C9833(i2, c9833, this.f4970.m15882());
        this.f4971 = this.f4995;
        if (i == 167) {
            this.f4963 = false;
        }
        return c98332;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4812(C9833 c9833, int i) {
        int i2;
        char c;
        C5599 c5599 = this.f4970;
        boolean z = false;
        while (true) {
            if (c9833 == null) {
                break;
            }
            C9833 c98332 = c9833.f29715;
            int i3 = c9833.f29716;
            C5599 c55992 = c9833.f29717;
            C12171.m29642(this.f4970 != c55992 && (i > i3 || m4828()));
            int i4 = this.f4987;
            if (i >= i4) {
                i = i4;
            } else if (m4786(i) == 167) {
                i += this.f4995 ? m4821(i + 1) : (m4786(i + 1) << 8) | m4786(i + 2);
            }
            if (m4786(i3) == 167 && i3 + 3 == i && i == (i2 = this.f4987) && !this.f4971) {
                if (this.f4964) {
                    for (C16181 c16181 : this.f4989) {
                        if (c16181 != null) {
                            for (C9127 c9127 : c16181.f49838) {
                                char c2 = c9127.f27648;
                                if (c2 != 65535 && (c = c9127.f27647) != 65535 && c2 + c >= i2) {
                                    c9127.f27647 = (char) (c - 3);
                                }
                            }
                        }
                    }
                }
                this.f4987 -= 3;
                i -= 3;
                if (c98332 == null) {
                    this.f4963 = true;
                    break;
                }
            } else {
                if (this.f4995) {
                    m4825(i3 + 1, i - i3);
                } else {
                    int i5 = i - i3;
                    if (i5 >= -32768 && i5 <= 32767) {
                        m4794(i3 + 1, i5 >> 8);
                        m4794(i3 + 2, i5);
                    } else {
                        this.f4995 = true;
                    }
                }
                C12171.m29642(!this.f4963 || (c55992.f17313 == c5599.f17313 && c55992.f17316 == c5599.f17316));
            }
            this.f4971 = true;
            if (this.f4987 == i) {
                if (this.f4982) {
                    System.err.println("resolving chain state=" + c55992);
                }
                if (!this.f4963) {
                    this.f4963 = true;
                } else {
                    C6319 c6319 = c55992.f17315.f4994;
                    c55992.f17317.m20938(c5599.f17317);
                    C12171.m29642(c55992.f17313 == c5599.f17313 && c55992.f17316 == c5599.f17316);
                    int i6 = 0;
                    while (i6 < c55992.f17313) {
                        AbstractC4308 abstractC4308 = c55992.f17314[i6];
                        AbstractC4308 abstractC43082 = c5599.f17314[i6];
                        if (abstractC4308 != abstractC43082) {
                            if (c6319.m17546(abstractC4308, abstractC43082, true)) {
                                abstractC4308 = abstractC43082;
                            } else if (!c6319.m17546(abstractC43082, abstractC4308, true)) {
                                throw new AssertionError("inconsistent stack types at join point");
                            }
                        }
                        int m4791 = m4791(abstractC4308);
                        AbstractC4308[] abstractC4308Arr = c55992.f17314;
                        abstractC4308Arr[i6] = abstractC4308;
                        if (m4791 == 2) {
                            C12171.m29644(abstractC4308Arr[i6 + 1]);
                        }
                        i6 += m4791;
                    }
                }
                c5599 = c55992;
                z = true;
            }
            c9833 = c98332;
        }
        C12171.m29642((z && this.f4970 == c5599) ? false : true);
        if (this.f4970 != c5599) {
            m4808(c5599.f17317);
            this.f4970 = c5599;
            this.f4993 = this.f4973;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4807(AbstractC5698 abstractC5698, C10658 c10658) {
        int m4781 = m4781(c10658.f32059);
        m4793(185);
        if (this.f4963) {
            m4788(C13028.m31613(this.f4968.f36883, abstractC5698));
            int i = m4781 + 1;
            m4790(i);
            m4790(0);
            this.f4970.m15887(i);
            this.f4970.m15885(c10658.mo12923());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4810(C9226 c9226, C10658 c10658) {
        int m4781 = m4781(c10658.f32059);
        m4793(186);
        if (this.f4963) {
            m4788(C13028.m31613(this.f4968.f36883, c9226));
            m4788(0);
            this.f4970.m15887(m4781);
            this.f4970.m15885(c10658.mo12923());
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4820(AbstractC5698 abstractC5698, C10658 c10658) {
        int m4781 = m4781(c10658.f32059);
        m4793(183);
        if (this.f4963) {
            m4788(C13028.m31613(this.f4968.f36883, abstractC5698));
            this.f4970.m15887(m4781);
            if (abstractC5698.m16075()) {
                C5599 c5599 = this.f4970;
                C16535 c16535 = (C16535) c5599.f17314[c5599.f17313 - 1];
                C1365 c1365 = c5599.f17315;
                AbstractC4308 abstractC4308 = c16535.f14167;
                int i = 0;
                for (int i2 = 0; i2 < c5599.f17313; i2++) {
                    AbstractC4308[] abstractC4308Arr = c5599.f17314;
                    if (abstractC4308Arr[i2] == c16535) {
                        abstractC4308Arr[i2] = abstractC4308;
                    }
                }
                while (true) {
                    C16181[] c16181Arr = c1365.f4989;
                    if (i >= c16181Arr.length) {
                        break;
                    }
                    C16181 c16181 = c16181Arr[i];
                    if (c16181 != null) {
                        C12048 c12048 = c16181.f49840;
                        if (c12048.f17560 == c16535) {
                            C12048 mo7177 = c12048.mo7177(c12048.f17561);
                            mo7177.f17560 = abstractC4308;
                            C16181[] c16181Arr2 = c1365.f4989;
                            C16181 c161812 = new C16181(mo7177);
                            c16181Arr2[i] = c161812;
                            c161812.f49838 = c16181.f49838;
                        }
                    }
                    i++;
                }
            }
            this.f4970.m15887(1);
            this.f4970.m15885(c10658.mo12923());
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m4826(AbstractC5698 abstractC5698, C10658 c10658) {
        int m4781 = m4781(c10658.f32059);
        m4793(184);
        if (this.f4963) {
            m4788(C13028.m31613(this.f4968.f36883, abstractC5698));
            this.f4970.m15887(m4781);
            this.f4970.m15885(c10658.mo12923());
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m4830(AbstractC5698 abstractC5698, C10658 c10658) {
        int m4781 = m4781(c10658.f32059);
        m4793(182);
        if (this.f4963) {
            m4788(C13028.m31613(this.f4968.f36883, abstractC5698));
            this.f4970.m15887(m4781 + 1);
            this.f4970.m15885(c10658.mo12923());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4811(C9833 c9833) {
        boolean z;
        if (this.f4963 && c9833 != null) {
            C5599 c5599 = this.f4970;
            int i = c5599.f17313;
            C5599 c55992 = c9833.f29717;
            if (i != c55992.f17313 || c5599.f17316 != c55992.f17316) {
                z = false;
                C12171.m29642(z);
                this.f4992 = m4783(c9833, this.f4992);
            }
        }
        z = true;
        C12171.m29642(z);
        this.f4992 = m4783(c9833, this.f4992);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4832() {
        C9833 c9833 = this.f4992;
        this.f4992 = null;
        m4812(c9833, this.f4987);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9833 m4783(C9833 c9833, C9833 c98332) {
        if (c98332 == null) {
            return c9833;
        }
        C5599 c5599 = c98332.f29717;
        if (c9833 == null) {
            return c98332;
        }
        C5599 c55992 = c9833.f29717;
        C12171.m29642(c55992.f17313 == c5599.f17313 && c55992.f17316 == c5599.f17316);
        int i = c9833.f29716;
        int i2 = c98332.f29716;
        if (i < i2) {
            return new C9833(i2, m4783(c9833, c98332.f29715), c5599);
        }
        return new C9833(i, m4783(c9833.f29715, c98332), c55992);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m4833(int i) {
        if (i != -1) {
            this.f4990 = i;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m4834() {
        boolean z;
        if (this.f4963 && (z = this.f4965)) {
            int mo20264 = this.f4988.mo20264(this.f4990);
            int i = this.f4987;
            char c = (char) i;
            char c2 = (char) mo20264;
            if (c == i && c2 == mo20264 && z) {
                if (this.f4967.m8249()) {
                    C2609 c2609 = this.f4967;
                    if (((char[]) c2609.f8240)[0] == c) {
                        this.f4967 = c2609.f8241;
                    }
                }
                if (this.f4967.isEmpty() || ((char[]) this.f4967.f8240)[1] != c2) {
                    this.f4967 = this.f4967.m8246(new char[]{c, c2});
                }
            }
        }
        this.f4990 = -1;
    }

    static {
        new C7254(EnumC9454.INT);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4808(C7841 c7841) {
        C7841 c78412;
        C16181 c16181;
        if (!this.f4963 || c7841 == (c78412 = this.f4970.f17317)) {
            return;
        }
        C7841 c78413 = new C7841(c78412);
        c78413.m20943(c7841);
        for (int m20947 = c78413.m20947(0); m20947 >= 0; m20947 = c78413.m20947(m20947 + 1)) {
            if (m20947 >= this.f4983) {
                this.f4970.f17317.m20936(m20947);
            } else if (!this.f4970.f17317.m20950(m20947)) {
                m4835(m20947);
            } else {
                this.f4970.f17317.m20936(m20947);
                C16181[] c16181Arr = this.f4989;
                if (m20947 < c16181Arr.length && (c16181 = c16181Arr[m20947]) != null && c16181.m38118()) {
                    C16181 c161812 = this.f4989[m20947];
                    char m4816 = (char) (m4816() - c161812.m38119().f27648);
                    if (m4816 >= 65535) {
                        C9127 m38119 = c161812.m38119();
                        if (m38119 != null) {
                            c161812.f49838.remove(m38119);
                        }
                    } else {
                        this.f4989[m20947] = new C16181(c161812.f49840);
                        if (!c161812.m38118() || m4816 <= 0) {
                            C9127 m381192 = c161812.m38119();
                            if (m381192 != null) {
                                c161812.f49838.remove(m381192);
                            }
                        } else {
                            C9127 m381193 = c161812.m38119();
                            if (m381193 != null && m381193.f27647 == 65535) {
                                m381193.f27647 = m4816;
                            }
                        }
                        m4813(c161812);
                        m4792(c161812);
                    }
                }
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m4835(int i) {
        C16181 c16181 = this.f4989[i];
        if (c16181 == null) {
            this.f4970.f17317.m20936(i);
            return;
        }
        this.f4970.f17317.m20945(i);
        int i2 = this.f4987;
        if (i2 < 65535) {
            char c = (char) i2;
            if (!c16181.f49838.isEmpty() && c16181.m38119().f27647 == 65535) {
                return;
            }
            List list = c16181.f49838;
            C9127 c9127 = new C9127();
            c9127.f27647 = (char) 65535;
            c9127.f27648 = c;
            list.add(c9127);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m4792(final C16181 c16181) {
        C12048 c12048 = c16181.f49840;
        if (c12048 == null || c12048.m29423() || !c12048.m16107()) {
            return;
        }
        C9127[] c9127Arr = (C9127[]) C5378.stream(c16181.f49838).filter(new C18299()).toArray(new C17593());
        if (c9127Arr.length == 0) {
            return;
        }
        int[] array = C22311.stream(c9127Arr).mapToInt(new C14770()).toArray();
        int[] array2 = C22311.stream(c9127Arr).mapToInt(new C23943()).toArray();
        int[] array3 = C22311.stream(c9127Arr).mapToInt(new ToIntFunction() { // from class: l.ۜ᩷۠
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return C16181.this.f49839;
            }
        }).toArray();
        Iterator it = c12048.mo16081().iterator();
        while (it.hasNext()) {
            C9953 c9953 = ((C6507) it.next()).f50415;
            c9953.f30047 = m4785(c9953.f30047, array);
            c9953.f30057 = m4785(c9953.f30057, array2);
            c9953.f30051 = m4785(c9953.f30051, array3);
            c9953.f30055 = true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m4785(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length == 0) {
            return iArr2;
        }
        int[] iArr3 = new int[iArr.length + iArr2.length];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4813(C16181 c16181) {
        C12048 c12048 = c16181.f49840;
        if (this.f4964 || (c12048.m29423() && c12048.m16107())) {
            if ((c12048.f17563 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF) == 0 || !((c12048.f17561.mo16084() & 562949953421312L) == 0 || (c12048.f17563 & 8589934592L) == 0)) {
                C16181[] c16181Arr = this.f4981;
                if (c16181Arr == null) {
                    this.f4981 = new C16181[20];
                } else {
                    this.f4981 = (C16181[]) C6322.m17575(this.f4972, c16181Arr);
                }
                C16181[] c16181Arr2 = this.f4981;
                int i = this.f4972;
                this.f4972 = i + 1;
                c16181Arr2[i] = c16181;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m4799(C12048 c12048) {
        int m4782 = m4782(c12048.mo16091(this.f4994));
        int i = this.f4983;
        int m4796 = m4796(m4782) + i;
        this.f4983 = m4796;
        if (m4796 > this.f4961) {
            this.f4961 = m4796;
        }
        c12048.f36038 = i;
        C16181[] c16181Arr = (C16181[]) C6322.m17575(i + 1, this.f4989);
        this.f4989 = c16181Arr;
        C12171.m29644(c16181Arr[i]);
        if (this.f4992 != null) {
            m4832();
        }
        this.f4989[i] = new C16181(c12048);
        this.f4970.f17317.m20936(i);
        return i;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m4827(int i) {
        char m4816;
        int i2 = this.f4983;
        this.f4983 = i;
        while (i < i2) {
            C16181 c16181 = this.f4989[i];
            if (c16181 != null) {
                if (c16181.m38118() && (m4816 = (char) (m4816() - c16181.m38119().f27648)) < 65535) {
                    if (!c16181.m38118() || m4816 <= 0) {
                        C9127 m38119 = c16181.m38119();
                        if (m38119 != null) {
                            c16181.f49838.remove(m38119);
                        }
                    } else {
                        C9127 m381192 = c16181.m38119();
                        if (m381192 != null && m381192.f27647 == 65535) {
                            m381192.f27647 = m4816;
                        }
                    }
                    m4813(c16181);
                    m4792(c16181);
                }
                this.f4989[i] = null;
            }
            this.f4970.f17317.m20936(i);
            i++;
        }
    }
}

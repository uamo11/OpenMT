package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.IOException;
import java.nio.file.ClosedFileSystemException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.bouncycastle.crypto.digests.SkeinEngine;
import org.bouncycastle.crypto.prng.X931RNG;

/* compiled from: Z5U8 */
/* renamed from: l.᩶ۜ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20002 {

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f64744 = new C4314();

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C22364 f64746;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f64747;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f64749;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int[] f64750;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f64751;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0245[] f64752;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f64753;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f64754;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C6319 f64756;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f64758;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2002 f64759;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC5973 f64762;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f64763;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public int f64764;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C2363 f64765;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C23168 f64766;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C20085 f64767;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f64768;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f64769;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C20661 f64770;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f64771;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5931 f64772;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f64773;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public byte[] f64774;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public HashMap f64775;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f64776;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C13395 f64777;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C2609 f64779;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f64781;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public AbstractC14016 f64783;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2609 f64784;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6136 f64785;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f64786;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C2363 f64788;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C2609 f64745 = C2609.m8239();

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C2609 f64780 = C2609.m8239();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public InterfaceC18278 f64755 = null;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public AbstractC5698 f64760 = null;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C0052 f64782 = null;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C14896 f64787 = new C14896(65520);

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public HashSet f64761 = new HashSet();

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f64748 = false;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public byte[] f64778 = new byte[0];

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f64757 = 0;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C20002 m46105(C2903 c2903) {
        C20002 c20002 = (C20002) c2903.m8838(f64744);
        return c20002 == null ? new C20002(c2903) : c20002;
    }

    public C20002(C2903 c2903) {
        EnumC6596 enumC6596 = EnumC6596.CLASS;
        EnumSet of = EnumSet.of(enumC6596);
        EnumC6596 enumC65962 = EnumC6596.MEMBER;
        EnumSet of2 = EnumSet.of(enumC65962);
        EnumSet of3 = EnumSet.of(enumC6596, enumC65962);
        this.f64775 = new HashMap();
        this.f64754 = false;
        this.f64784 = C2609.m8239();
        this.f64779 = C2609.m8239();
        this.f64751 = false;
        c2903.m8841(f64744, this);
        this.f64777 = C13395.m32391(c2903);
        C6136 m17057 = C6136.m17057(c2903);
        this.f64785 = m17057;
        C20661 m47250 = C20661.m47250(c2903);
        this.f64770 = m47250;
        this.f64756 = C6319.m17456(c2903);
        InterfaceC11223 interfaceC11223 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        this.f64749 = interfaceC11223;
        if (interfaceC11223 == null) {
            throw new AssertionError("FileManager initialization error");
        }
        this.f64772 = C5931.m16615(c2903);
        this.f64759 = C2002.m6532(c2903);
        this.f64746 = C22364.m50099(c2903);
        C11781 m28823 = C11781.m28823(c2903);
        m28823.m28832(EnumC0121.f1141);
        EnumC16280 m38301 = EnumC16280.m38301(c2903);
        this.f64766 = C23168.m51341(c2903);
        this.f64747 = EnumC10637.f32009.m26686(m38301);
        this.f64763 = EnumC10637.f32007.m26686(m38301);
        this.f64773 = EnumC10637.f31988.m26686(m38301);
        this.f64786 = m28823.m28832(EnumC0121.f1190);
        this.f64762 = EnumC5973.m16741(c2903);
        this.f64783 = AbstractC14016.m33607(m47250.f66475);
        this.f64753 = C4824.m14050(c2903).m14055(EnumC20347.CLASSFILE);
        AbstractC10370 abstractC10370 = m17057.f18826;
        EnumC16970 enumC16970 = EnumC16970.V45_3;
        C6387 c6387 = new C6387(this, abstractC10370, enumC16970, of2);
        C12032 c12032 = new C12032(this, m17057.f18792, enumC16970, of2);
        C23320 c23320 = new C23320(this, m17057.f18800, enumC16970, of3);
        C14147 c14147 = new C14147(this, m17057.f18780, enumC16970, of3);
        C7798 c7798 = new C7798(this, m17057.f18784, enumC16970, of);
        C1657 c1657 = new C1657(this, m17057.f18893, enumC16970, of3);
        C10830 c10830 = new C10830(this, m17057.f18862, enumC16970, of);
        C16473 c16473 = new C16473(this, m17057.f18882, enumC16970, of3);
        AbstractC10370 abstractC103702 = m17057.f18877;
        EnumC16970 enumC169702 = EnumC16970.V49;
        C21205 c21205 = new C21205(this, abstractC103702, enumC169702, of);
        C9916 c9916 = new C9916(this, m17057.f18827, enumC169702, of3);
        C9210 c9210 = new C9210(this, m17057.f18865, enumC169702, of3);
        C16264 c16264 = new C16264(this, m17057.f18874, enumC169702, of3);
        C2860 c2860 = new C2860(this, m17057.f18870, enumC169702, of3);
        C4271 c4271 = new C4271(this, m17057.f18905, enumC169702, of3);
        C19088 c19088 = new C19088(this, m17057.f18816, enumC169702, of3);
        C19794 c19794 = new C19794(this, m17057.f18837, enumC169702, of3);
        C0742 c0742 = new C0742(this, m17057.f18904, enumC169702, of2);
        C5682 c5682 = new C5682(this, m17057.f18881, enumC169702, of3);
        C8504 c8504 = new C8504(this, m17057.f18858, enumC169702, of3);
        AbstractC10370 abstractC103703 = m17057.f18890;
        EnumC16970 enumC169703 = EnumC16970.V52;
        C15558 c15558 = new C15558(this, abstractC103703, enumC169703, of3);
        C21910 c21910 = new C21910(this, m17057.f18854, enumC169703, of3);
        C22615 c22615 = new C22615(this, m17057.f18847, enumC169703, of2);
        AbstractC10370 abstractC103704 = m17057.f18844;
        EnumC16970 enumC169704 = EnumC16970.V53;
        AbstractC20708[] abstractC20708Arr = {c6387, c12032, c23320, c14147, c7798, c1657, c10830, c16473, c21205, c9916, c9210, c16264, c2860, c4271, c19088, c19794, c0742, c5682, c8504, c15558, c21910, c22615, new C4976(this, abstractC103704, enumC169704, of), new C3565(this, m17057.f18834, enumC169704, of), new C13442(this, m17057.f18866, EnumC16970.V58, of), new C12737(this, m17057.f18819, EnumC16970.V59, of)};
        for (int i = 0; i < 26; i++) {
            AbstractC20708 abstractC20708 = abstractC20708Arr[i];
            this.f64775.put(abstractC20708.f66693, abstractC20708);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46107(C14163 c14163, AbstractC5698 abstractC5698) {
        if ((abstractC5698.f17563 & 2147487744L) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF || abstractC5698.f17562.m26176(this.f64785.f18806)) {
            c14163.f42762.mo26382(abstractC5698);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21325 m46116(String str, Object... objArr) {
        return new C21325(this.f64760.m16071(), this.f64755, this.f64772.m16622(str, objArr), this.f64772, this.f64759);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char m46124() {
        char m35354 = this.f64787.m35354(this.f64769);
        this.f64769 += 2;
        return m35354;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m46112() {
        int i = this.f64769;
        this.f64769 = i + 1;
        return this.f64787.f45448[i] & 255;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m46128() {
        int m35353 = this.f64787.m35353(this.f64769);
        this.f64769 += 4;
        return m35353;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m46135() {
        AbstractC4308 mo16091;
        byte[] bArr;
        int i;
        byte[] bArr2 = this.f64774;
        int i2 = this.f64776;
        byte b = bArr2[i2];
        char c = (char) b;
        C20661 c20661 = this.f64770;
        if (c == '(') {
            this.f64776 = i2 + 1;
            C2609 m46113 = m46113(')');
            AbstractC4308 m46135 = m46135();
            C2609 m8239 = C2609.m8239();
            while (true) {
                int i3 = this.f64776;
                if (i3 >= this.f64764 || this.f64774[i3] != 94) {
                    break;
                }
                this.f64776 = i3 + 1;
                m8239 = m8239.m8246(m46135());
            }
            for (C2609 c2609 = m8239; c2609.m8249(); c2609 = c2609.f8241) {
                if (((AbstractC4308) c2609.f8240).m12913(EnumC9454.TYPEVAR)) {
                    ((AbstractC4308) c2609.f8240).f13890.f17563 |= 140737488355328L;
                }
            }
            return new C10658(m46113, m46135, m8239.m8250(), c20661.f66481);
        }
        if (c == '-') {
            this.f64776 = i2 + 1;
            return new C19831(m46135(), EnumC15678.SUPER, c20661.f66480);
        }
        if (c == '<') {
            this.f64783 = this.f64783.mo26380(this.f64760);
            C10077 c10077 = new C10077(m46135(), m46134());
            this.f64783 = this.f64783.mo26377();
            return c10077;
        }
        if (c == 'F') {
            this.f64776 = i2 + 1;
            return c20661.f66483;
        }
        C6136 c6136 = this.f64785;
        if (c != 'L') {
            if (c == 'V') {
                this.f64776 = i2 + 1;
                return c20661.f66501;
            }
            if (c == '*') {
                this.f64776 = i2 + 1;
                return new C19831(c20661.f66526, EnumC15678.UNBOUND, c20661.f66480);
            }
            if (c == '+') {
                this.f64776 = i2 + 1;
                return new C19831(m46135(), EnumC15678.EXTENDS, c20661.f66480);
            }
            if (c == 'I') {
                this.f64776 = i2 + 1;
                return c20661.f66452;
            }
            if (c == 'J') {
                this.f64776 = i2 + 1;
                return c20661.f66470;
            }
            if (c == 'S') {
                this.f64776 = i2 + 1;
                return c20661.f66513;
            }
            if (c == 'T') {
                int i4 = i2 + 1;
                this.f64776 = i4;
                while (true) {
                    bArr = this.f64774;
                    i = this.f64776;
                    if (bArr[i] == 59) {
                        break;
                    }
                    this.f64776 = i + 1;
                }
                this.f64776 = i + 1;
                return this.f64748 ? AbstractC4308.f13885 : m46115(c6136.f18880.mo15926(i4, i - i4, bArr));
            }
            if (c == 'Z') {
                this.f64776 = i2 + 1;
                return c20661.f66469;
            }
            if (c == '[') {
                this.f64776 = i2 + 1;
                return new C5138(m46135(), c20661.f66505);
            }
            switch (c) {
                case 'B':
                    this.f64776 = i2 + 1;
                    return c20661.f66502;
                case 'C':
                    this.f64776 = i2 + 1;
                    return c20661.f66454;
                case 'D':
                    this.f64776 = i2 + 1;
                    return c20661.f66499;
                default:
                    throw m46116("bad.signature", C12780.m31089(i2, 10, bArr2));
            }
        }
        if (b != 76) {
            throw m46116("bad.class.signature", C12780.m31089(i2, 10, bArr2));
        }
        this.f64776 = i2 + 1;
        AbstractC4308 abstractC4308 = AbstractC4308.f13885;
        int i5 = this.f64757;
        while (true) {
            byte[] bArr3 = this.f64774;
            int i6 = this.f64776;
            this.f64776 = i6 + 1;
            byte b2 = bArr3[i6];
            if (b2 == 46) {
                if (abstractC4308 != AbstractC4308.f13885) {
                    abstractC4308 = new C19955(c20661.m47260(this.f64782, c6136.f18880.mo15926(i5, this.f64757 - i5, this.f64778)), abstractC4308, C2609.m8239());
                }
                byte[] bArr4 = this.f64778;
                int i7 = this.f64757;
                this.f64757 = i7 + 1;
                bArr4[i7] = 36;
            } else if (b2 == 47) {
                byte[] bArr5 = this.f64778;
                int i8 = this.f64757;
                this.f64757 = i8 + 1;
                bArr5[i8] = 46;
            } else if (b2 == 59) {
                C14163 m47260 = c20661.m47260(this.f64782, c6136.f18880.mo15926(i5, this.f64757 - i5, this.f64778));
                try {
                    mo16091 = abstractC4308 == AbstractC4308.f13885 ? m47260.mo16091(this.f64756) : new C19955(m47260, abstractC4308, C2609.m8239());
                } finally {
                    this.f64757 = i5;
                }
            } else if (b2 != 60) {
                byte[] bArr6 = this.f64778;
                int i9 = this.f64757;
                this.f64757 = i9 + 1;
                bArr6[i9] = b2;
            } else {
                mo16091 = new C1448(this, abstractC4308, m46113('>'), c20661.m47260(this.f64782, c6136.f18880.mo15926(i5, this.f64757 - i5, this.f64778)));
                byte[] bArr7 = this.f64774;
                int i10 = this.f64776;
                int i11 = i10 + 1;
                this.f64776 = i11;
                byte b3 = bArr7[i10];
                if (b3 == 46) {
                    byte[] bArr8 = this.f64778;
                    int i12 = this.f64757;
                    this.f64757 = i12 + 1;
                    bArr8[i12] = 36;
                } else {
                    if (b3 != 59) {
                        throw new AssertionError((int) this.f64774[this.f64776 - 1]);
                    }
                    if (i11 >= this.f64764 || bArr7[i11] != 46) {
                        break;
                    }
                    int i13 = this.f64757;
                    this.f64776 = (i13 - i5) + 3 + i11;
                    byte[] bArr9 = this.f64778;
                    this.f64757 = i13 + 1;
                    bArr9[i13] = 36;
                }
                abstractC4308 = mo16091;
            }
        }
        int i14 = this.f64776;
        if (i14 >= this.f64764 || this.f64774[i14] != 46) {
            return mo16091;
        }
        throw m46116("deprecated inner class signature syntax (please recompile from source)", new Object[0]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m46113(char c) {
        C2609 of = C2609.of((Object) null);
        C2609 c2609 = of;
        while (true) {
            byte[] bArr = this.f64774;
            int i = this.f64776;
            if (bArr[i] != c) {
                c2609 = c2609.mo8251(C2609.of((Object) m46135()));
            } else {
                this.f64776 = i + 1;
                return of.f8241;
            }
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C2609 m46134() {
        int i;
        C2609 m8239 = C2609.m8239();
        byte[] bArr = this.f64774;
        int i2 = this.f64776;
        if (bArr[i2] == 60) {
            int i3 = i2 + 1;
            this.f64776 = i3;
            this.f64748 = true;
            while (this.f64774[this.f64776] != 62) {
                m8239 = m8239.m8246(m46122());
            }
            this.f64748 = false;
            this.f64776 = i3;
            while (true) {
                byte[] bArr2 = this.f64774;
                i = this.f64776;
                if (bArr2[i] == 62) {
                    break;
                }
                m46122();
            }
            this.f64776 = i + 1;
        }
        return m8239.m8250();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[LOOP:1: B:15:0x004e->B:17:0x0056, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[EDGE_INSN: B:18:0x0063->B:19:0x0063 BREAK  A[LOOP:1: B:15:0x004e->B:17:0x0056], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C8541 m46122() {
        /*
            r6 = this;
            int r0 = r6.f64776
        L2:
            byte[] r1 = r6.f64774
            int r2 = r6.f64776
            r3 = r1[r2]
            r4 = 58
            if (r3 == r4) goto L11
            int r2 = r2 + 1
            r6.f64776 = r2
            goto L2
        L11:
            int r2 = r2 - r0
            l.ۛܶ۠ r3 = r6.f64785
            l.۫ܶ۠ r3 = r3.f18880
            l.ۤܶ۠ r0 = r3.mo15926(r0, r2, r1)
            boolean r1 = r6.f64748
            if (r1 == 0) goto L31
            l.ۡ֨֨ r1 = new l.ۡ֨֨
            l.ۛ֡֨ r2 = r6.f64760
            l.᩷ۚ֨ r3 = r6.f64770
            l.ۙ֨֨ r3 = r3.f66522
            r1.<init>(r2, r3, r0)
            l.ܰ᩵֨ r0 = r6.f64783
            l.᩶֡֨ r2 = r1.f13890
            r0.mo26382(r2)
            goto L38
        L31:
            l.ۙ֨֨ r0 = r6.m46115(r0)
            r1 = r0
            l.ۡ֨֨ r1 = (l.C8541) r1
        L38:
            l.ۖܶ۠ r0 = l.C2609.m8239()
            byte[] r2 = r6.f64774
            int r3 = r6.f64776
            r5 = r2[r3]
            if (r5 != r4) goto L4d
            r5 = 1
            int r3 = r3 + r5
            r2 = r2[r3]
            if (r2 != r4) goto L4d
            r6.f64776 = r3
            goto L4e
        L4d:
            r5 = 0
        L4e:
            byte[] r2 = r6.f64774
            int r3 = r6.f64776
            r2 = r2[r3]
            if (r2 != r4) goto L63
            int r3 = r3 + 1
            r6.f64776 = r3
            l.ۙ֨֨ r2 = r6.m46135()
            l.ۖܶ۠ r0 = r0.m8246(r2)
            goto L4e
        L63:
            boolean r2 = r6.f64748
            if (r2 != 0) goto L70
            l.ۛ᩸֨ r2 = r6.f64756
            l.ۖܶ۠ r0 = r0.m8250()
            r2.m17501(r1, r0, r5)
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C20002.m46122():l.ۡ֨֨");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m46115(AbstractC10370 abstractC10370) {
        AbstractC5698 mo20478 = this.f64783.mo20478(abstractC10370, (Predicate) null);
        if (mo20478 != null) {
            return mo20478.f17560;
        }
        if (this.f64754) {
            C8541 c8541 = new C8541(this.f64760, this.f64770.f66522, abstractC10370);
            this.f64784 = this.f64784.m8246(c8541);
            return c8541;
        }
        throw m46116("undecl.type.var", abstractC10370);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m46133(AbstractC5698 abstractC5698) {
        char charAt;
        abstractC5698.f17561.mo16064().mo26384(abstractC5698);
        C14163 c14163 = (C14163) abstractC5698;
        C14163 m46280 = this.f64767.m46280(m46124());
        char m46124 = m46124();
        final C20085 c20085 = this.f64767;
        C11003.requireNonNull(c20085);
        C15144 c15144 = (C15144) m46103(m46124, new IntFunction() { // from class: l.ۜ᩻۠
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return C20085.this.m46286(i);
            }
        }, (Object) null);
        AbstractC7667 abstractC7667 = m46280.f42762;
        int i = 1;
        if (abstractC7667 == null || m46280.f17559 != EnumC1296.f4582) {
            throw m46116("bad.enclosing.class", c14163, m46280);
        }
        c14163.mo16101();
        C3581 m46104 = m46104(c15144, abstractC7667, c14163.f17563);
        if (c15144 != null && m46104 == null) {
            C14163 m16071 = this.f64760.m16071();
            InterfaceC18278 interfaceC18278 = this.f64755;
            C11576 c11576 = C11886.f35440;
            throw new C22030(m16071, interfaceC18278, this.f64772.m16617(new C11576("compiler", "bad.enclosing.method", c14163)), this.f64772, this.f64759);
        }
        AbstractC10370 abstractC10370 = c14163.f42771;
        AbstractC10370 abstractC103702 = m46280.f42771;
        if (!abstractC10370.m26176(abstractC103702)) {
            throw m46116("bad.enclosing.method", abstractC10370);
        }
        String substring = abstractC10370.toString().substring(abstractC103702.toString().length());
        if (substring.length() < 1 || substring.charAt(0) != '$') {
            throw m46116("bad.enclosing.method", abstractC10370);
        }
        while (i < substring.length() && '0' <= (charAt = substring.charAt(i)) && charAt <= '9') {
            i++;
        }
        String substring2 = substring.substring(i);
        C6136 c6136 = this.f64785;
        AbstractC10370 m30652 = c6136.f18880.m30652(substring2);
        c14163.f17562 = m30652;
        c14163.f17561 = m46104 != null ? m46104 : m46280;
        if (m30652.isEmpty()) {
            c14163.f42767 = c6136.f18867;
        } else {
            c14163.f42767 = AbstractC19810.m45553(c14163.f17562, c14163.f17561);
        }
        if (m46104 != null) {
            ((C19955) abstractC5698.f17560).mo4959(m46104.f17560);
        } else if ((c14163.f17563 & 8) == 0) {
            ((C19955) abstractC5698.f17560).mo4959(m46280.f17560);
        } else {
            ((C19955) abstractC5698.f17560).mo4959(AbstractC4308.f13885);
        }
        m46118(c14163, c14163.f17560);
        if (!this.f64784.isEmpty()) {
            C18837 c18837 = new C18837();
            Iterator it = this.f64784.iterator();
            while (it.hasNext()) {
                c18837.m43511(m46115(((AbstractC4308) it.next()).f13890.f17562));
            }
            this.f64779 = c18837.m43517();
            return;
        }
        this.f64779 = C2609.m8239();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C3581 m46104(C15144 c15144, AbstractC7667 abstractC7667, long j) {
        if (c15144 == null) {
            return null;
        }
        AbstractC10370 abstractC10370 = c15144.f46278;
        AbstractC4308 abstractC4308 = c15144.f46279;
        C10658 mo12945 = abstractC4308.mo12945();
        for (AbstractC5698 abstractC5698 : abstractC7667.m20476(abstractC10370)) {
            if (abstractC5698.f17559 == EnumC1296.f4571) {
                C10658 mo129452 = abstractC5698.f17560.mo12945();
                C2609 c2609 = mo129452.f32059;
                C6319 c6319 = this.f64756;
                C2609 m8246 = c6319.m17520(c2609).m8246(c6319.m17519(mo129452.f32060));
                C2609 m82462 = mo12945.f32059.m8246(mo12945.f32060);
                while (!m8246.isEmpty() && !m82462.isEmpty()) {
                    if (((AbstractC4308) m8246.f8240).f13890 != ((AbstractC4308) m82462.f8240).f13890) {
                        break;
                    }
                    m8246 = m8246.f8241;
                    m82462 = m82462.f8241;
                }
                if (m8246.isEmpty() && m82462.isEmpty()) {
                    return (C3581) abstractC5698;
                }
            }
        }
        if (abstractC10370 == this.f64785.f18879 && (512 & j) == 0 && !abstractC4308.mo12933().isEmpty()) {
            return m46104(new C15144(abstractC10370, new C10658(abstractC4308.mo12933().f8241, abstractC4308.mo12923(), abstractC4308.mo12930(), this.f64770.f66481)), abstractC7667, j);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46119(AbstractC5698 abstractC5698, EnumC6596 enumC6596) {
        char m46124 = m46124();
        for (int i = 0; i < m46124; i++) {
            AbstractC10370 m46287 = this.f64767.m46287(m46124());
            int m46128 = m46128();
            AbstractC20708 abstractC20708 = (AbstractC20708) this.f64775.get(m46287);
            if (abstractC20708 != null && abstractC20708.mo10868(enumC6596)) {
                abstractC20708.mo2858(m46128, abstractC5698);
            } else {
                this.f64769 += m46128;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46125(AbstractC5698 abstractC5698) {
        char m46124 = m46124();
        C18837 c18837 = new C18837();
        for (int i = 0; i < m46124; i++) {
            c18837.m43511(m46130());
        }
        C2609 m43517 = c18837.m43517();
        if (m43517.isEmpty()) {
            return;
        }
        C18837 c188372 = new C18837();
        Iterator it = m43517.iterator();
        while (it.hasNext()) {
            C2363 c2363 = (C2363) it.next();
            AbstractC4308 abstractC4308 = c2363.f26338;
            AbstractC10370 mo16083 = abstractC4308.f13890.mo16083();
            C20661 c20661 = this.f64770;
            if (mo16083 == c20661.f66468.f13890.mo16083()) {
                abstractC5698.f17563 |= 274877906944L;
            } else {
                AbstractC10370 mo160832 = abstractC4308.f13890.mo16083();
                AbstractC10370 mo160833 = c20661.f66484.f13890.mo16083();
                C6136 c6136 = this.f64785;
                if (mo160832 == mo160833) {
                    EnumC5973 enumC5973 = EnumC5973.f18321;
                    EnumC5973 enumC59732 = this.f64762;
                    if (enumC59732 != enumC5973) {
                        Iterator it2 = c2363.f7553.iterator();
                        while (it2.hasNext()) {
                            C23069 c23069 = (C23069) it2.next();
                            if (c23069.f74207 == c6136.f18860) {
                                Object obj = c23069.f74208;
                                if (obj instanceof C17796) {
                                    C17796 c17796 = (C17796) obj;
                                    if (c17796.f26338 == c20661.f66452 && ((Integer) c17796.f54417).intValue() > enumC59732.f18324) {
                                        abstractC5698.f17563 |= 35184372088832L;
                                    }
                                }
                            }
                        }
                    }
                } else if (abstractC4308.f13890.mo16083() == c20661.f66493.f13890.mo16083()) {
                    abstractC5698.f17563 |= 72057594037927936L;
                    m46106(c2363, abstractC5698, c6136.f18892, 288230376151711744L);
                } else if (abstractC4308.f13890.mo16083() == c20661.f66466.f13890.mo16083()) {
                    C12171.m29642(abstractC5698.f17559 == EnumC1296.f4582);
                    abstractC5698.f17563 |= 9007199254740992L;
                } else {
                    AbstractC19810 abstractC19810 = abstractC4308.f13890;
                    if (abstractC19810 == c20661.f66451.f13890) {
                        this.f64788 = c2363;
                    } else if (abstractC19810 == c20661.f66530.f13890) {
                        this.f64765 = c2363;
                    } else if (abstractC19810 == c20661.f66448.f13890) {
                        abstractC5698.f17563 |= 18014398509613056L;
                        m46106(c2363, abstractC5698, c6136.f18832, 36028797018963968L);
                    } else if (abstractC19810 == c20661.f66491.f13890) {
                        abstractC5698.f17563 |= 72057594037927936L;
                        m46106(c2363, abstractC5698, c6136.f18892, 288230376151711744L);
                    } else if (abstractC19810 == c20661.f66450.f13890 && abstractC5698.f17559 == EnumC1296.f4582) {
                        abstractC5698.f17563 |= 9007199254740992L;
                    }
                    c188372.m43511(c2363);
                }
            }
        }
        this.f64777.m32405(new RunnableC17885(this, abstractC5698, c188372.m43517()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m46106(C2363 c2363, AbstractC5698 abstractC5698, AbstractC10370 abstractC10370, long j) {
        Iterator it = c2363.f7553.iterator();
        while (it.hasNext()) {
            C23069 c23069 = (C23069) it.next();
            if (c23069.f74207 == abstractC10370) {
                Object obj = c23069.f74208;
                if (obj instanceof C17796) {
                    C17796 c17796 = (C17796) obj;
                    if (c17796.f26338 == this.f64770.f66469 && ((Integer) c17796.f54417).intValue() != 0) {
                        abstractC5698.f17563 |= j;
                    }
                }
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m46131(AbstractC5698 abstractC5698) {
        int i = this.f64769;
        this.f64769 = i + 1;
        int i2 = this.f64787.f45448[i] & 255;
        C0245[] c0245Arr = this.f64752;
        if (c0245Arr == null) {
            this.f64752 = new C0245[i2];
        } else if (c0245Arr.length != i2) {
            throw m46116("bad.runtime.invisible.param.annotations", abstractC5698);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            C0245[] c0245Arr2 = this.f64752;
            if (c0245Arr2[i3] == null) {
                c0245Arr2[i3] = new C0245();
            }
            C0245 c0245 = c0245Arr2[i3];
            char m46124 = m46124();
            C18837 c18837 = new C18837();
            for (int i4 = 0; i4 < m46124; i4++) {
                c18837.m43511(m46130());
            }
            C2609 m43517 = c18837.m43517();
            C2609 c2609 = c0245.f1530;
            if (c2609 == null) {
                c0245.f1530 = m43517;
            } else {
                c0245.f1530 = c2609.m8248(m43517);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m46129(AbstractC5698 abstractC5698) {
        C9953 m25095;
        C9953 m25093;
        char m46124 = m46124();
        if (m46124 != 0) {
            C18837 c18837 = new C18837();
            for (int i = 0; i < m46124; i++) {
                int m46112 = m46112();
                if (!EnumC9372.m24190(m46112)) {
                    throw m46116("bad.type.annotation.value", String.format("0x%02X", Integer.valueOf(m46112)));
                }
                EnumC9372 m24189 = EnumC9372.m24189(m46112);
                switch (C10621.f31901[m24189.ordinal()]) {
                    case 1:
                        char m461242 = m46124();
                        m25095 = C9953.m25095(m46127(), null, -1);
                        m25095.f30056 = m461242;
                        break;
                    case 2:
                        char m461243 = m46124();
                        m25095 = C9953.m25097(m46127(), null, -1);
                        m25095.f30056 = m461243;
                        break;
                    case 3:
                        char m461244 = m46124();
                        m25095 = C9953.m25079(m46127(), null, -1);
                        m25095.f30056 = m461244;
                        break;
                    case 4:
                        char m461245 = m46124();
                        m25095 = C9953.m25099(m46127(), null, -1);
                        m25095.f30056 = m461245;
                        break;
                    case 5:
                        int m461246 = m46124();
                        int[] iArr = new int[m461246];
                        int[] iArr2 = new int[m461246];
                        int[] iArr3 = new int[m461246];
                        for (int i2 = 0; i2 < m461246; i2++) {
                            iArr[i2] = m46124();
                            iArr2[i2] = m46124();
                            iArr3[i2] = m46124();
                        }
                        m25093 = C9953.m25093(m46127(), null, -1);
                        m25093.f30047 = iArr;
                        m25093.f30057 = iArr2;
                        m25093.f30051 = iArr3;
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 6:
                        int m461247 = m46124();
                        int[] iArr4 = new int[m461247];
                        int[] iArr5 = new int[m461247];
                        int[] iArr6 = new int[m461247];
                        for (int i3 = 0; i3 < m461247; i3++) {
                            iArr4[i3] = m46124();
                            iArr5[i3] = m46124();
                            iArr6[i3] = m46124();
                        }
                        m25093 = C9953.m25084(m46127(), null, -1);
                        m25093.f30047 = iArr4;
                        m25093.f30057 = iArr5;
                        m25093.f30051 = iArr6;
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 7:
                        char m461248 = m46124();
                        m25095 = C9953.m25086(m46127(), null, -1);
                        m25095.m25102(m461248);
                        break;
                    case 8:
                        m25093 = C9953.m25089(m46127(), null, -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 9:
                        m25093 = C9953.m25085(m46127(), null, m46112(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 10:
                        m25093 = C9953.m25083(m46127(), null, m46112(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 11:
                        m25093 = C9953.m25088(m46127(), null, m46112(), m46112(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 12:
                        m25093 = C9953.m25081(m46127(), null, m46112(), m46112(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 13:
                        m25093 = C9953.m25080(m46127(), null, m46124(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 14:
                        m25093 = C9953.m25100(m46127(), null, m46124(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 15:
                        m25093 = C9953.m25094(m46127(), null, m46112(), -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 16:
                        char m461249 = m46124();
                        m25095 = C9953.m25098(m46127(), null, m46112(), -1);
                        m25095.f30056 = m461249;
                        break;
                    case 17:
                        char m4612410 = m46124();
                        m25095 = C9953.m25087(m46127(), null, m46112(), -1);
                        m25095.f30056 = m4612410;
                        break;
                    case 18:
                        char m4612411 = m46124();
                        m25095 = C9953.m25096(m46127(), null, m46112(), -1);
                        m25095.f30056 = m4612411;
                        break;
                    case 19:
                        char m4612412 = m46124();
                        m25095 = C9953.m25092(m46127(), null, m46112(), -1);
                        m25095.f30056 = m4612412;
                        break;
                    case 20:
                        char m4612413 = m46124();
                        m25095 = C9953.m25090(m46127(), null, m46112(), -1);
                        m25095.f30056 = m4612413;
                        break;
                    case 21:
                        m25093 = C9953.m25082(m46127(), null, -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 22:
                        m25093 = C9953.m25091(m46127(), null, -1);
                        continue;
                        c18837.m43511(new C21413(m46130(), m25093));
                    case 23:
                        throw new AssertionError("jvm.ClassReader: UNKNOWN target type should never occur!");
                    default:
                        throw new AssertionError("jvm.ClassReader: Unknown target type for position: " + m24189);
                }
                m25093 = m25095;
                c18837.m43511(new C21413(m46130(), m25093));
            }
            this.f64777.m32405(new C15061(this, abstractC5698, c18837.m43517()));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46117(AbstractC5698 abstractC5698) {
        C3581 c3581 = (C3581) abstractC5698;
        AbstractC8624 m46132 = m46132();
        c3581.f11370 = m46132;
        this.f64777.m32405(new RunnableC17179(this, c3581, m46132));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m46114(int i) {
        if (this.f64782.f911 == this.f64760) {
            return new C5185(this, i);
        }
        return this.f64767.m46288(i);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2363 m46130() {
        AbstractC4308 m46114;
        if (this.f64782.f911 != this.f64760) {
            m46114 = m46114((int) m46124());
        } else {
            m46114 = new C5185(this, m46124());
        }
        char m46124 = m46124();
        C18837 c18837 = new C18837();
        for (int i = 0; i < m46124; i++) {
            c18837.m43511(new C23069(this.f64767.m46287(m46124()), m46132()));
        }
        return new C2363(m46114, c18837.m43517());
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C2609 m46127() {
        C12774 c12774;
        int m46112 = m46112();
        C18837 c18837 = new C18837();
        for (int i = 0; i < m46112 * 2; i++) {
            c18837.m43511(Integer.valueOf(m46112()));
        }
        C2609 m43517 = c18837.m43517();
        C2609 c2609 = C9953.f30042;
        C18837 c188372 = new C18837();
        Iterator it = m43517.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C12171.m29642(it.hasNext());
            Integer num2 = (Integer) it.next();
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            C12774 c127742 = C12774.f38378;
            C12171.m29642(intValue2 == 0 || intValue == EnumC12069.TYPE_ARGUMENT.f36094);
            if (intValue == 0) {
                c12774 = C12774.f38378;
            } else if (intValue == 1) {
                c12774 = C12774.f38380;
            } else if (intValue == 2) {
                c12774 = C12774.f38379;
            } else {
                if (intValue != 3) {
                    C12171.m29640("Invalid TypePathEntryKind tag: " + intValue);
                    throw null;
                }
                c12774 = new C12774(EnumC12069.TYPE_ARGUMENT, intValue2);
            }
            c188372.m43511(c12774);
        }
        return c188372.m43517();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m46103(int i, IntFunction intFunction, Object obj) {
        return i == 0 ? obj : intFunction.apply(i);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC8624 m46132() {
        int i = this.f64769;
        this.f64769 = i + 1;
        char c = (char) this.f64787.f45448[i];
        if (c != '@') {
            C20661 c20661 = this.f64770;
            if (c == 'F') {
                return new C17796(this.f64767.m46281(m46124()), c20661.f66483);
            }
            if (c == 'S') {
                return new C17796(this.f64767.m46281(m46124()), c20661.f66513);
            }
            if (c == 'c') {
                AbstractC4308 m46114 = m46114((int) m46124());
                C9419 c9419 = new C9419(null);
                c9419.f28573 = m46114;
                return c9419;
            }
            if (c == 'e') {
                AbstractC4308 m461142 = m46114((int) m46124());
                AbstractC10370 m46287 = this.f64767.m46287(m46124());
                C3774 c3774 = new C3774(null);
                c3774.f11907 = m461142;
                c3774.f11908 = m46287;
                return c3774;
            }
            if (c == 's') {
                return new C17796(this.f64767.m46287(m46124()).toString(), c20661.f66533);
            }
            if (c == 'I') {
                return new C17796(this.f64767.m46281(m46124()), c20661.f66452);
            }
            if (c == 'J') {
                return new C17796(this.f64767.m46281(m46124()), c20661.f66470);
            }
            if (c == 'Z') {
                return new C17796(this.f64767.m46281(m46124()), c20661.f66469);
            }
            if (c != '[') {
                switch (c) {
                    case 'B':
                        return new C17796(this.f64767.m46281(m46124()), c20661.f66502);
                    case 'C':
                        return new C17796(this.f64767.m46281(m46124()), c20661.f66454);
                    case 'D':
                        return new C17796(this.f64767.m46281(m46124()), c20661.f66499);
                    default:
                        throw new AssertionError("unknown annotation tag '" + c + "'");
                }
            }
            char m46124 = m46124();
            C18837 c18837 = new C18837();
            for (int i2 = 0; i2 < m46124; i2++) {
                c18837.m43511(m46132());
            }
            C2609 m43517 = c18837.m43517();
            C23529 c23529 = new C23529(null);
            c23529.f75550 = m43517;
            return c23529;
        }
        return m46130();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46120(AbstractC10370 abstractC10370, AbstractC4308 abstractC4308) {
        if ((!abstractC4308.m12913(EnumC9454.METHOD) && !abstractC4308.m12913(EnumC9454.FORALL)) || (abstractC10370 == this.f64785.f18879 && !abstractC4308.mo12923().m12913(EnumC9454.VOID))) {
            throw m46116("method.descriptor.invalid", abstractC10370);
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m46123() {
        this.f64769 += 6;
        char m46124 = m46124();
        for (int i = 0; i < m46124; i++) {
            this.f64769 += 2;
            this.f64769 += m46128();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46118(AbstractC5698 abstractC5698, AbstractC4308 abstractC4308) {
        if (abstractC4308.mo4958() != null) {
            if (!abstractC4308.mo4958().m12913(EnumC9454.NONE)) {
                m46118(abstractC5698.f17561, abstractC4308.mo4958());
            }
        } else if (abstractC5698.f17559 == EnumC1296.f4571 && !abstractC5698.mo15572()) {
            AbstractC5698 abstractC56982 = abstractC5698.f17561;
            m46118(abstractC56982, abstractC56982.f17560);
        }
        for (C2609 mo12938 = abstractC4308.mo12938(); mo12938.m8249(); mo12938 = mo12938.f8241) {
            this.f64783.mo26382(((AbstractC4308) mo12938.f8240).f13890);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m46126(C14163 c14163) {
        char m46124 = m46124();
        for (int i = 0; i < m46124; i++) {
            m46124();
            char m461242 = m46124();
            char m461243 = m46124();
            final C20085 c20085 = this.f64767;
            C11003.requireNonNull(c20085);
            C14163 c141632 = (C14163) m46103(m461242, new IntFunction() { // from class: l.᩻᩻۠
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return C20085.this.m46280(i2);
                }
            }, (Object) null);
            C20085 c200852 = this.f64767;
            C11003.requireNonNull(c200852);
            C14853 c14853 = new C14853(c200852);
            C6136 c6136 = this.f64785;
            AbstractC10370 abstractC10370 = c6136.f18867;
            AbstractC10370 abstractC103702 = c6136.f18867;
            AbstractC10370 abstractC103703 = (AbstractC10370) m46103(m461243, c14853, abstractC10370);
            if (abstractC103703 == null) {
                abstractC103703 = abstractC103702;
            }
            long m461244 = m46124();
            if ((X931RNG.BLOCK64_RESEED_MAX & m461244) != 0) {
                m461244 = (m461244 & (-32769)) | 2251799813685248L;
            }
            long j = (-33) & m461244;
            if (c141632 != null) {
                if (abstractC103703 == abstractC103702) {
                    abstractC103703 = c6136.f18821;
                }
                C14163 m47261 = this.f64770.m47261(this.f64782, abstractC103703, c141632);
                if ((m461244 & 8) == 0) {
                    ((C19955) m47261.f17560).mo4959(c141632.f17560);
                    AbstractC4308 abstractC4308 = m47261.f17565;
                    if (abstractC4308 != null) {
                        ((C19955) abstractC4308).mo4959(this.f64756.m17519(c141632.f17560));
                    }
                }
                if (c14163 == c141632) {
                    m47261.f17563 = j;
                    m46107(c14163, m47261);
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m46111(C14163 c14163) {
        C6319 c6319;
        C3581 c3581;
        int i;
        AbstractC4308 abstractC4308;
        AbstractC4308 abstractC43082;
        AbstractC10370 m30652;
        AbstractC10370 abstractC10370;
        long j;
        C0245 c0245;
        C2609 c2609;
        int i2;
        int i3;
        boolean z;
        char c = 0;
        if (m46128() != -889275714) {
            throw m46116("illegal.start.of.class.file", new Object[0]);
        }
        this.f64771 = m46124();
        this.f64758 = m46124();
        int i4 = EnumC16970.m39797().f52075;
        int i5 = EnumC16970.m39797().f52076;
        int i6 = this.f64771;
        boolean z2 = i6 == 65535;
        int i7 = this.f64758;
        int i8 = 2;
        C22364 c22364 = this.f64746;
        if (i7 > i4 || (i7 * 1000) + i6 < (EnumC16970.m39798().f52075 * 1000) + EnumC16970.m39798().f52076) {
            int i9 = this.f64758;
            if (i9 != i4 + 1 || z2) {
                throw m46116("wrong.version", Integer.toString(i9), Integer.toString(this.f64771), Integer.toString(i4), Integer.toString(i5));
            }
            InterfaceC18278 interfaceC18278 = this.f64755;
            C11076 c11076 = C14001.f42334;
            c22364.m7275(new C11076("compiler", "big.major.version", interfaceC18278, Integer.valueOf(i9), Integer.valueOf(i4)));
        }
        if (z2) {
            C23168 c23168 = this.f64766;
            if (c23168.m51347()) {
                c23168.m51350(c14163.f42766, this.f64758);
            } else {
                c22364.m7276(c23168.m51343(this.f64755, this.f64758));
            }
        }
        C14896 c14896 = this.f64787;
        C6136 c6136 = this.f64785;
        C20661 c20661 = this.f64770;
        C20085 c20085 = new C20085(this, c14896, c6136, c20661);
        this.f64767 = c20085;
        int m46278 = c20085.m46278(c14896, this.f64769);
        this.f64769 = m46278;
        if (this.f64778.length < m46278) {
            this.f64778 = new byte[Integer.highestOneBit(m46278) << 1];
        }
        C19955 c19955 = (C19955) c14163.f17560;
        c14163.f42762 = AbstractC14016.m33607(c14163);
        this.f64783 = this.f64783.mo26380(this.f64760);
        if (c19955.mo4958().m12913(EnumC9454.CLASS)) {
            m46118(c14163.f17561, c19955.mo4958());
        }
        long m46124 = m46124();
        if ((X931RNG.BLOCK64_RESEED_MAX & m46124) != 0) {
            m46124 = (m46124 & (-32769)) | 2251799813685248L;
        }
        long j2 = (-33) & m46124;
        long j3 = m46124 & 2251799813685248L;
        if (j3 == 0) {
            EnumC1296 enumC1296 = c14163.f17561.f17559;
            if (enumC1296 == EnumC1296.f4579 || enumC1296 == EnumC1296.f4581) {
                c14163.f17563 = j2;
            }
            this.f64782 = c14163.m16089().f24147;
            C14163 m46280 = this.f64767.m46280(m46124());
            if (c14163 != m46280) {
                throw m46116("class.file.wrong.class", m46280.f42771);
            }
        } else {
            int i10 = this.f64758;
            if (i10 < EnumC16970.V53.f52075) {
                throw m46116("anachronistic.module.info", Integer.toString(i10), Integer.toString(this.f64771));
            }
            c14163.f17563 = j2;
            AbstractC5698 abstractC5698 = c14163.f17561;
            if (abstractC5698.f17559 != EnumC1296.f4568) {
                throw m46116("module.info.definition.expected", new Object[0]);
            }
            this.f64782 = (C0052) abstractC5698;
            m46124();
        }
        int i11 = this.f64769;
        m46124();
        this.f64769 = (m46124() * 2) + this.f64769;
        char m461242 = m46124();
        for (int i12 = 0; i12 < m461242; i12++) {
            m46123();
        }
        char m461243 = m46124();
        for (int i13 = 0; i13 < m461243; i13++) {
            m46123();
        }
        m46119(c14163, EnumC6596.CLASS);
        C2609 c26092 = c14163.f42765;
        if (c26092 != null && !c26092.isEmpty()) {
            c14163.f17563 |= SkeinEngine.UbiTweak.T1_FIRST;
        }
        this.f64769 = i11;
        char m461244 = m46124();
        if (j3 != 0 && m461244 > 0) {
            throw m46116("module.info.invalid.super.class", new Object[0]);
        }
        if (c19955.f64618 == null) {
            c19955.f64618 = (AbstractC4308) m46103(m461244, new IntFunction() { // from class: l.ܿ᩻۠
                @Override // java.util.function.IntFunction
                public final Object apply(int i14) {
                    C20002 c20002 = C20002.this;
                    return c20002.f64767.m46280(i14).mo16091(c20002.f64756);
                }
            }, AbstractC4308.f13885);
        }
        char m461245 = m46124();
        C2609 m8239 = C2609.m8239();
        int i14 = 0;
        while (true) {
            c6319 = this.f64756;
            if (i14 >= m461245) {
                break;
            }
            m8239 = m8239.m8246(this.f64767.m46280(m46124()).mo16091(c6319));
            i14++;
        }
        if (c19955.f64620 == null) {
            c19955.f64620 = m8239.m8250();
        }
        C12171.m29642(m461242 == m46124());
        for (int i15 = 0; i15 < m461242; i15++) {
            AbstractC5698 c12048 = new C12048(m46124(), this.f64767.m46287(m46124()), this.f64767.m46288(m46124()), this.f64760);
            m46119(c12048, EnumC6596.MEMBER);
            m46107(c14163, c12048);
        }
        C12171.m29642(m461243 == m46124());
        int i16 = 0;
        while (i16 < m461243) {
            long m461246 = m46124();
            if ((64 & m461246) != 0) {
                m461246 = (m461246 & (-65)) | 2147483648L;
            }
            if ((128 & m461246) != 0) {
                m461246 = (m461246 & (-129)) | 17179869184L;
            }
            AbstractC10370 m46287 = this.f64767.m46287(m46124());
            AbstractC4308 m46288 = this.f64767.m46288(m46124());
            if (this.f64760.m16070() && (m461246 & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0 && !m46287.equals(c6136.f18842)) {
                int i17 = this.f64758;
                EnumC16970 enumC16970 = EnumC16970.V52;
                int i18 = enumC16970.f52075;
                if (i17 <= i18 && (i17 != i18 || this.f64771 < enumC16970.f52076)) {
                    String str = (8 & m461246) == 0 ? "invalid.default.interface" : "invalid.static.interface";
                    Object num = Integer.toString(i17);
                    Object num2 = Integer.toString(this.f64771);
                    Object[] objArr = new Object[i8];
                    objArr[c] = num;
                    objArr[1] = num2;
                    throw m46116(str, objArr);
                }
                if ((10 & m461246) == 0) {
                    this.f64760.f17563 |= 8796093022208L;
                    m461246 |= 8796093023232L;
                }
            }
            m46120(m46287, m46288);
            if (m46287 == c6136.f18879 && this.f64760.m16087()) {
                AbstractC14016 mo16064 = this.f64760.f17561.mo16064();
                AbstractC5698 abstractC56982 = this.f64760;
                EnumC1317 enumC1317 = EnumC1317.NON_RECURSIVE;
                mo16064.getClass();
                boolean hasNext = mo16064.mo20477(abstractC56982.f17562, new C7646(abstractC56982), enumC1317).iterator().hasNext();
                if (!this.f64760.f17562.isEmpty() && hasNext) {
                    C2609 mo12933 = m46288.mo12933();
                    if (!mo12933.isEmpty()) {
                        if ((m461246 & 17179869184L) != 0) {
                            AbstractC4308 abstractC43083 = (AbstractC4308) mo12933.last();
                            C18837 c18837 = new C18837();
                            Iterator it = mo12933.iterator();
                            while (it.hasNext()) {
                                AbstractC4308 abstractC43084 = (AbstractC4308) it.next();
                                if (abstractC43084 == abstractC43083) {
                                    abstractC43084 = ((C5138) abstractC43084).m14698();
                                }
                                c18837.m43511(abstractC43084);
                            }
                            mo12933 = c18837.m43517();
                        }
                        mo12933 = mo12933.f8241;
                    }
                    m46288 = new C10658(mo12933, m46288.mo12923(), m46288.mo12930(), c20661.f66481);
                }
            }
            C3581 c35812 = new C3581(m461246, m46287, m46288, this.f64760);
            if (c6319.m17503(c35812)) {
                c35812.f17563 |= 70368744177664L;
            }
            if (this.f64786) {
                int m4781 = C1365.m4781(c35812.f17560.mo12933()) + 4;
                int[] iArr = this.f64750;
                if (iArr == null || iArr.length < m4781) {
                    this.f64750 = new int[m4781];
                    z = false;
                } else {
                    z = false;
                    Arrays.fill(iArr, 0);
                }
                this.f64768 = z;
            }
            AbstractC5698 abstractC56983 = this.f64760;
            this.f64760 = c35812;
            try {
                m46119(c35812, EnumC6596.MEMBER);
                this.f64760 = abstractC56983;
                m46120(m46287, c35812.f17560);
                if (this.f64768) {
                    i = 0;
                } else {
                    i = (c35812.f17563 & 8) == 0 ? 1 : 0;
                    if (c35812.f17562 == c6136.f18879 && this.f64760.m16087() && !this.f64760.f17562.isEmpty()) {
                        i++;
                    }
                    if (c35812.f17560 != m46288) {
                        i += C1365.m4781(m46288.mo12933()) - C1365.m4781(c35812.f17560.mo12933());
                    }
                }
                HashSet hashSet = new HashSet();
                C18837 c188372 = new C18837();
                Iterator it2 = c35812.f17560.mo12933().iterator();
                int i19 = 0;
                while (it2.hasNext()) {
                    AbstractC4308 abstractC43085 = (AbstractC4308) it2.next();
                    C20661 c206612 = c20661;
                    int[] iArr2 = this.f64781;
                    long j4 = 8589934592L;
                    char c2 = m461243;
                    if (iArr2 == null || i >= iArr2.length || (i3 = iArr2[i]) == 0) {
                        abstractC43082 = m46288;
                    } else {
                        abstractC43082 = m46288;
                        j4 = i3 | 8589934592L;
                    }
                    int[] iArr3 = this.f64750;
                    if (iArr3 == null || i >= iArr3.length || (i2 = iArr3[i]) == 0) {
                        String str2 = "arg";
                        while (true) {
                            StringBuilder m15339 = C5368.m15339(str2);
                            m15339.append(hashSet.size());
                            m30652 = c6136.f18880.m30652(m15339.toString());
                            if (!hashSet.contains(m30652)) {
                                break;
                            } else {
                                str2 = C16014.m37867(str2, "$");
                            }
                        }
                        abstractC10370 = m30652;
                        j = j4;
                    } else {
                        C20085 c200852 = this.f64767;
                        C11003.requireNonNull(c200852);
                        abstractC10370 = (AbstractC10370) m46103(i2, new C14853(c200852), c6136.f18867);
                        j = j4 | 4503599627370496L;
                    }
                    hashSet.add(abstractC10370);
                    C14869 c14869 = new C14869(j, abstractC10370, abstractC43085, c35812);
                    c188372.m43511(c14869);
                    C0245[] c0245Arr = this.f64752;
                    if (c0245Arr != null && (c0245 = c0245Arr[i19]) != null && (c2609 = c0245.f1530) != null && !c2609.isEmpty()) {
                        this.f64777.m32405(new RunnableC17885(this, c14869, c0245.f1530));
                    }
                    i += this.f64768 ? 1 : C1365.m4791(abstractC43085);
                    i19++;
                    c20661 = c206612;
                    m461243 = c2;
                    m46288 = abstractC43082;
                }
                C20661 c206613 = c20661;
                char c3 = m461243;
                AbstractC4308 abstractC43086 = m46288;
                C0245[] c0245Arr2 = this.f64752;
                if (c0245Arr2 != null && c0245Arr2.length != i19) {
                    throw m46116("bad.runtime.invisible.param.annotations", c35812);
                }
                C12171.m29644(c35812.f11367);
                c35812.f11367 = c188372.m43517();
                this.f64752 = null;
                this.f64750 = null;
                this.f64781 = null;
                if ((m461246 & 17179869184L) != 0 && ((abstractC4308 = (AbstractC4308) abstractC43086.mo12933().last()) == null || !abstractC4308.m12913(EnumC9454.ARRAY))) {
                    c35812.f17563 &= -17179869185L;
                    throw m46116("malformed.vararg.method", c35812);
                }
                m46107(c14163, c35812);
                i16++;
                c = 0;
                i8 = 2;
                c20661 = c206613;
                m461243 = c3;
            } catch (Throwable th) {
                this.f64760 = abstractC56983;
                throw th;
            }
        }
        if (c14163.m33810()) {
            Iterator it3 = c14163.m33811().iterator();
            while (it3.hasNext()) {
                C21221 c21221 = (C21221) it3.next();
                AbstractC10370 abstractC103702 = c21221.f17562;
                C2609 m82392 = C2609.m8239();
                c14163.mo16101();
                AbstractC14016 abstractC14016 = c14163.f42762;
                C17904 c17904 = new C17904(1);
                abstractC14016.getClass();
                Iterator it4 = abstractC14016.mo20477(abstractC103702, c17904, EnumC1317.RECURSIVE).iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        c3581 = null;
                        break;
                    }
                    AbstractC5698 abstractC56984 = (AbstractC5698) it4.next();
                    if (c6319.m17549(abstractC56984.f17560.mo12933(), m82392)) {
                        c3581 = (C3581) abstractC56984;
                        break;
                    }
                }
                c21221.f68391 = c3581;
            }
        }
        this.f64783 = this.f64783.mo26377();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46121(C14163 c14163) {
        C6319 c6319 = this.f64756;
        this.f64760 = c14163;
        this.f64755 = c14163.f42766;
        this.f64761.clear();
        this.f64751 = true;
        this.f64788 = null;
        this.f64765 = null;
        try {
            try {
                this.f64769 = 0;
                C14896 c14896 = this.f64787;
                c14896.f45449 = 0;
                c14896.m35350(c14163.f42766.mo20795());
                m46111(c14163);
                if (!this.f64784.isEmpty() && !this.f64779.isEmpty()) {
                    C2609 c2609 = this.f64784;
                    C2609 c26092 = this.f64779;
                    this.f64784 = C2609.m8239();
                    this.f64779 = C2609.m8239();
                    this.f64745 = C2609.m8239();
                    this.f64780 = C2609.m8239();
                    this.f64751 = false;
                    C19955 c19955 = (C19955) this.f64760.f17560;
                    c19955.f64618 = c6319.m17488(c19955.f64618, c2609, c26092);
                    c19955.f64620 = c6319.m17481(c19955.f64620, c2609, c26092);
                    C2609 m17521 = c6319.m17521(c19955.f64616, c2609, c26092);
                    c19955.f64616 = m17521;
                    while (m17521.m8249()) {
                        Object obj = m17521.f8240;
                        ((AbstractC4308) obj).f13890.f17560 = (AbstractC4308) obj;
                        m17521 = m17521.f8241;
                    }
                } else if (this.f64784.isEmpty() != this.f64779.isEmpty()) {
                    throw m46116("undecl.type.var", ((AbstractC4308) this.f64784.f8240).f13890.f17562);
                }
                if ((c14163.f17563 & 8192) != 0) {
                    c14163.m33805(new C21863(c14163, new C15767(this, c14163, this.f64788, this.f64765)));
                } else {
                    c14163.m33805(C21863.m49251());
                }
                if (c14163 == this.f64782.f911) {
                    if (!this.f64745.m8249() && !this.f64780.m8249()) {
                        this.f64782.f917 = C2609.m8239();
                        this.f64782.f925 = C2609.m8239();
                    }
                    C12171.m29642(this.f64782.f17564.mo7078());
                    C0052 c0052 = this.f64782;
                    c0052.f923 = new C22118(this, c0052, this.f64745, this.f64780);
                }
            } catch (IOException e) {
                e = e;
                throw m46116("unable.to.access.file", e.toString());
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw m46116("bad.class.file", c14163.f42771);
            } catch (ClosedFileSystemException e2) {
                e = e2;
                throw m46116("unable.to.access.file", e.toString());
            }
        } finally {
            this.f64745 = C2609.m8239();
            this.f64780 = C2609.m8239();
            this.f64784 = C2609.m8239();
            this.f64779 = C2609.m8239();
            this.f64751 = false;
        }
    }
}

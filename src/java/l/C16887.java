package l;

import com.google.android.material.motion.MotionUtils;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.umeng.commonsdk.statistics.b;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import moe.shizuku.server.IShizukuService;
import org.simpleframework.xml.transform.ClassTransform;

/* compiled from: M664 */
/* renamed from: l.ܽ᩷۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16887 extends C18382 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12323 f51824;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C23168 f51825;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C22364 f51827;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f51828;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f51830;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public EnumC10892 f51831;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f51832;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15240 f51834;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f51835;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C6319 f51836;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f51837;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f51839;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f51840;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6136 f51841;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C11781 f51842;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f51843;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f51844;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f51845;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C4314 f51823 = new C4314();

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String[] f51822 = {"PUBLIC", "PRIVATE", "PROTECTED", "STATIC", "FINAL", "SUPER", "VOLATILE", "TRANSIENT", "NATIVE", "INTERFACE", "ABSTRACT", "STRICTFP"};

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C2609 f51833 = C2609.m8239();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C14896 f51838 = new C14896(65520);

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C14896 f51829 = new C14896(131056);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12240 f51826 = new C12240(this);

    public C16887(C2903 c2903) {
        c2903.m8841(f51823, this);
        this.f51827 = C22364.m50099(c2903);
        this.f51841 = C6136.m17057(c2903);
        C11781 m28823 = C11781.m28823(c2903);
        this.f51842 = m28823;
        this.f51825 = C23168.m51341(c2903);
        this.f51831 = EnumC10892.m27201(c2903);
        EnumC16280.m38301(c2903);
        this.f51836 = C6319.m17456(c2903);
        this.f51834 = C15240.m36054(c2903);
        this.f51832 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        this.f51824 = C13359.m32330(c2903).f39972;
        this.f51844 = m28823.m28832(EnumC0121.f1141);
        this.f51837 = m28823.m28832(EnumC0121.f1191);
        this.f51840 = m28823.m28831("debug.stackmap");
        EnumC0121 enumC0121 = EnumC0121.f1202;
        this.f51843 = m28823.m28836(enumC0121) || m28823.m28829(enumC0121, "source");
        String m28824 = m28823.m28824("debug.dumpmodifiers");
        if (m28824 != null) {
            this.f51839 = m28824.indexOf(99) != -1;
            this.f51835 = m28824.indexOf(IShizukuService.Stub.TRANSACTION_attachUserService) != -1;
            this.f51845 = m28824.indexOf(IShizukuService.Stub.TRANSACTION_dispatchPermissionConfirmationResult) != -1;
            this.f51830 = m28824.indexOf(109) != -1;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C16887 m39694(C2903 c2903) {
        C16887 c16887 = (C16887) c2903.m8838(f51823);
        return c16887 == null ? new C16887(c2903) : c16887;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m39700(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j & 4095;
        int i = 0;
        while (j2 != 0) {
            if ((1 & j2) != 0) {
                sb.append(" ");
                sb.append(f51822[i]);
            }
            j2 >>= 1;
            i++;
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39709(int i, int i2) {
        byte[] bArr = this.f51838.f45448;
        bArr[i - 2] = (byte) ((i2 >> 8) & 255);
        bArr[i - 1] = (byte) (i2 & 255);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m39715(AbstractC10370 abstractC10370) {
        int m31613 = C13028.m31613(this.f51824.f36883, abstractC10370);
        C14896 c14896 = this.f51838;
        c14896.m35351(m31613);
        c14896.m35352(0);
        return c14896.f45449;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39708(int i) {
        C14896 c14896 = this.f51838;
        int i2 = c14896.f45449 - i;
        byte[] bArr = c14896.f45448;
        bArr[i - 4] = (byte) ((i2 >> 24) & 255);
        bArr[i - 3] = (byte) ((i2 >> 16) & 255);
        bArr[i - 2] = (byte) ((i2 >> 8) & 255);
        bArr[i - 1] = (byte) (i2 & 255);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39701() {
        C14896 c14896 = this.f51838;
        c14896.m35351(0);
        return c14896.f45449;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m39714(long j) {
        if ((j & 131072) == 0) {
            return 0;
        }
        m39708(m39715(this.f51841.f18800));
        return 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39706(AbstractC5698 abstractC5698, boolean z) {
        int m39714 = !z ? m39714(abstractC5698.mo16084()) : 0;
        long mo16084 = abstractC5698.mo16084();
        if ((2147487744L & mo16084) != ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_PDF && (mo16084 & 536870912) == 0) {
            AbstractC4308 abstractC4308 = abstractC5698.f17560;
            C6319 c6319 = this.f51836;
            boolean m17550 = c6319.m17550(abstractC4308, abstractC5698.mo16091(c6319));
            C12323 c12323 = this.f51824;
            if (m17550) {
                C3151 c3151 = c12323.f36882;
                c3151.getClass();
                for (C2609 mo12930 = abstractC5698.f17560.mo12930(); mo12930.m8249(); mo12930 = mo12930.f8241) {
                    if (!((AbstractC4308) mo12930.f8240).m12913(EnumC9454.TYPEVAR)) {
                    }
                }
            }
            int m39715 = m39715(this.f51841.f18827);
            this.f51838.m35351(c12323.m29895(abstractC5698));
            m39708(m39715);
            m39714++;
            break;
        }
        return m39714 + m39703(abstractC5698.mo16068()) + m39704(abstractC5698.mo16081(), false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39695(C2609 c2609, EnumC23440 enumC23440) {
        int m8245 = c2609.m8245();
        C14896 c14896 = this.f51838;
        c14896.m35348(m8245);
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C12048 c12048 = (C12048) it.next();
            C18837 c18837 = new C18837();
            Iterator it2 = c12048.mo16068().iterator();
            while (it2.hasNext()) {
                C16384 c16384 = (C16384) it2.next();
                C6319 c6319 = this.f51836;
                c6319.getClass();
                if (c6319.m17528(c16384.f26338.f13890) == enumC23440) {
                    c18837.m43511(c16384);
                }
            }
            c14896.m35351(c18837.m43514());
            Iterator it3 = c18837.iterator();
            while (it3.hasNext()) {
                m39713((C16384) it3.next());
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39703(C2609 c2609) {
        int i = 0;
        if (c2609.isEmpty()) {
            return 0;
        }
        C18837 c18837 = new C18837();
        C18837 c188372 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C16384 c16384 = (C16384) it.next();
            int[] iArr = C12945.f38835;
            C6319 c6319 = this.f51836;
            c6319.getClass();
            int i2 = iArr[c6319.m17528(c16384.f26338.f13890).ordinal()];
            if (i2 == 2) {
                c188372.m43511(c16384);
            } else if (i2 == 3) {
                c18837.m43511(c16384);
            }
        }
        int m43514 = c18837.m43514();
        C14896 c14896 = this.f51838;
        C6136 c6136 = this.f51841;
        if (m43514 != 0) {
            int m39715 = m39715(c6136.f18905);
            c14896.m35351(c18837.m43514());
            Iterator it2 = c18837.iterator();
            while (it2.hasNext()) {
                m39713((C16384) it2.next());
            }
            m39708(m39715);
            i = 1;
        }
        if (c188372.m43514() == 0) {
            return i;
        }
        int m397152 = m39715(c6136.f18874);
        c14896.m35351(c188372.m43514());
        Iterator it3 = c188372.iterator();
        while (it3.hasNext()) {
            m39713((C16384) it3.next());
        }
        m39708(m397152);
        return i + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39704(C2609 c2609, boolean z) {
        int i = 0;
        if (c2609.isEmpty()) {
            return 0;
        }
        C18837 c18837 = new C18837();
        C18837 c188372 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C6507 c6507 = (C6507) it.next();
            if (c6507.m38582() && !c6507.m38584()) {
                this.f51827.m50107(EnumC21659.ERROR).println("ClassWriter: Position UNKNOWN in type annotation: " + c6507);
            } else if (c6507.f50415.f30045.m24192() == z) {
                C9953 c9953 = c6507.f50415;
                if (!c9953.f30045.m24192() || c9953.f30055) {
                    int[] iArr = C12945.f38835;
                    C6319 c6319 = this.f51836;
                    c6319.getClass();
                    int i2 = iArr[c6319.m17528(c6507.f26338.f13890).ordinal()];
                    if (i2 == 2) {
                        c188372.m43511(c6507);
                    } else if (i2 == 3) {
                        c18837.m43511(c6507);
                    }
                }
            }
        }
        int m43514 = c18837.m43514();
        C14896 c14896 = this.f51838;
        C6136 c6136 = this.f51841;
        if (m43514 != 0) {
            int m39715 = m39715(c6136.f18890);
            c14896.m35351(c18837.m43514());
            Iterator it2 = c18837.iterator();
            while (it2.hasNext()) {
                m39712((C6507) it2.next());
            }
            m39708(m39715);
            i = 1;
        }
        if (c188372.m43514() == 0) {
            return i;
        }
        int m397152 = m39715(c6136.f18854);
        c14896.m35351(c188372.m43514());
        Iterator it3 = c188372.iterator();
        while (it3.hasNext()) {
            m39712((C6507) it3.next());
        }
        m39708(m397152);
        return i + 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39713(C16384 c16384) {
        AbstractC4308 abstractC4308 = c16384.f26338;
        C12323 c12323 = this.f51824;
        int m29893 = c12323.m29893(abstractC4308);
        C14896 c14896 = this.f51838;
        c14896.m35351(m29893);
        C2609 c2609 = c16384.f50417;
        c14896.m35351(c2609.m8245());
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C23069 c23069 = (C23069) it.next();
            c14896.m35351(C13028.m31613(c12323.f36883, ((C3581) c23069.f74207).f17562));
            ((AbstractC8624) c23069.f74208).mo5382(this.f51826);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39712(C6507 c6507) {
        C9953 c9953 = c6507.f50415;
        EnumC9372 enumC9372 = c9953.f30045;
        int i = c9953.f30048;
        int i2 = c9953.f30046;
        int m24193 = enumC9372.m24193();
        C14896 c14896 = this.f51838;
        c14896.m35348(m24193);
        switch (C12945.f38837[c9953.f30045.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                c14896.m35351(c9953.f30056);
                break;
            case 5:
            case 6:
                c14896.m35351(c9953.f30047.length);
                int i3 = 0;
                while (true) {
                    int[] iArr = c9953.f30047;
                    if (i3 >= iArr.length) {
                        break;
                    } else {
                        c14896.m35351(iArr[i3]);
                        c14896.m35351(c9953.f30057[i3]);
                        c14896.m35351(c9953.f30051[i3]);
                        i3++;
                    }
                }
            case 7:
                c14896.m35351(c9953.m25104());
                break;
            case 8:
            case 21:
            case 22:
                break;
            case 9:
            case 10:
                c14896.m35348(i);
                break;
            case 11:
            case 12:
                c14896.m35348(i);
                c14896.m35348(c9953.f30044);
                break;
            case 13:
                c14896.m35351(i2);
                break;
            case 14:
                c14896.m35351(i2);
                break;
            case 15:
                c14896.m35348(i);
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                c14896.m35351(c9953.f30056);
                c14896.m35348(i2);
                break;
            case 23:
                throw new AssertionError("jvm.ClassWriter: UNKNOWN target type should never occur!");
            default:
                throw new AssertionError("jvm.ClassWriter: Unknown target type for position: " + c9953);
        }
        c14896.m35348(c9953.f30054.m8245());
        C2609 c2609 = c9953.f30054;
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C12774 c12774 = (C12774) it.next();
            c18837.m43511(Integer.valueOf(c12774.f38382.f36094));
            c18837.m43511(Integer.valueOf(c12774.f38381));
        }
        Iterator it2 = c18837.m43517().iterator();
        while (it2.hasNext()) {
            c14896.m35348((byte) ((Integer) it2.next()).intValue());
        }
        m39713((C16384) c6507);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39697(final C16887 c16887, C14163 c14163, Set set) {
        C14896 c14896 = c16887.f51838;
        C12323 c12323 = c16887.f51824;
        c12323.getClass();
        c14896.m35351(c12323.m29889(c14163.f17560));
        c14896.m35351(set.size());
        C19846.forEach(set, new Consumer() { // from class: l.ۗۜ۠
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void n(Object obj) {
                C16887 c168872 = C16887.this;
                C14896 c148962 = c168872.f51838;
                C12323 c123232 = c168872.f51824;
                c123232.getClass();
                c148962.m35351(c123232.m29889(((C14163) obj).f17560));
            }
        });
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39716() {
        int i;
        int m39715 = m39715(this.f51841.f18784);
        C12323 c12323 = this.f51824;
        int size = c12323.f36879.size();
        C14896 c14896 = this.f51838;
        c14896.m35351(size);
        Iterator it = c12323.f36879.iterator();
        while (it.hasNext()) {
            C14163 c14163 = (C14163) it.next();
            c14163.m33813(this.f51836);
            char m39702 = (char) m39702(c14163.f17563);
            if ((m39702 & 512) != 0) {
                m39702 = (char) (m39702 | 1024);
            }
            char c = (char) (m39702 & 63487);
            if (this.f51845) {
                PrintWriter m50107 = this.f51827.m50107(EnumC21659.ERROR);
                m50107.println("INNERCLASS  " + ((Object) c14163.f17562));
                m50107.println("---" + m39700((long) c));
            }
            c12323.getClass();
            c14896.m35351(c12323.m29889(c14163.f17560));
            int i2 = 0;
            if (c14163.f17561.f17559 != EnumC1296.f4582 || c14163.f17562.isEmpty()) {
                i = 0;
            } else {
                C14163 c141632 = (C14163) c14163.f17561;
                c12323.getClass();
                i = c12323.m29889(c141632.f17560);
            }
            c14896.m35351(i);
            if (!c14163.f17562.isEmpty()) {
                i2 = C13028.m31613(c12323.f36883, c14163.f17562);
            }
            c14896.m35351(i2);
            c14896.m35351(c);
        }
        m39708(m39715);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39696(AbstractC5698 abstractC5698, C18837 c18837) {
        if (abstractC5698.f17559 != EnumC1296.f4582) {
            return;
        }
        C14163 c14163 = (C14163) abstractC5698;
        if (c14163.f17561.f17559 != EnumC1296.f4579) {
            c18837.m43511(c14163);
        }
        c14163.mo16101();
        if (c14163.f42762 != null) {
            AbstractC14016 mo16064 = abstractC5698.mo16064();
            mo16064.getClass();
            Iterator it = mo16064.mo20475((Predicate) null, EnumC1317.RECURSIVE).iterator();
            while (it.hasNext()) {
                m39696((AbstractC5698) it.next(), c18837);
            }
        }
        C2609 c2609 = c14163.f42769;
        if (c2609 != null) {
            Iterator it2 = c2609.iterator();
            while (it2.hasNext()) {
                m39696((AbstractC5698) it2.next(), c18837);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39711(AbstractC4308 abstractC4308) {
        boolean z = this.f51840;
        C14896 c14896 = this.f51838;
        if (abstractC4308 == null) {
            if (z) {
                System.out.print(b.f);
            }
            c14896.m35348(0);
            return;
        }
        switch (C12945.f38839[abstractC4308.mo3258().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 8:
                if (z) {
                    System.out.print(ClassTransform.INTEGER);
                }
                c14896.m35348(1);
                return;
            case 5:
                if (z) {
                    System.out.print(ClassTransform.LONG);
                }
                c14896.m35348(4);
                return;
            case 6:
                if (z) {
                    System.out.print(ClassTransform.FLOAT);
                }
                c14896.m35348(2);
                return;
            case 7:
                if (z) {
                    System.out.print(ClassTransform.DOUBLE);
                }
                c14896.m35348(3);
                return;
            case 9:
                if (z) {
                    System.out.print("null");
                }
                c14896.m35348(5);
                return;
            case 10:
            case 11:
            case 12:
                C6319 c6319 = this.f51836;
                if (z) {
                    System.out.print("object(" + c6319.m17519(abstractC4308).f13890 + MotionUtils.EASING_TYPE_FORMAT_END);
                }
                c14896.m35348(7);
                c14896.m35351(this.f51824.m29889(c6319.m17519(abstractC4308)));
                return;
            case 13:
                if (z) {
                    System.out.print("uninit_this");
                }
                c14896.m35348(6);
                return;
            case 14:
                int i = ((C16535) abstractC4308).f50813;
                c14896.m35348(8);
                if (z) {
                    System.out.print("uninit_object@" + i);
                }
                c14896.m35351(i);
                return;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39710(OutputStream outputStream, C14163 c14163) {
        int i;
        String str;
        C22364 c22364;
        String str2;
        int i2;
        C14163 c141632;
        int i3;
        int i4;
        EnumC10892 enumC10892;
        int i5;
        int i6;
        int i7;
        String str3;
        C3581 c3581;
        C2609 c2609;
        EnumC10892 enumC108922;
        C2609 c26092;
        int i8;
        C13028 c13028;
        C22364 c223642;
        C6136 c6136;
        int i9;
        C6319 c6319;
        C6319 c63192;
        boolean z;
        boolean z2;
        int i10;
        int i11;
        C3581 c35812;
        int i12;
        int i13;
        C3581 c35813;
        EnumC19711 enumC19711;
        C6136 c61362;
        C3581 c35814;
        int i14;
        String str4;
        String str5;
        C1365 c1365;
        C13028 c130282;
        C15240 c15240;
        C11327 c11327;
        int i15;
        int i16;
        C22364 c223643;
        String str6;
        C14896 c14896;
        AbstractC4308 abstractC4308;
        int i17;
        c14163.mo16101();
        C12171.m29642((c14163.f17563 & 16777216) == 0);
        C14896 c148962 = this.f51838;
        c148962.f45449 = 0;
        C14896 c148963 = this.f51829;
        c148963.f45449 = 0;
        AbstractC4308 abstractC43082 = c14163.f17560;
        C6319 c63193 = this.f51836;
        AbstractC4308 m17562 = c63193.m17562(abstractC43082);
        C2609 m17510 = c63193.m17510(c14163.f17560);
        C2609 mo12938 = c14163.f17560.mo12938();
        EnumC1296 enumC1296 = c14163.f17561.f17559;
        EnumC1296 enumC12962 = EnumC1296.f4568;
        if (enumC1296 == enumC12962) {
            i = 32768;
        } else {
            c14163.mo16101();
            int m39702 = m39702(c14163.f17563 & (-8796093022209L));
            if ((m39702 & 4) != 0) {
                m39702 |= 1;
            }
            int i18 = m39702 & 30225;
            i = (m39702 & 512) == 0 ? i18 | 32 : i18;
        }
        boolean z3 = this.f51839;
        C22364 c223644 = this.f51827;
        if (z3) {
            PrintWriter m50107 = c223644.m50107(EnumC21659.ERROR);
            m50107.println();
            m50107.println("CLASSFILE  " + ((Object) c14163.f42767));
            StringBuilder sb = new StringBuilder("---");
            str = "---";
            c22364 = c223644;
            sb.append(m39700(i));
            m50107.println(sb.toString());
        } else {
            str = "---";
            c22364 = c223644;
        }
        c148962.m35351(i);
        AbstractC5698 abstractC5698 = c14163.f17561;
        EnumC1296 enumC12963 = abstractC5698.f17559;
        C6136 c61363 = this.f51841;
        C12323 c12323 = this.f51824;
        if (enumC12963 == enumC12962) {
            str2 = str;
            C14163 c141633 = new C14163(0L, c61363.f18843, ((C0052) abstractC5698).f918);
            c12323.getClass();
            c148962.m35351(c12323.m29889(c141633.f17560));
        } else {
            str2 = str;
            c12323.getClass();
            c148962.m35351(c12323.m29889(c14163.f17560));
        }
        if (m17562.m12913(EnumC9454.CLASS)) {
            C14163 c141634 = (C14163) m17562.f13890;
            c12323.getClass();
            i2 = c12323.m29889(c141634.f17560);
        } else {
            i2 = 0;
        }
        c148962.m35351(i2);
        c148962.m35351(m17510.m8245());
        for (C2609 c26093 = m17510; c26093.m8249(); c26093 = c26093.f8241) {
            C14163 c141635 = (C14163) ((AbstractC4308) c26093.f8240).f13890;
            c12323.getClass();
            c148962.m35351(c12323.m29889(c141635.f17560));
        }
        c14163.mo16101();
        int i19 = 0;
        int i20 = 0;
        for (AbstractC5698 abstractC56982 : c14163.f42762.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            int i21 = C12945.f38836[abstractC56982.f17559.ordinal()];
            C2609 c26094 = m17510;
            if (i21 == 1) {
                i19++;
            } else if (i21 != 2) {
                if (i21 != 3) {
                    C12171.m29636();
                    throw null;
                }
                c12323.m29892((C14163) abstractC56982);
            } else if ((abstractC56982.mo16084() & 137438953472L) == 0) {
                i20++;
            }
            m17510 = c26094;
        }
        C2609 c26095 = m17510;
        C2609 c26096 = c14163.f42769;
        if (c26096 != null) {
            Iterator it = c26096.iterator();
            while (it.hasNext()) {
                c12323.m29892((C14163) it.next());
            }
        }
        c148962.m35351(i19);
        c14163.mo16101();
        AbstractC14016 abstractC14016 = c14163.f42762;
        C2609 m8239 = C2609.m8239();
        for (AbstractC5698 abstractC56983 : abstractC14016.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            if (abstractC56983.f17559 == EnumC1296.f4567) {
                m8239 = m8239.m8246((C12048) abstractC56983);
            }
        }
        while (m8239.m8249()) {
            C12048 c12048 = (C12048) m8239.f8240;
            c148962.m35351(m39702(c12048.f17563));
            if (this.f51835) {
                c223643 = c22364;
                PrintWriter m501072 = c223643.m50107(EnumC21659.ERROR);
                m501072.println("FIELD  " + ((Object) c12048.f17562));
                str6 = str2;
                StringBuilder sb2 = new StringBuilder(str6);
                c14896 = c148963;
                abstractC4308 = m17562;
                sb2.append(m39700(c12048.f17563));
                m501072.println(sb2.toString());
            } else {
                c223643 = c22364;
                str6 = str2;
                c14896 = c148963;
                abstractC4308 = m17562;
            }
            c148962.m35351(C13028.m31613(c12323.f36883, c12048.f17562));
            c148962.m35351(c12323.m29890((AbstractC5698) c12048));
            int m39701 = m39701();
            if (c12048.m29425() != null) {
                int m39715 = m39715(c61363.f18792);
                c148962.m35351(c12323.m29888(c12048.m29425()));
                m39708(m39715);
                i17 = 1;
            } else {
                i17 = 0;
            }
            m39709(m39701, i17 + m39706((AbstractC5698) c12048, false) + m39705(c12048));
            m8239 = m8239.f8241;
            c148963 = c14896;
            m17562 = abstractC4308;
            c22364 = c223643;
            str2 = str6;
        }
        C22364 c223645 = c22364;
        String str7 = str2;
        C14896 c148964 = c148963;
        AbstractC4308 abstractC43083 = m17562;
        c148962.m35351(i20);
        c14163.mo16101();
        AbstractC14016 abstractC140162 = c14163.f42762;
        C2609 m82392 = C2609.m8239();
        for (AbstractC5698 abstractC56984 : abstractC140162.mo20475((Predicate) null, EnumC1317.NON_RECURSIVE)) {
            if (abstractC56984.f17559 == EnumC1296.f4571 && (abstractC56984.mo16084() & 137438953472L) == 0) {
                m82392 = m82392.m8246((C3581) abstractC56984);
            }
        }
        while (true) {
            boolean m8249 = m82392.m8249();
            boolean z4 = this.f51837;
            EnumC10892 enumC108923 = this.f51831;
            if (!m8249) {
                C6136 c61364 = c61363;
                C3581 c35815 = null;
                int m397012 = m39701();
                boolean z5 = (mo12938.m8245() == 0 && abstractC43083.mo12934().m8245() == 0) ? false : true;
                for (C2609 c26097 = c26095; !z5 && c26097.m8249(); c26097 = c26097.f8241) {
                    z5 = ((AbstractC4308) c26097.f8240).mo12934().m8245() != 0;
                }
                if (z5) {
                    int m397152 = m39715(c61364.f18827);
                    c141632 = c14163;
                    c148962.m35351(c12323.m29895(c141632));
                    m39708(m397152);
                    i3 = 1;
                } else {
                    c141632 = c14163;
                    i3 = 0;
                }
                if (c141632.f42770 != null && this.f51843) {
                    int m397153 = m39715(c61364.f18862);
                    InterfaceC18278 interfaceC18278 = c141632.f42770;
                    int i22 = AbstractC12465.f37474;
                    String schemeSpecificPart = interfaceC18278.toUri().getSchemeSpecificPart();
                    c148962.m35351(C13028.m31613(c12323.f36883, c61364.f18880.m30652(schemeSpecificPart.substring(schemeSpecificPart.lastIndexOf("/") + 1))));
                    m39708(m397153);
                    i3++;
                }
                if (z4) {
                    AbstractC10370 abstractC10370 = c61364.f18793;
                    AbstractC12486 abstractC12486 = c61364.f18880;
                    int m397154 = m39715(abstractC10370);
                    try {
                        c148962.m35351(C13028.m31613(c12323.f36883, abstractC12486.m30652(Long.toString(c141632.f42770.mo20798()))));
                        m39708(m397154);
                        int m397155 = m39715(c61364.f18861);
                        c148962.m35351(C13028.m31613(c12323.f36883, abstractC12486.m30652(Long.toString(System.currentTimeMillis()))));
                        m39708(m397155);
                        i3 += 2;
                    } catch (SecurityException e) {
                        throw new AssertionError("CRT: couldn't get source file modification date: " + e.getMessage());
                    }
                }
                c14163.mo16101();
                int m39703 = m39703(c14163.mo16068()) + i3 + m39714(c141632.f17563) + m39704(c14163.mo16081(), false);
                AbstractC10370 abstractC103702 = c61364.f18877;
                EnumC1296 enumC12964 = c141632.f17561.f17559;
                EnumC1296 enumC12965 = EnumC1296.f4571;
                if (enumC12964 == enumC12965 || c141632.f17562 == c61364.f18867) {
                    int m397156 = m39715(abstractC103702);
                    C14163 m16071 = c141632.f17561.m16071();
                    AbstractC5698 abstractC56985 = c141632.f17561;
                    if (abstractC56985.f17560 != null && abstractC56985.f17559 == enumC12965) {
                        c35815 = ((C3581) abstractC56985).mo10964();
                    }
                    c12323.getClass();
                    c148962.m35351(c12323.m29889(m16071.f17560));
                    c148962.m35351(c35815 == null ? 0 : c12323.m29894(c35815));
                    m39708(m397156);
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                int i23 = m39703 + i4;
                AbstractC5698 abstractC56986 = c141632.f17561;
                if (abstractC56986.f17559 == EnumC1296.f4568) {
                    C0052 c0052 = (C0052) abstractC56986;
                    int m397157 = m39715(c61364.f18844);
                    C13028 c130283 = c12323.f36883;
                    c148962.m35351(C13028.m31613(c130283, c0052));
                    c148962.m35351(EnumC18398.m42829(c0052.f916));
                    AbstractC10370 abstractC103703 = c0052.f912;
                    c148962.m35351(abstractC103703 != null ? C13028.m31613(c130283, abstractC103703) : 0);
                    C18837 c18837 = new C18837();
                    Iterator it2 = c0052.f929.iterator();
                    while (it2.hasNext()) {
                        C9764 c9764 = (C9764) it2.next();
                        if (!c9764.f29540.contains(EnumC9058.EXTRA)) {
                            c18837.m43511(c9764);
                        }
                    }
                    c148962.m35351(c18837.size());
                    Iterator it3 = c18837.iterator();
                    while (it3.hasNext()) {
                        C9764 c97642 = (C9764) it3.next();
                        c148962.m35351(C13028.m31613(c130283, c97642.f29541));
                        c148962.m35351(EnumC9058.m23386(c97642.f29540));
                        AbstractC10370 abstractC103704 = c97642.f29541.f912;
                        c148962.m35351(abstractC103704 != null ? C13028.m31613(c130283, abstractC103704) : 0);
                    }
                    C2609 c26098 = c0052.f921;
                    c148962.m35351(c26098.m8245());
                    Iterator it4 = c26098.iterator();
                    while (it4.hasNext()) {
                        C17524 c17524 = (C17524) it4.next();
                        C7814 c7814 = c17524.f53523;
                        C2609 c26099 = c17524.f53522;
                        c148962.m35351(C13028.m31613(c130283, c7814));
                        c148962.m35351(EnumC14701.m34992(c17524.f53521));
                        if (c26099 == null) {
                            c148962.m35351(0);
                        } else {
                            c148962.m35351(c26099.m8245());
                            Iterator it5 = c26099.iterator();
                            while (it5.hasNext()) {
                                c148962.m35351(C13028.m31613(c130283, (C0052) it5.next()));
                            }
                        }
                    }
                    C2609 c260910 = c0052.f919;
                    c148962.m35351(c260910.m8245());
                    Iterator it6 = c260910.iterator();
                    while (it6.hasNext()) {
                        C23874 c23874 = (C23874) it6.next();
                        C7814 c78142 = c23874.f77199;
                        C2609 c260911 = c23874.f77198;
                        c148962.m35351(C13028.m31613(c130283, c78142));
                        c148962.m35351(EnumC6941.m18749(c23874.f77197));
                        if (c260911 == null) {
                            c148962.m35351(0);
                        } else {
                            c148962.m35351(c260911.m8245());
                            Iterator it7 = c260911.iterator();
                            while (it7.hasNext()) {
                                c148962.m35351(C13028.m31613(c130283, (C0052) it7.next()));
                            }
                        }
                    }
                    C2609 c260912 = c0052.f917;
                    c148962.m35351(c260912.m8245());
                    Iterator it8 = c260912.iterator();
                    while (it8.hasNext()) {
                        c148962.m35351(c12323.m29889(((C16112) it8.next()).f49647.f17560));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it9 = c0052.f925.iterator();
                    while (it9.hasNext()) {
                        C21053 c21053 = (C21053) it9.next();
                        ((Set) C13843.computeIfAbsent(linkedHashMap, c21053.f67912, new C18865(4))).addAll(c21053.f67911);
                    }
                    c148962.m35351(linkedHashMap.size());
                    C13843.forEach(linkedHashMap, new BiConsumer() { // from class: l.ۙۜ۠
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            C16887.m39697(C16887.this, (C14163) obj, (Set) obj2);
                        }

                        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                            return C17873.$default$andThen(this, biConsumer);
                        }
                    });
                    m39708(m397157);
                    i23 = i23 + 1 + m39714(c141632.f17561.mo16084() & (-131073));
                }
                int m39705 = i23 + m39705((AbstractC5698) c141632);
                c148964.m35352(-889275714);
                C23168 c23168 = this.f51825;
                if (c23168.m51347() && c23168.m51348(c141632.f42770)) {
                    c148964.m35351(65535);
                    enumC10892 = enumC108923;
                } else {
                    enumC10892 = enumC108923;
                    c148964.m35351(enumC10892.f32757);
                }
                c148964.m35351(enumC10892.f32756);
                if (c141632.f17561.f17559 != EnumC1296.f4568 && enumC10892.m27209()) {
                    C18837 c188372 = new C18837();
                    m39696(c141632, c188372);
                    LinkedHashSet<C14163> linkedHashSet = new LinkedHashSet(c188372);
                    if (c141632.f17561.f17559 != EnumC1296.f4579 || linkedHashSet.isEmpty()) {
                        i6 = 0;
                    } else {
                        int m397158 = m39715(c61364.f18841);
                        c148962.m35351(linkedHashSet.size());
                        for (C14163 c141636 : linkedHashSet) {
                            c12323.getClass();
                            c148962.m35351(c12323.m29889(c141636.f17560));
                        }
                        m39708(m397158);
                        i6 = 1;
                    }
                    int i24 = m39705 + i6;
                    if (c141632.f17561.f17559 != EnumC1296.f4579) {
                        int m397159 = m39715(c61364.f18812);
                        C14163 mo955 = c14163.mo955();
                        c12323.getClass();
                        c148962.m35351(c12323.m29889(mo955.f17560));
                        m39708(m397159);
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    m39705 = i24 + i7;
                }
                if (c14163.m33810()) {
                    int m3971510 = m39715(c61364.f18866);
                    c14163.mo16064();
                    c148962.m35351(c14163.m33811().m8245());
                    Iterator it10 = c14163.m33811().iterator();
                    while (it10.hasNext()) {
                        AbstractC5698 abstractC56987 = (C12048) it10.next();
                        c148962.m35351(C13028.m31613(c12323.f36883, abstractC56987.f17562));
                        c148962.m35351(c12323.m29890(abstractC56987));
                        m39709(m39701(), m39706(abstractC56987, true));
                    }
                    i5 = 1;
                    m39708(m3971510);
                    m39705++;
                } else {
                    i5 = 1;
                }
                if (enumC10892.m27212()) {
                    if (c141632.f42765.m8249()) {
                        int m3971511 = m39715(c61364.f18819);
                        c148962.m35351(c141632.f42765.m8245());
                        Iterator it11 = c141632.f42765.iterator();
                        while (it11.hasNext()) {
                            C14163 c141637 = (C14163) ((AbstractC5698) it11.next());
                            c12323.getClass();
                            c148962.m35351(c12323.m29889(c141637.f17560));
                        }
                        m39708(m3971511);
                    } else {
                        i5 = 0;
                    }
                    m39705 += i5;
                }
                LinkedHashMap linkedHashMap2 = c12323.f36878;
                C13028 c130284 = c12323.f36883;
                LinkedHashSet linkedHashSet2 = c12323.f36879;
                if (!linkedHashMap2.isEmpty()) {
                    int m3971512 = m39715(c61364.f18869);
                    c148962.m35351(c12323.f36878.size());
                    for (C19380 c19380 : c12323.f36878.keySet()) {
                        c148962.m35351(c12323.m29891(c19380.f62729));
                        InterfaceC8090[] interfaceC8090Arr = c19380.f62732;
                        c148962.m35351(interfaceC8090Arr.length);
                        for (InterfaceC8090 interfaceC8090 : interfaceC8090Arr) {
                            c148962.m35351(c12323.m29891(interfaceC8090));
                        }
                    }
                    m39708(m3971512);
                    m39705++;
                }
                if (!linkedHashSet2.isEmpty()) {
                    m39716();
                    m39705++;
                }
                m39709(m397012, m39705);
                outputStream.write(c148964.f45448, 0, c148964.f45449);
                if (c130284.f39001 != null) {
                    throw new C11244(c130284.f39001);
                }
                int i25 = c130284.f38998;
                if (i25 > 65535) {
                    throw new C10124();
                }
                outputStream.write(i25 >> 8);
                outputStream.write(i25);
                C14896 c148965 = c130284.f39003;
                outputStream.write(c148965.f45448, 0, c148965.f45449);
                linkedHashSet2.clear();
                c12323.f36878.clear();
                c130284.m31614();
                outputStream.write(c148962.f45448, 0, c148962.f45449);
                return;
            }
            C3581 c35816 = (C3581) m82392.f8240;
            c148962.m35351(m39702(c35816.f17563));
            if (this.f51830) {
                PrintWriter m501073 = c223645.m50107(EnumC21659.ERROR);
                m501073.println("METHOD  " + ((Object) c35816.f17562));
                StringBuilder sb3 = new StringBuilder(str7);
                str3 = str7;
                sb3.append(m39700(c35816.f17563));
                m501073.println(sb3.toString());
            } else {
                str3 = str7;
            }
            AbstractC10370 abstractC103705 = c35816.f17562;
            C13028 c130285 = c12323.f36883;
            c148962.m35351(C13028.m31613(c130285, abstractC103705));
            c148962.m35351(c12323.m29890((AbstractC5698) c35816));
            int m397013 = m39701();
            if (c35816.f11368 != null) {
                int m3971513 = m39715(c61363.f18826);
                C1365 c13652 = c35816.f11368;
                int i26 = c13652.f4969;
                c26092 = mo12938;
                EnumC19711 enumC197112 = c13652.f4966;
                c2609 = m82392;
                C3581 c35817 = c13652.f4962;
                c148962.m35351(i26);
                c148962.m35351(c13652.f4961);
                c148962.m35352(c13652.f4987);
                i8 = m397013;
                enumC108922 = enumC108923;
                c148962.m35349(0, c13652.f4987, c13652.f4985);
                c148962.m35351(c13652.f4977.m43514());
                C2609 m43517 = c13652.f4977.m43517();
                while (m43517.m8249()) {
                    int i27 = 0;
                    while (true) {
                        char[] cArr = (char[]) m43517.f8240;
                        i16 = m3971513;
                        if (i27 < cArr.length) {
                            c148962.m35351(cArr[i27]);
                            i27++;
                            m3971513 = i16;
                        }
                    }
                    m43517 = m43517.f8241;
                    m3971513 = i16;
                }
                int i28 = m3971513;
                int m397014 = m39701();
                if (c13652.f4967.m8249()) {
                    int m3971514 = m39715(c61363.f18857);
                    c148962.m35351(c13652.f4967.m8245());
                    C2609 m8250 = c13652.f4967.m8250();
                    while (m8250.m8249()) {
                        int i29 = 0;
                        C3581 c35818 = c35816;
                        while (true) {
                            char[] cArr2 = (char[]) m8250.f8240;
                            i15 = m397014;
                            if (i29 < cArr2.length) {
                                c148962.m35351(cArr2[i29]);
                                i29++;
                                m397014 = i15;
                            }
                        }
                        m8250 = m8250.f8241;
                        c35816 = c35818;
                        m397014 = i15;
                    }
                    c35812 = c35816;
                    i12 = m397014;
                    m39708(m3971514);
                    i13 = 1;
                } else {
                    c35812 = c35816;
                    i12 = m397014;
                    i13 = 0;
                }
                if (z4 && (c11327 = c13652.f4986) != null) {
                    int m3971515 = m39715(c61363.f18830);
                    m39709(m39701(), c11327.m27978(c148962, c13652.f4988, c223645));
                    m39708(m3971515);
                    i13++;
                }
                if (!c13652.f4964 || c13652.f4972 <= 0) {
                    c35813 = c35817;
                    enumC19711 = enumC197112;
                    c223642 = c223645;
                    c61362 = c61363;
                } else {
                    int m3971516 = m39715(c61363.f18893);
                    int i30 = c13652.f4972;
                    for (int i31 = 0; i31 < c13652.f4972; i31++) {
                        i30 += c13652.f4981[i31].f49838.size() - 1;
                    }
                    c148962.m35351(i30);
                    int i32 = 0;
                    int i33 = 0;
                    while (true) {
                        int i34 = c13652.f4972;
                        c15240 = this.f51834;
                        if (i32 >= i34) {
                            break;
                        }
                        C16181 c16181 = c13652.f4981[i32];
                        C22364 c223646 = c223645;
                        List list = c16181.f49838;
                        EnumC19711 enumC197113 = enumC197112;
                        C12048 c120482 = c16181.f49840;
                        Iterator it12 = list.iterator();
                        while (it12.hasNext()) {
                            Iterator it13 = it12;
                            C9127 c9127 = (C9127) it12.next();
                            C3581 c35819 = c35817;
                            char c = c9127.f27648;
                            C6136 c61365 = c61363;
                            C12171.m29642(c >= 0 && c <= c13652.f4987);
                            c148962.m35351(c);
                            char c2 = c9127.f27647;
                            C12171.m29642(c2 > 0 && c + c2 <= c13652.f4987);
                            c148962.m35351(c9127.f27647);
                            c148962.m35351(C13028.m31613(c130285, c120482.f17562));
                            c148962.m35351(c12323.m29890((AbstractC5698) c120482));
                            c148962.m35351(c16181.f49839);
                            AbstractC4308 abstractC43084 = c120482.f17560;
                            if (!c63193.m17550(abstractC43084, c63193.m17519(abstractC43084))) {
                                c15240.getClass();
                                if (C15240.m36092(abstractC43084)) {
                                    i33++;
                                }
                            }
                            c35817 = c35819;
                            it12 = it13;
                            c61363 = c61365;
                        }
                        i32++;
                        c223645 = c223646;
                        enumC197112 = enumC197113;
                    }
                    c35813 = c35817;
                    enumC19711 = enumC197112;
                    c223642 = c223645;
                    c61362 = c61363;
                    m39708(m3971516);
                    int i35 = i13 + 1;
                    if (i33 > 0) {
                        C6136 c61366 = c61362;
                        int m3971517 = m39715(c61366.f18897);
                        c148962.m35351(i33);
                        int i36 = 0;
                        int i37 = 0;
                        while (i36 < c13652.f4972) {
                            C16181 c161812 = c13652.f4981[i36];
                            C12048 c120483 = c161812.f49840;
                            AbstractC4308 abstractC43085 = c120483.f17560;
                            C6136 c61367 = c61366;
                            if (!c63193.m17550(abstractC43085, c63193.m17519(abstractC43085))) {
                                c15240.getClass();
                                if (C15240.m36092(abstractC43085)) {
                                    for (Iterator it14 = c161812.f49838.iterator(); it14.hasNext(); it14 = it14) {
                                        C9127 c91272 = (C9127) it14.next();
                                        c148962.m35351(c91272.f27648);
                                        c148962.m35351(c91272.f27647);
                                        c148962.m35351(C13028.m31613(c130285, c120483.f17562));
                                        c148962.m35351(c12323.m29895(c120483));
                                        c148962.m35351(c161812.f49839);
                                        i37++;
                                    }
                                }
                            }
                            i36++;
                            c61366 = c61367;
                        }
                        c61362 = c61366;
                        C12171.m29642(i37 == i33);
                        m39708(m3971517);
                        i13 += 2;
                    } else {
                        i13 = i35;
                    }
                }
                if (c13652.f4979 > 0) {
                    boolean z6 = this.f51840;
                    if (z6) {
                        PrintStream printStream = System.out;
                        StringBuilder sb4 = new StringBuilder("Stack map for ");
                        c35814 = c35813;
                        sb4.append(c35814);
                        printStream.println(sb4.toString());
                    } else {
                        c35814 = c35813;
                    }
                    EnumC19711 enumC197114 = enumC19711;
                    c6136 = c61362;
                    int m3971518 = m39715(enumC197114.mo12632(c6136));
                    int i38 = c13652.f4979;
                    if (z6) {
                        System.out.println(" nframes = " + i38);
                    }
                    c148962.m35351(i38);
                    int i39 = C12945.f38838[enumC197114.ordinal()];
                    String str8 = ":";
                    String str9 = EnumC0121.f1143;
                    if (i39 == 1) {
                        c13028 = c130285;
                        int i40 = 0;
                        while (i40 < i38) {
                            if (z6) {
                                System.out.print(str9 + i40 + str8);
                            }
                            C0659 c0659 = c13652.f4980[i40];
                            if (z6) {
                                i14 = i38;
                                str4 = str8;
                                System.out.print(" pc=" + c0659.f2554);
                            } else {
                                i14 = i38;
                                str4 = str8;
                            }
                            c148962.m35351(c0659.f2554);
                            int i41 = 0;
                            int i42 = 0;
                            while (true) {
                                AbstractC4308[] abstractC4308Arr = c0659.f2553;
                                str5 = str9;
                                if (i41 >= abstractC4308Arr.length) {
                                    break;
                                }
                                i42++;
                                i41 += C1365.m4791(abstractC4308Arr[i41]);
                                str9 = str5;
                            }
                            if (z6) {
                                System.out.print(" nlocals=" + i42);
                            }
                            c148962.m35351(i42);
                            int i43 = 0;
                            while (i43 < c0659.f2553.length) {
                                if (z6) {
                                    c1365 = c13652;
                                    System.out.print(" local[" + i43 + "]=");
                                } else {
                                    c1365 = c13652;
                                }
                                m39711(c0659.f2553[i43]);
                                i43 += C1365.m4791(c0659.f2553[i43]);
                                c13652 = c1365;
                            }
                            C1365 c13653 = c13652;
                            int i44 = 0;
                            int i45 = 0;
                            while (true) {
                                AbstractC4308[] abstractC4308Arr2 = c0659.f2555;
                                if (i44 >= abstractC4308Arr2.length) {
                                    break;
                                }
                                i45++;
                                i44 += C1365.m4791(abstractC4308Arr2[i44]);
                            }
                            if (z6) {
                                System.out.print(" nstack=" + i45);
                            }
                            c148962.m35351(i45);
                            for (int i46 = 0; i46 < c0659.f2555.length; i46 += C1365.m4791(c0659.f2555[i46])) {
                                if (z6) {
                                    System.out.print(" stack[" + i46 + "]=");
                                }
                                m39711(c0659.f2555[i46]);
                            }
                            if (z6) {
                                System.out.println();
                            }
                            i40++;
                            i38 = i14;
                            str8 = str4;
                            str9 = str5;
                            c13652 = c13653;
                        }
                    } else {
                        if (i39 != 2) {
                            throw new AssertionError("Unexpected stackmap format value");
                        }
                        C12171.m29644(c13652.f4980);
                        int i47 = 0;
                        while (i47 < i38) {
                            if (z6) {
                                c130282 = c130285;
                                System.out.print(EnumC0121.f1143 + i47 + ":");
                            } else {
                                c130282 = c130285;
                            }
                            c13652.f4976[i47].mo6812(this);
                            if (z6) {
                                System.out.println();
                            }
                            i47++;
                            c130285 = c130282;
                        }
                        c13028 = c130285;
                    }
                    m39708(m3971518);
                    i13++;
                } else {
                    c13028 = c130285;
                    c35814 = c35813;
                    c6136 = c61362;
                }
                m39709(i12, i13 + m39704(c35814.mo16081(), true));
                c3581 = c35812;
                c3581.f11368 = null;
                m39708(i28);
                i9 = 1;
            } else {
                c3581 = c35816;
                c2609 = m82392;
                enumC108922 = enumC108923;
                c26092 = mo12938;
                i8 = m397013;
                c13028 = c130285;
                c223642 = c223645;
                c6136 = c61363;
                i9 = 0;
            }
            C2609 mo12930 = c3581.mo16091(c63193).mo12930();
            if (mo12930.m8249()) {
                int m3971519 = m39715(c6136.f18780);
                c148962.m35351(mo12930.m8245());
                while (mo12930.m8249()) {
                    c148962.m35351(c12323.m29889((AbstractC4308) mo12930.f8240));
                    mo12930 = mo12930.f8241;
                }
                m39708(m3971519);
                i9++;
            }
            if (c3581.f11370 != null) {
                int m3971520 = m39715(c6136.f18865);
                c3581.f11370.mo5382(this.f51826);
                m39708(m3971520);
                i9++;
            }
            if (!enumC108922.m27207() || ((!this.f51842.m28832(EnumC0121.f1190) && (!c3581.m16075() || (c3581.f17563 & 2305843009213693952L) == 0)) || (c3581.f17563 & 562949953421312L) == 562949953421312L)) {
                c6319 = c63193;
            } else {
                int m8245 = c3581.m16096(c63193).mo12945().f32059.m8245();
                if (c3581.f11367 == null || m8245 == 0) {
                    c6319 = c63193;
                    i11 = 0;
                } else {
                    int m3971521 = m39715(c6136.f18847);
                    c148962.m35348(m8245);
                    Iterator it15 = c3581.f11369.iterator();
                    while (it15.hasNext()) {
                        C12048 c120484 = (C12048) it15.next();
                        int i48 = (36880 & ((int) c120484.f17563)) | (((int) c3581.f17563) & 4096);
                        c148962.m35351(C13028.m31613(c13028, c120484.f17562));
                        c148962.m35351(i48);
                    }
                    C13028 c130286 = c13028;
                    Iterator it16 = c3581.f11367.iterator();
                    while (it16.hasNext()) {
                        C12048 c120485 = (C12048) it16.next();
                        int i49 = (36880 & ((int) c120485.f17563)) | (((int) c3581.f17563) & 4096);
                        c148962.m35351(C13028.m31613(c130286, c120485.f17562));
                        c148962.m35351(i49);
                    }
                    int i50 = 36880;
                    Iterator it17 = c3581.f11366.iterator();
                    while (it17.hasNext()) {
                        C12048 c120486 = (C12048) it17.next();
                        int i51 = (((int) c3581.f17563) & 4096) | (((int) c120486.f17563) & i50);
                        c148962.m35351(C13028.m31613(c130286, c120486.f17562));
                        c148962.m35351(i51);
                        c63193 = c63193;
                        i50 = 36880;
                    }
                    c6319 = c63193;
                    m39708(m3971521);
                    i11 = 1;
                }
                i9 += i11;
            }
            int m39706 = i9 + m39706((AbstractC5698) c3581, false);
            if ((c3581.f17563 & 562949953421312L) == 562949953421312L) {
                c63192 = c6319;
            } else {
                C2609 c260913 = c3581.f11367;
                if (c260913 != null) {
                    Iterator it18 = c260913.iterator();
                    z = false;
                    z2 = false;
                    while (it18.hasNext()) {
                        Iterator it19 = ((C12048) it18.next()).mo16068().iterator();
                        while (it19.hasNext()) {
                            C6319 c63194 = c6319;
                            int i52 = C12945.f38835[c63194.m17528(((C16384) it19.next()).f26338.f13890).ordinal()];
                            if (i52 == 2) {
                                z2 = true;
                            } else if (i52 == 3) {
                                z = true;
                            }
                            c6319 = c63194;
                        }
                    }
                    c63192 = c6319;
                } else {
                    c63192 = c6319;
                    z = false;
                    z2 = false;
                }
                if (z) {
                    int m3971522 = m39715(c6136.f18816);
                    m39695(c260913, EnumC23440.RUNTIME);
                    m39708(m3971522);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (z2) {
                    int m3971523 = m39715(c6136.f18870);
                    m39695(c260913, EnumC23440.CLASS);
                    m39708(m3971523);
                    i10++;
                }
                m39706 += i10;
            }
            m39709(i8, m39706 + m39705(c3581));
            c63193 = c63192;
            str7 = str3;
            mo12938 = c26092;
            c223645 = c223642;
            c61363 = c6136;
            m82392 = c2609.f8241;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 m39707(C14163 c14163) {
        InterfaceC2050 interfaceC2050;
        C22364 c22364 = this.f51827;
        EnumC1296 enumC1296 = c14163.f17561.f17559;
        EnumC1296 enumC12962 = EnumC1296.f4568;
        String abstractC10370 = (enumC1296 == enumC12962 ? c14163.f17562 : c14163.f42771).toString();
        boolean z = this.f51828;
        InterfaceC11223 interfaceC11223 = this.f51832;
        if (z) {
            AbstractC5698 abstractC5698 = c14163.f17561;
            interfaceC2050 = interfaceC11223.mo1714(EnumC21101.CLASS_OUTPUT, (abstractC5698.f17559 == enumC12962 ? (C0052) abstractC5698 : c14163.m16089().f24147).f17562.toString());
        } else {
            interfaceC2050 = EnumC21101.CLASS_OUTPUT;
        }
        InterfaceC18278 mo1708 = interfaceC11223.mo1708(interfaceC2050, abstractC10370, EnumC16866.CLASS, c14163.f42770);
        OutputStream mo20797 = mo1708.mo20797();
        try {
            try {
                m39710(mo20797, c14163);
                if (this.f51844) {
                    c22364.m50123("wrote.file", mo1708.getName());
                }
                mo20797.close();
                return mo1708;
            } catch (C16196 e) {
                AbstractC4308 m38127 = e.m38127();
                C11576 c11576 = C11886.f35440;
                c22364.m7276(C6241.m17184(c14163, new C11576("compiler", "illegal.signature", c14163, m38127)));
                if (mo20797 == null) {
                    return mo1708;
                }
                mo20797.close();
                mo1708.delete();
                return null;
            }
        } catch (Throwable th) {
            if (mo20797 != null) {
                mo20797.close();
                mo1708.delete();
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39705(AbstractC5698 abstractC5698) {
        Iterator it = this.f51833.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ToIntFunction) it.next()).applyAsInt(abstractC5698);
        }
        return i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39702(long j) {
        int i = (int) j;
        if (this.f51831.m27210()) {
            i &= -2049;
        }
        if ((2147483648L & j) != 0) {
            i |= 64;
        }
        if ((17179869184L & j) != 0) {
            i |= 128;
        }
        return (j & 8796093022208L) != 0 ? i & (-1025) : i;
    }
}

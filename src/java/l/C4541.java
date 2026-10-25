package l;

import com.umeng.analytics.pro.d;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.MissingResourceException;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: D445 */
/* renamed from: l.ۙۡ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4541 {

    /* renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static ResourceBundle f14423;

    /* renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f14424 = new C4314();

    /* renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final EnumC22180 f14425 = EnumC22180.f71967;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C13809 f14426;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC11223 f14428;

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public C22694 f14429;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C4224 f14430;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C3267 f14431;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 f14433;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public EnumC20064 f14434;

    /* renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public C16887 f14435;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f14436;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public EnumC16280 f14437;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f14438;

    /* renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public boolean f14439;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public C20661 f14441;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f14442;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C22297 f14443;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f14444;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C6235 f14445;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C19914 f14446;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public C4767 f14447;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C2002 f14448;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public EnumC21592 f14449;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C2903 f14450;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C2609 f14451;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13395 f14453;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C6136 f14454;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22364 f14455;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8796 f14456;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17013 f14458;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2609 f14459;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C10222 f14461;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public C11160 f14462;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C5431 f14463;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public EnumC21592 f14464;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f14465;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C11781 f14466;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C15240 f14467;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C23168 f14468;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C9310 f14469;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C15684 f14470;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C5931 f14471;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C5931 f14473;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f14474;

    /* renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f14476;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 f14477;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public C20002 f14478;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C13359 f14479;

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public C6319 f14480;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f14481;

    /* renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public boolean f14482;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C23294 f14483;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public EnumC22180 f14484;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final C5589 f14472 = new C5589(this);

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f14440 = false;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public HashSet f14457 = new HashSet();

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f14452 = false;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f14475 = false;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public long f14427 = 0;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public boolean f14485 = false;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C1302 f14460 = null;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashMap f14432 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4541 m13316(C2903 c2903) {
        C4541 c4541 = (C4541) c2903.m8838(f14424);
        return c4541 == null ? new C4541(c2903) : c4541;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m13321() {
        return m13322("release");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m13325() {
        return m13322("full");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m13322(String str) {
        if (f14423 == null) {
            try {
                f14423 = ResourceBundle.getBundle("com.sun.tools.javac.resources.version");
            } catch (MissingResourceException unused) {
                return C22364.m50106("version.not.available", new Object[0]);
            }
        }
        try {
            return f14423.getString(str);
        } catch (MissingResourceException unused2) {
            return C22364.m50106("version.not.available", new Object[0]);
        }
    }

    public C4541(C2903 c2903) {
        EnumC21592 enumC21592;
        EnumC21592 enumC215922;
        this.f14459 = C2609.m8239();
        this.f14450 = c2903;
        c2903.m8841(f14424, this);
        if (c2903.m8837(InterfaceC11223.class) == null) {
            int i = C11844.f35338;
            c2903.m8840(InterfaceC11223.class, (InterfaceC19837) new C4083());
        }
        this.f14454 = C6136.m17057(c2903);
        this.f14455 = C22364.m50099(c2903);
        this.f14471 = C5931.m16615(c2903);
        this.f14446 = C19914.m45820(c2903);
        this.f14478 = C20002.m46105(c2903);
        this.f14458 = C17013.m39896(c2903);
        this.f14435 = C16887.m39694(c2903);
        this.f14456 = C8796.m22697(c2903);
        this.f14426 = C13809.m33121(c2903);
        this.f14447 = C4767.m13930(c2903);
        this.f14428 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        this.f14470 = C15684.m36959(c2903);
        this.f14443 = C22297.m50018(c2903);
        try {
            this.f14441 = C20661.m47250(c2903);
        } catch (C20515 e) {
            C22364 c22364 = this.f14455;
            AbstractC5698 abstractC5698 = e.f66102;
            C16719 m46989 = e.m46989();
            C12281 c12281 = C6241.f19132;
            c22364.m7276(new C12281("compiler", "cant.access", abstractC5698, m46989));
        }
        this.f14437 = EnumC16280.m38301(c2903);
        this.f14468 = C23168.m51341(c2903);
        this.f14469 = C9310.m23901(c2903);
        this.f14430 = C4224.m12719(c2903);
        this.f14467 = C15240.m36054(c2903);
        this.f14479 = C13359.m32330(c2903);
        this.f14461 = C10222.m25648(c2903);
        this.f14462 = C11160.m27673(c2903);
        this.f14483 = C23294.m51630(c2903);
        this.f14453 = C13395.m32391(c2903);
        this.f14480 = C6319.m17456(c2903);
        this.f14429 = C22694.m50706(c2903);
        C3267 m10022 = C3267.m10022(c2903);
        this.f14431 = m10022;
        C6235 m17162 = C6235.m17162(c2903);
        this.f14445 = m17162;
        this.f14473 = C5931.m16615(c2903);
        this.f14448 = C2002.m6532(c2903);
        this.f14446.f64349 = this.f14472;
        m10022.f10280 = new C14127(this);
        m17162.f19099 = new C14127(this);
        C11781 m28823 = C11781.m28823(c2903);
        this.f14466 = m28823;
        this.f14482 = m28823.m28832(EnumC0121.f1141);
        this.f14474 = m28823.m28832(EnumC0121.f1147);
        EnumC0121 enumC0121 = EnumC0121.f1202;
        this.f14442 = m28823.m28836(enumC0121) || m28823.m28829(enumC0121, "lines");
        this.f14481 = m28823.m28832(EnumC0121.f1191) || c2903.m8837(InterfaceC14106.class) != null;
        this.f14436 = m28823.m28831("dev");
        this.f14444 = m28823.m28831("process.packages");
        this.f14439 = m28823.m28832(EnumC0121.f1169);
        this.f14476 = m28823.m28831("verboseCompilePolicy");
        this.f14484 = EnumC22180.m49823(m28823.m28824("compilePolicy"));
        this.f14434 = EnumC20064.m46247(m28823.m28824("-implicit"));
        this.f14477 = m28823.m28831("failcomplete") ? this.f14454.f18880.m30652(m28823.m28824("failcomplete")) : null;
        if (m28823.m28831("should-stop.at")) {
            enumC21592 = EnumC21592.valueOf(m28823.m28824("should-stop.at"));
        } else if (m28823.m28831("should-stop.ifError")) {
            enumC21592 = EnumC21592.valueOf(m28823.m28824("should-stop.ifError"));
        } else {
            enumC21592 = EnumC21592.INIT;
        }
        this.f14449 = enumC21592;
        if (m28823.m28831("should-stop.ifNoError")) {
            enumC215922 = EnumC21592.valueOf(m28823.m28824("should-stop.ifNoError"));
        } else {
            enumC215922 = EnumC21592.GENERATE;
        }
        this.f14464 = enumC215922;
        if (m28823.m28835("diags.legacy")) {
            this.f14455.m50113(C2798.m8639(c2903));
        }
        InterfaceC5808 interfaceC5808 = (InterfaceC5808) c2903.m8837(InterfaceC5808.class);
        if (interfaceC5808 != null) {
            this.f14459 = this.f14459.m8246(interfaceC5808);
        }
        this.f14433 = new C15123(EnumC1296.f4573, 0L, this.f14454.f18867, AbstractC4308.f13885, this.f14441.f66473);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13341(EnumC21592 enumC21592) {
        EnumC21592 enumC215922;
        if (m13346() <= 0) {
            C5431 c5431 = this.f14463;
            if (c5431 != null) {
                Iterator it = ((C18837) c5431.m15516()).iterator();
                while (it.hasNext()) {
                    C16719 c16719 = (C16719) it.next();
                    if (c16719.mo29297() != EnumC6346.ERROR || c16719.m39346(EnumC20043.RECOVERABLE)) {
                    }
                }
            }
            enumC215922 = this.f14464;
            return enumC21592.m48773(enumC215922);
        }
        enumC215922 = this.f14449;
        return enumC21592.m48773(enumC215922);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m13346() {
        boolean z = this.f14439;
        C22364 c22364 = this.f14455;
        if (z && c22364.f72454 == 0 && c22364.f72451 > 0) {
            c22364.m7276(C6241.f19268);
        }
        return c22364.f72454;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5698 m13330(String str) {
        C0052 c0052;
        AbstractC5698 m23937;
        int indexOf = str.indexOf(47);
        C22364 c22364 = this.f14455;
        int i = 0;
        if (indexOf == -1) {
            c0052 = this.f14431.m10062();
        } else {
            if (!EnumC10637.f32009.m26686(this.f14437)) {
                C12281 c12281 = C6241.f19132;
                c22364.m7276(new C12281("compiler", "invalid.module.specifier", str));
                return this.f14433;
            }
            C0052 m17169 = this.f14445.m17169(this.f14454.f18880.m30652(str.substring(0, indexOf)));
            str = str.substring(indexOf + 1);
            c0052 = m17169;
        }
        try {
            return this.f14446.m45829(c0052, this.f14454.f18880.m30652(str.replace("/", ".")));
        } catch (C20515 unused) {
            if (str.equals("")) {
                return this.f14441.f66462;
            }
            AbstractC12612 abstractC12612 = null;
            InterfaceC18278 m7284 = c22364.m7284((InterfaceC18278) null);
            try {
                String[] split = str.split("\\.", -1);
                int length = split.length;
                while (true) {
                    if (i >= length) {
                        C1323 m39970 = this.f14458.m39970(C2609.m8239());
                        m39970.f4739 = c0052;
                        m39970.f4746 = c0052.f918;
                        m23937 = this.f14469.m23937(abstractC12612, m39970);
                        break;
                    }
                    String str2 = split[i];
                    if (!EnumC3503.m10687(str2)) {
                        m23937 = this.f14441.f66462;
                        break;
                    }
                    abstractC12612 = abstractC12612 == null ? this.f14458.m39951(this.f14454.f18880.m30652(str2)) : this.f14458.m39912(abstractC12612, this.f14454.f18880.m30652(str2));
                    i++;
                }
                return m23937;
            } finally {
                c22364.m7284(m7284);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 m13331(C1755 c1755, C5557 c5557) {
        C22364 c22364 = this.f14455;
        try {
            if (this.f14479.m32363(c1755, c5557) && m13346() == 0) {
                return this.f14435.m39707(c5557.f17186);
            }
            return null;
        } catch (C10124 unused) {
            c5557.getClass();
            c22364.m7273(c5557, C6241.f19216);
            return null;
        } catch (C11244 e) {
            c5557.getClass();
            String substring = e.f33707.substring(0, 20);
            C12281 c12281 = C6241.f19132;
            c22364.m7273(c5557, new C12281("compiler", "limit.string.overflow", substring));
            return null;
        } catch (C20515 e2) {
            C15240 c15240 = this.f14467;
            c5557.getClass();
            c15240.m36110(c5557, e2);
            return null;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18278 m13342(C1755 c1755, C5557 c5557) {
        InterfaceC18278 mo1708 = this.f14428.mo1708(EnumC21101.CLASS_OUTPUT, c5557.f17186.f42771.toString(), EnumC16866.SOURCE, (InterfaceC7757) null);
        boolean contains = this.f14457.contains(mo1708);
        C22364 c22364 = this.f14455;
        if (contains) {
            C12281 c12281 = C6241.f19132;
            c22364.m7273(c5557, new C12281("compiler", "source.cant.overwrite.input.file", mo1708));
            return null;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(mo1708.mo20796());
        try {
            new C21372(bufferedWriter, true).m48442(c1755.f6075, c5557);
            if (this.f14482) {
                c22364.m50123("wrote.file", mo1708.getName());
            }
            bufferedWriter.close();
            return mo1708;
        } catch (Throwable th) {
            try {
                bufferedWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13336(C1323 c1323, C14163 c14163) {
        boolean z;
        AbstractC10370 abstractC10370 = this.f14477;
        AbstractC10370 abstractC103702 = c14163.f42767;
        C2002 c2002 = this.f14448;
        if (abstractC10370 == abstractC103702) {
            throw new C20515(c14163, new Supplier() { // from class: l.ۚۡ۠
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C4541.this.f14471.m16617(C11886.f35505);
                }
            }, c2002);
        }
        InterfaceC18278 interfaceC18278 = c14163.f42766;
        C22364 c22364 = this.f14455;
        InterfaceC18278 m7284 = c22364.m7284(interfaceC18278);
        if (c1323 == null) {
            try {
                try {
                    c1323 = m13327(interfaceC18278, interfaceC18278.mo7388(false));
                } catch (IOException e) {
                    int i = C11844.f35338;
                    String localizedMessage = e.getLocalizedMessage();
                    if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
                        localizedMessage = e.toString();
                    }
                    C12281 c12281 = C6241.f19132;
                    c22364.m7276(new C12281("compiler", "error.reading.file", interfaceC18278, localizedMessage));
                    c1323 = this.f14458.m39970(C2609.m8239());
                }
            } finally {
                c22364.m7284(m7284);
            }
        }
        C22694 c22694 = this.f14429;
        if (!c22694.m50708()) {
            c22694.m50709(new C20578(EnumC6466.ENTER, c1323));
        }
        if (!this.f14431.m10060(c14163, C2609.of((Object) c1323))) {
            throw new C20515(c14163, new Supplier() { // from class: l.֨ۡ۠
                @Override // java.util.function.Supplier
                public final Object get() {
                    return C4541.this.f14473.m16617(C11886.f35462);
                }
            }, c2002);
        }
        this.f14426.m33126(c14163, C2609.of((Object) c1323));
        if (!c22694.m50708()) {
            c22694.m50707(new C20578(EnumC6466.ENTER, c1323));
        }
        if (this.f14426.m33123(c14163) == null) {
            InterfaceC18278 interfaceC182782 = c1323.f4745;
            EnumC16866 enumC16866 = EnumC16866.SOURCE;
            boolean mo21322 = interfaceC182782.mo21322("package-info", enumC16866);
            boolean mo213222 = c1323.f4745.mo21322("module-info", enumC16866);
            C5931 c5931 = this.f14471;
            if (!mo213222) {
                z = true;
                if (mo21322) {
                    if (this.f14426.m33123(c1323.f4746) == null) {
                        AbstractC5698 m16072 = c14163.m16072();
                        C11576 c11576 = C11886.f35440;
                        throw new C21325(c14163, interfaceC18278, c5931.m16617(new C11576("compiler", "file.does.not.contain.package", m16072)), this.f14471, this.f14448);
                    }
                    this.f14438 = z;
                }
                AbstractC10370 abstractC103703 = c14163.f42767;
                C11576 c115762 = C11886.f35440;
                throw new C21325(c14163, interfaceC18278, c5931.m16617(new C11576("compiler", "file.doesnt.contain.class", abstractC103703)), this.f14471, this.f14448);
            }
            if (this.f14426.m33123(c1323.f4739) == null) {
                throw new C21325(c14163, interfaceC18278, c5931.m16617(C11886.f35456), this.f14471, this.f14448);
            }
        }
        z = true;
        this.f14438 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13335(Set set, LinkedHashSet linkedHashSet, Collection collection) {
        C3267 c3267;
        boolean z = this.f14482;
        C22364 c22364 = this.f14455;
        C22694 c22694 = this.f14429;
        if (!c22694.m50708()) {
            c22694.m50709(new C20578(EnumC6466.COMPILATION));
        }
        if (this.f14475) {
            throw new AssertionError("attempt to reuse JavaCompiler");
        }
        this.f14475 = true;
        StringBuilder sb = new StringBuilder();
        EnumC0121 enumC0121 = EnumC0121.f1177;
        sb.append(enumC0121.f1214);
        sb.append("-");
        EnumC20347 enumC20347 = EnumC20347.OPTIONS;
        sb.append(enumC20347.f65711);
        String sb2 = sb.toString();
        C11781 c11781 = this.f14466;
        c11781.m28828(sb2, "true");
        c11781.m28837(enumC0121.f1214 + enumC20347.f65711);
        this.f14427 = System.currentTimeMillis();
        try {
            try {
                m13334(set, linkedHashSet);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    c3267 = this.f14431;
                    if (!hasNext) {
                        break;
                    }
                    String str = (String) it.next();
                    int indexOf = str.indexOf(47);
                    if (indexOf != -1) {
                        c3267.m10058(str.substring(0, indexOf));
                    }
                }
                Iterator it2 = ((C2609) collection).iterator();
                while (it2.hasNext()) {
                    c3267.m10058((String) it2.next());
                }
                EnumC21592 enumC21592 = EnumC21592.ENTER;
                C2609 m13329 = m13329(set, false);
                if (m13341(enumC21592)) {
                    m13329 = C2609.m8239();
                }
                m13344(m13329);
                if (m13341(enumC21592)) {
                    m13329 = C2609.m8239();
                }
                m13338(m13329);
                m13339(m13329, (Collection) linkedHashSet);
                if (c22694.m50708() && this.f14434 == EnumC20064.NONE) {
                    this.f14447.m13933(this.f14457);
                }
                if (!EnumC21592.ATTR.m48773(this.f14464)) {
                    int ordinal = this.f14484.ordinal();
                    if (ordinal == 0) {
                        C4767 c4767 = this.f14447;
                        C18837 c18837 = new C18837();
                        while (!c4767.isEmpty()) {
                            c18837.m43511(m13328((C1755) c4767.remove()));
                        }
                        if (m13341(EnumC21592.ATTR)) {
                            c18837 = new C18837();
                        }
                        C18837 c188372 = new C18837();
                        Iterator it3 = c18837.iterator();
                        while (it3.hasNext()) {
                            m13337((C1755) it3.next(), c188372);
                        }
                        if (m13341(EnumC21592.FLOW)) {
                            c188372 = new C18837();
                        }
                        m13343(m13326(c188372));
                    } else if (ordinal == 1) {
                        LinkedList m13934 = this.f14447.m13934();
                        while (!m13934.isEmpty() && !m13341(EnumC21592.ATTR)) {
                            Queue queue = (Queue) m13934.remove();
                            C18837 c188373 = new C18837();
                            while (!queue.isEmpty()) {
                                c188373.m43511(m13328((C1755) queue.remove()));
                            }
                            if (m13341(EnumC21592.ATTR)) {
                                c188373 = new C18837();
                            }
                            C18837 c188374 = new C18837();
                            Iterator it4 = c188373.iterator();
                            while (it4.hasNext()) {
                                m13337((C1755) it4.next(), c188374);
                            }
                            if (m13341(EnumC21592.FLOW)) {
                                c188374 = new C18837();
                            }
                            m13343(m13326(c188374));
                        }
                    } else {
                        if (ordinal != 2) {
                            C12171.m29640("unknown compile policy");
                            throw null;
                        }
                        while (!this.f14447.isEmpty()) {
                            C1755 m13328 = m13328((C1755) this.f14447.remove());
                            C18837 c188375 = new C18837();
                            m13337(m13328, c188375);
                            if (m13341(EnumC21592.FLOW)) {
                                c188375 = new C18837();
                            }
                            m13343(m13326(c188375));
                        }
                    }
                }
                if (z) {
                    c22364.m50123("total", Long.toString(System.currentTimeMillis() - this.f14427));
                }
                m13347();
                if (!c22364.m50124()) {
                    m13333(m13346(), d.O);
                    m13333(c22364.f72451, "warn");
                    m13319(m13346(), c22364.f72465, "count.error.recompile");
                    m13319(c22364.f72451, c22364.f72466, "count.warn.recompile");
                }
                if (!c22694.m50708()) {
                    c22694.m50707(new C20578(EnumC6466.COMPILATION));
                }
                m13332();
                C1302 c1302 = this.f14460;
                if (c1302 != null) {
                    c1302.close();
                }
            } catch (C6430 e) {
                if (this.f14436) {
                    e.printStackTrace(System.err);
                }
                if (z) {
                    c22364.m50123("total", Long.toString(System.currentTimeMillis() - this.f14427));
                }
                m13347();
                if (!c22364.m50124()) {
                    m13333(m13346(), d.O);
                    m13333(c22364.f72451, "warn");
                    m13319(m13346(), c22364.f72465, "count.error.recompile");
                    m13319(c22364.f72451, c22364.f72466, "count.warn.recompile");
                }
                if (!c22694.m50708()) {
                    c22694.m50707(new C20578(EnumC6466.COMPILATION));
                }
                m13332();
                C1302 c13022 = this.f14460;
                if (c13022 != null) {
                    c13022.close();
                }
            }
        } catch (Throwable th) {
            if (z) {
                c22364.m50123("total", Long.toString(System.currentTimeMillis() - this.f14427));
            }
            m13347();
            if (!c22364.m50124()) {
                m13333(m13346(), d.O);
                m13333(c22364.f72451, "warn");
                m13319(m13346(), c22364.f72465, "count.error.recompile");
                m13319(c22364.f72451, c22364.f72466, "count.warn.recompile");
            }
            if (!c22694.m50708()) {
                c22694.m50707(new C20578(EnumC6466.COMPILATION));
            }
            m13332();
            C1302 c13023 = this.f14460;
            if (c13023 != null) {
                c13023.close();
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2609 m13329(Set set, boolean z) {
        CharSequence charSequence;
        if (!z && m13341(EnumC21592.PARSE)) {
            return C2609.m8239();
        }
        C18837 c18837 = new C18837();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC18278 interfaceC18278 = (InterfaceC18278) it.next();
            if (!hashSet.contains(interfaceC18278)) {
                hashSet.add(interfaceC18278);
                C22364 c22364 = this.f14455;
                InterfaceC18278 m7284 = c22364.m7284(interfaceC18278);
                try {
                    try {
                        this.f14457.add(interfaceC18278);
                        charSequence = interfaceC18278.mo7388(false);
                    } catch (IOException e) {
                        int i = C11844.f35338;
                        String localizedMessage = e.getLocalizedMessage();
                        if (localizedMessage == null && (localizedMessage = e.getMessage()) == null) {
                            localizedMessage = e.toString();
                        }
                        C12281 c12281 = C6241.f19132;
                        c22364.m7276(new C12281("compiler", "error.reading.file", interfaceC18278, localizedMessage));
                        charSequence = null;
                    }
                    C1323 m13327 = m13327(interfaceC18278, charSequence);
                    AbstractC12117 abstractC12117 = m13327.f4743;
                    if (abstractC12117 != null) {
                        c22364.m50114(interfaceC18278, abstractC12117);
                    }
                    c22364.m7284(m7284);
                    c18837.m43511(m13327);
                } catch (Throwable th) {
                    c22364.m7284(m7284);
                    throw th;
                }
            }
        }
        return c18837.m43517();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m13345() {
        return !m13341(EnumC21592.ATTR);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13344(C2609 c2609) {
        this.f14431.m10057(c2609);
        if (c2609.isEmpty()) {
            this.f14453.m32414();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13338(C2609 c2609) {
        C22694 c22694 = this.f14429;
        if (!c22694.m50708()) {
            Iterator it = c2609.iterator();
            while (it.hasNext()) {
                c22694.m50709(new C20578(EnumC6466.ENTER, (C1323) it.next()));
            }
        }
        this.f14426.m33126((C14163) null, c2609);
        this.f14453.m32414();
        if (!c22694.m50708()) {
            Iterator it2 = c2609.iterator();
            while (it2.hasNext()) {
                c22694.m50707(new C20578(EnumC6466.ENTER, (C1323) it2.next()));
            }
        }
        if (this.f14474) {
            C18837 c18837 = new C18837();
            Iterator it3 = c2609.iterator();
            while (it3.hasNext()) {
                for (C2609 c26092 = ((C1323) it3.next()).f4738; c26092.m8249(); c26092 = c26092.f8241) {
                    Object obj = c26092.f8240;
                    if (obj instanceof C5557) {
                        c18837.m43511((C5557) obj);
                    }
                }
            }
            this.f14451 = c18837.m43517();
        }
        Iterator it4 = c2609.iterator();
        while (it4.hasNext()) {
            this.f14457.add(((C1323) it4.next()).f4745);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13334(Collection collection, Collection collection2) {
        EnumC0121 enumC0121 = EnumC0121.f1200;
        C11781 c11781 = this.f14466;
        if (c11781.m28829(enumC0121, "none")) {
            this.f14485 = false;
            return;
        }
        if (this.f14460 == null) {
            C1302 m4494 = C1302.m4494(this.f14450);
            this.f14460 = m4494;
            m4494.m4523();
            boolean m4522 = this.f14460.m4522();
            this.f14485 = m4522;
            if (m4522) {
                c11781.m28828("parameters", "parameters");
                this.f14478.f64786 = true;
                this.f14452 = true;
                this.f14481 = true;
                C22694 c22694 = this.f14429;
                if (!c22694.m50708()) {
                    c22694.m50709(new C20578(EnumC6466.ANNOTATION_PROCESSING));
                }
                this.f14463 = new C5431(this.f14455, null);
                this.f14460.m4526().m39559(collection, collection2);
                return;
            }
            this.f14460.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007b A[Catch: ᩷֡֨ -> 0x014b, TryCatch #0 {᩷֡֨ -> 0x014b, blocks: (B:20:0x005d, B:22:0x006b, B:24:0x006f, B:29:0x007b, B:31:0x0099, B:32:0x009e, B:34:0x00a4, B:37:0x00b2, B:39:0x00b8, B:48:0x00bc, B:53:0x00ff, B:42:0x010e, B:44:0x0112, B:78:0x0125, B:83:0x013e, B:87:0x0145, B:88:0x014a, B:82:0x0135, B:73:0x00c3, B:51:0x00c6, B:64:0x00cc, B:70:0x00d0, B:67:0x00d7, B:57:0x00de, B:60:0x00e5), top: B:19:0x005d, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: ᩷֡֨ -> 0x014b, TryCatch #0 {᩷֡֨ -> 0x014b, blocks: (B:20:0x005d, B:22:0x006b, B:24:0x006f, B:29:0x007b, B:31:0x0099, B:32:0x009e, B:34:0x00a4, B:37:0x00b2, B:39:0x00b8, B:48:0x00bc, B:53:0x00ff, B:42:0x010e, B:44:0x0112, B:78:0x0125, B:83:0x013e, B:87:0x0145, B:88:0x014a, B:82:0x0135, B:73:0x00c3, B:51:0x00c6, B:64:0x00cc, B:70:0x00d0, B:67:0x00d7, B:57:0x00de, B:60:0x00e5), top: B:19:0x005d, inners: #1, #2 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13339(l.C2609 r14, java.util.Collection r15) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4541.m13339(l.ۖܶ۠, java.util.Collection):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13320(C11781 c11781) {
        if (c11781.m28832(EnumC0121.f1158) || c11781.m28832(EnumC0121.f1181) || c11781.m28832(EnumC0121.f1155)) {
            return true;
        }
        EnumC0121 enumC0121 = EnumC0121.f1200;
        return c11781.m28829(enumC0121, "only") || c11781.m28829(enumC0121, "full") || c11781.m28832(EnumC0121.f1206) || c11781.m28832(EnumC0121.f1156);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13340(C5431 c5431) {
        this.f14463 = c5431;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1755 m13328(C1755 c1755) {
        EnumC21592 enumC21592 = EnumC21592.ATTR;
        C22297 c22297 = this.f14443;
        if (c22297.m50019(c1755, enumC21592)) {
            return c1755;
        }
        boolean z = this.f14476;
        C22364 c22364 = this.f14455;
        if (z) {
            c22364.m50115(EnumC21659.NOTICE, "[attribute " + c1755.f6079.f17186 + "]");
        }
        if (this.f14482) {
            c22364.m50123("checking.attribution", c1755.f6079.f17186);
        }
        C22694 c22694 = this.f14429;
        if (!c22694.m50708()) {
            c22694.m50709(new C20578(EnumC6466.ANALYZE, c1755.f6075, c1755.f6079.f17186));
        }
        InterfaceC18278 interfaceC18278 = c1755.f6079.f17186.f42770;
        if (interfaceC18278 == null) {
            interfaceC18278 = c1755.f6075.f4745;
        }
        InterfaceC18278 m7284 = c22364.m7284(interfaceC18278);
        try {
            this.f14469.m23942(c1755);
            if (m13346() > 0 && !m13341(enumC21592)) {
                this.f14469.m23957(c1755.f6074);
            }
            c22297.put(c1755, enumC21592);
            return c1755;
        } finally {
            c22364.m7284(m7284);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13337(C1755 c1755, C18837 c18837) {
        C20578 c20578;
        C22694 c22694 = this.f14429;
        EnumC21592 enumC21592 = EnumC21592.FLOW;
        C22297 c22297 = this.f14443;
        if (c22297.m50019(c1755, enumC21592)) {
            c18837.m43511(c1755);
            return;
        }
        try {
            if (!m13341(enumC21592)) {
                boolean z = this.f14476;
                C22364 c22364 = this.f14455;
                if (z) {
                    c22364.m50115(EnumC21659.NOTICE, "[flow " + c1755.f6079.f17186 + "]");
                }
                InterfaceC18278 interfaceC18278 = c1755.f6079.f17186.f42770;
                if (interfaceC18278 == null) {
                    interfaceC18278 = c1755.f6075.f4745;
                }
                InterfaceC18278 m7284 = c22364.m7284(interfaceC18278);
                try {
                    C17013 c17013 = this.f14458;
                    c17013.f52172 = 0;
                    this.f14461.m25665(c1755, c17013.m39931(c1755.f6075));
                    c22297.put(c1755, enumC21592);
                    if (!m13341(enumC21592)) {
                        this.f14430.m12721(c1755);
                        c18837.m43511(c1755);
                        if (c22694.m50708()) {
                            return;
                        } else {
                            c20578 = new C20578(EnumC6466.ANALYZE, c1755.f6075, c1755.f6079.f17186);
                        }
                    } else if (c22694.m50708()) {
                        return;
                    } else {
                        c20578 = new C20578(EnumC6466.ANALYZE, c1755.f6075, c1755.f6079.f17186);
                    }
                } finally {
                    c22364.m7284(m7284);
                }
            } else if (c22694.m50708()) {
                return;
            } else {
                c20578 = new C20578(EnumC6466.ANALYZE, c1755.f6075, c1755.f6079.f17186);
            }
            c22694.m50707(c20578);
        } catch (Throwable th) {
            if (!c22694.m50708()) {
                c22694.m50707(new C20578(EnumC6466.ANALYZE, c1755.f6075, c1755.f6079.f17186));
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01a9, code lost:
    
        if (m13341(l.EnumC21592.LOWER) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ac, code lost:
    
        r2 = r13.f14483.m51650(r1, r1.f6074, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b6, code lost:
    
        if (r2.f8240 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b8, code lost:
    
        l.C12171.m29642(r2.f8241.isEmpty());
        r3 = new l.C23069(r1, (l.C5557) r2.f8240);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Queue m13326(java.util.Queue r14) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4541.m13326(java.util.Queue):java.util.Queue");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m13343(Queue queue) {
        C8796 c8796 = this.f14456;
        if (m13341(EnumC21592.GENERATE)) {
            return;
        }
        Iterator it = queue.iterator();
        while (it.hasNext()) {
            C23069 c23069 = (C23069) it.next();
            C1755 c1755 = (C1755) c23069.f74207;
            C5557 c5557 = (C5557) c23069.f74208;
            boolean z = this.f14476;
            boolean z2 = this.f14474;
            C22364 c22364 = this.f14455;
            if (z) {
                StringBuilder sb = new StringBuilder("[generate ");
                sb.append(z2 ? " source" : "code");
                sb.append(" ");
                sb.append(c5557.f17186);
                sb.append("]");
                c22364.m50115(EnumC21659.NOTICE, sb.toString());
            }
            C22694 c22694 = this.f14429;
            if (!c22694.m50708()) {
                c22694.m50709(new C20578(EnumC6466.GENERATE, c1755.f6075, c5557.f17186));
            }
            InterfaceC18278 interfaceC18278 = c1755.f6079.f17186.f42770;
            if (interfaceC18278 == null) {
                interfaceC18278 = c1755.f6075.f4745;
            }
            InterfaceC18278 m7284 = c22364.m7284(interfaceC18278);
            if (z2) {
                try {
                    try {
                        m13342(c1755, c5557);
                    } catch (IOException e) {
                        c5557.getClass();
                        C14163 c14163 = c5557.f17186;
                        String message = e.getMessage();
                        C12281 c12281 = C6241.f19132;
                        c22364.m7273(c5557, new C12281("compiler", "class.cant.write", c14163, message));
                        c22364.m7284(m7284);
                        return;
                    }
                } catch (Throwable th) {
                    c22364.m7284(m7284);
                    throw th;
                }
            } else {
                if (this.f14428.mo1710(EnumC21101.NATIVE_HEADER_OUTPUT) && c8796.m22702(c5557.f17186)) {
                    c8796.m22703(c5557.f17186);
                }
                m13331(c1755, c5557);
            }
            c22364.m7284(m7284);
            if (!c22694.m50708()) {
                c22694.m50707(new C20578(EnumC6466.GENERATE, c1755.f6075, c5557.f17186));
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m13347() {
        int m13346 = m13346();
        C22364 c22364 = this.f14455;
        if (m13346 == 0 && this.f14465 && this.f14438 && this.f14434 == EnumC20064.UNSET) {
            if (this.f14440 || m13320(this.f14466)) {
                c22364.m7275(C14001.f42332);
            } else {
                c22364.m7275(C14001.f42337);
            }
        }
        this.f14467.m36175();
        this.f14468.m51352();
        if (c22364.f72460) {
            c22364.m7278((InterfaceC18278) null, C23174.f74467);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC10370 m13323(C4541 c4541, InterfaceC18278 interfaceC18278) {
        return c4541.m13318(interfaceC18278, new C8069(0));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC10370 m13317(C4541 c4541, InterfaceC18278 interfaceC18278) {
        return c4541.m13318(interfaceC18278, new C2286(10));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC10370 m13318(InterfaceC18278 interfaceC18278, Function function) {
        C22364 c22364 = this.f14455;
        C8253 c8253 = new C8253(c22364);
        InterfaceC18278 m7284 = c22364.m7284(interfaceC18278);
        try {
            AbstractC10370 abstractC10370 = (AbstractC10370) function.apply(m13327(interfaceC18278, interfaceC18278.mo7388(false)));
            c22364.m50112(c8253);
            c22364.m7284(m7284);
            return abstractC10370;
        } catch (IOException unused) {
            c22364.m50112(c8253);
            c22364.m7284(m7284);
            return null;
        } catch (Throwable th) {
            c22364.m50112(c8253);
            c22364.m7284(m7284);
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13332() {
        C5931 c5931 = this.f14471;
        C23570 c23570 = null;
        this.f14451 = null;
        this.f14446 = null;
        this.f14478 = null;
        this.f14458 = null;
        this.f14435 = null;
        this.f14426 = null;
        C4767 c4767 = this.f14447;
        if (c4767 != null) {
            c4767.clear();
        }
        this.f14447 = null;
        this.f14470 = null;
        this.f14441 = null;
        this.f14437 = null;
        this.f14469 = null;
        this.f14467 = null;
        this.f14479 = null;
        this.f14461 = null;
        this.f14462 = null;
        this.f14483 = null;
        this.f14453 = null;
        this.f14480 = null;
        this.f14455.m50122();
        try {
            try {
                this.f14428.flush();
                C6136 c6136 = this.f14454;
                if (c6136 != null) {
                    c6136.f18880.mo15928();
                }
                this.f14454 = null;
                Iterator it = this.f14459.iterator();
                while (it.hasNext()) {
                    try {
                        ((Closeable) it.next()).close();
                    } catch (IOException e) {
                        if (c23570 == null) {
                            c23570 = new C23570(c5931.m16617(C11886.f35497).toString(), e);
                        } else {
                            c23570.addSuppressed(e);
                        }
                    }
                }
                if (c23570 != null) {
                    throw c23570;
                }
                this.f14459 = C2609.m8239();
            } catch (IOException e2) {
                throw new C6430(e2);
            }
        } catch (Throwable th) {
            C6136 c61362 = this.f14454;
            if (c61362 != null) {
                c61362.f18880.mo15928();
            }
            this.f14454 = null;
            Iterator it2 = this.f14459.iterator();
            while (it2.hasNext()) {
                try {
                    ((Closeable) it2.next()).close();
                } catch (IOException e3) {
                    if (c23570 == null) {
                        c23570 = new C23570(c5931.m16617(C11886.f35497).toString(), e3);
                    } else {
                        c23570.addSuppressed(e3);
                    }
                }
            }
            if (c23570 != null) {
                throw c23570;
            }
            this.f14459 = C2609.m8239();
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13333(int i, String str) {
        if (i != 0) {
            String concat = i == 1 ? "count.".concat(str) : C4860.m14172("count.", str, ".plural");
            EnumC21659 enumC21659 = EnumC21659.ERROR;
            Object[] objArr = {String.valueOf(i)};
            C22364 c22364 = this.f14455;
            C22364.m50100(c22364.m50107(enumC21659), c22364.m50109(EnumC15307.COMPILER_MISC, concat, objArr));
            c22364.m50107(enumC21659).flush();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m13319(int i, int i2, String str) {
        if (i2 > 0) {
            EnumC21659 enumC21659 = EnumC21659.ERROR;
            Object[] objArr = {String.valueOf(i), String.valueOf(i2 + i)};
            C22364 c22364 = this.f14455;
            C22364.m50100(c22364.m50107(enumC21659), c22364.m50109(EnumC15307.COMPILER_MISC, str, objArr));
            c22364.m50107(enumC21659).flush();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1323 m13327(InterfaceC18278 interfaceC18278, CharSequence charSequence) {
        long currentTimeMillis = System.currentTimeMillis();
        C1323 m39970 = this.f14458.m39970(C2609.m8239());
        C22694 c22694 = this.f14429;
        if (charSequence != null) {
            C22364 c22364 = this.f14455;
            boolean z = this.f14482;
            if (z) {
                c22364.m50123("parsing.started", interfaceC18278);
            }
            if (!c22694.m50708()) {
                c22694.m50709(new C20578(EnumC6466.PARSE, interfaceC18278));
                this.f14452 = true;
                this.f14481 = true;
            }
            m39970 = this.f14470.m36960(charSequence, this.f14452 || this.f14474, this.f14481, this.f14442, interfaceC18278.mo21322("module-info", EnumC16866.SOURCE)).m33988();
            if (z) {
                c22364.m50123("parsing.done", Long.toString(System.currentTimeMillis() - currentTimeMillis));
            }
        }
        m39970.f4745 = interfaceC18278;
        if (charSequence != null && !c22694.m50708()) {
            c22694.m50707(new C20578(EnumC6466.PARSE, m39970));
        }
        return m39970;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m13348() {
        this.f14457.clear();
        this.f14447.clear();
    }
}

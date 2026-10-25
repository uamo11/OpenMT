package l;

import java.io.Closeable;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: 640U */
/* renamed from: l.֨ᩴ۠, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1302 implements InterfaceC15496, Closeable {

    /* renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f4634 = Pattern.compile("(\\P{all})+");

    /* renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public final HashSet f4636;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C22364 f4637;

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public EnumC16280 f4638;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C2002 f4639;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2903 f4641;

    /* renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final C6319 f4642;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f4643;

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final boolean f4644;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final boolean f4645;

    /* renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public final boolean f4646;

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public ServiceLoader f4647;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public SecurityException f4648;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C13809 f4649;

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C17530 f4650;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f4651;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21290 f4652;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C16118 f4653;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6403 f4654;

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final Set f4655;

    /* renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public final boolean f4656;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final boolean f4657;

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C3267 f4658;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C11781 f4659;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C6136 f4660;

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final C20661 f4661;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C22694 f4662;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C4541 f4663;

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public ClassLoader f4664;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13395 f4665;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15240 f4666;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C16824 f4667;

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final boolean f4668;

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public Set f4640 = Collections.EMPTY_SET;

    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final C14190 f4635 = new C6947(this);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ void m4499(C1302 c1302, InterfaceC21848 interfaceC21848, C8358 c8358) {
        c1302.m4500(interfaceC21848, Collections.EMPTY_SET, c8358);
    }

    public final String toString() {
        return "javac ProcessingEnvironment";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m4495(C1302 c1302, C2609 c2609) {
        c1302.getClass();
        C2609 m8239 = C2609.m8239();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C1323 c1323 = (C1323) it.next();
            if (c1323.f4745.mo21322("package-info", EnumC16866.SOURCE)) {
                m8239 = m8239.m8246(c1323.f4746);
            }
        }
        return m8239.m8250();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2609 m4509(C1302 c1302, C2609 c2609) {
        c1302.getClass();
        C2609 m8239 = C2609.m8239();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C1323) it.next()).f4738.iterator();
            while (it2.hasNext()) {
                AbstractC5144 abstractC5144 = (AbstractC5144) it2.next();
                if (abstractC5144.m14709(EnumC18550.f57582)) {
                    C14163 c14163 = ((C5557) abstractC5144).f17186;
                    C12171.m29637(c14163);
                    m8239 = m8239.m8246(c14163);
                }
            }
        }
        return m8239.m8250();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1302 m4494(C2903 c2903) {
        C1302 c1302 = (C1302) c2903.m8837(C1302.class);
        return c1302 == null ? new C1302(c2903) : c1302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1302(C2903 c2903) {
        String str;
        this.f4641 = c2903;
        c2903.m8839(C1302.class, this);
        this.f4637 = C22364.m50099(c2903);
        EnumC16280 m38301 = EnumC16280.m38301(c2903);
        this.f4638 = m38301;
        C5931.m16615(c2903);
        C11781 m28823 = C11781.m28823(c2903);
        this.f4659 = m28823;
        this.f4668 = m28823.m28832(EnumC0121.f1182);
        this.f4644 = m28823.m28832(EnumC0121.f1134);
        this.f4646 = m28823.m28832(EnumC0121.f1141);
        this.f4645 = C4824.m14050(c2903).m14055(EnumC20347.PROCESSING);
        C4541 m13316 = C4541.m13316(c2903);
        this.f4663 = m13316;
        if (m28823.m28829(EnumC0121.f1200, "only") || m28823.m28832(EnumC0121.f1156)) {
            m13316.f14464 = EnumC21592.PROCESS;
        }
        this.f4643 = m28823.m28831("fatalEnterError");
        this.f4657 = m28823.m28831("showResolveErrors");
        this.f4656 = m28823.m28832(EnumC0121.f1169);
        this.f4651 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        String str2 = EnumC10637.f32009.m26686(m38301) ? "java.base/" : "";
        String[] strArr = {str2.concat("java.lang.Deprecated"), str2.concat("java.lang.FunctionalInterface"), str2.concat("java.lang.Override"), str2.concat("java.lang.SafeVarargs"), str2.concat("java.lang.SuppressWarnings"), str2.concat("java.lang.annotation.Documented"), str2.concat("java.lang.annotation.Inherited"), str2.concat("java.lang.annotation.Native"), str2.concat("java.lang.annotation.Repeatable"), str2.concat("java.lang.annotation.Retention"), str2.concat("java.lang.annotation.Target"), str2.concat("java.io.Serial")};
        HashSet hashSet = new HashSet(12);
        for (int i = 0; i < 12; i++) {
            String str3 = strArr[i];
            C11003.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        this.f4655 = C20195.unmodifiableSet(hashSet);
        this.f4667 = new C16824(c2903);
        C17530 c17530 = new C17530();
        c17530.f53540 = 0;
        c17530.f53541 = C22364.m50099(c2903);
        c17530.f53542 = this;
        this.f4650 = c17530;
        this.f4652 = C21290.m48319(c2903);
        int i2 = C21995.f70419;
        if (((C21995) c2903.m8837(C21995.class)) == null) {
            c2903.m8839(C21995.class, new C21995());
            C20661.m47250(c2903);
            C6319.m17456(c2903);
        }
        this.f4658 = C3267.m10022(c2903);
        this.f4642 = C6319.m17456(c2903);
        this.f4665 = C13395.m32391(c2903);
        Set<String> m28826 = this.f4659.m28826();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str4 : m28826) {
            if (str4.startsWith("-A") && str4.length() > 2) {
                int indexOf = str4.indexOf(61);
                if (indexOf == -1) {
                    r8 = str4.substring(2);
                    str = null;
                } else if (indexOf >= 3) {
                    String substring = str4.substring(2, indexOf);
                    str = indexOf < str4.length() + (-1) ? str4.substring(indexOf + 1) : null;
                    r8 = substring;
                } else {
                    str = null;
                }
                linkedHashMap.put(r8, str);
            }
        }
        InterfaceC5808 interfaceC5808 = (InterfaceC5808) this.f4641.m8837(InterfaceC5808.class);
        if (interfaceC5808 != null) {
            Iterator it = interfaceC5808.m16303().iterator();
            while (it.hasNext()) {
                linkedHashMap.putAll(((InterfaceC10042) it.next()).m25212());
            }
        }
        Map unmodifiableMap = C20195.unmodifiableMap(linkedHashMap);
        HashSet hashSet2 = new HashSet();
        hashSet2.addAll(unmodifiableMap.keySet());
        this.f4636 = hashSet2;
        C14602.m34851(c2903);
        this.f4662 = C22694.m50706(c2903);
        this.f4661 = C20661.m47250(c2903);
        this.f4639 = C2002.m6532(c2903);
        this.f4660 = C6136.m17057(c2903);
        this.f4649 = C13809.m33121(c2903);
        this.f4654 = C19914.m45820(c2903).m45828();
        this.f4666 = C15240.m36054(c2903);
        C23168.m51341(c2903);
        InterfaceC11223 interfaceC11223 = this.f4651;
        try {
            EnumC21101 enumC21101 = EnumC21101.ANNOTATION_PROCESSOR_MODULE_PATH;
            if (interfaceC11223.mo1710(enumC21101)) {
                try {
                    this.f4647 = interfaceC11223.mo1704(enumC21101, InterfaceC21848.class);
                    return;
                } catch (IOException e) {
                    throw new C6430(e);
                }
            }
            EnumC21101 enumC211012 = EnumC21101.ANNOTATION_PROCESSOR_PATH;
            ClassLoader mo1716 = interfaceC11223.mo1710(enumC211012) ? interfaceC11223.mo1716(enumC211012) : interfaceC11223.mo1716(EnumC21101.CLASS_PATH);
            this.f4664 = mo1716;
            if (mo1716 == 0 || !(mo1716 instanceof Closeable)) {
                return;
            }
            C4541 c4541 = this.f4663;
            c4541.f14459 = c4541.f14459.m8246((Closeable) mo1716);
        } catch (SecurityException e2) {
            this.f4648 = e2;
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m4523() {
        Iterator it;
        C12171.m29644(this.f4653);
        EnumC0121 enumC0121 = EnumC0121.f1156;
        C11781 c11781 = this.f4659;
        if (c11781.m28832(enumC0121)) {
            try {
                it = C2609.of((Object) new C13296()).iterator();
            } catch (Throwable th) {
                AssertionError assertionError = new AssertionError("Problem instantiating PrintingProcessor.");
                assertionError.initCause(th);
                throw assertionError;
            }
        } else {
            SecurityException securityException = this.f4648;
            if (securityException == null) {
                String m28825 = c11781.m28825(EnumC0121.f1158);
                boolean mo1710 = this.f4651.mo1710(EnumC21101.ANNOTATION_PROCESSOR_MODULE_PATH);
                C22364 c22364 = this.f4637;
                if (mo1710) {
                    if (m28825 == null) {
                        it = new C5536(this.f4647, c22364);
                    } else {
                        it = new C18942(this.f4647, c22364, m28825);
                    }
                } else if (m28825 == null) {
                    ClassLoader classLoader = this.f4664;
                    C5536 c5536 = new C5536();
                    c5536.f17131 = c22364;
                    try {
                        try {
                            ServiceLoader load = ServiceLoader.load(InterfaceC21848.class, classLoader);
                            c5536.f17133 = load;
                            c5536.f17132 = load.iterator();
                            it = c5536;
                        } catch (Exception unused) {
                            c5536.f17132 = m4508("proc.no.service", (Exception) null);
                            it = c5536;
                        }
                    } catch (Throwable th2) {
                        c22364.m7276(C6241.f19168);
                        throw new C6430(th2);
                    }
                } else {
                    C4125 c4125 = new C4125();
                    c4125.f13081 = null;
                    c4125.f13083 = Arrays.asList(m28825.split(",")).iterator();
                    c4125.f13080 = this.f4664;
                    c4125.f13082 = c22364;
                    it = c4125;
                }
            } else {
                it = m4508("proc.cant.create.loader", securityException);
            }
        }
        InterfaceC5808 interfaceC5808 = (InterfaceC5808) this.f4641.m8837(InterfaceC5808.class);
        List list = Collections.EMPTY_LIST;
        if (interfaceC5808 != null) {
            list = C5378.stream(interfaceC5808.m16303()).map(new C18865(5)).toList();
        }
        this.f4653 = new C16118(this, C22159.m49777(C2609.of((Object) it, (Object) list.iterator()), new C11653(3)));
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ServiceLoader m4525() {
        EnumC21101 enumC21101 = EnumC21101.ANNOTATION_PROCESSOR_MODULE_PATH;
        InterfaceC11223 interfaceC11223 = this.f4651;
        if (interfaceC11223.mo1710(enumC21101)) {
            try {
                return interfaceC11223.mo1704(enumC21101, InterfaceC23399.class);
            } catch (IOException e) {
                throw new C6430(e);
            }
        }
        return ServiceLoader.load(InterfaceC23399.class, this.f4664);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Iterator m4508(String str, Exception exc) {
        Collection mo28938;
        InterfaceC11223 interfaceC11223 = this.f4651;
        if (interfaceC11223 instanceof C11844) {
            C11844 c11844 = (C11844) interfaceC11223;
            EnumC21101 enumC21101 = EnumC21101.ANNOTATION_PROCESSOR_PATH;
            if (c11844.mo1710(enumC21101)) {
                mo28938 = c11844.mo28938((InterfaceC2050) enumC21101);
            } else {
                mo28938 = c11844.mo28938((InterfaceC2050) EnumC21101.CLASS_PATH);
            }
            if (this.f4659.m28825(EnumC0121.f1158) == null) {
                URL[] urlArr = new URL[1];
                Iterator it = mo28938.iterator();
                while (it.hasNext()) {
                    try {
                        urlArr[0] = ((InterfaceC20758) it.next()).toUri().toURL();
                        if (!C10475.m26366(urlArr)) {
                        }
                    } catch (MalformedURLException e) {
                        throw new AssertionError(e);
                    } catch (C12591 e2) {
                        this.f4637.m7276(C6241.m17192(e2.getLocalizedMessage()));
                    }
                }
                return Collections.EMPTY_LIST.iterator();
            }
            m4497(str, exc);
            throw null;
        }
        m4497(str, exc);
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m4497(String str, Exception exc) {
        C22364 c22364 = this.f4637;
        if (exc != null) {
            c22364.m7271(str, exc.getLocalizedMessage());
            throw new C6430(exc);
        }
        c22364.m7271(str, new Object[0]);
        throw new C6430();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m4522() {
        C16118 c16118 = this.f4653;
        c16118.getClass();
        return c16118.f49661.iterator().hasNext() || c16118.f49662.hasNext();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4498(C1302 c1302, LinkedHashSet linkedHashSet, C2609 c2609, C2609 c26092, C2609 c26093) {
        C22364 c22364 = c1302.f4637;
        HashMap hashMap = new HashMap(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (true) {
            String str = "";
            if (!it.hasNext()) {
                break;
            }
            InterfaceC9169 interfaceC9169 = (InterfaceC9169) it.next();
            InterfaceC17635 m48322 = c1302.f4652.m48322(interfaceC9169);
            if (EnumC10637.f32009.m26686(c1302.f4638) && m48322 != null) {
                str = ((Object) m48322.mo957()) + "/";
            }
            StringBuilder m15339 = C5368.m15339(str);
            m15339.append(interfaceC9169.mo957().toString());
            hashMap.put(m15339.toString(), interfaceC9169);
        }
        if (hashMap.size() == 0) {
            hashMap.put("", null);
        }
        C16118 c16118 = c1302.f4653;
        c16118.getClass();
        C9064 c9064 = new C9064(c16118, c16118);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(c2609);
        linkedHashSet2.addAll(c26092);
        linkedHashSet2.addAll(c26093);
        C8358 c8358 = new C8358(false, false, C20195.unmodifiableSet(linkedHashSet2), c1302);
        while (hashMap.size() > 0 && c9064.hasNext()) {
            C19648 next = c9064.next();
            HashSet hashSet = new HashSet();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                if (next.m45164(str2)) {
                    hashSet.add(str2);
                    InterfaceC9169 interfaceC91692 = (InterfaceC9169) entry.getValue();
                    if (interfaceC91692 != null) {
                        linkedHashSet3.add(interfaceC91692);
                    }
                }
            }
            if (hashSet.size() > 0 || next.f63396) {
                boolean m4500 = c1302.m4500(next.f63397, linkedHashSet3, c8358);
                next.f63396 = true;
                next.m45163(c1302.f4636);
                if (c1302.f4668 || c1302.f4646) {
                    c22364.m50118("x.print.processor.info", next.f63397.getClass().getName(), hashSet.toString(), Boolean.valueOf(m4500));
                }
                if (m4500) {
                    hashMap.keySet().removeAll(hashSet);
                }
            }
        }
        hashMap.remove("");
        if (c1302.f4645 && hashMap.size() > 0) {
            hashMap.keySet().removeAll(c1302.f4655);
            if (hashMap.size() > 0) {
                Set keySet = hashMap.keySet();
                C11076 c11076 = C14001.f42334;
                c22364.m7275(new C11076("compiler", "proc.annotations.without.processors", keySet));
            }
        }
        Iterator it2 = c9064.f27483;
        if (c9064.f27484) {
            return;
        }
        Set set = Collections.EMPTY_SET;
        while (it2.hasNext()) {
            C19648 c19648 = (C19648) it2.next();
            if (c19648.f63396) {
                m4499(c9064.f27481.f49660, c19648.f63397, c8358);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m4500(InterfaceC21848 interfaceC21848, Set set, C8358 c8358) {
        C22364 c22364 = this.f4637;
        C2002 c2002 = this.f4639;
        InterfaceC7213 m6533 = c2002.m6533(c2002.f6699);
        try {
            try {
                interfaceC21848.mo32267(c8358);
                return true;
            } finally {
                c2002.m6533(m6533);
            }
        } catch (C21325 e) {
            AbstractC5698 abstractC5698 = e.f66102;
            C16719 m46989 = e.m46989();
            C12281 c12281 = C6241.f19132;
            c22364.m7276(new C12281("compiler", "proc.cant.access.1", abstractC5698, m46989));
            return false;
        } catch (C20515 e2) {
            StringWriter stringWriter = new StringWriter();
            e2.printStackTrace(new PrintWriter(stringWriter));
            AbstractC5698 abstractC56982 = e2.f66102;
            C16719 m469892 = e2.m46989();
            String stringWriter2 = stringWriter.toString();
            C12281 c122812 = C6241.f19132;
            c22364.m7276(new C12281("compiler", "proc.cant.access", abstractC56982, m469892, stringWriter2));
            return false;
        } catch (Throwable th) {
            throw new C11181(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
    
        if (r0.m13346() > 0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4521(l.C2609 r8, l.C2609 r9, l.C2609 r10, l.C5431 r11) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1302.m4521(l.ۖܶ۠, l.ۖܶ۠, l.ۖܶ۠, l.ۚܶ۠):void");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it;
        ServiceLoader serviceLoader;
        this.f4667.close();
        C16118 c16118 = this.f4653;
        if (c16118 != null && (it = c16118.f49662) != null && (it instanceof C5536) && (serviceLoader = ((C5536) it).f17133) != null) {
            try {
                serviceLoader.reload();
            } catch (Exception unused) {
            }
        }
        this.f4653 = null;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C17530 m4529() {
        return this.f4650;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16824 m4526() {
        return this.f4667;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21290 m4527() {
        return this.f4652;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C21290 m4528() {
        return this.f4652;
    }

    /* renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public final EnumC3503 m4524() {
        return EnumC16280.m38299(this.f4638);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.regex.Pattern m4493(boolean r6, java.lang.String r7, l.InterfaceC21848 r8, l.C22364 r9, boolean r10) {
        /*
            r0 = 47
            int r0 = r7.indexOf(r0)
            r1 = 1
            r2 = 0
            java.lang.String r3 = "*"
            r4 = -1
            if (r0 != r4) goto L21
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L18
            java.util.regex.Pattern r6 = l.C3314.m10126(r7)
            return r6
        L18:
            if (r6 == 0) goto L1d
        */
        //  java.lang.String r6 = ".*/"
        /*
            goto L1f
        L1d:
            java.lang.String r6 = ""
        L1f:
            r0 = r7
            goto L4a
        L21:
            java.lang.String r6 = r7.substring(r2, r0)
            boolean r5 = l.EnumC3503.m10693(r6)
            if (r5 != 0) goto L30
            java.util.regex.Pattern r6 = m4492(r7, r8, r9, r10)
            return r6
        L30:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r6)
            java.lang.String r6 = "/"
            r5.append(r6)
            java.lang.String r6 = r5.toString()
            java.lang.String r6 = java.util.regex.Pattern.quote(r6)
            int r0 = r0 + r1
            java.lang.String r0 = r7.substring(r0)
        L4a:
            int r5 = l.C3314.f10381
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L53
            goto L92
        L53:
            r3 = 42
            int r3 = r0.indexOf(r3)
            r5 = 2
            if (r3 == r4) goto L77
            int r4 = r0.length()
            int r4 = r4 - r1
            if (r3 != r4) goto L75
            int r3 = r3 - r1
            if (r3 < 0) goto L77
            char r3 = r0.charAt(r3)
            r4 = 46
            if (r3 != r4) goto L6f
            goto L70
        L6f:
            r1 = 0
        L70:
            java.lang.String r3 = l.C15472.m36561(r5, r2, r0)
            goto L78
        L75:
            r1 = 0
            goto L92
        L77:
            r3 = r0
        L78:
            if (r1 == 0) goto L92
            int r4 = r3.length()
            int r4 = r4 + r5
            java.lang.String r5 = "\\."
            java.lang.String[] r3 = r3.split(r5, r4)
            int r4 = r3.length
        L86:
            if (r2 >= r4) goto L92
            r5 = r3[r2]
            boolean r5 = l.EnumC3503.m10687(r5)
            r1 = r1 & r5
            int r2 = r2 + 1
            goto L86
        L92:
            if (r1 == 0) goto La8
            java.lang.StringBuilder r6 = l.C5368.m15339(r6)
            java.lang.String r7 = l.C3314.m10127(r0)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            return r6
        La8:
            java.util.regex.Pattern r6 = m4492(r7, r8, r9, r10)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1302.m4493(boolean, java.lang.String, l.᩸᩸۠, l.᩹ܶ۠, boolean):java.util.regex.Pattern");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pattern m4492(String str, InterfaceC21848 interfaceC21848, C22364 c22364, boolean z) {
        if (z) {
            String name = interfaceC21848.getClass().getName();
            C11076 c11076 = C14001.f42334;
            c22364.m7275(new C11076("compiler", "proc.malformed.supported.string", str, name));
        }
        return f4634;
    }
}

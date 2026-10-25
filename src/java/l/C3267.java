package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: T7LF */
/* renamed from: l.ۗܰ֨, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3267 extends AbstractC0204 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final C15966 f10252 = new C15966(0);

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f10253;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 f10254;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f10255;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C6136 f10257;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f10259;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC10370 f10260;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C20661 f10261;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f10262;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f10264;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C0052 f10265;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C15240 f10266;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC16280 f10267;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f10268;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC10892 f10269;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6319 f10272;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f10273;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean f10274;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18230 f10275;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f10276;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f10277;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f10278;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11223 f10279;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C14127 f10280;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C6235 f10281;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9310 f10282;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22364 f10283;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C16782 f10285;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f10286;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final HashSet f10256 = new HashSet();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashSet f10258 = new HashSet();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Set f10270 = null;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final HashSet f10263 = new HashSet();

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC6403 f10284 = new C8206(this);

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final HashMap f10271 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m10042(C3267 c3267, AbstractC5698 abstractC5698) {
        c3267.getClass();
        C0052 c0052 = (C0052) abstractC5698;
        c0052.mo16101();
        C1755 m39519 = c3267.f10285.m39519(c0052);
        C4678 c4678 = new C4678(c3267, c0052, m39519);
        C22364 c22364 = c3267.f10283;
        InterfaceC18278 m7284 = c22364.m7284(m39519.f6075.f4745);
        C3587 m4616 = m39519.f6075.m4616();
        C18230 c18230 = c3267.f10275;
        m4616.getClass();
        InterfaceC3109 m42471 = c18230.m42471((InterfaceC3109) m4616);
        try {
            c4678.mo1375(m4616);
        } finally {
            c22364.m7284(m7284);
            c18230.m42471(m42471);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m10045(C3267 c3267, C0052 c0052) {
        c3267.getClass();
        c0052.mo16101();
        return !c0052.f17562.m26176(c3267.f10260) && C5378.stream(c0052.f921).anyMatch(new C8912());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3267 m10022(C2903 c2903) {
        C3267 c3267 = (C3267) c2903.m8837(C3267.class);
        return c3267 == null ? new C3267(c2903) : c3267;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10058(String... strArr) {
        this.f10256.addAll(Arrays.asList(strArr));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10057(C2609 c2609) {
        C12171.m29642(!this.f10253);
        try {
            this.f10253 = true;
            C12171.m29644(this.f10270);
            m10034(c2609, new C18084(0, this), (C14163) null);
        } finally {
            this.f10253 = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0102  */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m10027(final l.C3267 r14, java.util.Set r15) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3267.m10027(l.ۗܰ֨, java.util.Set):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10060(C14163 c14163, C2609 c2609) {
        C12171.m29642((this.f10270 == null && !this.f10253 && this.f10262) ? false : true);
        return m10034(c2609, new C23728(), c14163);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m10034(C2609 c2609, Consumer consumer, C14163 c14163) {
        if (!this.f10262) {
            Iterator it = c2609.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                C20661 c20661 = this.f10261;
                if (hasNext) {
                    ((C1323) it.next()).f4739 = c20661.f66465;
                } else {
                    this.f10265 = c20661.f66465;
                    return true;
                }
            }
        } else {
            C22364 c22364 = this.f10283;
            int i = c22364.f72454;
            try {
                LinkedHashSet m10039 = m10039(c14163, c2609);
                m10026(c2609, m10039, c14163);
                consumer.n(m10039);
                Iterator it2 = m10039.iterator();
                while (it2.hasNext()) {
                    ((C0052) it2.next()).mo16101();
                }
            } catch (C20515 e) {
                this.f10266.m36110((InterfaceC3109) null, e);
            }
            return c22364.f72454 == i;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6403 m10063() {
        return this.f10284;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C0052 m10062() {
        return this.f10265;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m10065() {
        return this.f10273 != null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private LinkedHashSet m10039(C14163 c14163, C2609 c2609) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C1323 c1323 = (C1323) it.next();
            InterfaceC18278 interfaceC18278 = c1323.f4745;
            C22364 c22364 = this.f10283;
            InterfaceC18278 m7284 = c22364.m7284(interfaceC18278);
            try {
                m10025(c1323, c14163, linkedHashSet);
            } finally {
                c22364.m7284(m7284);
            }
        }
        return linkedHashSet;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10025(C1323 c1323, C14163 c14163, LinkedHashSet linkedHashSet) {
        C0052 m47258;
        boolean mo21322 = c1323.f4745.mo21322("module-info", EnumC16866.SOURCE);
        C3587 m4616 = c1323.m4616();
        boolean z = this.f10259;
        C22364 c22364 = this.f10283;
        if (m4616 == null) {
            if (mo21322 && z) {
                boolean isEmpty = c1323.f4738.isEmpty();
                InterfaceC3109 interfaceC3109 = c1323;
                if (!isEmpty) {
                    interfaceC3109 = (AbstractC5144) c1323.f4738.f8240;
                }
                interfaceC3109.getClass();
                c22364.m7273(interfaceC3109, C6241.f19150);
                return;
            }
            return;
        }
        C3587 m46162 = c1323.m4616();
        if (!mo21322) {
            m46162.getClass();
            c22364.m7273(m46162, C6241.f19249);
        }
        AbstractC10370 m19452 = C7260.m19452(m46162.f11378);
        if (c14163 != null) {
            m47258 = (C0052) c14163.f17561;
            C12171.m29637(m47258.f17562);
            AbstractC10370 m194522 = C7260.m19452(m46162.f11378);
            AbstractC10370 abstractC10370 = m47258.f17562;
            if (abstractC10370 != m194522) {
                C12281 c12281 = C6241.f19132;
                c22364.m7273(m46162, new C12281("compiler", "module.name.mismatch", m19452, abstractC10370));
            }
        } else {
            m47258 = this.f10261.m47258(m19452);
            InterfaceC18278 interfaceC18278 = m47258.f911.f42770;
            if (interfaceC18278 != null && interfaceC18278 != c1323.f4745) {
                C12281 c122812 = C6241.f19132;
                c22364.m7273(m46162, new C12281("compiler", "duplicate.module", m47258));
                return;
            }
        }
        m47258.f17564 = new C15260(this, c1323);
        m47258.f911.f42770 = c1323.f4745;
        m46162.f11377 = m47258;
        if (z || linkedHashSet.isEmpty()) {
            linkedHashSet.add(m47258);
        } else {
            c22364.m7273(c1323, C6241.f19223);
        }
        C1755 c1755 = new C1755(m46162, null);
        c1755.f6075 = c1323;
        this.f10285.m39521(m47258, c1755);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m10026(l.C2609 r22, java.util.LinkedHashSet r23, l.C14163 r24) {
        /*
            Method dump skipped, instructions count: 935
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3267.m10026(l.ۖܶ۠, java.util.LinkedHashSet, l.ܳ֡֨):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private InterfaceC2050 m10040(C1323 c1323) {
        InterfaceC18278 interfaceC18278 = c1323.f4745;
        EnumC21101 enumC21101 = EnumC21101.MODULE_SOURCE_PATH;
        InterfaceC11223 interfaceC11223 = this.f10279;
        InterfaceC2050 mo1715 = interfaceC11223.mo1715(enumC21101, interfaceC18278);
        if (mo1715 != null) {
            return mo1715;
        }
        EnumC21101 enumC211012 = EnumC21101.SOURCE_OUTPUT;
        if (!interfaceC11223.mo1710(enumC211012)) {
            enumC211012 = EnumC21101.CLASS_OUTPUT;
        }
        return interfaceC11223.mo1715(enumC211012, interfaceC18278);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m10055() {
        String str = this.f10276;
        if (str == null || !Arrays.asList(str.split(",")).contains("ALL-MODULE-PATH")) {
            return;
        }
        this.f10283.m7276(C6241.f19203);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m10053(C3267 c3267, C0052 c0052) {
        InterfaceC11223 interfaceC11223 = c3267.f10279;
        try {
            C18837 c18837 = new C18837();
            C18837 c188372 = new C18837();
            HashSet hashSet = new HashSet();
            Iterator it = interfaceC11223.mo1702(c0052.f914, "", (Set) EnumSet.of(EnumC16866.CLASS), true).iterator();
            while (it.hasNext()) {
                String mo1703 = interfaceC11223.mo1703(c0052.f914, (InterfaceC18278) it.next());
                String substring = mo1703.lastIndexOf(46) != -1 ? mo1703.substring(0, mo1703.lastIndexOf(46)) : "";
                if (hashSet.add(substring)) {
                    C17524 c17524 = new C17524(c3267.f10261.m47266(c0052, c3267.f10257.f18880.m30652(substring)), null);
                    c18837.m43511(c17524);
                    c188372.m43511(c17524);
                }
            }
            c0052.f921 = c188372.m43517();
            c0052.f925 = C2609.m8239();
            c0052.f929 = C2609.m8239();
            c0052.f917 = C2609.m8239();
            c0052.f920 = c18837.m43517();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Set m10064() {
        C12171.m29637(this.f10273);
        return this.f10273;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m10035(C3267 c3267, Set set, C0052 c0052) {
        if (set == null) {
            c3267.f10281.m17171(c0052);
            return c0052.f17559 != EnumC1296.f4581;
        }
        c3267.getClass();
        return set.contains(c0052);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m10043(C0052 c0052) {
        c0052.mo16101();
        return C5378.stream(c0052.f921).anyMatch(new C2562(0));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m10059(C0052 c0052) {
        LinkedHashSet linkedHashSet = this.f10273;
        return linkedHashSet == null || linkedHashSet.contains(c0052);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0093, code lost:
    
        if (r17.contains(r0) != false) goto L37;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.LinkedHashSet m10021(java.util.HashSet r17, java.util.Set r18, java.util.LinkedHashSet r19) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C3267.m10021(java.util.HashSet, java.util.Set, java.util.LinkedHashSet):java.util.LinkedHashSet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m10048(final C0052 c0052) {
        HashMap hashMap;
        String[] strArr;
        C0052 m47258;
        C6136 c6136;
        if (this.f10253) {
            c0052.f17564 = new InterfaceC6403() { // from class: l.ᩴܰ֨
                @Override // l.InterfaceC6403
                /* renamed from: ֫ */
                public final void mo7076(AbstractC5698 abstractC5698) {
                    C3267.this.m10048(c0052);
                }

                @Override // l.InterfaceC6403
                /* renamed from: ܽ */
                public final /* synthetic */ boolean mo7078() {
                    return false;
                }
            };
            return;
        }
        long j = c0052.f17563 & 4503599627370496L;
        C20661 c20661 = this.f10261;
        if (j != 0) {
            C18837 c18837 = new C18837();
            c18837.addAll(c0052.f920);
            C18837 c188372 = new C18837();
            for (C0052 c00522 : m10064()) {
                if (c00522 != c20661.f66447 && c00522 != c0052) {
                    C9764 c9764 = new C9764(c00522, (c00522.f17563 & 4503599627370496L) != 0 ? EnumSet.of(EnumC9058.TRANSITIVE) : EnumSet.noneOf(EnumC9058.class));
                    c18837.m43511(c9764);
                    c188372.m43511(c9764);
                }
            }
            C9764 c97642 = new C9764(c20661.f66447, EnumSet.noneOf(EnumC9058.class));
            c18837.m43511(c97642);
            c188372.m43511(c97642);
            c0052.f929 = c188372.m43517();
            c0052.f920 = c18837.m43517();
        }
        C12171.m29637(c0052.f929);
        LinkedHashMap linkedHashMap = this.f10278;
        int i = 1;
        C22364 c22364 = this.f10283;
        if (linkedHashMap == null) {
            this.f10278 = new LinkedHashMap();
            String str = this.f10277;
            if (str != null) {
                Pattern compile = Pattern.compile("([^=]+)=(.*)");
                String[] split = str.split("\u0000+");
                int length = split.length;
                int i2 = 0;
                while (i2 < length) {
                    String str2 = split[i2];
                    if (!str2.isEmpty()) {
                        Matcher matcher = compile.matcher(str2);
                        if (matcher.matches()) {
                            String group = matcher.group(i);
                            String group2 = matcher.group(2);
                            if (m10033(group)) {
                                C6136 c61362 = this.f10257;
                                C0052 m472582 = c20661.m47258(c61362.f18880.m30652(group));
                                boolean contains = this.f10273.contains(m472582);
                                boolean z = this.f10274;
                                if (contains) {
                                    if (!this.f10286) {
                                        int i3 = i;
                                        if ((m472582.f17563 & 9007199254740992L) != 0) {
                                            C12281 c12281 = C6241.f19132;
                                            Object[] objArr = new Object[i3];
                                            objArr[0] = m472582;
                                            c22364.m7276(new C12281("compiler", "add.reads.with.release", objArr));
                                        }
                                    }
                                    String[] split2 = group2.split("[ ,]+", -1);
                                    int length2 = split2.length;
                                    int i4 = 0;
                                    while (i4 < length2) {
                                        String str3 = split2[i4];
                                        String[] strArr2 = split;
                                        if (str3.equals("ALL-UNNAMED")) {
                                            m47258 = c20661.f66447;
                                            strArr = split2;
                                        } else {
                                            if (m10033(str3)) {
                                                AbstractC12486 abstractC12486 = c61362.f18880;
                                                abstractC12486.getClass();
                                                char[] charArray = str3.toCharArray();
                                                strArr = split2;
                                                m47258 = c20661.m47258(abstractC12486.mo15927(charArray, charArray.length));
                                                if (!this.f10273.contains(m47258)) {
                                                    if (z) {
                                                        c22364.m7282(EnumC20347.OPTIONS, C14001.m33601(EnumC0121.f1162, m47258));
                                                    }
                                                }
                                            } else {
                                                strArr = split2;
                                            }
                                            c6136 = c61362;
                                            i4++;
                                            split = strArr2;
                                            split2 = strArr;
                                            c61362 = c6136;
                                        }
                                        c6136 = c61362;
                                        ((Set) C13843.computeIfAbsent(this.f10278, m472582, new C6795(0))).add(new C9764(m47258, EnumSet.of(EnumC9058.EXTRA)));
                                        i4++;
                                        split = strArr2;
                                        split2 = strArr;
                                        c61362 = c6136;
                                    }
                                } else if (z) {
                                    c22364.m7275(C14001.m33601(EnumC0121.f1162, m472582));
                                }
                            }
                        }
                    }
                    i2++;
                    i = 1;
                    split = split;
                }
            }
        }
        C2609 c2609 = c0052.f929;
        C2609 m8235 = C2609.m8235((Iterable) C13843.getOrDefault(this.f10278, c0052, Collections.EMPTY_SET));
        c2609.getClass();
        C2609 m8248 = m8235.m8248(c2609);
        c0052.f929 = m8248;
        while (m8248.m8249()) {
            if (!m10064().contains(((C9764) m8248.f8240).f29541)) {
                C1755 m39519 = this.f10285.m39519(c0052);
                if (m39519 != null) {
                    InterfaceC18278 m7284 = c22364.m7284(m39519.f6075.f4745);
                    try {
                        AbstractC5144 abstractC5144 = m39519.f6074;
                        C0052 c00523 = ((C9764) m8248.f8240).f29541;
                        C12281 c122812 = C6241.f19132;
                        c22364.m7273(abstractC5144, new C12281("compiler", "module.not.found", c00523));
                        c22364.m7284(m7284);
                    } catch (Throwable th) {
                        c22364.m7284(m7284);
                        throw th;
                    }
                } else {
                    C12171.m29642((c0052.f17563 & 4503599627370496L) == 0);
                }
                c0052.f929 = C2609.m8237((C9764) m8248.f8240, c0052.f929);
            }
            m8248 = m8248.f8241;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        Iterator it = c0052.f929.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap = this.f10271;
            if (!hasNext) {
                break;
            }
            C9764 c97643 = (C9764) it.next();
            final C0052 c00524 = c97643.f29541;
            c00524.mo16101();
            linkedHashSet.add(c00524);
            Set set = (Set) hashMap.get(c00524);
            Set set2 = set;
            if (set == null) {
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                C2609 of = C2609.of((Object) c00524);
                while (of.m8249()) {
                    final C0052 c00525 = (C0052) of.f8240;
                    of = of.f8241;
                    if (hashSet3.add(c00525)) {
                        hashSet2.add(c00525);
                        c00525.mo16101();
                        if (c00525 != c20661.f66447) {
                            C12171.m29638(c00525.f929, new Supplier() { // from class: l.᩷ܰ֨
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return C0052.this + ".requires == null; " + c00524;
                                }
                            });
                            Iterator it2 = c00525.f929.iterator();
                            while (it2.hasNext()) {
                                C9764 c97644 = (C9764) it2.next();
                                if (c97644.f29540.contains(EnumC9058.TRANSITIVE)) {
                                    of = of.m8246(c97644.f29541);
                                }
                            }
                        } else {
                            Iterator it3 = m10064().iterator();
                            while (it3.hasNext()) {
                                of = of.m8246((C0052) it3.next());
                            }
                        }
                    }
                }
                hashSet2.remove(c00524);
                set2 = hashSet2;
            }
            linkedHashSet.addAll(set2);
            if (c97643.f29540.contains(EnumC9058.TRANSITIVE)) {
                hashSet.add(c00524);
                hashSet.addAll(set2);
            }
        }
        hashMap.put(c0052, hashSet);
        m10024(c0052, linkedHashSet);
        Iterator it4 = c0052.f921.iterator();
        while (it4.hasNext()) {
            C7814 c7814 = ((C17524) it4.next()).f53523;
            if (c7814 != null) {
                c7814.f24147 = c0052;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m10029(C3267 c3267, C0052 c0052, HashMap hashMap, C0052 c00522, Set set) {
        if (c0052.f922.contains(c00522)) {
            c3267.m10023(c0052, hashMap, c00522, set);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10023(C0052 c0052, HashMap hashMap, C0052 c00522, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C17524 c17524 = (C17524) it.next();
            C2609 c2609 = c17524.f53522;
            C7814 c7814 = c17524.f53523;
            if (c2609 == null || c2609.contains(c0052)) {
                AbstractC10370 abstractC10370 = c7814.f24143;
                C0052 c00523 = (C0052) hashMap.get(abstractC10370);
                if (c00523 != null && c00523 != c00522) {
                    C1755 m39519 = this.f10285.m39519(c0052);
                    AbstractC5144 abstractC5144 = null;
                    C22364 c22364 = this.f10283;
                    InterfaceC18278 m7284 = m39519 != null ? c22364.m7284(m39519.f6075.f4745) : null;
                    if (m39519 != null) {
                        abstractC5144 = m39519.f6074;
                        abstractC5144.getClass();
                    }
                    try {
                        if (c0052.m954()) {
                            C12281 c12281 = C6241.f19132;
                            c22364.m7273(abstractC5144, new C12281("compiler", "package.clash.from.requires.in.unnamed", abstractC10370, c00523, c00522));
                        } else {
                            C12281 c122812 = C6241.f19132;
                            c22364.m7273(abstractC5144, new C12281("compiler", "package.clash.from.requires", c0052, abstractC10370, c00523, c00522));
                        }
                        if (m39519 != null) {
                            c22364.m7284(m7284);
                        }
                    } catch (Throwable th) {
                        if (m39519 != null) {
                            c22364.m7284(m7284);
                        }
                        throw th;
                    }
                } else {
                    hashMap.put(abstractC10370, c00522);
                    c0052.f913.put(c7814.f24143, c7814);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m10024(final C0052 c0052, HashSet hashSet) {
        String[] strArr;
        C0052 m47258;
        LinkedHashMap linkedHashMap = this.f10255;
        C20661 c20661 = this.f10261;
        if (linkedHashMap == null) {
            this.f10255 = new LinkedHashMap();
            HashSet hashSet2 = new HashSet();
            String str = this.f10268;
            if (str != null) {
                Pattern compile = Pattern.compile("([^/]+)/([^=]+)=(.*)");
                String[] split = str.split("\u0000+");
                int length = split.length;
                char c = 0;
                int i = 0;
                while (i < length) {
                    String str2 = split[i];
                    if (!str2.isEmpty()) {
                        Matcher matcher = compile.matcher(str2);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            String group3 = matcher.group(3);
                            if (m10033(group)) {
                                AbstractC12486 abstractC12486 = this.f10257.f18880;
                                C0052 m472582 = c20661.m47258(abstractC12486.m30652(group));
                                if (m10044(m472582, hashSet2) && m10033(group2)) {
                                    if (!this.f10286 && (m472582.f17563 & 9007199254740992L) != 0) {
                                        C12281 c12281 = C6241.f19132;
                                        Object[] objArr = new Object[1];
                                        objArr[c] = m472582;
                                        this.f10283.m7276(new C12281("compiler", "add.exports.with.release", objArr));
                                    } else {
                                        C7814 m47266 = c20661.m47266(m472582, abstractC12486.m30652(group2));
                                        m47266.f24147 = m472582;
                                        C2609 m8239 = C2609.m8239();
                                        String[] split2 = group3.split("[ ,]+");
                                        int length2 = split2.length;
                                        int i2 = 0;
                                        while (i2 < length2) {
                                            String str3 = split2[i2];
                                            String[] strArr2 = split;
                                            if (str3.equals("ALL-UNNAMED")) {
                                                m47258 = c20661.f66447;
                                            } else {
                                                if (m10033(str3)) {
                                                    char[] charArray = str3.toCharArray();
                                                    m47258 = c20661.m47258(abstractC12486.mo15927(charArray, charArray.length));
                                                    if (!m10044(m47258, hashSet2)) {
                                                    }
                                                }
                                                i2++;
                                                split = strArr2;
                                            }
                                            m8239 = m8239.m8246(m47258);
                                            i2++;
                                            split = strArr2;
                                        }
                                        strArr = split;
                                        ((Set) C13843.computeIfAbsent(this.f10255, m472582, new C14205(6))).add(new C17524(m47266, m8239));
                                        i++;
                                        c = 0;
                                        split = strArr;
                                    }
                                }
                            }
                        }
                    }
                    strArr = split;
                    i++;
                    c = 0;
                    split = strArr;
                }
            }
        }
        c0052.f913 = new LinkedHashMap();
        c0052.f922 = new HashSet(hashSet);
        final HashMap hashMap = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C0052 c00522 = (C0052) it.next();
            if (c00522 != c20661.f66447) {
                m10023(c0052, hashMap, c00522, c00522.f921);
            }
        }
        C13843.forEach(this.f10255, new BiConsumer() { // from class: l.ۢܰ֨
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C3267.m10029(C3267.this, c0052, hashMap, (C0052) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C17873.$default$andThen(this, biConsumer);
            }
        });
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m10044(C0052 c0052, HashSet hashSet) {
        if (this.f10273.contains(c0052)) {
            return true;
        }
        if (hashSet.contains(c0052)) {
            return false;
        }
        if (this.f10274) {
            this.f10283.m7282(EnumC20347.OPTIONS, C14001.m33601(EnumC0121.f1172, c0052));
        }
        hashSet.add(c0052);
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m10031(C3267 c3267, C3587 c3587) {
        Iterator it = c3587.f11376.iterator();
        while (it.hasNext()) {
            AbstractC22490 abstractC22490 = (AbstractC22490) it.next();
            if (abstractC22490.m14709(EnumC18550.f57506)) {
                C12054 c12054 = (C12054) abstractC22490;
                if (c12054.f36051 != null) {
                    HashSet hashSet = new HashSet();
                    C2609 of = C2609.of((Object) c12054.f36051.f29541);
                    while (of.m8249()) {
                        final C0052 c0052 = (C0052) of.f8240;
                        of = of.f8241;
                        if (hashSet.add(c0052)) {
                            c0052.mo16101();
                            if ((c0052.f17563 & 4503599627370496L) == 0) {
                                C12171.m29638(c0052.f929, new Supplier() { // from class: l.ۘܰ֨
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return C0052.this.toString();
                                    }
                                });
                                Iterator it2 = c0052.f929.iterator();
                                while (it2.hasNext()) {
                                    C9764 c9764 = (C9764) it2.next();
                                    if (!c9764.f29540.contains(EnumC9058.EXTRA)) {
                                        of = of.m8246(c9764.f29541);
                                    }
                                }
                            }
                        }
                    }
                    if (hashSet.contains(c3587.f11377)) {
                        C22364 c22364 = c3267.f10283;
                        AbstractC12612 abstractC12612 = c12054.f36052;
                        abstractC12612.getClass();
                        C0052 c00522 = c12054.f36051.f29541;
                        C12281 c12281 = C6241.f19132;
                        c22364.m7273(abstractC12612, new C12281("compiler", "cyclic.requires", c00522));
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m10033(String str) {
        return EnumC3503.m10692(str, EnumC16280.m38299(this.f10267));
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m10061() {
        this.f10273 = null;
        this.f10270 = null;
        this.f10265 = null;
        this.f10263.clear();
    }

    public C3267(C2903 c2903) {
        c2903.m8839(C3267.class, this);
        this.f10283 = C22364.m50099(c2903);
        C6136 m17057 = C6136.m17057(c2903);
        this.f10257 = m17057;
        this.f10261 = C20661.m47250(c2903);
        this.f10282 = C9310.m23901(c2903);
        this.f10266 = C15240.m36054(c2903);
        this.f10275 = C18230.m42469(c2903);
        this.f10285 = C16782.m39518(c2903);
        this.f10281 = C6235.m17162(c2903);
        this.f10272 = C6319.m17456(c2903);
        InterfaceC11223 interfaceC11223 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        this.f10279 = interfaceC11223;
        EnumC16280 m38301 = EnumC16280.m38301(c2903);
        this.f10267 = m38301;
        this.f10269 = EnumC10892.m27201(c2903);
        this.f10262 = EnumC10637.f32009.m26686(m38301);
        C11781 m28823 = C11781.m28823(c2903);
        this.f10286 = m28823.m28836(EnumC0121.f1193);
        this.f10274 = m28823.m28833(EnumC0121.f1177, "-" + EnumC20347.OPTIONS.f65711);
        boolean mo1710 = interfaceC11223.mo1710(EnumC21101.MODULE_SOURCE_PATH);
        this.f10259 = mo1710;
        C16887.m39694(c2903).f51828 = mo1710;
        C8796.m22697(c2903).f26792 = mo1710;
        AbstractC12486 abstractC12486 = m17057.f18880;
        abstractC12486.getClass();
        char[] charArray = "java.se".toCharArray();
        this.f10254 = abstractC12486.mo15927(charArray, charArray.length);
        char[] charArray2 = "java.".toCharArray();
        this.f10260 = abstractC12486.mo15927(charArray2, charArray2.length);
        this.f10268 = m28823.m28825(EnumC0121.f1172);
        this.f10277 = m28823.m28825(EnumC0121.f1162);
        this.f10276 = m28823.m28825(EnumC0121.f1149);
        this.f10264 = m28823.m28825(EnumC0121.f1144);
    }
}

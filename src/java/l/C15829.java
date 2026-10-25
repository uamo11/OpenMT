package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: A7L3 */
/* renamed from: l.ܺۡ۠, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15829 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C4314 f48908 = new C4314();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f48909;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public HashSet f48910;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C11781 f48911;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C22364 f48912;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC0827 f48913 = new C20770(this);

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f48914;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f48915;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2903 f48916;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public EnumC9481 f48917;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f48918;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public LinkedHashSet f48919;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC11223 f48920;

    public C15829(C2903 c2903) {
        c2903.m8841(f48908, this);
        this.f48911 = C11781.m28823(c2903);
        this.f48912 = C22364.m50099(c2903);
        this.f48916 = c2903;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37469(ArrayList arrayList) {
        this.f48915 = "javac";
        this.f48917 = EnumC9481.LOG;
        this.f48919 = new LinkedHashSet();
        this.f48918 = new LinkedHashMap();
        this.f48910 = null;
        this.f48909 = new LinkedHashSet();
        Set m1176 = EnumC0121.m1176();
        AbstractC0827 abstractC0827 = this.f48913;
        if (m37459(arrayList, m1176, abstractC0827)) {
            EnumC0121 enumC0121 = EnumC0121.f1193;
            C11781 c11781 = this.f48911;
            String m28825 = c11781.m28825(enumC0121);
            boolean z = m28825 == null;
            InterfaceC8775 interfaceC8775 = new InterfaceC8775() { // from class: l.ܳۡ۠
                @Override // l.InterfaceC8775
                /* renamed from: ֫ */
                public final void mo22667(EnumC0121 enumC01212) {
                    C12281 c12281 = C6241.f19132;
                    C15829.this.m37470(new C12281("compiler", "release.bootclasspath.conflict", enumC01212));
                }
            };
            EnumC0121 enumC01212 = EnumC0121.f1128;
            EnumC0121 enumC01213 = EnumC0121.f1205;
            m37471(z, interfaceC8775, EnumC0121.f1189, EnumC0121.f1145, EnumC0121.f1167, EnumC0121.f1208, EnumC0121.f1142, EnumC0121.f1137, EnumC0121.f1127, EnumC0121.f1192, enumC01212, enumC01213, EnumC0121.f1203, EnumC0121.f1198);
            if (m28825 != null) {
                InterfaceC5808 m6548 = C2008.m6548(m28825);
                if (m6548 == null) {
                    C12281 c12281 = C6241.f19132;
                    m37470(new C12281("compiler", "unsupported.release.version", m28825));
                } else {
                    c11781.m28834(enumC01212, m6548.m16299());
                    c11781.m28834(enumC01213, m6548.m16300());
                    C2903 c2903 = this.f48916;
                    c2903.m8839(InterfaceC5808.class, m6548);
                    if (m37459(m6548.m16301(), m1176, abstractC0827)) {
                        C0307.m1699(c2903, m6548.m16302(), m37461());
                    }
                }
            }
            c11781.m28830();
        }
        if (this.f48914) {
            this.f48912.m50120(EnumC15307.JAVAC, "msg.usage", "javac");
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Set m37476() {
        if (this.f48910 == null) {
            this.f48910 = new LinkedHashSet();
        }
        if (this.f48919 != null) {
            Iterator it = ((C11844) m37461()).m28933(this.f48919).iterator();
            while (it.hasNext()) {
                this.f48910.add((InterfaceC18278) it.next());
            }
        }
        return this.f48910;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet m37468() {
        return this.f48909;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m37459(Iterable iterable, Set set, AbstractC0827 abstractC0827) {
        EnumC0121 enumC0121;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.isEmpty()) {
                C12281 c12281 = C6241.f19132;
                m37470(new C12281("compiler", "invalid.flag", str));
                return false;
            }
            if (str.startsWith("-")) {
                enumC0121 = EnumC0121.m1159(str, set);
            } else {
                enumC0121 = EnumC0121.f1153;
                if (!enumC0121.mo1183(str)) {
                    enumC0121 = null;
                }
            }
            if (enumC0121 != null) {
                try {
                    enumC0121.m1180(abstractC0827, str, it);
                } catch (C2239 e) {
                    String message = e.getMessage();
                    this.f48914 = true;
                    int ordinal = this.f48917.ordinal();
                    if (ordinal == 0) {
                        throw new C16908(new IllegalArgumentException(message, e.getCause()));
                    }
                    if (ordinal == 1) {
                        throw new C16908(new IllegalStateException(message, e.getCause()));
                    }
                    if (ordinal == 2) {
                        this.f48912.m50111(message);
                    }
                    return false;
                }
            } else {
                C12281 c122812 = C6241.f19132;
                m37470(new C12281("compiler", "invalid.flag", str));
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0368  */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m37477() {
        /*
            Method dump skipped, instructions count: 1710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15829.m37477():boolean");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m37473() {
        LinkedHashSet linkedHashSet = this.f48919;
        if (linkedHashSet != null && !linkedHashSet.isEmpty()) {
            return false;
        }
        HashSet hashSet = this.f48910;
        if (hashSet != null && !hashSet.isEmpty()) {
            return false;
        }
        LinkedHashSet linkedHashSet2 = this.f48909;
        return linkedHashSet2 == null || linkedHashSet2.isEmpty();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m37472() {
        return this.f48918;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Set m37475() {
        String m28825 = this.f48911.m28825(EnumC0121.f1176);
        if (m28825 == null) {
            return Collections.EMPTY_SET;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : m28825.split("\\x00")) {
            linkedHashSet.add(C2609.m8238((Object[]) str.split("\\s+")));
        }
        return C20195.unmodifiableSet(linkedHashSet);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C2609 m37474() {
        EnumC0121 enumC0121 = EnumC0121.f1131;
        C11781 c11781 = this.f48911;
        String m28825 = c11781.m28825(enumC0121);
        String m288252 = c11781.m28825(EnumC0121.f1164);
        if (m28825 == null && m288252 == null) {
            return C2609.m8239();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (m28825 != null) {
            linkedHashSet.add("-Xmsgs");
        }
        if (m288252 != null) {
            for (String str : m288252.split("\\s+")) {
                if (!str.isEmpty()) {
                    linkedHashSet.add("-Xmsgs:".concat(str));
                }
            }
        }
        if (linkedHashSet.equals(Collections.singleton("-Xmsgs:none"))) {
            return C2609.m8239();
        }
        String m288253 = c11781.m28825(EnumC0121.f1185);
        if (m288253 != null) {
            linkedHashSet.add("-XcheckPackage:".concat(m288253));
        }
        return C2609.m8238(linkedHashSet.toArray(new String[linkedHashSet.size()]));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m37460(EnumC0121 enumC0121) {
        String m28825 = this.f48911.m28825(enumC0121);
        if (m28825 != null) {
            InterfaceC20758 interfaceC20758 = C8763.get(m28825, new String[0]);
            if (C17229.exists(interfaceC20758, new EnumC14406[0]) && !C17229.isDirectory(interfaceC20758, new EnumC14406[0])) {
                C12281 c12281 = C6241.f19132;
                m37470(new C12281("compiler", "file.not.directory", m28825));
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37471(boolean z, final InterfaceC8775 interfaceC8775, EnumC0121... enumC0121Arr) {
        if (z) {
            return;
        }
        InterfaceC17664 of = C16958.of((Object[]) enumC0121Arr);
        final C11781 c11781 = this.f48911;
        C11003.requireNonNull(c11781);
        of.filter(new Predicate() { // from class: l.᩻ۡ۠
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C11781.this.m28832((EnumC0121) obj);
            }
        }).forEach(new Consumer() { // from class: l.ۜۡ۠
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void n(Object obj) {
                InterfaceC8775.this.mo22667((EnumC0121) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37470(AbstractC4520 abstractC4520) {
        this.f48914 = true;
        int ordinal = this.f48917.ordinal();
        C22364 c22364 = this.f48912;
        if (ordinal == 0) {
            throw new C16908(new IllegalArgumentException(c22364.m50108(abstractC4520)));
        }
        if (ordinal == 1) {
            throw new C16908(new IllegalStateException(c22364.m50108(abstractC4520)));
        }
        if (ordinal != 2) {
            return;
        }
        m37463(abstractC4520);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m37463(AbstractC4520 abstractC4520) {
        boolean z = abstractC4520 instanceof C12281;
        C22364 c22364 = this.f48912;
        if (z) {
            c22364.m7276((C12281) abstractC4520);
        } else if (abstractC4520 instanceof C11076) {
            c22364.m7275((C11076) abstractC4520);
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private InterfaceC11223 m37461() {
        if (this.f48920 == null) {
            this.f48920 = (InterfaceC11223) this.f48916.m8837(InterfaceC11223.class);
        }
        return this.f48920;
    }
}

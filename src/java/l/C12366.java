package l;

import android.os.Bundle;
import android.os.Parcel;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.umeng.analytics.pro.bo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: P67V */
/* renamed from: l.۫ۧۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C12366 extends C15256 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Bundle f37065;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayList f37066;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f37067;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f37068;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f37069;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11005 f37070;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C5242 f37071;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f37072;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37073;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37074;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Map f37075;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final HashMap f37076;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5242 f37077;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f37078;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map f37079;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f37080;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public Set f37081;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C5242 f37082;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f37083;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f37084;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C0577 f37085;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f37086;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final int[] f37064 = {0, 35, 37, 38, 39, 40, 41};

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final int f37063 = C14460.m34532().getDigestLength();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30010(C12366 c12366, String str, C7980 c7980) {
        c12366.getClass();
        c12366.m30022(str, c7980.getType());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m30028(String str, String str2, String str3) {
        if (this.f37080.containsKey(str2)) {
            throw new C19401("Class exists: " + str2.replace('/', '.'));
        }
        String m7978 = AbstractC2489.m7978(str3);
        if (m7978 == null) {
            throw new IOException("Parse class type failed.");
        }
        m30022(str2, m7978);
        C18011 c18011 = new C18011(str2);
        c18011.f56170 = str;
        C11005 c11005 = new C11005(new C11005(this.f37070, "smali"), c18011.f56170);
        c18011.f56171 = C11005.m27329(c11005, C8751.m22641(c11005.m27340(), str2.concat(".smali")));
        c18011.f56171.m27332(str3.getBytes(Charset.defaultCharset()));
        this.f37080.put(str2, c18011);
        if (this.f37078) {
            this.f37081.add(str2);
            this.f37082.mo1664(C20195.unmodifiableSet(this.f37081));
        }
        this.f37067 = 0L;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C12366 m30021(C11005 c11005) {
        return new C12366(c11005);
    }

    public C12366(C11005 c11005) {
        super(c11005);
        BufferedReader m36521;
        Set set;
        this.f37074 = new ArrayList();
        this.f37073 = new ArrayList();
        this.f37080 = new HashMap();
        this.f37076 = new HashMap();
        this.f37084 = new HashMap();
        this.f37075 = C20195.synchronizedMap(new C2727());
        this.f37079 = C20195.synchronizedMap(new C2727());
        this.f37069 = new HashMap();
        this.f37083 = new HashMap();
        this.f37086 = new ConcurrentMapC10942();
        this.f37072 = new ConcurrentMapC10942();
        this.f37066 = new ArrayList();
        this.f37081 = Collections.EMPTY_SET;
        this.f37078 = true;
        this.f37077 = new C5242();
        this.f37071 = new C5242();
        this.f37082 = new C5242();
        C11005 c110052 = new C11005(c11005, "dex");
        this.f37070 = c110052;
        C12171.m29642(c110052.m27336());
        this.f37085 = new C0577(this);
        C11005 m30047 = m30047();
        C11005[] m27335 = m30047.m27335();
        if (m27335 == null) {
            throw new IOException("List files fail in: " + m30047.m27339());
        }
        HashSet hashSet = new HashSet();
        C11005 c110053 = new C11005(m30044(), "exclude_dex");
        if (c110053.m27336()) {
            for (String str : c110053.m27340().m36489().split("\n")) {
                if (!str.isEmpty()) {
                    hashSet.add(str);
                }
            }
        }
        AbstractC15440 m27330 = m30044().m27330("removed");
        if (m27330.mo23120()) {
            m36521 = m27330.m36521();
            try {
                HashSet hashSet2 = new HashSet();
                while (true) {
                    String readLine = m36521.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        hashSet2.add(readLine);
                    }
                }
                m36521.close();
                set = hashSet2;
            } finally {
            }
        } else {
            set = Collections.EMPTY_SET;
        }
        for (C11005 c110054 : m27335) {
            if (c110054.m27340().mo23119() && c110054.getName().endsWith("_list")) {
                String m36561 = C15472.m36561(5, 0, c110054.getName());
                this.f37074.add(m36561);
                if (!hashSet.contains(m36561)) {
                    this.f37073.add(m36561);
                    C11005 c110055 = new C11005(m30047, m36561);
                    C12951 c12951 = new C12951(c110054.m27337());
                    while (c12951.available() > 0) {
                        C18011 c18011 = new C18011(c12951.m31504());
                        c18011.f56170 = m36561;
                        c18011.f56168 = c110055;
                        int readInt = c12951.readInt();
                        c18011.f56167 = readInt;
                        if ((Integer.MIN_VALUE & readInt) != 0) {
                            c18011.f56167 = readInt & Integer.MAX_VALUE;
                            c18011.f56172 = c12951.readInt();
                        } else {
                            c18011.f56172 = 0;
                        }
                        String str2 = c18011.f56169;
                        if (set.contains(str2)) {
                            this.f37076.put(str2, c18011);
                        } else {
                            this.f37080.put(str2, c18011);
                        }
                    }
                }
            }
        }
        C18717.m43345(this.f37073);
        C18717.m43345(this.f37074);
        m30071();
        ArrayList arrayList = this.f37066;
        AbstractC15440 m273302 = m30044().m27330("recent");
        if (m273302.mo23120()) {
            arrayList.clear();
            m36521 = m273302.m36521();
            while (true) {
                try {
                    String readLine2 = m36521.readLine();
                    if (readLine2 == null) {
                        break;
                    } else if (!readLine2.isEmpty()) {
                        arrayList.add(readLine2);
                    }
                } finally {
                }
            }
            m36521.close();
            m30015();
        }
        C11005 c110056 = new C11005(m30044(), "map");
        if (c110056.m27336()) {
            C12951 c129512 = new C12951(c110056.m27337());
            while (c129512.available() > 0) {
                this.f37069.put(c129512.m31504(), c129512.m31504());
            }
        }
        C11005 c110057 = new C11005(m30044(), "rename_map");
        if (c110057.m27336()) {
            C12951 c129513 = new C12951(c110057.m27337());
            while (c129513.available() > 0) {
                this.f37084.put(c129513.m31504(), c129513.m31504());
            }
        }
        C11005 c110058 = new C11005(m30044(), "dex_name_map");
        if (c110058.m27336()) {
            C12951 c129514 = new C12951(c110058.m27337());
            while (c129514.available() > 0) {
                this.f37083.put(c129514.m31504(), c129514.m31504());
            }
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C11005 m30047() {
        return new C11005(this.f37070, e.m);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11005 m30044() {
        return new C11005(this.f37070, "config");
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final List m30067() {
        return C20195.unmodifiableList(this.f37073);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m30073() {
        return C20195.unmodifiableList(this.f37074);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30030(ArrayList arrayList) {
        if (arrayList.containsAll(this.f37074)) {
            throw new C19401(R.string.MT_Protector_res_0x7f120926);
        }
        C11005 c11005 = new C11005(m30044(), "exclude_dex");
        c11005.m27338();
        c11005.m27332(C9679.m24612((Collection) arrayList, '\n').getBytes(Charset.defaultCharset()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30042(boolean z) {
        this.f37078 = z;
        if (z) {
            m30071();
        }
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m30048() {
        return this.f37074.size() > 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30026(String str) {
        if (this.f37080.containsKey(str)) {
            ArrayList arrayList = this.f37066;
            if (arrayList.isEmpty() || !((String) arrayList.get(0)).equals(str)) {
                arrayList.remove(str);
                arrayList.add(0, str);
                while (arrayList.size() > 30) {
                    C18473.m42953(arrayList, 1);
                }
                m30017();
                m30015();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m30058(String str) {
        return this.f37080.containsKey(str);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Collection m30063() {
        return this.f37080.values();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m30050(String str) {
        Set<String> keySet = this.f37080.keySet();
        ArrayList arrayList = new ArrayList();
        String concat = str.concat("$");
        for (String str2 : keySet) {
            if (str2.startsWith(concat)) {
                arrayList.add(str2);
            }
        }
        Collections.sort(arrayList);
        if (arrayList.size() <= 1) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        String str3 = null;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            if (!str4.equals(str3)) {
                arrayList2.add(str4);
                str3 = str4;
            }
        }
        return arrayList2;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C19562 m30045(String str) {
        C7897 m21184;
        int i = m30023().getInt("opt_dex_version");
        if (i <= 0 || i >= 7) {
            try {
                m21184 = m30059(str).f53012;
            } catch (IOException unused) {
                m21184 = C7897.m21184(15);
            }
        } else {
            m21184 = C7897.m21186(f37064[i]);
        }
        final int i2 = m21184.f24463;
        return (C19562) C17997.compute(this.f37072, str, new BiFunction() { // from class: l.ܶۧۢ
            public /* synthetic */ BiFunction andThen(Function function) {
                return C17167.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C19562 c19562 = (C19562) obj2;
                int i3 = i2;
                if (c19562 != null && c19562.f63232 == i3) {
                    return c19562;
                }
                C19562 c195622 = new C19562();
                c195622.f63232 = i3;
                return c195622;
            }
        });
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C17305 m30059(String str) {
        C12918 c12918;
        Map map = this.f37079;
        C17305 c17305 = (C17305) map.get(str);
        if (c17305 != null) {
            return c17305;
        }
        Reference reference = (Reference) this.f37075.get(str);
        if (reference != null && (c12918 = (C12918) reference.get()) != null) {
            c17305 = new C17305(c12918.mo27437(), c12918.m31408());
        }
        if (c17305 == null) {
            C23411 m36513 = new C11005(m30047(), str).m27340().m36513("r");
            try {
                m36513.seek(4L);
                C7897 m21186 = C7897.m21186((m36513.read() - 48) + ((m36513.read() - 48) * 10) + ((m36513.read() - 48) * 100));
                m36513.seek(96L);
                C17305 c173052 = new C17305(m21186, m36513.mo21172());
                m36513.close();
                c17305 = c173052;
            } catch (Throwable th) {
                try {
                    m36513.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        map.put(str, c17305);
        return c17305;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12918 m30065(String str) {
        C12918 c12918;
        C12918 c129182;
        Reference reference = (Reference) this.f37075.get(str);
        if (reference != null && (c129182 = (C12918) reference.get()) != null) {
            return c129182;
        }
        synchronized (this.f37075) {
            Reference reference2 = (Reference) this.f37075.get(str);
            if (reference2 != null && (c12918 = (C12918) reference2.get()) != null) {
                return c12918;
            }
            System.out.println("Read DexFile from file: " + str);
            InputStream m27334 = new C11005(m30047(), str).m27334();
            try {
                C12918 m31380 = C12918.m31380(m27334);
                this.f37075.put(str, new SoftReference(m31380));
                m27334.close();
                return m31380;
            } finally {
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C22357 m30064(final String str) {
        return (C22357) C17997.computeIfAbsent(this.f37086, str, new Function() { // from class: l.᩸ۧۢ
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                C7897 m21184;
                try {
                    m21184 = C12366.this.m30059(str).f53012;
                } catch (IOException unused) {
                    m21184 = C7897.m21184(15);
                }
                C22357 c22357 = new C22357();
                c22357.f72435 = m21184.f24463;
                return c22357;
            }
        });
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m30076(String str) {
        C18011 c18011 = (C18011) this.f37080.get(str);
        C11003.requireNonNull(c18011);
        return c18011.f56170;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17159 m30053() {
        C14336 m34211 = C14336.m34211(this.f37080.keySet());
        m34211.m34216(1);
        return m34211.m34215();
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m30071() {
        if (!this.f37078) {
            throw new IllegalStateException();
        }
        HashMap hashMap = this.f37080;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((C18011) it.next()).f56171 = null;
        }
        C11005 c11005 = new C11005(this.f37070, "smali");
        Iterator it2 = this.f37073.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            C11005 c110052 = new C11005(c11005, str);
            if (c110052.m27336()) {
                m30009(c110052, "", str);
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = hashMap.entrySet().iterator();
        while (it3.hasNext()) {
            C18011 c18011 = (C18011) ((Map.Entry) it3.next()).getValue();
            if (c18011.f56171 != null) {
                hashSet.add(c18011.f56169);
            } else if (c18011.f56168 == null) {
                it3.remove();
            }
        }
        C5242 c5242 = this.f37082;
        Set set = (Set) c5242.m1662();
        if (set != null && set.size() == hashSet.size() && set.containsAll(hashSet)) {
            return;
        }
        this.f37081 = hashSet;
        c5242.mo1664(C20195.unmodifiableSet(hashSet));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m30009(C11005 c11005, String str, String str2) {
        C11005[] m27335 = c11005.m27335();
        if (m27335 == null) {
            return;
        }
        for (C11005 c110052 : m27335) {
            if (c110052.m27340().mo23113()) {
                m30009(c110052, C22870.m50967(str, C8751.m22637(c110052.getName()), "/"), str2);
            } else {
                String m22647 = C8751.m22647(c110052.getName());
                if (m22647.endsWith(".smali")) {
                    StringBuilder m15339 = C5368.m15339(str);
                    m15339.append(m22647.substring(0, m22647.length() - 6));
                    String sb = m15339.toString();
                    HashMap hashMap = this.f37080;
                    C18011 c18011 = (C18011) hashMap.get(sb);
                    if (c18011 == null) {
                        c18011 = new C18011(sb);
                        hashMap.put(sb, c18011);
                    }
                    c18011.f56170 = str2;
                    c18011.f56171 = c110052;
                }
            }
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m30049() {
        HashMap hashMap = this.f37080;
        ArrayList arrayList = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            arrayList.add(new C13071(this, (C18011) it.next()));
        }
        Collections.sort(arrayList, new C4605());
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30033(ConcurrentLinkedQueue concurrentLinkedQueue, String str, boolean z, Predicate predicate) {
        m30034(new C9092(concurrentLinkedQueue), str, z, predicate);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30034(final InterfaceC7159 interfaceC7159, final String str, final boolean z, final Predicate predicate) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        boolean isEmpty = str.isEmpty();
        HashMap hashMap = this.f37080;
        if (isEmpty && predicate == null && z) {
            C5378.stream(hashMap.values()).sorted(C18011.f56166).map(new Function() { // from class: l.ۗۧۢ
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new C13071(C12366.this, (C18011) obj);
                }
            }).forEach(new Consumer() { // from class: l.֡ۧۢ
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void n(Object obj) {
                    InterfaceC7159.this.mo19184((C13071) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        } else {
            C5378.stream(hashMap.values()).filter(new Predicate() { // from class: l.ۚۧۢ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate2) {
                    return C19285.$default$and(this, predicate2);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate2) {
                    return C19285.$default$or(this, predicate2);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    String str2 = ((C18011) obj).f56169;
                    Predicate predicate2 = Predicate.this;
                    if (predicate2 != null && !predicate2.test(str2)) {
                        return false;
                    }
                    String str3 = str;
                    if (str2.startsWith(str3)) {
                        return z || str2.indexOf(47, str3.length()) == -1;
                    }
                    return false;
                }
            }).sorted(C18011.f56166).map(new Function() { // from class: l.֨ۧۢ
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new C13071(C12366.this, (C18011) obj);
                }
            }).forEach(new Consumer() { // from class: l.֡ۧۢ
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void n(Object obj) {
                    InterfaceC7159.this.mo19184((C13071) obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C23517.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11005 m30018(C11005 c11005) {
        return new C11005(m36263(), C20094.m46315("dexBuild", c11005.m27339().substring(new C11005(this.f37070, "smali").m27339().length()) + ".bin"));
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private C11005 m30001(String str) {
        return new C11005(m36263(), C4860.m14172("dexBuild/", str, ".dex"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m30005(String str, C11005 c11005, C11005 c110052) {
        byte[] m27337 = c11005.m27337();
        C19562 m30045 = m30045(str);
        int i = m30045.f63232;
        MessageDigest m34532 = C14460.m34532();
        m34532.update((byte) 1);
        m34532.update((byte) (i >>> 8));
        m34532.update((byte) i);
        byte[] digest = m34532.digest(m27337);
        if (m30014(digest, c110052)) {
            return;
        }
        C19357 m44986 = m30045.m44986();
        C9684.m24627(new String(m27337, StandardCharsets.UTF_8), m44986, m30045);
        C21473 c21473 = new C21473();
        m44986.m48534(c21473);
        c110052.m27338();
        OutputStream mo23555 = c110052.m27340().mo23555(false);
        try {
            mo23555.write(digest);
            mo23555.write(c21473.m48622(), 0, c21473.m48625());
            mo23555.close();
        } catch (Throwable th) {
            if (mo23555 != null) {
                try {
                    mo23555.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m30014(byte[] bArr, C11005 c11005) {
        if (c11005.m27336()) {
            try {
                InputStream m27334 = c11005.m27334();
                try {
                    for (int i : bArr) {
                        if (m27334.read() != (i & 255)) {
                            m27334.close();
                            return false;
                        }
                    }
                    if (m27334 != null) {
                        m27334.close();
                    }
                    return true;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7980 m30003(C11005 c11005) {
        return (C7980) ((AbstractC18605) new C12918(c11005.m27337(), f37063, true).mo27438()).iterator().next();
    }

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m30016() {
        boolean z;
        boolean z2;
        boolean m30014;
        C12366 c12366 = this;
        C18011[] c18011Arr = (C18011[]) c12366.f37080.values().toArray(new C18011[0]);
        for (C18011 c18011 : c18011Arr) {
            C11005 c11005 = c18011.f56171;
            if (c11005 != null) {
                C11005 m30018 = c12366.m30018(c11005);
                String str = c18011.f56170;
                if (m30018.m27336()) {
                    byte[] m27337 = c11005.m27337();
                    int i = c12366.m30045(str).f63232;
                    MessageDigest m34532 = C14460.m34532();
                    m34532.update((byte) 1);
                    m34532.update((byte) (i >>> 8));
                    m34532.update((byte) i);
                    m30014 = m30014(m34532.digest(m27337), m30018);
                } else {
                    m30014 = false;
                }
                if (!m30014) {
                    return true;
                }
            }
        }
        Bundle m30023 = m30023();
        int i2 = m30023.getInt("opt_dex_version");
        boolean z3 = m30023.getBoolean("opt_rm_source");
        boolean z4 = m30023.getBoolean("opt_rm_line");
        boolean z5 = m30023.getBoolean("opt_rm_param");
        boolean z6 = m30023.getBoolean("opt_rm_prologue");
        boolean z7 = m30023.getBoolean("opt_rm_local");
        boolean z8 = m30023.getBoolean("opt_rm_api_mod");
        boolean z9 = i2 == 0 && !(z3 || z4 || z5 || z6 || z7 || z8);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        MessageDigest m34534 = C14460.m34534();
        Iterator it = c12366.f37073.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            arrayList.clear();
            arrayList2.clear();
            int length = c18011Arr.length;
            Iterator it2 = it;
            int i3 = 0;
            while (i3 < length) {
                int i4 = length;
                C18011 c180112 = c18011Arr[i3];
                C18011[] c18011Arr2 = c18011Arr;
                if (c180112.f56170.equals(str2)) {
                    if (c180112.f56171 != null) {
                        arrayList2.add(c180112);
                    } else {
                        if (c180112.f56168 == null) {
                            throw new IOException("Bad class item: " + c180112.f56169.replace('/', '.'));
                        }
                        arrayList.add(c180112);
                    }
                }
                i3++;
                length = i4;
                c18011Arr = c18011Arr2;
            }
            C18011[] c18011Arr3 = c18011Arr;
            C11005 m30001 = c12366.m30001(str2);
            boolean z10 = z8;
            boolean z11 = z7;
            C11005 c110052 = new C11005(m36263(), C4860.m14172("dexBuild/", str2, ".digest"));
            if (z9 && arrayList2.isEmpty() && c12366.m30059(str2).f53011 == arrayList.size()) {
                z2 = z10;
                z = z11;
            } else {
                if (!m30001.m27336() || !c110052.m27336()) {
                    return true;
                }
                Comparator comparator = C18011.f56165;
                Collections.sort(arrayList, comparator);
                Collections.sort(arrayList2, comparator);
                m34534.reset();
                m34534.update((byte) i2);
                m34534.update(z3 ? (byte) 1 : (byte) 0);
                m34534.update(z4 ? (byte) 1 : (byte) 0);
                m34534.update(z5 ? (byte) 1 : (byte) 0);
                m34534.update(z6 ? (byte) 1 : (byte) 0);
                z = z11;
                m34534.update(z ? (byte) 1 : (byte) 0);
                z2 = z10;
                m34534.update(z2 ? (byte) 1 : (byte) 0);
                m34534.update((byte) -127);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C14460.m34528(m34534, ((C18011) it3.next()).f56169);
                }
                m34534.update(bo.h);
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    C18011 c180113 = (C18011) it4.next();
                    C14460.m34528(m34534, c180113.f56169);
                    C14460.m34527(m34534, c180113.f56171.m27334());
                }
                m34534.update((byte) -125);
                if (!m30013(m30001, c110052, m34534.digest())) {
                    return true;
                }
            }
            c12366 = this;
            it = it2;
            c18011Arr = c18011Arr3;
            boolean z12 = z2;
            z7 = z;
            z8 = z12;
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30035(InterfaceC10956 interfaceC10956) {
        boolean z;
        boolean z2;
        boolean z3;
        MessageDigest messageDigest;
        C7897 m21184;
        boolean z4;
        ArrayList arrayList;
        C21473 c21473;
        InterfaceC10956 interfaceC109562 = interfaceC10956;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C21473 c214732 = new C21473();
        C18011[] c18011Arr = (C18011[]) this.f37080.values().toArray(new C18011[0]);
        for (C18011 c18011 : c18011Arr) {
            C11005 c11005 = c18011.f56171;
            String str = c18011.f56169;
            if (c11005 != null) {
                interfaceC109562.mo22798(str);
                try {
                    m30005(c18011.f56170, c11005, m30018(c11005));
                } catch (C14658 e) {
                    throw new C1783(str, e);
                }
            }
        }
        Bundle m30023 = m30023();
        int i = m30023.getInt("opt_dex_version");
        boolean z5 = m30023.getBoolean("opt_rm_source");
        boolean z6 = m30023.getBoolean("opt_rm_line");
        boolean z7 = m30023.getBoolean("opt_rm_param");
        boolean z8 = m30023.getBoolean("opt_rm_prologue");
        boolean z9 = m30023.getBoolean("opt_rm_local");
        boolean z10 = m30023.getBoolean("opt_rm_api_mod");
        boolean z11 = i == 0 && !(z5 || z6 || z7 || z8 || z9 || z10);
        MessageDigest m34534 = C14460.m34534();
        ArrayList arrayList4 = this.f37073;
        boolean z12 = z10;
        int size = arrayList4.size();
        boolean z13 = z9;
        int i2 = 0;
        while (i2 < size) {
            ArrayList arrayList5 = arrayList4;
            String str2 = (String) arrayList4.get(i2);
            boolean z14 = z8;
            int i3 = i2 + 1;
            interfaceC109562.mo22797(i3, size, m30072(str2));
            arrayList2.clear();
            arrayList3.clear();
            c214732.m48623();
            int length = c18011Arr.length;
            int i4 = size;
            int i5 = 0;
            while (i5 < length) {
                int i6 = length;
                C18011 c180112 = c18011Arr[i5];
                C18011[] c18011Arr2 = c18011Arr;
                if (c180112.f56170.equals(str2)) {
                    if (c180112.f56171 != null) {
                        arrayList3.add(c180112);
                    } else {
                        if (c180112.f56168 == null) {
                            throw new IOException("Bad class item: " + c180112.f56169.replace('/', '.'));
                        }
                        arrayList2.add(c180112);
                    }
                }
                i5++;
                length = i6;
                c18011Arr = c18011Arr2;
            }
            C18011[] c18011Arr3 = c18011Arr;
            C11005 m30001 = m30001(str2);
            C21473 c214733 = c214732;
            C11005 c110052 = new C11005(m36263(), C4860.m14172("dexBuild/", str2, ".digest"));
            if (z11 && arrayList3.isEmpty() && m30059(str2).f53011 == arrayList2.size()) {
                m30001.m27333();
                c110052.m27333();
                arrayList = arrayList2;
                messageDigest = m34534;
                z4 = z12;
                z = z14;
                z2 = z13;
                c21473 = c214733;
                z3 = z11;
            } else {
                if (interfaceC10956.mo1526()) {
                    return;
                }
                Comparator comparator = C18011.f56165;
                Collections.sort(arrayList2, comparator);
                Collections.sort(arrayList3, comparator);
                m34534.reset();
                m34534.update((byte) i);
                m34534.update(z5 ? (byte) 1 : (byte) 0);
                m34534.update(z6 ? (byte) 1 : (byte) 0);
                m34534.update(z7 ? (byte) 1 : (byte) 0);
                z = z14;
                m34534.update(z ? (byte) 1 : (byte) 0);
                z2 = z13;
                m34534.update(z2 ? (byte) 1 : (byte) 0);
                boolean z15 = z12;
                z3 = z11;
                m34534.update(z15 ? (byte) 1 : (byte) 0);
                m34534.update((byte) -127);
                for (Iterator it = arrayList2.iterator(); it.hasNext(); it = it) {
                    C14460.m34528(m34534, ((C18011) it.next()).f56169);
                }
                m34534.update(bo.h);
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    C18011 c180113 = (C18011) it2.next();
                    C14460.m34528(m34534, c180113.f56169);
                    C14460.m34527(m34534, c180113.f56171.m27334());
                    z15 = z15;
                    it2 = it3;
                }
                boolean z16 = z15;
                m34534.update((byte) -125);
                byte[] digest = m34534.digest();
                if (m30013(m30001, c110052, digest)) {
                    arrayList = arrayList2;
                    messageDigest = m34534;
                    z4 = z16;
                    c21473 = c214733;
                } else {
                    if (interfaceC10956.mo1526()) {
                        return;
                    }
                    messageDigest = m34534;
                    C19277 c19277 = new C19277(arrayList3.size() + arrayList2.size());
                    c19277.m44459(new C22244(0, interfaceC109562));
                    if (i <= 0 || i >= 7) {
                        try {
                            m21184 = m30059(str2).f53012;
                        } catch (IOException unused) {
                            m21184 = C7897.m21184(15);
                        }
                    } else {
                        m21184 = C7897.m21186(f37064[i]);
                    }
                    C19357 c19357 = new C19357(m21184);
                    c19357.f62665 = z6;
                    c19357.f62661 = z2;
                    c19357.f62662 = z7;
                    c19357.f62666 = z;
                    c19357.f62667 = z5;
                    z4 = z16;
                    c19357.f62663 = z4;
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        ArrayList arrayList6 = arrayList2;
                        C18011 c180114 = (C18011) it4.next();
                        c19277.m44460(1);
                        try {
                            c19357.m44606((InterfaceC8566) new C13071(this, c180114).mo31669());
                            if (interfaceC10956.mo1526()) {
                                return;
                            } else {
                                arrayList2 = arrayList6;
                            }
                        } catch (C14658 e2) {
                            throw new C1783(c180114.f56169, e2);
                        }
                    }
                    arrayList = arrayList2;
                    Iterator it5 = arrayList3.iterator();
                    while (it5.hasNext()) {
                        C18011 c180115 = (C18011) it5.next();
                        c19277.m44460(1);
                        try {
                            c19357.m44606((InterfaceC8566) new C13071(this, c180115).mo31669());
                            if (interfaceC10956.mo1526()) {
                                return;
                            }
                        } catch (C14658 e3) {
                            throw new C1783(c180115.f56169, e3);
                        }
                    }
                    m30072(str2);
                    interfaceC10956.mo22799();
                    m30001.m27333();
                    c110052.m27333();
                    c21473 = c214733;
                    c19357.m48534(c21473);
                    m30001.m27340().m36503(c21473.m48622(), 0, c21473.m48625());
                    C10130 c10130 = new C10130();
                    c10130.writeInt(1936945938);
                    c10130.m25434(digest);
                    c10130.m25434(Arrays.copyOfRange(c21473.m48622(), 8, 32));
                    c110052.m27340().m36503(c10130.m25438(), 0, c10130.size());
                }
            }
            z13 = z2;
            z11 = z3;
            arrayList4 = arrayList5;
            i2 = i3;
            c18011Arr = c18011Arr3;
            m34534 = messageDigest;
            arrayList2 = arrayList;
            z8 = z;
            z12 = z4;
            size = i4;
            c214732 = c21473;
            interfaceC109562 = interfaceC10956;
        }
        this.f37068 = false;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m30077() {
        C11005 m36265 = m36265();
        m36265.m27340().m36508();
        Iterator it = this.f37073.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C11005 m30001 = m30001(str);
            if (!m30001.m27336()) {
                m30001 = new C11005(m30047(), str);
            }
            AbstractC15440 m27330 = m36265.m27330(m30072(str));
            InputStream m27334 = m30001.m27334();
            try {
                OutputStream mo23555 = m27330.mo23555(false);
                try {
                    C22194.m49852(m27334, mo23555);
                    if (mo23555 != null) {
                        mo23555.close();
                    }
                    if (m27334 != null) {
                        m27334.close();
                    }
                } finally {
                }
            } catch (Throwable th) {
                if (m27334 != null) {
                    try {
                        m27334.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30036(AbstractC15440 abstractC15440, boolean z) {
        abstractC15440.mo23546();
        Iterator it = this.f37073.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C11005 m30001 = m30001(str);
            if (m30001.m27336()) {
                AbstractC15440 m36526 = abstractC15440.m36526(m30072(str));
                if (z) {
                    m36526.m36529();
                }
                try {
                    InputStream m27334 = m30001.m27334();
                    try {
                        OutputStream mo23555 = m36526.mo23555(false);
                        try {
                            C22194.m49852(m27334, mo23555);
                            if (mo23555 != null) {
                                mo23555.close();
                            }
                            if (m27334 != null) {
                                m27334.close();
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (IOException e) {
                    if (z) {
                        m36526.m36532();
                    }
                    throw e;
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m30013(C11005 c11005, C11005 c110052, byte[] bArr) {
        if (c11005.m27336() && c110052.m27336()) {
            try {
                C12951 c12951 = new C12951(c110052.m27337());
                C22124.m49722((InterfaceC20008) c12951, 1936945938);
                if (Arrays.equals(c12951.m31496(), bArr)) {
                    DataInputStream dataInputStream = new DataInputStream(c11005.m27334());
                    byte[] bArr2 = new byte[24];
                    dataInputStream.readFully(bArr2, 0, 8);
                    dataInputStream.readFully(bArr2, 0, 24);
                    return Arrays.equals(c12951.m31496(), bArr2);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30007(InterfaceC8693 interfaceC8693, C19277 c19277, InterfaceC13508 interfaceC13508, Set set) {
        boolean z;
        if (interfaceC8693.mo1526()) {
            return;
        }
        c19277.m44460(1);
        C7980 mo31674 = interfaceC13508.mo31674();
        try {
            for (InterfaceC20561 interfaceC20561 : mo31674.getAnnotations()) {
                String type = interfaceC20561.getType();
                type.getClass();
                z = false;
                switch (type) {
                    case "Ldalvik/annotation/InnerClass;":
                    case "Ldalvik/annotation/MemberClasses;":
                    case "Ldalvik/annotation/Signature;":
                        break;
                    default:
                        z = true;
                        break;
                }
                if (z) {
                    Iterator it = interfaceC20561.getElements().iterator();
                    while (it.hasNext()) {
                        m30008(((InterfaceC9272) it.next()).getValue(), set);
                    }
                }
            }
            Iterator it2 = mo31674.getFields().iterator();
            while (it2.hasNext()) {
                m30006((InterfaceC3627) it2.next(), set);
            }
            Iterator it3 = mo31674.getMethods().iterator();
            while (it3.hasNext()) {
                m30012((InterfaceC18444) it3.next(), set);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30008(InterfaceC10410 interfaceC10410, Set set) {
        int mo2302 = interfaceC10410.mo2302();
        if (mo2302 == 23) {
            set.add(((InterfaceC17507) interfaceC10410).getValue());
            return;
        }
        if (mo2302 == 28) {
            Iterator it = ((InterfaceC20288) interfaceC10410).getValue().iterator();
            while (it.hasNext()) {
                m30008((InterfaceC10410) it.next(), set);
            }
        } else {
            if (mo2302 != 29) {
                return;
            }
            Iterator it2 = ((InterfaceC22404) interfaceC10410).getElements().iterator();
            while (it2.hasNext()) {
                m30008(((InterfaceC9272) it2.next()).getValue(), set);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30006(InterfaceC3627 interfaceC3627, Set set) {
        for (InterfaceC20561 interfaceC20561 : interfaceC3627.getAnnotations()) {
            String type = interfaceC20561.getType();
            type.getClass();
            switch (type) {
                case "Ldalvik/annotation/InnerClass;":
                case "Ldalvik/annotation/MemberClasses;":
                case "Ldalvik/annotation/Signature;":
                    break;
                default:
                    Iterator it = interfaceC20561.getElements().iterator();
                    while (it.hasNext()) {
                        m30008(((InterfaceC9272) it.next()).getValue(), set);
                    }
                    break;
            }
        }
        InterfaceC10410 mo11109 = interfaceC3627.mo11109();
        if (mo11109 != null) {
            m30008(mo11109, set);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m30012(InterfaceC18444 interfaceC18444, Set set) {
        for (InterfaceC20561 interfaceC20561 : interfaceC18444.getAnnotations()) {
            String type = interfaceC20561.getType();
            type.getClass();
            switch (type) {
                case "Ldalvik/annotation/InnerClass;":
                case "Ldalvik/annotation/MemberClasses;":
                case "Ldalvik/annotation/Signature;":
                    break;
                default:
                    Iterator it = interfaceC20561.getElements().iterator();
                    while (it.hasNext()) {
                        m30008(((InterfaceC9272) it.next()).getValue(), set);
                    }
                    break;
            }
        }
        InterfaceC19150 mo3570 = interfaceC18444.mo3570();
        if (mo3570 != null) {
            for (InterfaceC22677 interfaceC22677 : mo3570.mo3817()) {
                EnumC3664 enumC3664 = interfaceC22677.mo3975().f3316;
                if (enumC3664 == EnumC3664.Format21c || enumC3664 == EnumC3664.Format31c) {
                    if (interfaceC22677.mo3975().f3318 == 0) {
                        set.add(((InterfaceC15347) ((InterfaceC10952) interfaceC22677).getReference()).getString());
                    }
                }
            }
        }
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m30019() {
        C11005 c11005 = new C11005(m30044(), "rename_map");
        C10130 c10130 = new C10130();
        for (Map.Entry entry : this.f37084.entrySet()) {
            c10130.m25423((CharSequence) entry.getKey());
            c10130.m25423((CharSequence) entry.getValue());
        }
        c11005.m27340().m36496(c10130);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30032(HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            HashMap hashMap3 = this.f37080;
            if (hashMap3.containsKey(str2)) {
                throw new IOException("Class exists: " + str2.replace('/', '.'));
            }
            C18011 c18011 = (C18011) hashMap3.get(str);
            if (c18011 == null) {
                throw new IOException("Class not found: " + str.replace('/', '.'));
            }
            hashMap2.put(c18011, str2);
        }
        if (hashMap2.isEmpty()) {
            return;
        }
        int i = 0;
        this.f37078 = false;
        HashSet hashSet = new HashSet();
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            C18011 c180112 = (C18011) entry2.getKey();
            String m30025 = m30025(c180112);
            String str3 = c180112.f56169;
            String str4 = (String) entry2.getValue();
            m30028(c180112.f56170, str4, m30025);
            hashSet.add(str3);
            HashMap hashMap4 = this.f37084;
            hashMap4.put(str4, (String) C13843.getOrDefault(hashMap4, str3, str3));
        }
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f37066;
            if (i >= arrayList.size()) {
                break;
            }
            String str5 = (String) hashMap.get(arrayList.get(i));
            if (str5 != null) {
                arrayList.set(i, str5);
                z = true;
            }
            i++;
        }
        m30031(hashSet);
        m30019();
        m30042(true);
        if (z) {
            m30017();
            m30015();
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m30072(String str) {
        String str2 = (String) this.f37083.get(str);
        return str2 == null ? C16014.m37867(str, ".dex") : str2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m30022(String str, String str2) {
        String m36561 = C15472.m36561(1, 1, str2);
        boolean equals = m36561.equals(str);
        HashMap hashMap = this.f37069;
        if (equals) {
            if (hashMap.remove(m36561) != null) {
                m30020();
            }
        } else {
            if (str.equals(hashMap.put(m36561, str))) {
                return;
            }
            m30020();
        }
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m30020() {
        try {
            C10130 c10130 = new C10130();
            for (Map.Entry entry : this.f37069.entrySet()) {
                c10130.m25423((CharSequence) entry.getKey());
                c10130.m25423((CharSequence) entry.getValue());
            }
            m30044().m27330("map").m36496(c10130);
        } catch (IOException e) {
            this.f37077.mo1664(e);
        }
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m30046(String str) {
        String str2 = (String) this.f37069.get(str);
        return str2 == null ? str : str2;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Map m30055() {
        Set set = this.f37081;
        HashMap hashMap = this.f37069;
        if (hashMap.isEmpty() && set.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap2 = new HashMap(C23868.m52580(set.size() + hashMap.size(), 4, 3, 1));
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!str2.startsWith("# TOO_LONG_NAME/")) {
                hashMap2.put(str2, "");
            } else {
                String str3 = (String) C13843.putIfAbsent(hashMap2, str2, str);
                if (str3 != null && !str3.equals(str)) {
                    hashMap2.put(str2, "");
                }
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashMap2.put((String) it.next(), "");
        }
        return hashMap2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30057(ActivityC17169 activityC17169) {
        this.f37085.m2369(activityC17169);
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m30024() {
        this.f37085.m2368();
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m30051() {
        C0577 c0577 = this.f37085;
        c0577.m2368();
        c0577.m2374();
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m30075() {
        C0577 c0577 = this.f37085;
        c0577.m2372();
        c0577.m2373();
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m30061() {
        this.f37085.m2371();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC13508 m30066(String str) {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            return null;
        }
        return new C13071(this, c18011);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m30062(String str) {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            return -268435456;
        }
        C11005 c11005 = c18011.f56171;
        if (c11005 != null) {
            return Long.valueOf(c11005.m27340().mo23117() ^ c11005.m27340().mo23127()).hashCode();
        }
        return c18011.f56168 != null ? -536870912 : -268435456;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m30054(String str) {
        C22706 c22706;
        HashMap hashMap = this.f37080;
        C18011 c18011 = (C18011) hashMap.get(str);
        C0577 c0577 = this.f37085;
        if (c18011 != null) {
            HashMap hashMap2 = this.f37084;
            if (hashMap2.containsKey(str)) {
                String str2 = (String) hashMap2.get(str);
                C18011 c180112 = (C18011) this.f37076.get(str2);
                if (c180112 == null) {
                    c180112 = (C18011) hashMap.get(str2);
                }
                if (c180112 != null && c180112.f56168 != null) {
                    c0577.getClass();
                    c22706 = new C22706();
                    c0577.m2370(c180112, c22706);
                    return c22706.toString();
                }
            }
        }
        if (c18011 == null || c18011.f56168 == null) {
            return "";
        }
        c0577.getClass();
        c22706 = new C22706();
        c0577.m2370(c18011, c22706);
        return c22706.toString();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m30052(String str) {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            throw new C19401("Class not found: " + str.replace('/', '.'));
        }
        return m30025(c18011);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m30025(C18011 c18011) {
        C11005 c11005 = c18011.f56171;
        if (c11005 != null) {
            return c11005.m27340().m36489();
        }
        if (c18011.f56168 != null) {
            C0577 c0577 = this.f37085;
            c0577.getClass();
            C22706 c22706 = new C22706();
            c0577.m2370(c18011, c22706);
            return c22706.toString();
        }
        throw new C19401("Bad class: " + c18011.f56169.replace('/', '.'));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30029(String str, C22706 c22706) {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            throw new C19401("Class not found: " + str.replace('/', '.'));
        }
        m30039(c18011, c22706);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30039(C18011 c18011, C22706 c22706) {
        C11005 c11005 = c18011.f56171;
        if (c11005 != null) {
            AbstractC15440 m27340 = c11005.m27340();
            m27340.getClass();
            try {
                InputStream mo27926 = m27340.mo27926();
                try {
                    C22194.m49853(mo27926, c22706, Charset.defaultCharset());
                    if (mo27926 != null) {
                        mo27926.close();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    if (mo27926 != null) {
                        try {
                            mo27926.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                C12598.m30862(m27340, e);
                throw e;
            }
        }
        if (c18011.f56168 != null) {
            this.f37085.m2370(c18011, c22706);
        } else {
            throw new C19401("Bad class: " + c18011.f56169.replace('/', '.'));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30056(String str, String str2) {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            throw new C19401("Class not found: " + str.replace('/', '.'));
        }
        synchronized (this) {
            C19562 m30045 = m30045(c18011.f56170);
            C0657 m24627 = C9684.m24627(str2, m30045.m44986(), m30045);
            if (m24627 == null) {
                throw new IOException("Unknown error");
            }
            m30022(c18011.f56169, m24627.getType());
            m30038(c18011, str2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30027(String str, String str2) {
        C18011 c18011 = (C18011) this.f37080.get(str);
        if (c18011 == null) {
            throw new C19401("Class not found: " + str.replace('/', '.'));
        }
        m30038(c18011, str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m30038(C18011 c18011, String str) {
        boolean z;
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        if (c18011.f56171 == null) {
            C11005 c11005 = new C11005(new C11005(this.f37070, "smali"), c18011.f56170);
            c18011.f56171 = C11005.m27329(c11005, C8751.m22641(c11005.m27340(), c18011.f56169 + ".smali"));
            z = true;
        } else {
            z = false;
        }
        c18011.f56171.m27332(bytes);
        if (this.f37078 && z) {
            this.f37081.add(c18011.f56169);
            this.f37082.mo1664(C20195.unmodifiableSet(this.f37081));
        }
        this.f37067 = 0L;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m30068(String str) {
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        ArrayList arrayList = new ArrayList();
        for (C18011 c18011 : this.f37080.values()) {
            if (c18011.f56169.startsWith(str)) {
                arrayList.add(c18011.f56169);
            }
        }
        m30031((Collection) arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30031(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C18011 c18011 = (C18011) this.f37080.remove(str);
            if (c18011 != null) {
                C11005 c11005 = c18011.f56171;
                if (c11005 != null) {
                    c11005.m27333();
                    if (this.f37078) {
                        this.f37081.remove(str);
                        z2 = true;
                    }
                    c18011.f56171 = null;
                }
                if (c18011.f56168 != null) {
                    this.f37076.put(str, c18011);
                    sb.append(str);
                    sb.append('\n');
                }
                if (this.f37066.contains(str)) {
                    z = true;
                }
                if (this.f37084.remove(str) != null) {
                    z3 = true;
                }
            }
        }
        int length = sb.length();
        C5242 c5242 = this.f37077;
        if (length > 0) {
            AbstractC15440 m27330 = m30044().m27330("removed");
            try {
                m27330.mo35195();
                m27330.m36516(sb.toString());
            } catch (Throwable th) {
                c5242.mo1664(th);
            }
        }
        if (z) {
            m30015();
        }
        if (z2) {
            this.f37082.mo1664(C20195.unmodifiableSet(this.f37081));
        }
        if (z3) {
            try {
                m30019();
            } catch (IOException e) {
                c5242.mo1664(e);
            }
        }
        this.f37067 = 0L;
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m30017() {
        AbstractC15440 m27330 = m30044().m27330("recent");
        try {
            m27330.getClass();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(m27330.mo23555(false), StandardCharsets.UTF_8));
            try {
                Iterator it = this.f37066.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write((String) it.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } finally {
            }
        } catch (Throwable th) {
            this.f37077.mo1664(th);
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m30070(String str) {
        if (this.f37066.remove(str)) {
            m30017();
            m30015();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m30060() {
        this.f37066.clear();
        m30017();
        m30015();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Bundle m30023() {
        if (this.f37065 == null) {
            this.f37065 = new Bundle();
            AbstractC15440 m27330 = m30044().m27330("options");
            if (m27330.mo23119()) {
                try {
                    byte[] m36506 = m27330.m36506();
                    Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(m36506, 0, m36506.length);
                    obtain.setDataPosition(0);
                    this.f37065.readFromParcel(obtain);
                    obtain.recycle();
                } catch (Exception e) {
                    this.f37077.mo1664(e);
                }
            }
        }
        return this.f37065;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m30074() {
        if (this.f37065 == null) {
            return;
        }
        AbstractC15440 m27330 = m30044().m27330("options");
        try {
            Parcel obtain = Parcel.obtain();
            this.f37065.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            m27330.m36502(marshall);
        } catch (IOException e) {
            this.f37077.mo1664(e);
        }
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m30015() {
        ArrayList arrayList = this.f37066;
        this.f37071.mo1664(C20195.unmodifiableList(new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 15)))));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30037(ActivityC17169 activityC17169, C4650 c4650) {
        this.f37077.m1668(activityC17169, c4650);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30040(C21912 c21912, C1700 c1700) {
        this.f37071.m1668(c21912, c1700);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30041(C21912 c21912, C4273 c4273) {
        this.f37082.m1668(c21912, c4273);
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final Set m30069() {
        return C20195.unmodifiableSet(this.f37081);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m30043(final l.ActivityC17169 r9, l.C3764 r10) {
        /*
            r8 = this;
            boolean r0 = r8.m36267()
            r1 = 0
            if (r0 == 0) goto L8d
            l.ۧ۫᩷ r0 = r8.m30044()
            java.lang.String r2 = "strings_changed"
            l.ܶ᩵ܿ r0 = r0.m27330(r2)
            boolean r0 = r0.mo23120()
            boolean r2 = r9.m40366()
            r3 = 1
            if (r2 != 0) goto L48
            boolean r2 = r8.f37068
            if (r2 == 0) goto L21
            goto L42
        L21:
            long r4 = android.os.SystemClock.uptimeMillis()
            long r6 = r8.f37067
            long r4 = r4 - r6
            r6 = 3000(0xbb8, double:1.482E-320)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L31
            boolean r2 = r8.f37068
            goto L43
        L31:
            boolean r2 = r8.m30016()     // Catch: java.lang.Exception -> L40
            r8.f37068 = r2     // Catch: java.lang.Exception -> L40
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Exception -> L40
            r8.f37067 = r4     // Catch: java.lang.Exception -> L40
            boolean r2 = r8.f37068     // Catch: java.lang.Exception -> L40
            goto L43
        L40:
            r8.f37068 = r3
        L42:
            r2 = 1
        L43:
            if (r2 == 0) goto L46
            goto L48
        L46:
            r2 = 0
            goto L49
        L48:
            r2 = 1
        L49:
            if (r0 == 0) goto L87
            int r0 = l.DialogInterfaceC0206.f1451
            l.᩵ۚۢ r0 = new l.᩵ۚۢ
            r0.<init>(r9)
            r4 = 2131889019(0x7f120b7b, float:1.941269E38)
            r0.m44433(r4)
            r4 = 2131888641(0x7f120a01, float:1.9411923E38)
            r0.m44416(r4)
            l.᩵ۧۢ r4 = new l.᩵ۧۢ
            r4.<init>(r1, r10)
            r10 = 2131889035(0x7f120b8b, float:1.9412722E38)
            r0.m44442(r10, r4)
            if (r2 == 0) goto L78
            l.᩷ܿ᩷ r10 = new l.᩷ܿ᩷
            r1 = 4
            r10.<init>(r1, r9)
            r9 = 2131887205(0x7f120465, float:1.940901E38)
            r0.m44440(r9, r10)
            goto L83
        L78:
            l.۠ۧۢ r10 = new l.۠ۧۢ
            r10.<init>()
            r9 = 2131886873(0x7f120319, float:1.9408337E38)
            r0.m44440(r9, r10)
        L83:
            r0.m44438()
            return r3
        L87:
            if (r2 == 0) goto L8d
            r9.m40351()
            return r3
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C12366.m30043(l.ܿۛ᩷, l.ۘۛ᩷):boolean");
    }
}

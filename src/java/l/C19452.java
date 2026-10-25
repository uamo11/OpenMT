package l;

import com.alipay.sdk.m.t.e;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;
import org.simpleframework.xml.core.Entry;
import org.simpleframework.xml.stream.DocumentReader;

/* compiled from: 51FV */
/* renamed from: l.᩵ۨ᩷, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19452 extends C15256 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f62909 = C14460.m34532().getDigestLength();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f62910;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C5242 f62911;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f62912;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C4583 f62913;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C5242 f62914;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11005 f62915;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C5242 f62916;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C8367 f62917;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f62918;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f62919;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f62920;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f62921;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f62922;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Set f62923;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f62924;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44801(C19452 c19452, C0732 c0732, C10355 c10355, C2678 c2678, C12555 c12555, C18116 c18116, Map map) {
        String str = c0732.f2758;
        try {
            C19220 m44809 = c19452.m44809(c0732);
            c10355.m26165();
            C11766.m28799(m44809, c2678, c10355, c12555, c18116);
            List m26159 = c10355.m26159();
            if (map != null) {
                map.put(str, m26159);
            }
            m44809.m44349();
        } catch (C1580 e) {
            throw new C5672(str, e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m44819(String str, String str2) {
        if (!this.f62921.containsKey(str)) {
            C0732 c0732 = new C0732(str, false);
            C11005 c11005 = new C11005(new C11005(this.f62915, DocumentReader.RESERVED), str + ".xml");
            c0732.f2760 = c11005;
            c11005.m27340().m36510(str2);
            this.f62921.put(str, c0732);
            if (this.f62918) {
                this.f62923.add(str);
                this.f62914.mo1664(C20195.unmodifiableSet(this.f62923));
            }
        } else {
            throw new C19401("Xml exists: " + str);
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C19452 m44813(C11005 c11005) {
        return new C19452(c11005);
    }

    public C19452(C11005 c11005) {
        super(c11005);
        this.f62921 = new HashMap();
        this.f62910 = new ArrayList();
        Set set = Collections.EMPTY_SET;
        this.f62923 = set;
        this.f62917 = new C8367();
        this.f62916 = new C5242();
        this.f62911 = new C5242();
        this.f62914 = new C5242();
        this.f62918 = true;
        this.f62919 = false;
        this.f62913 = new C4583();
        C11005 c110052 = new C11005(c11005, "arsc");
        this.f62915 = c110052;
        C12171.m29642(c110052.m27336());
        AbstractC15440 m27330 = m44854().m27330("removed");
        Set set2 = set;
        if (m27330.mo23120()) {
            BufferedReader m36521 = m27330.m36521();
            try {
                HashSet hashSet = new HashSet();
                while (true) {
                    String readLine = m36521.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        hashSet.add(readLine);
                    }
                }
                m36521.close();
                set2 = hashSet;
            } finally {
            }
        }
        C11005 c110053 = new C11005(m44839(), "xmls");
        if (!c110053.m27336()) {
            throw new IOException("File not found: " + c110053.m27339());
        }
        ArrayList m44814 = m44814(c110053);
        this.f62922 = m44814.size();
        Iterator it = m44814.iterator();
        while (it.hasNext()) {
            C0732 c0732 = (C0732) it.next();
            if (!set2.contains(c0732.f2758)) {
                this.f62921.put(c0732.f2758, c0732);
            }
        }
        m44816();
        ArrayList arrayList = this.f62910;
        AbstractC15440 m273302 = m44854().m27330("recent");
        if (m273302.mo23120()) {
            arrayList.clear();
            BufferedReader m365212 = m273302.m36521();
            while (true) {
                try {
                    String readLine2 = m365212.readLine();
                    if (readLine2 == null) {
                        break;
                    } else if (!readLine2.isEmpty()) {
                        arrayList.add(readLine2);
                    }
                } finally {
                }
            }
            m365212.close();
            m44811();
        }
        this.f62920 = new C11005(m44854(), "name").m27340().m36489();
        C11005 c110054 = new C11005(m44854(), "pkgsort");
        if (c110054.m27336()) {
            C12951 c12951 = new C12951(c110054.m27337());
            C22124.m49722((InterfaceC20008) c12951, -1430501583);
            while (c12951.available() > 0) {
                this.f62917.mo21965(c12951.m31494(), (Object) c12951.m31506());
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m44814(C11005 c11005) {
        boolean z;
        C11541 c11541 = new C11541(c11005.m27340());
        try {
            if (c11541.m28418() == 1920094587) {
                c11541.skipBytes(4);
                z = true;
            } else {
                C22124.m49722(c11541, 1920094586);
                z = false;
            }
            int readInt = c11541.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                String m28421 = c11541.m28421();
                int readInt2 = c11541.readInt();
                int readInt3 = c11541.readInt();
                C0732 c0732 = new C0732(m28421, z);
                c0732.f2765 = c11005;
                c0732.f2764 = readInt2;
                c0732.f2763 = readInt3;
                arrayList.add(c0732);
            }
            c11541.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                c11541.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11005 m44839() {
        return new C11005(this.f62915, e.m);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C11005 m44854() {
        return new C11005(this.f62915, "config");
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m44837() {
        return this.f62920;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44830(boolean z) {
        this.f62918 = z;
        if (z) {
            m44816();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m44802(C11005 c11005, C11005 c110052, byte[] bArr) {
        if (this.f62919 || !c11005.m27336() || !c110052.m27336()) {
            return false;
        }
        try {
            C12951 c12951 = new C12951(c110052.m27337());
            C22124.m49722((InterfaceC20008) c12951, 1936945938);
            if (!Arrays.equals(c12951.m31496(), bArr)) {
                return false;
            }
            MessageDigest m34526 = C14460.m34526();
            C14460.m34527(m34526, c11005.m27340().mo27926());
            return Arrays.equals(c12951.m31496(), m34526.digest());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m44838(String str) {
        return this.f62921.containsKey(str);
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Collection m44852() {
        return this.f62921.values();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C17159 m44834() {
        C14336 m34211 = C14336.m34211(this.f62921.keySet());
        m34211.m34217(new C3404(2));
        C17159 m34215 = m34211.m34215();
        Collections.sort(m34215.m40255(), new C14511(this));
        return m34215;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ int m44792(C19452 c19452, C17159 c17159, C17159 c171592) {
        C8367 c8367 = c19452.f62917;
        int mo24837 = c8367.mo24837(EnumC3478.f11018, c17159.m40257());
        int mo248372 = c8367.mo24837(EnumC3478.f11018, c171592.m40257());
        if (mo24837 == mo248372) {
            return c17159.m40257().compareToIgnoreCase(c171592.m40257());
        }
        return Integer.compare(mo24837, mo248372);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m44816() {
        C11005[] c11005Arr;
        int i;
        int i2;
        if (!this.f62918) {
            throw new IllegalStateException();
        }
        HashMap hashMap = this.f62921;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((C0732) it.next()).f2760 = null;
        }
        C11005[] m27335 = new C11005(this.f62915, DocumentReader.RESERVED).m27335();
        int i3 = 0;
        if (m27335 == null) {
            m27335 = new C11005[0];
        }
        int length = m27335.length;
        int i4 = 0;
        while (i4 < length) {
            C11005 c11005 = m27335[i4];
            if (c11005.m27340().mo23113()) {
                String str = c11005.getName() + "/";
                C11005 c110052 = new C11005(c11005, "package-info.xml");
                if (c110052.m27336()) {
                    String m37867 = C16014.m37867(str, "package-info");
                    C0732 c0732 = (C0732) hashMap.get(m37867);
                    if (c0732 == null) {
                        c0732 = new C0732(m37867, i3);
                        hashMap.put(m37867, c0732);
                    }
                    c0732.f2760 = c110052;
                }
                C11005[] m273352 = c11005.m27335();
                if (m273352 == null) {
                    m273352 = new C11005[i3];
                }
                int length2 = m273352.length;
                int i5 = 0;
                int i6 = i3;
                while (i5 < length2) {
                    C11005 c110053 = m273352[i5];
                    if (c110053.m27340().mo23113()) {
                        String name = c110053.getName();
                        String m50967 = C22870.m50967(str, name, "/");
                        C11005[] m273353 = c110053.m27335();
                        if (m273353 == null) {
                            m273353 = new C11005[i6];
                        }
                        int length3 = m273353.length;
                        int i7 = 0;
                        while (i7 < length3) {
                            C11005 c110054 = m273353[i7];
                            if (c110054.m27340().mo23119()) {
                                c11005Arr = m27335;
                                i = length3;
                                if (c110054.getName().toLowerCase().endsWith(".xml")) {
                                    i2 = length;
                                    String m36561 = C15472.m36561(4, 0, c110054.getName());
                                    if (m36561.startsWith(name) || m36561.equals("type-info")) {
                                        String m378672 = C16014.m37867(m50967, m36561);
                                        C0732 c07322 = (C0732) hashMap.get(m378672);
                                        if (c07322 == null) {
                                            c07322 = new C0732(m378672, false);
                                            hashMap.put(m378672, c07322);
                                        }
                                        c07322.f2760 = c110054;
                                    }
                                    i7++;
                                    length3 = i;
                                    m27335 = c11005Arr;
                                    length = i2;
                                }
                            } else {
                                c11005Arr = m27335;
                                i = length3;
                            }
                            i2 = length;
                            i7++;
                            length3 = i;
                            m27335 = c11005Arr;
                            length = i2;
                        }
                    }
                    i5++;
                    i6 = 0;
                    m27335 = m27335;
                    length = length;
                }
            }
            i4++;
            i3 = 0;
            m27335 = m27335;
            length = length;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = hashMap.entrySet().iterator();
        while (it2.hasNext()) {
            C0732 c07323 = (C0732) ((Map.Entry) it2.next()).getValue();
            if (c07323.f2760 != null) {
                hashSet.add(c07323.f2758);
            } else if (c07323.f2765 == null) {
                it2.remove();
            }
        }
        C5242 c5242 = this.f62914;
        Set set = (Set) c5242.m1662();
        if (set != null && set.size() == hashSet.size() && set.containsAll(hashSet)) {
            return;
        }
        this.f62923 = hashSet;
        c5242.mo1664(C20195.unmodifiableSet(hashSet));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44822(ConcurrentLinkedQueue concurrentLinkedQueue, String str, boolean z, Set set) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        for (C0732 c0732 : this.f62921.values()) {
            String str2 = c0732.f2758;
            if (set == null || set.contains(str2)) {
                if (str2.startsWith(str) && (z || str2.indexOf(47, str.length()) == -1)) {
                    concurrentLinkedQueue.add(new C18746(this, c0732));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C11005 m44808(C11005 c11005) {
        return new C11005(m36263(), C20094.m46315("arscBuild", c11005.m27339().substring(new C11005(this.f62915, DocumentReader.RESERVED).m27339().length()) + ".bin"));
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private C11005 m44804() {
        return new C11005(m36263(), "arscBuild/resources.arsc");
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    private boolean m44805() {
        Iterator it = this.f62921.values().iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                return false;
            }
            C11005 c11005 = ((C0732) it.next()).f2760;
            if (c11005 != null) {
                C11005 m44808 = m44808(c11005);
                if (m44808.m27336()) {
                    z = m44803(C14460.m34532().digest(c11005.m27337()), m44808);
                }
                if (!z) {
                    return true;
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C19220 m44810(C11005 c11005, C11005 c110052) {
        byte[] m27337 = c11005.m27337();
        byte[] digest = C14460.m34532().digest(m27337);
        if (m44803(digest, c110052)) {
            return null;
        }
        C19220 m44340 = C19220.m44340(new String(m27337, StandardCharsets.UTF_8), false);
        m44340.getClass();
        C10130 c10130 = new C10130();
        m44340.m44344(c10130);
        c110052.m27338();
        OutputStream mo23555 = c110052.m27340().mo23555(false);
        try {
            mo23555.write(digest);
            mo23555.write(c10130.m25438(), 0, c10130.size());
            mo23555.close();
            return m44340;
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
    public static boolean m44803(byte[] bArr, C11005 c11005) {
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
    public static C19220 m44798(C11005 c11005) {
        C12951 c12951 = new C12951(c11005.m27337());
        c12951.skipBytes(f62909);
        return C19220.m44341(c12951);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0019 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.ConcurrentMapC10942 m44833() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19452.m44833():l.ۧۤᩴ");
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    private boolean m44790() {
        if (!m44805()) {
            C11005 c11005 = new C11005(m36263(), "arscBuild/records");
            if (c11005.m27336()) {
                C8868 c8868 = new C8868(this);
                c8868.m22905();
                byte[] m22906 = c8868.m22906();
                boolean z = false;
                if (!this.f62919 && c11005.m27336()) {
                    byte[] bArr = new byte[m22906.length + 8];
                    try {
                        new DataInputStream(c11005.m27334()).readFully(bArr);
                        C12951 c12951 = new C12951(bArr);
                        C22124.m49722((InterfaceC20008) c12951, -416934225);
                        C22124.m49722((InterfaceC20008) c12951, m22906.length);
                        c12951.seek(4L);
                        z = Arrays.equals(c12951.m31496(), m22906);
                    } catch (Exception unused) {
                    }
                }
                return !z;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44831(boolean z, InterfaceC5880 interfaceC5880) {
        C13656 c13656;
        HashMap hashMap = this.f62921;
        for (C0732 c0732 : hashMap.values()) {
            C11005 c11005 = c0732.f2760;
            String str = c0732.f2758;
            if (c11005 != null) {
                interfaceC5880.mo16443(str);
                try {
                    m44810(c11005, m44808(c11005));
                } catch (C1580 e) {
                    throw new C5672(str, e);
                }
            }
        }
        interfaceC5880.mo16444();
        C8868 c8868 = new C8868(this);
        c8868.m22905();
        C11005 m44804 = m44804();
        C11005 c110052 = new C11005(m36263(), "arscBuild/resources.digest");
        C11005 c110053 = new C11005(m36263(), "arscBuild/records");
        if (c8868.f27006.isEmpty() && this.f62922 == c8868.f27005.size() && !this.f62919) {
            m44804.m27333();
            c110052.m27333();
            this.f62924 = false;
            return;
        }
        if (interfaceC5880.mo1526()) {
            return;
        }
        byte[] m22906 = c8868.m22906();
        if (m44802(m44804, c110052, m22906)) {
            this.f62924 = false;
            return;
        }
        if (interfaceC5880.mo1526()) {
            return;
        }
        ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
        try {
            C9028 m44795 = m44795(hashMap, interfaceC5880, concurrentMapC10942, false);
            C19220.m44342();
            if (interfaceC5880.mo1526()) {
                return;
            }
            interfaceC5880.mo16441();
            m44804.m27333();
            c110052.m27333();
            if (z) {
                C19277 m23287 = m44795.m23287();
                m23287.m44459(new C2742(3, interfaceC5880));
                m44804.m27338();
                c13656 = new C13656(m44804.m27340());
                try {
                    m44795.m23283(c13656, m23287);
                    c13656.close();
                    this.f62913.m13482(m44795);
                    MessageDigest m34526 = C14460.m34526();
                    C14460.m34527(m34526, m44804.m27334());
                    byte[] digest = m34526.digest();
                    C10130 c10130 = new C10130();
                    c10130.writeInt(1936945938);
                    c10130.m25434(m22906);
                    c10130.m25434(digest);
                    c110052.m27340().m36503(c10130.m25438(), 0, c10130.size());
                } finally {
                }
            }
            c110053.m27338();
            try {
                c13656 = new C13656(c110053.m27340());
                try {
                    c13656.writeInt(-416934225);
                    c13656.m32816(m22906);
                    c13656.writeInt(concurrentMapC10942.size());
                    for (Map.Entry entry : concurrentMapC10942.entrySet()) {
                        c13656.m32815((String) entry.getKey());
                        c13656.writeInt(((List) entry.getValue()).size());
                        for (C24032 c24032 : (List) entry.getValue()) {
                            int i = c24032.f77861;
                            int i2 = c24032.f77859;
                            int i3 = c24032.f77862;
                            C21916[] c21916Arr = c24032.f77863;
                            if (i != 0) {
                                if (i == 1) {
                                    if (c21916Arr != null) {
                                        c13656.writeByte(101);
                                    } else {
                                        c13656.writeByte(1);
                                    }
                                    c13656.writeInt(i3);
                                    c13656.writeInt(i2);
                                    c13656.m32814((CharSequence) c24032.f77864);
                                    if (c21916Arr != null) {
                                        c13656.mo13231(c21916Arr.length);
                                        for (C21916 c21916 : c21916Arr) {
                                            c13656.m32815(c21916.f70169);
                                            c13656.writeInt(c21916.f70168);
                                            c13656.writeInt(c21916.f70167);
                                        }
                                    }
                                } else if (i != 2 && i != 3) {
                                    throw new RuntimeException();
                                }
                            }
                            c13656.writeByte(i);
                            c13656.writeInt(i3);
                            c13656.writeInt(i2);
                            c13656.writeInt(c24032.f77860);
                        }
                    }
                    c13656.close();
                    this.f62924 = false;
                    this.f62912 = false;
                } finally {
                }
            } catch (IOException | RuntimeException e2) {
                c110053.m27333();
                throw e2;
            }
        } catch (Throwable th) {
            C19220.m44342();
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44824(InterfaceC5880 interfaceC5880) {
        C11005 c11005;
        Iterator it = this.f62921.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                c11005 = null;
                break;
            } else {
                c11005 = ((C0732) it.next()).f2765;
                if (c11005 != null) {
                    break;
                }
            }
        }
        if (c11005 != null && c11005.m27340().mo23127() <= 31457280 && c11005.m27340().mo23127() <= 52428800) {
            ArrayList m44814 = m44814(c11005);
            HashMap hashMap = new HashMap();
            Iterator it2 = m44814.iterator();
            while (it2.hasNext()) {
                C0732 c0732 = (C0732) it2.next();
                hashMap.put(c0732.f2758, c0732);
            }
            try {
                m44795(hashMap, interfaceC5880, (ConcurrentMapC10942) null, true);
            } finally {
                C19220.m44342();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x0647, code lost:
    
        return r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v67, types: [l.ᩴۘܽ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C9028 m44795(java.util.HashMap r33, l.InterfaceC5880 r34, final l.ConcurrentMapC10942 r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19452.m44795(java.util.HashMap, l.ۛۛ᩷, l.ۧۤᩴ, boolean):l.ۡܿܽ");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44800(C19220 c19220, C20317 c20317, int i) {
        C18514 m44343 = c19220.m44343("stagedApi");
        if (m44343 != null && !"true".equals(m44343.m43026()) && !"false".equals(m44343.m43026())) {
            throw new C1580("Boolean value required: stagedApi", m44343);
        }
        int i2 = 0;
        c20317.m46619(i, m44343 != null && "true".equals(m44343.m43026()));
        C18514 m443432 = c19220.m44343("extraTypeSpecFlags");
        if (m443432 != null) {
            String m43026 = m443432.m43026();
            try {
                boolean startsWith = m43026.startsWith("0x");
                String substring = startsWith ? m43026.substring(2) : m43026;
                if (substring.isEmpty() || substring.charAt(0) == '-' || substring.charAt(0) == '+') {
                    throw new NumberFormatException();
                }
                long parseLong = Long.parseLong(substring, startsWith ? 16 : 10);
                if (parseLong < 0 || parseLong > 4294967295L) {
                    throw new NumberFormatException();
                }
                i2 = (int) parseLong;
                if (((c20317.m46616().mo12848().m26261() | 1610874879) & i2) != 0) {
                    throw new NumberFormatException();
                }
            } catch (NumberFormatException unused) {
                throw new C1580(C20094.m46315("Invalid extraTypeSpecFlags: ", m43026), m443432);
            }
        }
        c20317.m46618(i, i2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m44791(C18514 c18514) {
        String m43026 = c18514.m43026();
        if (C9896.m24994(m43026)) {
            return C9896.m24993(m43026.substring(2));
        }
        if (C9896.m25000(m43026)) {
            return Integer.parseInt(m43026);
        }
        throw new C1580(C20087.m46306("Integer value required: ", c18514.m43025(), "=\"", c18514.m43026(), "\""), c18514);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m44806(C18514 c18514) {
        String m43026 = c18514.m43026();
        if (m43026.isEmpty()) {
            throw new C1580(C4860.m14172("Value required: ", c18514.m43025(), "=\"\""), c18514);
        }
        return m43026;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C19220 m44797(String str, Map map) {
        C0732 c0732 = (C0732) map.get(str);
        if (c0732 != null) {
            return m44809(c0732);
        }
        throw new C19401(C20094.m46315("Xml not found: ", str));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C19220 m44809(C0732 c0732) {
        return new C18746(this, c0732).m43396();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18683 m44842(String str) {
        final String m37867 = C16014.m37867(str, "/");
        List list = (List) C5378.stream(this.f62921.entrySet()).filter(new Predicate() { // from class: l.֫ۨ᩷
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
                String str2 = (String) ((Map.Entry) obj).getKey();
                return str2.startsWith(m37867) && str2.endsWith("/type-info");
            }
        }).map(new C17576(1)).collect(C22976.toList());
        C18683 c18683 = new C18683();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                c18683.add(m44791(m44809((C0732) it.next()).m44348("id")) & 255);
            } catch (Exception unused) {
            }
        }
        return c18683;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC10418 m44847(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf >= 0) {
            str = str.substring(0, indexOf);
        }
        C0732 c0732 = (C0732) this.f62921.get(str + "/package-info");
        if (c0732 == null) {
            throw new IOException(C20094.m46315("Package metadata is missing: ", str));
        }
        C19220 m44809 = m44809(c0732);
        try {
            C18514 m44343 = m44809.m44343("configLayout");
            return m44343 == null ? EnumC10418.AOSP : EnumC10418.m26259(m44343.m43026());
        } finally {
            m44809.m44349();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44817(int i, String str) {
        C0732 c0732 = (C0732) this.f62921.get(C16014.m37867(str, "/package-info"));
        if (c0732 == null) {
            return i;
        }
        try {
            return m44791(m44809(c0732).m44348("id")) & 255;
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m44843(String str) {
        C0732 c0732 = (C0732) this.f62921.get(C16014.m37867(str, "/type-info"));
        if (c0732 != null) {
            C11005 c11005 = c0732.f2760;
            int mo23117 = c11005 != null ? (int) (c11005.m27340().mo23117() / 1000) : 0;
            int i = c0732.f2762;
            if (i != -1 && c0732.f2761 == mo23117) {
                return i;
            }
            try {
                int m44791 = m44791(m44809(c0732).m44348("id")) & 255;
                c0732.f2762 = m44791;
                c0732.f2761 = mo23117;
                return m44791;
            } catch (Exception unused) {
                c0732.f2762 = -1;
            }
        }
        return -1;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m44841(String str, String str2) {
        int m44817;
        C0732 c0732;
        C18514 m44343;
        int indexOf = str.indexOf(47);
        if (indexOf != -1 && (m44817 = m44817(-1, str.substring(0, indexOf))) != -1 && (c0732 = (C0732) this.f62921.get(str)) != null) {
            try {
                C19220 m44809 = m44809(c0732);
                int m44791 = m44791(m44809.m44348("id")) & 255;
                Iterator m44337 = C19220.m44337(m44809);
                while (m44337.hasNext()) {
                    C19220 c19220 = (C19220) m44337.next();
                    if (c19220.m44350().equals(Entry.DEFAULT_NAME) && (m44343 = c19220.m44343("name")) != null && m44343.m43026().equals(str2)) {
                        return (Integer.parseInt(c19220.m44348("id").m43026().substring(r8.length() - 4), 16) & 65535) | (m44817 << 24) | (m44791 << 16);
                    }
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String m44848(String str) {
        C18514 m44343;
        Iterator it = this.f62921.values().iterator();
        while (true) {
            C19220 c19220 = null;
            if (!it.hasNext()) {
                return null;
            }
            C0732 c0732 = (C0732) it.next();
            if (c0732.f2758.endsWith("/package-info")) {
                String[] split = c0732.f2758.split("/");
                if (split.length != 2) {
                    continue;
                } else {
                    try {
                        c19220 = new C18746(this, c0732).m43396();
                    } catch (IOException | C1580 unused) {
                    }
                    if (c19220 != null && c19220.m44350().equals("package") && (m44343 = c19220.m44343("prefix")) != null && m44343.m43026().equals(str)) {
                        return split[0];
                    }
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList m44846(String str, String str2) {
        C19220 c19220;
        C18514 m44343;
        ArrayList arrayList = new ArrayList();
        for (C0732 c0732 : this.f62921.values()) {
            String str3 = c0732.f2758;
            if (str3.startsWith(str)) {
                String substring = str3.substring(str.length());
                if (substring.indexOf(47) == -1) {
                    try {
                        c19220 = new C18746(this, c0732).m43396();
                    } catch (IOException | C1580 unused) {
                        c19220 = null;
                    }
                    if (c19220 != null) {
                        if (c19220.m44350().equals("type")) {
                            Iterator m44337 = C19220.m44337(c19220);
                            while (true) {
                                if (m44337.hasNext()) {
                                    C19220 c192202 = (C19220) m44337.next();
                                    if (c192202.m44350().equals(Entry.DEFAULT_NAME) && (m44343 = c192202.m44343("name")) != null && m44343.m43026().equals(str2)) {
                                        C19287 m44466 = C19287.m44466(m44343.m43028(), m44343.m43027() - 1);
                                        m44466.f60678 = true;
                                        arrayList.add(new C2518(substring, str3, m44466));
                                        break;
                                    }
                                }
                            }
                        } else if (c19220.m44350().equals("resources")) {
                            Iterator m443372 = C19220.m44337(c19220);
                            while (true) {
                                if (!m443372.hasNext()) {
                                    break;
                                }
                                C18514 m443432 = ((C19220) m443372.next()).m44343("name");
                                if (m443432 != null && m443432.m43026().equals(str2)) {
                                    C19287 m444662 = C19287.m44466(m443432.m43028(), m443432.m43027() - 1);
                                    m444662.f60678 = true;
                                    arrayList.add(new C2518(substring, str3, m444662));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44829(ActivityC17169 activityC17169, C20296 c20296) {
        this.f62913.m13483(activityC17169, c20296);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m44845() {
        C11005 m44804 = m44804();
        if (!m44804.m27336()) {
            m44804 = new C11005(m44839(), "resources");
        }
        return m44804.m27340();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m44836() {
        C11005 m36265 = m36265();
        m36265.m27340().m36508();
        C11005 m44804 = m44804();
        if (!m44804.m27336()) {
            m44804 = new C11005(m44839(), "resources");
        }
        C11005 c11005 = new C11005(m36265, this.f62920);
        InputStream m27334 = m44804.m27334();
        try {
            OutputStream mo23555 = c11005.m27340().mo23555(false);
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

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44827(AbstractC15440 abstractC15440, boolean z) {
        abstractC15440.mo23546();
        C11005 m44804 = m44804();
        if (m44804.m27336()) {
            AbstractC15440 m36526 = abstractC15440.m36526(this.f62920);
            if (z) {
                m36526.m36529();
            }
            try {
                InputStream m27334 = m44804.m27334();
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

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Collection m44857() {
        int i = 0;
        InterfaceC17664 filter = C5378.stream(m44833().values()).flatMap(new C10985(i)).filter(new C16628(i));
        int i2 = 3;
        return (Collection) filter.map(new C18554(i2)).distinct().sorted(new C23300(i2)).collect(C22976.toList());
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0285  */
    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList m44853() {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19452.m44853():java.util.ArrayList");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44821(List list) {
        if (list.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C3929 c3929 = (C3929) it.next();
            ((List) C13843.computeIfAbsent(linkedHashMap, c3929.f12542, new C12247(2))).add(c3929);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C0732 c0732 = (C0732) this.f62921.get(str);
            if (c0732 == null) {
                throw new IOException(C20094.m46315("Xml not found: ", str));
            }
            String m44793 = m44793(c0732);
            int lastIndexOf = m44793.lastIndexOf("</type>");
            if (lastIndexOf < 0) {
                throw new IOException(C20094.m46315("Expected tag: </type> in ", str));
            }
            List<C3929> list2 = (List) entry.getValue();
            Collections.sort(list2, C8200.comparingInt(new C17334()));
            StringBuilder sb = new StringBuilder((list2.size() * 64) + m44793.length());
            sb.append((CharSequence) m44793, 0, lastIndexOf);
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) != '\n') {
                sb.append('\n');
            }
            for (C3929 c39292 : list2) {
                sb.append("    <entry id=\"");
                sb.append(String.format(Locale.ENGLISH, "0x%08x", Integer.valueOf(c39292.f12538)));
                sb.append("\" name=\"");
                sb.append(C10035.f30193.m28254(c39292.f12537));
                sb.append("\" />\n");
            }
            String m46305 = C20087.m46305(lastIndexOf, m44793, sb);
            try {
                C19220 m44340 = C19220.m44340(m46305, false);
                if (m44340 != null) {
                    m44340.m44349();
                }
                linkedHashMap2.put(c0732, m46305);
            } catch (C1580 e) {
                throw new C5672(str, e);
            }
        }
        boolean z = this.f62918;
        this.f62918 = false;
        try {
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                m44823((C0732) entry2.getKey(), (String) entry2.getValue());
            }
        } finally {
            m44830(z);
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m44835(String str) {
        C0732 c0732 = (C0732) this.f62921.get(str);
        if (c0732 == null) {
            return -268435456;
        }
        C11005 c11005 = c0732.f2760;
        if (c11005 != null) {
            return Long.valueOf(c11005.m27340().mo23117() ^ c11005.m27340().mo23127()).hashCode();
        }
        return c0732.f2765 != null ? -536870912 : -268435456;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m44850(String str) {
        C0732 c0732 = (C0732) this.f62921.get(str);
        return (c0732 == null || c0732.f2765 == null) ? "" : c0732.m2837();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m44856(String str) {
        C0732 c0732 = (C0732) this.f62921.get(str);
        if (c0732 != null) {
            return m44793(c0732);
        }
        throw new C19401(C20094.m46315("Xml not found: ", str));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m44793(C0732 c0732) {
        C11005 c11005 = c0732.f2760;
        if (c11005 != null) {
            return c11005.m27340().m36489();
        }
        if (c0732.f2765 != null) {
            return c0732.m2837();
        }
        throw new C19401("Bad xml: " + c0732.f2758);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m44849(String str, String str2) {
        C0732 c0732 = (C0732) this.f62921.get(str);
        if (c0732 == null) {
            throw new C19401("Xml not found: ".concat(str));
        }
        C19220 m44340 = C19220.m44340(str2, false);
        m44823(c0732, str2);
        C11005 m44808 = m44808(c0732.f2760);
        m44808.m27338();
        byte[] digest = C14460.m34532().digest(str2.getBytes(StandardCharsets.UTF_8));
        m44340.getClass();
        C10130 c10130 = new C10130();
        m44340.m44344(c10130);
        OutputStream mo23555 = m44808.m27340().mo23555(false);
        try {
            mo23555.write(digest);
            mo23555.write(c10130.m25438(), 0, c10130.size());
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

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44851(String str, String str2) {
        C0732 c0732 = (C0732) this.f62921.get(str);
        if (c0732 == null) {
            throw new C19401(C20094.m46315("Xml not found: ", str));
        }
        m44823(c0732, str2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44823(C0732 c0732, String str) {
        boolean z;
        C11005 c11005 = c0732.f2760;
        String str2 = c0732.f2758;
        if (c11005 == null) {
            c0732.f2760 = new C11005(new C11005(this.f62915, DocumentReader.RESERVED), C16014.m37867(str2, ".xml"));
            z = true;
        } else {
            z = false;
        }
        c0732.f2760.m27340().m36510(str);
        if (this.f62918 && z) {
            this.f62923.add(str2);
            this.f62914.mo1664(C20195.unmodifiableSet(this.f62923));
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44855(String str) {
        if (!str.isEmpty() && !str.endsWith("/")) {
            str = str.concat("/");
        }
        ArrayList arrayList = new ArrayList();
        for (C0732 c0732 : this.f62921.values()) {
            if (c0732.f2758.startsWith(str)) {
                arrayList.add(c0732.f2758);
            }
        }
        m44820((Collection) arrayList);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44820(Collection collection) {
        StringBuilder sb = new StringBuilder();
        Iterator it = collection.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            C0732 c0732 = (C0732) this.f62921.remove(str);
            if (c0732 != null) {
                C11005 c11005 = c0732.f2760;
                if (c11005 != null) {
                    c11005.m27333();
                    if (this.f62918) {
                        this.f62923.remove(str);
                        z2 = true;
                    }
                }
                if (c0732.f2765 != null) {
                    sb.append(str);
                    sb.append('\n');
                }
                if (this.f62910.contains(str)) {
                    z = true;
                }
            }
        }
        if (sb.length() > 0) {
            AbstractC15440 m27330 = m44854().m27330("removed");
            try {
                m27330.mo35195();
                m27330.m36516(sb.toString());
            } catch (Throwable th) {
                this.f62916.mo1664(th);
            }
        }
        if (z) {
            m44811();
        }
        if (z2) {
            this.f62914.mo1664(C20195.unmodifiableSet(this.f62923));
        }
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m44815() {
        AbstractC15440 m27330 = m44854().m27330("recent");
        try {
            m27330.getClass();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(m27330.mo23555(false), StandardCharsets.UTF_8));
            try {
                Iterator it = this.f62910.iterator();
                while (it.hasNext()) {
                    bufferedWriter.write((String) it.next());
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } finally {
            }
        } catch (Throwable th) {
            this.f62916.mo1664(th);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44818(String str) {
        ArrayList arrayList = this.f62910;
        if (arrayList.isEmpty() || !((String) arrayList.get(0)).equals(str)) {
            arrayList.remove(str);
            arrayList.add(0, str);
            while (arrayList.size() > 30) {
                C18473.m42953(arrayList, 1);
            }
            m44815();
            m44811();
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m44840(String str) {
        if (this.f62910.remove(str)) {
            m44815();
            m44811();
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m44844() {
        this.f62910.clear();
        m44815();
        m44811();
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private void m44811() {
        ArrayList arrayList = this.f62910;
        this.f62911.mo1664(C20195.unmodifiableList(new ArrayList(arrayList.subList(0, Math.min(arrayList.size(), 15)))));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44828(ActivityC17169 activityC17169, C4650 c4650) {
        this.f62916.m1668(activityC17169, c4650);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44826(C13865 c13865, C22333 c22333) {
        this.f62911.m1668(c13865, c22333);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44825(C13865 c13865, C20217 c20217) {
        this.f62914.m1668(c13865, c20217);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m44832(l.ActivityC17169 r9, l.C3764 r10) {
        /*
            r8 = this;
            boolean r0 = r8.m36267()
            r1 = 0
            if (r0 == 0) goto Lc5
            l.ۧ۫᩷ r0 = r8.m44854()
            java.lang.String r2 = "strings_changed"
            l.ܶ᩵ܿ r0 = r0.m27330(r2)
            boolean r0 = r0.mo23120()
            boolean r2 = r9.m40366()
            r3 = 1
            if (r2 != 0) goto L81
            boolean r2 = r8.f62919
            if (r2 != 0) goto L7b
            boolean r2 = r8.f62924
            if (r2 == 0) goto L25
            goto L7b
        L25:
            boolean r2 = r8.m44805()     // Catch: java.lang.Exception -> L79
            if (r2 == 0) goto L2c
            goto L75
        L2c:
            l.ۡۨ᩷ r2 = new l.ۡۨ᩷     // Catch: java.lang.Exception -> L79
            r2.<init>(r8)     // Catch: java.lang.Exception -> L79
            r2.m22905()     // Catch: java.lang.Exception -> L79
            java.util.ArrayList r4 = r2.f27006     // Catch: java.lang.Exception -> L79
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Exception -> L79
            if (r4 == 0) goto L4a
            int r4 = m44812(r8)     // Catch: java.lang.Exception -> L79
            java.util.ArrayList r5 = r2.f27005     // Catch: java.lang.Exception -> L79
            int r5 = r5.size()     // Catch: java.lang.Exception -> L79
            if (r4 != r5) goto L4a
            r4 = 1
            goto L4b
        L4a:
            r4 = 0
        L4b:
            if (r4 == 0) goto L4f
            r2 = 0
            goto L76
        L4f:
            l.ۧ۫᩷ r4 = r8.m44804()     // Catch: java.lang.Exception -> L79
            l.ۧ۫᩷ r5 = new l.ۧ۫᩷     // Catch: java.lang.Exception -> L79
            l.ۧ۫᩷ r6 = r8.m36263()     // Catch: java.lang.Exception -> L79
            java.lang.String r7 = "arscBuild/resources.digest"
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L79
            boolean r6 = r4.m27336()     // Catch: java.lang.Exception -> L79
            if (r6 == 0) goto L75
            boolean r6 = r5.m27336()     // Catch: java.lang.Exception -> L79
            if (r6 != 0) goto L6b
            goto L75
        L6b:
            byte[] r2 = r2.m22906()     // Catch: java.lang.Exception -> L79
            boolean r2 = r8.m44802(r4, r5, r2)     // Catch: java.lang.Exception -> L79
            r2 = r2 ^ r3
            goto L76
        L75:
            r2 = 1
        L76:
            r8.f62924 = r2     // Catch: java.lang.Exception -> L79
            goto L7c
        L79:
            r8.f62924 = r3
        L7b:
            r2 = 1
        L7c:
            if (r2 == 0) goto L7f
            goto L81
        L7f:
            r2 = 0
            goto L82
        L81:
            r2 = 1
        L82:
            if (r0 == 0) goto Lbf
            int r0 = l.DialogInterfaceC0206.f1451
            l.᩵ۚۢ r0 = new l.᩵ۚۢ
            r0.<init>(r9)
            r4 = 2131889019(0x7f120b7b, float:1.941269E38)
            r0.m44433(r4)
            r4 = 2131888641(0x7f120a01, float:1.9411923E38)
            r0.m44416(r4)
            l.᩺ۛ᩷ r4 = new l.᩺ۛ᩷
            r4.<init>(r1, r10)
            r10 = 2131889035(0x7f120b8b, float:1.9412722E38)
            r0.m44442(r10, r4)
            if (r2 == 0) goto Lb0
            l.ᩳۨ᩷ r10 = new l.ᩳۨ᩷
            r10.<init>(r1, r9)
            r9 = 2131887205(0x7f120465, float:1.940901E38)
            r0.m44440(r9, r10)
            goto Lbb
        Lb0:
            l.ۢܰܿ r10 = new l.ۢܰܿ
            r10.<init>(r9, r3)
            r9 = 2131886873(0x7f120319, float:1.9408337E38)
            r0.m44440(r9, r10)
        Lbb:
            r0.m44438()
            return r3
        Lbf:
            if (r2 == 0) goto Lc5
            r9.m40351()
            return r3
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19452.m44832(l.ܿۛ᩷, l.ۘۛ᩷):boolean");
    }
}

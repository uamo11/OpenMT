package l;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: 18FX */
/* renamed from: l.ܿ᩸᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17626 extends AbstractC13921 implements Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f53847;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map f53848;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f53849;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0225 f53850 = new C0225(1);

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f53851;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3326 f53852;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public List f53853;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f53854;

    @Override // l.AbstractC13921
    /* renamed from: ܽ */
    public final String mo7654() {
        return "tar";
    }

    public C17626(String str, String str2) {
        AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
        this.f53849 = m39866;
        this.f53851 = str.equals(str2) ? m39866 : C16999.m39866(str2, new String[0]);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C17626 m41198(C12951 c12951) {
        List list;
        Map map;
        C3326 c3326;
        long j;
        C17626 c17626 = new C17626(c12951.m31506(), c12951.m31506());
        String m31506 = c12951.m31506();
        if (!m31506.isEmpty()) {
            c17626.f53854 = m31506;
        }
        C18332 c18332 = (C18332) C3175.m9733(c12951.m31506());
        if (c18332 != null) {
            list = c18332.f56982;
            c17626.f53853 = list;
            map = c18332.f56983;
            c17626.f53848 = map;
            c3326 = c18332.f56985;
            c17626.f53852 = c3326;
            j = c18332.f56984;
            c17626.f53847 = j;
        }
        return c17626;
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7646(boolean z) {
        AbstractC15440 abstractC15440 = this.f53849;
        boolean z2 = true;
        while (true) {
            try {
                C10531 c10531 = new C10531(abstractC15440.m36513("r"), this.f53854);
                try {
                    this.f53853 = C20195.unmodifiableList(c10531.m26454());
                    HashMap hashMap = new HashMap();
                    for (C1358 c1358 : this.f53853) {
                        hashMap.put(c1358.m4741(), c1358);
                    }
                    this.f53848 = C20195.unmodifiableMap(hashMap);
                    this.f53852 = new C3326(this.f53853);
                    this.f53847 = abstractC15440.mo23117();
                    c10531.close();
                    return;
                } finally {
                    try {
                        break;
                    } catch (Throwable th) {
                    }
                }
            } catch (IOException e) {
                if (!z2 || !m41199()) {
                    throw e;
                }
                z2 = false;
            }
        }
        throw e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!m33352()) {
            return;
        }
        C0225 c0225 = this.f53850;
        c0225.close();
        while (true) {
            C10531 c10531 = (C10531) c0225.m1479();
            if (c10531 == null) {
                return;
            } else {
                C0349.m1793(c10531);
            }
        }
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InputStream mo7636(AbstractActivityC3346 abstractActivityC3346, InterfaceC17889 interfaceC17889) {
        AbstractC15440 abstractC15440 = this.f53849;
        C1358 m28851 = ((C11793) interfaceC17889).m28851();
        C10531 c10531 = m33352() ? (C10531) this.f53850.m1479() : null;
        if (c10531 == null) {
            try {
                c10531 = C10531.m26448(abstractC15440);
            } catch (IOException e) {
                if (m41199()) {
                    c10531 = C10531.m26448(abstractC15440);
                } else {
                    throw e;
                }
            }
        }
        return new C16920(this, c10531.m26453(m28851), c10531);
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final InterfaceC17889 mo7638(String str) {
        if (this.f53848 == null) {
            mo7646(false);
        }
        boolean endsWith = str.endsWith("/");
        C1358 entry = getEntry(str.substring(1));
        if (entry == null || entry.m4768() != endsWith) {
            return null;
        }
        return new C11793(entry);
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private boolean m41199() {
        AbstractC15440 abstractC15440;
        if (this.f53849.mo23120() || (abstractC15440 = this.f53851) == this.f53849) {
            return false;
        }
        synchronized (abstractC15440) {
            if (!this.f53849.mo23120()) {
                BufferedInputStream m36518 = this.f53851.m36518();
                try {
                    InputStream m30663 = C12498.m30663(m36518);
                    if (m30663 == null) {
                        throw new IOException("Extraction fail: " + this.f53851.mo23554());
                    }
                    AbstractC15440 m36520 = this.f53849.m36520(".tmp");
                    try {
                        m36520.m36493(m30663);
                        m36520.m36498(this.f53849, (Runnable) null);
                        m36518.close();
                    } catch (IOException e) {
                        m36520.mo27929();
                        throw e;
                    }
                } finally {
                }
            }
        }
        return true;
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7639(MessageDigest messageDigest) {
        messageDigest.update("tar".getBytes());
        C14460.m34528(messageDigest, this.f53849.mo23554());
        messageDigest.update(String.valueOf(this.f53847).getBytes());
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final ArrayList mo7637(String str, boolean z) {
        if (this.f53848 == null) {
            mo7646(false);
        }
        if (C2568.f8121) {
            str = C16014.m37867(str, "/tar/");
        }
        List m4937 = this.f53852.m4937(str.substring(1));
        ArrayList arrayList = new ArrayList(m4937.size() + 1);
        Iterator it = m4937.iterator();
        while (it.hasNext()) {
            arrayList.add(new C11793((C1358) it.next()));
        }
        return arrayList;
    }

    public final C1358 getEntry(String str) {
        Map map = this.f53848;
        if (map == null) {
            return null;
        }
        C1358 c1358 = (C1358) map.get(str);
        if (c1358 != null || !str.endsWith("/")) {
            return c1358;
        }
        C1358 c13582 = (C1358) map.get(str.substring(0, str.length() - 1));
        return (c13582 == null || !c13582.m4768()) ? (C1358) this.f53852.m4933(str) : c13582;
    }

    /* renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public final List m41208() {
        return this.f53853;
    }

    @Override // l.AbstractC13921
    /* renamed from: ֫ */
    public final void mo7643(C10130 c10130) {
        c10130.m25439(this.f53849.mo23554());
        c10130.m25439(this.f53851.mo23554());
        c10130.m25439(m41203());
        c10130.m25439(C3175.m9731(new C18332(this.f53853, this.f53848, this.f53852, this.f53847)));
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m41206() {
        return this.f53849.mo23554();
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m41207() {
        return this.f53849;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String m41202() {
        return this.f53851.mo23554();
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m41201() {
        return this.f53851;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m41204() {
        return this.f53847 != this.f53849.mo23117();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m41200() {
        return this.f53849.mo23120();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m41205(String str) {
        this.f53854 = str;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m41203() {
        String str = this.f53854;
        return str == null ? "" : str;
    }
}

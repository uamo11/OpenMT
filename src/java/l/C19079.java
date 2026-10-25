package l;

import android.util.SparseLongArray;
import bin.mt.json.JSON;
import bin.mt.json.JSONObject;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.lang.ref.SoftReference;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: W7A7 */
/* renamed from: l.ᩴ᩺᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19079 {

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f60071;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60072;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C24017 f60074;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f60075;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60076;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f60077;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f60078;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60080;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60081;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60082;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f60083;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f60084;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f60085;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f60087;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Object f60068 = new Object();

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final Object f60079 = new Object();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Object f60073 = new Object();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f60086 = new HashMap();

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public HashMap f60067 = new HashMap();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public HashSet f60070 = new HashSet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f60069 = -1;

    public C19079(AbstractC15440 abstractC15440) {
        this.f60076 = abstractC15440;
        this.f60072 = abstractC15440.m36526("x");
        this.f60085 = abstractC15440.m36526("y");
        this.f60080 = abstractC15440.m36526("f");
        this.f60081 = abstractC15440.m36526("complete.json");
        this.f60082 = abstractC15440.m36526("complete.json.tmp");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16255 m43958(String str, C12953 c12953) {
        if (m43956()) {
            return C16255.m38225(m43965());
        }
        if (!m43947()) {
            return C16255.m38225(m43965());
        }
        synchronized (this.f60068) {
            if (!this.f60075 && !this.f60087) {
                C2851 c2851 = (C2851) this.f60067.get(str);
                if (c2851 == null) {
                    return C16255.m38225(false);
                }
                try {
                    C22706 c22706 = new C22706();
                    m43943(c2851, c22706, c12953, (C9907) null);
                    return new C16255(c22706.toString(), true, false);
                } catch (Exception unused) {
                    m43970();
                    return C16255.m38225(true);
                }
            }
            return C16255.m38225(false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16255 m43959(String str, C22706 c22706, C12953 c12953, C9907 c9907) {
        if (m43956()) {
            return C16255.m38225(m43965());
        }
        if (!m43947()) {
            return C16255.m38225(m43965());
        }
        synchronized (this.f60068) {
            if (!this.f60075 && !this.f60087) {
                C2851 c2851 = (C2851) this.f60067.get(str);
                if (c2851 == null) {
                    return C16255.m38225(false);
                }
                try {
                    m43943(c2851, c22706, c12953, c9907);
                    return new C16255(null, true, false);
                } catch (Exception unused) {
                    c22706.m50718();
                    return C16255.m38225(true);
                }
            }
            return C16255.m38225(false);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC7084 m43963(String str) {
        if (!m43947()) {
            return EnumC7084.UNAVAILABLE;
        }
        synchronized (this.f60068) {
            if (!this.f60075 && !this.f60087) {
                if (this.f60067.containsKey(str)) {
                    return EnumC7084.OFFSET;
                }
                if (this.f60070.contains(str)) {
                    return EnumC7084.FAILURE;
                }
                return EnumC7084.MISS;
            }
            return EnumC7084.UNAVAILABLE;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43966(String str, C12953 c12953) {
        if (m43947()) {
            synchronized (this.f60068) {
                if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str)) {
                    if (c12953.m31520()) {
                        return m43961(str);
                    }
                    try {
                        c12953.m31514();
                        synchronized (this.f60079) {
                            synchronized (this.f60068) {
                                if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str)) {
                                    try {
                                        if (this.f60074 == null) {
                                            this.f60076.m36508();
                                            this.f60074 = new C24017(this);
                                        }
                                        C2851 m52858 = this.f60074.m52858(str, c12953);
                                        synchronized (this.f60068) {
                                            if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str)) {
                                                this.f60067.put(str, m52858);
                                                this.f60070.remove(str);
                                                return true;
                                            }
                                            return false;
                                        }
                                    } catch (IOException unused) {
                                        m43948();
                                    }
                                }
                                return false;
                            }
                        }
                    } catch (IOException unused2) {
                        return false;
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43961(String str) {
        if (m43947()) {
            synchronized (this.f60068) {
                if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str) && !this.f60070.contains(str)) {
                    synchronized (this.f60079) {
                        synchronized (this.f60068) {
                            if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str) && !this.f60070.contains(str)) {
                                try {
                                    if (this.f60074 == null) {
                                        this.f60076.m36508();
                                        this.f60074 = new C24017(this);
                                    }
                                    this.f60074.m52860(str);
                                    synchronized (this.f60068) {
                                        if (!this.f60075 && !this.f60087 && !this.f60067.containsKey(str)) {
                                            this.f60070.add(str);
                                            return true;
                                        }
                                        return false;
                                    }
                                } catch (IOException unused) {
                                    m43948();
                                }
                            }
                            return false;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m43969() {
        synchronized (this.f60068) {
            if (this.f60087 && !this.f60075) {
                m43948();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m43962(ArrayList arrayList) {
        boolean z = false;
        if (!m43947()) {
            return false;
        }
        synchronized (this.f60068) {
            if (!this.f60075 && !this.f60087 && this.f60083 && this.f60069 == arrayList.size() && m43939((List) arrayList).equals(this.f60077) && m43951((List) arrayList)) {
                z = true;
            }
            this.f60078 = z;
        }
        return z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m43964(ArrayList arrayList) {
        if (m43947()) {
            synchronized (this.f60079) {
                try {
                    C24017 c24017 = this.f60074;
                    if (c24017 != null) {
                        c24017.m52859();
                        this.f60074 = null;
                    }
                    this.f60076.m36508();
                    String m43939 = m43939((List) arrayList);
                    synchronized (this.f60068) {
                        if (!this.f60075 && !this.f60087 && m43951((List) arrayList)) {
                            if (this.f60082.mo23120() && !this.f60082.mo23552()) {
                                throw new IOException("Unable to delete stale complete temp file");
                            }
                            this.f60082.m36502(JSON.object().add("schemaVersion", 1).add("outputVersion", 1).add("candidateCount", arrayList.size()).add("candidateDigest", m43939).toString().getBytes(StandardCharsets.UTF_8));
                            if (this.f60081.mo23120() && !this.f60081.mo23552()) {
                                throw new IOException("Unable to replace complete file");
                            }
                            if (!this.f60082.mo23551(this.f60081)) {
                                throw new IOException("Unable to publish complete file");
                            }
                            this.f60083 = true;
                            this.f60069 = arrayList.size();
                            this.f60077 = m43939;
                            this.f60078 = true;
                        }
                    }
                } catch (IOException unused) {
                    C24017 c240172 = this.f60074;
                    if (c240172 != null) {
                        c240172.m52859();
                        this.f60074 = null;
                    }
                    AbstractC15440 abstractC15440 = this.f60082;
                    if (abstractC15440.mo23120()) {
                        abstractC15440.mo23552();
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43960() {
        synchronized (this.f60079) {
            C24017 c24017 = this.f60074;
            if (c24017 != null) {
                c24017.m52859();
                this.f60074 = null;
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m43970() {
        synchronized (this.f60068) {
            if (!this.f60075 && !this.f60087) {
                this.f60087 = true;
                this.f60078 = false;
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m43965() {
        boolean z;
        synchronized (this.f60068) {
            z = this.f60087;
        }
        return z;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m43968() {
        boolean z;
        synchronized (this.f60068) {
            z = this.f60075;
        }
        return z;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m43967() {
        boolean z;
        synchronized (this.f60068) {
            z = this.f60075 || (this.f60071 && !this.f60087 && this.f60078);
        }
        return z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m43951(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((C17667) it.next()).f54033;
            if (!this.f60067.containsKey(str) && !this.f60070.contains(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m43956() {
        boolean z;
        synchronized (this.f60068) {
            z = this.f60075 || this.f60087;
        }
        return z;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m43947() {
        boolean z;
        C9201 m43946;
        synchronized (this.f60068) {
            while (true) {
                z = false;
                if (!this.f60084) {
                    break;
                }
                try {
                    this.f60068.wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            if (this.f60075) {
                return false;
            }
            if (this.f60071) {
                return !this.f60087;
            }
            this.f60084 = true;
            try {
                m43946 = m43949();
            } catch (Exception unused2) {
                m43946 = m43946();
            }
            C9201 c9201 = m43946;
            synchronized (this.f60068) {
                this.f60084 = false;
                if (c9201.f27883) {
                    this.f60075 = true;
                    this.f60087 = false;
                    this.f60071 = true;
                    m43957();
                } else {
                    this.f60067 = c9201.f27880;
                    this.f60070 = c9201.f27882;
                    this.f60083 = c9201.f27881;
                    this.f60069 = c9201.f27878;
                    this.f60077 = c9201.f27879;
                    this.f60071 = true;
                    this.f60087 = false;
                    this.f60078 = false;
                }
                this.f60068.notifyAll();
                if (!this.f60075 && !this.f60087) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private C9201 m43949() {
        C21196 m48142;
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        SparseLongArray sparseLongArray = new SparseLongArray();
        try {
            if (!C12248.m29747(this.f60076)) {
                m43952();
                return new C9201(false, hashMap, hashSet, C21196.m48142());
            }
            m43944(this.f60072, true, hashMap, sparseLongArray);
            m43944(this.f60085, false, hashMap, sparseLongArray);
            m43942(hashSet);
            AbstractC15440 abstractC15440 = this.f60082;
            boolean mo23120 = abstractC15440.mo23120();
            AbstractC15440 abstractC154402 = this.f60081;
            if (mo23120) {
                abstractC15440.mo23552();
                if (abstractC154402.mo23120()) {
                    abstractC154402.mo23552();
                }
                m48142 = C21196.m48142();
            } else if (!abstractC154402.mo23120()) {
                m48142 = C21196.m48142();
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(new String(abstractC154402.m36506(), StandardCharsets.UTF_8));
                    if (jSONObject.getInt("schemaVersion", -1) == 1 && jSONObject.getInt("outputVersion", -1) == 1) {
                        int i = jSONObject.getInt("candidateCount", -1);
                        String string = jSONObject.getString("candidateDigest", null);
                        if (i >= 0 && string != null && !string.isEmpty()) {
                            m48142 = new C21196(i, string, true);
                        }
                        abstractC154402.mo23552();
                        m48142 = C21196.m48142();
                    }
                    abstractC154402.mo23552();
                    m48142 = C21196.m48142();
                } catch (Exception unused) {
                    abstractC154402.mo23552();
                    m48142 = C21196.m48142();
                }
            }
            return new C9201(false, hashMap, hashSet, m48142);
        } catch (IOException unused2) {
            return m43946();
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C9201 m43946() {
        try {
            m43952();
            return new C9201(false, new HashMap(), new HashSet(), C21196.m48142());
        } catch (IOException unused) {
            return new C9201(true, new HashMap(), new HashSet(), C21196.m48142());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43944(AbstractC15440 abstractC15440, boolean z, HashMap hashMap, SparseLongArray sparseLongArray) {
        String str;
        if (abstractC15440.mo23120()) {
            byte[] m36506 = abstractC15440.m36506();
            C4262 c4262 = new C4262(m36506);
            try {
                DataInputStream dataInputStream = new DataInputStream(c4262);
                while (c4262.position() < m36506.length) {
                    try {
                        if (z) {
                            str = dataInputStream.readUTF();
                        } else {
                            int readInt = dataInputStream.readInt();
                            if (readInt < 0 || readInt > 1048576) {
                                throw new IOException("Invalid smali record name length");
                            }
                            byte[] bArr = new byte[readInt];
                            dataInputStream.readFully(bArr);
                            str = new String(bArr, StandardCharsets.UTF_8);
                        }
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        int readInt2 = dataInputStream.readInt();
                        int readInt3 = dataInputStream.readInt();
                        m43941(readUnsignedShort, readInt2, readInt3, sparseLongArray);
                        hashMap.put(str, new C2851(readUnsignedShort, readInt2, readInt3));
                    } finally {
                    }
                }
                dataInputStream.close();
            } catch (EOFException e) {
                throw new IOException("Damaged smali offset record", e);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43942(HashSet hashSet) {
        AbstractC15440 abstractC15440 = this.f60080;
        if (abstractC15440.mo23120()) {
            byte[] m36506 = abstractC15440.m36506();
            C4262 c4262 = new C4262(m36506);
            try {
                DataInputStream dataInputStream = new DataInputStream(c4262);
                while (c4262.position() < m36506.length) {
                    try {
                        hashSet.add(C12248.m29745(dataInputStream));
                    } finally {
                    }
                }
                dataInputStream.close();
            } catch (EOFException e) {
                throw new IOException("Damaged smali failure record", e);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m43941(int i, int i2, int i3, SparseLongArray sparseLongArray) {
        long mo23127;
        if (i2 < 0 || i3 <= 0) {
            throw new IOException("Invalid smali cache offset");
        }
        int indexOfKey = sparseLongArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            mo23127 = sparseLongArray.valueAt(indexOfKey);
        } else {
            AbstractC15440 m36526 = this.f60076.m36526(String.valueOf(i));
            if (!m36526.mo23119()) {
                throw new IOException("Missing smali cache data file");
            }
            mo23127 = m36526.mo23127();
            sparseLongArray.put(i, mo23127);
        }
        if (i2 + i3 > mo23127) {
            throw new IOException("Smali cache offset exceeds data file");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (l.C9907.m25011(r10, r1, true) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006c, code lost:
    
        l.C9907.m25012(r1, r10);
        r0 = r10.m25014(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0073, code lost:
    
        if (r0 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        r0 = m43945(r1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r10 = r7.f9104;
        r7 = r7.f9103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
    
        if ((r10 + r7) > r0.length) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0082, code lost:
    
        r9.m31515(r10, r7, r0);
        l.C5773.m16239(r9.m31517(), r9.m31521(), r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        throw new java.io.IOException("Smali cache data range is invalid");
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0047, code lost:
    
        if (r10 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0054, code lost:
    
        if ((r7.f9104 + r7.f9103) <= r0.length) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        r1 = r7.f9102;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m43943(l.C2851 r7, l.C22706 r8, l.C12953 r9, l.C9907 r10) {
        /*
            r6 = this;
            int r1 = r7.f9102
        L2:
            if (r10 == 0) goto Lb
            byte[] r0 = r10.m25014(r1)
            if (r0 == 0) goto Lb
            goto L47
        Lb:
            java.lang.Object r0 = r6.f60073
            monitor-enter(r0)
            java.util.HashMap r2 = r6.f60086     // Catch: java.lang.Throwable -> La3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> La3
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> La3
            java.lang.ref.Reference r2 = (java.lang.ref.Reference) r2     // Catch: java.lang.Throwable -> La3
            r3 = 0
            if (r2 != 0) goto L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
            r0 = r3
            goto L2f
        L20:
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> La3
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> La3
            if (r2 == 0) goto L2d
            if (r10 == 0) goto L2d
            r10.m25013(r1, r2)     // Catch: java.lang.Throwable -> La3
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
            r0 = r2
        L2f:
            if (r0 == 0) goto L32
            goto L47
        L32:
            if (r10 != 0) goto L39
            byte[] r0 = r6.m43945(r1, r3)
            goto L47
        L39:
            r0 = 0
            boolean r0 = l.C9907.m25011(r10, r1, r0)
            if (r0 == 0) goto L9e
            byte[] r0 = r6.m43945(r1, r10)     // Catch: java.lang.Throwable -> L99
            l.C9907.m25009(r1, r10)
        L47:
            if (r10 == 0) goto L75
            int r1 = r7.f9104
            long r1 = (long) r1
            int r3 = r7.f9103
            long r3 = (long) r3
            long r1 = r1 + r3
            int r3 = r0.length
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L75
            int r1 = r7.f9102
        L58:
            r0 = 1
            boolean r0 = l.C9907.m25011(r10, r1, r0)
            if (r0 == 0) goto L6c
            byte[] r0 = r6.m43945(r1, r10)     // Catch: java.lang.Throwable -> L67
            l.C9907.m25009(r1, r10)
            goto L75
        L67:
            r7 = move-exception
            l.C9907.m25009(r1, r10)
            throw r7
        L6c:
            l.C9907.m25012(r1, r10)
            byte[] r0 = r10.m25014(r1)
            if (r0 == 0) goto L58
        L75:
            int r10 = r7.f9104
            long r1 = (long) r10
            int r7 = r7.f9103
            long r3 = (long) r7
            long r1 = r1 + r3
            int r3 = r0.length
            long r3 = (long) r3
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L91
            r9.m31515(r10, r7, r0)
            byte[] r7 = r9.m31517()
            int r9 = r9.m31521()
            l.C5773.m16239(r7, r9, r8)
            return
        L91:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Smali cache data range is invalid"
            r7.<init>(r8)
            throw r7
        L99:
            r7 = move-exception
            l.C9907.m25009(r1, r10)
            throw r7
        L9e:
            l.C9907.m25012(r1, r10)
            goto L2
        La3:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La3
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19079.m43943(l.ۖ᩺᩻, l.᩺ۖܽ, l.۬ۜᩳ, l.ۢ᩺᩻):void");
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m43948() {
        synchronized (this.f60079) {
            try {
                m43952();
                synchronized (this.f60068) {
                    m43957();
                    this.f60071 = true;
                    this.f60087 = false;
                    this.f60075 = false;
                }
            } catch (IOException unused) {
                synchronized (this.f60068) {
                    m43957();
                    this.f60071 = true;
                    this.f60087 = false;
                    this.f60075 = true;
                }
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m43957() {
        this.f60067 = new HashMap();
        this.f60070 = new HashSet();
        this.f60083 = false;
        this.f60078 = false;
        this.f60069 = -1;
        this.f60077 = null;
        synchronized (this.f60073) {
            this.f60086.clear();
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m43952() {
        C24017 c24017 = this.f60074;
        if (c24017 != null) {
            c24017.m52859();
            this.f60074 = null;
        }
        synchronized (this.f60073) {
            this.f60086.clear();
        }
        if (this.f60076.mo23120()) {
            for (AbstractC15440 abstractC15440 : this.f60076.mo23549(true)) {
                if (abstractC15440.mo23120() && !abstractC15440.mo23552()) {
                    throw new IOException("Unable to delete smali cache file");
                }
            }
        }
        C12248.m29750(this.f60076);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m43940(C19079 c19079, int i) {
        return c19079.f60076.m36526(String.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m43945(int i, C9907 c9907) {
        byte[] m36506 = this.f60076.m36526(String.valueOf(i)).m36506();
        synchronized (this.f60073) {
            this.f60086.put(Integer.valueOf(i), new SoftReference(m36506));
        }
        if (c9907 != null) {
            C9907.m25010(c9907);
            c9907.m25013(i, m36506);
        }
        return m36506;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43939(List list) {
        try {
            MessageDigest m34534 = C14460.m34534();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] bytes = ((C17667) it.next()).f54033.getBytes(StandardCharsets.UTF_8);
                int length = bytes.length;
                m34534.update(new byte[]{(byte) ((length >>> 24) & 255), (byte) ((length >>> 16) & 255), (byte) ((length >>> 8) & 255), (byte) (length & 255)});
                m34534.update(bytes);
            }
            return C14460.m34531(m34534.digest());
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}

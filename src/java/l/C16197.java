package l;

import android.os.ConditionVariable;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* compiled from: M74O */
/* renamed from: l.ܺ᩸֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16197 implements InterfaceC21654 {

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final HashSet f49875 = new HashSet();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final File f49876;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f49877;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f49878;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17609 f49879;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f49880;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21138 f49881;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8248 f49882;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6131 f49883;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f49884;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Random f49885;

    @Override // l.InterfaceC21654
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized File mo38138(String str, long j, long j2) {
        C2087 m41161;
        File file;
        C22632.m50634(!this.f49877);
        m38140();
        m41161 = this.f49879.m41161(str);
        m41161.getClass();
        C22632.m50634(m41161.m6867(j, j2));
        if (!this.f49876.exists()) {
            m38130(this.f49876);
            m38135();
        }
        this.f49881.m48091(this, j2);
        file = new File(this.f49876, Integer.toString(this.f49885.nextInt(10)));
        if (!file.exists()) {
            m38130(file);
        }
        return C2793.m8629(file, m41161.f6960, j, System.currentTimeMillis());
    }

    @Override // l.InterfaceC21654
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C7026 mo38139(String str) {
        C2087 m41161;
        C22632.m50634(!this.f49877);
        m41161 = this.f49879.m41161(str);
        return m41161 != null ? m41161.m6859() : C7026.f21670;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m38140() {
        C8248 c8248 = this.f49882;
        if (c8248 != null) {
            throw c8248;
        }
    }

    @Override // l.InterfaceC21654
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void mo38141(File file, long j) {
        boolean z = true;
        C22632.m50634(!this.f49877);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            C2793 m8630 = C2793.m8630(file, j, -9223372036854775807L, this.f49879);
            m8630.getClass();
            C2087 m41161 = this.f49879.m41161(m8630.f74191);
            m41161.getClass();
            C22632.m50634(m41161.m6867(m8630.f74190, m8630.f74188));
            long m32306 = C13325.m32306(m41161.m6859());
            if (m32306 != -1) {
                if (m8630.f74190 + m8630.f74188 > m32306) {
                    z = false;
                }
                C22632.m50634(z);
            }
            if (this.f49883 != null) {
                try {
                    this.f49883.m17054(file.getName(), m8630.f74188, m8630.f74189);
                } catch (IOException e) {
                    throw new C8248(e);
                }
            }
            m38132(m8630);
            try {
                this.f49879.m41166();
                notifyAll();
            } catch (IOException e2) {
                throw new C8248(e2);
            }
        }
    }

    @Override // l.InterfaceC21654
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void mo38142(String str, C23959 c23959) {
        C22632.m50634(!this.f49877);
        m38140();
        this.f49879.m41163(str, c23959);
        try {
            this.f49879.m41166();
        } catch (IOException e) {
            throw new C8248(e);
        }
    }

    @Override // l.InterfaceC21654
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void mo38143(C23064 c23064) {
        C22632.m50634(!this.f49877);
        C2087 m41161 = this.f49879.m41161(c23064.f74191);
        m41161.getClass();
        m41161.m6860(c23064.f74190);
        this.f49879.m41167(m41161.f6961);
        notifyAll();
    }

    @Override // l.InterfaceC21654
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized long mo38144(String str, long j, long j2) {
        long j3;
        long j4 = C13132.FOREVER_NS;
        long j5 = j2 == -1 ? Long.MAX_VALUE : j2 + j;
        if (j5 >= 0) {
            j4 = j5;
        }
        long j6 = j;
        j3 = 0;
        while (j6 < j4) {
            long mo38152 = mo38152(str, j6, j4 - j6);
            if (mo38152 > 0) {
                j3 += mo38152;
            } else {
                mo38152 = -mo38152;
            }
            j6 += mo38152;
        }
        return j3;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized TreeSet m38145(String str) {
        TreeSet treeSet;
        C22632.m50634(!this.f49877);
        C2087 m41161 = this.f49879.m41161(str);
        if (m41161 != null && !m41161.m6866()) {
            treeSet = new TreeSet((Collection) m41161.m6864());
        }
        treeSet = new TreeSet();
        return treeSet;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m38146() {
        if (this.f49877) {
            return;
        }
        this.f49880.clear();
        m38135();
        try {
            try {
                this.f49879.m41166();
            } catch (IOException e) {
                C19956.m46034("Storing index file failed", e);
            }
            m38136(this.f49876);
            this.f49877 = true;
        } catch (Throwable th) {
            m38136(this.f49876);
            this.f49877 = true;
            throw th;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m38147(C23064 c23064) {
        C22632.m50634(!this.f49877);
        m38137(c23064);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
    
        if (r4.m6857(r5, r7) >= r7) goto L11;
     */
    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean m38148(java.lang.String r4, long r5, long r7) {
        /*
            r3 = this;
            r0 = r3
            monitor-enter(r0)
            boolean r1 = r3.f49877     // Catch: java.lang.Throwable -> L1d
            r2 = 1
            r1 = r1 ^ r2
            l.C22632.m50634(r1)     // Catch: java.lang.Throwable -> L1d
            l.ܿ᩸֫ r1 = r3.f49879     // Catch: java.lang.Throwable -> L1d
            l.֫᩸֫ r4 = r1.m41161(r4)     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L1a
            long r4 = r4.m6857(r5, r7)     // Catch: java.lang.Throwable -> L1d
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 < 0) goto L1a
            goto L1b
        L1a:
            r2 = 0
        L1b:
            monitor-exit(r0)
            return r2
        L1d:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16197.m38148(java.lang.String, long, long):boolean");
    }

    @Override // l.InterfaceC21654
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized C23064 mo38149(String str, long j, long j2) {
        C2793 m6865;
        C22632.m50634(!this.f49877);
        m38140();
        C2087 m41161 = this.f49879.m41161(str);
        if (m41161 != null) {
            while (true) {
                m6865 = m41161.m6865(j, j2);
                if (!m6865.f74193) {
                    break;
                }
                File file = m6865.f74192;
                file.getClass();
                if (file.length() == m6865.f74188) {
                    break;
                }
                m38135();
            }
        } else {
            m6865 = new C2793(str, j, j2, -9223372036854775807L, null);
        }
        if (m6865.f74193) {
            return m38128(str, m6865);
        }
        if (this.f49879.m41164(str).m6869(j, m6865.f74188)) {
            return m6865;
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m38150(String str) {
        C22632.m50634(!this.f49877);
        Iterator it = m38145(str).iterator();
        while (it.hasNext()) {
            m38137((C23064) it.next());
        }
    }

    @Override // l.InterfaceC21654
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized C23064 mo38151(String str, long j, long j2) {
        C23064 mo38149;
        C22632.m50634(!this.f49877);
        m38140();
        while (true) {
            mo38149 = mo38149(str, j, j2);
            if (mo38149 == null) {
                wait();
            }
        }
        return mo38149;
    }

    @Override // l.InterfaceC21654
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized long mo38152(String str, long j, long j2) {
        C2087 m41161;
        C22632.m50634(!this.f49877);
        if (j2 == -1) {
            j2 = C13132.FOREVER_NS;
        }
        m41161 = this.f49879.m41161(str);
        return m41161 != null ? m41161.m6857(j, j2) : -j2;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static synchronized void m38136(File file) {
        synchronized (C16197.class) {
            f49875.remove(file.getAbsoluteFile());
        }
    }

    public C16197(File file, C21138 c21138, C20744 c20744) {
        boolean add;
        C17609 c17609 = new C17609(c20744, file);
        C6131 c6131 = new C6131(c20744);
        synchronized (C16197.class) {
            add = f49875.add(file.getAbsoluteFile());
        }
        if (!add) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f49876 = file;
        this.f49881 = c21138;
        this.f49879 = c17609;
        this.f49883 = c6131;
        this.f49880 = new HashMap();
        this.f49885 = new Random();
        this.f49884 = true;
        this.f49878 = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new C9143(this, conditionVariable).start();
        conditionVariable.block();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38134(C16197 c16197) {
        long j;
        C6131 c6131 = c16197.f49883;
        C17609 c17609 = c16197.f49879;
        File file = c16197.f49876;
        if (!file.exists()) {
            try {
                m38130(file);
            } catch (C8248 e) {
                c16197.f49882 = e;
                return;
            }
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            C19956.m46033(str);
            c16197.f49882 = new C8248(str);
            return;
        }
        int length = listFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = listFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    C19956.m46033("Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        c16197.f49878 = j;
        if (j == -1) {
            try {
                c16197.f49878 = m38133(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                C19956.m46034(str2, e2);
                c16197.f49882 = new C8248(str2, e2);
                return;
            }
        }
        try {
            c17609.m41162(c16197.f49878);
            if (c6131 != null) {
                c6131.m17052(c16197.f49878);
                HashMap m17051 = c6131.m17051();
                c16197.m38131(file, true, listFiles, m17051);
                c6131.m17055(m17051.keySet());
            } else {
                c16197.m38131(file, true, listFiles, null);
            }
            c17609.m41165();
            try {
                c17609.m41166();
            } catch (IOException e3) {
                C19956.m46034("Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            C19956.m46034(str3, e4);
            c16197.f49882 = new C8248(str3, e4);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38131(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (!z || name.indexOf(46) != -1) {
                if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                    C10365 c10365 = map != null ? (C10365) map.remove(name) : null;
                    if (c10365 != null) {
                        j2 = c10365.f31192;
                        j = c10365.f31191;
                    } else {
                        j = -9223372036854775807L;
                        j2 = -1;
                    }
                    C2793 m8630 = C2793.m8630(file2, j2, j, this.f49879);
                    if (m8630 != null) {
                        m38132(m8630);
                    } else {
                        file2.delete();
                    }
                }
            } else {
                m38131(file2, false, file2.listFiles(), map);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2793 m38128(String str, C2793 c2793) {
        boolean z;
        if (!this.f49884) {
            return c2793;
        }
        File file = c2793.f74192;
        file.getClass();
        String name = file.getName();
        long j = c2793.f74188;
        long currentTimeMillis = System.currentTimeMillis();
        C6131 c6131 = this.f49883;
        if (c6131 != null) {
            try {
                c6131.m17054(name, j, currentTimeMillis);
            } catch (IOException unused) {
                C19956.m46037("Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        C2087 m41161 = this.f49879.m41161(str);
        m41161.getClass();
        C2793 m6858 = m41161.m6858(c2793, currentTimeMillis, z);
        ArrayList arrayList = (ArrayList) this.f49880.get(c2793.f74191);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((InterfaceC15302) arrayList.get(size)).mo36322(this, c2793, m6858);
            }
        }
        this.f49881.mo36322(this, c2793, m6858);
        return m6858;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38132(C2793 c2793) {
        String str = c2793.f74191;
        this.f49879.m41164(str).m6861(c2793);
        ArrayList arrayList = (ArrayList) this.f49880.get(str);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC15302) arrayList.get(size)).mo36321(this, c2793);
                }
            }
        }
        this.f49881.mo36321(this, c2793);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38137(C23064 c23064) {
        String str = c23064.f74191;
        C17609 c17609 = this.f49879;
        C2087 m41161 = c17609.m41161(str);
        if (m41161 == null || !m41161.m6862(c23064)) {
            return;
        }
        C6131 c6131 = this.f49883;
        if (c6131 != null) {
            File file = c23064.f74192;
            file.getClass();
            String name = file.getName();
            try {
                c6131.m17053(name);
            } catch (IOException unused) {
                C4860.m14173("Failed to remove file index entry for: ", name);
            }
        }
        c17609.m41167(m41161.f6961);
        ArrayList arrayList = (ArrayList) this.f49880.get(c23064.f74191);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((InterfaceC15302) arrayList.get(size)).mo36323(c23064);
                }
            }
        }
        this.f49881.mo36323(c23064);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m38135() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f49879.m41160().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C2087) it.next()).m6864().iterator();
            while (it2.hasNext()) {
                C23064 c23064 = (C23064) it2.next();
                File file = c23064.f74192;
                file.getClass();
                if (file.length() != c23064.f74188) {
                    arrayList.add(c23064);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m38137((C23064) arrayList.get(i));
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m38133(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, C16014.m37867(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m38130(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        C19956.m46033(str);
        throw new C8248(str);
    }
}

package l;

import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: 274F */
/* renamed from: l.᩵֨ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19130 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C2196 f60300;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C19063 f60301;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final RunnableC20699 f60305;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f60307;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f60303 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f60302 = new HashSet();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashSet f60306 = new HashSet();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f60304 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m44181() {
        this.f60303.clear();
        this.f60302.clear();
        this.f60306.clear();
        this.f60304.clear();
        this.f60300 = null;
        this.f60301 = null;
        this.f60307++;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m44182(Uri uri, C4951 c4951) {
        C19063 c19063 = this.f60301;
        if (c4951 != null && c19063 != null) {
            C12712 mo9179 = c19063.mo9179();
            if (mo9179 != null && mo9179.f38253.isEmpty()) {
                Iterator it = mo9179.f38258.iterator();
                while (it.hasNext()) {
                    if (((C13417) it.next()).f40105.equals(uri)) {
                        if (this.f60304.get(uri) == c4951) {
                            return;
                        }
                        this.f60304.put(uri, c4951);
                        if (this.f60300 != null) {
                            this.f60300 = null;
                            this.f60305.run();
                        }
                        m44179(c19063, mo9179);
                        this.f60307++;
                        return;
                    }
                }
                return;
            }
            m44180();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r1 != r3) goto L28;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void m44183(l.C3104 r12) {
        /*
            r11 = this;
            r0 = r11
            monitor-enter(r0)
            l.ᩴ֨ۜ r8 = new l.ᩴ֨ۜ     // Catch: java.lang.Throwable -> L87
            android.net.Uri r2 = r12.f9711     // Catch: java.lang.Throwable -> L87
            long r3 = r12.f9718     // Catch: java.lang.Throwable -> L87
            long r5 = r12.f9713     // Catch: java.lang.Throwable -> L87
            r9 = -1
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 != 0) goto L11
            r5 = r9
        L11:
            r1 = r8
            r1.<init>(r2, r3, r5)     // Catch: java.lang.Throwable -> L87
            java.util.HashSet r12 = r11.f60306     // Catch: java.lang.Throwable -> L87
            boolean r12 = r12.contains(r8)     // Catch: java.lang.Throwable -> L87
            if (r12 == 0) goto L1f
            monitor-exit(r0)
            return
        L1f:
            java.util.HashSet r12 = r11.f60302     // Catch: java.lang.Throwable -> L87
            boolean r12 = r12.contains(r8)     // Catch: java.lang.Throwable -> L87
            if (r12 == 0) goto L35
            l.ۖ֨ۜ r12 = r11.f60300     // Catch: java.lang.Throwable -> L87
            if (r12 == 0) goto L33
            r12 = 0
            r11.f60300 = r12     // Catch: java.lang.Throwable -> L87
            l.᩷ۛ᩻ r12 = r11.f60305     // Catch: java.lang.Throwable -> L87
            r12.run()     // Catch: java.lang.Throwable -> L87
        L33:
            monitor-exit(r0)
            return
        L35:
            java.util.HashMap r12 = r11.f60303     // Catch: java.lang.Throwable -> L87
            java.lang.Object r12 = r12.get(r8)     // Catch: java.lang.Throwable -> L87
            l.ۘ֨ۜ r12 = (l.C3607) r12     // Catch: java.lang.Throwable -> L87
            l.ᩴ᩺֫ r1 = r11.f60301     // Catch: java.lang.Throwable -> L87
            if (r12 == 0) goto L85
            if (r1 != 0) goto L44
            goto L85
        L44:
            l.ۖ֨ۜ r10 = new l.ۖ֨ۜ     // Catch: java.lang.Throwable -> L87
            android.net.Uri r2 = l.C3607.m11073(r12)     // Catch: java.lang.Throwable -> L87
            long r3 = r11.f60307     // Catch: java.lang.Throwable -> L87
            l.ۙ᩺֫ r5 = l.C3607.m11072(r12)     // Catch: java.lang.Throwable -> L87
            long r6 = r1.mo9173()     // Catch: java.lang.Throwable -> L87
            l.᩸᩺֫ r9 = l.C3607.m11074(r12)     // Catch: java.lang.Throwable -> L87
            r1 = r10
            r1.<init>(r2, r3, r5, r6, r8, r9)     // Catch: java.lang.Throwable -> L87
            l.ۖ֨ۜ r12 = r11.f60300     // Catch: java.lang.Throwable -> L87
            if (r12 == 0) goto L81
            android.net.Uri r12 = l.C2196.m7260(r12)     // Catch: java.lang.Throwable -> L87
            android.net.Uri r1 = l.C2196.m7260(r10)     // Catch: java.lang.Throwable -> L87
            boolean r12 = r12.equals(r1)     // Catch: java.lang.Throwable -> L87
            if (r12 == 0) goto L7c
            l.ۖ֨ۜ r12 = r11.f60300     // Catch: java.lang.Throwable -> L87
            long r1 = l.C2196.m7261(r12)     // Catch: java.lang.Throwable -> L87
            long r3 = l.C2196.m7261(r10)     // Catch: java.lang.Throwable -> L87
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 == 0) goto L81
        L7c:
            l.᩷ۛ᩻ r12 = r11.f60305     // Catch: java.lang.Throwable -> L87
            r12.run()     // Catch: java.lang.Throwable -> L87
        L81:
            r11.f60300 = r10     // Catch: java.lang.Throwable -> L87
            monitor-exit(r0)
            return
        L85:
            monitor-exit(r0)
            return
        L87:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L87
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C19130.m44183(l.ۗ۠֫):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m44184(C19063 c19063) {
        this.f60301 = c19063;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized C2196 m44185() {
        return this.f60300;
    }

    public C19130(RunnableC20699 runnableC20699) {
        this.f60305 = runnableC20699;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m44180() {
        HashMap hashMap = this.f60303;
        boolean isEmpty = hashMap.isEmpty();
        HashSet hashSet = this.f60306;
        HashSet hashSet2 = this.f60302;
        if (isEmpty && hashSet2.isEmpty() && hashSet.isEmpty() && this.f60300 == null) {
            return;
        }
        hashMap.clear();
        hashSet2.clear();
        hashSet.clear();
        this.f60304.clear();
        this.f60300 = null;
        this.f60307++;
        this.f60305.run();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m44179(C19063 c19063, C12712 c12712) {
        HashMap hashMap;
        Iterator it;
        long j;
        HashMap hashMap2 = this.f60303;
        hashMap2.clear();
        HashSet hashSet = this.f60302;
        hashSet.clear();
        HashSet hashSet2 = this.f60306;
        hashSet2.clear();
        HashMap hashMap3 = this.f60304;
        hashMap3.clear();
        Iterator it2 = c12712.f38258.iterator();
        while (it2.hasNext()) {
            Uri uri = ((C13417) it2.next()).f40105;
            C4951 mo9174 = c19063.mo9174(uri, false);
            if (mo9174 != null) {
                String str = mo9174.f31806;
                hashMap3.put(uri, mo9174);
                for (C21885 c21885 : mo9174.f15593) {
                    C21885 c218852 = c21885.f73015;
                    if (c218852 != null) {
                        j = -1;
                        Uri m22231 = C8542.m22231(str, c218852.f73022);
                        hashMap = hashMap3;
                        it = it2;
                        long j2 = c218852.f73021;
                        long j3 = c218852.f73020;
                        hashSet2.add(new C18424(m22231, j2, j3 == -1 ? -1L : j3));
                    } else {
                        hashMap = hashMap3;
                        it = it2;
                        j = -1;
                    }
                    Uri m222312 = C8542.m22231(str, c21885.f73022);
                    long j4 = c21885.f73021;
                    String str2 = str;
                    long j5 = c21885.f73020;
                    C18424 c18424 = new C18424(m222312, j4, j5 == j ? j : j5);
                    if (((C3607) C13843.putIfAbsent(hashMap2, c18424, new C3607(uri, mo9174, c21885))) != null) {
                        hashMap2.remove(c18424);
                        hashSet.add(c18424);
                    }
                    str = str2;
                    hashMap3 = hashMap;
                    it2 = it;
                }
            }
        }
    }
}

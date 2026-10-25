package l;

import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: Q57Q */
/* renamed from: l.֨᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1315 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f4720;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f4721;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f4722;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f4723;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f4724;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized LinkedHashMap m4555() {
        return new LinkedHashMap(this.f4721);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo4557(Object obj, Object obj2) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f4720;
        int i3 = this.f4724 + i2;
        i = i3 != 0 ? (i2 * 100) / i3 : 0;
        Locale locale = Locale.US;
        return "LruCache[maxSize=" + this.f4722 + ",hits=" + this.f4720 + ",misses=" + this.f4724 + ",hitRate=" + i + "%]";
    }

    public C1315(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f4722 = i;
        this.f4721 = new LinkedHashMap(0, 0.75f, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m4553(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.f4721.get(obj);
            if (obj2 != null) {
                this.f4720++;
                return obj2;
            }
            this.f4724++;
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m4554(Object obj, Object obj2) {
        Object put;
        if (obj == null || obj2 == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f4723 += m4552(obj, obj2);
            put = this.f4721.put(obj, obj2);
            if (put != null) {
                this.f4723 -= m4552(obj, put);
            }
        }
        m4556(this.f4722);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4556(int r5) {
        /*
            r4 = this;
        L0:
            r0 = r4
            monitor-enter(r0)
            int r1 = r4.f4723     // Catch: java.lang.Throwable -> L68
            if (r1 < 0) goto L49
            java.util.LinkedHashMap r1 = r4.f4721     // Catch: java.lang.Throwable -> L68
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L12
            int r1 = r4.f4723     // Catch: java.lang.Throwable -> L68
            if (r1 != 0) goto L49
        L12:
            int r1 = r4.f4723     // Catch: java.lang.Throwable -> L68
            if (r1 <= r5) goto L47
            java.util.LinkedHashMap r1 = r4.f4721     // Catch: java.lang.Throwable -> L68
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto L1f
            goto L47
        L1f:
            java.util.LinkedHashMap r1 = r4.f4721     // Catch: java.lang.Throwable -> L68
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L68
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L68
            java.util.LinkedHashMap r3 = r4.f4721     // Catch: java.lang.Throwable -> L68
            r3.remove(r2)     // Catch: java.lang.Throwable -> L68
            int r3 = r4.f4723     // Catch: java.lang.Throwable -> L68
            int r1 = r4.m4552(r2, r1)     // Catch: java.lang.Throwable -> L68
            int r3 = r3 - r1
            r4.f4723 = r3     // Catch: java.lang.Throwable -> L68
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            goto L0
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            return
        L49:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L68
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r1.<init>()     // Catch: java.lang.Throwable -> L68
            java.lang.Class r2 = r4.getClass()     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L68
            r1.append(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = ".sizeOf() is reporting inconsistent results!"
            r1.append(r2)     // Catch: java.lang.Throwable -> L68
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L68
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L68
            throw r5     // Catch: java.lang.Throwable -> L68
        L68:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1315.m4556(int):void");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4558(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object remove = this.f4721.remove(obj);
            if (remove != null) {
                this.f4723 -= m4552(obj, remove);
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int m4552(Object obj, Object obj2) {
        int mo4557 = mo4557(obj, obj2);
        if (mo4557 >= 0) {
            return mo4557;
        }
        throw new IllegalStateException("Negative size: " + obj + "=" + obj2);
    }
}

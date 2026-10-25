package l;

import android.os.SystemClock;
import android.util.Log;
import android.util.SparseLongArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.Writer;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Q1K7 */
/* renamed from: l.֡ᩳۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0577 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0225 f2271;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11005 f2272;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C11005 f2274;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile boolean f2276;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C18923 f2277;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11005 f2278;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f2280;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11005 f2281;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12366 f2282;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f2283;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C1769 f2284;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f2273 = new AtomicInteger();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f2279 = new AtomicInteger();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f2275 = new AtomicInteger();

    public C0577(C12366 c12366) {
        ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
        this.f2283 = concurrentMapC10942;
        C1769 newKeySet = ConcurrentMapC10942.newKeySet();
        this.f2284 = newKeySet;
        this.f2280 = new ConcurrentMapC10942();
        this.f2271 = new C0225();
        this.f2282 = c12366;
        C11005 c11005 = new C11005(c12366.m36263(), "smali");
        this.f2281 = c11005;
        if (c11005.m27340().mo23119()) {
            c11005.m27333();
        }
        c11005.m27340().m36508();
        C11005 c110052 = new C11005(c11005, "x");
        this.f2272 = c110052;
        C11005 c110053 = new C11005(c11005, "y");
        this.f2274 = c110053;
        this.f2278 = new C11005(c11005, "f");
        if (!C12248.m29747(c11005.m27340())) {
            m2367();
        } else {
            try {
                SparseLongArray sparseLongArray = new SparseLongArray();
                m2356(c110052, true, sparseLongArray);
                m2356(c110053, false, sparseLongArray);
                m2363();
                if (concurrentMapC10942.isEmpty() && newKeySet.isEmpty()) {
                    m2367();
                }
            } catch (IOException unused) {
                m2367();
            }
        }
        this.f2277 = new C18923(this);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m2363() {
        C11005 c11005 = this.f2278;
        if (c11005.m27336()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(c11005.m27334()));
            while (dataInputStream.available() > 0) {
                try {
                    this.f2284.add(C12248.m29745(dataInputStream));
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            dataInputStream.close();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2356(C11005 c11005, boolean z, SparseLongArray sparseLongArray) {
        String m29745;
        long mo23127;
        if (c11005.m27336()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(c11005.m27334()));
            while (dataInputStream.available() > 0) {
                try {
                    if (!z) {
                        m29745 = C12248.m29745(dataInputStream);
                    } else {
                        m29745 = dataInputStream.readUTF();
                    }
                    int readUnsignedShort = dataInputStream.readUnsignedShort();
                    int readInt = dataInputStream.readInt();
                    int readInt2 = dataInputStream.readInt();
                    int indexOfKey = sparseLongArray.indexOfKey(readUnsignedShort);
                    if (indexOfKey >= 0) {
                        mo23127 = sparseLongArray.valueAt(indexOfKey);
                    } else {
                        AbstractC15440 m27330 = this.f2281.m27330(String.valueOf(readUnsignedShort));
                        if (!m27330.mo23119()) {
                            throw new IOException("Missing smali cache data file");
                        }
                        mo23127 = m27330.mo23127();
                        sparseLongArray.put(readUnsignedShort, mo23127);
                    }
                    if (readInt >= 0 && readInt2 > 0 && readInt + readInt2 <= mo23127) {
                        this.f2283.put(m29745, new C19629(readUnsignedShort, readInt, readInt2));
                    } else {
                        throw new IOException("Invalid smali cache offset");
                    }
                } catch (Throwable th) {
                    try {
                        dataInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            dataInputStream.close();
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m2367() {
        this.f2283.clear();
        this.f2284.clear();
        this.f2280.clear();
        C11005 c11005 = this.f2281;
        C11005[] m27335 = c11005.m27335();
        if (m27335 != null) {
            for (C11005 c110052 : m27335) {
                if (c110052.m27336() && !c110052.m27333()) {
                    throw new IOException("Unable to delete smali cache file");
                }
            }
        }
        C12248.m29750(c11005.m27340());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m2360(String str) {
        return (this.f2283.containsKey(str) || this.f2284.contains(str)) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2369(ActivityC17169 activityC17169) {
        AbstractC7379 lifecycle = activityC17169.getLifecycle();
        final AtomicReference atomicReference = activityC17169.f52614;
        if (lifecycle.mo19832() == EnumC13728.DESTROYED) {
            return;
        }
        lifecycle.mo19833(new C4106(this));
        this.f2277.m43663();
        this.f2276 = false;
        final int incrementAndGet = this.f2273.incrementAndGet();
        final C20765 c20765 = (C20765) lifecycle;
        Thread thread = new Thread(new Runnable() { // from class: l.ۢᩳۢ
            @Override // java.lang.Runnable
            public final void run() {
                C0577.m2353(C0577.this, incrementAndGet, c20765, atomicReference);
            }
        });
        thread.setName("SmaliCache-1");
        thread.start();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2353(final C0577 c0577, int i, C20765 c20765, AtomicReference atomicReference) {
        C18923 c18923 = c0577.f2277;
        System.out.println("SmaliCache prepare");
        AtomicInteger atomicInteger = c0577.f2279;
        atomicInteger.incrementAndGet();
        try {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (C18011 c18011 : c0577.f2282.m30063()) {
                if (c18011.f56168 != null) {
                    i2++;
                    if (c18011.f56171 == null && c0577.m2360(c18011.f56169)) {
                        arrayList.add(c18011);
                    }
                }
            }
            Collections.sort(arrayList, C18011.f56166);
            C19277 c19277 = new C19277(i2);
            c19277.m44459(new C9045());
            c19277.m44460(i2 - arrayList.size());
            final C16099 c16099 = new C16099(c0577, new AtomicInteger(), arrayList, i, c20765, atomicReference, c19277);
            int i3 = C17615.f53826 >= 4 ? 3 : 2;
            for (int i4 = 2; i4 <= i3; i4++) {
                final int i5 = i4 - 1;
                Thread thread = new Thread(new Runnable() { // from class: l.ۖᩳۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0577.m2355(C0577.this, c16099, i5);
                    }
                });
                thread.setName("SmaliCache-" + i4);
                thread.start();
            }
            c16099.accept(0);
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c18923.m43663();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00be, code lost:
    
        r7.f2275.decrementAndGet();
        java.lang.System.out.println(java.lang.Thread.currentThread().getName() + " resumed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014d, code lost:
    
        java.lang.System.out.println(java.lang.Thread.currentThread().getName() + " canceled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
    
        return;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m2354(l.C0577 r7, java.util.concurrent.atomic.AtomicInteger r8, java.util.ArrayList r9, int r10, l.C20765 r11, java.util.concurrent.atomic.AtomicReference r12, l.C19277 r13, int r14) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0577.m2354(l.֡ᩳۢ, java.util.concurrent.atomic.AtomicInteger, java.util.ArrayList, int, l.᩷ۡ֫, java.util.concurrent.atomic.AtomicReference, l.᩵ۛۡ, int):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m2355(C0577 c0577, C16099 c16099, int i) {
        C18923 c18923 = c0577.f2277;
        AtomicInteger atomicInteger = c0577.f2279;
        atomicInteger.incrementAndGet();
        try {
            c16099.accept(i);
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                c18923.m43663();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2358(C18011 c18011, C12953 c12953) {
        C13533 m31519 = c12953.m31519();
        try {
            m2357(c18011, m31519);
            m31519.close();
            String str = c18011.f56169;
            if (m2360(str)) {
                if (!c12953.m31520()) {
                    c12953.m31514();
                    if (m2360(str)) {
                        this.f2277.m43662(str, c12953);
                        return;
                    }
                    return;
                }
                C18923 c18923 = this.f2277;
                synchronized (c18923) {
                    if (c18923.f59611.f2283.containsKey(str) || c18923.f59611.f2284.contains(str)) {
                        return;
                    }
                    try {
                        if (c18923.f59616 == null) {
                            c18923.f59616 = new C2951(c18923.f59611.f2278.m27340().mo23555(true));
                        }
                        C2951 c2951 = c18923.f59616;
                        C12248.m29746(c2951, C5773.m16233(str));
                        C5773.m16236(c2951, str);
                        c18923.f59616.flush();
                        c18923.f59611.f2284.add(str);
                    } catch (IOException e) {
                        c18923.m43663();
                        throw e;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                m31519.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2370(C18011 c18011, C22706 c22706) {
        try {
            C19629 c19629 = (C19629) this.f2283.get(c18011.f56169);
            if (c19629 != null) {
                m2359(c18011, c19629, c22706);
                return;
            }
        } catch (IOException unused) {
        }
        try {
            m2357(c18011, (Writer) c22706);
        } catch (Throwable th) {
            c22706.m50718();
            c22706.append((CharSequence) Log.getStackTraceString(th));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2359(C18011 c18011, C19629 c19629, C22706 c22706) {
        int i;
        byte[] bArr;
        String str = c18011.f56169;
        int i2 = c19629.f63372;
        Reference reference = (Reference) this.f2280.get(Integer.valueOf(i2));
        byte[] bArr2 = reference != null ? (byte[]) reference.get() : null;
        if (bArr2 == null) {
            synchronized (this.f2280) {
                Reference reference2 = (Reference) this.f2280.get(Integer.valueOf(i2));
                bArr = reference2 != null ? (byte[]) reference2.get() : null;
                if (bArr == null) {
                    try {
                        bArr = this.f2281.m27330(String.valueOf(i2)).m36506();
                        this.f2280.put(Integer.valueOf(i2), new SoftReference(bArr));
                    } catch (IOException unused) {
                        bArr2 = new byte[0];
                    }
                }
            }
            bArr2 = bArr;
        }
        int i3 = c19629.f63374;
        if (i3 < 0 || (i = c19629.f63373) <= 0 || i3 + i > bArr2.length) {
            throw new IOException("Smali cache data range is invalid");
        }
        C12953 c12953 = (C12953) this.f2271.m1479();
        if (c12953 == null) {
            c12953 = new C12953();
        }
        try {
            c12953.m31515(c19629.f63374, c19629.f63373, bArr2);
            C5773.m16239(c12953.m31517(), c12953.m31521(), c22706);
        } finally {
            this.f2271.m1477(c12953);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m2357(C18011 c18011, Writer writer) {
        String name = c18011.f56168.getName();
        C12366 c12366 = this.f2282;
        C7980 c7980 = new C7980(c12366.m30065(name), c18011.f56167, c18011.f56172);
        if (c12366.m30048()) {
            writer.write("# ");
            writer.write(c18011.f56170);
            writer.write(".dex\n\n");
        }
        C21652.m48913(writer, c7980, c12366.m30064(c18011.f56170));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m2362(C0577 c0577, int i) {
        c0577.f2280.remove(Integer.valueOf(i));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m2351(C0577 c0577, int i) {
        return c0577.f2281.m27330(String.valueOf(i));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m2372() {
        this.f2273.incrementAndGet();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2368() {
        this.f2276 = true;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m2371() {
        this.f2277.m43661();
        this.f2276 = false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m2374() {
        while (true) {
            AtomicInteger atomicInteger = this.f2279;
            if (atomicInteger.get() <= 0 || this.f2275.get() >= atomicInteger.get()) {
                return;
            } else {
                SystemClock.sleep(100L);
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m2373() {
        if (this.f2279.get() > 0) {
            SystemClock.sleep(100L);
        }
    }
}

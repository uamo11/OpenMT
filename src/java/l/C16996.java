package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.sevenzipjbinding.SevenZipException;

/* compiled from: 473S */
/* renamed from: l.ܿ֡ܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16996 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f52130 = "MIUI BACKUP\n".getBytes(StandardCharsets.UTF_8);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m39850(long j, long j2) {
        return j2 > C13132.FOREVER_NS - j ? C13132.FOREVER_NS : j + j2;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m39854(AbstractC13921 abstractC13921) {
        return m39853(abstractC13921).mo23554();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C1474 m39851(AbstractC13921 abstractC13921) {
        LinkedHashMap m39855 = m39855(abstractC13921);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m39855.size());
        for (AbstractC15440 abstractC15440 : m39855.values()) {
            linkedHashMap.put(abstractC15440.mo23554(), m39852(abstractC15440));
        }
        HashMap hashMap = new HashMap(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            C11003.requireNonNull(key);
            Object value = entry.getValue();
            C11003.requireNonNull(value);
            hashMap.put(key, value);
        }
        return new C1474(C20195.unmodifiableMap(hashMap));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m39855(AbstractC13921 abstractC13921) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC15440 m39853 = m39853(abstractC13921);
        linkedHashMap.put(m39853.mo23554(), m39853);
        if (abstractC13921 instanceof C19247) {
            C19247 c19247 = (C19247) abstractC13921;
            if (c19247.m44395()) {
                try {
                    C12951 c12951 = new C12951(c19247.m44388());
                    int readInt = c12951.readInt();
                    if (readInt <= 0 || readInt > 10000) {
                        throw new IOException("Invalid ZIP split volume count: " + readInt);
                    }
                    AbstractC15440 m36514 = m39853.m36514();
                    for (int i = 0; i < readInt; i++) {
                        AbstractC15440 m36526 = m36514.m36526(c12951.m31506());
                        c12951.readLong();
                        linkedHashMap.put(m36526.mo23554(), m36526);
                    }
                    return linkedHashMap;
                } catch (IllegalArgumentException | IndexOutOfBoundsException e) {
                    throw new IOException("Invalid ZIP split metadata", e);
                }
            }
        }
        if (abstractC13921 instanceof C2346) {
            for (AbstractC15440 abstractC15440 : ((C2346) abstractC13921).m7655()) {
                linkedHashMap.put(abstractC15440.mo23554(), abstractC15440);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12616 m39852(AbstractC15440 abstractC15440) {
        if (!abstractC15440.mo23120() || !abstractC15440.mo23119()) {
            throw new FileNotFoundException(abstractC15440.mo23554());
        }
        return new C12616(abstractC15440.mo23554(), abstractC15440.mo23127(), abstractC15440.mo23117());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6266 m39839(AbstractC13921 abstractC13921, C0914 c0914) {
        String str;
        try {
            if (abstractC13921 instanceof C19247) {
                m39848((C19247) abstractC13921, c0914);
            } else if (abstractC13921 instanceof C17626) {
                m39845((C17626) abstractC13921, c0914);
            } else if (abstractC13921 instanceof C2346) {
                m39842((C2346) abstractC13921, c0914);
            } else if (abstractC13921 instanceof C11518) {
                m39844((C11518) abstractC13921, c0914);
            } else {
                throw new C17702();
            }
            if (!c0914.m3271()) {
                return new C6266(EnumC10647.VALID, null, null);
            }
            return new C6266(EnumC10647.CANCELED, null, null);
        } catch (C10500 e) {
            str = e.f31497;
            return new C6266(EnumC10647.INVALID, str, null);
        } catch (C16290 unused) {
            return new C6266(EnumC10647.CANCELED, null, null);
        } catch (C17702 unused2) {
            return new C6266(EnumC10647.UNSUPPORTED, null, null);
        } catch (Exception e2) {
            return new C6266(EnumC10647.FAILED, null, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m39848(final l.C19247 r17, final l.C0914 r18) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16996.m39848(l.᩵ۙ᩻, l.֨ۚܳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m39847(C19247 c19247, List list, C0914 c0914, AtomicBoolean atomicBoolean, C14026 c14026, AtomicReference atomicReference) {
        byte[] bArr = new byte[65536];
        try {
            C18090 m42168 = C18090.m42168(c19247.m44380(), c19247.m44388());
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C3545 c3545 = (C3545) it.next();
                    m39843(c0914, atomicBoolean);
                    m39846(m42168, c19247, c3545, bArr, c14026, false, c0914, atomicBoolean);
                }
                m42168.close();
            } finally {
            }
        } catch (Throwable th) {
            if (!(th instanceof C16290)) {
                while (!atomicReference.compareAndSet(null, th) && atomicReference.get() == null) {
                }
            }
            atomicBoolean.set(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0196 A[Catch: all -> 0x01a0, TRY_ENTER, TryCatch #0 {all -> 0x01a0, blocks: (B:91:0x015c, B:94:0x0164, B:96:0x016b, B:98:0x017a, B:100:0x0186, B:102:0x0196, B:103:0x019f), top: B:90:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0162  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v9, types: [l.ۗܺ᩷] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m39846(l.C18090 r17, l.C19247 r18, l.C3545 r19, byte[] r20, l.C14026 r21, boolean r22, final l.C0914 r23, java.util.concurrent.atomic.AtomicBoolean r24) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16996.m39846(l.ᩳܰۡ, l.᩵ۙ᩻, l.ۗ᩺ۡ, byte[], l.ܰ᩵ܳ, boolean, l.֨ۚܳ, java.util.concurrent.atomic.AtomicBoolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005c, code lost:
    
        r3 = new byte[65536];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005e, code lost:
    
        r7 = r5.read(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0062, code lost:
    
        if (r7 == (-1)) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0064, code lost:
    
        m39843(r18, (java.util.concurrent.atomic.AtomicBoolean) null);
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0068, code lost:
    
        if (r9 >= r7) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x006c, code lost:
    
        if (r3[r9] != 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006e, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0078, code lost:
    
        throw new java.io.IOException("Non-zero data after TAR end marker");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0079, code lost:
    
        m39843(r18, (java.util.concurrent.atomic.AtomicBoolean) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x007c, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007f, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0082, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0085, code lost:
    
        return;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m39845(l.C17626 r17, l.C0914 r18) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16996.m39845(l.ܿ᩸᩻, l.֨ۚܳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39844(C11518 c11518, C0914 c0914) {
        Throwable th = null;
        try {
            c11518.mo7646(false);
            C12223 m28349 = c11518.m28349();
            AbstractC15440 m28350 = c11518.m28350();
            InputStream mo27926 = m28350.mo27926();
            try {
                try {
                    InputStream m37683 = m28349.m29722().m37683(new C13321(mo27926, m28350.mo23127(), c0914));
                    try {
                        byte[] bArr = new byte[65536];
                        while (m37683.read(bArr) != -1) {
                            m39843(c0914, (AtomicBoolean) null);
                        }
                        m39843(c0914, (AtomicBoolean) null);
                        m37683.close();
                        if (mo27926 != null) {
                            mo27926.close();
                        }
                    } catch (Throwable th2) {
                        if (m37683 != null) {
                            try {
                                m37683.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                        }
                        throw th2;
                    }
                } catch (C16290 e) {
                    throw e;
                } catch (IOException e2) {
                    Throwable th4 = e2;
                    while (true) {
                        if (th4 == null) {
                            break;
                        }
                        if (!C7677.class.isInstance(th4)) {
                            th4 = th4.getCause();
                        } else {
                            th = (Throwable) C7677.class.cast(th4);
                            break;
                        }
                    }
                    C7677 c7677 = (C7677) th;
                    if (c7677 != null) {
                        throw c7677;
                    }
                    if (m39849(e2)) {
                        throw new C17702(e2);
                    }
                    throw new C10500(m28349.getName(), e2);
                } catch (RuntimeException e3) {
                    if (m39849(e3)) {
                        throw new C17702(e3);
                    }
                    throw e3;
                }
            } catch (Throwable th5) {
                if (mo27926 != null) {
                    try {
                        mo27926.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (IOException e4) {
            throw new C10500(null, e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        r7.reset();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        return;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m39841(java.io.BufferedInputStream r7) {
        /*
            byte[] r0 = l.C16996.f52130
            int r1 = r0.length
            r2 = 2048(0x800, float:2.87E-42)
            int r1 = r1 + r2
            r7.mark(r1)
            int r1 = r0.length
            r3 = 0
            r4 = 0
        Lc:
            if (r4 >= r1) goto L1f
            r5 = r0[r4]
            int r6 = r7.read()
            r5 = r5 & 255(0xff, float:3.57E-43)
            if (r6 == r5) goto L1c
            r7.reset()
            return
        L1c:
            int r4 = r4 + 1
            goto Lc
        L1f:
            r0 = 0
        L20:
            r1 = 8
            if (r3 >= r2) goto L37
            if (r0 >= r1) goto L37
            int r4 = r7.read()
            r5 = -1
            if (r4 != r5) goto L2e
            goto L37
        L2e:
            r1 = 10
            if (r4 != r1) goto L34
            int r0 = r0 + 1
        L34:
            int r3 = r3 + 1
            goto L20
        L37:
            if (r0 == r1) goto L3c
            r7.reset()
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C16996.m39841(java.io.BufferedInputStream):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39842(C2346 c2346, C0914 c0914) {
        try {
            if (!c2346.m7647(new C8383(c0914))) {
                c0914.cancel();
                throw new C16290();
            }
            List m7657 = c2346.m7657();
            AtomicReference atomicReference = new AtomicReference();
            AtomicInteger atomicInteger = new AtomicInteger();
            C4855 c4855 = new C4855(c2346, m7657, atomicReference, c0914, atomicInteger);
            ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
            Future submit = newSingleThreadExecutor.submit(new CallableC14029(2, c4855));
            newSingleThreadExecutor.shutdown();
            while (true) {
                try {
                    try {
                        try {
                            submit.get(100L, TimeUnit.MILLISECONDS);
                            break;
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            c0914.cancel();
                            throw new C16290();
                        }
                    } finally {
                        newSingleThreadExecutor.shutdownNow();
                    }
                } catch (ExecutionException e) {
                    if (c0914.m3271()) {
                        throw new C16290();
                    }
                    Throwable cause = e.getCause();
                    Exception exc = cause instanceof Exception ? (Exception) cause : new Exception(cause);
                    if (m39849(exc)) {
                        throw new C17702(exc);
                    }
                    if (!(exc instanceof SevenZipException)) {
                        throw exc;
                    }
                    IOException m39837 = m39837((SevenZipException) exc);
                    if (m39837 == null) {
                        throw new C10500((String) atomicReference.get(), (IOException) exc);
                    }
                    throw m39837;
                } catch (TimeoutException unused2) {
                    if (!c0914.m3271()) {
                        c0914.mo11538(atomicInteger.get());
                    }
                }
            }
            if (c0914.m3271()) {
                throw new C16290();
            }
            c0914.mo11538(100);
        } catch (SevenZipException e2) {
            if (c0914.m3271()) {
                throw new C16290();
            }
            IOException m398372 = m39837(e2);
            if (m398372 == null) {
                throw new C10500(null, e2);
            }
            throw m398372;
        } catch (IOException e3) {
            throw e3;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m39843(InterfaceC3444 interfaceC3444, AtomicBoolean atomicBoolean) {
        if (((C0914) interfaceC3444).m3271() || Thread.currentThread().isInterrupted() || (atomicBoolean != null && atomicBoolean.get())) {
            throw new C16290();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m39849(Exception exc) {
        for (Exception exc2 = exc; exc2 != null; exc2 = exc2.getCause()) {
            String simpleName = exc2.getClass().getSimpleName();
            Locale locale = Locale.ROOT;
            if (simpleName.toLowerCase(locale).contains("unsupported")) {
                return true;
            }
            String message = exc2.getMessage();
            if (message != null) {
                String lowerCase = message.toLowerCase(locale);
                if (lowerCase.contains("unsupported compression method") || lowerCase.contains("unsupported encryption method") || lowerCase.contains("unsupported method") || lowerCase.contains("unsupportedmethod") || lowerCase.contains("not implemented") || lowerCase.contains("e_notimpl") || lowerCase.contains("dictionary mismatch") || lowerCase.contains("dictionary required") || lowerCase.contains("requires a dictionary")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IOException m39837(SevenZipException sevenZipException) {
        ArrayDeque arrayDeque = new ArrayDeque();
        HashSet hashSet = new HashSet();
        arrayDeque.add(sevenZipException);
        while (!arrayDeque.isEmpty()) {
            Throwable th = (Throwable) arrayDeque.removeFirst();
            if (hashSet.add(th)) {
                if ((th instanceof IOException) && !(th instanceof SevenZipException)) {
                    return (IOException) th;
                }
                if (th.getCause() != null) {
                    arrayDeque.add(th.getCause());
                }
                if (th instanceof SevenZipException) {
                    SevenZipException sevenZipException2 = (SevenZipException) th;
                    if (sevenZipException2.getCauseLastThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseLastThrown());
                    }
                    if (sevenZipException2.getCauseFirstPotentialThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseFirstPotentialThrown());
                    }
                    if (sevenZipException2.getCauseLastPotentialThrown() != null) {
                        arrayDeque.add(sevenZipException2.getCauseLastPotentialThrown());
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m39853(AbstractC13921 abstractC13921) {
        if (abstractC13921 instanceof C19247) {
            return ((C19247) abstractC13921).m44380();
        }
        if (abstractC13921 instanceof C17626) {
            return ((C17626) abstractC13921).m41201();
        }
        if (abstractC13921 instanceof C2346) {
            return ((C2346) abstractC13921).m7648();
        }
        if (abstractC13921 instanceof C11518) {
            return ((C11518) abstractC13921).m28350();
        }
        throw new C17702();
    }
}

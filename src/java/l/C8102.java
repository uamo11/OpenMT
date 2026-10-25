package l;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: RAHU */
/* renamed from: l.۠ۢ᩻, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8102 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC3163 f24978;

    public C8102(AbstractC3163 abstractC3163) {
        this.f24978 = abstractC3163;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21534(String str, AbstractC15440 abstractC15440, InterfaceC5627 interfaceC5627) {
        InterfaceC17889 mo7638 = this.f24978.mo7638(str);
        if (mo7638 == null) {
            throw new FileNotFoundException(str);
        }
        m21536(mo7638, abstractC15440, true, interfaceC5627);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21536(InterfaceC17889 interfaceC17889, AbstractC15440 abstractC15440, boolean z, InterfaceC5627 interfaceC5627) {
        String path = interfaceC17889.getPath();
        if (interfaceC17889.isDirectory()) {
            throw new IOException(C4860.m14172("File ", path, " is a directory"));
        }
        long size = interfaceC17889.getSize();
        C21217 c21217 = new C21217(this.f24978, interfaceC5627);
        c21217.m48165(interfaceC17889.getName(), path, abstractC15440, size, interfaceC17889.getTime(), null, null, false, false);
        final AtomicReference atomicReference = new AtomicReference();
        c21217.m48166(new InterfaceC24038() { // from class: l.֨ۢ᩻
            @Override // l.InterfaceC24038
            /* renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo3587(C2872 c2872, boolean z2) {
                Exception exc;
                AtomicReference atomicReference2;
                if (z2 || (exc = (Exception) c2872.f9162.get()) == null) {
                    return;
                }
                do {
                    atomicReference2 = atomicReference;
                    if (atomicReference2.compareAndSet(null, exc)) {
                        return;
                    }
                } while (atomicReference2.get() == null);
            }
        });
        try {
            c21217.m48169();
            Exception exc = (Exception) atomicReference.get();
            if (exc != null) {
                if (!(exc instanceof IOException)) {
                    throw new IOException(exc);
                }
                throw ((IOException) exc);
            }
            if (interfaceC5627.mo1526()) {
                abstractC15440.mo27929();
            } else if (!z && abstractC15440.mo27912() && C4925.m14321()) {
                abstractC15440.mo18537(interfaceC17889.getTime());
            }
        } catch (Exception e) {
            if (!(e instanceof IOException)) {
                throw new IOException(e);
            }
            throw ((IOException) e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21535(AbstractC13921 abstractC13921, String str, String str2, boolean z, InterfaceC5627 interfaceC5627) {
        final InputStream mo7636;
        String str3;
        InterfaceC17889 mo7638 = this.f24978.mo7638(str2);
        InterfaceC17889 m33351 = abstractC13921.m33351(str);
        if (mo7638 != null) {
            C15688 c15688 = (C15688) mo7638;
            if (c15688.isDirectory()) {
                throw new IOException(C4860.m14172("File ", str2, " is a directory"));
            }
            String m24406 = C9523.m24406(str2);
            StringBuilder sb = new StringBuilder();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis == 0) {
                str3 = "0";
            } else if (currentTimeMillis > 0) {
                str3 = Long.toString(currentTimeMillis, 16);
            } else {
                int i = 64;
                char[] cArr = new char[64];
                int numberOfTrailingZeros = Integer.numberOfTrailingZeros(16);
                do {
                    i--;
                    cArr[i] = Character.forDigit(((int) currentTimeMillis) & 15, 16);
                    currentTimeMillis >>>= numberOfTrailingZeros;
                } while (currentTimeMillis != 0);
                str3 = new String(cArr, i, 64 - i);
            }
            sb.append(str3);
            sb.append(Long.toString(str2.hashCode() & 4294967295L, 16));
            sb.append(".tmp");
            String sb2 = sb.toString();
            if (m24406 != null) {
                sb2 = C16014.m37867(m24406, sb2);
            }
            synchronized (this) {
                if (interfaceC5627.mo1526()) {
                    return;
                }
                mo7636 = abstractC13921.mo7636((AbstractActivityC3346) null, m33351);
                if (mo7636 == null) {
                    if (interfaceC5627 instanceof InterfaceC14243) {
                        ((InterfaceC14243) interfaceC5627).cancel();
                    }
                    return;
                }
                if (abstractC13921 instanceof AbstractC3163) {
                    final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                    final AtomicReference atomicReference = new AtomicReference();
                    final C9742 c9742 = new C9742(5242880L);
                    C1802.f6208.submit(new Runnable() { // from class: l.ۚۢ᩻
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8102.m21531(mo7636, c9742, atomicBoolean, atomicReference);
                        }
                    });
                    try {
                        InputStream mo12307 = C23852.m52567(c9742.m24729()).mo12307();
                        try {
                            m21529(mo12307, this.f24978.mo9693(((C15688) m33351).getSize(), sb2), m33351, interfaceC5627);
                            mo12307.close();
                            atomicBoolean.set(true);
                            IOException iOException = (IOException) atomicReference.get();
                            if (iOException != null) {
                                throw iOException;
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        atomicBoolean.set(true);
                        throw th;
                    }
                } else {
                    try {
                        m21529(mo7636, this.f24978.mo9693(((C15688) m33351).getSize(), sb2), m33351, interfaceC5627);
                        mo7636.close();
                    } finally {
                    }
                }
                if (interfaceC5627.mo1526()) {
                    this.f24978.m9697(sb2, false);
                } else {
                    if (!z || c15688.getSize() <= 0) {
                        m21532(this.f24978, str2);
                    } else {
                        String concat = str2.concat(".bak");
                        InterfaceC17889 mo76382 = this.f24978.mo7638(concat);
                        if (mo76382 == null) {
                            m21533(this.f24978, str2, concat);
                        } else if (((C15688) mo76382).isDirectory()) {
                            m21532(this.f24978, str2);
                        } else {
                            m21532(this.f24978, concat);
                            m21533(this.f24978, str2, concat);
                        }
                    }
                    this.f24978.mo9684(sb2, str2);
                    if (interfaceC5627.mo1526()) {
                        return;
                    }
                    if (mo7638.mo24428() != null) {
                        AbstractC3163 abstractC3163 = this.f24978;
                        int m38843 = mo7638.mo24428().m38843();
                        if (abstractC3163.mo9708()) {
                            try {
                                abstractC3163.mo9694(m38843, str2);
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            }
        } else {
            synchronized (this) {
                if (interfaceC5627.mo1526()) {
                    return;
                }
                mo7636 = abstractC13921.mo7636((AbstractActivityC3346) null, m33351);
                if (mo7636 == null) {
                    if (interfaceC5627 instanceof InterfaceC14243) {
                        ((InterfaceC14243) interfaceC5627).cancel();
                    }
                    return;
                } else {
                    try {
                        m21529(mo7636, this.f24978.mo9693(((C15688) m33351).getSize(), str2), m33351, interfaceC5627);
                        mo7636.close();
                        if (interfaceC5627.mo1526()) {
                            this.f24978.m9697(str2, false);
                        }
                    } finally {
                    }
                }
            }
        }
        if (!interfaceC5627.mo1526() && C4925.m14321() && this.f24978.mo9687()) {
            try {
                this.f24978.mo9700(((C15688) m33351).getTime(), str2);
            } catch (Exception unused2) {
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21531(InputStream inputStream, C9742 c9742, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        try {
            try {
                m21530(inputStream, c9742.m24728(), atomicBoolean);
            } finally {
                C0349.m1793(c9742.m24728());
            }
        } catch (IOException e) {
            atomicReference.set(e);
        } catch (Throwable th) {
            atomicReference.set(new IOException(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m21529(java.io.InputStream r3, java.io.OutputStream r4, l.InterfaceC17889 r5, l.InterfaceC5627 r6) {
        /*
            r0 = 0
            long r1 = r5.getSize()     // Catch: java.lang.Throwable -> L26 java.lang.Error -> L2a java.lang.RuntimeException -> L2c java.io.IOException -> L2e
            l.C14176.m33825(r3, r4, r1, r6)     // Catch: java.lang.Throwable -> L26 java.lang.Error -> L2a java.lang.RuntimeException -> L2c java.io.IOException -> L2e
            r4.close()     // Catch: java.lang.Error -> Lc java.lang.RuntimeException -> Le java.io.IOException -> L10
            goto L12
        Lc:
            r3 = move-exception
            goto L11
        Le:
            r3 = move-exception
            goto L11
        L10:
            r3 = move-exception
        L11:
            r0 = r3
        L12:
            if (r0 == 0) goto L25
            boolean r3 = r0 instanceof java.io.IOException
            if (r3 != 0) goto L22
            boolean r3 = r0 instanceof java.lang.RuntimeException
            if (r3 == 0) goto L1f
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L1f:
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L22:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L25:
            return
        L26:
            r3 = move-exception
            r5 = r3
            r3 = r0
            goto L31
        L2a:
            r3 = move-exception
            goto L2f
        L2c:
            r3 = move-exception
            goto L2f
        L2e:
            r3 = move-exception
        L2f:
            throw r3     // Catch: java.lang.Throwable -> L30
        L30:
            r5 = move-exception
        L31:
            r4.close()     // Catch: java.lang.Error -> L35 java.lang.RuntimeException -> L37 java.io.IOException -> L39
            goto L40
        L35:
            r4 = move-exception
            goto L3a
        L37:
            r4 = move-exception
            goto L3a
        L39:
            r4 = move-exception
        L3a:
            r0 = r4
            if (r3 == 0) goto L40
            r3.addSuppressed(r0)
        L40:
            if (r3 != 0) goto L55
            if (r0 == 0) goto L55
            boolean r3 = r0 instanceof java.io.IOException
            if (r3 != 0) goto L52
            boolean r3 = r0 instanceof java.lang.RuntimeException
            if (r3 == 0) goto L4f
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            throw r0
        L4f:
            java.lang.Error r0 = (java.lang.Error) r0
            throw r0
        L52:
            java.io.IOException r0 = (java.io.IOException) r0
            throw r0
        L55:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8102.m21529(java.io.InputStream, java.io.OutputStream, l.ᩳۜܳ, l.ۚ᩸ܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21530(InputStream inputStream, InterfaceC5508 interfaceC5508, AtomicBoolean atomicBoolean) {
        InterfaceC6171 m52567 = C23852.m52567(C23852.m52563(inputStream));
        try {
            InterfaceC10405 m52568 = C23852.m52568(interfaceC5508);
            while (!m52567.mo12308() && !atomicBoolean.get() && m52567.mo4334(m52568.mo26253(), 8192L) != -1) {
                try {
                    m52568.flush();
                } finally {
                }
            }
            m52568.close();
            m52567.close();
        } catch (Throwable th) {
            try {
                m52567.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21532(AbstractC3163 abstractC3163, String str) {
        try {
            abstractC3163.mo9701(str, false);
        } catch (IOException e) {
            try {
                String m24406 = C9523.m24406(str);
                if (m24406 != null) {
                    abstractC3163.mo9692(m24406);
                }
                if (abstractC3163.mo9703(str)) {
                    throw e;
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21533(AbstractC3163 abstractC3163, String str, String str2) {
        try {
            abstractC3163.mo9684(str, str2);
        } catch (IOException e) {
            try {
                String m24406 = C9523.m24406(str);
                if (m24406 != null) {
                    abstractC3163.mo9692(m24406);
                }
                if (abstractC3163.mo9703(str)) {
                    throw e;
                }
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }
}

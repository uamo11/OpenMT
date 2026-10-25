package l;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import net.sf.sevenzipjbinding.ArchiveFormat;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import net.sf.sevenzipjbinding.IInArchive;
import net.sf.sevenzipjbinding.SevenZipException;

/* compiled from: 8B3M */
/* renamed from: l.ᩳ᩻ᩳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18390 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42816(InterfaceC11606 interfaceC11606, InterfaceC13883 interfaceC13883) {
        m42815(null, C5378.stream(interfaceC11606).mapToInt(new C12473()).toArray(), interfaceC13883);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        l.C0349.m1793((java.io.Closeable) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m42815(l.AbstractActivityC3346 r6, int[] r7, l.InterfaceC13883 r8) {
        /*
            r0 = 1
            net.sf.sevenzipjbinding.ISequentialOutStream[] r0 = new net.sf.sevenzipjbinding.ISequentialOutStream[r0]
            r1 = 0
            r2 = 0
            r0[r1] = r2
            net.sf.sevenzipjbinding.IInArchive r3 = r8.mo7143()
            l.ۨܳᩳ r4 = new l.ۨܳᩳ
            r4.<init>(r6, r8, r3, r0)
            java.lang.String r6 = r8.mo7144()
            r4.m4001(r6)
            l.ۤܳᩳ r6 = new l.ۤܳᩳ
            r6.<init>(r8)
            r4.m3998(r6)
        L1f:
            r8.mo7141()     // Catch: java.lang.Throwable -> L53 net.sf.sevenzipjbinding.SevenZipException -> L55
            r3.extract(r7, r1, r4)     // Catch: java.lang.Throwable -> L53 net.sf.sevenzipjbinding.SevenZipException -> L55
            boolean r6 = r4.m4004()     // Catch: java.lang.Throwable -> L53 net.sf.sevenzipjbinding.SevenZipException -> L55
            if (r6 == 0) goto L36
            java.lang.String r6 = r4.m4000()     // Catch: java.lang.Throwable -> L53 net.sf.sevenzipjbinding.SevenZipException -> L55
            java.lang.String r5 = r8.mo7137()     // Catch: java.lang.Throwable -> L53 net.sf.sevenzipjbinding.SevenZipException -> L55
            l.C22523.m50501(r6, r5)     // Catch: java.lang.Throwable -> L53 net.sf.sevenzipjbinding.SevenZipException -> L55
        L36:
            boolean r6 = r4.m4003()     // Catch: java.lang.Throwable -> L53 net.sf.sevenzipjbinding.SevenZipException -> L55
            if (r6 == 0) goto L49
            java.lang.String r6 = r4.m4000()     // Catch: java.lang.Throwable -> L53 net.sf.sevenzipjbinding.SevenZipException -> L55
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L53 net.sf.sevenzipjbinding.SevenZipException -> L55
            if (r5 != 0) goto L49
            r8.mo7136(r6)     // Catch: java.lang.Throwable -> L53 net.sf.sevenzipjbinding.SevenZipException -> L55
        L49:
            r8.mo7140(r3)     // Catch: java.lang.Throwable -> L53 net.sf.sevenzipjbinding.SevenZipException -> L55
            r6 = r0[r1]
            boolean r7 = r6 instanceof java.io.Closeable
            if (r7 == 0) goto L7f
            goto L7a
        L53:
            r6 = move-exception
            goto Lba
        L55:
            r6 = move-exception
            boolean r5 = r4.mo4002()     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L82
            r6 = r0[r1]     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto L6e
            boolean r7 = r6 instanceof java.io.Closeable     // Catch: java.lang.Throwable -> L53
            if (r7 == 0) goto L69
            java.io.Closeable r6 = (java.io.Closeable) r6     // Catch: java.lang.Throwable -> L53
            l.C0349.m1793(r6)     // Catch: java.lang.Throwable -> L53
        L69:
            r0[r1] = r2     // Catch: java.lang.Throwable -> L53
            r8.mo7139()     // Catch: java.lang.Throwable -> L53
        L6e:
            r8.mo7140(r3)     // Catch: java.lang.Throwable -> L53
            r8.mo14154()     // Catch: java.lang.Throwable -> L80
            r6 = r0[r1]
            boolean r7 = r6 instanceof java.io.Closeable
            if (r7 == 0) goto L7f
        L7a:
            java.io.Closeable r6 = (java.io.Closeable) r6
            l.C0349.m1793(r6)
        L7f:
            return
        L80:
            r6 = move-exception
            goto Lbb
        L82:
            boolean r5 = r8.mo1526()     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L97
            r6 = r0[r1]
            boolean r7 = r6 instanceof java.io.Closeable
            if (r7 == 0) goto L93
            java.io.Closeable r6 = (java.io.Closeable) r6
            l.C0349.m1793(r6)
        L93:
            l.C0349.m1793(r3)
            return
        L97:
            java.io.IOException r5 = m42814(r6)     // Catch: java.lang.Throwable -> L53
            if (r5 != 0) goto Lb9
            boolean r5 = r8.mo7145()     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto Lb8
            boolean r5 = r4.m4003()     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto Lb7
            boolean r6 = r4.m3999()     // Catch: java.lang.Throwable -> L53
            if (r6 == 0) goto Lb2
            l.C22523.m50500()     // Catch: java.lang.Throwable -> L53
        Lb2:
            r4.m4001(r2)     // Catch: java.lang.Throwable -> L53
            goto L1f
        Lb7:
            throw r6     // Catch: java.lang.Throwable -> L53
        Lb8:
            throw r6     // Catch: java.lang.Throwable -> L53
        Lb9:
            throw r5     // Catch: java.lang.Throwable -> L53
        Lba:
            r2 = r3
        Lbb:
            r7 = r0[r1]
            boolean r8 = r7 instanceof java.io.Closeable
            if (r8 == 0) goto Lc6
            java.io.Closeable r7 = (java.io.Closeable) r7
            l.C0349.m1793(r7)
        Lc6:
            l.C0349.m1793(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18390.m42815(l.ۗܺ᩷, int[], l.ܰܳᩳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42817(InterfaceC13883 interfaceC13883) {
        ExtractOperationResult m39810;
        IInArchive mo7143 = interfaceC13883.mo7143();
        ArchiveFormat archiveFormat = mo7143.getArchiveFormat();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        AtomicBoolean atomicBoolean2 = new AtomicBoolean();
        AtomicReference atomicReference = new AtomicReference();
        C23056 c23056 = new C23056(interfaceC13883, atomicBoolean, atomicBoolean2, atomicReference);
        c23056.m4001(interfaceC13883.mo7144());
        c23056.m3998(new C10357(interfaceC13883));
        while (!interfaceC13883.mo1526()) {
            try {
                boolean z = true;
                try {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    atomicReference.set(null);
                    mo7143.extract(null, true, c23056);
                    if (!interfaceC13883.mo1526()) {
                        if (c23056.m4004()) {
                            C22523.m50501(c23056.m4000(), interfaceC13883.mo7137());
                        }
                        if (c23056.m4003()) {
                            String m4000 = c23056.m4000();
                            if (!TextUtils.isEmpty(m4000)) {
                                interfaceC13883.mo7136(m4000);
                            }
                        }
                        interfaceC13883.mo7140(mo7143);
                        return;
                    }
                    C0349.m1793(mo7143);
                    return;
                } catch (SevenZipException e) {
                    atomicBoolean.set(false);
                    atomicBoolean2.set(false);
                    if (c23056.mo4002()) {
                        interfaceC13883.mo7140(mo7143);
                        try {
                            interfaceC13883.mo14154();
                            return;
                        } catch (Throwable th) {
                            th = th;
                            mo7143 = null;
                            C0349.m1793(mo7143);
                            throw th;
                        }
                    }
                    if (!interfaceC13883.mo1526()) {
                        IOException m42814 = m42814(e);
                        if (m42814 != null) {
                            throw m42814;
                        }
                        C16978 c16978 = (C16978) atomicReference.getAndSet(null);
                        if (c16978 == null || ((m39810 = c16978.m39810()) != ExtractOperationResult.WRONG_PASSWORD && ((archiveFormat != ArchiveFormat.SEVEN_ZIP && archiveFormat != ArchiveFormat.RAR) || (m39810 != ExtractOperationResult.CRCERROR && m39810 != ExtractOperationResult.DATAERROR)))) {
                            z = false;
                        }
                        if (c23056.m4003() && c16978 != null && c16978.m39809() && z) {
                            if (c23056.m3999()) {
                                C22523.m50500();
                            }
                            c23056.m4001(null);
                        } else {
                            throw e;
                        }
                    } else {
                        C0349.m1793(mo7143);
                        return;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        C0349.m1793(mo7143);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static IOException m42814(SevenZipException sevenZipException) {
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
}

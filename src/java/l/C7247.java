package l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: O6S3 */
/* renamed from: l.۟ۙᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C7247 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 f22239;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13596 f22240;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22241;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final FileChannel f22242;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final FileLock f22243;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f22244;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22769 f22245;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public IOException f22246;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f22244) {
            return;
        }
        if (this.f22245 != null) {
            throw new IllegalStateException("Recovery generation candidate is still active");
        }
        this.f22244 = true;
        try {
            this.f22243.release();
        } finally {
            this.f22242.close();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C13596 m19381() {
        C13596 c13596;
        if (this.f22244) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        c13596 = this.f22240;
        if (c13596 == null) {
            throw new IllegalStateException("Recovery directory has no published generation");
        }
        return c13596;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22769 m19384(C1143 c1143, UUID uuid) {
        C22769 c22769;
        C13137 m9979;
        m19369();
        if (this.f22240 != null || this.f22245 != null) {
            throw new IllegalStateException("Migration entry already exists");
        }
        C13596 c13596 = new C13596(uuid, uuid, 1L, 0L);
        InterfaceC20758 m19382 = m19382(c13596);
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (C17229.exists(m19382, enumC14406)) {
            if (!C17229.isRegularFile(m19382, enumC14406)) {
                throw new IOException("Migration candidate is not a regular file");
            }
            m9979 = C3260.m9979(m19382);
            try {
                InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
                interfaceC23015.mo28633(m19382);
                interfaceC23015.mo28630(this.f22239);
                m9979.close();
            } finally {
            }
        }
        InterfaceC20758 resolve = this.f22239.resolve("entry.tmp");
        if (C17229.exists(resolve, enumC14406)) {
            InterfaceC23015 interfaceC230152 = InterfaceC23015.f74090;
            interfaceC230152.mo28633(resolve);
            interfaceC230152.mo28630(this.f22239);
        }
        InterfaceC20758 resolve2 = this.f22239.resolve("migration-state.bin");
        if (C17229.exists(resolve2, enumC14406)) {
            if (!C17229.isRegularFile(resolve2, enumC14406)) {
                throw new IOException("Migration state candidate is not a regular file");
            }
            m9979 = C3260.m9979(resolve2);
            try {
                InterfaceC23015 interfaceC230153 = InterfaceC23015.f74090;
                interfaceC230153.mo28633(resolve2);
                interfaceC230153.mo28630(this.f22239);
                m9979.close();
            } finally {
            }
        }
        c22769 = new C22769(this, C21605.m48786(m19382, c1143, uuid), c13596);
        this.f22245 = c22769;
        return c22769;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22769 m19385(C21605 c21605) {
        C22769 c22769;
        m19369();
        C13596 m19381 = m19381();
        if (this.f22245 != null) {
            throw new IllegalStateException("Recovery generation copy is already active");
        }
        if (m19381.f40549.equals(c21605.f69374)) {
            long j = m19381.f40547;
            long j2 = c21605.f69375;
            if (j == j2) {
                if (j2 == C13132.FOREVER_NS) {
                    throw new IOException("Recovery generation exhausted");
                }
                if (m19375(c21605.f69370) != 0) {
                    throw new IOException("Previous recovery generation is still in use or cannot be reclaimed", this.f22246);
                }
                C13596 c13596 = new C13596(c21605.f69374, UUID.randomUUID(), c21605.f69375 + 1, m19381.f40548);
                c22769 = new C22769(this, C21605.m48787(c21605, m19382(c13596)), c13596);
                this.f22245 = c22769;
            }
        }
        throw new IOException("Source does not match current recovery generation");
        return c22769;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m19387(C22769 c22769, long j) {
        m19391(c22769, j);
        m19389(c22769, j);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m19388(C1143 c1143) {
        if (this.f22244 || this.f22241 || this.f22245 != null) {
            return;
        }
        try {
            m19375(c1143);
        } catch (IOException e) {
            this.f22246 = e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m19389(C22769 c22769, long j) {
        boolean z;
        long j2;
        long j3;
        C13596 c13596;
        C13596 c135962;
        C13596 c135963;
        C13596 c135964;
        m19369();
        if (c22769 == this.f22245) {
            z = c22769.f73523;
            if (!z && j >= 0) {
                j2 = c22769.f73521;
                if (j2 == j) {
                    j3 = c22769.f73519;
                    if (j3 == c22769.f73520.m48808() && ((c13596 = this.f22240) == null || j >= c13596.f40548)) {
                        c135962 = c22769.f73524;
                        UUID uuid = c135962.f40549;
                        c135963 = c22769.f73524;
                        UUID uuid2 = c135963.f40546;
                        c135964 = c22769.f73524;
                        C13596 c135965 = new C13596(uuid, uuid2, c135964.f40547, j);
                        InterfaceC20758 resolve = this.f22239.resolve("entry.tmp");
                        if (C17229.exists(resolve, EnumC14406.NOFOLLOW_LINKS)) {
                            throw new IOException("Recovery temporary entry requires cleanup");
                        }
                        try {
                            InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
                            interfaceC23015.mo28632(resolve, m19373(c135965));
                            this.f22241 = true;
                            interfaceC23015.mo28631(resolve, this.f22239.resolve("current"));
                            interfaceC23015.mo28630(this.f22239);
                            this.f22240 = c135965;
                            c22769.f73524 = c135965;
                            this.f22241 = false;
                        } catch (IOException | Error | RuntimeException e) {
                            try {
                                if (C17229.exists(resolve, EnumC14406.NOFOLLOW_LINKS)) {
                                    InterfaceC23015.f74090.mo28633(resolve);
                                }
                            } catch (IOException e2) {
                                e.addSuppressed(e2);
                            }
                            throw e;
                        }
                    }
                }
            }
        }
        throw new IOException("Recovery candidate validation is missing or stale");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m19392() {
        if (this.f22244) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        return this.f22240 != null;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized C13596 m19394() {
        C13596 m19371;
        C13596 m19381 = m19381();
        m19371 = m19371(m19374(this.f22239.resolve("current")));
        if (!m19381.f40549.equals(m19371.f40549) || !m19381.f40546.equals(m19371.f40546) || m19381.f40547 != m19371.f40547 || m19381.f40548 != m19371.f40548) {
            throw new IOException("Published recovery entry changed outside its owner");
        }
        return m19371;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22769 m19383(C1143 c1143) {
        C22769 c22769;
        m19369();
        if (this.f22240 != null || this.f22245 != null) {
            throw new IllegalStateException("Recovery generation already exists");
        }
        UUID randomUUID = UUID.randomUUID();
        C21605 m48783 = C21605.m48783(InterfaceC23015.f74090.mo28628(this.f22239.resolve("generation-1-" + randomUUID + ".mt2"), true), c1143);
        c22769 = new C22769(this, m48783, new C13596(m48783.f69374, randomUUID, 1L, 0L));
        this.f22245 = c22769;
        return c22769;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7247 m19363(InterfaceC20758 interfaceC20758) {
        InterfaceC20758 absolutePath = interfaceC20758.toAbsolutePath();
        C17229.createDirectory(absolutePath, new InterfaceC22168[0]);
        InterfaceC20758 parent = absolutePath.getParent();
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        interfaceC23015.mo28630(parent);
        C7247 c7247 = new C7247(absolutePath, true);
        try {
            c7247.f22242.force(true);
            interfaceC23015.mo28630(absolutePath);
            return c7247;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c7247.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C7247 m19379(InterfaceC20758 interfaceC20758) {
        InterfaceC20758 absolutePath = interfaceC20758.toAbsolutePath();
        C7247 c7247 = new C7247(absolutePath, false);
        try {
            c7247.f22240 = m19371(m19374(absolutePath.resolve("current")));
            return c7247;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c7247.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m19372(InterfaceC20758 interfaceC20758) {
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        InterfaceC20758 absolutePath = interfaceC20758.toAbsolutePath();
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (C17229.exists(absolutePath, enumC14406)) {
            if (!C17229.isDirectory(absolutePath, enumC14406) || !C17229.isRegularFile(absolutePath.resolve("session.lock"), enumC14406)) {
                throw new IOException("Recovery deletion requires an owned directory");
            }
            InterfaceC20758 resolveSibling = absolutePath.resolveSibling(absolutePath.getFileName() + "-deleted-" + UUID.randomUUID());
            C7247 c7247 = new C7247(absolutePath, false);
            try {
                C17229.move(absolutePath, resolveSibling, EnumC2413.ATOMIC_MOVE);
                interfaceC23015.mo28630(absolutePath.getParent());
                c7247.close();
                InterfaceC17664 walk = C17229.walk(resolveSibling, new EnumC10880[0]);
                try {
                    Iterator it = walk.sorted(C8200.reverseOrder()).toList().iterator();
                    while (it.hasNext()) {
                        C17229.delete((InterfaceC20758) it.next());
                    }
                    walk.close();
                    interfaceC23015.mo28630(absolutePath.getParent());
                } catch (Throwable th) {
                    if (walk != null) {
                        try {
                            walk.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    c7247.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C7247 m19378(InterfaceC20758 interfaceC20758) {
        InterfaceC20758 absolutePath = interfaceC20758.toAbsolutePath();
        try {
            C17229.createDirectory(absolutePath, new InterfaceC22168[0]);
        } catch (FileAlreadyExistsException e) {
            if (!C17229.isDirectory(absolutePath, EnumC14406.NOFOLLOW_LINKS)) {
                throw new IOException("Migration path is not a directory", e);
            }
        }
        InterfaceC20758 parent = absolutePath.getParent();
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        interfaceC23015.mo28630(parent);
        InterfaceC20758 resolve = absolutePath.resolve("session.lock");
        if (!C17229.exists(resolve, EnumC14406.NOFOLLOW_LINKS)) {
            DirectoryStream newDirectoryStream = C17229.newDirectoryStream(absolutePath);
            try {
                if (newDirectoryStream.iterator().hasNext()) {
                    throw new IOException("Migration directory has no ownership lock");
                }
                newDirectoryStream.close();
                try {
                    C17229.createFile(resolve, new InterfaceC22168[0]);
                } catch (FileAlreadyExistsException unused) {
                }
            } catch (Throwable th) {
                if (newDirectoryStream != null) {
                    try {
                        newDirectoryStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (!C17229.isRegularFile(resolve, enumC14406)) {
            throw new IOException("Migration ownership lock is not a regular file");
        }
        C7247 c7247 = new C7247(absolutePath, false);
        try {
            c7247.f22242.force(true);
            interfaceC23015.mo28630(absolutePath);
            if (C17229.exists(absolutePath.resolve("current"), enumC14406)) {
                c7247.f22240 = m19371(m19374(absolutePath.resolve("current")));
            }
            return c7247;
        } catch (IOException | Error | RuntimeException e2) {
            try {
                c7247.close();
            } catch (IOException e3) {
                e2.addSuppressed(e3);
            }
            throw e2;
        }
    }

    public C7247(InterfaceC20758 interfaceC20758, boolean z) {
        this.f22239 = interfaceC20758;
        InterfaceC20758 resolve = interfaceC20758.resolve("session.lock");
        FileChannel open = z ? C12084.open(resolve, EnumC3824.CREATE_NEW, EnumC3824.READ, EnumC3824.WRITE) : C12084.open(resolve, EnumC3824.READ, EnumC3824.WRITE);
        this.f22242 = open;
        try {
            try {
                FileLock tryLock = open.tryLock();
                this.f22243 = tryLock;
                if (tryLock == null) {
                    throw new IOException("Recovery directory is already in use");
                }
            } catch (OverlappingFileLockException e) {
                throw new IOException("Recovery directory is already in use", e);
            }
        } catch (IOException e2) {
            e = e2;
            try {
                this.f22242.close();
            } catch (IOException e3) {
                e.addSuppressed(e3);
            }
            throw e;
        } catch (Error e4) {
            e = e4;
            this.f22242.close();
            throw e;
        } catch (RuntimeException e5) {
            e = e5;
            this.f22242.close();
            throw e;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m19393() {
        return this.f22241;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC20758 m19382(C13596 c13596) {
        return this.f22239.resolve("generation-" + c13596.f40547 + "-" + c13596.f40546 + ".mt2");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x005e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int m19375(l.C1143 r10) {
        /*
            r9 = this;
            l.᩺۬ᩳ r0 = l.InterfaceC23015.f74090
            r1 = 0
            r9.f22246 = r1
            l.᩷۠ᩴ r1 = r9.f22239
            java.nio.file.DirectoryStream r2 = l.C17229.newDirectoryStream(r1)
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L5b
            r4 = 0
            r5 = 0
        L11:
            boolean r6 = r3.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L57
            java.lang.Object r6 = r3.next()     // Catch: java.lang.Throwable -> L5b
            l.᩷۠ᩴ r6 = (l.InterfaceC20758) r6     // Catch: java.lang.Throwable -> L5b
            int r5 = r5 + 1
            r7 = 1024(0x400, float:1.435E-42)
            if (r5 > r7) goto L4f
            l.᩷۠ᩴ r7 = r6.getFileName()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r8 = "entry.tmp"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L3e
            r0.mo28633(r6)     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L5b
            r0.mo28630(r1)     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L5b
            goto L11
        L3a:
            r6 = move-exception
            r9.f22246 = r6     // Catch: java.lang.Throwable -> L5b
            goto L4c
        L3e:
            l.ܰۙᩳ r6 = r9.m19376(r6)     // Catch: java.lang.Throwable -> L5b
            if (r6 != 0) goto L45
            goto L11
        L45:
            r9.m19366(r6, r10)     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L5b
            goto L11
        L49:
            r6 = move-exception
            r9.f22246 = r6     // Catch: java.lang.Throwable -> L5b
        L4c:
            int r4 = r4 + 1
            goto L11
        L4f:
            java.io.IOException r10 = new java.io.IOException     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = "Recovery directory cleanup scan limit exceeded"
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            throw r10     // Catch: java.lang.Throwable -> L5b
        L57:
            r2.close()
            return r4
        L5b:
            r10 = move-exception
            if (r2 == 0) goto L66
            r2.close()     // Catch: java.lang.Throwable -> L62
            goto L66
        L62:
            r0 = move-exception
            r10.addSuppressed(r0)
        L66:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C7247.m19375(l.֨۬ᩳ):int");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C13596 m19376(InterfaceC20758 interfaceC20758) {
        int indexOf;
        if (!C17229.isRegularFile(interfaceC20758, EnumC14406.NOFOLLOW_LINKS)) {
            return null;
        }
        String interfaceC207582 = interfaceC20758.getFileName().toString();
        if (!interfaceC207582.startsWith("generation-") || (indexOf = interfaceC207582.indexOf(45, 11)) < 0 || !interfaceC207582.endsWith(".mt2")) {
            return null;
        }
        try {
            long parseLong = Long.parseLong(interfaceC207582.substring(11, indexOf));
            UUID fromString = UUID.fromString(interfaceC207582.substring(indexOf + 1, interfaceC207582.length() - 4));
            if (parseLong >= 1 && !fromString.equals(this.f22240.f40546)) {
                C13596 c13596 = new C13596(this.f22240.f40549, fromString, parseLong, 0L);
                if (m19382(c13596).equals(interfaceC20758)) {
                    return c13596;
                }
                return null;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19366(C13596 c13596, C1143 c1143) {
        InterfaceC23015 interfaceC23015 = InterfaceC23015.f74090;
        InterfaceC20758 m19382 = m19382(c13596);
        EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
        if (C17229.exists(m19382, enumC14406)) {
            if (!C17229.isRegularFile(m19382, enumC14406)) {
                throw new IOException("Recovery generation is not a regular file");
            }
            C21605 m48785 = C21605.m48785(m19382, c1143);
            try {
                if (!c13596.f40549.equals(m48785.f69374) || c13596.f40547 != m48785.f69375) {
                    throw new IOException("Obsolete recovery generation identity does not match");
                }
                interfaceC23015.mo28633(m19382);
                interfaceC23015.mo28630(this.f22239);
                m48785.close();
            } catch (Throwable th) {
                try {
                    m48785.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m19365(C7247 c7247, C13596 c13596, C21605 c21605, Throwable th) {
        C13596 c135962;
        synchronized (c7247) {
            if (!c7247.f22244 && !c7247.f22241 && ((c135962 = c7247.f22240) == null || !c135962.f40546.equals(c13596.f40546))) {
                if (th != null) {
                    c7247.f22246 = new IOException("Obsolete recovery generation failed to close", th);
                    return;
                }
                try {
                    c7247.m19366(c13596, c21605.f69370);
                } catch (IOException e) {
                    c7247.f22246 = e;
                }
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m19391(C22769 c22769, long j) {
        m19386(j, c22769, new RunnableC0709());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m19386(long j, C22769 c22769, Runnable runnable) {
        boolean z;
        C13596 c13596;
        C13596 c135962;
        C13596 c135963;
        C13596 c135964;
        m19369();
        if (c22769 == this.f22245) {
            z = c22769.f73523;
            if (!z && j >= 0 && ((c13596 = this.f22240) == null || j >= c13596.f40548)) {
                c135962 = c22769.f73524;
                UUID uuid = c135962.f40549;
                c135963 = c22769.f73524;
                UUID uuid2 = c135963.f40546;
                c135964 = c22769.f73524;
                C13596 c135965 = new C13596(uuid, uuid2, c135964.f40547, j);
                long m48808 = c22769.f73520.m48808();
                m19367(c135965, c22769.f73520.f69370, runnable);
                if (m48808 != c22769.f73520.m48808()) {
                    throw new IOException("Recovery candidate changed during validation");
                }
                c22769.f73521 = j;
                c22769.f73519 = m48808;
            }
        }
        throw new IllegalArgumentException("Invalid recovery generation publication");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19367(C13596 c13596, C1143 c1143, Runnable runnable) {
        C21605 m48793 = C21605.m48793(C3260.m9980(m19382(c13596)), c1143);
        try {
            C9323 m22371 = new C8617(m48793, runnable).m22371(C20612.f66331);
            try {
                long j = m22371.f28277;
                m19368(c13596, m48793, j);
                if (j != c13596.f40548 || m22371.f28285 != 0 || m22371.f28278 != null) {
                    throw new IOException("Recovery candidate is not an exact complete commit");
                }
                m22371.close();
                m48793.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                m48793.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m19390() {
        return C17229.getFileStore(this.f22239).getUsableSpace();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19368(C13596 c13596, C21605 c21605, long j) {
        if (!c13596.f40549.equals(c21605.f69374) || c13596.f40547 != c21605.f69375 || j < c13596.f40548) {
            throw new IOException("Recovery generation identity or acknowledged revision does not match entry");
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m19369() {
        if (this.f22244) {
            throw new IllegalStateException("Recovery directory is closed");
        }
        if (this.f22241) {
            throw new IOException("Recovery entry publication requires reopening");
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static byte[] m19374(InterfaceC20758 interfaceC20758) {
        FileChannel open = C12084.open(interfaceC20758, EnumC3824.READ);
        try {
            if (open.size() != 80) {
                throw new IOException("Invalid recovery entry length");
            }
            byte[] bArr = new byte[80];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            while (wrap.hasRemaining()) {
                if (open.read(wrap) <= 0) {
                    throw new IOException("Truncated recovery entry");
                }
            }
            if (open.size() != 80) {
                throw new IOException("Recovery entry changed during reading");
            }
            open.close();
            return bArr;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m19373(C13596 c13596) {
        C10130 c10130 = new C10130(80);
        c10130.writeInt(1162097229);
        c10130.writeInt(1);
        UUID uuid = c13596.f40549;
        c10130.m25431(uuid.getMostSignificantBits());
        c10130.m25431(uuid.getLeastSignificantBits());
        UUID uuid2 = c13596.f40546;
        c10130.m25431(uuid2.getMostSignificantBits());
        c10130.m25431(uuid2.getLeastSignificantBits());
        c10130.m25431(c13596.f40547);
        c10130.m25431(c13596.f40548);
        while (c10130.size() < 76) {
            c10130.writeByte(0);
        }
        c10130.writeInt(C1829.m6061(0, c10130.size(), c10130.m25438()));
        return c10130.m25444();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13596 m19371(byte[] bArr) {
        if (bArr.length != 80) {
            throw new IOException("Invalid recovery entry length");
        }
        C12951 c12951 = new C12951(bArr);
        if (c12951.readInt() != 1162097229 || c12951.readInt() != 1) {
            throw new IOException("Unsupported recovery entry");
        }
        UUID uuid = new UUID(c12951.readLong(), c12951.readLong());
        UUID uuid2 = new UUID(c12951.readLong(), c12951.readLong());
        long readLong = c12951.readLong();
        long readLong2 = c12951.readLong();
        if (readLong <= 0 || readLong2 < 0) {
            throw new IOException("Invalid recovery entry generation");
        }
        while (c12951.available() > 4) {
            if (c12951.readByte() != 0) {
                throw new IOException("Unsupported recovery entry fields");
            }
        }
        if (c12951.readInt() != C1829.m6061(0, 76, bArr)) {
            throw new IOException("Invalid recovery entry checksum");
        }
        return new C13596(uuid, uuid2, readLong, readLong2);
    }
}

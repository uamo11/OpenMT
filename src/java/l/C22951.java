package l;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: D70T */
/* renamed from: l.᩺ۧܳ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22951 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f73933;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final FileChannel f73934;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17471 f73936;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RandomAccessFile f73938;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f73939;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TreeMap f73937 = new TreeMap();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile boolean f73935 = true;

    public C22951(RandomAccessFile randomAccessFile, C17471 c17471) {
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        this.f73938 = randomAccessFile;
        convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
        this.f73934 = convertMaybeLegacyFileChannelFromLibrary;
        this.f73936 = c17471;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22951 m51063(File file) {
        C17471 c17471;
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        File createTempFile = File.createTempFile("hex-clipboard-arena-", ".tmp", file);
        RandomAccessFile randomAccessFile = null;
        try {
            C17471 m34938 = C14648.m34938();
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(createTempFile, "rw");
                try {
                    if (!createTempFile.delete()) {
                        throw new IOException("Could not unlink hex clipboard arena file");
                    }
                    return new C22951(randomAccessFile2, m34938);
                } catch (IOException | Error | RuntimeException e) {
                    e = e;
                    randomAccessFile = randomAccessFile2;
                    c17471 = m34938;
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e2) {
                            e.addSuppressed(e2);
                        }
                    }
                    if (c17471 != null) {
                        c17471.close();
                    }
                    if (!createTempFile.exists()) {
                        throw e;
                    }
                    if (!createTempFile.delete()) {
                        e.addSuppressed(new IOException("Could not delete hex clipboard arena file"));
                        throw e;
                    }
                    throw e;
                }
            } catch (IOException | Error | RuntimeException e3) {
                c17471 = m34938;
                e = e3;
            }
        } catch (IOException | Error | RuntimeException e4) {
            e = e4;
            c17471 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2491 m51070(int i) {
        Map.Entry entry;
        m51068();
        m51067();
        Iterator it = this.f73937.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                entry = null;
                break;
            }
            entry = (Map.Entry) it.next();
            if (((Long) entry.getValue()).longValue() >= i) {
                break;
            }
        }
        if (entry != null) {
            return m51062(entry, i);
        }
        long j = this.f73939;
        long j2 = i;
        long j3 = j + j2;
        if (!((j2 ^ j) < 0) && !((j ^ j3) >= 0)) {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                throw new IOException("Hex clipboard arena offset overflow", e);
            }
        }
        if (j3 > 2348810239L) {
            throw new IOException("Hex clipboard shared arena exceeds storage limit");
        }
        this.f73939 = j3;
        int i2 = this.f73933;
        if (i2 == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f73933 = i2 + 1;
        return new C2491(i, j, this);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2491 m51071(int i, long j) {
        m51068();
        m51067();
        for (Map.Entry entry : this.f73937.entrySet()) {
            if (((Long) entry.getKey()).longValue() >= j) {
                return null;
            }
            if (((Long) entry.getValue()).longValue() >= i) {
                return m51062(entry, i);
            }
        }
        return null;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51075(int i, long j) {
        m51068();
        if (!this.f73935) {
            return false;
        }
        for (Map.Entry entry : this.f73937.entrySet()) {
            if (((Long) entry.getKey()).longValue() >= j) {
                return false;
            }
            if (((Long) entry.getValue()).longValue() >= i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51073() {
        m51068();
        Iterator it = this.f73937.values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j = C1005.m3495(j, ((Long) it.next()).longValue());
            if (j > 33554432) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C2491 m51062(Map.Entry entry, int i) {
        Long l2 = (Long) entry.getKey();
        long longValue = l2.longValue();
        long longValue2 = ((Long) entry.getValue()).longValue();
        TreeMap treeMap = this.f73937;
        treeMap.remove(l2);
        long j = i;
        if (longValue2 > j) {
            treeMap.put(Long.valueOf(longValue + j), Long.valueOf(longValue2 - j));
        }
        int i2 = this.f73933;
        if (i2 == Integer.MAX_VALUE) {
            throw new ArithmeticException();
        }
        this.f73933 = i2 + 1;
        return new C2491(i, longValue, this);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m51076(int i, long j) {
        synchronized (C18177.f56530) {
            m51067();
            int i2 = this.f73933;
            if (i2 <= 0) {
                throw new IllegalStateException("Hex clipboard arena allocation underflow");
            }
            int i3 = i2 - 1;
            this.f73933 = i3;
            if (i3 == 0) {
                this.f73935 = false;
                this.f73937.clear();
                this.f73939 = 0L;
                if (C18177.f56534 == this) {
                    C18177.f56534 = null;
                }
                C17471 c17471 = this.f73936;
                try {
                    this.f73938.close();
                    return;
                } finally {
                    c17471.close();
                }
            }
            m51064(j, i);
            m51069();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51074(long j, byte[] bArr, int i, int i2) {
        m51067();
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        while (wrap.hasRemaining()) {
            int write = this.f73934.write(wrap, j);
            if (write == 0) {
                Thread.yield();
            } else {
                j += write;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51072(long j, byte[] bArr, int i, int i2) {
        m51067();
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i, i2);
        while (wrap.hasRemaining()) {
            int read = this.f73934.read(wrap, j);
            if (read < 0) {
                throw new EOFException("Unexpected end of hex clipboard arena");
            }
            if (read == 0) {
                Thread.yield();
            } else {
                j += read;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m51064(long r17, long r19) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22951.m51064(long, long):void");
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m51069() {
        TreeMap treeMap;
        long j = this.f73939;
        ArrayList arrayList = new ArrayList();
        while (true) {
            Long valueOf = Long.valueOf(1 + j);
            treeMap = this.f73937;
            Map.Entry lowerEntry = treeMap.lowerEntry(valueOf);
            if (lowerEntry == null) {
                break;
            }
            if (((Long) lowerEntry.getValue()).longValue() + ((Long) lowerEntry.getKey()).longValue() != j) {
                break;
            }
            arrayList.add((Long) lowerEntry.getKey());
            j = ((Long) lowerEntry.getKey()).longValue();
        }
        if (j == this.f73939) {
            return;
        }
        this.f73934.truncate(j);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            treeMap.remove((Long) it.next());
        }
        this.f73939 = j;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m51067() {
        if (!this.f73935) {
            throw new ClosedChannelException();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m51068() {
        if (!Thread.holdsLock(C18177.f56530)) {
            throw new IllegalStateException("Hex clipboard arena lock is not held");
        }
    }
}

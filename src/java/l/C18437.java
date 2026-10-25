package l;

import bin.mt.plus.R;
import com.github.luben.zstd.RecyclingBufferPool;
import com.github.luben.zstd.ZstdInputStreamNoFinalizer;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: M9Q4 */
/* renamed from: l.ᩴ֨᩻, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18437 implements InterfaceC0091 {

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final byte[] f57206 = new byte[524288];

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7889 f57207;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public HashMap f57208;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f57209 = new ArrayList();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f57210;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f57211;

    public C18437(InterfaceC7889 interfaceC7889) {
        this.f57207 = interfaceC7889;
        int readInt = interfaceC7889.readInt();
        if (readInt != 1430352451) {
            throw new IOException(String.format("Incorrect magic: %08x", Integer.valueOf(readInt)));
        }
        long reverseBytes = Long.reverseBytes(interfaceC7889.readLong());
        if (reverseBytes != 2) {
            throw new IOException(C16014.m37865(reverseBytes, "Unsupported payload version: "));
        }
        long reverseBytes2 = Long.reverseBytes(interfaceC7889.readLong());
        if (reverseBytes2 <= 0 || reverseBytes2 > 2147483647L) {
            throw new IOException(C16014.m37865(reverseBytes2, "Incorrect manifest length: "));
        }
        int reverseBytes3 = Integer.reverseBytes(interfaceC7889.readInt());
        if (reverseBytes3 <= 0) {
            throw new IOException(C19370.m44628(reverseBytes3, "Incorrect metadata signature length: "));
        }
        byte[] bArr = new byte[(int) reverseBytes2];
        interfaceC7889.readFully(bArr);
        C2416 parseFrom = C2416.parseFrom(bArr);
        this.f57210 = reverseBytes2 + 24 + reverseBytes3;
        int blockSize = parseFrom.getBlockSize();
        this.f57211 = blockSize;
        for (C8971 c8971 : parseFrom.getPartitionsList()) {
            if (c8971.hasPartitionName()) {
                long j = 0;
                for (C1915 c1915 : c8971.getOperationsList()) {
                    int i = C20554.f66230[c1915.getType().ordinal()];
                    if (i == 1 || i == 2 || i == 3 || i == 4) {
                        j = (c1915.getDstExtentsCount() == 1 && c1915.getDstExtents(0).getStartBlock() == j) ? j + c1915.getDstExtents(0).getNumBlocks() : j;
                    } else if (i == 5) {
                        for (C12293 c12293 : c1915.getDstExtentsList()) {
                            if (c12293.getStartBlock() == j) {
                                j += c12293.getNumBlocks();
                            }
                        }
                    }
                }
                this.f57209.add(new C13621(c8971, blockSize));
            }
            System.out.println("check failed: " + c8971.getPartitionName());
        }
        if (this.f57209.isEmpty() && parseFrom.getPartitionsCount() > 0) {
            throw new IOException(C4925.m14327(R.string.MT_Protector_res_0x7f120710));
        }
    }

    @Override // l.InterfaceC0091
    /* renamed from: ᩶ۧ */
    public final List mo1052() {
        return this.f57209;
    }

    @Override // l.InterfaceC0091
    public final C13621 getEntry(String str) {
        HashMap hashMap = this.f57208;
        if (hashMap == null) {
            ArrayList arrayList = this.f57209;
            hashMap = new HashMap(arrayList.size());
            this.f57208 = hashMap;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C13621 c13621 = (C13621) it.next();
                hashMap.put(c13621.m32740(), c13621);
            }
        }
        return (C13621) hashMap.get(str);
    }

    @Override // l.InterfaceC0091
    /* renamed from: ᩷ */
    public final C13621 mo1053(String str) {
        C13621 entry = getEntry(str);
        if (entry != null) {
            return entry;
        }
        throw new IOException(C20094.m46315("Entry not found: ", str));
    }

    @Override // l.InterfaceC0091
    /* renamed from: ֫ */
    public final C18030 mo1050(C13621 c13621) {
        return new C18030(new C23375(this, c13621.f40625.getOperationsList().iterator(), this.f57211, this.f57210));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m42915(C18437 c18437, InterfaceC8559 interfaceC8559, AtomicReference atomicReference, C1915 c1915, C23411 c23411, FileChannel fileChannel, C17025 c17025, C14202 c14202) {
        try {
            if (!interfaceC8559.mo17797() && atomicReference.get() == null) {
                c18437.m42911(c1915, c18437.f57207, c23411, fileChannel, interfaceC8559, (byte[]) c17025.get(), (byte[]) c14202.get());
            }
        } catch (IOException e) {
            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
            }
        } catch (Throwable th) {
            IOException iOException = new IOException(th);
            while (!atomicReference.compareAndSet(null, iOException) && atomicReference.get() == null) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r21v0, types: [l.ܳ֨᩻] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0, types: [l.ܿ֨᩻] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2 */
    @Override // l.InterfaceC0091
    /* renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo1051(l.C13621 r24, l.C23411 r25, final l.InterfaceC8559 r26) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18437.mo1051(l.ܰۚ᩻, l.᩻ۖܽ, l.ۡ֨᩻):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42916(C13621 c13621, final C23411 c23411, InterfaceC8559 interfaceC8559, int i) {
        ArrayList arrayList;
        int i2;
        boolean z;
        C6442 c6442;
        long j;
        int i3;
        if (i <= 0 || i > 16) {
            throw new IOException("Download thread count must be between 1 and 16");
        }
        c23411.setLength(0L);
        InterfaceC2245 mo21173 = c23411.mo21173();
        final FileChannel mo7436 = mo21173.mo7436();
        boolean z2 = mo7436 != null && mo21173.mo7441();
        int i4 = this.f57211;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        long j2 = 0;
        for (C1915 c1915 : c13621.f40625.getOperationsList()) {
            if (c1915.getType() == EnumC7354.ZERO) {
                arrayList3.add(c1915);
            } else {
                long dataLength = c1915.getDataLength();
                if (dataLength < 0 || j2 > C13132.FOREVER_NS - dataLength) {
                    throw new IOException("Payload operation data length overflow");
                }
                j2 += dataLength;
                arrayList2.add(c1915);
            }
        }
        C6083.sort(arrayList2, C8200.comparingLong(new C16319()));
        final AtomicReference atomicReference = new AtomicReference();
        final C9265 c9265 = new C9265();
        C6442 c64422 = new C6442(interfaceC8559, atomicReference);
        int min = Math.min(i, arrayList2.size());
        if (min > 0) {
            ThreadPoolExecutor m5988 = C1802.m5988(min);
            long j3 = j2;
            int i5 = 0;
            int i6 = 0;
            while (i5 < min) {
                ThreadPoolExecutor threadPoolExecutor = m5988;
                int i7 = min - i5;
                int i8 = min;
                if (i7 == 1) {
                    int size = arrayList2.size();
                    long j4 = 0;
                    for (int i9 = i6; i9 < size; i9++) {
                        j4 = ((C1915) arrayList2.get(i9)).getDataLength() + j4;
                    }
                    j = j4;
                    i3 = size;
                    c6442 = c64422;
                } else {
                    c6442 = c64422;
                    long j5 = i7;
                    long j6 = (j3 / j5) + (j3 % j5 == 0 ? 0 : 1);
                    int size2 = (arrayList2.size() - i7) + 1;
                    int i10 = i6;
                    j = 0;
                    while (i10 < size2 && (i10 == i6 || j < j6)) {
                        j = ((C1915) arrayList2.get(i10)).getDataLength() + j;
                        i10++;
                    }
                    i3 = i10;
                }
                final int i11 = i6;
                final ArrayList arrayList4 = arrayList2;
                final int i12 = i3;
                ArrayList arrayList5 = arrayList2;
                final C6442 c64423 = c6442;
                threadPoolExecutor.submit(new Runnable() { // from class: l.ᩳ֨᩻
                    @Override // java.lang.Runnable
                    public final void run() {
                        C18437.m42914(C18437.this, arrayList4, i11, i12, c23411, mo7436, c64423, atomicReference, c9265);
                    }
                });
                j3 -= j;
                i5++;
                c64422 = c6442;
                m5988 = threadPoolExecutor;
                min = i8;
                i6 = i3;
                z2 = z2;
                arrayList3 = arrayList3;
                arrayList2 = arrayList5;
                i4 = i4;
            }
            ThreadPoolExecutor threadPoolExecutor2 = m5988;
            C6442 c64424 = c64422;
            arrayList = arrayList3;
            i2 = i4;
            z = z2;
            threadPoolExecutor2.shutdown();
            while (!threadPoolExecutor2.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
                try {
                    if (c64424.mo17797()) {
                        c9265.m23786();
                        threadPoolExecutor2.shutdownNow();
                    }
                } catch (InterruptedException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("Payload extraction was interrupted");
                    interruptedIOException.initCause(e);
                    while (!atomicReference.compareAndSet(null, interruptedIOException) && atomicReference.get() == null) {
                    }
                    c9265.m23786();
                    threadPoolExecutor2.shutdownNow();
                    while (!threadPoolExecutor2.isTerminated()) {
                        try {
                            threadPoolExecutor2.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                        }
                    }
                    Thread.currentThread().interrupt();
                    throw interruptedIOException;
                }
            }
        } else {
            arrayList = arrayList3;
            i2 = i4;
            z = z2;
        }
        if (interfaceC8559.mo17797()) {
            return;
        }
        IOException iOException = (IOException) atomicReference.get();
        if (iOException != null) {
            throw iOException;
        }
        try {
            m42913(c13621, c23411, interfaceC8559, mo7436, z, arrayList, i2);
        } catch (IOException e2) {
            throw e2;
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00e8: INVOKE (r2v0 ?? I:l.ۢ֨᩻), (r13 I:l.۠ۖܽ) VIRTUAL call: l.ۢ֨᩻.ۧ(l.۠ۖܽ):void A[MD:(l.۠ۖܽ):void (m)] (LINE:579), block:B:113:0x00e8 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00eb: IF  (r13 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:131:?, block:B:114:0x00eb */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42914(C18437 c18437, ArrayList arrayList, int i, int i2, C23411 c23411, FileChannel fileChannel, InterfaceC8559 interfaceC8559, AtomicReference atomicReference, C9265 c9265) {
        C23411 c234112;
        C23411 c234113;
        InterfaceC7889 m23788;
        try {
            try {
                c234112 = c18437.f57207.mo21174();
            } catch (Throwable th) {
                if (0 != 0) {
                    c9265.m23788(m23788);
                }
                if (c234113 == null) {
                    throw th;
                }
                try {
                    c234113.close();
                    throw th;
                } catch (IOException e) {
                    while (!atomicReference.compareAndSet(null, e)) {
                        if (atomicReference.get() != null) {
                            throw th;
                        }
                    }
                    c9265.m23786();
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            c234112 = null;
        } catch (Throwable th2) {
            th = th2;
            c234112 = null;
        }
        try {
            boolean m23787 = c9265.m23787(c234112);
            if (m23787) {
                byte[] bArr = new byte[WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT];
                byte[] bArr2 = new byte[524288];
                int i3 = i;
                while (i3 < i2) {
                    if (((C6442) interfaceC8559).mo17797()) {
                        break;
                    }
                    int i4 = i3;
                    c18437.m42911((C1915) arrayList.get(i3), c234112, c23411, fileChannel, interfaceC8559, bArr, bArr2);
                    i3 = i4 + 1;
                }
                if (m23787) {
                    c9265.m23788(c234112);
                }
                try {
                    c234112.close();
                    return;
                } catch (IOException e3) {
                    while (!atomicReference.compareAndSet(null, e3)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                }
            } else {
                if (m23787) {
                    c9265.m23788(c234112);
                }
                try {
                    c234112.close();
                    return;
                } catch (IOException e4) {
                    while (!atomicReference.compareAndSet(null, e4)) {
                        if (atomicReference.get() != null) {
                            return;
                        }
                    }
                }
            }
        } catch (IOException e5) {
            e = e5;
            while (true) {
                if (atomicReference.compareAndSet(null, e)) {
                    c9265.m23786();
                    break;
                } else if (atomicReference.get() != null) {
                    break;
                }
            }
            if (0 != 0) {
                c9265.m23788(c234112);
            }
            if (c234112 == null) {
                return;
            }
            try {
                c234112.close();
                return;
            } catch (IOException e6) {
                while (!atomicReference.compareAndSet(null, e6)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            IOException iOException = new IOException(th);
            while (true) {
                if (atomicReference.compareAndSet(null, iOException)) {
                    c9265.m23786();
                    break;
                } else if (atomicReference.get() != null) {
                    break;
                }
            }
            if (0 != 0) {
                c9265.m23788(c234112);
            }
            if (c234112 == null) {
                return;
            }
            try {
                c234112.close();
                return;
            } catch (IOException e7) {
                while (!atomicReference.compareAndSet(null, e7)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
            }
        }
        c9265.m23786();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m42911(C1915 c1915, InterfaceC7889 interfaceC7889, C23411 c23411, FileChannel fileChannel, InterfaceC8559 interfaceC8559, byte[] bArr, byte[] bArr2) {
        OutputStream c15613;
        long dataLength = c1915.getDataLength();
        long dataOffset = c1915.getDataOffset() + this.f57210;
        long startBlock = c1915.getDstExtents(0).getStartBlock();
        long j = this.f57211;
        long j2 = startBlock * j;
        InputStream c2209 = new C2209(interfaceC7889, dataOffset, dataLength);
        int i = C20554.f66230[c1915.getType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                c2209 = new C9453(new C18867(c2209, bArr));
            } else if (i == 3) {
                c2209 = C1096.m3765(new C18867(c2209, bArr));
            } else if (i == 4) {
                c2209 = new ZstdInputStreamNoFinalizer(c2209, RecyclingBufferPool.INSTANCE);
            } else {
                throw new IOException("Unsupported operation type: " + c1915.getType().getNumber());
            }
        }
        try {
            long numBlocks = c1915.getDstExtents(0).getNumBlocks() * j;
            if (fileChannel == null) {
                c15613 = new C3620(j2, c23411);
            } else {
                c15613 = new C15613(fileChannel, j2);
            }
            m42910(c2209, c15613, interfaceC8559, bArr2, numBlocks);
            c2209.close();
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42913(C13621 c13621, C23411 c23411, InterfaceC8559 interfaceC8559, FileChannel fileChannel, boolean z, ArrayList arrayList, int i) {
        if (z) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C1915) it.next()).getDstExtentsList().iterator();
                while (it2.hasNext()) {
                    long numBlocks = ((C12293) it2.next()).getNumBlocks() * i;
                    while (numBlocks > 0) {
                        int min = (int) Math.min(numBlocks, 524288);
                        synchronized (interfaceC8559) {
                            interfaceC8559.mo17795(min);
                        }
                        numBlocks -= min;
                        if (interfaceC8559.mo17797()) {
                            break;
                        }
                    }
                }
                if (interfaceC8559.mo17797()) {
                    return;
                }
            }
            if (fileChannel.size() > c13621.m32741()) {
                throw new IOException("Extracted data exceeds entry size");
            }
            c23411.setLength(c13621.m32741());
            return;
        }
        if (fileChannel != null) {
            c23411.setLength(fileChannel.size());
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m42912((C1915) it3.next(), c23411, interfaceC8559, i);
            if (interfaceC8559.mo17797()) {
                return;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42910(InputStream inputStream, OutputStream outputStream, InterfaceC8559 interfaceC8559, byte[] bArr, long j) {
        long j2 = 0;
        do {
            int read = inputStream.read(bArr);
            if (read == -1) {
                if (j2 == j) {
                    return;
                }
                StringBuilder m31106 = C12803.m31106("Operation size mismatch: expected ", ", actual ", j);
                m31106.append(j2);
                throw new IOException(m31106.toString());
            }
            long j3 = read;
            if (j3 > j - j2) {
                throw new IOException("Operation data exceeds destination extent");
            }
            synchronized (interfaceC8559) {
                interfaceC8559.mo17795(read);
            }
            outputStream.write(bArr, 0, read);
            j2 += j3;
        } while (!interfaceC8559.mo17797());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42912(C1915 c1915, C23411 c23411, InterfaceC8559 interfaceC8559, int i) {
        for (C12293 c12293 : c1915.getDstExtentsList()) {
            long j = i;
            long numBlocks = c12293.getNumBlocks() * j;
            synchronized (c23411) {
                c23411.seek(c12293.getStartBlock() * j);
                while (numBlocks > 0) {
                    byte[] bArr = f57206;
                    int min = (int) Math.min(numBlocks, 524288);
                    synchronized (interfaceC8559) {
                        interfaceC8559.mo17795(min);
                    }
                    c23411.write(bArr, 0, min);
                    numBlocks -= min;
                    if (interfaceC8559.mo17797()) {
                        return;
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f57207.close();
    }
}

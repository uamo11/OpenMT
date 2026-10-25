package l;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import bin.mt.plus.Features3;
import com.alipay.sdk.m.w.a;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: N17O */
/* renamed from: l.᩵᩶ܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19697 implements Closeable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final DataInputStream f63628;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f63629;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final DataOutputStream f63630;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4921 f63632;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile long f63634;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f63635;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f63637;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile boolean f63638;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f63633 = new ReentrantLock();

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f63631 = new AtomicBoolean(true);

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AtomicBoolean f63639 = new AtomicBoolean(false);

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f63636 = new AtomicInteger(0);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45311(C19697 c19697, String str) {
        c19697.getClass();
        byte[] m45320 = m45320(str);
        c19697.m45306((byte) 41);
        c19697.m45337(m45320);
        c19697.f63630.flush();
        c19697.m45323(60, "Remove empty directory failed");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45316(C19697 c19697, String str, String str2, boolean z, IntConsumer intConsumer) {
        c19697.getClass();
        byte[] m45340 = m45340(str, "Path");
        byte[] m45320 = m45320(str2);
        c19697.m45306((byte) 34);
        c19697.m45337(m45340);
        c19697.m45337(m45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        boolean z2 = false;
        while (true) {
            int m45323 = c19697.m45323(60, "Copy failed");
            if (m45323 <= 0) {
                return;
            }
            if (intConsumer != null) {
                try {
                    intConsumer.accept(m45323);
                } catch (CancellationException unused) {
                    if (!z2) {
                        c19697.m45306((byte) 118);
                        dataOutputStream.flush();
                        z2 = true;
                    }
                } catch (Throwable th) {
                    if (!z2) {
                        try {
                            c19697.m45306((byte) 118);
                            dataOutputStream.flush();
                        } catch (IOException e) {
                            th.addSuppressed(e);
                        }
                    }
                    c19697.f63631.set(false);
                    c19697.m45344();
                    throw th;
                }
            }
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static long m45322(C19697 c19697, String str) {
        c19697.getClass();
        byte[] m45340 = m45340(str, "Path");
        c19697.m45306((byte) 38);
        c19697.m45337(m45340);
        c19697.f63630.flush();
        c19697.m45323(5, "get file actual size failed");
        return c19697.m45347();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m45329(C19697 c19697, String str, String str2) {
        c19697.getClass();
        byte[] m45340 = m45340(str, "Path");
        byte[] m45320 = m45320(str2);
        c19697.m45306((byte) 23);
        c19697.m45337(m45340);
        c19697.m45337(m45320);
        c19697.f63630.flush();
        c19697.m45323(5, "Symlink failed");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45330(C19697 c19697, String str, boolean z) {
        c19697.getClass();
        byte[] m45320 = m45320(str);
        c19697.m45306(ColorResourcesTableCreator.ResEntry.DATA_TYPE_AARRGGBB);
        c19697.m45337(m45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        c19697.m45323(5, "Mkdir failed");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45331(C19697 c19697, String str) {
        c19697.getClass();
        byte[] m45320 = m45320(str);
        c19697.m45306((byte) 40);
        c19697.m45337(m45320);
        c19697.f63630.flush();
        c19697.m45323(60, "Unlink file or link failed");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m45334(C19697 c19697, String str) {
        c19697.getClass();
        byte[] m45340 = m45340(str, "Path");
        c19697.m45306((byte) 24);
        c19697.m45337(m45340);
        c19697.f63630.flush();
        c19697.m45323(5, "realPath failed");
        return c19697.m45345();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45336(C19697 c19697, String str, String str2) {
        c19697.getClass();
        byte[] m45320 = m45320(str);
        byte[] m453202 = m45320(str2);
        c19697.m45306((byte) 29);
        c19697.m45337(m45320);
        c19697.m45337(m453202);
        c19697.f63630.flush();
        c19697.m45323(60, "Move failed");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static Boolean m45349(C19697 c19697, String str) {
        c19697.getClass();
        byte[] m45340 = m45340(str, "Path");
        c19697.m45306((byte) 25);
        c19697.m45337(m45340);
        c19697.f63630.flush();
        c19697.m45323(5, "Check exists failed");
        try {
            return Boolean.valueOf(c19697.f63628.readByte() != 0);
        } catch (IOException e) {
            c19697.m45307(e);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45317(C19697 c19697, byte[] bArr) {
        C4879.m14234("Path", bArr);
        c19697.m45306((byte) 30);
        c19697.m45337(bArr);
        c19697.f63630.flush();
        c19697.m45323(60, "Remove failed");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m45318(C19697 c19697, byte[] bArr, byte[] bArr2) {
        C4879.m14234("Path", bArr);
        C4879.m14234("Path", bArr2);
        c19697.m45306((byte) 29);
        c19697.m45337(bArr);
        c19697.m45337(bArr2);
        c19697.f63630.flush();
        c19697.m45323(60, "Move failed");
    }

    public C19697(InterfaceC4921 interfaceC4921, boolean z) {
        byte[] bArr;
        this.f63632 = interfaceC4921;
        this.f63629 = z;
        DataInputStream dataInputStream = new DataInputStream(new C4174(this, interfaceC4921.getInputStream()));
        this.f63628 = dataInputStream;
        this.f63630 = new DataOutputStream(new C18991(this, new BufferedOutputStream(interfaceC4921.getOutputStream(), interfaceC4921.getSendBufferSize())));
        byte[] bArr2 = new byte[4];
        try {
            dataInputStream.readFully(bArr2, 0, 4);
            bArr = C22518.f72868;
            if (!Arrays.equals(bArr2, bArr)) {
                throw new IOException("Magic error");
            }
            this.f63637 = m45332();
            this.f63635 = m45332();
        } catch (IOException e) {
            m45307(e);
            throw e;
        }
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m45389() {
        this.f63634 = 0L;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45381() {
        String.format("[%08x]", Integer.valueOf(hashCode()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m45307(IOException iOException) {
        m45381();
        this.f63631.set(false);
        m45344();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private IOException m45343(String str) {
        IOException iOException = new IOException(str);
        m45381();
        this.f63631.set(false);
        m45344();
        return iOException;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m45344() {
        if (this.f63639.compareAndSet(false, true)) {
            this.f63631.set(false);
            C0349.m1793(this.f63632);
        }
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m45348() {
        try {
            int read = this.f63628.read();
            if (read >= 0) {
                return read;
            }
            EOFException eOFException = new EOFException("Connection closed");
            m45307(eOFException);
            throw eOFException;
        } catch (IOException e) {
            m45307(e);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m45298(C19697 c19697) {
        try {
            return c19697.f63628.readByte();
        } catch (IOException e) {
            c19697.m45307(e);
            throw e;
        }
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    private int m45332() {
        try {
            return this.f63628.readInt();
        } catch (IOException e) {
            m45307(e);
            throw e;
        }
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private long m45347() {
        try {
            return this.f63628.readLong();
        } catch (IOException e) {
            m45307(e);
            throw e;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InputStream m45390(String str) {
        String str2 = "r";
        ParcelFileDescriptor m45372 = m45372(str, "r");
        if (m45372 != null) {
            return new ParcelFileDescriptor.AutoCloseInputStream(m45372);
        }
        return new BufferedInputStream(new C1351((C5585) m45303((InterfaceC7059) new C21876(this, str, str2), true)), this.f63637);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final OutputStream m45380(String str, boolean z) {
        String m50489 = C22518.m50489(str);
        ParcelFileDescriptor m45372 = m45372(m50489, z ? am.av : "w");
        if (m45372 != null) {
            return new ParcelFileDescriptor.AutoCloseOutputStream(m45372);
        }
        return new BufferedOutputStream(new C8407((C5585) m45303((InterfaceC7059) new C21876(this, m50489, z ? am.av : "w"), true)), this.f63637);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2245 m45388(String str, String str2) {
        if (C22518.m50485(str2)) {
            str = C22518.m50489(str);
        }
        ParcelFileDescriptor m45372 = m45372(str, str2);
        if (m45372 != null) {
            return new C21813(m45372, str, str2, this.f63629);
        }
        return new C15461((C5585) m45303((InterfaceC7059) new C21876(this, str, str2), true), str, str2);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m45378() {
        return this.f63633.isLocked() || this.f63636.get() > 0;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ParcelFileDescriptor m45372(final String str, final String str2) {
        Set set;
        InterfaceC4921 interfaceC4921 = this.f63632;
        if (!interfaceC4921.mo14297()) {
            return null;
        }
        final String substring = str.substring(0, str.lastIndexOf(47) + 1);
        set = C22518.f72870;
        if (set.contains(substring)) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (str.startsWith("/storage/emulated/999/Android/")) {
                String substring2 = str.substring(30);
                if (substring2.startsWith("data/") || substring2.startsWith("obb/")) {
                    return null;
                }
            }
            if (str.startsWith("/mnt/user/999/self/primary/Android/")) {
                String substring3 = str.substring(35);
                if (substring3.startsWith("data/") || substring3.startsWith("obb/")) {
                    return null;
                }
            }
        }
        final int mo14299 = interfaceC4921.mo14299();
        if (mo14299 < 0) {
            return null;
        }
        return (ParcelFileDescriptor) m45303(new InterfaceC7059() { // from class: l.ۙ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45302(C19697.this, str, str2, mo14299, substring);
            }
        }, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ParcelFileDescriptor m45302(final C19697 c19697, String str, String str2, final int i, String str3) {
        Set set;
        byte m50487 = C22518.m50487(str2);
        byte[] m45340 = m45340(str, "Path");
        c19697.m45306((byte) 10);
        c19697.m45337(m45340);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeByte(m50487);
        dataOutputStream.flush();
        AtomicBoolean atomicBoolean = c19697.f63631;
        Future submit = C1802.f6208.submit(new Callable() { // from class: l.ܽ᩶ܿ
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C19697.m45333(C19697.this, i);
            }
        });
        for (int i2 = 0; i2 < 10; i2++) {
            try {
                long longValue = ((Long) submit.get(500L, TimeUnit.MILLISECONDS)).longValue();
                byte b = (byte) ((longValue >>> 32) & 255);
                if (b == -1) {
                    String m45345 = c19697.m45345();
                    if (m45345.isEmpty()) {
                        m45345 = "Open fd failed";
                    }
                    throw new IOException(m45345);
                }
                if (b != 0) {
                    throw c19697.m45343(C19370.m44628(b, "Unknown open fd result code: "));
                }
                int i3 = (int) longValue;
                if (i3 >= 0) {
                    return ParcelFileDescriptor.adoptFd(i3);
                }
                set = C22518.f72870;
                set.add(str3);
                return null;
            } catch (InterruptedException e) {
                atomicBoolean.set(false);
                c19697.m45344();
                throw new IOException(e);
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(cause);
            } catch (TimeoutException unused) {
            }
        }
        atomicBoolean.set(false);
        c19697.m45344();
        submit.cancel(true);
        throw new C19401("Open fd failed, timeout after 5 seconds");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C5585 m45305(C19697 c19697, String str, String str2) {
        byte m50487 = C22518.m50487(str2);
        byte[] m45340 = m45340(str, "Path");
        c19697.m45306((byte) 11);
        c19697.m45337(m45340);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeByte(m50487);
        dataOutputStream.flush();
        c19697.m45323(5, "Open failed");
        try {
            C5585 c5585 = new C5585(c19697, c19697.f63628.readUnsignedShort());
            c19697.f63636.incrementAndGet();
            return c5585;
        } catch (IOException e) {
            c19697.m45307(e);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m45299(C19697 c19697, int i, int i2, int i3, byte[] bArr) {
        DataOutputStream dataOutputStream = c19697.f63630;
        if (i2 < 0 || i3 < 0 || i3 > bArr.length || i2 > bArr.length - i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        int min = Math.min(i2, c19697.f63637);
        c19697.m45306((byte) 12);
        dataOutputStream.writeShort(i);
        dataOutputStream.writeInt(min);
        dataOutputStream.flush();
        c19697.m45323(8, "Read failed");
        int m45332 = c19697.m45332();
        if (m45332 < 0 || m45332 > min || m45332 > bArr.length - i3) {
            throw c19697.m45343(C19370.m44628(m45332, "Invalid read size: "));
        }
        try {
            c19697.f63628.readFully(bArr, i3, m45332);
            if (m45332 == 0) {
                return -1;
            }
            return m45332;
        } catch (IOException e) {
            c19697.m45307(e);
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45374(final int i, final byte[] bArr, final int i2, final int i3) {
        m45308(new InterfaceC14819() { // from class: l.᩺᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45327(C19697.this, i, i3, i2, bArr);
            }
        }, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45327(C19697 c19697, int i, int i2, int i3, byte[] bArr) {
        DataOutputStream dataOutputStream = c19697.f63630;
        if (i2 < 0 || i3 < 0 || i3 > bArr.length || i2 > bArr.length - i3) {
            throw new ArrayIndexOutOfBoundsException();
        }
        c19697.m45306(cb.k);
        dataOutputStream.writeShort(i);
        dataOutputStream.writeInt(i2);
        dataOutputStream.write(bArr, i3, i2);
        dataOutputStream.flush();
        c19697.m45323(8, "Write failed");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45382(final int i) {
        m45308(new InterfaceC14819() { // from class: l.ۧ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45342(C19697.this, i);
            }
        }, false);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45342(C19697 c19697, int i) {
        c19697.m45306(cb.f77931l);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c19697.m45323(8, "Sync failed");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45352(final int i) {
        m45308(new InterfaceC14819() { // from class: l.֫᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45326(C19697.this, i);
            }
        }, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45326(C19697 c19697, int i) {
        AtomicInteger atomicInteger = c19697.f63636;
        DataOutputStream dataOutputStream = c19697.f63630;
        try {
            try {
                c19697.m45306((byte) 15);
                dataOutputStream.writeShort(i);
                dataOutputStream.flush();
                c19697.m45323(8, "Close failed");
            } catch (IOException e) {
                c19697.f63631.set(false);
                c19697.m45344();
                throw e;
            }
        } finally {
            atomicInteger.decrementAndGet();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m45386(final int i) {
        return m45301(new InterfaceC23992() { // from class: l.ܿ᩶ܿ
            @Override // l.InterfaceC23992
            public final long call() {
                return C19697.m45338(C19697.this, i);
            }
        });
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ long m45338(C19697 c19697, int i) {
        c19697.m45306((byte) 16);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c19697.m45323(5, "Tell failed");
        return c19697.m45347();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45353(final int i, final long j) {
        m45308(new InterfaceC14819() { // from class: l.ܰ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45328(C19697.this, i, j);
            }
        }, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45328(C19697 c19697, int i, long j) {
        c19697.m45306((byte) 17);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c19697.m45323(5, "Seek failed");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m45370(final int i) {
        return m45301(new InterfaceC23992() { // from class: l.ۤ᩹ܿ
            @Override // l.InterfaceC23992
            public final long call() {
                return C19697.m45300(C19697.this, i);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ long m45300(C19697 c19697, int i) {
        c19697.m45306((byte) 18);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.flush();
        c19697.m45323(5, "Length failed");
        return c19697.m45347();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45373(final int i, final long j) {
        m45308(new InterfaceC14819() { // from class: l.ۛ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45309(C19697.this, i, j);
            }
        }, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45309(C19697 c19697, int i, long j) {
        c19697.m45306((byte) 19);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c19697.m45323(5, "Truncate failed");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final List m45350(final String str, final boolean z) {
        return (List) m45303(new InterfaceC7059() { // from class: l.ۚ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45304(C19697.this, str, z);
            }
        }, true);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final List m45387(final String str) {
        return (List) m45303(new InterfaceC7059() { // from class: l.ۗ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45339(C19697.this, str);
            }
        }, true);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final List m45384(final String str) {
        return (List) m45303(new InterfaceC7059() { // from class: l.ܳ᩶ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45324(C19697.this, str);
            }
        }, true);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List m45377(final String str) {
        return (List) m45303(new InterfaceC7059() { // from class: l.ۘ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45346(C19697.this, str);
            }
        }, true);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C17642 m45366(final String str) {
        return (C17642) m45303(new InterfaceC7059() { // from class: l.ܺ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45341(C19697.this, str);
            }
        }, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m45371(final String str) {
        return m45301(new InterfaceC23992() { // from class: l.᩶᩹ܿ
            @Override // l.InterfaceC23992
            public final long call() {
                return C19697.m45322(C19697.this, str);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45357(final String str, final String str2) {
        m45308(new InterfaceC14819() { // from class: l.ᩳ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45329(C19697.this, str, str2);
            }
        }, false);
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final String m45369(final String str) {
        return (String) m45303(new InterfaceC7059() { // from class: l.ۖ᩶ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45334(C19697.this, str);
            }
        }, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m45361(final String str) {
        return ((Boolean) m45303(new InterfaceC7059() { // from class: l.᩷᩶ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45349(C19697.this, str);
            }
        }, true)).booleanValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] m45362(final String str, final ArrayList arrayList) {
        if (arrayList.size() > 65535) {
            throw new IOException("Too many names");
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        return (boolean[]) m45303(new InterfaceC7059() { // from class: l.ᩴ᩹ܿ
            @Override // l.InterfaceC7059
            public final Object call() {
                return C19697.m45319(C19697.this, str, arrayList);
            }
        }, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean[] m45319(C19697 c19697, String str, ArrayList arrayList) {
        DataOutputStream dataOutputStream = c19697.f63630;
        byte[] m45340 = m45340(str, "Base path");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte[] m453402 = m45340((String) it.next(), "Name");
            if (m45340.length + m453402.length + 1 > 4097) {
                throw new IOException("Combined path too long");
            }
            arrayList2.add(m453402);
        }
        c19697.m45306((byte) 36);
        c19697.m45337(m45340);
        dataOutputStream.writeShort(arrayList.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c19697.m45337((byte[]) it2.next());
        }
        dataOutputStream.flush();
        c19697.m45323(5, "Check batch exists failed");
        int size = arrayList.size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            try {
                zArr[i] = c19697.f63628.readByte() != 0;
            } catch (IOException e) {
                c19697.m45307(e);
                throw e;
            }
        }
        return zArr;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45356(final String str, final int i, final boolean z, final boolean z2) {
        m45308(new InterfaceC14819() { // from class: l.ۨ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45314(C19697.this, str, i, z, z2);
            }
        }, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45314(C19697 c19697, String str, int i, boolean z, boolean z2) {
        byte[] m45320 = m45320(str);
        c19697.m45306((byte) 26);
        c19697.m45337(m45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeShort(i);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.flush();
        c19697.m45323(5, "Chmod failed");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45355(final String str, final int i, final int i2, final boolean z, final boolean z2) {
        m45308(new InterfaceC14819() { // from class: l.ۖ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45313(C19697.this, str, i, i2, z, z2);
            }
        }, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45313(C19697 c19697, String str, int i, int i2, boolean z, boolean z2) {
        byte[] m45320 = m45320(str);
        c19697.m45306((byte) 27);
        c19697.m45337(m45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeInt(i);
        dataOutputStream.writeInt(i2);
        dataOutputStream.writeBoolean(z);
        dataOutputStream.writeBoolean(z2);
        dataOutputStream.flush();
        c19697.m45323(5, "Chown failed");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45375(final String str, final boolean z) {
        m45308(new InterfaceC14819() { // from class: l.֡᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45330(C19697.this, str, z);
            }
        }, false);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m45383(final String str, final String str2) {
        m45308(new InterfaceC14819() { // from class: l.ܺ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45336(C19697.this, str, str2);
            }
        }, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45360(final byte[] bArr, final byte[] bArr2) {
        m45308(new InterfaceC14819() { // from class: l.ۢ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45318(C19697.this, bArr, bArr2);
            }
        }, false);
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m45368(final String str) {
        m45308(new InterfaceC14819() { // from class: l.ۡ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45321(C19697.this, str);
            }
        }, false);
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45321(C19697 c19697, String str) {
        byte[] m45320 = m45320(str);
        c19697.m45306((byte) 30);
        c19697.m45337(m45320);
        c19697.f63630.flush();
        c19697.m45323(60, "Remove failed");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m45376(final byte[] bArr) {
        m45308(new InterfaceC14819() { // from class: l.۠᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45317(C19697.this, bArr);
            }
        }, false);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m45363(final String str) {
        m45308(new InterfaceC14819() { // from class: l.᩻᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45331(C19697.this, str);
            }
        }, false);
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m45379(final String str) {
        m45308(new InterfaceC14819() { // from class: l.۟᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45311(C19697.this, str);
            }
        }, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45354(final long j, final String str) {
        m45308(new InterfaceC14819() { // from class: l.ۜ᩶ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45315(C19697.this, str, j);
            }
        }, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45315(C19697 c19697, String str, long j) {
        byte[] m45320 = m45320(str);
        c19697.m45306(bo.j);
        c19697.m45337(m45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeLong(j);
        dataOutputStream.flush();
        c19697.m45323(5, "Set time failed");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45359(final String str, EnumC3510... enumC3510Arr) {
        final int i = 0;
        for (EnumC3510 enumC3510 : enumC3510Arr) {
            i |= enumC3510.f11155;
        }
        m45308(new InterfaceC14819() { // from class: l.ܶ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45312(C19697.this, str, i);
            }
        }, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45312(C19697 c19697, String str, int i) {
        byte[] m45320 = m45320(str);
        c19697.m45306(PublicSuffixDatabase.EXCEPTION_MARKER);
        c19697.m45337(m45320);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeByte(1);
        dataOutputStream.writeInt(i);
        dataOutputStream.flush();
        c19697.m45323(5, "Remove attr failed");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45358(final String str, final String str2, final boolean z, final IntConsumer intConsumer) {
        m45308(new InterfaceC14819() { // from class: l.ۢ᩹ܿ
            @Override // l.InterfaceC14819
            public final void call() {
                C19697.m45316(C19697.this, str, str2, z, intConsumer);
            }
        }, false);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m45365() {
        try {
            m45308(new InterfaceC14819() { // from class: l.ۡ᩹ܿ
                @Override // l.InterfaceC14819
                public final void call() {
                    C19697.m45325(C19697.this);
                }
            }, true);
        } catch (IOException e) {
            m45344();
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45325(C19697 c19697) {
        c19697.m45306((byte) 39);
        c19697.f63630.flush();
        c19697.m45323(5, "Ping failed");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45335(C19697 c19697) {
        c19697.m45306((byte) 35);
        c19697.f63630.flush();
        c19697.f63631.set(false);
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private C17642 m45297() {
        String str;
        int i;
        DataInputStream dataInputStream = this.f63628;
        String m45345 = m45345();
        try {
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            int m45332 = m45332();
            int m453322 = m45332();
            long m45347 = m45347();
            long m453472 = m45347();
            long m453473 = m45347();
            if ((61440 & readUnsignedShort) == 40960) {
                String m453452 = m45345();
                try {
                    i = dataInputStream.readUnsignedShort();
                    str = m453452;
                } catch (IOException e) {
                    m45307(e);
                    throw e;
                }
            } else {
                str = null;
                i = 0;
            }
            return new C17642(m45345, readUnsignedShort, m45332, m453322, m45347, m453472, m453473, str, i);
        } catch (IOException e2) {
            m45307(e2);
            throw e2;
        }
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    private String m45345() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int m45348 = m45348();
            if (m45348 > 0) {
                byteArrayOutputStream.write(m45348);
            } else {
                return byteArrayOutputStream.toString(a.D);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m45304(C19697 c19697, String str, boolean z) {
        int m45348;
        c19697.getClass();
        byte[] m45340 = m45340(str, "Path");
        c19697.m45306((byte) 20);
        c19697.m45337(m45340);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeBoolean(z);
        dataOutputStream.flush();
        c19697.m45323(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            m45348 = c19697.m45348();
            if (m45348 != 254) {
                break;
            }
            arrayList.add(c19697.m45297());
        }
        if (m45348 == 239) {
            return arrayList;
        }
        c19697.close();
        throw new IOException("Error");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m45324(C19697 c19697, String str) {
        int m45348;
        c19697.getClass();
        byte[] m45340 = m45340(str, "Path");
        c19697.m45306((byte) 21);
        c19697.m45337(m45340);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeBoolean(true);
        dataOutputStream.flush();
        c19697.m45323(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            m45348 = c19697.m45348();
            if (m45348 != 254) {
                break;
            }
            arrayList.add(c19697.m45345());
        }
        if (m45348 == 239) {
            return arrayList;
        }
        c19697.close();
        throw new IOException("Error");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static ArrayList m45339(C19697 c19697, String str) {
        int m45348;
        c19697.getClass();
        byte[] m45340 = m45340(str, "Path");
        c19697.m45306((byte) 42);
        c19697.m45337(m45340);
        DataOutputStream dataOutputStream = c19697.f63630;
        dataOutputStream.writeBoolean(true);
        dataOutputStream.flush();
        c19697.m45323(30, "Checked list dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            m45348 = c19697.m45348();
            if (m45348 != 254) {
                break;
            }
            arrayList.add(c19697.m45297());
        }
        if (m45348 == 255) {
            String m45345 = c19697.m45345();
            throw new IOException(m45345.isEmpty() ? "Checked list dir failed" : m45345);
        }
        if (m45348 == 239) {
            return arrayList;
        }
        throw c19697.m45343(C19370.m44628(m45348, "Invalid checked directory stream marker: "));
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C17642 m45341(C19697 c19697, String str) {
        byte[] m45340 = m45340(str, "Path");
        c19697.m45306((byte) 22);
        c19697.m45337(m45340);
        c19697.f63630.flush();
        c19697.m45323(5, "Read file info failed");
        return c19697.m45297();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m45346(C19697 c19697, String str) {
        int m45348;
        c19697.getClass();
        byte[] m45340 = m45340(str, "Path");
        c19697.m45306((byte) 37);
        c19697.m45337(m45340);
        c19697.f63630.flush();
        c19697.m45323(30, "List dir failed");
        ArrayList arrayList = new ArrayList();
        while (true) {
            m45348 = c19697.m45348();
            if (m45348 != 254) {
                break;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int m453482 = c19697.m45348();
                if (m453482 > 0) {
                    byteArrayOutputStream.write(m453482);
                }
            }
            arrayList.add(byteArrayOutputStream.toByteArray());
        }
        if (m45348 == 239) {
            return arrayList;
        }
        c19697.close();
        throw new IOException("Error");
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static byte[] m45320(String str) {
        return m45340(C22518.m50489(str), "Path");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static byte[] m45340(String str, String str2) {
        Charset charset;
        charset = C22518.f72872;
        byte[] bytes = str.getBytes(charset);
        C4879.m14234(str2, bytes);
        return bytes;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m45337(byte[] bArr) {
        int length = bArr.length + 1;
        DataOutputStream dataOutputStream = this.f63630;
        dataOutputStream.writeShort(length);
        dataOutputStream.write(bArr);
        dataOutputStream.write(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45306(byte b) {
        if (!this.f63631.get()) {
            throw new IOException("Connection closed");
        }
        this.f63630.writeByte(b);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private int m45323(int i, String str) {
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        Future submit = C1802.f6208.submit(new CallableC14029(1, this));
        int i2 = i * 2;
        int i3 = 0;
        while (true) {
            AtomicBoolean atomicBoolean = this.f63631;
            if (i3 < i2) {
                try {
                    byte byteValue = ((Byte) submit.get(500L, TimeUnit.MILLISECONDS)).byteValue();
                    if (byteValue == -1) {
                        String m45345 = m45345();
                        if (m45345.isEmpty()) {
                            m45345 = str;
                        }
                        throw new IOException(m45345);
                    }
                    if (byteValue != 0) {
                        if (byteValue == 1) {
                            return m45332();
                        }
                        if (byteValue != 2) {
                            throw m45343("Unknown result code: " + ((int) byteValue));
                        }
                    }
                    return 0;
                } catch (InterruptedException e) {
                    atomicBoolean.set(false);
                    m45344();
                    throw new IOException(e);
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause instanceof IOException) {
                        throw ((IOException) cause);
                    }
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    }
                    throw new IOException(cause);
                } catch (TimeoutException unused) {
                    i3++;
                }
            } else {
                atomicBoolean.set(false);
                m45344();
                submit.cancel(true);
                throw new C19401(str + ", timeout after " + i + " seconds");
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Long m45333(C19697 c19697, int i) {
        try {
            return Long.valueOf(Features3.receiveFdResponse(i));
        } catch (IOException e) {
            c19697.m45307(e);
            throw e;
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m45367() {
        return this.f63635 == 0;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m45364() {
        return this.f63635 == 2000;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m45391() {
        int i = this.f63635;
        return i == 0 || i == 2000;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m45385() {
        return this.f63635;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f63638 = true;
        if (this.f63639.get()) {
            return;
        }
        try {
            if (this.f63631.get()) {
                m45308(new InterfaceC14819() { // from class: l.᩷᩹ܿ
                    @Override // l.InterfaceC14819
                    public final void call() {
                        C19697.m45335(C19697.this);
                    }
                }, false);
            }
        } finally {
            m45344();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45351() {
        this.f63638 = true;
        if (m45378()) {
            C1802.f6208.submit(new Runnable() { // from class: l.᩵᩹ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    C19697 c19697 = C19697.this;
                    c19697.getClass();
                    for (int i = 0; i < 100; i++) {
                        SystemClock.sleep(100L);
                        if (!c19697.m45378()) {
                            break;
                        }
                    }
                    C0349.m1793(c19697);
                    c19697.f63631.set(false);
                }
            });
        } else {
            C0349.m1793(this);
            this.f63631.set(false);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m45308(final InterfaceC14819 interfaceC14819, boolean z) {
        this.f63633.lock();
        try {
            if (!this.f63631.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f63632.mo14298() && C10975.m27284()) {
                try {
                    C1802.f6208.submit(new Callable() { // from class: l.֨᩹ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            InterfaceC14819.this.call();
                            return null;
                        }
                    }).get();
                } finally {
                    C22518.m50482(th);
                }
            } else {
                interfaceC14819.call();
            }
        } catch (Throwable th) {
            try {
                throw null;
            } finally {
                this.f63634 = z ? System.currentTimeMillis() : 0L;
                this.f63633.unlock();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private long m45301(final InterfaceC23992 interfaceC23992) {
        long call;
        this.f63633.lock();
        try {
            if (!this.f63631.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f63632.mo14298() && C10975.m27284()) {
                try {
                    call = ((Long) C1802.f6208.submit(new Callable() { // from class: l.۫᩹ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Long.valueOf(InterfaceC23992.this.call());
                        }
                    }).get()).longValue();
                } finally {
                    C22518.m50482(th);
                }
            } else {
                call = interfaceC23992.call();
            }
            return call;
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m45303(final InterfaceC7059 interfaceC7059, boolean z) {
        Object call;
        this.f63633.lock();
        try {
            if (!this.f63631.get()) {
                throw new IOException("Connection closed");
            }
            if (this.f63632.mo14298() && C10975.m27284()) {
                try {
                    call = C1802.f6208.submit(new Callable() { // from class: l.᩹᩹ܿ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return InterfaceC7059.this.call();
                        }
                    }).get();
                } finally {
                    C22518.m50482(th);
                }
            } else {
                call = interfaceC7059.call();
            }
            return call;
        } catch (Throwable th) {
            try {
                if (z) {
                    throw null;
                }
                throw null;
            } finally {
                this.f63633.unlock();
                this.f63634 = 0L;
            }
        }
    }
}

package l;

import android.os.SystemClock;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* compiled from: J71B */
/* renamed from: l.᩷ۢۜ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C20790 implements InterfaceC17261 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C20790 f67319 = new C20790(new C23611());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23611 f67320;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C6678 f67321;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f67322;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f67323;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public RandomAccessFile f67324;

    @Override // l.InterfaceC17261
    /* renamed from: ֫ */
    public final synchronized C16555 mo40556(String str, String str2) {
        if (!m47590()) {
            return C16555.f50863;
        }
        try {
            return this.f67321.m18218(this.f67324, str, str2);
        } catch (IOException | RuntimeException unused) {
            this.f67323 = true;
            this.f67322 = SystemClock.elapsedRealtime();
            this.f67321 = null;
            RandomAccessFile randomAccessFile = this.f67324;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                this.f67324 = null;
            }
            return C16555.f50863;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m47592() {
        if (this.f67321 == null) {
            if (this.f67323) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f67322;
                if (elapsedRealtime >= 0 && elapsedRealtime < 60000) {
                }
            }
            this.f67323 = false;
        }
        m47590();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C20790 m47591() {
        return f67319;
    }

    public C20790(C23611 c23611) {
        this.f67320 = c23611;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m47590() {
        C6678 m47589;
        C23611 c23611 = this.f67320;
        if (this.f67321 == null) {
            if (this.f67323) {
                return false;
            }
            try {
                File file = new File(C4925.m14322(), "mcp/xref");
                if (!file.isDirectory() && !file.mkdirs() && !file.isDirectory()) {
                    throw new IOException("Unable to create boot hierarchy directory");
                }
                File file2 = new File(file, "android_api_36_public_boot_hierarchy.index");
                try {
                    m47589 = C6678.m18216(file2);
                } catch (IOException | RuntimeException unused) {
                    m47589 = m47589(c23611, file, file2);
                }
                this.f67324 = new RandomAccessFile(file2, "r");
                this.f67321 = m47589;
            } catch (IOException | RuntimeException unused2) {
                this.f67323 = true;
                this.f67322 = SystemClock.elapsedRealtime();
                this.f67321 = null;
                RandomAccessFile randomAccessFile = this.f67324;
                if (randomAccessFile == null) {
                    return false;
                }
                try {
                    randomAccessFile.close();
                } catch (IOException unused3) {
                }
                this.f67324 = null;
                return false;
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6678 m47589(C23611 c23611, File file, File file2) {
        File file3 = new File(file, "android_api_36_public_boot_hierarchy.index.tmp");
        if (r13 && !file3.delete()) {
            throw new IOException("Unable to delete stale boot hierarchy temp file");
        }
        try {
            InputStream m52102 = c23611.m52102();
            try {
                InputStream m3765 = C1096.m3765(m52102);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 32768);
                        try {
                            byte[] bArr = new byte[32768];
                            long j = 0;
                            while (true) {
                                int read = m3765.read(bArr);
                                if (read == -1) {
                                    bufferedOutputStream.flush();
                                    fileOutputStream.getFD().sync();
                                    bufferedOutputStream.close();
                                    fileOutputStream.close();
                                    m3765.close();
                                    m52102.close();
                                    if (j != 3415240) {
                                        throw new IOException("Boot hierarchy download size mismatch");
                                    }
                                    C6678 m18216 = C6678.m18216(file3);
                                    if (!file3.renameTo(file2)) {
                                        throw new IOException("Unable to publish boot hierarchy index");
                                    }
                                    if (file3.exists()) {
                                        file3.delete();
                                    }
                                    return m18216;
                                }
                                j += read;
                                if (j > 3415240) {
                                    throw new IOException("Boot hierarchy download exceeds expected size");
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            if (file3.exists()) {
                file3.delete();
            }
        }
    }
}

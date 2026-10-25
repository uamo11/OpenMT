package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.NoSuchFileException;
import java.util.List;

/* compiled from: G5CT */
/* renamed from: l.ܺۢ֡, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15843 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f48947 = 0;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m37502(File file) {
        Charset charset = StandardCharsets.UTF_8;
        int i = C8789.f26773;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        byte[] bArr = C22194.f71991;
        InputStream newInputStream = C17229.newInputStream(C7850.toPath(file), new InterfaceC23579[0]);
        try {
            if (newInputStream == null) {
                throw new NullPointerException("input");
            }
            String m49848 = C22194.m49848(newInputStream, charset);
            newInputStream.close();
            return m49848;
        } catch (Throwable th) {
            if (newInputStream != null) {
                try {
                    newInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static List m37506(File file) {
        Charset charset = StandardCharsets.UTF_8;
        InterfaceC20758 path = C7850.toPath(file);
        int i = C8789.f26773;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        return C17229.readAllLines(path, charset);
    }

    static {
        BigInteger valueOf = BigInteger.valueOf(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS);
        valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf.multiply(valueOf)))));
        valueOf.multiply(BigInteger.valueOf(ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS).multiply(BigInteger.valueOf(1152921504606846976L)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37499(File file) {
        C11003.requireNonNull(file, "file");
        try {
            InterfaceC13726 m34436 = C14411.m34436(C7850.toPath(file), C14411.f44173, EnumC9474.OVERRIDE_READ_ONLY);
            if (m34436.mo25604().get() >= 1 || m34436.mo25603().get() >= 1) {
                return;
            }
            throw new FileNotFoundException("File does not exist: " + file);
        } catch (NoSuchFileException e) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("Cannot delete file: " + file);
            fileNotFoundException.initCause(e);
            throw fileNotFoundException;
        } catch (IOException e2) {
            throw new IOException("Cannot delete file: " + file, e2);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m37501(File file) {
        C15472 c15472 = new C15472();
        C11003.requireNonNull(file, "directory");
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles((FileFilter) null);
            if (listFiles != null) {
                C19352.m44574(c15472, listFiles);
                return;
            } else {
                throw new IOException("Unknown I/O error listing contents of directory: " + file);
            }
        }
        if (file.exists()) {
            throw new IllegalArgumentException("Parameter 'directory' is not a directory: '" + file + "'");
        }
        throw new FileNotFoundException("Directory '" + file + "' does not exist.");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m37503(File file) {
        if (file == null) {
            return false;
        }
        try {
            if (file.isDirectory()) {
                m37501(file);
            }
        } catch (Exception unused) {
        }
        try {
            return file.delete();
        } catch (Exception unused2) {
            return false;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m37505(File file) {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new IOException("Cannot create directory '" + file + "'.");
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static OutputStream m37504(File file) {
        return C14411.m34435(C7850.toPath(file));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m37500(File file, byte[] bArr) {
        int length = bArr.length;
        OutputStream m34435 = C14411.m34435(C7850.toPath(file));
        try {
            m34435.write(bArr, 0, length);
            m34435.close();
        } catch (Throwable th) {
            if (m34435 != null) {
                try {
                    m34435.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}

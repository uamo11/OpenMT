package l;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.view.MenuItem;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* compiled from: H4PP */
/* renamed from: l.֡۬, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0422 {

    /* renamed from: ۠֡᩶, reason: not valid java name and contains not printable characters */
    public static int f1886;

    /* renamed from: ֡ۖ֨, reason: not valid java name and contains not printable characters */
    public static void m1943(Object obj, Object obj2) {
        ((C1109) obj).m3815((AbstractC7479) obj2);
    }

    /* renamed from: ֨ۙ֨, reason: not valid java name and contains not printable characters */
    public static StringBuilder m1944(Object obj, int i) {
        return ((StringBuilder) obj).append(i);
    }

    /* renamed from: ֨۠ܺ, reason: not valid java name and contains not printable characters */
    public static boolean m1945(Object obj, Object obj2) {
        return ((String) obj).contains((CharSequence) obj2);
    }

    /* renamed from: ֫᩺۫, reason: not valid java name and contains not printable characters */
    public static int m1951(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* renamed from: ۛ֡᩹, reason: not valid java name and contains not printable characters */
    public static void m1952(Object obj, int i, Object obj2) {
        ((C13309) obj).m32289(i, obj2);
    }

    /* renamed from: ۠ۗۧ, reason: not valid java name and contains not printable characters */
    public static MenuItem m1953(Object obj, boolean z) {
        return ((MenuItem) obj).setVisible(z);
    }

    /* renamed from: ۡۧܳ, reason: not valid java name and contains not printable characters */
    public static int m1954(Object obj) {
        return ((DataInputStream) obj).readInt();
    }

    /* renamed from: ۢܳ᩸, reason: not valid java name and contains not printable characters */
    public static String m1955(short[] sArr, int i, int i2, int i3) {
        char[] cArr = new char[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            cArr[i4] = (char) (sArr[i + i4] ^ i3);
        }
        return new String(cArr);
    }

    /* renamed from: ۧ֫֫, reason: not valid java name and contains not printable characters */
    public static void m1956() {
        C15528.m36596();
    }

    /* renamed from: ۬ܶۧ, reason: not valid java name and contains not printable characters */
    public static void m1957(Object obj, int i) {
        ((C8918) obj).m23018(i);
    }

    /* renamed from: ܶ۟᩵, reason: not valid java name and contains not printable characters */
    public static String m1958(Object obj, int i) {
        return ((Context) obj).getString(i);
    }

    /* renamed from: ܺܽۖ, reason: not valid java name and contains not printable characters */
    public static String m1959(Object obj) {
        return obj.toString();
    }

    /* renamed from: ܿᩳۧ, reason: not valid java name and contains not printable characters */
    public static String m1960(Object obj) {
        return C15799.m37398((AbstractC15440) obj);
    }

    /* renamed from: ᩴۗۨ, reason: not valid java name and contains not printable characters */
    public static void m1961(Object obj, Object obj2) {
        ((C8918) obj).m23012((String) obj2);
    }

    /* renamed from: ᩶ᩳᩳ, reason: not valid java name and contains not printable characters */
    public static String m1962(int i) {
        return String.valueOf(i);
    }

    /* renamed from: ᩻ܶܿ, reason: not valid java name and contains not printable characters */
    public static boolean m1963() {
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static File m1946(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static MappedByteBuffer m1947(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        FileChannel convertMaybeLegacyFileChannelFromLibrary;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                convertMaybeLegacyFileChannelFromLibrary = C12084.convertMaybeLegacyFileChannelFromLibrary(fileInputStream.getChannel());
                MappedByteBuffer map = convertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, convertMaybeLegacyFileChannelFromLibrary.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1950(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            fileOutputStream = fileOutputStream2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    m1948(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            m1948(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            m1948(fileOutputStream);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m1949(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean m1950 = m1950(file, inputStream);
                m1948(inputStream);
                return m1950;
            } catch (Throwable th) {
                th = th;
                m1948(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m1948(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}

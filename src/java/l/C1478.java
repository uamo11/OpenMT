package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import bin.mt.plus.Main;
import com.alipay.sdk.m.w.a;
import com.alipay.sdk.m.y.c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* compiled from: G6MK */
/* renamed from: l.֫֡ᩳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1478 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f5298;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f5299;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final long f5300;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final RunnableC7039 f5301;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ExecutorC23203 f5302;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f5303;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Exception f5304;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f5305;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23909 f5306;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4154 f5307;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Handler f5308;

    public C1478(C4154 c4154, C23909 c23909) {
        ExecutorC23203 executorC23203 = new ExecutorC23203();
        this.f5308 = new Handler(Looper.getMainLooper());
        this.f5301 = new RunnableC7039(1, this);
        this.f5303 = -1L;
        this.f5307 = c4154;
        this.f5306 = c23909;
        this.f5302 = executorC23203;
        this.f5300 = 20000L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5118() {
        m5115();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5119() {
        this.f5299 = true;
        this.f5308.removeCallbacks(this.f5301);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m5115() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean m45240;
        C22372 c22372;
        C22372 c223722;
        C22372 c223723;
        C22372 c223724;
        C22372 c223725;
        C22372 c223726;
        C22372 c223727;
        if (this.f5299) {
            return;
        }
        C4154 c4154 = this.f5307;
        C19677 c19677 = c4154.f13560;
        z = c19677.f63582;
        if (!z) {
            z2 = c19677.f63574;
            if (!z2) {
                z3 = c19677.f63570;
                if (!z3) {
                    m45240 = c19677.m45240();
                    if (m45240) {
                        c22372 = c19677.f63566;
                        if (c22372.getActivity() != null) {
                            c223722 = c19677.f63566;
                            if (!c223722.requireActivity().isFinishing()) {
                                c223723 = c19677.f63566;
                                if (!c223723.requireActivity().isDestroyed()) {
                                    C19677 c196772 = c4154.f13560;
                                    c223724 = c196772.f63566;
                                    if (c223724.isResumed()) {
                                        c223725 = c196772.f63566;
                                        if (c223725.isVisible()) {
                                            long uptimeMillis = SystemClock.uptimeMillis();
                                            if (this.f5303 < 0) {
                                                this.f5303 = uptimeMillis;
                                            }
                                            if (this.f5298 != null || this.f5304 != null) {
                                                m5119();
                                                String str = this.f5298;
                                                if (str == null) {
                                                    Exception exc = this.f5304;
                                                    c223726 = c4154.f13560.f63566;
                                                    c223726.f5603.m46502((Throwable) exc);
                                                    return;
                                                } else {
                                                    C19677 c196773 = c4154.f13560;
                                                    c196773.m45248();
                                                    c223727 = c196773.f63566;
                                                    Main.m63((ActivityC16315) c223727.requireActivity(), str);
                                                    return;
                                                }
                                            }
                                            if (!this.f5305 && uptimeMillis - this.f5303 >= this.f5300) {
                                                this.f5305 = true;
                                                try {
                                                    this.f5302.execute(new RunnableC16126(this, "foregroundWaitMs=" + (uptimeMillis - this.f5303) + "\n" + C19677.m45235(c4154.f13560), 1));
                                                } catch (RuntimeException e) {
                                                    this.f5304 = e;
                                                }
                                            }
                                            this.f5308.postDelayed(this.f5301, 1000L);
                                            return;
                                        }
                                    }
                                    this.f5303 = -1L;
                                    this.f5308.postDelayed(this.f5301, 1000L);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        m5119();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m5114(final C1478 c1478, String str) {
        Handler handler = c1478.f5308;
        try {
            C23909 c23909 = c1478.f5306;
            final String m5107 = m5107((InterfaceC20758) c23909.f77301, (String) c23909.f77302, str);
            handler.post(new Runnable() { // from class: l.ܰ᩵ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C1478.this.f5298 = m5107;
                }
            });
        } catch (Exception e) {
            handler.post(new Runnable() { // from class: l.۟᩵ᩳ
                @Override // java.lang.Runnable
                public final void run() {
                    C1478.this.f5304 = e;
                }
            });
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5107(InterfaceC20758 interfaceC20758, String str, String str2) {
        AbstractC15440 m38327 = C16293.m38327();
        m38327.m36508();
        String str3 = "text-recovery-" + System.currentTimeMillis() + "-" + UUID.randomUUID() + ".zip";
        AbstractC15440 m36526 = m38327.m36526(str3);
        AbstractC15440 m365262 = m38327.m36526(str3 + ".tmp");
        boolean z = false;
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(m365262.m36525());
            try {
                zipOutputStream.setLevel(1);
                m5108(zipOutputStream, "diagnostics.txt", "version=2.26.10 (26101061)\npackage=" + C4925.m14337() + "\nmanufacturer=" + Build.MANUFACTURER + "\nmodel=" + Build.MODEL + "\nandroid=" + Build.VERSION.RELEASE + "\nsdk=" + Build.VERSION.SDK_INT + "\nstateName=" + str + "\ndirectory=" + interfaceC20758 + "\n" + str2);
                m5108(zipOutputStream, "threads.txt", m5116());
                m5108(zipOutputStream, "logcat.txt", m5117());
                ArrayList arrayList = new ArrayList();
                InterfaceC20758 parent = interfaceC20758.toAbsolutePath().normalize().getParent();
                DirectoryStream<InterfaceC20758> newDirectoryStream = C17229.newDirectoryStream(parent);
                try {
                    for (InterfaceC20758 interfaceC207582 : newDirectoryStream) {
                        String interfaceC207583 = interfaceC207582.getFileName().toString();
                        if (interfaceC207582.equals(interfaceC20758.toAbsolutePath().normalize()) || m5113(interfaceC207583, str)) {
                            arrayList.add(interfaceC207582);
                        }
                    }
                    newDirectoryStream.close();
                    C6083.sort(arrayList, C8200.comparing(new C10420(2)));
                    StringBuilder sb = new StringBuilder("Live diagnostic copy; no session locks acquired.\nFiles may change while copying; before/after sizes and timestamps follow.\n");
                    if (arrayList.isEmpty()) {
                        sb.append("No session files found.\n");
                    }
                    byte[] bArr = new byte[65536];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m5109(zipOutputStream, parent, (InterfaceC20758) it.next(), bArr, sb);
                    }
                    m5108(zipOutputStream, "manifest.txt", sb.toString());
                    zipOutputStream.close();
                    if (!m365262.mo23551(m36526)) {
                        throw new IOException("Cannot publish session diagnostics archive");
                    }
                    try {
                        return m36526.mo23554();
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        if (!z) {
                            m365262.mo23552();
                        }
                        throw th;
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m5113(String str, String str2) {
        int length;
        int length2;
        if (!str.equals(str2.concat(".dat")) && !str.equals(str2.concat(".tat")) && !str.equals(str2.concat(".lit"))) {
            if (!str.startsWith(str2.concat("-")) || !str.endsWith(".dat") || (length2 = str2.length() + 1) == str.length() - 4) {
                return false;
            }
            for (length2 = str2.length() + 1; length2 < length; length2++) {
                if (str.charAt(length2) < '0' || str.charAt(length2) > '9') {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5109(ZipOutputStream zipOutputStream, InterfaceC20758 interfaceC20758, InterfaceC20758 interfaceC207582, byte[] bArr, StringBuilder sb) {
        int read;
        String replace = interfaceC20758.relativize(interfaceC207582).toString().replace('\\', '/');
        try {
            EnumC14406 enumC14406 = EnumC14406.NOFOLLOW_LINKS;
            InterfaceC15111 readAttributes = C17229.readAttributes(interfaceC207582, InterfaceC15111.class, enumC14406);
            if (readAttributes.isDirectory()) {
                ArrayList arrayList = new ArrayList();
                DirectoryStream newDirectoryStream = C17229.newDirectoryStream(interfaceC207582);
                try {
                    Iterator it = newDirectoryStream.iterator();
                    while (it.hasNext()) {
                        arrayList.add((InterfaceC20758) it.next());
                    }
                    newDirectoryStream.close();
                    C6083.sort(arrayList, C8200.comparing(new C10420(2)));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        m5109(zipOutputStream, interfaceC20758, (InterfaceC20758) it2.next(), bArr, sb);
                    }
                } finally {
                }
            } else if (readAttributes.isRegularFile()) {
                try {
                    InputStream newInputStream = C17229.newInputStream(interfaceC207582, enumC14406);
                    try {
                        zipOutputStream.putNextEntry(new ZipEntry("session/" + replace));
                        long size = readAttributes.size();
                        while (size > 0 && (read = newInputStream.read(bArr, 0, (int) Math.min(bArr.length, size))) >= 0) {
                            if (read == 0) {
                                throw new IOException("Session diagnostic read made no progress");
                            }
                            zipOutputStream.write(bArr, 0, read);
                            size -= read;
                        }
                        zipOutputStream.closeEntry();
                        sb.append(replace);
                        sb.append(" sizeBefore=");
                        sb.append(readAttributes.size());
                        sb.append(" copied=");
                        sb.append(readAttributes.size() - size);
                        sb.append(" modifiedBefore=");
                        sb.append(readAttributes.lastModifiedTime().toMillis());
                        if (newInputStream != null) {
                            newInputStream.close();
                        }
                        try {
                            InterfaceC15111 readAttributes2 = C17229.readAttributes(interfaceC207582, InterfaceC15111.class, EnumC14406.NOFOLLOW_LINKS);
                            sb.append(" sizeAfter=");
                            sb.append(readAttributes2.size());
                            sb.append(" modifiedAfter=");
                            sb.append(readAttributes2.lastModifiedTime().toMillis());
                        } catch (IOException e) {
                            sb.append(" afterCopy=");
                            sb.append(e);
                        }
                        sb.append('\n');
                    } finally {
                    }
                } catch (IOException e2) {
                    sb.append(replace);
                    sb.append(" unavailable: ");
                    sb.append(e2);
                    sb.append('\n');
                }
            } else {
                sb.append(replace);
                sb.append(" skipped: not a regular file or directory\n");
            }
        } catch (IOException e3) {
            sb.append(replace);
            sb.append(" unavailable: ");
            sb.append(e3);
            sb.append('\n');
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5108(ZipOutputStream zipOutputStream, String str, String str2) {
        zipOutputStream.putNextEntry(new ZipEntry(str));
        zipOutputStream.write(str2.getBytes(StandardCharsets.UTF_8));
        zipOutputStream.closeEntry();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m5116() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(Thread.getAllStackTraces().entrySet());
        C6083.sort(arrayList, C8200.comparing(new C13216(1)));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Thread thread = (Thread) entry.getKey();
            sb.append('\"');
            sb.append(thread.getName());
            sb.append("\" id=");
            sb.append(thread.getId());
            sb.append(" state=");
            sb.append(thread.getState());
            sb.append('\n');
            for (StackTraceElement stackTraceElement : (StackTraceElement[]) entry.getValue()) {
                sb.append("    at ");
                sb.append(stackTraceElement);
                sb.append('\n');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m5117() {
        Process process = null;
        try {
            try {
                Process start = new ProcessBuilder("logcat", "-d", "-t", "2000", "-v", "threadtime").redirectErrorStream(true).start();
                InputStream inputStream = start.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[8192];
                        long uptimeMillis = SystemClock.uptimeMillis() + c.a;
                        while (SystemClock.uptimeMillis() < uptimeMillis && byteArrayOutputStream.size() < 2097152) {
                            int available = inputStream.available();
                            if (available > 0) {
                                int read = inputStream.read(bArr, 0, Math.min(8192, available));
                                if (read < 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, read);
                            } else {
                                try {
                                    start.exitValue();
                                    break;
                                } catch (IllegalThreadStateException unused) {
                                    Thread.sleep(20L);
                                }
                            }
                        }
                        String str = byteArrayOutputStream.toString(a.D) + "\n[Log capture bounded to 2000 entries, 2 MiB and 3 seconds]\n";
                        byteArrayOutputStream.close();
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        start.destroy();
                        return str;
                    } finally {
                    }
                } catch (Throwable th) {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e) {
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                String str2 = "Logcat unavailable: " + e + "\n";
                if (0 != 0) {
                    process.destroy();
                }
                return str2;
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                process.destroy();
            }
            throw th3;
        }
    }
}

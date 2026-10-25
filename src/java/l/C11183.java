package l;

import android.text.TextUtils;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: 47AI */
/* renamed from: l.ۧᩴۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11183 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC5414 f33569 = new C10044();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23176 f33570;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ExecutorService f33571 = Executors.newCachedThreadPool(new ThreadFactoryC7221());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27736(C11183 c11183, C11455 c11455, PipedOutputStream pipedOutputStream) {
        c11183.getClass();
        C5810 c5810 = null;
        try {
            C5810 c58102 = new C5810(pipedOutputStream);
            try {
                c58102.setLevel(1);
                HashSet hashSet = new HashSet();
                for (C13570 c13570 : c11455.f34226) {
                    m27735(c58102, hashSet, c13570.f40491, c13570.f40490);
                }
                c58102.close();
            } catch (IOException | RuntimeException | C22743 unused) {
                c5810 = c58102;
                try {
                    pipedOutputStream.close();
                } catch (IOException unused2) {
                }
                if (c5810 != null) {
                    C5810.m16312(c5810);
                }
            } catch (Throwable th) {
                th = th;
                c5810 = c58102;
                try {
                    pipedOutputStream.close();
                } catch (IOException unused3) {
                }
                if (c5810 == null) {
                    throw th;
                }
                C5810.m16312(c5810);
                throw th;
            }
        } catch (IOException | RuntimeException | C22743 unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public C11183(C2884 c2884, C23176 c23176) {
        this.f33570 = c23176;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1304 m27733(String str) {
        C2010 c2010;
        ArrayList arrayList;
        try {
            JSONObject m17734 = C6411.m17734(str);
            c2010 = new C2010();
            c2010.f6716 = C6411.m17742(m17734, "basePath");
            c2010.f6717 = C6411.m17738(m17734);
            c2010.f6715 = C6411.m17742(m17734, "archiveName");
        } catch (C23344 unused) {
            c2010 = null;
        }
        if (c2010 == null || TextUtils.isEmpty(c2010.f6716) || (arrayList = c2010.f6717) == null || arrayList.isEmpty()) {
            throw new C22743();
        }
        String m39731 = AbstractC16891.m39731(m27737(c2010.f6716));
        ArrayList arrayList2 = new ArrayList(c2010.f6717.size());
        Iterator it = c2010.f6717.iterator();
        while (it.hasNext()) {
            arrayList2.add(m27737((String) it.next()));
        }
        String str2 = c2010.f6715;
        String trim = TextUtils.isEmpty(str2) ? "download.zip" : str2.trim();
        StringBuilder sb = new StringBuilder(trim.length());
        for (int i = 0; i < trim.length(); i++) {
            char charAt = trim.charAt(i);
            if (charAt <= 31 || charAt == '/' || charAt == '\\' || charAt == ':' || charAt == '*' || charAt == '?' || charAt == '\"' || charAt == '<' || charAt == '>' || charAt == '|') {
                sb.append('_');
            } else {
                sb.append(charAt);
            }
        }
        String trim2 = sb.toString().trim();
        String str3 = TextUtils.isEmpty(trim2) ? "download.zip" : trim2;
        if (!str3.toLowerCase(Locale.ROOT).endsWith(".zip")) {
            str3 = str3.concat(".zip");
        }
        C1304 c1304 = new C1304(m39731, str3, arrayList2);
        m27734(c1304);
        return c1304;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8236 m27739(C15996 c15996, C15414 c15414) {
        PipedInputStream pipedInputStream;
        if (!EnumC4003.GET.equals(c15996.m37807())) {
            return C2884.m8818(EnumC1180.METHOD_NOT_ALLOWED, C4925.m14306(R.string.MT_Protector_res_0x7f120824, new Object[0]));
        }
        if (!TextUtils.isEmpty(C17140.m40231(c15996, "range"))) {
            return AbstractC4708.m13784(f33569, "text/plain", "");
        }
        PipedOutputStream pipedOutputStream = null;
        C1304 c1304 = c15414 == null ? null : c15414.f47210;
        if (c1304 == null) {
            return C2884.m8818(EnumC1180.UNAUTHORIZED, C4925.m14306(R.string.MT_Protector_res_0x7f12080b, new Object[0]));
        }
        try {
            final C11455 m27734 = m27734(c1304);
            if (!this.f33570.m51396(c15414.f47211)) {
                return C2884.m8818(EnumC1180.UNAUTHORIZED, C4925.m14306(R.string.MT_Protector_res_0x7f12080b, new Object[0]));
            }
            try {
                pipedInputStream = new PipedInputStream(262144);
                try {
                    final PipedOutputStream pipedOutputStream2 = new PipedOutputStream(pipedInputStream);
                    try {
                        this.f33571.execute(new Runnable() { // from class: l.۫ۘۢ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C11183.m27736(C11183.this, m27734, pipedOutputStream2);
                            }
                        });
                        C8236 m13782 = AbstractC4708.m13782(EnumC1180.OK, pipedInputStream);
                        m13782.m21805("Content-Disposition", C11204.m27771(m27734.f34225, "attachment"));
                        m13782.m21805("Referrer-Policy", "no-referrer");
                        return m13782;
                    } catch (IOException | RuntimeException unused) {
                        pipedOutputStream = pipedOutputStream2;
                        if (pipedOutputStream != null) {
                            try {
                                pipedOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        if (pipedInputStream != null) {
                            try {
                                pipedInputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        return C2884.m8818(EnumC1180.INTERNAL_ERROR, C4925.m14306(R.string.MT_Protector_res_0x7f12082e, new Object[0]));
                    }
                } catch (IOException | RuntimeException unused4) {
                }
            } catch (IOException | RuntimeException unused5) {
                pipedInputStream = null;
            }
        } catch (C22743 unused6) {
            return C2884.m8818(EnumC1180.BAD_REQUEST, C4925.m14306(R.string.MT_Protector_res_0x7f12080c, new Object[0]));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27740() {
        this.f33571.shutdownNow();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11455 m27734(C1304 c1304) {
        String substring;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (String str : c1304.f4675) {
            String str2 = c1304.f4674;
            if (!"/".equals(str2)) {
                if (!str2.endsWith("/")) {
                    str2 = str2.concat("/");
                }
                if (!str.startsWith(str2) || str.length() <= str2.length()) {
                    throw new C22743();
                }
                substring = str.substring(str2.length());
            } else {
                if (!str.startsWith("/") || str.length() <= 1) {
                    throw new C22743();
                }
                substring = str.substring(1);
            }
            if (substring.contains("/")) {
                throw new C22743();
            }
            m27738(substring);
            AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
            m27738(substring);
            if (!m39866.mo23120() || m39866.m36533()) {
                throw new C22743();
            }
            if (!hashSet.add((!m39866.mo23113() || substring.endsWith("/")) ? substring : substring.concat("/"))) {
                throw new C22743();
            }
            arrayList.add(new C13570(m39866, substring));
        }
        return new C11455(c1304.f4673, arrayList);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27735(ZipOutputStream zipOutputStream, HashSet hashSet, AbstractC15440 abstractC15440, String str) {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("Archive stream interrupted");
        }
        m27738(str);
        if (abstractC15440.m36533()) {
            throw new C22743();
        }
        if (abstractC15440.mo23113()) {
            if (!str.endsWith("/")) {
                str = str.concat("/");
            }
            long mo23117 = abstractC15440.mo23117();
            if (!hashSet.add(str)) {
                throw new C22743();
            }
            ZipEntry zipEntry = new ZipEntry(str);
            if (mo23117 > 0) {
                zipEntry.setTime(mo23117);
            }
            zipOutputStream.putNextEntry(zipEntry);
            zipOutputStream.closeEntry();
            ArrayList arrayList = new ArrayList(abstractC15440.mo23549(true));
            C6083.sort(arrayList, C15254.thenComparing(C8200.comparing(new C7680(0), String.CASE_INSENSITIVE_ORDER), new C7680(0)));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC15440 abstractC154402 = (AbstractC15440) it.next();
                StringBuilder m15339 = C5368.m15339(str);
                m15339.append(abstractC154402.getName());
                m27735(zipOutputStream, hashSet, abstractC154402, m15339.toString());
            }
            return;
        }
        long mo231172 = abstractC15440.mo23117();
        if (!hashSet.add(str)) {
            throw new C22743();
        }
        ZipEntry zipEntry2 = new ZipEntry(str);
        if (mo231172 > 0) {
            zipEntry2.setTime(mo231172);
        }
        zipOutputStream.putNextEntry(zipEntry2);
        try {
            InputStream mo27926 = abstractC15440.mo27926();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = mo27926.read(bArr);
                    if (read == -1) {
                        mo27926.close();
                        zipOutputStream.closeEntry();
                        return;
                    } else {
                        if (Thread.currentThread().isInterrupted()) {
                            throw new InterruptedIOException("Archive stream interrupted");
                        }
                        zipOutputStream.write(bArr, 0, read);
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            zipOutputStream.closeEntry();
            throw th;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m27737(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new C22743();
        }
        String replace = str.replace('\\', '/');
        if (!replace.startsWith("/")) {
            replace = "/".concat(replace);
        }
        while (replace.length() > 1 && replace.endsWith("/")) {
            replace = C15472.m36561(1, 0, replace);
        }
        if (replace.contains(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR)) {
            throw new C22743();
        }
        return replace;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27738(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("/") || str.contains("\\") || str.contains("//")) {
            throw new C22743();
        }
        for (String str2 : str.split("/")) {
            if (TextUtils.isEmpty(str2) || ".".equals(str2) || "..".equals(str2)) {
                throw new C22743();
            }
        }
    }
}

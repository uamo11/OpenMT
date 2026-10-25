package l;

import bin.mt.json.JSON;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* compiled from: R77X */
/* renamed from: l.֨ۗ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C0859 implements InterfaceC10280 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v10, types: [l.ܶ᩵ܿ] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3773 m3169(C14852 c14852, C21909 c21909, C18590 c18590, String str) {
        AbstractC15440 abstractC15440;
        AbstractC15440 m36526;
        C11667 m25191;
        String str2;
        AbstractC15440 abstractC154402;
        AbstractC15440 abstractC154403;
        String str3 = c14852.f45311;
        String str4 = c18590.f57660;
        String str5 = c21909.f70152;
        boolean z = c21909.f70153;
        boolean z2 = c21909.f70155;
        boolean z3 = false;
        if (str5.startsWith("/")) {
            m36526 = C16999.m39866(str5, new String[0]);
        } else {
            AbstractC15440 m39866 = C16999.m39866(str, new String[0]);
            try {
                ?? isEmpty = str5.isEmpty();
                abstractC15440 = isEmpty;
                if (isEmpty != 0) {
                    StringBuilder sb = new StringBuilder();
                    String m36517 = C16999.m39866(str3, new String[0]).m36517();
                    StringBuilder sb2 = new StringBuilder(m36517.length());
                    for (int i = 0; i < m36517.length(); i++) {
                        char charAt = m36517.charAt(i);
                        if (charAt == ':' || charAt == '/' || charAt == '\\' || charAt == 0) {
                            charAt = '_';
                        }
                        sb2.append(charAt);
                    }
                    sb.append(sb2.toString());
                    ?? r11 = "_mcp_";
                    sb.append("_mcp_");
                    sb.append(str4);
                    sb.append(z2 ? "_sign.apk" : "_unsigned.apk");
                    str5 = sb.toString();
                    abstractC15440 = r11;
                }
                m36526 = m39866.m36526(str5);
            } catch (Exception e) {
                throw m3153((AbstractC15440) null, "OUTPUT_PATH_RESOLVE_FAILED", m3149(e));
            }
        }
        AbstractC15440 abstractC154404 = m36526;
        m3167(abstractC154404);
        if (abstractC154404.equals(C16999.m39866(str3, new String[0]))) {
            throw m3153(abstractC154404, "OUTPUT_PATH_IS_SOURCE_APK", "outputName must not resolve to the source APK.");
        }
        if (!abstractC154404.m36514().mo27924()) {
            throw m3153(abstractC154404, "OUTPUT_DIRECTORY_UNWRITABLE", "Output directory is not writable.");
        }
        if (abstractC154404.mo23120() && !z) {
            throw C3059.m9365("OUTPUT_ALREADY_EXISTS", "Output file already exists.", "warning", JSON.array(), JSON.object().add("outputPath", abstractC154404.mo23554()));
        }
        ?? r4 = 1;
        if (z2) {
            try {
                m25191 = C10025.m25191(C19911.m45806(), true);
                if (m25191.m28557() instanceof C22435) {
                    try {
                        m25191.m28557().mo32190();
                    } catch (Exception e2) {
                        if (e2 instanceof C21730) {
                            C21730 c21730 = (C21730) e2;
                            str2 = "The MCP service cannot use the current signing key: " + c21730.m49057() + ". Log in to MT account " + c21730.m49058() + ", or choose another signing key in MT MCP Settings, then retry.";
                        } else {
                            str2 = "The MCP service cannot use the current signing key. Log in to the correct MT account, or choose another signing key in MT MCP Settings, then retry.";
                        }
                        throw m3168(abstractC154404, "APK_SIGN_ACCOUNT_REQUIRED", str2);
                    }
                } else if (m25191.m28557().mo32195()) {
                    throw m3168(abstractC154404, "APK_SIGN_KEY_LOCKED", "The MCP service cannot use the current signing key because it requires password input. Open MT MCP Settings to enter the signing key password or choose another signing key, then retry.");
                }
            } catch (Exception e3) {
                throw m3168(abstractC154404, "APK_SIGN_KEY_MISSING", m3149(e3));
            }
        } else {
            m25191 = null;
        }
        C11667 c11667 = m25191;
        C19205 m3166 = m3166(c14852, c18590);
        try {
            try {
                abstractC15440 = abstractC154404.m36520(".mcp_unsigned");
                if (!z2) {
                    try {
                        if (ApplicationC20075.f65008.getBoolean("kasb", true)) {
                            z3 = true;
                        }
                    } catch (C3059 e4) {
                        e = e4;
                        throw e;
                    } catch (Exception e5) {
                        e = e5;
                        throw m3153(abstractC154404, "APK_BUILD_FAILED", m3149(e));
                    } catch (Throwable th) {
                        th = th;
                        r4 = 0;
                        if (abstractC15440 != null) {
                            abstractC15440.mo23552();
                        }
                        if (r4 != 0) {
                            r4.mo23552();
                        }
                        C15972.m37753();
                        throw th;
                    }
                }
                m3157(c14852, c18590, m3166, abstractC15440, z3);
                if (z2) {
                    abstractC154402 = abstractC154404.m36520(".mcp_signed");
                    try {
                        m3159(abstractC15440, abstractC154402, abstractC154404, c11667);
                        m3160(abstractC154402, abstractC154404, z);
                    } catch (C3059 e6) {
                        throw e6;
                    } catch (Exception e7) {
                        e = e7;
                        throw m3153(abstractC154404, "APK_BUILD_FAILED", m3149(e));
                    }
                } else {
                    m3160(abstractC15440, abstractC154404, z);
                    abstractC154402 = null;
                }
                abstractC154403 = abstractC154402;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                C3773 m3154 = m3154(c14852, c18590, m3166, abstractC154404, c11667, c21909.f70155);
                if (abstractC15440.mo23120()) {
                    abstractC15440.mo23552();
                }
                if (abstractC154403 != null && abstractC154403.mo23120()) {
                    abstractC154403.mo23552();
                }
                C15972.m37753();
                return m3154;
            } catch (C3059 e8) {
                throw e8;
            } catch (Exception e9) {
                e = e9;
                throw m3153(abstractC154404, "APK_BUILD_FAILED", m3149(e));
            } catch (Throwable th3) {
                th = th3;
                r4 = abstractC154403;
                if (abstractC15440 != null && abstractC15440.mo23120()) {
                    abstractC15440.mo23552();
                }
                if (r4 != 0 && r4.mo23120()) {
                    r4.mo23552();
                }
                C15972.m37753();
                throw th;
            }
        } catch (C3059 e10) {
            e = e10;
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
            abstractC15440 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3160(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, boolean z) {
        m3167(abstractC154402);
        if (z) {
            abstractC15440.m36501(abstractC154402, false, true, null);
            return;
        }
        try {
            abstractC15440.mo23558().mo8670(abstractC154402);
        } catch (C22497 e) {
            if (e.m50458() == EnumC21792.ALREADY_EXISTS) {
                throw C3059.m9365("OUTPUT_ALREADY_EXISTS", "Output file already exists.", "warning", JSON.array(), JSON.object().add("outputPath", abstractC154402.mo23554()));
            }
            throw e;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m3167(AbstractC15440 abstractC15440) {
        EnumC3447 enumC3447;
        C7383 m48690 = C22233.m49903().m48690();
        m48690.m19884(abstractC15440.mo23554());
        m48690.m19882(abstractC15440.mo23554());
        m48690.m19884(abstractC15440.m36514().mo23554());
        C17760 c17760 = new C17760(C22233.m49903(), C22233.m49904());
        c17760.m41610(abstractC15440, new C18499(this, abstractC15440));
        EnumC3447 m30885 = c17760.m41613(abstractC15440.m36511()).m30885();
        EnumC3447 enumC34472 = EnumC3447.MISSING;
        if (m30885 == enumC34472 || m30885 == (enumC3447 = EnumC3447.REGULAR)) {
            throw m3165(abstractC15440, "OUTPUT_DIRECTORY_UNAVAILABLE", "Output parent must be an existing directory.");
        }
        EnumC3447 enumC34473 = EnumC3447.DIRECTORY;
        if (m30885 != enumC34473) {
            throw m3153(abstractC15440, "OUTPUT_DIRECTORY_UNAVAILABLE", "Output parent could not be verified as a directory.");
        }
        EnumC3447 m308852 = c17760.m41613(abstractC15440.mo23554()).m30885();
        if (m308852 == enumC34473) {
            throw m3165(abstractC15440, "OUTPUT_PATH_NOT_FILE", "Output path refers to a directory.");
        }
        if (m308852 != enumC34472 && m308852 != enumC3447) {
            throw m3153(abstractC15440, "OUTPUT_PATH_NOT_FILE", "Output must be a regular file or a missing file.");
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C3059 m3152(C0859 c0859, AbstractC15440 abstractC15440, String str, String str2, String str3) {
        if (("FILE_PARENT_NOT_FOUND".equals(str) && "parent_missing".equals(str3)) || ("FILE_NOT_DIRECTORY".equals(str) && "regular".equals(str3))) {
            return m3165(abstractC15440, str, str2);
        }
        return m3153(abstractC15440, str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (r13.toLowerCase().startsWith("lib/") != false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca A[Catch: all -> 0x004e, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x004e, blocks: (B:103:0x0044, B:105:0x004a, B:70:0x008e, B:32:0x009e, B:36:0x00b3, B:43:0x00ca), top: B:102:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8 A[Catch: all -> 0x0169, TryCatch #4 {all -> 0x0169, blocks: (B:48:0x00db, B:50:0x00f8, B:54:0x00fc, B:80:0x0106, B:81:0x010e, B:83:0x0114, B:85:0x0133, B:86:0x0137, B:88:0x013d, B:92:0x014a), top: B:47:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc A[Catch: all -> 0x0169, TryCatch #4 {all -> 0x0169, blocks: (B:48:0x00db, B:50:0x00f8, B:54:0x00fc, B:80:0x0106, B:81:0x010e, B:83:0x0114, B:85:0x0133, B:86:0x0137, B:88:0x013d, B:92:0x014a), top: B:47:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cd A[Catch: all -> 0x016b, TRY_ENTER, TryCatch #5 {all -> 0x016b, blocks: (B:18:0x003e, B:20:0x0054, B:21:0x005f, B:23:0x0065, B:26:0x0076, B:30:0x0092, B:34:0x00af, B:41:0x00c5, B:45:0x00cf, B:66:0x00cd), top: B:17:0x003e }] */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.ᩴۜۜ] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v2, types: [l.ᩳܰۡ] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m3157(l.C14852 r17, l.C18590 r18, l.C19205 r19, l.AbstractC15440 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0859.m3157(l.ܳ᩻ۜ, l.ᩴۜۜ, l.᩵ۗ᩻, l.ܶ᩵ܿ, boolean):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15313 m3155(C18090 c18090, HashMap hashMap) {
        C15766 c15766 = (C15766) hashMap.get("AndroidManifest.xml");
        if (c15766 != null) {
            byte[] bArr = c15766.f48602;
            if (bArr != null) {
                C15313 c15313 = new C15313();
                c15313.m36338(bArr);
                return c15313;
            }
            AbstractC15440 abstractC15440 = c15766.f48606;
            if (abstractC15440 != null) {
                long j = c15766.f48605;
                if (j >= 0) {
                    try {
                        if (j > 5242880) {
                            return new C15313();
                        }
                        byte[] m3164 = m3164(abstractC15440);
                        if (m3164 == null) {
                            return new C15313();
                        }
                        C15313 c153132 = new C15313();
                        c153132.m36338(m3164);
                        return c153132;
                    } catch (IOException e) {
                        throw new IOException("Failed to inspect changed APK manifest content.", e);
                    } catch (RuntimeException e2) {
                        if (!m3162(e2)) {
                            throw e2;
                        }
                        throw new IOException("Failed to inspect changed APK manifest content.", e2);
                    }
                }
            }
            throw new IOException("Changed manifest data source is missing.");
        }
        C15313 c153133 = new C15313();
        c153133.m36337(c18090);
        return c153133;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m3164(AbstractC15440 abstractC15440) {
        InputStream mo27926 = abstractC15440.mo27926();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[65536];
                int i = 0;
                do {
                    int read = mo27926.read(bArr, 0, Math.min(65536, 5242881 - i));
                    if (read < 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        mo27926.close();
                        return byteArray;
                    }
                    if (read == 0) {
                        int read2 = mo27926.read();
                        if (read2 < 0) {
                            byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                            byteArrayOutputStream.close();
                            mo27926.close();
                            return byteArray2;
                        }
                        byteArrayOutputStream.write(read2);
                        i++;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, read);
                        i += read;
                    }
                } while (i <= 5242880);
                byteArrayOutputStream.close();
                mo27926.close();
                return null;
            } finally {
            }
        } catch (Throwable th) {
            if (mo27926 != null) {
                try {
                    mo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3161(C18090 c18090, C8918 c8918, C3545 c3545, C15313 c15313) {
        if (C21665.m48937(c3545, c15313)) {
            C21665.m48936(c18090, c8918, c3545, c15313, null);
            return;
        }
        if ((c3545.m10796() & 8) == 0) {
            c8918.m23014(c3545, c18090);
            return;
        }
        c8918.m23018(c3545.m10767());
        C3545 c35452 = new C3545(c3545.getName());
        c35452.setTime(c3545.getTime());
        c35452.m10771(c3545.m10801());
        c35452.m10805(c3545.getSize());
        c8918.m23013(c35452);
        InputStream m42189 = c18090.m42189(c3545);
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = m42189.read(bArr);
                if (read != -1) {
                    c8918.write(bArr, 0, read);
                } else {
                    m42189.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                m42189.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3156(C8918 c8918, C15766 c15766) {
        byte[] bArr = c15766.f48602;
        long j = c15766.f48605;
        if (bArr != null) {
            if (j != bArr.length) {
                throw new IOException("Changed entry size does not match its byte array.");
            }
            c8918.write(bArr);
            return;
        }
        AbstractC15440 abstractC15440 = c15766.f48606;
        if (abstractC15440 == null) {
            throw new IOException("Changed entry data source is missing.");
        }
        try {
            InputStream mo27926 = abstractC15440.mo27926();
            try {
                byte[] bArr2 = new byte[65536];
                long j2 = 0;
                while (true) {
                    int read = mo27926.read(bArr2);
                    if (read < 0) {
                        break;
                    }
                    if (read == 0) {
                        int read2 = mo27926.read();
                        if (read2 < 0) {
                            break;
                        }
                        c8918.write(read2);
                        j2 = m3148(1, j2);
                    } else {
                        c8918.write(bArr2, 0, read);
                        j2 = m3148(read, j2);
                    }
                }
                if (j2 != j) {
                    throw new IOException("Changed entry size changed after the build snapshot.");
                }
                mo27926.close();
            } finally {
            }
        } catch (IOException e) {
            throw new IOException("Failed to stream changed APK entry content.", e);
        } catch (RuntimeException e2) {
            if (!m3162(e2)) {
                throw e2;
            }
            throw new IOException("Failed to stream changed APK entry content.", e2);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15060 m3170(C14852 c14852, C18590 c18590) {
        ArrayList arrayList = c18590.f57664;
        byte[] bArr = new byte[65536];
        Iterator it = c18590.f57663.iterator();
        while (it.hasNext()) {
            C15766 c15766 = (C15766) it.next();
            AbstractC15440 abstractC15440 = c15766.f48606;
            if (abstractC15440 != null) {
                try {
                    InputStream mo27926 = abstractC15440.mo27926();
                    long j = 0;
                    while (true) {
                        try {
                            int read = mo27926.read(bArr);
                            if (read < 0) {
                                break;
                            }
                            if (read == 0) {
                                if (mo27926.read() < 0) {
                                    break;
                                }
                                j = m3148(1, j);
                            } else {
                                j = m3148(read, j);
                            }
                        } catch (Throwable th) {
                            if (mo27926 == null) {
                                throw th;
                            }
                            try {
                                mo27926.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    }
                    if (j != c15766.f48605) {
                        throw new IOException("Changed entry size changed after the build snapshot.");
                    }
                    mo27926.close();
                } catch (IOException unused) {
                    throw m3153((AbstractC15440) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
                } catch (RuntimeException e) {
                    if (!m3162(e)) {
                        throw e;
                    }
                    throw m3153((AbstractC15440) null, "ENTRY_OVERLAY_READ_FAILED", "Failed to read changed APK entry content.");
                }
            }
        }
        C19205 m3166 = m3166(c14852, c18590);
        String str = c14852.f45300;
        String str2 = c18590.f57660;
        ArrayList arrayList2 = new ArrayList();
        Collections.addAll(new ArrayList(3), "edit_session_prepare", "entry_overlay_encode", "dex_merge");
        return new C15060(str, str2, true, 0, 0, arrayList2, "passed", new ArrayList(m3166.f60458), arrayList.size() + c18590.f57666.size(), arrayList.size(), new ArrayList(c18590.f57659), new ArrayList(c18590.f57665), new ArrayList(c18590.f57662));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m3148(int i, long j) {
        long j2 = i;
        if (j <= 9007199254740991L - j2) {
            return j + j2;
        }
        throw new IOException("Changed entry exceeds the supported size range.");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m3162(RuntimeException runtimeException) {
        return (runtimeException instanceof SecurityException) || (runtimeException instanceof IllegalArgumentException) || (runtimeException instanceof IllegalStateException) || (runtimeException instanceof UnsupportedOperationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0275, code lost:
    
        if (r2.f1313 < r7.f1313) goto L116;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x029d A[SYNTHETIC] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C19205 m3166(l.C14852 r29, l.C18590 r30) {
        /*
            Method dump skipped, instructions count: 1123
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0859.m3166(l.ܳ᩻ۜ, l.ᩴۜۜ):l.᩵ۗ᩻");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0153 m3151(LinkedHashMap linkedHashMap, String str) {
        C0153 c0153 = (C0153) linkedHashMap.get(str);
        if (c0153 != null) {
            return c0153;
        }
        throw C3059.m9368("DEX_BUILD_FAILED", "Dex entry is unavailable: " + str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3158(C14852 c14852, C18590 c18590, C22027 c22027, C0153 c0153) {
        String m22046;
        AbstractC15440 abstractC15440 = c18590.f57667;
        String str = c0153.f1308;
        if (c0153.f1305) {
            try {
                C8420 c8420 = c14852.f45294;
                AbstractC15440 m35250 = c14852.m35250(str);
                c8420.getClass();
                m22046 = C8420.m22046(m35250);
            } catch (IOException e) {
                throw m3153(c14852.m35250(str), "DEX_BUILD_FAILED", m3149(e));
            }
        } else {
            m22046 = "<mcp-new-dex>";
        }
        C21322 m49560 = C22027.m49560(str, m22046, new ArrayList(c0153.f1312.values()), new ArrayList(c0153.f1310));
        try {
            try {
                byte[] m49563 = C22027.m49563(abstractC15440, m49560);
                if (m49563 == null) {
                    m49563 = m3163(c14852, c0153);
                    try {
                        C22027.m49562(abstractC15440, m49560, m49563);
                    } catch (IOException unused) {
                    }
                }
                c0153.f1307 = m49563;
                C10612 m26632 = C10612.m26632(str, m49563);
                c0153.f1311 = m26632;
                c0153.f1304 = m26632.f31872;
                c0153.f1309 = true;
            } catch (OutOfMemoryError unused2) {
                throw C18081.m42152();
            }
        } catch (IOException e2) {
            throw m3153((AbstractC15440) null, "DEX_BUILD_FAILED", m3149(e2));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m3163(C14852 c14852, C0153 c0153) {
        C19357 c19357;
        String str = c0153.f1308;
        boolean z = c0153.f1305;
        LinkedHashMap linkedHashMap = c0153.f1312;
        try {
            if (z) {
                C12918 m35252 = c14852.m35252(str);
                c0153.f1304 = m35252.mo27437().f24463;
                c19357 = new C19357(m35252.mo27437());
                Iterator it = ((AbstractC18605) m35252.mo27438()).iterator();
                while (it.hasNext()) {
                    InterfaceC8566 interfaceC8566 = (InterfaceC8566) it.next();
                    String type = interfaceC8566.getType();
                    if (!c0153.f1310.contains(type) && !linkedHashMap.containsKey(type)) {
                        c19357.m44606(interfaceC8566);
                    }
                }
            } else {
                c19357 = new C19357(C7897.m21184(c0153.f1304));
            }
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                c19357.m44606((InterfaceC8566) ((C2362) it2.next()).f7549);
            }
            if (c19357.m48536()) {
                throw C3059.m9363("DEX_POOL_OVERFLOW", "Dex method or field pool overflow.");
            }
            C21473 c21473 = new C21473();
            c19357.m48534(c21473);
            return c21473.m48624();
        } catch (C3059 e) {
            throw e;
        } catch (Exception e2) {
            throw m3153(z ? c14852.m35250(str) : null, "DEX_BUILD_FAILED", m3149(e2));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m3150(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        C6083.sort(arrayList2, C18373.m42805());
        return arrayList2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3159(AbstractC15440 abstractC15440, AbstractC15440 abstractC154402, AbstractC15440 abstractC154403, C11667 c11667) {
        try {
            C6022.m16847(abstractC15440, abstractC154402, c11667, new C5093());
        } catch (Exception e) {
            throw m3153(abstractC154403, "APK_SIGN_FAILED", m3149(e));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3773 m3154(C14852 c14852, C18590 c18590, C19205 c19205, AbstractC15440 abstractC15440, C11667 c11667, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = c18590.f57664;
        if (z) {
            EnumC8139 m28555 = c11667.m28555();
            ArrayList arrayList3 = new ArrayList();
            if (m28555.f25125) {
                arrayList3.add("V1");
            }
            if (m28555.f25126) {
                arrayList3.add("V2");
            }
            if (m28555.f25124) {
                arrayList3.add("V3");
            }
            arrayList = arrayList3;
        } else {
            arrayList = new ArrayList();
        }
        String str = c14852.f45300;
        String str2 = c18590.f57660;
        abstractC15440.mo23554();
        String mo23554 = abstractC15440.mo23554();
        String mo235542 = abstractC15440.mo23554();
        String name = abstractC15440.getName();
        long mo23127 = abstractC15440.mo23127();
        C8315 m49048 = C21721.m49048(abstractC15440);
        if (z) {
            Collections.addAll(new ArrayList(6), "edit_session_prepare", "entry_overlay_encode", "dex_merge", "apk_zip_write", "apk_sign", "publish");
        } else {
            Collections.addAll(new ArrayList(5), "edit_session_prepare", "entry_overlay_encode", "dex_merge", "apk_zip_write", "publish");
        }
        return new C3773(str, str2, mo23554, mo235542, name, mo23127, z, arrayList, m49048, new ArrayList(c19205.f60458), arrayList2.size() + c18590.f57666.size(), arrayList2.size(), new ArrayList(c18590.f57659), new ArrayList(c18590.f57665), new ArrayList(c18590.f57662));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m3165(AbstractC15440 abstractC15440, String str, String str2) {
        return C3059.m9365(str, str2, "warning", JSON.array(), JSON.object().add("outputPath", abstractC15440.mo23554()));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m3153(AbstractC15440 abstractC15440, String str, String str2) {
        return C3059.m9369(str, str2, "fatal", JSON.array(), JSON.object().add("outputPath", abstractC15440 == null ? JSON.NULL : JSON.value(abstractC15440.mo23554())));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C3059 m3168(AbstractC15440 abstractC15440, String str, String str2) {
        return C3059.m9365(str, str2, "fatal", JSON.array(), JSON.object().add("outputPath", JSON.value(abstractC15440.mo23554())));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3149(Exception exc) {
        String message = exc.getMessage();
        return (message == null || message.isEmpty()) ? exc.getClass().getSimpleName() : message;
    }
}

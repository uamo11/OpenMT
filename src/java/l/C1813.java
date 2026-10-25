package l;

import bin.mt.json.JSON;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;

/* compiled from: P776 */
/* renamed from: l.֫ۨ᩻, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1813 {
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0155, code lost:
    
        r8.add(r4);
        r3 = r18 - 1;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0045, code lost:
    
        if (r6 <= 'Z') goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f0 A[Catch: all -> 0x01aa, TRY_ENTER, TryCatch #1 {all -> 0x01aa, blocks: (B:19:0x00e8, B:22:0x00f0, B:24:0x00f6, B:26:0x00fc, B:29:0x0123, B:34:0x0155, B:35:0x015e, B:37:0x0169, B:39:0x0179, B:43:0x012c, B:45:0x0138, B:48:0x013f, B:50:0x018f, B:51:0x0197, B:52:0x0198, B:53:0x01a0, B:54:0x01a1, B:55:0x01a9), top: B:18:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a1 A[Catch: all -> 0x01aa, TryCatch #1 {all -> 0x01aa, blocks: (B:19:0x00e8, B:22:0x00f0, B:24:0x00f6, B:26:0x00fc, B:29:0x0123, B:34:0x0155, B:35:0x015e, B:37:0x0169, B:39:0x0179, B:43:0x012c, B:45:0x0138, B:48:0x013f, B:50:0x018f, B:51:0x0197, B:52:0x0198, B:53:0x01a0, B:54:0x01a1, B:55:0x01a9), top: B:18:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d2  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C7292 m6033(java.lang.String r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1813.m6033(java.lang.String, int, int, boolean):l.۟ۛ᩻");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m6031(AbstractC15440 abstractC15440, C7383 c7383, String str) {
        String sb;
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C11526(abstractC15440, ""));
        while (!linkedList.isEmpty()) {
            C11526 c11526 = (C11526) linkedList.removeFirst();
            AbstractC15440 abstractC154402 = c11526.f34410;
            String str2 = c11526.f34411;
            for (AbstractC15440 abstractC154403 : abstractC154402.mo23549(true)) {
                if (c7383.m19881(abstractC154403.mo23554()).f73841.m16736()) {
                    if (str2.isEmpty()) {
                        sb = abstractC154403.getName();
                    } else {
                        StringBuilder m19190 = C7166.m19190(str2, "/");
                        m19190.append(abstractC154403.getName());
                        sb = m19190.toString();
                    }
                    String str3 = sb;
                    if (abstractC154403.mo23113()) {
                        if (!abstractC154403.m36533()) {
                            linkedList.addLast(new C11526(abstractC154403, str3));
                        }
                    } else if (abstractC154403.mo23119() && !abstractC154403.m36533() && abstractC154403.getName().toLowerCase(Locale.ROOT).endsWith(".apk") && str3.startsWith(str)) {
                        arrayList.add(new C22814(abstractC154403, str3, abstractC154403.mo23127(), abstractC154403.mo23117()));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
    
        r12 = java.lang.Long.valueOf(java.lang.Long.parseLong(r15));
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C13641 m6034(l.C22814 r15) {
        /*
            r0 = 0
            l.ᩳܰۡ r1 = new l.ᩳܰۡ     // Catch: java.lang.Exception -> L1a
            l.ܶ᩵ܿ r2 = r15.f73659     // Catch: java.lang.Exception -> L1a
            r1.<init>(r2)     // Catch: java.lang.Exception -> L1a
            l.᩶ۨ᩻ r2 = l.C3224.m9893(r1)     // Catch: java.lang.Throwable -> L10
            r1.close()     // Catch: java.lang.Exception -> L1a
            goto L31
        L10:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Exception -> L1a
        L19:
            throw r2     // Catch: java.lang.Exception -> L1a
        L1a:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            if (r2 != 0) goto L24
            java.lang.String r1 = "Failed to parse APK manifest."
            goto L28
        L24:
            java.lang.String r1 = r1.getMessage()
        L28:
            l.᩶ۨ᩻ r2 = new l.᩶ۨ᩻
            r2.<init>()
            r2.f65275 = r0
            r2.f65277 = r1
        L31:
            java.lang.String r1 = r2.f65270
            if (r1 == 0) goto L37
        L35:
            r9 = r1
            goto L3a
        L37:
            java.lang.String r1 = r2.f65273
            goto L35
        L3a:
            l.ܰۛ᩻ r1 = new l.ܰۛ᩻
            java.lang.String r4 = r15.f73661
            long r5 = r15.f73662
            long r7 = r15.f73660
            java.lang.String r10 = r2.f65279
            java.lang.String r11 = r2.f65272
            java.lang.String r15 = r2.f65278
            r3 = 0
            if (r15 == 0) goto L72
            boolean r12 = r15.isEmpty()
            if (r12 == 0) goto L52
            goto L72
        L52:
            int r12 = r15.length()
            if (r0 >= r12) goto L68
            char r12 = r15.charAt(r0)
            r13 = 48
            if (r12 < r13) goto L72
            r13 = 57
            if (r12 <= r13) goto L65
            goto L72
        L65:
            int r0 = r0 + 1
            goto L52
        L68:
            long r12 = java.lang.Long.parseLong(r15)     // Catch: java.lang.NumberFormatException -> L72
            java.lang.Long r15 = java.lang.Long.valueOf(r12)     // Catch: java.lang.NumberFormatException -> L72
            r12 = r15
            goto L73
        L72:
            r12 = r3
        L73:
            boolean r13 = r2.f65275
            java.lang.String r14 = r2.f65277
            r3 = r1
            r3.<init>(r4, r5, r7, r9, r10, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1813.m6034(l.᩺ۛ᩻):l.ܰۛ᩻");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3059 m6032(String str, String str2) {
        return C3059.m9364(str2, "prefix", str == null ? null : JSON.value(str), JSON.array(), JSON.object().add("prefix", ""));
    }
}

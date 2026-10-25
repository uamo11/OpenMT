package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class ObjectRestoreHeaderHandler implements HeaderHandler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f488 = Pattern.compile("expiry-date=\"(.*?)\"");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f489 = Pattern.compile("ongoing-request=\"(.*?)\"");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Log f490 = LogFactory.m302(ObjectRestoreHeaderHandler.class);

    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo463(Object obj, HttpResponse httpResponse) {
        m470((ObjectRestoreResult) obj, httpResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m470(com.amazonaws.services.s3.internal.ObjectRestoreResult r5, com.amazonaws.http.HttpResponse r6) {
        /*
            java.util.Map r6 = r6.m267()
            java.lang.String r0 = "x-amz-restore"
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L56
            java.util.regex.Pattern r0 = com.amazonaws.services.s3.internal.ObjectRestoreHeaderHandler.f488
            java.util.regex.Matcher r0 = r0.matcher(r6)
            boolean r1 = r0.find()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L31
            java.lang.String r0 = r0.group(r3)
            int r1 = com.amazonaws.services.s3.internal.ServiceUtils.f512     // Catch: java.lang.Exception -> L29
            java.lang.String r1 = "EEE, dd MMM yyyy HH:mm:ss z"
            java.util.Date r0 = com.amazonaws.util.DateUtils.m769(r1, r0)     // Catch: java.lang.Exception -> L29
            goto L32
        L29:
            r0 = move-exception
            com.amazonaws.logging.Log r1 = com.amazonaws.services.s3.internal.ObjectRestoreHeaderHandler.f490
            java.lang.String r4 = "Error parsing expiry-date from x-amz-restore header."
            r1.mo298(r4, r0)
        L31:
            r0 = r2
        L32:
            r5.mo471(r0)
            java.util.regex.Pattern r0 = com.amazonaws.services.s3.internal.ObjectRestoreHeaderHandler.f489
            java.util.regex.Matcher r6 = r0.matcher(r6)
            boolean r0 = r6.find()
            if (r0 == 0) goto L4d
            java.lang.String r6 = r6.group(r3)
            boolean r6 = java.lang.Boolean.parseBoolean(r6)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
        L4d:
            if (r2 == 0) goto L56
            boolean r6 = r2.booleanValue()
            r5.mo472(r6)
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.internal.ObjectRestoreHeaderHandler.m470(com.amazonaws.services.s3.internal.ObjectRestoreResult, com.amazonaws.http.HttpResponse):void");
    }
}

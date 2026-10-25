package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class ObjectExpirationHeaderHandler implements HeaderHandler {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f485 = Pattern.compile("expiry-date=\"(.*?)\"");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f486 = Pattern.compile("rule-id=\"(.*?)\"");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Log f487 = LogFactory.m302(ObjectExpirationHeaderHandler.class);

    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    /* renamed from: ֫ */
    public final /* bridge */ /* synthetic */ void mo463(Object obj, HttpResponse httpResponse) {
        m467((ObjectExpirationResult) obj, httpResponse);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m467(com.amazonaws.services.s3.internal.ObjectExpirationResult r5, com.amazonaws.http.HttpResponse r6) {
        /*
            java.util.Map r6 = r6.m267()
            java.lang.String r0 = "x-amz-expiration"
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L48
            java.util.regex.Pattern r0 = com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler.f485
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
            com.amazonaws.logging.Log r1 = com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler.f487
            java.lang.String r4 = "Error parsing expiry-date from x-amz-expiration header."
            r1.mo298(r4, r0)
        L31:
            r0 = r2
        L32:
            r5.mo468(r0)
            java.util.regex.Pattern r0 = com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler.f486
            java.util.regex.Matcher r6 = r0.matcher(r6)
            boolean r0 = r6.find()
            if (r0 == 0) goto L45
            java.lang.String r2 = r6.group(r3)
        L45:
            r5.mo469(r2)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.s3.internal.ObjectExpirationHeaderHandler.m467(com.amazonaws.services.s3.internal.ObjectExpirationResult, com.amazonaws.http.HttpResponse):void");
    }
}

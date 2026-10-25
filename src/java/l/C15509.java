package l;

/* compiled from: C9N6 */
/* renamed from: l.ܶ᩹, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15509 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f47403 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003a, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004b, code lost:
    
        if (r2 != null) goto L45;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m36578(android.content.Context r8) {
        /*
            java.lang.Object r0 = l.C15509.f47403
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.io.FileNotFoundException -> L5e java.lang.Throwable -> L60
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            r6 = 1
            if (r5 == r6) goto L41
            r6 = 3
            if (r5 != r6) goto L28
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            if (r7 <= r4) goto L41
        L28:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L2e
            goto L18
        L2e:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Throwable -> L4b
        L41:
            if (r2 == 0) goto L50
            goto L4d
        L44:
            r8 = move-exception
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.io.IOException -> L4a java.lang.Throwable -> L60
        L4a:
            throw r8     // Catch: java.lang.Throwable -> L60
        L4b:
            if (r2 == 0) goto L50
        L4d:
            r2.close()     // Catch: java.io.IOException -> L50 java.lang.Throwable -> L60
        L50:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L60
            if (r2 != 0) goto L57
            goto L5c
        L57:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L60
        L5c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            return r1
        L5e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            return r1
        L60:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L60
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15509.m36578(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r5 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        if (r5 != null) goto L30;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m36579(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = l.C15509.f47403
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L12
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            return
        L12:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.io.FileNotFoundException -> L4b java.lang.Throwable -> L4d
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L4d
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
            if (r5 == 0) goto L49
            goto L46
        L3d:
            r6 = move-exception
            if (r5 == 0) goto L43
            r5.close()     // Catch: java.io.IOException -> L43 java.lang.Throwable -> L4d
        L43:
            throw r6     // Catch: java.lang.Throwable -> L4d
        L44:
            if (r5 == 0) goto L49
        L46:
            r5.close()     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L4d
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            goto L4c
        L4b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
        L4c:
            return
        L4d:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C15509.m36579(android.content.Context, java.lang.String):void");
    }
}

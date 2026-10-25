package l;

import android.net.Uri;
import java.util.List;

/* compiled from: K17L */
/* renamed from: l.ܳܶܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14609 {
    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m34871(Uri uri) {
        if (!"content".equals(uri.getScheme())) {
            return null;
        }
        List<String> pathSegments = uri.getPathSegments();
        if ((pathSegments.size() != 2 && pathSegments.size() != 4) || !pathSegments.get(0).equals("tree")) {
            return null;
        }
        String str = pathSegments.get(1);
        int indexOf = str.indexOf(58);
        int indexOf2 = str.indexOf(47);
        if (indexOf == -1 || (indexOf2 != -1 && indexOf2 < indexOf)) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Uri m34869(Uri uri) {
        if ("content".equals(uri.getScheme())) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 2) {
                if (pathSegments.get(0).equals("tree")) {
                    return new Uri.Builder().scheme("content").authority(uri.getAuthority()).appendPath("tree").appendPath(pathSegments.get(1)).appendPath("document").appendPath(pathSegments.get(1)).build();
                }
            } else if (pathSegments.size() == 4 && pathSegments.get(0).equals("tree") && pathSegments.get(2).equals("document")) {
                return uri;
            }
        }
        throw new RuntimeException("Invalid tree uri: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00b2  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri m34867(android.net.Uri r10) {
        /*
            java.lang.String r0 = r10.getScheme()
            java.lang.String r1 = "content"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Ld0
            java.util.List r0 = r10.getPathSegments()
            int r2 = r0.size()
            java.lang.String r3 = "children"
            r4 = 0
            r5 = 2
            java.lang.String r6 = "document"
            r7 = 1
            java.lang.String r8 = "tree"
            if (r2 != r5) goto L5d
            java.lang.Object r2 = r0.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto Laf
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.scheme(r1)
            java.lang.String r2 = r10.getAuthority()
            android.net.Uri$Builder r1 = r1.authority(r2)
            android.net.Uri$Builder r1 = r1.appendPath(r8)
            java.lang.Object r2 = r0.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r1 = r1.appendPath(r2)
            android.net.Uri$Builder r1 = r1.appendPath(r6)
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            goto Lb0
        L5d:
            int r2 = r0.size()
            r9 = 4
            if (r2 != r9) goto Laf
            java.lang.Object r2 = r0.get(r4)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto Laf
            java.lang.Object r2 = r0.get(r5)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto Laf
            android.net.Uri$Builder r2 = new android.net.Uri$Builder
            r2.<init>()
            android.net.Uri$Builder r1 = r2.scheme(r1)
            java.lang.String r2 = r10.getAuthority()
            android.net.Uri$Builder r1 = r1.authority(r2)
            android.net.Uri$Builder r1 = r1.appendPath(r8)
            java.lang.Object r2 = r0.get(r7)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r1 = r1.appendPath(r2)
            android.net.Uri$Builder r1 = r1.appendPath(r6)
            r2 = 3
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            android.net.Uri$Builder r0 = r1.appendPath(r0)
            android.net.Uri$Builder r0 = r0.appendPath(r3)
            goto Lb0
        Laf:
            r0 = 0
        Lb0:
            if (r0 == 0) goto Ld0
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 <= r2) goto Lcb
            java.lang.String r1 = "com.android.externalstorage.documents"
            java.lang.String r10 = r10.getAuthority()
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto Lcb
            java.lang.String r10 = "manage"
            java.lang.String r1 = "1"
            r0.appendQueryParameter(r10, r1)
        Lcb:
            android.net.Uri r10 = r0.build()
            return r10
        Ld0:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid tree uri: "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14609.m34867(android.net.Uri):android.net.Uri");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m34868(String str, boolean z) {
        Uri.Builder appendPath = new Uri.Builder().scheme("content").authority("com.android.externalstorage.documents").appendPath("tree").appendPath(str);
        if (z) {
            appendPath.appendPath("document").appendPath(str);
        }
        return appendPath.build();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Uri m34872(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return null;
        }
        String str = pathSegments.get(1);
        String str2 = pathSegments.get(3);
        if (str.endsWith("/")) {
            str = C15472.m36561(1, 0, str);
        }
        if (str2.endsWith("/")) {
            str2 = C15472.m36561(1, 0, str2);
        }
        if (str2.length() <= str.length()) {
            return null;
        }
        int lastIndexOf = str2.lastIndexOf(47);
        return new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).appendPath("tree").appendPath(str).appendPath("document").appendPath(lastIndexOf < str.length() ? str : str2.substring(0, lastIndexOf)).build();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m34870(Uri uri) {
        String m34871 = m34871(uri);
        if (m34871 == null) {
            String path = uri.getPath();
            C11003.requireNonNull(path);
            return C14336.m34210(path);
        }
        List<String> pathSegments = uri.getPathSegments();
        String substring = pathSegments.size() == 2 ? pathSegments.get(1).substring(m34871.length() + 1) : pathSegments.get(3).substring(m34871.length() + 1);
        if (substring.endsWith("/")) {
            substring = C15472.m36561(1, 0, substring);
        }
        return substring.isEmpty() ? m34871 : substring.substring(substring.lastIndexOf(47) + 1);
    }
}

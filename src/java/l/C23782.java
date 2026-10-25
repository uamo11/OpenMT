package l;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;

/* compiled from: M54P */
/* renamed from: l.᩻ܶܿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23782 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    @SuppressLint({"StaticFieldLeak"})
    public static final Application f76977 = C4925.m14335();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ContentResolver f76978 = C4925.m14336();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m52459(Uri uri) {
        return m52453(uri, "_display_name");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m52457(Uri uri) {
        return "vnd.android.document/directory".equals(m52453(uri, "mime_type"));
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static boolean m52462(Uri uri) {
        String m52453 = m52453(uri, "mime_type");
        return ("vnd.android.document/directory".equals(m52453) || TextUtils.isEmpty(m52453)) ? false : true;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static long m52455(Uri uri) {
        return m52451(0L, uri, "last_modified");
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m52461(Uri uri) {
        return m52451(0L, uri, "_size");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m52454(Uri uri) {
        return f76977.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(m52453(uri, "mime_type"));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m52456(Uri uri) {
        if (f76977.checkCallingOrSelfUriPermission(uri, 2) == 0) {
            String m52453 = m52453(uri, "mime_type");
            int m52451 = (int) m52451(0, uri, "flags");
            if (!TextUtils.isEmpty(m52453)) {
                if ((m52451 & 4) != 0) {
                    return true;
                }
                if ("vnd.android.document/directory".equals(m52453) && (m52451 & 8) != 0) {
                    return true;
                }
                if (!TextUtils.isEmpty(m52453) && (m52451 & 2) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m52460(Uri uri) {
        try {
            Cursor query = f76978.query(uri, new String[]{"document_id"}, null, null, null);
            try {
                C11003.requireNonNull(query);
                boolean z = query.getCount() > 0;
                query.close();
                return z;
            } finally {
            }
        } catch (Exception e) {
            e.toString();
            return false;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m52458(Uri uri) {
        try {
            return DocumentsContract.deleteDocument(f76978, uri);
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Uri m52452(Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(f76978, uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m52453(Uri uri, String str) {
        try {
            Cursor query = f76978.query(uri, new String[]{str}, null, null, null);
            try {
                C11003.requireNonNull(query);
                if (!query.moveToFirst() || query.isNull(0)) {
                    query.close();
                    return null;
                }
                String string = query.getString(0);
                query.close();
                return string;
            } finally {
            }
        } catch (Exception e) {
            e.toString();
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m52451(long j, Uri uri, String str) {
        try {
            Cursor query = f76978.query(uri, new String[]{str}, null, null, null);
            try {
                C11003.requireNonNull(query);
                if (!query.moveToFirst() || query.isNull(0)) {
                    query.close();
                    return j;
                }
                long j2 = query.getLong(0);
                query.close();
                return j2;
            } finally {
            }
        } catch (Exception e) {
            e.toString();
            return j;
        }
    }
}

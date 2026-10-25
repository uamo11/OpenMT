package l;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.DocumentsContract;

/* compiled from: U9SU */
/* renamed from: l.᩹۫, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22275 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50008(Uri uri) {
        return DocumentsContract.isTreeUri(uri);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50007(ContentResolver contentResolver, Uri uri, Uri uri2) {
        return DocumentsContract.removeDocument(contentResolver, uri, uri2);
    }
}

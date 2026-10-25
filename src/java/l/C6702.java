package l;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;

/* compiled from: EB0J */
/* renamed from: l.ۜۤۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C6702 extends ContentProvider {
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            if (context.getApplicationContext() == null) {
                return true;
            }
            C23635 m52130 = C23635.m52130(context);
            Context context2 = m52130.f76578;
            try {
                try {
                    Trace.beginSection("Startup");
                    m52130.m52132(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), C6702.class.getName()), 128).metaData);
                    return true;
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C9525(e);
                }
            } finally {
                Trace.endSection();
            }
        }
        throw new C9525("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}

package l;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* compiled from: 194E */
/* renamed from: l.᩶ᩴܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20358 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46678(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        if (contentResolver != null) {
            Cursor cursor = null;
            try {
                Cursor query = contentResolver.query(Uri.parse("content://com.bbk.launcher2.settings/favorites"), null, null, null, null);
                if (query != null) {
                    String m46679 = m46679(context);
                    while (query.moveToNext()) {
                        String string = query.getString(query.getColumnIndexOrThrow("title"));
                        if (!TextUtils.isEmpty(string) && string.equals(m46679)) {
                            int i = query.getInt(query.getColumnIndexOrThrow("shortcutPermission"));
                            if (i == 1 || i == 17) {
                                query.close();
                                return -1;
                            }
                            if (i == 16) {
                                query.close();
                                return 0;
                            }
                            if (i == 18) {
                                query.close();
                                return 1;
                            }
                        }
                    }
                    query.close();
                    return 2;
                }
                if (query != null) {
                    query.close();
                    return 2;
                }
            } catch (Exception unused) {
                if (0 != 0) {
                    cursor.close();
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }
        return 2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m46679(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getApplicationContext().getPackageName(), 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.applicationInfo.loadLabel(packageManager).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }
}

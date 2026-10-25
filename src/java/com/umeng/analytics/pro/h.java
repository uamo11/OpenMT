package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l.C3435;

/* compiled from: E4L5 */
/* loaded from: classes.dex */
public class h {
    public static boolean a(String str, SQLiteDatabase sQLiteDatabase) {
        boolean z = false;
        if (str == null) {
            return false;
        }
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query("sqlite_master", new String[]{"count(*)"}, "type=? and name=?", new String[]{"table", str.trim()}, null, null, null, null);
            if (cursor.moveToNext()) {
                if (cursor.getInt(0) > 0) {
                    z = true;
                }
            }
            cursor.close();
            return z;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            File databasePath = context.getDatabasePath(e.b);
            if (databasePath != null && databasePath.exists()) {
                databasePath.delete();
            }
            f.a(context).a();
        } catch (Throwable unused) {
        }
    }

    public static String b(Context context) {
        return context.getDatabasePath(e.b).getParent() + File.separator;
    }

    public static String c(Context context) {
        return b(context) + "subprocess/";
    }

    public static String a(List list) {
        return TextUtils.join("!", list);
    }

    public static List a(String str) {
        return new ArrayList(Arrays.asList(str.split("!")));
    }

    public static List b(List list) {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (Collections.frequency(arrayList, str) < 1) {
                    arrayList.add(str);
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z = false;
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query(str, null, null, null, null, null, "LIMIT 0");
            if (cursor != null) {
                if (cursor.getColumnIndex(str2) != -1) {
                    z = true;
                }
            }
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return z;
        } catch (Exception unused) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        StringBuilder m10501 = C3435.m10501("alter table ", str, " add ", str2, " ");
        m10501.append(str3);
        sQLiteDatabase.execSQL(m10501.toString());
    }
}

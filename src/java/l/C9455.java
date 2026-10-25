package l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: L73P */
/* renamed from: l.ۢ۠֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9455 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28696 = 0;

    static {
        C16840.m39615("media3.database");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m24301(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", (Integer) 1);
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new C6632(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24300(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            String str2 = C3603.f11424;
            if (!(DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0)) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, null, null, null);
            try {
                if (query.getCount() != 0) {
                    query.moveToNext();
                    int i2 = query.getInt(0);
                    query.close();
                    return i2;
                }
                query.close();
                return -1;
            } finally {
            }
        } catch (SQLException e) {
            throw new C6632(e);
        }
    }
}

package l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: Z754 */
/* renamed from: l.ۧ᩸֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11260 implements InterfaceC18315 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final String[] f33746 = {"id", "key", "metadata"};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20744 f33747;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f33748;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SparseArray f33749 = new SparseArray();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f33750;

    public C11260(C20744 c20744) {
        this.f33747 = c20744;
    }

    @Override // l.InterfaceC18315
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo27867(long j) {
        String hexString = Long.toHexString(j);
        this.f33748 = hexString;
        this.f33750 = C20094.m46315("ExoPlayerCacheIndex", hexString);
    }

    @Override // l.InterfaceC18315
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo27872() {
        try {
            SQLiteDatabase readableDatabase = this.f33747.getReadableDatabase();
            String str = this.f33748;
            str.getClass();
            return C9455.m24300(readableDatabase, 1, str) != -1;
        } catch (SQLException e) {
            throw new C6632(e);
        }
    }

    @Override // l.InterfaceC18315
    public final void delete() {
        C20744 c20744 = this.f33747;
        String str = this.f33748;
        str.getClass();
        try {
            String concat = "ExoPlayerCacheIndex".concat(str);
            SQLiteDatabase writableDatabase = c20744.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                int i = C9455.f28696;
                try {
                    String str2 = C3603.f11424;
                    if (DatabaseUtils.queryNumEntries(writableDatabase, "sqlite_master", "tbl_name = ?", new String[]{"ExoPlayerVersions"}) > 0) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + concat);
                    writableDatabase.setTransactionSuccessful();
                } catch (SQLException e) {
                    throw new C6632(e);
                }
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new C6632(e2);
        }
    }

    @Override // l.InterfaceC18315
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo27869(HashMap hashMap, SparseArray sparseArray) {
        C20744 c20744 = this.f33747;
        C22632.m50634(this.f33749.size() == 0);
        try {
            SQLiteDatabase readableDatabase = c20744.getReadableDatabase();
            String str = this.f33748;
            str.getClass();
            if (C9455.m24300(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = c20744.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    m27865(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = c20744.getReadableDatabase();
            String str2 = this.f33750;
            str2.getClass();
            Cursor query = readableDatabase2.query(str2, f33746, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(0);
                    String string = query.getString(1);
                    string.getClass();
                    hashMap.put(string, new C2087(i, string, C17609.m41157(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                    sparseArray.put(i, string);
                } finally {
                }
            }
            query.close();
        } catch (SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new C6632(e);
        }
    }

    @Override // l.InterfaceC18315
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo27873(HashMap hashMap) {
        try {
            SQLiteDatabase writableDatabase = this.f33747.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                m27865(writableDatabase);
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    m27866(writableDatabase, (C2087) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.f33749.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new C6632(e);
        }
    }

    @Override // l.InterfaceC18315
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo27868(HashMap hashMap) {
        SparseArray sparseArray = this.f33749;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f33747.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    C2087 c2087 = (C2087) sparseArray.valueAt(i);
                    if (c2087 == null) {
                        int keyAt = sparseArray.keyAt(i);
                        String str = this.f33750;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                    } else {
                        m27866(writableDatabase, c2087);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
        } catch (SQLException e) {
            throw new C6632(e);
        }
    }

    @Override // l.InterfaceC18315
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo27870(C2087 c2087) {
        this.f33749.put(c2087.f6960, c2087);
    }

    @Override // l.InterfaceC18315
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo27871(C2087 c2087, boolean z) {
        int i = c2087.f6960;
        SparseArray sparseArray = this.f33749;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27865(SQLiteDatabase sQLiteDatabase) {
        String str = this.f33748;
        str.getClass();
        C9455.m24301(sQLiteDatabase, 1, str);
        String str2 = this.f33750;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f33750 + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27866(SQLiteDatabase sQLiteDatabase, C2087 c2087) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C17609.m41158(c2087.m6859(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(c2087.f6960));
        contentValues.put("key", c2087.f6961);
        contentValues.put("metadata", byteArray);
        String str = this.f33750;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }
}

package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.pro.e;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: O4N1 */
/* loaded from: classes.dex */
public class i {
    public static final int a = 2049;
    public static final int b = 2050;
    public static final int c = 1000;
    public static Context d = null;
    public static String e = null;
    public static final String f = "umeng+";
    public static final String g = "ek__id";
    public static final String h = "ek_key";
    public List i;
    public List j;
    public String k;

    /* renamed from: l, reason: collision with root package name */
    public List f77935l;

    /* compiled from: O4N1 */
    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    /* compiled from: O4N1 */
    public class b {
        public static final i a = new i();
    }

    public i() {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = null;
        this.f77935l = new ArrayList();
    }

    public static i a(Context context) {
        i iVar = b.a;
        if (d == null && context != null) {
            d = context.getApplicationContext();
            iVar.k();
        }
        return iVar;
    }

    private void k() {
        synchronized (this) {
            l();
            this.i.clear();
            this.f77935l.clear();
            this.j.clear();
        }
    }

    private Cursor a(String str, SQLiteDatabase sQLiteDatabase, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            if (sQLiteDatabase.isOpen()) {
                return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a() {
        this.i.clear();
    }

    public void b() {
        this.f77935l.clear();
    }

    public boolean c() {
        return this.f77935l.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0099, code lost:
    
        if (r2 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(org.json.JSONArray r11) {
        /*
            r10 = this;
            java.lang.String r0 = "__t"
            java.lang.String r1 = "__i"
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> L9c
            com.umeng.analytics.pro.g r3 = com.umeng.analytics.pro.g.a(r3)     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> L9c
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch: java.lang.Throwable -> L98 android.database.sqlite.SQLiteDatabaseCorruptException -> L9c
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r4 = 0
        L13:
            int r5 = r11.length()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            if (r4 >= r5) goto L8d
            org.json.JSONObject r5 = r11.getJSONObject(r4)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.<init>()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = r5.optString(r1)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r9 = "-1"
            if (r8 != 0) goto L34
            boolean r8 = r9.equals(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            if (r8 == 0) goto L43
        L34:
            com.umeng.analytics.pro.u r7 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = r7.b()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            if (r8 == 0) goto L43
            r7 = r9
        L43:
            r6.put(r1, r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__e"
            java.lang.String r8 = "id"
            java.lang.String r8 = r5.optString(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            int r7 = r5.optInt(r0)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r0, r7)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r5.remove(r1)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r5.remove(r0)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r7 = "__s"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r5 = r10.c(r5)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            r6.put(r7, r5)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
            java.lang.String r5 = "__et"
            r3.insert(r5, r2, r6)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> L94
        L8a:
            int r4 = r4 + 1
            goto L13
        L8d:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L94 android.database.sqlite.SQLiteDatabaseCorruptException -> L96
            r3.endTransaction()     // Catch: java.lang.Throwable -> La6
            goto La6
        L94:
            r2 = r3
            goto L99
        L96:
            r2 = r3
            goto L9c
        L98:
        L99:
            if (r2 == 0) goto La6
            goto La3
        L9c:
            android.content.Context r11 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> Lb0
            com.umeng.analytics.pro.h.a(r11)     // Catch: java.lang.Throwable -> Lb0
            if (r2 == 0) goto La6
        La3:
            r2.endTransaction()     // Catch: java.lang.Throwable -> La6
        La6:
            android.content.Context r11 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r11 = com.umeng.analytics.pro.g.a(r11)
            r11.b()
            return
        Lb0:
            r11 = move-exception
            if (r2 == 0) goto Lb6
            r2.endTransaction()     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(org.json.JSONArray):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (r0 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
    
        if (r0 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r5, java.lang.String r6, int r7) {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L5a
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L5a
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch: java.lang.Throwable -> L56 android.database.sqlite.SQLiteDatabaseCorruptException -> L5a
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.<init>()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r3 = "__i"
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = r4.c(r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            if (r6 != 0) goto L4b
            java.lang.String r6 = "__a"
            r2.put(r6, r5)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__t"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__av"
            android.content.Context r6 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__vc"
            android.content.Context r6 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r6 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r5 = "__er"
            r1.insert(r5, r0, r2)     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
        L4b:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L52 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r1.endTransaction()     // Catch: java.lang.Throwable -> L64
            goto L64
        L52:
            r0 = r1
            goto L57
        L54:
            r0 = r1
            goto L5a
        L56:
        L57:
            if (r0 == 0) goto L64
            goto L61
        L5a:
            android.content.Context r5 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L6f
            com.umeng.analytics.pro.h.a(r5)     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L64
        L61:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L64
        L64:
            android.content.Context r5 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r5 = com.umeng.analytics.pro.g.a(r5)
            r5.b()
            r5 = 0
            return r5
        L6f:
            r5 = move-exception
            if (r0 == 0) goto L75
            r0.endTransaction()     // Catch: java.lang.Throwable -> L75
        L75:
            android.content.Context r6 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r6 = com.umeng.analytics.pro.g.a(r6)
            r6.b()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(java.lang.String, java.lang.String, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r0 == null) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r6 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            com.umeng.analytics.pro.u r1 = com.umeng.analytics.pro.u.a()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            java.lang.String r1 = r1.c()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            if (r2 == 0) goto L29
            r0.endTransaction()     // Catch: java.lang.Throwable -> L1f
        L1f:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            return
        L29:
            java.lang.String r2 = ""
            java.lang.String r3 = "-1"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r3 = 0
        L32:
            r4 = 2
            if (r3 >= r4) goto L65
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r4.<init>()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            java.lang.String r5 = "update __et set __i=\""
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r4.append(r1)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            java.lang.String r5 = "\" where "
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            java.lang.String r5 = "__i"
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            java.lang.String r5 = "=\""
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r5 = r2[r3]     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            java.lang.String r5 = "\""
            r4.append(r5)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            r0.execSQL(r4)     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            int r3 = r3 + 1
            goto L32
        L65:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L69 android.database.sqlite.SQLiteDatabaseCorruptException -> L6c
            goto L73
        L69:
            if (r0 == 0) goto L76
            goto L73
        L6c:
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L80
            com.umeng.analytics.pro.h.a(r1)     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L76
        L73:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L76
        L76:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            return
        L80:
            r1 = move-exception
            if (r0 == 0) goto L86
            r0.endTransaction()     // Catch: java.lang.Throwable -> L86
        L86:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.d():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008e, code lost:
    
        if (r2 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0086, code lost:
    
        if (r2 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r7, org.json.JSONObject r8, com.umeng.analytics.pro.i.a r9) {
        /*
            r6 = this;
            java.lang.String r0 = "__e"
            r1 = 0
            if (r8 != 0) goto L6
            return r1
        L6:
            r2 = 0
            android.content.Context r3 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L89
            com.umeng.analytics.pro.g r3 = com.umeng.analytics.pro.g.a(r3)     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L89
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch: java.lang.Throwable -> L85 android.database.sqlite.SQLiteDatabaseCorruptException -> L89
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            com.umeng.analytics.pro.i$a r4 = com.umeng.analytics.pro.i.a.BEGIN     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r4) goto L4f
            java.lang.Object r8 = r8.opt(r0)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.Long r8 = (java.lang.Long) r8     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            long r8 = r8.longValue()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.<init>()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r5 = "__ii"
            r4.put(r5, r7)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.put(r0, r7)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = "__av"
            android.content.Context r8 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionName(r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = "__vc"
            android.content.Context r8 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r8 = com.umeng.commonsdk.utils.UMUtils.getAppVersionCode(r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r4.put(r7, r8)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            java.lang.String r7 = "__sd"
            r3.insert(r7, r2, r4)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L4f:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.INSTANTSESSIONBEGIN     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L57
            r6.b(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L57:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.END     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L5f
            r6.a(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L5f:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.PAGE     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L69
            java.lang.String r9 = "__a"
            r6.a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L69:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.AUTOPAGE     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L73
            java.lang.String r9 = "__b"
            r6.a(r7, r8, r3, r9)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            goto L7a
        L73:
            com.umeng.analytics.pro.i$a r0 = com.umeng.analytics.pro.i.a.NEWSESSION     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            if (r9 != r0) goto L7a
            r6.c(r7, r8, r3)     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
        L7a:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L81 android.database.sqlite.SQLiteDatabaseCorruptException -> L83
            r3.endTransaction()     // Catch: java.lang.Throwable -> L93
            goto L93
        L81:
            r2 = r3
            goto L86
        L83:
            r2 = r3
            goto L89
        L85:
        L86:
            if (r2 == 0) goto L93
            goto L90
        L89:
            android.content.Context r7 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L9d
            com.umeng.analytics.pro.h.a(r7)     // Catch: java.lang.Throwable -> L9d
            if (r2 == 0) goto L93
        L90:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L93
        L93:
            android.content.Context r7 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r7 = com.umeng.analytics.pro.g.a(r7)
            r7.b()
            return r1
        L9d:
            r7 = move-exception
            if (r2 == 0) goto La3
            r2.endTransaction()     // Catch: java.lang.Throwable -> La3
        La3:
            android.content.Context r8 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r8 = com.umeng.analytics.pro.g.a(r8)
            r8.b()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(java.lang.String, org.json.JSONObject, com.umeng.analytics.pro.i$a):boolean");
    }

    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long longValue = ((Long) jSONObject.opt(e.d.a.g)).longValue();
            Object opt = jSONObject.opt(e.d.a.h);
            long longValue2 = (opt == null || !(opt instanceof Long)) ? 0L : ((Long) opt).longValue();
            JSONObject optJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("__pp");
            String str2 = "";
            String c2 = (optJSONObject == null || optJSONObject.length() <= 0) ? "" : c(optJSONObject.toString());
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                str2 = c(optJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + longValue + "\", __g=\"" + longValue2 + "\", __sp=\"" + c2 + "\", __pp=\"" + str2 + "\" where __ii=\"" + str + "\"");
        } catch (Throwable unused) {
        }
    }

    private void b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long longValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject optJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject optJSONObject2 = jSONObject.optJSONObject("__pp");
            String str2 = "";
            String c2 = (optJSONObject == null || optJSONObject.length() <= 0) ? "" : c(optJSONObject.toString());
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                str2 = c(optJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(longValue));
            contentValues.put("__sp", c2);
            contentValues.put("__pp", str2);
            contentValues.put("__av", UMGlobalContext.getInstance(d).getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(d));
            sQLiteDatabase.insert(e.c.a, null, contentValues);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        if (r4 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(java.lang.String r16) {
        /*
            r15 = this;
            java.lang.String r0 = "__f"
            r1 = 0
            r2 = 0
            android.content.Context r4 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L56
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L56
            android.database.sqlite.SQLiteDatabase r4 = r4.a()     // Catch: java.lang.Throwable -> L40 java.lang.Exception -> L56
            r4.beginTransaction()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L3e
            java.lang.String[] r8 = new java.lang.String[]{r0}     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L3e
            java.lang.String r6 = "__sd"
            java.lang.String r9 = "__ii=? "
            java.lang.String[] r10 = new java.lang.String[]{r16}     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L3e
            r13 = 0
            r14 = 0
            r11 = 0
            r12 = 0
            r5 = r15
            r7 = r4
            android.database.Cursor r1 = r5.a(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L3e
            if (r1 == 0) goto L38
            r1.moveToFirst()     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L3e
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L3e
            long r2 = r1.getLong(r0)     // Catch: java.lang.Exception -> L36 java.lang.Throwable -> L3e
            goto L38
        L36:
            goto L57
        L38:
            if (r1 == 0) goto L5e
            r1.close()     // Catch: java.lang.Exception -> L61
            goto L5e
        L3e:
            r0 = move-exception
            goto L42
        L40:
            r0 = move-exception
            r4 = r1
        L42:
            if (r1 == 0) goto L47
            r1.close()     // Catch: java.lang.Exception -> L4c
        L47:
            if (r4 == 0) goto L4c
            r4.endTransaction()     // Catch: java.lang.Exception -> L4c
        L4c:
            android.content.Context r1 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        L56:
            r4 = r1
        L57:
            if (r1 == 0) goto L5c
            r1.close()     // Catch: java.lang.Exception -> L61
        L5c:
            if (r4 == 0) goto L61
        L5e:
            r4.endTransaction()     // Catch: java.lang.Exception -> L61
        L61:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(java.lang.String):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.lang.String r20, org.json.JSONObject r21, android.database.sqlite.SQLiteDatabase r22) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.c(java.lang.String, org.json.JSONObject, android.database.sqlite.SQLiteDatabase):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x00db, TryCatch #1 {all -> 0x00db, blocks: (B:52:0x0050, B:54:0x0056, B:15:0x0063, B:17:0x006e, B:18:0x0073, B:26:0x0082, B:29:0x0088, B:31:0x008e, B:38:0x0094, B:40:0x00a2, B:33:0x0091), top: B:51:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0050 A[EXC_TOP_SPLITTER, LOOP:1: B:51:0x0050->B:54:0x0056, LOOP_START, PHI: r13
  0x0050: PHI (r13v2 java.lang.String) = (r13v7 java.lang.String), (r13v3 java.lang.String) binds: [B:14:0x004e, B:54:0x0056] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.lang.String r16, org.json.JSONObject r17, android.database.sqlite.SQLiteDatabase r18, java.lang.String r19) {
        /*
            r15 = this;
            r10 = r15
            r0 = r17
            r11 = r19
            java.lang.String r12 = "=\""
            java.lang.String r1 = "__b"
            java.lang.String r2 = "__a"
            r13 = 0
            boolean r3 = r2.equals(r11)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto L20
            org.json.JSONArray r0 = r0.optJSONArray(r2)     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto Le3
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Ldd
            if (r1 > 0) goto L34
            goto Le3
        L20:
            boolean r2 = r1.equals(r11)     // Catch: java.lang.Throwable -> Ldd
            if (r2 == 0) goto L36
            org.json.JSONArray r0 = r0.optJSONArray(r1)     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto Le3
            int r1 = r0.length()     // Catch: java.lang.Throwable -> Ldd
            if (r1 > 0) goto L34
            goto Le3
        L34:
            r14 = r0
            goto L37
        L36:
            r14 = r13
        L37:
            java.lang.String[] r3 = new java.lang.String[]{r19}     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r1 = "__sd"
            java.lang.String r4 = "__ii=? "
            java.lang.String[] r5 = new java.lang.String[]{r16}     // Catch: java.lang.Throwable -> Ldd
            r8 = 0
            r9 = 0
            r6 = 0
            r7 = 0
            r0 = r15
            r2 = r18
            android.database.Cursor r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Ldd
            if (r0 == 0) goto L63
        L50:
            boolean r1 = r0.moveToNext()     // Catch: java.lang.Throwable -> Ldb
            if (r1 == 0) goto L63
            int r1 = r0.getColumnIndex(r11)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = r0.getString(r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r13 = r15.d(r1)     // Catch: java.lang.Throwable -> Ldb
            goto L50
        L63:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ldb
            r1.<init>()     // Catch: java.lang.Throwable -> Ldb
            boolean r2 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> Ldb
            if (r2 != 0) goto L73
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Ldb
            r1.<init>(r13)     // Catch: java.lang.Throwable -> Ldb
        L73:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> Ldb
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r2 <= r3) goto L81
            if (r0 == 0) goto Le3
            r0.close()
            return
        L81:
            r2 = 0
        L82:
            int r3 = r14.length()     // Catch: java.lang.Throwable -> Ldb
            if (r2 >= r3) goto L94
            org.json.JSONObject r3 = r14.getJSONObject(r2)     // Catch: org.json.JSONException -> L91 java.lang.Throwable -> Ldb
            if (r3 == 0) goto L91
            r1.put(r3)     // Catch: java.lang.Throwable -> Ldb
        L91:
            int r2 = r2 + 1
            goto L82
        L94:
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = r15.c(r1)     // Catch: java.lang.Throwable -> Ldb
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> Ldb
            if (r2 != 0) goto Ld5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldb
            r2.<init>()     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r3 = "update __sd set "
            r2.append(r3)     // Catch: java.lang.Throwable -> Ldb
            r2.append(r11)     // Catch: java.lang.Throwable -> Ldb
            r2.append(r12)     // Catch: java.lang.Throwable -> Ldb
            r2.append(r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = "\" where "
            r2.append(r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = "__ii"
            r2.append(r1)     // Catch: java.lang.Throwable -> Ldb
            r2.append(r12)     // Catch: java.lang.Throwable -> Ldb
            r1 = r16
            r2.append(r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = "\""
            r2.append(r1)     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Ldb
            r2 = r18
            r2.execSQL(r1)     // Catch: java.lang.Throwable -> Ldb
        Ld5:
            if (r0 == 0) goto Le3
            r0.close()
            goto Le3
        Ldb:
            r13 = r0
            goto Lde
        Ldd:
        Lde:
            if (r13 == 0) goto Le3
            r13.close()
        Le3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(java.lang.String, org.json.JSONObject, android.database.sqlite.SQLiteDatabase, java.lang.String):void");
    }

    public boolean e() {
        return this.i.isEmpty();
    }

    public JSONObject a(boolean z) {
        a();
        this.j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            a(jSONObject, z);
            b(jSONObject, (String) null);
            a(jSONObject, (String) null);
            return jSONObject;
        }
        String a2 = a(jSONObject, z);
        if (!TextUtils.isEmpty(a2)) {
            b(jSONObject, a2);
            a(jSONObject, a2);
        }
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r2 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007d, code lost:
    
        if (r2 != null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject f() {
        /*
            r14 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List r2 = r14.f77935l
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteDatabaseCorruptException -> L82
            com.umeng.analytics.pro.g r2 = com.umeng.analytics.pro.g.a(r2)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteDatabaseCorruptException -> L82
            android.database.sqlite.SQLiteDatabase r2 = r2.a()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteDatabaseCorruptException -> L82
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            java.util.List r4 = r14.f77935l     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            java.lang.String r5 = "__is"
            java.lang.String r8 = "__ii=? "
            java.lang.String[] r9 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            r12 = 0
            r13 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r4 = r14
            r6 = r2
            android.database.Cursor r4 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            if (r4 == 0) goto L60
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            if (r5 == 0) goto L60
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            r5.<init>()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            int r3 = r4.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            int r6 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r3 = r5
            goto L60
        L5c:
            r3 = r5
            goto L6c
        L5e:
            r3 = r5
            goto L6f
        L60:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            if (r4 == 0) goto L68
            r4.close()
        L68:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L94
            goto L94
        L6c:
            r0 = r3
            r3 = r4
            goto L78
        L6f:
            r0 = r3
            r3 = r4
            goto L84
        L72:
            r0 = r3
            goto L78
        L74:
            r0 = r3
            goto L84
        L76:
            r0 = r3
            r2 = r0
        L78:
            if (r3 == 0) goto L7d
            r3.close()
        L7d:
            if (r2 == 0) goto L80
            goto L90
        L80:
            r3 = r0
            goto L94
        L82:
            r0 = r3
            r2 = r0
        L84:
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L9e
            com.umeng.analytics.pro.h.a(r1)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L8e
            r3.close()
        L8e:
            if (r2 == 0) goto L80
        L90:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L80
            goto L80
        L94:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            return r3
        L9e:
            r0 = move-exception
            if (r3 == 0) goto La4
            r3.close()
        La4:
            if (r2 == 0) goto La9
            r2.endTransaction()     // Catch: java.lang.Throwable -> La9
        La9:
            android.content.Context r1 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.f():org.json.JSONObject");
    }

    public JSONObject b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        b(jSONObject, z);
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0190, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0182, code lost:
    
        if (r1 != null) goto L90;
     */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x01a5: IF  (r1 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:116:0x01aa, block:B:115:0x01a5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(org.json.JSONObject r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (r1 != null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r1 != null) goto L49;
     */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00a7: IF  (r1 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:53:0x00ac, block:B:52:0x00a7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(org.json.JSONObject r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            android.database.sqlite.SQLiteDatabase r1 = r1.a()     // Catch: java.lang.Throwable -> L79 android.database.sqlite.SQLiteDatabaseCorruptException -> L87
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            boolean r2 = android.text.TextUtils.isEmpty(r14)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            if (r2 != 0) goto L28
            java.lang.String r3 = "__er"
            java.lang.String r6 = "__i=? "
            java.lang.String[] r7 = new java.lang.String[]{r14}     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            r10 = 0
            r11 = 0
            r5 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            r4 = r1
            android.database.Cursor r14 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L88
            goto L37
        L28:
            java.lang.String r3 = "__er"
            r10 = 0
            r11 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r12
            r4 = r1
            android.database.Cursor r14 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L7a android.database.sqlite.SQLiteDatabaseCorruptException -> L88
        L37:
            if (r14 == 0) goto L6c
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            r0.<init>()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
        L3e:
            boolean r2 = r14.moveToNext()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            if (r2 == 0) goto L61
            java.lang.String r2 = "__a"
            int r2 = r14.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            java.lang.String r2 = r14.getString(r2)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            if (r3 != 0) goto L3e
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            java.lang.String r2 = r12.d(r2)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            r0.put(r3)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            goto L3e
        L61:
            int r2 = r0.length()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            if (r2 <= 0) goto L6c
            java.lang.String r2 = "error"
            r13.put(r2, r0)     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
        L6c:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L75 android.database.sqlite.SQLiteDatabaseCorruptException -> L77
            if (r14 == 0) goto L94
            r14.close()
            goto L94
        L75:
            r0 = r14
            goto L7a
        L77:
            r0 = r14
            goto L88
        L79:
            r1 = r0
        L7a:
            android.content.Context r13 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> La1
            com.umeng.analytics.pro.h.a(r13)     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L84
            r0.close()
        L84:
            if (r1 == 0) goto L97
            goto L94
        L87:
            r1 = r0
        L88:
            android.content.Context r13 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> La1
            com.umeng.analytics.pro.h.a(r13)     // Catch: java.lang.Throwable -> La1
            if (r0 == 0) goto L92
            r0.close()
        L92:
            if (r1 == 0) goto L97
        L94:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L97
        L97:
            android.content.Context r13 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r13 = com.umeng.analytics.pro.g.a(r13)
            r13.b()
            return
        La1:
            r13 = move-exception
            if (r0 == 0) goto La7
            r0.close()
        La7:
            if (r1 == 0) goto Lac
            r1.endTransaction()     // Catch: java.lang.Throwable -> Lac
        Lac:
            android.content.Context r14 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r14 = com.umeng.analytics.pro.g.a(r14)
            r14.b()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(org.json.JSONObject, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r2 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007d, code lost:
    
        if (r2 != null) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject g() {
        /*
            r14 = this;
            java.lang.String r0 = "__vc"
            java.lang.String r1 = "__av"
            java.util.List r2 = r14.i
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto Le
            return r3
        Le:
            android.content.Context r2 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteDatabaseCorruptException -> L82
            com.umeng.analytics.pro.g r2 = com.umeng.analytics.pro.g.a(r2)     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteDatabaseCorruptException -> L82
            android.database.sqlite.SQLiteDatabase r2 = r2.a()     // Catch: java.lang.Throwable -> L76 android.database.sqlite.SQLiteDatabaseCorruptException -> L82
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            java.util.List r4 = r14.i     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            r5 = 0
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            java.lang.String r5 = "__sd"
            java.lang.String r8 = "__ii=? "
            java.lang.String[] r9 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            r12 = 0
            r13 = 0
            r7 = 0
            r10 = 0
            r11 = 0
            r4 = r14
            r6 = r2
            android.database.Cursor r4 = r4.a(r5, r6, r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L72 android.database.sqlite.SQLiteDatabaseCorruptException -> L74
            if (r4 == 0) goto L60
            boolean r5 = r4.moveToNext()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            if (r5 == 0) goto L60
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            r5.<init>()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            int r3 = r4.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            java.lang.String r3 = r4.getString(r3)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            int r6 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            java.lang.String r6 = r4.getString(r6)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r5.put(r1, r3)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> L5c android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r3 = r5
            goto L60
        L5c:
            r3 = r5
            goto L6c
        L5e:
            r3 = r5
            goto L6f
        L60:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6c android.database.sqlite.SQLiteDatabaseCorruptException -> L6f
            if (r4 == 0) goto L68
            r4.close()
        L68:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L94
            goto L94
        L6c:
            r0 = r3
            r3 = r4
            goto L78
        L6f:
            r0 = r3
            r3 = r4
            goto L84
        L72:
            r0 = r3
            goto L78
        L74:
            r0 = r3
            goto L84
        L76:
            r0 = r3
            r2 = r0
        L78:
            if (r3 == 0) goto L7d
            r3.close()
        L7d:
            if (r2 == 0) goto L80
            goto L90
        L80:
            r3 = r0
            goto L94
        L82:
            r0 = r3
            r2 = r0
        L84:
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L9e
            com.umeng.analytics.pro.h.a(r1)     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L8e
            r3.close()
        L8e:
            if (r2 == 0) goto L80
        L90:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L80
            goto L80
        L94:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            return r3
        L9e:
            r0 = move-exception
            if (r3 == 0) goto La4
            r3.close()
        La4:
            if (r2 == 0) goto La9
            r2.endTransaction()     // Catch: java.lang.Throwable -> La9
        La9:
            android.content.Context r1 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.g():org.json.JSONObject");
    }

    private JSONArray b(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null && optJSONObject.optLong("duration") > 0) {
                jSONArray2.put(optJSONObject);
            }
        }
        return jSONArray2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0234, code lost:
    
        if (r12 != null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0225, code lost:
    
        if (r12 != null) goto L122;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0244: IF  (r10 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:130:0x0249, block:B:128:0x0244 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0249: IF  (r12 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:131:0x024e, block:B:130:0x0249 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0222  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(org.json.JSONObject r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d8, code lost:
    
        if (r1 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
    
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (r1 != null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(org.json.JSONObject r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(org.json.JSONObject, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0064, code lost:
    
        if (r0 == null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r6, boolean r7) {
        /*
            r5 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            if (r7 == 0) goto L18
            if (r6 == 0) goto L53
            java.lang.String r6 = "delete from __is"
            r0.execSQL(r6)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            goto L53
        L18:
            java.util.List r6 = r5.f77935l     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r7 = 0
            if (r6 <= 0) goto L4c
            r1 = 0
        L22:
            if (r7 >= r6) goto L4b
            java.util.List r2 = r5.f77935l     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.Object r2 = r2.get(r7)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            if (r2 != 0) goto L2f
            r1 = 1
        L2f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.<init>()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r4 = "delete from __is where __ii=\""
            r3.append(r4)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r3.append(r2)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r2 = "\""
            r3.append(r2)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            int r7 = r7 + 1
            goto L22
        L4b:
            r7 = r1
        L4c:
            if (r7 == 0) goto L53
            java.lang.String r6 = "delete from __is where __ii is null"
            r0.execSQL(r6)     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
        L53:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L57 android.database.sqlite.SQLiteDatabaseCorruptException -> L5f
            goto L66
        L57:
            android.content.Context r6 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L73
            com.umeng.analytics.pro.h.a(r6)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L69
            goto L66
        L5f:
            android.content.Context r6 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L73
            com.umeng.analytics.pro.h.a(r6)     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L69
        L66:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L69
        L69:
            android.content.Context r6 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r6 = com.umeng.analytics.pro.g.a(r6)
            r6.b()
            return
        L73:
            r6 = move-exception
            if (r0 == 0) goto L79
            r0.endTransaction()     // Catch: java.lang.Throwable -> L79
        L79:
            android.content.Context r7 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r7 = com.umeng.analytics.pro.g.a(r7)
            r7.b()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r0 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(boolean r3, boolean r4) {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            if (r4 == 0) goto L18
            if (r3 == 0) goto L4d
            java.lang.String r3 = "delete from __sd"
            r0.execSQL(r3)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            goto L4d
        L18:
            java.util.List r3 = r2.i     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            if (r3 <= 0) goto L4d
            r3 = 0
        L21:
            java.util.List r4 = r2.i     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            if (r3 >= r4) goto L4d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r4.<init>()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r1 = "delete from __sd where __ii=\""
            r4.append(r1)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.util.List r1 = r2.i     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r4.append(r1)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r1 = "\""
            r4.append(r1)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            r0.execSQL(r4)     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            int r3 = r3 + 1
            goto L21
        L4d:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L51 android.database.sqlite.SQLiteDatabaseCorruptException -> L54
            goto L5b
        L51:
            if (r0 == 0) goto L5e
            goto L5b
        L54:
            android.content.Context r3 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L68
            com.umeng.analytics.pro.h.a(r3)     // Catch: java.lang.Throwable -> L68
            if (r0 == 0) goto L5e
        L5b:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L5e
        L5e:
            android.content.Context r3 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r3 = com.umeng.analytics.pro.g.a(r3)
            r3.b()
            return
        L68:
            r3 = move-exception
            if (r0 == 0) goto L6e
            r0.endTransaction()     // Catch: java.lang.Throwable -> L6e
        L6e:
            android.content.Context r4 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)
            r4.b()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (r0 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            r4 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            java.util.List r1 = r4.j     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            if (r1 <= 0) goto L3c
            r1 = 0
        L17:
            java.util.List r2 = r4.j     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            if (r1 >= r2) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            r2.<init>()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            java.lang.String r3 = "delete from __et where rowid="
            r2.append(r3)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            java.util.List r3 = r4.j     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            r2.append(r3)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            int r1 = r1 + 1
            goto L17
        L3c:
            java.util.List r1 = r4.j     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            r1.clear()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L45 android.database.sqlite.SQLiteDatabaseCorruptException -> L48
            goto L4f
        L45:
            if (r0 == 0) goto L52
            goto L4f
        L48:
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L5c
            com.umeng.analytics.pro.h.a(r1)     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L52
        L4f:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L52
        L52:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            return
        L5c:
            r1 = move-exception
            if (r0 == 0) goto L62
            r0.endTransaction()     // Catch: java.lang.Throwable -> L62
        L62:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.h():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            r2 = this;
            r0 = 0
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L1b
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L1b
            android.database.sqlite.SQLiteDatabase r0 = r1.a()     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L1b
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L1b
            java.lang.String r1 = "delete from __er"
            r0.execSQL(r1)     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L1b
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L17 android.database.sqlite.SQLiteDatabaseCorruptException -> L1b
            goto L22
        L17:
            if (r0 == 0) goto L25
            goto L22
        L1b:
            android.content.Context r1 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L2f
            com.umeng.analytics.pro.h.a(r1)     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L25
        L22:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L25
        L25:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            return
        L2f:
            r1 = move-exception
            if (r0 == 0) goto L35
            r0.endTransaction()     // Catch: java.lang.Throwable -> L35
        L35:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.i():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r3 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            r6 = this;
            java.lang.String r0 = "\""
            java.lang.String r1 = "delete from __et where __i=\""
            java.lang.String r2 = "delete from __er where __i=\""
            java.lang.String r3 = r6.k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = 0
            if (r3 != 0) goto L73
            android.content.Context r3 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L4a android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            com.umeng.analytics.pro.g r3 = com.umeng.analytics.pro.g.a(r3)     // Catch: java.lang.Throwable -> L4a android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            android.database.sqlite.SQLiteDatabase r3 = r3.a()     // Catch: java.lang.Throwable -> L4a android.database.sqlite.SQLiteDatabaseCorruptException -> L4e
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r2 = r6.k     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r5.append(r2)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r5.append(r0)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r3.execSQL(r2)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r1 = r6.k     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r2.append(r1)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r2.append(r0)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L48 android.database.sqlite.SQLiteDatabaseCorruptException -> L4f
            goto L56
        L48:
            goto L4b
        L4a:
            r3 = r4
        L4b:
            if (r3 == 0) goto L59
            goto L56
        L4e:
            r3 = r4
        L4f:
            android.content.Context r0 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L63
            com.umeng.analytics.pro.h.a(r0)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L59
        L56:
            r3.endTransaction()     // Catch: java.lang.Throwable -> L59
        L59:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            goto L73
        L63:
            r0 = move-exception
            if (r3 == 0) goto L69
            r3.endTransaction()     // Catch: java.lang.Throwable -> L69
        L69:
            android.content.Context r1 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r1 = com.umeng.analytics.pro.g.a(r1)
            r1.b()
            throw r0
        L73:
            r6.k = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.j():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r3 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r6 = "\""
            java.lang.String r0 = "delete from __sd where __ii=\""
            java.lang.String r1 = "delete from __et where __i=\""
            java.lang.String r2 = "delete from __er where __i=\""
            r3 = 0
            android.content.Context r4 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            android.database.sqlite.SQLiteDatabase r3 = r4.a()     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r3.beginTransaction()     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            if (r4 != 0) goto L57
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r4.append(r7)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r4.append(r6)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r3.execSQL(r2)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r2.append(r7)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r2.append(r6)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r3.execSQL(r1)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            java.util.List r1 = r5.j     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r1.clear()     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r1.append(r7)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r1.append(r6)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            r3.execSQL(r6)     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
        L57:
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L5b android.database.sqlite.SQLiteDatabaseCorruptException -> L5e
            goto L65
        L5b:
            if (r3 == 0) goto L68
            goto L65
        L5e:
            android.content.Context r6 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L72
            com.umeng.analytics.pro.h.a(r6)     // Catch: java.lang.Throwable -> L72
            if (r3 == 0) goto L68
        L65:
            r3.endTransaction()     // Catch: java.lang.Throwable -> L68
        L68:
            android.content.Context r6 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r6 = com.umeng.analytics.pro.g.a(r6)
            r6.b()
            return
        L72:
            r6 = move-exception
            if (r3 == 0) goto L78
            r3.endTransaction()     // Catch: java.lang.Throwable -> L78
        L78:
            android.content.Context r7 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r7 = com.umeng.analytics.pro.g.a(r7)
            r7.b()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.a(boolean, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        if (r1 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = "delete from __is where __ii=\""
            r1 = 0
            android.content.Context r2 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
            com.umeng.analytics.pro.g r2 = com.umeng.analytics.pro.g.a(r2)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
            android.database.sqlite.SQLiteDatabase r1 = r2.a()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
            if (r2 != 0) goto L2a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
            r2.append(r4)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
            java.lang.String r4 = "\""
            r2.append(r4)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
            r1.execSQL(r4)     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
        L2a:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2e android.database.sqlite.SQLiteDatabaseCorruptException -> L31
            goto L38
        L2e:
            if (r1 == 0) goto L3b
            goto L38
        L31:
            android.content.Context r4 = com.umeng.analytics.pro.i.d     // Catch: java.lang.Throwable -> L45
            com.umeng.analytics.pro.h.a(r4)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L3b
        L38:
            r1.endTransaction()     // Catch: java.lang.Throwable -> L3b
        L3b:
            android.content.Context r4 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r4 = com.umeng.analytics.pro.g.a(r4)
            r4.b()
            return
        L45:
            r4 = move-exception
            if (r1 == 0) goto L4b
            r1.endTransaction()     // Catch: java.lang.Throwable -> L4b
        L4b:
            android.content.Context r0 = com.umeng.analytics.pro.i.d
            com.umeng.analytics.pro.g r0 = com.umeng.analytics.pro.g.a(r0)
            r0.b()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.i.b(java.lang.String):void");
    }

    private void l() {
        try {
            if (TextUtils.isEmpty(e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(d, "ek__id");
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(d).getString("ek__id", null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(d, "ek__id", multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String substring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < substring.length(); i++) {
                        char charAt = substring.charAt(i);
                        if (Character.isDigit(charAt)) {
                            if (Integer.parseInt(Character.toString(charAt)) == 0) {
                                sb.append(0);
                            } else {
                                sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                            }
                        } else {
                            sb.append(charAt);
                        }
                    }
                    e = sb.toString();
                }
                if (TextUtils.isEmpty(e)) {
                    return;
                }
                e += new StringBuilder(e).reverse().toString();
                String multiProcessSP2 = UMUtils.getMultiProcessSP(d, "ek_key");
                if (TextUtils.isEmpty(multiProcessSP2)) {
                    UMUtils.setMultiProcessSP(d, "ek_key", c("umeng+"));
                } else {
                    if ("umeng+".equals(d(multiProcessSP2))) {
                        return;
                    }
                    b(true, false);
                    a(true, false);
                    h();
                    i();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public String c(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    public String d(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), e.getBytes()));
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return null;
        }
    }
}

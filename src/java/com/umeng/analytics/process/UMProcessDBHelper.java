package com.umeng.analytics.process;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.umeng.analytics.process.DBFileTraversalUtil;
import com.umeng.analytics.process.a;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class UMProcessDBHelper {
    public static UMProcessDBHelper mInstance;
    public Context mContext;
    public FileLockUtil mFileLock = new FileLockUtil();
    public InsertEventCallback ekvCallBack = new InsertEventCallback();

    private int getDataSource() {
        return 0;
    }

    public class InsertEventCallback implements FileLockCallback {
        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) {
            return false;
        }

        public InsertEventCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith(com.umeng.analytics.process.a.c)) {
                str = str.replaceFirst(com.umeng.analytics.process.a.c, "");
            }
            UMProcessDBHelper.this.insertEvents(str.replace(com.umeng.analytics.process.a.d, ""), (JSONArray) obj);
            return true;
        }
    }

    public UMProcessDBHelper() {
    }

    public UMProcessDBHelper(Context context) {
        com.umeng.common.a.a().a(context);
    }

    public static UMProcessDBHelper getInstance(Context context) {
        if (mInstance == null) {
            synchronized (UMProcessDBHelper.class) {
                if (mInstance == null) {
                    mInstance = new UMProcessDBHelper(context);
                }
            }
        }
        UMProcessDBHelper uMProcessDBHelper = mInstance;
        uMProcessDBHelper.mContext = context;
        return uMProcessDBHelper;
    }

    public void createDBByProcess(String str) {
        try {
            c.a(this.mContext).a(str);
            c.a(this.mContext).b(str);
        } catch (Exception unused) {
        }
    }

    public void insertEventsInSubProcess(String str, JSONArray jSONArray) {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            File file = new File(b.b(this.mContext, str));
            if (file.exists()) {
                this.mFileLock.doFileOperateion(file, this.ekvCallBack, jSONArray);
            } else {
                insertEvents(str, jSONArray);
            }
        }
    }

    public void insertEvents(String str, JSONArray jSONArray) {
        if (AnalyticsConstants.SUB_PROCESS_EVENT && !TextUtils.isEmpty(str)) {
            insertEvents_(str, datasAdapter(str, jSONArray));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processToMain(String str) {
        if (dbIsExists(str)) {
            List readEventByProcess = readEventByProcess(str);
            if (!readEventByProcess.isEmpty() && insertEvents_(com.umeng.analytics.process.a.h, readEventByProcess)) {
                deleteEventDatas(str, null, readEventByProcess);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0187 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public org.json.JSONObject readMainEvents(long r20, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.readMainEvents(long, java.util.List):org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void deleteMainProcessEventDatasByIds(java.util.List r6) {
        /*
            r5 = this;
            java.lang.String r0 = "_main_"
            r1 = 0
            android.content.Context r2 = r5.mContext     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
            com.umeng.analytics.process.c r2 = com.umeng.analytics.process.c.a(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
            android.database.sqlite.SQLiteDatabase r1 = r2.a(r0)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
            r1.beginTransaction()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
        L14:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
            if (r2 == 0) goto L30
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
            java.lang.String r3 = "__et_p"
            java.lang.String r4 = "id=?"
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
            r1.delete(r3, r4, r2)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
            goto L14
        L30:
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L44
            goto L46
        L34:
            r6 = move-exception
            if (r1 == 0) goto L3a
            r1.endTransaction()
        L3a:
            android.content.Context r1 = r5.mContext
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.c.a(r1)
            r1.b(r0)
            throw r6
        L44:
            if (r1 == 0) goto L49
        L46:
            r1.endTransaction()
        L49:
            android.content.Context r6 = r5.mContext
            com.umeng.analytics.process.c r6 = com.umeng.analytics.process.c.a(r6)
            r6.b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.deleteMainProcessEventDatasByIds(java.util.List):void");
    }

    public void deleteEventDatas(String str, String str2, List list) {
        SQLiteDatabase a2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            a2 = c.a(this.mContext).a(str);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            a2.beginTransaction();
            int size = list.size();
            if (size > 0) {
                for (int i = 0; i < size; i++) {
                    a2.execSQL("delete from __et_p where rowid=" + ((a) list.get(i)).a);
                }
            } else {
                a2.delete(a.InterfaceC0037a.a, null, null);
            }
            a2.setTransactionSuccessful();
            a2.endTransaction();
        } catch (Exception unused2) {
            sQLiteDatabase = a2;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            c.a(this.mContext).b(str);
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = a2;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.endTransaction();
            }
            c.a(this.mContext).b(str);
            throw th;
        }
        c.a(this.mContext).b(str);
    }

    private boolean insertEvents_(String str, List list) {
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return true;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase a2 = c.a(this.mContext).a(str);
            try {
                try {
                    a2.beginTransaction();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        a aVar = (a) it.next();
                        try {
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("__i", aVar.b);
                            contentValues.put("__e", aVar.c);
                            contentValues.put("__t", Integer.valueOf(aVar.e));
                            contentValues.put(a.InterfaceC0037a.f, aVar.f);
                            contentValues.put("__av", aVar.g);
                            contentValues.put("__vc", aVar.h);
                            contentValues.put("__s", aVar.d);
                            a2.insert(a.InterfaceC0037a.a, null, contentValues);
                        } catch (Exception unused) {
                        }
                    }
                    a2.setTransactionSuccessful();
                    try {
                        a2.endTransaction();
                    } catch (Throwable unused2) {
                    }
                    c.a(this.mContext).b(str);
                    return true;
                } catch (Exception unused3) {
                    sQLiteDatabase = a2;
                    if (sQLiteDatabase != null) {
                        try {
                            sQLiteDatabase.endTransaction();
                        } catch (Throwable unused4) {
                        }
                    }
                    c.a(this.mContext).b(str);
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase = a2;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteDatabase.endTransaction();
                    } catch (Throwable unused5) {
                    }
                }
                c.a(this.mContext).b(str);
                throw th;
            }
        } catch (Exception unused6) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private List datasAdapter(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    a aVar = new a();
                    aVar.c = jSONObject.optString("id");
                    aVar.g = UMUtils.getAppVersionName(this.mContext);
                    aVar.h = UMUtils.getAppVersionCode(this.mContext);
                    aVar.b = jSONObject.optString("__i");
                    aVar.e = jSONObject.optInt("__t");
                    aVar.f = str;
                    if (jSONObject.has("ds")) {
                        jSONObject.remove("ds");
                    }
                    jSONObject.put("ds", getDataSource());
                    jSONObject.remove("__i");
                    jSONObject.remove("__t");
                    aVar.d = com.umeng.common.a.a().a(jSONObject.toString());
                    jSONObject.remove("ds");
                    arrayList.add(aVar);
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }

    public JSONObject readVersionInfoFromColumId(Integer num) {
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        JSONObject jSONObject;
        Cursor cursor = null;
        r3 = null;
        JSONObject jSONObject2 = null;
        JSONObject jSONObject3 = null;
        r3 = null;
        cursor = null;
        Cursor cursor2 = null;
        try {
            sQLiteDatabase = c.a(this.mContext).a(com.umeng.analytics.process.a.h);
            try {
                sQLiteDatabase.beginTransaction();
                Cursor query = sQLiteDatabase.query(a.InterfaceC0037a.a, null, "rowid=?", new String[]{String.valueOf(num)}, null, null, null);
                if (query != null) {
                    try {
                        try {
                            if (query.moveToNext()) {
                                JSONObject jSONObject4 = new JSONObject();
                                try {
                                    String string = query.getString(query.getColumnIndex("__av"));
                                    String string2 = query.getString(query.getColumnIndex("__vc"));
                                    if (!TextUtils.isEmpty(string)) {
                                        jSONObject4.put("__av", string);
                                    }
                                    if (!TextUtils.isEmpty(string2)) {
                                        jSONObject4.put("__vc", string2);
                                    }
                                    jSONObject3 = jSONObject4;
                                } catch (Exception unused) {
                                    jSONObject2 = jSONObject4;
                                    JSONObject jSONObject5 = jSONObject2;
                                    cursor2 = query;
                                    jSONObject = jSONObject5;
                                    if (cursor2 != null) {
                                        try {
                                            cursor2.close();
                                        } catch (Exception unused2) {
                                            c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                                            return jSONObject;
                                        }
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                    c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                                    return jSONObject;
                                }
                            }
                        } catch (Exception unused3) {
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            try {
                                cursor.close();
                            } catch (Exception unused4) {
                                c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                                throw th;
                            }
                        }
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.endTransaction();
                        }
                        c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                        throw th;
                    }
                }
                if (query != null) {
                    try {
                        query.close();
                    } catch (Exception unused5) {
                    }
                }
                sQLiteDatabase.endTransaction();
                c.a(this.mContext).b(com.umeng.analytics.process.a.h);
                return jSONObject3;
            } catch (Exception unused6) {
                jSONObject = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception unused7) {
            jSONObject = null;
            sQLiteDatabase = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b7, code lost:
    
        if (r2 != null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.umeng.analytics.process.UMProcessDBHelper$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List readEventByProcess(java.lang.String r12) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            android.content.Context r2 = r11.mContext     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> Lb1
            com.umeng.analytics.process.c r2 = com.umeng.analytics.process.c.a(r2)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> Lb1
            android.database.sqlite.SQLiteDatabase r2 = r2.a(r12)     // Catch: java.lang.Throwable -> L9b java.lang.Exception -> Lb1
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            java.lang.String r4 = "__et_p"
            r9 = 0
            r10 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r3 = r2
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L97 java.lang.Exception -> L99
            if (r3 == 0) goto L91
        L22:
            boolean r4 = r3.moveToNext()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            if (r4 == 0) goto L91
            com.umeng.analytics.process.UMProcessDBHelper$a r4 = new com.umeng.analytics.process.UMProcessDBHelper$a     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r4.<init>()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r5 = 0
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r4.a = r5     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = "__i"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r4.b = r5     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = "__e"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r4.c = r5     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = "__s"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r4.d = r5     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = "__t"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            int r5 = r3.getInt(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r4.e = r5     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = "__pn"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r4.f = r5     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = "__av"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r4.g = r5     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = "__vc"
            int r5 = r3.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r4.h = r5     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r0.add(r4)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            goto L22
        L8c:
            r0 = move-exception
            r1 = r3
            goto L9d
        L8f:
            r1 = r3
            goto Lb2
        L91:
            if (r3 == 0) goto Lb9
            r3.close()     // Catch: java.lang.Exception -> Lbc
            goto Lb9
        L97:
            r0 = move-exception
            goto L9d
        L99:
            goto Lb2
        L9b:
            r0 = move-exception
            r2 = r1
        L9d:
            if (r1 == 0) goto La2
            r1.close()     // Catch: java.lang.Exception -> La7
        La2:
            if (r2 == 0) goto La7
            r2.endTransaction()     // Catch: java.lang.Exception -> La7
        La7:
            android.content.Context r1 = r11.mContext
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.c.a(r1)
            r1.b(r12)
            throw r0
        Lb1:
            r2 = r1
        Lb2:
            if (r1 == 0) goto Lb7
            r1.close()     // Catch: java.lang.Exception -> Lbc
        Lb7:
            if (r2 == 0) goto Lbc
        Lb9:
            r2.endTransaction()     // Catch: java.lang.Exception -> Lbc
        Lbc:
            android.content.Context r1 = r11.mContext
            com.umeng.analytics.process.c r1 = com.umeng.analytics.process.c.a(r1)
            r1.b(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.process.UMProcessDBHelper.readEventByProcess(java.lang.String):java.util.List");
    }

    private boolean dbIsExists(String str) {
        try {
            return new File(b.b(this.mContext, str)).exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public class a implements Serializable {
        public int a;
        public String b;
        public String c;
        public String d;
        public int e;
        public String f;
        public String g;
        public String h;

        public a() {
        }
    }

    public class ProcessToMainCallback implements FileLockCallback {
        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(File file, int i) {
            return false;
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str, Object obj) {
            return false;
        }

        public ProcessToMainCallback() {
        }

        @Override // com.umeng.commonsdk.utils.FileLockCallback
        public boolean onFileLock(String str) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            if (str.startsWith(com.umeng.analytics.process.a.c)) {
                str = str.replaceFirst(com.umeng.analytics.process.a.c, "");
            }
            UMProcessDBHelper.this.processToMain(str.replace(com.umeng.analytics.process.a.d, ""));
            return true;
        }
    }

    public void processDBToMain() {
        try {
            DBFileTraversalUtil.traverseDBFiles(b.a(this.mContext), new ProcessToMainCallback(), new DBFileTraversalUtil.a() { // from class: com.umeng.analytics.process.UMProcessDBHelper.1
                @Override // com.umeng.analytics.process.DBFileTraversalUtil.a
                public void a() {
                    if (AnalyticsConstants.SUB_PROCESS_EVENT) {
                        UMWorkDispatch.sendEvent(UMProcessDBHelper.this.mContext, UMProcessDBDatasSender.UM_PROCESS_CONSTRUCTMESSAGE, UMProcessDBDatasSender.getInstance(UMProcessDBHelper.this.mContext), null);
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    private boolean processIsService(Context context) {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, this.mContext.getClass()), 0) != null;
    }
}

package com.tencent.mm.opensdk.openapi;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.alipay.sdk.m.u0.b;
import com.tencent.mm.opensdk.utils.c;
import com.umeng.analytics.pro.aq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import l.C8954;

/* loaded from: classes.dex */
public class MMSharedPreferences implements SharedPreferences {
    public static final String TAG = "MicroMsg.SDK.SharedPreferences";
    public final ContentResolver cr;
    public final String[] columns = {aq.d, "key", "type", b.d};
    public final HashMap values = new HashMap();
    public REditor editor = null;

    public class REditor implements SharedPreferences.Editor {
        public ContentResolver cr;
        public Map values = new HashMap();
        public Set remove = new HashSet();
        public boolean clear = false;

        public REditor(ContentResolver contentResolver) {
            this.cr = contentResolver;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[SYNTHETIC] */
        @Override // android.content.SharedPreferences.Editor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean commit() {
            /*
                r8 = this;
                android.content.ContentValues r0 = new android.content.ContentValues
                r0.<init>()
                boolean r1 = r8.clear
                r2 = 0
                if (r1 == 0) goto L14
                android.content.ContentResolver r1 = r8.cr
                android.net.Uri r3 = com.tencent.mm.opensdk.utils.c.b.CONTENT_URI
                r4 = 0
                r1.delete(r3, r4, r4)
                r8.clear = r2
            L14:
                java.util.Set r1 = r8.remove
                java.util.Iterator r1 = r1.iterator()
            L1a:
                boolean r2 = r1.hasNext()
                java.lang.String r3 = "key = ?"
                if (r2 == 0) goto L34
                java.lang.Object r2 = r1.next()
                java.lang.String r2 = (java.lang.String) r2
                android.content.ContentResolver r4 = r8.cr
                android.net.Uri r5 = com.tencent.mm.opensdk.utils.c.b.CONTENT_URI
                java.lang.String[] r2 = new java.lang.String[]{r2}
                r4.delete(r5, r3, r2)
                goto L1a
            L34:
                java.util.Map r1 = r8.values
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L3e:
                boolean r2 = r1.hasNext()
                r4 = 1
                if (r2 == 0) goto Lba
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r5 = r2.getValue()
                java.lang.String r6 = "MicroMsg.SDK.PluginProvider.Resolver"
                if (r5 != 0) goto L56
                java.lang.String r4 = "unresolve failed, null value"
                goto L8f
            L56:
                boolean r7 = r5 instanceof java.lang.Integer
                if (r7 == 0) goto L5b
                goto L93
            L5b:
                boolean r4 = r5 instanceof java.lang.Long
                if (r4 == 0) goto L61
                r4 = 2
                goto L93
            L61:
                boolean r4 = r5 instanceof java.lang.String
                if (r4 == 0) goto L67
                r4 = 3
                goto L93
            L67:
                boolean r4 = r5 instanceof java.lang.Boolean
                if (r4 == 0) goto L6d
                r4 = 4
                goto L93
            L6d:
                boolean r4 = r5 instanceof java.lang.Float
                if (r4 == 0) goto L73
                r4 = 5
                goto L93
            L73:
                boolean r4 = r5 instanceof java.lang.Double
                if (r4 == 0) goto L79
                r4 = 6
                goto L93
            L79:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r7 = "unresolve failed, unknown type="
                r4.<init>(r7)
                java.lang.Class r7 = r5.getClass()
                java.lang.String r7 = r7.toString()
                r4.append(r7)
                java.lang.String r4 = r4.toString()
            L8f:
                com.tencent.mm.opensdk.utils.Log.e(r6, r4)
                r4 = 0
            L93:
                if (r4 != 0) goto L96
                goto L3e
            L96:
                java.lang.String r6 = "type"
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r0.put(r6, r4)
                java.lang.String r4 = "value"
                java.lang.String r5 = r5.toString()
                r0.put(r4, r5)
                android.content.ContentResolver r4 = r8.cr
                android.net.Uri r5 = com.tencent.mm.opensdk.utils.c.b.CONTENT_URI
                java.lang.Object r2 = r2.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String[] r2 = new java.lang.String[]{r2}
                r4.update(r5, r0, r3, r2)
                goto L3e
            Lba:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.openapi.MMSharedPreferences.REditor.commit():boolean");
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.values.put(str, Boolean.valueOf(z));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            this.values.put(str, Float.valueOf(f));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            this.values.put(str, Integer.valueOf(i));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j) {
            this.values.put(str, Long.valueOf(j));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set set) {
            return null;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            this.remove.add(str);
            return this;
        }
    }

    public MMSharedPreferences(Context context) {
        this.cr = context.getContentResolver();
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return getValue(str) != null;
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new REditor(this.cr);
        }
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Boolean)) ? z : ((Boolean) value).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Float)) ? f : ((Float) value).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Integer)) ? i : ((Integer) value).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        Object value = getValue(str);
        return (value == null || !(value instanceof Long)) ? j : ((Long) value).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        Object value = getValue(str);
        return (value == null || !(value instanceof String)) ? str2 : (String) value;
    }

    @Override // android.content.SharedPreferences
    public Set getStringSet(String str, Set set) {
        return null;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public Map getAll() {
        try {
            Cursor query = this.cr.query(c.b.CONTENT_URI, this.columns, null, null, null);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("key");
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex(b.d);
            while (query.moveToNext()) {
                this.values.put(query.getString(columnIndex), c.a.a(query.getInt(columnIndex2), query.getString(columnIndex3)));
            }
            query.close();
            return this.values;
        } catch (Exception e) {
            C8954.m23075(e, new StringBuilder("getAll exception:"), TAG);
            return this.values;
        }
    }

    private Object getValue(String str) {
        try {
            Cursor query = this.cr.query(c.b.CONTENT_URI, this.columns, "key = ?", new String[]{str}, null);
            if (query == null) {
                return null;
            }
            Object a = query.moveToFirst() ? c.a.a(query.getInt(query.getColumnIndex("type")), query.getString(query.getColumnIndex(b.d))) : null;
            query.close();
            return a;
        } catch (Exception e) {
            C8954.m23075(e, new StringBuilder("getValue exception:"), TAG);
            return null;
        }
    }
}

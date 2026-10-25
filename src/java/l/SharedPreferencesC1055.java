package l;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: 97B5 */
/* renamed from: l.֨ۤۡ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class SharedPreferencesC1055 implements SharedPreferences {

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Object f3888 = new Object();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f3890 = new Object();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f3891 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f3889 = new LinkedHashSet();

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        Map unmodifiableMap;
        synchronized (this.f3890) {
            HashMap hashMap = new HashMap(this.f3891.size());
            for (Map.Entry entry : this.f3891.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Set) {
                    value = new HashSet((Set) value);
                }
                hashMap.put(str, value);
            }
            unmodifiableMap = C20195.unmodifiableMap(hashMap);
        }
        return unmodifiableMap;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        synchronized (this.f3890) {
            Object obj = this.f3891.get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        synchronized (this.f3890) {
            Object obj = this.f3891.get(str);
            if (!(obj instanceof Set)) {
                return set;
            }
            return new HashSet((Set) obj);
        }
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        synchronized (this.f3890) {
            Object obj = this.f3891.get(str);
            if (obj instanceof Integer) {
                i = ((Integer) obj).intValue();
            }
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        synchronized (this.f3890) {
            Object obj = this.f3891.get(str);
            if (obj instanceof Long) {
                j = ((Long) obj).longValue();
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        synchronized (this.f3890) {
            Object obj = this.f3891.get(str);
            if (obj instanceof Float) {
                f = ((Float) obj).floatValue();
            }
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        synchronized (this.f3890) {
            Object obj = this.f3891.get(str);
            if (obj instanceof Boolean) {
                z = ((Boolean) obj).booleanValue();
            }
        }
        return z;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        boolean containsKey;
        synchronized (this.f3890) {
            containsKey = this.f3891.containsKey(str);
        }
        return containsKey;
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new SharedPreferencesEditorC5289(this);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f3890) {
            this.f3889.add(onSharedPreferenceChangeListener);
        }
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this.f3890) {
            this.f3889.remove(onSharedPreferenceChangeListener);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3626(SharedPreferencesC1055 sharedPreferencesC1055, boolean z, HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        synchronized (sharedPreferencesC1055.f3890) {
            if (z) {
                if (!sharedPreferencesC1055.f3891.isEmpty()) {
                    arrayList.addAll(sharedPreferencesC1055.f3891.keySet());
                    sharedPreferencesC1055.f3891.clear();
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != f3888) {
                    if (value instanceof Set) {
                        value = new HashSet((Set) value);
                    }
                    if (!C11003.equals(sharedPreferencesC1055.f3891.put(str, value), value)) {
                        arrayList.add(str);
                    }
                } else if (sharedPreferencesC1055.f3891.containsKey(str)) {
                    sharedPreferencesC1055.f3891.remove(str);
                    arrayList.add(str);
                }
            }
            if (!arrayList.isEmpty() && !sharedPreferencesC1055.f3889.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(sharedPreferencesC1055.f3889);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        ((SharedPreferences.OnSharedPreferenceChangeListener) it2.next()).onSharedPreferenceChanged(sharedPreferencesC1055, str2);
                    }
                }
            }
        }
    }
}

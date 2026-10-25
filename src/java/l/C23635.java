package l;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import bin.mt.plus.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: DB1F */
/* renamed from: l.᩻ۤۧ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23635 {

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Object f76576 = new Object();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static volatile C23635 f76577;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f76578;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashSet f76579 = new HashSet();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f76580 = new HashMap();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m52131() {
        Object obj;
        synchronized (f76576) {
            obj = this.f76580.get(C15118.class);
            if (obj == null) {
                obj = m52129(C15118.class, new HashSet());
            }
        }
        return obj;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m52133() {
        return this.f76579.contains(C15118.class);
    }

    public C23635(Context context) {
        this.f76578 = context.getApplicationContext();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23635 m52130(Context context) {
        if (f76577 == null) {
            synchronized (f76576) {
                if (f76577 == null) {
                    f76577 = new C23635(context);
                }
            }
        }
        return f76577;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m52129(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f76580;
        if (C10230.m25858()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (!hashMap.containsKey(cls)) {
            hashSet.add(cls);
            try {
                InterfaceC20814 interfaceC20814 = (InterfaceC20814) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> mo35813 = interfaceC20814.mo35813();
                if (!mo35813.isEmpty()) {
                    for (Class cls2 : mo35813) {
                        if (!hashMap.containsKey(cls2)) {
                            m52129(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC20814.mo35812(this.f76578);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th) {
                throw new C9525(th);
            }
        } else {
            obj = hashMap.get(cls);
        }
        return obj;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52132(Bundle bundle) {
        HashSet hashSet;
        String string = this.f76578.getString(R.string.MT_Protector_res_0x7f12004c);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f76579;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC20814.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m52129((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new C9525(e);
            }
        }
    }
}

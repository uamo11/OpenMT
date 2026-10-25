package l;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: M1H2 */
/* renamed from: l.ۧܺ֫, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C11092 {

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f33284 = 0;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Class[] f33285 = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f33286;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f33287;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f33288;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap f33289;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8174 f33290;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bundle m27520(C11092 c11092) {
        LinkedHashMap linkedHashMap = c11092.f33288;
        Iterator it = C0501.m2174(c11092.f33289).entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                Set<String> keySet = linkedHashMap.keySet();
                ArrayList arrayList = new ArrayList(keySet.size());
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                for (String str : keySet) {
                    arrayList.add(str);
                    arrayList2.add(linkedHashMap.get(str));
                }
                return C17336.m40666(new C15818("keys", arrayList), new C15818("values", arrayList2));
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            Bundle mo1940 = ((InterfaceC8174) entry.getValue()).mo1940();
            C11233.m27805(str2, "key");
            if (mo1940 != null) {
                for (int i = 0; i < 29; i++) {
                    Class cls = f33285[i];
                    C11233.m27799(cls);
                    if (!cls.isInstance(mo1940)) {
                    }
                }
                throw new IllegalArgumentException("Can't put value with type " + mo1940.getClass() + " into saved state");
            }
            Object obj = c11092.f33287.get(str2);
            C5242 c5242 = obj instanceof C5242 ? (C5242) obj : null;
            if (c5242 != null) {
                c5242.mo1669(mo1940);
            } else {
                linkedHashMap.put(str2, mo1940);
            }
            InterfaceC15174 interfaceC15174 = (InterfaceC15174) c11092.f33286.get(str2);
            if (interfaceC15174 != null) {
                interfaceC15174.m35877();
            }
        }
    }

    public C11092(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f33288 = linkedHashMap;
        this.f33289 = new LinkedHashMap();
        this.f33287 = new LinkedHashMap();
        this.f33286 = new LinkedHashMap();
        this.f33290 = new InterfaceC8174() { // from class: l.۟ۡ֫
            @Override // l.InterfaceC8174
            /* renamed from: ֫ */
            public final Bundle mo1940() {
                return C11092.m27520(C11092.this);
            }
        };
        linkedHashMap.putAll(hashMap);
    }

    public C11092() {
        this.f33288 = new LinkedHashMap();
        this.f33289 = new LinkedHashMap();
        this.f33287 = new LinkedHashMap();
        this.f33286 = new LinkedHashMap();
        this.f33290 = new InterfaceC8174() { // from class: l.۟ۡ֫
            @Override // l.InterfaceC8174
            /* renamed from: ֫ */
            public final Bundle mo1940() {
                return C11092.m27520(C11092.this);
            }
        };
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8174 m27521() {
        return this.f33290;
    }
}

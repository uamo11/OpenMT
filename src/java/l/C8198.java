package l;

import bin.mt.plus.R;
import com.tencent.mm.opensdk.modelmsg.WXNativeGamePageObject;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Predicate;

/* compiled from: 6AK0 */
/* renamed from: l.۠۬ܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8198 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21696(String str, String str2, HashMap hashMap, final HashMap hashMap2, final InterfaceC8693 interfaceC8693) {
        boolean z;
        Iterator it;
        C5376 c5376;
        ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        final ArrayList arrayList7 = new ArrayList();
        final InterfaceC1142 interfaceC1142 = new InterfaceC1142() { // from class: l.ܳ۬ܿ
            @Override // l.InterfaceC1142
            public final boolean test(Object obj, Object obj2) {
                String str3 = (String) obj;
                AbstractC0436 abstractC0436 = (AbstractC0436) obj2;
                if (!abstractC0436.f1922.endsWith("/")) {
                    return false;
                }
                if (hashMap2.remove(str3) != null) {
                    return true;
                }
                arrayList3.add(abstractC0436.f1922);
                return true;
            }
        };
        C5378.removeIf(hashMap.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return InterfaceC1142.this.test(entry.getKey(), entry.getValue());
            }
        });
        final InterfaceC1142 interfaceC11422 = new InterfaceC1142() { // from class: l.᩻۬ܿ
            @Override // l.InterfaceC1142
            public final boolean test(Object obj, Object obj2) {
                AbstractC0436 abstractC0436 = (AbstractC0436) obj2;
                if (!abstractC0436.f1922.endsWith("/")) {
                    return false;
                }
                arrayList4.add(abstractC0436.f1922);
                return true;
            }
        };
        C5378.removeIf(hashMap2.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return InterfaceC1142.this.test(entry.getKey(), entry.getValue());
            }
        });
        final InterfaceC1142 interfaceC11423 = new InterfaceC1142() { // from class: l.ۜ۬ܿ
            @Override // l.InterfaceC1142
            public final boolean test(Object obj, Object obj2) {
                AbstractC0436 abstractC0436 = (AbstractC0436) obj2;
                AbstractC0436 abstractC04362 = (AbstractC0436) hashMap2.remove((String) obj);
                if (abstractC04362 == null) {
                    return false;
                }
                if (abstractC0436.f1923.equals(abstractC04362.f1923)) {
                    arrayList7.add(new C5376(abstractC0436, abstractC04362));
                    return true;
                }
                arrayList2.add(abstractC0436.f1922);
                return true;
            }
        };
        C5378.removeIf(hashMap.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return InterfaceC1142.this.test(entry.getKey(), entry.getValue());
            }
        });
        HashMap hashMap3 = new HashMap();
        for (AbstractC0436 abstractC0436 : hashMap.values()) {
            ((C19488) C13843.computeIfAbsent(hashMap3, abstractC0436.f1923, new C20899())).f62984.add(abstractC0436);
        }
        for (AbstractC0436 abstractC04362 : hashMap2.values()) {
            ((C19488) C13843.computeIfAbsent(hashMap3, abstractC04362.f1923, new C9610())).f62985.add(abstractC04362);
        }
        for (C19488 c19488 : hashMap3.values()) {
            Collections.sort(c19488.f62984);
            Collections.sort(c19488.f62985);
        }
        final InterfaceC1142 interfaceC11424 = new InterfaceC1142() { // from class: l.ۡ۬ܿ
            @Override // l.InterfaceC1142
            public final boolean test(Object obj, Object obj2) {
                C19488 c194882 = (C19488) obj2;
                ArrayList arrayList8 = c194882.f62984;
                ArrayList arrayList9 = c194882.f62985;
                if (arrayList8.isEmpty()) {
                    Iterator it2 = arrayList9.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((AbstractC0436) it2.next()).f1922);
                    }
                    return true;
                }
                if (!arrayList9.isEmpty()) {
                    Collections.sort(arrayList8);
                    Collections.sort(arrayList9);
                    return false;
                }
                Iterator it3 = arrayList8.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((AbstractC0436) it3.next()).f1922);
                }
                return true;
            }
        };
        C5378.removeIf(hashMap3.entrySet(), new Predicate() { // from class: l.ᩴ۬ܿ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                return InterfaceC1142.this.test(entry.getKey(), entry.getValue());
            }
        });
        ArrayList arrayList8 = new ArrayList();
        Iterator it2 = arrayList7.iterator();
        while (it2.hasNext()) {
            C5376 c53762 = (C5376) it2.next();
            arrayList8.add(c53762.f16727);
            arrayList8.add(c53762.f16728);
        }
        for (C19488 c194882 : hashMap3.values()) {
            arrayList8.addAll(c194882.f62984);
            arrayList8.addAll(c194882.f62985);
        }
        Iterator it3 = arrayList8.iterator();
        long j = 0;
        while (it3.hasNext()) {
            j += ((AbstractC0436) it3.next()).f1921;
            arrayList3 = arrayList3;
            arrayList4 = arrayList4;
        }
        ArrayList arrayList9 = arrayList3;
        ArrayList arrayList10 = arrayList4;
        final C19277 c19277 = new C19277(j);
        c19277.m44459(interfaceC8693);
        final AtomicReference atomicReference = new AtomicReference();
        ExecutorService executorService = C1802.f6211;
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(C17615.f53826);
        Iterator it4 = arrayList8.iterator();
        while (it4.hasNext()) {
            final AbstractC0436 abstractC04363 = (AbstractC0436) it4.next();
            newFixedThreadPool.submit(new Runnable() { // from class: l.ܺ۬ܿ
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC0436 abstractC04364 = abstractC04363;
                    C19277 c192772 = c19277;
                    if (InterfaceC8693.this.mo1526()) {
                        return;
                    }
                    AtomicReference atomicReference2 = atomicReference;
                    if (atomicReference2.get() != null) {
                        return;
                    }
                    try {
                        MessageDigest m34532 = C14460.m34532();
                        InputStream mo1993 = abstractC04364.mo1993();
                        try {
                            byte[] bArr = new byte[WXNativeGamePageObject.LENGTH_LIMIT];
                            while (true) {
                                int read = mo1993.read(bArr);
                                if (read == -1) {
                                    mo1993.close();
                                    abstractC04364.f1924 = C14460.m34531(m34532.digest());
                                    return;
                                } else {
                                    m34532.update(bArr, 0, read);
                                    c192772.m44460(read);
                                }
                            }
                        } finally {
                        }
                    } catch (IOException e) {
                        abstractC04364.f1925 = e;
                    } catch (Exception e2) {
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                }
            });
        }
        C1802.m5992(newFixedThreadPool);
        if (interfaceC8693.mo1526()) {
            return "";
        }
        if (atomicReference.get() != null) {
            throw ((Exception) atomicReference.get());
        }
        Iterator it5 = arrayList7.iterator();
        while (it5.hasNext()) {
            C5376 c53763 = (C5376) it5.next();
            AbstractC0436 abstractC04364 = c53763.f16727;
            AbstractC0436 abstractC04365 = c53763.f16728;
            IOException iOException = abstractC04364.f1925;
            if (iOException != null || abstractC04365.f1925 != null) {
                if (iOException != null) {
                    arrayList6.add(m21697(str, abstractC04364));
                }
                if (abstractC04365.f1925 != null) {
                    arrayList6.add(m21697(str2, abstractC04365));
                }
            } else if (abstractC04364.f1924.equals(abstractC04365.f1924)) {
                arrayList.add(abstractC04364.f1922);
            } else {
                arrayList2.add(abstractC04364.f1922);
            }
        }
        Iterator it6 = hashMap3.values().iterator();
        while (it6.hasNext()) {
            C19488 c194883 = (C19488) it6.next();
            ArrayList arrayList11 = c194883.f62984;
            ArrayList arrayList12 = c194883.f62985;
            boolean anyMatch = C5378.stream(arrayList11).anyMatch(new C2554());
            boolean anyMatch2 = C5378.stream(arrayList12).anyMatch(new C3965());
            while (true) {
                int size = arrayList11.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        it = it6;
                        c5376 = null;
                        break;
                    }
                    int size2 = arrayList12.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        AbstractC0436 abstractC04366 = (AbstractC0436) arrayList11.get(i);
                        it = it6;
                        AbstractC0436 abstractC04367 = (AbstractC0436) arrayList12.get(i2);
                        int i3 = size;
                        String str3 = abstractC04366.f1924;
                        int i4 = size2;
                        if (str3 != null && str3.equals(abstractC04367.f1924)) {
                            arrayList11.remove(i);
                            arrayList12.remove(i2);
                            c5376 = new C5376(abstractC04366, abstractC04367);
                            break;
                        }
                        i2++;
                        it6 = it;
                        size = i3;
                        size2 = i4;
                    }
                    i++;
                }
                if (c5376 == null) {
                    break;
                }
                arrayList5.add(c5376.f16727.f1922 + " > " + c5376.f16728.f1922);
                it6 = it;
            }
            Iterator it7 = arrayList11.iterator();
            while (it7.hasNext()) {
                AbstractC0436 abstractC04368 = (AbstractC0436) it7.next();
                if (abstractC04368.f1925 != null) {
                    arrayList6.add(m21697(str, abstractC04368));
                } else if (!anyMatch2) {
                    arrayList9.add(abstractC04368.f1922);
                }
            }
            ArrayList arrayList13 = arrayList9;
            Iterator it8 = arrayList12.iterator();
            while (it8.hasNext()) {
                AbstractC0436 abstractC04369 = (AbstractC0436) it8.next();
                if (abstractC04369.f1925 != null) {
                    arrayList6.add(m21697(str2, abstractC04369));
                } else if (!anyMatch) {
                    arrayList10.add(abstractC04369.f1922);
                }
            }
            it6 = it;
            arrayList9 = arrayList13;
        }
        ArrayList arrayList14 = arrayList9;
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        Collections.sort(arrayList14);
        Collections.sort(arrayList10);
        Collections.sort(arrayList5);
        Collections.sort(arrayList6);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('\n');
        sb.append(str2);
        sb.append('\n');
        boolean z2 = true;
        if (arrayList6.isEmpty()) {
            z = false;
        } else {
            sb.append('\n');
            sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f1201c6));
            sb.append("\n==============================\n");
            Iterator it9 = arrayList6.iterator();
            while (it9.hasNext()) {
                sb.append((String) it9.next());
                sb.append('\n');
            }
            z = true;
        }
        if (!arrayList5.isEmpty()) {
            sb.append('\n');
            sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f1201c8));
            sb.append("\n==============================\n");
            Iterator it10 = arrayList5.iterator();
            while (it10.hasNext()) {
                sb.append((String) it10.next());
                sb.append('\n');
            }
            z = true;
        }
        if (!arrayList10.isEmpty()) {
            sb.append('\n');
            sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f1201c5));
            sb.append("\n==============================\n");
            Iterator it11 = arrayList10.iterator();
            while (it11.hasNext()) {
                sb.append((String) it11.next());
                sb.append('\n');
            }
            z = true;
        }
        if (!arrayList14.isEmpty()) {
            sb.append('\n');
            sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f1201c9));
            sb.append("\n==============================\n");
            Iterator it12 = arrayList14.iterator();
            while (it12.hasNext()) {
                sb.append((String) it12.next());
                sb.append('\n');
            }
            z = true;
        }
        if (arrayList2.isEmpty()) {
            z2 = z;
        } else {
            sb.append('\n');
            sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f1201c7));
            sb.append("\n==============================\n");
            Iterator it13 = arrayList2.iterator();
            while (it13.hasNext()) {
                sb.append((String) it13.next());
                sb.append('\n');
            }
        }
        if (!z2) {
            return "";
        }
        if (!arrayList.isEmpty()) {
            sb.append('\n');
            sb.append(C4925.m14327(R.string.MT_Protector_res_0x7f1201ca));
            sb.append("\n==============================\n");
            Iterator it14 = arrayList.iterator();
            while (it14.hasNext()) {
                sb.append((String) it14.next());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21697(String str, AbstractC0436 abstractC0436) {
        String message = abstractC0436.f1925.getMessage();
        if (message == null || message.isEmpty()) {
            message = abstractC0436.f1925.getClass().getSimpleName();
        } else {
            int indexOf = message.indexOf(10);
            int indexOf2 = message.indexOf(13);
            if (indexOf2 >= 0 && (indexOf < 0 || indexOf2 < indexOf)) {
                indexOf = indexOf2;
            }
            if (indexOf >= 0) {
                message = message.substring(0, indexOf);
            }
            if (message.isEmpty()) {
                message = abstractC0436.f1925.getClass().getSimpleName();
            }
        }
        StringBuilder sb = new StringBuilder();
        String str2 = abstractC0436.f1922;
        return C23202.m51498(sb, (str.endsWith("/") || str2.startsWith("/")) ? C16014.m37867(str, str2) : C22870.m50967(str, "/", str2), ": ", message);
    }
}

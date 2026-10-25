package l;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Y7CF */
/* renamed from: l.۠᩵ۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8381 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final ScheduledExecutorService f25705 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC19671());

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C8381 f25706 = new C8381();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f25707 = new AtomicLong(1);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f25708 = new ConcurrentMapC10942();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8381 m21977() {
        return f25706;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21982(int i, String str) {
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return;
        }
        synchronized (c1325) {
            c1325.f4769 = i;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21985(String str, AbstractC20250 abstractC20250, C18891 c18891) {
        boolean z;
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return;
        }
        synchronized (c1325) {
            c1325.f4773 = abstractC20250;
            c1325.f4760 = c18891;
            z = c1325.f4751;
        }
        if (z) {
            if (c18891 != null) {
                c18891.m43615((String) null);
            }
            abstractC20250.cancel();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21983(String str, AbstractC20250 abstractC20250) {
        boolean z;
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return;
        }
        synchronized (c1325) {
            z = c1325.f4759;
            if (z) {
                return;
            }
            c1325.f4753 = m21974(abstractC20250.m11557());
            c1325.f4749 = m21974(abstractC20250.m11534());
            c1325.f4750 = abstractC20250.m11539();
            c1325.f4764 = m21974((CharSequence) abstractC20250.mo12244());
            c1325.f4774 = abstractC20250.m46499();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21986(final String str, final String str2, String str3, C22306 c22306, C22306 c223062, C18891 c18891, boolean z) {
        boolean z2;
        boolean z3;
        String str4;
        C1325 c1325 = (C1325) this.f25708.get(str);
        boolean z4 = false;
        if (c1325 == null) {
            return false;
        }
        synchronized (c1325) {
            z2 = c1325.f4759;
            if (!z2) {
                z3 = c1325.f4751;
                if (!z3) {
                    c1325.f4760 = c18891;
                    m21978(c1325, true);
                    c1325.f4771 = "waiting_conflict";
                    c1325.f4766 = str2;
                    c1325.f4763 = m21974((CharSequence) str3);
                    c1325.f4768 = c22306;
                    c1325.f4761 = c223062;
                    c1325.f4775 = c18891.m43616();
                    boolean z5 = C21939.m49417() && z;
                    c1325.f4757 = z5;
                    if (z5) {
                        str4 = c1325.f4775;
                        if ("replace".equals(str4) && c18891.m43614()) {
                            z4 = true;
                        }
                    }
                    c1325.f4767 = z4;
                    c1325.f4772 = f25705.schedule(new Callable() { // from class: l.֡᩵ۢ
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Boolean valueOf;
                            valueOf = Boolean.valueOf(C8381.this.m21979(str, str2));
                            return valueOf;
                        }
                    }, 300000L, TimeUnit.MILLISECONDS);
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21987(String str, String str2, String str3, boolean z, boolean z2) {
        boolean z3;
        String str4;
        String str5;
        C18891 c18891;
        C18891 c188912;
        C18891 c188913;
        boolean z4;
        C1325 c1325 = (C1325) this.f25708.get(str);
        boolean z5 = false;
        if (c1325 == null) {
            return false;
        }
        synchronized (c1325) {
            z3 = c1325.f4759;
            if (!z3) {
                str4 = c1325.f4766;
                if (!TextUtils.isEmpty(str4)) {
                    str5 = c1325.f4766;
                    if (TextUtils.equals(str5, str2)) {
                        c18891 = c1325.f4760;
                        if (c18891 != null) {
                            c188912 = c1325.f4760;
                            if (c188912.m43617(str2)) {
                                c188913 = c1325.f4760;
                                if (z2) {
                                    z4 = c1325.f4757;
                                    if (z4) {
                                        z5 = true;
                                    }
                                }
                                m21978(c1325, true);
                                c1325.f4771 = "running";
                                return c188913.m43613(str2, str3, z, z5);
                            }
                        }
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21984(String str, AbstractC20250 abstractC20250, C17222 c17222, ArrayList arrayList, ArrayList arrayList2, List list, List list2) {
        List arrayList3;
        List arrayList4;
        List list3;
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return;
        }
        synchronized (c1325) {
            m21978(c1325, false);
            c1325.f4759 = true;
            c1325.f4771 = c17222.m40526() ? "success" : c17222.m40524() ? "cancelled" : "failure";
            c1325.f4753 = m21974(abstractC20250.m11557());
            c1325.f4749 = m21974(abstractC20250.m11534());
            c1325.f4750 = abstractC20250.m11539();
            c1325.f4764 = m21974((CharSequence) abstractC20250.mo12244());
            c1325.f4774 = abstractC20250.m46499();
            c1325.f4765 = c17222.m40525() ? m21974((CharSequence) c17222.m40522()) : "";
            if (arrayList.isEmpty()) {
                arrayList3 = Collections.EMPTY_LIST;
            } else {
                arrayList3 = new ArrayList(arrayList);
            }
            c1325.f4758 = arrayList3;
            if (arrayList2.isEmpty()) {
                arrayList4 = Collections.EMPTY_LIST;
            } else {
                arrayList4 = new ArrayList(arrayList2);
            }
            c1325.f4754 = arrayList4;
            c1325.f4756 = m21976(list);
            if (list2 != null && !list2.isEmpty()) {
                list3 = new ArrayList(list2);
                c1325.f4770 = list3;
                c1325.f4752 = SystemClock.elapsedRealtime();
                c1325.f4773 = null;
                c1325.f4760 = null;
            }
            list3 = Collections.EMPTY_LIST;
            c1325.f4770 = list3;
            c1325.f4752 = SystemClock.elapsedRealtime();
            c1325.f4773 = null;
            c1325.f4760 = null;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m21989(String str) {
        return m21979(str, (String) null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m21979(String str, String str2) {
        boolean z;
        AbstractC3817 abstractC3817;
        int i;
        C18891 c18891;
        String str3;
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return false;
        }
        synchronized (c1325) {
            z = c1325.f4759;
            if (z) {
                return true;
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = c1325.f4766;
                if (!TextUtils.equals(str3, str2)) {
                    return true;
                }
            }
            c1325.f4751 = true;
            abstractC3817 = c1325.f4773;
            i = c1325.f4769;
            c18891 = c1325.f4760;
            m21978(c1325, true);
            c1325.f4771 = "running";
            if (c18891 != null) {
                c18891.m43615(str2);
            }
            if (abstractC3817 == null) {
                AbstractC3817 m35784 = C15104.m35784(i);
                if (m35784 != null) {
                    m35784.cancel();
                }
                return true;
            }
            abstractC3817.cancel();
            return true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21978(C1325 c1325, boolean z) {
        ScheduledFuture scheduledFuture;
        boolean z2;
        String str;
        ScheduledFuture scheduledFuture2;
        scheduledFuture = c1325.f4772;
        if (scheduledFuture != null) {
            scheduledFuture2 = c1325.f4772;
            scheduledFuture2.cancel(false);
            c1325.f4772 = null;
        }
        c1325.f4766 = "";
        c1325.f4763 = "";
        C22306 c22306 = C22306.f72317;
        c1325.f4768 = c22306;
        c1325.f4761 = c22306;
        c1325.f4775 = "";
        c1325.f4757 = false;
        c1325.f4767 = false;
        z2 = c1325.f4759;
        if (z2 || !z) {
            return;
        }
        str = c1325.f4771;
        if ("waiting_conflict".equals(str)) {
            c1325.f4771 = "running";
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m21981(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ConcurrentMapC10942 concurrentMapC10942 = this.f25708;
        C5378.removeIf(concurrentMapC10942.entrySet(), new C5559(this, elapsedRealtime));
        String str2 = "ft-" + this.f25707.getAndIncrement();
        concurrentMapC10942.put(str2, new C1325(str2, str));
        return str2;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m21988(String str) {
        LinkedHashMap m4632;
        C5378.removeIf(this.f25708.entrySet(), new C5559(this, SystemClock.elapsedRealtime()));
        C1325 c1325 = (C1325) this.f25708.get(str);
        if (c1325 == null) {
            return null;
        }
        synchronized (c1325) {
            m4632 = C1325.m4632(c1325);
        }
        return m4632;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[Catch: all -> 0x0025, TryCatch #0 {, blocks: (B:4:0x0008, B:6:0x000f, B:10:0x0020, B:11:0x0023), top: B:3:0x0008 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ boolean m21980(l.C8381 r4, long r5, java.util.Map.Entry r7) {
        /*
            java.lang.Object r4 = r7.getValue()
            l.֨᩵ۢ r4 = (l.C1325) r4
            r0 = r4
            monitor-enter(r0)
            boolean r7 = l.C1325.m4657(r4)     // Catch: java.lang.Throwable -> L25
            r1 = 0
            if (r7 == 0) goto L1d
            long r2 = l.C1325.m4633(r4)     // Catch: java.lang.Throwable -> L25
            long r5 = r5 - r2
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 <= 0) goto L1d
            r5 = 1
            goto L1e
        L1d:
            r5 = 0
        L1e:
            if (r5 == 0) goto L23
            m21978(r4, r1)     // Catch: java.lang.Throwable -> L25
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return r5
        L25:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C8381.m21980(l.۠᩵ۢ, long, java.util.Map$Entry):boolean");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m21974(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m21976(List list) {
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            if (map != null && !TextUtils.isEmpty((CharSequence) map.get("from")) && !TextUtils.isEmpty((CharSequence) map.get("to"))) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("from", (String) map.get("from"));
                linkedHashMap.put("to", (String) map.get("to"));
                arrayList.add(linkedHashMap);
            }
        }
        return arrayList.isEmpty() ? Collections.EMPTY_LIST : arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static LinkedHashMap m21975(C22306 c22306) {
        if (c22306 == null || !c22306.m50052()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("size", Long.valueOf(c22306.m50050()));
        linkedHashMap.put("time", Long.valueOf(c22306.m50051()));
        return linkedHashMap;
    }
}

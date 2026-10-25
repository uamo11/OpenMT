package l;

import android.text.TextUtils;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.function.Predicate;

/* compiled from: R1EE */
/* renamed from: l.ۛܽۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C6180 extends C3058 {
    /* JADX WARN: Type inference failed for: r10v0, types: [l.᩻ܽۢ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17090(C12366 c12366, final C11393 c11393, final String str, final String str2, final int i, final InterfaceC4469 interfaceC4469) {
        int indexOf = str2.indexOf(58);
        if (indexOf == -1) {
            C4925.m14315(new Runnable() { // from class: l.᩺ۧۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C0941 c0941 = new C0941("", C19462.m44858("Usage: ", str, "->", str2), Collections.EMPTY_LIST);
                    InterfaceC4469 interfaceC44692 = InterfaceC4469.this;
                    interfaceC44692.mo3372(c0941);
                    interfaceC44692.mo3374();
                }
            });
            return;
        }
        String substring = str2.substring(0, indexOf);
        String substring2 = str2.substring(indexOf + 1);
        final char[] charArray = substring.toCharArray();
        final int length = charArray.length;
        final char[] charArray2 = substring2.toCharArray();
        final int length2 = charArray2.length;
        final C10414 c10414 = new C10414();
        final ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
        final String m17082 = m17082(c11393, str, str2, concurrentMapC10942);
        m17093(c12366, (InterfaceC19992) new C2653(new InterfaceC7997() { // from class: l.᩻ܽۢ
            @Override // l.InterfaceC7997
            public final List accept(Object obj) {
                return C6180.m17085(C10414.this, charArray, length, charArray2, length2, i, c11393, str2, concurrentMapC10942, m17082, (InterfaceC13508) obj);
            }
        }, c12366, str, str2), interfaceC4469, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ ArrayList m17085(C10414 c10414, char[] cArr, int i, char[] cArr2, int i2, int i3, C11393 c11393, String str, ConcurrentMapC10942 concurrentMapC10942, String str2, InterfaceC13508 interfaceC13508) {
        try {
            C22706 c22706 = c10414.get();
            if (!interfaceC13508.mo31671(c22706)) {
                return null;
            }
            C11418 m50717 = c22706.m50717();
            ArrayList m10366 = C3400.m10366(m50717.getValue(), m50717.length(), cArr, i, cArr2, i2);
            if (m10366.isEmpty()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = m10366.iterator();
            while (it.hasNext()) {
                Object[] objArr = (Object[]) it.next();
                int[] iArr = (int[]) objArr[0];
                String str3 = (String) objArr[1];
                if (i3 != 0) {
                    int i4 = iArr[0];
                    int lastIndexOf = TextUtils.lastIndexOf(m50717, '\n', i4);
                    if (lastIndexOf == -1) {
                        lastIndexOf = 0;
                    }
                    String trim = m50717.m28181(lastIndexOf, i4).trim();
                    if (i3 == 1) {
                        if (!trim.startsWith("iput") && !trim.startsWith("sput")) {
                        }
                    } else if (i3 == 2 && !trim.startsWith("iget") && !trim.startsWith("sget")) {
                    }
                }
                if (m17082(c11393, str3, str, concurrentMapC10942).equals(str2)) {
                    C19287 c19287 = new C19287(0);
                    int i5 = iArr[0];
                    c19287.f60684 = i5;
                    int i6 = iArr[1];
                    c19287.f60685 = i6;
                    c19287.m44468(i5, i6, m50717);
                    arrayList.add(c19287);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17082(C11393 c11393, String str, String str2, ConcurrentMapC10942 concurrentMapC10942) {
        String str3;
        C22681 m28157;
        String str4 = (String) concurrentMapC10942.get(str);
        if (str4 != null) {
            return str4;
        }
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        HashSet hashSet = new HashSet();
        linkedList.add(str);
        loop0: while (true) {
            if (linkedList.isEmpty() && linkedList2.isEmpty()) {
                str3 = str;
                break;
            }
            str3 = (String) (linkedList.isEmpty() ? linkedList2.removeFirst() : linkedList.removeFirst());
            if (str3 != null && hashSet.add(str3) && (m28157 = c11393.m28157(str3)) != null) {
                String[] strArr = m28157.f73205;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (strArr[i].equals(str2)) {
                            break loop0;
                        }
                        i++;
                    } else {
                        for (String str5 : m28157.f73201) {
                            if (str5.equals(str2)) {
                                break loop0;
                            }
                        }
                        String str6 = m28157.f73204;
                        if (str6 != null && !hashSet.contains(str6)) {
                            linkedList.add(str6);
                        }
                        Collections.addAll(linkedList2, m28157.f73203);
                    }
                }
            }
        }
        concurrentMapC10942.put(str, str3);
        return str3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [l.ܰۧۢ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17089(C12366 c12366, String str, InterfaceC4469 interfaceC4469) {
        final char[] charArray = str.toCharArray();
        final int length = charArray.length;
        final C10414 c10414 = new C10414();
        m17093(c12366, (InterfaceC19992) new C4064(new InterfaceC7997() { // from class: l.ܰۧۢ
            @Override // l.InterfaceC7997
            public final List accept(Object obj) {
                int m10365;
                C10414 c104142 = C10414.this;
                char[] cArr = charArray;
                int i = length;
                InterfaceC13508 interfaceC13508 = (InterfaceC13508) obj;
                try {
                    C22706 c22706 = c104142.get();
                    if (!interfaceC13508.mo31671(c22706)) {
                        return null;
                    }
                    C11418 m50717 = c22706.m50717();
                    char[] value = m50717.getValue();
                    int length2 = m50717.length();
                    int i2 = C3400.f10762;
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    while (arrayList.size() < 500 && (m10365 = C3400.m10365(length2, i, i3, value, cArr)) != -1) {
                        int i4 = m10365 + i;
                        arrayList.add(new int[]{m10365, i4});
                        i3 = i4;
                    }
                    if (arrayList.isEmpty()) {
                        return null;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int[] iArr = (int[]) it.next();
                        C19287 c19287 = new C19287(0);
                        int i5 = iArr[0];
                        c19287.f60684 = i5;
                        int i6 = iArr[1];
                        c19287.f60685 = i6;
                        c19287.m44468(i5, i6, m50717);
                        arrayList2.add(c19287);
                    }
                    return arrayList2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, c12366, str), interfaceC4469, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17092(C12366 c12366, final C11393 c11393, final String str, final String str2, boolean z, final InterfaceC4469 interfaceC4469) {
        InterfaceC7997 interfaceC7997;
        String str3;
        C12164 matcher = C11459.m28260("(.+)\\((.*)\\)(.+)").matcher((CharSequence) str2);
        if (!matcher.matches()) {
            C4925.m14315(new Runnable() { // from class: l.ۢܽۢ
                @Override // java.lang.Runnable
                public final void run() {
                    C0941 c0941 = new C0941("", C19462.m44858("Usage: ", str, "->", str2), Collections.EMPTY_LIST);
                    InterfaceC4469 interfaceC44692 = InterfaceC4469.this;
                    interfaceC44692.mo3372(c0941);
                    interfaceC44692.mo3374();
                }
            });
            return;
        }
        boolean z2 = true;
        String group = matcher.group(1);
        C11003.requireNonNull(group);
        String group2 = matcher.group(2);
        C11003.requireNonNull(group2);
        String group3 = matcher.group(3);
        C11003.requireNonNull(group3);
        C22681 m28157 = c11393.m28157(str);
        if (!z && m28157 != null) {
            String[] strArr = m28157.f73200;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str3 = null;
                    break;
                }
                str3 = strArr[i];
                if (str3.equals(str2)) {
                    break;
                } else {
                    i++;
                }
            }
            if (str3 == null) {
                String[] strArr2 = m28157.f73206;
                int length2 = strArr2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    String str4 = strArr2[i2];
                    if (str4.equals(str2)) {
                        z2 = false;
                        str3 = str4;
                        break;
                    }
                    i2++;
                }
            }
            if (str3 == null && !group.equals("<init>") && !group.equals("<clinit>")) {
                z2 = false;
            }
        }
        final char[] charArray = ("->" + group + MotionUtils.EASING_TYPE_FORMAT_START).toCharArray();
        final char[] charArray2 = group2.toCharArray();
        final char[] charArray3 = group3.toCharArray();
        final C10414 c10414 = new C10414();
        if (z2) {
            final char[] charArray4 = str.toCharArray();
            interfaceC7997 = new InterfaceC7997() { // from class: l.ۡܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C10414 c104142 = C10414.this;
                    char[] cArr = charArray4;
                    char[] cArr2 = charArray;
                    char[] cArr3 = charArray2;
                    char[] cArr4 = charArray3;
                    InterfaceC13508 interfaceC13508 = (InterfaceC13508) obj;
                    try {
                        C22706 c22706 = c104142.get();
                        if (!interfaceC13508.mo31671(c22706)) {
                            return null;
                        }
                        C11418 m50717 = c22706.m50717();
                        ArrayList m10368 = C3400.m10368(m50717.getValue(), m50717.length(), cArr, cArr.length, cArr2, cArr2.length, cArr3, cArr3.length, cArr4, cArr4.length);
                        if (m10368.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it = m10368.iterator();
                        while (it.hasNext()) {
                            int[] iArr = (int[]) it.next();
                            C19287 c19287 = new C19287(0);
                            int i3 = iArr[0];
                            c19287.f60684 = i3;
                            int i4 = iArr[1];
                            c19287.f60685 = i4;
                            c19287.m44468(i3, i4, m50717);
                            arrayList.add(c19287);
                        }
                        return arrayList;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        } else {
            final C18955 m17087 = m17087(c11393, m28157, str2);
            m17087.add(str);
            final ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
            interfaceC7997 = new InterfaceC7997() { // from class: l.ܺܽۢ
                @Override // l.InterfaceC7997
                public final List accept(Object obj) {
                    C10414 c104142 = C10414.this;
                    char[] cArr = charArray;
                    char[] cArr2 = charArray2;
                    char[] cArr3 = charArray3;
                    C11393 c113932 = c11393;
                    C18955 c18955 = m17087;
                    ConcurrentMapC10942 concurrentMapC109422 = concurrentMapC10942;
                    InterfaceC13508 interfaceC13508 = (InterfaceC13508) obj;
                    try {
                        C22706 c22706 = c104142.get();
                        if (!interfaceC13508.mo31671(c22706)) {
                            return null;
                        }
                        C11418 m50717 = c22706.m50717();
                        ArrayList m10367 = C3400.m10367(m50717.getValue(), m50717.length(), cArr, cArr.length, cArr2, cArr2.length, cArr3, cArr3.length, c113932, c18955, concurrentMapC109422);
                        if (m10367.isEmpty()) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        Iterator it = m10367.iterator();
                        while (it.hasNext()) {
                            int[] iArr = (int[]) it.next();
                            C19287 c19287 = new C19287(0);
                            int i3 = iArr[0];
                            c19287.f60684 = i3;
                            int i4 = iArr[1];
                            c19287.f60685 = i4;
                            c19287.m44468(i3, i4, m50717);
                            arrayList.add(c19287);
                        }
                        return arrayList;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            };
        }
        m17093(c12366, (InterfaceC19992) new C18881(interfaceC7997, c12366, str, str2), interfaceC4469, false);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m17099(C12366 c12366, String str, InterfaceC4469 interfaceC4469) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet.add(str);
        InterfaceC8566[] interfaceC8566Arr = (InterfaceC8566[]) C5378.stream(c12366.m30049()).map(new C23519(4)).filter(new C6586(2)).toArray(new C13986(2));
        while (true) {
            if (!hashSet.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                for (InterfaceC8566 interfaceC8566 : interfaceC8566Arr) {
                    boolean contains = hashSet.contains(interfaceC8566.mo2695());
                    if (!contains) {
                        Iterator it = interfaceC8566.mo2699().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (hashSet.contains((String) it.next())) {
                                    contains = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (contains) {
                        String type = interfaceC8566.getType();
                        if (hashSet2.add(type)) {
                            arrayList.add(type);
                        }
                    }
                }
                hashSet.clear();
                hashSet.addAll(arrayList);
            } else {
                m17093(c12366, (InterfaceC19992) new C19587(new C11505(hashSet2), c12366, str), interfaceC4469, false);
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [l.᩷ܽۢ] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17091(C12366 c12366, final C11393 c11393, String str, String str2, InterfaceC4469 interfaceC4469) {
        C12164 matcher = C11459.m28260("(.+)\\((.*)\\)(.+)").matcher((CharSequence) str2);
        if (!matcher.matches()) {
            C4925.m14315(new RunnableC7014(interfaceC4469, str, str2));
            return;
        }
        String group = matcher.group(1);
        C11003.requireNonNull(group);
        String m11985 = C3939.m11985(group);
        String group2 = matcher.group(2);
        C11003.requireNonNull(group2);
        String m119852 = C3939.m11985(group2);
        String group3 = matcher.group(3);
        C11003.requireNonNull(group3);
        String str3 = m11985 + "\\s*\\(\\s*" + m119852 + "\\s*\\)\\s*" + C3939.m11985(group3);
        final C18955 m17087 = m17087(c11393, c11393.m28157(str), str2);
        m17087.add(str);
        final C15051 m9357 = C3058.m9357(str3, true, true);
        final ConcurrentMapC10942 concurrentMapC10942 = new ConcurrentMapC10942();
        m17093(c12366, (InterfaceC19992) new C0535(new InterfaceC7997() { // from class: l.᩷ܽۢ
            @Override // l.InterfaceC7997
            public final List accept(Object obj) {
                C11393 c113932 = C11393.this;
                C18955 c18955 = m17087;
                ConcurrentMapC10942 concurrentMapC109422 = concurrentMapC10942;
                C15051 c15051 = m9357;
                try {
                    C7980 mo31674 = ((InterfaceC13508) obj).mo31674();
                    if (mo31674 == null || !C6180.m17097(c113932, c18955, mo31674.getType(), concurrentMapC109422)) {
                        return null;
                    }
                    for (InterfaceC18444 interfaceC18444 : mo31674.getMethods()) {
                        int mo3567 = interfaceC18444.mo3567();
                        if (!EnumC15657.PRIVATE.m36866(mo3567) && !EnumC15657.STATIC.m36866(mo3567)) {
                            String m34249 = C14354.m34249((InterfaceC5471) interfaceC18444, true);
                            C12164 c12164 = c15051.get();
                            c12164.m29615reset((CharSequence) m34249);
                            if (c12164.matches()) {
                                C19287 c19287 = new C19287(3);
                                c19287.f60684 = 0;
                                c19287.f60685 = interfaceC18444.getName().length();
                                c19287.f60681 = interfaceC18444.getName();
                                c19287.f60683 = interfaceC18444.mo3568();
                                StringBuilder sb = new StringBuilder();
                                Iterator it = interfaceC18444.mo3565().iterator();
                                while (it.hasNext()) {
                                    sb.append((CharSequence) it.next());
                                }
                                c19287.f60679 = sb.toString();
                                c19287.m44475(interfaceC18444, c19287.f60684, c19287.f60685);
                                return Collections.singletonList(c19287);
                            }
                        }
                    }
                    return null;
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, c12366, str, str2), interfaceC4469, false);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18955 m17087(C11393 c11393, C22681 c22681, String str) {
        C22681 m28157;
        C18955 c18955 = new C18955();
        if (c22681 != null) {
            String str2 = c22681.f73202;
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            linkedList.add(str2);
            while (!linkedList.isEmpty()) {
                String str3 = (String) linkedList.removeFirst();
                if (str3 != null && hashSet.add(str3) && (m28157 = c11393.m28157(str3)) != null) {
                    if (!str3.equals(str2)) {
                        String[] strArr = m28157.f73206;
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            }
                            if (strArr[i].equals(str)) {
                                c18955.add(m28157.f73202);
                                break;
                            }
                            i++;
                        }
                    }
                    linkedList.add(m28157.f73204);
                    Collections.addAll(linkedList, m28157.f73203);
                }
            }
        }
        return c18955;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17097(C11393 c11393, C18955 c18955, String str, ConcurrentMapC10942 concurrentMapC10942) {
        Boolean bool = (Boolean) concurrentMapC10942.get(str);
        if (bool == null) {
            bool = Boolean.valueOf(m17096(c11393, c18955, str, new HashSet()));
            concurrentMapC10942.put(str, bool);
        }
        return bool.booleanValue();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17096(C11393 c11393, C18955 c18955, String str, HashSet hashSet) {
        if (c18955.contains(str)) {
            return true;
        }
        hashSet.add(str);
        C22681 m28157 = c11393.m28157(str);
        if (m28157 != null) {
            String str2 = m28157.f73204;
            if (str2 != null && !hashSet.contains(str2) && m17096(c11393, c18955, str2, hashSet)) {
                return true;
            }
            for (String str3 : m28157.f73203) {
                if (!hashSet.contains(str3) && m17096(c11393, c18955, str3, hashSet)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17088(C12366 c12366, String str, String str2, long j, int i, boolean z, boolean z2, boolean z3, boolean z4, InterfaceC4469 interfaceC4469, Predicate predicate) {
        m17093(c12366, (InterfaceC19992) new C3358(i, str, z3, z2, z4, c12366, j, str2, z, predicate), interfaceC4469, true);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17093(final C12366 c12366, final InterfaceC19992 interfaceC19992, final InterfaceC4469 interfaceC4469, boolean z) {
        final ArrayList arrayList = new ArrayList();
        Runnable runnable = new Runnable() { // from class: l.ۜܽۢ
            @Override // java.lang.Runnable
            public final void run() {
                final InterfaceC19992 interfaceC199922 = InterfaceC19992.this;
                InterfaceC7997 mo2262 = interfaceC199922.mo2262();
                final InterfaceC4469 interfaceC44692 = interfaceC4469;
                if (mo2262 == null) {
                    C4925.m14315(new RunnableC19009(5, interfaceC44692));
                    return;
                }
                ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
                interfaceC199922.mo2263(concurrentLinkedQueue);
                interfaceC44692.mo3375(0);
                C19277 c19277 = new C19277(concurrentLinkedQueue.size());
                c19277.m44459(new C2144(interfaceC44692));
                C8817 m22790 = C8817.m22790();
                final ArrayList arrayList2 = arrayList;
                RunnableC13235 runnableC13235 = new RunnableC13235(concurrentLinkedQueue, interfaceC44692, c19277, mo2262, arrayList2, m22790);
                C12366 c123662 = c12366;
                c123662.m30051();
                C3058.m9358(C17615.f53826, runnableC13235);
                c123662.m30061();
                C4925.m14315(new Runnable() { // from class: l.۟ۧۢ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC4469 interfaceC44693 = InterfaceC4469.this;
                        if (interfaceC44693.mo3373()) {
                            C21374.m48465();
                        }
                        interfaceC44693.mo3372(interfaceC199922.mo2261(arrayList2));
                        interfaceC44693.mo3374();
                    }
                });
            }
        };
        if (z) {
            new Thread(runnable).start();
        } else {
            runnable.run();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ArrayList m17100(InterfaceC8566 interfaceC8566, C12164 c12164, boolean z) {
        C12164 c121642 = c12164;
        if (interfaceC8566 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String mo2694 = interfaceC8566.mo2694();
        if (mo2694 != null) {
            c121642.m29615reset((CharSequence) mo2694);
            if (!z ? C5898.m16539(c12164) : c12164.matches()) {
                C19287 c19287 = new C19287(1);
                String m33622 = C14020.m33622(mo2694);
                int m9354 = C3058.m9354(c12164.start(), 0, 0, mo2694);
                c19287.m44469(m9354 + 9, C3058.m9354(c12164.end(), c12164.start(), m9354, mo2694) + 9, C4860.m14172(".source \"", m33622, "\""));
                arrayList.add(c19287);
            }
        }
        Iterator it = interfaceC8566.getAnnotations().iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = 0;
            for (InterfaceC9272 interfaceC9272 : ((InterfaceC20561) it.next()).getElements()) {
                if (m17095(interfaceC9272.getValue(), c121642, z)) {
                    C19287 c192872 = new C19287(2);
                    c192872.m44473(interfaceC9272, c121642);
                    c192872.f60684 = i;
                    c192872.f60685 = i2;
                    arrayList.add(c192872);
                }
                i2++;
            }
            i++;
        }
        for (InterfaceC3627 interfaceC3627 : interfaceC8566.getFields()) {
            Iterator it2 = interfaceC3627.getAnnotations().iterator();
            int i3 = 0;
            while (it2.hasNext()) {
                int i4 = 0;
                for (InterfaceC9272 interfaceC92722 : ((InterfaceC20561) it2.next()).getElements()) {
                    if (m17095(interfaceC92722.getValue(), c121642, z)) {
                        C19287 c192873 = new C19287(8);
                        c192873.f60681 = interfaceC3627.getName();
                        c192873.f60683 = interfaceC3627.getType();
                        c192873.m44473(interfaceC92722, c121642);
                        c192873.f60684 = i3;
                        c192873.f60685 = i4;
                        arrayList.add(c192873);
                    }
                    i4++;
                }
                i3++;
            }
            InterfaceC10410 mo11109 = interfaceC3627.mo11109();
            if (mo11109 != null && m17095(mo11109, c121642, z)) {
                C19287 c192874 = new C19287(9);
                c192874.f60681 = interfaceC3627.getName();
                c192874.f60683 = interfaceC3627.getType();
                c192874.m44471(interfaceC3627, c121642);
                arrayList.add(c192874);
            }
        }
        for (InterfaceC18444 interfaceC18444 : interfaceC8566.getMethods()) {
            StringBuilder sb = new StringBuilder();
            Iterator it3 = interfaceC18444.mo3565().iterator();
            while (it3.hasNext()) {
                sb.append((CharSequence) it3.next());
            }
            String sb2 = sb.toString();
            Iterator it4 = interfaceC18444.getParameters().iterator();
            int i5 = 0;
            while (it4.hasNext()) {
                Iterator it5 = ((InterfaceC0098) it4.next()).getAnnotations().iterator();
                while (it5.hasNext()) {
                    int i6 = 0;
                    for (InterfaceC9272 interfaceC92723 : ((InterfaceC20561) it5.next()).getElements()) {
                        if (m17095(interfaceC92723.getValue(), c121642, z)) {
                            C19287 c192875 = new C19287(4);
                            c192875.f60681 = interfaceC18444.getName();
                            c192875.f60683 = interfaceC18444.mo3568();
                            c192875.f60679 = sb2;
                            c192875.m44473(interfaceC92723, c121642);
                            c192875.f60684 = i5;
                            c192875.f60685 = i6;
                            arrayList.add(c192875);
                        }
                        i6++;
                    }
                    i5++;
                }
            }
            Iterator it6 = interfaceC18444.getAnnotations().iterator();
            while (it6.hasNext()) {
                int i7 = 0;
                for (InterfaceC9272 interfaceC92724 : ((InterfaceC20561) it6.next()).getElements()) {
                    if (m17095(interfaceC92724.getValue(), c121642, z)) {
                        C19287 c192876 = new C19287(4);
                        c192876.f60681 = interfaceC18444.getName();
                        c192876.f60683 = interfaceC18444.mo3568();
                        c192876.f60679 = sb2;
                        c192876.m44473(interfaceC92724, c121642);
                        c192876.f60684 = i5;
                        c192876.f60685 = i7;
                        arrayList.add(c192876);
                    }
                    i7++;
                }
                i5++;
            }
            InterfaceC19150 mo3570 = interfaceC18444.mo3570();
            if (mo3570 != null) {
                int i8 = 0;
                for (InterfaceC22677 interfaceC22677 : mo3570.mo3817()) {
                    if (interfaceC22677.mo3975() != EnumC0841.f3065) {
                        EnumC3664 enumC3664 = interfaceC22677.mo3975().f3316;
                        if ((enumC3664 == EnumC3664.Format21c || enumC3664 == EnumC3664.Format31c) && interfaceC22677.mo3975().f3318 == 0) {
                            String string = ((InterfaceC15347) ((InterfaceC10952) interfaceC22677).getReference()).getString();
                            c121642.m29615reset((CharSequence) string);
                            if (!z ? C5898.m16539(c12164) : c12164.matches()) {
                                C19287 c192877 = new C19287(5);
                                try {
                                    int mo3818 = interfaceC18444.mo3570().mo3818();
                                    InterfaceC18842 interfaceC18842 = C17177.f52643;
                                    int m40411 = C17177.m40411(interfaceC18444.mo3565(), EnumC15657.STATIC.m36866(interfaceC18444.mo3567()));
                                    C11418 c11418 = new C11418();
                                    C3438 c3438 = new C3438(new C22706(c11418));
                                    c11418.m28186(interfaceC22677.mo3975().f3315);
                                    c11418.append(' ');
                                    int mo1790 = ((InterfaceC1779) interfaceC22677).mo1790();
                                    int i9 = mo3818 - m40411;
                                    if (mo1790 >= i9) {
                                        c3438.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                        c3438.m10510(mo1790 - i9);
                                    } else {
                                        c3438.write(118);
                                        c3438.m10510(mo1790);
                                    }
                                    c11418.m28186(", \"");
                                    String m336222 = C14020.m33622(string);
                                    int m93542 = C3058.m9354(c12164.start(), 0, 0, string);
                                    c192877.m44469(c11418.length() + m93542, c11418.length() + C3058.m9354(c12164.end(), c12164.start(), m93542, string), ((Object) c11418) + m336222 + "\"");
                                } catch (IOException unused) {
                                }
                                c192877.f60681 = interfaceC18444.getName();
                                c192877.f60683 = interfaceC18444.mo3568();
                                c192877.f60679 = sb2;
                                c192877.f60684 = i8;
                                arrayList.add(c192877);
                            }
                        }
                        i8++;
                        c121642 = c12164;
                    }
                }
            }
            c121642 = c12164;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17095(InterfaceC10410 interfaceC10410, C12164 c12164, boolean z) {
        int mo2302 = interfaceC10410.mo2302();
        if (mo2302 == 23) {
            c12164.m29615reset((CharSequence) ((InterfaceC17507) interfaceC10410).getValue());
            return z ? c12164.matches() : C5898.m16539(c12164);
        }
        if (mo2302 == 28) {
            Iterator it = ((InterfaceC20288) interfaceC10410).getValue().iterator();
            while (it.hasNext()) {
                if (m17095((InterfaceC10410) it.next(), c12164, z)) {
                    return true;
                }
            }
            return false;
        }
        if (mo2302 != 29) {
            return false;
        }
        Iterator it2 = ((InterfaceC22404) interfaceC10410).getElements().iterator();
        while (it2.hasNext()) {
            if (m17095(((InterfaceC9272) it2.next()).getValue(), c12164, z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m17094(C4047 c4047, C12164 c12164, boolean z, boolean z2, boolean z3) {
        if (z2) {
            c12164.m29615reset(c4047.m12149());
            if (z) {
                if (c12164.matches()) {
                    return true;
                }
            } else if (C5898.m16539(c12164)) {
                return true;
            }
            c12164.m29615reset(c4047.m12152());
            if (z) {
                if (c12164.matches()) {
                    return true;
                }
            } else if (C5898.m16539(c12164)) {
                return true;
            }
        }
        if (z3) {
            c12164.m29615reset(c4047.m12151());
            if (z) {
                if (c12164.matches()) {
                    return true;
                }
            } else if (C5898.m16539(c12164)) {
                return true;
            }
        }
        c12164.m29615reset(c4047.m12153());
        return z ? c12164.matches() : C5898.m16539(c12164);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList m17098(l.InterfaceC8566 r11, l.C12164 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C6180.m17098(l.ۡ֫ۚ, l.۫ۘܽ, boolean):java.util.ArrayList");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m17084(InterfaceC8566 interfaceC8566, C12164 c12164, boolean z) {
        int start;
        int end;
        if (interfaceC8566 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3627 interfaceC3627 : interfaceC8566.getFields()) {
            c12164.m29615reset((CharSequence) interfaceC3627.getName());
            boolean z2 = true;
            if (!z) {
                if (C5898.m16539(c12164)) {
                    start = c12164.start();
                    end = c12164.end();
                }
                z2 = false;
                start = 0;
                end = 0;
            } else {
                if (c12164.matches()) {
                    start = c12164.start();
                    end = c12164.end();
                }
                z2 = false;
                start = 0;
                end = 0;
            }
            if (z2) {
                C19287 c19287 = new C19287(7);
                c19287.f60684 = start;
                c19287.f60685 = end;
                c19287.f60681 = interfaceC3627.getName();
                c19287.f60683 = interfaceC3627.getType();
                C11418 c11418 = new C11418();
                c11418.m28186(".field ");
                for (EnumC15657 enumC15657 : EnumC15657.m36864(interfaceC3627.mo11110())) {
                    c11418.m28186(enumC15657.toString());
                    c11418.append(' ');
                }
                int length = c11418.length() + start;
                int length2 = c11418.length() + end;
                c11418.m28186(interfaceC3627.getName());
                c11418.append(':');
                c11418.m28186(interfaceC3627.getType());
                InterfaceC10410 mo11109 = interfaceC3627.mo11109();
                if (mo11109 != null) {
                    c11418.m28186(" = ");
                    try {
                        AbstractC11569.m28462(new C3438(new C22706(c11418)), mo11109);
                    } catch (IOException unused) {
                    }
                }
                c19287.m44469(length, length2, c11418.toString());
                arrayList.add(c19287);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m17083(InterfaceC8566 interfaceC8566, long j) {
        Iterator it;
        Iterator it2;
        InterfaceC8835 interfaceC8835;
        Iterator it3;
        String obj;
        C11418 c11418;
        C3438 c3438;
        InterfaceC10410 m17086;
        if (interfaceC8566 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it4 = interfaceC8566.getAnnotations().iterator();
        int i = 0;
        while (it4.hasNext()) {
            int i2 = 0;
            for (InterfaceC9272 interfaceC9272 : ((InterfaceC20561) it4.next()).getElements()) {
                InterfaceC10410 m170862 = m17086(interfaceC9272.getValue(), j);
                if (m170862 != null) {
                    C19287 c19287 = new C19287(2);
                    c19287.f60684 = i;
                    c19287.f60685 = i2;
                    c19287.m44472(interfaceC9272, m170862);
                    arrayList.add(c19287);
                }
                i2++;
            }
            i++;
        }
        for (InterfaceC3627 interfaceC3627 : interfaceC8566.getFields()) {
            Iterator it5 = interfaceC3627.getAnnotations().iterator();
            int i3 = 0;
            while (it5.hasNext()) {
                int i4 = 0;
                for (InterfaceC9272 interfaceC92722 : ((InterfaceC20561) it5.next()).getElements()) {
                    InterfaceC10410 m170863 = m17086(interfaceC92722.getValue(), j);
                    if (m170863 != null) {
                        C19287 c192872 = new C19287(8);
                        c192872.f60681 = interfaceC3627.getName();
                        c192872.f60683 = interfaceC3627.getType();
                        c192872.m44472(interfaceC92722, m170863);
                        c192872.f60684 = i3;
                        c192872.f60685 = i4;
                        arrayList.add(c192872);
                    }
                    i4++;
                }
                i3++;
            }
            InterfaceC10410 mo11109 = interfaceC3627.mo11109();
            if (mo11109 != null && (m17086 = m17086(mo11109, j)) != null) {
                C19287 c192873 = new C19287(9);
                c192873.f60681 = interfaceC3627.getName();
                c192873.f60683 = interfaceC3627.getType();
                c192873.m44470(interfaceC3627, m17086);
                arrayList.add(c192873);
            }
        }
        Iterator it6 = interfaceC8566.getMethods().iterator();
        while (it6.hasNext()) {
            InterfaceC18444 interfaceC18444 = (InterfaceC18444) it6.next();
            StringBuilder sb = new StringBuilder();
            Iterator it7 = interfaceC18444.mo3565().iterator();
            while (it7.hasNext()) {
                sb.append((CharSequence) it7.next());
            }
            String sb2 = sb.toString();
            Iterator it8 = interfaceC18444.getParameters().iterator();
            int i5 = 0;
            while (it8.hasNext()) {
                Iterator it9 = ((InterfaceC0098) it8.next()).getAnnotations().iterator();
                while (it9.hasNext()) {
                    int i6 = 0;
                    for (InterfaceC9272 interfaceC92723 : ((InterfaceC20561) it9.next()).getElements()) {
                        InterfaceC10410 m170864 = m17086(interfaceC92723.getValue(), j);
                        if (m170864 != null) {
                            C19287 c192874 = new C19287(4);
                            c192874.f60681 = interfaceC18444.getName();
                            c192874.f60683 = interfaceC18444.mo3568();
                            c192874.f60679 = sb2;
                            c192874.m44472(interfaceC92723, m170864);
                            c192874.f60684 = i5;
                            c192874.f60685 = i6;
                            arrayList.add(c192874);
                        }
                        i6++;
                    }
                    i5++;
                }
            }
            char c = 0;
            Iterator it10 = interfaceC18444.getAnnotations().iterator();
            while (it10.hasNext()) {
                int i7 = 0;
                for (InterfaceC9272 interfaceC92724 : ((InterfaceC20561) it10.next()).getElements()) {
                    InterfaceC10410 m170865 = m17086(interfaceC92724.getValue(), j);
                    if (m170865 != null) {
                        C19287 c192875 = new C19287(4);
                        c192875.f60681 = interfaceC18444.getName();
                        c192875.f60683 = interfaceC18444.mo3568();
                        c192875.f60679 = sb2;
                        c192875.m44472(interfaceC92724, m170865);
                        c192875.f60684 = i5;
                        c192875.f60685 = i7;
                        arrayList.add(c192875);
                    }
                    i7++;
                }
                i5++;
            }
            InterfaceC19150 mo3570 = interfaceC18444.mo3570();
            if (mo3570 != null) {
                int i8 = 0;
                for (InterfaceC22677 interfaceC22677 : mo3570.mo3817()) {
                    if (interfaceC22677.mo3975() != EnumC0841.f3065) {
                        if (!(interfaceC22677 instanceof InterfaceC7155) && !(interfaceC22677 instanceof C12131)) {
                            int[] iArr = C12530.f37648;
                            int i9 = 1;
                            int i10 = 6;
                            switch (iArr[interfaceC22677.mo3975().f3316.ordinal()]) {
                                case 9:
                                    InterfaceC8835 interfaceC88352 = (InterfaceC8835) interfaceC22677;
                                    Iterator it11 = interfaceC88352.mo19045().iterator();
                                    int i11 = 0;
                                    while (it11.hasNext()) {
                                        Number number = (Number) it11.next();
                                        if (number.longValue() == j) {
                                            C19287 c192876 = new C19287(i10);
                                            int mo19046 = interfaceC88352.mo19046();
                                            String str = mo19046 != i9 ? mo19046 != 2 ? "" : am.aB : am.aI;
                                            try {
                                                c11418 = new C11418();
                                                it2 = it6;
                                            } catch (IOException e) {
                                                e = e;
                                                it2 = it6;
                                            }
                                            try {
                                                c3438 = new C3438(new C22706(c11418));
                                                interfaceC8835 = interfaceC88352;
                                                it3 = it11;
                                            } catch (IOException e2) {
                                                e = e2;
                                                interfaceC8835 = interfaceC88352;
                                                it3 = it11;
                                                obj = e.toString();
                                                c192876.m44469(17, obj.length() + 17, C4860.m14172(".array-data {... ", obj, " ...}"));
                                                c192876.f60681 = interfaceC18444.getName();
                                                c192876.f60683 = interfaceC18444.mo3568();
                                                c192876.f60679 = sb2;
                                                c192876.f60684 = i8;
                                                c192876.f60685 = i11;
                                                arrayList.add(c192876);
                                                i11++;
                                                i9 = 1;
                                                i10 = 6;
                                                interfaceC88352 = interfaceC8835;
                                                it11 = it3;
                                                it6 = it2;
                                            }
                                            try {
                                                C4718.m13817(c3438, number.longValue());
                                                c3438.write(str, 0, str.length());
                                                obj = c11418.toString();
                                            } catch (IOException e3) {
                                                e = e3;
                                                obj = e.toString();
                                                c192876.m44469(17, obj.length() + 17, C4860.m14172(".array-data {... ", obj, " ...}"));
                                                c192876.f60681 = interfaceC18444.getName();
                                                c192876.f60683 = interfaceC18444.mo3568();
                                                c192876.f60679 = sb2;
                                                c192876.f60684 = i8;
                                                c192876.f60685 = i11;
                                                arrayList.add(c192876);
                                                i11++;
                                                i9 = 1;
                                                i10 = 6;
                                                interfaceC88352 = interfaceC8835;
                                                it11 = it3;
                                                it6 = it2;
                                            }
                                            c192876.m44469(17, obj.length() + 17, C4860.m14172(".array-data {... ", obj, " ...}"));
                                            c192876.f60681 = interfaceC18444.getName();
                                            c192876.f60683 = interfaceC18444.mo3568();
                                            c192876.f60679 = sb2;
                                            c192876.f60684 = i8;
                                            c192876.f60685 = i11;
                                            arrayList.add(c192876);
                                        } else {
                                            it2 = it6;
                                            interfaceC8835 = interfaceC88352;
                                            it3 = it11;
                                        }
                                        i11++;
                                        i9 = 1;
                                        i10 = 6;
                                        interfaceC88352 = interfaceC8835;
                                        it11 = it3;
                                        it6 = it2;
                                    }
                                    break;
                                case 10:
                                    Iterator it12 = ((InterfaceC17301) interfaceC22677).mo8107().iterator();
                                    int i12 = 0;
                                    while (true) {
                                        if (!it12.hasNext()) {
                                            break;
                                        } else {
                                            InterfaceC18007 interfaceC18007 = (InterfaceC18007) it12.next();
                                            if (interfaceC18007.getKey() == j) {
                                                C19287 c192877 = new C19287(6);
                                                Object[] objArr = new Object[1];
                                                objArr[c] = Integer.valueOf(interfaceC18007.getKey());
                                                c192877.m44469(20, 28, String.format(".packed-switch {... %08x ...}", objArr));
                                                c192877.f60681 = interfaceC18444.getName();
                                                c192877.f60683 = interfaceC18444.mo3568();
                                                c192877.f60679 = sb2;
                                                c192877.f60684 = i8;
                                                c192877.f60685 = i12;
                                                arrayList.add(c192877);
                                                break;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                case 11:
                                    Iterator it13 = ((InterfaceC17301) interfaceC22677).mo8107().iterator();
                                    int i13 = 0;
                                    while (true) {
                                        if (!it13.hasNext()) {
                                            break;
                                        } else {
                                            InterfaceC18007 interfaceC180072 = (InterfaceC18007) it13.next();
                                            if (interfaceC180072.getKey() == j) {
                                                C19287 c192878 = new C19287(6);
                                                Object[] objArr2 = new Object[1];
                                                objArr2[c] = Integer.valueOf(interfaceC180072.getKey());
                                                c192878.m44469(20, 28, String.format(".sparse-switch {... %08x ...}", objArr2));
                                                c192878.f60681 = interfaceC18444.getName();
                                                c192878.f60683 = interfaceC18444.mo3568();
                                                c192878.f60679 = sb2;
                                                c192878.f60684 = i8;
                                                c192878.f60685 = i13;
                                                arrayList.add(c192878);
                                                break;
                                            } else {
                                                i13++;
                                            }
                                        }
                                    }
                                default:
                                    it = it6;
                                    switch (iArr[interfaceC22677.mo3975().f3316.ordinal()]) {
                                        case 1:
                                        case 2:
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                            if (((InterfaceC9541) interfaceC22677).mo4920() == j) {
                                                C19287 c192879 = new C19287(5);
                                                try {
                                                    int mo3818 = interfaceC18444.mo3570().mo3818();
                                                    InterfaceC18842 interfaceC18842 = C17177.f52643;
                                                    int m40411 = C17177.m40411(interfaceC18444.mo3565(), EnumC15657.STATIC.m36866(interfaceC18444.mo3567()));
                                                    System.out.println(interfaceC18444 + " " + mo3818 + " " + m40411);
                                                    C11418 c114182 = new C11418();
                                                    C3438 c34382 = new C3438(new C22706(c114182));
                                                    c114182.m28186(interfaceC22677.mo3975().f3315);
                                                    switch (C7591.f23464[interfaceC22677.mo3975().f3316.ordinal()]) {
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                        case 5:
                                                        case 6:
                                                            c114182.append(' ');
                                                            int mo1790 = ((InterfaceC1779) interfaceC22677).mo1790();
                                                            int i14 = mo3818 - m40411;
                                                            if (mo1790 >= i14) {
                                                                c34382.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c34382.m10510(mo1790 - i14);
                                                            } else {
                                                                c34382.write(118);
                                                                c34382.m10510(mo1790);
                                                            }
                                                            c114182.m28186(", ");
                                                            int length = c114182.length();
                                                            C4718.m13817(c34382, ((InterfaceC9541) interfaceC22677).mo4920());
                                                            c192879.m44469(length, c114182.length(), c114182.toString());
                                                            break;
                                                        case 7:
                                                        case 8:
                                                            c114182.append(' ');
                                                            int mo17902 = ((InterfaceC1779) interfaceC22677).mo1790();
                                                            int i15 = mo3818 - m40411;
                                                            if (mo17902 >= i15) {
                                                                c34382.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c34382.m10510(mo17902 - i15);
                                                            } else {
                                                                c34382.write(118);
                                                                c34382.m10510(mo17902);
                                                            }
                                                            c114182.m28186(", ");
                                                            int mo7930 = ((InterfaceC23651) interfaceC22677).mo7930();
                                                            if (mo7930 >= i15) {
                                                                c34382.write(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
                                                                c34382.m10510(mo7930 - i15);
                                                            } else {
                                                                c34382.write(118);
                                                                c34382.m10510(mo7930);
                                                            }
                                                            c114182.m28186(", ");
                                                            int length2 = c114182.length();
                                                            C4718.m13817(c34382, ((InterfaceC9541) interfaceC22677).mo4920());
                                                            c192879.m44469(length2, c114182.length(), c114182.toString());
                                                            break;
                                                    }
                                                } catch (IOException unused) {
                                                }
                                                c192879.f60681 = interfaceC18444.getName();
                                                c192879.f60683 = interfaceC18444.mo3568();
                                                c192879.f60679 = sb2;
                                                c192879.f60684 = i8;
                                                arrayList.add(c192879);
                                                break;
                                            }
                                            break;
                                    }
                            }
                            i8++;
                            c = 0;
                            it6 = it;
                        }
                        it = it6;
                        i8++;
                        c = 0;
                        it6 = it;
                    }
                }
            }
            it6 = it6;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC10410 m17086(InterfaceC10410 interfaceC10410, long j) {
        int mo2302 = interfaceC10410.mo2302();
        if (mo2302 != 0) {
            if (mo2302 != 6) {
                if (mo2302 != 2) {
                    if (mo2302 != 3) {
                        if (mo2302 != 4) {
                            if (mo2302 == 28) {
                                Iterator it = ((InterfaceC20288) interfaceC10410).getValue().iterator();
                                while (it.hasNext()) {
                                    InterfaceC10410 m17086 = m17086((InterfaceC10410) it.next(), j);
                                    if (m17086 != null) {
                                        return m17086;
                                    }
                                }
                                return null;
                            }
                            if (mo2302 != 29) {
                                return null;
                            }
                            Iterator it2 = ((InterfaceC22404) interfaceC10410).getElements().iterator();
                            while (it2.hasNext()) {
                                InterfaceC10410 m170862 = m17086(((InterfaceC9272) it2.next()).getValue(), j);
                                if (m170862 != null) {
                                    return m170862;
                                }
                            }
                            return null;
                        }
                        if (((InterfaceC13936) interfaceC10410).getValue() != j) {
                            return null;
                        }
                    } else if (((InterfaceC13231) interfaceC10410).getValue() != j) {
                        return null;
                    }
                } else if (((InterfaceC18213) interfaceC10410).getValue() != j) {
                    return null;
                }
            } else if (((InterfaceC7587) interfaceC10410).getValue() != j) {
                return null;
            }
        } else if (((InterfaceC3354) interfaceC10410).getValue() != j) {
            return null;
        }
        return interfaceC10410;
    }
}

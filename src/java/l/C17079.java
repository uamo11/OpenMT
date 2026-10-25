package l;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: 1B34 */
/* renamed from: l.ܿۗܳ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C17079 {

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f52367 = C1802.m5988(16);

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f52368 = C1802.m5988(4);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11459 f52369;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f52370;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f52371;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f52372;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public String f52373;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f52374;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f52375;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16373 f52376 = new C16373(this);

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f52377;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f52378;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7949 f52379;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f52380;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f52381;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final long f52382;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40082(C17079 c17079, InterfaceC17889 interfaceC17889, AbstractC1557 abstractC1557, String str, AtomicInteger atomicInteger, AbstractC13921 abstractC13921, Set set, C17785 c17785) {
        C10730 c10730;
        c17079.getClass();
        try {
            BufferedInputStream bufferedInputStream = null;
            String mo36977 = interfaceC17889.mo36978() ? interfaceC17889.mo36977() : null;
            if (mo36977 != null) {
                c10730 = c17079.f52376.m38538(mo36977);
                if (c17079.f52371) {
                    return;
                }
                Boolean bool = c10730.f32327;
                if (bool != null) {
                    C11003.requireNonNull(bool);
                    if (!bool.booleanValue()) {
                        return;
                    }
                    abstractC1557.m5330(new C12182(interfaceC17889, str));
                    atomicInteger.incrementAndGet();
                }
            } else {
                c10730 = null;
            }
            try {
                InputStream mo7636 = abstractC13921.mo7636((AbstractActivityC3346) null, interfaceC17889);
                if (mo7636 != null) {
                    if (mo7636 instanceof BufferedInputStream) {
                        bufferedInputStream = (BufferedInputStream) mo7636;
                    } else {
                        bufferedInputStream = new BufferedInputStream(mo7636);
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        if (c17079.m40087(bufferedInputStream)) {
                            if (c10730 != null) {
                                c10730.f32327 = Boolean.TRUE;
                                c10730.f32326.countDown();
                            }
                            abstractC1557.m5330(new C12182(interfaceC17889, str));
                            atomicInteger.incrementAndGet();
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
            if (c10730 != null) {
                if (!(c10730.f32327 != null)) {
                    c10730.f32327 = Boolean.FALSE;
                    c10730.f32326.countDown();
                }
            }
        } finally {
            set.remove(c17785);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40083(C17079 c17079, InterfaceC17889 interfaceC17889, AbstractC1557 abstractC1557, C12182 c12182, AbstractC13921 abstractC13921, Set set, C17785 c17785) {
        C10730 c10730;
        c17079.getClass();
        try {
            BufferedInputStream bufferedInputStream = null;
            String mo36977 = interfaceC17889.mo36978() ? interfaceC17889.mo36977() : null;
            if (mo36977 != null) {
                c10730 = c17079.f52376.m38538(mo36977);
                if (c17079.f52371) {
                    return;
                }
                Boolean bool = c10730.f32327;
                if (bool != null) {
                    C11003.requireNonNull(bool);
                    if (!bool.booleanValue()) {
                        return;
                    } else {
                        abstractC1557.m5330(c12182);
                    }
                }
            } else {
                c10730 = null;
            }
            try {
                InputStream mo7636 = abstractC13921.mo7636((AbstractActivityC3346) null, interfaceC17889);
                if (mo7636 != null) {
                    if (mo7636 instanceof BufferedInputStream) {
                        bufferedInputStream = (BufferedInputStream) mo7636;
                    } else {
                        bufferedInputStream = new BufferedInputStream(mo7636);
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        if (c17079.m40087(bufferedInputStream)) {
                            if (c10730 != null) {
                                c10730.f32327 = Boolean.TRUE;
                                c10730.f32326.countDown();
                            }
                            abstractC1557.m5330(c12182);
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }
            } catch (Exception unused) {
            }
            if (c10730 != null) {
                if (!(c10730.f32327 != null)) {
                    c10730.f32327 = Boolean.FALSE;
                    c10730.f32326.countDown();
                }
            }
        } finally {
            set.remove(c17785);
        }
    }

    public C17079(final String str, EnumC8655 enumC8655, boolean z, long j, long j2, long j3, long j4, C11459 c11459) {
        InterfaceC7949 interfaceC7949;
        InterfaceC7949 interfaceC79492;
        InterfaceC7949 interfaceC79493;
        if (str.isEmpty()) {
            interfaceC79493 = new C15709();
        } else {
            switch (C0893.f3466[enumC8655.ordinal()]) {
                case 1:
                    interfaceC7949 = new InterfaceC7949() { // from class: l.ۖۙܳ
                        @Override // l.InterfaceC7949
                        /* renamed from: ֫ */
                        public final boolean mo1332(String str2) {
                            int i = 0;
                            while (!C5127.m14679(i, str2, str)) {
                                if (i == str2.length()) {
                                    return false;
                                }
                                i += Character.charCount(str2.codePointAt(i));
                            }
                            return true;
                        }
                    };
                    interfaceC79493 = interfaceC7949;
                    break;
                case 2:
                    interfaceC7949 = new InterfaceC7949() { // from class: l.ۘۙܳ
                        @Override // l.InterfaceC7949
                        /* renamed from: ֫ */
                        public final boolean mo1332(String str2) {
                            return C5127.m14679(0, str2, str);
                        }
                    };
                    interfaceC79493 = interfaceC7949;
                    break;
                case 3:
                    final int codePointCount = str.codePointCount(0, str.length());
                    interfaceC79492 = new InterfaceC7949() { // from class: l.ᩴۙܳ
                        @Override // l.InterfaceC7949
                        /* renamed from: ֫ */
                        public final boolean mo1332(String str2) {
                            int codePointCount2 = str2.codePointCount(0, str2.length());
                            int i = codePointCount;
                            if (codePointCount2 < i) {
                                return false;
                            }
                            return C5127.m14679(str2.offsetByCodePoints(0, codePointCount2 - i), str2, str);
                        }
                    };
                    interfaceC79493 = interfaceC79492;
                    break;
                case 4:
                    final int codePointCount2 = str.codePointCount(0, str.length());
                    interfaceC79492 = new InterfaceC7949() { // from class: l.᩵ۙܳ
                        @Override // l.InterfaceC7949
                        /* renamed from: ֫ */
                        public final boolean mo1332(String str2) {
                            return str2.codePointCount(0, str2.length()) == codePointCount2 && C5127.m14679(0, str2, str);
                        }
                    };
                    interfaceC79493 = interfaceC79492;
                    break;
                case 5:
                    interfaceC79493 = C15003.m35540(str);
                    break;
                case 6:
                    final C12164 matcher = C11459.m28259(66, str).matcher((CharSequence) "");
                    interfaceC7949 = new InterfaceC7949() { // from class: l.֡ۙܳ
                        @Override // l.InterfaceC7949
                        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
                        public final boolean mo1332(String str2) {
                            C12164 c12164 = C12164.this;
                            c12164.m29615reset((CharSequence) str2);
                            return c12164.matches();
                        }
                    };
                    interfaceC79493 = interfaceC7949;
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported filename match mode: " + enumC8655);
            }
        }
        this.f52379 = interfaceC79493;
        this.f52370 = z;
        this.f52381 = j;
        this.f52382 = j2;
        this.f52374 = j3;
        this.f52372 = j4;
        this.f52369 = c11459;
        this.f52375 = (j == -1 && j2 == -1) ? false : true;
        this.f52378 = (j3 == -1 && j4 == -1) ? false : true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40090() {
        this.f52371 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40091(final AbstractC13921 abstractC13921, String str, final AbstractC1557 abstractC1557, List list) {
        List list2;
        this.f52371 = false;
        this.f52380 = false;
        this.f52376.m38539();
        this.f52377 = str;
        String str2 = "/";
        if (str.equals("/")) {
            this.f52373 = "/";
        } else {
            this.f52373 = "./";
        }
        final AtomicInteger atomicInteger = new AtomicInteger();
        LinkedList linkedList = new LinkedList(list);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Set newSetFromMap = Collections.newSetFromMap(new ConcurrentMapC10942());
        loop0: while (true) {
            if (linkedList.isEmpty()) {
                Set set = newSetFromMap;
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                if (!linkedHashMap2.isEmpty()) {
                    abstractC13921.mo7640(linkedHashMap2.keySet(), new C7243(this, linkedHashMap2, abstractC1557, atomicInteger));
                }
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C17785 c17785 = (C17785) it.next();
                    if (this.f52371) {
                        m40081(set);
                        break;
                    } else if (!c17785.f54398.isDone()) {
                        abstractC1557.mo5329(c17785.f54399, false);
                        try {
                            c17785.f54398.get();
                        } catch (Exception unused) {
                        }
                    }
                }
            } else {
                if (this.f52371) {
                    m40081(newSetFromMap);
                    break;
                }
                String str3 = (String) linkedList.removeFirst();
                if (!str3.isEmpty() && !str3.endsWith(str2)) {
                    str3 = str3.concat(str2);
                }
                String str4 = str3;
                String m23341 = C9045.m23341(new StringBuilder(), this.f52373, str4);
                boolean z = true;
                abstractC1557.mo5329(m23341, true);
                try {
                    list2 = abstractC13921.mo7637(this.f52377 + str4, true);
                } catch (IOException unused2) {
                    list2 = Collections.EMPTY_LIST;
                }
                List<InterfaceC17889> list3 = list2;
                for (final InterfaceC17889 interfaceC17889 : list3) {
                    if (this.f52371) {
                        m40081(newSetFromMap);
                        break loop0;
                    }
                    if (atomicInteger.get() >= 10000) {
                        this.f52371 = z;
                        this.f52380 = z;
                        m40081(newSetFromMap);
                        break loop0;
                    }
                    if (m40089(interfaceC17889)) {
                        if (this.f52369 == null) {
                            abstractC1557.m5330(new C12182(interfaceC17889, m23341));
                            atomicInteger.incrementAndGet();
                        } else if (!m40086(interfaceC17889)) {
                            continue;
                        } else if (abstractC13921.mo7652()) {
                            linkedHashMap.put(interfaceC17889, m23341);
                        } else {
                            while (newSetFromMap.size() > 500) {
                                SystemClock.sleep(10L);
                                if (this.f52371) {
                                    break loop0;
                                }
                            }
                            StringBuilder m15339 = C5368.m15339(m23341);
                            m15339.append(interfaceC17889.getName());
                            final C17785 c177852 = new C17785(m15339.toString());
                            newSetFromMap.add(c177852);
                            final String str5 = m23341;
                            c177852.f54398 = (abstractC13921 instanceof AbstractC3163 ? f52368 : f52367).submit(new Runnable() { // from class: l.᩺ۙܳ
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C17079.m40082(C17079.this, interfaceC17889, abstractC1557, str5, atomicInteger, abstractC13921, newSetFromMap, c177852);
                                }
                            });
                            z = true;
                            linkedHashMap = linkedHashMap;
                            str2 = str2;
                            m23341 = m23341;
                            str4 = str4;
                        }
                    }
                }
                String str6 = str4;
                Set set2 = newSetFromMap;
                LinkedHashMap linkedHashMap3 = linkedHashMap;
                String str7 = str2;
                if (this.f52370) {
                    for (InterfaceC17889 interfaceC178892 : list3) {
                        if (interfaceC178892.isDirectory() && !interfaceC178892.mo36978() && (!(interfaceC178892 instanceof C9555) || !interfaceC178892.getName().contains(".recycle") || !C21939.m49417() || !interfaceC178892.getPath().equals(C21939.m49419().mo23554()))) {
                            StringBuilder m153392 = C5368.m15339(str6);
                            m153392.append(interfaceC178892.getName());
                            m153392.append('/');
                            linkedList.addLast(m153392.toString());
                        }
                    }
                }
                linkedHashMap = linkedHashMap3;
                str2 = str7;
                newSetFromMap = set2;
            }
        }
        if (this.f52380) {
            C4925.m14315(new RunnableC5832());
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40092(final AbstractC13921 abstractC13921, List list, final AbstractC1557 abstractC1557) {
        this.f52371 = false;
        this.f52376.m38539();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final Set<C17785> newSetFromMap = Collections.newSetFromMap(new ConcurrentMapC10942());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final C12182 c12182 = (C12182) it.next();
            abstractC1557.mo5329(c12182.m29662(), true);
            final InterfaceC17889 m29658 = c12182.m29658();
            if (this.f52371) {
                m40081(newSetFromMap);
                return;
            }
            if (m40089(m29658)) {
                if (this.f52369 == null) {
                    abstractC1557.m5330(c12182);
                } else if (!m40086(m29658)) {
                    continue;
                } else if (abstractC13921.mo7652()) {
                    linkedHashMap.put(m29658, c12182);
                } else {
                    while (newSetFromMap.size() > 500) {
                        SystemClock.sleep(10L);
                        if (this.f52371) {
                            return;
                        }
                    }
                    final C17785 c17785 = new C17785(c12182.m29663());
                    newSetFromMap.add(c17785);
                    c17785.f54398 = (abstractC13921 instanceof AbstractC3163 ? f52368 : f52367).submit(new Runnable() { // from class: l.ۤۙܳ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C17079.m40083(C17079.this, m29658, abstractC1557, c12182, abstractC13921, newSetFromMap, c17785);
                        }
                    });
                    it = it;
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            abstractC13921.mo7640(linkedHashMap.keySet(), new C13592(this, linkedHashMap, abstractC1557));
        }
        for (C17785 c177852 : newSetFromMap) {
            if (this.f52371) {
                m40081(newSetFromMap);
                return;
            } else if (!c177852.f54398.isDone()) {
                abstractC1557.mo5329(c177852.f54399, false);
                try {
                    c177852.f54398.get();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m40089(InterfaceC17889 interfaceC17889) {
        if (this.f52375) {
            if (interfaceC17889.isDirectory()) {
                return false;
            }
            long size = interfaceC17889.getSize();
            long j = this.f52381;
            if (j != -1 && j > size) {
                return false;
            }
            long j2 = this.f52382;
            if (j2 != -1 && size >= j2) {
                return false;
            }
        }
        if (this.f52378) {
            long time = interfaceC17889.getTime();
            long j3 = this.f52374;
            if (j3 != -1 && j3 > time) {
                return false;
            }
            long j4 = this.f52372;
            if (j4 != -1 && time >= j4) {
                return false;
            }
        }
        return this.f52379.mo1332(interfaceC17889.getName());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40086(InterfaceC17889 interfaceC17889) {
        if (!interfaceC17889.mo36969() || interfaceC17889.getSize() <= 0) {
            return false;
        }
        String path = interfaceC17889.getPath();
        if (path.startsWith("/sys/devices/")) {
            return false;
        }
        if (path.startsWith("/proc/") && path.contains("/fd/")) {
            return false;
        }
        String mo36977 = interfaceC17889.mo36977();
        if (mo36977 != null) {
            return (!mo36977.startsWith("/") || mo36977.startsWith("/memfd:") || mo36977.equals("/dmabuf:") || mo36977.equals("/[aio] (deleted)") || mo36977.startsWith("/sys/devices/")) ? false : true;
        }
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m40081(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C17785 c17785 = (C17785) it.next();
            if (!c17785.f54398.isDone()) {
                c17785.f54398.cancel(true);
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static BufferedInputStream m40080(InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m40087(InputStream inputStream) {
        byte[] bArr = new byte[65536];
        inputStream.mark(65536);
        int read = inputStream.read(bArr);
        if (read == -1) {
            return false;
        }
        Charset m35151 = C14776.m35151(C14776.m35152(read, bArr));
        inputStream.reset();
        return new C4131(new InputStreamReader(inputStream, m35151)).m12410(this.f52369, new InterfaceC17066() { // from class: l.ۨۙܳ
            @Override // l.InterfaceC17066
            /* renamed from: ᩻ */
            public final boolean mo1526() {
                boolean z;
                z = C17079.this.f52371;
                return z;
            }
        }, false);
    }
}

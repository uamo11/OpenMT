package l;

import com.alipay.sdk.m.u0.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: 44YS */
/* renamed from: l.֨ܶۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1193 {

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final HashSet f4308 = new HashSet(Arrays.asList("decode_J", "decode_I", "decode_S", "decode_B"));

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Comparator f4309 = new C19539();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12175 f4321 = new C12175();

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1550 f4317 = new C1550();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6489 f4313 = new C6489();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15660 f4322 = new C15660();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C4414 f4315 = new C4414();

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C22012 f4314 = new C22012();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22053 f4316 = new C22053();

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20889 f4319 = new C20889();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2297 f4310 = new C2297();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10018 f4318 = new C10018();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22717 f4312 = new C22717();

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11429 f4311 = new C11429();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14249 f4323 = new C14249();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5825 f4320 = new C5825();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m4023(int i) {
        return (i & 2) != 0 ? i & (-38) : (i & 4) != 0 ? i & (-34) : i & (-33);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m4033(int i) {
        int i2 = i & 7;
        if ((i2 & (i2 - 1)) != 0) {
            i ^= 7;
        }
        return i & (~((i & 256) != 0 ? 512 : 32));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m4026(String str) {
        return C11926.m29091(str).m29103();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4030(List list, AbstractC14104 abstractC14104) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2088 c2088 = (C2088) it.next();
            m4031(abstractC14104, c2088.f6964, c2088.f6965);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4031(AbstractC14104 abstractC14104, String str, Object obj) {
        if (obj instanceof Object[]) {
            AbstractC14104 mo20788 = abstractC14104.mo20788(str);
            if (mo20788 != null) {
                for (Object obj2 : (Object[]) obj) {
                    m4031(mo20788, (String) null, obj2);
                }
                mo20788.mo20790();
                return;
            }
            return;
        }
        if (obj instanceof C11261) {
            C11261 c11261 = (C11261) obj;
            AbstractC14104 mo20789 = abstractC14104.mo20789(str, c11261.f33752);
            if (mo20789 != null) {
                Iterator it = c11261.f33751.iterator();
                while (it.hasNext()) {
                    C2088 c2088 = (C2088) it.next();
                    m4031(mo20789, c2088.f6964, c2088.f6965);
                }
                mo20789.mo20790();
                return;
            }
            return;
        }
        if (obj instanceof C13687) {
            C13687 c13687 = (C13687) obj;
            abstractC14104.mo20793(str, c13687.m32934(), c13687.m32932());
        } else {
            if (obj instanceof C22860) {
                abstractC14104.mo20792(C11926.m29091(((C22860) obj).f73758), str);
                return;
            }
            if (obj instanceof C7338) {
                System.err.println("WARN: ignored method annotation value");
            } else if (obj == null) {
                System.err.println("WARN: ignored null annotation value");
            } else {
                abstractC14104.mo20792(obj, str);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (((java.lang.Double) r14).doubleValue() == 0.0d) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f3, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        if (((java.lang.Character) r14).charValue() == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bd, code lost:
    
        if (((java.lang.Byte) r14).byteValue() == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (((java.lang.Long) r14).longValue() == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d3, code lost:
    
        if (((java.lang.Integer) r14).intValue() == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e5, code lost:
    
        if (((java.lang.Short) r14).shortValue() == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f1, code lost:
    
        if (((java.lang.Float) r14).floatValue() == 0.0f) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0430 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x002a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018f  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m4035(l.C4205 r20, l.C16904 r21, l.InterfaceC16009 r22, java.util.HashMap r23) {
        /*
            Method dump skipped, instructions count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1193.m4035(l.ۘ᩸ۖ, l.ܽ᩸ۖ, l.ܺܶۖ, java.util.HashMap):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4034(final C4205 c4205, final InterfaceC16009 interfaceC16009, final C19277 c19277) {
        int i;
        ArrayList arrayList = c4205.f13672;
        if (arrayList != null) {
            final HashMap hashMap = new HashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C16904 c16904 = (C16904) it.next();
                C0487 m4028 = m4028(hashMap, c16904.f51963);
                m4028.f2095 = (m4028.f2095 & (-1537)) | c16904.f51964;
                ArrayList arrayList2 = c16904.f51965;
                if (arrayList2 != null) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C11261 c11261 = (C11261) it2.next();
                        if (c11261.f33753 == EnumC16715.SYSTEM) {
                            String str = c11261.f33752;
                            str.getClass();
                            switch (str) {
                                case "Ldalvik/annotation/InnerClass;":
                                    Iterator it3 = c11261.f33751.iterator();
                                    while (it3.hasNext()) {
                                        C2088 c2088 = (C2088) it3.next();
                                        String str2 = c2088.f6964;
                                        Object obj = c2088.f6965;
                                        if ("accessFlags".equals(str2)) {
                                            m4028.f2095 |= ((Integer) obj).intValue() & (-1537);
                                        } else if ("name".equals(c2088.f6964)) {
                                            m4028.f2100 = (String) obj;
                                        }
                                    }
                                    break;
                                case "Ldalvik/annotation/EnclosingClass;":
                                    C0487 m40282 = m4028(hashMap, ((C22860) m4025(c11261, b.d)).f73758);
                                    m4028.f2096 = m40282;
                                    m40282.m2149(m4028);
                                    break;
                                case "Ldalvik/annotation/MemberClasses;":
                                    for (Object obj2 : (Object[]) m4025(c11261, b.d)) {
                                        C0487 m40283 = m4028(hashMap, ((C22860) obj2).f73758);
                                        m4028.m2149(m40283);
                                        m40283.f2096 = m4028;
                                    }
                                    break;
                                case "Ldalvik/annotation/EnclosingMethod;":
                                    C7338 c7338 = (C7338) m4025(c11261, b.d);
                                    C0487 m40284 = m4028(hashMap, c7338.m19702());
                                    m4028.f2096 = m40284;
                                    m4028.f2098 = c7338;
                                    m40284.m2149(m4028);
                                    break;
                            }
                        }
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            final AtomicReference atomicReference = new AtomicReference();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                final C16904 c169042 = (C16904) it4.next();
                arrayList3.add(C1802.f6207.submit(new Runnable() { // from class: l.ۖܶۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1193 c1193 = C1193.this;
                        C4205 c42052 = c4205;
                        C16904 c169043 = c169042;
                        InterfaceC16009 interfaceC160092 = interfaceC16009;
                        HashMap hashMap2 = hashMap;
                        C19277 c192772 = c19277;
                        if (c192772.m44462()) {
                            return;
                        }
                        AtomicReference atomicReference2 = atomicReference;
                        if (atomicReference2.get() != null) {
                            return;
                        }
                        c192772.m44460(1);
                        try {
                            c1193.m4035(c42052, c169043, interfaceC160092, hashMap2);
                        } catch (Throwable th) {
                            atomicReference2.set(th);
                            throw th;
                        }
                    }
                }));
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Future future = (Future) it5.next();
                if (c19277.m44462()) {
                    future.cancel(true);
                } else {
                    while (true) {
                        try {
                            try {
                                future.get(500L, TimeUnit.MILLISECONDS);
                                break;
                            } catch (TimeoutException unused) {
                                if (c19277.m44462()) {
                                    future.cancel(true);
                                }
                            }
                        } catch (InterruptedException unused2) {
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            if (cause instanceof RuntimeException) {
                                throw ((RuntimeException) cause);
                            }
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m4032(String str, boolean z) {
        if (str == null) {
            return false;
        }
        try {
            C6532 c6532 = new C6532(str);
            C9355 c9355 = new C9355();
            if (z) {
                c6532.m18040(c9355);
                return false;
            }
            c6532.m18039(c9355);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m4024(Object obj) {
        if (obj instanceof C22860) {
            return C11926.m29091(((C22860) obj).f73758);
        }
        if (obj instanceof C1899) {
            return m4029((C1899) obj);
        }
        return obj instanceof C11072 ? C11926.m29096(((C11072) obj).m27467()) : obj;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0636 m4029(C1899 c1899) {
        switch (c1899.m6250()) {
            case 0:
                return new C0636(4, m4026(c1899.m6248().m32933()), c1899.m6248().m32932(), c1899.m6248().m32934(), false);
            case 1:
                return new C0636(2, m4026(c1899.m6248().m32933()), c1899.m6248().m32932(), c1899.m6248().m32934(), false);
            case 2:
                return new C0636(3, m4026(c1899.m6248().m32933()), c1899.m6248().m32932(), c1899.m6248().m32934(), false);
            case 3:
                return new C0636(1, m4026(c1899.m6248().m32933()), c1899.m6248().m32932(), c1899.m6248().m32934(), false);
            case 4:
                return new C0636(6, m4026(c1899.m6249().m19702()), c1899.m6249().m19700(), c1899.m6249().m19699(), false);
            case 5:
                return new C0636(5, m4026(c1899.m6249().m19702()), c1899.m6249().m19700(), c1899.m6249().m19699(), false);
            case 6:
                return new C0636(8, m4026(c1899.m6249().m19702()), c1899.m6249().m19700(), c1899.m6249().m19699(), false);
            case 7:
                return new C0636(7, m4026(c1899.m6249().m19702()), c1899.m6249().m19700(), c1899.m6249().m19699(), false);
            case 8:
                return new C0636(9, m4026(c1899.m6249().m19702()), c1899.m6249().m19700(), c1899.m6249().m19699(), true);
            default:
                return null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo4038(C19728 c19728, AbstractC15452 abstractC15452, C5427 c5427) {
        C5637 m47765 = new C20950().m47765((c19728.f63749 & 8) != 0, c19728.f63747, c19728.f63748);
        mo4036(m47765);
        mo4037(m47765, abstractC15452, c5427);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m4025(C11261 c11261, String str) {
        Iterator it = c11261.f33751.iterator();
        while (it.hasNext()) {
            C2088 c2088 = (C2088) it.next();
            if (c2088.f6964.equals(str)) {
                return c2088.f6965;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0487 m4028(HashMap hashMap, String str) {
        C0487 c0487 = (C0487) hashMap.get(str);
        if (c0487 != null) {
            return c0487;
        }
        C0487 c04872 = new C0487(str);
        hashMap.put(str, c04872);
        return c04872;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo4037(C5637 c5637, AbstractC15452 abstractC15452, C5427 c5427) {
        C8955 c8955 = new C8955();
        c8955.m23087(c5427);
        c8955.m23088(c5637);
        c8955.m23089(abstractC15452);
        c8955.m23086();
        abstractC15452.mo28294(-1, -1);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo4036(C5637 c5637) {
        C21348.m48379(c5637);
        this.f4316.getClass();
        C22053.m49615(c5637);
        C15660 c15660 = this.f4322;
        c15660.m36872(c5637);
        C6489 c6489 = this.f4313;
        c6489.m17919(c5637);
        this.f4312.m50753(c5637);
        if (this.f4323.m33898(c5637)) {
            C22053.m49615(c5637);
            c15660.m36872(c5637);
            c6489.m17919(c5637);
        }
        this.f4317.getClass();
        C1550.m5309(c5637);
        this.f4319.m47720(c5637);
        this.f4310.m7562(c5637);
        this.f4320.m16331(c5637);
        this.f4311.m28242(c5637);
        C22053.m49615(c5637);
        c15660.m36872(c5637);
        c6489.m17919(c5637);
        this.f4314.getClass();
        C22012.m49532(c5637);
        this.f4318.getClass();
        C10018.m25188(c5637);
        this.f4315.getClass();
        C4414.m13138(c5637);
        this.f4321.m29652(c5637);
    }
}

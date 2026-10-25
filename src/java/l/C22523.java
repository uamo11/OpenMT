package l;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipException;

/* compiled from: 81ZE */
/* renamed from: l.᩹᩶᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22523 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21818 m50499(AbstractC15440 abstractC15440, boolean z) {
        AbstractC15440 abstractC154402;
        AbstractC15440 abstractC154403;
        C21818 c21818 = new C21818(abstractC15440);
        if (z) {
            c21818.f69894 = C16293.f50111.m36527();
        } else {
            abstractC154402 = c21818.f69893;
            c21818.f69894 = abstractC154402.m36520(".tmp");
        }
        abstractC154403 = c21818.f69894;
        c21818.f69895 = new C8918(abstractC154403);
        return c21818;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50504(C21818 c21818) {
        AbstractC15440 abstractC15440;
        abstractC15440 = c21818.f69893;
        c21818.f69894 = abstractC15440.m36520(".tmp");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m50496(Collection collection) {
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            C3545 c3545 = (C3545) it.next();
            if (!c3545.isDirectory()) {
                j += c3545.m10793();
            }
        }
        return j;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50505(C3545 c3545) {
        return c3545.m10808() && c3545.m10792() && c3545.m10767() == 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m50498(C18090 c18090, C3545 c3545, InterfaceC17066 interfaceC17066) {
        List<C12511> m26223 = C10395.m26223();
        if (!m50505(c3545)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        String m42208 = c18090.m42208();
        try {
            for (C12511 c12511 : m26223) {
                if (interfaceC17066.mo1526()) {
                    break;
                }
                c18090.m42192(c12511.f37581);
                try {
                    InputStream m42189 = c18090.m42189(c3545);
                    try {
                        arrayList.add(c12511);
                        m42189.close();
                    } catch (Throwable th) {
                        try {
                            m42189.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (C3979 unused) {
                }
            }
            c18090.m42192(m42208);
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C11003.requireNonNull(next);
                arrayList2.add(next);
            }
            return C20195.unmodifiableList(arrayList2);
        } catch (Throwable th3) {
            c18090.m42192(m42208);
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[Catch: all -> 0x0080, TryCatch #1 {all -> 0x0080, blocks: (B:9:0x001b, B:40:0x0096, B:42:0x009f, B:43:0x00a2, B:47:0x00ac), top: B:8:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0 A[LOOP:0: B:8:0x001b->B:45:0x00b0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.io.InputStream, java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.io.BufferedInputStream] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m50502(java.lang.String r17, l.C18090 r18, l.C3545 r19, l.AbstractC15440 r20, boolean r21, l.InterfaceC15466 r22) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22523.m50502(java.lang.String, l.ᩳܰۡ, l.ۗ᩺ۡ, l.ܶ᩵ܿ, boolean, l.ܶ᩶᩻):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50503(C3545 c3545, C18090 c18090, C8918 c8918, InterfaceC8412 interfaceC8412) {
        C12445 c12445;
        if (c8918.m23024(c3545)) {
            return;
        }
        c8918.m23020(c3545);
        byte[] bArr = new byte[4096];
        try {
            c12445 = c18090.m42206(c3545);
            long j = 0;
            do {
                try {
                    int read = c12445.read(bArr);
                    if (read <= 0) {
                        C0349.m1793(c12445);
                        return;
                    } else {
                        c8918.m23010(read, bArr);
                        j += read;
                        interfaceC8412.mo21265(j, c3545.getSize());
                    }
                } catch (Throwable th) {
                    th = th;
                    C0349.m1793(c12445);
                    throw th;
                }
            } while (!interfaceC8412.mo1526());
            C0349.m1793(c12445);
        } catch (Throwable th2) {
            th = th2;
            c12445 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InputStream m50497(C3545 c3545, AbstractC15440 abstractC15440, byte[] bArr, String str, C0225 c0225) {
        C18090 m42168;
        if (c0225 != null) {
            m42168 = (C18090) c0225.m1479();
            if (m42168 == null) {
                m42168 = C18090.m42168(abstractC15440, bArr);
            }
        } else {
            m42168 = C18090.m42168(abstractC15440, bArr);
        }
        m42168.m42192(str);
        try {
            InputStream m42189 = m42168.m42189(c3545);
            return c0225 == null ? m42189 : new C1356(m42189, c0225, m42168);
        } catch (IOException e) {
            C0349.m1793(m42168);
            throw e;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m50506(C3545 c3545, BufferedInputStream bufferedInputStream) {
        try {
            bufferedInputStream.mark(1024);
            bufferedInputStream.read(new byte[1024]);
            bufferedInputStream.reset();
            return true;
        } catch (ZipException e) {
            if (c3545.m10792()) {
                return false;
            }
            throw e;
        } catch (C3979 unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50500() {
        C4925.m14315(new RunnableC0650());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50501(String str, String str2) {
        ActivityC3339.m10197(str, str2);
        C4925.m14315(new RunnableC5590());
    }
}

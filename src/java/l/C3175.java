package l;

import java.util.UUID;

/* compiled from: T7U3 */
/* renamed from: l.ۗۤܳ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3175 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f9985 = new ConcurrentMapC10942();

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m9731(AbstractC13301 abstractC13301) {
        String uuid = UUID.randomUUID().toString();
        f9985.put(uuid, abstractC13301);
        C4925.m14324().postDelayed(new RunnableC3505(1, uuid), 10 * 1000);
        return uuid;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m9733(String str) {
        ConcurrentMapC10942 concurrentMapC10942 = f9985;
        Object obj = concurrentMapC10942.get(str);
        if (obj != null) {
            concurrentMapC10942.remove(str);
        }
        return obj;
    }
}

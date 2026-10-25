package l;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: HAQ9 */
/* renamed from: l.֨ܽܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1245 extends Error {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final ArrayList f4435 = new ArrayList();

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1245(long r5, java.util.Map r7) {
        /*
            r4 = this;
            java.lang.String r0 = "Application unresponsive for at least "
            java.lang.String r1 = " ms."
            java.lang.StringBuilder r5 = l.C12803.m31106(r0, r1, r5)
            java.util.Set r6 = r7.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L10:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L56
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r0 = r7.getKey()
            java.lang.Thread r0 = (java.lang.Thread) r0
            r1 = 10
            r5.append(r1)
            java.lang.String r1 = r0.getName()
            r5.append(r1)
            java.lang.String r1 = " (state = "
            r5.append(r1)
            java.lang.Thread$State r0 = r0.getState()
            r5.append(r0)
            java.lang.String r0 = ")"
            r5.append(r0)
            java.lang.Object r7 = r7.getValue()
            java.lang.StackTraceElement[] r7 = (java.lang.StackTraceElement[]) r7
            int r0 = r7.length
            r1 = 0
        L47:
            if (r1 >= r0) goto L10
            r2 = r7[r1]
            java.lang.String r3 = "\n    at "
            r5.append(r3)
            r5.append(r2)
            int r1 = r1 + 1
            goto L47
        L56:
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            java.util.ArrayList r5 = l.C1245.f4435
            java.util.Iterator r5 = r5.iterator()
        L63:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L73
            java.lang.Object r6 = r5.next()
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r6.run()
            goto L63
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1245.<init>(long, java.util.Map):void");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? "ANRError: ".concat(localizedMessage) : "ANRError";
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1245 m4090() {
        return m4092(0L, "", null);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1245 m4092(long j, String str, C15355 c15355) {
        final Thread thread = Looper.getMainLooper().getThread();
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: l.ۚܽܽ
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Thread thread2 = (Thread) obj;
                Thread thread3 = (Thread) obj2;
                if (thread2 == thread3) {
                    return 0;
                }
                Thread thread4 = thread;
                if (thread2 == thread4) {
                    return -1;
                }
                if (thread3 == thread4) {
                    return 1;
                }
                return thread3.getName().compareTo(thread2.getName());
            }
        });
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            Thread key = entry.getKey();
            if (key != c15355) {
                StackTraceElement[] value = entry.getValue();
                if (key == thread || (key.getName().startsWith(str) && value.length > 0)) {
                    treeMap.put(key, value);
                }
            }
        }
        if (!treeMap.containsKey(thread)) {
            treeMap.put(thread, thread.getStackTrace());
        }
        return new C1245(j, treeMap);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C1245 m4091(long j) {
        Thread thread = Looper.getMainLooper().getThread();
        return new C1245(j, Collections.singletonMap(thread, thread.getStackTrace()));
    }
}

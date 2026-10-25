package l;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;

/* compiled from: P676 */
/* renamed from: l.ᩴ᩹ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class RunnableC19053 implements Runnable {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f60016;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f60017;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60018;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f60019;

    public /* synthetic */ RunnableC19053(Object obj, Object obj2, Object obj3, int i) {
        this.f60018 = i;
        this.f60019 = obj;
        this.f60017 = obj2;
        this.f60016 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11258 c11258;
        switch (this.f60018) {
            case 0:
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f60019;
                Pattern pattern = (Pattern) this.f60017;
                C0644 c0644 = (C0644) this.f60016;
                while (!concurrentLinkedQueue.isEmpty() && (c11258 = (C11258) concurrentLinkedQueue.poll()) != null) {
                    C7540 m27863 = c11258.m27863();
                    if (m27863 != null) {
                        C13889[] m20249 = m27863.m20249();
                        int length = m20249.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                for (C13889 c13889 : m27863.m20254()) {
                                    if (!C5584.m15863(c13889, pattern)) {
                                    }
                                }
                            } else if (!C5584.m15863(m20249[i], pattern)) {
                                i++;
                            }
                        }
                        synchronized (c0644) {
                            c0644.f2492.add(c11258);
                        }
                    }
                }
                return;
            case 1:
                C22372.m50188((C22372) this.f60019, (C12392) this.f60016, (Runnable) this.f60017);
                return;
            default:
                C2405.m7799((String) this.f60019, (ViewOnClickListenerC5850) this.f60017, (C13318) this.f60016);
                return;
        }
    }
}

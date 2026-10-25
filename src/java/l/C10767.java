package l;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: B74E */
/* renamed from: l.ۧۙۜ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10767 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final ThreadPoolExecutor f32416 = new ThreadPoolExecutor(0, 4, 10, TimeUnit.SECONDS, new SynchronousQueue());

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ThreadPoolExecutor m26979() {
        return f32416;
    }
}

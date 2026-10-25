package l;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: 68UW */
/* renamed from: l.֡ۤ֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final /* synthetic */ class ExecutorC0344 implements Executor {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Handler f1756;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1756.post(runnable);
    }
}

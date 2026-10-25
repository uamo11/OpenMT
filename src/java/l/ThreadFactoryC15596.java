package l;

import java.util.concurrent.ThreadFactory;

/* compiled from: R5PD */
/* renamed from: l.ܺ֨֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final /* synthetic */ class ThreadFactoryC15596 implements ThreadFactory {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f48039;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f48039);
    }
}

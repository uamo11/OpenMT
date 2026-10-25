package com.amazonaws.event;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public class ProgressListenerCallbackExecutor {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f168 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static ExecutorService f169 = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.amazonaws.event.ProgressListenerCallbackExecutor.3
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("android-sdk-progress-listener-callback-thread");
            thread.setDaemon(true);
            return thread;
        }
    });

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ProgressListener f170;

    public ProgressListenerCallbackExecutor(ProgressListener progressListener) {
        this.f170 = progressListener;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m231(final ProgressEvent progressEvent) {
        if (this.f170 == null) {
            return;
        }
        f169.submit(new Runnable() { // from class: com.amazonaws.event.ProgressListenerCallbackExecutor.2
            @Override // java.lang.Runnable
            public final void run() {
                ProgressListenerCallbackExecutor.this.f170.mo229(progressEvent);
            }
        });
    }
}

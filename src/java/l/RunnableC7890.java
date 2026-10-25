package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: N6VA */
/* renamed from: l.۠ۖܿ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class RunnableC7890 implements Runnable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f24438;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public List f24439;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f24440;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public volatile boolean f24441;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f24442;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f24443;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f24444;

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22002 f24445;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f24446;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f24447;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3158 f24448;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C7744 f24449;

    public RunnableC7890(C22002 c22002, int i, int i2) {
        C20798 c20798;
        this.f24445 = c22002;
        this.f24439 = Collections.EMPTY_LIST;
        this.f24442 = i;
        this.f24447 = i2;
        c20798 = c22002.f70526;
        this.f24438 = c20798.f67335;
        this.f24443 = false;
    }

    public RunnableC7890(C22002 c22002, int i, int i2, int i3) {
        this.f24445 = c22002;
        this.f24439 = Collections.EMPTY_LIST;
        this.f24442 = i;
        this.f24447 = i2;
        this.f24438 = i3;
        this.f24443 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21178() {
        boolean z;
        InterfaceC17066 interfaceC17066;
        if (this.f24441) {
            return true;
        }
        z = this.f24445.f70525;
        if (z) {
            return true;
        }
        interfaceC17066 = this.f24445.f70515;
        return interfaceC17066.mo1526();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m21179() {
        ArrayList arrayList;
        arrayList = this.f24445.f70522;
        synchronized (arrayList) {
            this.f24441 = true;
            this.f24439 = Collections.EMPTY_LIST;
        }
        synchronized (this) {
            if (!this.f24440) {
                m21177();
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m21177() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        this.f24448 = null;
        if (this.f24449 != null) {
            concurrentLinkedQueue = this.f24445.f70518;
            concurrentLinkedQueue.add(this.f24449);
            this.f24449 = null;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m21180() {
        Executor executor;
        try {
            executor = this.f24445.f70523;
            executor.execute(this);
        } catch (Error | RuntimeException e) {
            m21179();
            this.f24446 = true;
            this.f24445.m49507();
            if (!(e instanceof RejectedExecutionException)) {
                throw e;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0181 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [l.֨ۖܿ] */
    /* JADX WARN: Type inference failed for: r7v7, types: [l.֨ۖܿ] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.RunnableC7890.run():void");
    }
}

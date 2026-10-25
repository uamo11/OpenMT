package l;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: D8IT */
/* renamed from: l.۫ܳۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12468 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8353 f37485;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10352 f37486;

    public C12468(C10352 c10352) {
        this.f37486 = c10352;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30628(final C6404 c6404) {
        Executor executor;
        C1297 c1297 = new C1297();
        c1297.m4453(c6404.f19815);
        c1297.m4457(c6404.f19813);
        c1297.m4465("video/raw");
        this.f37485 = c1297.m4440();
        executor = this.f37486.f31158;
        executor.execute(new Runnable() { // from class: l.۬ܳۧ
            @Override // java.lang.Runnable
            public final void run() {
                InterfaceC17182 interfaceC17182;
                interfaceC17182 = C12468.this.f37486.f31156;
                interfaceC17182.mo25026(c6404);
            }
        });
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30627(long j, long j2, boolean z) {
        InterfaceC22618 interfaceC22618;
        ArrayDeque arrayDeque;
        Surface surface;
        Executor executor;
        C10352 c10352 = this.f37486;
        if (z) {
            surface = c10352.f31160;
            if (surface != null) {
                executor = c10352.f31158;
                executor.execute(new Runnable() { // from class: l.ۙܳۧ
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC17182 interfaceC17182;
                        interfaceC17182 = C12468.this.f37486.f31156;
                        interfaceC17182.mo25028();
                    }
                });
            }
        }
        C8353 c8353 = this.f37485;
        if (c8353 == null) {
            c8353 = new C1297().m4440();
        }
        interfaceC22618 = c10352.f31162;
        interfaceC22618.mo24148(j2, j, c8353, null);
        arrayDeque = c10352.f31157;
        ((InterfaceC14359) arrayDeque.remove()).mo20217(j);
    }
}

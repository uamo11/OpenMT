package l;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: C78L */
/* renamed from: l.ܽ۬ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C16657 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16431 f51152;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Executor f51153;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f51154;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f51155;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f51156;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f51157;

    public C16657(C16431 c16431) {
        ExecutorService executorService = C1802.f6208;
        this.f51152 = c16431;
        this.f51153 = executorService;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m39178() {
        synchronized (this) {
            this.f51154 = true;
            m39175();
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39176() {
        synchronized (this) {
            this.f51157 = true;
            m39175();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m39177() {
        synchronized (this) {
            this.f51156 = true;
            m39175();
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m39175() {
        if (!this.f51155 && this.f51154 && this.f51157 && this.f51156) {
            this.f51155 = true;
            final C16431 c16431 = this.f51152;
            C11003.requireNonNull(c16431);
            this.f51153.execute(new Runnable() { // from class: l.ۧ۬ۜ
                @Override // java.lang.Runnable
                public final void run() {
                    C16431.this.m38740();
                }
            });
        }
    }
}

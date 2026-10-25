package l;

import java.io.IOException;

/* compiled from: B74J */
/* renamed from: l.᩸۠ۜ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C21453 implements AutoCloseable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Boolean f69069;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15101 f69070;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f69071;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f69072;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f69073;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f69074;

    public /* synthetic */ C21453(C15101 c15101, int i) {
        this(c15101);
    }

    public C21453(C15101 c15101) {
        this.f69072 = -1L;
        this.f69070 = c15101;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C21453 m48601() {
        C21453 c21453 = new C21453(null);
        c21453.f69071 = true;
        return c21453;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m48603() {
        Object obj;
        String str;
        obj = C3108.f9720;
        synchronized (obj) {
            str = (!this.f69073 || this.f69071) ? null : this.f69074;
        }
        return str;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m48604() {
        Object obj;
        long j;
        obj = C3108.f9720;
        synchronized (obj) {
            j = (!this.f69073 || this.f69071) ? -1L : this.f69072;
        }
        return j;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Boolean m48605() {
        Object obj;
        Boolean bool;
        obj = C3108.f9720;
        synchronized (obj) {
            bool = (!this.f69073 || this.f69071) ? null : this.f69069;
        }
        return bool;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48598(C21453 c21453, String str, long j, Boolean bool) {
        C15101 c15101;
        if (c21453.f69071 || (c15101 = c21453.f69070) == null) {
            return;
        }
        c15101.f46186--;
        c15101.f46179++;
        c21453.f69074 = str;
        c21453.f69072 = j;
        c21453.f69069 = bool;
        c21453.f69073 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public void m48602() {
        if (this.f69071) {
            return;
        }
        this.f69071 = true;
        C15101 c15101 = this.f69070;
        if (c15101 != null) {
            if (this.f69073) {
                c15101.f46179--;
            } else {
                c15101.f46186--;
            }
        }
        this.f69073 = false;
        this.f69074 = null;
        this.f69072 = -1L;
        this.f69069 = null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Object obj;
        InterfaceC21449 interfaceC21449;
        Thread thread;
        Object obj2;
        obj = C3108.f9720;
        synchronized (obj) {
            m48602();
            C15101 c15101 = this.f69070;
            if (c15101 != null && c15101.f46182 && c15101.f46186 + c15101.f46179 == 0) {
                interfaceC21449 = c15101.f46187;
                thread = c15101.f46180;
            } else {
                interfaceC21449 = null;
                thread = null;
            }
            obj2 = C3108.f9720;
            obj2.notifyAll();
        }
        if (thread != null && thread != Thread.currentThread()) {
            thread.interrupt();
        }
        if (interfaceC21449 != null) {
            try {
                interfaceC21449.close();
            } catch (IOException unused) {
            }
        }
    }
}

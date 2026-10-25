package l;

import android.os.Handler;

/* compiled from: S1KE */
/* renamed from: l.᩵ܺ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19559 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Handler f63223 = new Handler();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public RunnableC18853 f63224;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20765 f63225;

    public C19559(ServiceC8770 serviceC8770) {
        this.f63225 = new C20765(serviceC8770);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m44975(EnumC22901 enumC22901) {
        RunnableC18853 runnableC18853 = this.f63224;
        if (runnableC18853 != null) {
            runnableC18853.run();
        }
        RunnableC18853 runnableC188532 = new RunnableC18853(this.f63225, enumC22901);
        this.f63224 = runnableC188532;
        this.f63223.postAtFrontOfQueue(runnableC188532);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m44978() {
        m44975(EnumC22901.ON_CREATE);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m44977() {
        m44975(EnumC22901.ON_START);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m44979() {
        m44975(EnumC22901.ON_START);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m44980() {
        m44975(EnumC22901.ON_STOP);
        m44975(EnumC22901.ON_DESTROY);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20765 m44976() {
        return this.f63225;
    }
}

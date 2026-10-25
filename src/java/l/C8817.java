package l;

import android.os.SystemClock;

/* compiled from: J2BI */
/* renamed from: l.ۡۤۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8817 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f26880;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f26881;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m22793() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (uptimeMillis - this.f26880 <= this.f26881) {
            return true;
        }
        this.f26880 = uptimeMillis;
        return false;
    }

    public C8817(int i) {
        this.f26881 = i;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C8817 m22790() {
        return new C8817(10);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static C8817 m22787() {
        return new C8817(2000);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C8817 m22788() {
        return new C8817(250);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C8817 m22789() {
        return new C8817(150);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8817 m22786(int i) {
        return new C8817(i);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22791() {
        return !m22793();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22792() {
        this.f26880 = SystemClock.uptimeMillis();
    }
}

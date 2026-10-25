package l;

import android.os.SystemClock;

/* compiled from: R9JP */
/* renamed from: l.᩺᩵᩻, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23207 extends C16383 {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f74589;

    public C23207(C10508 c10508) {
        super(c10508);
        this.f74589 = SystemClock.uptimeMillis();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51501() {
        try {
            ((C10508) mo25153()).f31521.m36376("MT_PING$").close();
        } catch (C1092 e) {
            if (e.m3762() != EnumC7462.STATUS_BAD_NETWORK_NAME.getValue()) {
                throw e;
            }
        }
        this.f74589 = SystemClock.uptimeMillis();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51500() {
        return SystemClock.uptimeMillis() - this.f74589 > 30000;
    }
}

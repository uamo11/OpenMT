package l;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.alipay.sdk.m.y.l;

/* compiled from: X32D */
/* renamed from: l.ܺۖ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15638 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f48134;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f48135;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final IntentFilter f48136;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f48137;

    public C15638(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f48136 = intentFilter;
        this.f48137 = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder m32307 = C13325.m32307(128, "Receiver{");
        m32307.append(this.f48137);
        m32307.append(" filter=");
        m32307.append(this.f48136);
        if (this.f48135) {
            m32307.append(" DEAD");
        }
        m32307.append(l.d);
        return m32307.toString();
    }
}

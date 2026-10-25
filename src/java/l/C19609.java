package l;

import android.os.SystemClock;

/* compiled from: C7M1 */
/* renamed from: l.᩵ܿۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C19609 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13962 m45050(InterfaceC9731 interfaceC9731) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = interfaceC9731.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (interfaceC9731.mo2380(i2, elapsedRealtime)) {
                i++;
            }
        }
        return new C13962(length, i);
    }
}

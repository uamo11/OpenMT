package l;

import android.os.Looper;

/* compiled from: UAXR */
/* renamed from: l.֨۫᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1125 implements InterfaceC2352 {
    @Override // l.InterfaceC2352
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15235 mo3838() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            throw new IllegalStateException("The main looper is not available");
        }
        return new C15235(C22292.m50013(mainLooper));
    }
}

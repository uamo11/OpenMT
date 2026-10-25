package l;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: OANW */
/* renamed from: l.᩹ۧܽ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22248 implements SidecarInterface.SidecarCallback {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SidecarInterface.SidecarCallback f72195;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public SidecarDeviceState f72196;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ReentrantLock f72197;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C8137 f72198;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final WeakHashMap f72199;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (l.C18721.m43349(r2) == l.C18721.m43349(r4)) goto L10;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m49960(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            java.lang.String r0 = "newDeviceState"
            l.C11233.m27805(r4, r0)
            java.util.concurrent.locks.ReentrantLock r0 = r3.f72197
            r0.lock()
            l.۠ۧܽ r1 = r3.f72198     // Catch: java.lang.Throwable -> L36
            androidx.window.sidecar.SidecarDeviceState r2 = r3.f72196     // Catch: java.lang.Throwable -> L36
            r1.getClass()     // Catch: java.lang.Throwable -> L36
            boolean r1 = l.C11233.m27802(r2, r4)     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L18
            goto L25
        L18:
            if (r2 != 0) goto L1b
            goto L29
        L1b:
            int r1 = l.C18721.m43349(r2)     // Catch: java.lang.Throwable -> L36
            int r2 = l.C18721.m43349(r4)     // Catch: java.lang.Throwable -> L36
            if (r1 != r2) goto L29
        L25:
            r0.unlock()
            return
        L29:
            r3.f72196 = r4     // Catch: java.lang.Throwable -> L36
            androidx.window.sidecar.SidecarInterface$SidecarCallback r1 = r3.f72195     // Catch: java.lang.Throwable -> L36
            r1.onDeviceStateChanged(r4)     // Catch: java.lang.Throwable -> L36
            l.۠۠᩵ r4 = l.C8058.f24861     // Catch: java.lang.Throwable -> L36
            r0.unlock()
            return
        L36:
            r4 = move-exception
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C22248.m49960(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public C22248(C8137 c8137, SidecarInterface.SidecarCallback sidecarCallback) {
        C11233.m27805(c8137, "sidecarAdapter");
        this.f72198 = c8137;
        this.f72195 = sidecarCallback;
        this.f72197 = new ReentrantLock();
        this.f72199 = new WeakHashMap();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m49959(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        C11233.m27805(iBinder, "token");
        C11233.m27805(sidecarWindowLayoutInfo, "newLayout");
        synchronized (this.f72197) {
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.f72199.get(iBinder);
            this.f72198.getClass();
            if (C8137.m21604(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                return;
            }
            this.f72195.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
        }
    }
}

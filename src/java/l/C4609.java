package l;

import android.app.Activity;
import android.os.IBinder;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Collection;
import java.util.LinkedHashMap;

/* compiled from: OANW */
/* renamed from: l.ۙۧܽ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4609 implements SidecarInterface.SidecarCallback {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13075 f14675;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m13522(SidecarDeviceState sidecarDeviceState) {
        LinkedHashMap linkedHashMap;
        InterfaceC13512 interfaceC13512;
        C8137 c8137;
        SidecarInterface m31688;
        Window window;
        WindowManager.LayoutParams attributes;
        C11233.m27805(sidecarDeviceState, "newDeviceState");
        linkedHashMap = this.f14675.f39153;
        Collection<Activity> values = linkedHashMap.values();
        C13075 c13075 = this.f14675;
        for (Activity activity : values) {
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
            IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
            if (iBinder != null && (m31688 = c13075.m31688()) != null) {
                sidecarWindowLayoutInfo = m31688.getWindowLayoutInfo(iBinder);
            }
            interfaceC13512 = c13075.f39151;
            if (interfaceC13512 != null) {
                c8137 = c13075.f39154;
                ((C21543) interfaceC13512).m48702(activity, c8137.m21608(sidecarWindowLayoutInfo, sidecarDeviceState));
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m13521(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        LinkedHashMap linkedHashMap;
        C8137 c8137;
        InterfaceC13512 interfaceC13512;
        C11233.m27805(iBinder, "windowToken");
        C11233.m27805(sidecarWindowLayoutInfo, "newLayout");
        linkedHashMap = this.f14675.f39153;
        Activity activity = (Activity) linkedHashMap.get(iBinder);
        if (activity == null) {
            return;
        }
        c8137 = this.f14675.f39154;
        SidecarInterface m31688 = this.f14675.m31688();
        SidecarDeviceState deviceState = m31688 == null ? null : m31688.getDeviceState();
        if (deviceState == null) {
            deviceState = new SidecarDeviceState();
        }
        C17473 m21608 = c8137.m21608(sidecarWindowLayoutInfo, deviceState);
        interfaceC13512 = this.f14675.f39151;
        if (interfaceC13512 == null) {
            return;
        }
        ((C21543) interfaceC13512).m48702(activity, m21608);
    }

    public C4609(C13075 c13075) {
        this.f14675 = c13075;
    }
}

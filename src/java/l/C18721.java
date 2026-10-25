package l;

import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: YAN2 */
/* renamed from: l.ᩴۧܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18721 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m43347(SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        List list;
        C8969 c8969 = C8969.f27244;
        C11233.m27805(sidecarWindowLayoutInfo, "info");
        try {
            try {
                list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                if (invoke != null) {
                    return (List) invoke;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return list == null ? c8969 : list;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m43346(SidecarDeviceState sidecarDeviceState) {
        C11233.m27805(sidecarDeviceState, "sidecarDeviceState");
        try {
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                Object invoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                if (invoke != null) {
                    return ((Integer) invoke).intValue();
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return 0;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m43349(SidecarDeviceState sidecarDeviceState) {
        C11233.m27805(sidecarDeviceState, "sidecarDeviceState");
        int m43346 = m43346(sidecarDeviceState);
        if (m43346 < 0 || m43346 > 4) {
            return 0;
        }
        return m43346;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m43348(SidecarDeviceState sidecarDeviceState, int i) {
        try {
            try {
                sidecarDeviceState.posture = i;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        } catch (NoSuchFieldError unused2) {
            SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i));
        }
    }
}

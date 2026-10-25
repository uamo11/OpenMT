package l;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* compiled from: Z8VY */
/* renamed from: l.֫᩻ۧ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C2157 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m7115(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null && display.isHdr()) {
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
        }
        return false;
    }
}

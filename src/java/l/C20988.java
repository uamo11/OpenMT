package l;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: 38CF */
/* renamed from: l.᩷ܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20988 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C9699 f67781;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f67780 = Color.argb(230, 255, 255, 255);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f67779 = Color.argb(128, 27, 27, 27);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m47796(AbstractActivityC3346 abstractActivityC3346) {
        C13930 c13930 = C13930.f41605;
        C1979 c1979 = new C1979(0, 0, c13930);
        C1979 c19792 = new C1979(f67780, f67779, c13930);
        View decorView = abstractActivityC3346.getWindow().getDecorView();
        C11233.m27803(decorView, "window.decorView");
        InterfaceC16233 m6493 = c1979.m6493();
        Resources resources = decorView.getResources();
        C11233.m27803(resources, "view.resources");
        boolean booleanValue = ((Boolean) m6493.invoke(resources)).booleanValue();
        InterfaceC16233 m64932 = c19792.m6493();
        Resources resources2 = decorView.getResources();
        C11233.m27803(resources2, "view.resources");
        boolean booleanValue2 = ((Boolean) m64932.invoke(resources2)).booleanValue();
        InterfaceC4054 interfaceC4054 = f67781;
        InterfaceC4054 interfaceC40542 = interfaceC4054;
        if (interfaceC4054 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                interfaceC40542 = new C2643();
            } else if (i >= 26) {
                interfaceC40542 = new C16047();
            } else if (i < 23) {
                C9699 c9699 = new C9699();
                f67781 = c9699;
                interfaceC40542 = c9699;
            } else {
                interfaceC40542 = new C8993();
            }
        }
        Window window = abstractActivityC3346.getWindow();
        C11233.m27803(window, "window");
        interfaceC40542.mo8316(c1979, c19792, window, decorView, booleanValue, booleanValue2);
    }
}

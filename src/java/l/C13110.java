package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Z3WU */
/* renamed from: l.۬۫ۡ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13110 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39245 = 0;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C1315 f39246 = new C20167(Math.min((int) (Runtime.getRuntime().maxMemory() / 6), 10485760));

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31775(String str, Bitmap bitmap) {
        C13680 c13680 = null;
        if (str == null) {
            throw null;
        }
        if (bitmap == null) {
            throw null;
        }
        f39246.m4554(str, bitmap);
        try {
            c13680 = C3233.f10168.m26796(str);
            if (c13680 == null) {
                return;
            }
            InterfaceC10405 m52568 = C23852.m52568(c13680.m32917(0));
            bitmap.compress(Bitmap.CompressFormat.PNG, 80, m52568.mo26250());
            m52568.close();
            c13680.m32919();
        } catch (IOException unused) {
            if (c13680 != null) {
                try {
                    c13680.m32918();
                } catch (IOException unused2) {
                }
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m31774(String str, InterfaceC4644 interfaceC4644, int i) {
        Bitmap m31773 = m31773(str);
        if (m31773 != null) {
            return m31773;
        }
        Future submit = C1802.f6209.submit(new CallableC22283(interfaceC4644));
        try {
            m31773 = (Bitmap) submit.get(i, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            submit.cancel(true);
            throw e;
        } catch (Exception unused) {
        }
        if (m31773 != null) {
            m31775(str, m31773);
        }
        return m31773;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m31776(String str) {
        return (Bitmap) f39246.m4553(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m31777(String str) {
        str.getClass();
        try {
            if (f39246.m4553(str) == null) {
                return C3233.f10168.m26800(str) != null;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m31773(String str) {
        str.getClass();
        C1315 c1315 = f39246;
        Bitmap bitmap = (Bitmap) c1315.m4553(str);
        if (bitmap == null) {
            try {
                C1505 m26800 = C3233.f10168.m26800(str);
                if (m26800 != null) {
                    bitmap = BitmapFactory.decodeStream(C23852.m52567(m26800.m5185(0)).mo12307());
                    m26800.close();
                    if (bitmap != null) {
                        c1315.m4554(str, bitmap);
                    }
                }
            } catch (IOException unused) {
            }
        }
        return bitmap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31772(Bitmap bitmap) {
        int i;
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == Bitmap.Config.ALPHA_8) {
            i = 1;
        } else {
            i = (config == Bitmap.Config.ARGB_4444 || config == Bitmap.Config.RGB_565) ? 2 : 4;
        }
        return width * height * i;
    }
}

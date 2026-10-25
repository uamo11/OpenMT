package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.media.AudioFormat;
import android.os.Build;

/* compiled from: Q8S0 */
/* renamed from: l.ۧۤ֫, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10929 implements InterfaceC14455 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f32842;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Boolean f32843;

    public C10929(ContextWrapper contextWrapper) {
        this.f32842 = contextWrapper.getApplicationContext();
    }

    @Override // l.InterfaceC14455
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15927 mo27246(C18231 c18231, C8353 c8353) {
        boolean booleanValue;
        c8353.getClass();
        int i = c8353.f25624;
        c18231.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return C15927.f49192;
        }
        Boolean bool = this.f32843;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            Context context = this.f32842;
            if (context != null) {
                String parameters = C2171.m7181(context).getParameters("offloadVariableRateSupported");
                this.f32843 = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f32843 = Boolean.FALSE;
            }
            booleanValue = this.f32843.booleanValue();
        }
        String str = c8353.f25614;
        str.getClass();
        int m24805 = C9786.m24805(str, c8353.f25619);
        if (m24805 == 0 || i2 < C3603.m10998(m24805)) {
            return C15927.f49192;
        }
        int m11035 = C3603.m11035(c8353.f25625);
        if (m11035 == 0) {
            return C15927.f49192;
        }
        try {
            AudioFormat m11040 = C3603.m11040(i, m11035, m24805);
            if (i2 >= 31) {
                return C1756.m5878(m11040, c18231.m42474().f51620, booleanValue);
            }
            return C7461.m19985(m11040, c18231.m42474().f51620, booleanValue);
        } catch (IllegalArgumentException unused) {
            return C15927.f49192;
        }
    }
}

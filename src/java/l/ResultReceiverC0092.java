package l;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.umeng.analytics.pro.am;
import java.lang.ref.WeakReference;

/* compiled from: N5R1 */
/* renamed from: l.֡֫, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class ResultReceiverC0092 extends ResultReceiver {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public WeakReference f1025;

    public ResultReceiverC0092(C0798 c0798) {
        super(null);
        this.f1025 = new WeakReference(c0798);
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        C0798 c0798 = (C0798) this.f1025.get();
        if (c0798 == null || bundle == null) {
            return;
        }
        synchronized (c0798.f2922) {
            c0798.f2923.m34570(AbstractBinderC8560.m22275(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER")));
            C14472 c14472 = c0798.f2923;
            InterfaceC6369 interfaceC6369 = null;
            try {
                Bundle bundle2 = (Bundle) bundle.getParcelable("android.support.v4.media.session.SESSION_TOKEN2");
                if (bundle2 != null) {
                    bundle2.setClassLoader(C13424.class.getClassLoader());
                    Parcelable parcelable = bundle2.getParcelable(am.av);
                    if (!(parcelable instanceof C3547)) {
                        throw new IllegalArgumentException("Invalid parcel");
                    }
                    interfaceC6369 = ((C3547) parcelable).m10816();
                }
            } catch (RuntimeException unused) {
            }
            c14472.m34571(interfaceC6369);
            c0798.m3014();
        }
    }
}

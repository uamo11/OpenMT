package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: OAQ1 */
/* renamed from: l.ۛܳ֨, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC6109 extends Binder implements InterfaceC11754 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC11754 m17026(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("org.repackage.com.zui.deviceidservice.IDeviceidInterface");
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC11754)) {
            return (InterfaceC11754) queryLocalInterface;
        }
        return new C10343(iBinder);
    }
}

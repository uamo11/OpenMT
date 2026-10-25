package l;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: 43G9 */
/* renamed from: l.ۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractBinderC10634 extends Binder implements InterfaceC16277 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC16277 m26675(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC16277.f50046);
        if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC16277)) {
            return (InterfaceC16277) queryLocalInterface;
        }
        return new C1461(iBinder);
    }
}

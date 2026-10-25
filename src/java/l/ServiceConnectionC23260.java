package l;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: N1TT */
/* renamed from: l.᩺᩸ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class ServiceConnectionC23260 implements ServiceConnection {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnLayoutChangeListenerC7738 f74735;

    public ServiceConnectionC23260(ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738) {
        this.f74735 = viewOnLayoutChangeListenerC7738;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.f74735.runOnUiThread(new Runnable() { // from class: l.ۨ᩸ۢ
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList;
                ArrayList arrayList2;
                ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738 = ServiceConnectionC23260.this.f74735;
                viewOnLayoutChangeListenerC7738.f23945 = (BinderC11993) iBinder;
                arrayList = viewOnLayoutChangeListenerC7738.f23941;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                arrayList2 = viewOnLayoutChangeListenerC7738.f23941;
                arrayList2.clear();
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ViewOnLayoutChangeListenerC7738 viewOnLayoutChangeListenerC7738 = this.f74735;
        if (viewOnLayoutChangeListenerC7738.isFinishing()) {
            return;
        }
        viewOnLayoutChangeListenerC7738.finish();
    }
}

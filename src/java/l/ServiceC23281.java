package l;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;
import java.util.ArrayList;

/* compiled from: J1RW */
/* renamed from: l.᩺᩹ۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class ServiceC23281 extends Service {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f74755;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f74756;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74757;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BinderC11993 f74758 = new BinderC11993(this);

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final BroadcastReceiver f74759 = new C6348(this);

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MTerm", getString(R.string.MT_Protector_res_0x7f120a4d), 3));
        }
        m51603();
        C2234.m7411(this).m7414(this.f74759, new IntentFilter("bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        return 2;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int onStartCommand(android.content.Intent r3, int r4, int r5) {
        /*
            r2 = this;
            r2.m51603()
            java.lang.String r3 = r3.getAction()
            if (r3 != 0) goto Lb
            java.lang.String r3 = ""
        Lb:
            int r4 = r3.hashCode()
            r5 = 2
            r0 = 0
            r1 = -1
            switch(r4) {
                case -2127222010: goto L2c;
                case -1989614832: goto L21;
                case 435239541: goto L16;
                default: goto L15;
            }
        L15:
            goto L36
        L16:
            java.lang.String r4 = "bin.mt.term.TerminalService.ACTION_RELEASE_LOCK"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1f
            goto L36
        L1f:
            r1 = 2
            goto L36
        L21:
            java.lang.String r4 = "bin.mt.term.TerminalService.ACTION_EXIT"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L2a
            goto L36
        L2a:
            r1 = 1
            goto L36
        L2c:
            java.lang.String r4 = "bin.mt.term.TerminalService.ACTION_ACQUIRE_LOCK"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L35
            goto L36
        L35:
            r1 = 0
        L36:
            l.ۨ᩹ۢ r3 = r2.f74758
            switch(r1) {
                case 0: goto L44;
                case 1: goto L40;
                case 2: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L47
        L3c:
            r3.m29319(r0)
            goto L47
        L40:
            r2.stopSelf()
            goto L47
        L44:
            r3.m29313(r0)
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ServiceC23281.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        BinderC11993 binderC11993 = this.f74758;
        binderC11993.m29306();
        binderC11993.m29319(false);
        stopForeground(true);
        C2234.m7411(this).m7413(this.f74759);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m51598() {
        C2234.m7411(C4925.m14335()).m7416(new Intent("bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m51603() {
        ArrayList arrayList;
        ArrayList arrayList2;
        Intent addFlags = new Intent(this, (Class<?>) ViewOnLayoutChangeListenerC7738.class).addFlags(268435456);
        C21093 c21093 = new C21093(this, "MTerm");
        c21093.m47994(C19883.f64222.f64248.m28877());
        c21093.m48000();
        c21093.m47996(getString(R.string.MT_Protector_res_0x7f120a4d));
        Resources resources = getResources();
        BinderC11993 binderC11993 = this.f74758;
        arrayList = binderC11993.f35907;
        int size = arrayList.size();
        arrayList2 = binderC11993.f35907;
        c21093.m47995((CharSequence) resources.getQuantityString(R.plurals.MT_Protector_res_0x7f110013, size, Integer.valueOf(arrayList2.size())));
        c21093.m47993(PendingIntent.getActivity(this, 0, addFlags, 67108864));
        c21093.m48001();
        c21093.m47998(false);
        c21093.m47992(android.R.drawable.ic_delete, getString(R.string.MT_Protector_res_0x7f120316), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC23281.class).setAction("bin.mt.term.TerminalService.ACTION_EXIT"), 67108864));
        ServiceC23281 serviceC23281 = binderC11993.f35906;
        if (serviceC23281.f74756 != null || serviceC23281.f74755 != null) {
            c21093.m47992(android.R.drawable.ic_lock_lock, getString(R.string.MT_Protector_res_0x7f120b78), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC23281.class).setAction("bin.mt.term.TerminalService.ACTION_RELEASE_LOCK"), 67108864));
        } else {
            c21093.m47992(android.R.drawable.ic_lock_lock, getString(R.string.MT_Protector_res_0x7f120b77), PendingIntent.getService(this, 0, new Intent(this, (Class<?>) ServiceC23281.class).setAction("bin.mt.term.TerminalService.ACTION_ACQUIRE_LOCK"), 67108864));
        }
        startForeground(b.d, c21093.m47991());
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m51603();
        return this.f74758;
    }
}

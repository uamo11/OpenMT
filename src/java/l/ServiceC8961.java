package l;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.os.SystemClock;
import bin.mt.plus.R;
import com.alipay.sdk.m.t0.b;
import java.util.Arrays;

/* compiled from: EAJ2 */
/* renamed from: l.ۡܶۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ServiceC8961 extends Service {

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final NotificationManager f27218;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f27223;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f27224;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C5961 f27221 = new C5961();

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC7968 f27220 = new RunnableC7968(4, this);

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f27219 = -1;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f27222 = -1;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            f27218.createNotificationChannels(Arrays.asList(new NotificationChannel("MTaskService", "Task Running Notification", 3), new NotificationChannel("MTaskService3", "Task Error Notification", 4)));
        }
        C15104.m35792();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m23102() {
        int size = this.f27221.size();
        int i = this.f27219;
        if (size == i) {
            m23099();
            return;
        }
        this.f27222 = size;
        if (i == -1) {
            m23101();
            return;
        }
        if (this.f27224) {
            return;
        }
        long elapsedRealtime = 1000 - (SystemClock.elapsedRealtime() - this.f27223);
        if (elapsedRealtime <= 0) {
            m23101();
        } else {
            this.f27224 = true;
            C4925.m14316(this.f27220, elapsedRealtime);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m23101() {
        this.f27224 = false;
        int i = this.f27222;
        this.f27222 = -1;
        if (i <= 0 || i == this.f27219) {
            return;
        }
        PendingIntent activity = PendingIntent.getActivity(this, 0, new Intent(this, (Class<?>) ActivityC9667.class), 67108864);
        C21093 c21093 = new C21093(this, "MTaskService");
        c21093.m48000();
        c21093.m47996(getString(R.string.MT_Protector_res_0x7f120090));
        c21093.m47995((CharSequence) getResources().getQuantityString(R.plurals.MT_Protector_res_0x7f110012, i, Integer.valueOf(i)));
        c21093.m47993(activity);
        c21093.m48001();
        c21093.m47998(false);
        c21093.m48002();
        Notification m47991 = c21093.m47991();
        if (this.f27219 == -1) {
            startForeground(b.c, m47991);
        } else {
            f27218.notify(b.c, m47991);
        }
        this.f27219 = i;
        this.f27223 = SystemClock.elapsedRealtime();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m23099() {
        this.f27222 = -1;
        if (this.f27224) {
            C4925.m14324().removeCallbacks(this.f27220);
            this.f27224 = false;
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        this.f27221.add(i2);
        m23102();
        try {
            AbstractC3817 abstractC3817 = (AbstractC3817) ((Class) intent.getSerializableExtra("TaskClass")).newInstance();
            abstractC3817.mo11519(intent);
            int i3 = C15104.f46193;
            C1802.f6208.submit(new RunnableC8050(this, abstractC3817, i2));
            return 2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23103(int i) {
        C5961 c5961 = this.f27221;
        c5961.remove(i);
        if (c5961.isEmpty()) {
            m23099();
            stopSelf();
        } else {
            m23102();
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m23099();
        super.onDestroy();
        stopForeground(true);
    }

    static {
        Object systemService = C4925.m14335().getSystemService("notification");
        C11233.m27799(systemService);
        f27218 = (NotificationManager) systemService;
    }
}

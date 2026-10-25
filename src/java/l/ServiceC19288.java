package l;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import android.view.View;
import bin.mt.plus.R;
import com.umeng.analytics.pro.d;
import java.net.BindException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: A6XJ */
/* renamed from: l.᩵ۛ᩻, reason: contains not printable characters */
/* loaded from: classes4.dex */
public class ServiceC19288 extends Service {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f60686;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static volatile C14347 f60687;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static ServiceC19288 f60688;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f60689 = 0;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f60690;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f60691;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f60692;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f60693;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22202 f60694;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private synchronized void m44485() {
        ScheduledExecutorService scheduledExecutorService = this.f60692;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC6587());
            this.f60692 = newSingleThreadScheduledExecutor;
            newSingleThreadScheduledExecutor.scheduleWithFixedDelay(new RunnableC20699(0, this), 0L, 30000L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m44489() {
        C14347 c14347 = f60687;
        return (f60686 || c14347 == null || !c14347.m13798()) ? false : true;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static void m44482() {
        if (m44489()) {
            Application m14335 = C4925.m14335();
            m14335.startService(new Intent(m14335, (Class<?>) ServiceC19288.class).setAction("bin.mt.mcp.ACTION_REFRESH_FLOAT_WINDOW"));
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static int m44480() {
        C14347 c14347 = f60687;
        if (c14347 != null && c14347.m13798()) {
            return c14347.m34244();
        }
        return C21404.m48499();
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        setTheme(C18080.m42142());
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_APK_MCP", getString(R.string.MT_Protector_res_0x7f120569), 3));
        }
        startForeground(1008, m44484());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        C14347 c14347;
        startForeground(1008, m44484());
        if (intent != null && "bin.mt.mcp.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        if (intent != null && "bin.mt.mcp.ACTION_REFRESH_FLOAT_WINDOW".equals(intent.getAction())) {
            if (m44489()) {
                m44479();
                return 1;
            }
            stopSelf();
            return 2;
        }
        if (f60686) {
            f60688 = this;
            return 1;
        }
        if (m44489()) {
            try {
                m44490();
                m44479();
                m44485();
                C4925.m14312(new Intent("bin.mt.mcp.ACTION_STARTED"));
                return 1;
            } catch (Exception e) {
                m44487();
                m44477(e);
                stopSelf();
                return 2;
            }
        }
        C14347 c143472 = f60687;
        if (c143472 != null && !c143472.m13798() && (c14347 = f60687) != null && !f60686) {
            f60686 = true;
            new Thread(new RunnableC23520(0, c14347), "MT MCP Stop").start();
        }
        if (f60686) {
            f60688 = this;
            return 1;
        }
        try {
            AbstractC15440 m48495 = C21404.m48495();
            if (!m48495.mo23120()) {
                try {
                    m48495.m36508();
                    C15972.m37753();
                } catch (Exception unused) {
                }
            }
            C14347 c143473 = new C14347(C21404.m48499());
            f60687 = c143473;
            c143473.m13799();
            m44490();
            m44479();
            startForeground(1008, m44484());
            m44485();
            C4925.m14312(new Intent("bin.mt.mcp.ACTION_STARTED"));
            ExecutorService executorService = C1802.f6208;
            executorService.execute(new RunnableC5258(1));
            executorService.execute(new RunnableC8704(0));
            return 1;
        } catch (Exception e2) {
            m44487();
            m44477(e2);
            stopSelf();
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C19926.m45880("MT MCP service onDestroy");
        this.f60693 = true;
        if (f60688 == this) {
            f60688 = null;
        }
        m44487();
        stopForeground(true);
        if (!f60686) {
            C4925.m14312(new Intent("bin.mt.mcp.ACTION_STOPPED"));
        }
        super.onDestroy();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m44483() {
        f60687 = null;
        f60686 = false;
        ServiceC19288 serviceC19288 = f60688;
        f60688 = null;
        if (serviceC19288 != null && !serviceC19288.f60693) {
            serviceC19288.onStartCommand(null, 0, 0);
        } else {
            C4925.m14312(new Intent("bin.mt.mcp.ACTION_STOPPED"));
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m44487() {
        synchronized (this) {
            ScheduledExecutorService scheduledExecutorService = this.f60692;
            this.f60692 = null;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
        m44481();
        C14347 c14347 = f60687;
        if (c14347 != null && !f60686) {
            f60686 = true;
            new Thread(new RunnableC23520(0, c14347), "MT MCP Stop").start();
        }
        WifiManager.WifiLock wifiLock = this.f60690;
        if (wifiLock != null) {
            if (wifiLock.isHeld()) {
                this.f60690.release();
            }
            this.f60690 = null;
        }
        PowerManager.WakeLock wakeLock = this.f60691;
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                this.f60691.release();
            }
            this.f60691 = null;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44478(ServiceC19288 serviceC19288) {
        try {
            serviceC19288.m44488();
        } catch (Throwable th) {
            C19926.m45879("MT MCP health check failed", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m44488() {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ServiceC19288.m44488():void");
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m44490() {
        PowerManager.WakeLock wakeLock = this.f60691;
        if (wakeLock == null || !wakeLock.isHeld()) {
            this.f60691 = null;
            PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":Mcp");
            this.f60691 = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            this.f60691.acquire();
        }
        WifiManager.WifiLock wifiLock = this.f60690;
        if (wifiLock == null || !wifiLock.isHeld()) {
            this.f60690 = null;
            WifiManager.WifiLock createWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":Mcp");
            this.f60690 = createWifiLock;
            createWifiLock.setReferenceCounted(false);
            this.f60690.acquire();
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m44479() {
        if (!m44489() || !C21404.m48494()) {
            m44481();
            return;
        }
        try {
            if (!C21769.m49098(this)) {
                m44481();
                return;
            }
            if (this.f60694 == null) {
                C22202 m49871 = C22202.m49871(this, "mcp");
                m49871.setImageDrawable(C22597.m50571(getResources(), R.drawable.MT_Protector_res_0x7f08013c, getTheme()));
                m49871.setOnClickListener(new View.OnClickListener() { // from class: l.ۢۛ᩻
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i = ServiceC19288.f60689;
                        if (C17294.m40605(C15528.m36593())) {
                            return;
                        }
                        Intent intent = new Intent("bin.mt.plus.ACTION_SHORTCUT");
                        ServiceC19288 serviceC19288 = ServiceC19288.this;
                        serviceC19288.startActivity(intent.setComponent(new ComponentName(serviceC19288.getPackageName(), "bin.mt.plus.ApkMcpActivity")).putExtra("operation", "tool-apk-mcp").addFlags(268435456));
                    }
                });
                this.f60694 = m49871;
            }
            int m48483 = C21404.m48483(getApplicationContext(), C21404.m48482(ApplicationC20075.f65008.getInt("amfbc", 0)));
            this.f60694.setBackgroundTintList(ColorStateList.valueOf(m48483));
            this.f60694.setImageTintList(ColorStateList.valueOf(C7466.m20002(m48483) > 220 ? -12895429 : -1));
            if (this.f60694.m49879()) {
                this.f60694.show();
            } else {
                this.f60694.m49878();
            }
        } catch (RuntimeException e) {
            C19926.m45879("Failed to show MT MCP floating window", e);
            m44481();
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m44481() {
        C22202 c22202 = this.f60694;
        if (c22202 == null) {
            return;
        }
        try {
            c22202.m49880();
            this.f60694 = null;
        } catch (RuntimeException e) {
            C19926.m45879("Failed to remove MT MCP floating window", e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m44477(Exception exc) {
        String obj;
        Intent intent = new Intent("bin.mt.mcp.ACTION_FAILED_TO_START");
        if (exc instanceof BindException) {
            obj = C4925.m14306(R.string.MT_Protector_res_0x7f120935, Integer.valueOf(C21404.m48499()));
        } else {
            obj = exc.getMessage() == null ? exc.toString() : exc.getMessage();
        }
        intent.putExtra(d.O, obj);
        C4925.m14312(intent);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private Notification m44484() {
        Intent intent = new Intent(this, (Class<?>) ActivityC8411.class);
        Intent action = new Intent(this, (Class<?>) ServiceC19288.class).setAction("bin.mt.mcp.ACTION_STOP");
        int m44480 = m44480();
        ArrayList m40718 = C17375.m40718(m44480);
        C21093 c21093 = new C21093(this, "MT_APK_MCP");
        c21093.m48000();
        c21093.m47996(getString(R.string.MT_Protector_res_0x7f120569));
        c21093.m47995(m40718.isEmpty() ? C17375.m40719(m44480) : (CharSequence) m40718.get(0));
        c21093.m47993(PendingIntent.getActivity(this, 0, intent, 201326592));
        c21093.m48001();
        c21093.m47998(false);
        c21093.m47992(android.R.drawable.ic_delete, getString(R.string.MT_Protector_res_0x7f1209e1), PendingIntent.getService(this, 1, action, 201326592));
        return c21093.m47991();
    }
}

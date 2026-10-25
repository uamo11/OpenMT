package l;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import bin.mt.plus.R;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DAMT */
/* renamed from: l.۠ۘۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public class ServiceC7926 extends Service implements Runnable {

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Object f24534 = new Object();

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f24535 = 0;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static ServiceC7926 f24536;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static volatile Thread f24537;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public PowerManager.WakeLock f24538;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ServerSocket f24543;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C0123 f24544;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f24539 = false;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C4399 f24541 = null;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ArrayList f24542 = new ArrayList();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public WifiManager.WifiLock f24540 = null;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m21228() {
        boolean z;
        synchronized (f24534) {
            z = f24537 != null && f24537.isAlive();
        }
        return z;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m21226() {
        if (m21228()) {
            return;
        }
        Application m14335 = C4925.m14335();
        C0881.m3232(m14335, new Intent(m14335, (Class<?>) ServiceC7926.class));
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            ((NotificationManager) getSystemService("notification")).createNotificationChannel(new NotificationChannel("MT_FTP_SERVER", getString(R.string.MT_Protector_res_0x7f12084e), 3));
        }
        startForeground(1004, m21221());
        this.f24544 = new C0123(this, new RunnableC2539(3, this));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private Notification m21221() {
        Intent action = new Intent(this, (Class<?>) ServiceC7926.class).setAction("bin.mt.plus.FsService.ACTION_STOP");
        Intent putExtra = new Intent(this, (Class<?>) ActivityC15465.class).putExtra("bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL", 1);
        C21093 c21093 = new C21093(this, "MT_FTP_SERVER");
        c21093.m48000();
        c21093.m47996(C4925.m14327(R.string.MT_Protector_res_0x7f120831));
        c21093.m47995((CharSequence) m21224());
        c21093.m47993(PendingIntent.getActivity(this, 0, putExtra, 201326592));
        c21093.m48001();
        c21093.m47998(false);
        c21093.m47992(android.R.drawable.ic_delete, getString(R.string.MT_Protector_res_0x7f1209e1), PendingIntent.getService(this, 0, action, 67108864));
        return c21093.m47991();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        startForeground(1004, m21221());
        if (intent != null && "bin.mt.plus.FsService.ACTION_STOP".equals(intent.getAction())) {
            stopSelf();
            return 2;
        }
        synchronized (f24534) {
            Thread thread = f24537;
            if (thread != null && thread.isAlive()) {
                return 1;
            }
            RuntimeException runtimeException = null;
            f24537 = null;
            f24536 = null;
            this.f24539 = false;
            Thread thread2 = new Thread(this);
            f24537 = thread2;
            f24536 = this;
            try {
                thread2.start();
            } catch (RuntimeException e) {
                if (f24537 == thread2 && f24536 == this) {
                    f24537 = null;
                    f24536 = null;
                }
                runtimeException = e;
            }
            if (runtimeException == null) {
                return 1;
            }
            stopSelf();
            m21217(runtimeException.toString());
            return 2;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C0870 c0870;
        Thread thread;
        Thread thread2;
        this.f24544.m1193();
        this.f24539 = true;
        synchronized (f24534) {
            if (f24536 != this) {
                c0870 = C0870.m3195();
            } else {
                this.f24539 = true;
                c0870 = new C0870();
                c0870.f3425 = f24537;
                c0870.f3421 = this.f24543;
                this.f24543 = null;
                c0870.f3422 = this.f24541;
                this.f24541 = null;
            }
        }
        thread = c0870.f3425;
        if (thread != null) {
            thread2 = c0870.f3425;
            thread2.interrupt();
        }
        m21218(c0870);
        m21218(m21223());
        stopForeground(true);
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private C0870 m21223() {
        C0870 c0870;
        synchronized (f24534) {
            c0870 = new C0870();
            c0870.f3424 = this.f24538;
            this.f24538 = null;
            c0870.f3426 = this.f24540;
            this.f24540 = null;
        }
        return c0870;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21232() {
        Throwable th;
        Throwable th2;
        ServerSocket serverSocket = new ServerSocket();
        boolean z = true;
        try {
            serverSocket.setReuseAddress(true);
            serverSocket.bind(new InetSocketAddress(C14981.m35469()));
            synchronized (f24534) {
                try {
                    if (!m21220(Thread.currentThread()) || this.f24539) {
                        z = false;
                    } else {
                        this.f24543 = serverSocket;
                    }
                    try {
                        if (!z) {
                            try {
                                serverSocket.close();
                            } catch (IOException unused) {
                            }
                        }
                        return z;
                    } catch (Throwable th3) {
                        th2 = th3;
                        while (true) {
                            try {
                                try {
                                    throw th2;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (!z) {
                                        try {
                                            serverSocket.close();
                                        } catch (IOException unused2) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th2 = th5;
                                z = z;
                            }
                            th2 = th5;
                            z = z;
                        }
                    }
                } catch (Throwable th6) {
                    th2 = th6;
                    z = false;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            z = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x013b, code lost:
    
        if (r2 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0170, code lost:
    
        m21217(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016e, code lost:
    
        if (r2 == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b2, code lost:
    
        if (r1 != false) goto L112;
     */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ServiceC7926.run():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[Catch: all -> 0x0044, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0012, B:10:0x001a, B:12:0x003c, B:13:0x0042), top: B:3:0x0003 }] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private l.C0870 m21216(java.lang.Thread r5, boolean r6) {
        /*
            r4 = this;
            java.lang.Object r0 = l.ServiceC7926.f24534
            monitor-enter(r0)
            boolean r5 = r4.m21220(r5)     // Catch: java.lang.Throwable -> L44
            l.֨ۘۢ r1 = new l.֨ۘۢ     // Catch: java.lang.Throwable -> L44
            r1.<init>()     // Catch: java.lang.Throwable -> L44
            l.C0870.m3201(r1, r5)     // Catch: java.lang.Throwable -> L44
            r2 = 0
            if (r6 != 0) goto L19
            boolean r6 = r4.f24539     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L17
            goto L19
        L17:
            r6 = 0
            goto L1a
        L19:
            r6 = 1
        L1a:
            l.C0870.m3204(r1, r6)     // Catch: java.lang.Throwable -> L44
            java.net.ServerSocket r6 = r4.f24543     // Catch: java.lang.Throwable -> L44
            l.C0870.m3199(r1, r6)     // Catch: java.lang.Throwable -> L44
            r6 = 0
            r4.f24543 = r6     // Catch: java.lang.Throwable -> L44
            l.ۙۘۢ r3 = r4.f24541     // Catch: java.lang.Throwable -> L44
            l.C0870.m3200(r1, r3)     // Catch: java.lang.Throwable -> L44
            r4.f24541 = r6     // Catch: java.lang.Throwable -> L44
            android.os.PowerManager$WakeLock r3 = r4.f24538     // Catch: java.lang.Throwable -> L44
            l.C0870.m3197(r1, r3)     // Catch: java.lang.Throwable -> L44
            r4.f24538 = r6     // Catch: java.lang.Throwable -> L44
            android.net.wifi.WifiManager$WifiLock r3 = r4.f24540     // Catch: java.lang.Throwable -> L44
            l.C0870.m3196(r1, r3)     // Catch: java.lang.Throwable -> L44
            r4.f24540 = r6     // Catch: java.lang.Throwable -> L44
            if (r5 == 0) goto L42
            l.ServiceC7926.f24537 = r6     // Catch: java.lang.Throwable -> L44
            l.ServiceC7926.f24536 = r6     // Catch: java.lang.Throwable -> L44
            r4.f24539 = r2     // Catch: java.lang.Throwable -> L44
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            return r1
        L44:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l.ServiceC7926.m21216(java.lang.Thread, boolean):l.֨ۘۢ");
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m21225(Thread thread) {
        C4399 c4399;
        ServerSocket serverSocket;
        synchronized (f24534) {
            if (m21220(thread) && !this.f24539) {
                C4399 c43992 = this.f24541;
                C4399 c43993 = null;
                if (c43992 == null || c43992.isAlive()) {
                    c4399 = null;
                } else {
                    c4399 = this.f24541;
                    this.f24541 = null;
                }
                if (c4399 != null) {
                    try {
                        c4399.join();
                    } catch (InterruptedException unused) {
                    }
                }
                synchronized (f24534) {
                    if (m21220(thread) && !this.f24539 && this.f24541 == null && (serverSocket = this.f24543) != null) {
                        c43993 = new C4399();
                        c43993.f14087 = serverSocket;
                        c43993.f14086 = this;
                        this.f24541 = c43993;
                    }
                }
                if (c43993 != null) {
                    c43993.start();
                }
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m21222(Thread thread) {
        boolean z;
        synchronized (f24534) {
            z = !m21220(thread) || this.f24539;
        }
        return z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m21220(Thread thread) {
        return thread == f24537 && f24536 == this;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21217(String str) {
        Intent intent = new Intent("bin.mt.plus.FTP_SERVER_FAILED_TO_START");
        intent.putExtra("msg", str);
        C4925.m14312(intent);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m21218(C0870 c0870) {
        C4399 c4399;
        ServerSocket serverSocket;
        WifiManager.WifiLock wifiLock;
        PowerManager.WakeLock wakeLock;
        PowerManager.WakeLock wakeLock2;
        PowerManager.WakeLock wakeLock3;
        WifiManager.WifiLock wifiLock2;
        WifiManager.WifiLock wifiLock3;
        C4399 c43992;
        c4399 = c0870.f3422;
        if (c4399 != null) {
            c43992 = c0870.f3422;
            c43992.getClass();
            try {
                c43992.f14087.close();
            } catch (Exception unused) {
            }
        }
        serverSocket = c0870.f3421;
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (IOException unused2) {
            }
        }
        wifiLock = c0870.f3426;
        if (wifiLock != null) {
            wifiLock2 = c0870.f3426;
            if (wifiLock2.isHeld()) {
                wifiLock3 = c0870.f3426;
                wifiLock3.release();
            }
        }
        wakeLock = c0870.f3424;
        if (wakeLock != null) {
            wakeLock2 = c0870.f3424;
            if (wakeLock2.isHeld()) {
                wakeLock3 = c0870.f3424;
                wakeLock3.release();
            }
        }
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m21230() {
        synchronized (this) {
            Iterator it = this.f24542.iterator();
            while (it.hasNext()) {
                C19922 c19922 = (C19922) it.next();
                if (c19922 != null) {
                    c19922.m45841();
                    c19922.m45853();
                }
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m21229(Thread thread) {
        Object obj = f24534;
        synchronized (obj) {
            if (m21220(thread) && !this.f24539) {
                if (this.f24538 != null) {
                    return true;
                }
                PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, getPackageName() + ":FTPServer");
                newWakeLock.setReferenceCounted(false);
                newWakeLock.acquire();
                synchronized (obj) {
                    if (m21220(thread) && !this.f24539 && this.f24538 == null) {
                        this.f24538 = newWakeLock;
                        return true;
                    }
                    if (newWakeLock.isHeld()) {
                        newWakeLock.release();
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private boolean m21227(Thread thread) {
        Object obj = f24534;
        synchronized (obj) {
            if (m21220(thread) && !this.f24539) {
                if (this.f24540 != null) {
                    return true;
                }
                WifiManager.WifiLock createWifiLock = ((WifiManager) getApplicationContext().getSystemService("wifi")).createWifiLock(3, getPackageName() + ":FTPServer");
                createWifiLock.setReferenceCounted(false);
                createWifiLock.acquire();
                synchronized (obj) {
                    if (m21220(thread) && !this.f24539 && this.f24540 == null) {
                        this.f24540 = createWifiLock;
                        return true;
                    }
                    if (createWifiLock.isHeld()) {
                        createWifiLock.release();
                    }
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m21224() {
        String m31298 = C12865.m31298();
        if (m31298 == null) {
            return C4925.m14327(R.string.MT_Protector_res_0x7f12086b);
        }
        StringBuilder m9834 = C3200.m9834("ftp://", m31298, ":");
        m9834.append(C14981.m35469());
        return m9834.toString();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21231(C19922 c19922) {
        synchronized (this) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f24542.iterator();
            while (it.hasNext()) {
                C19922 c199222 = (C19922) it.next();
                if (!c199222.isAlive()) {
                    try {
                        c199222.join();
                        arrayList.add(c199222);
                        c199222.m45853();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                this.f24542.remove((C19922) it2.next());
            }
            this.f24542.add(c19922);
        }
    }
}

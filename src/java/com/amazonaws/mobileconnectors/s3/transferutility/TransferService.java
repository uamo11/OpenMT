package com.amazonaws.mobileconnectors.s3.transferutility;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.IBinder;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

/* loaded from: classes.dex */
public class TransferService extends Service {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static TransferNetworkLossHandler f335;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Log f336 = LogFactory.m302(TransferService.class);

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f338 = true;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f339 = 3462;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f337 = true;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Can't bind to TransferService");
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log log = f336;
        log.mo297("Starting Transfer Service to listen for network connectivity changes.");
        f335 = TransferNetworkLossHandler.m379(getApplicationContext());
        synchronized (this) {
            if (this.f338) {
                try {
                    try {
                        log.mo297("Registering the network receiver");
                        registerReceiver(f335, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                        this.f338 = false;
                    } catch (IllegalStateException unused) {
                        f336.mo300("Ignoring the leak in registering the receiver.");
                    }
                } catch (IllegalArgumentException unused2) {
                    f336.mo300("Ignoring the exception trying to register the receiver for connectivity change.");
                }
            }
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            try {
                synchronized (this) {
                    Notification notification = (Notification) intent.getParcelableExtra("notification");
                    if (notification != null) {
                        this.f339 = intent.getIntExtra("ongoing-notification-id", this.f339);
                        this.f337 = intent.getBooleanExtra("remove-notification", this.f337);
                        f336.mo297("Putting the service in Foreground state.");
                        if (i3 >= 34) {
                            startForeground(this.f339, notification, 1);
                        } else {
                            startForeground(this.f339, notification);
                        }
                    } else {
                        f336.mo291("No notification is passed in the intent. Unable to transition to foreground.");
                    }
                }
            } catch (Exception e) {
                f336.mo291("Error in moving the service to foreground state: " + e);
            }
            return 1;
        }
        synchronized (this) {
            if (this.f338) {
                try {
                    f336.mo297("Registering the network receiver");
                    registerReceiver(f335, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f338 = false;
                } catch (IllegalArgumentException unused) {
                    f336.mo300("Ignoring the exception trying to register the receiver for connectivity change.");
                } catch (IllegalStateException unused2) {
                    f336.mo300("Ignoring the leak in registering the receiver.");
                }
            }
            return 1;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|2|(6:4|e|23|24|25|26)|16|17|35) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004a, code lost:
    
        com.amazonaws.mobileconnectors.s3.transferutility.TransferService.f336.mo300("Exception trying to de-register the network receiver");
     */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDestroy() {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L19
            r1 = 26
            if (r0 < r1) goto L2d
            com.amazonaws.logging.Log r0 = com.amazonaws.mobileconnectors.s3.transferutility.TransferService.f336     // Catch: java.lang.Exception -> L19
            java.lang.String r1 = "Moving the service out of the Foreground state."
            r0.mo297(r1)     // Catch: java.lang.Exception -> L19
            r0 = r4
            monitor-enter(r0)     // Catch: java.lang.Exception -> L19
            boolean r1 = r4.f337     // Catch: java.lang.Throwable -> L16
            r4.stopForeground(r1)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L2d
        L16:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Exception -> L19
        L19:
            r0 = move-exception
            com.amazonaws.logging.Log r1 = com.amazonaws.mobileconnectors.s3.transferutility.TransferService.f336
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error in moving the service out of the foreground state: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.mo291(r0)
        L2d:
            com.amazonaws.logging.Log r0 = com.amazonaws.mobileconnectors.s3.transferutility.TransferService.f336     // Catch: java.lang.IllegalArgumentException -> L4a
            java.lang.String r1 = "De-registering the network receiver."
            r0.mo297(r1)     // Catch: java.lang.IllegalArgumentException -> L4a
            r0 = r4
            monitor-enter(r0)     // Catch: java.lang.IllegalArgumentException -> L4a
            boolean r1 = r4.f338     // Catch: java.lang.Throwable -> L47
            if (r1 != 0) goto L45
            com.amazonaws.mobileconnectors.s3.transferutility.TransferNetworkLossHandler r1 = com.amazonaws.mobileconnectors.s3.transferutility.TransferService.f335     // Catch: java.lang.Throwable -> L47
            r4.unregisterReceiver(r1)     // Catch: java.lang.Throwable -> L47
            r1 = 1
            r4.f338 = r1     // Catch: java.lang.Throwable -> L47
            r1 = 0
            com.amazonaws.mobileconnectors.s3.transferutility.TransferService.f335 = r1     // Catch: java.lang.Throwable -> L47
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            goto L51
        L47:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L47
            throw r1     // Catch: java.lang.IllegalArgumentException -> L4a
        L4a:
            com.amazonaws.logging.Log r0 = com.amazonaws.mobileconnectors.s3.transferutility.TransferService.f336
            java.lang.String r1 = "Exception trying to de-register the network receiver"
            r0.mo300(r1)
        L51:
            super.onDestroy()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.s3.transferutility.TransferService.onDestroy():void");
    }

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if ((getApplicationInfo().flags & 2) == 0) {
            return;
        }
        printWriter.printf("network status: %s\n", Boolean.valueOf(f335.m382()));
        Map m393 = TransferStatusUpdater.m390(this).m393();
        printWriter.printf("# of active transfers: %d\n", Integer.valueOf(m393.size()));
        for (TransferRecord transferRecord : m393.values()) {
            printWriter.printf("bucket: %s, key: %s, status: %s, total size: %d, current: %d\n", transferRecord.f308, transferRecord.f313, transferRecord.f312, Long.valueOf(transferRecord.f325), Long.valueOf(transferRecord.f319));
        }
        printWriter.flush();
    }
}

package com.alipay.sdk.m.f0;

import android.app.KeyguardManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.umeng.analytics.pro.am;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import l.C16014;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: N673 */
/* loaded from: classes.dex */
public class b {
    public static b b = new b();
    public f a;

    public static b a(f fVar) {
        b bVar = b;
        bVar.a = fVar;
        return bVar;
    }

    public static boolean a(Context context, String str) {
        return !b(context, str);
    }

    public static boolean b(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }

    public static String n(Context context) {
        NetworkInfo activeNetworkInfo;
        if (a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Throwable unused) {
        }
        if (activeNetworkInfo == null) {
            return null;
        }
        if (activeNetworkInfo.getType() == 1) {
            return "WIFI";
        }
        if (activeNetworkInfo.getType() == 0) {
            int subtype = activeNetworkInfo.getSubtype();
            if (subtype != 4 && subtype != 1 && subtype != 2 && subtype != 7 && subtype != 11) {
                if (subtype != 3 && subtype != 5 && subtype != 6 && subtype != 8 && subtype != 9 && subtype != 10 && subtype != 12 && subtype != 14 && subtype != 15) {
                    return subtype == 13 ? "4G" : "UNKNOW";
                }
                return "3G";
            }
            return "2G";
        }
        return null;
    }

    public String a() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j = 0;
        }
        return C16014.m37865(j, "");
    }

    public synchronized String a(Context context) {
        String subscriberId = this.a.getSubscriberId();
        if (subscriberId != null) {
            return subscriberId;
        }
        String a = d.a("imsi");
        if (a != null) {
            return a;
        }
        if (this.a.isBackgroundRunning()) {
            return "";
        }
        if (a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        if (a == null) {
            a = "";
        }
        d.a("imsi", a);
        return a;
    }

    public String b() {
        long j;
        try {
            StatFs statFs = new StatFs("/sdcard");
            j = statFs.getBlockSize() * statFs.getAvailableBlocks();
        } catch (Throwable unused) {
            j = 0;
        }
        return C16014.m37865(j, "");
    }

    public String b(Context context) {
        int i = 0;
        try {
            i = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        return i == 1 ? "1" : "0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r2 == null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String c() {
        /*
            r8 = this;
            java.lang.String r0 = "0000000000000000"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L52
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L52
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L52
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L52
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L50
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L50
            java.io.LineNumberReader r4 = new java.io.LineNumberReader     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L4e
            r1 = 1
        L1a:
            r5 = 100
            if (r1 >= r5) goto L47
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L45
            if (r5 == 0) goto L47
            java.lang.String r6 = "Serial"
            int r6 = r5.indexOf(r6)     // Catch: java.lang.Throwable -> L45
            r7 = -1
            if (r6 <= r7) goto L42
            java.lang.String r1 = ":"
            int r1 = r5.indexOf(r1)     // Catch: java.lang.Throwable -> L45
            int r1 = r1 + 1
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r5.substring(r1, r6)     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r1.trim()     // Catch: java.lang.Throwable -> L45
            goto L47
        L42:
            int r1 = r1 + 1
            goto L1a
        L45:
            r1 = r4
            goto L54
        L47:
            r4.close()     // Catch: java.lang.Throwable -> L4a
        L4a:
            r3.close()     // Catch: java.lang.Throwable -> L64
            goto L64
        L4e:
            goto L54
        L50:
            r3 = r1
            goto L54
        L52:
            r2 = r1
            r3 = r2
        L54:
            if (r1 == 0) goto L5b
            r1.close()     // Catch: java.lang.Throwable -> L5a
            goto L5b
        L5a:
        L5b:
            if (r3 == 0) goto L62
            r3.close()     // Catch: java.lang.Throwable -> L61
            goto L62
        L61:
        L62:
            if (r2 == 0) goto L69
        L64:
            r2.close()     // Catch: java.lang.Throwable -> L68
            goto L69
        L68:
        L69:
            if (r0 != 0) goto L6d
            java.lang.String r0 = ""
        L6d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.f0.b.c():java.lang.String");
    }

    public String c(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", "" + i);
            jSONObject.put("call", "" + streamVolume);
            jSONObject.put("system", "" + streamVolume2);
            jSONObject.put("ring", "" + streamVolume3);
            jSONObject.put("music", "" + streamVolume4);
            jSONObject.put("alarm", "" + streamVolume5);
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public String d() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new c(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    public synchronized String d(Context context) {
        String a = d.a("NetworkOperatorName");
        if (a != null) {
            return a;
        }
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    a = telephonyManager.getNetworkOperatorName();
                }
            } catch (Throwable unused) {
            }
        }
        if (a == null || "null".equals(a)) {
            a = "";
        }
        d.a("NetworkOperatorName", a);
        return a;
    }

    public String e() {
        String t = t();
        return !com.alipay.sdk.m.d0.a.a(t) ? t : u();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0050 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String e(android.content.Context r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L4d
            java.lang.String r0 = "sensor"
            java.lang.Object r4 = r4.getSystemService(r0)     // Catch: java.lang.Throwable -> L4d
            android.hardware.SensorManager r4 = (android.hardware.SensorManager) r4     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L4d
            r0 = -1
            java.util.List r4 = r4.getSensorList(r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 == 0) goto L4d
            int r0 = r4.size()     // Catch: java.lang.Throwable -> L4d
            if (r0 <= 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r0.<init>()     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L4d
        L22:
            boolean r1 = r4.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L44
            java.lang.Object r1 = r4.next()     // Catch: java.lang.Throwable -> L4d
            android.hardware.Sensor r1 = (android.hardware.Sensor) r1     // Catch: java.lang.Throwable -> L4d
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L4d
            r0.append(r2)     // Catch: java.lang.Throwable -> L4d
            int r2 = r1.getVersion()     // Catch: java.lang.Throwable -> L4d
            r0.append(r2)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r1 = r1.getVendor()     // Catch: java.lang.Throwable -> L4d
            r0.append(r1)     // Catch: java.lang.Throwable -> L4d
            goto L22
        L44:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r4 = com.alipay.sdk.m.d0.a.e(r4)     // Catch: java.lang.Throwable -> L4d
            goto L4e
        L4d:
            r4 = 0
        L4e:
            if (r4 != 0) goto L52
            java.lang.String r4 = ""
        L52:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.f0.b.e(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String f() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        FileReader fileReader2;
        String[] split;
        FileReader fileReader3 = null;
        try {
            fileReader2 = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader2);
                try {
                    split = bufferedReader.readLine().split(":\\s+", 2);
                } catch (Throwable unused) {
                    fileReader3 = bufferedReader;
                    fileReader = fileReader3;
                    fileReader3 = fileReader2;
                    if (fileReader3 != null) {
                        try {
                            fileReader3.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (fileReader == null) {
                        return "";
                    }
                    bufferedReader = fileReader;
                    try {
                        bufferedReader.close();
                        return "";
                    } catch (Throwable unused3) {
                        return "";
                    }
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        if (split == null || split.length <= 1) {
            try {
                fileReader2.close();
            } catch (Throwable unused6) {
            }
            bufferedReader.close();
            return "";
        }
        String str = split[1];
        try {
            fileReader2.close();
        } catch (Throwable unused7) {
        }
        try {
            bufferedReader.close();
        } catch (Throwable unused8) {
        }
        return str;
    }

    public String f(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService(am.ac);
                if (sensorManager != null && (sensorList = sensorManager.getSensorList(-1)) != null && sensorList.size() > 0) {
                    for (Sensor sensor : sensorList) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0035, code lost:
    
        if (r0 == 0) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String g() {
        /*
            r6 = this;
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r3 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L2d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L2d
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2a
            r5 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r0.readLine()     // Catch: java.lang.Throwable -> L29
            if (r3 == 0) goto L25
            java.lang.String r5 = "\\s+"
            java.lang.String[] r3 = r3.split(r5)     // Catch: java.lang.Throwable -> L29
            r5 = 1
            r3 = r3[r5]     // Catch: java.lang.Throwable -> L29
            int r1 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.Throwable -> L29
            long r1 = (long) r1
        L25:
            r4.close()     // Catch: java.lang.Throwable -> L37
            goto L37
        L29:
            r3 = r0
        L2a:
            r0 = r3
            r3 = r4
            goto L2e
        L2d:
            r0 = r3
        L2e:
            if (r3 == 0) goto L35
            r3.close()     // Catch: java.lang.Throwable -> L34
            goto L35
        L34:
        L35:
            if (r0 == 0) goto L3a
        L37:
            r0.close()     // Catch: java.lang.Throwable -> L3a
        L3a:
            java.lang.String r0 = ""
            java.lang.String r0 = l.C16014.m37865(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.f0.b.g():java.lang.String");
    }

    public String g(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + "*" + Integer.toString(displayMetrics.heightPixels);
        } catch (Throwable unused) {
            return "";
        }
    }

    public String h() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j = 0;
        }
        return C16014.m37865(j, "");
    }

    public String h(Context context) {
        try {
            return "" + context.getResources().getDisplayMetrics().widthPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String i() {
        long j;
        try {
            StatFs statFs = new StatFs("/sdcard");
            j = statFs.getBlockSize() * statFs.getBlockCount();
        } catch (Throwable unused) {
            j = 0;
        }
        return C16014.m37865(j, "");
    }

    public String i(Context context) {
        try {
            return "" + context.getResources().getDisplayMetrics().heightPixels;
        } catch (Throwable unused) {
            return "";
        }
    }

    public String j() {
        String str;
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class, String.class).invoke(cls.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public synchronized String j(Context context) {
        String a = d.a("SimSerial");
        if (a != null) {
            return a;
        }
        if (this.a.isBackgroundRunning()) {
            return "";
        }
        if (a(context, "android.permission.READ_PHONE_STATE")) {
            return "";
        }
        d.a("SimSerial", a);
        return a;
    }

    public String k() {
        String str;
        try {
            str = Locale.getDefault().toString();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public synchronized String k(Context context) {
        String androidId = this.a.getAndroidId();
        if (androidId != null) {
            return androidId;
        }
        String a = d.a("ANDROIDID");
        if (a != null) {
            return a;
        }
        if (this.a.isBackgroundRunning()) {
            return "";
        }
        try {
            a = Settings.Secure.getString(context.getContentResolver(), com.umeng.commonsdk.statistics.idtracking.b.a);
        } catch (Throwable unused) {
        }
        if (a == null) {
            a = "";
        }
        d.a("ANDROIDID", a);
        return a;
    }

    public String l() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public String l(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? String.valueOf(telephonyManager.getNetworkType()) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public String m() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            return "" + (currentTimeMillis - (currentTimeMillis % 1000));
        } catch (Throwable unused) {
            return "";
        }
    }

    public String m(Context context) {
        try {
            String n = n(context);
            String o = o(context);
            if (!com.alipay.sdk.m.d0.a.b(n) || !com.alipay.sdk.m.d0.a.b(o)) {
                return "";
            }
            return n + ":" + o(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public String n() {
        try {
            return SystemClock.elapsedRealtime() + "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public String o() {
        try {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb.append("00:");
            for (int i = 0; i < 7; i++) {
                sb.append(new File(strArr[i]).exists() ? "1" : "0");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String o(Context context) {
        String a = d.a("ip");
        if (a != null) {
            return a;
        }
        if (this.a.isBackgroundRunning()) {
            return "";
        }
        if (a == null) {
            a = "";
        }
        d.a("ip", a);
        return a;
    }

    public String p() {
        StringBuilder sb = new StringBuilder("00:");
        try {
            Class.forName(new String[]{"dalvik.system.Taint"}[0]);
            sb.append("1");
        } catch (Throwable unused) {
            sb.append("0");
        }
        return sb.toString();
    }

    public String p(Context context) {
        long j;
        try {
            if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                return "0:0";
            }
            String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
            long j2 = 0;
            for (int i = 0; i < 5; i++) {
                try {
                    j = new File(strArr[i]).lastModified();
                } catch (Throwable unused) {
                    j = -1;
                }
                j2 = Math.max(j, j2);
            }
            return "1:" + j2;
        } catch (Throwable unused2) {
            return "";
        }
    }

    public String q() {
        LineNumberReader lineNumberReader;
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            try {
                lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String readLine = lineNumberReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.toLowerCase().contains((CharSequence) linkedHashMap.get(str))) {
                            c = '1';
                            break;
                        }
                    } catch (Throwable unused) {
                        sb.append('0');
                        if (lineNumberReader == null) {
                        }
                        lineNumberReader.close();
                    }
                }
                sb.append(c);
            } catch (Throwable unused2) {
                lineNumberReader = null;
            }
            try {
                lineNumberReader.close();
            } catch (Throwable unused3) {
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String q(android.content.Context r6) {
        /*
            r5 = this;
            android.content.IntentFilter r0 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "android.intent.action.BATTERY_CHANGED"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4a
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L4a
            r2 = 33
            r3 = 2
            r4 = 0
            if (r1 < r2) goto L14
            android.content.Intent r6 = r6.registerReceiver(r4, r0, r3)     // Catch: java.lang.Throwable -> L4a
            goto L18
        L14:
            android.content.Intent r6 = r6.registerReceiver(r4, r0)     // Catch: java.lang.Throwable -> L4a
        L18:
            java.lang.String r0 = "level"
            r1 = -1
            int r0 = r6.getIntExtra(r0, r1)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r2 = "status"
            int r6 = r6.getIntExtra(r2, r1)     // Catch: java.lang.Throwable -> L4a
            if (r6 == r3) goto L2d
            r1 = 5
            if (r6 != r1) goto L2b
            goto L2d
        L2b:
            r6 = 0
            goto L2e
        L2d:
            r6 = 1
        L2e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4a
            r1.<init>()     // Catch: java.lang.Throwable -> L4a
            if (r6 == 0) goto L38
            java.lang.String r6 = "1"
            goto L3a
        L38:
            java.lang.String r6 = "0"
        L3a:
            r1.append(r6)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = ":"
            r1.append(r6)     // Catch: java.lang.Throwable -> L4a
            r1.append(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L4a
            return r6
        L4a:
            java.lang.String r6 = ""
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.f0.b.q(android.content.Context):java.lang.String");
    }

    public String r() {
        char c;
        String str;
        String lowerCase;
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", "sdk");
        linkedHashMap.put("MODEL", "sdk");
        for (String str2 : linkedHashMap.keySet()) {
            try {
                String str3 = (String) Build.class.getField(str2).get(null);
                str = (String) linkedHashMap.get(str2);
                lowerCase = str3 != null ? str3.toLowerCase() : null;
            } catch (Throwable unused) {
            }
            if (lowerCase != null && lowerCase.contains(str)) {
                c = '1';
                sb.append(c);
            }
            c = '0';
            sb.append(c);
        }
        return sb.toString();
    }

    public String s() {
        StringBuilder sb = new StringBuilder("00:");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", "sdk");
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", "sdk");
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            String str2 = (String) linkedHashMap.get(str);
            String b2 = com.alipay.sdk.m.d0.a.b(str, "");
            sb.append((b2 == null || !b2.contains(str2)) ? '0' : '1');
        }
        return sb.toString();
    }

    public final String t() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
                try {
                    readLine = bufferedReader.readLine();
                } catch (Throwable unused) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (fileReader == null) {
                        return "";
                    }
                    try {
                        fileReader.close();
                        return "";
                    } catch (Throwable unused3) {
                        return "";
                    }
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        if (com.alipay.sdk.m.d0.a.a(readLine)) {
            try {
                bufferedReader.close();
            } catch (Throwable unused6) {
            }
            fileReader.close();
            return "";
        }
        String trim = readLine.trim();
        try {
            bufferedReader.close();
        } catch (Throwable unused7) {
        }
        try {
            fileReader.close();
        } catch (Throwable unused8) {
        }
        return trim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
    
        r1 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003a, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        if (r0 == 0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String u() {
        /*
            r7 = this;
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String r1 = ""
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L42
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L42
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3f
            r4 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3f
        L11:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L3a
            boolean r4 = com.alipay.sdk.m.d0.a.a(r2)     // Catch: java.lang.Throwable -> L3e
            if (r4 != 0) goto L11
            java.lang.String r4 = ":"
            java.lang.String[] r2 = r2.split(r4)     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L11
            int r4 = r2.length     // Catch: java.lang.Throwable -> L3e
            r5 = 1
            if (r4 <= r5) goto L11
            r4 = 0
            r4 = r2[r4]     // Catch: java.lang.Throwable -> L3e
            java.lang.String r6 = "BogoMIPS"
            boolean r4 = r4.contains(r6)     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L11
            r2 = r2[r5]     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r2.trim()     // Catch: java.lang.Throwable -> L3e
        L3a:
            r3.close()     // Catch: java.lang.Throwable -> L4c
            goto L4c
        L3e:
            r2 = r0
        L3f:
            r0 = r2
            r2 = r3
            goto L43
        L42:
            r0 = r2
        L43:
            if (r2 == 0) goto L4a
            r2.close()     // Catch: java.lang.Throwable -> L49
            goto L4a
        L49:
        L4a:
            if (r0 == 0) goto L4f
        L4c:
            r0.close()     // Catch: java.lang.Throwable -> L4f
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.m.f0.b.u():java.lang.String");
    }
}

package com.umeng.commonsdk.statistics.common;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.material.timepicker.TimeModel;
import com.umeng.analytics.pro.am;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.idtracking.h;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import javax.microedition.khronos.opengles.GL10;
import l.C20094;

/* loaded from: classes.dex */
public class DeviceConfig {
    public static final int DEFAULT_TIMEZONE = 8;
    public static final String KEY_EMUI_VERSION_CODE = "ro.build.hw_emui_api_level";
    public static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    public static final String LOG_TAG = "com.umeng.commonsdk.statistics.common.DeviceConfig";
    public static final String MOBILE_NETWORK = "2G/3G";
    public static final String UNKNOW = "";
    public static final String WIFI = "Wi-Fi";
    public static DeviceTypeEnum deviceTypeEnum = DeviceTypeEnum.DEFAULT;
    public static volatile String sWifiMac = "";
    public static volatile String sImei = "";
    public static volatile String sMeid = "";
    public static volatile String sImsi = "";
    public static volatile String sSerialNo = "";
    public static volatile String sAndroidID = "";
    public static volatile String sIDFA = "";
    public static volatile String sOAID = "";
    public static volatile String sSecondImei = "";
    public static volatile String sSimSerialNumber = "";
    public static volatile boolean hasReadImeiOrMeid = false;
    public static volatile boolean hasReadSimSerialNumber = false;
    public static volatile boolean hasReadIMEI2 = false;
    public static volatile boolean hasReadSerialNo = false;
    public static volatile boolean hasReadAndroidID = false;
    public static volatile boolean hasReadMac = false;
    public static volatile boolean hasReadImsi = false;
    public static volatile boolean hasReadOAID = false;
    public static volatile boolean hasReadIDFA = false;
    public static volatile String sAppName = "";
    public static volatile String sAppPkgName = "";
    public static volatile boolean hasReadOperator = false;
    public static volatile String sOperator = "";
    public static volatile boolean hasReadOperatorName = false;
    public static volatile String sOperatorName = "";

    public static String getImei(Context context) {
        TelephonyManager telephonyManager;
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        String str = null;
        if (hasReadImeiOrMeid) {
            return null;
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.g) && context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null && checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                str = telephonyManager.getDeviceId();
            }
        } finally {
            try {
                hasReadImeiOrMeid = true;
                sImei = str;
                return str;
            } catch (Throwable th) {
            }
        }
        hasReadImeiOrMeid = true;
        sImei = str;
        return str;
    }

    public static String getImeiNew(Context context) {
        TelephonyManager telephonyManager;
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        String str = null;
        if (hasReadImeiOrMeid) {
            return null;
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.g) && context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null && checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Method method = telephonyManager.getClass().getMethod("getImei", null);
                        method.setAccessible(true);
                        str = (String) method.invoke(telephonyManager, null);
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(str)) {
                        str = telephonyManager.getDeviceId();
                    }
                } else {
                    str = telephonyManager.getDeviceId();
                }
            }
        } finally {
            try {
                hasReadImeiOrMeid = true;
                sImei = str;
                return str;
            } catch (Throwable th) {
            }
        }
        hasReadImeiOrMeid = true;
        sImei = str;
        return str;
    }

    public static String getAndroidId(Context context) {
        if (!TextUtils.isEmpty(sAndroidID)) {
            return sAndroidID;
        }
        if (hasReadAndroidID) {
            return null;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.i) && context != null) {
            try {
                try {
                    sAndroidID = Settings.Secure.getString(context.getContentResolver(), com.umeng.commonsdk.statistics.idtracking.b.a);
                } finally {
                    hasReadAndroidID = true;
                }
            } catch (Throwable unused) {
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.w("can't read android id");
                }
            }
        }
        return sAndroidID;
    }

    public static String getSerial() {
        return getSerialNo();
    }

    public static String getAppVersionCode(Context context) {
        return UMUtils.getAppVersionCode(context);
    }

    public static String getAppVersionName(Context context) {
        return UMUtils.getAppVersionName(context);
    }

    public static boolean checkPermission(Context context, String str) {
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
            }
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                return true;
            }
        }
        return false;
    }

    public static String[] getGPU(GL10 gl10) {
        try {
            return new String[]{gl10.glGetString(7936), gl10.glGetString(7937)};
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.e(LOG_TAG, "Could not read gpu infor:", th);
            }
            return new String[0];
        }
    }

    public static String getMacByJavaAPI() {
        if (!TextUtils.isEmpty(sWifiMac)) {
            return sWifiMac;
        }
        if (hasReadMac) {
            return "";
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.h)) {
                Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
                while (networkInterfaces.hasMoreElements()) {
                    NetworkInterface nextElement = networkInterfaces.nextElement();
                    if ("wlan0".equals(nextElement.getName()) || "eth0".equals(nextElement.getName())) {
                        byte[] hardwareAddress = nextElement.getHardwareAddress();
                        if (hardwareAddress == null || hardwareAddress.length == 0) {
                            sWifiMac = "";
                        }
                        StringBuilder sb = new StringBuilder();
                        for (byte b : hardwareAddress) {
                            sb.append(String.format("%02X:", Byte.valueOf(b)));
                        }
                        if (sb.length() > 0) {
                            sb.deleteCharAt(sb.length() - 1);
                        }
                        sWifiMac = sb.toString().toLowerCase(Locale.getDefault());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        hasReadMac = true;
        return sWifiMac;
    }

    public static String getMacShell() {
        if (!TextUtils.isEmpty(sWifiMac)) {
            return sWifiMac;
        }
        if (hasReadMac) {
            return "";
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.h)) {
                String[] strArr = {"/sys/class/net/wlan0/address", "/sys/class/net/eth0/address", "/sys/devices/virtual/net/wlan0/address"};
                for (int i = 0; i < 3; i++) {
                    try {
                        String reaMac = reaMac(strArr[i]);
                        if (reaMac != null) {
                            sWifiMac = reaMac;
                        }
                    } catch (Throwable th) {
                        if (AnalyticsConstants.UM_DEBUG) {
                            MLog.e(LOG_TAG, "open file  Failed", th);
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        hasReadMac = true;
        return sWifiMac;
    }

    public static String reaMac(String str) {
        FileReader fileReader;
        Throwable th;
        BufferedReader bufferedReader;
        String str2 = null;
        try {
            fileReader = new FileReader(str);
        } catch (Throwable unused) {
        }
        try {
            bufferedReader = new BufferedReader(fileReader, 1024);
            try {
                str2 = bufferedReader.readLine();
                try {
                    fileReader.close();
                } catch (Throwable unused2) {
                }
                bufferedReader.close();
                return str2;
            } catch (Throwable th2) {
                th = th2;
                try {
                    fileReader.close();
                } catch (Throwable unused3) {
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                        throw th;
                    } catch (Throwable unused4) {
                        throw th;
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }

    public static String getCPU() {
        String str = null;
        try {
            FileReader fileReader = new FileReader("/proc/cpuinfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader, 1024);
                str = bufferedReader.readLine();
                bufferedReader.close();
                fileReader.close();
            } catch (Throwable th) {
                MLog.e(LOG_TAG, "Could not read from file /proc/cpuinfo", th);
            }
        } catch (FileNotFoundException e) {
            MLog.e(LOG_TAG, "Could not open file /proc/cpuinfo", e);
        }
        return str != null ? str.substring(str.indexOf(58) + 1).trim() : "";
    }

    public static String getDeviceId(Context context) {
        if (AnalyticsConstants.getDeviceType() == 2) {
            return getDeviceIdForBox(context);
        }
        return getDeviceIdForGeneral(context);
    }

    public static String getDeviceIdType() {
        return deviceTypeEnum.getDeviceIdType();
    }

    public static String getDeviceIdUmengMD5(Context context) {
        return HelperUtils.getUmengMD5(getDeviceId(context));
    }

    public static String getMCCMNC(Context context) {
        if (context == null) {
            return null;
        }
        if (getImsi(context) == null) {
            return null;
        }
        int i = context.getResources().getConfiguration().mcc;
        int i2 = context.getResources().getConfiguration().mnc;
        if (i != 0) {
            String valueOf = String.valueOf(i2);
            if (i2 < 10) {
                valueOf = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i2));
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(String.valueOf(i));
            stringBuffer.append(valueOf);
            return stringBuffer.toString();
        }
        return null;
    }

    public static String getImsi(Context context) {
        if (!TextUtils.isEmpty(sImsi)) {
            return sImsi;
        }
        String str = null;
        if (hasReadImsi || context == null) {
            return null;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.aj)) {
            try {
                if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                    str = telephonyManager.getSubscriberId();
                }
            } catch (Throwable unused) {
            }
            hasReadImsi = true;
        }
        sImsi = str;
        return sImsi;
    }

    public static String getMeid(Context context) {
        String str = null;
        if (context == null || ((TelephonyManager) context.getSystemService("phone")) == null) {
            return null;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.ak)) {
            try {
                if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                    if (Build.VERSION.SDK_INT < 26) {
                        str = getIMEI(context);
                    } else {
                        str = meid(context);
                        if (TextUtils.isEmpty(str)) {
                            str = getIMEI(context);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    public static String meid(Context context) {
        if (!TextUtils.isEmpty(sMeid)) {
            return sMeid;
        }
        String str = null;
        if (hasReadImeiOrMeid || context == null) {
            return null;
        }
        try {
            Object invoke = Class.forName("android.telephony.TelephonyManager").getMethod("getMeid", null).invoke(null, null);
            if (invoke != null && (invoke instanceof String)) {
                str = (String) invoke;
            }
        } finally {
            try {
                hasReadImeiOrMeid = true;
                sMeid = str;
                return sMeid;
            } catch (Throwable th) {
            }
        }
        hasReadImeiOrMeid = true;
        sMeid = str;
        return sMeid;
    }

    public static String getSimICCID(Context context) {
        if (!TextUtils.isEmpty(sSimSerialNumber)) {
            return sSimSerialNumber;
        }
        if (hasReadSimSerialNumber) {
            return null;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.an)) {
            if (context != null) {
                try {
                    if (UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                        if (telephonyManager != null) {
                            sSimSerialNumber = telephonyManager.getSimSerialNumber();
                        } else {
                            hasReadSimSerialNumber = true;
                            return null;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            hasReadSimSerialNumber = true;
        }
        return sSimSerialNumber;
    }

    public static String getSecondSimIMEi(Context context) {
        TelephonyManager telephonyManager;
        if (!TextUtils.isEmpty(sSecondImei)) {
            return sSecondImei;
        }
        if (hasReadIMEI2) {
            return null;
        }
        if (context != null && FieldManager.allow(com.umeng.commonsdk.utils.d.am) && Build.VERSION.SDK_INT >= 23 && UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
            try {
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
            } catch (Throwable unused) {
            }
            if (telephonyManager != null) {
                Class<?> cls = telephonyManager.getClass();
                if (((Integer) cls.getMethod("getPhoneCount", null).invoke(telephonyManager, null)).intValue() == 2) {
                    sSecondImei = (String) cls.getMethod("getDeviceId", Integer.TYPE).invoke(telephonyManager, 2);
                }
                hasReadIMEI2 = true;
            } else {
                hasReadIMEI2 = true;
                return null;
            }
        }
        return sSecondImei;
    }

    public static String getRegisteredOperator(Context context) {
        if (!TextUtils.isEmpty(sOperator)) {
            return sOperator;
        }
        if (hasReadOperator || context == null) {
            return null;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                sOperator = telephonyManager.getNetworkOperator();
            }
        } catch (Throwable unused) {
        }
        hasReadOperator = true;
        return sOperator;
    }

    public static String getNetworkOperatorName(Context context) {
        if (!TextUtils.isEmpty(sOperatorName)) {
            return sOperatorName;
        }
        if (hasReadOperatorName || context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE") && telephonyManager != null) {
                sOperatorName = telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable unused) {
        }
        hasReadOperatorName = true;
        return sOperatorName;
    }

    public static String getDisplayResolution(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                int i = displayMetrics.widthPixels;
                return String.valueOf(displayMetrics.heightPixels) + "*" + String.valueOf(i);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String[] getNetworkAccessMode(Context context) {
        String[] strArr = {"", ""};
        if (context != null) {
            try {
                if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                    strArr[0] = "";
                    return strArr;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null) {
                    strArr[0] = "";
                    return strArr;
                }
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                if (networkInfo != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    strArr[0] = "Wi-Fi";
                    return strArr;
                }
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                if (networkInfo2 != null && networkInfo2.getState() == NetworkInfo.State.CONNECTED) {
                    strArr[0] = "2G/3G";
                    strArr[1] = networkInfo2.getSubtypeName();
                }
            } catch (Throwable unused) {
            }
        }
        return strArr;
    }

    public static int getNetworkType(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return telephonyManager.getNetworkType();
            }
            return 0;
        } catch (Exception unused) {
            return -100;
        }
    }

    public static boolean isWiFiAvailable(Context context) {
        if (context == null) {
            return false;
        }
        return "Wi-Fi".equals(getNetworkAccessMode(context)[0]);
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null) {
            return false;
        }
        try {
            if (checkPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                return activeNetworkInfo.isConnectedOrConnecting();
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static int getTimeZone(Context context) {
        if (context == null) {
            return 8;
        }
        try {
            Calendar calendar = Calendar.getInstance(getLocale(context));
            if (calendar != null) {
                return calendar.getTimeZone().getRawOffset() / 3600000;
            }
        } catch (Throwable th) {
            MLog.i(LOG_TAG, "error in getTimeZone", th);
        }
        return 8;
    }

    public static boolean isChineseAera(Context context) {
        String imprintProperty;
        if (context == null) {
            return false;
        }
        try {
            imprintProperty = UMEnvelopeBuild.imprintProperty(context, am.O, "");
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(imprintProperty)) {
            return imprintProperty.equals("cn");
        }
        if (getImsi(context) == null) {
            String str = getLocaleInfo(context)[0];
            if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase("cn")) {
                return true;
            }
        } else {
            int i = context.getResources().getConfiguration().mcc;
            if (i != 460 && i != 461) {
                if (i == 0) {
                    String str2 = getLocaleInfo(context)[0];
                    if (TextUtils.isEmpty(str2) || !str2.equalsIgnoreCase("cn")) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static String[] getLocaleInfo(Context context) {
        String[] strArr = {"Unknown", "Unknown"};
        if (context != null) {
            try {
                Locale locale = getLocale(context);
                if (locale != null) {
                    strArr[0] = locale.getCountry();
                    strArr[1] = locale.getLanguage();
                }
                if (TextUtils.isEmpty(strArr[0])) {
                    strArr[0] = "Unknown";
                }
                if (TextUtils.isEmpty(strArr[1])) {
                    strArr[1] = "Unknown";
                }
            } catch (Throwable th) {
                MLog.e(LOG_TAG, "error in getLocaleInfo", th);
                return strArr;
            }
        }
        return strArr;
    }

    public static Locale getLocale(Context context) {
        Locale locale;
        if (context == null) {
            return Locale.getDefault();
        }
        try {
            Configuration configuration = new Configuration();
            configuration.setToDefaults();
            Settings.System.getConfiguration(context.getContentResolver(), configuration);
            locale = configuration.locale;
        } catch (Throwable unused) {
            MLog.e(LOG_TAG, "fail to read user config locale");
            locale = null;
        }
        return locale == null ? Locale.getDefault() : locale;
    }

    public static String getMac(Context context) {
        String str = "";
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.h) && context != null) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i < 23) {
                    return getMacBySystemInterface(context);
                }
                if (i == 23) {
                    String macByJavaAPI = getMacByJavaAPI();
                    if (!TextUtils.isEmpty(macByJavaAPI)) {
                        return macByJavaAPI;
                    }
                    if (AnalyticsConstants.CHECK_DEVICE) {
                        return getMacShell();
                    }
                    return getMacBySystemInterface(context);
                }
                str = getMacByJavaAPI();
                if (TextUtils.isEmpty(str)) {
                    return getMacBySystemInterface(context);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String getMacBySystemInterface(Context context) {
        if (!TextUtils.isEmpty(sWifiMac)) {
            return sWifiMac;
        }
        if (hasReadMac || context == null) {
            return "";
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.h)) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (!checkPermission(context, "android.permission.ACCESS_WIFI_STATE")) {
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.w(LOG_TAG, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE");
                    }
                    sWifiMac = "";
                } else if (wifiManager != null) {
                    sWifiMac = wifiManager.getConnectionInfo().getMacAddress();
                } else {
                    sWifiMac = "";
                }
            }
        } finally {
            try {
                hasReadMac = true;
                return sWifiMac;
            } catch (Throwable th) {
            }
        }
        hasReadMac = true;
        return sWifiMac;
    }

    public static int[] getResolutionArray(Context context) {
        if (context == null) {
            return null;
        }
        int[] iArr = new int[2];
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            try {
                Method method = Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class);
                if (method != null) {
                    method.invoke(defaultDisplay, displayMetrics);
                    int i = displayMetrics.widthPixels;
                    int i2 = displayMetrics.heightPixels;
                    if (i > i2) {
                        iArr[0] = i2;
                        iArr[1] = i;
                    } else {
                        iArr[0] = i;
                        iArr[1] = i2;
                    }
                    iArr[0] = i;
                    iArr[1] = i2;
                    return iArr;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static int reflectMetrics(Object obj, String str) {
        try {
            Field declaredField = DisplayMetrics.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.getInt(obj);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static String getPackageName(Context context) {
        if (!TextUtils.isEmpty(sAppPkgName)) {
            return sAppPkgName;
        }
        if (context == null) {
            return null;
        }
        sAppPkgName = context.getPackageName();
        return sAppPkgName;
    }

    public static String getAppSHA1Key(Context context) {
        try {
            PackageInfo a = com.umeng.commonsdk.utils.b.a().a(context, getPackageName(context), 64);
            if (a == null) {
                return null;
            }
            return byte2HexFormatted(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(a.signatures[0].toByteArray()))).getEncoded()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getAppHashKey(Context context) {
        try {
            PackageInfo a = com.umeng.commonsdk.utils.b.a().a(context, getPackageName(context), 64);
            if (a == null) {
                return null;
            }
            Signature[] signatureArr = a.signatures;
            if (signatureArr.length <= 0) {
                return null;
            }
            Signature signature = signatureArr[0];
            MessageDigest messageDigest = MessageDigest.getInstance("SHA");
            messageDigest.update(signature.toByteArray());
            return Base64.encodeToString(messageDigest.digest(), 0).trim();
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getAppMD5Signature(Context context) {
        if (context == null) {
            return null;
        }
        try {
            PackageInfo a = com.umeng.commonsdk.utils.b.a().a(context, getPackageName(context), 64);
            if (a == null) {
                return null;
            }
            return byte2HexFormatted(MessageDigest.getInstance("MD5").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(a.signatures[0].toByteArray()))).getEncoded()));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String byte2HexFormatted(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0".concat(hexString);
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static String getApplicationLable(Context context) {
        return context == null ? "" : context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
    }

    public static String getAppName(Context context) {
        if (!TextUtils.isEmpty(sAppName)) {
            return sAppName;
        }
        if (context == null) {
            return null;
        }
        try {
            PackageInfo a = com.umeng.commonsdk.utils.b.a().a(context, context.getPackageName(), 64);
            if (a != null) {
                sAppName = a.applicationInfo.loadLabel(context.getPackageManager()).toString();
            }
        } catch (Throwable th) {
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, th);
            }
        }
        return sAppName;
    }

    public static String getDeviceIdForGeneral(Context context) {
        int i;
        String str = "";
        if (context == null) {
            return "";
        }
        try {
            i = Build.VERSION.SDK_INT;
        } catch (Throwable unused) {
        }
        if (i < 23) {
            String imei = getIMEI(context);
            deviceTypeEnum = DeviceTypeEnum.IMEI;
            if (!TextUtils.isEmpty(imei)) {
                return imei;
            }
            boolean z = AnalyticsConstants.UM_DEBUG;
            if (z) {
                MLog.w(LOG_TAG, "No IMEI.");
            }
            String macBySystemInterface = getMacBySystemInterface(context);
            deviceTypeEnum = DeviceTypeEnum.MAC;
            if (!TextUtils.isEmpty(macBySystemInterface)) {
                return macBySystemInterface;
            }
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
                macBySystemInterface = getAndroidId(context);
                deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                if (z) {
                    MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + macBySystemInterface);
                }
            }
            if (!TextUtils.isEmpty(macBySystemInterface)) {
                return macBySystemInterface;
            }
            String serialNo = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            return serialNo;
        }
        if (i == 23) {
            String imei2 = getIMEI(context);
            deviceTypeEnum = DeviceTypeEnum.IMEI;
            if (!TextUtils.isEmpty(imei2)) {
                return imei2;
            }
            String macByJavaAPI = getMacByJavaAPI();
            DeviceTypeEnum deviceTypeEnum2 = DeviceTypeEnum.MAC;
            deviceTypeEnum = deviceTypeEnum2;
            if (TextUtils.isEmpty(macByJavaAPI)) {
                if (AnalyticsConstants.CHECK_DEVICE) {
                    macByJavaAPI = getMacShell();
                    deviceTypeEnum = deviceTypeEnum2;
                } else {
                    macByJavaAPI = getMacBySystemInterface(context);
                    deviceTypeEnum = deviceTypeEnum2;
                }
            }
            boolean z2 = AnalyticsConstants.UM_DEBUG;
            if (z2) {
                MLog.i(LOG_TAG, "getDeviceId, MAC: " + macByJavaAPI);
            }
            if (!TextUtils.isEmpty(macByJavaAPI)) {
                return macByJavaAPI;
            }
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
                macByJavaAPI = getAndroidId(context);
                deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                if (z2) {
                    MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + macByJavaAPI);
                }
            }
            if (!TextUtils.isEmpty(macByJavaAPI)) {
                return macByJavaAPI;
            }
            String serialNo2 = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            return serialNo2;
        }
        if (i >= 29) {
            String oaid = getOaid(context);
            deviceTypeEnum = DeviceTypeEnum.OAID;
            if (!TextUtils.isEmpty(oaid)) {
                return oaid;
            }
            String idfa = getIdfa(context);
            deviceTypeEnum = DeviceTypeEnum.IDFA;
            if (!TextUtils.isEmpty(idfa)) {
                return idfa;
            }
            String androidId = getAndroidId(context);
            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
            if (!TextUtils.isEmpty(androidId)) {
                return androidId;
            }
            String serialNo3 = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (!TextUtils.isEmpty(serialNo3)) {
                return serialNo3;
            }
            String macByJavaAPI2 = getMacByJavaAPI();
            DeviceTypeEnum deviceTypeEnum3 = DeviceTypeEnum.MAC;
            deviceTypeEnum = deviceTypeEnum3;
            if (!TextUtils.isEmpty(macByJavaAPI2)) {
                return macByJavaAPI2;
            }
            String macBySystemInterface2 = getMacBySystemInterface(context);
            deviceTypeEnum = deviceTypeEnum3;
            return macBySystemInterface2;
        }
        str = getIMEI(context);
        deviceTypeEnum = DeviceTypeEnum.IMEI;
        if (TextUtils.isEmpty(str)) {
            str = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (TextUtils.isEmpty(str)) {
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
                    str = getAndroidId(context);
                    deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                    if (AnalyticsConstants.UM_DEBUG) {
                        MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + str);
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    str = getMacByJavaAPI();
                    DeviceTypeEnum deviceTypeEnum4 = DeviceTypeEnum.MAC;
                    deviceTypeEnum = deviceTypeEnum4;
                    if (TextUtils.isEmpty(str)) {
                        str = getMacBySystemInterface(context);
                        deviceTypeEnum = deviceTypeEnum4;
                        if (AnalyticsConstants.UM_DEBUG) {
                            MLog.i(LOG_TAG, "getDeviceId, MAC: " + str);
                        }
                    }
                }
            }
        }
        return str;
    }

    public static String getDeviceIdForBox(Context context) {
        int i;
        String str = "";
        if (context == null) {
            return "";
        }
        try {
            i = Build.VERSION.SDK_INT;
        } catch (Throwable unused) {
        }
        if (i < 23) {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
                str = getAndroidId(context);
                deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + str);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String macBySystemInterface = getMacBySystemInterface(context);
            deviceTypeEnum = DeviceTypeEnum.MAC;
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId, MAC: " + macBySystemInterface);
            }
            if (!TextUtils.isEmpty(macBySystemInterface)) {
                return macBySystemInterface;
            }
            String serialNo = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (!TextUtils.isEmpty(serialNo)) {
                return serialNo;
            }
            String imei = getIMEI(context);
            deviceTypeEnum = DeviceTypeEnum.IMEI;
            return imei;
        }
        if (i == 23) {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
                str = getAndroidId(context);
                deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
                if (AnalyticsConstants.UM_DEBUG) {
                    MLog.i(LOG_TAG, "getDeviceId, ANDROID_ID: " + str);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String macByJavaAPI = getMacByJavaAPI();
            DeviceTypeEnum deviceTypeEnum2 = DeviceTypeEnum.MAC;
            deviceTypeEnum = deviceTypeEnum2;
            if (TextUtils.isEmpty(macByJavaAPI)) {
                if (AnalyticsConstants.CHECK_DEVICE) {
                    macByJavaAPI = getMacShell();
                    deviceTypeEnum = deviceTypeEnum2;
                } else {
                    macByJavaAPI = getMacBySystemInterface(context);
                    deviceTypeEnum = deviceTypeEnum2;
                }
            }
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId, MAC: " + macByJavaAPI);
            }
            if (!TextUtils.isEmpty(macByJavaAPI)) {
                return macByJavaAPI;
            }
            String serialNo2 = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (!TextUtils.isEmpty(serialNo2)) {
                return serialNo2;
            }
            String imei2 = getIMEI(context);
            deviceTypeEnum = DeviceTypeEnum.IMEI;
            return imei2;
        }
        if (i >= 29) {
            String oaid = getOaid(context);
            deviceTypeEnum = DeviceTypeEnum.OAID;
            if (!TextUtils.isEmpty(oaid)) {
                return oaid;
            }
            String idfa = getIdfa(context);
            deviceTypeEnum = DeviceTypeEnum.IDFA;
            if (!TextUtils.isEmpty(idfa)) {
                return idfa;
            }
            String androidId = getAndroidId(context);
            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
            if (!TextUtils.isEmpty(androidId)) {
                return androidId;
            }
            String serialNo3 = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (!TextUtils.isEmpty(serialNo3)) {
                return serialNo3;
            }
            String macByJavaAPI2 = getMacByJavaAPI();
            DeviceTypeEnum deviceTypeEnum3 = DeviceTypeEnum.MAC;
            deviceTypeEnum = deviceTypeEnum3;
            if (!TextUtils.isEmpty(macByJavaAPI2)) {
                return macByJavaAPI2;
            }
            String macBySystemInterface2 = getMacBySystemInterface(context);
            deviceTypeEnum = deviceTypeEnum3;
            return macBySystemInterface2;
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.i)) {
            str = getAndroidId(context);
            deviceTypeEnum = DeviceTypeEnum.ANDROIDID;
            if (AnalyticsConstants.UM_DEBUG) {
                MLog.i(LOG_TAG, "getDeviceId: ANDROID_ID: " + str);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = getSerialNo();
            deviceTypeEnum = DeviceTypeEnum.SERIALNO;
            if (TextUtils.isEmpty(str)) {
                str = getIMEI(context);
                deviceTypeEnum = DeviceTypeEnum.IMEI;
                if (TextUtils.isEmpty(str)) {
                    str = getMacByJavaAPI();
                    DeviceTypeEnum deviceTypeEnum4 = DeviceTypeEnum.MAC;
                    deviceTypeEnum = deviceTypeEnum4;
                    if (TextUtils.isEmpty(str)) {
                        str = getMacBySystemInterface(context);
                        deviceTypeEnum = deviceTypeEnum4;
                        if (AnalyticsConstants.UM_DEBUG) {
                            MLog.i(LOG_TAG, "getDeviceId, MAC: " + str);
                        }
                    }
                }
            }
        }
        return str;
    }

    public static String getOaid(Context context) {
        if (!TextUtils.isEmpty(sOAID)) {
            return sOAID;
        }
        if (hasReadOAID) {
            return "";
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            try {
                SharedPreferences sharedPreferences = context.getSharedPreferences(h.a, 0);
                if (sharedPreferences != null) {
                    sOAID = sharedPreferences.getString(h.b, "");
                }
            } catch (Throwable unused) {
            }
            hasReadOAID = true;
        }
        return sOAID;
    }

    public static String getIdfa(Context context) {
        if (!TextUtils.isEmpty(sIDFA)) {
            return sIDFA;
        }
        if (hasReadIDFA) {
            return "";
        }
        try {
            if (FieldManager.allow(com.umeng.commonsdk.utils.d.w)) {
                sIDFA = a.a(context);
            }
        } catch (Throwable unused) {
        }
        hasReadIDFA = true;
        return sIDFA;
    }

    public static String getIMEI(Context context) {
        if (!TextUtils.isEmpty(sImei)) {
            return sImei;
        }
        String str = "";
        if (hasReadImeiOrMeid) {
            return "";
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.g)) {
            if (context == null) {
                return "";
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                try {
                    if (checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                        str = telephonyManager.getDeviceId();
                        if (AnalyticsConstants.UM_DEBUG) {
                            MLog.i(LOG_TAG, "getDeviceId, IMEI: " + str);
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        sImei = str;
        return sImei;
    }

    public static String getSerialNo() {
        if (!TextUtils.isEmpty(sSerialNo)) {
            return sSerialNo;
        }
        String str = "";
        if (hasReadSerialNo) {
            return "";
        }
        if (FieldManager.allow(com.umeng.commonsdk.utils.d.j)) {
            try {
                if (Build.VERSION.SDK_INT >= 26) {
                    try {
                        Class<?> cls = Class.forName("android.os.Build");
                        Method method = cls.getMethod("getSerial", null);
                        if (checkPermission(UMGlobalContext.getAppContext(), "android.permission.READ_PHONE_STATE")) {
                            str = (String) method.invoke(cls, null);
                        }
                    } catch (Throwable unused) {
                    }
                } else {
                    str = Build.SERIAL;
                }
                sSerialNo = str;
            } catch (Throwable unused2) {
            }
            hasReadSerialNo = true;
        }
        if (AnalyticsConstants.UM_DEBUG) {
            MLog.i(LOG_TAG, C20094.m46315("getDeviceId, serial no: ", str));
        }
        return sSerialNo;
    }

    public static String getSubOSName(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty("ro.miui.ui.version.name");
            return TextUtils.isEmpty(property) ? isFlyMe() ? "Flyme" : isEmui(buildProp) ? "Emui" : !TextUtils.isEmpty(getYunOSVersion(buildProp)) ? "YunOS" : property : "MIUI";
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getSubOSVersion(Context context) {
        Properties buildProp = getBuildProp();
        try {
            String property = buildProp.getProperty("ro.miui.ui.version.name");
            if (!TextUtils.isEmpty(property)) {
                return property;
            }
            try {
                if (isFlyMe()) {
                    property = getFlymeVersion(buildProp);
                } else if (isEmui(buildProp)) {
                    property = getEmuiVersion(buildProp);
                } else {
                    property = getYunOSVersion(buildProp);
                }
                return property;
            } catch (Throwable unused) {
                return property;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static String getYunOSVersion(Properties properties) {
        try {
            String property = properties.getProperty("ro.yunos.version");
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return property;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getFlymeVersion(Properties properties) {
        try {
            String lowerCase = properties.getProperty("ro.build.display.id").toLowerCase(Locale.getDefault());
            if (lowerCase.contains("flyme os")) {
                return lowerCase.split(" ")[2];
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getEmuiVersion(Properties properties) {
        try {
            return properties.getProperty(KEY_EMUI_VERSION_CODE, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Properties getBuildProp() {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
            } catch (Throwable unused) {
                return properties;
            }
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                return properties;
            } catch (Throwable unused2) {
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                return properties;
            }
        } catch (Throwable unused3) {
        }
    }

    public static boolean isFlyMe() {
        try {
            Build.class.getMethod("hasSmartBar", null);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean isEmui(Properties properties) {
        return properties.getProperty(KEY_EMUI_VERSION_CODE, null) != null;
    }

    public static String getDeviceType(Context context) {
        if (context != null) {
            try {
                if ((context.getResources().getConfiguration().screenLayout & 15) >= 3) {
                    return "Tablet";
                }
            } catch (Throwable unused) {
            }
        }
        return "Phone";
    }

    public static String getDBencryptID(Context context) {
        return UMUtils.genId();
    }

    public static Activity getGlobleActivity(Context context) {
        Activity activity = null;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object invoke = cls.getMethod("currentActivityThread", null).invoke(null, null);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(invoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    activity = (Activity) declaredField3.get(obj);
                }
            }
        } catch (Throwable unused) {
        }
        return activity;
    }

    public static boolean isHarmony(Context context) {
        try {
            return context.getString(Resources.getSystem().getIdentifier("config_os_brand", "string", "android")).equals("harmony");
        } catch (Throwable unused) {
            return false;
        }
    }
}

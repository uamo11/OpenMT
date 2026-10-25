package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.ay;
import com.umeng.analytics.pro.be;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback;
import com.umeng.commonsdk.utils.FileLockCallback;
import com.umeng.commonsdk.utils.FileLockUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class ImprintHandler implements FileLockCallback {
    public static final String a = "ImprintHandler";
    public static final String c = ".imprint";
    public static Context k = null;

    /* renamed from: l, reason: collision with root package name */
    public static FileLockUtil f77953l = null;
    public static final int m = 0;
    public static final int n = 1;
    public com.umeng.commonsdk.statistics.internal.d e;
    public a h = new a();
    public com.umeng.commonsdk.statistics.proto.d i = null;
    public static Object b = new Object();
    public static final byte[] d = "pbl0".getBytes();
    public static Map f = new HashMap();
    public static Object g = new Object();
    public static ImprintHandler j = null;
    public static Map o = new HashMap();
    public static Object p = new Object();

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str) {
        return false;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(String str, Object obj) {
        return false;
    }

    public static synchronized ImprintHandler getImprintService(Context context) {
        ImprintHandler imprintHandler;
        synchronized (ImprintHandler.class) {
            if (j == null) {
                j = new ImprintHandler(context);
                f77953l = new FileLockUtil();
                f77953l.doFileOperateion(new File(k.getFilesDir(), c), j, 0);
            }
            imprintHandler = j;
        }
        return imprintHandler;
    }

    @Override // com.umeng.commonsdk.utils.FileLockCallback
    public boolean onFileLock(File file, int i) {
        if (i == 0) {
            j.e();
        } else if (i == 1) {
            j.a(file);
        }
        return true;
    }

    public ImprintHandler(Context context) {
        k = context.getApplicationContext();
    }

    public static void a(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        synchronized (g) {
            try {
                int i = 0;
                if (f.containsKey(str)) {
                    ArrayList arrayList = (ArrayList) f.get(str);
                    int size = arrayList.size();
                    ULog.i("--->>> addCallback: before add: callbacks size is: " + size);
                    while (i < size) {
                        if (uMImprintChangeCallback == arrayList.get(i)) {
                            ULog.i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i++;
                    }
                    arrayList.add(uMImprintChangeCallback);
                    ULog.i("--->>> addCallback: after add: callbacks size is: " + arrayList.size());
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    int size2 = arrayList2.size();
                    ULog.i("--->>> addCallback: before add: callbacks size is: " + size2);
                    while (i < size2) {
                        if (uMImprintChangeCallback == arrayList2.get(i)) {
                            ULog.i("--->>> addCallback: callback has exist, just exit");
                            return;
                        }
                        i++;
                    }
                    arrayList2.add(uMImprintChangeCallback);
                    ULog.i("--->>> addCallback: after add: callbacks size is: " + arrayList2.size());
                    f.put(str, arrayList2);
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(k, th);
            }
        }
    }

    public static void b(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        synchronized (g) {
            try {
                if (f.containsKey(str)) {
                    ArrayList arrayList = (ArrayList) f.get(str);
                    if (arrayList.size() > 0) {
                        int size = arrayList.size();
                        ULog.i("--->>> removeCallback: before remove: callbacks size is: " + size);
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (uMImprintChangeCallback == arrayList.get(i)) {
                                ULog.i("--->>> removeCallback: remove index " + i);
                                arrayList.remove(i);
                                break;
                            }
                            i++;
                        }
                        ULog.i("--->>> removeCallback: after remove: callbacks size is: " + arrayList.size());
                        if (arrayList.size() == 0) {
                            ULog.i("--->>> removeCallback: remove key from map: key = " + str);
                            f.remove(str);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public void registImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        a(str, uMImprintChangeCallback);
    }

    public void unregistImprintCallback(String str, UMImprintChangeCallback uMImprintChangeCallback) {
        if (TextUtils.isEmpty(str) || uMImprintChangeCallback == null) {
            return;
        }
        b(str, uMImprintChangeCallback);
    }

    public void registPreProcessCallback(String str, UMImprintPreProcessCallback uMImprintPreProcessCallback) {
        if (TextUtils.isEmpty(str) || uMImprintPreProcessCallback == null) {
            return;
        }
        synchronized (p) {
            try {
                if (!o.containsKey(str)) {
                    o.put(str, uMImprintPreProcessCallback);
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> registPreProcessCallback: key : " + str + " regist success.");
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> key : " + str + " PreProcesser has registed!");
                }
            } finally {
            }
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (p) {
            try {
                if (o.containsKey(str)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: unregist [" + str + "] success.");
                    f.remove(str);
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> unregistPreProcessCallback: can't find [" + str + "], pls regist first.");
                }
            } finally {
            }
        }
    }

    public void a(com.umeng.commonsdk.statistics.internal.d dVar) {
        this.e = dVar;
    }

    public String a(com.umeng.commonsdk.statistics.proto.d dVar) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : new TreeMap(dVar.c()).entrySet()) {
            sb.append((String) entry.getKey());
            if (((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).d()) {
                sb.append(((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).b());
            }
        }
        sb.append(dVar.b);
        return HelperUtils.MD5(sb.toString()).toLowerCase(Locale.US);
    }

    private boolean c(com.umeng.commonsdk.statistics.proto.d dVar) {
        if (!dVar.i().equals(a(dVar))) {
            return false;
        }
        for (com.umeng.commonsdk.statistics.proto.e eVar : dVar.c().values()) {
            String h = eVar.h();
            if (!TextUtils.isEmpty(h)) {
                byte[] reverseHexString = DataHelper.reverseHexString(h);
                byte[] a2 = a(eVar);
                for (int i = 0; i < 4; i++) {
                    if (reverseHexString[i] != a2[i]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public byte[] a(com.umeng.commonsdk.statistics.proto.e eVar) {
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(null);
        allocate.putLong(eVar.e());
        byte[] array = allocate.array();
        byte[] bArr = d;
        byte[] bArr2 = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr2[i] = (byte) (array[i] ^ bArr[i]);
        }
        return bArr2;
    }

    public byte[] a() {
        try {
            synchronized (this) {
                com.umeng.commonsdk.statistics.proto.d dVar = this.i;
                if (dVar == null) {
                    return null;
                }
                if (dVar.b() <= 0) {
                    return null;
                }
                return new be().a(this.i);
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(k, th);
            return null;
        }
    }

    private com.umeng.commonsdk.statistics.proto.d d(com.umeng.commonsdk.statistics.proto.d dVar) {
        Map c2 = dVar.c();
        if (c2.containsKey(am.f)) {
            c2.remove(am.f);
            this.h.a(am.f);
            dVar.a(dVar.f());
            dVar.a(a(dVar));
        }
        return dVar;
    }

    public void b(com.umeng.commonsdk.statistics.proto.d dVar) {
        com.umeng.commonsdk.statistics.proto.d a2;
        boolean a3;
        if (dVar == null) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.d(UMRTLog.RTLOG_TAG, "Imprint is null");
                return;
            }
            return;
        }
        if (!c(dVar)) {
            if (AnalyticsConstants.UM_DEBUG) {
                UMRTLog.e(UMRTLog.RTLOG_TAG, "Imprint is not valid");
                return;
            }
            return;
        }
        String str = AnalyticsConstants.OS;
        HashMap hashMap = new HashMap();
        synchronized (this) {
            com.umeng.commonsdk.statistics.proto.d dVar2 = this.i;
            com.umeng.commonsdk.statistics.proto.d d2 = d(dVar);
            String str2 = null;
            String i = dVar2 == null ? null : dVar2.i();
            if (dVar2 == null) {
                a2 = e(d2);
            } else {
                a2 = a(dVar2, d2, hashMap);
            }
            this.i = a2;
            if (a2 != null) {
                str2 = a2.i();
            }
            a3 = a(i, str2);
        }
        com.umeng.commonsdk.statistics.proto.d dVar3 = this.i;
        if (dVar3 != null && !a3) {
            this.h.a(dVar3);
            com.umeng.commonsdk.statistics.internal.d dVar4 = this.e;
            if (dVar4 != null) {
                dVar4.onImprintChanged(this.h);
            }
        }
        if (hashMap.size() > 0) {
            synchronized (g) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    String str4 = (String) entry.getValue();
                    if (!TextUtils.isEmpty(str3) && f.containsKey(str3)) {
                        ULog.i("--->>> target imprint key is: " + str3 + "; value is: " + str4);
                        ArrayList arrayList = (ArrayList) f.get(str3);
                        if (arrayList != null) {
                            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                                ((UMImprintChangeCallback) arrayList.get(i2)).onImprintValueChanged(str3, str4);
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean a(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    private com.umeng.commonsdk.statistics.proto.d a(com.umeng.commonsdk.statistics.proto.d dVar, com.umeng.commonsdk.statistics.proto.d dVar2, Map map) {
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        ArrayList arrayList;
        if (dVar2 == null) {
            return dVar;
        }
        Map c2 = dVar.c();
        for (Map.Entry entry : dVar2.c().entrySet()) {
            int i = 0;
            if (((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).d()) {
                String str = (String) entry.getKey();
                String str2 = ((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).a;
                synchronized (p) {
                    if (!TextUtils.isEmpty(str) && o.containsKey(str) && (uMImprintPreProcessCallback = (UMImprintPreProcessCallback) o.get(str)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(str, str2)) {
                        i = 1;
                    }
                }
                if (i == 0) {
                    c2.put(entry.getKey(), entry.getValue());
                    synchronized (g) {
                        if (!TextUtils.isEmpty(str) && f.containsKey(str) && ((ArrayList) f.get(str)) != null) {
                            map.put(str, str2);
                        }
                    }
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "--->>> merge: [" + str + "] should be ignored.");
                }
            } else {
                String str3 = (String) entry.getKey();
                synchronized (g) {
                    if (!TextUtils.isEmpty(str3) && f.containsKey(str3) && (arrayList = (ArrayList) f.get(str3)) != null) {
                        while (i < arrayList.size()) {
                            ((UMImprintChangeCallback) arrayList.get(i)).onImprintValueChanged(str3, null);
                            i++;
                        }
                    }
                }
                c2.remove(str3);
                this.h.a(str3);
            }
        }
        dVar.a(dVar2.f());
        dVar.a(a(dVar));
        return dVar;
    }

    private com.umeng.commonsdk.statistics.proto.d e(com.umeng.commonsdk.statistics.proto.d dVar) {
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        UMImprintPreProcessCallback uMImprintPreProcessCallback;
        Map c2 = dVar.c();
        ArrayList arrayList3 = new ArrayList(c2.size() / 2);
        Iterator it = c2.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            if (!((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).d()) {
                arrayList3.add(entry.getKey());
            } else {
                String str = (String) entry.getKey();
                String str2 = ((com.umeng.commonsdk.statistics.proto.e) entry.getValue()).a;
                synchronized (p) {
                    z = !TextUtils.isEmpty(str) && o.containsKey(str) && (uMImprintPreProcessCallback = (UMImprintPreProcessCallback) o.get(str)) != null && uMImprintPreProcessCallback.onPreProcessImprintKey(str, str2);
                }
                if (z) {
                    arrayList3.add(str);
                }
                synchronized (g) {
                    if (!TextUtils.isEmpty(str) && f.containsKey(str) && (arrayList2 = (ArrayList) f.get(str)) != null) {
                        for (int i = 0; i < arrayList2.size(); i++) {
                            ((UMImprintChangeCallback) arrayList2.get(i)).onImprintValueChanged(str, str2);
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            synchronized (g) {
                if (!TextUtils.isEmpty(str3) && f.containsKey(str3) && (arrayList = (ArrayList) f.get(str3)) != null) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        ((UMImprintChangeCallback) arrayList.get(i2)).onImprintValueChanged(str3, null);
                    }
                }
            }
            c2.remove(str3);
        }
        return dVar;
    }

    public synchronized com.umeng.commonsdk.statistics.proto.d b() {
        return this.i;
    }

    public a c() {
        return this.h;
    }

    private void e() {
        byte[] bArr;
        File file = new File(k.getFilesDir(), c);
        synchronized (b) {
            if (file.exists()) {
                FileInputStream fileInputStream = null;
                byte[] bArr2 = null;
                FileInputStream fileInputStream2 = null;
                try {
                    FileInputStream openFileInput = k.openFileInput(c);
                    try {
                        bArr2 = HelperUtils.readStreamToByteArray(openFileInput);
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = openFileInput;
                        HelperUtils.safeClose(fileInputStream);
                        throw th;
                    }
                    bArr = bArr2;
                    fileInputStream2 = openFileInput;
                } catch (Exception unused2) {
                    bArr = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                HelperUtils.safeClose(fileInputStream2);
                if (bArr != null) {
                    try {
                        com.umeng.commonsdk.statistics.proto.d dVar = new com.umeng.commonsdk.statistics.proto.d();
                        new ay().a(dVar, bArr);
                        this.i = dVar;
                        this.h.a(dVar);
                        this.i = d(this.i);
                    } catch (Exception unused3) {
                    }
                }
            }
        }
    }

    private void a(File file) {
        if (this.i == null) {
            return;
        }
        try {
            synchronized (b) {
                byte[] a2 = new be().a(this.i);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(a2);
                    fileOutputStream.flush();
                } finally {
                    HelperUtils.safeClose(fileOutputStream);
                }
            }
        } catch (Exception unused) {
        }
    }

    public void d() {
        if (this.i == null || f77953l == null) {
            return;
        }
        File file = new File(k.getFilesDir(), c);
        if (!file.exists()) {
            try {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    UMCrashManager.reportCrash(k, e);
                }
            } catch (IOException unused) {
                file.createNewFile();
            }
        }
        f77953l.doFileOperateion(file, j, 1);
    }

    public class a {
        public Map a = new HashMap();

        private synchronized void b(com.umeng.commonsdk.statistics.proto.d dVar) {
            com.umeng.commonsdk.statistics.proto.e eVar;
            if (dVar != null) {
                if (dVar.e()) {
                    Map c = dVar.c();
                    for (String str : c.keySet()) {
                        if (!TextUtils.isEmpty(str) && (eVar = (com.umeng.commonsdk.statistics.proto.e) c.get(str)) != null) {
                            String b = eVar.b();
                            if (!TextUtils.isEmpty(b)) {
                                this.a.put(str, b);
                                String str2 = AnalyticsConstants.OS;
                            }
                        }
                    }
                }
            }
        }

        public a() {
        }

        public synchronized void a(String str) {
            Map map = this.a;
            if (map != null && map.size() > 0 && !TextUtils.isEmpty(str) && this.a.containsKey(str)) {
                this.a.remove(str);
            }
        }

        public a(com.umeng.commonsdk.statistics.proto.d dVar) {
            a(dVar);
        }

        public void a(com.umeng.commonsdk.statistics.proto.d dVar) {
            if (dVar == null) {
                return;
            }
            b(dVar);
        }

        public synchronized String a(String str, String str2) {
            if (!TextUtils.isEmpty(str) && this.a.size() > 0) {
                String str3 = (String) this.a.get(str);
                return !TextUtils.isEmpty(str3) ? str3 : str2;
            }
            return str2;
        }
    }
}

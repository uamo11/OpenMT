package l;

import android.text.TextUtils;
import android.util.Base64;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import bin.mt.plus.R;
import com.alipay.sdk.m.t.e;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.slider.BasicLabelFormatter;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* compiled from: V7AU */
/* renamed from: l.᩺ᩴۢ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23176 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f74471;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final long f74472;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final long f74473;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final long f74474;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final long f74477;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final long f74478;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final long f74479;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f74480;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final SecureRandom f74481 = new SecureRandom();

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final HashMap f74482;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C12761 f74483;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ScheduledFuture f74484;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final HashMap f74485;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f74486;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final HashMap f74487;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ScheduledExecutorService f74488;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f74489;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f74490;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23882 f74491;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f74492;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f74493;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f74476 = Pattern.compile("Android\\s+([0-9]+(?:\\.[0-9]+)*)", 2);

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74475 = Pattern.compile("Android\\s+[0-9]+(?:\\.[0-9]+)*;\\s*([^)]*)", 2);

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f74470 = Pattern.compile("(?:CPU(?: iPhone)? OS)\\s+([0-9_]+)", 2);

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f74469 = Pattern.compile("\"([^\"]+)\"\\s*;\\s*v=\"?([^\"]*)\"?");

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f74478 = timeUnit.toMillis(1L);
        f74474 = TimeUnit.SECONDS.toMillis(30L);
        f74471 = timeUnit.toMillis(30L);
        f74477 = TimeUnit.HOURS.toMillis(2L);
        long millis = timeUnit.toMillis(5L);
        f74479 = millis;
        f74473 = millis * 2;
        f74472 = timeUnit.toMillis(10L);
    }

    public C23176(C12761 c12761, String str) {
        Object obj = new Object();
        this.f74490 = obj;
        this.f74482 = new HashMap();
        this.f74487 = new HashMap();
        this.f74485 = new HashMap();
        this.f74486 = new HashMap();
        this.f74480 = new HashMap();
        this.f74489 = str == null ? "" : str;
        this.f74483 = c12761;
        this.f74491 = new C23882(C4925.m14335());
        synchronized (obj) {
            if (!m51386()) {
                m51381(System.currentTimeMillis());
                m51369();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044 A[Catch: all -> 0x0054, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000d, B:7:0x0010, B:9:0x0024, B:11:0x0028, B:15:0x0032, B:18:0x004b, B:19:0x0052, B:23:0x0044), top: B:3:0x0007 }] */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap m51394() {
        /*
            r10 = this;
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = r10.f74490
            monitor-enter(r0)
            boolean r3 = r10.m51386()     // Catch: java.lang.Throwable -> L54
            if (r3 != 0) goto L10
            r10.m51362(r1)     // Catch: java.lang.Throwable -> L54
        L10:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> L54
            r3.<init>()     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "authRequired"
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L54
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "pairingAvailable"
            boolean r5 = r10.m51386()     // Catch: java.lang.Throwable -> L54
            if (r5 != 0) goto L31
            java.lang.String r5 = r10.f74493     // Catch: java.lang.Throwable -> L54
            if (r5 == 0) goto L2f
            long r5 = r10.f74492     // Catch: java.lang.Throwable -> L54
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2f
            goto L31
        L2f:
            r5 = 0
            goto L32
        L31:
            r5 = 1
        L32:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L54
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L54
            java.lang.String r4 = "pairingExpiresInMs"
            boolean r5 = r10.m51386()     // Catch: java.lang.Throwable -> L54
            r6 = 0
            if (r5 == 0) goto L44
            goto L4b
        L44:
            long r8 = r10.f74492     // Catch: java.lang.Throwable -> L54
            long r8 = r8 - r1
            long r6 = java.lang.Math.max(r8, r6)     // Catch: java.lang.Throwable -> L54
        L4b:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L54
            r3.put(r4, r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            return r3
        L54:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L54
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23176.m51394():java.util.LinkedHashMap");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C10477 m51391(C15996 c15996, String str) {
        long currentTimeMillis = System.currentTimeMillis();
        String m51384 = m51384(c15996);
        synchronized (this.f74490) {
            try {
                C10477 m51361 = m51361(currentTimeMillis, m51384);
                if (m51361 != null) {
                    return m51361;
                }
                try {
                    C12593 m51385 = m51385(str);
                    if (TextUtils.isEmpty(m51385.f37981) || m51385.f37984 == null) {
                        m51377(currentTimeMillis, m51384);
                        return C10477.m26368(R.string.MT_Protector_res_0x7f120813, new Object[0]);
                    }
                    synchronized (this.f74490) {
                        try {
                            m51362(currentTimeMillis);
                            if (!m51372(currentTimeMillis, m51385.f37981)) {
                                m51382(currentTimeMillis, m51384);
                                return C10477.m26367();
                            }
                            try {
                                C6243 m51360 = m51360(m51385.f37984);
                                synchronized (this.f74490) {
                                    try {
                                        m51362(currentTimeMillis);
                                        if (!m51372(currentTimeMillis, m51385.f37981)) {
                                            m51382(currentTimeMillis, m51384);
                                            return C10477.m26367();
                                        }
                                        this.f74485.remove(m51384);
                                        m51364(m51360, m51357(c15996, m51385), m51385.f37983, currentTimeMillis, c15996);
                                        if (!m51386()) {
                                            m51381(currentTimeMillis);
                                            m51369();
                                        }
                                        return C10477.m26369(m51360.f19321);
                                    } finally {
                                    }
                                }
                            } catch (Exception unused) {
                                m51377(currentTimeMillis, m51384);
                                return C10477.m26368(R.string.MT_Protector_res_0x7f120814, new Object[0]);
                            }
                        } finally {
                        }
                    }
                } catch (C23344 unused2) {
                    m51377(currentTimeMillis, m51384);
                    return C10477.m26368(R.string.MT_Protector_res_0x7f120813, new Object[0]);
                }
            } finally {
            }
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C10477 m51403(C15996 c15996) {
        C10477 m51361;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            m51361 = m51361(currentTimeMillis, m51384(c15996));
        }
        return m51361;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m51401(C15996 c15996) {
        m51377(System.currentTimeMillis(), m51384(c15996));
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C21766 m51399(C15996 c15996) {
        boolean equals;
        String m40234 = C17140.m40234(c15996, "ticket");
        if (!TextUtils.isEmpty(m40234)) {
            if (!EnumC4003.GET.equals(c15996.m37807()) && !EnumC4003.HEAD.equals(c15996.m37807())) {
                return C21766.m49091(EnumC1180.METHOD_NOT_ALLOWED, R.string.MT_Protector_res_0x7f120824, new Object[0]);
            }
            if (C17140.m40233(c15996)) {
                return C21766.m49091(EnumC1180.BAD_REQUEST, R.string.MT_Protector_res_0x7f12082d, new Object[0]);
            }
            long currentTimeMillis = System.currentTimeMillis();
            String m402342 = C17140.m40234(c15996, MotionUtils.EASING_TYPE_PATH);
            String m402343 = C17140.m40234(c15996, "disposition");
            synchronized (this.f74490) {
                m51376(currentTimeMillis);
                C5378.removeIf(this.f74486.entrySet(), new C16120(currentTimeMillis));
                C4832 c4832 = (C4832) this.f74486.get(m40234);
                if (c4832 != null && c4832.f15267 > currentTimeMillis) {
                    String str = c4832.f15268;
                    boolean z = true;
                    if (str == null) {
                        equals = m402342 == null;
                    } else {
                        equals = str.equals(m402342);
                    }
                    if (equals) {
                        String str2 = c4832.f15266;
                        if (str2 != null) {
                            z = str2.equals(m402343);
                        } else if (m402343 != null) {
                            z = false;
                        }
                        if (z) {
                            C14709 m51380 = m51380(c4832.f15265);
                            if (m51380 != null) {
                                if (!m51380.f44924) {
                                    m51363(c4832.f15265, currentTimeMillis, c15996, false);
                                }
                                return C21766.m49092(new C15414(c4832.f15265, null, null));
                            }
                            return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector_res_0x7f12080d, new Object[0]);
                        }
                    }
                    return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector_res_0x7f12080d, new Object[0]);
                }
                return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector_res_0x7f12080d, new Object[0]);
            }
        }
        return m51392(c15996);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C21766 m51395(C15996 c15996) {
        String m40234 = C17140.m40234(c15996, "ticket");
        if (!EnumC4003.GET.equals(c15996.m37807())) {
            return C21766.m49091(EnumC1180.METHOD_NOT_ALLOWED, R.string.MT_Protector_res_0x7f120824, new Object[0]);
        }
        if (C17140.m40233(c15996)) {
            return C21766.m49091(EnumC1180.BAD_REQUEST, R.string.MT_Protector_res_0x7f12082d, new Object[0]);
        }
        if (TextUtils.isEmpty(m40234)) {
            return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector_res_0x7f12080b, new Object[0]);
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            m51376(currentTimeMillis);
            C5378.removeIf(this.f74480.entrySet(), new C19650(currentTimeMillis));
            C8360 c8360 = (C8360) this.f74480.get(m40234);
            if (c8360 == null) {
                return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector_res_0x7f12080b, new Object[0]);
            }
            if (c8360.f25666 <= currentTimeMillis) {
                return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector_res_0x7f12080b, new Object[0]);
            }
            C14709 m51380 = m51380(c8360.f25665);
            if (m51380 == null) {
                return C21766.m49091(EnumC1180.UNAUTHORIZED, R.string.MT_Protector_res_0x7f12080b, new Object[0]);
            }
            if (!m51380.f44924) {
                m51363(c8360.f25665, currentTimeMillis, c15996, false);
            }
            return C21766.m49092(new C15414(c8360.f25665, m40234, c8360.f25664));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m51388(C15414 c15414) {
        C14709 m51380;
        if (c15414 == null) {
            m51380 = null;
        } else {
            String str = c15414.f47212;
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this.f74490) {
                m51376(currentTimeMillis);
                m51380 = m51380(str);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("authenticated", Boolean.valueOf(m51380 != null));
        if (m51380 != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("deviceId", m51380.f44917);
            linkedHashMap2.put("deviceName", m51380.f44919);
            linkedHashMap2.put("firstAccessAt", Long.valueOf(m51380.f44921));
            linkedHashMap2.put("lastAccessAt", Long.valueOf(m51380.f44923));
            linkedHashMap2.put("lastIp", m51380.f44922);
            linkedHashMap2.put("userAgent", m51380.f44918);
            linkedHashMap2.put("temporary", Boolean.valueOf(m51380.f44924));
            linkedHashMap.put(e.p, linkedHashMap2);
        }
        return linkedHashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList m51387() {
        ArrayList arrayList;
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            m51376(currentTimeMillis);
            arrayList = new ArrayList();
            Iterator it = this.f74491.m52620().iterator();
            while (it.hasNext()) {
                arrayList.add(C23882.m52617((C14709) it.next()));
            }
            Iterator it2 = this.f74482.values().iterator();
            while (it2.hasNext()) {
                arrayList.add(C23882.m52617((C14709) it2.next()));
            }
            C23882.m52619(arrayList);
        }
        return arrayList;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51397(C15414 c15414, String str) {
        boolean removeIf;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            m51376(currentTimeMillis);
            C23882 c23882 = this.f74491;
            ArrayList m52620 = c23882.m52620();
            removeIf = C5378.removeIf(m52620, new C0598(str));
            if (removeIf) {
                c23882.m52621(m52620);
            }
            if (c15414 != null && str.equals(c15414.f47212)) {
                removeIf = this.f74482.remove(str) != null || removeIf;
            }
            if (removeIf) {
                m51378(str);
            }
        }
        return removeIf;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m51393(String str) {
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            m51376(currentTimeMillis);
            C23882 c23882 = this.f74491;
            ArrayList m52620 = c23882.m52620();
            boolean removeIf = C5378.removeIf(m52620, new C0598(str));
            if (removeIf) {
                c23882.m52621(m52620);
            }
            z = this.f74482.remove(str) != null || removeIf;
            if (z) {
                m51378(str);
            }
        }
        return z;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static C12593 m51385(String str) {
        String str2;
        String str3;
        String str4;
        JSONObject m17734 = C6411.m17734(str);
        C12593 c12593 = new C12593();
        c12593.f37981 = C6411.m17742(m17734, "code");
        c12593.f37982 = C6411.m17742(m17734, "deviceName");
        C20355 c20355 = null;
        Boolean bool = null;
        c20355 = null;
        try {
            JSONObject jSONObject = m17734.getJSONObject("clientHints");
            if (jSONObject != null) {
                C20355 c203552 = new C20355();
                List list = Collections.EMPTY_LIST;
                c203552.f65721 = list;
                c203552.f65722 = list;
                try {
                    str2 = m51367(jSONObject.getString("platform"));
                } catch (RuntimeException unused) {
                    str2 = null;
                }
                c203552.f65725 = str2;
                try {
                    str3 = m51367(jSONObject.getString("platformVersion"));
                } catch (RuntimeException unused2) {
                    str3 = null;
                }
                c203552.f65723 = str3;
                try {
                    str4 = m51367(jSONObject.getString("model"));
                } catch (RuntimeException unused3) {
                    str4 = null;
                }
                c203552.f65726 = str4;
                try {
                    bool = jSONObject.getBooleanObject("mobile");
                } catch (RuntimeException unused4) {
                }
                c203552.f65724 = bool;
                c203552.f65721 = m51359(jSONObject, "brands");
                c203552.f65722 = m51359(jSONObject, "fullVersionList");
                c20355 = c203552;
            }
        } catch (RuntimeException unused5) {
        }
        c12593.f37980 = c20355;
        try {
            c12593.f37984 = m17734.getJSONObject("publicKey");
            c12593.f37983 = C6411.m17740(m17734, "trust");
            return c12593;
        } catch (RuntimeException e) {
            throw C6411.m17739(e);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m51389(C15414 c15414, String str) {
        C3421 c3421;
        try {
            JSONObject m17734 = C6411.m17734(str);
            c3421 = new C3421();
            c3421.f10800 = C6411.m17742(m17734, MotionUtils.EASING_TYPE_PATH);
            c3421.f10799 = C6411.m17742(m17734, "disposition");
        } catch (C23344 unused) {
            c3421 = null;
        }
        if (c3421 == null || TextUtils.isEmpty(c3421.f10800) || !("inline".equals(c3421.f10799) || "attachment".equals(c3421.f10799))) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[32];
        this.f74481.nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 11);
        C4832 c4832 = new C4832(0);
        c4832.f15265 = c15414.f47212;
        c4832.f15268 = c3421.f10800;
        c4832.f15266 = c3421.f10799;
        c4832.f15267 = f74472 + currentTimeMillis;
        synchronized (this.f74490) {
            C5378.removeIf(this.f74486.entrySet(), new C16120(currentTimeMillis));
            this.f74486.put(encodeToString, c4832);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ticket", encodeToString);
        linkedHashMap.put("expiresAt", Long.valueOf(c4832.f15267));
        return linkedHashMap;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedHashMap m51390(C15414 c15414, C1304 c1304) {
        if (c15414 == null) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        byte[] bArr = new byte[32];
        this.f74481.nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 11);
        C8360 c8360 = new C8360(0);
        c8360.f25665 = c15414.f47212;
        c8360.f25664 = c1304;
        c8360.f25666 = f74472 + currentTimeMillis;
        synchronized (this.f74490) {
            C5378.removeIf(this.f74480.entrySet(), new C19650(currentTimeMillis));
            this.f74480.put(encodeToString, c8360);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ticket", encodeToString);
        linkedHashMap.put("expiresAt", Long.valueOf(c8360.f25666));
        return linkedHashMap;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m51400() {
        synchronized (this.f74490) {
            ScheduledFuture scheduledFuture = this.f74484;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.f74484 = null;
            }
            ScheduledExecutorService scheduledExecutorService = this.f74488;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.f74488 = null;
            }
            this.f74486.clear();
            this.f74480.clear();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m51398() {
        synchronized (this.f74490) {
            if (m51386()) {
                return null;
            }
            m51362(System.currentTimeMillis());
            return this.f74493;
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m51402() {
        synchronized (this.f74490) {
            if (m51386()) {
                return 0L;
            }
            m51362(System.currentTimeMillis());
            return this.f74492;
        }
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m51373() {
        return f74478;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a8, code lost:
    
        m51363(r9, r5, r15, true);
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.C21766 m51392(l.C15996 r15) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23176.m51392(l.ܺܳܳ):l.᩸ᩴۢ");
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m51396(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this.f74490) {
            m51376(currentTimeMillis);
            C5378.removeIf(this.f74480.entrySet(), new C19650(currentTimeMillis));
            C8360 c8360 = (C8360) this.f74480.get(str);
            if (c8360 == null) {
                return false;
            }
            if (c8360.f25666 <= currentTimeMillis) {
                return false;
            }
            return m51380(c8360.f25665) != null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x016b, code lost:
    
        if ("/api/file-upload-complete".equals(r0) == false) goto L56;
     */
    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m51383(l.C15996 r9) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23176.m51383(l.ܺܳܳ):java.lang.String");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static long m51374(C15996 c15996) {
        if (!C17140.m40237(c15996)) {
            return 0L;
        }
        if (C17140.m40235(c15996)) {
            throw new C11888(EnumC1180.BAD_REQUEST, R.string.MT_Protector_res_0x7f120830, new Object[0]);
        }
        String m40231 = C17140.m40231(c15996, "content-length");
        if (TextUtils.isEmpty(m40231)) {
            return -1L;
        }
        String trim = m40231.trim();
        if (TextUtils.isEmpty(trim)) {
            throw new C11888(EnumC1180.BAD_REQUEST, R.string.MT_Protector_res_0x7f12081e, new Object[0]);
        }
        for (int i = 0; i < trim.length(); i++) {
            char charAt = trim.charAt(i);
            if (charAt < '0' || charAt > '9') {
                throw new C11888(EnumC1180.BAD_REQUEST, R.string.MT_Protector_res_0x7f12081e, new Object[0]);
            }
        }
        try {
            return Long.parseLong(trim);
        } catch (NumberFormatException unused) {
            throw new C11888(EnumC1180.BAD_REQUEST, R.string.MT_Protector_res_0x7f12081e, new Object[0]);
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6243 m51360(JSONObject jSONObject) {
        String m51370 = m51370(jSONObject, "kty");
        String m513702 = m51370(jSONObject, "crv");
        String m513703 = m51370(jSONObject, "x");
        String m513704 = m51370(jSONObject, "y");
        if (!"EC".equals(m51370) || !"P-256".equals(m513702) || m513703.contains("=") || m513704.contains("=")) {
            throw new IllegalArgumentException("unsupported key");
        }
        byte[] decode = Base64.decode(m513703, 11);
        byte[] decode2 = Base64.decode(m513704, 11);
        if (decode.length != 32 || decode2.length != 32) {
            throw new IllegalArgumentException("invalid coordinate length");
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance("EC");
        algorithmParameters.init(new ECGenParameterSpec("secp256r1"));
        PublicKey generatePublic = KeyFactory.getInstance("EC").generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, decode), new BigInteger(1, decode2)), (ECParameterSpec) algorithmParameters.getParameterSpec(ECParameterSpec.class)));
        if (!(generatePublic instanceof ECPublicKey)) {
            throw new IllegalArgumentException("invalid key");
        }
        StringBuilder m10501 = C3435.m10501("{\"crv\":\"", m513702, "\",\"kty\":\"", m51370, "\",\"x\":\"");
        m10501.append(m513703);
        m10501.append("\",\"y\":\"");
        m10501.append(m513704);
        m10501.append("\"}");
        String sb = m10501.toString();
        return new C6243(sb, m51358(sb.getBytes(StandardCharsets.UTF_8)), (ECPublicKey) generatePublic);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m51370(JSONObject jSONObject, String str) {
        String m17742 = jSONObject == null ? null : C6411.m17742(jSONObject, str);
        if (TextUtils.isEmpty(m17742)) {
            throw new IllegalArgumentException("missing ".concat(str));
        }
        return m17742;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        if (r9 <= 0) goto L17;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m51364(final l.C6243 r9, java.lang.String r10, boolean r11, long r12, l.C15996 r14) {
        /*
            r8 = this;
            java.lang.String r0 = r9.f19321
            l.᩻ᩴۢ r1 = r8.f74491
            java.util.ArrayList r2 = r1.m52620()
            java.util.Iterator r3 = r2.iterator()
        Lc:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L21
            java.lang.Object r4 = r3.next()
            l.ܳᩴۢ r4 = (l.C14709) r4
            java.lang.String r5 = r4.f44917
            boolean r5 = r0.equals(r5)
            if (r5 == 0) goto Lc
            goto L22
        L21:
            r4 = 0
        L22:
            l.ۡᩴۢ r3 = new l.ۡᩴۢ
            r3.<init>()
            l.C5378.removeIf(r2, r3)
            java.util.HashMap r3 = r8.f74482
            r3.remove(r0)
            if (r4 != 0) goto L37
            l.ܳᩴۢ r5 = new l.ܳᩴۢ
            r5.<init>()
            goto L38
        L37:
            r5 = r4
        L38:
            r5.f44917 = r0
            r5.f44919 = r10
            java.lang.String r9 = r9.f19320
            r5.f44920 = r9
            if (r4 == 0) goto L4a
            long r9 = r4.f44921
            r6 = 0
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 > 0) goto L4b
        L4a:
            r9 = r12
        L4b:
            r5.f44921 = r9
            r5.f44923 = r12
            java.lang.String r9 = m51384(r14)
            r5.f44922 = r9
            java.lang.String r9 = m51368(r14)
            r5.f44918 = r9
            r9 = r11 ^ 1
            r5.f44924 = r9
            if (r11 == 0) goto L81
            r2.add(r5)
            l.ۚᩴۢ r9 = new l.ۚᩴۢ
            r9.<init>()
            java.util.Comparator r9 = l.C8200.comparingLong(r9)
            l.C6083.sort(r2, r9)
        L70:
            int r9 = r2.size()
            r10 = 32
            if (r9 <= r10) goto L7d
            r9 = 0
            r2.remove(r9)
            goto L70
        L7d:
            r1.m52621(r2)
            return
        L81:
            java.lang.String r9 = r5.f44917
            r3.put(r9, r5)
            r1.m52621(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23176.m51364(l.ۛᩴۢ, java.lang.String, boolean, long, l.ܺܳܳ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51363(String str, long j, C15996 c15996, boolean z) {
        C14709 c14709 = (C14709) this.f74482.get(str);
        if (c14709 != null && z) {
            c14709.f44923 = j;
            c14709.f44922 = m51384(c15996);
            c14709.f44918 = m51368(c15996);
            return;
        }
        C23882 c23882 = this.f74491;
        ArrayList m52620 = c23882.m52620();
        Iterator it = m52620.iterator();
        while (it.hasNext()) {
            C14709 c147092 = (C14709) it.next();
            if (str.equals(c147092.f44917)) {
                c147092.f44923 = j;
                c147092.f44922 = m51384(c15996);
                c147092.f44918 = m51368(c15996);
                c23882.m52621(m52620);
                return;
            }
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51378(final String str) {
        this.f74487.remove(str);
        C5378.removeIf(this.f74486.entrySet(), new Predicate() { // from class: l.ۘᩴۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C4832) ((Map.Entry) obj).getValue()).f15265);
            }
        });
        C5378.removeIf(this.f74480.entrySet(), new Predicate() { // from class: l.ᩴᩴۢ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return str.equals(((C8360) ((Map.Entry) obj).getValue()).f25665);
            }
        });
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private C14709 m51380(String str) {
        Iterator it = this.f74491.m52620().iterator();
        while (it.hasNext()) {
            C14709 c14709 = (C14709) it.next();
            if (str.equals(c14709.f44917)) {
                return c14709;
            }
        }
        return (C14709) this.f74482.get(str);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51376(long j) {
        Iterator it = this.f74482.entrySet().iterator();
        while (it.hasNext()) {
            C14709 c14709 = (C14709) ((Map.Entry) it.next()).getValue();
            if (j - c14709.f44923 > f74471 || j - c14709.f44921 > f74477) {
                it.remove();
            }
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m51371(final long j) {
        Iterator it = this.f74487.entrySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) ((Map.Entry) it.next()).getValue();
            C5378.removeIf(map.entrySet(), new Predicate() { // from class: l.ۖᩴۢ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19285.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public /* synthetic */ Predicate mo4928negate() {
                    return C19285.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19285.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return C23176.m51366(j, (Map.Entry) obj);
                }
            });
            if (map.isEmpty()) {
                it.remove();
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m51366(long j, Map.Entry entry) {
        return j - ((Long) entry.getValue()).longValue() > f74473;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m51362(long j) {
        if (m51386()) {
            return;
        }
        if (this.f74493 == null || j >= this.f74492) {
            m51381(j);
            m51369();
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m51372(long j, String str) {
        if (m51386()) {
            return this.f74489.equals(str);
        }
        String str2 = this.f74493;
        return str2 != null && j < this.f74492 && str2.equals(str);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private boolean m51386() {
        return !TextUtils.isEmpty(this.f74489);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m51381(long j) {
        String format = String.format(Locale.ROOT, "%06d", Integer.valueOf(this.f74481.nextInt(BasicLabelFormatter.MILLION)));
        this.f74493 = format;
        long j2 = j + f74478;
        this.f74492 = j2;
        C12761 c12761 = this.f74483;
        if (c12761 != null) {
            C22639 c22639 = (C22639) c12761.f38355;
            ServiceC1618 serviceC1618 = (ServiceC1618) ((C7385) c12761.f38356).f22731;
            int i = ServiceC1618.f5686;
            C4925.m14315(new RunnableC7117(serviceC1618, c22639, format, j2));
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m51369() {
        if (this.f74488 == null) {
            this.f74488 = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC21061());
        }
        ScheduledFuture scheduledFuture = this.f74484;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f74484 = this.f74488.schedule(new Runnable() { // from class: l.ۢᩴۢ
            @Override // java.lang.Runnable
            public final void run() {
                C23176.m51365(C23176.this);
            }
        }, Math.max(this.f74492 - System.currentTimeMillis(), 1L), TimeUnit.MILLISECONDS);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51365(C23176 c23176) {
        synchronized (c23176.f74490) {
            c23176.m51381(System.currentTimeMillis());
            c23176.m51369();
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m51377(long j, String str) {
        synchronized (this.f74490) {
            m51382(j, str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (r9 >= r3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m51382(long r9, java.lang.String r11) {
        /*
            r8 = this;
            java.util.HashMap r0 = r8.f74485
            java.lang.Object r1 = r0.get(r11)
            l.۬ᩴۢ r1 = (l.C13298) r1
            r2 = 0
            if (r1 == 0) goto L17
            long r3 = r1.f39809
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L1f
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 < 0) goto L1f
        L17:
            l.۬ᩴۢ r1 = new l.۬ᩴۢ
            r1.<init>(r2)
            r0.put(r11, r1)
        L1f:
            int r11 = r1.f39810
            int r11 = r11 + 1
            r1.f39810 = r11
            r0 = 5
            if (r11 < r0) goto L2f
            long r3 = l.C23176.f74474
            long r9 = r9 + r3
            r1.f39809 = r9
            r1.f39810 = r2
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23176.m51382(long, java.lang.String):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C10477 m51361(long j, String str) {
        C13298 c13298 = (C13298) this.f74485.get(str);
        if (c13298 == null || c13298.f39809 <= j) {
            return null;
        }
        m51382(j, str);
        return C10477.m26368(R.string.MT_Protector_res_0x7f120812, new Object[0]);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m51384(C15996 c15996) {
        String m37805 = c15996.m37805();
        return TextUtils.isEmpty(m37805) ? "" : m37805;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m51368(C15996 c15996) {
        String m40231 = C17140.m40231(c15996, "user-agent");
        if (m40231 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Math.min(m40231.length(), 1024));
        for (int i = 0; i < m40231.length(); i++) {
            char charAt = m40231.charAt(i);
            if (!Character.isISOControl(charAt)) {
                sb.append(charAt);
            }
        }
        String trim = sb.toString().trim();
        return trim.length() > 1024 ? trim.substring(0, 1024) : trim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x04b5, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x02c4, code lost:
    
        if (r2.contains("Linux") != false) goto L201;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x01bf  */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m51357(l.C15996 r23, l.C12593 r24) {
        /*
            Method dump skipped, instructions count: 1515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23176.m51357(l.ܺܳܳ, l.۫ᩴۢ):java.lang.String");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m51359(JSONObject jSONObject, String str) {
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            int min = Math.min(jSONArray.size(), 8);
            for (int i = 0; i < min; i++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    String m51367 = m51367(jSONObject2.getString("brand"));
                    if (!TextUtils.isEmpty(m51367)) {
                        m51367(jSONObject2.getString("version"));
                        arrayList.add(new C22471(m51367));
                    }
                } catch (RuntimeException unused) {
                }
            }
            return arrayList;
        } catch (RuntimeException unused2) {
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d1, code lost:
    
        if (r2.contains("brand") != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d7, code lost:
    
        if (r2.contains("chromium") != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[LOOP:0: B:6:0x000f->B:24:?, LOOP_END, SYNTHETIC] */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m51355(java.util.List r7) {
        /*
            r0 = 0
            if (r7 == 0) goto Le1
            boolean r1 = r7.isEmpty()
            if (r1 == 0) goto Lb
            goto Le1
        Lb:
            java.util.Iterator r1 = r7.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            java.lang.String r3 = "chromium"
            java.lang.String r4 = "brand"
            java.lang.String r5 = "not"
            if (r2 == 0) goto La4
            java.lang.Object r2 = r1.next()
            l.᩹ᩴۢ r2 = (l.C22471) r2
            java.lang.String r2 = r2.f72775
            java.lang.String r2 = m51367(r2)
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L2f
            goto L96
        L2f:
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r6)
            boolean r5 = r2.contains(r5)
            if (r5 == 0) goto L41
            boolean r4 = r2.contains(r4)
            if (r4 != 0) goto L96
        L41:
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L48
            goto L96
        L48:
            java.lang.String r3 = "samsung internet"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L53
            java.lang.String r2 = "Samsung Internet"
            goto L9d
        L53:
            java.lang.String r3 = "microsoft edge"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L9b
            java.lang.String r3 = "edge"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L64
            goto L9b
        L64:
            java.lang.String r3 = "google chrome"
            boolean r3 = r2.contains(r3)
            if (r3 != 0) goto L98
            java.lang.String r3 = "chrome"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L75
            goto L98
        L75:
            java.lang.String r3 = "opera"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L80
            java.lang.String r2 = "Opera"
            goto L9d
        L80:
            java.lang.String r3 = "firefox"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L8b
            java.lang.String r2 = "Firefox"
            goto L9d
        L8b:
            java.lang.String r3 = "safari"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L96
            java.lang.String r2 = "Safari"
            goto L9d
        L96:
            r2 = r0
            goto L9d
        L98:
            java.lang.String r2 = "Chrome"
            goto L9d
        L9b:
            java.lang.String r2 = "Edge"
        L9d:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Lf
            return r2
        La4:
            java.util.Iterator r7 = r7.iterator()
        La8:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Le1
            java.lang.Object r1 = r7.next()
            l.᩹ᩴۢ r1 = (l.C22471) r1
            java.lang.String r1 = r1.f72775
            java.lang.String r1 = m51367(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto Lc1
            goto Ld9
        Lc1:
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r2 = r1.toLowerCase(r2)
            boolean r6 = r2.contains(r5)
            if (r6 == 0) goto Ld3
            boolean r6 = r2.contains(r4)
            if (r6 != 0) goto Ld9
        Ld3:
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto Lda
        Ld9:
            r1 = r0
        Lda:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto La8
            return r1
        Le1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C23176.m51355(java.util.List):java.lang.String");
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static String m51367(String str) {
        if (str == null) {
            return "";
        }
        int min = Math.min(str.length(), 128);
        StringBuilder sb = new StringBuilder(min);
        boolean z = false;
        for (int i = 0; i < min; i++) {
            char charAt = str.charAt(i);
            if (!Character.isISOControl(charAt)) {
                if (Character.isWhitespace(charAt)) {
                    z = sb.length() > 0;
                } else {
                    if (z) {
                        sb.append(' ');
                        z = false;
                    }
                    sb.append(charAt);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static String m51375(String str) {
        String replace = m51367(str).replace('_', '.');
        while (replace.endsWith(".0")) {
            int i = 0;
            for (int i2 = 0; i2 < replace.length(); i2++) {
                if (replace.charAt(i2) == '.') {
                    i++;
                }
            }
            if (i <= 0) {
                break;
            }
            replace = C15472.m36561(2, 0, replace);
        }
        return replace;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51354(String str, String str2) {
        String m51375 = m51375(str2);
        return TextUtils.isEmpty(m51375) ? str : C22870.m50967(str, " ", m51375);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51356(Pattern pattern, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1) : "";
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m51379(String str) {
        String m51367 = m51367(str);
        return TextUtils.isEmpty(m51367) ? "Unknown browser" : m51367.length() > 64 ? m51367.substring(0, 64) : m51367;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51358(byte[] bArr) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance(XMSSKeyParameters.SHA_256).digest(bArr), 11);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}

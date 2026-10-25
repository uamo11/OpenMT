package com.amazonaws.metrics;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.PropertiesCredentials;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.MetricCollector;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSServiceMetrics;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import l.C20195;

/* loaded from: classes.dex */
public enum AwsSdkMetrics {
    ;


    /* renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static volatile boolean f237 = false;

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final String f238 = "getQueuePollTimeoutMilli";

    /* renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static volatile Integer f239 = null;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String f240 = "com.amazonaws.metrics.internal.cloudwatch.DefaultMetricCollectorFactory";

    /* renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static volatile boolean f241 = false;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean f242;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final String f243 = "includePerHostMetrics";

    /* renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static volatile String f244 = null;

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String f245 = "metricQueueSize";

    /* renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static volatile MetricCollector f246 = null;

    /* renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static volatile boolean f247 = false;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String f248 = "hostMetricName";

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final int f249 = 1000;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String f250 = "jvmMetricName";

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final String f251 = "excludeMachineMetrics";

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String f252 = "AWSSDK/Java";

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String f253 = "metricNameSpace";

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static volatile AWSCredentialsProvider f254 = null;

    /* renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static volatile String f255 = "AWSSDK/Java";

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final MetricRegistry f256;

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static volatile String f257 = null;

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final String f258 = "useSingleMetricNamespace";

    /* renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static volatile Long f259 = null;

    /* renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static volatile Regions f260 = null;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String f261 = "cloudwatchRegion";

    /* renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static volatile String f262 = null;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String f264 = "credentialFile";

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final String f265 = "com.amazonaws.management:type=AwsSdkMetrics";

    /* renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static boolean f266;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m317() {
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m307(AWSCredentialsProvider aWSCredentialsProvider) {
        synchronized (AwsSdkMetrics.class) {
            f254 = aWSCredentialsProvider;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static synchronized void m308(MetricCollector metricCollector) {
        synchronized (AwsSdkMetrics.class) {
            f246 = metricCollector;
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m325() {
        synchronized (AwsSdkMetrics.class) {
            if (f246 != null) {
                f246.getClass();
            }
            if (f266) {
                throw new IllegalStateException("Reentrancy is not allowed");
            }
            f266 = true;
            try {
                try {
                    MetricCollector factory = ((MetricCollector.Factory) Class.forName(f240).newInstance()).getInstance();
                    if (factory != null) {
                        m308(factory);
                        return true;
                    }
                } catch (Exception e) {
                    LogFactory.m302(AwsSdkMetrics.class).mo298("Failed to enable the default metrics", e);
                }
                return false;
            } finally {
                f266 = false;
            }
        }
    }

    static {
        String property = System.getProperty("com.amazonaws.sdk.enableDefaultMetrics");
        boolean z = property != null;
        f242 = z;
        if (z) {
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (String str : property.split(",")) {
                String trim = str.trim();
                if (!z2 && f251.equals(trim)) {
                    z2 = true;
                } else if (!z3 && f243.equals(trim)) {
                    z3 = true;
                } else if (z4 || !f258.equals(trim)) {
                    String[] split = trim.split("=");
                    if (split.length == 2) {
                        String trim2 = split[0].trim();
                        String trim3 = split[1].trim();
                        try {
                            if (f264.equals(trim2)) {
                                m322(trim3);
                            } else if (f261.equals(trim2)) {
                                f260 = Regions.m426(trim3);
                            } else if (f245.equals(trim2)) {
                                Integer num = new Integer(trim3);
                                if (num.intValue() < 1) {
                                    throw new IllegalArgumentException("metricQueueSize must be at least 1");
                                }
                                f239 = num;
                            } else if (f238.equals(trim2)) {
                                Long l2 = new Long(trim3);
                                if (l2.intValue() < 1000) {
                                    throw new IllegalArgumentException("getQueuePollTimeoutMilli must be at least 1000");
                                }
                                f259 = l2;
                            } else if (f253.equals(trim2)) {
                                f255 = trim3;
                            } else if (f250.equals(trim2)) {
                                f262 = trim3;
                            } else if (f248.equals(trim2)) {
                                f244 = trim3;
                            } else {
                                LogFactory.m302(AwsSdkMetrics.class).mo294("Ignoring unrecognized parameter: " + trim);
                            }
                        } catch (Exception e) {
                            LogFactory.m302(AwsSdkMetrics.class).mo292("Ignoring failure", e);
                        }
                    } else {
                        continue;
                    }
                } else {
                    z4 = true;
                }
            }
            f247 = z2;
            f241 = z3;
            f237 = z4;
        }
        f256 = new MetricRegistry();
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static RequestMetricCollector m329() {
        if (f246 == null && m340()) {
            m325();
        }
        if (f246 == null) {
            return RequestMetricCollector.f275;
        }
        ((MetricCollector.AnonymousClass1) f246).getClass();
        return RequestMetricCollector.f275;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ServiceMetricCollector m339() {
        if (f246 == null && m340()) {
            m325();
        }
        if (f246 == null) {
            return ServiceMetricCollector.f276;
        }
        ((MetricCollector.AnonymousClass1) f246).getClass();
        return ServiceMetricCollector.f276;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static MetricCollector m321() {
        return f246;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static MetricCollector m330() {
        if (f246 == null && m340()) {
            m325();
        }
        return f246 == null ? MetricCollector.f273 : f246;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m313(boolean z) {
        f247 = z;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m324(boolean z) {
        f241 = z;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m340() {
        return f242;
    }

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m327() {
        return f237;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m332(boolean z) {
        f237 = z;
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static boolean m337() {
        return f247;
    }

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m328() {
        return f241;
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static boolean m316() {
        if (f241) {
            return true;
        }
        String str = f244;
        return (str == null ? "" : str.trim()).length() > 0;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m306() {
        m308(MetricCollector.f273);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m314(MetricType metricType) {
        if (metricType == null) {
            return false;
        }
        return f256.m344(metricType);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m315(Collection collection) {
        if (collection == null || collection.size() == 0) {
            return false;
        }
        return f256.m345(collection);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m323(Collection collection) {
        f256.m346(collection);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m326(MetricType metricType) {
        if (metricType == null) {
            return false;
        }
        return f256.m347(metricType);
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Set m318() {
        return f256.m343();
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static AWSCredentialsProvider m341() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            if (stackTraceElement.getClassName().equals(f240)) {
                return f254;
            }
        }
        SecurityException securityException = new SecurityException();
        LogFactory.m302(AwsSdkMetrics.class).mo298("Illegal attempt to access the credential provider", securityException);
        throw securityException;
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static Regions m319() {
        return f260;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m309(Regions regions) {
        f260 = regions;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String m333() {
        return f257;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m312(String str) {
        m322(str);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m322(String str) {
        final PropertiesCredentials propertiesCredentials = new PropertiesCredentials(new File(str));
        synchronized (AwsSdkMetrics.class) {
            f254 = new AWSCredentialsProvider() { // from class: com.amazonaws.metrics.AwsSdkMetrics.1
                @Override // com.amazonaws.auth.AWSCredentialsProvider
                /* renamed from: ֫ */
                public final AWSCredentials mo208() {
                    return PropertiesCredentials.this;
                }
            };
            f257 = str;
        }
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static Integer m304() {
        return f239;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m310(Integer num) {
        f239 = num;
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Long m305() {
        return f259;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m311(Long l2) {
        f259 = l2;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String m336() {
        return f255;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m334(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException();
        }
        f255 = str;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static String m320() {
        return f262;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m335(String str) {
        f262 = str;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m338() {
        return f244;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m331(String str) {
        f244 = str;
    }

    public class MetricRegistry {

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final HashSet f268;

        /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public volatile Set f269;

        public MetricRegistry() {
            HashSet hashSet = new HashSet();
            this.f268 = hashSet;
            hashSet.add(AWSRequestMetrics.Field.ClientExecuteTime);
            hashSet.add(AWSRequestMetrics.Field.Exception);
            hashSet.add(AWSRequestMetrics.Field.HttpClientRetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpRequestTime);
            hashSet.add(AWSRequestMetrics.Field.RequestCount);
            hashSet.add(AWSRequestMetrics.Field.RetryCount);
            hashSet.add(AWSRequestMetrics.Field.HttpClientSendRequestTime);
            hashSet.add(AWSRequestMetrics.Field.HttpClientReceiveResponseTime);
            hashSet.add(AWSServiceMetrics.HttpClientGetConnectionTime);
            m342();
        }

        /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
        private void m342() {
            this.f269 = C20195.unmodifiableSet(new HashSet(this.f268));
        }

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final boolean m344(MetricType metricType) {
            boolean add;
            synchronized (this.f268) {
                add = this.f268.add(metricType);
                if (add) {
                    m342();
                }
            }
            return add;
        }

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final boolean m345(Collection collection) {
            boolean addAll;
            synchronized (this.f268) {
                addAll = this.f268.addAll(collection);
                if (addAll) {
                    m342();
                }
            }
            return addAll;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0009, code lost:
        
            if (r3.size() == 0) goto L7;
         */
        /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m346(java.util.Collection r3) {
            /*
                r2 = this;
                java.util.HashSet r0 = r2.f268
                monitor-enter(r0)
                if (r3 == 0) goto Lb
                int r1 = r3.size()     // Catch: java.lang.Throwable -> L29
                if (r1 != 0) goto L19
            Lb:
                java.util.HashSet r1 = r2.f268     // Catch: java.lang.Throwable -> L29
                int r1 = r1.size()     // Catch: java.lang.Throwable -> L29
                if (r1 != 0) goto L15
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                return
            L15:
                if (r3 != 0) goto L19
                java.util.List r3 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L29
            L19:
                java.util.HashSet r1 = r2.f268     // Catch: java.lang.Throwable -> L29
                r1.clear()     // Catch: java.lang.Throwable -> L29
                boolean r3 = r2.m345(r3)     // Catch: java.lang.Throwable -> L29
                if (r3 != 0) goto L27
                r2.m342()     // Catch: java.lang.Throwable -> L29
            L27:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                return
            L29:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.metrics.AwsSdkMetrics.MetricRegistry.m346(java.util.Collection):void");
        }

        /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final boolean m347(MetricType metricType) {
            boolean remove;
            synchronized (this.f268) {
                remove = this.f268.remove(metricType);
                if (remove) {
                    m342();
                }
            }
            return remove;
        }

        /* renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final Set m343() {
            return this.f269;
        }
    }
}

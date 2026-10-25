package l;

/* compiled from: FAH1 */
/* renamed from: l.֡ۘ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C0155 extends AbstractC12815 implements Cloneable {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final C2828 f1317 = C2828.ofMillis(-1);

    /* renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final C2828 f1319 = C2828.ofMillis(1800000);

    /* renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final C2828 f1322 = C2828.ofMillis(1800000);

    /* renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    @Deprecated
    public static final C2828 f1323 = C2828.ofMillis(-1);

    /* renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final C2828 f1324 = C2828.ofMillis(-1);

    /* renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C2828 f1318 = C2828.ofMillis(10000);

    /* renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final C2828 f1321 = C2828.ofMillis(-1);

    /* renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String f1320 = C10740.class.getName();

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2828 f1330 = f1317;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C2828 f1328 = f1322;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C2828 f1332 = f1318;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C2828 f1327 = f1323;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f1334 = f1320;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f1329 = false;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f1335 = false;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C2828 f1333 = f1321;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1326 = true;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f1325 = 8;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f1331 = 8;

    public final Object clone() {
        try {
            return (C0155) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m1265() {
        return this.f1325;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m1262() {
        return this.f1331;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1259(int i) {
        this.f1325 = i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1271(int i) {
        this.f1331 = i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m1270() {
        return this.f1334;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C2828 m1273() {
        return this.f1332;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m1268() {
        return this.f1326;
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C2828 m1264() {
        return this.f1330;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C2828 m1274() {
        return this.f1328;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2828 m1257() {
        return this.f1327;
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m1269() {
        return this.f1329;
    }

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m1276() {
        return this.f1335;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2828 m1258() {
        return this.f1333;
    }

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final void m1275() {
        this.f1326 = false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m1261(C2828 c2828) {
        this.f1328 = C12856.m31292(c2828, f1322);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m1267(C2828 c2828) {
        this.f1327 = C12856.m31292(c2828, f1323);
    }

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final void m1263() {
        this.f1329 = true;
    }

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m1266() {
        this.f1335 = true;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m1272(C2828 c2828) {
        this.f1333 = C12856.m31292(c2828, f1321);
    }

    @Override // l.AbstractC12815
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo1260(StringBuilder sb) {
        sb.append("lifo=");
        sb.append(true);
        sb.append(", fairness=");
        sb.append(false);
        sb.append(", maxWaitDuration=");
        sb.append(this.f1330);
        sb.append(", minEvictableIdleTime=");
        sb.append(this.f1328);
        sb.append(", softMinEvictableIdleTime=");
        sb.append(this.f1327);
        sb.append(", numTestsPerEvictionRun=");
        sb.append(3);
        sb.append(", evictionPolicyClassName=");
        sb.append(this.f1334);
        sb.append(", testOnCreate=");
        sb.append(false);
        sb.append(", testOnBorrow=");
        sb.append(this.f1329);
        sb.append(", testOnReturn=");
        sb.append(false);
        sb.append(", testWhileIdle=");
        sb.append(this.f1335);
        sb.append(", timeBetweenEvictionRuns=");
        sb.append(this.f1333);
        sb.append(", blockWhenExhausted=");
        sb.append(true);
        sb.append(", jmxEnabled=");
        sb.append(this.f1326);
        sb.append(", jmxNamePrefix=");
        sb.append("pool");
        sb.append(", jmxNameBase=");
        sb.append((String) null);
        sb.append(", minIdlePerKey=");
        sb.append(0);
        sb.append(", maxIdlePerKey=");
        sb.append(this.f1325);
        sb.append(", maxTotalPerKey=");
        sb.append(this.f1331);
        sb.append(", maxTotal=");
        sb.append(-1);
    }
}

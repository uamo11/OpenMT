package l;

/* compiled from: 29YC */
/* renamed from: l.۬ۢ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13038 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f39041;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f39042;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final String f39043 = System.getProperty("net.mdns.ipv4", "224.0.0.251");

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String f39045 = System.getProperty("net.mdns.ipv6", "FF02::FB");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f39044 = Integer.getInteger("net.mdns.port", 5353).intValue();

    static {
        int intValue = Integer.getInteger("net.dns.ttl", 3600).intValue();
        f39042 = intValue;
        f39041 = intValue * 500;
    }
}

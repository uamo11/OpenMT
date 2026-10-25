package l;

/* compiled from: U7MS */
/* renamed from: l.᩹᩺֫, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C22590 implements Comparable {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f73012;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f73013;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f73014;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21885 f73015;

    /* renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f73016;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f73017;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f73018;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C19643 f73019;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f73020;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f73021;

    /* renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f73022;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l2 = (Long) obj;
        long longValue = l2.longValue();
        long j = this.f73016;
        if (j > longValue) {
            return 1;
        }
        return j < l2.longValue() ? -1 : 0;
    }

    public C22590(String str, C21885 c21885, long j, int i, long j2, C19643 c19643, String str2, String str3, long j3, long j4, boolean z) {
        this.f73022 = str;
        this.f73015 = c21885;
        this.f73013 = j;
        this.f73014 = i;
        this.f73016 = j2;
        this.f73019 = c19643;
        this.f73018 = str2;
        this.f73012 = str3;
        this.f73021 = j3;
        this.f73020 = j4;
        this.f73017 = z;
    }
}

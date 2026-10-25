package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.util.concurrent.TimeUnit;

/* compiled from: N673 */
/* renamed from: l.ۙ۠ᩴ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4529 implements Comparable {
    public final TimeUnit a;
    public final long b;
    public C4239 c;
    public String d;

    public static long n(long j, long j2, long j3) {
        if (j > j3) {
            return C13132.FOREVER_NS;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    public C4529(long j, TimeUnit timeUnit, C4239 c4239) {
        this.b = j;
        this.a = timeUnit;
        this.c = c4239;
    }

    public static C4529 from(long j, TimeUnit timeUnit) {
        C11003.requireNonNull(timeUnit, "unit");
        return new C4529(j, timeUnit, null);
    }

    public static C4529 fromMillis(long j) {
        return new C4529(j, TimeUnit.MILLISECONDS, null);
    }

    public static C4529 from(C4239 c4239) {
        C11003.requireNonNull(c4239, "instant");
        return new C4529(0L, null, c4239);
    }

    public long to(TimeUnit timeUnit) {
        C11003.requireNonNull(timeUnit, "unit");
        TimeUnit timeUnit2 = this.a;
        if (timeUnit2 != null) {
            return timeUnit.convert(this.b, timeUnit2);
        }
        long convert = timeUnit.convert(this.c.getEpochSecond(), TimeUnit.SECONDS);
        if (convert == Long.MIN_VALUE || convert == C13132.FOREVER_NS) {
            return convert;
        }
        long convert2 = timeUnit.convert(this.c.getNano(), TimeUnit.NANOSECONDS);
        long j = convert + convert2;
        if (((convert2 ^ j) & (convert ^ j)) >= 0) {
            return j;
        }
        if (convert < 0) {
            return Long.MIN_VALUE;
        }
        return C13132.FOREVER_NS;
    }

    public long toMillis() {
        TimeUnit timeUnit = this.a;
        if (timeUnit != null) {
            return timeUnit.toMillis(this.b);
        }
        long epochSecond = this.c.getEpochSecond();
        int nano = this.c.getNano();
        long j = epochSecond * 1000;
        if (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) {
            return j + (nano / BasicLabelFormatter.MILLION);
        }
        if (epochSecond < 0) {
            return Long.MIN_VALUE;
        }
        return C13132.FOREVER_NS;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l.C4239 toInstant() {
        /*
            r8 = this;
            l.ۘ᩹ᩴ r0 = r8.c
            if (r0 != 0) goto La3
            int[] r0 = l.AbstractC5440.a
            java.util.concurrent.TimeUnit r1 = r8.a
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L71;
                case 2: goto L63;
                case 3: goto L55;
                case 4: goto L52;
                case 5: goto L3d;
                case 6: goto L2a;
                case 7: goto L19;
                default: goto L11;
            }
        L11:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unit not handled"
            r0.<init>(r1)
            throw r0
        L19:
            long r0 = r8.b
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = l.AbstractC22791.z(r0, r2)
            long r4 = r8.b
            long r2 = l.AbstractC22791.O(r4, r2)
            int r3 = (int) r2
            goto L80
        L2a:
            long r0 = r8.b
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = l.AbstractC22791.z(r0, r2)
            long r4 = r8.b
            long r2 = l.AbstractC22791.O(r4, r2)
            int r3 = (int) r2
            int r3 = r3 * 1000
            goto L80
        L3d:
            long r0 = r8.b
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = l.AbstractC22791.z(r0, r2)
            long r4 = r8.b
            long r2 = l.AbstractC22791.O(r4, r2)
            int r3 = (int) r2
            r2 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 * r2
            goto L80
        L52:
            long r0 = r8.b
            goto L7f
        L55:
            long r2 = r8.b
            r4 = 60
            r6 = 153722867280912930(0x222222222222222, double:2.166167076120538E-298)
            long r0 = n(r2, r4, r6)
            goto L7f
        L63:
            long r2 = r8.b
            r4 = 3600(0xe10, double:1.7786E-320)
            r6 = 2562047788015215(0x91a2b3c4d5e6f, double:1.2658197950618743E-308)
            long r0 = n(r2, r4, r6)
            goto L7f
        L71:
            long r2 = r8.b
            r4 = 86400(0x15180, double:4.26873E-319)
            r6 = 106751991167300(0x611722833944, double:5.2742491460911E-310)
            long r0 = n(r2, r4, r6)
        L7f:
            r3 = 0
        L80:
            r4 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 > 0) goto L8e
            l.ۘ᩹ᩴ r0 = l.C4239.c
            r8.c = r0
            goto La3
        L8e:
            r4 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L9c
            l.ۘ᩹ᩴ r0 = l.C4239.d
            r8.c = r0
            goto La3
        L9c:
            long r2 = (long) r3
            l.ۘ᩹ᩴ r0 = l.C4239.ofEpochSecond(r0, r2)
            r8.c = r0
        La3:
            l.ۘ᩹ᩴ r0 = r8.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C4529.toInstant():l.ۘ᩹ᩴ");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4529) && compareTo((C4529) obj) == 0;
    }

    public final int hashCode() {
        return toInstant().hashCode();
    }

    public final long s(long j) {
        TimeUnit timeUnit = this.a;
        if (timeUnit != null) {
            return timeUnit.toNanos(this.b - timeUnit.convert(j, TimeUnit.DAYS));
        }
        return TimeUnit.SECONDS.toNanos(toInstant().getEpochSecond() - TimeUnit.DAYS.toSeconds(j));
    }

    @Override // java.lang.Comparable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C4529 c4529) {
        long days;
        long days2;
        TimeUnit timeUnit = this.a;
        if (timeUnit != null && timeUnit == c4529.a) {
            return Long.compare(this.b, c4529.b);
        }
        long epochSecond = toInstant().getEpochSecond();
        int compare = Long.compare(epochSecond, c4529.toInstant().getEpochSecond());
        if (compare != 0) {
            return compare;
        }
        int compare2 = Long.compare(toInstant().getNano(), c4529.toInstant().getNano());
        if (compare2 != 0) {
            return compare2;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        TimeUnit timeUnit2 = this.a;
        if (timeUnit2 != null) {
            days = timeUnit2.toDays(this.b);
        } else {
            days = TimeUnit.SECONDS.toDays(toInstant().getEpochSecond());
        }
        TimeUnit timeUnit3 = c4529.a;
        if (timeUnit3 != null) {
            days2 = timeUnit3.toDays(c4529.b);
        } else {
            days2 = TimeUnit.SECONDS.toDays(c4529.toInstant().getEpochSecond());
        }
        if (days == days2) {
            return Long.compare(s(days), c4529.s(days2));
        }
        return Long.compare(days, days2);
    }

    public static void l(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    public final String toString() {
        long epochSecond;
        int nano;
        long j;
        C22770 Z;
        if (this.d == null) {
            if (this.c == null && this.a.compareTo(TimeUnit.SECONDS) >= 0) {
                epochSecond = this.a.toSeconds(this.b);
                nano = 0;
            } else {
                epochSecond = toInstant().getEpochSecond();
                nano = toInstant().getNano();
            }
            if (epochSecond >= -62167219200L) {
                long j2 = epochSecond - 253402300800L;
                j = AbstractC22791.z(j2, 315569520000L) + 1;
                Z = C22770.Z(AbstractC22791.O(j2, 315569520000L) - 62167219200L, nano, C18078.f);
            } else {
                long j3 = epochSecond + 62167219200L;
                j = j3 / 315569520000L;
                Z = C22770.Z((j3 % 315569520000L) - 62167219200L, nano, C18078.f);
            }
            int i = (((int) j) * 10000) + Z.a.a;
            if (i <= 0) {
                i--;
            }
            int i2 = Z.b.d;
            StringBuilder sb = new StringBuilder(64);
            sb.append(i < 0 ? "-" : "");
            int abs = Math.abs(i);
            if (abs < 10000) {
                l(sb, 1000, Math.abs(abs));
            } else {
                sb.append(String.valueOf(abs));
            }
            sb.append('-');
            l(sb, 10, Z.a.b);
            sb.append('-');
            l(sb, 10, Z.a.c);
            sb.append('T');
            l(sb, 10, Z.b.a);
            sb.append(':');
            l(sb, 10, Z.b.b);
            sb.append(':');
            l(sb, 10, Z.b.c);
            if (i2 != 0) {
                sb.append('.');
                int i3 = 100000000;
                while (i2 % 10 == 0) {
                    i2 /= 10;
                    i3 /= 10;
                }
                l(sb, i3, i2);
            }
            sb.append('Z');
            this.d = sb.toString();
        }
        return this.d;
    }
}

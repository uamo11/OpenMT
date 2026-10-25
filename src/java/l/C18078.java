package l;

import com.google.android.material.badge.BadgeDrawable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* compiled from: N673 */
/* renamed from: l.ᩳ۬ᩴ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C18078 extends AbstractC5650 implements InterfaceC2268, InterfaceC2974, Comparable {
    public static final ConcurrentMapC10942 d = new ConcurrentMapC10942(16, 0.75f, 4);
    public static final ConcurrentMapC10942 e = new ConcurrentMapC10942(16, 0.75f, 4);
    public static final C18078 f = e0(0);
    public static final C18078 g = e0(-64800);
    public static final C18078 h = e0(64800);
    public static final long serialVersionUID = 2357656521762053153L;
    public final int b;
    public final transient String c;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C18078) obj).b - this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l.C18078 c0(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            l.C11003.requireNonNull(r7, r0)
            l.ۧۤᩴ r0 = l.C18078.e
            java.lang.Object r0 = r0.get(r7)
            l.ᩳ۬ᩴ r0 = (l.C18078) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L62
            r1 = 3
            if (r0 == r1) goto L7e
            r4 = 5
            if (r0 == r4) goto L59
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = f0(r7, r2, r3)
            int r1 = f0(r7, r6, r2)
            int r2 = f0(r7, r5, r2)
            goto L84
        L37:
            l.ܺ᩹ᩴ r0 = new l.ܺ᩹ᩴ
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = f0(r7, r2, r3)
            int r1 = f0(r7, r1, r3)
            int r2 = f0(r7, r4, r3)
            goto L84
        L50:
            int r0 = f0(r7, r2, r3)
            int r1 = f0(r7, r6, r2)
            goto L83
        L59:
            int r0 = f0(r7, r2, r3)
            int r1 = f0(r7, r1, r3)
            goto L83
        L62:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7e:
            int r0 = f0(r7, r2, r3)
            r1 = 0
        L83:
            r2 = 0
        L84:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9d
            if (r3 != r5) goto L91
            goto L9d
        L91:
            l.ܺ᩹ᩴ r0 = new l.ܺ᩹ᩴ
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9d:
            if (r3 != r5) goto La7
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            l.ᩳ۬ᩴ r7 = d0(r7, r0, r1)
            return r7
        La7:
            l.ᩳ۬ᩴ r7 = d0(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18078.c0(java.lang.String):l.ᩳ۬ᩴ");
    }

    @Override // l.AbstractC5650
    public final C15960 W() {
        C11003.requireNonNull(this, "offset");
        return new C15960(this);
    }

    public static int f0(CharSequence charSequence, int i, boolean z) {
        if (z) {
            String str = (String) charSequence;
            if (str.charAt(i - 1) != ':') {
                throw new C16232("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
            }
        }
        String str2 = (String) charSequence;
        char charAt = str2.charAt(i);
        char charAt2 = str2.charAt(i + 1);
        if (charAt >= '0' && charAt <= '9' && charAt2 >= '0' && charAt2 <= '9') {
            return (charAt2 - '0') + ((charAt - '0') * 10);
        }
        throw new C16232("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str2));
    }

    public static C18078 b0(InterfaceC2268 interfaceC2268) {
        C11003.requireNonNull(interfaceC2268, "temporal");
        C18078 c18078 = (C18078) interfaceC2268.T(AbstractC5796.d);
        if (c18078 != null) {
            return c18078;
        }
        throw new C16232("Unable to obtain ZoneOffset from TemporalAccessor: " + interfaceC2268 + " of type " + interfaceC2268.getClass().getName());
    }

    public static C18078 d0(int i, int i2, int i3) {
        if (i < -18 || i > 18) {
            throw new C16232("Zone offset hours not in valid range: value " + i + " is not in the range -18 to 18");
        }
        if (i > 0) {
            if (i2 < 0 || i3 < 0) {
                throw new C16232("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i < 0) {
            if (i2 > 0 || i3 > 0) {
                throw new C16232("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i2 > 0 && i3 < 0) || (i2 < 0 && i3 > 0)) {
            throw new C16232("Zone offset minutes and seconds must have the same sign");
        }
        if (i2 < -59 || i2 > 59) {
            throw new C16232("Zone offset minutes not in valid range: value " + i2 + " is not in the range -59 to 59");
        }
        if (i3 < -59 || i3 > 59) {
            throw new C16232("Zone offset seconds not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (Math.abs(i) != 18 || (i2 | i3) == 0) {
            return e0((i2 * 60) + (i * 3600) + i3);
        }
        throw new C16232("Zone offset not in valid range: -18:00 to +18:00");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C18078 e0(int i) {
        if (i < -64800 || i > 64800) {
            throw new C16232("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % EnumC3478.f11019 == 0) {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentMapC10942 concurrentMapC10942 = d;
            C18078 c18078 = (C18078) concurrentMapC10942.get(valueOf);
            if (c18078 != null) {
                return c18078;
            }
            concurrentMapC10942.putIfAbsent(valueOf, new C18078(i));
            C18078 c180782 = (C18078) concurrentMapC10942.get(valueOf);
            e.putIfAbsent(c180782.c, c180782);
            return c180782;
        }
        return new C18078(i);
    }

    public C18078(int i) {
        String sb;
        this.b = i;
        if (i == 0) {
            sb = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb2 = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb2.append(i < 0 ? "-" : BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX);
            sb2.append(i2 < 10 ? "0" : "");
            sb2.append(i2);
            sb2.append(i3 < 10 ? ":0" : ":");
            sb2.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb2.append(i4 < 10 ? ":0" : ":");
                sb2.append(i4);
            }
            sb = sb2.toString();
        }
        this.c = sb;
    }

    @Override // l.AbstractC5650
    public final String k() {
        return this.c;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        return interfaceC10030 instanceof EnumC18496 ? interfaceC10030 == EnumC18496.OFFSET_SECONDS : interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.OFFSET_SECONDS) {
            return this.b;
        }
        if (interfaceC10030 instanceof EnumC18496) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        return AbstractC5796.d(this, interfaceC10030).a(G(interfaceC10030), interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.OFFSET_SECONDS) {
            return this.b;
        }
        if (interfaceC10030 instanceof EnumC18496) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        return interfaceC10030.C(this);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        return (c8556 == AbstractC5796.d || c8556 == AbstractC5796.e) ? this : AbstractC5796.c(this, c8556);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(this.b, EnumC18496.OFFSET_SECONDS);
    }

    @Override // l.AbstractC5650
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18078) && this.b == ((C18078) obj).b;
    }

    @Override // l.AbstractC5650
    public final int hashCode() {
        return this.b;
    }

    @Override // l.AbstractC5650
    public final String toString() {
        return this.c;
    }

    private Object writeReplace() {
        return new C20613((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.AbstractC5650
    public final void a0(DataOutput dataOutput) {
        dataOutput.writeByte(8);
        h0(dataOutput);
    }

    public final void h0(DataOutput dataOutput) {
        int i = this.b;
        int i2 = i % EnumC3478.f11019 == 0 ? i / EnumC3478.f11019 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }

    public static C18078 g0(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? e0(dataInput.readInt()) : e0(readByte * 900);
    }
}

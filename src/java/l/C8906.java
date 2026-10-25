package l;

import com.alipay.sdk.m.p.a;
import com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate;
import com.umeng.analytics.pro.bo;
import com.umeng.analytics.pro.cb;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.bouncycastle.util.encoders.UTF8;

/* compiled from: N673 */
/* renamed from: l.ۡ۬ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8906 implements Serializable {
    public static final long serialVersionUID = 6889046316657758795L;
    public final EnumC10735 a;
    public final byte b;
    public final EnumC21878 c;
    public final C7248 d;
    public final boolean e;
    public final EnumC9612 f;
    public final C18078 g;
    public final C18078 h;
    public final C18078 i;

    public C8906(EnumC10735 enumC10735, int i, EnumC21878 enumC21878, C7248 c7248, boolean z, EnumC9612 enumC9612, C18078 c18078, C18078 c180782, C18078 c180783) {
        this.a = enumC10735;
        this.b = (byte) i;
        this.c = enumC21878;
        this.d = c7248;
        this.e = z;
        this.f = enumC9612;
        this.g = c18078;
        this.h = c180782;
        this.i = c180783;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C23722((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int i0 = this.e ? 86400 : this.d.i0();
        int i = this.g.b;
        int i2 = this.h.b - i;
        int i3 = this.i.b - i;
        byte b = i0 % 3600 == 0 ? this.e ? (byte) 24 : this.d.a : bo.j;
        int i4 = i % EnumC3478.f11019 == 0 ? (i / EnumC3478.f11019) + 128 : 255;
        int i5 = (i2 == 0 || i2 == 1800 || i2 == 3600) ? i2 / LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS : 3;
        int i6 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS : 3;
        EnumC21878 enumC21878 = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + UTF8.S_CS3) << 22) + ((enumC21878 == null ? 0 : enumC21878.getValue()) << 19) + (b << cb.f77931l) + (this.f.ordinal() << 12) + (i4 << 4) + (i5 << 2) + i6);
        if (b == 31) {
            dataOutput.writeInt(i0);
        }
        if (i4 == 255) {
            dataOutput.writeInt(i);
        }
        if (i5 == 3) {
            dataOutput.writeInt(this.h.b);
        }
        if (i6 == 3) {
            dataOutput.writeInt(this.i.b);
        }
    }

    public static C8906 a(DataInput dataInput) {
        C7248 c7248;
        int i;
        int i2;
        int readInt = dataInput.readInt();
        EnumC10735 Y = EnumC10735.Y(readInt >>> 28);
        int i3 = ((264241152 & readInt) >>> 22) - 32;
        int i4 = (3670016 & readInt) >>> 19;
        EnumC21878 V = i4 == 0 ? null : EnumC21878.V(i4);
        int i5 = (507904 & readInt) >>> 14;
        EnumC9612 enumC9612 = EnumC9612.values()[(readInt & 12288) >>> 12];
        int i6 = (readInt & 4080) >>> 4;
        int i7 = (readInt & 12) >>> 2;
        int i8 = readInt & 3;
        if (i5 == 31) {
            long readInt2 = dataInput.readInt();
            C7248 c72482 = C7248.e;
            EnumC18496.SECOND_OF_DAY.T(readInt2);
            int i9 = (int) (readInt2 / 3600);
            long j = readInt2 - (i9 * 3600);
            c7248 = C7248.W(i9, (int) (j / 60), (int) (j - (r12 * 60)), 0);
        } else {
            int i10 = i5 % 24;
            C7248 c72483 = C7248.e;
            EnumC18496.HOUR_OF_DAY.T(i10);
            c7248 = C7248.h[i10];
        }
        C18078 e0 = C18078.e0(i6 == 255 ? dataInput.readInt() : (i6 + a.g) * EnumC3478.f11019);
        if (i7 == 3) {
            i = dataInput.readInt();
        } else {
            i = (i7 * LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS) + e0.b;
        }
        C18078 e02 = C18078.e0(i);
        if (i8 == 3) {
            i2 = dataInput.readInt();
        } else {
            i2 = e0.b + (i8 * LinearIndeterminateDisjointAnimatorDelegate.TOTAL_DURATION_IN_MS);
        }
        C18078 e03 = C18078.e0(i2);
        boolean z = i5 == 24;
        C11003.requireNonNull(Y, "month");
        C11003.requireNonNull(c7248, "time");
        C11003.requireNonNull(enumC9612, "timeDefnition");
        C11003.requireNonNull(e0, "standardOffset");
        C11003.requireNonNull(e02, "offsetBefore");
        C11003.requireNonNull(e03, "offsetAfter");
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !c7248.equals(C7248.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (c7248.d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new C8906(Y, i3, V, c7248, z, enumC9612, e0, e02, e03);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8906) {
            C8906 c8906 = (C8906) obj;
            if (this.a == c8906.a && this.b == c8906.b && this.c == c8906.c && this.f == c8906.f && this.d.equals(c8906.d) && this.e == c8906.e && this.g.equals(c8906.g) && this.h.equals(c8906.h) && this.i.equals(c8906.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i0 = ((this.d.i0() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + UTF8.S_CS3) << 5);
        EnumC21878 enumC21878 = this.c;
        return ((this.g.b ^ (this.f.ordinal() + (i0 + ((enumC21878 == null ? 7 : enumC21878.ordinal()) << 2)))) ^ this.h.b) ^ this.i.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        sb.append(this.i.b - this.h.b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        EnumC21878 enumC21878 = this.c;
        if (enumC21878 != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(enumC21878.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(enumC21878.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(enumC21878.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}

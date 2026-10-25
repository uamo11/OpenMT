package l;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* compiled from: N673 */
/* renamed from: l.᩷ۗᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C20613 implements Externalizable {
    public static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public C20613() {
    }

    public C20613(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                C2828 c2828 = (C2828) obj;
                objectOutput.writeLong(c2828.a);
                objectOutput.writeInt(c2828.b);
                return;
            case 2:
                C4239 c4239 = (C4239) obj;
                objectOutput.writeLong(c4239.a);
                objectOutput.writeInt(c4239.b);
                return;
            case 3:
                C19056 c19056 = (C19056) obj;
                objectOutput.writeInt(c19056.a);
                objectOutput.writeByte(c19056.b);
                objectOutput.writeByte(c19056.c);
                return;
            case 4:
                ((C7248) obj).l0(objectOutput);
                return;
            case 5:
                C22770 c22770 = (C22770) obj;
                C19056 c190562 = c22770.a;
                objectOutput.writeInt(c190562.a);
                objectOutput.writeByte(c190562.b);
                objectOutput.writeByte(c190562.c);
                c22770.b.l0(objectOutput);
                return;
            case 6:
                C1416 c1416 = (C1416) obj;
                C22770 c227702 = c1416.a;
                C19056 c190563 = c227702.a;
                objectOutput.writeInt(c190563.a);
                objectOutput.writeByte(c190563.b);
                objectOutput.writeByte(c190563.c);
                c227702.b.l0(objectOutput);
                c1416.b.h0(objectOutput);
                c1416.c.a0(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((C17372) obj).b);
                return;
            case 8:
                ((C18078) obj).h0(objectOutput);
                return;
            case 9:
                C23434 c23434 = (C23434) obj;
                c23434.a.l0(objectOutput);
                c23434.b.h0(objectOutput);
                return;
            case 10:
                C19762 c19762 = (C19762) obj;
                C22770 c227703 = c19762.a;
                C19056 c190564 = c227703.a;
                objectOutput.writeInt(c190564.a);
                objectOutput.writeByte(c190564.b);
                objectOutput.writeByte(c190564.c);
                c227703.b.l0(objectOutput);
                c19762.b.h0(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((C1850) obj).a);
                return;
            case 12:
                C16666 c16666 = (C16666) obj;
                objectOutput.writeInt(c16666.a);
                objectOutput.writeByte(c16666.b);
                return;
            case 13:
                C17790 c17790 = (C17790) obj;
                objectOutput.writeByte(c17790.a);
                objectOutput.writeByte(c17790.b);
                return;
            case 14:
                C6501 c6501 = (C6501) obj;
                objectOutput.writeInt(c6501.a);
                objectOutput.writeInt(c6501.b);
                objectOutput.writeInt(c6501.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = a(readByte, objectInput);
    }

    public static Object a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                C2828 c2828 = C2828.ZERO;
                return C2828.s(objectInput.readLong(), objectInput.readInt());
            case 2:
                C4239 c4239 = C4239.EPOCH;
                return C4239.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                C19056 c19056 = C19056.d;
                return C19056.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return C7248.g0(objectInput);
            case 5:
                C22770 c22770 = C22770.c;
                C19056 c190562 = C19056.d;
                return C22770.Y(C19056.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C7248.g0(objectInput));
            case 6:
                C22770 c227702 = C22770.c;
                C19056 c190563 = C19056.d;
                C22770 Y = C22770.Y(C19056.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C7248.g0(objectInput));
                C18078 g0 = C18078.g0(objectInput);
                AbstractC5650 abstractC5650 = (AbstractC5650) a(objectInput.readByte(), objectInput);
                C11003.requireNonNull(Y, "localDateTime");
                C11003.requireNonNull(g0, "offset");
                C11003.requireNonNull(abstractC5650, "zone");
                if (!(abstractC5650 instanceof C18078) || g0.equals(abstractC5650)) {
                    return new C1416(Y, abstractC5650, g0);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = C17372.d;
                return AbstractC5650.X(objectInput.readUTF(), false);
            case 8:
                return C18078.g0(objectInput);
            case 9:
                int i2 = C23434.c;
                return new C23434(C7248.g0(objectInput), C18078.g0(objectInput));
            case 10:
                int i3 = C19762.c;
                C19056 c190564 = C19056.d;
                return new C19762(C22770.Y(C19056.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), C7248.g0(objectInput)), C18078.g0(objectInput));
            case 11:
                int i4 = C1850.b;
                return C1850.V(objectInput.readInt());
            case 12:
                int i5 = C16666.c;
                int readInt = objectInput.readInt();
                byte readByte = objectInput.readByte();
                EnumC18496.YEAR.T(readInt);
                EnumC18496.MONTH_OF_YEAR.T(readByte);
                return new C16666(readInt, readByte);
            case 13:
                int i6 = C17790.c;
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                EnumC10735 Y2 = EnumC10735.Y(readByte2);
                C11003.requireNonNull(Y2, "month");
                EnumC18496.DAY_OF_MONTH.T(readByte3);
                if (readByte3 <= Y2.X()) {
                    return new C17790(Y2.getValue(), readByte3);
                }
                throw new C16232("Illegal value for DayOfMonth field, value " + ((int) readByte3) + " is not valid for month " + Y2.name());
            case 14:
                C6501 c6501 = C6501.d;
                return C6501.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }
}

package l;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* compiled from: N673 */
/* renamed from: l.᩻۬ᩴ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23722 implements Externalizable {
    public static final long serialVersionUID = -8885321777449118786L;
    public byte a;
    public Object b;

    public C23722() {
    }

    public C23722(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        if (b != 1) {
            if (b == 2) {
                C6789 c6789 = (C6789) obj;
                c(c6789.a, objectOutput);
                d(c6789.c, objectOutput);
                d(c6789.d, objectOutput);
                return;
            }
            if (b == 3) {
                ((C8906) obj).b(objectOutput);
                return;
            } else {
                if (b != 100) {
                    throw new InvalidClassException("Unknown serialized type");
                }
                objectOutput.writeUTF(((C15960) obj).g.getID());
                return;
            }
        }
        C15960 c15960 = (C15960) obj;
        objectOutput.writeInt(c15960.a.length);
        for (long j : c15960.a) {
            c(j, objectOutput);
        }
        for (C18078 c18078 : c15960.b) {
            d(c18078, objectOutput);
        }
        objectOutput.writeInt(c15960.c.length);
        for (long j2 : c15960.c) {
            c(j2, objectOutput);
        }
        for (C18078 c180782 : c15960.e) {
            d(c180782, objectOutput);
        }
        objectOutput.writeByte(c15960.f.length);
        for (C8906 c8906 : c15960.f) {
            c8906.b(objectOutput);
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object c15960;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        if (readByte == 1) {
            long[] jArr = C15960.i;
            int readInt = objectInput.readInt();
            long[] jArr2 = readInt == 0 ? jArr : new long[readInt];
            for (int i = 0; i < readInt; i++) {
                jArr2[i] = a(objectInput);
            }
            int i2 = readInt + 1;
            C18078[] c18078Arr = new C18078[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                c18078Arr[i3] = b(objectInput);
            }
            int readInt2 = objectInput.readInt();
            if (readInt2 != 0) {
                jArr = new long[readInt2];
            }
            long[] jArr3 = jArr;
            for (int i4 = 0; i4 < readInt2; i4++) {
                jArr3[i4] = a(objectInput);
            }
            int i5 = readInt2 + 1;
            C18078[] c18078Arr2 = new C18078[i5];
            for (int i6 = 0; i6 < i5; i6++) {
                c18078Arr2[i6] = b(objectInput);
            }
            int readByte2 = objectInput.readByte();
            C8906[] c8906Arr = readByte2 == 0 ? C15960.j : new C8906[readByte2];
            for (int i7 = 0; i7 < readByte2; i7++) {
                c8906Arr[i7] = C8906.a(objectInput);
            }
            c15960 = new C15960(jArr2, c18078Arr, jArr3, c18078Arr2, c8906Arr);
        } else if (readByte == 2) {
            int i8 = C6789.e;
            long a = a(objectInput);
            C18078 b = b(objectInput);
            C18078 b2 = b(objectInput);
            if (b.equals(b2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            c15960 = new C6789(a, b, b2);
        } else if (readByte == 3) {
            c15960 = C8906.a(objectInput);
        } else {
            if (readByte != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            c15960 = new C15960(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.b = c15960;
    }

    private Object readResolve() {
        return this.b;
    }

    public static C18078 b(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? C18078.e0(dataInput.readInt()) : C18078.e0(readByte * 900);
    }

    public static void c(long j, DataOutput dataOutput) {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    public static long a(DataInput dataInput) {
        if ((dataInput.readByte() & 255) == 255) {
            return dataInput.readLong();
        }
        return ((((r0 << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    public static void d(C18078 c18078, DataOutput dataOutput) {
        int i = c18078.b;
        int i2 = i % EnumC3478.f11019 == 0 ? i / EnumC3478.f11019 : 127;
        dataOutput.writeByte(i2);
        if (i2 == 127) {
            dataOutput.writeInt(i);
        }
    }
}

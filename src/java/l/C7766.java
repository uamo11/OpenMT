package l;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* compiled from: N673 */
/* renamed from: l.۟᩹ᩴ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7766 implements Externalizable {
    public static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public C7766() {
    }

    public C7766(byte b, Object obj) {
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
                objectOutput.writeUTF(((AbstractC4944) obj).k());
                return;
            case 2:
                C16875 c16875 = (C16875) obj;
                objectOutput.writeObject(c16875.a);
                objectOutput.writeObject(c16875.b);
                return;
            case 3:
                C9115 c9115 = (C9115) obj;
                objectOutput.writeObject(c9115.a);
                objectOutput.writeObject(c9115.b);
                objectOutput.writeObject(c9115.c);
                return;
            case 4:
                C4881 c4881 = (C4881) obj;
                c4881.getClass();
                objectOutput.writeInt(AbstractC5796.a(c4881, EnumC18496.YEAR));
                objectOutput.writeByte(AbstractC5796.a(c4881, EnumC18496.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC5796.a(c4881, EnumC18496.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((C3470) obj).a);
                return;
            case 6:
                C5587 c5587 = (C5587) obj;
                objectOutput.writeObject(c5587.a);
                objectOutput.writeInt(AbstractC5796.a(c5587, EnumC18496.YEAR));
                objectOutput.writeByte(AbstractC5796.a(c5587, EnumC18496.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC5796.a(c5587, EnumC18496.DAY_OF_MONTH));
                return;
            case 7:
                C6355 c6355 = (C6355) obj;
                c6355.getClass();
                objectOutput.writeInt(AbstractC5796.a(c6355, EnumC18496.YEAR));
                objectOutput.writeByte(AbstractC5796.a(c6355, EnumC18496.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC5796.a(c6355, EnumC18496.DAY_OF_MONTH));
                return;
            case 8:
                C6998 c6998 = (C6998) obj;
                c6998.getClass();
                objectOutput.writeInt(AbstractC5796.a(c6998, EnumC18496.YEAR));
                objectOutput.writeByte(AbstractC5796.a(c6998, EnumC18496.MONTH_OF_YEAR));
                objectOutput.writeByte(AbstractC5796.a(c6998, EnumC18496.DAY_OF_MONTH));
                return;
            case 9:
                C17581 c17581 = (C17581) obj;
                objectOutput.writeUTF(c17581.a.k());
                objectOutput.writeInt(c17581.b);
                objectOutput.writeInt(c17581.c);
                objectOutput.writeInt(c17581.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object t;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                ConcurrentMapC10942 concurrentMapC10942 = AbstractC4944.a;
                t = AbstractC16169.t(objectInput.readUTF());
                break;
            case 2:
                t = ((InterfaceC13410) objectInput.readObject()).I((C7248) objectInput.readObject());
                break;
            case 3:
                t = ((InterfaceC14115) objectInput.readObject()).D((C18078) objectInput.readObject()).A((AbstractC5650) objectInput.readObject());
                break;
            case 4:
                C19056 c19056 = C4881.d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                C22520.c.getClass();
                t = new C4881(C19056.h0(readInt, readByte2, readByte3));
                break;
            case 5:
                C3470 c3470 = C3470.d;
                t = C3470.o(objectInput.readByte());
                break;
            case 6:
                C19699 c19699 = (C19699) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                c19699.getClass();
                t = new C5587(c19699, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                C3533.c.getClass();
                t = new C6355(C19056.h0(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                C18287.c.getClass();
                t = new C6998(C19056.h0(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i = C17581.e;
                t = new C17581(AbstractC16169.t(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = t;
    }

    private Object readResolve() {
        return this.b;
    }
}

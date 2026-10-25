package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: B99Q */
/* renamed from: l.ۙ᩸᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4924 extends AbstractC12291 implements InterfaceC22563, RandomAccess, Serializable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Enum[] f15518;

    public C4924(Enum[] enumArr) {
        C11233.m27805(enumArr, "entries");
        this.f15518 = enumArr;
    }

    @Override // l.AbstractC22169, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        int ordinal = r4.ordinal();
        Enum[] enumArr = this.f15518;
        C11233.m27805(enumArr, "<this>");
        return ((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r4;
    }

    @Override // l.AbstractC12291, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f15518;
        C11233.m27805(enumArr, "<this>");
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r5) {
            return ordinal;
        }
        return -1;
    }

    @Override // l.AbstractC12291, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int ordinal = r5.ordinal();
        Enum[] enumArr = this.f15518;
        C11233.m27805(enumArr, "<this>");
        if (((ordinal < 0 || ordinal >= enumArr.length) ? null : enumArr[ordinal]) == r5) {
            return ordinal;
        }
        return -1;
    }

    @Override // l.AbstractC22169
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo14300() {
        return this.f15518.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f15518;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(C18307.m42646("index: ", i, length, ", size: "));
        }
        return enumArr[i];
    }

    private final Object writeReplace() {
        return new C3513(this.f15518);
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}

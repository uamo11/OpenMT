package l;

import java.util.BitSet;
import java.util.Locale;

/* compiled from: A8DI */
/* renamed from: l.۠ۨ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C8161 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet f25158;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f25159;

    public C8161(EnumC1105... enumC1105Arr) {
        int i;
        this.f25158 = new BitSet(8);
        this.f25159 = 1;
        if (enumC1105Arr != null) {
            for (EnumC1105 enumC1105 : enumC1105Arr) {
                BitSet bitSet = this.f25158;
                i = enumC1105.f4017;
                bitSet.set(i);
            }
        }
        m21631();
    }

    public C8161(byte b, int i) {
        this.f25158 = BitSet.valueOf(new byte[]{b});
        this.f25159 = i;
        m21631();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8161 m21630(byte b) {
        byte b2 = (byte) (b & 192);
        return new C8161((byte) (b ^ b2), b2 >>> 6);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte m21632() {
        return (byte) (this.f25158.toByteArray()[0] | ((this.f25159 & 3) << 6));
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m21631() {
        int i;
        int i2;
        int i3;
        i = EnumC1105.RESERVED_0.f4017;
        BitSet bitSet = this.f25158;
        if (bitSet.get(i)) {
            throw new RuntimeException("Reserved0 field must be 0");
        }
        i2 = EnumC1105.RESERVED_1.f4017;
        if (bitSet.get(i2)) {
            throw new RuntimeException("Reserved1 field must be 0");
        }
        i3 = EnumC1105.BLOCK_INDEPENDENCE.f4017;
        if (!bitSet.get(i3)) {
            throw new RuntimeException("Dependent block stream is unsupported (BLOCK_INDEPENDENCE must be set)");
        }
        int i4 = this.f25159;
        if (i4 == 1) {
            return;
        }
        Locale locale = Locale.ROOT;
        throw new RuntimeException(C18307.m42645(i4, "Version ", " is unsupported"));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m21633(EnumC1105 enumC1105) {
        int i;
        BitSet bitSet = this.f25158;
        i = enumC1105.f4017;
        return bitSet.get(i);
    }
}

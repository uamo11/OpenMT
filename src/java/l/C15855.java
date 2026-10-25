package l;

/* compiled from: VBIK */
/* renamed from: l.ܺۢܺ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public enum C15855 extends EnumC8095 {
    public /* synthetic */ C15855() {
        this("FORMAT_FILL_ARRAY_DATA_PAYLOAD", 35);
    }

    public C15855(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int read = interfaceC16186.read();
        int readInt = interfaceC16186.readInt();
        int i2 = 0;
        if (read == 1) {
            byte[] bArr = new byte[readInt];
            int i3 = 0;
            boolean z = true;
            while (i2 < readInt) {
                if (z) {
                    i3 = interfaceC16186.read();
                }
                bArr[i2] = (byte) (i3 & 255);
                i3 >>= 8;
                i2++;
                z = !z;
            }
            return new C19010((EnumC8095) this, i, bArr);
        }
        if (read == 2) {
            short[] sArr = new short[readInt];
            while (i2 < readInt) {
                sArr[i2] = (short) interfaceC16186.read();
                i2++;
            }
            return new C19010((EnumC8095) this, i, sArr);
        }
        if (read == 4) {
            int[] iArr = new int[readInt];
            while (i2 < readInt) {
                iArr[i2] = interfaceC16186.readInt();
                i2++;
            }
            return new C19010((EnumC8095) this, i, iArr);
        }
        if (read == 8) {
            long[] jArr = new long[readInt];
            while (i2 < readInt) {
                jArr[i2] = interfaceC16186.readLong();
                i2++;
            }
            return new C19010(this, i, jArr);
        }
        throw new C0374("bogus element_width: ".concat(C14712.m35006(read)), null);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        C19010 c19010 = (C19010) abstractC4193;
        short m43851 = c19010.m43851();
        Object m43852 = c19010.m43852();
        interfaceC2782.m8586();
        interfaceC2782.m8586();
        interfaceC2782.m8588();
        if (m43851 == 1) {
            interfaceC2782.m8593();
            return;
        }
        if (m43851 == 2) {
            interfaceC2782.m8590();
        } else if (m43851 == 4) {
            interfaceC2782.m8595();
        } else {
            if (m43851 == 8) {
                interfaceC2782.m8587();
                return;
            }
            throw new C0374("bogus element_width: ".concat(C14712.m35006(m43851)), null);
        }
    }
}

package l;

/* compiled from: VBIK */
/* renamed from: l.ۡۢܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C8801 extends EnumC8095 {
    public /* synthetic */ C8801() {
        this("FORMAT_SPARSE_SWITCH_PAYLOAD", 34);
    }

    public C8801(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m23505 = interfaceC16186.m23505() - 1;
        int read = interfaceC16186.read();
        int[] iArr = new int[read];
        int[] iArr2 = new int[read];
        for (int i2 = 0; i2 < read; i2++) {
            iArr[i2] = interfaceC16186.readInt();
        }
        for (int i3 = 0; i3 < read; i3++) {
            iArr2[i3] = interfaceC16186.readInt() + m23505;
        }
        return new C3156(this, i, iArr, iArr2);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        C3156 c3156 = (C3156) abstractC4193;
        int[] m9586 = c3156.m9586();
        int[] m9585 = c3156.m9585();
        interfaceC2782.m23505();
        interfaceC2782.m8586();
        EnumC8095.m21492(m9585.length);
        interfaceC2782.m8586();
        for (int i : m9586) {
            interfaceC2782.m8588();
        }
        for (int i2 : m9585) {
            interfaceC2782.m8588();
        }
    }
}

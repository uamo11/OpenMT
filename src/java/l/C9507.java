package l;

/* compiled from: VBIK */
/* renamed from: l.ۢۢܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public enum C9507 extends EnumC8095 {
    public /* synthetic */ C9507() {
        this("FORMAT_PACKED_SWITCH_PAYLOAD", 33);
    }

    public C9507(String str, int i) {
        super(str, i, 0);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public AbstractC4193 mo1754(int i, InterfaceC16186 interfaceC16186) {
        int m23505 = interfaceC16186.m23505() - 1;
        int read = interfaceC16186.read();
        int readInt = interfaceC16186.readInt();
        int[] iArr = new int[read];
        for (int i2 = 0; i2 < read; i2++) {
            iArr[i2] = interfaceC16186.readInt() + m23505;
        }
        return new C20090(this, i, readInt, iArr);
    }

    @Override // l.EnumC8095
    /* renamed from: ֫ */
    public void mo1755(AbstractC4193 abstractC4193, InterfaceC2782 interfaceC2782) {
        int[] m46308 = ((C20090) abstractC4193).m46308();
        interfaceC2782.m23505();
        interfaceC2782.m8586();
        EnumC8095.m21492(m46308.length);
        interfaceC2782.m8586();
        interfaceC2782.m8588();
        for (int i : m46308) {
            interfaceC2782.m8588();
        }
    }
}

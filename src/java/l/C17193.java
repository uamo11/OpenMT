package l;

/* compiled from: J55P */
/* renamed from: l.ܿ۟֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C17193 extends AbstractC22132 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f52711;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f52712;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21972[] f52713;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23543 f52714;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17193(C23543 c23543, C12918 c12918, int i, int i2, InterfaceC21972[] interfaceC21972Arr) {
        super(c12918, i);
        this.f52714 = c23543;
        this.f52713 = interfaceC21972Arr;
        this.f52712 = 0;
        this.f52711 = i2;
    }

    @Override // l.AbstractC22132
    /* renamed from: ֫ */
    public final Object mo7600(C18729 c18729) {
        InterfaceC21972 interfaceC21972;
        InterfaceC21972 interfaceC219722;
        C12918 c12918 = this.f52714.f75598;
        while (true) {
            int m43358 = c18729.m43358();
            String str = null;
            InterfaceC21972[] interfaceC21972Arr = this.f52713;
            boolean z = true;
            switch (m43358) {
                case 0:
                    m4715();
                    return null;
                case 1:
                    this.f52712 += c18729.m43368();
                    break;
                case 2:
                    this.f52711 += c18729.m43362();
                    break;
                case 3:
                    int m43368 = c18729.m43368();
                    String m31424 = c12918.m31424(c18729.m43368() - 1);
                    int m433682 = c18729.m43368() - 1;
                    if (m433682 == -1) {
                        c12918.getClass();
                    } else {
                        str = c12918.m31401(m433682);
                    }
                    C8335 c8335 = new C8335(m31424, this.f52712, str, null, m43368);
                    if (m43368 >= 0 && m43368 < interfaceC21972Arr.length) {
                        interfaceC21972Arr[m43368] = c8335;
                    }
                    return c8335;
                case 4:
                    int m433683 = c18729.m43368();
                    String m314242 = c12918.m31424(c18729.m43368() - 1);
                    int m433684 = c18729.m43368() - 1;
                    if (m433684 == -1) {
                        c12918.getClass();
                    } else {
                        str = c12918.m31401(m433684);
                    }
                    C8335 c83352 = new C8335(m314242, this.f52712, str, c12918.m31424(c18729.m43368() - 1), m433683);
                    if (m433683 >= 0 && m433683 < interfaceC21972Arr.length) {
                        interfaceC21972Arr[m433683] = c83352;
                    }
                    return c83352;
                case 5:
                    int m433685 = c18729.m43368();
                    boolean z2 = false;
                    if (m433685 >= 0 && m433685 < interfaceC21972Arr.length) {
                        interfaceC21972 = interfaceC21972Arr[m433685];
                    } else {
                        interfaceC21972 = C23543.f75595;
                        z = false;
                    }
                    if (interfaceC21972 instanceof InterfaceC14915) {
                        interfaceC21972 = C23543.f75595;
                    } else {
                        z2 = z;
                    }
                    C9041 c9041 = new C9041(interfaceC21972.getName(), this.f52712, interfaceC21972.getType(), interfaceC21972.getSignature(), m433685);
                    if (z2) {
                        interfaceC21972Arr[m433685] = c9041;
                    }
                    return c9041;
                case 6:
                    int m433686 = c18729.m43368();
                    if (m433686 >= 0 && m433686 < interfaceC21972Arr.length) {
                        interfaceC219722 = interfaceC21972Arr[m433686];
                    } else {
                        interfaceC219722 = C23543.f75595;
                    }
                    C4102 c4102 = new C4102(interfaceC219722.getName(), this.f52712, interfaceC219722.getType(), interfaceC219722.getSignature(), m433686);
                    if (m433686 >= 0 && m433686 < interfaceC21972Arr.length) {
                        interfaceC21972Arr[m433686] = c4102;
                    }
                    return c4102;
                case 7:
                    return new C2691(this.f52712);
                case 8:
                    return new C16095(this.f52712);
                case 9:
                    return new C19625(this.f52712, c12918.m31424(c18729.m43368() - 1));
                default:
                    int i = ((m43358 - 10) / 15) + this.f52712;
                    this.f52712 = i;
                    int i2 = ((r2 % 15) - 4) + this.f52711;
                    this.f52711 = i2;
                    return C5199.m14972(i, i2);
            }
        }
    }
}

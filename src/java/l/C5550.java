package l;

/* compiled from: F925 */
/* renamed from: l.ۚ᩵֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C5550 extends AbstractC8540 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14308 f17161;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char f17162;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f17163;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public StringBuilder f17164;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f17165;

    public C5550(char c, int i, int i2) {
        C14308 c14308 = new C14308();
        this.f17161 = c14308;
        this.f17164 = new StringBuilder();
        this.f17162 = c;
        this.f17165 = i;
        String.valueOf(c);
        c14308.m34143(Integer.valueOf(i));
        c14308.m34138(i2);
    }

    @Override // l.InterfaceC2190
    /* renamed from: ܿ */
    public final AbstractC11342 mo7223() {
        return this.f17161;
    }

    @Override // l.InterfaceC2190
    /* renamed from: ֫ */
    public final C14721 mo7216(InterfaceC19124 interfaceC19124) {
        int mo44153 = interfaceC19124.mo44153();
        int index = interfaceC19124.getIndex();
        CharSequence m38335 = interfaceC19124.getLine().m38335();
        int mo44151 = interfaceC19124.mo44151();
        C14308 c14308 = this.f17161;
        if (mo44151 < 4 && mo44153 < m38335.length()) {
            int length = m38335.length();
            int i = mo44153;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (m38335.charAt(i) != this.f17162) {
                    length = i;
                    break;
                }
                i++;
            }
            int i2 = length - mo44153;
            if (i2 >= this.f17165 && C8751.m22636(mo44153 + i2, m38335.length(), m38335) == m38335.length()) {
                c14308.m34139(Integer.valueOf(i2));
                return new C14721(-1, -1, true);
            }
        }
        int length2 = m38335.length();
        for (int m34146 = c14308.m34146(); m34146 > 0 && index < length2 && m38335.charAt(index) == ' '; m34146--) {
            index++;
        }
        return C14721.m35022(index);
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* renamed from: ֫ */
    public final void mo7218(C16300 c16300) {
        if (this.f17163 == null) {
            this.f17163 = c16300.m38335().toString();
            return;
        }
        CharSequence m38335 = c16300.m38335();
        StringBuilder sb = this.f17164;
        sb.append(m38335);
        sb.append('\n');
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* renamed from: ۜ */
    public final void mo7221() {
        String m29420 = C12047.m29420(this.f17163.trim());
        C14308 c14308 = this.f17161;
        c14308.m34140(m29420);
        c14308.m34144(this.f17164.toString());
    }
}

package l;

import java.util.ArrayList;
import java.util.List;

/* compiled from: A7QO */
/* renamed from: l.ܰ۟ܺ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C13675 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19854 f40818;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18711 f40819;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C5210 f40816 = C5210.f16320;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C20733 f40815 = C20733.m47335();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40821 = new ArrayList();

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f40823 = 0;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f40820 = Integer.MIN_VALUE;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f40817 = 0;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40822 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32897(InterfaceC12265 interfaceC12265) {
        if (interfaceC12265 instanceof C10149) {
            this.f40817++;
        } else if (interfaceC12265 instanceof EnumC7510) {
            int i = this.f40817 - 1;
            this.f40817 = i;
            if (i < 0) {
                throw new AssertionError();
            }
        }
        this.f40821.add(interfaceC12265);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32895(List list) {
        AbstractC4628 listIterator = ((AbstractC14545) list).listIterator(0);
        while (listIterator.hasNext()) {
            m32897((InterfaceC12265) listIterator.next());
        }
    }

    public C13675(C19854 c19854, C18711 c18711) {
        this.f40818 = c19854;
        this.f40819 = c18711;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AbstractC22143 m32902() {
        return this.f40818;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m32915() {
        return this.f40817;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32893(int i) {
        if (this.f40817 != i) {
            throw new C0270(m32891(String.format("saw %d unclosed ops", Integer.valueOf(this.f40817))));
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19322 m32891(String str) {
        int i = this.f40820;
        C19854 c19854 = this.f40818;
        return C19322.m44518(c19854.m45666(i), c19854.m45662(i), str);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32913(int i) {
        if (i > this.f40820) {
            AbstractC14545 m45667 = this.f40818.m45667();
            int size = m45667.size();
            this.f40820 = i;
            int i2 = this.f40823;
            if (i2 >= size || i <= ((InterfaceC21438) m45667.get(i2)).mo48557().getPosition()) {
                return;
            }
            int i3 = this.f40823;
            this.f40823 = i3 + 1;
            throw new C0270(m32891("did not generate token \"" + ((InterfaceC21438) m45667.get(i3)).mo48557().getText() + "\""));
        }
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m32900() {
        C19854 c19854 = this.f40818;
        int length = c19854.m45663().length() + 1;
        if (length > this.f40820) {
            AbstractC14545 m45667 = c19854.m45667();
            int size = m45667.size();
            while (true) {
                int i = this.f40823;
                if (i >= size || length <= ((InterfaceC21438) m45667.get(i)).mo48557().getPosition()) {
                    break;
                }
                int i2 = this.f40823;
                this.f40823 = i2 + 1;
                m32897(C2388.m7729((InterfaceC21438) m45667.get(i2), EnumC15792.IMAGINARY, f40816, C16646.empty()));
            }
        }
        this.f40820 = length;
        m32893(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32896(AbstractC8032 abstractC8032) {
        m32897(C10149.m25485(abstractC8032));
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32906() {
        m32897(EnumC7510.m20134());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16646 m32908(int i) {
        AbstractC14545 m45667 = this.f40818.m45667();
        int i2 = this.f40823 + i;
        if (i2 < m45667.size()) {
            return C16646.of(((InterfaceC21438) m45667.get(i2)).mo48557().mo35701());
        }
        return C16646.empty();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21438 m32903(int i) {
        AbstractC14545 m45667 = this.f40818.m45667();
        int i2 = this.f40823 + i;
        if (i2 < m45667.size()) {
            return (InterfaceC21438) m45667.get(i2);
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m32890(int i, C9976 c9976) {
        AbstractC14545 m45667 = this.f40818.m45667();
        boolean z = ((InterfaceC21438) m45667.get(this.f40823)).mo48557().getPosition() == i;
        Object obj = m45667.get(this.f40823);
        if (!z) {
            throw new IllegalStateException(C10375.m26179("Expected the current token to be at position %s, found: %s", Integer.valueOf(i), obj));
        }
        C1846 c1846 = new C1846();
        for (int i2 = this.f40823; i2 < m45667.size(); i2++) {
            InterfaceC15086 mo48557 = ((InterfaceC21438) m45667.get(i2)).mo48557();
            if (!c9976.apply(mo48557)) {
                break;
            }
            c1846.m16264(mo48557);
        }
        return c1846.m6131();
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32905(String str) {
        m32894(str, EnumC15792.IMAGINARY, f40816, C16646.empty());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32894(String str, EnumC15792 enumC15792, AbstractC8032 abstractC8032, C16646 c16646) {
        AbstractC14545 m45667 = this.f40818.m45667();
        if (str.equals(m32908(0).orElse(null))) {
            int i = this.f40823;
            this.f40823 = i + 1;
            m32897(C2388.m7729((InterfaceC21438) m45667.get(i), EnumC15792.REAL, abstractC8032, c16646));
        } else if (enumC15792.m37252()) {
            throw new C0270(m32891(String.format("expected token: '%s'; generated %s instead", m32908(0).orElse(null), str)));
        }
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32910(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            m32894(str.substring(i, i2), EnumC15792.REAL, f40816, C16646.empty());
            i = i2;
        }
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m32907() {
        m32897(C20733.m47335());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32892() {
        m32899(EnumC23554.UNIFIED, "", f40816);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32909() {
        m32899(EnumC23554.INDEPENDENT, "", f40816);
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m32914() {
        m32899(EnumC23554.FORCED, "", f40816);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32904() {
        m32899(EnumC23554.UNIFIED, " ", f40816);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32912() {
        m32899(EnumC23554.INDEPENDENT, " ", f40816);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32899(EnumC23554 enumC23554, String str, AbstractC8032 abstractC8032) {
        m32897(C14381.m34345(enumC23554, str, abstractC8032, C16646.empty()));
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m32901() {
        int i = this.f40822;
        if (i == -1) {
            this.f40822 = this.f40823;
            return;
        }
        if (this.f40823 == i) {
            return;
        }
        C19854 c19854 = this.f40818;
        this.f40819.m43329((InterfaceC21438) c19854.m45667().get(this.f40822), (InterfaceC21438) c19854.m45667().get(this.f40823 - 1));
        this.f40822 = this.f40823;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32898(AbstractC22848 abstractC22848) {
        int index;
        InterfaceC21438 interfaceC21438 = (InterfaceC21438) this.f40818.m45667().get(this.f40823);
        AbstractC4628 listIterator = interfaceC21438.mo48558().listIterator(0);
        while (true) {
            if (listIterator.hasNext()) {
                InterfaceC15086 interfaceC15086 = (InterfaceC15086) listIterator.next();
                if (interfaceC15086.getIndex() >= 0) {
                    index = interfaceC15086.getIndex();
                    break;
                }
            } else {
                index = interfaceC21438.mo48557().getIndex();
                break;
            }
        }
        this.f40819.m43327(index, abstractC22848);
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m32911() {
        AbstractC14545 of;
        m32901();
        C8656 m22419 = C8656.m22419();
        ArrayList arrayList = this.f40821;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            InterfaceC12265 interfaceC12265 = (InterfaceC12265) arrayList.get(i);
            if (interfaceC12265 instanceof C2388) {
                C2388 c2388 = (C2388) interfaceC12265;
                InterfaceC21438 m7734 = c2388.m7734();
                int i2 = i;
                while (i2 > 0 && (arrayList.get(i2 - 1) instanceof C10149)) {
                    i2--;
                }
                int i3 = i;
                do {
                    i3++;
                    if (i3 >= size) {
                        break;
                    }
                } while (arrayList.get(i3) instanceof EnumC7510);
                if (c2388.m7737().m37252()) {
                    AbstractC4628 listIterator = m7734.mo48558().listIterator(0);
                    boolean z = false;
                    int i4 = 0;
                    boolean z2 = false;
                    boolean z3 = false;
                    while (listIterator.hasNext()) {
                        InterfaceC15086 interfaceC15086 = (InterfaceC15086) listIterator.next();
                        if (interfaceC15086.mo35698()) {
                            i4++;
                        } else if (interfaceC15086.mo35700()) {
                            int position = interfaceC15086.getPosition();
                            m22419.put(Integer.valueOf(i2), C14381.m34346(interfaceC15086.mo35696() ? EnumC23554.FORCED : EnumC23554.UNIFIED, position == 0 || this.f40818.m45663().charAt(position + (-1)) == '\n' ? C5210.f16319 : c2388.m7735()));
                            m22419.m22420(interfaceC15086.mo35699() ? AbstractC14545.of((Object) C8738.m22591(interfaceC15086)) : AbstractC14545.of((Object) C8738.m22591(interfaceC15086), (Object) C14381.m34346(EnumC23554.FORCED, C5210.f16320)), Integer.valueOf(i2));
                            z3 = interfaceC15086.mo35699();
                            if (interfaceC15086.mo35697()) {
                                m22419.put(Integer.valueOf(i2), C14381.m34346(EnumC23554.FORCED, C5210.f16320));
                            }
                            z = interfaceC15086.mo35696() || (interfaceC15086.mo35699() && !interfaceC15086.mo35697());
                            i4 = 0;
                            z2 = true;
                        }
                    }
                    if (z && i4 > 1) {
                        this.f40819.m43327(m7734.mo48557().getIndex(), AbstractC22848.f73736);
                    }
                    C20733 c20733 = f40815;
                    if (z2 && i4 > 0) {
                        Integer valueOf = Integer.valueOf(i2);
                        int i5 = C14381.f43326;
                        m22419.put(valueOf, C14381.m34346(EnumC23554.FORCED, C5210.f16320));
                    } else if (z3) {
                        m22419.put(Integer.valueOf(i2), c20733);
                    }
                    AbstractC4628 listIterator2 = m7734.mo48559().listIterator(0);
                    while (listIterator2.hasNext()) {
                        InterfaceC15086 interfaceC150862 = (InterfaceC15086) listIterator2.next();
                        if (interfaceC150862.mo35700()) {
                            boolean z4 = interfaceC150862.mo35697() || (interfaceC150862.mo35699() && c2388.m7739().isPresent());
                            if (z4) {
                                m22419.put(Integer.valueOf(i3), C14381.m34346(EnumC23554.FORCED, (AbstractC8032) c2388.m7739().orElse(C5210.f16320)));
                            } else {
                                m22419.put(Integer.valueOf(i3), c20733);
                            }
                            Integer valueOf2 = Integer.valueOf(i3);
                            if (interfaceC150862.mo35699()) {
                                of = AbstractC14545.of((Object) C8738.m22591(interfaceC150862));
                            } else {
                                C8738 m22591 = C8738.m22591(interfaceC150862);
                                int i6 = C14381.f43326;
                                of = AbstractC14545.of((Object) m22591, (Object) C14381.m34346(EnumC23554.FORCED, C5210.f16320));
                            }
                            m22419.m22420(of, valueOf2);
                            if (z4) {
                                m22419.put(Integer.valueOf(i3), C14381.m34346(EnumC23554.FORCED, f40816));
                            }
                        }
                    }
                } else {
                    AbstractC4628 listIterator3 = m7734.mo48558().listIterator(0);
                    int i7 = 0;
                    boolean z5 = false;
                    while (listIterator3.hasNext()) {
                        InterfaceC15086 interfaceC150863 = (InterfaceC15086) listIterator3.next();
                        if (interfaceC150863.mo35698()) {
                            i7++;
                        } else if (interfaceC150863.mo35700()) {
                            z5 = interfaceC150863.mo35700();
                            i7 = 0;
                        }
                        if (z5 && i7 > 0) {
                            Integer valueOf3 = Integer.valueOf(i2);
                            int i8 = C14381.f43326;
                            m22419.put(valueOf3, C14381.m34346(EnumC23554.FORCED, C5210.f16320));
                        }
                        m22419.put(Integer.valueOf(i2), C8738.m22591(interfaceC150863));
                    }
                    AbstractC4628 listIterator4 = m7734.mo48559().listIterator(0);
                    while (listIterator4.hasNext()) {
                        m22419.put(Integer.valueOf(i3), C8738.m22591((InterfaceC15086) listIterator4.next()));
                    }
                }
            }
        }
        int i9 = AbstractC14545.f44556;
        C1846 c1846 = new C1846();
        boolean z6 = false;
        for (int i10 = 0; i10 < size; i10++) {
            for (InterfaceC12265 interfaceC122652 : m22419.get((Object) Integer.valueOf(i10))) {
                if (!z6 || !(interfaceC122652 instanceof C20733)) {
                    c1846.m16264(interfaceC122652);
                    z6 = (interfaceC122652 instanceof C14381) && ((C14381) interfaceC122652).m34349();
                }
            }
            Object obj = (InterfaceC12265) arrayList.get(i10);
            if (!z6 || (!(obj instanceof C20733) && (!(obj instanceof C14381) || ((C14381) obj).m34350() != 0 || !" ".equals(((AbstractC3799) obj).m11470())))) {
                c1846.m16264(obj);
                if (!(obj instanceof C10149)) {
                    z6 = (obj instanceof C14381) && ((C14381) obj).m34349();
                }
            }
        }
        for (InterfaceC12265 interfaceC122653 : m22419.get((Object) Integer.valueOf(size))) {
            if (!z6 || !(interfaceC122653 instanceof C20733)) {
                c1846.m16264(interfaceC122653);
                z6 = (interfaceC122653 instanceof C14381) && ((C14381) interfaceC122653).m34349();
            }
        }
        return c1846.m6131();
    }

    public final String toString() {
        C8964 m37871 = C16018.m37871(this);
        m37871.m23110(this.f40818, "input");
        m37871.m23110(this.f40821, "ops");
        m37871.m23110(this.f40819, "output");
        m37871.m23111("tokenI", this.f40823);
        m37871.m23111("inputPosition", this.f40820);
        return m37871.toString();
    }
}

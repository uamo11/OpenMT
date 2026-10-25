package l;

import java.util.ArrayList;

/* compiled from: 44P2 */
/* renamed from: l.֫ܳ֡, reason: contains not printable characters */
/* loaded from: classes2.dex */
public class C1875 implements InterfaceC14574 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6381;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC23747 f6383;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f6384 = new ArrayList(100);

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6382 = -1;

    @Override // l.InterfaceC14574
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo6200() {
        return 0;
    }

    @Override // l.InterfaceC14574
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo6207(int i) {
    }

    public C1875(AbstractC23747 abstractC23747) {
        this.f6383 = abstractC23747;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m6208(int i) {
        return m6202(i);
    }

    @Override // l.InterfaceC14574
    public final int index() {
        return this.f6382;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 mo6211(int i) {
        m6209();
        if (i == 0) {
            return null;
        }
        if (i < 0) {
            int i2 = -i;
            ArrayList arrayList = this.f6384;
            if (i2 != 0) {
                int i3 = this.f6382;
                if (i3 - i2 >= 0) {
                    for (int i4 = 1; i4 <= i2 && i3 > 0; i4++) {
                        i3--;
                        m6212(i3);
                        if (i3 >= arrayList.size()) {
                            i3 = arrayList.size() - 1;
                        } else {
                            while (i3 >= 0) {
                                InterfaceC0463 interfaceC0463 = (InterfaceC0463) arrayList.get(i3);
                                if (interfaceC0463.getType() != -1 && interfaceC0463.mo2050() != 0) {
                                    i3--;
                                }
                            }
                        }
                    }
                    if (i3 >= 0) {
                        return (InterfaceC0463) arrayList.get(i3);
                    }
                }
            }
            return null;
        }
        int i5 = this.f6382;
        for (int i6 = 1; i6 < i; i6++) {
            int i7 = i5 + 1;
            if (m6212(i7)) {
                i5 = m6202(i7);
            }
        }
        return (InterfaceC0463) this.f6384.get(i5);
    }

    @Override // l.InterfaceC14574
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6201(int i) {
        m6209();
        this.f6382 = m6208(i);
    }

    @Override // l.InterfaceC14574
    public final int size() {
        return this.f6384.size();
    }

    @Override // l.InterfaceC14574
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6204() {
        ArrayList arrayList = this.f6384;
        int i = this.f6382;
        if ((i < 0 || (!this.f6381 ? i >= arrayList.size() : i >= arrayList.size() - 1)) && mo6203(1) == -1) {
            throw new IllegalStateException("cannot consume EOF");
        }
        if (m6212(this.f6382 + 1)) {
            this.f6382 = m6208(this.f6382 + 1);
        }
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m6212(int i) {
        int size = (i - this.f6384.size()) + 1;
        return size <= 0 || mo6205(size) >= size;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int mo6205(int i) {
        ArrayList arrayList = this.f6384;
        if (this.f6381) {
            return 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC0463 nextToken = this.f6383.nextToken();
            if (nextToken instanceof C13952) {
                ((C13952) nextToken).m33392(arrayList.size());
            }
            arrayList.add(nextToken);
            if (nextToken.getType() == -1) {
                this.f6381 = true;
                return i2 + 1;
            }
        }
        return i;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC0463 m6213(int i) {
        ArrayList arrayList = this.f6384;
        if (i >= 0 && i < arrayList.size()) {
            return (InterfaceC0463) arrayList.get(i);
        }
        StringBuilder m32308 = C13325.m32308(i, "token index ", " out of range 0..");
        m32308.append(arrayList.size() - 1);
        throw new IndexOutOfBoundsException(m32308.toString());
    }

    @Override // l.InterfaceC14574
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int mo6203(int i) {
        return mo6211(i).getType();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m6209() {
        if (this.f6382 == -1) {
            m6212(0);
            this.f6382 = m6208(0);
        }
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList m6210() {
        return this.f6384;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m6202(int i) {
        ArrayList arrayList = this.f6384;
        m6212(i);
        if (i >= arrayList.size()) {
            return arrayList.size() - 1;
        }
        Object obj = arrayList.get(i);
        while (true) {
            InterfaceC0463 interfaceC0463 = (InterfaceC0463) obj;
            if (interfaceC0463.mo2050() == 0 || interfaceC0463.getType() == -1) {
                break;
            }
            i++;
            m6212(i);
            obj = arrayList.get(i);
        }
        return i;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m6206() {
        m6209();
        while (mo6205(1000) >= 1000) {
        }
    }
}

package l;

/* compiled from: E8DU */
/* renamed from: l.᩸᩵ۘ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C21782 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f69773;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C7216 f69774;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f69775;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C15430[] f69776;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m49112(int i) {
        C15430 m49109 = m49109(i);
        if (m49109 != null) {
            m49109.f47239 = false;
            C21782 c21782 = m49109.f47241;
            long j = c21782.f69775;
            c21782.f69775 = 1 + j;
            m49109.f47242 = j;
        }
    }

    public C21782(InterfaceC21077[] interfaceC21077Arr) {
        int length = interfaceC21077Arr.length;
        this.f69773 = length;
        this.f69776 = new C15430[length];
        for (int i = 0; i < this.f69773; i++) {
            C15430[] c15430Arr = this.f69776;
            C15430 c15430 = new C15430(this);
            c15430Arr[i] = c15430;
            c15430.f47243 = interfaceC21077Arr[i];
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4394 m49111() {
        if (this.f69774 == null) {
            AbstractC23898 abstractC23898 = (AbstractC23898) this.f69776[0].f47243;
            abstractC23898.getClass();
            this.f69774 = abstractC23898.m52651();
        }
        return this.f69774;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C15430 m49109(int i) {
        for (C15430 c15430 : this.f69776) {
            if (c15430.f47240 == i) {
                return c15430;
            }
        }
        return null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15430 m49108(C21782 c21782, int i) {
        C15430 m49109 = c21782.m49109(i);
        if (m49109 == null) {
            C15430[] c15430Arr = c21782.f69776;
            int length = c15430Arr.length;
            C15430 c15430 = null;
            C15430 c154302 = null;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    C15430 c154303 = c15430Arr[i2];
                    if (c154303.f47243 == null) {
                        m49109 = c154303;
                        break;
                    }
                    if (c15430 != null) {
                        if (!c154303.f47239) {
                            if (c154303.f47242 >= c15430.f47242) {
                            }
                            c15430 = c154303;
                        }
                        i2++;
                    } else {
                        if (c154303.f47239) {
                            if (c154302 == null || c154303.f47242 < c154302.f47242) {
                                c154302 = c154303;
                            }
                            i2++;
                        }
                        c15430 = c154303;
                        i2++;
                    }
                } else {
                    m49109 = c15430 != null ? c15430 : c154302;
                }
            }
        }
        m49109.f47240 = i;
        long j = c21782.f69775;
        c21782.f69775 = 1 + j;
        m49109.f47242 = j;
        m49109.f47239 = true;
        return m49109;
    }
}

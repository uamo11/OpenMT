package l;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: VA9Z */
/* renamed from: l.ܶۘۧ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC14982 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f45662;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f45663;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f45664;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f45665;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f45667;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC0165 f45668;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f45669;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f45670;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f45672;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f45673;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f45674;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C18511 f45671 = new C18511();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C0871 f45666 = new C0871();

    /* renamed from: ֫ */
    public abstract long mo7524(C17714 c17714);

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    /* renamed from: ֫ */
    public abstract boolean mo7526(C17714 c17714, long j, C0871 c0871);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35475(InterfaceC21830 interfaceC21830, InterfaceC19383 interfaceC19383) {
        this.f45667 = interfaceC21830;
        this.f45663 = interfaceC19383;
        mo7525(true);
    }

    /* renamed from: ֫ */
    public void mo7525(boolean z) {
        if (z) {
            this.f45666 = new C0871();
            this.f45674 = 0L;
            this.f45665 = 0;
        } else {
            this.f45665 = 1;
        }
        this.f45669 = -1L;
        this.f45662 = 0L;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m35474(long j, long j2) {
        this.f45671.m43020();
        if (j == 0) {
            mo7525(!this.f45673);
            return;
        }
        if (this.f45665 != 0) {
            long m35476 = m35476(j2);
            this.f45669 = m35476;
            InterfaceC0165 interfaceC0165 = this.f45668;
            String str = C3603.f11424;
            interfaceC0165.mo1285(m35476);
            this.f45665 = 2;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m35472(InterfaceC8424 interfaceC8424, C23615 c23615) {
        C22632.m50632(this.f45663);
        String str = C3603.f11424;
        int i = this.f45665;
        C18511 c18511 = this.f45671;
        if (i == 0) {
            while (c18511.m43018(interfaceC8424)) {
                this.f45672 = interfaceC8424.getPosition() - this.f45674;
                if (mo7526(c18511.m43019(), this.f45674, this.f45666)) {
                    this.f45674 = interfaceC8424.getPosition();
                } else {
                    C8353 c8353 = this.f45666.f3427;
                    this.f45664 = c8353.f25624;
                    if (!this.f45670) {
                        this.f45663.mo8456(c8353);
                        this.f45670 = true;
                    }
                    C15687 c15687 = this.f45666.f3428;
                    if (c15687 != null) {
                        this.f45668 = c15687;
                    } else if (interfaceC8424.getLength() == -1) {
                        this.f45668 = new C7927();
                    } else {
                        C19217 m43017 = c18511.m43017();
                        this.f45668 = new C8633(this, this.f45674, interfaceC8424.getLength(), m43017.f60514 + m43017.f60511, m43017.f60512, (m43017.f60517 & 4) != 0);
                    }
                    this.f45665 = 2;
                    c18511.m43021();
                    return 0;
                }
            }
            this.f45665 = 3;
            return -1;
        }
        if (i == 1) {
            interfaceC8424.mo22070((int) this.f45674);
            this.f45665 = 2;
            return 0;
        }
        if (i != 2) {
            if (i == 3) {
                return -1;
            }
            throw new IllegalStateException();
        }
        long mo1283 = this.f45668.mo1283(interfaceC8424);
        if (mo1283 >= 0) {
            c23615.f76532 = mo1283;
            return 1;
        }
        if (mo1283 < -1) {
            mo35477(-(mo1283 + 2));
        }
        if (!this.f45673) {
            InterfaceC9505 mo1284 = this.f45668.mo1284();
            C22632.m50632(mo1284);
            this.f45667.mo3430(mo1284);
            this.f45663.mo8454(mo1284.mo6827());
            this.f45673 = true;
        }
        if (this.f45672 > 0 || c18511.m43018(interfaceC8424)) {
            this.f45672 = 0L;
            C17714 m43019 = c18511.m43019();
            long mo7524 = mo7524(m43019);
            if (mo7524 >= 0) {
                long j = this.f45662;
                if (j + mo7524 >= this.f45669) {
                    long m35473 = m35473(j);
                    this.f45663.mo8453(m43019.m41483(), m43019);
                    this.f45663.mo8455(m35473, 1, m43019.m41483(), 0, null);
                    this.f45669 = -1L;
                }
            }
            this.f45662 += mo7524;
            return 0;
        }
        this.f45665 = 3;
        return -1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m35473(long j) {
        return (j * 1000000) / this.f45664;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long m35476(long j) {
        return (this.f45664 * j) / 1000000;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo35477(long j) {
        this.f45662 = j;
    }
}

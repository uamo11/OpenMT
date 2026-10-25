package l;

/* compiled from: YBDT */
/* renamed from: l.ܽܺܺ, reason: contains not printable characters */
/* loaded from: classes5.dex */
public abstract class AbstractC16745 extends AbstractC15333 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23095 f51399;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C23095 f51400;

    public AbstractC16745(C12512 c12512, C20274 c20274) {
        super(c12512, c20274);
        String string = m36364().m46532().getString();
        if (m39384()) {
            this.f51399 = C23095.m51254(string);
        } else {
            this.f51399 = C23095.m51255(string);
        }
        this.f51400 = null;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C23095 m39386() {
        return this.f51399;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23095 m39385(boolean z) {
        C23095 c23095 = this.f51399;
        if (z) {
            return c23095;
        }
        if (this.f51400 == null) {
            this.f51400 = c23095.m51258(m36363().m30696());
        }
        return this.f51400;
    }

    @Override // l.AbstractC15333, l.AbstractC13717
    /* renamed from: ۧ */
    public final int mo2228(AbstractC13717 abstractC13717) {
        int mo2228 = super.mo2228(abstractC13717);
        return mo2228 != 0 ? mo2228 : this.f51399.compareTo(((AbstractC16745) abstractC13717).f51399);
    }

    @Override // l.InterfaceC1538
    public final C7573 getType() {
        return this.f51399.m51261();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m39384() {
        C12512 m36363 = m36363();
        if (m36363.equals(C12512.f37598)) {
            String string = m36364().getName().getString();
            string.getClass();
            if (string.equals("invoke") || string.equals("invokeExact")) {
                return true;
            }
        } else if (m36363.equals(C12512.f37586)) {
            String string2 = m36364().getName().getString();
            string2.getClass();
            switch (string2) {
            }
            return true;
        }
        return false;
    }
}

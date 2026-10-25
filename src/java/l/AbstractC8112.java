package l;

/* compiled from: F6OU */
/* renamed from: l.۠ۤۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC8112 extends AbstractC23747 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f25069;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f25070;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f25071;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m21579(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 97 && i <= 102) {
            return i - 87;
        }
        if (i < 65 || i > 70) {
            return -1;
        }
        return i - 55;
    }

    public AbstractC8112(C20813 c20813) {
        super(c20813);
        this.f25069 = 1;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m21580() {
        ((C4264) m43460()).m12836(this.f76890);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m21578(String str) {
        throw new C0350(EnumC19402.SYNTAX, this.f76880, this.f76879, str);
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m21582() {
        InterfaceC23125 interfaceC23125 = this.f76890;
        if (interfaceC23125.mo6203(1) == 91) {
            int i = 1;
            do {
                i++;
            } while (interfaceC23125.mo6203(i) == 61);
            if (interfaceC23125.mo6203(i) == 91) {
                for (int i2 = 0; i2 < i; i2++) {
                    m21580();
                }
                m21581(true);
                return;
            }
        }
        while (interfaceC23125.mo6203(1) != -1 && interfaceC23125.mo6203(1) != 10 && interfaceC23125.mo6203(1) != 13) {
            m21580();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x011a, code lost:
    
        m21578("Unterminated string");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x011f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00b8, code lost:
    
        m21578("Invalid Unicode escape");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00bb, code lost:
    
        throw null;
     */
    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m21583(int r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC8112.m21583(int):void");
    }

    @Override // l.AbstractC23747, l.InterfaceC1169
    public final InterfaceC0463 nextToken() {
        InterfaceC23125 interfaceC23125 = this.f76890;
        InterfaceC0463 nextToken = super.nextToken();
        for (int index = interfaceC23125.index(); index < interfaceC23125.index(); index++) {
            int mo6203 = interfaceC23125.mo6203(index - interfaceC23125.index());
            if (mo6203 == 13 || mo6203 == 10) {
                int i = this.f25070;
                if (i == 0 || i == mo6203) {
                    this.f25069++;
                    this.f25070 = mo6203;
                } else {
                    this.f25070 = 0;
                }
                this.f25071 = 0;
            } else {
                this.f25071++;
                this.f25070 = 0;
            }
        }
        ((C4264) m43460()).m12840(this.f25069);
        ((C4264) m43460()).m12835(this.f25071);
        int type = nextToken.getType();
        int mo62032 = interfaceC23125.mo6203(1);
        if ((type != 60 && type != 61 && type != 62 && type != 63) || (mo62032 != 46 && mo62032 != 95 && ((mo62032 < 97 || mo62032 > 122) && (mo62032 < 65 || mo62032 > 90)))) {
            return nextToken;
        }
        m21578("Malformed number");
        throw null;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21581(boolean z) {
        InterfaceC23125 interfaceC23125 = this.f76890;
        int index = (interfaceC23125.index() - this.f76885) - (z ? 4 : 2);
        while (interfaceC23125.mo6203(1) != -1) {
            if (interfaceC23125.mo6203(1) != 93) {
                m21580();
            } else {
                m21580();
                int i = 0;
                while (interfaceC23125.mo6203(1) == 61) {
                    m21580();
                    i++;
                }
                if (i == index && interfaceC23125.mo6203(1) == 93) {
                    m21580();
                    return;
                }
            }
        }
        m21578(z ? "Unterminated long comment" : "Unterminated long string");
        throw null;
    }
}

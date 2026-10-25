package l;

import java.util.ArrayDeque;

/* compiled from: 86QM */
/* renamed from: l.۠ۙۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC7947 extends AbstractC23747 {

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public String f24570;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f24571;

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Boolean f24572;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24573;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f24574;

    /* renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f24575;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f24576;

    /* renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f24577;

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f24578;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Boolean f24579;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f24580;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public boolean f24581;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C18051 f24582;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f24583;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f24584;

    public AbstractC7947(InterfaceC23125 interfaceC23125) {
        super(interfaceC23125);
        this.f24575 = new ArrayDeque();
        this.f24576 = new ArrayDeque();
        this.f24571 = new ArrayDeque();
        this.f24580 = true;
        this.f24577 = true;
        this.f24578 = "";
        this.f24570 = "";
        this.f24583 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21253(boolean z) {
        this.f24584 = z;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21252(C18051 c18051) {
        this.f24582 = c18051;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m21256() {
        if (!this.f24584) {
            InterfaceC23125 interfaceC23125 = this.f76890;
            int index = interfaceC23125.index() - this.f76885;
            if (index == 4) {
                int i = 0;
                while (interfaceC23125.mo6203(((-index) - 1) - i) == 60) {
                    i++;
                }
                if ((i & 1) == 0) {
                    return true;
                }
            } else {
                return this.f24583;
            }
        }
        return false;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m21255() {
        if (this.f24584 || !this.f24580) {
            return false;
        }
        InterfaceC23125 interfaceC23125 = this.f76890;
        return (interfaceC23125.mo6203(1) == 42 || interfaceC23125.mo6203(1) == 47) ? false : true;
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m21257() {
        this.f24574++;
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m21251() {
        this.f24575.push(Integer.valueOf(this.f24574));
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m21254() {
        ArrayDeque arrayDeque = this.f24575;
        if (!arrayDeque.isEmpty() && ((Integer) arrayDeque.peek()).intValue() == this.f24574) {
            arrayDeque.pop();
            m52395();
        } else {
            this.f24574--;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b7, code lost:
    
        if (r21.f24570.equals("for") != false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x05fa, code lost:
    
        if (r4.m42110(r1.mo2054()) == false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0609, code lost:
    
        if (r4.m42107(r1.mo2054()) == false) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r2.m42110(r1.mo2054()) == false) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06bf  */
    @Override // l.AbstractC23747, l.InterfaceC1169
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final l.InterfaceC0463 nextToken() {
        /*
            Method dump skipped, instructions count: 2158
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractC7947.nextToken():l.֡ܳ֡");
    }
}

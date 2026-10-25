package l;

import java.util.EmptyStackException;

/* compiled from: U42S */
/* renamed from: l.᩻ܳ֡, reason: contains not printable characters */
/* loaded from: classes.dex */
public abstract class AbstractC23747 extends AbstractC18809 implements InterfaceC1169 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f76879;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f76880;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C21115 f76882;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC0463 f76883;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f76884;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f76887;

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f76888;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC23125 f76890;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC5403 f76886 = C7603.f23492;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f76885 = -1;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17586 f76889 = new C17586();

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f76881 = 0;

    public AbstractC23747(InterfaceC23125 interfaceC23125) {
        this.f76890 = interfaceC23125;
        this.f76882 = new C21115(this, interfaceC23125);
    }

    public InterfaceC0463 nextToken() {
        int i;
        int i2;
        InterfaceC23125 interfaceC23125 = this.f76890;
        if (interfaceC23125 == null) {
            throw new IllegalStateException("nextToken requires a non-null input stream.");
        }
        int mo6200 = interfaceC23125.mo6200();
        while (!this.f76884) {
            try {
                this.f76883 = null;
                this.f76887 = 0;
                this.f76885 = interfaceC23125.index();
                this.f76879 = ((C4264) this.f59356).m12838();
                this.f76880 = ((C4264) this.f59356).m12841();
                do {
                    this.f76888 = 0;
                    try {
                        i = ((C4264) this.f59356).m12831(interfaceC23125, this.f76881);
                    } catch (C6814 e) {
                        m52394(e);
                        if (interfaceC23125.mo6203(1) != -1) {
                            ((C4264) this.f59356).m12836(interfaceC23125);
                        }
                        i = -3;
                    }
                    if (interfaceC23125.mo6203(1) == -1) {
                        this.f76884 = true;
                    }
                    if (this.f76888 == 0) {
                        this.f76888 = i;
                    }
                    i2 = this.f76888;
                    if (i2 == -3) {
                        break;
                    }
                } while (i2 == -2);
                if (this.f76883 == null) {
                    this.f76883 = this.f76886.mo3833(this.f76882, i2, null, this.f76887, this.f76885, interfaceC23125.index() - 1, this.f76880, this.f76879);
                }
                return this.f76883;
            } finally {
                interfaceC23125.mo6207(mo6200);
            }
        }
        m52396();
        return this.f76883;
    }

    @Override // l.InterfaceC1169
    public final int getLine() {
        return ((C4264) this.f59356).m12841();
    }

    @Override // l.InterfaceC1169
    /* renamed from: ֫ */
    public final int mo3967() {
        return ((C4264) this.f59356).m12838();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String m52397() {
        return ((C4264) this.f59356).m12839(this.f76890);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m52395() {
        C17586 c17586 = this.f76889;
        if (!c17586.m41113()) {
            this.f76881 = c17586.m41115(c17586.m41114() - 1);
            return;
        }
        throw new EmptyStackException();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52393(InterfaceC5403 interfaceC5403) {
        this.f76886 = interfaceC5403;
    }

    @Override // l.InterfaceC1169
    /* renamed from: ۧ */
    public final InterfaceC5403 mo3968() {
        return this.f76886;
    }

    @Override // l.InterfaceC1169
    public final InterfaceC23125 getInputStream() {
        return this.f76890;
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0463 m52396() {
        int mo3967 = mo3967();
        int line = getLine();
        InterfaceC0463 mo3833 = this.f76886.mo3833(this.f76882, -1, null, 0, this.f76890.index(), r1.index() - 1, line, mo3967);
        this.f76883 = mo3833;
        return mo3833;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52394(C6814 c6814) {
        int i = this.f76885;
        InterfaceC23125 interfaceC23125 = this.f76890;
        String mo12025 = interfaceC23125.mo12025(C14763.m35067(i, interfaceC23125.index()));
        StringBuilder sb = new StringBuilder("token recognition error at: '");
        StringBuilder sb2 = new StringBuilder();
        for (char c : mo12025.toCharArray()) {
            String valueOf = String.valueOf(c);
            if (c == 65535) {
                valueOf = "<EOF>";
            } else if (c == '\r') {
                valueOf = "\\r";
            } else if (c == '\t') {
                valueOf = "\\t";
            } else if (c == '\n') {
                valueOf = "\\n";
            }
            sb2.append(valueOf);
        }
        sb.append(sb2.toString());
        sb.append("'");
        m43461().mo1935(this, (Object) null, this.f76880, this.f76879, sb.toString(), c6814);
    }
}

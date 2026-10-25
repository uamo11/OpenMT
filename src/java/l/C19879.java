package l;

/* compiled from: Q7RX */
/* renamed from: l.᩶ۖ۠, reason: contains not printable characters */
/* loaded from: classes5.dex */
public class C19879 extends C2986 implements InterfaceC5102 {

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f64171;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f64172;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC0162 f64173;

    @Override // l.InterfaceC5102
    public String getText() {
        return null;
    }

    public C19879(EnumC0162 enumC0162, C3691 c3691, char[] cArr, int i) {
        super(c3691, cArr, i);
        this.f64171 = false;
        this.f64172 = false;
        this.f64173 = enumC0162;
    }

    @Override // l.InterfaceC5102
    public final EnumC0162 getStyle() {
        return this.f64173;
    }

    @Override // l.InterfaceC5102
    public final boolean isDeprecated() {
        if (!this.f64172 && this.f64173 == EnumC0162.JAVADOC) {
            mo45710();
        }
        return this.f64171;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void mo45710() {
        try {
            m29584("/**");
            while (m29593()) {
                m29586();
                while (m29582('*')) {
                    if (m29591('/')) {
                        return;
                    }
                }
                m29586();
                if ((this.f64171 || m29584("@deprecated")) && m29593()) {
                    if (Character.isWhitespace(m29580())) {
                        this.f64171 = true;
                    } else if (m29582('*') && m29591('/')) {
                        this.f64171 = true;
                        return;
                    }
                }
                while (m29593()) {
                    char m29580 = m29580();
                    if (m29580 == '\n' || m29580 == '\r') {
                        m29582('\r');
                        m29582('\n');
                        break;
                    } else if (m29580 != '*') {
                        mo9118();
                    } else {
                        mo9118();
                        if (m29591('/')) {
                            return;
                        }
                    }
                }
            }
        } finally {
            this.f64172 = true;
        }
    }
}

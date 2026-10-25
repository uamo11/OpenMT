package l;

/* compiled from: 4A2K */
/* renamed from: l.۟ۚ᩵, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7270 extends C10093 {

    /* renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C22792 f22340;

    @Override // l.C10093, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // l.C10093
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C12209 mo19515() {
        return this.f22340.m50868();
    }

    public C7270(C22792 c22792, C3618 c3618) {
        super(c22792.m50873(), c3618);
        this.f22340 = c22792;
    }

    @Override // l.C10093, java.io.InputStream
    public final int available() {
        int m47955;
        C22792 c22792 = this.f22340;
        try {
            C12209 m50868 = c22792.m50868();
            try {
                C3618 m29693 = m50868.m29693();
                try {
                    if (m29693.m11100()) {
                        C2745 c2745 = new C2745(1130508, m29693.m11094(), m50868.m29690());
                        c2745.m8491(16);
                        c2745.m8490();
                        m47955 = ((C19679) ((C4156) m29693.m11087(c2745, null, EnumC0214.NO_RETRY)).m12556()).m45255();
                    } else {
                        C6957 c6957 = new C6957(m29693.m11094(), c22792.m50869(), m50868.m29692());
                        C21069 c21069 = new C21069(m29693.m11094());
                        m29693.m11087(c6957, c21069, EnumC0214.NO_RETRY);
                        if (c21069.m41008() != 1 && c21069.m41008() != 4) {
                            m47955 = c21069.m47955();
                        }
                        m50868.m29687();
                        m29693.close();
                        m50868.m29688();
                        return 0;
                    }
                    m29693.close();
                    m50868.m29688();
                    return m47955;
                } finally {
                }
            } finally {
            }
        } catch (C3037 e) {
            throw C10093.m25351(e);
        }
    }
}

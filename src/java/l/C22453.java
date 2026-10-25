package l;

import com.google.android.material.motion.MotionUtils;

/* compiled from: CBF0 */
/* renamed from: l.᩹ᩳܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C22453 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f72718;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18199 f72719;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C12512 f72720;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f72721;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13280 f72722;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f72723;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C12512 f72724;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13985 f72725;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C1971 f72726;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11186 f72727;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C10396 f72728;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public InterfaceC10711 f72729;

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m50379() {
        this.f72722 = C13280.f39762;
    }

    public C22453(String str, boolean z, byte[] bArr) {
        C11186 c11186 = new C11186(bArr);
        if (str == null) {
            throw new NullPointerException("filePath == null");
        }
        this.f72723 = str;
        this.f72727 = c11186;
        this.f72721 = z;
        this.f72718 = -1;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m50390() {
        return this.f72723;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11186 m50388() {
        return this.f72727;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50389() {
        m50373();
        this.f72727.m27752(0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50376() {
        m50373();
        return this.f72718;
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C12512 m50378() {
        m50373();
        return this.f72724;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C12512 m50385() {
        m50373();
        return this.f72720;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C10396 m50387() {
        m50373();
        return this.f72728;
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 m50380() {
        m50373();
        return this.f72729;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10711 m50377(int i, int i2) {
        if (i2 == 0) {
            return C13922.f41594;
        }
        C10396 c10396 = this.f72728;
        if (c10396 == null) {
            throw new IllegalStateException("pool not yet initialized");
        }
        return new C21748(this.f72727, i, i2, c10396);
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    private void m50373() {
        if (this.f72718 == -1) {
            m50374();
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C13217 m50381() {
        if (this.f72725 == null) {
            m50374();
        }
        InterfaceC12575 m33465 = this.f72725.m33465("SourceFile");
        if (m33465 instanceof C18178) {
            return ((C18178) m33465).m42399();
        }
        return null;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C18199 m50382() {
        if (this.f72725 == null) {
            m50374();
        }
        return this.f72719;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C13985 m50383() {
        if (this.f72725 == null) {
            m50374();
        }
        return this.f72725;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1971 m50384() {
        if (this.f72725 == null) {
            m50374();
        }
        return this.f72726;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C19590 m50386() {
        if (this.f72725 == null) {
            m50374();
        }
        C21542 c21542 = (C21542) this.f72725.m33465("BootstrapMethods");
        if (c21542 != null) {
            return c21542.m48701();
        }
        return C19590.f63282;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m50374() {
        String str = this.f72723;
        try {
            m50375();
        } catch (C23158 e) {
            e.m21602("...while parsing " + str);
            throw e;
        } catch (RuntimeException e2) {
            C23158 c23158 = new C23158(null, e2);
            c23158.m21602("...while parsing " + str);
            throw c23158;
        }
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m50375() {
        AbstractC13717 abstractC13717;
        C11186 c11186 = this.f72727;
        if (c11186.m27748() < 10) {
            throw new C23158("severely truncated class file", null);
        }
        boolean z = this.f72721;
        if (z) {
            if (c11186.m27752(0) != -889275714) {
                throw new C23158("bad class file magic (" + C14712.m35008(c11186.m27752(0)) + MotionUtils.EASING_TYPE_FORMAT_END, null);
            }
            int m27753 = c11186.m27753(4);
            int m277532 = c11186.m27753(6);
            if (m27753 < 0 || (m277532 != 53 ? m277532 >= 53 || m277532 < 45 : m27753 > 0)) {
                throw new C23158("unsupported class file version " + c11186.m27753(6) + "." + c11186.m27753(4), null);
            }
        }
        C5520 c5520 = new C5520(c11186);
        C10396 m15654 = c5520.m15654();
        this.f72728 = m15654;
        m15654.mo20349();
        int m15653 = c5520.m15653();
        int m277533 = c11186.m27753(m15653);
        this.f72724 = (C12512) this.f72728.get(c11186.m27753(m15653 + 2));
        int m277534 = c11186.m27753(m15653 + 4);
        C10396 c10396 = this.f72728;
        if (m277534 == 0) {
            c10396.getClass();
            abstractC13717 = null;
        } else {
            abstractC13717 = c10396.get(m277534);
        }
        this.f72720 = (C12512) abstractC13717;
        int m277535 = c11186.m27753(m15653 + 6);
        int i = m15653 + 8;
        this.f72729 = m50377(i, m277535);
        int i2 = (m277535 * 2) + i;
        if (z) {
            String m20309 = this.f72724.m30696().m20309();
            String str = this.f72723;
            if (!str.endsWith(".class") || !str.startsWith(m20309) || str.length() != m20309.length() + 6) {
                throw new C23158(C20087.m46306("class name (", m20309, ") does not match path (", str, MotionUtils.EASING_TYPE_FORMAT_END), null);
            }
        }
        this.f72718 = m277533;
        C20337 c20337 = new C20337(this, this.f72724, i2, this.f72722);
        this.f72726 = c20337.m46666();
        C3403 c3403 = new C3403(this, this.f72724, c20337.m14037(), this.f72722);
        this.f72719 = c3403.m10374();
        C15396 c15396 = new C15396(this, 0, c3403.m14037(), this.f72722);
        C13985 m36435 = c15396.m36435();
        this.f72725 = m36435;
        m36435.mo20349();
        int m36434 = c15396.m36434();
        if (m36434 != c11186.m27748()) {
            throw new C23158("extra bytes at end of class file, at offset ".concat(C14712.m35008(m36434)), null);
        }
    }
}

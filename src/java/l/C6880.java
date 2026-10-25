package l;

/* compiled from: Y7S4 */
/* renamed from: l.ۜܽۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C6880 {

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final AbstractC6079 f21256 = C15045.m35587(EnumC9703.LIST_ITEM_OPEN_TAG, EnumC9703.PARAGRAPH_OPEN_TAG, EnumC9703.HEADER_OPEN_TAG);

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f21257;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f21258;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C8997 f21260;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f21261;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f21262;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f21263;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f21265;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f21269;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f21259 = new StringBuilder();

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20992 f21266 = new C20992();

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C20992 f21267 = new C20992();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20992 f21268 = new C20992();

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public EnumC23813 f21264 = EnumC23813.NONE;

    public C6880(int i) {
        this.f21262 = i;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18630() {
        EnumC23813 enumC23813 = EnumC23813.WHITESPACE;
        EnumC23813 enumC238132 = this.f21264;
        if (enumC23813.compareTo(enumC238132) < 0) {
            enumC23813 = enumC238132;
        }
        this.f21264 = enumC23813;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18631(C8997 c8997) {
        this.f21260 = c8997;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18639() {
        this.f21259.append("/**");
        m18623(EnumC14640.AUTO_INDENT);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18644() {
        StringBuilder sb = this.f21259;
        sb.append("\n");
        m18622(this.f21262 + 1);
        sb.append("*/");
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m18641(C8997 c8997) {
        this.f21263 = false;
        this.f21266.m47802();
        this.f21267.m47802();
        this.f21268.m47802();
        if (this.f21258) {
            if (!this.f21265) {
                m18624();
            } else {
                this.f21265 = false;
                m18627();
            }
        }
        m18626(c8997);
        this.f21265 = true;
    }

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m18634(C8997 c8997) {
        m18624();
        m18626(c8997);
    }

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m18629(C8997 c8997) {
        m18626(c8997);
        m18624();
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m18643(C8997 c8997) {
        m18624();
        m18626(c8997);
        this.f21263 = false;
        this.f21267.m47799();
        this.f21268.m47799();
        m18627();
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m18638(C8997 c8997) {
        m18627();
        this.f21266.m47798();
        this.f21267.m47798();
        m18626(c8997);
        this.f21268.m47798();
        m18624();
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m18637(C8997 c8997) {
        m18627();
        boolean z = this.f21263;
        C20992 c20992 = this.f21266;
        if (z) {
            this.f21263 = false;
            c20992.m47798();
        }
        m18626(c8997);
        this.f21263 = true;
        c20992.m47799();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m18635(C8997 c8997) {
        m18624();
        m18626(c8997);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m18652(C8997 c8997) {
        m18626(c8997);
        m18624();
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m18649(C8997 c8997) {
        if (this.f21258) {
            m18624();
            m18626(c8997);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m18640(C8997 c8997) {
        m18624();
        m18626(c8997);
        m18624();
    }

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final void m18628(C8997 c8997) {
        m18624();
        m18626(c8997);
    }

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m18650(C8997 c8997) {
        m18626(c8997);
        m18624();
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m18646(C8997 c8997) {
        m18626(c8997);
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18648(C8997 c8997) {
        m18626(c8997);
    }

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m18642(C8997 c8997) {
        m18624();
        m18626(c8997);
    }

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m18636(C8997 c8997) {
        m18626(c8997);
        m18624();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m18633(C8997 c8997) {
        m18647();
        m18622(this.f21269);
        m18626(c8997);
        m18627();
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18651(C8997 c8997) {
        m18627();
        m18626(c8997);
        m18627();
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m18645(C8997 c8997) {
        m18626(c8997);
        m18627();
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m18647() {
        m18623(EnumC14640.NO_AUTO_INDENT);
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m18632(C8997 c8997) {
        m18626(c8997);
    }

    public final String toString() {
        return this.f21259.toString();
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m18624() {
        EnumC23813 enumC23813 = EnumC23813.BLANK_LINE;
        EnumC23813 enumC238132 = this.f21264;
        if (enumC23813.compareTo(enumC238132) < 0) {
            enumC23813 = enumC238132;
        }
        this.f21264 = enumC23813;
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m18627() {
        EnumC23813 enumC23813 = EnumC23813.NEWLINE;
        EnumC23813 enumC238132 = this.f21264;
        if (enumC23813.compareTo(enumC238132) < 0) {
            enumC23813 = enumC238132;
        }
        this.f21264 = enumC23813;
    }

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m18626(C8997 c8997) {
        if (this.f21260 != null) {
            m18627();
        }
        EnumC23813 enumC23813 = this.f21264;
        EnumC23813 enumC238132 = EnumC23813.BLANK_LINE;
        if (enumC23813 == enumC238132 && (this.f21268.m47803() || this.f21265)) {
            this.f21264 = EnumC23813.NEWLINE;
        }
        EnumC23813 enumC238133 = this.f21264;
        StringBuilder sb = this.f21259;
        if (enumC238133 != enumC238132) {
            if (enumC238133 == EnumC23813.NEWLINE) {
                m18623(EnumC14640.AUTO_INDENT);
                this.f21264 = EnumC23813.NONE;
            }
        } else {
            sb.append("\n");
            m18622(this.f21262 + 1);
            sb.append("*");
            m18623(EnumC14640.AUTO_INDENT);
            this.f21264 = EnumC23813.NONE;
        }
        int i = this.f21264 == EnumC23813.WHITESPACE ? 1 : 0;
        if (!this.f21257 && c8997.m23237() + i > this.f21261) {
            m18623(EnumC14640.AUTO_INDENT);
        }
        if (!this.f21257 && i != 0) {
            sb.append(" ");
            this.f21261--;
        }
        C8997 c89972 = this.f21260;
        if (c89972 != null) {
            sb.append(c89972.m23236());
            this.f21260 = null;
            this.f21269 = m18625();
            m18627();
            m18626(c8997);
            return;
        }
        sb.append(c8997.m23236());
        if (!f21256.contains(c8997.m23235())) {
            this.f21257 = false;
        }
        this.f21261 -= c8997.m23237();
        this.f21264 = EnumC23813.NONE;
        this.f21258 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18623(EnumC14640 enumC14640) {
        StringBuilder sb = this.f21259;
        sb.append("\n");
        int i = this.f21262;
        m18622(i + 1);
        sb.append("*");
        m18622(1);
        this.f21261 = 97 - i;
        if (enumC14640 == EnumC14640.AUTO_INDENT) {
            m18622(m18625());
            this.f21261 -= m18625();
        }
        this.f21257 = true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private int m18625() {
        int m47800 = (this.f21267.m47800() * 2) + (this.f21266.m47800() * 4);
        return this.f21265 ? m47800 + 4 : m47800;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18622(int i) {
        String str;
        if (i < 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "count is negative: "));
        }
        if (i != 0) {
            str = " ";
            if (i != 1) {
                if (1 > Integer.MAX_VALUE / i) {
                    throw new OutOfMemoryError(C18307.m42645(i, "Repeating 1 bytes String ", " times will produce a String exceeding maximum size."));
                }
                StringBuilder sb = new StringBuilder(i);
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append(" ");
                }
                str = sb.toString();
            }
        } else {
            str = "";
        }
        this.f21259.append(str);
    }
}

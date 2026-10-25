package l;

/* compiled from: U4HR */
/* renamed from: l.ۡ֨ۚ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public abstract class AbstractC8545 extends AbstractC2195 {

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public String f26117;

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C15578 f26118;

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f26122;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f26123;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f26126;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f26124 = new StringBuilder();

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f26125 = false;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f26121 = new StringBuilder();

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f26120 = false;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f26119 = false;

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f26116 = false;

    @Override // l.AbstractC2195
    /* renamed from: ᩻, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public AbstractC8545 mo7259() {
        super.mo7259();
        this.f26117 = null;
        this.f26122 = null;
        AbstractC2195.m7249(this.f26124);
        this.f26123 = null;
        this.f26125 = false;
        AbstractC2195.m7249(this.f26121);
        this.f26126 = null;
        this.f26119 = false;
        this.f26120 = false;
        this.f26116 = false;
        this.f26118 = null;
        return this;
    }

    /* renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m22255() {
        String str;
        if (this.f26118 == null) {
            this.f26118 = new C15578();
        }
        boolean z = this.f26125;
        StringBuilder sb = this.f26121;
        StringBuilder sb2 = this.f26124;
        if (z && this.f26118.size() < 512) {
            String trim = (sb2.length() > 0 ? sb2.toString() : this.f26123).trim();
            if (trim.length() > 0) {
                if (this.f26120) {
                    str = sb.length() > 0 ? sb.toString() : this.f26126;
                } else {
                    str = this.f26119 ? "" : null;
                }
                this.f26118.m36727(trim, str);
            }
        }
        AbstractC2195.m7249(sb2);
        this.f26123 = null;
        this.f26125 = false;
        AbstractC2195.m7249(sb);
        this.f26126 = null;
        this.f26120 = false;
        this.f26119 = false;
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m22252() {
        return this.f26118 != null;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22258() {
        if (this.f26125) {
            m22255();
        }
    }

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String m22251() {
        String str = this.f26117;
        if (str == null || str.length() == 0) {
            throw new C14167("Must be false");
        }
        return this.f26117;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m22257(String str) {
        this.f26117 = str;
        this.f26122 = C23340.m51750(str.trim());
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m22256(String str) {
        String replace = str.replace((char) 0, (char) 65533);
        String str2 = this.f26117;
        if (str2 != null) {
            replace = str2.concat(replace);
        }
        this.f26117 = replace;
        this.f26122 = C23340.m51750(replace.trim());
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22248(String str) {
        String replace = str.replace((char) 0, (char) 65533);
        this.f26125 = true;
        String str2 = this.f26123;
        StringBuilder sb = this.f26124;
        if (str2 != null) {
            sb.append(str2);
            this.f26123 = null;
        }
        if (sb.length() == 0) {
            this.f26123 = replace;
        } else {
            sb.append(replace);
        }
    }

    /* renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m22250() {
        this.f26119 = true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22247(char c) {
        this.f26125 = true;
        String str = this.f26123;
        StringBuilder sb = this.f26124;
        if (str != null) {
            sb.append(str);
            this.f26123 = null;
        }
        sb.append(c);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22249(int[] iArr) {
        this.f26120 = true;
        String str = this.f26126;
        StringBuilder sb = this.f26121;
        if (str != null) {
            sb.append(str);
            this.f26126 = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22253(char c) {
        this.f26120 = true;
        String str = this.f26126;
        StringBuilder sb = this.f26121;
        if (str != null) {
            sb.append(str);
            this.f26126 = null;
        }
        sb.append(c);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m22254(String str) {
        this.f26120 = true;
        String str2 = this.f26126;
        StringBuilder sb = this.f26121;
        if (str2 != null) {
            sb.append(str2);
            this.f26126 = null;
        }
        if (sb.length() == 0) {
            this.f26126 = str;
        } else {
            sb.append(str);
        }
    }
}

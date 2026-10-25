package l;

import android.text.TextUtils;

/* compiled from: F4K0 */
/* renamed from: l.ۤᩳۢ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C10456 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31387;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31388;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31389;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final CharSequence f31390;

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f31391;

    public C10456(int i, int i2, CharSequence charSequence) {
        this.f31390 = charSequence;
        this.f31388 = i;
        this.f31389 = i;
        this.f31387 = i;
        this.f31391 = i2;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26309(char c) {
        int indexOf = TextUtils.indexOf(this.f31390, c, this.f31387);
        if (indexOf == -1 || indexOf >= this.f31391) {
            return false;
        }
        this.f31387 = indexOf + 1;
        return true;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m26315() {
        return this.f31387 >= this.f31391;
    }

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final char m26313() {
        if (m26315()) {
            throw new IndexOutOfBoundsException(String.format("index: %d, max: %d", Integer.valueOf(this.f31387), Integer.valueOf(this.f31391)));
        }
        int i = this.f31387;
        this.f31387 = i + 1;
        return this.f31390.charAt(i);
    }

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m26318() {
        CharSequence charSequence;
        char charAt;
        char charAt2;
        if (m26315()) {
            throw new IndexOutOfBoundsException(String.format("index: %d, max: %d", Integer.valueOf(this.f31387), Integer.valueOf(this.f31391)));
        }
        int i = this.f31387;
        do {
            boolean m26315 = m26315();
            charSequence = this.f31390;
            if (!m26315) {
                int i2 = this.f31387;
                this.f31387 = i2 + 1;
                charAt2 = charSequence.charAt(i2);
                if (charAt2 == '\n') {
                    break;
                }
            } else {
                break;
            }
        } while (charAt2 != '\r');
        int i3 = this.f31387;
        while (!m26315() && ((charAt = charSequence.charAt(this.f31387)) == '\n' || charAt == '\r')) {
            this.f31387++;
        }
        while (i < i3 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        while (i < i3 && charSequence.charAt(i3 - 1) <= ' ') {
            i3--;
        }
        this.f31389 = i;
        this.f31388 = i3;
        return charSequence.subSequence(i, i3).toString();
    }

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m26310() {
        while (!m26315()) {
            char m26313 = m26313();
            if (m26313 != ' ' && m26313 != '\t' && m26313 != '\n' && m26313 != '\r') {
                this.f31387--;
                return;
            }
        }
    }

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m26311() {
        while (!m26315()) {
            char m26313 = m26313();
            if (m26313 == '\"') {
                return true;
            }
            if (m26313 == '\\' && !m26315()) {
                this.f31387++;
            }
        }
        return false;
    }

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m26317() {
        while (!m26315()) {
            char m26313 = m26313();
            if (m26313 == '\'') {
                return true;
            }
            if (m26313 == '\\' && !m26315()) {
                this.f31387++;
            }
        }
        return false;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m26308() {
        char m26313 = m26313();
        if (m26313 == '\"') {
            m26311();
        } else if (m26313 != '\'') {
            int i = 1;
            if (m26313 != '{') {
                while (!m26315()) {
                    char m263132 = m26313();
                    if (m263132 == ' ' || m263132 == '\t' || m263132 == '\n' || m263132 == '\r') {
                        this.f31387--;
                        break;
                    }
                }
            } else {
                while (!m26315()) {
                    char m263133 = m26313();
                    if (m263133 != '\"') {
                        if (m263133 != '\'') {
                            if (m263133 == '{') {
                                i++;
                            } else if (m263133 == '}' && i - 1 == 0) {
                                break;
                            }
                        } else if (!m26317()) {
                            break;
                        }
                    } else if (!m26311()) {
                        break;
                    }
                }
            }
        } else {
            m26317();
        }
        return this.f31387;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m26312() {
        return this.f31387;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m26316() {
        return this.f31389;
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m26314() {
        return this.f31388;
    }
}

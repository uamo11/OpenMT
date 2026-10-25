package l;

/* compiled from: N673 */
/* renamed from: l.ۧۙᩴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C10777 implements InterfaceC14303 {
    public final char a;

    public C10777(char c) {
        this.a = c;
    }

    @Override // l.InterfaceC14303
    public final boolean l(C10071 c10071, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // l.InterfaceC14303
    public final int m(C3015 c3015, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        char c = this.a;
        return (charAt == c || (!c3015.b && (Character.toUpperCase(charAt) == Character.toUpperCase(c) || Character.toLowerCase(charAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}

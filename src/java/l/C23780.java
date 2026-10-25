package l;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: R2LA */
/* renamed from: l.᩻ܶܺ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C23780 extends AbstractC13696 implements Serializable {
    public static final long serialVersionUID = 0;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Pattern f76975;

    public C23780(Pattern pattern) {
        pattern.getClass();
        this.f76975 = pattern;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14607 m52450(CharSequence charSequence) {
        return new C14607(this.f76975.matcher(charSequence));
    }

    public final String toString() {
        return this.f76975.toString();
    }
}

package l;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: 491A */
/* renamed from: l.ۢ۬ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C9601 implements Iterator {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8895 f29132;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29133;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f29134;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C3956 f29136 = new C3956();

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final StringBuilder f29135 = new StringBuilder();

    public C9601(C8895 c8895) {
        String str;
        this.f29132 = c8895;
        str = c8895.f27063;
        this.f29133 = str.length();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        C3956 c3956 = this.f29136;
        c3956.m11998("", "");
        StringBuilder sb = this.f29135;
        sb.setLength(0);
        int i = this.f29134;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        while (true) {
            int i2 = this.f29133;
            if (i < i2) {
                str = this.f29132.f27063;
                char charAt = str.charAt(i);
                if (str2 == null) {
                    if (':' == charAt) {
                        if (sb.length() > 0) {
                            str2 = sb.toString().trim();
                        }
                        sb.setLength(0);
                    } else if (';' == charAt) {
                        sb.setLength(0);
                    } else if (Character.isWhitespace(charAt)) {
                        if (sb.length() > 0) {
                            z = true;
                        }
                    } else if (z) {
                        sb.setLength(0);
                        sb.append(charAt);
                        z = false;
                    } else {
                        sb.append(charAt);
                    }
                } else if (str3 != null) {
                    continue;
                } else if (Character.isWhitespace(charAt)) {
                    if (sb.length() > 0) {
                        sb.append(charAt);
                    }
                } else if (';' == charAt) {
                    str3 = sb.toString().trim();
                    sb.setLength(0);
                    if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                        this.f29134 = i + 1;
                        c3956.m11998(str2, str3);
                        break;
                    }
                } else {
                    sb.append(charAt);
                }
                i++;
            } else if (str2 != null && sb.length() > 0) {
                c3956.m11998(str2, sb.toString().trim());
                this.f29134 = i2;
            }
        }
        return (TextUtils.isEmpty(c3956.m11997()) || TextUtils.isEmpty(c3956.m11999())) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C3956 c3956 = this.f29136;
        String m11997 = c3956.m11997();
        String m11999 = c3956.m11999();
        if (TextUtils.isEmpty(m11997) || TextUtils.isEmpty(m11999)) {
            throw new NoSuchElementException();
        }
        return c3956;
    }
}

package l;

import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.text.style.TypefaceSpan;
import bin.mt.plugin.api.regex.Pattern;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;
import java.util.regex.PatternSyntaxException;

/* compiled from: NATX */
/* renamed from: l.ۨۘܽ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C11459 implements Serializable, Pattern {
    public static final long serialVersionUID = 5073258162644648461L;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f34231;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile transient C1476 f34232;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f34233;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11459 m28260(String str) {
        return new C11459(str, 0);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11459 m28259(int i, String str) {
        return new C11459(str, i);
    }

    @Override // bin.mt.plugin.api.regex.Pattern
    public final String pattern() {
        return this.f34231;
    }

    public final String toString() {
        return this.f34231;
    }

    @Override // bin.mt.plugin.api.regex.Pattern
    public final C12164 matcher(CharSequence charSequence) {
        m28262();
        if (charSequence instanceof InterfaceC4403) {
            charSequence = ((InterfaceC4403) charSequence).mo13128();
        }
        return new C12164(this, charSequence);
    }

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m28265() {
        return m28262().f5292;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m28263(int i) {
        return i > 0 && m28262().m5106(i);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7225 m28264() {
        return m28262().f5291;
    }

    @Override // bin.mt.plugin.api.regex.Pattern
    public final int flags() {
        C1476 c1476 = this.f34232;
        return c1476 == null ? this.f34233 : c1476.f5289;
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m28261(String str) {
        int indexOf = str.indexOf("\\E");
        if (indexOf == -1) {
            return C4860.m14172("\\Q", str, "\\E");
        }
        int length = str.length();
        StringBuilder m32307 = C13325.m32307(length < 2147483639 - length ? length << 1 : 2147483639, "\\Q");
        int i = 0;
        do {
            m32307.append((CharSequence) str, i, indexOf);
            m32307.append("\\E\\\\E\\Q");
            i = indexOf + 2;
            indexOf = str.indexOf("\\E", i);
        } while (indexOf != -1);
        m32307.append((CharSequence) str, i, str.length());
        m32307.append("\\E");
        return m32307.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.f34231.isEmpty()) {
            this.f34232 = C21065.m47923(this.f34233, this.f34231);
        }
    }

    public C11459(String str, int i) {
        if ((i & (-1024)) != 0) {
            throw new IllegalArgumentException(C13540.m32584(new StringBuilder("Unknown flag 0x"), i));
        }
        this.f34231 = str;
        i = (i & 256) != 0 ? i | 64 : i;
        this.f34233 = i;
        this.f34232 = C21065.m47923(i, str);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SpannableStringBuilder m28258(PatternSyntaxException patternSyntaxException) {
        String message = patternSyntaxException.getMessage();
        C11003.requireNonNull(message);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(message);
        int lastIndexOf = message.lastIndexOf(10);
        if (lastIndexOf != -1) {
            lastIndexOf = message.lastIndexOf(10, lastIndexOf - 1);
        }
        if (lastIndexOf != -1) {
            spannableStringBuilder.setSpan(new TypefaceSpan("monospace"), lastIndexOf, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.8f), lastIndexOf, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C1476 m28262() {
        C1476 c1476;
        C1476 c14762 = this.f34232;
        if (c14762 != null) {
            return c14762;
        }
        synchronized (this) {
            c1476 = this.f34232;
            if (c1476 == null) {
                c1476 = C21065.m47923(this.f34233, this.f34231);
                this.f34232 = c1476;
            }
        }
        return c1476;
    }

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map m28266() {
        C1476 c1476 = this.f34232;
        return c1476 == null ? Collections.EMPTY_MAP : c1476.f5286;
    }

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map m28267() {
        return m28266();
    }
}

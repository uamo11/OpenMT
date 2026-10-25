package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: DBEE */
/* renamed from: l.ۙۙ᩵, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C4427 implements Serializable {

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Pattern f14160;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m13149(CharSequence charSequence) {
        C11233.m27805(charSequence, "input");
        return this.f14160.matcher(charSequence).matches();
    }

    public C4427(Pattern pattern) {
        this.f14160 = pattern;
    }

    public C4427(String str) {
        Pattern compile = Pattern.compile(str);
        C11233.m27803(compile, "compile(...)");
        this.f14160 = compile;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m13148(String str) {
        String replaceAll = this.f14160.matcher(str).replaceAll("$1 $2");
        C11233.m27803(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    public final String toString() {
        String pattern = this.f14160.toString();
        C11233.m27803(pattern, "toString(...)");
        return pattern;
    }

    private final Object writeReplace() {
        Pattern pattern = this.f14160;
        String pattern2 = pattern.pattern();
        C11233.m27803(pattern2, "pattern(...)");
        return new C19950(pattern2, pattern.flags());
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }
}

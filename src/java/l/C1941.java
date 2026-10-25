package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: T4T4 */
/* renamed from: l.֫ܽۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C1941 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f6489;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f6490;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m6399(String str) {
        if (!this.f6489.startsWith(str)) {
            return false;
        }
        this.f6490 = str.length();
        return true;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m6400(Pattern pattern) {
        Matcher matcher = pattern.matcher(this.f6489);
        if (!matcher.find()) {
            return false;
        }
        C4025.m12110(matcher.start() == 0);
        this.f6490 = matcher.end();
        return true;
    }
}

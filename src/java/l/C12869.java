package l;

import java.util.regex.PatternSyntaxException;

/* compiled from: EAZB */
/* renamed from: l.۬ۘܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C12869 extends PatternSyntaxException {
    public static final long serialVersionUID = -3864639126226059218L;

    @Override // java.util.regex.PatternSyntaxException, java.lang.Throwable
    public final String getMessage() {
        int index = getIndex();
        String description = getDescription();
        String pattern = getPattern();
        StringBuilder m15339 = C5368.m15339(description);
        if (index >= 0) {
            m15339.append(" near index ");
            m15339.append(index);
        }
        m15339.append(System.lineSeparator());
        m15339.append(pattern);
        if (index >= 0 && pattern != null && index < pattern.length()) {
            m15339.append(System.lineSeparator());
            for (int i = 0; i < index; i++) {
                char c = '\t';
                if (pattern.charAt(i) != '\t') {
                    c = ' ';
                }
                m15339.append(c);
            }
            m15339.append('^');
        }
        return m15339.toString();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String localizedMessage = getLocalizedMessage();
        return localizedMessage != null ? "PatternSyntaxException: ".concat(localizedMessage) : "PatternSyntaxException";
    }
}

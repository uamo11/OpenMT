package l;

/* compiled from: 26O7 */
/* renamed from: l.ۚᩳۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C5517 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C11459 f17074 = C11459.m28260(" *+(?<directive>\\.class) ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<type>L[^;\\r\\n]*+;)");

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final C11459 f17079 = C11459.m28260(" *+(?<directive>\\.)method ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n(]++) *+\\( *+(?<parameters>[^ \\r\\n)]*+) *+\\) *+(?<type>\\[*+(?:[VCZBISJDF]|L[^;\\r\\n]*+;))");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C11459 f17076 = C11459.m28260(" *+(?<directive>\\.)field ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n:]++) *+: *+(?<type>\\[*+(?:[VCZBISJDF]|L[^;\\r\\n]*+;))(?: *+= *+(?<value>[^ \\f\\t\\r\\n\\u00a0\\u1680\\u180e\\u2000-\\u200a\\u2028\\u2029\\u202f\\u205f\\u3000\\ufeff]++))?+");

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C11459 f17077 = C11459.m28260(" *+\\.end ++method");

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C11459 f17078 = C11459.m28260(" *+\\.end ++field");

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C11459 f17075 = C11459.m28260(" *+(?:const-string(?:/jumbo)?+ ++[vp][0-9]++ *+,|\\.field [^\\r\\n=]++=) *+\"");

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C11459 f17081 = C11459.m28260("method ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n(]++) *+\\( *+(?<parameters>[^ \\r\\n)]*+) *+\\) *+(?<type>[^ \\r\\n]++)");

    /* renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C11459 f17080 = C11459.m28260("field ++(?<modifiers>(?:(?>public|private|protected|static|final|synchronized|volatile|bridge|transient|varargs|native|interface|abstract|strictfp|synthetic|annotation|enum|constructor|declared-synchronized|whitelist|greylist-max-o|greylist-max-p|greylist-max-q|greylist-max-r|greylist|blacklist|core-platform-api|test-api) ++)*+)(?<name>[^ \\r\\n:]++) *+: *+(?<type>[^ \\r\\n=]++)");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r0.charAt(r8) == '\n') goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x002a, code lost:
    
        if (r7.lookingAt(r8) != false) goto L31;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m15649(l.C12164 r7, int r8) {
        /*
            java.lang.CharSequence r0 = r7.getText()
            int r1 = r0.length()
            if (r8 < r1) goto Lb
            goto L52
        Lb:
            r2 = 13
            r3 = 10
            r4 = 1
            if (r8 == 0) goto L26
            int r5 = r8 + (-1)
            char r6 = r0.charAt(r5)
            if (r6 == r3) goto L26
            char r5 = r0.charAt(r5)
            if (r5 != r2) goto L2d
            char r5 = r0.charAt(r8)
            if (r5 == r3) goto L2d
        L26:
            boolean r5 = r7.lookingAt(r8)
            if (r5 == 0) goto L2d
            goto L4f
        L2d:
            if (r8 >= r1) goto L52
            char r5 = r0.charAt(r8)
            if (r5 == r2) goto L38
            if (r5 == r3) goto L38
            goto L50
        L38:
            if (r5 != r2) goto L45
            int r5 = r8 + 1
            if (r5 >= r1) goto L45
            char r6 = r0.charAt(r5)
            if (r6 != r3) goto L45
            r8 = r5
        L45:
            int r5 = r8 + 1
            if (r5 >= r1) goto L50
            boolean r5 = r7.lookingAt(r5)
            if (r5 == 0) goto L50
        L4f:
            return r4
        L50:
            int r8 = r8 + r4
            goto L2d
        L52:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5517.m15649(l.۫ۘܽ, int):boolean");
    }
}

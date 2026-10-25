package l;

/* compiled from: 068W */
/* renamed from: l.ᩴᩳܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18928 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C11459 f59644 = C11459.m28260("<[^<>\\s]+>?");

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C11459 f59645 = C11459.m28260("[/?]?>");

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0114, code lost:
    
        if (m43683(r13, r14, r15) != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0116, code lost:
    
        ((l.C16062) r15).mo1090();
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x011b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m43684(java.lang.CharSequence r13, int r14, l.InterfaceC2700 r15) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18928.m43684(java.lang.CharSequence, int, l.ۖᩳܿ):void");
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m43683(CharSequence charSequence, int i, InterfaceC2700 interfaceC2700) {
        C15356 c15356;
        StringBuilder sb = new StringBuilder();
        while (true) {
            i--;
            if (i < 0) {
                break;
            }
            char charAt = charSequence.charAt(i);
            if (Character.isWhitespace(charAt)) {
                break;
            }
            sb.insert(0, charAt);
        }
        if (sb.length() <= 0 || sb.charAt(0) != '<') {
            return false;
        }
        sb.deleteCharAt(0);
        c15356 = ((C16062) interfaceC2700).f49531.f59529;
        c15356.clear();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0120, code lost:
    
        return true;
     */
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m43682(java.lang.CharSequence r7, int r8, int r9, int r10, l.InterfaceC2700 r11) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C18928.m43682(java.lang.CharSequence, int, int, int, l.ۖᩳܿ):boolean");
    }
}

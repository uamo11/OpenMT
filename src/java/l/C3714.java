package l;

/* compiled from: D6O1 */
/* renamed from: l.ۘۙۢ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3714 {
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11298(InterfaceC0463 interfaceC0463, InterfaceC0463 interfaceC04632) {
        if (interfaceC0463 == null || interfaceC04632 == null) {
            return false;
        }
        String text = interfaceC0463.getText();
        String text2 = interfaceC04632.getText();
        C23218 c23218 = new C23218(new C20813(C16014.m37867(text, text2)));
        c23218.m43458();
        InterfaceC0463 nextToken = c23218.nextToken();
        if (nextToken.getType() == interfaceC0463.getType() && nextToken.mo2053() + 1 == text.length()) {
            InterfaceC0463 nextToken2 = c23218.nextToken();
            if (nextToken2.getType() == interfaceC04632.getType() && nextToken2.mo2054() == text.length()) {
                if (nextToken2.mo2053() + 1 == text2.length() + text.length()) {
                    return false;
                }
            }
        }
        return true;
    }
}

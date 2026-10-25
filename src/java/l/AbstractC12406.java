package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Z6PP */
/* renamed from: l.۫۫ۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC12406 extends AbstractC23747 {

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Set f37359;

    /* renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final HashMap f37360;

    /* renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f37361;

    /* renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C3234 f37362;

    /* renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f37363;

    /* renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C23634 f37364;

    /* renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public String f37365;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f37366;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f37367;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f37368;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m30574(char c) {
        return c == ' ' || c == '\t' || c == '\r' || c == '\n' || c == '\f';
    }

    static {
        Object[] objArr = {"script", "style", "title", "textarea", "xmp", "iframe", "noembed", "noframes", "noscript", "plaintext"};
        HashSet hashSet = new HashSet(10);
        for (int i = 0; i < 10; i++) {
            Object obj = objArr[i];
            C11003.requireNonNull(obj);
            if (!hashSet.add(obj)) {
                throw new IllegalArgumentException(C5368.m15337(obj, "duplicate element: "));
            }
        }
        f37359 = C20195.unmodifiableSet(hashSet);
    }

    public AbstractC12406(C20813 c20813) {
        super(c20813);
        this.f37362 = new C3234();
        this.f37360 = new HashMap();
        CharSequence m47631 = c20813.m47631();
        this.f37364 = m47631 instanceof C23634 ? (C23634) m47631 : null;
    }

    /* renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m30578() {
        return this.f37366;
    }

    @Override // l.AbstractC23747, l.InterfaceC1169
    public final InterfaceC0463 nextToken() {
        C20813.m47630();
        if (this.f37366) {
            return m52396();
        }
        if (this.f37367 != null) {
            InterfaceC23125 interfaceC23125 = this.f76890;
            if (interfaceC23125.mo6203(1) != -1) {
                int index = interfaceC23125.index();
                CharSequence m47631 = ((C20813) interfaceC23125).m47631();
                int length = (this.f37367.equals("plaintext") ? m47631.length() : m30576(this.f37367, m47631, index)) - index;
                this.f37367 = null;
                if (length > 0) {
                    C13952 c13952 = new C13952(this.f76882, 1, 0, index, (index + length) - 1);
                    c13952.m33393(getLine());
                    c13952.m33391(mo3967());
                    for (int i = 0; i < length; i++) {
                        ((C4264) m43460()).m12836(interfaceC23125);
                    }
                    return c13952;
                }
            }
        }
        InterfaceC0463 nextToken = super.nextToken();
        C23634 c23634 = this.f37364;
        if (c23634 == null || nextToken.getType() != 14 || this.f37368 != null || !c23634.m52128(nextToken.mo2054(), nextToken.mo2053() + 1)) {
            C3234 c3234 = this.f37362;
            if (c23634 != null && !this.f37361 && c23634.m52128(nextToken.mo2054(), nextToken.mo2053() + 1)) {
                boolean z = nextToken.getType() != 19 || this.f37365 == null;
                if (!"annotation-xml".equals(this.f37368)) {
                }
            }
            int type = nextToken.getType();
            HashMap hashMap = this.f37360;
            if (type == 6 || type == 7) {
                this.f37368 = null;
                this.f37361 = nextToken.getType() == 6;
                hashMap.clear();
                this.f37365 = null;
                return nextToken;
            }
            if (type == 10 || type == 11) {
                boolean z2 = nextToken.getType() == 10;
                String str = this.f37368;
                if (str != null) {
                    if (this.f37361) {
                        c3234.m9910(str);
                    } else if (c3234.m9911(str, hashMap, z2, null).f14735 == 0 && f37359.contains(this.f37368)) {
                        this.f37367 = this.f37368;
                    }
                }
                this.f37368 = null;
                return nextToken;
            }
            if (type == 14) {
                if (this.f37368 == null) {
                    this.f37368 = m30573(nextToken.getText());
                    return nextToken;
                }
                String m30573 = m30573(nextToken.getText());
                this.f37365 = m30573;
                boolean containsKey = hashMap.containsKey(m30573);
                this.f37363 = !containsKey;
                if (!containsKey) {
                    hashMap.put(this.f37365, "");
                }
            } else if (type == 19 || type == 20) {
                if (this.f37365 != null && this.f37363) {
                    String text = nextToken.getText();
                    if (nextToken.getType() == 19 && text.length() >= 2) {
                        text = C15472.m36561(1, 1, text);
                    }
                    hashMap.put(this.f37365, text);
                }
                this.f37365 = null;
                return nextToken;
            }
            return nextToken;
        }
        this.f37366 = true;
        return m52396();
    }

    /* renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m30577() {
        int min;
        C4645 m9909 = this.f37362.m9909();
        InterfaceC23125 interfaceC23125 = this.f76890;
        if (m9909 == null || m9909.f14735 == 0) {
            while (interfaceC23125.mo6203(1) != -1) {
                int mo6203 = interfaceC23125.mo6203(1);
                ((C4264) m43460()).m12836(interfaceC23125);
                if (mo6203 == 62) {
                    break;
                }
            }
            this.f76888 = 2;
            return;
        }
        while (true) {
            while (interfaceC23125.mo6203(1) != -1) {
                int mo62032 = interfaceC23125.mo6203(1);
                ((C4264) m43460()).m12836(interfaceC23125);
                if (mo62032 == 62 && min >= 2) {
                    return;
                } else {
                    min = mo62032 == 93 ? Math.min(2, min + 1) : 0;
                }
            }
            return;
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m30572(CharSequence charSequence, String str) {
        return m30576(str, charSequence, 0);
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m30576(String str, CharSequence charSequence, int i) {
        boolean equals = str.equals("script");
        String concat = "</".concat(str);
        char c = 0;
        int i2 = 0;
        while (i < charSequence.length()) {
            if ((i & 1023) == 0) {
                C20813.m47630();
            }
            if (equals) {
                if (c == 0 && C2732.m8477(charSequence, false, i, "<!--", 4)) {
                    i += 3;
                    c = 1;
                    i2 = 2;
                } else {
                    if (c != 0) {
                        char charAt = charSequence.charAt(i);
                        if (charAt == '-') {
                            i2 = Math.min(2, i2 + 1);
                        } else {
                            if (charAt == '>' && i2 == 2) {
                                c = 0;
                            }
                            i2 = 0;
                        }
                    }
                    if (c == 1 && m30575("<script", charSequence, i)) {
                        i += 6;
                        c = 2;
                    } else if (c == 2 && m30575("</script", charSequence, i)) {
                        i += 7;
                        c = 1;
                    }
                    i2 = 0;
                }
                i++;
            }
            if (c != 2 && m30575(concat, charSequence, i)) {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m30575(String str, CharSequence charSequence, int i) {
        int length = str.length() + i;
        if (length >= charSequence.length()) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = charSequence.charAt(i + i2);
            if (charAt >= 'A' && charAt <= 'Z') {
                charAt = (char) (charAt + ' ');
            }
            if (charAt != str.charAt(i2)) {
                return false;
            }
        }
        char charAt2 = charSequence.charAt(length);
        return charAt2 == '>' || charAt2 == '/' || m30574(charAt2);
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m30573(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= 'A' && charAt <= 'Z') {
                charAt = (char) (charAt + ' ');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}

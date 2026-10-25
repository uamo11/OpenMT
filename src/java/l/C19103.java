package l;

import java.util.HashMap;

/* compiled from: 07SP */
/* renamed from: l.᩵֡֡, reason: contains not printable characters */
/* loaded from: classes5.dex */
public final class C19103 implements InterfaceC17006 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f60177 = new HashMap();

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f60178 = false;

    @Override // l.InterfaceC17006
    /* renamed from: ֫ */
    public final C4286 mo10955(C23188 c23188) {
        C20535 c20535;
        C9246 m51434 = c23188.m51434();
        C20535 m23724 = m51434.m23724();
        int m23722 = m51434.m23722('`');
        C20535 m237242 = m51434.m23724();
        boolean z = this.f60178;
        HashMap hashMap = this.f60177;
        if (z && ((c20535 = (C20535) hashMap.get(Integer.valueOf(m23722))) == null || c20535.compareTo(m23724) <= 0)) {
            return new C4286(new C12897(m51434.m23718(m23724, m237242).m41444()), m237242);
        }
        while (m51434.m23716('`') > 0) {
            C20535 m237243 = m51434.m23724();
            int m237222 = m51434.m23722('`');
            hashMap.put(Integer.valueOf(m237222), m237243);
            if (m237222 == m23722) {
                C7108 c7108 = new C7108();
                String replace = m51434.m23718(m237242, m237243).m41444().replace('\n', ' ');
                if (replace.length() >= 3) {
                    int i = 0;
                    if (replace.charAt(0) == ' ' && C7416.m19937(1, replace) == ' ') {
                        int length = replace.length();
                        while (true) {
                            if (i >= length) {
                                i = length;
                                break;
                            }
                            if (replace.charAt(i) != ' ') {
                                break;
                            }
                            i++;
                        }
                        if (i != length) {
                            replace = C15472.m36561(1, 1, replace);
                        }
                    }
                }
                c7108.m19122(replace);
                return new C4286(c7108, m51434.m23724());
            }
        }
        this.f60178 = true;
        return new C4286(new C12897(m51434.m23718(m23724, m237242).m41444()), m237242);
    }
}

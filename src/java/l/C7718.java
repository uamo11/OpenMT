package l;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: U8LZ */
/* renamed from: l.۟᩷ۧ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C7718 {

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f23851 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f23852 = -1;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f23853 = -1;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m20671(C23896 c23896) {
        for (int i = 0; i < c23896.m52639(); i++) {
            InterfaceC14723 m52640 = c23896.m52640(i);
            if (m52640 instanceof C1927) {
                C1927 c1927 = (C1927) m52640;
                if ("iTunSMPB".equals(c1927.f6464) && m20670(c1927.f6466)) {
                    return;
                }
            } else if (m52640 instanceof C6866) {
                C6866 c6866 = (C6866) m52640;
                if ("com.apple.iTunes".equals(c6866.f21224) && "iTunSMPB".equals(c6866.f21223) && m20670(c6866.f21225)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20670(String str) {
        Matcher matcher = f23851.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            String str2 = C3603.f11424;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f23852 = parseInt;
            this.f23853 = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}

package l;

import java.util.regex.Pattern;

/* compiled from: U7TB */
/* renamed from: l.ۘ֡֡, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C3580 implements InterfaceC17006 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f11364 = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // l.InterfaceC17006
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4286 mo10955(C23188 c23188) {
        C9246 m51434 = c23188.m51434();
        m51434.m23723();
        char m23725 = m51434.m23725();
        if (m23725 == '\n') {
            m51434.m23723();
            return new C4286(new C23481(), m51434.m23724());
        }
        if (!f11364.matcher(String.valueOf(m23725)).matches()) {
            return new C4286(new C12897("\\"), m51434.m23724());
        }
        m51434.m23723();
        return new C4286(new C12897(String.valueOf(m23725)), m51434.m23724());
    }
}

package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: 6A8E */
/* renamed from: l.ܶ᩹ۘ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C15514 implements InterfaceC13431 {

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f47414;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f47415;

    public C15514(String str, String str2) {
        this.f47415 = str;
        this.f47414 = str2;
    }

    @Override // l.InterfaceC13431
    /* renamed from: ֫ */
    public final C8743 mo10819(C18621 c18621) {
        if (c18621.m43168().m22615("Authorization") != null) {
            return null;
        }
        int i = C14746.f45027;
        Charset charset = StandardCharsets.UTF_8;
        String m2046 = C0459.m2046(this.f47415, this.f47414);
        C9449 m22618 = c18621.m43168().m22618();
        m22618.m24283("Authorization", m2046);
        return m22618.m24274();
    }
}

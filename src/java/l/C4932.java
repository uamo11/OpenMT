package l;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: QABT */
/* renamed from: l.ۙ᩹ۘ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4932 implements InterfaceC23037 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f15563;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f15564;

    public C4932(String str, String str2) {
        this.f15564 = str;
        this.f15563 = str2;
    }

    @Override // l.InterfaceC23037
    /* renamed from: ֫ */
    public final C18621 mo7384(C7855 c7855) {
        C9449 m22618 = c7855.m21045().m22618();
        int i = C14746.f45027;
        Charset charset = StandardCharsets.UTF_8;
        m22618.m24283("Authorization", C0459.m2046(this.f15564, this.f15563));
        return c7855.m21036(m22618.m24274());
    }
}

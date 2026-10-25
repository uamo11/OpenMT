package l;

import java.nio.charset.Charset;

/* compiled from: 19KT */
/* renamed from: l.ۙۤۖ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4579 implements InterfaceC18691 {
    @Override // l.InterfaceC18691
    /* renamed from: ֫ */
    public final EnumC10930 mo3621() {
        return EnumC10930.FileIdBothDirectoryInformation;
    }

    @Override // l.InterfaceC18691
    /* renamed from: ֫ */
    public final InterfaceC0345 mo3620(C10325 c10325) {
        long m26082 = c10325.m26082();
        c10325.m26082();
        C13811.m33143(c10325);
        C13811.m33143(c10325);
        C22984 m33143 = C13811.m33143(c10325);
        C22984 m331432 = C13811.m33143(c10325);
        long m26084 = c10325.m26084();
        c10325.m26084();
        long m260822 = c10325.m26082();
        long m260823 = c10325.m26082();
        c10325.m26082();
        byte m26095 = c10325.m26095();
        c10325.m26095();
        byte[] bArr = new byte[24];
        c10325.m26087(24, bArr);
        Charset charset = C8208.f25225;
        new String(bArr, 0, m26095, charset);
        c10325.m26100();
        c10325.m26090();
        return new C2463(m26082, c10325.m26073(((int) m260823) / 2, charset), m33143, m331432, m26084, m260822);
    }
}

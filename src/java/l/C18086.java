package l;

import java.nio.charset.Charset;
import java.util.Random;
import org.bouncycastle.util.Arrays;

/* compiled from: W9GW */
/* renamed from: l.ᩳܰۖ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C18086 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Random f56321;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2215 f56322;

    public C18086(Random random, C2215 c2215) {
        this.f56321 = random;
        this.f56322 = c2215;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11031 m42158(String str, String str2, char[] cArr, C14557 c14557, long j, C8914 c8914) {
        byte[] bArr = new byte[8];
        this.f56321.nextBytes(bArr);
        byte[] m42159 = m42159(String.valueOf(cArr), str, str2);
        byte[] m421592 = m42159(String.valueOf(cArr), str, str2);
        byte[] m34746 = c14557.m34746();
        C12441 c12441 = new C12441();
        C2215 c2215 = this.f56322;
        byte[] m39201 = C16674.m39201(c2215, m421592, m34746, bArr);
        c12441.m26077(m39201.length, m39201);
        c12441.m26077(8, bArr);
        byte[] m26098 = c12441.m26098();
        byte[] m347462 = c14557.m34746();
        C12441 c124412 = new C12441();
        c124412.m26075((byte) 1);
        c124412.m26075((byte) 1);
        c124412.m26086(0);
        c124412.m26088(0L);
        c124412.m26078(j);
        c124412.m26077(8, bArr);
        c124412.m26088(0L);
        if (c8914 != null) {
            c8914.m22986(c124412);
        }
        c124412.m26088(0L);
        byte[] m260982 = c124412.m26098();
        byte[] m392012 = C16674.m39201(c2215, m42159, m347462, m260982);
        byte[] bArr2 = new byte[m392012.length + m260982.length];
        System.arraycopy(m392012, 0, bArr2, 0, m392012.length);
        System.arraycopy(m260982, 0, bArr2, m392012.length, m260982.length);
        return new C11031(bArr2, m26098, C16674.m39201(c2215, m42159, Arrays.copyOfRange(bArr2, 0, 16)));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m42159(String str, String str2, String str3) {
        byte[] bytes;
        C2215 c2215 = this.f56322;
        if (str == null) {
            Charset charset = C16674.f51186;
            bytes = new byte[0];
        } else {
            bytes = str.getBytes(C16674.f51186);
        }
        try {
            c2215.getClass();
            C15619 m7389 = C2215.m7389("MD4");
            m7389.m36816(bytes);
            byte[] m36818 = m7389.m36818();
            String upperCase = str2.toUpperCase();
            return C16674.m39201(c2215, m36818, upperCase == null ? new byte[0] : upperCase.getBytes(C16674.f51186), str3 == null ? new byte[0] : str3.getBytes(C16674.f51186));
        } catch (C8024 e) {
            throw new C4952(e);
        }
    }
}

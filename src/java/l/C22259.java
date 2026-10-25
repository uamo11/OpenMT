package l;

import java.util.EnumSet;
import java.util.Set;

/* compiled from: S9GP */
/* renamed from: l.᩹ۨۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C22259 extends C16614 {

    /* renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Set f72224;

    /* renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final Set f72225;

    /* renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C16594 f72226;

    /* renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC7983 f72227;

    /* renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Set f72228;

    /* renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC11511 f72229;

    /* renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Set f72230;

    public C22259(EnumC22094 enumC22094, long j, long j2, EnumC11511 enumC11511, Set set, Set set2, Set set3, EnumC7983 enumC7983, Set set4, C16594 c16594) {
        super(57, enumC22094, EnumC22799.SMB2_CREATE, j, j2);
        this.f72229 = enumC11511 != null ? enumC11511 : EnumC11511.Identification;
        this.f72228 = set;
        this.f72224 = set2 == null ? EnumSet.noneOf(EnumC1757.class) : set2;
        this.f72225 = set3 == null ? EnumSet.noneOf(EnumC6737.class) : set3;
        this.f72227 = enumC7983 != null ? enumC7983 : EnumC7983.FILE_OPEN_IF;
        this.f72230 = set4 == null ? EnumSet.noneOf(EnumC15037.class) : set4;
        this.f72226 = c16594;
    }

    @Override // l.C16614
    /* renamed from: ᩳ */
    public final void mo8728(C0097 c0097) {
        byte[] bArr;
        int i = this.f51046;
        c0097.m26086(i);
        c0097.m26075((byte) 0);
        c0097.m26075((byte) 0);
        c0097.m26088(this.f72229.getValue());
        c0097.m1082(8);
        c0097.m1082(8);
        c0097.m26088(C15262.m36277(this.f72228));
        c0097.m26088(C15262.m36277(this.f72224));
        c0097.m26088(C15262.m36277(this.f72225));
        c0097.m26088(this.f72227.getValue());
        c0097.m26088(C15262.m36277(this.f72230));
        int i2 = i + 63;
        String m39094 = this.f72226.m39094();
        if (m39094 == null || m39094.trim().length() == 0) {
            c0097.m26086(i2);
            c0097.m26086(0);
            bArr = new byte[1];
        } else {
            bArr = C10100.m25370(m39094);
            c0097.m26086(i2);
            c0097.m26086(bArr.length);
        }
        c0097.m26088(0L);
        c0097.m26088(0L);
        c0097.m26077(bArr.length, bArr);
    }
}

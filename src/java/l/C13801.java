package l;

import java.util.zip.CRC32;

/* compiled from: 964V */
/* renamed from: l.ܰۨܿ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C13801 extends AbstractC21191 {

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ CRC32 f41128;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13801(InterfaceC17066 interfaceC17066, CRC32 crc32) {
        super(interfaceC17066);
        this.f41128 = crc32;
    }

    @Override // l.AbstractC21191
    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo33114(byte[] bArr, int i, int i2) {
        this.f41128.update(bArr, i, i2);
    }
}

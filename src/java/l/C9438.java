package l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* compiled from: I7D9 */
/* renamed from: l.ۢ۟ۚ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C9438 extends C6759 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public StringBuilder f28618;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC20727 f28619;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public ArrayList f28620;

    @Override // l.C6759
    /* renamed from: ܽ */
    public final int mo5678() {
        int ordinal = this.f28619.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return this.f28618.toString().getBytes(StandardCharsets.UTF_8).length;
        }
        if (ordinal != 2) {
            throw new IncompatibleClassChangeError();
        }
        return this.f28620.size();
    }

    @Override // l.C6759, l.InterfaceC1800
    /* renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) {
        super.mo2828(interfaceC0408);
        int ordinal = this.f28619.ordinal();
        if (ordinal == 0) {
            ((C6053) interfaceC0408).m16881();
            return;
        }
        if (ordinal == 1) {
            ((C6053) interfaceC0408).m16886(this.f28618.toString());
            return;
        }
        if (ordinal != 2) {
            return;
        }
        ArrayList arrayList = this.f28620;
        int i = C23424.f75225;
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i2 = 0; i2 < size; i2++) {
            bArr[i2] = ((Byte) arrayList.get(i2)).byteValue();
        }
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.getClass();
        c6053.m16883(size, bArr);
    }
}

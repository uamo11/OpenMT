package l;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: M7AP */
/* renamed from: l.ܳۚۢ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C14317 extends InputStream implements InterfaceC14905 {

    /* renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f43174;

    /* renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f43175 = new byte[8192];

    /* renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f43176;

    /* renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f43177;

    /* renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final CharSequence f43178;

    /* renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final byte[] f43179;

    /* renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f43180;

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C14317(byte[] bArr, CharSequence charSequence) {
        this.f43179 = bArr;
        this.f43178 = charSequence;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = new byte[1];
        if (read(bArr, 0, 1) < 0) {
            return -1;
        }
        return bArr[0] & 255;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8 A[SYNTHETIC] */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C14317.read(byte[], int, int):int");
    }
}

package l;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipOutputStream;

/* compiled from: S50A */
/* renamed from: l.ۗܶۖ, reason: contains not printable characters */
/* loaded from: classes2.dex */
public final class C3310 {

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC8693 f10378;

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9871 f10379;

    /* renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f10380;

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3310 m10119(ByteBuffer byteBuffer) {
        return new C3310(new C9871(byteBuffer));
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3310 m10118(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return new C3310(new C9871(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())));
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public C3310(C9871 c9871) {
        this.f10379 = c9871;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m10122() {
        C4205 c4205 = new C4205();
        C9871 c9871 = this.f10379;
        c4205.mo12699(c9871.m24962());
        c9871.m24961(c4205, 0, this.f10380 | 32);
        Object[] objArr = {null};
        new C4721(this).m4034(c4205, new C15303(objArr), new C19277(1L));
        return (byte[]) objArr[0];
    }

    /* renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10123() {
        this.f10380 |= 1;
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10120(OutputStream outputStream) {
        if (!(outputStream instanceof BufferedOutputStream)) {
            outputStream = new BufferedOutputStream(outputStream);
        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(outputStream);
        C4205 c4205 = new C4205();
        C4721 c4721 = new C4721(this);
        C22360 c22360 = new C22360(zipOutputStream);
        C9871 c9871 = this.f10379;
        C19277 c19277 = new C19277(c9871.m24958());
        c19277.m44459(this.f10378);
        c9871.m24960(new C20244(c4205, c4205, c4721, c22360, c19277), this.f10380 | 32);
        zipOutputStream.close();
    }

    /* renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10121(InterfaceC8693 interfaceC8693) {
        this.f10378 = interfaceC8693;
    }
}

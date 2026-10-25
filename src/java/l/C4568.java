package l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPInputStream;

/* compiled from: T5RH */
/* renamed from: l.ۙۢܽ, reason: contains not printable characters */
/* loaded from: classes3.dex */
public final class C4568 implements InterfaceC2452 {
    @Override // l.InterfaceC2452
    /* renamed from: ֫ */
    public final void mo1728(C16040 c16040) {
        byte[] bArr;
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream((byte[]) ((C11955) c16040.m37919()).m29175()));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read <= 0) {
                    break;
                } else {
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
            }
            gZIPInputStream.close();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (Exception unused) {
            bArr = new byte[0];
        }
        C11955 c11955 = new C11955();
        c11955.m29154(bArr);
        c16040.m37918(c11955);
    }
}
